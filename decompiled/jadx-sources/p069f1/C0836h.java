package p069f1;

import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p075i1.AbstractC0951c;
import p081k1.C1048a;
import p121y0.AbstractC1687o;

/* renamed from: f1.h */
/* loaded from: classes.dex */
public final class C0836h implements InterfaceC0765z, Cloneable {

    /* renamed from: c */
    public static final C0836h f4227c = new C0836h();

    /* renamed from: a */
    public final List f4228a = Collections.emptyList();

    /* renamed from: b */
    public final List f4229b = Collections.emptyList();

    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        Class cls = c1048a.f4990a;
        boolean m2362b = m2362b(cls, true);
        boolean m2362b2 = m2362b(cls, false);
        if (m2362b || m2362b2) {
            return new C0835g(this, m2362b2, m2362b, c0752m, c1048a);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m2362b(Class cls, boolean z2) {
        if (!z2 && !Enum.class.isAssignableFrom(cls)) {
            AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
            if (!Modifier.isStatic(cls.getModifiers()) && (cls.isAnonymousClass() || cls.isLocalClass())) {
                return true;
            }
        }
        Iterator it = (z2 ? this.f4228a : this.f4229b).iterator();
        if (!it.hasNext()) {
            return false;
        }
        it.next().getClass();
        throw new ClassCastException();
    }

    public final Object clone() {
        try {
            return (C0836h) super.clone();
        } catch (CloneNotSupportedException e2) {
            throw new AssertionError(e2);
        }
    }
}
