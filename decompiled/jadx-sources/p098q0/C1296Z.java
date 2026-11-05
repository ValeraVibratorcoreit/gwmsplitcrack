package p098q0;

import p097q.AbstractC1241e;

/* renamed from: q0.Z */
/* loaded from: classes.dex */
public final class C1296Z {

    /* renamed from: a */
    public final int f6044a;

    /* renamed from: b */
    public final String f6045b;

    /* renamed from: c */
    public final String f6046c;

    /* renamed from: d */
    public final String f6047d;

    /* renamed from: e */
    public final String f6048e;

    public C1296Z(int i, String str, String str2, String str3, String str4) {
        this.f6044a = i == 0 ? 1 : i;
        this.f6045b = str;
        this.f6046c = str2;
        this.f6047d = str3;
        this.f6048e = str4;
    }

    /* renamed from: a */
    public final String m3155a(int i) {
        int m2943b = AbstractC1241e.m2943b(i);
        if (m2943b == 1) {
            String str = this.f6047d;
            return str != null ? str : "";
        }
        if (m2943b != 2) {
            String str2 = this.f6046c;
            return str2 != null ? str2 : "";
        }
        String str3 = this.f6048e;
        return str3 != null ? str3 : "";
    }
}
