package p080k0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import com.sun.jna.Function;
import java.util.ArrayList;
import p003B.C0037d;
import p006C.C0063k;
import p091o.C1192b;

/* renamed from: k0.m */
/* loaded from: classes.dex */
public final class C1044m {

    /* renamed from: p */
    public static final Matrix f4952p = new Matrix();

    /* renamed from: a */
    public final Path f4953a;

    /* renamed from: b */
    public final Path f4954b;

    /* renamed from: c */
    public final Matrix f4955c;

    /* renamed from: d */
    public Paint f4956d;

    /* renamed from: e */
    public Paint f4957e;

    /* renamed from: f */
    public PathMeasure f4958f;

    /* renamed from: g */
    public final C1041j f4959g;

    /* renamed from: h */
    public float f4960h;

    /* renamed from: i */
    public float f4961i;

    /* renamed from: j */
    public float f4962j;

    /* renamed from: k */
    public float f4963k;

    /* renamed from: l */
    public int f4964l;

    /* renamed from: m */
    public String f4965m;

    /* renamed from: n */
    public Boolean f4966n;

    /* renamed from: o */
    public final C1192b f4967o;

    public C1044m() {
        this.f4955c = new Matrix();
        this.f4960h = 0.0f;
        this.f4961i = 0.0f;
        this.f4962j = 0.0f;
        this.f4963k = 0.0f;
        this.f4964l = Function.USE_VARARGS;
        this.f4965m = null;
        this.f4966n = null;
        this.f4967o = new C1192b();
        this.f4959g = new C1041j();
        this.f4953a = new Path();
        this.f4954b = new Path();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00e6, code lost:
    
        if (r0.f4933j != 1.0f) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2642a(C1041j c1041j, Matrix matrix, Canvas canvas, int i, int i2) {
        Matrix matrix2;
        int i3;
        float f2;
        int i4 = 1;
        c1041j.f4938a.set(matrix);
        Matrix matrix3 = c1041j.f4938a;
        matrix3.preConcat(c1041j.f4947j);
        canvas.save();
        ?? r11 = 0;
        int i5 = 0;
        while (true) {
            ArrayList arrayList = c1041j.f4939b;
            if (i5 >= arrayList.size()) {
                canvas.restore();
                return;
            }
            AbstractC1042k abstractC1042k = (AbstractC1042k) arrayList.get(i5);
            if (abstractC1042k instanceof C1041j) {
                m2642a((C1041j) abstractC1042k, matrix3, canvas, i, i2);
                i3 = i4;
                matrix2 = matrix3;
            } else if (abstractC1042k instanceof AbstractC1043l) {
                AbstractC1043l abstractC1043l = (AbstractC1043l) abstractC1042k;
                float f3 = i / this.f4962j;
                float f4 = i2 / this.f4963k;
                float min = Math.min(f3, f4);
                Matrix matrix4 = this.f4955c;
                matrix4.set(matrix3);
                matrix4.postScale(f3, f4);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                float hypot = (float) Math.hypot(fArr[r11], fArr[i4]);
                matrix2 = matrix3;
                float hypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                float f5 = (fArr[r11] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max(hypot, hypot2);
                float abs = max > 0.0f ? Math.abs(f5) / max : 0.0f;
                if (abs != 0.0f) {
                    Path path = this.f4953a;
                    abstractC1043l.getClass();
                    path.reset();
                    C0063k[] c0063kArr = abstractC1043l.f4949a;
                    if (c0063kArr != null) {
                        C0063k.m174b(c0063kArr, path);
                    }
                    Path path2 = this.f4954b;
                    path2.reset();
                    if (abstractC1043l instanceof C1039h) {
                        path2.setFillType(abstractC1043l.f4951c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        C1040i c1040i = (C1040i) abstractC1043l;
                        float f6 = c1040i.f4932i;
                        float f7 = f6 == 0.0f ? 1.0f : 1.0f;
                        float f8 = c1040i.f4934k;
                        float f9 = (f6 + f8) % f7;
                        float f10 = (c1040i.f4933j + f8) % f7;
                        if (this.f4958f == null) {
                            this.f4958f = new PathMeasure();
                        }
                        this.f4958f.setPath(path, r11);
                        float length = this.f4958f.getLength();
                        float f11 = f9 * length;
                        float f12 = f10 * length;
                        path.reset();
                        if (f11 > f12) {
                            this.f4958f.getSegment(f11, length, path, true);
                            f2 = 0.0f;
                            this.f4958f.getSegment(0.0f, f12, path, true);
                        } else {
                            f2 = 0.0f;
                            this.f4958f.getSegment(f11, f12, path, true);
                        }
                        path.rLineTo(f2, f2);
                        path2.addPath(path, matrix4);
                        C0037d c0037d = c1040i.f4929f;
                        if ((((Shader) c0037d.f127g) == null && c0037d.f126f == 0) ? r11 : true) {
                            if (this.f4957e == null) {
                                Paint paint = new Paint(1);
                                this.f4957e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            }
                            Paint paint2 = this.f4957e;
                            Shader shader = (Shader) c0037d.f127g;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(c1040i.f4931h * 255.0f));
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(Function.USE_VARARGS);
                                int i6 = c0037d.f126f;
                                float f13 = c1040i.f4931h;
                                PorterDuff.Mode mode = C1047p.f4981o;
                                paint2.setColor((i6 & 16777215) | (((int) (Color.alpha(i6) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            path2.setFillType(c1040i.f4951c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            canvas.drawPath(path2, paint2);
                        }
                        C0037d c0037d2 = c1040i.f4927d;
                        if (((Shader) c0037d2.f127g) != null || c0037d2.f126f != 0) {
                            if (this.f4956d == null) {
                                Paint paint3 = new Paint(1);
                                this.f4956d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.f4956d;
                            Paint.Join join = c1040i.f4936m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = c1040i.f4935l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(c1040i.f4937n);
                            Shader shader2 = (Shader) c0037d2.f127g;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(c1040i.f4930g * 255.0f));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(Function.USE_VARARGS);
                                int i7 = c0037d2.f126f;
                                float f14 = c1040i.f4930g;
                                PorterDuff.Mode mode2 = C1047p.f4981o;
                                paint4.setColor((i7 & 16777215) | (((int) (Color.alpha(i7) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(c1040i.f4928e * abs * min);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i3 = 1;
            } else {
                matrix2 = matrix3;
                i3 = i4;
            }
            i5 += i3;
            i4 = i3;
            matrix3 = matrix2;
            r11 = 0;
        }
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f4964l;
    }

    public void setAlpha(float f2) {
        setRootAlpha((int) (f2 * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.f4964l = i;
    }

    public C1044m(C1044m c1044m) {
        this.f4955c = new Matrix();
        this.f4960h = 0.0f;
        this.f4961i = 0.0f;
        this.f4962j = 0.0f;
        this.f4963k = 0.0f;
        this.f4964l = Function.USE_VARARGS;
        this.f4965m = null;
        this.f4966n = null;
        C1192b c1192b = new C1192b();
        this.f4967o = c1192b;
        this.f4959g = new C1041j(c1044m.f4959g, c1192b);
        this.f4953a = new Path(c1044m.f4953a);
        this.f4954b = new Path(c1044m.f4954b);
        this.f4960h = c1044m.f4960h;
        this.f4961i = c1044m.f4961i;
        this.f4962j = c1044m.f4962j;
        this.f4963k = c1044m.f4963k;
        this.f4964l = c1044m.f4964l;
        this.f4965m = c1044m.f4965m;
        String str = c1044m.f4965m;
        if (str != null) {
            c1192b.put(str, this);
        }
        this.f4966n = c1044m.f4966n;
    }
}
