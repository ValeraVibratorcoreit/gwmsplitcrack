package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: com.airbnb.lottie.q */
/* loaded from: classes.dex */
public final /* synthetic */ class C0622q implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a */
    public final /* synthetic */ int f2243a;

    /* renamed from: b */
    public final /* synthetic */ LottieDrawable f2244b;

    /* renamed from: c */
    public final /* synthetic */ float f2245c;

    public /* synthetic */ C0622q(LottieDrawable lottieDrawable, float f2, int i) {
        this.f2243a = i;
        this.f2244b = lottieDrawable;
        this.f2245c = f2;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f2243a) {
            case 0:
                this.f2244b.lambda$setMaxProgress$8(this.f2245c, lottieComposition);
                break;
            case 1:
                this.f2244b.lambda$setMinProgress$6(this.f2245c, lottieComposition);
                break;
            default:
                this.f2244b.lambda$setProgress$16(this.f2245c, lottieComposition);
                break;
        }
    }
}
