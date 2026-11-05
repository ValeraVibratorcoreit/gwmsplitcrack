package p098q0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.regex.Pattern;

/* renamed from: q0.e0 */
/* loaded from: classes.dex */
public final class C1311e0 {

    /* renamed from: o */
    public static final int f6092o = 705;

    /* renamed from: p */
    public static C1311e0 f6093p;

    /* renamed from: q */
    public static FrameLayout f6094q;

    /* renamed from: r */
    public static View f6095r;

    /* renamed from: s */
    public static final ViewOnLayoutChangeListenerC1284T f6096s = new ViewOnLayoutChangeListenerC1284T(1);

    /* renamed from: a */
    public final Context f6097a;

    /* renamed from: b */
    public View f6098b;

    /* renamed from: c */
    public TextView f6099c;

    /* renamed from: d */
    public WindowManager f6100d;

    /* renamed from: e */
    public boolean f6101e;

    /* renamed from: f */
    public boolean f6102f;

    /* renamed from: g */
    public boolean f6103g;

    /* renamed from: h */
    public boolean f6104h;

    /* renamed from: i */
    public int f6105i;

    /* renamed from: j */
    public int f6106j;

    /* renamed from: k */
    public RunnableC1308d0 f6107k;

    /* renamed from: l */
    public final Handler f6108l = new Handler(Looper.getMainLooper());

    /* renamed from: m */
    public RunnableC1305c0 f6109m;

    /* renamed from: n */
    public RunnableC1305c0 f6110n;

    public C1311e0(Context context) {
        this.f6097a = context.getApplicationContext();
    }

    /* renamed from: d */
    public static C1311e0 m3165d(Context context) {
        if (f6093p == null) {
            f6093p = new C1311e0(context);
        }
        return f6093p;
    }

    /* renamed from: g */
    public static void m3166g() {
        View view;
        TextView textView;
        C1311e0 c1311e0 = f6093p;
        if (c1311e0 == null || !c1311e0.f6102f) {
            return;
        }
        boolean z2 = c1311e0.f6101e;
        if (z2) {
            if (!z2 || (textView = c1311e0.f6099c) == null) {
                return;
            }
            String charSequence = textView.getText().toString();
            int i = c1311e0.f6105i;
            c1311e0.m3174j();
            c1311e0.f6105i = i;
            c1311e0.m3177m(c1311e0.f6097a, charSequence, c1311e0.f6104h);
            return;
        }
        if (z2 || (view = c1311e0.f6098b) == null || c1311e0.f6100d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            try {
                c1311e0.f6100d.removeView(c1311e0.f6098b);
                c1311e0.f6100d.addView(c1311e0.f6098b, (WindowManager.LayoutParams) layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: h */
    public static int m3167h() {
        int height;
        View view = f6095r;
        if (view == null || (height = view.getHeight()) <= 0 || height >= 800) {
            return 0;
        }
        return 800 - height;
    }

    /* renamed from: a */
    public final void m3168a(int i) {
        this.f6105i = i;
        View view = this.f6098b;
        if (view == null) {
            return;
        }
        if (i == 0) {
            view.setBackgroundResource(R.drawable.ipk_notify_overlay_bg);
            TextView textView = this.f6099c;
            if (textView != null) {
                textView.setTextColor(this.f6098b.getContext().getColor(R.color.ipk_notify_text));
                return;
            }
            return;
        }
        Pattern pattern = C1302b0.f6060b;
        view.setBackgroundResource(i == 2 ? R.drawable.ip_msg_notify_overlay_bg_info : i == 3 ? R.drawable.ip_msg_notify_overlay_bg_alarm : R.drawable.ip_msg_notify_overlay_bg_warn);
        TextView textView2 = this.f6099c;
        if (textView2 != null) {
            textView2.setTextColor(this.f6098b.getContext().getColor(i == 2 ? R.color.ip_msg_kind_info_text : i == 3 ? R.color.ip_msg_kind_alarm_text : R.color.ip_msg_kind_warn_text));
        }
    }

    /* renamed from: b */
    public final void m3169b(boolean z2) {
        this.f6104h = z2;
        TextView textView = this.f6099c;
        if (textView == null) {
            return;
        }
        textView.setTextDirection(z2 ? 4 : 3);
        this.f6099c.setLayoutDirection(z2 ? 1 : 0);
        this.f6099c.setGravity(17);
    }

    /* renamed from: c */
    public final void m3170c() {
        RunnableC1305c0 runnableC1305c0 = this.f6109m;
        Handler handler = this.f6108l;
        if (runnableC1305c0 != null) {
            handler.removeCallbacks(runnableC1305c0);
            this.f6109m = null;
        }
        RunnableC1305c0 runnableC1305c02 = this.f6110n;
        if (runnableC1305c02 != null) {
            handler.removeCallbacks(runnableC1305c02);
            this.f6110n = null;
        }
    }

    /* renamed from: e */
    public final void m3171e() {
        RunnableC1308d0 runnableC1308d0;
        this.f6106j++;
        FrameLayout frameLayout = f6094q;
        if (frameLayout != null && (runnableC1308d0 = this.f6107k) != null) {
            frameLayout.removeCallbacks(runnableC1308d0);
        }
        this.f6107k = null;
        m3170c();
        View view = this.f6098b;
        if (view != null) {
            view.animate().cancel();
        }
        m3174j();
        this.f6103g = false;
    }

    /* renamed from: f */
    public final int m3172f(int i, float f2) {
        TextView textView;
        CharSequence text;
        int max = Math.max(1, Math.round(f2));
        if (this.f6098b == null || (textView = this.f6099c) == null || (text = textView.getText()) == null || text.length() == 0) {
            return max;
        }
        int paddingRight = this.f6098b.getPaddingRight() + this.f6098b.getPaddingLeft();
        int paddingBottom = this.f6098b.getPaddingBottom() + this.f6098b.getPaddingTop();
        return StaticLayout.Builder.obtain(text, 0, text.length(), new TextPaint(this.f6099c.getPaint()), Math.max(1, i - paddingRight)).setAlignment(Layout.Alignment.ALIGN_CENTER).setIncludePad(this.f6099c.getIncludeFontPadding()).setLineSpacing(this.f6099c.getLineSpacingExtra(), this.f6099c.getLineSpacingMultiplier()).setMaxLines(2).build().getLineCount() <= 1 ? max : Math.max(max + 1, ((int) Math.ceil(r7.getHeight())) + paddingBottom + 4);
    }

    /* renamed from: i */
    public final void m3173i() {
        View view;
        if (!this.f6101e || (view = this.f6098b) == null || f6094q == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            int round = Math.round(960 * (f6094q.getWidth() / 1920.0f));
            int m3172f = m3172f(round, (f6094q.getHeight() / 800.0f) * 160.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            if (layoutParams2.width == round && layoutParams2.height == m3172f && layoutParams2.bottomMargin == m3167h()) {
                return;
            }
            layoutParams2.width = round;
            layoutParams2.height = m3172f;
            layoutParams2.bottomMargin = m3167h();
            this.f6098b.setLayoutParams(layoutParams2);
        }
    }

    /* renamed from: j */
    public final void m3174j() {
        FrameLayout frameLayout;
        View view = this.f6098b;
        if (view != null) {
            try {
                if (!this.f6101e || (frameLayout = f6094q) == null) {
                    WindowManager windowManager = this.f6100d;
                    if (windowManager != null) {
                        windowManager.removeView(view);
                    }
                } else {
                    frameLayout.removeView(view);
                }
            } catch (Exception unused) {
            }
        }
        this.f6098b = null;
        this.f6099c = null;
        this.f6100d = null;
        this.f6101e = false;
        this.f6102f = false;
    }

    /* renamed from: k */
    public final void m3175k() {
        m3170c();
        RunnableC1305c0 runnableC1305c0 = new RunnableC1305c0(this, 0);
        this.f6109m = runnableC1305c0;
        this.f6110n = new RunnableC1305c0(this, 1);
        Handler handler = this.f6108l;
        handler.postDelayed(runnableC1305c0, 3000L);
        handler.postDelayed(this.f6110n, 3520L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.lang.Runnable, q0.d0] */
    /* renamed from: l */
    public final void m3176l(Context context, final String str, final boolean z2, int i) {
        RunnableC1308d0 runnableC1308d0;
        TextView textView;
        View view;
        if (str == null || str.isEmpty()) {
            return;
        }
        if (this.f6103g) {
            m3171e();
        }
        if (context == null) {
            context = this.f6097a;
        }
        final Context context2 = context;
        boolean z3 = (f6094q == null || C1253D0.f5590I0) ? false : true;
        this.f6105i = i;
        boolean z4 = this.f6102f;
        if (z4 && (textView = this.f6099c) != null && this.f6101e == z3) {
            textView.setText(str);
            m3169b(z2);
            m3168a(i);
            boolean z5 = this.f6101e;
            if (z5) {
                m3173i();
            } else if (!z5 && (view = this.f6098b) != null && this.f6100d != null) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams instanceof WindowManager.LayoutParams) {
                    int m3172f = m3172f(960, 160.0f);
                    WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
                    if (layoutParams2.width != 960 || layoutParams2.height != m3172f) {
                        layoutParams2.width = 960;
                        layoutParams2.height = m3172f;
                        layoutParams2.y = f6092o - m3172f;
                        this.f6100d.updateViewLayout(this.f6098b, layoutParams2);
                    }
                }
            }
            m3175k();
            return;
        }
        if (z4) {
            m3171e();
            this.f6105i = i;
        }
        if (!z3) {
            m3177m(context2, str, z2);
            return;
        }
        final FrameLayout frameLayout = f6094q;
        if (frameLayout == 0) {
            return;
        }
        this.f6106j++;
        if (frameLayout != 0 && (runnableC1308d0 = this.f6107k) != null) {
            frameLayout.removeCallbacks(runnableC1308d0);
        }
        this.f6107k = null;
        final int i2 = this.f6106j;
        ?? r11 = new Runnable() { // from class: q0.d0
            @Override // java.lang.Runnable
            public final void run() {
                Context context3 = context2;
                FrameLayout frameLayout2 = frameLayout;
                String str2 = str;
                boolean z6 = z2;
                C1311e0 c1311e0 = C1311e0.this;
                if (i2 != c1311e0.f6106j) {
                    return;
                }
                c1311e0.f6107k = null;
                try {
                    c1311e0.f6101e = true;
                    c1311e0.f6100d = null;
                    View inflate = LayoutInflater.from(context3).inflate(R.layout.ipk_notify_overlay, (ViewGroup) frameLayout2, false);
                    c1311e0.f6098b = inflate;
                    TextView textView2 = (TextView) inflate.findViewById(R.id.ipk_notify_text);
                    c1311e0.f6099c = textView2;
                    if (textView2 == null) {
                        c1311e0.m3174j();
                    } else {
                        textView2.setText(str2);
                        c1311e0.m3169b(z6);
                        c1311e0.m3168a(c1311e0.f6105i);
                        int round = Math.round(960 * (frameLayout2.getWidth() / 1920.0f));
                        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(round, c1311e0.m3172f(round, (frameLayout2.getHeight() / 800.0f) * 160.0f), 81);
                        layoutParams3.bottomMargin = C1311e0.m3167h();
                        c1311e0.f6098b.setLayoutParams(layoutParams3);
                        c1311e0.f6098b.setElevation(32.0f);
                        frameLayout2.addView(c1311e0.f6098b);
                        c1311e0.f6098b.bringToFront();
                        c1311e0.f6102f = true;
                        c1311e0.f6103g = false;
                        AbstractC1256E0.m2995J(c1311e0.f6098b);
                        AbstractC1256E0.m3010c(c1311e0.f6098b);
                        c1311e0.m3175k();
                    }
                } catch (Exception unused) {
                    c1311e0.m3174j();
                }
            }
        };
        if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0) {
            r11.run();
        } else {
            this.f6107k = r11;
            frameLayout.post(r11);
        }
    }

    /* renamed from: m */
    public final void m3177m(Context context, String str, boolean z2) {
        Context context2 = this.f6097a;
        try {
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(2) : null;
            if (display == null) {
                this.f6100d = (WindowManager) context2.getSystemService("window");
            } else {
                this.f6100d = (WindowManager) context2.createDisplayContext(display).getSystemService("window");
            }
            this.f6101e = false;
            View inflate = LayoutInflater.from(context).inflate(R.layout.ipk_notify_overlay, (ViewGroup) null);
            this.f6098b = inflate;
            TextView textView = (TextView) inflate.findViewById(R.id.ipk_notify_text);
            this.f6099c = textView;
            textView.setText(str);
            m3169b(z2);
            m3168a(this.f6105i);
            int m3172f = m3172f(960, 160.0f);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(960, m3172f, 2038, 536, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = 480;
            layoutParams.y = f6092o - m3172f;
            AbstractC1256E0.m2995J(this.f6098b);
            this.f6100d.addView(this.f6098b, layoutParams);
            this.f6102f = true;
            this.f6103g = false;
            AbstractC1256E0.m3010c(this.f6098b);
            m3175k();
        } catch (Exception unused) {
            m3174j();
        }
    }
}
