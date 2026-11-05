package p109u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: u0.q */
/* loaded from: classes.dex */
public final class C1567q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f8534a;

    /* renamed from: b */
    public final /* synthetic */ float f8535b;

    /* renamed from: c */
    public final /* synthetic */ float f8536c;

    /* renamed from: d */
    public final /* synthetic */ float f8537d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f8538e;

    /* renamed from: f */
    public final /* synthetic */ Object f8539f;

    public /* synthetic */ C1567q(Object obj, float f2, float f3, float f4, Runnable runnable, int i) {
        this.f8534a = i;
        this.f8539f = obj;
        this.f8535b = f2;
        this.f8536c = f3;
        this.f8537d = f4;
        this.f8538e = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.f8534a) {
            case 0:
                C1576u c1576u = (C1576u) this.f8539f;
                c1576u.f8821w1 = null;
                c1576u.f8812t1 = this.f8535b;
                c1576u.f8815u1 = this.f8536c;
                c1576u.f8818v1 = this.f8537d;
                c1576u.m4506F();
                RunnableC1543i runnableC1543i = (RunnableC1543i) this.f8538e;
                if (runnableC1543i != null) {
                    runnableC1543i.run();
                    break;
                }
                break;
            case 1:
                C1568q0 c1568q0 = (C1568q0) this.f8539f;
                c1568q0.f8626k1 = null;
                c1568q0.f8617h1 = this.f8535b;
                c1568q0.f8620i1 = this.f8536c;
                c1568q0.f8623j1 = this.f8537d;
                c1568q0.m4345D();
                RunnableC1544i0 runnableC1544i0 = (RunnableC1544i0) this.f8538e;
                if (runnableC1544i0 != null) {
                    runnableC1544i0.run();
                    break;
                }
                break;
            case 2:
                C1583x0 c1583x0 = (C1583x0) this.f8539f;
                c1583x0.f8925i1 = null;
                c1583x0.f8916f1 = this.f8535b;
                c1583x0.f8919g1 = this.f8536c;
                c1583x0.f8922h1 = this.f8537d;
                c1583x0.m4636D();
                RunnableC1571r0 runnableC1571r0 = (RunnableC1571r0) this.f8538e;
                if (runnableC1571r0 != null) {
                    runnableC1571r0.run();
                    break;
                }
                break;
            case 3:
                C1477E0 c1477e0 = (C1477E0) this.f8539f;
                c1477e0.f7381i1 = null;
                c1477e0.f7372f1 = this.f8535b;
                c1477e0.f7375g1 = this.f8536c;
                c1477e0.f7378h1 = this.f8537d;
                c1477e0.m3617D();
                RunnableC1585y0 runnableC1585y0 = (RunnableC1585y0) this.f8538e;
                if (runnableC1585y0 != null) {
                    runnableC1585y0.run();
                    break;
                }
                break;
            case 4:
                C1491L0 c1491l0 = (C1491L0) this.f8539f;
                c1491l0.f7608i1 = null;
                c1491l0.f7599f1 = this.f8535b;
                c1491l0.f7602g1 = this.f8536c;
                c1491l0.f7605h1 = this.f8537d;
                c1491l0.m3783D();
                RunnableC1479F0 runnableC1479F0 = (RunnableC1479F0) this.f8538e;
                if (runnableC1479F0 != null) {
                    runnableC1479F0.run();
                    break;
                }
                break;
            default:
                C1506T0 c1506t0 = (C1506T0) this.f8539f;
                c1506t0.f7825c1 = null;
                c1506t0.f7816Z0 = this.f8535b;
                c1506t0.f7819a1 = this.f8536c;
                c1506t0.f7822b1 = this.f8537d;
                c1506t0.m3947D();
                RunnableC1493M0 runnableC1493M0 = (RunnableC1493M0) this.f8538e;
                if (runnableC1493M0 != null) {
                    runnableC1493M0.run();
                    break;
                }
                break;
        }
    }
}
