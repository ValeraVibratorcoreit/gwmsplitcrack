package p045W0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* renamed from: W0.q */
/* loaded from: classes.dex */
public final class C0367q extends AbstractC0369s {

    /* renamed from: h */
    public static final RectF f1091h = new RectF();

    /* renamed from: b */
    public final float f1092b;

    /* renamed from: c */
    public final float f1093c;

    /* renamed from: d */
    public final float f1094d;

    /* renamed from: e */
    public final float f1095e;

    /* renamed from: f */
    public float f1096f;

    /* renamed from: g */
    public float f1097g;

    public C0367q(float f2, float f3, float f4, float f5) {
        this.f1092b = f2;
        this.f1093c = f3;
        this.f1094d = f4;
        this.f1095e = f5;
    }

    @Override // p045W0.AbstractC0369s
    /* renamed from: a */
    public final void mo973a(Matrix matrix, Path path) {
        Matrix matrix2 = this.f1100a;
        matrix.invert(matrix2);
        path.transform(matrix2);
        RectF rectF = f1091h;
        rectF.set(this.f1092b, this.f1093c, this.f1094d, this.f1095e);
        path.arcTo(rectF, this.f1096f, this.f1097g, false);
        path.transform(matrix);
    }
}
