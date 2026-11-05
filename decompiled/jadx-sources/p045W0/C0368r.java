package p045W0;

import android.graphics.Matrix;
import android.graphics.Path;

/* renamed from: W0.r */
/* loaded from: classes.dex */
public final class C0368r extends AbstractC0369s {

    /* renamed from: b */
    public float f1098b;

    /* renamed from: c */
    public float f1099c;

    @Override // p045W0.AbstractC0369s
    /* renamed from: a */
    public final void mo973a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1100a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        path.lineTo(this.f1098b, this.f1099c);
        path.transform(matrix);
    }
}
