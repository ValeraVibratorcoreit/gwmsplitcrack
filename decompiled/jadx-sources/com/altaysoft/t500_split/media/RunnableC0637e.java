package com.altaysoft.t500_split.media;

import android.content.Context;
import p109u0.AbstractC1569q1;

/* renamed from: com.altaysoft.t500_split.media.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0637e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3004a;

    /* renamed from: b */
    public final /* synthetic */ Context f3005b;

    /* renamed from: c */
    public final /* synthetic */ String f3006c;

    public /* synthetic */ RunnableC0637e(Context context, int i, String str) {
        this.f3004a = i;
        this.f3005b = context;
        this.f3006c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3004a) {
            case 0:
                AbstractC0638f.m1868q(this.f3005b, this.f3006c);
                break;
            default:
                AbstractC1569q1.m4464p(this.f3005b, this.f3006c);
                break;
        }
    }
}
