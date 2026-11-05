package p010D1;

import java.nio.charset.Charset;

/* renamed from: D1.o */
/* loaded from: classes.dex */
public abstract class AbstractC0091o {

    /* renamed from: a */
    public static final Charset f271a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static void m324a(long j2, long j3, long j4) {
        if ((j3 | j4) < 0 || j3 > j2 || j2 - j3 < j4) {
            throw new ArrayIndexOutOfBoundsException("size=" + j2 + " offset=" + j3 + " byteCount=" + j4);
        }
    }
}
