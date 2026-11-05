package p039T0;

import android.graphics.Typeface;
import p003B.AbstractC0035b;
import p121y0.AbstractC1680h;

/* renamed from: T0.b */
/* loaded from: classes.dex */
public final class C0333b extends AbstractC0035b {

    /* renamed from: h */
    public final /* synthetic */ AbstractC1680h f945h;

    /* renamed from: i */
    public final /* synthetic */ C0335d f946i;

    public C0333b(C0335d c0335d, AbstractC1680h abstractC1680h) {
        this.f946i = c0335d;
        this.f945h = abstractC1680h;
    }

    @Override // p003B.AbstractC0035b
    /* renamed from: g */
    public final void mo52g(int i) {
        this.f946i.f963m = true;
        this.f945h.mo737G(i);
    }

    @Override // p003B.AbstractC0035b
    /* renamed from: h */
    public final void mo53h(Typeface typeface) {
        C0335d c0335d = this.f946i;
        c0335d.f964n = Typeface.create(typeface, c0335d.f953c);
        c0335d.f963m = true;
        this.f945h.mo738H(c0335d.f964n, false);
    }
}
