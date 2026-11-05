package androidx.lifecycle;

import android.view.View;
import com.altaysoft.t500_split.R;
import java.util.Iterator;
import java.util.Map;
import p022K.C0198k;
import p045W0.C0355e;
import p053a0.AbstractC0488b;
import p053a0.C0487a;
import p056b0.C0564a;
import p071g0.C0888a;
import p071g0.C0891d;
import p071g0.InterfaceC0890c;
import p071g0.InterfaceC0893f;
import p088n.C1171b;
import p088n.C1175f;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1464g;

/* renamed from: androidx.lifecycle.K */
/* loaded from: classes.dex */
public abstract class AbstractC0528K implements InterfaceC0533P {

    /* renamed from: a */
    public static final C0355e f1967a = new C0355e(18);

    /* renamed from: b */
    public static final C0355e f1968b = new C0355e(19);

    /* renamed from: c */
    public static final C0355e f1969c = new C0355e(17);

    /* renamed from: d */
    public static final C0355e f1970d = new C0355e(20);

    /* renamed from: c */
    public static final void m1365c(AbstractC0532O abstractC0532O, C0891d c0891d, C0555t c0555t) {
        AutoCloseable autoCloseable;
        AbstractC1461d.m3494e("registry", c0891d);
        AbstractC1461d.m3494e("lifecycle", c0555t);
        C0564a c0564a = abstractC0532O.f1976a;
        if (c0564a != null) {
            synchronized (c0564a.f2166a) {
                autoCloseable = (AutoCloseable) c0564a.f2167b.get("androidx.lifecycle.savedstate.vm.tag");
            }
        } else {
            autoCloseable = null;
        }
    }

    /* renamed from: d */
    public static final void m1366d(InterfaceC0893f interfaceC0893f) {
        InterfaceC0890c interfaceC0890c;
        EnumC0548m enumC0548m = interfaceC0893f.mo1068d().f2001c;
        if (enumC0548m != EnumC0548m.f1991b && enumC0548m != EnumC0548m.f1992c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it = ((C1175f) interfaceC0893f.mo1066b().f4471d).iterator();
        while (true) {
            C1171b c1171b = (C1171b) it;
            if (!c1171b.hasNext()) {
                interfaceC0890c = null;
                break;
            }
            Map.Entry entry = (Map.Entry) c1171b.next();
            AbstractC1461d.m3493d("components", entry);
            String str = (String) entry.getKey();
            interfaceC0890c = (InterfaceC0890c) entry.getValue();
            if (AbstractC1461d.m3490a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                break;
            }
        }
        if (interfaceC0890c == null) {
            C0529L c0529l = new C0529L(interfaceC0893f.mo1066b(), (InterfaceC0535S) interfaceC0893f);
            interfaceC0893f.mo1066b().m2465e("androidx.lifecycle.internal.SavedStateHandlesProvider", c0529l);
            interfaceC0893f.mo1068d().m1377a(new C0888a(4, c0529l));
        }
    }

    /* renamed from: e */
    public static final C0530M m1367e(InterfaceC0535S interfaceC0535S) {
        C0527J c0527j = new C0527J();
        C0534Q mo1067c = interfaceC0535S.mo1067c();
        AbstractC0488b mo1065a = interfaceC0535S instanceof InterfaceC0543h ? ((InterfaceC0543h) interfaceC0535S).mo1065a() : C0487a.f1543b;
        AbstractC1461d.m3494e("store", mo1067c);
        AbstractC1461d.m3494e("defaultCreationExtras", mo1065a);
        return (C0530M) new C0198k(mo1067c, c0527j, mo1065a).m604n(AbstractC1464g.m3498a(C0530M.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    /* renamed from: f */
    public static final void m1368f(View view, InterfaceC0553r interfaceC0553r) {
        AbstractC1461d.m3494e("<this>", view);
        view.setTag(R.id.view_tree_lifecycle_owner, interfaceC0553r);
    }
}
