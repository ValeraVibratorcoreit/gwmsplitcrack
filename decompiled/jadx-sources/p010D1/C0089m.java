package p010D1;

import java.nio.charset.Charset;
import java.util.Arrays;

/* renamed from: D1.m */
/* loaded from: classes.dex */
public final class C0089m extends C0080d {

    /* renamed from: f */
    public final transient byte[][] f269f;

    /* renamed from: g */
    public final transient int[] f270g;

    public C0089m(C0077a c0077a, int i) {
        super(null);
        AbstractC0091o.m324a(c0077a.f240b, 0L, i);
        C0087k c0087k = c0077a.f239a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c0087k.f262c;
            int i6 = c0087k.f261b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c0087k = c0087k.f265f;
        }
        this.f269f = new byte[i4][];
        this.f270g = new int[i4 * 2];
        C0087k c0087k2 = c0077a.f239a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f269f;
            bArr[i7] = c0087k2.f260a;
            int i8 = c0087k2.f262c;
            int i9 = c0087k2.f261b;
            int i10 = (i8 - i9) + i2;
            i2 = i10 > i ? i : i10;
            int[] iArr = this.f270g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c0087k2.f263d = true;
            i7++;
            c0087k2 = c0087k2.f265f;
        }
    }

    @Override // p010D1.C0080d
    /* renamed from: b */
    public final byte mo239b(int i) {
        byte[][] bArr = this.f269f;
        int length = bArr.length - 1;
        int[] iArr = this.f270g;
        AbstractC0091o.m324a(iArr[length], i, 1L);
        int m322j = m322j(i);
        return bArr[m322j][(i - (m322j == 0 ? 0 : iArr[m322j - 1])) + iArr[bArr.length + m322j]];
    }

    @Override // p010D1.C0080d
    /* renamed from: c */
    public final String mo240c() {
        return new C0080d(m323k()).mo240c();
    }

    @Override // p010D1.C0080d
    /* renamed from: d */
    public final byte[] mo241d() {
        return m323k();
    }

    @Override // p010D1.C0080d
    /* renamed from: e */
    public final boolean mo242e(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo244g() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int m322j = m322j(i);
        while (i3 > 0) {
            int[] iArr = this.f270g;
            int i4 = m322j == 0 ? 0 : iArr[m322j - 1];
            int min = Math.min(i3, ((iArr[m322j] - i4) + i4) - i);
            byte[][] bArr2 = this.f269f;
            int i5 = (i - i4) + iArr[bArr2.length + m322j];
            byte[] bArr3 = bArr2[m322j];
            Charset charset = AbstractC0091o.f271a;
            for (int i6 = 0; i6 < min; i6++) {
                if (bArr3[i6 + i5] != bArr[i6 + i2]) {
                    return false;
                }
            }
            i += min;
            i2 += min;
            i3 -= min;
            m322j++;
        }
        return true;
    }

    @Override // p010D1.C0080d
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0080d) {
            C0080d c0080d = (C0080d) obj;
            if (c0080d.mo244g() == mo244g() && mo243f(c0080d, mo244g())) {
                return true;
            }
        }
        return false;
    }

    @Override // p010D1.C0080d
    /* renamed from: f */
    public final boolean mo243f(C0080d c0080d, int i) {
        if (mo244g() - i < 0) {
            return false;
        }
        int m322j = m322j(0);
        int i2 = 0;
        int i3 = 0;
        while (i > 0) {
            int[] iArr = this.f270g;
            int i4 = m322j == 0 ? 0 : iArr[m322j - 1];
            int min = Math.min(i, ((iArr[m322j] - i4) + i4) - i2);
            byte[][] bArr = this.f269f;
            if (!c0080d.mo242e(i3, bArr[m322j], (i2 - i4) + iArr[bArr.length + m322j], min)) {
                return false;
            }
            i2 += min;
            i3 += min;
            i -= min;
            m322j++;
        }
        return true;
    }

    @Override // p010D1.C0080d
    /* renamed from: g */
    public final int mo244g() {
        return this.f270g[this.f269f.length - 1];
    }

    @Override // p010D1.C0080d
    /* renamed from: h */
    public final C0080d mo245h() {
        return new C0080d(m323k()).mo245h();
    }

    @Override // p010D1.C0080d
    public final int hashCode() {
        int i = this.f244b;
        if (i != 0) {
            return i;
        }
        byte[][] bArr = this.f269f;
        int length = bArr.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr2 = bArr[i2];
            int[] iArr = this.f270g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr2[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f244b = i3;
        return i3;
    }

    @Override // p010D1.C0080d
    /* renamed from: i */
    public final String mo246i() {
        return new C0080d(m323k()).mo246i();
    }

    /* renamed from: j */
    public final int m322j(int i) {
        int binarySearch = Arrays.binarySearch(this.f270g, 0, this.f269f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: k */
    public final byte[] m323k() {
        byte[][] bArr = this.f269f;
        int length = bArr.length - 1;
        int[] iArr = this.f270g;
        byte[] bArr2 = new byte[iArr[length]];
        int length2 = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length2) {
            int i3 = iArr[length2 + i];
            int i4 = iArr[i];
            System.arraycopy(bArr[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // p010D1.C0080d
    public final String toString() {
        return new C0080d(m323k()).toString();
    }
}
