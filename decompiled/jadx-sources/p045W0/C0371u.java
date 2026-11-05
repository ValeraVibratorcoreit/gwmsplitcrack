package p045W0;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* renamed from: W0.u */
/* loaded from: classes.dex */
public final class C0371u {

    /* renamed from: a */
    public float f1103a;

    /* renamed from: b */
    public float f1104b;

    /* renamed from: c */
    public float f1105c;

    /* renamed from: d */
    public float f1106d;

    /* renamed from: e */
    public float f1107e;

    /* renamed from: f */
    public final ArrayList f1108f = new ArrayList();

    /* renamed from: g */
    public final ArrayList f1109g = new ArrayList();

    public C0371u() {
        m977d(0.0f, 270.0f, 0.0f);
    }

    /* renamed from: a */
    public final void m974a(float f2) {
        float f3 = this.f1106d;
        if (f3 == f2) {
            return;
        }
        float f4 = ((f2 - f3) + 360.0f) % 360.0f;
        if (f4 > 180.0f) {
            return;
        }
        float f5 = this.f1104b;
        float f6 = this.f1105c;
        C0367q c0367q = new C0367q(f5, f6, f5, f6);
        c0367q.f1096f = this.f1106d;
        c0367q.f1097g = f4;
        this.f1109g.add(new C0365o(c0367q));
        this.f1106d = f2;
    }

    /* renamed from: b */
    public final void m975b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f1108f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC0369s) arrayList.get(i)).mo973a(matrix, path);
        }
    }

    /* renamed from: c */
    public final void m976c(float f2, float f3) {
        C0368r c0368r = new C0368r();
        c0368r.f1098b = f2;
        c0368r.f1099c = f3;
        this.f1108f.add(c0368r);
        C0366p c0366p = new C0366p(c0368r, this.f1104b, this.f1105c);
        float m972b = c0366p.m972b() + 270.0f;
        float m972b2 = c0366p.m972b() + 270.0f;
        m974a(m972b);
        this.f1109g.add(c0366p);
        this.f1106d = m972b2;
        this.f1104b = f2;
        this.f1105c = f3;
    }

    /* renamed from: d */
    public final void m977d(float f2, float f3, float f4) {
        this.f1103a = f2;
        this.f1104b = 0.0f;
        this.f1105c = f2;
        this.f1106d = f3;
        this.f1107e = (f3 + f4) % 360.0f;
        this.f1108f.clear();
        this.f1109g.clear();
    }
}
