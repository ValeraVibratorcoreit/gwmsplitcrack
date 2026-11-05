package p010D1;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import p006C.AbstractC0062j;

/* renamed from: D1.d */
/* loaded from: classes.dex */
public class C0080d implements Serializable, Comparable {

    /* renamed from: d */
    public static final char[] f241d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: e */
    public static final C0080d f242e = new C0080d((byte[]) new byte[0].clone());

    /* renamed from: a */
    public final byte[] f243a;

    /* renamed from: b */
    public transient int f244b;

    /* renamed from: c */
    public transient String f245c;

    public C0080d(byte[] bArr) {
        this.f243a = bArr;
    }

    /* renamed from: a */
    public static C0080d m238a(String str) {
        C0080d c0080d = new C0080d(str.getBytes(AbstractC0091o.f271a));
        c0080d.f245c = str;
        return c0080d;
    }

    /* renamed from: b */
    public byte mo239b(int i) {
        return this.f243a[i];
    }

    /* renamed from: c */
    public String mo240c() {
        byte[] bArr = this.f243a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f241d;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:?, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
    
        if (r0 < r1) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (r7 < r8) goto L9;
     */
    @Override // java.lang.Comparable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compareTo(Object obj) {
        C0080d c0080d = (C0080d) obj;
        int mo244g = mo244g();
        int mo244g2 = c0080d.mo244g();
        int min = Math.min(mo244g, mo244g2);
        for (int i = 0; i < min; i++) {
            int mo239b = mo239b(i) & 255;
            int mo239b2 = c0080d.mo239b(i) & 255;
            if (mo239b == mo239b2) {
            }
        }
        if (mo244g == mo244g2) {
            return 0;
        }
    }

    /* renamed from: d */
    public byte[] mo241d() {
        return this.f243a;
    }

    /* renamed from: e */
    public boolean mo242e(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f243a;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3) {
                Charset charset = AbstractC0091o.f271a;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (bArr2[i4 + i] == bArr[i4 + i2]) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0080d) {
            C0080d c0080d = (C0080d) obj;
            int mo244g = c0080d.mo244g();
            byte[] bArr = this.f243a;
            if (mo244g == bArr.length && c0080d.mo242e(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo243f(C0080d c0080d, int i) {
        return c0080d.mo242e(0, this.f243a, 0, i);
    }

    /* renamed from: g */
    public int mo244g() {
        return this.f243a.length;
    }

    /* renamed from: h */
    public C0080d mo245h() {
        byte[] bArr = this.f243a;
        if (64 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + bArr.length + ")");
        }
        if (64 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[64];
        System.arraycopy(bArr, 0, bArr2, 0, 64);
        return new C0080d(bArr2);
    }

    public int hashCode() {
        int i = this.f244b;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f243a);
        this.f244b = hashCode;
        return hashCode;
    }

    /* renamed from: i */
    public String mo246i() {
        String str = this.f245c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f243a, AbstractC0091o.f271a);
        this.f245c = str2;
        return str2;
    }

    public String toString() {
        byte[] bArr = this.f243a;
        if (bArr.length == 0) {
            return "[size=0]";
        }
        String mo246i = mo246i();
        int length = mo246i.length();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                i = mo246i.length();
                break;
            }
            if (i2 == 64) {
                break;
            }
            int codePointAt = mo246i.codePointAt(i);
            if ((!Character.isISOControl(codePointAt) || codePointAt == 10 || codePointAt == 13) && codePointAt != 65533) {
                i2++;
                i += Character.charCount(codePointAt);
            }
        }
        i = -1;
        if (i != -1) {
            String replace = mo246i.substring(0, i).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
            if (i >= mo246i.length()) {
                return AbstractC0062j.m161o("[text=", replace, "]");
            }
            return "[size=" + bArr.length + " text=" + replace + "…]";
        }
        if (bArr.length <= 64) {
            return "[hex=" + mo240c() + "]";
        }
        return "[size=" + bArr.length + " hex=" + mo245h().mo240c() + "…]";
    }
}
