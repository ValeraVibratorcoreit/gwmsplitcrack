package p022K;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;
import p006C.C0058f;

/* renamed from: K.s0 */
/* loaded from: classes.dex */
public final class C0215s0 extends C0213r0 {

    /* renamed from: q */
    public static final C0221v0 f566q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f566q = C0221v0.m680g(null, windowInsets);
    }

    public C0215s0(C0221v0 c0221v0, WindowInsets windowInsets) {
        super(c0221v0, windowInsets);
    }

    @Override // p022K.AbstractC0207o0, p022K.C0217t0
    /* renamed from: d */
    public final void mo653d(View view) {
    }

    @Override // p022K.AbstractC0207o0, p022K.C0217t0
    /* renamed from: f */
    public C0058f mo654f(int i) {
        Insets insets;
        insets = this.f555c.getInsets(AbstractC0219u0.m678a(i));
        return C0058f.m141c(insets);
    }
}
