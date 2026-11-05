package com.airbnb.lottie;

import com.airbnb.lottie.LottieDrawable;

/* renamed from: com.airbnb.lottie.l */
/* loaded from: classes.dex */
public final /* synthetic */ class C0605l implements LottieDrawable.LazyCompositionTask {

    /* renamed from: a */
    public final /* synthetic */ int f2226a;

    /* renamed from: b */
    public final /* synthetic */ LottieDrawable f2227b;

    /* renamed from: c */
    public final /* synthetic */ String f2228c;

    public /* synthetic */ C0605l(LottieDrawable lottieDrawable, String str, int i) {
        this.f2226a = i;
        this.f2227b = lottieDrawable;
        this.f2228c = str;
    }

    @Override // com.airbnb.lottie.LottieDrawable.LazyCompositionTask
    public final void run(LottieComposition lottieComposition) {
        switch (this.f2226a) {
            case 0:
                this.f2227b.lambda$setMinAndMaxFrame$11(this.f2228c, lottieComposition);
                break;
            case 1:
                this.f2227b.lambda$setMaxFrame$10(this.f2228c, lottieComposition);
                break;
            default:
                this.f2227b.lambda$setMinFrame$9(this.f2228c, lottieComposition);
                break;
        }
    }
}
