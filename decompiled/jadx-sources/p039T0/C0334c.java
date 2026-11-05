package p039T0;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import p121y0.AbstractC1680h;

/* renamed from: T0.c */
/* loaded from: classes.dex */
public final class C0334c extends AbstractC1680h {

    /* renamed from: k */
    public final /* synthetic */ Context f947k;

    /* renamed from: l */
    public final /* synthetic */ TextPaint f948l;

    /* renamed from: m */
    public final /* synthetic */ AbstractC1680h f949m;

    /* renamed from: n */
    public final /* synthetic */ C0335d f950n;

    public C0334c(C0335d c0335d, Context context, TextPaint textPaint, AbstractC1680h abstractC1680h) {
        this.f950n = c0335d;
        this.f947k = context;
        this.f948l = textPaint;
        this.f949m = abstractC1680h;
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: G */
    public final void mo737G(int i) {
        this.f949m.mo737G(i);
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: H */
    public final void mo738H(Typeface typeface, boolean z2) {
        this.f950n.m935g(this.f947k, this.f948l, typeface);
        this.f949m.mo738H(typeface, z2);
    }
}
