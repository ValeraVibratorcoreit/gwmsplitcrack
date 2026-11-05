package p084l1;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Pattern;
import p063d1.C0748i;

/* renamed from: l1.b */
/* loaded from: classes.dex */
public class C1159b implements Closeable, Flushable {

    /* renamed from: k */
    public static final Pattern f5322k = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: l */
    public static final String[] f5323l = new String[128];

    /* renamed from: a */
    public final Writer f5324a;

    /* renamed from: b */
    public int[] f5325b;

    /* renamed from: c */
    public int f5326c;

    /* renamed from: d */
    public final C0748i f5327d;

    /* renamed from: e */
    public final String f5328e;

    /* renamed from: f */
    public final String f5329f;

    /* renamed from: g */
    public final boolean f5330g;

    /* renamed from: h */
    public int f5331h;

    /* renamed from: i */
    public String f5332i;

    /* renamed from: j */
    public final boolean f5333j;

    static {
        for (int i = 0; i <= 31; i++) {
            f5323l[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = f5323l;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C1159b(Writer writer) {
        int[] iArr = new int[32];
        this.f5325b = iArr;
        boolean z2 = false;
        this.f5326c = 0;
        if (iArr.length == 0) {
            this.f5325b = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.f5325b;
        int i = this.f5326c;
        this.f5326c = i + 1;
        iArr2[i] = 6;
        this.f5331h = 2;
        this.f5333j = true;
        Objects.requireNonNull(writer, "out == null");
        this.f5324a = writer;
        C0748i c0748i = C0748i.f3870d;
        Objects.requireNonNull(c0748i);
        this.f5327d = c0748i;
        this.f5329f = ",";
        if (c0748i.f3873c) {
            this.f5328e = ": ";
            if (c0748i.f3871a.isEmpty()) {
                this.f5329f = ", ";
            }
        } else {
            this.f5328e = ":";
        }
        if (this.f5327d.f3871a.isEmpty() && this.f5327d.f3872b.isEmpty()) {
            z2 = true;
        }
        this.f5330g = z2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f5324a.close();
        int i = this.f5326c;
        if (i > 1 || (i == 1 && this.f5325b[i - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f5326c = 0;
    }

    /* renamed from: d */
    public final void m2816d() {
        int m2820l = m2820l();
        if (m2820l == 1) {
            this.f5325b[this.f5326c - 1] = 2;
            m2818j();
            return;
        }
        Writer writer = this.f5324a;
        if (m2820l == 2) {
            writer.append((CharSequence) this.f5329f);
            m2818j();
        } else {
            if (m2820l == 4) {
                writer.append((CharSequence) this.f5328e);
                this.f5325b[this.f5326c - 1] = 5;
                return;
            }
            if (m2820l != 6) {
                if (m2820l != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.f5331h != 1) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            this.f5325b[this.f5326c - 1] = 7;
        }
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.f5326c == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f5324a.flush();
    }

    /* renamed from: i */
    public final void m2817i(int i, int i2, char c2) {
        int m2820l = m2820l();
        if (m2820l != i2 && m2820l != i) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f5332i != null) {
            throw new IllegalStateException("Dangling name: " + this.f5332i);
        }
        this.f5326c--;
        if (m2820l == i2) {
            m2818j();
        }
        this.f5324a.write(c2);
    }

    /* renamed from: j */
    public final void m2818j() {
        if (this.f5330g) {
            return;
        }
        String str = this.f5327d.f3871a;
        Writer writer = this.f5324a;
        writer.write(str);
        int i = this.f5326c;
        for (int i2 = 1; i2 < i; i2++) {
            writer.write(this.f5327d.f3872b);
        }
    }

    /* renamed from: k */
    public C1159b m2819k() {
        if (this.f5332i != null) {
            if (!this.f5333j) {
                this.f5332i = null;
                return this;
            }
            m2822n();
        }
        m2816d();
        this.f5324a.write("null");
        return this;
    }

    /* renamed from: l */
    public final int m2820l() {
        int i = this.f5326c;
        if (i != 0) {
            return this.f5325b[i - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2821m(String str) {
        int i;
        String str2;
        Writer writer = this.f5324a;
        writer.write(34);
        int length = str.length();
        int i2 = 0;
        while (i < length) {
            char charAt = str.charAt(i);
            if (charAt < 128) {
                str2 = f5323l[charAt];
                i = str2 == null ? i + 1 : 0;
                if (i2 < i) {
                    writer.write(str, i2, i - i2);
                }
                writer.write(str2);
                i2 = i + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i2 < i) {
                }
                writer.write(str2);
                i2 = i + 1;
            }
        }
        if (i2 < length) {
            writer.write(str, i2, length - i2);
        }
        writer.write(34);
    }

    /* renamed from: n */
    public final void m2822n() {
        if (this.f5332i != null) {
            int m2820l = m2820l();
            if (m2820l == 5) {
                this.f5324a.write(this.f5329f);
            } else if (m2820l != 3) {
                throw new IllegalStateException("Nesting problem.");
            }
            m2818j();
            this.f5325b[this.f5326c - 1] = 4;
            m2821m(this.f5332i);
            this.f5332i = null;
        }
    }
}
