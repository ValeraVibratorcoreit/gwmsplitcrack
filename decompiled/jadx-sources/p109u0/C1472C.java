package p109u0;

import android.widget.ImageView;
import p006C.AbstractC0062j;

/* renamed from: u0.C */
/* loaded from: classes.dex */
public final class C1472C {

    /* renamed from: a */
    public final float f7175a;

    /* renamed from: b */
    public float f7176b;

    /* renamed from: c */
    public float f7177c;

    /* renamed from: d */
    public float f7178d;

    /* renamed from: e */
    public boolean f7179e;

    public C1472C(float f2, float f3) {
        this.f7175a = f2;
        float max = Math.max(0.0f, Math.min(f2, f3));
        this.f7176b = max;
        this.f7177c = max;
        this.f7178d = (((Math.max(0.0f, Math.min(f2, max)) - 0.0f) / (f2 - 0.0f)) * 270.0f) - 135.0f;
    }

    /* renamed from: a */
    public final void m3499a(ImageView imageView) {
        if (imageView == null || imageView.getWidth() <= 0) {
            return;
        }
        imageView.setRotation(this.f7178d);
        this.f7179e = true;
    }

    /* renamed from: b */
    public final void m3500b(ImageView imageView) {
        float exp = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
        float f2 = this.f7176b;
        this.f7176b = AbstractC0062j.m149c(this.f7177c, f2, exp, f2);
        float f3 = this.f7175a;
        if (Math.abs(this.f7176b - this.f7177c) <= Math.max(0.001f, f3 - 0.0f) * 5.0E-4f) {
            this.f7176b = this.f7177c;
        }
        float max = (((Math.max(0.0f, Math.min(f3, this.f7176b)) - 0.0f) / (f3 - 0.0f)) * 270.0f) - 135.0f;
        boolean z2 = Math.abs(max - this.f7178d) >= 0.01f;
        if (z2) {
            this.f7178d = max;
        }
        if (imageView == null || imageView.getWidth() <= 0) {
            return;
        }
        if (z2 || !this.f7179e) {
            imageView.setRotation(this.f7178d);
            this.f7179e = true;
        }
    }
}
