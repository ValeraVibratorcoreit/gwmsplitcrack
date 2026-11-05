package p077j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.x */
/* loaded from: classes.dex */
public abstract class AbstractC0993x {
    /* renamed from: a */
    public static void m2572a(View view, Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }

    /* renamed from: b */
    public static void m2573b(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    /* renamed from: c */
    public static void m2574c(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
