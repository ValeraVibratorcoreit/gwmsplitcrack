package p045W0;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import p043V0.C0349a;

/* renamed from: W0.p */
/* loaded from: classes.dex */
public final class C0366p extends AbstractC0370t {

    /* renamed from: c */
    public final C0368r f1088c;

    /* renamed from: d */
    public final float f1089d;

    /* renamed from: e */
    public final float f1090e;

    public C0366p(C0368r c0368r, float f2, float f3) {
        this.f1088c = c0368r;
        this.f1089d = f2;
        this.f1090e = f3;
    }

    @Override // p045W0.AbstractC0370t
    /* renamed from: a */
    public final void mo971a(Matrix matrix, C0349a c0349a, int i, Canvas canvas) {
        C0368r c0368r = this.f1088c;
        float f2 = c0368r.f1099c;
        float f3 = this.f1090e;
        float f4 = c0368r.f1098b;
        float f5 = this.f1089d;
        RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(f2 - f3, f4 - f5), 0.0f);
        Matrix matrix2 = this.f1102a;
        matrix2.set(matrix);
        matrix2.preTranslate(f5, f3);
        matrix2.preRotate(m972b());
        c0349a.getClass();
        rectF.bottom += i;
        rectF.offset(0.0f, -i);
        int[] iArr = C0349a.f989i;
        iArr[0] = c0349a.f998f;
        iArr[1] = c0349a.f997e;
        iArr[2] = c0349a.f996d;
        Paint paint = c0349a.f995c;
        float f6 = rectF.left;
        paint.setShader(new LinearGradient(f6, rectF.top, f6, rectF.bottom, iArr, C0349a.f990j, Shader.TileMode.CLAMP));
        canvas.save();
        canvas.concat(matrix2);
        canvas.drawRect(rectF, paint);
        canvas.restore();
    }

    /* renamed from: b */
    public final float m972b() {
        C0368r c0368r = this.f1088c;
        return (float) Math.toDegrees(Math.atan((c0368r.f1099c - this.f1090e) / (c0368r.f1098b - this.f1089d)));
    }
}
