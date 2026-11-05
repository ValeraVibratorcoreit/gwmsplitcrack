package p038T;

import android.util.SparseArray;

/* renamed from: T.s */
/* loaded from: classes.dex */
public final class C0325s {

    /* renamed from: a */
    public final SparseArray f921a;

    /* renamed from: b */
    public C0329w f922b;

    public C0325s(int i) {
        this.f921a = new SparseArray(i);
    }

    /* renamed from: a */
    public final void m907a(C0329w c0329w, int i, int i2) {
        int m926a = c0329w.m926a(i);
        SparseArray sparseArray = this.f921a;
        C0325s c0325s = sparseArray == null ? null : (C0325s) sparseArray.get(m926a);
        if (c0325s == null) {
            c0325s = new C0325s(1);
            sparseArray.put(c0329w.m926a(i), c0325s);
        }
        if (i2 > i) {
            c0325s.m907a(c0329w, i + 1, i2);
        } else {
            c0325s.f922b = c0329w;
        }
    }
}
