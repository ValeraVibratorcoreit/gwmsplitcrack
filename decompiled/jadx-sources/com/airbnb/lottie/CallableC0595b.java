package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import java.io.InputStream;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p010D1.InterfaceC0090n;

/* renamed from: com.airbnb.lottie.b */
/* loaded from: classes.dex */
public final /* synthetic */ class CallableC0595b implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f2199a;

    /* renamed from: b */
    public final /* synthetic */ String f2200b;

    /* renamed from: c */
    public final /* synthetic */ Object f2201c;

    public /* synthetic */ CallableC0595b(Object obj, String str, int i) {
        this.f2199a = i;
        this.f2201c = obj;
        this.f2200b = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        LottieResult lambda$fromAssets$2;
        LottieResult fromJsonSourceSync;
        LottieResult fromJsonStringSync;
        LottieResult fromJsonReaderSync;
        LottieResult fromJsonInputStreamSync;
        LottieResult fromJsonSync;
        switch (this.f2199a) {
            case 0:
                lambda$fromAssets$2 = ((LottieAnimationView) this.f2201c).lambda$fromAssets$2(this.f2200b);
                return lambda$fromAssets$2;
            case 1:
                fromJsonSourceSync = LottieCompositionFactory.fromJsonSourceSync((InterfaceC0090n) this.f2201c, this.f2200b);
                return fromJsonSourceSync;
            case 2:
                fromJsonStringSync = LottieCompositionFactory.fromJsonStringSync(this.f2200b, (String) this.f2201c);
                return fromJsonStringSync;
            case 3:
                fromJsonReaderSync = LottieCompositionFactory.fromJsonReaderSync((JsonReader) this.f2201c, this.f2200b);
                return fromJsonReaderSync;
            case 4:
                fromJsonInputStreamSync = LottieCompositionFactory.fromJsonInputStreamSync((InputStream) this.f2201c, this.f2200b);
                return fromJsonInputStreamSync;
            default:
                fromJsonSync = LottieCompositionFactory.fromJsonSync((JSONObject) this.f2201c, this.f2200b);
                return fromJsonSync;
        }
    }

    public /* synthetic */ CallableC0595b(String str, String str2) {
        this.f2199a = 2;
        this.f2200b = str;
        this.f2201c = str2;
    }
}
