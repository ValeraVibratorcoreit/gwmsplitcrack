package p099q1;

/* renamed from: q1.a */
/* loaded from: classes.dex */
public abstract class AbstractC1376a {

    /* renamed from: a */
    public static final Integer f6462a;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            f6462a = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        f6462a = num2;
    }
}
