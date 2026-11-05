package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: com.airbnb.lottie.m */
/* loaded from: classes.dex */
public final /* synthetic */ class C0606m implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a */
    public final /* synthetic */ int f2229a;

    /* renamed from: b */
    public final /* synthetic */ LottieDrawable f2230b;

    /* renamed from: c */
    public final /* synthetic */ int f2231c;

    public /* synthetic */ C0606m(LottieDrawable lottieDrawable, int i, int i2) {
        this.f2229a = i2;
        this.f2230b = lottieDrawable;
        this.f2231c = i;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f2229a) {
            case 0:
                this.f2230b.lambda$setFrame$15(this.f2231c, lottieComposition);
                break;
            case 1:
                this.f2230b.lambda$setMaxFrame$7(this.f2231c, lottieComposition);
                break;
            default:
                this.f2230b.lambda$setMinFrame$5(this.f2231c, lottieComposition);
                break;
        }
    }
}
