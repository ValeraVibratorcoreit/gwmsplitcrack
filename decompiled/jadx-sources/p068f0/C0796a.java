package p068f0;

/* renamed from: f0.a */
/* loaded from: classes.dex */
public final class C0796a {

    /* renamed from: a */
    public int f4019a;

    /* renamed from: b */
    public int f4020b;

    /* renamed from: c */
    public int f4021c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0796a.class != obj.getClass()) {
            return false;
        }
        C0796a c0796a = (C0796a) obj;
        int i = this.f4019a;
        if (i != c0796a.f4019a) {
            return false;
        }
        if (i == 8 && Math.abs(this.f4021c - this.f4020b) == 1 && this.f4021c == c0796a.f4020b && this.f4020b == c0796a.f4021c) {
            return true;
        }
        return this.f4021c == c0796a.f4021c && this.f4020b == c0796a.f4020b;
    }

    public final int hashCode() {
        return (((this.f4019a * 31) + this.f4020b) * 31) + this.f4021c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.f4019a;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.f4020b);
        sb.append("c:");
        sb.append(this.f4021c);
        sb.append(",p:null]");
        return sb.toString();
    }
}
