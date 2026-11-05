package p022K;

import android.view.WindowInsets;
import p006C.AbstractC0056d;
import p006C.C0058f;

/* renamed from: K.l0 */
/* loaded from: classes.dex */
public class C0201l0 extends AbstractC0205n0 {

    /* renamed from: c */
    public final WindowInsets.Builder f542c;

    public C0201l0() {
        this.f542c = AbstractC0056d.m118g();
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: b */
    public C0221v0 mo614b() {
        WindowInsets build;
        m647a();
        build = this.f542c.build();
        C0221v0 m680g = C0221v0.m680g(null, build);
        m680g.f573a.mo658o(this.f549b);
        return m680g;
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: d */
    public void mo630d(C0058f c0058f) {
        this.f542c.setMandatorySystemGestureInsets(c0058f.m142d());
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: e */
    public void mo615e(C0058f c0058f) {
        this.f542c.setStableInsets(c0058f.m142d());
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: f */
    public void mo631f(C0058f c0058f) {
        this.f542c.setSystemGestureInsets(c0058f.m142d());
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: g */
    public void mo616g(C0058f c0058f) {
        this.f542c.setSystemWindowInsets(c0058f.m142d());
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: h */
    public void mo632h(C0058f c0058f) {
        this.f542c.setTappableElementInsets(c0058f.m142d());
    }

    public C0201l0(C0221v0 c0221v0) {
        super(c0221v0);
        WindowInsets.Builder m118g;
        WindowInsets m685f = c0221v0.m685f();
        if (m685f != null) {
            m118g = AbstractC0056d.m119h(m685f);
        } else {
            m118g = AbstractC0056d.m118g();
        }
        this.f542c = m118g;
    }
}
