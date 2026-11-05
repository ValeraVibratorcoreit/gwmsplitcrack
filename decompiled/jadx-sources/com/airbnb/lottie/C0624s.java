package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: com.airbnb.lottie.s */
/* loaded from: classes.dex */
public final /* synthetic */ class C0624s implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a */
    public final /* synthetic */ int f2248a;

    /* renamed from: b */
    public final /* synthetic */ LottieDrawable f2249b;

    public /* synthetic */ C0624s(LottieDrawable lottieDrawable, int i) {
        this.f2248a = i;
        this.f2249b = lottieDrawable;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f2248a) {
            case 0:
                this.f2249b.lambda$resumeAnimation$4(lottieComposition);
                break;
            default:
                this.f2249b.lambda$playAnimation$3(lottieComposition);
                break;
        }
    }
}
