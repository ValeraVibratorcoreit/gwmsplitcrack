package androidx.lifecycle;

import android.os.Bundle;
import java.util.Iterator;
import java.util.Map;
import p052a.C0471k;
import p071g0.C0891d;
import p071g0.InterfaceC0890c;
import p087m1.C1168c;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.L */
/* loaded from: classes.dex */
public final class C0529L implements InterfaceC0890c {

    /* renamed from: a */
    public final C0891d f1971a;

    /* renamed from: b */
    public boolean f1972b;

    /* renamed from: c */
    public Bundle f1973c;

    /* renamed from: d */
    public final C1168c f1974d;

    public C0529L(C0891d c0891d, InterfaceC0535S interfaceC0535S) {
        AbstractC1461d.m3494e("savedStateRegistry", c0891d);
        this.f1971a = c0891d;
        this.f1974d = new C1168c(new C0471k(interfaceC0535S, 3));
    }

    @Override // p071g0.InterfaceC0890c
    /* renamed from: a */
    public final Bundle mo1140a() {
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1973c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        Iterator it = ((C0530M) this.f1974d.m2824a()).f1975b.entrySet().iterator();
        if (!it.hasNext()) {
            this.f1972b = false;
            return bundle;
        }
        Map.Entry entry = (Map.Entry) it.next();
        ((AbstractC0525H) entry.getValue()).getClass();
        throw null;
    }
}
