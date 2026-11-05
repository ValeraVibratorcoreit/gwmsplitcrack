package p001A0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: A0.q */
/* loaded from: classes.dex */
public abstract class AbstractC0023q {

    /* renamed from: a */
    public static volatile int f81a = 1;

    /* renamed from: b */
    public static final CopyOnWriteArrayList f82b = new CopyOnWriteArrayList();

    /* renamed from: c */
    public static final Handler f83c = new Handler(Looper.getMainLooper());

    /* renamed from: a */
    public static void m38a(int i) {
        if (f81a == i) {
            return;
        }
        f81a = i;
        f83c.post(new RunnableC0022p(0));
    }
}
