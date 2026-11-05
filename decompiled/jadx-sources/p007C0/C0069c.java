package p007C0;

import android.animation.TimeInterpolator;

/* renamed from: C0.c */
/* loaded from: classes.dex */
public final class C0069c {

    /* renamed from: a */
    public long f230a;

    /* renamed from: b */
    public long f231b;

    /* renamed from: c */
    public TimeInterpolator f232c;

    /* renamed from: d */
    public int f233d;

    /* renamed from: e */
    public int f234e;

    /* renamed from: a */
    public final TimeInterpolator m198a() {
        TimeInterpolator timeInterpolator = this.f232c;
        return timeInterpolator != null ? timeInterpolator : AbstractC0067a.f225b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0069c)) {
            return false;
        }
        C0069c c0069c = (C0069c) obj;
        if (this.f230a == c0069c.f230a && this.f231b == c0069c.f231b && this.f233d == c0069c.f233d && this.f234e == c0069c.f234e) {
            return m198a().getClass().equals(c0069c.m198a().getClass());
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.f230a;
        long j3 = this.f231b;
        return ((((m198a().getClass().hashCode() + (((((int) (j2 ^ (j2 >>> 32))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31)) * 31) + this.f233d) * 31) + this.f234e;
    }

    public final String toString() {
        return "\n" + C0069c.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + this.f230a + " duration: " + this.f231b + " interpolator: " + m198a().getClass() + " repeatCount: " + this.f233d + " repeatMode: " + this.f234e + "}\n";
    }
}
