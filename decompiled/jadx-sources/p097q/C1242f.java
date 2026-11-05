package p097q;

import java.util.Arrays;

/* renamed from: q.f */
/* loaded from: classes.dex */
public final class C1242f implements Comparable {

    /* renamed from: a */
    public boolean f5530a;

    /* renamed from: e */
    public float f5534e;

    /* renamed from: l */
    public int f5541l;

    /* renamed from: b */
    public int f5531b = -1;

    /* renamed from: c */
    public int f5532c = -1;

    /* renamed from: d */
    public int f5533d = 0;

    /* renamed from: f */
    public boolean f5535f = false;

    /* renamed from: g */
    public final float[] f5536g = new float[9];

    /* renamed from: h */
    public final float[] f5537h = new float[9];

    /* renamed from: i */
    public C1238b[] f5538i = new C1238b[16];

    /* renamed from: j */
    public int f5539j = 0;

    /* renamed from: k */
    public int f5540k = 0;

    public C1242f(int i) {
        this.f5541l = i;
    }

    /* renamed from: a */
    public final void m2945a(C1238b c1238b) {
        int i = 0;
        while (true) {
            int i2 = this.f5539j;
            if (i >= i2) {
                C1238b[] c1238bArr = this.f5538i;
                if (i2 >= c1238bArr.length) {
                    this.f5538i = (C1238b[]) Arrays.copyOf(c1238bArr, c1238bArr.length * 2);
                }
                C1238b[] c1238bArr2 = this.f5538i;
                int i3 = this.f5539j;
                c1238bArr2[i3] = c1238b;
                this.f5539j = i3 + 1;
                return;
            }
            if (this.f5538i[i] == c1238b) {
                return;
            } else {
                i++;
            }
        }
    }

    /* renamed from: b */
    public final void m2946b(C1238b c1238b) {
        int i = this.f5539j;
        int i2 = 0;
        while (i2 < i) {
            if (this.f5538i[i2] == c1238b) {
                while (i2 < i - 1) {
                    C1238b[] c1238bArr = this.f5538i;
                    int i3 = i2 + 1;
                    c1238bArr[i2] = c1238bArr[i3];
                    i2 = i3;
                }
                this.f5539j--;
                return;
            }
            i2++;
        }
    }

    /* renamed from: c */
    public final void m2947c() {
        this.f5541l = 5;
        this.f5533d = 0;
        this.f5531b = -1;
        this.f5532c = -1;
        this.f5534e = 0.0f;
        this.f5535f = false;
        int i = this.f5539j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5538i[i2] = null;
        }
        this.f5539j = 0;
        this.f5540k = 0;
        this.f5530a = false;
        Arrays.fill(this.f5537h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f5531b - ((C1242f) obj).f5531b;
    }

    /* renamed from: d */
    public final void m2948d(C1239c c1239c, float f2) {
        this.f5534e = f2;
        this.f5535f = true;
        int i = this.f5539j;
        this.f5532c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5538i[i2].m2918h(c1239c, this, false);
        }
        this.f5539j = 0;
    }

    /* renamed from: e */
    public final void m2949e(C1239c c1239c, C1238b c1238b) {
        int i = this.f5539j;
        for (int i2 = 0; i2 < i; i2++) {
            this.f5538i[i2].mo2919i(c1239c, c1238b, false);
        }
        this.f5539j = 0;
    }

    public final String toString() {
        return "" + this.f5531b;
    }
}
