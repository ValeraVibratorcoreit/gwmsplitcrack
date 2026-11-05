package p045W0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import p043V0.C0349a;

/* renamed from: W0.o */
/* loaded from: classes.dex */
public final class C0365o extends AbstractC0370t {

    /* renamed from: c */
    public final C0367q f1087c;

    public C0365o(C0367q c0367q) {
        this.f1087c = c0367q;
    }

    @Override // p045W0.AbstractC0370t
    /* renamed from: a */
    public final void mo971a(Matrix matrix, C0349a c0349a, int i, Canvas canvas) {
        C0367q c0367q = this.f1087c;
        float f2 = c0367q.f1096f;
        float f3 = c0367q.f1097g;
        RectF rectF = new RectF(c0367q.f1092b, c0367q.f1093c, c0367q.f1094d, c0367q.f1095e);
        c0349a.getClass();
        boolean z2 = f3 < 0.0f;
        Path path = c0349a.f999g;
        int[] iArr = C0349a.f991k;
        if (z2) {
            iArr[0] = 0;
            iArr[1] = c0349a.f998f;
            iArr[2] = c0349a.f997e;
            iArr[3] = c0349a.f996d;
        } else {
            path.rewind();
            path.moveTo(rectF.centerX(), rectF.centerY());
            path.arcTo(rectF, f2, f3);
            path.close();
            float f4 = -i;
            rectF.inset(f4, f4);
            iArr[0] = 0;
            iArr[1] = c0349a.f996d;
            iArr[2] = c0349a.f997e;
            iArr[3] = c0349a.f998f;
        }
        float width = rectF.width() / 2.0f;
        if (width <= 0.0f) {
            return;
        }
        float f5 = 1.0f - (i / width);
        float[] fArr = C0349a.f992l;
        fArr[1] = f5;
        fArr[2] = ((1.0f - f5) / 2.0f) + f5;
        RadialGradient radialGradient = new RadialGradient(rectF.centerX(), rectF.centerY(), width, iArr, fArr, Shader.TileMode.CLAMP);
        Paint paint = c0349a.f994b;
        paint.setShader(radialGradient);
        canvas.save();
        canvas.concat(matrix);
        canvas.scale(1.0f, rectF.height() / rectF.width());
        if (!z2) {
            canvas.clipPath(path, Region.Op.DIFFERENCE);
            canvas.drawPath(path, c0349a.f1000h);
        }
        canvas.drawArc(rectF, f2, f3, true, paint);
        canvas.restore();
    }
}
