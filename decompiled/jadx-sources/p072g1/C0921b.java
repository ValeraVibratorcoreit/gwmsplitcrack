package p072g1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p084l1.C1158a;

/* renamed from: g1.b */
/* loaded from: classes.dex */
public final class C0921b extends AbstractC0764y {

    /* renamed from: c */
    public static final C0919a f4512c = new C0919a();

    /* renamed from: a */
    public final Class f4513a;

    /* renamed from: b */
    public final C0931l f4514b;

    public C0921b(C0752m c0752m, AbstractC0764y abstractC0764y, Class cls) {
        this.f4514b = new C0931l(c0752m, abstractC0764y, cls);
        this.f4513a = cls;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        c1158a.m2797d();
        while (c1158a.m2805p()) {
            arrayList.add(((AbstractC0764y) this.f4514b.f4536b).mo2196a(c1158a));
        }
        c1158a.m2801l();
        int size = arrayList.size();
        Class cls = this.f4513a;
        if (!cls.isPrimitive()) {
            return arrayList.toArray((Object[]) Array.newInstance((Class<?>) cls, size));
        }
        Object newInstance = Array.newInstance((Class<?>) cls, size);
        for (int i = 0; i < size; i++) {
            Array.set(newInstance, i, arrayList.get(i));
        }
        return newInstance;
    }
}
