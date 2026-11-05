package p098q0;

import android.widget.ImageView;
import com.altaysoft.t500_split.NativeLib;
import p006C.AbstractC0062j;

/* renamed from: q0.G0 */
/* loaded from: classes.dex */
public final class C1260G0 {

    /* renamed from: a */
    public final float f5715a;

    /* renamed from: b */
    public final float f5716b;

    /* renamed from: c */
    public final float f5717c;

    /* renamed from: d */
    public final float f5718d;

    /* renamed from: e */
    public final float f5719e;

    /* renamed from: f */
    public final float f5720f;

    /* renamed from: g */
    public float f5721g;

    /* renamed from: h */
    public float f5722h;

    /* renamed from: i */
    public float f5723i;

    /* renamed from: j */
    public float f5724j;

    /* renamed from: k */
    public boolean f5725k;

    public C1260G0(float f2, float f3, long j2, float f4, float f5, float f6, float f7) {
        this.f5715a = f2;
        this.f5716b = f3;
        this.f5717c = Math.max(1.0f, j2);
        float floatClamp = NativeLib.floatClamp(f4, f2, f3);
        this.f5721g = floatClamp;
        this.f5722h = floatClamp;
        this.f5718d = f5;
        this.f5719e = f6;
        this.f5720f = Math.min(0.02f, Math.max(0.01f, f7));
        float f8 = f3 - f2;
        f5 = f8 > 0.0f ? AbstractC0062j.m149c(f6, f5, (this.f5721g - f2) / f8, f5) : f5;
        this.f5723i = f5;
        this.f5724j = f5;
        this.f5725k = true;
    }

    /* renamed from: a */
    public final void m3034a(float f2) {
        this.f5722h = NativeLib.floatClamp(f2, this.f5715a, this.f5716b);
    }

    /* renamed from: b */
    public final boolean m3035b(float f2, float f3, ImageView imageView) {
        if (f3 < 1.0f) {
            f3 = 1.0f;
        } else if (f3 > 100.0f) {
            f3 = 100.0f;
        }
        float exp = 1.0f - ((float) Math.exp((-f3) / this.f5717c));
        float f4 = this.f5721g;
        this.f5721g = AbstractC0062j.m149c(this.f5722h, f4, exp, f4);
        float f5 = this.f5716b;
        float f6 = this.f5715a;
        if (Math.abs(this.f5721g - this.f5722h) <= Math.max(0.001f, f5 - f6) * 5.0E-4f) {
            this.f5721g = this.f5722h;
        }
        float floatClamp = NativeLib.floatClamp(this.f5721g, f6, f5);
        this.f5721g = floatClamp;
        float f7 = f5 - f6;
        float f8 = this.f5718d;
        if (f7 > 0.0f) {
            f8 = AbstractC0062j.m149c(this.f5719e, f8, (floatClamp - f6) / f7, f8);
        }
        this.f5723i = f8;
        boolean z2 = true;
        boolean z3 = Math.abs(f8 - this.f5724j) > this.f5720f || this.f5725k;
        if (imageView != null && z3) {
            if (f2 <= 0.01f) {
                f2 = 1.0f;
            }
            if (imageView.getWidth() != 0) {
                imageView.setPivotX(imageView.getWidth() / 2.0f);
                imageView.setPivotY(imageView.getHeight() / 2.0f);
                imageView.setScaleX(f2);
                imageView.setScaleY(f2);
            } else if (Math.abs(f2 - 1.0f) > 0.001f) {
                z2 = false;
            }
            imageView.setRotation(this.f5723i);
            this.f5724j = this.f5723i;
            if (z2) {
                this.f5725k = false;
            }
        }
        return z3;
    }
}
