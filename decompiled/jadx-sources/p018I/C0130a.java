package p018I;

/* renamed from: I.a */
/* loaded from: classes.dex */
public final class C0130a {

    /* renamed from: e */
    public static final byte[] f401e = new byte[1792];

    /* renamed from: a */
    public final CharSequence f402a;

    /* renamed from: b */
    public final int f403b;

    /* renamed from: c */
    public int f404c;

    /* renamed from: d */
    public char f405d;

    static {
        for (int i = 0; i < 1792; i++) {
            f401e[i] = Character.getDirectionality(i);
        }
    }

    public C0130a(CharSequence charSequence) {
        this.f402a = charSequence;
        this.f403b = charSequence.length();
    }

    /* renamed from: a */
    public final byte m386a() {
        int i = this.f404c - 1;
        CharSequence charSequence = this.f402a;
        char charAt = charSequence.charAt(i);
        this.f405d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.f404c);
            this.f404c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.f404c--;
        char c2 = this.f405d;
        return c2 < 1792 ? f401e[c2] : Character.getDirectionality(c2);
    }
}
