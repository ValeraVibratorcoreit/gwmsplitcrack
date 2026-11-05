package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.m */
/* loaded from: classes.dex */
public final class EnumC0548m {

    /* renamed from: a */
    public static final EnumC0548m f1990a;

    /* renamed from: b */
    public static final EnumC0548m f1991b;

    /* renamed from: c */
    public static final EnumC0548m f1992c;

    /* renamed from: d */
    public static final EnumC0548m f1993d;

    /* renamed from: e */
    public static final EnumC0548m f1994e;

    /* renamed from: f */
    public static final /* synthetic */ EnumC0548m[] f1995f;

    static {
        EnumC0548m enumC0548m = new EnumC0548m("DESTROYED", 0);
        f1990a = enumC0548m;
        EnumC0548m enumC0548m2 = new EnumC0548m("INITIALIZED", 1);
        f1991b = enumC0548m2;
        EnumC0548m enumC0548m3 = new EnumC0548m("CREATED", 2);
        f1992c = enumC0548m3;
        EnumC0548m enumC0548m4 = new EnumC0548m("STARTED", 3);
        f1993d = enumC0548m4;
        EnumC0548m enumC0548m5 = new EnumC0548m("RESUMED", 4);
        f1994e = enumC0548m5;
        f1995f = new EnumC0548m[]{enumC0548m, enumC0548m2, enumC0548m3, enumC0548m4, enumC0548m5};
    }

    public static EnumC0548m valueOf(String str) {
        return (EnumC0548m) Enum.valueOf(EnumC0548m.class, str);
    }

    public static EnumC0548m[] values() {
        return (EnumC0548m[]) f1995f.clone();
    }
}
