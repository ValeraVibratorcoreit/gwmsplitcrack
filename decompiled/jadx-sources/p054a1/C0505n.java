package p054a1;

import android.content.res.TypedArray;
import android.util.SparseArray;
import p022K.C0198k;

/* renamed from: a1.n */
/* loaded from: classes.dex */
public final class C0505n {

    /* renamed from: a */
    public final SparseArray f1587a = new SparseArray();

    /* renamed from: b */
    public final C0506o f1588b;

    /* renamed from: c */
    public final int f1589c;

    /* renamed from: d */
    public final int f1590d;

    public C0505n(C0506o c0506o, C0198k c0198k) {
        this.f1588b = c0506o;
        TypedArray typedArray = (TypedArray) c0198k.f534c;
        this.f1589c = typedArray.getResourceId(28, 0);
        this.f1590d = typedArray.getResourceId(52, 0);
    }
}
