package p109u0;

import p006C.AbstractC0062j;

/* renamed from: u0.l1 */
/* loaded from: classes.dex */
public final class C1554l1 {

    /* renamed from: a */
    public boolean f8375a = true;

    /* renamed from: b */
    public String f8376b = "theme1_spd.png";

    /* renamed from: c */
    public String f8377c = "theme1_needle_spd.png";

    /* renamed from: d */
    public int f8378d = 85;

    /* renamed from: e */
    public int f8379e = 200;

    /* renamed from: f */
    public int f8380f = 480;

    /* renamed from: g */
    public float f8381g = 1.0f;

    /* renamed from: h */
    public float f8382h = -135.0f;

    /* renamed from: i */
    public float f8383i = 135.0f;

    /* renamed from: j */
    public float f8384j = 0.0f;

    /* renamed from: k */
    public float f8385k = 220.0f;

    /* renamed from: a */
    public final int m4289a() {
        float f2 = this.f8381g;
        if (f2 <= 0.01f) {
            f2 = 1.0f;
        }
        return AbstractC0062j.m152f(this.f8380f, f2, 1);
    }

    /* renamed from: b */
    public final int m4290b() {
        return ((this.f8380f - m4289a()) / 2) + this.f8378d;
    }

    /* renamed from: c */
    public final int m4291c() {
        return ((this.f8380f - m4289a()) / 2) + this.f8379e;
    }
}
