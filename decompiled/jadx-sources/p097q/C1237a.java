package p097q;

import java.util.Arrays;
import p006C.AbstractC0062j;
import p022K.C0198k;

/* renamed from: q.a */
/* loaded from: classes.dex */
public final class C1237a {

    /* renamed from: b */
    public final C1238b f5494b;

    /* renamed from: c */
    public final C0198k f5495c;

    /* renamed from: a */
    public int f5493a = 0;

    /* renamed from: d */
    public int f5496d = 8;

    /* renamed from: e */
    public int[] f5497e = new int[8];

    /* renamed from: f */
    public int[] f5498f = new int[8];

    /* renamed from: g */
    public float[] f5499g = new float[8];

    /* renamed from: h */
    public int f5500h = -1;

    /* renamed from: i */
    public int f5501i = -1;

    /* renamed from: j */
    public boolean f5502j = false;

    public C1237a(C1238b c1238b, C0198k c0198k) {
        this.f5494b = c1238b;
        this.f5495c = c0198k;
    }

    /* renamed from: a */
    public final void m2903a(C1242f c1242f, float f2, boolean z2) {
        if (f2 <= -0.001f || f2 >= 0.001f) {
            int i = this.f5500h;
            C1238b c1238b = this.f5494b;
            if (i == -1) {
                this.f5500h = 0;
                this.f5499g[0] = f2;
                this.f5497e[0] = c1242f.f5531b;
                this.f5498f[0] = -1;
                c1242f.f5540k++;
                c1242f.m2945a(c1238b);
                this.f5493a++;
                if (this.f5502j) {
                    return;
                }
                int i2 = this.f5501i + 1;
                this.f5501i = i2;
                int[] iArr = this.f5497e;
                if (i2 >= iArr.length) {
                    this.f5502j = true;
                    this.f5501i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f5493a; i4++) {
                int i5 = this.f5497e[i];
                int i6 = c1242f.f5531b;
                if (i5 == i6) {
                    float[] fArr = this.f5499g;
                    float f3 = fArr[i] + f2;
                    if (f3 > -0.001f && f3 < 0.001f) {
                        f3 = 0.0f;
                    }
                    fArr[i] = f3;
                    if (f3 == 0.0f) {
                        if (i == this.f5500h) {
                            this.f5500h = this.f5498f[i];
                        } else {
                            int[] iArr2 = this.f5498f;
                            iArr2[i3] = iArr2[i];
                        }
                        if (z2) {
                            c1242f.m2946b(c1238b);
                        }
                        if (this.f5502j) {
                            this.f5501i = i;
                        }
                        c1242f.f5540k--;
                        this.f5493a--;
                        return;
                    }
                    return;
                }
                if (i5 < i6) {
                    i3 = i;
                }
                i = this.f5498f[i];
            }
            int i7 = this.f5501i;
            int i8 = i7 + 1;
            if (this.f5502j) {
                int[] iArr3 = this.f5497e;
                if (iArr3[i7] != -1) {
                    i7 = iArr3.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr4 = this.f5497e;
            if (i7 >= iArr4.length && this.f5493a < iArr4.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr5 = this.f5497e;
                    if (i9 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i9] == -1) {
                        i7 = i9;
                        break;
                    }
                    i9++;
                }
            }
            int[] iArr6 = this.f5497e;
            if (i7 >= iArr6.length) {
                i7 = iArr6.length;
                int i10 = this.f5496d * 2;
                this.f5496d = i10;
                this.f5502j = false;
                this.f5501i = i7 - 1;
                this.f5499g = Arrays.copyOf(this.f5499g, i10);
                this.f5497e = Arrays.copyOf(this.f5497e, this.f5496d);
                this.f5498f = Arrays.copyOf(this.f5498f, this.f5496d);
            }
            this.f5497e[i7] = c1242f.f5531b;
            this.f5499g[i7] = f2;
            if (i3 != -1) {
                int[] iArr7 = this.f5498f;
                iArr7[i7] = iArr7[i3];
                iArr7[i3] = i7;
            } else {
                this.f5498f[i7] = this.f5500h;
                this.f5500h = i7;
            }
            c1242f.f5540k++;
            c1242f.m2945a(c1238b);
            this.f5493a++;
            if (!this.f5502j) {
                this.f5501i++;
            }
            int i11 = this.f5501i;
            int[] iArr8 = this.f5497e;
            if (i11 >= iArr8.length) {
                this.f5502j = true;
                this.f5501i = iArr8.length - 1;
            }
        }
    }

    /* renamed from: b */
    public final void m2904b() {
        int i = this.f5500h;
        for (int i2 = 0; i != -1 && i2 < this.f5493a; i2++) {
            C1242f c1242f = ((C1242f[]) this.f5495c.f535d)[this.f5497e[i]];
            if (c1242f != null) {
                c1242f.m2946b(this.f5494b);
            }
            i = this.f5498f[i];
        }
        this.f5500h = -1;
        this.f5501i = -1;
        this.f5502j = false;
        this.f5493a = 0;
    }

    /* renamed from: c */
    public final float m2905c(C1242f c1242f) {
        int i = this.f5500h;
        for (int i2 = 0; i != -1 && i2 < this.f5493a; i2++) {
            if (this.f5497e[i] == c1242f.f5531b) {
                return this.f5499g[i];
            }
            i = this.f5498f[i];
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final int m2906d() {
        return this.f5493a;
    }

    /* renamed from: e */
    public final C1242f m2907e(int i) {
        int i2 = this.f5500h;
        for (int i3 = 0; i2 != -1 && i3 < this.f5493a; i3++) {
            if (i3 == i) {
                return ((C1242f[]) this.f5495c.f535d)[this.f5497e[i2]];
            }
            i2 = this.f5498f[i2];
        }
        return null;
    }

    /* renamed from: f */
    public final float m2908f(int i) {
        int i2 = this.f5500h;
        for (int i3 = 0; i2 != -1 && i3 < this.f5493a; i3++) {
            if (i3 == i) {
                return this.f5499g[i2];
            }
            i2 = this.f5498f[i2];
        }
        return 0.0f;
    }

    /* renamed from: g */
    public final void m2909g(C1242f c1242f, float f2) {
        if (f2 == 0.0f) {
            m2910h(c1242f, true);
            return;
        }
        int i = this.f5500h;
        C1238b c1238b = this.f5494b;
        if (i == -1) {
            this.f5500h = 0;
            this.f5499g[0] = f2;
            this.f5497e[0] = c1242f.f5531b;
            this.f5498f[0] = -1;
            c1242f.f5540k++;
            c1242f.m2945a(c1238b);
            this.f5493a++;
            if (this.f5502j) {
                return;
            }
            int i2 = this.f5501i + 1;
            this.f5501i = i2;
            int[] iArr = this.f5497e;
            if (i2 >= iArr.length) {
                this.f5502j = true;
                this.f5501i = iArr.length - 1;
                return;
            }
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f5493a; i4++) {
            int i5 = this.f5497e[i];
            int i6 = c1242f.f5531b;
            if (i5 == i6) {
                this.f5499g[i] = f2;
                return;
            }
            if (i5 < i6) {
                i3 = i;
            }
            i = this.f5498f[i];
        }
        int i7 = this.f5501i;
        int i8 = i7 + 1;
        if (this.f5502j) {
            int[] iArr2 = this.f5497e;
            if (iArr2[i7] != -1) {
                i7 = iArr2.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr3 = this.f5497e;
        if (i7 >= iArr3.length && this.f5493a < iArr3.length) {
            int i9 = 0;
            while (true) {
                int[] iArr4 = this.f5497e;
                if (i9 >= iArr4.length) {
                    break;
                }
                if (iArr4[i9] == -1) {
                    i7 = i9;
                    break;
                }
                i9++;
            }
        }
        int[] iArr5 = this.f5497e;
        if (i7 >= iArr5.length) {
            i7 = iArr5.length;
            int i10 = this.f5496d * 2;
            this.f5496d = i10;
            this.f5502j = false;
            this.f5501i = i7 - 1;
            this.f5499g = Arrays.copyOf(this.f5499g, i10);
            this.f5497e = Arrays.copyOf(this.f5497e, this.f5496d);
            this.f5498f = Arrays.copyOf(this.f5498f, this.f5496d);
        }
        this.f5497e[i7] = c1242f.f5531b;
        this.f5499g[i7] = f2;
        if (i3 != -1) {
            int[] iArr6 = this.f5498f;
            iArr6[i7] = iArr6[i3];
            iArr6[i3] = i7;
        } else {
            this.f5498f[i7] = this.f5500h;
            this.f5500h = i7;
        }
        c1242f.f5540k++;
        c1242f.m2945a(c1238b);
        int i11 = this.f5493a + 1;
        this.f5493a = i11;
        if (!this.f5502j) {
            this.f5501i++;
        }
        int[] iArr7 = this.f5497e;
        if (i11 >= iArr7.length) {
            this.f5502j = true;
        }
        if (this.f5501i >= iArr7.length) {
            this.f5502j = true;
            this.f5501i = iArr7.length - 1;
        }
    }

    /* renamed from: h */
    public final float m2910h(C1242f c1242f, boolean z2) {
        int i = this.f5500h;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f5493a) {
            if (this.f5497e[i] == c1242f.f5531b) {
                if (i == this.f5500h) {
                    this.f5500h = this.f5498f[i];
                } else {
                    int[] iArr = this.f5498f;
                    iArr[i3] = iArr[i];
                }
                if (z2) {
                    c1242f.m2946b(this.f5494b);
                }
                c1242f.f5540k--;
                this.f5493a--;
                this.f5497e[i] = -1;
                if (this.f5502j) {
                    this.f5501i = i;
                }
                return this.f5499g[i];
            }
            i2++;
            i3 = i;
            i = this.f5498f[i];
        }
        return 0.0f;
    }

    public final String toString() {
        int i = this.f5500h;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f5493a; i2++) {
            StringBuilder m2942a = AbstractC1241e.m2942a(AbstractC0062j.m160n(str, " -> "));
            m2942a.append(this.f5499g[i]);
            m2942a.append(" : ");
            StringBuilder m2942a2 = AbstractC1241e.m2942a(m2942a.toString());
            m2942a2.append(((C1242f[]) this.f5495c.f535d)[this.f5497e[i]]);
            str = m2942a2.toString();
            i = this.f5498f[i];
        }
        return str;
    }
}
