package p017H0;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p010D1.AbstractC0088l;
import p117x.AbstractC1636a;

/* renamed from: H0.e */
/* loaded from: classes.dex */
public final class C0126e extends AbstractC0088l {

    /* renamed from: c */
    public final /* synthetic */ int f388c;

    /* renamed from: d */
    public final /* synthetic */ AbstractC1636a f389d;

    public /* synthetic */ C0126e(AbstractC1636a abstractC1636a, int i) {
        this.f388c = i;
        this.f389d = abstractC1636a;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: P */
    public int mo293P(View view) {
        switch (this.f388c) {
            case 1:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f389d;
                return sideSheetBehavior.f3587l + sideSheetBehavior.f3590o;
            default:
                return super.mo293P(view);
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: Q */
    public int mo294Q() {
        switch (this.f388c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f389d;
                return bottomSheetBehavior.f3372I ? bottomSheetBehavior.f3383T : bottomSheetBehavior.f3370G;
            default:
                return super.mo294Q();
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: b0 */
    public final void mo300b0(int i) {
        switch (this.f388c) {
            case 0:
                if (i == 1) {
                    BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f389d;
                    if (bottomSheetBehavior.f3374K) {
                        bottomSheetBehavior.m2032C(1);
                        break;
                    }
                }
                break;
            default:
                if (i == 1) {
                    SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f389d;
                    if (sideSheetBehavior.f3582g) {
                        sideSheetBehavior.m2097r(1);
                        break;
                    }
                }
                break;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: c0 */
    public final void mo302c0(View view, int i, int i2) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        switch (this.f388c) {
            case 0:
                ((BottomSheetBehavior) this.f389d).m2045u(i2);
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f389d;
                WeakReference weakReference = sideSheetBehavior.f3592q;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) view2.getLayoutParams()) != null) {
                    sideSheetBehavior.f3576a.mo320t0(marginLayoutParams, view.getLeft(), view.getRight());
                    view2.setLayoutParams(marginLayoutParams);
                }
                LinkedHashSet linkedHashSet = sideSheetBehavior.f3596u;
                if (linkedHashSet.isEmpty()) {
                    return;
                }
                sideSheetBehavior.f3576a.mo309k(i);
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002a, code lost:
    
        if (r0.f3576a.mo296V(r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
    
        if (java.lang.Math.abs(r7 - r0.f3576a.mo284G()) < java.lang.Math.abs(r7 - r0.f3576a.mo286I())) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0080, code lost:
    
        if (r7 > r4.f3368E) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
    
        if (java.lang.Math.abs(r6.getTop() - r4.m2046x()) < java.lang.Math.abs(r6.getTop() - r4.f3368E)) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        if (java.lang.Math.abs(r7 - r4.f3367D) < java.lang.Math.abs(r7 - r4.f3370G)) goto L27;
     */
    @Override // p010D1.AbstractC0088l
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo303d0(View view, float f2, float f3) {
        switch (this.f388c) {
            case 0:
                int i = 6;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f389d;
                if (f3 < 0.0f) {
                    if (!bottomSheetBehavior.f3392b) {
                        int top = view.getTop();
                        System.currentTimeMillis();
                        bottomSheetBehavior.getClass();
                        break;
                    }
                    i = 3;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.m2034E(i, view, true);
                    break;
                } else if (bottomSheetBehavior.f3372I && bottomSheetBehavior.m2033D(view, f3)) {
                    if (Math.abs(f2) >= Math.abs(f3) || f3 <= bottomSheetBehavior.f3396d) {
                        if (view.getTop() <= (bottomSheetBehavior.m2046x() + bottomSheetBehavior.f3383T) / 2) {
                            if (!bottomSheetBehavior.f3392b) {
                                break;
                            }
                            i = 3;
                            bottomSheetBehavior.getClass();
                            bottomSheetBehavior.m2034E(i, view, true);
                        }
                    }
                    i = 5;
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.m2034E(i, view, true);
                } else {
                    if (f3 == 0.0f || Math.abs(f2) > Math.abs(f3)) {
                        int top2 = view.getTop();
                        if (bottomSheetBehavior.f3392b) {
                            break;
                        } else {
                            int i2 = bottomSheetBehavior.f3368E;
                            if (top2 < i2) {
                                if (top2 >= Math.abs(top2 - bottomSheetBehavior.f3370G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i = 3;
                            } else {
                                if (Math.abs(top2 - i2) < Math.abs(top2 - bottomSheetBehavior.f3370G)) {
                                    bottomSheetBehavior.getClass();
                                }
                                i = 4;
                            }
                        }
                    } else {
                        if (!bottomSheetBehavior.f3392b) {
                            int top3 = view.getTop();
                            if (Math.abs(top3 - bottomSheetBehavior.f3368E) < Math.abs(top3 - bottomSheetBehavior.f3370G)) {
                                bottomSheetBehavior.getClass();
                            }
                        }
                        i = 4;
                    }
                    bottomSheetBehavior.getClass();
                    bottomSheetBehavior.m2034E(i, view, true);
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f389d;
                int i3 = 3;
                if (!sideSheetBehavior.f3576a.mo295R(f2)) {
                    if (sideSheetBehavior.f3576a.mo316p0(view, f2)) {
                        if (!sideSheetBehavior.f3576a.mo297X(f2, f3)) {
                            break;
                        }
                        i3 = 5;
                    } else {
                        if (f2 == 0.0f || Math.abs(f2) <= Math.abs(f3)) {
                            int left = view.getLeft();
                            break;
                        }
                        i3 = 5;
                    }
                }
                sideSheetBehavior.m2099t(i3, view, true);
                break;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: r */
    public final int mo317r(View view, int i) {
        switch (this.f388c) {
            case 0:
                return view.getLeft();
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f389d;
                return AbstractC0088l.m278q(i, sideSheetBehavior.f3576a.mo288K(), sideSheetBehavior.f3576a.mo287J());
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: s */
    public final int mo318s(View view, int i) {
        switch (this.f388c) {
            case 0:
                return AbstractC0088l.m278q(i, ((BottomSheetBehavior) this.f389d).m2046x(), mo294Q());
            default:
                return view.getTop();
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: s0 */
    public final boolean mo319s0(View view, int i) {
        WeakReference weakReference;
        switch (this.f388c) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.f389d;
                int i2 = bottomSheetBehavior.f3375L;
                if (i2 != 1 && !bottomSheetBehavior.f3391a0) {
                    if (i2 == 3 && bottomSheetBehavior.f3388Y == i) {
                        WeakReference weakReference2 = bottomSheetBehavior.f3385V;
                        View view2 = weakReference2 != null ? (View) weakReference2.get() : null;
                        if (view2 != null && view2.canScrollVertically(-1)) {
                        }
                    }
                    System.currentTimeMillis();
                    WeakReference weakReference3 = bottomSheetBehavior.f3384U;
                    if (weakReference3 != null && weakReference3.get() == view) {
                        break;
                    }
                }
                break;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f389d;
                if (sideSheetBehavior.f3583h != 1 && (weakReference = sideSheetBehavior.f3591p) != null && weakReference.get() == view) {
                    break;
                }
                break;
        }
        return true;
    }
}
