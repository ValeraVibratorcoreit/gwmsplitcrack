package p018I;

import android.text.SpannableStringBuilder;
import com.sun.jna.win32.DLLCallback;
import p017H0.C0125d;

/* renamed from: I.b */
/* loaded from: classes.dex */
public final class C0131b {

    /* renamed from: b */
    public static final String f406b;

    /* renamed from: c */
    public static final String f407c;

    /* renamed from: d */
    public static final C0131b f408d;

    /* renamed from: e */
    public static final C0131b f409e;

    /* renamed from: a */
    public final boolean f410a;

    static {
        C0125d c0125d = AbstractC0136g.f418c;
        f406b = Character.toString((char) 8206);
        f407c = Character.toString((char) 8207);
        f408d = new C0131b(false);
        f409e = new C0131b(true);
    }

    public C0131b(boolean z2) {
        C0125d c0125d = AbstractC0136g.f416a;
        this.f410a = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x008f, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0070, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0073, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0079, code lost:
    
        if (r0.f404c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007f, code lost:
    
        switch(r0.m386a()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0083, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0086, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0089, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x008c, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:?, code lost:
    
        return 0;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m387a(CharSequence charSequence) {
        byte directionality;
        C0130a c0130a = new C0130a(charSequence);
        c0130a.f404c = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = c0130a.f404c;
            if (i4 < c0130a.f403b && i == 0) {
                CharSequence charSequence2 = c0130a.f402a;
                char charAt = charSequence2.charAt(i4);
                c0130a.f405d = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, c0130a.f404c);
                    c0130a.f404c = Character.charCount(codePointAt) + c0130a.f404c;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    c0130a.f404c++;
                    char c2 = c0130a.f405d;
                    directionality = c2 < 1792 ? C0130a.f401e[c2] : Character.getDirectionality(c2);
                }
                if (directionality != 0) {
                    if (directionality == 1 || directionality == 2) {
                        if (i3 == 0) {
                        }
                    } else if (directionality != 9) {
                        switch (directionality) {
                            case 14:
                            case 15:
                                i3++;
                                i2 = -1;
                                continue;
                            case DLLCallback.DLL_FPTRS /* 16 */:
                            case 17:
                                i3++;
                                i2 = 1;
                                continue;
                            case 18:
                                i3--;
                                i2 = 0;
                                continue;
                        }
                    }
                } else if (i3 == 0) {
                }
                i = i3;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0041, code lost:
    
        return 1;
     */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m388b(CharSequence charSequence) {
        C0130a c0130a = new C0130a(charSequence);
        c0130a.f404c = c0130a.f403b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (c0130a.f404c > 0) {
                byte m386a = c0130a.m386a();
                if (m386a != 0) {
                    if (m386a == 1 || m386a == 2) {
                        if (i != 0) {
                            if (i2 == 0) {
                                break;
                            }
                        }
                    } else if (m386a != 9) {
                        switch (m386a) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case DLLCallback.DLL_FPTRS /* 16 */:
                            case 17:
                                if (i2 == i) {
                                    break;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else if (i != 0) {
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
        return -1;
    }

    /* renamed from: c */
    public final SpannableStringBuilder m389c(CharSequence charSequence) {
        C0125d c0125d = AbstractC0136g.f418c;
        if (charSequence == null) {
            return null;
        }
        boolean m384b = c0125d.m384b(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean m384b2 = (m384b ? AbstractC0136g.f417b : AbstractC0136g.f416a).m384b(charSequence, charSequence.length());
        String str = "";
        String str2 = f407c;
        String str3 = f406b;
        boolean z2 = this.f410a;
        spannableStringBuilder.append((CharSequence) ((z2 || !(m384b2 || m387a(charSequence) == 1)) ? (!z2 || (m384b2 && m387a(charSequence) != -1)) ? "" : str2 : str3));
        if (m384b != z2) {
            spannableStringBuilder.append(m384b ? (char) 8235 : (char) 8234);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        boolean m384b3 = (m384b ? AbstractC0136g.f417b : AbstractC0136g.f416a).m384b(charSequence, charSequence.length());
        if (!z2 && (m384b3 || m388b(charSequence) == 1)) {
            str = str3;
        } else if (z2 && (!m384b3 || m388b(charSequence) == -1)) {
            str = str2;
        }
        spannableStringBuilder.append((CharSequence) str);
        return spannableStringBuilder;
    }
}
