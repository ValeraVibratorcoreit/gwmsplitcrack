package p058c;

import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p046X.C0383K;
import p052a.C0470j;
import p121y0.AbstractC1680h;

/* renamed from: c.g */
/* loaded from: classes.dex */
public final class C0573g extends AbstractC1680h {

    /* renamed from: k */
    public final /* synthetic */ C0470j f2182k;

    /* renamed from: l */
    public final /* synthetic */ String f2183l;

    /* renamed from: m */
    public final /* synthetic */ C0383K f2184m;

    public C0573g(C0470j c0470j, String str, C0383K c0383k) {
        this.f2182k = c0470j;
        this.f2183l = str;
        this.f2184m = c0383k;
    }

    /* renamed from: Z */
    public final void m1576Z(Object obj) {
        C0470j c0470j = this.f2182k;
        LinkedHashMap linkedHashMap = c0470j.f1491b;
        String str = this.f2183l;
        Object obj2 = linkedHashMap.get(str);
        C0383K c0383k = this.f2184m;
        if (obj2 == null) {
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + c0383k + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        int intValue = ((Number) obj2).intValue();
        ArrayList arrayList = c0470j.f1493d;
        arrayList.add(str);
        try {
            c0470j.m1180b(intValue, c0383k, (Intent) obj);
        } catch (Exception e2) {
            arrayList.remove(str);
            throw e2;
        }
    }
}
