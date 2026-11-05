package p063d1;

import p006C.AbstractC0062j;
import p046X.C0421t;
import p069f1.AbstractC0832d;
import p084l1.C1158a;
import p084l1.C1160c;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d1.x */
/* loaded from: classes.dex */
public abstract class EnumC0763x {

    /* renamed from: a */
    public static final C0759t f3890a;

    /* renamed from: b */
    public static final C0760u f3891b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC0763x[] f3892c;

    static {
        C0759t c0759t = new C0759t();
        f3890a = c0759t;
        C0760u c0760u = new C0760u();
        f3891b = c0760u;
        f3892c = new EnumC0763x[]{c0759t, c0760u, new EnumC0763x() { // from class: d1.v
            /* renamed from: b */
            public static Double m2204b(String str, C1158a c1158a) {
                try {
                    Double valueOf = Double.valueOf(str);
                    if (!valueOf.isInfinite()) {
                        if (valueOf.isNaN()) {
                        }
                        return valueOf;
                    }
                    if (c1158a.f5321o != 1) {
                        throw new C1160c("JSON forbids NaN and infinities: " + valueOf + "; at path " + c1158a.m2804o(true));
                    }
                    return valueOf;
                } catch (NumberFormatException e2) {
                    StringBuilder m163q = AbstractC0062j.m163q("Cannot parse ", str, "; at path ");
                    m163q.append(c1158a.m2804o(true));
                    throw new C0421t(m163q.toString(), e2);
                }
            }

            @Override // p063d1.EnumC0763x
            /* renamed from: a */
            public final Number mo2203a(C1158a c1158a) {
                String m2786A = c1158a.m2786A();
                if (m2786A.indexOf(46) >= 0) {
                    return m2204b(m2786A, c1158a);
                }
                try {
                    return Long.valueOf(Long.parseLong(m2786A));
                } catch (NumberFormatException unused) {
                    return m2204b(m2786A, c1158a);
                }
            }
        }, new EnumC0763x() { // from class: d1.w
            @Override // p063d1.EnumC0763x
            /* renamed from: a */
            public final Number mo2203a(C1158a c1158a) {
                String m2786A = c1158a.m2786A();
                try {
                    return AbstractC0832d.m2358i(m2786A);
                } catch (NumberFormatException e2) {
                    StringBuilder m163q = AbstractC0062j.m163q("Cannot parse ", m2786A, "; at path ");
                    m163q.append(c1158a.m2804o(true));
                    throw new C0421t(m163q.toString(), e2);
                }
            }
        }};
    }

    public static EnumC0763x valueOf(String str) {
        return (EnumC0763x) Enum.valueOf(EnumC0763x.class, str);
    }

    public static EnumC0763x[] values() {
        return (EnumC0763x[]) f3892c.clone();
    }

    /* renamed from: a */
    public abstract Number mo2203a(C1158a c1158a);
}
