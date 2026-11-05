package p001A0;

import p006C.AbstractC0062j;
import p109u0.AbstractC1561o;

/* renamed from: A0.a */
/* loaded from: classes.dex */
public enum EnumC0007a {
    SETTINGS(0, "settings", "Открой / покажи настройки", "Open / show settings", "افتح / أظهر الإعدادات", new String[]{"открой настройки", "покажи настройки", "открой настройки сплита"}, new String[]{"open settings", "show settings", "open split settings"}, new String[]{"افتح الإعدادات", "أظهر الإعدادات", "افتح إعدادات سبلت"}),
    PRESET_1(1, "preset1", "Набор 1", "Preset 1", "مجموعة 1", m14c(1), m13b(1), m12a(1)),
    /* JADX INFO: Fake field, exist only in values array */
    PRESET_2(2, "preset2", "Набор 2", "Preset 2", "مجموعة 2", m14c(2), m13b(2), m12a(2)),
    /* JADX INFO: Fake field, exist only in values array */
    PRESET_3(3, "preset3", "Набор 3", "Preset 3", "مجموعة 3", m14c(3), m13b(3), m12a(3)),
    /* JADX INFO: Fake field, exist only in values array */
    PRESET_4(4, "preset4", "Набор 4", "Preset 4", "مجموعة 4", m14c(4), m13b(4), m12a(4)),
    /* JADX INFO: Fake field, exist only in values array */
    PRESET_5(5, "preset5", "Набор 5", "Preset 5", "مجموعة 5", m14c(5), m13b(5), m12a(5)),
    /* JADX INFO: Fake field, exist only in values array */
    PRESET_6(6, "preset6", "Набор 6", "Preset 6", "مجموعة 6", m14c(6), m13b(6), m12a(6)),
    /* JADX INFO: Fake field, exist only in values array */
    PRESET_7(7, "preset7", "Набор 7", "Preset 7", "مجموعة 7", m14c(7), m13b(7), m12a(7));


    /* renamed from: k */
    public static final long f18k;

    /* renamed from: a */
    public final int f20a;

    /* renamed from: b */
    public final String f21b;

    /* renamed from: c */
    public final String f22c;

    /* renamed from: d */
    public final String f23d;

    /* renamed from: e */
    public final String f24e;

    /* renamed from: f */
    public final String[] f25f;

    /* renamed from: g */
    public final String[] f26g;

    /* renamed from: h */
    public final String[] f27h;

    static {
        long j2 = 0;
        for (EnumC0007a enumC0007a : values()) {
            j2 |= 1 << enumC0007a.f20a;
        }
        f18k = j2;
    }

    EnumC0007a(int i, String str, String str2, String str3, String str4, String[] strArr, String[] strArr2, String[] strArr3) {
        if (i < 0 || i > 63) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "bit out of range: "));
        }
        this.f20a = i;
        this.f21b = str;
        this.f22c = str2;
        this.f23d = str3;
        this.f24e = str4;
        this.f25f = strArr;
        this.f26g = strArr2;
        this.f27h = strArr3;
    }

    /* renamed from: a */
    public static String[] m12a(int i) {
        String str;
        switch (i) {
            case 1:
                str = "واحد";
                break;
            case 2:
                str = "اثنين";
                break;
            case 3:
                str = "ثلاثة";
                break;
            case 4:
                str = "اربعة";
                break;
            case 5:
                str = "خمسة";
                break;
            case 6:
                str = "ستة";
                break;
            case 7:
                str = "سبعة";
                break;
            default:
                str = String.valueOf(i);
                break;
        }
        return new String[]{AbstractC1561o.m4299c("مجموعة ", str), AbstractC1561o.m4299c("وضع ", str), AbstractC1561o.m4299c("شغل مجموعة ", str)};
    }

    /* renamed from: b */
    public static String[] m13b(int i) {
        String str;
        switch (i) {
            case 1:
                str = "one";
                break;
            case 2:
                str = "two";
                break;
            case 3:
                str = "three";
                break;
            case 4:
                str = "four";
                break;
            case 5:
                str = "five";
                break;
            case 6:
                str = "six";
                break;
            case 7:
                str = "seven";
                break;
            default:
                str = String.valueOf(i);
                break;
        }
        return new String[]{AbstractC1561o.m4299c("preset ", str), AbstractC1561o.m4299c("mode ", str), AbstractC1561o.m4299c("set ", str), AbstractC0062j.m156j(i, "preset "), AbstractC0062j.m156j(i, "mode ")};
    }

    /* renamed from: c */
    public static String[] m14c(int i) {
        String str;
        switch (i) {
            case 1:
                str = "один";
                break;
            case 2:
                str = "два";
                break;
            case 3:
                str = "три";
                break;
            case 4:
                str = "четыре";
                break;
            case 5:
                str = "пять";
                break;
            case 6:
                str = "шесть";
                break;
            case 7:
                str = "семь";
                break;
            default:
                str = String.valueOf(i);
                break;
        }
        return new String[]{AbstractC1561o.m4299c("набор ", str), AbstractC1561o.m4299c("режим ", str), AbstractC1561o.m4299c("включи набор ", str)};
    }
}
