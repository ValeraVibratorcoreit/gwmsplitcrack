package p070g;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import p071g0.C0891d;
import p071g0.InterfaceC0890c;
import p107t1.AbstractC1461d;

/* renamed from: g.g */
/* loaded from: classes.dex */
public final class C0868g implements InterfaceC0890c {

    /* renamed from: a */
    public final /* synthetic */ int f4360a = 0;

    /* renamed from: b */
    public final Object f4361b;

    public C0868g(C0891d c0891d) {
        AbstractC1461d.m3494e("registry", c0891d);
        this.f4361b = new LinkedHashSet();
        c0891d.m2465e("androidx.savedstate.Restarter", this);
    }

    @Override // p071g0.InterfaceC0890c
    /* renamed from: a */
    public final Bundle mo1140a() {
        switch (this.f4360a) {
            case 0:
                Bundle bundle = new Bundle();
                ((AbstractActivityC0870i) this.f4361b).m2404k().getClass();
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                bundle2.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f4361b));
                return bundle2;
        }
    }

    public C0868g(AbstractActivityC0870i abstractActivityC0870i) {
        this.f4361b = abstractActivityC0870i;
    }
}
