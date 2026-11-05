package p077j0;

import android.graphics.Matrix;
import android.view.View;

/* renamed from: j0.B */
/* loaded from: classes.dex */
public final class C0966B extends C0965A {
    @Override // p121y0.AbstractC1687o
    /* renamed from: Z */
    public final void mo2512Z(View view, float f2) {
        view.setTransitionAlpha(f2);
    }

    @Override // p077j0.C0965A, p121y0.AbstractC1687o
    /* renamed from: a0 */
    public final void mo2508a0(View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // p077j0.C0965A
    /* renamed from: c0 */
    public final void mo2509c0(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // p077j0.C0965A
    /* renamed from: d0 */
    public final void mo2510d0(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // p077j0.C0965A
    /* renamed from: e0 */
    public final void mo2511e0(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: v */
    public final float mo2513v(View view) {
        float transitionAlpha;
        transitionAlpha = view.getTransitionAlpha();
        return transitionAlpha;
    }
}
