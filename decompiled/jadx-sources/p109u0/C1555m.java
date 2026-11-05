package p109u0;

import android.animation.ValueAnimator;
import p006C.AbstractC0062j;

/* renamed from: u0.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C1555m implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f8386a;

    /* renamed from: b */
    public final /* synthetic */ float f8387b;

    /* renamed from: c */
    public final /* synthetic */ float f8388c;

    /* renamed from: d */
    public final /* synthetic */ float f8389d;

    /* renamed from: e */
    public final /* synthetic */ float f8390e;

    /* renamed from: f */
    public final /* synthetic */ float f8391f;

    /* renamed from: g */
    public final /* synthetic */ float f8392g;

    /* renamed from: h */
    public final /* synthetic */ Object f8393h;

    public /* synthetic */ C1555m(Object obj, float f2, float f3, float f4, float f5, float f6, float f7, int i) {
        this.f8386a = i;
        this.f8393h = obj;
        this.f8387b = f2;
        this.f8388c = f3;
        this.f8389d = f4;
        this.f8390e = f5;
        this.f8391f = f6;
        this.f8392g = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8386a) {
            case 0:
                C1576u c1576u = (C1576u) this.f8393h;
                c1576u.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f2 = this.f8388c;
                float f3 = this.f8387b;
                c1576u.f8812t1 = AbstractC0062j.m149c(f2, f3, floatValue, f3);
                float f4 = this.f8390e;
                float f5 = this.f8389d;
                c1576u.f8815u1 = AbstractC0062j.m149c(f4, f5, floatValue, f5);
                float f6 = this.f8392g;
                float f7 = this.f8391f;
                c1576u.f8818v1 = AbstractC0062j.m149c(f6, f7, floatValue, f7);
                c1576u.m4506F();
                break;
            case 1:
                C1568q0 c1568q0 = (C1568q0) this.f8393h;
                c1568q0.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f8 = this.f8388c;
                float f9 = this.f8387b;
                c1568q0.f8617h1 = AbstractC0062j.m149c(f8, f9, floatValue2, f9);
                float f10 = this.f8390e;
                float f11 = this.f8389d;
                c1568q0.f8620i1 = AbstractC0062j.m149c(f10, f11, floatValue2, f11);
                float f12 = this.f8392g;
                float f13 = this.f8391f;
                c1568q0.f8623j1 = AbstractC0062j.m149c(f12, f13, floatValue2, f13);
                c1568q0.m4345D();
                break;
            case 2:
                C1583x0 c1583x0 = (C1583x0) this.f8393h;
                c1583x0.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f14 = this.f8388c;
                float f15 = this.f8387b;
                c1583x0.f8916f1 = AbstractC0062j.m149c(f14, f15, floatValue3, f15);
                float f16 = this.f8390e;
                float f17 = this.f8389d;
                c1583x0.f8919g1 = AbstractC0062j.m149c(f16, f17, floatValue3, f17);
                float f18 = this.f8392g;
                float f19 = this.f8391f;
                c1583x0.f8922h1 = AbstractC0062j.m149c(f18, f19, floatValue3, f19);
                c1583x0.m4636D();
                break;
            case 3:
                C1477E0 c1477e0 = (C1477E0) this.f8393h;
                c1477e0.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f20 = this.f8388c;
                float f21 = this.f8387b;
                c1477e0.f7372f1 = AbstractC0062j.m149c(f20, f21, floatValue4, f21);
                float f22 = this.f8390e;
                float f23 = this.f8389d;
                c1477e0.f7375g1 = AbstractC0062j.m149c(f22, f23, floatValue4, f23);
                float f24 = this.f8392g;
                float f25 = this.f8391f;
                c1477e0.f7378h1 = AbstractC0062j.m149c(f24, f25, floatValue4, f25);
                c1477e0.m3617D();
                break;
            case 4:
                C1491L0 c1491l0 = (C1491L0) this.f8393h;
                c1491l0.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f26 = this.f8388c;
                float f27 = this.f8387b;
                c1491l0.f7599f1 = AbstractC0062j.m149c(f26, f27, floatValue5, f27);
                float f28 = this.f8390e;
                float f29 = this.f8389d;
                c1491l0.f7602g1 = AbstractC0062j.m149c(f28, f29, floatValue5, f29);
                float f30 = this.f8392g;
                float f31 = this.f8391f;
                c1491l0.f7605h1 = AbstractC0062j.m149c(f30, f31, floatValue5, f31);
                c1491l0.m3783D();
                break;
            default:
                C1506T0 c1506t0 = (C1506T0) this.f8393h;
                c1506t0.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f32 = this.f8388c;
                float f33 = this.f8387b;
                c1506t0.f7816Z0 = AbstractC0062j.m149c(f32, f33, floatValue6, f33);
                float f34 = this.f8390e;
                float f35 = this.f8389d;
                c1506t0.f7819a1 = AbstractC0062j.m149c(f34, f35, floatValue6, f35);
                float f36 = this.f8392g;
                float f37 = this.f8391f;
                c1506t0.f7822b1 = AbstractC0062j.m149c(f36, f37, floatValue6, f37);
                c1506t0.m3947D();
                break;
        }
    }
}
