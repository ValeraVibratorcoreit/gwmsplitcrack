package p063d1;

/* renamed from: d1.i */
/* loaded from: classes.dex */
public final class C0748i {

    /* renamed from: d */
    public static final C0748i f3870d = new C0748i("", "", false);

    /* renamed from: a */
    public final String f3871a;

    /* renamed from: b */
    public final String f3872b;

    /* renamed from: c */
    public final boolean f3873c;

    static {
        new C0748i("\n", "  ", true);
    }

    public C0748i(String str, String str2, boolean z2) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f3871a = str;
        this.f3872b = str2;
        this.f3873c = z2;
    }
}
