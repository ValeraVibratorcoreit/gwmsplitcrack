package p070g;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p003B.C0043j;
import p010D1.AbstractC0088l;
import p022K.AbstractC0156D;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0174W;
import p022K.C0175X;
import p067f.AbstractC0770a;
import p076j.C0960i;
import p076j.C0961j;
import p082l.C1097Y0;
import p082l.InterfaceC1109d;
import p082l.InterfaceC1116g0;

/* renamed from: g.J */
/* loaded from: classes.dex */
public final class C0861J extends AbstractC0088l implements InterfaceC1109d {

    /* renamed from: A */
    public static final AccelerateInterpolator f4292A = new AccelerateInterpolator();

    /* renamed from: B */
    public static final DecelerateInterpolator f4293B = new DecelerateInterpolator();

    /* renamed from: c */
    public Context f4294c;

    /* renamed from: d */
    public Context f4295d;

    /* renamed from: e */
    public ActionBarOverlayLayout f4296e;

    /* renamed from: f */
    public ActionBarContainer f4297f;

    /* renamed from: g */
    public InterfaceC1116g0 f4298g;

    /* renamed from: h */
    public ActionBarContextView f4299h;

    /* renamed from: i */
    public final View f4300i;

    /* renamed from: j */
    public boolean f4301j;

    /* renamed from: k */
    public C0860I f4302k;

    /* renamed from: l */
    public C0860I f4303l;

    /* renamed from: m */
    public C0043j f4304m;

    /* renamed from: n */
    public boolean f4305n;

    /* renamed from: o */
    public final ArrayList f4306o;

    /* renamed from: p */
    public int f4307p;

    /* renamed from: q */
    public boolean f4308q;

    /* renamed from: r */
    public boolean f4309r;

    /* renamed from: s */
    public boolean f4310s;

    /* renamed from: t */
    public boolean f4311t;

    /* renamed from: u */
    public C0961j f4312u;

    /* renamed from: v */
    public boolean f4313v;

    /* renamed from: w */
    public boolean f4314w;

    /* renamed from: x */
    public final C0859H f4315x;

    /* renamed from: y */
    public final C0859H f4316y;

    /* renamed from: z */
    public final C0639g f4317z;

    public C0861J(Activity activity, boolean z2) {
        new ArrayList();
        this.f4306o = new ArrayList();
        this.f4307p = 0;
        this.f4308q = true;
        this.f4311t = true;
        this.f4315x = new C0859H(this, 0);
        this.f4316y = new C0859H(this, 1);
        this.f4317z = new C0639g(24, this);
        View decorView = activity.getWindow().getDecorView();
        m2393x0(decorView);
        if (z2) {
            return;
        }
        this.f4300i = decorView.findViewById(R.id.content);
    }

    /* renamed from: A0 */
    public final void m2390A0(boolean z2) {
        boolean z3 = this.f4310s || !this.f4309r;
        View view = this.f4300i;
        C0639g c0639g = this.f4317z;
        if (!z3) {
            if (this.f4311t) {
                this.f4311t = false;
                C0961j c0961j = this.f4312u;
                if (c0961j != null) {
                    c0961j.m2502a();
                }
                int i = this.f4307p;
                C0859H c0859h = this.f4315x;
                if (i != 0 || (!this.f4313v && !z2)) {
                    c0859h.mo525a();
                    return;
                }
                this.f4297f.setAlpha(1.0f);
                this.f4297f.setTransitioning(true);
                C0961j c0961j2 = new C0961j();
                float f2 = -this.f4297f.getHeight();
                if (z2) {
                    this.f4297f.getLocationInWindow(new int[]{0, 0});
                    f2 -= r12[1];
                }
                C0175X m496a = AbstractC0169Q.m496a(this.f4297f);
                m496a.m524e(f2);
                View view2 = (View) m496a.f483a.get();
                if (view2 != null) {
                    view2.animate().setUpdateListener(c0639g != null ? new C0174W(c0639g, view2) : null);
                }
                boolean z4 = c0961j2.f4631e;
                ArrayList arrayList = c0961j2.f4627a;
                if (!z4) {
                    arrayList.add(m496a);
                }
                if (this.f4308q && view != null) {
                    C0175X m496a2 = AbstractC0169Q.m496a(view);
                    m496a2.m524e(f2);
                    if (!c0961j2.f4631e) {
                        arrayList.add(m496a2);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = f4292A;
                boolean z5 = c0961j2.f4631e;
                if (!z5) {
                    c0961j2.f4629c = accelerateInterpolator;
                }
                if (!z5) {
                    c0961j2.f4628b = 250L;
                }
                if (!z5) {
                    c0961j2.f4630d = c0859h;
                }
                this.f4312u = c0961j2;
                c0961j2.m2503b();
                return;
            }
            return;
        }
        if (this.f4311t) {
            return;
        }
        this.f4311t = true;
        C0961j c0961j3 = this.f4312u;
        if (c0961j3 != null) {
            c0961j3.m2502a();
        }
        this.f4297f.setVisibility(0);
        int i2 = this.f4307p;
        C0859H c0859h2 = this.f4316y;
        if (i2 == 0 && (this.f4313v || z2)) {
            this.f4297f.setTranslationY(0.0f);
            float f3 = -this.f4297f.getHeight();
            if (z2) {
                this.f4297f.getLocationInWindow(new int[]{0, 0});
                f3 -= r12[1];
            }
            this.f4297f.setTranslationY(f3);
            C0961j c0961j4 = new C0961j();
            C0175X m496a3 = AbstractC0169Q.m496a(this.f4297f);
            m496a3.m524e(0.0f);
            View view3 = (View) m496a3.f483a.get();
            if (view3 != null) {
                view3.animate().setUpdateListener(c0639g != null ? new C0174W(c0639g, view3) : null);
            }
            boolean z6 = c0961j4.f4631e;
            ArrayList arrayList2 = c0961j4.f4627a;
            if (!z6) {
                arrayList2.add(m496a3);
            }
            if (this.f4308q && view != null) {
                view.setTranslationY(f3);
                C0175X m496a4 = AbstractC0169Q.m496a(view);
                m496a4.m524e(0.0f);
                if (!c0961j4.f4631e) {
                    arrayList2.add(m496a4);
                }
            }
            DecelerateInterpolator decelerateInterpolator = f4293B;
            boolean z7 = c0961j4.f4631e;
            if (!z7) {
                c0961j4.f4629c = decelerateInterpolator;
            }
            if (!z7) {
                c0961j4.f4628b = 250L;
            }
            if (!z7) {
                c0961j4.f4630d = c0859h2;
            }
            this.f4312u = c0961j4;
            c0961j4.m2503b();
        } else {
            this.f4297f.setAlpha(1.0f);
            this.f4297f.setTranslationY(0.0f);
            if (this.f4308q && view != null) {
                view.setTranslationY(0.0f);
            }
            c0859h2.mo525a();
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f4296e;
        if (actionBarOverlayLayout != null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            AbstractC0156D.m419c(actionBarOverlayLayout);
        }
    }

    /* renamed from: v0 */
    public final void m2391v0(boolean z2) {
        C0175X m1272i;
        C0175X c0175x;
        if (z2) {
            if (!this.f4310s) {
                this.f4310s = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.f4296e;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                m2390A0(false);
            }
        } else if (this.f4310s) {
            this.f4310s = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4296e;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            m2390A0(false);
        }
        if (!this.f4297f.isLaidOut()) {
            if (z2) {
                ((C1097Y0) this.f4298g).f5132a.setVisibility(4);
                this.f4299h.setVisibility(0);
                return;
            } else {
                ((C1097Y0) this.f4298g).f5132a.setVisibility(0);
                this.f4299h.setVisibility(8);
                return;
            }
        }
        if (z2) {
            C1097Y0 c1097y0 = (C1097Y0) this.f4298g;
            m1272i = AbstractC0169Q.m496a(c1097y0.f5132a);
            m1272i.m520a(0.0f);
            m1272i.m522c(100L);
            m1272i.m523d(new C0960i(c1097y0, 4));
            c0175x = this.f4299h.m1272i(0, 200L);
        } else {
            C1097Y0 c1097y02 = (C1097Y0) this.f4298g;
            C0175X m496a = AbstractC0169Q.m496a(c1097y02.f5132a);
            m496a.m520a(1.0f);
            m496a.m522c(200L);
            m496a.m523d(new C0960i(c1097y02, 0));
            m1272i = this.f4299h.m1272i(8, 100L);
            c0175x = m496a;
        }
        C0961j c0961j = new C0961j();
        ArrayList arrayList = c0961j.f4627a;
        arrayList.add(m1272i);
        View view = (View) m1272i.f483a.get();
        long duration = view != null ? view.animate().getDuration() : 0L;
        View view2 = (View) c0175x.f483a.get();
        if (view2 != null) {
            view2.animate().setStartDelay(duration);
        }
        arrayList.add(c0175x);
        c0961j.m2503b();
    }

    /* renamed from: w0 */
    public final Context m2392w0() {
        if (this.f4295d == null) {
            TypedValue typedValue = new TypedValue();
            this.f4294c.getTheme().resolveAttribute(com.altaysoft.t500_split.R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.f4295d = new ContextThemeWrapper(this.f4294c, i);
            } else {
                this.f4295d = this.f4294c;
            }
        }
        return this.f4295d;
    }

    /* renamed from: x0 */
    public final void m2393x0(View view) {
        InterfaceC1116g0 wrapper;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(com.altaysoft.t500_split.R.id.decor_content_parent);
        this.f4296e = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        KeyEvent.Callback findViewById = view.findViewById(com.altaysoft.t500_split.R.id.action_bar);
        if (findViewById instanceof InterfaceC1116g0) {
            wrapper = (InterfaceC1116g0) findViewById;
        } else {
            if (!(findViewById instanceof Toolbar)) {
                throw new IllegalStateException("Can't make a decor toolbar out of ".concat(findViewById != null ? findViewById.getClass().getSimpleName() : "null"));
            }
            wrapper = ((Toolbar) findViewById).getWrapper();
        }
        this.f4298g = wrapper;
        this.f4299h = (ActionBarContextView) view.findViewById(com.altaysoft.t500_split.R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(com.altaysoft.t500_split.R.id.action_bar_container);
        this.f4297f = actionBarContainer;
        InterfaceC1116g0 interfaceC1116g0 = this.f4298g;
        if (interfaceC1116g0 == null || this.f4299h == null || actionBarContainer == null) {
            throw new IllegalStateException(C0861J.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
        }
        Context context = ((C1097Y0) interfaceC1116g0).f5132a.getContext();
        this.f4294c = context;
        if ((((C1097Y0) this.f4298g).f5133b & 4) != 0) {
            this.f4301j = true;
        }
        int i = context.getApplicationInfo().targetSdkVersion;
        this.f4298g.getClass();
        m2395z0(context.getResources().getBoolean(com.altaysoft.t500_split.R.bool.abc_action_bar_embed_tabs));
        TypedArray obtainStyledAttributes = this.f4294c.obtainStyledAttributes(null, AbstractC0770a.f3894a, com.altaysoft.t500_split.R.attr.actionBarStyle, 0);
        if (obtainStyledAttributes.getBoolean(14, false)) {
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.f4296e;
            if (!actionBarOverlayLayout2.f1758l) {
                throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
            }
            this.f4314w = true;
            actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
        }
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        if (dimensionPixelSize != 0) {
            ActionBarContainer actionBarContainer2 = this.f4297f;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            AbstractC0158F.m438s(actionBarContainer2, dimensionPixelSize);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: y0 */
    public final void m2394y0(boolean z2) {
        if (this.f4301j) {
            return;
        }
        int i = z2 ? 4 : 0;
        C1097Y0 c1097y0 = (C1097Y0) this.f4298g;
        int i2 = c1097y0.f5133b;
        this.f4301j = true;
        c1097y0.m2722a((i & 4) | (i2 & (-5)));
    }

    /* renamed from: z0 */
    public final void m2395z0(boolean z2) {
        if (z2) {
            this.f4297f.setTabContainer(null);
            ((C1097Y0) this.f4298g).getClass();
        } else {
            ((C1097Y0) this.f4298g).getClass();
            this.f4297f.setTabContainer(null);
        }
        this.f4298g.getClass();
        ((C1097Y0) this.f4298g).f5132a.setCollapsible(false);
        this.f4296e.setHasNonEmbeddedTabs(false);
    }

    public C0861J(Dialog dialog) {
        new ArrayList();
        this.f4306o = new ArrayList();
        this.f4307p = 0;
        this.f4308q = true;
        this.f4311t = true;
        this.f4315x = new C0859H(this, 0);
        this.f4316y = new C0859H(this, 1);
        this.f4317z = new C0639g(24, this);
        m2393x0(dialog.getWindow().getDecorView());
    }
}
