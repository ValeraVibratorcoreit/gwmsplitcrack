package p078j1;

import p078j1.C0996a;
import p078j1.C0997b;

/* renamed from: j1.e */
/* loaded from: classes.dex */
public abstract class AbstractC1000e {

    /* renamed from: a */
    public static final boolean f4736a;

    /* renamed from: b */
    public static final C0996a.a f4737b;

    /* renamed from: c */
    public static final C0997b.a f4738c;

    /* renamed from: d */
    public static final C0998c f4739d;

    static {
        boolean z2;
        try {
            Class.forName("java.sql.Date");
            z2 = true;
        } catch (ClassNotFoundException unused) {
            z2 = false;
        }
        f4736a = z2;
        if (z2) {
            f4737b = C0996a.f4730b;
            f4738c = C0997b.f4732b;
            f4739d = C0999d.f4734b;
        } else {
            f4737b = null;
            f4738c = null;
            f4739d = null;
        }
    }
}
