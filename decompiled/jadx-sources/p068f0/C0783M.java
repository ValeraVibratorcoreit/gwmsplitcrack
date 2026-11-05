package p068f0;

import android.util.SparseArray;

/* renamed from: f0.M */
/* loaded from: classes.dex */
public final class C0783M {

    /* renamed from: a */
    public SparseArray f3955a;

    /* renamed from: b */
    public int f3956b;

    /* renamed from: a */
    public final C0782L m2251a(int i) {
        SparseArray sparseArray = this.f3955a;
        C0782L c0782l = (C0782L) sparseArray.get(i);
        if (c0782l != null) {
            return c0782l;
        }
        C0782L c0782l2 = new C0782L();
        sparseArray.put(i, c0782l2);
        return c0782l2;
    }
}
