package p071g0;

import android.os.Bundle;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import java.util.Map;
import p052a.C0465e;
import p088n.C1173d;
import p088n.C1175f;
import p107t1.AbstractC1461d;

/* renamed from: g0.e */
/* loaded from: classes.dex */
public final class C0892e {

    /* renamed from: a */
    public final InterfaceC0893f f4474a;

    /* renamed from: b */
    public final C0891d f4475b = new C0891d();

    /* renamed from: c */
    public boolean f4476c;

    public C0892e(InterfaceC0893f interfaceC0893f) {
        this.f4474a = interfaceC0893f;
    }

    /* renamed from: a */
    public final void m2467a() {
        InterfaceC0893f interfaceC0893f = this.f4474a;
        C0555t mo1068d = interfaceC0893f.mo1068d();
        if (mo1068d.f2001c != EnumC0548m.f1991b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        mo1068d.m1377a(new C0888a(0, interfaceC0893f));
        C0891d c0891d = this.f4475b;
        c0891d.getClass();
        if (c0891d.f4468a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        mo1068d.m1377a(new C0465e(2, c0891d));
        c0891d.f4468a = true;
        this.f4476c = true;
    }

    /* renamed from: b */
    public final void m2468b(Bundle bundle) {
        if (!this.f4476c) {
            m2467a();
        }
        C0555t mo1068d = this.f4474a.mo1068d();
        if (mo1068d.f2001c.compareTo(EnumC0548m.f1993d) >= 0) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + mo1068d.f2001c).toString());
        }
        C0891d c0891d = this.f4475b;
        if (!c0891d.f4468a) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).");
        }
        if (c0891d.f4469b) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        c0891d.f4472e = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        c0891d.f4469b = true;
    }

    /* renamed from: c */
    public final void m2469c(Bundle bundle) {
        AbstractC1461d.m3494e("outBundle", bundle);
        C0891d c0891d = this.f4475b;
        c0891d.getClass();
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) c0891d.f4472e;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C1175f c1175f = (C1175f) c0891d.f4471d;
        c1175f.getClass();
        C1173d c1173d = new C1173d(c1175f);
        c1175f.f5360c.put(c1173d, Boolean.FALSE);
        while (c1173d.hasNext()) {
            Map.Entry entry = (Map.Entry) c1173d.next();
            bundle2.putBundle((String) entry.getKey(), ((InterfaceC0890c) entry.getValue()).mo1140a());
        }
        if (bundle2.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }
}
