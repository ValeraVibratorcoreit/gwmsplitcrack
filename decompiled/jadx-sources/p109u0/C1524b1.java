package p109u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.view.View;
import com.sun.jna.Function;

/* renamed from: u0.b1 */
/* loaded from: classes.dex */
public final class C1524b1 extends View {

    /* renamed from: f */
    public final Paint f8141f;

    /* renamed from: g */
    public final RectF f8142g;

    /* renamed from: h */
    public final Matrix f8143h;

    /* renamed from: i */
    public final int[] f8144i;

    /* renamed from: j */
    public final float[] f8145j;

    /* renamed from: k */
    public float f8146k;

    /* renamed from: l */
    public float f8147l;

    /* renamed from: m */
    public boolean f8148m;

    /* renamed from: n */
    public float f8149n;

    /* renamed from: o */
    public boolean f8150o;

    /* renamed from: p */
    public boolean f8151p;

    /* renamed from: q */
    public int f8152q;

    /* renamed from: r */
    public int f8153r;

    /* renamed from: s */
    public int f8154s;

    /* renamed from: t */
    public float f8155t;

    /* renamed from: u */
    public float f8156u;

    public C1524b1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f8141f = paint;
        this.f8142g = new RectF();
        this.f8143h = new Matrix();
        this.f8144i = new int[3];
        this.f8145j = new float[3];
        this.f8146k = 180.0f;
        this.f8147l = 16.0f;
        this.f8148m = true;
        this.f8149n = 40.0f;
        this.f8152q = 100;
        this.f8153r = -26624;
        this.f8154s = -1;
        this.f8155t = -135.0f;
        this.f8156u = -135.0f;
        setWillNotDraw(false);
        setClickable(false);
        setFocusable(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
    }

    /* renamed from: b */
    public static int m4156b(int i, String str) {
        if (str == null || str.isEmpty()) {
            return i;
        }
        try {
            String trim = str.trim();
            if (!trim.startsWith("#")) {
                trim = "#".concat(trim);
            }
            if (trim.length() == 7) {
                trim = "#FF" + trim.substring(1);
            }
            return Color.parseColor(trim);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: c */
    public static int m4157c(int i, int i2) {
        if (i2 >= 100) {
            return i;
        }
        if (i2 <= 0) {
            return i & 16777215;
        }
        return (i & 16777215) | (((((Color.alpha(i) * i2) + 50) / 100) & Function.USE_VARARGS) << 24);
    }

    /* renamed from: a */
    public final void m4158a(C1557m1 c1557m1, float f2) {
        c1557m1.m4293a();
        this.f8146k = c1557m1.f8398b;
        this.f8147l = c1557m1.f8399c;
        this.f8148m = c1557m1.f8400d;
        this.f8149n = c1557m1.f8401e;
        this.f8150o = c1557m1.f8402f;
        this.f8151p = c1557m1.f8405i;
        this.f8152q = c1557m1.f8406j;
        int m4156b = m4156b(-26624, c1557m1.f8403g);
        this.f8153r = m4156b;
        if (c1557m1.f8402f) {
            m4156b = m4156b(-1, c1557m1.f8404h);
        }
        this.f8154s = m4156b;
        this.f8155t = f2;
        invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth();
        float height = getHeight();
        if (width <= 1.0f || height <= 1.0f || this.f8152q <= 0) {
            return;
        }
        float f2 = this.f8146k;
        if (f2 < 1.0f) {
            return;
        }
        float max = Math.max(1.0f, this.f8147l);
        float f3 = this.f8156u - this.f8155t;
        float abs = Math.abs(f3);
        if (abs < 0.4f) {
            return;
        }
        float f4 = f3 < 0.0f ? -1.0f : 1.0f;
        if (!this.f8148m) {
            abs = Math.min(this.f8149n, abs);
        }
        if (abs < 0.4f) {
            return;
        }
        if (abs > 359.0f) {
            abs = 359.0f;
        }
        float f5 = width * 0.5f;
        float f6 = height * 0.5f;
        RectF rectF = this.f8142g;
        rectF.set(f5 - f2, f6 - f2, f5 + f2, f2 + f6);
        float f7 = f4 * abs;
        float f8 = (this.f8156u - f7) - 90.0f;
        Paint paint = this.f8141f;
        paint.setStrokeWidth(max);
        if (!this.f8150o && !this.f8151p) {
            paint.setShader(null);
            paint.setColor(m4157c(this.f8153r, this.f8152q));
            canvas.drawArc(rectF, f8, f7, false, paint);
            return;
        }
        int m4157c = this.f8151p ? this.f8153r & 16777215 : m4157c(this.f8153r, this.f8152q);
        int m4157c2 = m4157c(this.f8154s, this.f8152q);
        boolean z2 = f4 > 0.0f;
        float f9 = z2 ? f8 : this.f8156u - 90.0f;
        int i = z2 ? m4157c : m4157c2;
        if (z2) {
            m4157c = m4157c2;
        }
        float f10 = (abs + 80.0f) / 360.0f;
        if (f10 > 0.999f) {
            f10 = 0.999f;
        }
        int[] iArr = this.f8144i;
        iArr[0] = i;
        iArr[1] = i;
        iArr[2] = m4157c;
        float[] fArr = this.f8145j;
        fArr[0] = 0.0f;
        fArr[1] = 0.22222222f;
        fArr[2] = f10;
        SweepGradient sweepGradient = new SweepGradient(f5, f6, iArr, fArr);
        Matrix matrix = this.f8143h;
        matrix.reset();
        matrix.preRotate(f9 - 80.0f, f5, f6);
        sweepGradient.setLocalMatrix(matrix);
        paint.setDither(true);
        paint.setShader(sweepGradient);
        canvas.drawArc(rectF, f8, f7, false, paint);
        paint.setShader(null);
        paint.setDither(false);
    }

    public void setNeedleAngle(float f2) {
        if (Math.abs(this.f8156u - f2) < 0.05f) {
            return;
        }
        this.f8156u = f2;
        invalidate();
    }
}
