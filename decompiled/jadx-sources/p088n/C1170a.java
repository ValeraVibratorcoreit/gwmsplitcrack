package p088n;

import java.util.HashMap;

/* renamed from: n.a */
/* loaded from: classes.dex */
public final class C1170a extends C1175f {

    /* renamed from: e */
    public final HashMap f5347e = new HashMap();

    @Override // p088n.C1175f
    /* renamed from: a */
    public final C1172c mo2825a(Object obj) {
        return (C1172c) this.f5347e.get(obj);
    }

    @Override // p088n.C1175f
    /* renamed from: b */
    public final Object mo2826b(Object obj) {
        Object mo2826b = super.mo2826b(obj);
        this.f5347e.remove(obj);
        return mo2826b;
    }
}
