package p022K;

import android.animation.ValueAnimator;
import android.view.View;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.p061ip.HolePunchLayout;
import com.sun.jna.Platform;
import p016H.C0112d;
import p054a1.C0502k;
import p070g.C0861J;
import p098q0.C1275O;
import p109u0.C1474D;
import p109u0.C1477E0;
import p109u0.C1488K;
import p109u0.C1491L0;
import p109u0.C1498P;
import p109u0.C1506T0;
import p109u0.C1509V;
import p109u0.C1518Z0;
import p109u0.C1520a0;
import p109u0.C1541h0;
import p109u0.C1568q0;
import p109u0.C1576u;
import p109u0.C1583x0;

/* renamed from: K.W */
/* loaded from: classes.dex */
public final /* synthetic */ class C0174W implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f481a;

    /* renamed from: b */
    public final /* synthetic */ Object f482b;

    public /* synthetic */ C0174W(int i, Object obj) {
        this.f481a = i;
        this.f482b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f481a) {
            case 0:
                ((View) ((C0861J) ((C0639g) this.f482b).f3011g).f4297f.getParent()).invalidate();
                break;
            case 1:
                C0502k c0502k = (C0502k) this.f482b;
                c0502k.getClass();
                c0502k.f1616d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 2:
                HolePunchLayout holePunchLayout = ((C1275O) this.f482b).f5830P0;
                if (holePunchLayout != null) {
                    holePunchLayout.setRightQnxHoleOpenProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
            case 3:
                ((View) ((C0112d) this.f482b).f351c).setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 4:
                C1576u c1576u = (C1576u) this.f482b;
                c1576u.getClass();
                c1576u.f8782j1 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1576u.m4602y1();
                c1576u.m4603z();
                break;
            case 5:
                C1474D c1474d = (C1474D) this.f482b;
                c1474d.getClass();
                c1474d.f7210L0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1474d.m3524F0();
                c1474d.m3572p();
                break;
            case 6:
                C1488K c1488k = (C1488K) this.f482b;
                c1488k.getClass();
                c1488k.f7506q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1488k.m3735d();
                break;
            case 7:
                C1498P c1498p = (C1498P) this.f482b;
                c1498p.getClass();
                c1498p.f7734u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1498p.m3898F();
                break;
            case 8:
                C1509V c1509v = (C1509V) this.f482b;
                c1509v.getClass();
                c1509v.f7957u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1509v.m4061G();
                break;
            case Platform.GNU /* 9 */:
                C1520a0 c1520a0 = (C1520a0) this.f482b;
                c1520a0.getClass();
                c1520a0.f8111s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1520a0.m4133D();
                break;
            case Platform.KFREEBSD /* 10 */:
                C1541h0 c1541h0 = (C1541h0) this.f482b;
                c1541h0.getClass();
                c1541h0.f8300g0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!c1541h0.m4275n()) {
                    C1541h0.f8258o0 = c1541h0.f8300g0;
                }
                c1541h0.m4269f();
                break;
            case Platform.NETBSD /* 11 */:
                C1568q0 c1568q0 = (C1568q0) this.f482b;
                c1568q0.getClass();
                c1568q0.f8585V0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1568q0.m4445y1();
                c1568q0.m4437w();
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                C1583x0 c1583x0 = (C1583x0) this.f482b;
                c1583x0.getClass();
                c1583x0.f8886T0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1583x0.m4735y1();
                c1583x0.m4727w();
                break;
            case 13:
                C1477E0 c1477e0 = (C1477E0) this.f482b;
                c1477e0.getClass();
                c1477e0.f7342T0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1477e0.m3610A1();
                c1477e0.m3710w();
                break;
            case 14:
                C1491L0 c1491l0 = (C1491L0) this.f482b;
                c1491l0.getClass();
                c1491l0.f7569T0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1491l0.m3776A1();
                c1491l0.m3876w();
                break;
            case 15:
                C1506T0 c1506t0 = (C1506T0) this.f482b;
                c1506t0.getClass();
                c1506t0.f7796P0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1506t0.m4031s1();
                c1506t0.m4038v();
                break;
            default:
                HolePunchLayout holePunchLayout2 = ((C1518Z0) this.f482b).f8026i;
                if (holePunchLayout2 != null) {
                    holePunchLayout2.setRightQnxHoleOpenProgress(((Float) valueAnimator.getAnimatedValue()).floatValue());
                    break;
                }
                break;
        }
    }

    public /* synthetic */ C0174W(C0639g c0639g, View view) {
        this.f481a = 0;
        this.f482b = c0639g;
    }
}
