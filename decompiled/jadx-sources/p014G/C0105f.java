package p014G;

import java.util.Locale;

/* renamed from: G.f */
/* loaded from: classes.dex */
public final class C0105f {

    /* renamed from: b */
    public static final C0105f f339b = new C0105f(new C0106g(AbstractC0104e.m345a(new Locale[0])));

    /* renamed from: a */
    public final C0106g f340a;

    public C0105f(C0106g c0106g) {
        this.f340a = c0106g;
    }

    /* renamed from: a */
    public static C0105f m348a(String str) {
        if (str == null || str.isEmpty()) {
            return f339b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            localeArr[i] = AbstractC0103d.m343a(split[i]);
        }
        return new C0105f(new C0106g(AbstractC0104e.m345a(localeArr)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C0105f) {
            if (this.f340a.equals(((C0105f) obj).f340a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f340a.f341a.hashCode();
    }

    public final String toString() {
        return this.f340a.f341a.toString();
    }
}
