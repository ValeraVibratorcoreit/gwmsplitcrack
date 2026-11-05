package com.airbnb.lottie;

import android.content.Context;
import java.util.concurrent.Callable;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.g */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0600g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f2210a;

    /* renamed from: b */
    public final /* synthetic */ Context f2211b;

    /* renamed from: c */
    public final /* synthetic */ ZipInputStream f2212c;

    /* renamed from: d */
    public final /* synthetic */ String f2213d;

    public /* synthetic */ CallableC0600g(Context context, ZipInputStream zipInputStream, String str, int i) {
        this.f2210a = i;
        this.f2211b = context;
        this.f2212c = zipInputStream;
        this.f2213d = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult fromZipStreamSync;
        LottieResult fromZipStreamSync2;
        switch (this.f2210a) {
            case 0:
                fromZipStreamSync = LottieCompositionFactory.fromZipStreamSync(this.f2211b, this.f2212c, this.f2213d);
                return fromZipStreamSync;
            default:
                fromZipStreamSync2 = LottieCompositionFactory.fromZipStreamSync(this.f2211b, this.f2212c, this.f2213d);
                return fromZipStreamSync2;
        }
    }
}
