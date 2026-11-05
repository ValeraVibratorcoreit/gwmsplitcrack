package p033Q;

/* renamed from: Q.a */
/* loaded from: classes.dex */
public final class C0267a {

    /* renamed from: a */
    public int f709a;

    /* renamed from: b */
    public int f710b;

    /* renamed from: c */
    public float f711c;

    /* renamed from: d */
    public float f712d;

    /* renamed from: e */
    public long f713e;

    /* renamed from: f */
    public long f714f;

    /* renamed from: g */
    public long f715g;

    /* renamed from: h */
    public float f716h;

    /* renamed from: i */
    public int f717i;

    /* renamed from: a */
    public final float m785a(long j2) {
        if (j2 < this.f713e) {
            return 0.0f;
        }
        long j3 = this.f715g;
        if (j3 < 0 || j2 < j3) {
            return ViewOnTouchListenerC0273g.m799b((j2 - r0) / this.f709a, 0.0f, 1.0f) * 0.5f;
        }
        float f2 = this.f716h;
        return (ViewOnTouchListenerC0273g.m799b((j2 - j3) / this.f717i, 0.0f, 1.0f) * f2) + (1.0f - f2);
    }
}
