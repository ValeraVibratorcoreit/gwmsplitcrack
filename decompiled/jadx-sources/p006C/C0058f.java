package p006C;

import android.graphics.Insets;

/* renamed from: C.f */
/* loaded from: classes.dex */
public final class C0058f {

    /* renamed from: e */
    public static final C0058f f202e = new C0058f(0, 0, 0, 0);

    /* renamed from: a */
    public final int f203a;

    /* renamed from: b */
    public final int f204b;

    /* renamed from: c */
    public final int f205c;

    /* renamed from: d */
    public final int f206d;

    public C0058f(int i, int i2, int i3, int i4) {
        this.f203a = i;
        this.f204b = i2;
        this.f205c = i3;
        this.f206d = i4;
    }

    /* renamed from: a */
    public static C0058f m139a(C0058f c0058f, C0058f c0058f2) {
        return m140b(Math.max(c0058f.f203a, c0058f2.f203a), Math.max(c0058f.f204b, c0058f2.f204b), Math.max(c0058f.f205c, c0058f2.f205c), Math.max(c0058f.f206d, c0058f2.f206d));
    }

    /* renamed from: b */
    public static C0058f m140b(int i, int i2, int i3, int i4) {
        return (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) ? f202e : new C0058f(i, i2, i3, i4);
    }

    /* renamed from: c */
    public static C0058f m141c(Insets insets) {
        int i;
        int i2;
        int i3;
        int i4;
        i = insets.left;
        i2 = insets.top;
        i3 = insets.right;
        i4 = insets.bottom;
        return m140b(i, i2, i3, i4);
    }

    /* renamed from: d */
    public final Insets m142d() {
        return AbstractC0057e.m138a(this.f203a, this.f204b, this.f205c, this.f206d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0058f.class != obj.getClass()) {
            return false;
        }
        C0058f c0058f = (C0058f) obj;
        return this.f206d == c0058f.f206d && this.f203a == c0058f.f203a && this.f205c == c0058f.f205c && this.f204b == c0058f.f204b;
    }

    public final int hashCode() {
        return (((((this.f203a * 31) + this.f204b) * 31) + this.f205c) * 31) + this.f206d;
    }

    public final String toString() {
        return "Insets{left=" + this.f203a + ", top=" + this.f204b + ", right=" + this.f205c + ", bottom=" + this.f206d + '}';
    }
}
