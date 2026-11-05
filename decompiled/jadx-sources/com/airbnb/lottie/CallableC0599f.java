package com.airbnb.lottie;

import android.content.Context;
import java.io.InputStream;
import java.util.concurrent.Callable;

/* renamed from: com.airbnb.lottie.f */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0599f implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f2206a;

    /* renamed from: b */
    public final /* synthetic */ Context f2207b;

    /* renamed from: c */
    public final /* synthetic */ String f2208c;

    /* renamed from: d */
    public final /* synthetic */ Object f2209d;

    public /* synthetic */ CallableC0599f(Context context, InputStream inputStream, String str) {
        this.f2206a = 2;
        this.f2207b = context;
        this.f2209d = inputStream;
        this.f2208c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromAssetSync;
        LottieResult lambda$fromUrl$0;
        LottieResult fromInputStreamSync;
        switch (this.f2206a) {
            case 0:
                fromAssetSync = LottieCompositionFactory.fromAssetSync(this.f2207b, this.f2208c, (String) this.f2209d);
                return fromAssetSync;
            case 1:
                lambda$fromUrl$0 = LottieCompositionFactory.lambda$fromUrl$0(this.f2207b, this.f2208c, (String) this.f2209d);
                return lambda$fromUrl$0;
            default:
                fromInputStreamSync = LottieCompositionFactory.fromInputStreamSync(this.f2207b, (InputStream) this.f2209d, this.f2208c);
                return fromInputStreamSync;
        }
    }

    public /* synthetic */ CallableC0599f(Context context, String str, int i, String str2) {
        this.f2206a = i;
        this.f2207b = context;
        this.f2208c = str;
        this.f2209d = str2;
    }
}
