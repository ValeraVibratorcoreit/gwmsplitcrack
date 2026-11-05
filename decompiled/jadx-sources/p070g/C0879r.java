package p070g;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;
import p003B.C0043j;
import p010D1.AbstractC0088l;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;

/* renamed from: g.r */
/* loaded from: classes.dex */
public final class C0879r extends AbstractC0088l {

    /* renamed from: c */
    public final /* synthetic */ int f4386c;

    /* renamed from: d */
    public final /* synthetic */ Object f4387d;

    public /* synthetic */ C0879r(int i, Object obj) {
        this.f4386c = i;
        this.f4387d = obj;
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: a */
    public final void mo525a() {
        Object obj = this.f4387d;
        switch (this.f4386c) {
            case 0:
                RunnableC0877p runnableC0877p = (RunnableC0877p) obj;
                runnableC0877p.f4383b.f4416A.setAlpha(1.0f);
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = runnableC0877p.f4383b;
                layoutInflaterFactory2C0887z.f4419D.m523d(null);
                layoutInflaterFactory2C0887z.f4419D = null;
                break;
            case 1:
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z2 = (LayoutInflaterFactory2C0887z) obj;
                layoutInflaterFactory2C0887z2.f4416A.setAlpha(1.0f);
                layoutInflaterFactory2C0887z2.f4419D.m523d(null);
                layoutInflaterFactory2C0887z2.f4419D = null;
                break;
            default:
                C0043j c0043j = (C0043j) obj;
                ((LayoutInflaterFactory2C0887z) c0043j.f142h).f4416A.setVisibility(8);
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z3 = (LayoutInflaterFactory2C0887z) c0043j.f142h;
                PopupWindow popupWindow = layoutInflaterFactory2C0887z3.f4417B;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C0887z3.f4416A.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0887z3.f4416A.getParent();
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    AbstractC0156D.m419c(view);
                }
                layoutInflaterFactory2C0887z3.f4416A.m1270e();
                layoutInflaterFactory2C0887z3.f4419D.m523d(null);
                layoutInflaterFactory2C0887z3.f4419D = null;
                ViewGroup viewGroup = layoutInflaterFactory2C0887z3.f4421F;
                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                AbstractC0156D.m419c(viewGroup);
                break;
        }
    }

    @Override // p010D1.AbstractC0088l, p022K.InterfaceC0176Y
    /* renamed from: c */
    public void mo301c() {
        Object obj = this.f4387d;
        switch (this.f4386c) {
            case 0:
                ((RunnableC0877p) obj).f4383b.f4416A.setVisibility(0);
                break;
            case 1:
                LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) obj;
                layoutInflaterFactory2C0887z.f4416A.setVisibility(0);
                if (layoutInflaterFactory2C0887z.f4416A.getParent() instanceof View) {
                    View view = (View) layoutInflaterFactory2C0887z.f4416A.getParent();
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    AbstractC0156D.m419c(view);
                    break;
                }
                break;
        }
    }
}
