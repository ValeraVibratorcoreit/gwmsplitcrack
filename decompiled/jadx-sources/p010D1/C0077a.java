package p010D1;

import com.sun.jna.Function;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import p006C.AbstractC0062j;

/* renamed from: D1.a */
/* loaded from: classes.dex */
public final class C0077a implements InterfaceC0079c, InterfaceC0078b, Cloneable, ByteChannel {

    /* renamed from: a */
    public C0087k f239a;

    /* renamed from: b */
    public long f240b;

    @Override // p010D1.InterfaceC0079c
    /* renamed from: a */
    public final C0077a mo217a() {
        return this;
    }

    @Override // p010D1.InterfaceC0090n
    /* renamed from: b */
    public final long mo218b(C0077a c0077a, long j2) {
        if (c0077a == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        long j3 = this.f240b;
        if (j3 == 0) {
            return -1L;
        }
        if (j2 > j3) {
            j2 = j3;
        }
        c0077a.m234r(this, j2);
        return j2;
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: c */
    public final boolean mo219c(long j2) {
        return this.f240b >= j2;
    }

    public final Object clone() {
        C0077a c0077a = new C0077a();
        if (this.f240b != 0) {
            C0087k m252c = this.f239a.m252c();
            c0077a.f239a = m252c;
            m252c.f266g = m252c;
            m252c.f265f = m252c;
            C0087k c0087k = this.f239a;
            while (true) {
                c0087k = c0087k.f265f;
                if (c0087k == this.f239a) {
                    break;
                }
                c0077a.f239a.f266g.m251b(c0087k.m252c());
            }
            c0077a.f240b = this.f240b;
        }
        return c0077a;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
    }

    /* renamed from: d */
    public final byte m220d(long j2) {
        int i;
        AbstractC0091o.m324a(this.f240b, j2, 1L);
        long j3 = this.f240b;
        if (j3 - j2 <= j2) {
            long j4 = j2 - j3;
            C0087k c0087k = this.f239a;
            do {
                c0087k = c0087k.f266g;
                int i2 = c0087k.f262c;
                i = c0087k.f261b;
                j4 += i2 - i;
            } while (j4 < 0);
            return c0087k.f260a[i + ((int) j4)];
        }
        C0087k c0087k2 = this.f239a;
        while (true) {
            int i3 = c0087k2.f262c;
            int i4 = c0087k2.f261b;
            long j5 = i3 - i4;
            if (j2 < j5) {
                return c0087k2.f260a[i4 + ((int) j2)];
            }
            j2 -= j5;
            c0087k2 = c0087k2.f265f;
        }
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: e */
    public final C0086j mo221e() {
        C0084h c0084h = new C0084h(this);
        int i = AbstractC0082f.f247a;
        return new C0086j(c0084h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0077a)) {
            return false;
        }
        C0077a c0077a = (C0077a) obj;
        long j2 = this.f240b;
        if (j2 != c0077a.f240b) {
            return false;
        }
        long j3 = 0;
        if (j2 == 0) {
            return true;
        }
        C0087k c0087k = this.f239a;
        C0087k c0087k2 = c0077a.f239a;
        int i = c0087k.f261b;
        int i2 = c0087k2.f261b;
        while (j3 < this.f240b) {
            long min = Math.min(c0087k.f262c - i, c0087k2.f262c - i2);
            int i3 = 0;
            while (i3 < min) {
                int i4 = i + 1;
                int i5 = i2 + 1;
                if (c0087k.f260a[i] != c0087k2.f260a[i2]) {
                    return false;
                }
                i3++;
                i = i4;
                i2 = i5;
            }
            if (i == c0087k.f262c) {
                c0087k = c0087k.f265f;
                i = c0087k.f261b;
            }
            if (i2 == c0087k2.f262c) {
                c0087k2 = c0087k2.f265f;
                i2 = c0087k2.f261b;
            }
            j3 += min;
        }
        return true;
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: f */
    public final int mo222f(C0083g c0083g) {
        int m231o = m231o(c0083g, false);
        if (m231o == -1) {
            return -1;
        }
        try {
            m232p(c0083g.f248a[m231o].mo244g());
            return m231o;
        } catch (EOFException unused) {
            throw new AssertionError();
        }
    }

    @Override // java.io.Flushable
    public final void flush() {
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: g */
    public final long mo223g(C0080d c0080d) {
        return m225i(c0080d, 0L);
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: h */
    public final long mo224h(C0080d c0080d) {
        return m226j(c0080d, 0L);
    }

    public final int hashCode() {
        C0087k c0087k = this.f239a;
        if (c0087k == null) {
            return 0;
        }
        int i = 1;
        do {
            int i2 = c0087k.f262c;
            for (int i3 = c0087k.f261b; i3 < i2; i3++) {
                i = (i * 31) + c0087k.f260a[i3];
            }
            c0087k = c0087k.f265f;
        } while (c0087k != this.f239a);
        return i;
    }

    /* renamed from: i */
    public final long m225i(C0080d c0080d, long j2) {
        byte b2;
        C0087k c0087k;
        if (c0080d.mo244g() == 0) {
            throw new IllegalArgumentException("bytes is empty");
        }
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C0087k c0087k2 = this.f239a;
        long j4 = -1;
        if (c0087k2 == null) {
            return -1L;
        }
        long j5 = this.f240b;
        if (j5 - j2 < j2) {
            while (j5 > j2) {
                c0087k2 = c0087k2.f266g;
                j5 -= c0087k2.f262c - c0087k2.f261b;
            }
        } else {
            while (true) {
                long j6 = (c0087k2.f262c - c0087k2.f261b) + j3;
                if (j6 >= j2) {
                    break;
                }
                c0087k2 = c0087k2.f265f;
                j3 = j6;
            }
            j5 = j3;
        }
        byte mo239b = c0080d.mo239b(0);
        int mo244g = c0080d.mo244g();
        long j7 = (this.f240b - mo244g) + 1;
        long j8 = j5;
        long j9 = j2;
        while (j8 < j7) {
            byte[] bArr = c0087k2.f260a;
            int min = (int) Math.min(c0087k2.f262c, (c0087k2.f261b + j7) - j8);
            int i = (int) ((c0087k2.f261b + j9) - j8);
            while (i < min) {
                if (bArr[i] == mo239b) {
                    int i2 = i + 1;
                    int i3 = c0087k2.f262c;
                    int i4 = 1;
                    byte[] bArr2 = c0087k2.f260a;
                    C0087k c0087k3 = c0087k2;
                    while (i4 < mo244g) {
                        if (i2 == i3) {
                            C0087k c0087k4 = c0087k3.f265f;
                            c0087k = c0087k4;
                            bArr2 = c0087k4.f260a;
                            i2 = c0087k4.f261b;
                            i3 = c0087k4.f262c;
                        } else {
                            c0087k = c0087k3;
                        }
                        b2 = mo239b;
                        if (bArr2[i2] != c0080d.mo239b(i4)) {
                            break;
                        }
                        i2++;
                        i4++;
                        c0087k3 = c0087k;
                        mo239b = b2;
                    }
                    return (i - c0087k2.f261b) + j8;
                }
                b2 = mo239b;
                i++;
                mo239b = b2;
            }
            j8 += c0087k2.f262c - c0087k2.f261b;
            c0087k2 = c0087k2.f265f;
            j9 = j8;
            mo239b = mo239b;
            j4 = -1;
        }
        return j4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    /* renamed from: j */
    public final long m226j(C0080d c0080d, long j2) {
        int i;
        int i2;
        long j3 = 0;
        if (j2 < 0) {
            throw new IllegalArgumentException("fromIndex < 0");
        }
        C0087k c0087k = this.f239a;
        if (c0087k == null) {
            return -1L;
        }
        long j4 = this.f240b;
        if (j4 - j2 < j2) {
            while (j4 > j2) {
                c0087k = c0087k.f266g;
                j4 -= c0087k.f262c - c0087k.f261b;
            }
        } else {
            while (true) {
                long j5 = (c0087k.f262c - c0087k.f261b) + j3;
                if (j5 >= j2) {
                    break;
                }
                c0087k = c0087k.f265f;
                j3 = j5;
            }
            j4 = j3;
        }
        if (c0080d.mo244g() == 2) {
            byte mo239b = c0080d.mo239b(0);
            byte mo239b2 = c0080d.mo239b(1);
            while (j4 < this.f240b) {
                byte[] bArr = c0087k.f260a;
                i = (int) ((c0087k.f261b + j2) - j4);
                int i3 = c0087k.f262c;
                while (i < i3) {
                    byte b2 = bArr[i];
                    if (b2 == mo239b || b2 == mo239b2) {
                        i2 = c0087k.f261b;
                        return (i - i2) + j4;
                    }
                    i++;
                }
                j4 += c0087k.f262c - c0087k.f261b;
                c0087k = c0087k.f265f;
                j2 = j4;
            }
            return -1L;
        }
        byte[] mo241d = c0080d.mo241d();
        while (j4 < this.f240b) {
            byte[] bArr2 = c0087k.f260a;
            i = (int) ((c0087k.f261b + j2) - j4);
            int i4 = c0087k.f262c;
            while (i < i4) {
                byte b3 = bArr2[i];
                for (byte b4 : mo241d) {
                    if (b3 == b4) {
                        i2 = c0087k.f261b;
                        return (i - i2) + j4;
                    }
                }
                i++;
            }
            j4 += c0087k.f262c - c0087k.f261b;
            c0087k = c0087k.f265f;
            j2 = j4;
        }
        return -1L;
    }

    /* renamed from: k */
    public final int m227k(byte[] bArr, int i, int i2) {
        AbstractC0091o.m324a(bArr.length, i, i2);
        C0087k c0087k = this.f239a;
        if (c0087k == null) {
            return -1;
        }
        int min = Math.min(i2, c0087k.f262c - c0087k.f261b);
        System.arraycopy(c0087k.f260a, c0087k.f261b, bArr, i, min);
        int i3 = c0087k.f261b + min;
        c0087k.f261b = i3;
        this.f240b -= min;
        if (i3 == c0087k.f262c) {
            this.f239a = c0087k.m250a();
            AbstractC0088l.m271h0(c0087k);
        }
        return min;
    }

    /* renamed from: l */
    public final byte m228l() {
        long j2 = this.f240b;
        if (j2 == 0) {
            throw new IllegalStateException("size == 0");
        }
        C0087k c0087k = this.f239a;
        int i = c0087k.f261b;
        int i2 = c0087k.f262c;
        int i3 = i + 1;
        byte b2 = c0087k.f260a[i];
        this.f240b = j2 - 1;
        if (i3 == i2) {
            this.f239a = c0087k.m250a();
            AbstractC0088l.m271h0(c0087k);
        } else {
            c0087k.f261b = i3;
        }
        return b2;
    }

    /* renamed from: m */
    public final byte[] m229m(long j2) {
        AbstractC0091o.m324a(this.f240b, 0L, j2);
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        int i = (int) j2;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int m227k = m227k(bArr, i2, i - i2);
            if (m227k == -1) {
                throw new EOFException();
            }
            i2 += m227k;
        }
        return bArr;
    }

    /* renamed from: n */
    public final String m230n(long j2, Charset charset) {
        AbstractC0091o.m324a(this.f240b, 0L, j2);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j2 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j2);
        }
        if (j2 == 0) {
            return "";
        }
        C0087k c0087k = this.f239a;
        int i = c0087k.f261b;
        if (i + j2 > c0087k.f262c) {
            return new String(m229m(j2), charset);
        }
        String str = new String(c0087k.f260a, i, (int) j2, charset);
        int i2 = (int) (c0087k.f261b + j2);
        c0087k.f261b = i2;
        this.f240b -= j2;
        if (i2 == c0087k.f262c) {
            this.f239a = c0087k.m250a();
            AbstractC0088l.m271h0(c0087k);
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0055, code lost:
    
        if (r19 == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0057, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
    
        return r11;
     */
    /* renamed from: o */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m231o(C0083g c0083g, boolean z2) {
        int i;
        int i2;
        C0087k c0087k;
        byte[] bArr;
        int i3;
        C0087k c0087k2 = this.f239a;
        int i4 = -2;
        if (c0087k2 != null) {
            int i5 = c0087k2.f261b;
            int i6 = c0087k2.f262c;
            int[] iArr = c0083g.f249b;
            byte[] bArr2 = c0087k2.f260a;
            C0087k c0087k3 = c0087k2;
            int i7 = -1;
            int i8 = 0;
            loop0: while (true) {
                int i9 = i8 + 1;
                int i10 = iArr[i8];
                int i11 = i8 + 2;
                int i12 = iArr[i9];
                if (i12 != -1) {
                    i7 = i12;
                }
                if (c0087k3 == null) {
                    break;
                }
                if (i10 >= 0) {
                    int i13 = i5 + 1;
                    int i14 = bArr2[i5] & 255;
                    int i15 = i11 + i10;
                    while (i11 != i15) {
                        if (i14 == iArr[i11]) {
                            i = iArr[i11 + i10];
                            if (i13 == i6) {
                                c0087k3 = c0087k3.f265f;
                                i2 = c0087k3.f261b;
                                i6 = c0087k3.f262c;
                                bArr2 = c0087k3.f260a;
                                if (c0087k3 == c0087k2) {
                                    c0087k3 = null;
                                }
                            } else {
                                i2 = i13;
                            }
                        } else {
                            i11++;
                        }
                    }
                    return i7;
                }
                int i16 = (i10 * (-1)) + i11;
                while (true) {
                    int i17 = i5 + 1;
                    int i18 = i11 + 1;
                    if ((bArr2[i5] & 255) != iArr[i11]) {
                        return i7;
                    }
                    boolean z3 = i18 == i16;
                    if (i17 == i6) {
                        C0087k c0087k4 = c0087k3.f265f;
                        i3 = c0087k4.f261b;
                        int i19 = c0087k4.f262c;
                        bArr = c0087k4.f260a;
                        if (c0087k4 != c0087k2) {
                            c0087k = c0087k4;
                            i6 = i19;
                        } else {
                            if (!z3) {
                                break loop0;
                            }
                            i6 = i19;
                            c0087k = null;
                        }
                    } else {
                        c0087k = c0087k3;
                        bArr = bArr2;
                        i3 = i17;
                    }
                    if (z3) {
                        i = iArr[i18];
                        i2 = i3;
                        bArr2 = bArr;
                        c0087k3 = c0087k;
                        break;
                    }
                    i5 = i3;
                    bArr2 = bArr;
                    c0087k3 = c0087k;
                    i11 = i18;
                }
                if (i >= 0) {
                    return i;
                }
                i8 = -i;
                i5 = i2;
                i4 = -2;
            }
        } else {
            if (z2) {
                return -2;
            }
            return c0083g.indexOf(C0080d.f242e);
        }
    }

    /* renamed from: p */
    public final void m232p(long j2) {
        while (j2 > 0) {
            if (this.f239a == null) {
                throw new EOFException();
            }
            int min = (int) Math.min(j2, r0.f262c - r0.f261b);
            long j3 = min;
            this.f240b -= j3;
            j2 -= j3;
            C0087k c0087k = this.f239a;
            int i = c0087k.f261b + min;
            c0087k.f261b = i;
            if (i == c0087k.f262c) {
                this.f239a = c0087k.m250a();
                AbstractC0088l.m271h0(c0087k);
            }
        }
    }

    /* renamed from: q */
    public final C0087k m233q(int i) {
        if (i < 1 || i > 8192) {
            throw new IllegalArgumentException();
        }
        C0087k c0087k = this.f239a;
        if (c0087k == null) {
            C0087k m279q0 = AbstractC0088l.m279q0();
            this.f239a = m279q0;
            m279q0.f266g = m279q0;
            m279q0.f265f = m279q0;
            return m279q0;
        }
        C0087k c0087k2 = c0087k.f266g;
        if (c0087k2.f262c + i <= 8192 && c0087k2.f264e) {
            return c0087k2;
        }
        C0087k m279q02 = AbstractC0088l.m279q0();
        c0087k2.m251b(m279q02);
        return m279q02;
    }

    /* renamed from: r */
    public final void m234r(C0077a c0077a, long j2) {
        C0087k m279q0;
        if (c0077a == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (c0077a == this) {
            throw new IllegalArgumentException("source == this");
        }
        AbstractC0091o.m324a(c0077a.f240b, 0L, j2);
        while (j2 > 0) {
            C0087k c0087k = c0077a.f239a;
            int i = c0087k.f262c - c0087k.f261b;
            if (j2 < i) {
                C0087k c0087k2 = this.f239a;
                C0087k c0087k3 = c0087k2 != null ? c0087k2.f266g : null;
                if (c0087k3 != null && c0087k3.f264e) {
                    if ((c0087k3.f262c + j2) - (c0087k3.f263d ? 0 : c0087k3.f261b) <= 8192) {
                        c0087k.m253d(c0087k3, (int) j2);
                        c0077a.f240b -= j2;
                        this.f240b += j2;
                        return;
                    }
                }
                int i2 = (int) j2;
                if (i2 <= 0 || i2 > i) {
                    throw new IllegalArgumentException();
                }
                if (i2 >= 1024) {
                    m279q0 = c0087k.m252c();
                } else {
                    m279q0 = AbstractC0088l.m279q0();
                    System.arraycopy(c0087k.f260a, c0087k.f261b, m279q0.f260a, 0, i2);
                }
                m279q0.f262c = m279q0.f261b + i2;
                c0087k.f261b += i2;
                c0087k.f266g.m251b(m279q0);
                c0077a.f239a = m279q0;
            }
            C0087k c0087k4 = c0077a.f239a;
            long j3 = c0087k4.f262c - c0087k4.f261b;
            c0077a.f239a = c0087k4.m250a();
            C0087k c0087k5 = this.f239a;
            if (c0087k5 == null) {
                this.f239a = c0087k4;
                c0087k4.f266g = c0087k4;
                c0087k4.f265f = c0087k4;
            } else {
                c0087k5.f266g.m251b(c0087k4);
                C0087k c0087k6 = c0087k4.f266g;
                if (c0087k6 == c0087k4) {
                    throw new IllegalStateException();
                }
                if (c0087k6.f264e) {
                    int i3 = c0087k4.f262c - c0087k4.f261b;
                    if (i3 <= (8192 - c0087k6.f262c) + (c0087k6.f263d ? 0 : c0087k6.f261b)) {
                        c0087k4.m253d(c0087k6, i3);
                        c0087k4.m250a();
                        AbstractC0088l.m271h0(c0087k4);
                    }
                }
            }
            c0077a.f240b -= j3;
            this.f240b += j3;
            j2 -= j3;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C0087k c0087k = this.f239a;
        if (c0087k == null) {
            return -1;
        }
        int min = Math.min(byteBuffer.remaining(), c0087k.f262c - c0087k.f261b);
        byteBuffer.put(c0087k.f260a, c0087k.f261b, min);
        int i = c0087k.f261b + min;
        c0087k.f261b = i;
        this.f240b -= min;
        if (i == c0087k.f262c) {
            this.f239a = c0087k.m250a();
            AbstractC0088l.m271h0(c0087k);
        }
        return min;
    }

    /* renamed from: s */
    public final void m235s(int i) {
        C0087k m233q = m233q(1);
        int i2 = m233q.f262c;
        m233q.f262c = i2 + 1;
        m233q.f260a[i2] = (byte) i;
        this.f240b++;
    }

    /* renamed from: t */
    public final void m236t(int i) {
        C0087k m233q = m233q(4);
        int i2 = m233q.f262c;
        byte b2 = (byte) ((i >>> 24) & Function.USE_VARARGS);
        byte[] bArr = m233q.f260a;
        bArr[i2] = b2;
        bArr[i2 + 1] = (byte) ((i >>> 16) & Function.USE_VARARGS);
        bArr[i2 + 2] = (byte) ((i >>> 8) & Function.USE_VARARGS);
        bArr[i2 + 3] = (byte) (i & Function.USE_VARARGS);
        m233q.f262c = i2 + 4;
        this.f240b += 4;
    }

    public final String toString() {
        long j2 = this.f240b;
        if (j2 <= 2147483647L) {
            int i = (int) j2;
            return (i == 0 ? C0080d.f242e : new C0089m(this, i)).toString();
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f240b);
    }

    /* renamed from: u */
    public final void m237u(String str, int i, int i2) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "beginIndex < 0: "));
        }
        if (i2 < i) {
            throw new IllegalArgumentException("endIndex < beginIndex: " + i2 + " < " + i);
        }
        if (i2 > str.length()) {
            throw new IllegalArgumentException("endIndex > string.length: " + i2 + " > " + str.length());
        }
        while (i < i2) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                C0087k m233q = m233q(1);
                int i3 = m233q.f262c - i;
                int min = Math.min(i2, 8192 - i3);
                int i4 = i + 1;
                byte[] bArr = m233q.f260a;
                bArr[i + i3] = (byte) charAt;
                while (i4 < min) {
                    char charAt2 = str.charAt(i4);
                    if (charAt2 >= 128) {
                        break;
                    }
                    bArr[i4 + i3] = (byte) charAt2;
                    i4++;
                }
                int i5 = m233q.f262c;
                int i6 = (i3 + i4) - i5;
                m233q.f262c = i5 + i6;
                this.f240b += i6;
                i = i4;
            } else {
                if (charAt < 2048) {
                    m235s((charAt >> 6) | 192);
                    m235s((charAt & '?') | 128);
                } else if (charAt < 55296 || charAt > 57343) {
                    m235s((charAt >> '\f') | 224);
                    m235s(((charAt >> 6) & 63) | 128);
                    m235s((charAt & '?') | 128);
                } else {
                    int i7 = i + 1;
                    char charAt3 = i7 < i2 ? str.charAt(i7) : (char) 0;
                    if (charAt > 56319 || charAt3 < 56320 || charAt3 > 57343) {
                        m235s(63);
                        i = i7;
                    } else {
                        int i8 = (((charAt & 10239) << 10) | (9215 & charAt3)) + 65536;
                        m235s((i8 >> 18) | 240);
                        m235s(((i8 >> 12) & 63) | 128);
                        m235s(((i8 >> 6) & 63) | 128);
                        m235s((i8 & 63) | 128);
                        i += 2;
                    }
                }
                i++;
            }
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            throw new IllegalArgumentException("source == null");
        }
        int remaining = byteBuffer.remaining();
        int i = remaining;
        while (i > 0) {
            C0087k m233q = m233q(1);
            int min = Math.min(i, 8192 - m233q.f262c);
            byteBuffer.get(m233q.f260a, m233q.f262c, min);
            i -= min;
            m233q.f262c += min;
        }
        this.f240b += remaining;
        return remaining;
    }
}
