package p071g0;

import android.os.Bundle;
import android.view.View;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.AbstractC0532O;
import androidx.lifecycle.C0529L;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.InterfaceC0535S;
import androidx.lifecycle.InterfaceC0542g;
import androidx.lifecycle.InterfaceC0551p;
import androidx.lifecycle.InterfaceC0553r;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p006C.AbstractC0062j;
import p046X.AbstractComponentCallbacksC0423v;
import p052a.C0468h;
import p070g.AbstractActivityC0870i;
import p092o0.C1205c;
import p107t1.AbstractC1461d;
import p109u0.AbstractC1561o;

/* renamed from: g0.a */
/* loaded from: classes.dex */
public final class C0888a implements InterfaceC0551p {

    /* renamed from: a */
    public final /* synthetic */ int f4466a;

    /* renamed from: b */
    public final Object f4467b;

    public /* synthetic */ C0888a(int i, Object obj) {
        this.f4466a = i;
        this.f4467b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0551p
    /* renamed from: d */
    public final void mo1177d(InterfaceC0553r interfaceC0553r, EnumC0547l enumC0547l) {
        View view;
        switch (this.f4466a) {
            case 0:
                if (enumC0547l != EnumC0547l.ON_CREATE) {
                    throw new AssertionError("Next event must be ON_CREATE");
                }
                interfaceC0553r.mo1068d().m1382f(this);
                InterfaceC0893f interfaceC0893f = (InterfaceC0893f) this.f4467b;
                Bundle m2463c = interfaceC0893f.mo1066b().m2463c("androidx.savedstate.Restarter");
                if (m2463c == null) {
                    return;
                }
                ArrayList<String> stringArrayList = m2463c.getStringArrayList("classes_to_restore");
                if (stringArrayList == null) {
                    throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
                }
                for (String str : stringArrayList) {
                    try {
                        Class<? extends U> asSubclass = Class.forName(str, false, C0888a.class.getClassLoader()).asSubclass(InterfaceC0889b.class);
                        AbstractC1461d.m3493d("{\n                Class.…class.java)\n            }", asSubclass);
                        try {
                            Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                            declaredConstructor.setAccessible(true);
                            try {
                                Object newInstance = declaredConstructor.newInstance(null);
                                AbstractC1461d.m3493d("{\n                constr…wInstance()\n            }", newInstance);
                                if (!(interfaceC0893f instanceof InterfaceC0535S)) {
                                    throw new IllegalStateException("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner");
                                }
                                C0534Q mo1067c = ((InterfaceC0535S) interfaceC0893f).mo1067c();
                                C0891d mo1066b = interfaceC0893f.mo1066b();
                                mo1067c.getClass();
                                LinkedHashMap linkedHashMap = mo1067c.f1977a;
                                Iterator it = new HashSet(linkedHashMap.keySet()).iterator();
                                while (it.hasNext()) {
                                    String str2 = (String) it.next();
                                    AbstractC1461d.m3494e("key", str2);
                                    AbstractC0532O abstractC0532O = (AbstractC0532O) linkedHashMap.get(str2);
                                    AbstractC1461d.m3491b(abstractC0532O);
                                    AbstractC0528K.m1365c(abstractC0532O, mo1066b, interfaceC0893f.mo1068d());
                                }
                                if (!new HashSet(linkedHashMap.keySet()).isEmpty()) {
                                    mo1066b.m2466f();
                                }
                            } catch (Exception e2) {
                                throw new RuntimeException(AbstractC1561o.m4299c("Failed to instantiate ", str), e2);
                            }
                        } catch (NoSuchMethodException e3) {
                            throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
                        }
                    } catch (ClassNotFoundException e4) {
                        throw new RuntimeException(AbstractC0062j.m161o("Class ", str, " wasn't found"), e4);
                    }
                }
                return;
            case 1:
                if (enumC0547l != EnumC0547l.ON_STOP || (view = ((AbstractComponentCallbacksC0423v) this.f4467b).f1342J) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
                return;
            case 2:
                AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this.f4467b;
                if (abstractActivityC0870i.f1505j == null) {
                    C0468h c0468h = (C0468h) abstractActivityC0870i.getLastNonConfigurationInstance();
                    if (c0468h != null) {
                        abstractActivityC0870i.f1505j = c0468h.f1485a;
                    }
                    if (abstractActivityC0870i.f1505j == null) {
                        abstractActivityC0870i.f1505j = new C0534Q();
                    }
                }
                abstractActivityC0870i.f1501f.m1382f(this);
                return;
            case 3:
                new HashMap();
                InterfaceC0542g[] interfaceC0542gArr = (InterfaceC0542g[]) this.f4467b;
                if (interfaceC0542gArr.length > 0) {
                    InterfaceC0542g interfaceC0542g = interfaceC0542gArr[0];
                    throw null;
                }
                if (interfaceC0542gArr.length <= 0) {
                    return;
                }
                InterfaceC0542g interfaceC0542g2 = interfaceC0542gArr[0];
                throw null;
            case 4:
                if (enumC0547l != EnumC0547l.ON_CREATE) {
                    throw new IllegalStateException(("Next event must be ON_CREATE, it was " + enumC0547l).toString());
                }
                interfaceC0553r.mo1068d().m1382f(this);
                C0529L c0529l = (C0529L) this.f4467b;
                if (c0529l.f1972b) {
                    return;
                }
                Bundle m2463c2 = c0529l.f1971a.m2463c("androidx.lifecycle.internal.SavedStateHandlesProvider");
                Bundle bundle = new Bundle();
                Bundle bundle2 = c0529l.f1973c;
                if (bundle2 != null) {
                    bundle.putAll(bundle2);
                }
                if (m2463c2 != null) {
                    bundle.putAll(m2463c2);
                }
                c0529l.f1973c = bundle;
                c0529l.f1972b = true;
                return;
            default:
                ((C1205c) this.f4467b).m2878b(false);
                return;
        }
    }
}
