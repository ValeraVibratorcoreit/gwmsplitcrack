package p109u0;

import android.graphics.RectF;
import p006C.AbstractC0062j;

/* renamed from: u0.h1 */
/* loaded from: classes.dex */
public final class C1542h1 {

    /* renamed from: a */
    public final float f8327a;

    /* renamed from: b */
    public final float f8328b;

    /* renamed from: c */
    public final float f8329c;

    /* renamed from: d */
    public final float f8330d;

    /* renamed from: e */
    public final float f8331e;

    /* renamed from: f */
    public final float f8332f;

    /* renamed from: g */
    public final float f8333g;

    public C1542h1(float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        this.f8327a = f2;
        this.f8328b = f3;
        this.f8329c = f4;
        this.f8330d = f5;
        this.f8331e = f6;
        this.f8332f = f7;
        this.f8333g = f8;
    }

    /* renamed from: a */
    public static C1542h1 m4284a(float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        float f15;
        float f16;
        float f17;
        int round = Math.round(f2);
        int round2 = Math.round(f3);
        float f18 = 0.5f;
        float f19 = (f3 - (f7 * 0.5f)) - f8;
        float f20 = f9 * 0.5f;
        float max = Math.max(f9 + f10 + 8.0f, (f19 - (((f4 + f5) - f6) + ((f9 + f11) + f20))) - Math.max(0.0f, f13));
        float f21 = f2 * 0.5f;
        if (round <= 0 || round2 <= 0 || max <= 0.0f) {
            f15 = f19;
            f16 = round * 0.5f;
        } else {
            RectF m4208b0 = AbstractC1539g1.m4208b0(AbstractC1539g1.m4239u(), round, round2);
            float f22 = round * 0.5f;
            float f23 = max + f9 + f11 + f20;
            f16 = f23 + f12;
            int i = 0;
            while (i < 28) {
                float f24 = (f16 + f22) * f18;
                RectF rectF = new RectF(m4208b0.left - f12, m4208b0.top - f12, m4208b0.right + f12, m4208b0.bottom + f12);
                int i2 = 180;
                while (true) {
                    if (i2 > 360) {
                        f17 = f19;
                        f16 = f24;
                        break;
                    }
                    double radians = (float) Math.toRadians(i2);
                    f17 = f19;
                    float cos = (((float) Math.cos(radians)) * f23) + f24;
                    float sin = (((float) Math.sin(radians)) * f23) + f17;
                    if (cos >= rectF.left && cos <= rectF.right && sin >= rectF.top && sin <= rectF.bottom) {
                        f22 = f24;
                        break;
                    }
                    i2++;
                    f19 = f17;
                }
                i++;
                f19 = f17;
                f18 = 0.5f;
            }
            f15 = f19;
        }
        float m149c = AbstractC0062j.m149c(f16, f21, Math.max(0.0f, Math.min(1.0f, f14)), f21);
        float sqrt = (float) Math.sqrt(Math.max(0.0f, (max * max) - (r3 * r3)));
        double d = f15 - f15;
        float degrees = (float) Math.toDegrees(Math.atan2(d, (m149c - sqrt) - m149c));
        float degrees2 = ((float) Math.toDegrees(Math.atan2(d, (m149c + sqrt) - m149c))) - degrees;
        if (degrees2 < 0.0f) {
            degrees2 += 360.0f;
        }
        return new C1542h1(m149c, f15, max, f15, sqrt, degrees, degrees2);
    }
}
