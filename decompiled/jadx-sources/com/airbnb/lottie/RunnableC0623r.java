package com.airbnb.lottie;

/* renamed from: com.airbnb.lottie.r */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0623r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2246a;

    /* renamed from: b */
    public final /* synthetic */ LottieDrawable f2247b;

    public /* synthetic */ RunnableC0623r(LottieDrawable lottieDrawable, int i) {
        this.f2246a = i;
        this.f2247b = lottieDrawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2246a) {
            case 0:
                this.f2247b.lambda$new$1();
                break;
            default:
                this.f2247b.lambda$new$2();
                break;
        }
    }
}
