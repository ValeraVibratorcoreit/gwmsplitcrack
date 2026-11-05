package p070g;

/* renamed from: g.F */
/* loaded from: classes.dex */
public final class C0857F {

    /* renamed from: d */
    public static C0857F f4279d;

    /* renamed from: a */
    public long f4280a;

    /* renamed from: b */
    public long f4281b;

    /* renamed from: c */
    public int f4282c;

    /* renamed from: a */
    public final void m2375a(long j2, double d, double d2) {
        double d3 = (0.01720197f * ((j2 - 946728000000L) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r4 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r4) * 3.4906598739326E-4d) + (Math.sin(d3) * 0.03341960161924362d) + d3 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d3) * 0.0053d) + Math.round((r3 - 9.0E-4f) - r7) + 9.0E-4f + ((-d2) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d4 = 0.01745329238474369d * d;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d4))) / (Math.cos(asin) * Math.cos(d4));
        if (sin3 >= 1.0d) {
            this.f4282c = 1;
            this.f4280a = -1L;
            this.f4281b = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.f4282c = 0;
                this.f4280a = -1L;
                this.f4281b = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.f4280a = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.f4281b = round;
            if (round >= j2 || this.f4280a <= j2) {
                this.f4282c = 1;
            } else {
                this.f4282c = 0;
            }
        }
    }
}
