package p098q0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.lifecycle.C0560y;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.util.WeakHashMap;
import p001A0.RunnableC0018l;
import p013F0.C0097a;
import p016H.C0112d;
import p022K.AbstractC0169Q;
import p022K.C0174W;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1540h;
import p109u0.C1537g;

/* renamed from: q0.Q */
/* loaded from: classes.dex */
public final class C1279Q {

    /* renamed from: a */
    public final Context f5924a;

    /* renamed from: b */
    public final Display f5925b;

    /* renamed from: c */
    public final cfgData f5926c = cfgData.m1784i();

    /* renamed from: d */
    public WindowManager f5927d;

    /* renamed from: e */
    public ContextThemeWrapper f5928e;

    /* renamed from: f */
    public FrameLayout f5929f;

    /* renamed from: g */
    public FrameLayout f5930g;

    /* renamed from: h */
    public View f5931h;

    /* renamed from: i */
    public FrameLayout f5932i;

    /* renamed from: j */
    public C1537g f5933j;

    /* renamed from: k */
    public int f5934k;

    /* renamed from: l */
    public boolean f5935l;

    /* renamed from: m */
    public C0112d f5936m;

    public C1279Q(Context context, Display display) {
        this.f5924a = context.getApplicationContext();
        this.f5925b = display;
    }

    /* renamed from: a */
    public final void m3093a() {
        WindowManager windowManager;
        C0112d c0112d = this.f5936m;
        if (c0112d != null) {
            c0112d.m357h();
            View view = (View) c0112d.f351c;
            if (view != null) {
                ViewParent parent = view.getParent();
                FrameLayout frameLayout = (FrameLayout) c0112d.f350b;
                if (parent == frameLayout) {
                    frameLayout.removeView((View) c0112d.f351c);
                }
            }
            c0112d.f351c = null;
            c0112d.f352d = null;
            this.f5936m = null;
        }
        C1537g c1537g = this.f5933j;
        if (c1537g != null) {
            try {
                c1537g.m4174a();
            } catch (Exception unused) {
            }
            this.f5933j = null;
        }
        FrameLayout frameLayout2 = this.f5932i;
        if (frameLayout2 != null && (windowManager = this.f5927d) != null) {
            try {
                windowManager.removeView(frameLayout2);
            } catch (Exception unused2) {
            }
        }
        C1311e0 c1311e0 = C1311e0.f6093p;
        if (c1311e0 != null) {
            c1311e0.m3171e();
        }
        View view2 = C1311e0.f6095r;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(C1311e0.f6096s);
        }
        C1311e0.f6094q = null;
        C1311e0.f6095r = null;
        C1364w c1364w = C1364w.f6405m;
        if (c1364w != null) {
            c1364w.m3263b();
        }
        C1364w.f6406n = null;
        C1288V c1288v = C1288V.f5996D;
        if (c1288v != null) {
            c1288v.m3142o(true);
        }
        C1288V.m3124f();
        C1288V.f5997E = null;
        C1288V.f5998F = null;
        this.f5929f = null;
        this.f5930g = null;
        this.f5931h = null;
        this.f5928e = null;
        this.f5932i = null;
        this.f5927d = null;
        this.f5935l = false;
    }

    /* renamed from: b */
    public final void m3094b() {
        if (this.f5929f == null) {
            return;
        }
        if (this.f5930g == null) {
            FrameLayout frameLayout = new FrameLayout(this.f5928e);
            this.f5930g = frameLayout;
            frameLayout.setClipChildren(false);
            this.f5930g.setClickable(false);
            this.f5930g.setFocusable(false);
            this.f5930g.setElevation(48.0f);
            this.f5929f.addView(this.f5930g, new FrameLayout.LayoutParams(-1, -1));
        }
        this.f5930g.bringToFront();
        FrameLayout frameLayout2 = this.f5930g;
        View view = this.f5931h;
        View view2 = C1311e0.f6095r;
        ViewOnLayoutChangeListenerC1284T viewOnLayoutChangeListenerC1284T = C1311e0.f6096s;
        if (view2 != null) {
            view2.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC1284T);
        }
        C1311e0.f6094q = frameLayout2;
        C1311e0.f6095r = view;
        if (view != null) {
            view.addOnLayoutChangeListener(viewOnLayoutChangeListenerC1284T);
        }
        C1311e0 c1311e0 = C1311e0.f6093p;
        if (c1311e0 != null && c1311e0.f6102f && c1311e0.f6101e) {
            c1311e0.m3173i();
        }
        FrameLayout frameLayout3 = this.f5930g;
        View view3 = this.f5931h;
        C1364w.f6406n = frameLayout3;
        C1288V.m3124f();
        C1288V.f5997E = frameLayout3;
        C1288V.f5998F = view3;
        if (view3 != null) {
            view3.addOnLayoutChangeListener(C1288V.f6000H);
        }
        C1288V c1288v = C1288V.f5996D;
        if (c1288v == null || !c1288v.f6020p) {
            return;
        }
        c1288v.m3144u();
        C1288V c1288v2 = C1288V.f5996D;
        c1288v2.getClass();
        View view4 = C1288V.f5998F;
        if (view4 == null) {
            return;
        }
        view4.post(new RunnableC0018l(c1288v2, 13, view4));
        ViewTreeObserver viewTreeObserver = view4.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            ViewTreeObserverOnGlobalLayoutListenerC1286U viewTreeObserverOnGlobalLayoutListenerC1286U = new ViewTreeObserverOnGlobalLayoutListenerC1286U(c1288v2, view4);
            C1288V.f6001I = viewTreeObserverOnGlobalLayoutListenerC1286U;
            viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1286U);
        }
    }

    /* renamed from: c */
    public final View m3095c(LayoutInflater layoutInflater, int i) {
        View inflate = layoutInflater.inflate(i, (ViewGroup) this.f5929f, false);
        ContextThemeWrapper contextThemeWrapper = this.f5928e;
        cfgData cfgdata = this.f5926c;
        AbstractC1539g1.m4222i0(cfgdata);
        FrameLayout.LayoutParams layoutParams = cfgdata.f2620e1 == 42 ? new FrameLayout.LayoutParams(1920, 720, 8388659) : new FrameLayout.LayoutParams(Math.round(TypedValue.applyDimension(1, 1440.0f, contextThemeWrapper.getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 540.0f, contextThemeWrapper.getResources().getDisplayMetrics())), 8388659);
        FrameLayout frameLayout = this.f5930g;
        if (frameLayout != null) {
            ViewParent parent = frameLayout.getParent();
            FrameLayout frameLayout2 = this.f5929f;
            if (parent == frameLayout2) {
                frameLayout2.addView(inflate, 0, layoutParams);
                return inflate;
            }
        }
        this.f5929f.addView(inflate, layoutParams);
        return inflate;
    }

    /* renamed from: d */
    public final void m3096d() {
        FrameLayout frameLayout;
        View view = this.f5931h;
        if (view == null && (frameLayout = this.f5932i) != null) {
            view = frameLayout.findViewById(R.id.main);
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_41_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_42_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_43_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_44_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_45_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_46_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_47_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_48_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_49_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_50_root);
            }
            if (view == null) {
                view = this.f5932i.findViewById(R.id.theme_51_root);
            }
        }
        if (view == null) {
            return;
        }
        view.animate().cancel();
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setAlpha(0.0f);
    }

    /* renamed from: e */
    public final void m3097e() {
        FrameLayout frameLayout;
        if (!this.f5935l || this.f5932i == null || this.f5929f == null) {
            return;
        }
        cfgData cfgdata = this.f5926c;
        AbstractC1539g1.m4222i0(cfgdata);
        if (this.f5936m == null && (frameLayout = this.f5929f) != null) {
            this.f5936m = new C0112d(frameLayout);
        }
        this.f5936m.m351b();
        View view = (View) this.f5936m.f351c;
        if (view == null || view.getVisibility() != 0) {
            this.f5936m.m362m();
        }
        if (this.f5928e == null) {
            this.f5928e = new ContextThemeWrapper(this.f5924a.createDisplayContext(this.f5925b), R.style.Theme_T500_Split);
        }
        C1537g c1537g = this.f5933j;
        if (c1537g != null) {
            c1537g.m4174a();
            this.f5933j = null;
        }
        C0560y c0560y = carData.getInstance().f2423X;
        Integer num = (Integer) c0560y.m1395d();
        if (num != null && num.intValue() != 0) {
            c0560y.m1401j(0);
        }
        View view2 = this.f5931h;
        if (view2 != null) {
            this.f5929f.removeView(view2);
        }
        this.f5931h = null;
        this.f5934k = C1537g.m4173e(cfgdata);
        LayoutInflater from = LayoutInflater.from(this.f5928e);
        if (from.getFactory2() == null) {
            from.setFactory2(new LayoutInflaterFactory2C1277P(0));
        }
        this.f5931h = m3095c(from, this.f5934k);
        m3096d();
        AbstractC1540h.m4245a(this.f5929f, this.f5931h, cfgdata);
        m3094b();
        C1537g c1537g2 = new C1537g(this.f5928e, this.f5931h);
        this.f5933j = c1537g2;
        c1537g2.m4178h();
        this.f5933j.m4176f(false);
        View view3 = (View) this.f5936m.f351c;
        if (view3 == null || view3.getVisibility() != 0) {
            return;
        }
        this.f5936m.m362m();
        C0112d c0112d = this.f5936m;
        ValueAnimator valueAnimator = (ValueAnimator) c0112d.f353e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            c0112d.f353e = null;
        }
        View view4 = (View) c0112d.f351c;
        if (view4 == null || view4.getVisibility() != 0) {
            return;
        }
        int max = Math.max(((FrameLayout) c0112d.f350b).getHeight(), ((View) c0112d.f351c).getHeight());
        if (max <= 0) {
            c0112d.m357h();
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, max);
        c0112d.f353e = ofFloat;
        ofFloat.setDuration(90L);
        ((ValueAnimator) c0112d.f353e).setInterpolator(new LinearInterpolator());
        ((ValueAnimator) c0112d.f353e).addUpdateListener(new C0174W(3, c0112d));
        ((ValueAnimator) c0112d.f353e).addListener(new C0097a(7, c0112d));
        ((ValueAnimator) c0112d.f353e).start();
    }

    /* renamed from: f */
    public final void m3098f(boolean z2) {
        FrameLayout frameLayout = this.f5932i;
        if (frameLayout == null) {
            return;
        }
        frameLayout.setVisibility(z2 ? 4 : 0);
    }

    /* renamed from: g */
    public final void m3099g() {
        cfgData cfgdata = this.f5926c;
        if (this.f5935l) {
            return;
        }
        try {
            Context createDisplayContext = this.f5924a.createDisplayContext(this.f5925b);
            this.f5927d = (WindowManager) createDisplayContext.getSystemService("window");
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(createDisplayContext, R.style.Theme_T500_Split);
            this.f5928e = contextThemeWrapper;
            LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
            if (from.getFactory2() == null) {
                from.setFactory2(new LayoutInflaterFactory2C1277P(0));
            }
            FrameLayout frameLayout = new FrameLayout(this.f5928e);
            this.f5929f = frameLayout;
            frameLayout.setClipChildren(false);
            this.f5929f.setClipToPadding(false);
            AbstractC1539g1.m4222i0(cfgdata);
            int m4173e = C1537g.m4173e(cfgdata);
            this.f5934k = m4173e;
            View m3095c = m3095c(from, m4173e);
            this.f5931h = m3095c;
            AbstractC1540h.m4245a(this.f5929f, m3095c, cfgdata);
            m3094b();
            this.f5932i = this.f5929f;
            m3096d();
            FrameLayout frameLayout2 = this.f5932i;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            frameLayout2.setLayoutDirection(0);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(1920, 800, 2038, 536, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = 0;
            layoutParams.y = 0;
            this.f5927d.addView(this.f5932i, layoutParams);
            this.f5935l = true;
            C1537g c1537g = new C1537g(this.f5928e, this.f5931h);
            this.f5933j = c1537g;
            c1537g.m4178h();
            this.f5933j.m4176f(true);
        } catch (Exception unused) {
            m3093a();
        }
    }
}
