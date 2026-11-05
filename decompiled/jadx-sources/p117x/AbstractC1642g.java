package p117x;

import android.graphics.Matrix;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: x.g */
/* loaded from: classes.dex */
public abstract class AbstractC1642g {

    /* renamed from: a */
    public static final ThreadLocal f9323a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f9324b = new ThreadLocal();

    /* renamed from: a */
    public static void m4777a(CoordinatorLayout coordinatorLayout, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != coordinatorLayout) {
            m4777a(coordinatorLayout, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
