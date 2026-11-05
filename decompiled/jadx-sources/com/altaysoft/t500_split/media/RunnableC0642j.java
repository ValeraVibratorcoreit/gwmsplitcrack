package com.altaysoft.t500_split.media;

import android.content.Context;
import android.os.Handler;
import org.vosk.android.StorageService;
import p001A0.RunnableC0018l;
import p003B.C0043j;
import p047X0.C0429b;

/* renamed from: com.altaysoft.t500_split.media.j */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0642j implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3020a;

    /* renamed from: b */
    public final /* synthetic */ Context f3021b;

    /* renamed from: c */
    public final /* synthetic */ String f3022c;

    /* renamed from: d */
    public final /* synthetic */ String f3023d;

    /* renamed from: e */
    public final /* synthetic */ Object f3024e;

    /* renamed from: f */
    public final /* synthetic */ Object f3025f;

    /* renamed from: g */
    public final /* synthetic */ Object f3026g;

    public /* synthetic */ RunnableC0642j(Context context, String str, String str2, Object obj, Object obj2, Object obj3, int i) {
        this.f3020a = i;
        this.f3021b = context;
        this.f3022c = str;
        this.f3023d = str2;
        this.f3024e = obj;
        this.f3025f = obj2;
        this.f3026g = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f3020a) {
            case 0:
                Context context = this.f3021b;
                Boolean bool = null;
                try {
                    C0043j m1906l = AbstractC0645m.m1906l(context, this.f3022c, this.f3023d, (String) this.f3024e, (String) this.f3025f);
                    if (m1906l != null) {
                        AbstractC0645m.m1897c(context);
                        bool = Boolean.valueOf(AbstractC0645m.f3041e.contains((String) m1906l.f141g));
                    }
                } catch (Exception unused) {
                }
                AbstractC0645m.f3039c.post(new RunnableC0018l((C0429b) this.f3026g, 5, bool));
                break;
            default:
                StorageService.lambda$unpack$2(this.f3021b, this.f3022c, this.f3023d, (Handler) this.f3024e, (StorageService.Callback) this.f3025f, (StorageService.Callback) this.f3026g);
                break;
        }
    }
}
