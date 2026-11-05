package com.airbnb.lottie;

import com.airbnb.lottie.utils.Utils;
import java.util.zip.ZipInputStream;

/* renamed from: com.airbnb.lottie.h */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0601h implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f2214a;

    /* renamed from: b */
    public final /* synthetic */ ZipInputStream f2215b;

    public /* synthetic */ RunnableC0601h(ZipInputStream zipInputStream, int i) {
        this.f2214a = i;
        this.f2215b = zipInputStream;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2214a) {
            case 0:
                Utils.closeQuietly(this.f2215b);
                break;
            default:
                Utils.closeQuietly(this.f2215b);
                break;
        }
    }
}
