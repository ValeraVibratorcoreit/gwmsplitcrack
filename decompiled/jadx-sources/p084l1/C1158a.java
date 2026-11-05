package p084l1;

import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.Closeable;
import java.io.EOFException;
import java.io.StringReader;
import java.util.Arrays;
import p006C.AbstractC0062j;
import p069f1.C0833e;
import p097q.AbstractC1241e;

/* renamed from: l1.a */
/* loaded from: classes.dex */
public class C1158a implements Closeable {

    /* renamed from: a */
    public final StringReader f5307a;

    /* renamed from: h */
    public long f5314h;

    /* renamed from: i */
    public int f5315i;

    /* renamed from: j */
    public String f5316j;

    /* renamed from: k */
    public int[] f5317k;

    /* renamed from: m */
    public String[] f5319m;

    /* renamed from: n */
    public int[] f5320n;

    /* renamed from: o */
    public int f5321o = 2;

    /* renamed from: b */
    public final char[] f5308b = new char[1024];

    /* renamed from: c */
    public int f5309c = 0;

    /* renamed from: d */
    public int f5310d = 0;

    /* renamed from: e */
    public int f5311e = 0;

    /* renamed from: f */
    public int f5312f = 0;

    /* renamed from: g */
    public int f5313g = 0;

    /* renamed from: l */
    public int f5318l = 1;

    static {
        C0833e.f4218g = new C0833e(7);
    }

    public C1158a(StringReader stringReader) {
        int[] iArr = new int[32];
        this.f5317k = iArr;
        iArr[0] = 6;
        this.f5319m = new String[32];
        this.f5320n = new int[32];
        this.f5307a = stringReader;
    }

    /* renamed from: A */
    public final String m2786A() {
        String str;
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i == 10) {
            str = m2787B();
        } else if (i == 8) {
            str = m2815z('\'');
        } else if (i == 9) {
            str = m2815z('\"');
        } else if (i == 11) {
            str = this.f5316j;
            this.f5316j = null;
        } else if (i == 15) {
            str = Long.toString(this.f5314h);
        } else {
            if (i != 16) {
                throw m2796K("a string");
            }
            str = new String(this.f5308b, this.f5309c, this.f5315i);
            this.f5309c += this.f5315i;
        }
        this.f5313g = 0;
        int[] iArr = this.f5320n;
        int i2 = this.f5318l - 1;
        iArr[i2] = iArr[i2] + 1;
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x004a, code lost:
    
        m2799j();
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:54:0x0044. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2787B() {
        char[] cArr;
        String sb;
        StringBuilder sb2 = null;
        int i = 0;
        do {
            int i2 = 0;
            while (true) {
                int i3 = this.f5309c;
                int i4 = i3 + i2;
                int i5 = this.f5310d;
                cArr = this.f5308b;
                if (i4 < i5) {
                    char c2 = cArr[i3 + i2];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else if (i2 >= cArr.length) {
                    if (sb2 == null) {
                        sb2 = new StringBuilder(Math.max(i2, 16));
                    }
                    sb2.append(cArr, this.f5309c, i2);
                    this.f5309c += i2;
                } else if (m2803n(i2 + 1)) {
                }
            }
            i = i2;
            if (sb2 != null) {
                sb = new String(cArr, this.f5309c, i);
            } else {
                sb2.append(cArr, this.f5309c, i);
                sb = sb2.toString();
            }
            this.f5309c += i;
            return sb;
        } while (m2803n(1));
        if (sb2 != null) {
        }
        this.f5309c += i;
        return sb;
    }

    /* renamed from: C */
    public final int m2788C() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        switch (i) {
            case 1:
                return 3;
            case 2:
                return 4;
            case 3:
                return 1;
            case 4:
                return 2;
            case 5:
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
            case Platform.GNU /* 9 */:
            case Platform.KFREEBSD /* 10 */:
            case Platform.NETBSD /* 11 */:
                return 6;
            case Platform.DRAGONFLYBSD /* 12 */:
            case 13:
            case 14:
                return 5;
            case 15:
            case DLLCallback.DLL_FPTRS /* 16 */:
                return 7;
            case 17:
                return 10;
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: D */
    public final void m2789D(int i) {
        int i2 = this.f5318l;
        int[] iArr = this.f5317k;
        if (i2 == iArr.length) {
            int i3 = i2 * 2;
            this.f5317k = Arrays.copyOf(iArr, i3);
            this.f5320n = Arrays.copyOf(this.f5320n, i3);
            this.f5319m = (String[]) Arrays.copyOf(this.f5319m, i3);
        }
        int[] iArr2 = this.f5317k;
        int i4 = this.f5318l;
        this.f5318l = i4 + 1;
        iArr2[i4] = i;
    }

    /* renamed from: E */
    public final char m2790E() {
        int i;
        if (this.f5309c == this.f5310d && !m2803n(1)) {
            m2795J("Unterminated escape sequence");
            throw null;
        }
        int i2 = this.f5309c;
        int i3 = i2 + 1;
        this.f5309c = i3;
        char[] cArr = this.f5308b;
        char c2 = cArr[i2];
        if (c2 != '\n') {
            if (c2 != '\"') {
                if (c2 != '\'') {
                    if (c2 != '/' && c2 != '\\') {
                        if (c2 == 'b') {
                            return '\b';
                        }
                        if (c2 == 'f') {
                            return '\f';
                        }
                        if (c2 == 'n') {
                            return '\n';
                        }
                        if (c2 == 'r') {
                            return '\r';
                        }
                        if (c2 == 't') {
                            return '\t';
                        }
                        if (c2 != 'u') {
                            m2795J("Invalid escape sequence");
                            throw null;
                        }
                        if (i2 + 5 > this.f5310d && !m2803n(4)) {
                            m2795J("Unterminated escape sequence");
                            throw null;
                        }
                        int i4 = this.f5309c;
                        int i5 = i4 + 4;
                        int i6 = 0;
                        while (i4 < i5) {
                            char c3 = cArr[i4];
                            int i7 = i6 << 4;
                            if (c3 >= '0' && c3 <= '9') {
                                i = c3 - '0';
                            } else if (c3 >= 'a' && c3 <= 'f') {
                                i = c3 - 'W';
                            } else {
                                if (c3 < 'A' || c3 > 'F') {
                                    m2795J("Malformed Unicode escape \\u".concat(new String(cArr, this.f5309c, 4)));
                                    throw null;
                                }
                                i = c3 - '7';
                            }
                            i6 = i + i7;
                            i4++;
                        }
                        this.f5309c += 4;
                        return (char) i6;
                    }
                }
            }
            return c2;
        }
        if (this.f5321o == 3) {
            m2795J("Cannot escape a newline character in strict mode");
            throw null;
        }
        this.f5311e++;
        this.f5312f = i3;
        if (this.f5321o == 3) {
            m2795J("Invalid escaped character \"'\" in strict mode");
            throw null;
        }
        return c2;
    }

    /* renamed from: F */
    public final void m2791F(char c2) {
        do {
            int i = this.f5309c;
            int i2 = this.f5310d;
            while (i < i2) {
                int i3 = i + 1;
                char c3 = this.f5308b[i];
                if (c3 == c2) {
                    this.f5309c = i3;
                    return;
                }
                if (c3 == '\\') {
                    this.f5309c = i3;
                    m2790E();
                    i = this.f5309c;
                    i2 = this.f5310d;
                } else {
                    if (c3 == '\n') {
                        this.f5311e++;
                        this.f5312f = i3;
                    }
                    i = i3;
                }
            }
            this.f5309c = i;
        } while (m2803n(1));
        m2795J("Unterminated string");
        throw null;
    }

    /* renamed from: G */
    public final void m2792G() {
        char c2;
        do {
            if (this.f5309c >= this.f5310d && !m2803n(1)) {
                return;
            }
            int i = this.f5309c;
            int i2 = i + 1;
            this.f5309c = i2;
            c2 = this.f5308b[i];
            if (c2 == '\n') {
                this.f5311e++;
                this.f5312f = i2;
                return;
            }
        } while (c2 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
    
        m2799j();
     */
    /* renamed from: H */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2793H() {
        do {
            int i = 0;
            while (true) {
                int i2 = this.f5309c;
                if (i2 + i < this.f5310d) {
                    char c2 = this.f5308b[i2 + i];
                    if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                        if (c2 != '#') {
                            if (c2 != ',') {
                                if (c2 != '/' && c2 != '=') {
                                    if (c2 != '{' && c2 != '}' && c2 != ':') {
                                        if (c2 != ';') {
                                            switch (c2) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i++;
                                            }
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    this.f5309c = i2 + i;
                }
            }
            this.f5309c += i;
            return;
        } while (m2803n(1));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: I */
    public final void m2794I() {
        int i = 0;
        do {
            int i2 = this.f5313g;
            if (i2 == 0) {
                i2 = m2800k();
            }
            switch (i2) {
                case 1:
                    m2789D(3);
                    i++;
                    this.f5313g = 0;
                    break;
                case 2:
                    if (i == 0) {
                        this.f5319m[this.f5318l - 1] = null;
                    }
                    this.f5318l--;
                    i--;
                    this.f5313g = 0;
                    break;
                case 3:
                    m2789D(1);
                    i++;
                    this.f5313g = 0;
                    break;
                case 4:
                    this.f5318l--;
                    i--;
                    this.f5313g = 0;
                    break;
                case 5:
                case 6:
                case 7:
                case Platform.NETBSD /* 11 */:
                case 15:
                default:
                    this.f5313g = 0;
                    break;
                case 8:
                    m2791F('\'');
                    this.f5313g = 0;
                    break;
                case Platform.GNU /* 9 */:
                    m2791F('\"');
                    this.f5313g = 0;
                    break;
                case Platform.KFREEBSD /* 10 */:
                    m2793H();
                    this.f5313g = 0;
                    break;
                case Platform.DRAGONFLYBSD /* 12 */:
                    m2791F('\'');
                    if (i == 0) {
                        this.f5319m[this.f5318l - 1] = "<skipped>";
                    }
                    this.f5313g = 0;
                    break;
                case 13:
                    m2791F('\"');
                    if (i == 0) {
                        this.f5319m[this.f5318l - 1] = "<skipped>";
                    }
                    this.f5313g = 0;
                    break;
                case 14:
                    m2793H();
                    if (i == 0) {
                        this.f5319m[this.f5318l - 1] = "<skipped>";
                    }
                    this.f5313g = 0;
                    break;
                case DLLCallback.DLL_FPTRS /* 16 */:
                    this.f5309c += this.f5315i;
                    this.f5313g = 0;
                    break;
                case 17:
                    break;
            }
            return;
        } while (i > 0);
        int[] iArr = this.f5320n;
        int i3 = this.f5318l - 1;
        iArr[i3] = iArr[i3] + 1;
    }

    /* renamed from: J */
    public final void m2795J(String str) {
        StringBuilder m2942a = AbstractC1241e.m2942a(str);
        m2942a.append(m2807r());
        m2942a.append("\nSee ");
        m2942a.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("malformed-json"));
        throw new C1160c(m2942a.toString());
    }

    /* renamed from: K */
    public final IllegalStateException m2796K(String str) {
        String str2 = m2788C() == 9 ? "adapter-not-null-safe" : "unexpected-json-structure";
        StringBuilder m163q = AbstractC0062j.m163q("Expected ", str, " but was ");
        m163q.append(AbstractC0062j.m146A(m2788C()));
        m163q.append(m2807r());
        m163q.append("\nSee ");
        m163q.append("https://github.com/google/gson/blob/main/Troubleshooting.md#".concat(str2));
        return new IllegalStateException(m163q.toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f5313g = 0;
        this.f5317k[0] = 8;
        this.f5318l = 1;
        this.f5307a.close();
    }

    /* renamed from: d */
    public final void m2797d() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i != 3) {
            throw m2796K("BEGIN_ARRAY");
        }
        m2789D(1);
        this.f5320n[this.f5318l - 1] = 0;
        this.f5313g = 0;
    }

    /* renamed from: i */
    public final void m2798i() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i != 1) {
            throw m2796K("BEGIN_OBJECT");
        }
        m2789D(3);
        this.f5313g = 0;
    }

    /* renamed from: j */
    public final void m2799j() {
        if (this.f5321o == 1) {
            return;
        }
        m2795J("Use JsonReader.setStrictness(Strictness.LENIENT) to accept malformed JSON");
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:115:0x0219, code lost:
    
        if (m2806q(r1) != false) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x021c, code lost:
    
        if (r6 != 2) goto L187;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x021e, code lost:
    
        if (r11 == false) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0224, code lost:
    
        if (r7 != Long.MIN_VALUE) goto L180;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0226, code lost:
    
        if (r15 == 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x022d, code lost:
    
        if (r7 != 0) goto L183;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x022f, code lost:
    
        if (r15 != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0231, code lost:
    
        if (r15 == 0) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0234, code lost:
    
        r7 = -r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0235, code lost:
    
        r19.f5314h = r7;
        r19.f5309c += r9;
        r10 = 15;
        r19.f5313g = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0229, code lost:
    
        r1 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0241, code lost:
    
        if (r6 == r1) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0244, code lost:
    
        if (r6 == 4) goto L192;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0247, code lost:
    
        if (r6 != 7) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0249, code lost:
    
        r19.f5315i = r9;
        r10 = 16;
        r19.f5313g = 16;
     */
    /* JADX WARN: Removed duplicated region for block: B:191:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x027f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e6  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m2800k() {
        int i;
        int m2813x;
        int i2;
        int m2813x2;
        int i3;
        String str;
        String str2;
        int i4;
        char c2;
        int i5;
        int i6;
        int[] iArr = this.f5317k;
        int i7 = 1;
        int i8 = this.f5318l - 1;
        int i9 = iArr[i8];
        char[] cArr = this.f5308b;
        if (i9 == 1) {
            iArr[i8] = 2;
        } else {
            if (i9 != 2) {
                if (i9 == 3) {
                    i = 4;
                } else if (i9 == 5) {
                    i = 4;
                } else if (i9 == 4) {
                    iArr[i8] = 5;
                    int m2813x3 = m2813x(true);
                    if (m2813x3 != 58) {
                        if (m2813x3 != 61) {
                            m2795J("Expected ':'");
                            throw null;
                        }
                        m2799j();
                        if (this.f5309c < this.f5310d || m2803n(1)) {
                            int i10 = this.f5309c;
                            if (cArr[i10] == '>') {
                                this.f5309c = i10 + 1;
                            }
                        }
                    }
                } else {
                    if (i9 != 6) {
                        if (i9 == 7) {
                            i2 = 0;
                            if (m2813x(false) == -1) {
                                this.f5313g = 17;
                                return 17;
                            }
                            m2799j();
                            this.f5309c--;
                        } else {
                            i2 = 0;
                            if (i9 == 8) {
                                throw new IllegalStateException("JsonReader is closed");
                            }
                        }
                        m2813x2 = m2813x(true);
                        if (m2813x2 != 34) {
                            this.f5313g = 9;
                            return 9;
                        }
                        if (m2813x2 == 39) {
                            m2799j();
                            this.f5313g = 8;
                            return 8;
                        }
                        if (m2813x2 == 44 || m2813x2 == 59) {
                            i3 = 1;
                        } else {
                            if (m2813x2 == 91) {
                                this.f5313g = 3;
                                return 3;
                            }
                            if (m2813x2 == 93) {
                                i3 = 1;
                                if (i9 == 1) {
                                    this.f5313g = 4;
                                    return 4;
                                }
                            } else {
                                if (m2813x2 == 123) {
                                    this.f5313g = 1;
                                    return 1;
                                }
                                int i11 = this.f5309c - 1;
                                this.f5309c = i11;
                                char c3 = cArr[i11];
                                if (c3 == 't' || c3 == 'T') {
                                    str = "true";
                                    str2 = "TRUE";
                                    i4 = 5;
                                } else if (c3 == 'f' || c3 == 'F') {
                                    str = "false";
                                    str2 = "FALSE";
                                    i4 = 6;
                                } else {
                                    if (c3 == 'n' || c3 == 'N') {
                                        str = "null";
                                        str2 = "NULL";
                                        i4 = 7;
                                    }
                                    i4 = i2;
                                    if (i4 == 0) {
                                        return i4;
                                    }
                                    int i12 = this.f5309c;
                                    int i13 = this.f5310d;
                                    int i14 = i2;
                                    int i15 = i14;
                                    int i16 = i15;
                                    boolean z2 = true;
                                    long j2 = 0;
                                    while (true) {
                                        if (i12 + i15 == i13) {
                                            if (i15 == cArr.length) {
                                                break;
                                            }
                                            if (!m2803n(i15 + 1)) {
                                                break;
                                            }
                                            int i17 = this.f5309c;
                                            i13 = this.f5310d;
                                            i12 = i17;
                                        }
                                        char c4 = cArr[i12 + i15];
                                        if (c4 != '+') {
                                            if (c4 == 'E' || c4 == 'e') {
                                                i5 = i13;
                                                if (i14 != 2 && i14 != 4) {
                                                    break;
                                                }
                                                i14 = 5;
                                                i15++;
                                                i13 = i5;
                                                i7 = 1;
                                            } else if (c4 == '-') {
                                                i5 = i13;
                                                if (i14 == 0) {
                                                    i14 = 1;
                                                    i16 = 1;
                                                    i15++;
                                                    i13 = i5;
                                                    i7 = 1;
                                                } else {
                                                    if (i14 != 5) {
                                                        break;
                                                    }
                                                    i14 = 6;
                                                    i15++;
                                                    i13 = i5;
                                                    i7 = 1;
                                                }
                                            } else if (c4 == '.') {
                                                i5 = i13;
                                                if (i14 != 2) {
                                                    break;
                                                }
                                                i14 = 3;
                                                i15++;
                                                i13 = i5;
                                                i7 = 1;
                                            } else {
                                                if (c4 < '0' || c4 > '9') {
                                                    break;
                                                }
                                                if (i14 == i7 || i14 == 0) {
                                                    i5 = i13;
                                                    j2 = -(c4 - '0');
                                                    i14 = 2;
                                                } else if (i14 != 2) {
                                                    i5 = i13;
                                                    if (i14 == 3) {
                                                        i14 = 4;
                                                    } else if (i14 == 5 || i14 == 6) {
                                                        i14 = 7;
                                                    }
                                                } else {
                                                    if (j2 == 0) {
                                                        break;
                                                    }
                                                    i5 = i13;
                                                    long j3 = (10 * j2) - (c4 - '0');
                                                    z2 &= j2 > -922337203685477580L || (j2 == -922337203685477580L && j3 < j2);
                                                    j2 = j3;
                                                }
                                                i15++;
                                                i13 = i5;
                                                i7 = 1;
                                            }
                                            if (i6 == 0) {
                                                return i6;
                                            }
                                            if (!m2806q(cArr[this.f5309c])) {
                                                m2795J("Expected value");
                                                throw null;
                                            }
                                            m2799j();
                                            this.f5313g = 10;
                                            return 10;
                                        }
                                        i5 = i13;
                                        if (i14 != 5) {
                                            break;
                                        }
                                        i14 = 6;
                                        i15++;
                                        i13 = i5;
                                        i7 = 1;
                                    }
                                    i6 = 0;
                                    if (i6 == 0) {
                                    }
                                }
                                int i18 = this.f5321o != 3 ? 1 : i2;
                                int length = str.length();
                                int i19 = i2;
                                while (true) {
                                    if (i19 < length) {
                                        if ((this.f5309c + i19 >= this.f5310d && !m2803n(i19 + 1)) || ((c2 = cArr[this.f5309c + i19]) != str.charAt(i19) && (i18 == 0 || c2 != str2.charAt(i19)))) {
                                            break;
                                        }
                                        i19++;
                                    } else if ((this.f5309c + length >= this.f5310d && !m2803n(length + 1)) || !m2806q(cArr[this.f5309c + length])) {
                                        this.f5309c += length;
                                        this.f5313g = i4;
                                    }
                                }
                                i4 = i2;
                                if (i4 == 0) {
                                }
                            }
                        }
                        if (i9 != i3 && i9 != 2) {
                            m2795J("Unexpected value");
                            throw null;
                        }
                        m2799j();
                        this.f5309c -= i3;
                        this.f5313g = 7;
                        return 7;
                    }
                    if (this.f5321o == 1) {
                        m2813x(true);
                        int i20 = this.f5309c;
                        this.f5309c = i20 - 1;
                        if (i20 + 4 <= this.f5310d || m2803n(5)) {
                            int i21 = this.f5309c;
                            if (cArr[i21] == ')' && cArr[i21 + 1] == ']' && cArr[i21 + 2] == '}' && cArr[i21 + 3] == '\'' && cArr[i21 + 4] == '\n') {
                                this.f5309c = i21 + 5;
                            }
                        }
                    }
                    this.f5317k[this.f5318l - 1] = 7;
                }
                iArr[i8] = i;
                if (i9 == 5 && (m2813x = m2813x(true)) != 44) {
                    if (m2813x != 59) {
                        if (m2813x == 125) {
                            this.f5313g = 2;
                            return 2;
                        }
                        m2795J("Unterminated object");
                        throw null;
                    }
                    m2799j();
                }
                int m2813x4 = m2813x(true);
                if (m2813x4 == 34) {
                    this.f5313g = 13;
                    return 13;
                }
                if (m2813x4 == 39) {
                    m2799j();
                    this.f5313g = 12;
                    return 12;
                }
                if (m2813x4 == 125) {
                    if (i9 != 5) {
                        this.f5313g = 2;
                        return 2;
                    }
                    m2795J("Expected name");
                    throw null;
                }
                m2799j();
                this.f5309c--;
                if (m2806q((char) m2813x4)) {
                    this.f5313g = 14;
                    return 14;
                }
                m2795J("Expected name");
                throw null;
            }
            int m2813x5 = m2813x(true);
            if (m2813x5 != 44) {
                if (m2813x5 != 59) {
                    if (m2813x5 == 93) {
                        this.f5313g = 4;
                        return 4;
                    }
                    m2795J("Unterminated array");
                    throw null;
                }
                m2799j();
            }
        }
        i2 = 0;
        m2813x2 = m2813x(true);
        if (m2813x2 != 34) {
        }
    }

    /* renamed from: l */
    public final void m2801l() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i != 4) {
            throw m2796K("END_ARRAY");
        }
        int i2 = this.f5318l;
        this.f5318l = i2 - 1;
        int[] iArr = this.f5320n;
        int i3 = i2 - 2;
        iArr[i3] = iArr[i3] + 1;
        this.f5313g = 0;
    }

    /* renamed from: m */
    public final void m2802m() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i != 2) {
            throw m2796K("END_OBJECT");
        }
        int i2 = this.f5318l;
        int i3 = i2 - 1;
        this.f5318l = i3;
        this.f5319m[i3] = null;
        int[] iArr = this.f5320n;
        int i4 = i2 - 2;
        iArr[i4] = iArr[i4] + 1;
        this.f5313g = 0;
    }

    /* renamed from: n */
    public final boolean m2803n(int i) {
        int i2;
        int i3;
        int i4 = this.f5312f;
        int i5 = this.f5309c;
        this.f5312f = i4 - i5;
        int i6 = this.f5310d;
        char[] cArr = this.f5308b;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f5310d = i7;
            System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f5310d = 0;
        }
        this.f5309c = 0;
        do {
            int i8 = this.f5310d;
            int read = this.f5307a.read(cArr, i8, cArr.length - i8);
            if (read == -1) {
                return false;
            }
            i2 = this.f5310d + read;
            this.f5310d = i2;
            if (this.f5311e == 0 && (i3 = this.f5312f) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.f5309c++;
                this.f5312f = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    /* renamed from: o */
    public final String m2804o(boolean z2) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.f5318l;
            if (i >= i2) {
                return sb.toString();
            }
            int i3 = this.f5317k[i];
            switch (i3) {
                case 1:
                case 2:
                    int i4 = this.f5320n[i];
                    if (z2 && i4 > 0 && i == i2 - 1) {
                        i4--;
                    }
                    sb.append('[');
                    sb.append(i4);
                    sb.append(']');
                    break;
                case 3:
                case 4:
                case 5:
                    sb.append('.');
                    String str = this.f5319m[i];
                    if (str == null) {
                        break;
                    } else {
                        sb.append(str);
                        break;
                    }
                case 6:
                case 7:
                case 8:
                    break;
                default:
                    throw new AssertionError(AbstractC0062j.m156j(i3, "Unknown scope value: "));
            }
            i++;
        }
    }

    /* renamed from: p */
    public final boolean m2805p() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        return (i == 2 || i == 4 || i == 17) ? false : true;
    }

    /* renamed from: q */
    public final boolean m2806q(char c2) {
        if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') {
            return false;
        }
        if (c2 != '#') {
            if (c2 == ',') {
                return false;
            }
            if (c2 != '/' && c2 != '=') {
                if (c2 == '{' || c2 == '}' || c2 == ':') {
                    return false;
                }
                if (c2 != ';') {
                    switch (c2) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        m2799j();
        return false;
    }

    /* renamed from: r */
    public final String m2807r() {
        return " at line " + (this.f5311e + 1) + " column " + ((this.f5309c - this.f5312f) + 1) + " path " + m2804o(false);
    }

    /* renamed from: s */
    public final boolean m2808s() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i == 5) {
            this.f5313g = 0;
            int[] iArr = this.f5320n;
            int i2 = this.f5318l - 1;
            iArr[i2] = iArr[i2] + 1;
            return true;
        }
        if (i != 6) {
            throw m2796K("a boolean");
        }
        this.f5313g = 0;
        int[] iArr2 = this.f5320n;
        int i3 = this.f5318l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return false;
    }

    /* renamed from: t */
    public final double m2809t() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i == 15) {
            this.f5313g = 0;
            int[] iArr = this.f5320n;
            int i2 = this.f5318l - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f5314h;
        }
        if (i == 16) {
            this.f5316j = new String(this.f5308b, this.f5309c, this.f5315i);
            this.f5309c += this.f5315i;
        } else if (i == 8 || i == 9) {
            this.f5316j = m2815z(i == 8 ? '\'' : '\"');
        } else if (i == 10) {
            this.f5316j = m2787B();
        } else if (i != 11) {
            throw m2796K("a double");
        }
        this.f5313g = 11;
        double parseDouble = Double.parseDouble(this.f5316j);
        if (this.f5321o != 1 && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            m2795J("JSON forbids NaN and infinities: " + parseDouble);
            throw null;
        }
        this.f5316j = null;
        this.f5313g = 0;
        int[] iArr2 = this.f5320n;
        int i3 = this.f5318l - 1;
        iArr2[i3] = iArr2[i3] + 1;
        return parseDouble;
    }

    public final String toString() {
        return C1158a.class.getSimpleName() + m2807r();
    }

    /* renamed from: u */
    public final int m2810u() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i == 15) {
            long j2 = this.f5314h;
            int i2 = (int) j2;
            if (j2 != i2) {
                throw new NumberFormatException("Expected an int but was " + this.f5314h + m2807r());
            }
            this.f5313g = 0;
            int[] iArr = this.f5320n;
            int i3 = this.f5318l - 1;
            iArr[i3] = iArr[i3] + 1;
            return i2;
        }
        if (i == 16) {
            this.f5316j = new String(this.f5308b, this.f5309c, this.f5315i);
            this.f5309c += this.f5315i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw m2796K("an int");
            }
            if (i == 10) {
                this.f5316j = m2787B();
            } else {
                this.f5316j = m2815z(i == 8 ? '\'' : '\"');
            }
            try {
                int parseInt = Integer.parseInt(this.f5316j);
                this.f5313g = 0;
                int[] iArr2 = this.f5320n;
                int i4 = this.f5318l - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f5313g = 11;
        double parseDouble = Double.parseDouble(this.f5316j);
        int i5 = (int) parseDouble;
        if (i5 != parseDouble) {
            throw new NumberFormatException("Expected an int but was " + this.f5316j + m2807r());
        }
        this.f5316j = null;
        this.f5313g = 0;
        int[] iArr3 = this.f5320n;
        int i6 = this.f5318l - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    /* renamed from: v */
    public final long m2811v() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i == 15) {
            this.f5313g = 0;
            int[] iArr = this.f5320n;
            int i2 = this.f5318l - 1;
            iArr[i2] = iArr[i2] + 1;
            return this.f5314h;
        }
        if (i == 16) {
            this.f5316j = new String(this.f5308b, this.f5309c, this.f5315i);
            this.f5309c += this.f5315i;
        } else {
            if (i != 8 && i != 9 && i != 10) {
                throw m2796K("a long");
            }
            if (i == 10) {
                this.f5316j = m2787B();
            } else {
                this.f5316j = m2815z(i == 8 ? '\'' : '\"');
            }
            try {
                long parseLong = Long.parseLong(this.f5316j);
                this.f5313g = 0;
                int[] iArr2 = this.f5320n;
                int i3 = this.f5318l - 1;
                iArr2[i3] = iArr2[i3] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f5313g = 11;
        double parseDouble = Double.parseDouble(this.f5316j);
        long j2 = (long) parseDouble;
        if (j2 != parseDouble) {
            throw new NumberFormatException("Expected a long but was " + this.f5316j + m2807r());
        }
        this.f5316j = null;
        this.f5313g = 0;
        int[] iArr3 = this.f5320n;
        int i4 = this.f5318l - 1;
        iArr3[i4] = iArr3[i4] + 1;
        return j2;
    }

    /* renamed from: w */
    public final String m2812w() {
        String m2815z;
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i == 14) {
            m2815z = m2787B();
        } else if (i == 12) {
            m2815z = m2815z('\'');
        } else {
            if (i != 13) {
                throw m2796K("a name");
            }
            m2815z = m2815z('\"');
        }
        this.f5313g = 0;
        this.f5319m[this.f5318l - 1] = m2815z;
        return m2815z;
    }

    /* renamed from: x */
    public final int m2813x(boolean z2) {
        int i = this.f5309c;
        int i2 = this.f5310d;
        while (true) {
            if (i == i2) {
                this.f5309c = i;
                if (!m2803n(1)) {
                    if (!z2) {
                        return -1;
                    }
                    throw new EOFException("End of input" + m2807r());
                }
                i = this.f5309c;
                i2 = this.f5310d;
            }
            int i3 = i + 1;
            char[] cArr = this.f5308b;
            char c2 = cArr[i];
            if (c2 == '\n') {
                this.f5311e++;
                this.f5312f = i3;
            } else if (c2 != ' ' && c2 != '\r' && c2 != '\t') {
                if (c2 == '/') {
                    this.f5309c = i3;
                    if (i3 == i2) {
                        this.f5309c = i;
                        boolean m2803n = m2803n(2);
                        this.f5309c++;
                        if (!m2803n) {
                            return c2;
                        }
                    }
                    m2799j();
                    int i4 = this.f5309c;
                    char c3 = cArr[i4];
                    if (c3 == '*') {
                        this.f5309c = i4 + 1;
                        while (true) {
                            if (this.f5309c + 2 > this.f5310d && !m2803n(2)) {
                                m2795J("Unterminated comment");
                                throw null;
                            }
                            int i5 = this.f5309c;
                            if (cArr[i5] != '\n') {
                                for (int i6 = 0; i6 < 2; i6++) {
                                    if (cArr[this.f5309c + i6] != "*/".charAt(i6)) {
                                        break;
                                    }
                                }
                                i = this.f5309c + 2;
                                i2 = this.f5310d;
                                break;
                            }
                            this.f5311e++;
                            this.f5312f = i5 + 1;
                            this.f5309c++;
                        }
                    } else {
                        if (c3 != '/') {
                            return c2;
                        }
                        this.f5309c = i4 + 1;
                        m2792G();
                        i = this.f5309c;
                        i2 = this.f5310d;
                    }
                } else {
                    if (c2 != '#') {
                        this.f5309c = i3;
                        return c2;
                    }
                    this.f5309c = i3;
                    m2799j();
                    m2792G();
                    i = this.f5309c;
                    i2 = this.f5310d;
                }
            }
            i = i3;
        }
    }

    /* renamed from: y */
    public final void m2814y() {
        int i = this.f5313g;
        if (i == 0) {
            i = m2800k();
        }
        if (i != 7) {
            throw m2796K("null");
        }
        this.f5313g = 0;
        int[] iArr = this.f5320n;
        int i2 = this.f5318l - 1;
        iArr[i2] = iArr[i2] + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x003d, code lost:
    
        r11.f5309c = r8;
        r8 = r8 - r3;
        r2 = r8 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        if (r1 != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0044, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max(r8 * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x006b, code lost:
    
        if (r1 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x006d, code lost:
    
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x007b, code lost:
    
        r1.append(r5, r3, r2 - r3);
        r11.f5309c = r2;
     */
    /* renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m2815z(char c2) {
        char[] cArr;
        int i;
        StringBuilder sb = null;
        do {
            int i2 = this.f5309c;
            int i3 = this.f5310d;
            while (true) {
                int i4 = i3;
                int i5 = i2;
                while (true) {
                    cArr = this.f5308b;
                    if (i2 >= i4) {
                        break;
                    }
                    int i6 = i2 + 1;
                    char c3 = cArr[i2];
                    if (this.f5321o == 3 && c3 < ' ') {
                        m2795J("Unescaped control characters (\\u0000-\\u001F) are not allowed in strict mode");
                        throw null;
                    }
                    if (c3 == c2) {
                        this.f5309c = i6;
                        int i7 = (i6 - i5) - 1;
                        if (sb == null) {
                            return new String(cArr, i5, i7);
                        }
                        sb.append(cArr, i5, i7);
                        return sb.toString();
                    }
                    if (c3 == '\\') {
                        break;
                    }
                    if (c3 == '\n') {
                        this.f5311e++;
                        this.f5312f = i6;
                    }
                    i2 = i6;
                }
                sb.append(cArr, i5, i);
                sb.append(m2790E());
                i2 = this.f5309c;
                i3 = this.f5310d;
            }
        } while (m2803n(1));
        m2795J("Unterminated string");
        throw null;
    }
}
