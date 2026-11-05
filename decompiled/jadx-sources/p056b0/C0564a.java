package p056b0;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: b0.a */
/* loaded from: classes.dex */
public final class C0564a {

    /* renamed from: a */
    public final C0565b f2166a = new C0565b();

    /* renamed from: b */
    public final LinkedHashMap f2167b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashSet f2168c = new LinkedHashSet();

    /* renamed from: d */
    public volatile boolean f2169d;

    /* renamed from: a */
    public static void m1574a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        }
    }
}
