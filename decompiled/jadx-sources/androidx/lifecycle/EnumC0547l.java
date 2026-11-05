package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: androidx.lifecycle.l */
/* loaded from: classes.dex */
public final class EnumC0547l {
    private static final /* synthetic */ EnumC0547l[] $VALUES;
    public static final C0545j Companion;
    public static final EnumC0547l ON_ANY;
    public static final EnumC0547l ON_CREATE;
    public static final EnumC0547l ON_DESTROY;
    public static final EnumC0547l ON_PAUSE;
    public static final EnumC0547l ON_RESUME;
    public static final EnumC0547l ON_START;
    public static final EnumC0547l ON_STOP;

    static {
        EnumC0547l enumC0547l = new EnumC0547l("ON_CREATE", 0);
        ON_CREATE = enumC0547l;
        EnumC0547l enumC0547l2 = new EnumC0547l("ON_START", 1);
        ON_START = enumC0547l2;
        EnumC0547l enumC0547l3 = new EnumC0547l("ON_RESUME", 2);
        ON_RESUME = enumC0547l3;
        EnumC0547l enumC0547l4 = new EnumC0547l("ON_PAUSE", 3);
        ON_PAUSE = enumC0547l4;
        EnumC0547l enumC0547l5 = new EnumC0547l("ON_STOP", 4);
        ON_STOP = enumC0547l5;
        EnumC0547l enumC0547l6 = new EnumC0547l("ON_DESTROY", 5);
        ON_DESTROY = enumC0547l6;
        EnumC0547l enumC0547l7 = new EnumC0547l("ON_ANY", 6);
        ON_ANY = enumC0547l7;
        $VALUES = new EnumC0547l[]{enumC0547l, enumC0547l2, enumC0547l3, enumC0547l4, enumC0547l5, enumC0547l6, enumC0547l7};
        Companion = new C0545j();
    }

    public static EnumC0547l valueOf(String str) {
        return (EnumC0547l) Enum.valueOf(EnumC0547l.class, str);
    }

    public static EnumC0547l[] values() {
        return (EnumC0547l[]) $VALUES.clone();
    }

    /* renamed from: a */
    public final EnumC0548m m1375a() {
        switch (AbstractC0546k.f1989a[ordinal()]) {
            case 1:
            case 2:
                return EnumC0548m.f1992c;
            case 3:
            case 4:
                return EnumC0548m.f1993d;
            case 5:
                return EnumC0548m.f1994e;
            case 6:
                return EnumC0548m.f1990a;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
