package p022K;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.sun.jna.Platform;
import p077j0.AbstractC0982m;
import p091o.C1192b;
import p109u0.C1474D;
import p109u0.C1477E0;
import p109u0.C1488K;
import p109u0.C1491L0;
import p109u0.C1498P;
import p109u0.C1506T0;
import p109u0.C1509V;
import p109u0.C1520a0;
import p109u0.C1541h0;
import p109u0.C1568q0;
import p109u0.C1576u;
import p109u0.C1583x0;
import p109u0.RunnableC1476E;
import p109u0.RunnableC1490L;
import p109u0.RunnableC1500Q;
import p109u0.RunnableC1511W;
import p109u0.RunnableC1529d0;

/* renamed from: K.b0 */
/* loaded from: classes.dex */
public final class C0181b0 extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f493a;

    /* renamed from: b */
    public final /* synthetic */ Object f494b;

    /* renamed from: c */
    public final /* synthetic */ Object f495c;

    public /* synthetic */ C0181b0(Object obj, int i, Object obj2) {
        this.f493a = i;
        this.f495c = obj;
        this.f494b = obj2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f493a) {
            case 0:
                ((C0195i0) this.f494b).f526a.mo583d(1.0f);
                C0185d0.m543e((View) this.f495c);
                break;
            case 1:
                ((C1192b) this.f494b).remove(animator);
                ((AbstractC0982m) this.f495c).f4707n.remove(animator);
                break;
            case 2:
                ((Runnable) this.f494b).run();
                ((C1576u) this.f495c).m4602y1();
                break;
            case 3:
                ((Runnable) this.f494b).run();
                ((C1474D) this.f495c).m3524F0();
                break;
            case 4:
                RunnableC1476E runnableC1476E = (RunnableC1476E) this.f494b;
                if (runnableC1476E != null) {
                    runnableC1476E.run();
                }
                ((C1488K) this.f495c).m3735d();
                break;
            case 5:
                RunnableC1490L runnableC1490L = (RunnableC1490L) this.f494b;
                if (runnableC1490L != null) {
                    runnableC1490L.run();
                }
                ((C1498P) this.f495c).m3898F();
                break;
            case 6:
                RunnableC1500Q runnableC1500Q = (RunnableC1500Q) this.f494b;
                if (runnableC1500Q != null) {
                    runnableC1500Q.run();
                }
                ((C1509V) this.f495c).m4061G();
                break;
            case 7:
                RunnableC1511W runnableC1511W = (RunnableC1511W) this.f494b;
                if (runnableC1511W != null) {
                    runnableC1511W.run();
                }
                ((C1520a0) this.f495c).m4133D();
                break;
            case 8:
                RunnableC1529d0 runnableC1529d0 = (RunnableC1529d0) this.f494b;
                if (runnableC1529d0 != null) {
                    runnableC1529d0.run();
                }
                ((C1541h0) this.f495c).m4269f();
                break;
            case Platform.GNU /* 9 */:
                ((Runnable) this.f494b).run();
                ((C1568q0) this.f495c).m4445y1();
                break;
            case Platform.KFREEBSD /* 10 */:
                ((Runnable) this.f494b).run();
                ((C1583x0) this.f495c).m4735y1();
                break;
            case Platform.NETBSD /* 11 */:
                ((Runnable) this.f494b).run();
                ((C1477E0) this.f495c).m3610A1();
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                ((Runnable) this.f494b).run();
                ((C1491L0) this.f495c).m3776A1();
                break;
            default:
                ((Runnable) this.f494b).run();
                ((C1506T0) this.f495c).m4031s1();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.f493a) {
            case 1:
                ((AbstractC0982m) this.f495c).f4707n.add(animator);
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }

    public C0181b0(C0195i0 c0195i0, View view) {
        this.f493a = 0;
        this.f494b = c0195i0;
        this.f495c = view;
    }
}
