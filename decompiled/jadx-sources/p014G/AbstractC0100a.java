package p014G;

import android.os.Bundle;
import android.util.SparseArray;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: G.a */
/* loaded from: classes.dex */
public abstract class AbstractC0100a {
    /* renamed from: a */
    public static <T> T m336a(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getParcelable(str, cls);
    }

    /* renamed from: b */
    public static <T> T[] m337b(Bundle bundle, String str, Class<T> cls) {
        return (T[]) bundle.getParcelableArray(str, cls);
    }

    /* renamed from: c */
    public static <T> ArrayList<T> m338c(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    /* renamed from: d */
    public static <T extends Serializable> T m339d(Bundle bundle, String str, Class<T> cls) {
        return (T) bundle.getSerializable(str, cls);
    }

    /* renamed from: e */
    public static <T> SparseArray<T> m340e(Bundle bundle, String str, Class<? extends T> cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }
}
