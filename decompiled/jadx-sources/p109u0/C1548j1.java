package p109u0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.View;
import com.sun.jna.Function;

/* renamed from: u0.j1 */
/* loaded from: classes.dex */
public final class C1548j1 extends View {

    /* renamed from: f */
    public final Paint f8342f;

    /* renamed from: g */
    public final Paint f8343g;

    /* renamed from: h */
    public final RectF f8344h;

    /* renamed from: i */
    public final Path f8345i;

    /* renamed from: j */
    public final float[] f8346j;

    /* renamed from: k */
    public boolean f8347k;

    /* renamed from: l */
    public int f8348l;

    /* renamed from: m */
    public boolean f8349m;

    /* renamed from: n */
    public float f8350n;

    /* renamed from: o */
    public int f8351o;

    /* renamed from: p */
    public int f8352p;

    /* renamed from: q */
    public int f8353q;

    /* renamed from: r */
    public boolean f8354r;

    /* renamed from: s */
    public int f8355s;

    /* renamed from: t */
    public boolean f8356t;

    /* renamed from: u */
    public float f8357u;

    /* renamed from: v */
    public float f8358v;

    /* renamed from: w */
    public float f8359w;

    /* renamed from: x */
    public boolean f8360x;

    /* renamed from: y */
    public boolean f8361y;

    public C1548j1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f8342f = paint;
        Paint paint2 = new Paint(1);
        this.f8343g = paint2;
        this.f8344h = new RectF();
        this.f8345i = new Path();
        this.f8346j = new float[8];
        this.f8348l = 1;
        this.f8351o = 1716503543;
        this.f8352p = -11549705;
        this.f8353q = -1;
        this.f8355s = 100;
        this.f8357u = -135.0f;
        this.f8358v = 270.0f;
        this.f8359w = 20.0f;
        this.f8360x = true;
        setWillNotDraw(false);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint2.setStyle(style);
    }

    /* renamed from: c */
    public static int m4285c(int i, int i2) {
        if (i2 >= 100) {
            return i;
        }
        if (i2 <= 0) {
            return i & 16777215;
        }
        return (i & 16777215) | (((((Color.alpha(i) * i2) + 50) / 100) & Function.USE_VARARGS) << 24);
    }

    /* renamed from: a */
    public final void m4286a(boolean z2, int i, boolean z3, int i2, int i3, int i4, boolean z4, int i5) {
        this.f8347k = z2;
        this.f8348l = Math.max(1, Math.min(64, i));
        this.f8349m = z3;
        this.f8351o = i2;
        this.f8352p = i3;
        this.f8353q = i4;
        this.f8354r = z4;
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 > 100) {
            i5 = 100;
        }
        this.f8355s = i5;
        this.f8356t = false;
        this.f8361y = false;
        Paint paint = this.f8342f;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        Paint paint2 = this.f8343g;
        paint2.setStyle(style);
        paint.setColor(i2);
        paint2.setShader(null);
        paint2.setColor(m4285c(i3, this.f8355s));
        invalidate();
    }

    /* renamed from: b */
    public final void m4287b(Canvas canvas, int i, int i2, float f2) {
        boolean z2 = this.f8347k;
        Paint paint = this.f8343g;
        if (z2) {
            if (this.f8361y) {
                canvas.drawRect(0.0f, 0.0f, i, i2 * f2, paint);
                return;
            } else {
                float f3 = i2;
                canvas.drawRect(0.0f, f3 - (f2 * f3), i, f3, paint);
                return;
            }
        }
        if (!this.f8361y) {
            canvas.drawRect(0.0f, 0.0f, i * f2, i2, paint);
        } else {
            float f4 = i;
            canvas.drawRect(f4 - (f2 * f4), 0.0f, f4, i2, paint);
        }
    }

    /* renamed from: d */
    public final void m4288d(float f2, float f3, float f4, boolean z2) {
        this.f8356t = true;
        this.f8357u = f2;
        if (f3 < 1.0f) {
            f3 = 1.0f;
        }
        if (f3 > 360.0f) {
            f3 = 360.0f;
        }
        this.f8358v = f3;
        if (f4 < 1.0f) {
            f4 = 1.0f;
        }
        this.f8359w = f4;
        this.f8360x = z2;
        Paint paint = this.f8342f;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        Paint paint2 = this.f8343g;
        paint2.setStyle(style);
        Paint.Cap cap = this.f8349m ? Paint.Cap.ROUND : Paint.Cap.BUTT;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
        invalidate();
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0404  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f2;
        int i;
        float f3;
        float[] fArr;
        int i2;
        int i3;
        float f4;
        int i4;
        int i5;
        float f5;
        float f6;
        int i6;
        int i7;
        int width = getWidth();
        int height = getHeight();
        if (width <= 0 || height <= 0) {
            return;
        }
        Paint paint = this.f8342f;
        paint.setColor(this.f8351o);
        boolean z2 = this.f8356t;
        RectF rectF = this.f8344h;
        Paint paint2 = this.f8343g;
        if (z2) {
            float f7 = this.f8359w;
            float max = Math.max(1.0f, Math.min(width, height) - 1.0f);
            if (f7 > max) {
                f7 = max;
            }
            paint.setStrokeWidth(f7);
            paint2.setStrokeWidth(f7);
            float f8 = (f7 * 0.5f) + 0.5f;
            float f9 = width;
            float f10 = height;
            rectF.set(f8, f8, f9 - f8, f10 - f8);
            if (rectF.width() < 1.0f || rectF.height() < 1.0f) {
                return;
            }
            float f11 = this.f8360x ? this.f8358v : -this.f8358v;
            float f12 = this.f8357u;
            if (this.f8361y) {
                f12 += f11;
                f11 = -f11;
            }
            float f13 = f11;
            float f14 = f12;
            int m4285c = m4285c(this.f8352p, this.f8355s);
            if (this.f8354r) {
                int m4285c2 = m4285c(this.f8353q, this.f8355s);
                int[] iArr = new int[49];
                float[] fArr2 = new float[49];
                int i8 = 0;
                while (i8 <= 48) {
                    float f15 = i8 == 48 ? 0.0f : i8 * (360.0f / 48);
                    float abs = Math.abs(f13);
                    if (abs >= 0.01f) {
                        float f16 = f14 % 360.0f;
                        if (f16 < 0.0f) {
                            f16 += 360.0f;
                        }
                        float f17 = f13 >= 0.0f ? f15 - f16 : f16 - f15;
                        if (f17 < 0.0f) {
                            f17 += 360.0f;
                        }
                        if (f17 <= abs) {
                            f4 = f17 / abs;
                        } else if (360.0f - f17 >= f17 - abs) {
                            f4 = 1.0f;
                        }
                        if (f4 > 0.0f) {
                            i4 = m4285c;
                            i5 = m4285c2;
                        } else if (f4 >= 1.0f) {
                            i4 = m4285c;
                            m4285c = m4285c2;
                            i5 = m4285c;
                        } else {
                            int alpha = Color.alpha(m4285c);
                            int red = Color.red(m4285c);
                            int green = Color.green(m4285c);
                            int blue = Color.blue(m4285c);
                            int alpha2 = Color.alpha(m4285c2);
                            int red2 = Color.red(m4285c2);
                            int green2 = Color.green(m4285c2);
                            int blue2 = Color.blue(m4285c2);
                            int round = Math.round((alpha2 - alpha) * f4) + alpha;
                            int round2 = Math.round((red2 - red) * f4) + red;
                            i4 = m4285c;
                            int round3 = Math.round((green2 - green) * f4) + green;
                            i5 = m4285c2;
                            m4285c = Color.argb(round, round2, round3, Math.round((blue2 - blue) * f4) + blue);
                        }
                        iArr[i8] = m4285c;
                        fArr2[i8] = i8 / 48;
                        i8++;
                        m4285c = i4;
                        m4285c2 = i5;
                    }
                    f4 = 0.0f;
                    if (f4 > 0.0f) {
                    }
                    iArr[i8] = m4285c;
                    fArr2[i8] = i8 / 48;
                    i8++;
                    m4285c = i4;
                    m4285c2 = i5;
                }
                paint2.setShader(new SweepGradient(f9 * 0.5f, f10 * 0.5f, iArr, fArr2));
                paint2.setColor(-1);
            } else {
                paint2.setShader(null);
                paint2.setColor(m4285c);
            }
            int i9 = this.f8348l;
            if (i9 <= 1) {
                canvas.drawArc(rectF, f14, f13, false, paint);
                float f18 = this.f8350n;
                if (f18 > 0.0f) {
                    canvas.drawArc(rectF, f14, f13 * f18, false, paint2);
                    return;
                }
                return;
            }
            float abs2 = Math.abs(f13);
            if (f13 >= 0.0f) {
                f6 = 0.04f;
                f5 = 1.0f;
            } else {
                f5 = -1.0f;
                f6 = 0.04f;
            }
            float f19 = abs2 * f6;
            int i10 = i9 - 1;
            float max2 = Math.max(0.8f, f19 / Math.max(1, i10));
            float f20 = i9;
            float f21 = abs2 / (3.0f * f20);
            if (max2 > f21) {
                max2 = Math.max(0.4f, f21);
            }
            float f22 = max2;
            float f23 = (abs2 - (i10 * f22)) / f20;
            float f24 = f23 >= 0.4f ? f23 : 0.4f;
            float f25 = this.f8350n * f20;
            if (f25 < 0.0f) {
                f25 = 0.0f;
            }
            if (f25 <= f20) {
                f20 = f25;
            }
            int i11 = (int) f20;
            float f26 = f20 - i11;
            int i12 = 0;
            while (i12 < i9) {
                float f27 = ((f24 + f22) * i12 * f5) + f14;
                float f28 = f5 * f24;
                if (i12 < i11) {
                    i6 = i9;
                    i7 = i12;
                    canvas.drawArc(rectF, f27, f28, false, paint2);
                } else {
                    i6 = i9;
                    i7 = i12;
                    if (i7 != i11 || f26 <= 0.0f) {
                        canvas.drawArc(rectF, f27, f28, false, paint);
                    } else {
                        canvas.drawArc(rectF, f27, f28, false, paint);
                        canvas.drawArc(rectF, f27, f28 * f26, false, paint2);
                    }
                }
                i12 = i7 + 1;
                i9 = i6;
            }
            return;
        }
        int m4285c3 = m4285c(this.f8352p, this.f8355s);
        if (this.f8354r) {
            int m4285c4 = m4285c(this.f8353q, this.f8355s);
            paint2.setShader(this.f8347k ? this.f8361y ? new LinearGradient(0.0f, 0.0f, 0.0f, height, m4285c3, m4285c4, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, height, 0.0f, 0.0f, m4285c3, m4285c4, Shader.TileMode.CLAMP) : this.f8361y ? new LinearGradient(width, 0.0f, 0.0f, 0.0f, m4285c3, m4285c4, Shader.TileMode.CLAMP) : new LinearGradient(0.0f, 0.0f, width, 0.0f, m4285c3, m4285c4, Shader.TileMode.CLAMP));
            paint2.setColor(-1);
        } else {
            paint2.setShader(null);
            paint2.setColor(m4285c3);
        }
        int i13 = this.f8348l;
        Path path = this.f8345i;
        if (i13 <= 1) {
            float min = this.f8349m ? Math.min(width, height) * 0.5f : 0.0f;
            rectF.set(0.0f, 0.0f, width, height);
            if (min <= 0.5f) {
                canvas.drawRect(rectF, paint);
                float f29 = this.f8350n;
                if (f29 <= 0.0f) {
                    return;
                }
                m4287b(canvas, width, height, f29);
                return;
            }
            path.reset();
            path.addRoundRect(rectF, min, min, Path.Direction.CW);
            canvas.save();
            canvas.clipPath(path);
            canvas.drawRect(rectF, paint);
            float f30 = this.f8350n;
            if (f30 > 0.0f) {
                m4287b(canvas, width, height, f30);
            }
            canvas.restore();
            return;
        }
        int i14 = i13 - 1;
        float max3 = Math.max(1.0f, ((this.f8347k ? height : width) * 0.04f) / Math.max(1, i14));
        if (i13 > 1) {
            float f31 = (this.f8347k ? height : width) / (i13 * 3.0f);
            if (max3 > f31) {
                max3 = Math.max(1.0f, f31);
            }
        }
        float f32 = max3;
        boolean z3 = this.f8347k;
        float f33 = i13;
        float f34 = ((z3 ? height : width) - (i14 * f32)) / f33;
        float f35 = f34 < 1.0f ? 1.0f : f34;
        float f36 = this.f8350n * f33;
        if (f36 < 0.0f) {
            f36 = 0.0f;
        }
        if (f36 <= f33) {
            f33 = f36;
        }
        int i15 = (int) f33;
        float f37 = f33 - i15;
        if (this.f8349m) {
            f2 = Math.min(z3 ? width : f35, z3 ? f35 : height) * 0.5f;
        } else {
            f2 = 0.0f;
        }
        int i16 = 0;
        while (i16 < i13) {
            int i17 = this.f8361y ? i14 - i16 : i16;
            if (this.f8347k) {
                float f38 = height - ((f35 + f32) * i16);
                float f39 = width;
                i = width;
                f3 = 0.0f;
                rectF.set(0.0f, f38 - f35, f39, f38);
            } else {
                i = width;
                f3 = 0.0f;
                float f40 = (f35 + f32) * i16;
                rectF.set(f40, 0.0f, f40 + f35, height);
            }
            int i18 = 0;
            while (true) {
                fArr = this.f8346j;
                if (i18 >= 8) {
                    break;
                }
                fArr[i18] = f3;
                i18++;
                f3 = 0.0f;
            }
            if (f2 > 0.5f) {
                if (this.f8347k) {
                    if (i16 == 0) {
                        fArr[4] = f2;
                        fArr[5] = f2;
                        fArr[6] = f2;
                        fArr[7] = f2;
                    }
                    if (i16 == i14) {
                        fArr[0] = f2;
                        fArr[1] = f2;
                        fArr[2] = f2;
                        fArr[3] = f2;
                    }
                } else {
                    if (i16 == 0) {
                        fArr[0] = f2;
                        fArr[1] = f2;
                        fArr[6] = f2;
                        fArr[7] = f2;
                    }
                    if (i16 == i14) {
                        fArr[2] = f2;
                        fArr[3] = f2;
                        fArr[4] = f2;
                        fArr[5] = f2;
                    }
                }
                path.reset();
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                if (i17 >= i15) {
                    canvas.drawPath(path, paint2);
                    i2 = i16;
                    i3 = i15;
                } else {
                    if (i17 != i15) {
                        i2 = i16;
                        i3 = i15;
                    } else if (f37 > 0.0f) {
                        canvas.drawPath(path, paint);
                        canvas.save();
                        canvas.clipPath(path);
                        if (!this.f8347k) {
                            i2 = i16;
                            i3 = i15;
                            if (this.f8361y) {
                                float f41 = rectF.right;
                                canvas.drawRect(f41 - (f35 * f37), rectF.top, f41, rectF.bottom, paint2);
                            } else {
                                float f42 = rectF.left;
                                canvas.drawRect(f42, rectF.top, (f35 * f37) + f42, rectF.bottom, paint2);
                            }
                        } else if (this.f8361y) {
                            float f43 = rectF.left;
                            float f44 = rectF.top;
                            i2 = i16;
                            i3 = i15;
                            canvas.drawRect(f43, f44, rectF.right, (f35 * f37) + f44, paint2);
                        } else {
                            i2 = i16;
                            i3 = i15;
                            float f45 = rectF.left;
                            float f46 = rectF.bottom;
                            canvas.drawRect(f45, f46 - (f35 * f37), rectF.right, f46, paint2);
                        }
                        canvas.restore();
                    } else {
                        i2 = i16;
                        i3 = i15;
                    }
                    canvas.drawPath(path, paint);
                }
                i16 = i2 + 1;
                width = i;
                i15 = i3;
            }
            path.reset();
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            if (i17 >= i15) {
            }
            i16 = i2 + 1;
            width = i;
            i15 = i3;
        }
    }

    public void setFraction(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        if (Math.abs(this.f8350n - f2) < 5.0E-4f) {
            return;
        }
        this.f8350n = f2;
        invalidate();
    }

    public void setInvert(boolean z2) {
        this.f8361y = z2;
        invalidate();
    }
}
