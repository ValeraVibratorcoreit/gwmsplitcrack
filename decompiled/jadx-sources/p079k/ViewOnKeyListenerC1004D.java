package p079k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import p046X.ViewOnAttachStateChangeListenerC0393V;
import p082l.C1060F0;
import p082l.C1130n0;

/* renamed from: k.D */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1004D extends AbstractC1026u implements PopupWindow.OnDismissListener, View.OnKeyListener {

    /* renamed from: g */
    public final Context f4741g;

    /* renamed from: h */
    public final MenuC1018m f4742h;

    /* renamed from: i */
    public final C1015j f4743i;

    /* renamed from: j */
    public final boolean f4744j;

    /* renamed from: k */
    public final int f4745k;

    /* renamed from: l */
    public final int f4746l;

    /* renamed from: m */
    public final C1060F0 f4747m;

    /* renamed from: p */
    public C1027v f4750p;

    /* renamed from: q */
    public View f4751q;

    /* renamed from: r */
    public View f4752r;

    /* renamed from: s */
    public InterfaceC1029x f4753s;

    /* renamed from: t */
    public ViewTreeObserver f4754t;

    /* renamed from: u */
    public boolean f4755u;

    /* renamed from: v */
    public boolean f4756v;

    /* renamed from: w */
    public int f4757w;

    /* renamed from: y */
    public boolean f4759y;

    /* renamed from: n */
    public final ViewTreeObserverOnGlobalLayoutListenerC1009d f4748n = new ViewTreeObserverOnGlobalLayoutListenerC1009d(1, this);

    /* renamed from: o */
    public final ViewOnAttachStateChangeListenerC0393V f4749o = new ViewOnAttachStateChangeListenerC0393V(3, this);

    /* renamed from: x */
    public int f4758x = 0;

    public ViewOnKeyListenerC1004D(int i, Context context, View view, MenuC1018m menuC1018m, boolean z2) {
        this.f4741g = context;
        this.f4742h = menuC1018m;
        this.f4744j = z2;
        this.f4743i = new C1015j(menuC1018m, LayoutInflater.from(context), z2, R.layout.abc_popup_menu_item_layout);
        this.f4746l = i;
        Resources resources = context.getResources();
        this.f4745k = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4751q = view;
        this.f4747m = new C1060F0(context, null, i);
        menuC1018m.m2614b(this, context);
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: a */
    public final void mo2580a(MenuC1018m menuC1018m, boolean z2) {
        if (menuC1018m != this.f4742h) {
            return;
        }
        dismiss();
        InterfaceC1029x interfaceC1029x = this.f4753s;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1874a(menuC1018m, z2);
        }
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: b */
    public final boolean mo2577b() {
        return !this.f4755u && this.f4747m.f4999E.isShowing();
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: d */
    public final boolean mo2581d(SubMenuC1005E subMenuC1005E) {
        if (subMenuC1005E.hasVisibleItems()) {
            View view = this.f4752r;
            C1028w c1028w = new C1028w(this.f4746l, this.f4741g, view, subMenuC1005E, this.f4744j);
            InterfaceC1029x interfaceC1029x = this.f4753s;
            c1028w.f4904h = interfaceC1029x;
            AbstractC1026u abstractC1026u = c1028w.f4905i;
            if (abstractC1026u != null) {
                abstractC1026u.mo2584k(interfaceC1029x);
            }
            boolean m2634u = AbstractC1026u.m2634u(subMenuC1005E);
            c1028w.f4903g = m2634u;
            AbstractC1026u abstractC1026u2 = c1028w.f4905i;
            if (abstractC1026u2 != null) {
                abstractC1026u2.mo2587o(m2634u);
            }
            c1028w.f4906j = this.f4750p;
            this.f4750p = null;
            this.f4742h.m2615c(false);
            C1060F0 c1060f0 = this.f4747m;
            int i = c1060f0.f5005k;
            int m2647g = c1060f0.m2647g();
            if ((Gravity.getAbsoluteGravity(this.f4758x, this.f4751q.getLayoutDirection()) & 7) == 5) {
                i += this.f4751q.getWidth();
            }
            if (!c1028w.m2636b()) {
                if (c1028w.f4901e != null) {
                    c1028w.m2638d(i, m2647g, true, true);
                }
            }
            InterfaceC1029x interfaceC1029x2 = this.f4753s;
            if (interfaceC1029x2 != null) {
                interfaceC1029x2.mo1875b(subMenuC1005E);
            }
            return true;
        }
        return false;
    }

    @Override // p079k.InterfaceC1003C
    public final void dismiss() {
        if (mo2577b()) {
            this.f4747m.dismiss();
        }
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: f */
    public final void mo2578f() {
        View view;
        if (mo2577b()) {
            return;
        }
        if (this.f4755u || (view = this.f4751q) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.f4752r = view;
        C1060F0 c1060f0 = this.f4747m;
        c1060f0.f4999E.setOnDismissListener(this);
        c1060f0.f5015u = this;
        c1060f0.f4998D = true;
        c1060f0.f4999E.setFocusable(true);
        View view2 = this.f4752r;
        boolean z2 = this.f4754t == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f4754t = viewTreeObserver;
        if (z2) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f4748n);
        }
        view2.addOnAttachStateChangeListener(this.f4749o);
        c1060f0.f5014t = view2;
        c1060f0.f5011q = this.f4758x;
        boolean z3 = this.f4756v;
        Context context = this.f4741g;
        C1015j c1015j = this.f4743i;
        if (!z3) {
            this.f4757w = AbstractC1026u.m2633m(c1015j, context, this.f4745k);
            this.f4756v = true;
        }
        c1060f0.m2653q(this.f4757w);
        c1060f0.f4999E.setInputMethodMode(2);
        Rect rect = this.f4895f;
        c1060f0.f4997C = rect != null ? new Rect(rect) : null;
        c1060f0.mo2578f();
        C1130n0 c1130n0 = c1060f0.f5002h;
        c1130n0.setOnKeyListener(this);
        if (this.f4759y) {
            MenuC1018m menuC1018m = this.f4742h;
            if (menuC1018m.f4841m != null) {
                FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(context).inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1130n0, false);
                TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
                if (textView != null) {
                    textView.setText(menuC1018m.f4841m);
                }
                frameLayout.setEnabled(false);
                c1130n0.addHeaderView(frameLayout, null, false);
            }
        }
        c1060f0.mo2651n(c1015j);
        c1060f0.mo2578f();
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: h */
    public final boolean mo2582h() {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: i */
    public final void mo2583i() {
        this.f4756v = false;
        C1015j c1015j = this.f4743i;
        if (c1015j != null) {
            c1015j.notifyDataSetChanged();
        }
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: j */
    public final C1130n0 mo2579j() {
        return this.f4747m.f5002h;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: k */
    public final void mo2584k(InterfaceC1029x interfaceC1029x) {
        this.f4753s = interfaceC1029x;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: l */
    public final void mo2585l(MenuC1018m menuC1018m) {
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: n */
    public final void mo2586n(View view) {
        this.f4751q = view;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: o */
    public final void mo2587o(boolean z2) {
        this.f4743i.f4824c = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.f4755u = true;
        this.f4742h.m2615c(true);
        ViewTreeObserver viewTreeObserver = this.f4754t;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f4754t = this.f4752r.getViewTreeObserver();
            }
            this.f4754t.removeGlobalOnLayoutListener(this.f4748n);
            this.f4754t = null;
        }
        this.f4752r.removeOnAttachStateChangeListener(this.f4749o);
        C1027v c1027v = this.f4750p;
        if (c1027v != null) {
            c1027v.onDismiss();
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: p */
    public final void mo2588p(int i) {
        this.f4758x = i;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: q */
    public final void mo2589q(int i) {
        this.f4747m.f5005k = i;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: r */
    public final void mo2590r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4750p = (C1027v) onDismissListener;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: s */
    public final void mo2591s(boolean z2) {
        this.f4759y = z2;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: t */
    public final void mo2592t(int i) {
        this.f4747m.m2650m(i);
    }
}
