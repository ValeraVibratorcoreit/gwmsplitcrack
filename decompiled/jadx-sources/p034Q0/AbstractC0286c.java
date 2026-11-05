package p034Q0;

import android.graphics.Matrix;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: Q0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0286c {

    /* renamed from: a */
    public static final ThreadLocal f797a = new ThreadLocal();

    /* renamed from: b */
    public static final ThreadLocal f798b = new ThreadLocal();

    /* renamed from: a */
    public static void m836a(ViewGroup viewGroup, View view, Matrix matrix) {
        Object parent = view.getParent();
        if ((parent instanceof View) && parent != viewGroup) {
            m836a(viewGroup, (View) parent, matrix);
            matrix.preTranslate(-r0.getScrollX(), -r0.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }
}
