package p048Y;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: Y.b */
/* loaded from: classes.dex */
public final class EnumC0432b {

    /* renamed from: a */
    public static final EnumC0432b f1395a;

    /* renamed from: b */
    public static final EnumC0432b f1396b;

    /* renamed from: c */
    public static final EnumC0432b f1397c;

    /* renamed from: d */
    public static final EnumC0432b f1398d;

    /* renamed from: e */
    public static final /* synthetic */ EnumC0432b[] f1399e;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC0432b EF0;

    static {
        EnumC0432b enumC0432b = new EnumC0432b("PENALTY_LOG", 0);
        EnumC0432b enumC0432b2 = new EnumC0432b("PENALTY_DEATH", 1);
        EnumC0432b enumC0432b3 = new EnumC0432b("DETECT_FRAGMENT_REUSE", 2);
        f1395a = enumC0432b3;
        EnumC0432b enumC0432b4 = new EnumC0432b("DETECT_FRAGMENT_TAG_USAGE", 3);
        f1396b = enumC0432b4;
        EnumC0432b enumC0432b5 = new EnumC0432b("DETECT_WRONG_NESTED_HIERARCHY", 4);
        f1397c = enumC0432b5;
        EnumC0432b enumC0432b6 = new EnumC0432b("DETECT_RETAIN_INSTANCE_USAGE", 5);
        EnumC0432b enumC0432b7 = new EnumC0432b("DETECT_SET_USER_VISIBLE_HINT", 6);
        EnumC0432b enumC0432b8 = new EnumC0432b("DETECT_TARGET_FRAGMENT_USAGE", 7);
        EnumC0432b enumC0432b9 = new EnumC0432b("DETECT_WRONG_FRAGMENT_CONTAINER", 8);
        f1398d = enumC0432b9;
        f1399e = new EnumC0432b[]{enumC0432b, enumC0432b2, enumC0432b3, enumC0432b4, enumC0432b5, enumC0432b6, enumC0432b7, enumC0432b8, enumC0432b9};
    }

    public static EnumC0432b valueOf(String str) {
        return (EnumC0432b) Enum.valueOf(EnumC0432b.class, str);
    }

    public static EnumC0432b[] values() {
        return (EnumC0432b[]) f1399e.clone();
    }
}
