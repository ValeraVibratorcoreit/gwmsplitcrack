package p073h0;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import com.altaysoft.t500_split.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import p046X.C0421t;
import p121y0.AbstractC1680h;

/* renamed from: h0.a */
/* loaded from: classes.dex */
public final class C0946a {

    /* renamed from: d */
    public static volatile C0946a f4556d;

    /* renamed from: e */
    public static final Object f4557e = new Object();

    /* renamed from: c */
    public final Context f4560c;

    /* renamed from: b */
    public final HashSet f4559b = new HashSet();

    /* renamed from: a */
    public final HashMap f4558a = new HashMap();

    public C0946a(Context context) {
        this.f4560c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C0946a m2480c(Context context) {
        if (f4556d == null) {
            synchronized (f4557e) {
                try {
                    if (f4556d == null) {
                        f4556d = new C0946a(context);
                    }
                } finally {
                }
            }
        }
        return f4556d;
    }

    /* renamed from: a */
    public final void m2481a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f4560c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f4559b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0947b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    m2482b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e2) {
                throw new C0421t(e2);
            }
        }
    }

    /* renamed from: b */
    public final Object m2482b(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC1680h.m4880v()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (hashSet.contains(cls)) {
            throw new IllegalStateException("Cannot initialize " + cls.getName() + ". Cycle detected.");
        }
        HashMap hashMap = this.f4558a;
        if (hashMap.containsKey(cls)) {
            obj = hashMap.get(cls);
        } else {
            hashSet.add(cls);
            try {
                InterfaceC0947b interfaceC0947b = (InterfaceC0947b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> mo1355a = interfaceC0947b.mo1355a();
                if (!mo1355a.isEmpty()) {
                    for (Class cls2 : mo1355a) {
                        if (!hashMap.containsKey(cls2)) {
                            m2482b(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0947b.mo1356b(this.f4560c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } catch (Throwable th2) {
                throw new C0421t(th2);
            }
        }
        Trace.endSection();
        return obj;
    }
}
