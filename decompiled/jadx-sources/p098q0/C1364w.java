package p098q0;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.view.Display;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* renamed from: q0.w */
/* loaded from: classes.dex */
public final class C1364w {

    /* renamed from: m */
    public static C1364w f6405m;

    /* renamed from: n */
    public static FrameLayout f6406n;

    /* renamed from: a */
    public final Context f6407a;

    /* renamed from: b */
    public ImageView f6408b;

    /* renamed from: c */
    public WindowManager f6409c;

    /* renamed from: d */
    public boolean f6410d;

    /* renamed from: e */
    public boolean f6411e;

    /* renamed from: f */
    public boolean f6412f;

    /* renamed from: g */
    public int f6413g;

    /* renamed from: h */
    public int f6414h;

    /* renamed from: i */
    public RunnableC1358u f6415i;

    /* renamed from: j */
    public final Handler f6416j = new Handler(Looper.getMainLooper());

    /* renamed from: k */
    public RunnableC1361v f6417k;

    /* renamed from: l */
    public RunnableC1361v f6418l;

    public C1364w(Context context) {
        this.f6407a = context.getApplicationContext();
    }

    /* renamed from: c */
    public static void m3261c() {
        ImageView imageView;
        C1364w c1364w = f6405m;
        if (c1364w == null || !c1364w.f6411e) {
            return;
        }
        boolean z2 = c1364w.f6410d;
        if (z2) {
            if (!z2 || c1364w.f6408b == null) {
                return;
            }
            int i = c1364w.f6413g;
            c1364w.m3264d();
            if (i != 0) {
                c1364w.m3266f(c1364w.f6407a, i);
                return;
            }
            return;
        }
        if (z2 || (imageView = c1364w.f6408b) == null || c1364w.f6409c == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            try {
                c1364w.f6409c.removeView(c1364w.f6408b);
                c1364w.f6409c.addView(c1364w.f6408b, (WindowManager.LayoutParams) layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final void m3262a() {
        RunnableC1361v runnableC1361v = this.f6417k;
        Handler handler = this.f6416j;
        if (runnableC1361v != null) {
            handler.removeCallbacks(runnableC1361v);
            this.f6417k = null;
        }
        RunnableC1361v runnableC1361v2 = this.f6418l;
        if (runnableC1361v2 != null) {
            handler.removeCallbacks(runnableC1361v2);
            this.f6418l = null;
        }
    }

    /* renamed from: b */
    public final void m3263b() {
        RunnableC1358u runnableC1358u;
        this.f6414h++;
        FrameLayout frameLayout = f6406n;
        if (frameLayout != null && (runnableC1358u = this.f6415i) != null) {
            frameLayout.removeCallbacks(runnableC1358u);
        }
        this.f6415i = null;
        m3262a();
        ImageView imageView = this.f6408b;
        if (imageView != null) {
            imageView.animate().cancel();
        }
        m3264d();
        this.f6412f = false;
    }

    /* renamed from: d */
    public final void m3264d() {
        FrameLayout frameLayout;
        ImageView imageView = this.f6408b;
        if (imageView != null) {
            try {
                if (!this.f6410d || (frameLayout = f6406n) == null) {
                    WindowManager windowManager = this.f6409c;
                    if (windowManager != null) {
                        windowManager.removeView(imageView);
                    }
                } else {
                    frameLayout.removeView(imageView);
                }
            } catch (Exception unused) {
            }
        }
        this.f6408b = null;
        this.f6409c = null;
        this.f6410d = false;
        this.f6411e = false;
        this.f6413g = 0;
    }

    /* renamed from: e */
    public final void m3265e() {
        m3262a();
        RunnableC1361v runnableC1361v = new RunnableC1361v(this, 0);
        this.f6417k = runnableC1361v;
        this.f6418l = new RunnableC1361v(this, 1);
        Handler handler = this.f6416j;
        handler.postDelayed(runnableC1361v, 3000L);
        handler.postDelayed(this.f6418l, 3520L);
    }

    /* renamed from: f */
    public final void m3266f(Context context, int i) {
        Context context2 = this.f6407a;
        try {
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(2) : null;
            if (display == null) {
                this.f6409c = (WindowManager) context2.getSystemService("window");
            } else {
                this.f6409c = (WindowManager) context2.createDisplayContext(display).getSystemService("window");
            }
            this.f6410d = false;
            ImageView imageView = new ImageView(context);
            this.f6408b = imageView;
            imageView.setImageResource(i);
            int intrinsicWidth = this.f6408b.getDrawable() != null ? this.f6408b.getDrawable().getIntrinsicWidth() : 0;
            int intrinsicHeight = this.f6408b.getDrawable() != null ? this.f6408b.getDrawable().getIntrinsicHeight() : 0;
            if (intrinsicWidth <= 0) {
                intrinsicWidth = -2;
            }
            if (intrinsicHeight <= 0) {
                intrinsicHeight = -2;
            }
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(intrinsicWidth, intrinsicHeight, 2038, 536, -3);
            layoutParams.gravity = 8388659;
            if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                layoutParams.x = 0;
                layoutParams.y = 783;
                layoutParams.gravity = 49;
            } else {
                layoutParams.x = Math.max(0, (1920 - intrinsicWidth) / 2);
                layoutParams.y = Math.max(0, 783 - intrinsicHeight);
            }
            this.f6408b.setAlpha(1.0f);
            this.f6409c.addView(this.f6408b, layoutParams);
            this.f6411e = true;
            this.f6412f = false;
            m3265e();
        } catch (Exception unused) {
            m3264d();
        }
    }
}
