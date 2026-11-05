package p010D1;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: D1.j */
/* loaded from: classes.dex */
public final class C0086j implements InterfaceC0079c {

    /* renamed from: a */
    public final C0077a f257a = new C0077a();

    /* renamed from: b */
    public final InterfaceC0090n f258b;

    /* renamed from: c */
    public boolean f259c;

    public C0086j(InterfaceC0090n interfaceC0090n) {
        if (interfaceC0090n == null) {
            throw new NullPointerException("source == null");
        }
        this.f258b = interfaceC0090n;
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: a */
    public final C0077a mo217a() {
        return this.f257a;
    }

    @Override // p010D1.InterfaceC0090n
    /* renamed from: b */
    public final long mo218b(C0077a c0077a, long j2) {
        if (this.f259c) {
            throw new IllegalStateException("closed");
        }
        C0077a c0077a2 = this.f257a;
        if (c0077a2.f240b == 0 && this.f258b.mo218b(c0077a2, 8192L) == -1) {
            return -1L;
        }
        return c0077a2.mo218b(c0077a, Math.min(8192L, c0077a2.f240b));
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: c */
    public final boolean mo219c(long j2) {
        C0077a c0077a;
        if (j2 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j2);
        }
        if (this.f259c) {
            throw new IllegalStateException("closed");
        }
        do {
            c0077a = this.f257a;
            if (c0077a.f240b >= j2) {
                return true;
            }
        } while (this.f258b.mo218b(c0077a, 8192L) != -1);
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.f259c) {
            return;
        }
        this.f259c = true;
        this.f258b.close();
        C0077a c0077a = this.f257a;
        try {
            c0077a.m232p(c0077a.f240b);
        } catch (EOFException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: e */
    public final C0086j mo221e() {
        return new C0086j(new C0084h(this));
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: f */
    public final int mo222f(C0083g c0083g) {
        C0077a c0077a;
        if (this.f259c) {
            throw new IllegalStateException("closed");
        }
        do {
            c0077a = this.f257a;
            int m231o = c0077a.m231o(c0083g, true);
            if (m231o == -1) {
                return -1;
            }
            if (m231o != -2) {
                c0077a.m232p(c0083g.f248a[m231o].mo244g());
                return m231o;
            }
        } while (this.f258b.mo218b(c0077a, 8192L) != -1);
        return -1;
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: g */
    public final long mo223g(C0080d c0080d) {
        if (this.f259c) {
            throw new IllegalStateException("closed");
        }
        long j2 = 0;
        while (true) {
            C0077a c0077a = this.f257a;
            long m225i = c0077a.m225i(c0080d, j2);
            if (m225i != -1) {
                return m225i;
            }
            long j3 = c0077a.f240b;
            if (this.f258b.mo218b(c0077a, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, (j3 - c0080d.mo244g()) + 1);
        }
    }

    @Override // p010D1.InterfaceC0079c
    /* renamed from: h */
    public final long mo224h(C0080d c0080d) {
        if (this.f259c) {
            throw new IllegalStateException("closed");
        }
        long j2 = 0;
        while (true) {
            C0077a c0077a = this.f257a;
            long m226j = c0077a.m226j(c0080d, j2);
            if (m226j != -1) {
                return m226j;
            }
            long j3 = c0077a.f240b;
            if (this.f258b.mo218b(c0077a, 8192L) == -1) {
                return -1L;
            }
            j2 = Math.max(j2, j3);
        }
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.f259c;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        C0077a c0077a = this.f257a;
        if (c0077a.f240b == 0 && this.f258b.mo218b(c0077a, 8192L) == -1) {
            return -1;
        }
        return c0077a.read(byteBuffer);
    }

    public final String toString() {
        return "buffer(" + this.f258b + ")";
    }
}
