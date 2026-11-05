package p022K;

import android.view.DisplayCutout;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: K.q0 */
/* loaded from: classes.dex */
public class C0211q0 extends AbstractC0209p0 {
    public C0211q0(C0221v0 c0221v0, WindowInsets windowInsets) {
        super(c0221v0, windowInsets);
    }

    @Override // p022K.C0217t0
    /* renamed from: a */
    public C0221v0 mo668a() {
        return C0221v0.m680g(null, this.f555c.consumeDisplayCutout());
    }

    @Override // p022K.C0217t0
    /* renamed from: e */
    public C0194i mo669e() {
        DisplayCutout displayCutout = this.f555c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new C0194i(displayCutout);
    }

    @Override // p022K.C0217t0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0211q0)) {
            return false;
        }
        C0211q0 c0211q0 = (C0211q0) obj;
        return Objects.equals(this.f555c, c0211q0.f555c) && Objects.equals(this.f559g, c0211q0.f559g);
    }

    @Override // p022K.C0217t0
    public int hashCode() {
        return this.f555c.hashCode();
    }
}
