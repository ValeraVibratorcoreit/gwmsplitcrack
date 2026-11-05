package deobfuscated.gauges;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import android.os.SystemClock;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Реконструкция p109u0.C1518Z0 (UserThemeRenderer) — только колодцы speed/rpm.
 *
 * Схема:
 *   FrameLayout
 *     ├─ ImageView  face   (themeN_spd.png / themeN_rpm.png)
 *     ├─ ImageView  needle (themeN_needle_spd.png / themeN_needle_rpm.png)
 *     └─ TextView   digits ("speed" / "rpm")
 *
 * Скорость и обороты приходят из CarState (native CAN -> LiveData).
 */
public final class UserThemeRenderer {

    private final Context ctx;
    private final CarState car;
    private final UserThemeParser theme;

    private ImageView speedFace, speedNeedle;
    private ImageView rpmFace, rpmNeedle;
    private TextView speedDigits, rpmDigits;

    private GaugeAnimator speedGauge;
    private GaugeAnimator rpmGauge;

    private final Handler handler = new Handler(android.os.Looper.getMainLooper());
    private long lastFrameMs;

    private boolean running;

    public UserThemeRenderer(Context ctx, CarState car, UserThemeParser theme) {
        this.ctx = ctx;
        this.car = car;
        this.theme = theme;
    }

    public void build(FrameLayout root) {
        // 1. Колодцы.
        speedFace = addImage(root, theme.speedometer, true, false);
        speedNeedle = addImage(root, theme.speedometer, true, true);
        rpmFace = addImage(root, theme.tachometer, false, false);
        rpmNeedle = addImage(root, theme.tachometer, false, true);

        // 2. Цифры/бары параметров.
        for (UserThemeParser.ParameterSpec p : theme.parameters) {
            if ("speed".equals(p.id)) {
                speedDigits = addDigits(root, p);
            } else if ("rpm".equals(p.id)) {
                rpmDigits = addDigits(root, p);
            }
        }

        // 3. Начальные значения.
        initGauges();

        // 4. Подписки.
        car.observeSpeed(this, v -> updateSpeed());
        car.observeRpm(this, v -> {
            updateRpm();
            updateOtherParameters();
        });

        // 5. Анимация 16 мс.
        running = true;
        handler.post(animationLoop);
    }

    private ImageView addImage(FrameLayout root, UserThemeParser.GaugeSpec g,
                               boolean speed, boolean needle) {
        if (!g.visible) return null;

        int size = g.scaledSize();
        ImageView iv = new ImageView(ctx);
        iv.setScaleType(ImageView.ScaleType.FIT_XY);

        FrameLayout.LayoutParams lp = new FrameLayout.LayoutParams(size, size);
        lp.leftMargin = g.leftMargin();
        lp.topMargin = g.topMargin();
        root.addView(iv, lp);

        String file = needle ? g.needleFile : g.faceFile;
        Bitmap bmp;
        if (LicenseMode.isFree()) {
            // В FREE-версии пользовательские PNG игнорируются.
            int res = speed
                    ? (needle ? R.drawable.theme_0_needle : R.drawable.theme_0_spd)
                    : (needle ? R.drawable.theme_0_needle : R.drawable.theme_0_rpm);
            bmp = BitmapFactory.decodeResource(ctx.getResources(), res);
        } else {
            bmp = BitmapFactory.decodeFile(UserThemeStore.fileFor(theme, file).getAbsolutePath());
        }
        if (bmp == null) {
            throw new IllegalStateException("не загружен " +
                    (needle ? "стрелка: " : "циферблат: ") + file);
        }
        bmp.setDensity(0);
        iv.setImageBitmap(bmp);
        return iv;
    }

    private TextView addDigits(FrameLayout root, UserThemeParser.ParameterSpec p) {
        TextView tv = new TextView(ctx);
        tv.setText(p.sample);
        tv.setTextColor(android.graphics.Color.parseColor(p.color));
        tv.setTextSize(0, p.fontSize);
        root.addView(tv, new FrameLayout.LayoutParams(-2, -2));
        // В оригинале AbstractC1539g1.m4201W(tv, x, y, anchor)
        return tv;
    }

    /** C1518Z0.m4121r(). */
    private void initGauges() {
        float speed = Math.max(0f, car.getSpeed()) * SpeedConfig.kSpeed();
        float rpm = car.getRpm() / 1000f;

        UserThemeParser.GaugeSpec sp = theme.speedometer;
        UserThemeParser.GaugeSpec rp = theme.tachometer;

        speedGauge = new GaugeAnimator(
                sp.valueMin, sp.valueMax, 300L, speed, sp.angleMin, sp.angleMax, 0.01f);
        rpmGauge = new GaugeAnimator(
                rp.valueMin, rp.valueMax, 300L, rpm, rp.angleMin, rp.angleMax, 0.01f);

        if (speedNeedle != null) {
            speedNeedle.setRotation(speedGauge.currentAngle());
        }
        if (rpmNeedle != null) {
            rpmNeedle.setRotation(rpmGauge.currentAngle());
        }
    }

    /** C1518Z0.m4093D(). */
    private void updateSpeed() {
        float speed = Math.max(0f, car.getSpeed()) * SpeedConfig.kSpeed();
        if (speedGauge != null) speedGauge.setTarget(speed);
        updateParameter("speed", speed);
    }

    /** C1518Z0.m4123y(). */
    private void updateRpm() {
        float rpm = car.getRpm() / 1000f;
        if (rpmGauge != null) rpmGauge.setTarget(rpm);
        updateParameter("rpm", rpm);
    }

    private final Runnable animationLoop = new Runnable() {
        @Override public void run() {
            if (!running) return;

            long now = SystemClock.uptimeMillis();
            float dt = (lastFrameMs == 0) ? 16f : (now - lastFrameMs);
            lastFrameMs = now;
            if (dt < 1f) dt = 1f;
            if (dt > 100f) dt = 100f;

            if (speedGauge != null && speedNeedle != null) {
                speedGauge.step(1f, dt, speedNeedle);
            }
            if (rpmGauge != null && rpmNeedle != null) {
                rpmGauge.step(1f, dt, rpmNeedle);
            }

            handler.postDelayed(this, 16L);
        }
    };

    private void updateParameter(String id, float value) { /* digits/bars */ }
    private void updateOtherParameters() { /* coolant/fuel/odo/... */ }

    // Заглушки для зависимостей оригинала.
    static final class LicenseMode {
        static boolean isFree() { return false; }
    }
    static final class UserThemeStore {
        static java.io.File fileFor(UserThemeParser t, String name) {
            return new java.io.File(name);
        }
    }
    static final class SpeedConfig {
        static float kSpeed() { return 1.045f; }
    }
    static final class R {
        static final class drawable {
            static final int theme_0_spd = 0;
            static final int theme_0_rpm = 0;
            static final int theme_0_needle = 0;
        }
    }
}
