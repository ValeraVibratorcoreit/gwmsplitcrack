package p045W0;

import p121y0.AbstractC1680h;

/* renamed from: W0.i */
/* loaded from: classes.dex */
public final class C0359i extends AbstractC1680h {
    @Override // p121y0.AbstractC1680h
    /* renamed from: o */
    public final void mo940o(C0371u c0371u, float f2, float f3) {
        c0371u.m977d(f3 * f2, 180.0f, 90.0f);
        float f4 = f3 * 2.0f * f2;
        C0367q c0367q = new C0367q(0.0f, 0.0f, f4, f4);
        c0367q.f1096f = 180.0f;
        c0367q.f1097g = 90.0f;
        c0371u.f1108f.add(c0367q);
        C0365o c0365o = new C0365o(c0367q);
        c0371u.m974a(180.0f);
        c0371u.f1109g.add(c0365o);
        c0371u.f1106d = 270.0f;
        float f5 = (0.0f + f4) * 0.5f;
        float f6 = (f4 - 0.0f) / 2.0f;
        double d = 270.0f;
        c0371u.f1104b = (((float) Math.cos(Math.toRadians(d))) * f6) + f5;
        c0371u.f1105c = (f6 * ((float) Math.sin(Math.toRadians(d)))) + f5;
    }
}
