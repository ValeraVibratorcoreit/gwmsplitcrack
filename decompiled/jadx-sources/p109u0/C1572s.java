package p109u0;

import android.widget.ImageView;
import p006C.AbstractC0062j;

/* renamed from: u0.s */
/* loaded from: classes.dex */
public final class C1572s {

    /* renamed from: a */
    public final /* synthetic */ int f8675a;

    /* renamed from: b */
    public final float f8676b;

    /* renamed from: c */
    public final float f8677c;

    /* renamed from: d */
    public final float f8678d;

    /* renamed from: e */
    public final float f8679e;

    /* renamed from: f */
    public float f8680f;

    /* renamed from: g */
    public float f8681g;

    /* renamed from: h */
    public float f8682h;

    /* renamed from: i */
    public boolean f8683i;

    public C1572s(float f2, float f3, float f4, float f5, float f6, int i) {
        this.f8675a = i;
        switch (i) {
            case 1:
                this.f8676b = f2;
                this.f8677c = f3;
                this.f8678d = f4;
                this.f8679e = f5;
                float max = Math.max(f2, Math.min(f3, f6));
                this.f8680f = max;
                this.f8681g = max;
                this.f8682h = AbstractC0062j.m149c(f5, f4, (Math.max(f2, Math.min(f3, max)) - f2) / (f3 - f2), f4);
                break;
            case 2:
                this.f8676b = f2;
                this.f8677c = f3;
                this.f8678d = f4;
                this.f8679e = f5;
                float max2 = Math.max(f2, Math.min(f3, f6));
                this.f8680f = max2;
                this.f8681g = max2;
                this.f8682h = AbstractC0062j.m149c(f5, f4, (Math.max(f2, Math.min(f3, max2)) - f2) / (f3 - f2), f4);
                break;
            case 3:
                this.f8676b = f2;
                this.f8677c = f3;
                this.f8678d = f4;
                this.f8679e = f5;
                float max3 = Math.max(f2, Math.min(f3, f6));
                this.f8680f = max3;
                this.f8681g = max3;
                this.f8682h = AbstractC0062j.m149c(f5, f4, (Math.max(f2, Math.min(f3, max3)) - f2) / (f3 - f2), f4);
                break;
            case 4:
                this.f8676b = f2;
                this.f8677c = f3;
                this.f8678d = f4;
                this.f8679e = f5;
                float max4 = Math.max(f2, Math.min(f3, f6));
                this.f8680f = max4;
                this.f8681g = max4;
                this.f8682h = AbstractC0062j.m149c(f5, f4, (Math.max(f2, Math.min(f3, max4)) - f2) / (f3 - f2), f4);
                break;
            default:
                this.f8676b = f2;
                this.f8677c = f3;
                this.f8678d = f4;
                this.f8679e = f5;
                float max5 = Math.max(f2, Math.min(f3, f6));
                this.f8680f = max5;
                this.f8681g = max5;
                this.f8682h = AbstractC0062j.m149c(f5, f4, (Math.max(f2, Math.min(f3, max5)) - f2) / (f3 - f2), f4);
                break;
        }
    }

    /* renamed from: a */
    public final void m4470a(ImageView imageView) {
        switch (this.f8675a) {
            case 0:
                if (imageView != null && imageView.getWidth() > 0) {
                    imageView.setRotation(this.f8682h);
                    this.f8683i = true;
                    break;
                }
                break;
            case 1:
                if (imageView != null && imageView.getWidth() > 0) {
                    imageView.setRotation(this.f8682h);
                    this.f8683i = true;
                    break;
                }
                break;
            case 2:
                if (imageView != null && imageView.getWidth() > 0) {
                    imageView.setRotation(this.f8682h);
                    this.f8683i = true;
                    break;
                }
                break;
            case 3:
                if (imageView != null && imageView.getWidth() > 0) {
                    imageView.setRotation(this.f8682h);
                    this.f8683i = true;
                    break;
                }
                break;
            default:
                if (imageView != null && imageView.getWidth() > 0) {
                    imageView.setRotation(this.f8682h);
                    this.f8683i = true;
                    break;
                }
                break;
        }
    }

    /* renamed from: b */
    public final void m4471b(ImageView imageView) {
        switch (this.f8675a) {
            case 0:
                float exp = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
                float f2 = this.f8680f;
                this.f8680f = AbstractC0062j.m149c(this.f8681g, f2, exp, f2);
                float f3 = this.f8677c;
                float f4 = this.f8676b;
                if (Math.abs(this.f8680f - this.f8681g) <= Math.max(0.001f, f3 - f4) * 5.0E-4f) {
                    this.f8680f = this.f8681g;
                }
                float max = (Math.max(f4, Math.min(f3, this.f8680f)) - f4) / (f3 - f4);
                float f5 = this.f8679e;
                float f6 = this.f8678d;
                float m149c = AbstractC0062j.m149c(f5, f6, max, f6);
                boolean z2 = Math.abs(m149c - this.f8682h) >= 0.01f;
                if (z2) {
                    this.f8682h = m149c;
                }
                if (imageView != null && imageView.getWidth() > 0) {
                    if (z2 || !this.f8683i) {
                        imageView.setRotation(this.f8682h);
                        this.f8683i = true;
                        break;
                    }
                }
                break;
            case 1:
                float exp2 = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
                float f7 = this.f8680f;
                this.f8680f = AbstractC0062j.m149c(this.f8681g, f7, exp2, f7);
                float f8 = this.f8677c;
                float f9 = this.f8676b;
                if (Math.abs(this.f8680f - this.f8681g) <= Math.max(0.001f, f8 - f9) * 5.0E-4f) {
                    this.f8680f = this.f8681g;
                }
                float max2 = (Math.max(f9, Math.min(f8, this.f8680f)) - f9) / (f8 - f9);
                float f10 = this.f8679e;
                float f11 = this.f8678d;
                float m149c2 = AbstractC0062j.m149c(f10, f11, max2, f11);
                boolean z3 = Math.abs(m149c2 - this.f8682h) >= 0.01f;
                if (z3) {
                    this.f8682h = m149c2;
                }
                if (imageView != null && imageView.getWidth() > 0) {
                    if (z3 || !this.f8683i) {
                        imageView.setRotation(this.f8682h);
                        this.f8683i = true;
                        break;
                    }
                }
                break;
            case 2:
                float exp3 = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
                float f12 = this.f8680f;
                this.f8680f = AbstractC0062j.m149c(this.f8681g, f12, exp3, f12);
                float f13 = this.f8677c;
                float f14 = this.f8676b;
                if (Math.abs(this.f8680f - this.f8681g) <= Math.max(0.001f, f13 - f14) * 5.0E-4f) {
                    this.f8680f = this.f8681g;
                }
                float max3 = (Math.max(f14, Math.min(f13, this.f8680f)) - f14) / (f13 - f14);
                float f15 = this.f8679e;
                float f16 = this.f8678d;
                float m149c3 = AbstractC0062j.m149c(f15, f16, max3, f16);
                boolean z4 = Math.abs(m149c3 - this.f8682h) >= 0.01f;
                if (z4) {
                    this.f8682h = m149c3;
                }
                if (imageView != null && imageView.getWidth() > 0) {
                    if (z4 || !this.f8683i) {
                        imageView.setRotation(this.f8682h);
                        this.f8683i = true;
                        break;
                    }
                }
                break;
            case 3:
                float exp4 = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
                float f17 = this.f8680f;
                this.f8680f = AbstractC0062j.m149c(this.f8681g, f17, exp4, f17);
                float f18 = this.f8677c;
                float f19 = this.f8676b;
                if (Math.abs(this.f8680f - this.f8681g) <= Math.max(0.001f, f18 - f19) * 5.0E-4f) {
                    this.f8680f = this.f8681g;
                }
                float max4 = (Math.max(f19, Math.min(f18, this.f8680f)) - f19) / (f18 - f19);
                float f20 = this.f8679e;
                float f21 = this.f8678d;
                float m149c4 = AbstractC0062j.m149c(f20, f21, max4, f21);
                boolean z5 = Math.abs(m149c4 - this.f8682h) >= 0.01f;
                if (z5) {
                    this.f8682h = m149c4;
                }
                if (imageView != null && imageView.getWidth() > 0) {
                    if (z5 || !this.f8683i) {
                        imageView.setRotation(this.f8682h);
                        this.f8683i = true;
                        break;
                    }
                }
                break;
            default:
                float exp5 = 1.0f - ((float) Math.exp((-Math.max(1.0f, 16L)) / 300.0f));
                float f22 = this.f8680f;
                this.f8680f = AbstractC0062j.m149c(this.f8681g, f22, exp5, f22);
                float f23 = this.f8677c;
                float f24 = this.f8676b;
                if (Math.abs(this.f8680f - this.f8681g) <= Math.max(0.001f, f23 - f24) * 5.0E-4f) {
                    this.f8680f = this.f8681g;
                }
                float max5 = (Math.max(f24, Math.min(f23, this.f8680f)) - f24) / (f23 - f24);
                float f25 = this.f8679e;
                float f26 = this.f8678d;
                float m149c5 = AbstractC0062j.m149c(f25, f26, max5, f26);
                boolean z6 = Math.abs(m149c5 - this.f8682h) >= 0.01f;
                if (z6) {
                    this.f8682h = m149c5;
                }
                if (imageView != null && imageView.getWidth() > 0) {
                    if (z6 || !this.f8683i) {
                        imageView.setRotation(this.f8682h);
                        this.f8683i = true;
                        break;
                    }
                }
                break;
        }
    }
}
