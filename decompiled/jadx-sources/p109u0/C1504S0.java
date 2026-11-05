package p109u0;

import com.altaysoft.t500_split.p061ip.Theme51GaugeArcView;
import p006C.AbstractC0062j;

/* renamed from: u0.S0 */
/* loaded from: classes.dex */
public final class C1504S0 {

    /* renamed from: a */
    public final float f7756a;

    /* renamed from: b */
    public final float f7757b;

    /* renamed from: c */
    public float f7758c;

    /* renamed from: d */
    public float f7759d;

    public C1504S0(float f2, float f3, float f4, float f5, float f6) {
        this.f7756a = f2;
        this.f7757b = f3;
        float max = Math.max(f2, Math.min(f3, f6));
        this.f7758c = max;
        this.f7759d = max;
        m3922c(max);
    }

    /* renamed from: a */
    public final void m3920a(Theme51GaugeArcView theme51GaugeArcView) {
        if (theme51GaugeArcView == null) {
            return;
        }
        theme51GaugeArcView.setValue(this.f7758c);
    }

    /* renamed from: b */
    public final void m3921b(Theme51GaugeArcView theme51GaugeArcView) {
        float exp = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
        float f2 = this.f7758c;
        this.f7758c = AbstractC0062j.m149c(this.f7759d, f2, exp, f2);
        if (Math.abs(this.f7758c - this.f7759d) <= Math.max(0.001f, this.f7757b - this.f7756a) * 5.0E-4f) {
            this.f7758c = this.f7759d;
        }
        m3922c(this.f7758c);
        if (theme51GaugeArcView != null) {
            theme51GaugeArcView.setValue(this.f7758c);
        }
    }

    /* renamed from: c */
    public final void m3922c(float f2) {
        Math.max(this.f7756a, Math.min(this.f7757b, f2));
    }
}
