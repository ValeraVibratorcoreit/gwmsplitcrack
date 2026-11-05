package p022K;

import android.view.WindowInsets;
import p006C.C0058f;

/* renamed from: K.p0 */
/* loaded from: classes.dex */
public abstract class AbstractC0209p0 extends AbstractC0207o0 {

    /* renamed from: m */
    public C0058f f562m;

    public AbstractC0209p0(C0221v0 c0221v0, WindowInsets windowInsets) {
        super(c0221v0, windowInsets);
        this.f562m = null;
    }

    @Override // p022K.C0217t0
    /* renamed from: b */
    public C0221v0 mo663b() {
        return C0221v0.m680g(null, this.f555c.consumeStableInsets());
    }

    @Override // p022K.C0217t0
    /* renamed from: c */
    public C0221v0 mo664c() {
        return C0221v0.m680g(null, this.f555c.consumeSystemWindowInsets());
    }

    @Override // p022K.C0217t0
    /* renamed from: h */
    public final C0058f mo665h() {
        if (this.f562m == null) {
            WindowInsets windowInsets = this.f555c;
            this.f562m = C0058f.m140b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f562m;
    }

    @Override // p022K.C0217t0
    /* renamed from: m */
    public boolean mo666m() {
        return this.f555c.isConsumed();
    }

    @Override // p022K.C0217t0
    /* renamed from: q */
    public void mo667q(C0058f c0058f) {
        this.f562m = c0058f;
    }
}
