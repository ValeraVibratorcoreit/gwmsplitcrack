package p010D1;

import java.io.InputStream;
import java.util.logging.Logger;
import p045W0.C0355e;

/* renamed from: D1.f */
/* loaded from: classes.dex */
public abstract class AbstractC0082f {

    /* renamed from: a */
    public static final /* synthetic */ int f247a = 0;

    static {
        Logger.getLogger(AbstractC0082f.class.getName());
    }

    /* renamed from: a */
    public static C0081e m247a(InputStream inputStream) {
        C0355e c0355e = new C0355e(3);
        if (inputStream != null) {
            return new C0081e(c0355e, inputStream);
        }
        throw new IllegalArgumentException("in == null");
    }
}
