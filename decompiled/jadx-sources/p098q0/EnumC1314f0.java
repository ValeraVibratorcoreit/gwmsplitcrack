package p098q0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: q0.f0 */
/* loaded from: classes.dex */
public final class EnumC1314f0 {

    /* renamed from: a */
    public static final EnumC1314f0 f6114a;

    /* renamed from: b */
    public static final EnumC1314f0 f6115b;

    /* renamed from: c */
    public static final EnumC1314f0 f6116c;

    /* renamed from: d */
    public static final /* synthetic */ EnumC1314f0[] f6117d;

    static {
        EnumC1314f0 enumC1314f0 = new EnumC1314f0("RU", 0);
        f6114a = enumC1314f0;
        EnumC1314f0 enumC1314f02 = new EnumC1314f0("EN", 1);
        f6115b = enumC1314f02;
        EnumC1314f0 enumC1314f03 = new EnumC1314f0("AR", 2);
        f6116c = enumC1314f03;
        f6117d = new EnumC1314f0[]{enumC1314f0, enumC1314f02, enumC1314f03};
    }

    public static EnumC1314f0 valueOf(String str) {
        return (EnumC1314f0) Enum.valueOf(EnumC1314f0.class, str);
    }

    public static EnumC1314f0[] values() {
        return (EnumC1314f0[]) f6117d.clone();
    }
}
