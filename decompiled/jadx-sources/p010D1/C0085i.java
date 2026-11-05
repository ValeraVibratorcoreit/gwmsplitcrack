package p010D1;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: D1.i */
/* loaded from: classes.dex */
public final class C0085i extends InputStream {

    /* renamed from: a */
    public final /* synthetic */ C0086j f256a;

    public C0085i(C0086j c0086j) {
        this.f256a = c0086j;
    }

    @Override // java.io.InputStream
    public final int available() {
        C0086j c0086j = this.f256a;
        if (c0086j.f259c) {
            throw new IOException("closed");
        }
        return (int) Math.min(c0086j.f257a.f240b, 2147483647L);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f256a.close();
    }

    @Override // java.io.InputStream
    public final int read() {
        C0086j c0086j = this.f256a;
        if (c0086j.f259c) {
            throw new IOException("closed");
        }
        C0077a c0077a = c0086j.f257a;
        if (c0077a.f240b == 0 && c0086j.f258b.mo218b(c0077a, 8192L) == -1) {
            return -1;
        }
        return c0077a.m228l() & 255;
    }

    public final String toString() {
        return this.f256a + ".inputStream()";
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        C0086j c0086j = this.f256a;
        if (!c0086j.f259c) {
            AbstractC0091o.m324a(bArr.length, i, i2);
            C0077a c0077a = c0086j.f257a;
            if (c0077a.f240b == 0 && c0086j.f258b.mo218b(c0077a, 8192L) == -1) {
                return -1;
            }
            return c0077a.m227k(bArr, i, i2);
        }
        throw new IOException("closed");
    }
}
