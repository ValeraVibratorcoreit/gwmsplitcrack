package androidx.lifecycle;

import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.j */
/* loaded from: classes.dex */
public final class C0545j {
    /* renamed from: a */
    public static EnumC0547l m1374a(EnumC0548m enumC0548m) {
        AbstractC1461d.m3494e("state", enumC0548m);
        int ordinal = enumC0548m.ordinal();
        if (ordinal == 1) {
            return EnumC0547l.ON_CREATE;
        }
        if (ordinal == 2) {
            return EnumC0547l.ON_START;
        }
        if (ordinal != 3) {
            return null;
        }
        return EnumC0547l.ON_RESUME;
    }
}
