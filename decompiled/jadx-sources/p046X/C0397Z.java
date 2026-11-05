package p046X;

import android.util.Log;
import java.io.Writer;

/* renamed from: X.Z */
/* loaded from: classes.dex */
public final class C0397Z extends Writer {

    /* renamed from: b */
    public final StringBuilder f1227b = new StringBuilder(128);

    /* renamed from: a */
    public final String f1226a = "FragmentManager";

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        m1071d();
    }

    /* renamed from: d */
    public final void m1071d() {
        StringBuilder sb = this.f1227b;
        if (sb.length() > 0) {
            Log.d(this.f1226a, sb.toString());
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        m1071d();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c2 = cArr[i + i3];
            if (c2 == '\n') {
                m1071d();
            } else {
                this.f1227b.append(c2);
            }
        }
    }
}
