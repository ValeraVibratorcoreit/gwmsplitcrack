package p039T0;

import android.graphics.Typeface;
import com.altaysoft.t500_split.media.C0639g;
import p034Q0.C0285b;
import p121y0.AbstractC1680h;

/* renamed from: T0.a */
/* loaded from: classes.dex */
public final class C0332a extends AbstractC1680h {

    /* renamed from: k */
    public final Typeface f942k;

    /* renamed from: l */
    public final C0639g f943l;

    /* renamed from: m */
    public boolean f944m;

    public C0332a(C0639g c0639g, Typeface typeface) {
        this.f942k = typeface;
        this.f943l = c0639g;
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: G */
    public final void mo737G(int i) {
        if (this.f944m) {
            return;
        }
        C0285b c0285b = (C0285b) this.f943l.f3011g;
        if (c0285b.m832j(this.f942k)) {
            c0285b.m830h(false);
        }
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: H */
    public final void mo738H(Typeface typeface, boolean z2) {
        if (this.f944m) {
            return;
        }
        C0285b c0285b = (C0285b) this.f943l.f3011g;
        if (c0285b.m832j(typeface)) {
            c0285b.m830h(false);
        }
    }
}
