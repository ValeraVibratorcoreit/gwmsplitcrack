package deobfuscated.gauges;

import android.graphics.Bitmap;
import android.widget.ImageView;

/**
 * Реконструкция p109u0.C1568q0 (Theme47Renderer) — встроенная кастомная тема 47.
 * Аналогично устроены темы 48..51 (C1583x0, C1477E0, C1491L0, C1506T0).
 *
 * Картинки: assets/themes/47/theme_47_spd.bin, theme_47_rpm.bin, needle*.bin
 * .bin расшифровывается NativeLib.decryptThemeImage() -> PNG/JPEG.
 */
public final class Theme47Renderer {

    private final CarState car;
    private final SpeedConfig cfg = new SpeedConfig();

    private ImageView speedNeedle;
    private ImageView rpmNeedle;
    private ImageView speedFace;
    private ImageView rpmFace;

    private NeedleAnimator speedGauge;
    private NeedleAnimator rpmGauge;

    /** C1568q0.java:9499-9505. */
    public void initGauges() {
        float speed = car.getSpeed();
        float speedValue = speed < 0f ? 0f : speed * cfg.kSpeed();
        float rpmValue = Math.max(0f, car.getRpm() / 1000f);

        // (valueMin, valueMax, angleMin, angleMax, initialValue, type)
        speedGauge = new NeedleAnimator(0f, 220f, -135.5f, 136.5f, speedValue, 1);
        rpmGauge   = new NeedleAnimator(0f,   8f, -135.5f, 136.5f, rpmValue,   1);

        speedGauge.apply(speedNeedle);
        rpmGauge.apply(rpmNeedle);
    }

    /** C1568q0.java:10926-10934. */
    public void updateTargets() {
        float speed = car.getSpeed();
        float speedValue = speed < 0f ? 0f : speed * cfg.kSpeed();
        speedGauge.target = clamp(speedValue, 0f, 220f);
        rpmGauge.target = clamp(Math.max(0f, car.getRpm() / 1000f), 0f, 8f);
    }

    /** RunnableC1565p0: каждые 16 мс. */
    public void onAnimationFrame() {
        speedGauge.step(speedNeedle);
        rpmGauge.step(rpmNeedle);
    }

    /** p109u0.C1572s. */
    public static final class NeedleAnimator {
        public final float valueMin, valueMax;
        public final float angleMin, angleMax;
        public float currentValue;
        public float target;
        public float angle;
        private boolean applied;

        public NeedleAnimator(float valueMin, float valueMax,
                              float angleMin, float angleMax,
                              float initialValue, int type) {
            this.valueMin = valueMin;
            this.valueMax = valueMax;
            this.angleMin = angleMin;
            this.angleMax = angleMax;
            this.currentValue = clamp(initialValue, valueMin, valueMax);
            this.target = this.currentValue;
            this.angle = angleFor(this.currentValue);
        }

        /** m4470a: мгновенная установка угла. */
        public void apply(ImageView view) {
            if (view != null && view.getWidth() > 0) {
                view.setRotation(angle);
                applied = true;
            }
        }

        /** m4471b: шаг анимации. */
        public void step(ImageView view) {
            float alpha = 1f - (float) Math.exp(-Math.max(1f, 16L) / 300f);
            currentValue = (target - currentValue) * alpha + currentValue;

            float range = valueMax - valueMin;
            if (Math.abs(currentValue - target) <= Math.max(0.001f, range) * 5e-4f) {
                currentValue = target;
            }
            currentValue = clamp(currentValue, valueMin, valueMax);

            float newAngle = angleFor(currentValue);
            boolean changed = Math.abs(newAngle - angle) >= 0.01f;
            if (changed) angle = newAngle;

            if (view != null && view.getWidth() > 0 && (changed || !applied)) {
                view.setRotation(angle);
                applied = true;
            }
        }

        private float angleFor(float value) {
            float ratio = (clamp(value, valueMin, valueMax) - valueMin) / (valueMax - valueMin);
            return (angleMax - angleMin) * ratio + angleMin;
        }
    }

    private static float clamp(float v, float min, float max) {
        return Math.max(min, Math.min(max, v));
    }

    static final class SpeedConfig {
        float kSpeed() { return 1.045f; } // prefs "k_speed", default 1.045
    }
}
