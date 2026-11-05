package p068f0;

/* renamed from: f0.f0 */
/* loaded from: classes.dex */
public final class C0807f0 {

    /* renamed from: a */
    public int f4071a;

    /* renamed from: b */
    public int f4072b;

    /* renamed from: c */
    public int f4073c;

    /* renamed from: d */
    public int f4074d;

    /* renamed from: e */
    public int f4075e;

    /* renamed from: a */
    public final boolean m2302a() {
        int i = this.f4071a;
        int i2 = 2;
        if ((i & 7) != 0) {
            int i3 = this.f4074d;
            int i4 = this.f4072b;
            if (((i3 > i4 ? 1 : i3 == i4 ? 2 : 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 112) != 0) {
            int i5 = this.f4074d;
            int i6 = this.f4073c;
            if ((((i5 > i6 ? 1 : i5 == i6 ? 2 : 4) << 4) & i) == 0) {
                return false;
            }
        }
        if ((i & 1792) != 0) {
            int i7 = this.f4075e;
            int i8 = this.f4072b;
            if ((((i7 > i8 ? 1 : i7 == i8 ? 2 : 4) << 8) & i) == 0) {
                return false;
            }
        }
        if ((i & 28672) != 0) {
            int i9 = this.f4075e;
            int i10 = this.f4073c;
            if (i9 > i10) {
                i2 = 1;
            } else if (i9 != i10) {
                i2 = 4;
            }
            if ((i & (i2 << 12)) == 0) {
                return false;
            }
        }
        return true;
    }
}
