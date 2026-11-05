package p063d1;

import java.lang.reflect.Field;
import java.util.Locale;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: d1.h */
/* loaded from: classes.dex */
public abstract class EnumC0747h {

    /* renamed from: a */
    public static final C0740a f3868a;

    /* renamed from: b */
    public static final /* synthetic */ EnumC0747h[] f3869b;

    static {
        C0740a c0740a = new C0740a();
        f3868a = c0740a;
        f3869b = new EnumC0747h[]{c0740a, new EnumC0747h() { // from class: d1.b
            @Override // p063d1.EnumC0747h
            /* renamed from: b */
            public final String mo2193b(Field field) {
                return EnumC0747h.m2195c(field.getName());
            }
        }, new EnumC0747h() { // from class: d1.c
            @Override // p063d1.EnumC0747h
            /* renamed from: b */
            public final String mo2193b(Field field) {
                return EnumC0747h.m2195c(EnumC0747h.m2194a(field.getName(), ' '));
            }
        }, new EnumC0747h() { // from class: d1.d
            @Override // p063d1.EnumC0747h
            /* renamed from: b */
            public final String mo2193b(Field field) {
                return EnumC0747h.m2194a(field.getName(), '_').toUpperCase(Locale.ENGLISH);
            }
        }, new EnumC0747h() { // from class: d1.e
            @Override // p063d1.EnumC0747h
            /* renamed from: b */
            public final String mo2193b(Field field) {
                return EnumC0747h.m2194a(field.getName(), '_').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC0747h() { // from class: d1.f
            @Override // p063d1.EnumC0747h
            /* renamed from: b */
            public final String mo2193b(Field field) {
                return EnumC0747h.m2194a(field.getName(), '-').toLowerCase(Locale.ENGLISH);
            }
        }, new EnumC0747h() { // from class: d1.g
            @Override // p063d1.EnumC0747h
            /* renamed from: b */
            public final String mo2193b(Field field) {
                return EnumC0747h.m2194a(field.getName(), '.').toLowerCase(Locale.ENGLISH);
            }
        }};
    }

    /* renamed from: a */
    public static String m2194a(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public static String m2195c(String str) {
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (Character.isUpperCase(charAt)) {
                    return str;
                }
                char upperCase = Character.toUpperCase(charAt);
                if (i == 0) {
                    return upperCase + str.substring(1);
                }
                return str.substring(0, i) + upperCase + str.substring(i + 1);
            }
        }
        return str;
    }

    public static EnumC0747h valueOf(String str) {
        return (EnumC0747h) Enum.valueOf(EnumC0747h.class, str);
    }

    public static EnumC0747h[] values() {
        return (EnumC0747h[]) f3869b.clone();
    }

    /* renamed from: b */
    public abstract String mo2193b(Field field);
}
