package p010D1;

import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import p045W0.C0355e;

/* renamed from: D1.e */
/* loaded from: classes.dex */
public final class C0081e implements InterfaceC0090n {

    /* renamed from: a */
    public final /* synthetic */ InputStream f246a;

    public C0081e(C0355e c0355e, InputStream inputStream) {
        this.f246a = inputStream;
    }

    @Override // p010D1.InterfaceC0090n
    /* renamed from: b */
    public final long mo218b(C0077a c0077a, long j2) {
        try {
            if (Thread.interrupted()) {
                Thread.currentThread().interrupt();
                throw new InterruptedIOException("interrupted");
            }
            C0087k m233q = c0077a.m233q(1);
            int read = this.f246a.read(m233q.f260a, m233q.f262c, (int) Math.min(8192L, 8192 - m233q.f262c));
            if (read != -1) {
                m233q.f262c += read;
                long j3 = read;
                c0077a.f240b += j3;
                return j3;
            }
            if (m233q.f261b != m233q.f262c) {
                return -1L;
            }
            c0077a.f239a = m233q.m250a();
            AbstractC0088l.m271h0(m233q);
            return -1L;
        } catch (AssertionError e2) {
            if (e2.getCause() == null || e2.getMessage() == null || !e2.getMessage().contains("getsockname failed")) {
                throw e2;
            }
            throw new IOException(e2);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f246a.close();
    }

    public final String toString() {
        return "source(" + this.f246a + ")";
    }
}
