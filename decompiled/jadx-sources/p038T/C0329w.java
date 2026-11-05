package p038T;

import java.nio.ByteBuffer;
import p040U.C0336a;
import p040U.C0337b;

/* renamed from: T.w */
/* loaded from: classes.dex */
public final class C0329w {

    /* renamed from: d */
    public static final ThreadLocal f931d = new ThreadLocal();

    /* renamed from: a */
    public final int f932a;

    /* renamed from: b */
    public final C0326t f933b;

    /* renamed from: c */
    public volatile int f934c = 0;

    public C0329w(C0326t c0326t, int i) {
        this.f933b = c0326t;
        this.f932a = i;
    }

    /* renamed from: a */
    public final int m926a(int i) {
        C0336a m928c = m928c();
        int m415a = m928c.m415a(16);
        if (m415a == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) m928c.f470d;
        int i2 = m415a + m928c.f467a;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i2) + i2 + 4);
    }

    /* renamed from: b */
    public final int m927b() {
        C0336a m928c = m928c();
        int m415a = m928c.m415a(16);
        if (m415a == 0) {
            return 0;
        }
        int i = m415a + m928c.f467a;
        return ((ByteBuffer) m928c.f470d).getInt(((ByteBuffer) m928c.f470d).getInt(i) + i);
    }

    /* renamed from: c */
    public final C0336a m928c() {
        ThreadLocal threadLocal = f931d;
        C0336a c0336a = (C0336a) threadLocal.get();
        if (c0336a == null) {
            c0336a = new C0336a();
            threadLocal.set(c0336a);
        }
        C0337b c0337b = (C0337b) this.f933b.f923a;
        int m415a = c0337b.m415a(6);
        if (m415a != 0) {
            int i = m415a + c0337b.f467a;
            int i2 = (this.f932a * 4) + ((ByteBuffer) c0337b.f470d).getInt(i) + i + 4;
            int i3 = ((ByteBuffer) c0337b.f470d).getInt(i2) + i2;
            ByteBuffer byteBuffer = (ByteBuffer) c0337b.f470d;
            c0336a.f470d = byteBuffer;
            if (byteBuffer != null) {
                c0336a.f467a = i3;
                int i4 = i3 - byteBuffer.getInt(i3);
                c0336a.f468b = i4;
                c0336a.f469c = ((ByteBuffer) c0336a.f470d).getShort(i4);
            } else {
                c0336a.f467a = 0;
                c0336a.f468b = 0;
                c0336a.f469c = 0;
            }
        }
        return c0336a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C0336a m928c = m928c();
        int m415a = m928c.m415a(4);
        sb.append(Integer.toHexString(m415a != 0 ? ((ByteBuffer) m928c.f470d).getInt(m415a + m928c.f467a) : 0));
        sb.append(", codepoints:");
        int m927b = m927b();
        for (int i = 0; i < m927b; i++) {
            sb.append(Integer.toHexString(m926a(i)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
