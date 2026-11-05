package com.altaysoft.t500_split.media;

import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.net.Uri;
import com.altaysoft.t500_split.cfgData;

/* renamed from: com.altaysoft.t500_split.media.o */
/* loaded from: classes.dex */
public final class RunnableC0647o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f3046a;

    /* renamed from: b */
    public final /* synthetic */ String f3047b;

    /* renamed from: c */
    public final /* synthetic */ int f3048c;

    /* renamed from: d */
    public final /* synthetic */ String f3049d;

    /* renamed from: e */
    public final /* synthetic */ int f3050e;

    public RunnableC0647o(Context context, String str, int i, String str2, int i2) {
        this.f3046a = context;
        this.f3047b = str;
        this.f3048c = i;
        this.f3049d = str2;
        this.f3050e = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController = null;
        AbstractC0648p.f3064n = null;
        String str = this.f3047b;
        Context context = this.f3046a;
        if (context != null && !str.isEmpty()) {
            try {
                mediaController = AbstractC0638f.m1853b(AbstractC0638f.m1855d(context), str);
            } catch (SecurityException | Exception unused) {
            }
        }
        if (AbstractC0638f.m1866o(mediaController) == this.f3048c) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(this.f3049d));
        intent.addFlags(402722816);
        intent.setPackage(str);
        try {
            context.startActivity(intent, AbstractC0648p.m1908a(cfgData.m1784i(), str, this.f3050e, true).toBundle());
        } catch (Exception unused2) {
        }
    }
}
