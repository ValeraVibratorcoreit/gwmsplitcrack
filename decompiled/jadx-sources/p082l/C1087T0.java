package p082l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import p076j.InterfaceC0953b;
import p079k.C1020o;
import p079k.C1022q;
import p079k.InterfaceC1030y;
import p079k.MenuC1018m;
import p079k.SubMenuC1005E;

/* renamed from: l.T0 */
/* loaded from: classes.dex */
public final class C1087T0 implements InterfaceC1030y {

    /* renamed from: f */
    public MenuC1018m f5103f;

    /* renamed from: g */
    public C1020o f5104g;

    /* renamed from: h */
    public final /* synthetic */ Toolbar f5105h;

    public C1087T0(Toolbar toolbar) {
        this.f5105h = toolbar;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: a */
    public final void mo2580a(MenuC1018m menuC1018m, boolean z2) {
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: c */
    public final boolean mo2608c(C1020o c1020o) {
        Toolbar toolbar = this.f5105h;
        toolbar.m1292c();
        ViewParent parent = toolbar.f1834m.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.f1834m);
            }
            toolbar.addView(toolbar.f1834m);
        }
        View actionView = c1020o.getActionView();
        toolbar.f1835n = actionView;
        this.f5104g = c1020o;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.f1835n);
            }
            C1089U0 m1286h = Toolbar.m1286h();
            m1286h.f5106a = (toolbar.f1840s & 112) | 8388611;
            m1286h.f5107b = 2;
            toolbar.f1835n.setLayoutParams(m1286h);
            toolbar.addView(toolbar.f1835n);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((C1089U0) childAt.getLayoutParams()).f5107b != 2 && childAt != toolbar.f1827f) {
                toolbar.removeViewAt(childCount);
                toolbar.f1814J.add(childAt);
            }
        }
        toolbar.requestLayout();
        c1020o.f4858C = true;
        c1020o.f4872n.m2620p(false);
        KeyEvent.Callback callback = toolbar.f1835n;
        if (callback instanceof InterfaceC0953b) {
            ((C1022q) ((InterfaceC0953b) callback)).f4888f.onActionViewExpanded();
        }
        toolbar.m1306u();
        return true;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: d */
    public final boolean mo2581d(SubMenuC1005E subMenuC1005E) {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: e */
    public final boolean mo2609e(C1020o c1020o) {
        Toolbar toolbar = this.f5105h;
        KeyEvent.Callback callback = toolbar.f1835n;
        if (callback instanceof InterfaceC0953b) {
            ((C1022q) ((InterfaceC0953b) callback)).f4888f.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.f1835n);
        toolbar.removeView(toolbar.f1834m);
        toolbar.f1835n = null;
        ArrayList arrayList = toolbar.f1814J;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f5104g = null;
        toolbar.requestLayout();
        c1020o.f4858C = false;
        c1020o.f4872n.m2620p(false);
        toolbar.m1306u();
        return true;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: g */
    public final void mo2610g(Context context, MenuC1018m menuC1018m) {
        C1020o c1020o;
        MenuC1018m menuC1018m2 = this.f5103f;
        if (menuC1018m2 != null && (c1020o = this.f5104g) != null) {
            menuC1018m2.mo2593d(c1020o);
        }
        this.f5103f = menuC1018m;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: h */
    public final boolean mo2582h() {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: i */
    public final void mo2583i() {
        if (this.f5104g != null) {
            MenuC1018m menuC1018m = this.f5103f;
            if (menuC1018m != null) {
                int size = menuC1018m.f4834f.size();
                for (int i = 0; i < size; i++) {
                    if (this.f5103f.getItem(i) == this.f5104g) {
                        return;
                    }
                }
            }
            mo2609e(this.f5104g);
        }
    }
}
