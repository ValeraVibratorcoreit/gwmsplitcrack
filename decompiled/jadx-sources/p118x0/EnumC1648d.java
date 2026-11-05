package p118x0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: x0.d */
/* loaded from: classes.dex */
public final class EnumC1648d {

    /* renamed from: a */
    public static final EnumC1648d f9359a;

    /* renamed from: b */
    public static final EnumC1648d f9360b;

    /* renamed from: c */
    public static final /* synthetic */ EnumC1648d[] f9361c;

    static {
        EnumC1648d enumC1648d = new EnumC1648d("CARD", 0);
        f9359a = enumC1648d;
        EnumC1648d enumC1648d2 = new EnumC1648d("SYSTEMUI", 1);
        f9360b = enumC1648d2;
        f9361c = new EnumC1648d[]{enumC1648d, enumC1648d2};
    }

    public static EnumC1648d valueOf(String str) {
        return (EnumC1648d) Enum.valueOf(EnumC1648d.class, str);
    }

    public static EnumC1648d[] values() {
        return (EnumC1648d[]) f9361c.clone();
    }
}
