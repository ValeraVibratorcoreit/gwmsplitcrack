package p062d0;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* renamed from: d0.j */
/* loaded from: classes.dex */
public final class C0737j {

    /* renamed from: a */
    public final int f3858a;

    /* renamed from: b */
    public final int f3859b;

    /* renamed from: c */
    public final long f3860c;

    /* renamed from: d */
    public final long f3861d;

    public C0737j(int i, int i2, long j2, long j3) {
        this.f3858a = i;
        this.f3859b = i2;
        this.f3860c = j2;
        this.f3861d = j3;
    }

    /* renamed from: a */
    public static C0737j m2188a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C0737j c0737j = new C0737j(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c0737j;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2189b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f3858a);
            dataOutputStream.writeInt(this.f3859b);
            dataOutputStream.writeLong(this.f3860c);
            dataOutputStream.writeLong(this.f3861d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C0737j)) {
            return false;
        }
        C0737j c0737j = (C0737j) obj;
        return this.f3859b == c0737j.f3859b && this.f3860c == c0737j.f3860c && this.f3858a == c0737j.f3858a && this.f3861d == c0737j.f3861d;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f3859b), Long.valueOf(this.f3860c), Integer.valueOf(this.f3858a), Long.valueOf(this.f3861d));
    }
}
