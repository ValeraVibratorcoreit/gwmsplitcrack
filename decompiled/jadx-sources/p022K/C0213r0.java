package p022K;

import android.graphics.Insets;
import android.view.WindowInsets;
import p006C.C0058f;

/* renamed from: K.r0 */
/* loaded from: classes.dex */
public class C0213r0 extends C0211q0 {

    /* renamed from: n */
    public C0058f f563n;

    /* renamed from: o */
    public C0058f f564o;

    /* renamed from: p */
    public C0058f f565p;

    public C0213r0(C0221v0 c0221v0, WindowInsets windowInsets) {
        super(c0221v0, windowInsets);
        this.f563n = null;
        this.f564o = null;
        this.f565p = null;
    }

    @Override // p022K.C0217t0
    /* renamed from: g */
    public C0058f mo670g() {
        Insets mandatorySystemGestureInsets;
        if (this.f564o == null) {
            mandatorySystemGestureInsets = this.f555c.getMandatorySystemGestureInsets();
            this.f564o = C0058f.m141c(mandatorySystemGestureInsets);
        }
        return this.f564o;
    }

    @Override // p022K.C0217t0
    /* renamed from: i */
    public C0058f mo671i() {
        Insets systemGestureInsets;
        if (this.f563n == null) {
            systemGestureInsets = this.f555c.getSystemGestureInsets();
            this.f563n = C0058f.m141c(systemGestureInsets);
        }
        return this.f563n;
    }

    @Override // p022K.C0217t0
    /* renamed from: k */
    public C0058f mo672k() {
        Insets tappableElementInsets;
        if (this.f565p == null) {
            tappableElementInsets = this.f555c.getTappableElementInsets();
            this.f565p = C0058f.m141c(tappableElementInsets);
        }
        return this.f565p;
    }

    @Override // p022K.AbstractC0207o0, p022K.C0217t0
    /* renamed from: l */
    public C0221v0 mo656l(int i, int i2, int i3, int i4) {
        WindowInsets inset;
        inset = this.f555c.inset(i, i2, i3, i4);
        return C0221v0.m680g(null, inset);
    }

    @Override // p022K.AbstractC0209p0, p022K.C0217t0
    /* renamed from: q */
    public void mo667q(C0058f c0058f) {
    }
}
