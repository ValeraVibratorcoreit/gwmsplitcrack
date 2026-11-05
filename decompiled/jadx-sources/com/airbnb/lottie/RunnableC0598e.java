package com.airbnb.lottie;

import com.airbnb.lottie.parser.moshi.JsonReader;
import com.airbnb.lottie.utils.Utils;
import java.io.InputStream;
import p010D1.InterfaceC0090n;

/* renamed from: com.airbnb.lottie.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0598e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2204a;

    /* renamed from: b */
    public final /* synthetic */ Object f2205b;

    public /* synthetic */ RunnableC0598e(int i, Object obj) {
        this.f2204a = i;
        this.f2205b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2204a) {
            case 0:
                Utils.closeQuietly((JsonReader) this.f2205b);
                break;
            case 1:
                Utils.closeQuietly((InterfaceC0090n) this.f2205b);
                break;
            case 2:
                Utils.closeQuietly((InputStream) this.f2205b);
                break;
            default:
                ((LottieTask) this.f2205b).notifyListenersInternal();
                break;
        }
    }
}
