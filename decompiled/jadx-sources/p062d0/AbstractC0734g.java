package p062d0;

import android.view.Choreographer;

/* renamed from: d0.g */
/* loaded from: classes.dex */
public abstract class AbstractC0734g {
    /* renamed from: a */
    public static void m2185a(Runnable runnable) {
        Choreographer.getInstance().postFrameCallback(new ChoreographerFrameCallbackC0733f(0, runnable));
    }
}
