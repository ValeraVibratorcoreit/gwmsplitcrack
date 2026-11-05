package p109u0;

import android.R;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.util.Locale;
import p003B.AbstractC0049p;
import p098q0.AbstractC1372y1;
import p106t0.EnumC1455a;
import p106t0.EnumC1456b;

/* renamed from: u0.g1 */
/* loaded from: classes.dex */
public abstract class AbstractC1539g1 {

    /* renamed from: a */
    public static final float[] f8252a = {0.0f, 0.14f, 0.38f, 0.62f, 0.86f, 1.0f};

    /* renamed from: b */
    public static volatile Context f8253b;

    /* renamed from: c */
    public static Typeface f8254c;

    /* renamed from: d */
    public static Typeface f8255d;

    /* renamed from: e */
    public static Typeface f8256e;

    /* renamed from: A */
    public static void m4179A(Canvas canvas, Paint paint, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i) {
        if (f8 <= 0.0f || f9 <= 0.0f) {
            return;
        }
        double radians = (float) Math.toRadians(((Math.max(0.0f, Math.min(f9, f8)) / f9) * f7) + f6);
        float cos = (((float) Math.cos(radians)) * f5) + f3;
        float sin = (f5 * ((float) Math.sin(radians))) + f4;
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(i);
        canvas.drawCircle(cos, sin, f2, paint);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(Math.max(1.5f, 0.22f * f2));
        paint.setColor(1711276032);
        canvas.drawCircle(cos, sin, f2, paint);
    }

    /* renamed from: B */
    public static void m4180B(Canvas canvas, RectF rectF, int i, int i2, int i3, float f2, boolean z2, Paint paint) {
        if (!m4190L(i3)) {
            if (z2) {
                m4184F(canvas, rectF, new int[]{m4233o(0.68f, i, -16777216), m4233o(0.32f, i, -16777216), m4233o(0.28f, i, i2), m4233o(0.58f, i, i2), m4233o(0.78f, i, i2), m4233o(0.9f, i, i2)}, f2, paint);
                return;
            } else {
                m4186H(canvas, rectF, i, i2, f2, paint);
                return;
            }
        }
        paint.reset();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(null);
        paint.setColor(i3);
        canvas.drawRect(rectF, paint);
    }

    /* renamed from: C */
    public static void m4181C(Canvas canvas, float f2, float f3, float f4, boolean z2) {
        float f5;
        float f6;
        float f7;
        if (z2) {
            f5 = f2 - 4.0f;
            f6 = f2 + f4 + 4.0f;
            f7 = (f4 * 0.5f) + f2;
        } else {
            f5 = (f2 - f4) - 4.0f;
            f6 = f2 + 4.0f;
            f7 = f2 - (f4 * 0.5f);
        }
        m4187I(canvas, f5, f6, 2.0f + f3, false);
        m4183E(f5 + 3.0f, f6 - 3.0f, f3 + 9.0f, 1.5f, -2005895040, canvas);
        m4182D(canvas, f7, f3);
    }

    /* renamed from: D */
    public static void m4182D(Canvas canvas, float f2, float f3) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2.0f);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setShader(new LinearGradient(f2, f3 - 10.0f, f2, f3 + 4.0f, new int[]{13938784, -1433767896, 1143611408}, new float[]{0.0f, 0.55f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawLine(f2, f3 - 8.0f, f2, f3 + 3.0f, paint);
    }

    /* renamed from: E */
    public static void m4183E(float f2, float f3, float f4, float f5, int i, Canvas canvas) {
        if (f3 <= 4.0f + f2) {
            return;
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f5);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(i);
        canvas.drawLine(f2, f4, f3, f4, paint);
    }

    /* renamed from: F */
    public static void m4184F(Canvas canvas, RectF rectF, int[] iArr, float f2, Paint paint) {
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        float f3 = rectF.left;
        LinearGradient linearGradient = new LinearGradient(f3, rectF.top, f3, rectF.bottom, iArr, f8252a, Shader.TileMode.CLAMP);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setShader(linearGradient);
        canvas.drawRect(rectF, paint);
        paint.setShader(null);
        float height = rectF.height();
        float min = Math.min(f2, Math.max(1.5f, 0.16f * height));
        float min2 = Math.min(f2, Math.max(1.0f, height * 0.09f));
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(min);
        paint.setColor(iArr[5]);
        float f4 = (min * 0.5f) + rectF.top;
        canvas.drawLine(rectF.left, f4, rectF.right, f4, paint);
        paint.setStrokeWidth(min2);
        paint.setColor(iArr[0]);
        float f5 = rectF.bottom - (min2 * 0.5f);
        canvas.drawLine(rectF.left, f5, rectF.right, f5, paint);
        paint.setStyle(style);
    }

    /* renamed from: G */
    public static void m4185G(Canvas canvas, RectF rectF, float f2, int i, int i2, int i3, float f3, int i4, int i5, int i6, boolean z2, Paint paint) {
        Paint paint2;
        Shader shader;
        float f4;
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        float max = Math.max(0.0f, Math.min(rectF.width(), f2));
        if (z2) {
            if (max > 0.0f) {
                float f5 = rectF.left;
                m4180B(canvas, new RectF(f5, rectF.top, f5 + max, rectF.bottom), i, i2, i3, f3, true, paint);
            }
            if (max < rectF.width()) {
                RectF rectF2 = new RectF(rectF.left + max, rectF.top, rectF.right, rectF.bottom);
                if (rectF2.width() > 0.0f && rectF2.height() > 0.0f) {
                    paint.reset();
                    paint.setAntiAlias(true);
                    paint.setStyle(Paint.Style.FILL);
                    paint.setShader(null);
                    paint.setColor(i4);
                    canvas.drawRect(rectF2, paint);
                    if (max > 0.5f && max < rectF.width() - 0.5f) {
                        paint.reset();
                        paint.setAntiAlias(true);
                        paint.setStyle(Paint.Style.STROKE);
                        paint.setStrokeWidth(1.0f);
                        paint.setColor(m4233o(0.35f, i6, -16777216));
                        float f6 = rectF.left + max;
                        canvas.drawLine(f6, rectF.top + 1.0f, f6, rectF.bottom - 1.0f, paint);
                    }
                    paint2 = paint;
                    f4 = 1.0f;
                    shader = null;
                }
            }
            if (max > 0.5f) {
                paint.reset();
                paint.setAntiAlias(true);
                paint.setStyle(Paint.Style.STROKE);
                paint.setStrokeWidth(1.0f);
                paint.setColor(m4233o(0.35f, i6, -16777216));
                float f62 = rectF.left + max;
                canvas.drawLine(f62, rectF.top + 1.0f, f62, rectF.bottom - 1.0f, paint);
            }
            paint2 = paint;
            f4 = 1.0f;
            shader = null;
        } else {
            m4186H(canvas, rectF, i4, i5, f3, paint);
            if (max > 0.0f) {
                float f7 = rectF.left;
                paint2 = paint;
                shader = null;
                f4 = 1.0f;
                m4180B(canvas, new RectF(f7, rectF.top, f7 + max, rectF.bottom), i, i2, i3, f3, false, paint);
            } else {
                paint2 = paint;
                shader = null;
                f4 = 1.0f;
            }
        }
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f4);
        paint2.setShader(shader);
        paint2.setColor(i6);
        canvas.drawRect(rectF.left + 0.5f, rectF.top + 0.5f, rectF.right - 0.5f, rectF.bottom - 0.5f, paint);
    }

    /* renamed from: H */
    public static void m4186H(Canvas canvas, RectF rectF, int i, int i2, float f2, Paint paint) {
        m4184F(canvas, rectF, new int[]{m4233o(0.68f, i, -16777216), m4233o(0.32f, i, -16777216), m4233o(0.28f, i, i2), m4233o(0.68f, i, i2), m4233o(0.42f, i2, -1), m4233o(0.72f, i2, -1)}, f2, paint);
    }

    /* renamed from: I */
    public static void m4187I(Canvas canvas, float f2, float f3, float f4, boolean z2) {
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(3.0f);
        paint.setStrokeCap(z2 ? Paint.Cap.ROUND : Paint.Cap.BUTT);
        paint.setShader(new LinearGradient(f2, f4, f3, f4, new int[]{-14016496, -863342552, -288051104, -863342552, -14016496}, new float[]{0.0f, 0.22f, 0.5f, 0.78f, 1.0f}, Shader.TileMode.CLAMP));
        canvas.drawLine(f2, f4, f3, f4, paint);
        paint.setShader(null);
        paint.setStrokeWidth(1.0f);
        paint.setColor(872415231);
        float f5 = f4 - 1.5f;
        canvas.drawLine(f2 + 8.0f, f5, f3 - 8.0f, f5, paint);
    }

    /* renamed from: J */
    public static void m4188J(Canvas canvas, Path path, RectF rectF, RectF rectF2, float f2, float f3, float f4, float f5, float f6, float f7, int i, Paint paint) {
        if (f7 <= 0.001f || f5 <= 0.0f) {
            return;
        }
        m4218g0(path, rectF, rectF2, f2, f3, f4, f5, f6, f7);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(null);
        paint.setColor(i);
        canvas.drawPath(path, paint);
    }

    /* renamed from: K */
    public static int m4189K(float f2) {
        if (f2 < 15.0f) {
            return -12961222;
        }
        if (f2 < 35.0f) {
            return m4236r((f2 - 15.0f) / 20.0f, -12961222, -9934744);
        }
        if (f2 < 55.0f) {
            return m4236r((f2 - 35.0f) / 20.0f, -9934744, -3092272);
        }
        return -3092272;
    }

    /* renamed from: L */
    public static boolean m4190L(int i) {
        return i == -65536 || i == -256;
    }

    /* renamed from: M */
    public static boolean m4191M(cfgData cfgdata) {
        if (cfgdata == null) {
            return false;
        }
        m4222i0(cfgdata);
        int i = cfgdata.f2620e1;
        if (AbstractC1569q1.m4455g(i)) {
            return true;
        }
        return i == 40 || i == 41 || i == 42 || i == 43 || i == 44 || i == 45 || i == 46 || i == 47 || i == 48 || i == 49 || i == 50 || i == 51;
    }

    /* renamed from: N */
    public static boolean m4192N(TextPaint textPaint) {
        if (Math.abs(textPaint.getTextSkewX()) > 0.01f) {
            return true;
        }
        Typeface typeface = textPaint.getTypeface();
        return typeface != null && typeface.isItalic();
    }

    /* renamed from: O */
    public static boolean m4193O(int i) {
        return i == 40 || i == 47 || i == 48 || i == 49 || i == 50 || i == 51;
    }

    /* renamed from: P */
    public static boolean m4194P(cfgData cfgdata, carData cardata) {
        return m4197S(cfgdata) || m4199U(cardata);
    }

    /* renamed from: Q */
    public static boolean m4195Q(cfgData cfgdata, carData cardata) {
        return (m4197S(cfgdata) && !cfgdata.f2557P2) || m4199U(cardata);
    }

    /* renamed from: R */
    public static boolean m4196R(String str) {
        return (str == null || str.trim().isEmpty() || "---".equals(str)) ? false : true;
    }

    /* renamed from: S */
    public static boolean m4197S(cfgData cfgdata) {
        return (cfgdata == null || !cfgdata.f2553O2 || cfgdata.f2549N2) ? false : true;
    }

    /* renamed from: T */
    public static boolean m4198T(cfgData cfgdata, carData cardata) {
        return m4197S(cfgdata) && !m4199U(cardata);
    }

    /* renamed from: U */
    public static boolean m4199U(carData cardata) {
        return cardata != null && ((Integer) cardata.f2430a0.m1395d()).intValue() == 4;
    }

    /* renamed from: V */
    public static void m4200V(TextView textView, TextView textView2, C1560n1 c1560n1) {
        FrameLayout.LayoutParams layoutParams;
        int max;
        int i;
        int m4169b;
        String str;
        int i2;
        int i3;
        int m4213e;
        int i4;
        C1530d1 m4240v = m4240v(textView);
        C1530d1 m4240v2 = m4240v(textView2);
        textView.setTranslationX(0.0f);
        textView.setTranslationY(0.0f);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            textView.setLayoutParams(layoutParams);
        }
        boolean m4304e = C1563o1.m4304e(c1560n1);
        int i5 = m4240v.f8180a;
        int i6 = m4240v.f8184e;
        int i7 = m4240v2.f8183d;
        if (m4304e) {
            int m4168a = m4240v2.m4168a(c1560n1.f8459d, c1560n1.f8463f);
            if ("center".equals(c1560n1.f8436J)) {
                i4 = m4240v.m4168a(c1560n1.f8459d + c1560n1.f8434H, "center");
                int i8 = c1560n1.f8461e;
                float f2 = c1560n1.f8469i;
                if (f2 <= 0.0f) {
                    f2 = 93.333336f;
                }
                String str2 = c1560n1.f8467h;
                if (str2 == null) {
                    str2 = "europec";
                }
                float m4224j0 = m4224j0(str2, f2, c1560n1.f8471j);
                float f3 = c1560n1.f8429C ? c1560n1.f8431E : c1560n1.f8469i;
                if (f3 <= 0.0f) {
                    f3 = f2 / 3.0f;
                }
                float m4224j02 = m4224j0(c1560n1.m4295b(), f3, false);
                m4213e = m4240v.m4169b(i8 + ("top".equalsIgnoreCase(c1560n1.f8463f) ? Math.round((m4224j02 / 2.0f) + (m4224j0 - 16.0f)) : Math.round((m4224j02 / 2.0f) + ((m4224j0 / 2.0f) - 16.0f))) + c1560n1.f8435I, "center");
            } else {
                if ("left".equals(c1560n1.f8436J)) {
                    i3 = c1560n1.f8434H + (((m4168a - 8) - i6) - i5);
                    m4213e = m4213e(c1560n1, m4240v, m4240v2);
                } else {
                    i3 = c1560n1.f8434H + m4168a + i7 + 8;
                    m4213e = m4213e(c1560n1, m4240v, m4240v2);
                }
                i4 = i3;
            }
            layoutParams.leftMargin = i4;
            layoutParams.topMargin = m4213e;
            textView.setLayoutParams(layoutParams);
            return;
        }
        int i9 = c1560n1.f8434H;
        if (i9 != 0 || c1560n1.f8435I == 0) {
            if (i9 != 0 || c1560n1.f8435I == 0) {
                String str3 = c1560n1.f8486u;
                float measureText = textView2.getPaint().measureText((str3 == null || str3.isEmpty()) ? "00" : c1560n1.f8486u);
                TextPaint paint = textView.getPaint();
                String str4 = c1560n1.f8489x;
                if (str4 == null) {
                    str4 = "";
                }
                float measureText2 = paint.measureText(str4);
                if (C1563o1.m4301b(c1560n1.f8463f)) {
                    measureText *= 0.5f;
                }
                int i10 = c1560n1.f8434H;
                max = i10 < 0 ? Math.max(0, Math.round(((-i10) - measureText) - measureText2)) : Math.max(0, Math.round(i10 - measureText));
            } else {
                max = 0;
            }
            boolean m4301b = C1563o1.m4301b(c1560n1.f8463f);
            String str5 = c1560n1.f8463f;
            int i11 = c1560n1.f8459d;
            boolean m4300a = C1563o1.m4300a(str5);
            int i12 = m4240v2.f8180a;
            if (!m4300a || i12 != 0 || m4240v2.f8182c != 0) {
                if (C1563o1.m4300a(str5)) {
                    i11 = m4240v2.m4168a(i11, str5);
                } else {
                    if (m4301b) {
                        i11 -= m4240v2.f8184e / 2;
                    }
                    i11 -= i12;
                }
            }
            int i13 = c1560n1.f8434H < 0 ? ((i11 - max) - i6) - i5 : i7 + i11 + max;
            if (C1563o1.m4302c(c1560n1.f8463f)) {
                m4169b = m4240v.m4169b(c1560n1.f8461e + c1560n1.f8435I, "center");
            } else {
                if (!C1563o1.m4302c(c1560n1.f8463f) && (str = c1560n1.f8463f) != null && !str.isEmpty()) {
                    String str6 = c1560n1.f8467h;
                    if (str6 == null) {
                        str6 = "sans-serif";
                    }
                    float f4 = c1560n1.f8469i;
                    if (f4 <= 0.0f) {
                        f4 = 26.0f;
                    }
                    float m4224j03 = m4224j0(str6, f4, c1560n1.f8471j);
                    float f5 = c1560n1.f8429C ? c1560n1.f8431E : c1560n1.f8469i;
                    if (f5 <= 0.0f) {
                        f5 = Math.max(12.0f, c1560n1.f8469i * 0.7f);
                    }
                    float m4224j04 = m4224j0(c1560n1.m4295b(), f5, c1560n1.f8429C ? c1560n1.f8432F : c1560n1.f8471j);
                    if ("top".equalsIgnoreCase(c1560n1.f8463f) || "topleft".equalsIgnoreCase(c1560n1.f8463f)) {
                        i = Math.round((m4224j03 - m4224j04) / 2.0f);
                        m4169b = (((c1560n1.f8435I - i) + ((m4240v2.f8185f / 2) + (m4240v2.m4169b(c1560n1.f8461e, c1560n1.f8463f) + m4240v2.f8181b))) - (m4240v.f8185f / 2)) - m4240v.f8181b;
                    }
                }
                i = 0;
                m4169b = (((c1560n1.f8435I - i) + ((m4240v2.f8185f / 2) + (m4240v2.m4169b(c1560n1.f8461e, c1560n1.f8463f) + m4240v2.f8181b))) - (m4240v.f8185f / 2)) - m4240v.f8181b;
            }
            i2 = i13;
        } else {
            i2 = m4240v.m4168a(c1560n1.f8459d, "center");
            m4169b = m4240v.m4169b(c1560n1.f8461e + c1560n1.f8435I, "center");
        }
        layoutParams.leftMargin = i2;
        layoutParams.topMargin = m4169b;
        textView.setLayoutParams(layoutParams);
    }

    /* renamed from: W */
    public static void m4201W(TextView textView, int i, int i2, String str) {
        FrameLayout.LayoutParams layoutParams;
        C1530d1 m4240v = m4240v(textView);
        textView.setTranslationX(0.0f);
        textView.setTranslationY(0.0f);
        ViewGroup.LayoutParams layoutParams2 = textView.getLayoutParams();
        if (layoutParams2 instanceof FrameLayout.LayoutParams) {
            layoutParams = (FrameLayout.LayoutParams) layoutParams2;
        } else {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
            textView.setLayoutParams(layoutParams);
        }
        layoutParams.leftMargin = m4240v.m4168a(i, str);
        layoutParams.topMargin = m4240v.m4169b(i2, str);
        textView.setLayoutParams(layoutParams);
    }

    /* renamed from: X */
    public static void m4202X(TextView textView, TextView textView2, TextView textView3) {
        m4227l(textView);
        m4227l(textView2);
        m4219h(textView3, "88.8 L");
        m4203Y(textView);
        m4203Y(textView2);
        m4203Y(textView3);
    }

    /* renamed from: Y */
    public static void m4203Y(TextView textView) {
        if (textView == null) {
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        int round = Math.round(textView.getLineSpacingExtra()) + Math.max(1, (fontMetricsInt.descent - fontMetricsInt.ascent) + fontMetricsInt.leading);
        if (textView.getMinHeight() != round) {
            textView.setMinHeight(round);
            textView.setMinimumHeight(round);
        }
        textView.setGravity(8388627);
    }

    /* renamed from: Z */
    public static void m4204Z(TextView textView, TextView textView2, TextView textView3) {
        m4219h(textView, "888888");
        m4219h(textView2, "8888.8");
        m4219h(textView3, "888888");
    }

    /* renamed from: a */
    public static void m4205a(C1525c c1525c, int i, int i2, float f2, float f3, float f4) {
        RectF rectF;
        if (c1525c == null || i <= 0 || i2 <= 0) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f3));
        if (max <= 0.0f) {
            return;
        }
        float f5 = 14.0f * f2;
        RectF m4208b0 = m4208b0(m4239u(), i, i2);
        if (max >= 1.0f) {
            rectF = new RectF(m4208b0);
        } else {
            float centerX = m4208b0.centerX();
            float centerY = m4208b0.centerY();
            if (max <= 0.0f) {
                rectF = new RectF(centerX, centerY, centerX, centerY);
            } else {
                float width = m4208b0.width() * 0.5f * max;
                float height = m4208b0.height() * 0.5f * max;
                rectF = new RectF(centerX - width, centerY - height, centerX + width, centerY + height);
            }
        }
        if (rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        c1525c.m4159a(rectF.left, rectF.top, rectF.right, rectF.bottom, f5, f4);
    }

    /* renamed from: a0 */
    public static RectF m4206a0(Rect rect, int i, int i2) {
        float f2 = i / 1920.0f;
        float f3 = i2 / 800.0f;
        return new RectF(rect.left * f2, rect.top * f3, rect.right * f2, rect.bottom * f3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [android.view.View] */
    /* renamed from: b */
    public static void m4207b(ViewGroup viewGroup) {
        for (ViewGroup viewGroup2 = viewGroup; viewGroup2 instanceof ViewGroup; viewGroup2 = (View) viewGroup2.getParent()) {
            ViewGroup viewGroup3 = viewGroup2;
            viewGroup3.setClipChildren(false);
            viewGroup3.setClipToPadding(false);
            if (!(viewGroup2.getParent() instanceof View)) {
                return;
            }
        }
    }

    /* renamed from: b0 */
    public static RectF m4208b0(Rect rect, int i, int i2) {
        float f2 = i / 1920.0f;
        float f3 = i2 / 800.0f;
        return new RectF(rect.left * f2, rect.top * f3, rect.right * f2, rect.bottom * f3);
    }

    /* renamed from: c */
    public static boolean m4209c(carData cardata) {
        if (m4199U(cardata)) {
            return false;
        }
        cfgData m1784i = cfgData.m1784i();
        return m1784i == null || m4196R(m1784i.f2548N1) || m1784i.f2549N2;
    }

    /* renamed from: c0 */
    public static Rect m4210c0(int i) {
        if (i == 40) {
            int i2 = C1576u.f8691G1;
            return new Rect(0, 0, 1920, 715);
        }
        if (i == 48) {
            int i3 = C1583x0.f8844s1;
            return new Rect(0, 0, 1920, 715);
        }
        if (i == 49) {
            int i4 = C1477E0.f7300s1;
            return new Rect(0, 0, 1920, 715);
        }
        if (i == 50) {
            int i5 = C1491L0.f7527s1;
            return new Rect(0, 0, 1920, 715);
        }
        if (i == 51) {
            int i6 = C1506T0.f7762m1;
            return new Rect(0, 0, 1920, 715);
        }
        int i7 = C1568q0.f8540u1;
        return new Rect(0, 0, 1920, 715);
    }

    /* renamed from: d */
    public static boolean m4211d(cfgData cfgdata, carData cardata) {
        if (cfgdata == null || !cfgdata.f2537K2 || cfgdata.f2549N2 || AbstractC1372y1.m3299e("ip_navi_full")) {
            return false;
        }
        return !m4199U(cardata);
    }

    /* renamed from: d0 */
    public static Rect m4212d0(int i) {
        if (i == 40) {
            int i2 = C1576u.f8691G1;
            return new Rect(m4238t().left + 27, 69, r4.right - 27, 695);
        }
        if (i == 48) {
            int i3 = C1583x0.f8844s1;
            return new Rect(m4238t().left + 17, 69, r4.right - 17, 695);
        }
        if (i == 49) {
            int i4 = C1477E0.f7300s1;
            return new Rect(m4238t().left + 17, 69, r4.right - 17, 695);
        }
        if (i == 50) {
            int i5 = C1491L0.f7527s1;
            return new Rect(m4238t().left + 17, 69, r4.right - 17, 695);
        }
        if (i == 51) {
            int i6 = C1506T0.f7762m1;
            return new Rect(m4238t().left + 20, 69, r4.right - 20, 695);
        }
        int i7 = C1568q0.f8540u1;
        return new Rect(m4238t().left + 17, 69, r4.right - 17, 695);
    }

    /* renamed from: e */
    public static int m4213e(C1560n1 c1560n1, C1530d1 c1530d1, C1530d1 c1530d12) {
        if (C1563o1.m4302c(c1560n1.f8463f)) {
            return c1530d1.m4169b(c1560n1.f8461e + c1560n1.f8435I, "center");
        }
        return ((((c1530d12.f8185f / 2) + (c1530d12.m4169b(c1560n1.f8461e, c1560n1.f8463f) + c1530d12.f8181b)) + c1560n1.f8435I) - (c1530d1.f8185f / 2)) - c1530d1.f8181b;
    }

    /* renamed from: e0 */
    public static RectF m4214e0(C1542h1 c1542h1) {
        float f2 = c1542h1.f8327a;
        float f3 = c1542h1.f8329c;
        float f4 = c1542h1.f8330d;
        return new RectF(f2 - f3, f4 - f3, f2 + f3, f4);
    }

    /* renamed from: f */
    public static void m4215f(int i, View view, boolean z2) {
        if (view == null) {
            return;
        }
        if (z2) {
            i = R.color.transparent;
        }
        view.setBackgroundResource(i);
    }

    /* renamed from: f0 */
    public static Typeface m4216f0(Context context, int i, String str) {
        if (context == null) {
            context = f8253b;
        }
        Typeface typeface = null;
        if (context != null && str != null && !str.isEmpty()) {
            String lowerCase = str.toLowerCase(Locale.US);
            lowerCase.getClass();
            switch (lowerCase) {
                case "europec":
                    if (f8254c == null) {
                        try {
                            typeface = AbstractC0049p.m101a(context, com.altaysoft.t500_split.R.font.europec);
                        } catch (Exception unused) {
                        }
                        f8254c = typeface;
                    }
                    typeface = f8254c;
                    break;
                case "arialmt":
                    if (f8256e == null) {
                        try {
                            typeface = AbstractC0049p.m101a(context, com.altaysoft.t500_split.R.font.arialmt);
                        } catch (Exception unused2) {
                        }
                        f8256e = typeface;
                    }
                    typeface = f8256e;
                    break;
                case "naziona":
                    if (f8255d == null) {
                        try {
                            typeface = AbstractC0049p.m101a(context, com.altaysoft.t500_split.R.font.naziona);
                        } catch (Exception unused3) {
                        }
                        f8255d = typeface;
                    }
                    typeface = f8255d;
                    break;
            }
        }
        if (typeface == null) {
            if (str == null || str.isEmpty()) {
                str = "sans-serif";
            }
            typeface = Typeface.create(str, 0);
        }
        if (typeface == null) {
            typeface = Typeface.DEFAULT;
        }
        return i == 0 ? typeface : Typeface.create(typeface, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4217g(View view, float f2) {
        boolean z2;
        int round;
        if (view == null) {
            return;
        }
        int round2 = Math.round(10.0f);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        boolean z3 = true;
        if (layoutParams.height <= 0 || layoutParams.height == (round = Math.round(f2))) {
            z2 = false;
        } else {
            layoutParams.height = round;
            z2 = true;
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int i = -round2;
            if (marginLayoutParams.bottomMargin != i) {
                marginLayoutParams.bottomMargin = i;
                if (z3) {
                    return;
                }
                view.setLayoutParams(layoutParams);
                return;
            }
        }
        z3 = z2;
        if (z3) {
        }
    }

    /* renamed from: g0 */
    public static void m4218g0(Path path, RectF rectF, RectF rectF2, float f2, float f3, float f4, float f5, float f6, float f7) {
        float f8 = f5 * 0.5f;
        float f9 = f4 + f8;
        float max = Math.max(0.5f, f4 - f8);
        rectF.set(f2 - f9, f3 - f9, f2 + f9, f9 + f3);
        rectF2.set(f2 - max, f3 - max, f2 + max, f3 + max);
        path.rewind();
        path.arcTo(rectF, f6, f7);
        path.arcTo(rectF2, f6 + f7, -f7);
        path.close();
    }

    /* renamed from: h */
    public static void m4219h(TextView textView, String str) {
        m4229m(textView, str);
        if (textView == null) {
            return;
        }
        textView.setTextAlignment(5);
        textView.setGravity(8388627);
    }

    /* renamed from: h0 */
    public static boolean m4220h0(cfgData cfgdata, String str) {
        int i;
        EnumC1456b enumC1456b;
        if (cfgdata == null || cfgdata.f2565R2 || (i = cfgdata.f2620e1) == 42 || i == 43 || i == 44 || i == 45 || i == 46 || i == 51) {
            return true;
        }
        if ((str == null || str.isEmpty()) && (enumC1456b = cfgdata.f2615d1) != null) {
            str = enumC1456b.f7102b;
        }
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            if (lowerCase.contains("glass") || lowerCase.contains("cool neon")) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public static void m4221i(View view, View view2, cfgData cfgdata, boolean z2) {
        EnumC1455a enumC1455a;
        int i = (z2 || cfgdata == null || !((enumC1455a = cfgdata.f2625f1) == EnumC1455a.f6985o || enumC1455a == EnumC1455a.f6997r)) ? 0 : 4;
        if (view != null) {
            view.setVisibility(i);
        }
        if (view2 != null) {
            view2.setVisibility(i);
        }
    }

    /* renamed from: i0 */
    public static void m4222i0(cfgData cfgdata) {
        if (cfgdata == null) {
            return;
        }
        cfgdata.f2615d1 = AbstractC1372y1.m3309o(cfgdata.f2620e1);
    }

    /* renamed from: j */
    public static void m4223j(TextView textView, View view) {
        if (textView == null) {
            return;
        }
        m4219h(textView, "ODO: 888888");
        int max = Math.max(1, Math.round(Math.max(textView.getPaint().measureText("ODO: 888888"), Math.max(textView.getPaint().measureText("Day: 8888.8"), textView.getPaint().measureText("Trip: 888888")))));
        if (textView.getMinWidth() != max) {
            textView.setMinWidth(max);
        }
        if (view != null) {
            int paddingEnd = view.getPaddingEnd() + view.getPaddingStart() + max;
            if (view.getMinimumWidth() != paddingEnd) {
                view.setMinimumWidth(paddingEnd);
            }
        }
    }

    /* renamed from: j0 */
    public static float m4224j0(String str, float f2, boolean z2) {
        Paint paint = new Paint(1);
        paint.setTextSize(f2);
        paint.setTypeface(m4216f0(f8253b, z2 ? 1 : 0, str));
        Paint.FontMetrics fontMetrics = paint.getFontMetrics();
        return fontMetrics.descent - fontMetrics.ascent;
    }

    /* renamed from: k */
    public static void m4225k(Context context) {
        if (context != null) {
            cfgData m1784i = cfgData.m1784i();
            carData cardata = carData.getInstance();
            if (m4191M(m1784i) && m4199U(cardata) && m1784i.f2557P2) {
                m1784i.f2557P2 = false;
                m1784i.m1795o(context);
                cardata.setIp_navi_full(false);
            }
        }
        if (context == null) {
            return;
        }
        cfgData m1784i2 = cfgData.m1784i();
        carData cardata2 = carData.getInstance();
        if (m4191M(m1784i2) && m4199U(cardata2) && m1784i2.f2549N2) {
            m1784i2.f2549N2 = false;
            m1784i2.m1795o(context);
            cardata2.m1760l0(false);
        }
    }

    /* renamed from: k0 */
    public static void m4226k0(Context context) {
        String str;
        cfgData m1784i = cfgData.m1784i();
        if (m1784i.f2553O2 && !m1784i.f2549N2 && m1784i.alicealways && (str = m1784i.f2548N1) != null) {
            try {
                if (AbstractC1372y1.m3313s(2, str) < 0) {
                    return;
                }
                String m3314t = AbstractC1372y1.m3314t(2);
                boolean z2 = m3314t != null && m3314t.contains(str);
                int m3313s = cfgData.m1784i().f2545M2 ? -1 : AbstractC1372y1.m3313s(2, context.getPackageName());
                boolean z3 = m3313s >= 0;
                if (!z2 || z3) {
                    if (z3) {
                        AbstractC1372y1.m3285P(m3313s, 2);
                    }
                    Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(str);
                    if (launchIntentForPackage == null) {
                        return;
                    }
                    launchIntentForPackage.addFlags(131072);
                    ActivityOptions makeBasic = ActivityOptions.makeBasic();
                    makeBasic.setLaunchDisplayId(2);
                    context.startActivity(launchIntentForPackage, makeBasic.toBundle());
                }
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: l */
    public static void m4227l(TextView textView) {
        if (textView == null) {
            return;
        }
        textView.setFontFeatureSettings("tnum");
        textView.setMinWidth(0);
        textView.setMinimumWidth(0);
        textView.setTextAlignment(5);
        textView.setGravity(8388627);
    }

    /* renamed from: l0 */
    public static void m4228l0(View view, boolean z2) {
        if (view == null || !(view.getParent() instanceof FrameLayout)) {
            return;
        }
        FrameLayout frameLayout = (FrameLayout) view.getParent();
        TextView textView = (TextView) frameLayout.findViewById(com.altaysoft.t500_split.R.id.id_stock_remain);
        if (textView == null) {
            textView = new TextView(frameLayout.getContext());
            textView.setId(com.altaysoft.t500_split.R.id.id_stock_remain);
            textView.setBackgroundColor(-14013910);
            textView.setTextColor(-1);
            textView.setTypeface(Typeface.create("sans-serif", 1));
            textView.setTextSize(2, 18.0f);
            textView.setGravity(17);
            textView.setIncludeFontPadding(false);
            textView.setClickable(false);
            textView.setFocusable(false);
            textView.setElevation(1.0f);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(100, 30, 8388659);
            layoutParams.leftMargin = 215;
            layoutParams.topMargin = 645;
            int indexOfChild = frameLayout.indexOfChild(view) + 1;
            if (indexOfChild <= 0) {
                indexOfChild = frameLayout.getChildCount();
            }
            frameLayout.addView(textView, Math.min(indexOfChild, frameLayout.getChildCount()), layoutParams);
        }
        cfgData m1784i = cfgData.m1784i();
        boolean z3 = z2 && m1784i.f2709w0 && !AbstractC1372y1.m3272C();
        textView.setVisibility(z3 ? 0 : 4);
        if (z3) {
            textView.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(m1784i.f2543M0.f7147f ? carData.getInstance().m1778x() : carData.getInstance().m1777w())));
        }
    }

    /* renamed from: m */
    public static void m4229m(TextView textView, String str) {
        if (textView == null || str.isEmpty()) {
            return;
        }
        textView.setFontFeatureSettings("tnum");
        int max = Math.max(1, Math.round(textView.getPaint().measureText(str)));
        if (textView.getMinWidth() != max) {
            textView.setMinWidth(max);
        }
    }

    /* renamed from: m0 */
    public static boolean m4230m0(cfgData cfgdata, carData cardata) {
        EnumC1455a enumC1455a;
        return (cfgdata == null || cardata == null || m4194P(cfgdata, cardata) || (enumC1455a = cfgdata.f2625f1) == null || enumC1455a == EnumC1455a.f6949f || cfgdata.f2630g1 > 30 || enumC1455a.f7036d == 0) ? false : true;
    }

    /* renamed from: n */
    public static Rect m4231n(int i) {
        return i == 10 ? new Rect(110, 220, 620, 610) : new Rect(610, 100, 1313, 675);
    }

    /* renamed from: n0 */
    public static Rect m4232n0() {
        RectF m4214e0 = m4214e0(C1542h1.m4284a(1920.0f, 720.0f, 58.0f, 80.0f, 20.0f, 107.0f, 25.0f, 32.0f, 19.0f, 12.0f, 4.0f, 30.0f, 1.0f));
        RectF m4214e02 = m4214e0(C1542h1.m4284a(1920.0f, 720.0f, 58.0f, 80.0f, 20.0f, 107.0f, 25.0f, 32.0f, 19.0f, 12.0f, 4.0f, 30.0f, 0.0f));
        RectF rectF = new RectF(m4214e0.left, Math.min(m4214e0.top, m4214e02.top), m4214e02.right, Math.max(m4214e0.bottom, m4214e02.bottom));
        r0.right -= 20;
        return new Rect(Math.round(rectF.left), Math.round(rectF.top * 1.1111112f), Math.round(rectF.right), Math.round(rectF.bottom * 1.1111112f));
    }

    /* renamed from: o */
    public static int m4233o(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * max) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * max) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * max) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * max) + Color.blue(i)));
    }

    /* renamed from: p */
    public static int m4234p(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * max) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * max) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * max) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * max) + Color.blue(i)));
    }

    /* renamed from: q */
    public static int m4235q(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * max) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * max) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * max) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * max) + Color.blue(i)));
    }

    /* renamed from: r */
    public static int m4236r(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * max) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * max) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * max) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * max) + Color.blue(i)));
    }

    /* renamed from: s */
    public static int m4237s(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * max) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * max) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * max) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * max) + Color.blue(i)));
    }

    /* renamed from: t */
    public static Rect m4238t() {
        return new Rect(610, 105, 1310, 665);
    }

    /* renamed from: u */
    public static Rect m4239u() {
        return new Rect(1427, 251, 1785, 646);
    }

    /* renamed from: v */
    public static C1530d1 m4240v(TextView textView) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        String str;
        int i6;
        int i7;
        int i8;
        int height;
        CharSequence text = textView.getText();
        String charSequence = text != null ? text.toString() : "";
        TextPaint paint = textView.getPaint();
        int i9 = 0;
        if (paint == null || charSequence == null || charSequence.isEmpty()) {
            i = 0;
        } else {
            paint.getTextBounds(charSequence, 0, charSequence.length(), new Rect());
            i = Math.max(0, (int) Math.ceil(-r5.left));
        }
        if (paint == null || charSequence == null || charSequence.isEmpty()) {
            i2 = 0;
        } else {
            paint.getTextBounds(charSequence, 0, charSequence.length(), new Rect());
            i2 = Math.max(0, (int) Math.ceil(r6.right - paint.measureText(charSequence)));
        }
        if (charSequence.isEmpty()) {
            i3 = 0;
            i4 = 0;
        } else {
            paint.getTextBounds(charSequence, 0, charSequence.length(), new Rect());
            Paint.FontMetrics fontMetrics = paint.getFontMetrics();
            i4 = Math.max(0, (int) Math.ceil((-r7.top) + fontMetrics.ascent));
            i3 = Math.max(0, (int) Math.ceil(r7.bottom - fontMetrics.descent));
        }
        Typeface typeface = paint.getTypeface();
        int max = (typeface == null || !typeface.isBold()) ? 0 : Math.max(1, Math.round(paint.getTextSize() * 0.08f));
        if (textView instanceof C1527c1) {
            float f3 = ((C1527c1) textView).f8170l;
            i5 = f3 <= 0.0f ? 0 : Math.max(1, Math.round(f3 + 1.0f));
            f2 = i5;
        } else {
            i5 = 0;
            f2 = 0.0f;
        }
        int max2 = Math.max(i, max);
        int max3 = Math.max(i4, max);
        int max4 = Math.max(i2, max);
        int max5 = Math.max(i3, max);
        if (m4192N(paint)) {
            float abs = Math.abs(paint.getTextSkewX());
            if (abs <= 0.01f) {
                abs = 0.25f;
            }
            Paint.FontMetrics fontMetrics2 = paint.getFontMetrics();
            float max6 = Math.max(fontMetrics2.descent, fontMetrics2.bottom);
            if (charSequence.isEmpty()) {
                str = "";
            } else {
                str = "";
                paint.getTextBounds(charSequence, 0, charSequence.length(), new Rect());
                max6 = Math.max(max6, r13.bottom);
            }
            if (max6 < 0.0f) {
                max6 = 0.0f;
            }
            float f4 = abs * max6;
            i6 = i;
            i9 = ((int) Math.ceil(f4)) + 1;
        } else {
            str = "";
            i6 = i;
        }
        if (m4192N(paint)) {
            float abs2 = Math.abs(paint.getTextSkewX());
            float f5 = abs2 > 0.01f ? abs2 : 0.25f;
            float textSize = paint.getTextSize();
            Paint.FontMetrics fontMetrics3 = paint.getFontMetrics();
            float max7 = Math.max(Math.max(textSize, -fontMetrics3.ascent), -fontMetrics3.top);
            if (!charSequence.isEmpty()) {
                Rect rect = new Rect();
                paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
                if (rect.top < 0) {
                    max7 = Math.max(max7, -r1);
                }
            }
            if (f2 > 0.0f) {
                max7 += f2;
            }
            int ceil = (int) Math.ceil(f5 * max7);
            i7 = 2;
            i8 = ceil + 2;
        } else {
            i8 = 0;
            i7 = 2;
        }
        int max8 = !m4192N(paint) ? 0 : Math.max(i7, (int) Math.ceil(paint.getTextSize() * 0.08f));
        int max9 = Math.max(max2, i6 + i9);
        int max10 = Math.max(max4, i2 + i8);
        int i10 = i5 + max9;
        int i11 = max3 + max8 + i5;
        int i12 = i5 + max10;
        int i13 = i5 + max5;
        int i14 = max9 - max2;
        int i15 = max10 - max4;
        if (textView.getPaddingLeft() != i10 || textView.getPaddingTop() != i11 || textView.getPaddingRight() != i12 || textView.getPaddingBottom() != i13) {
            textView.setPadding(i10, i11, i12, i13);
        }
        CharSequence text2 = textView.getText();
        int max11 = i10 + i12 > 0 ? Math.max(1, Math.round(textView.getPaint().measureText(text2 != null ? text2.toString() : str)) + i10 + i12) : 0;
        if (textView.getMinWidth() != max11) {
            textView.setMinWidth(max11);
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredWidth = textView.getMeasuredWidth();
        if (measuredWidth <= 0) {
            if (textView.getWidth() > 0) {
                measuredWidth = textView.getWidth();
            } else {
                CharSequence text3 = textView.getText();
                measuredWidth = Math.max(Math.max(1, Math.round(textView.getPaint().measureText(text3 != null ? text3.toString() : str))), textView.getMinWidth());
            }
        }
        int i16 = measuredWidth;
        textView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        int measuredHeight = textView.getMeasuredHeight();
        if (measuredHeight > 0) {
            height = measuredHeight;
        } else {
            height = textView.getHeight() > 0 ? textView.getHeight() : Math.max(1, textView.getLineHeight());
        }
        return new C1530d1(i14, max8, i15, i16, height);
    }

    /* renamed from: w */
    public static int m4241w(float f2) {
        if (f2 < 40.0f) {
            return -11511712;
        }
        if (f2 > 107.0f) {
            return -3624808;
        }
        if (f2 > 100.0f) {
            return m4234p((f2 - 100.0f) / 7.0f, -6774616, -3624808);
        }
        if (f2 < 75.0f) {
            return m4234p((f2 - 40.0f) / 35.0f, -11511712, -6774616);
        }
        return -6774616;
    }

    /* renamed from: x */
    public static int m4242x(float f2) {
        if (f2 < 40.0f) {
            return -14143432;
        }
        if (f2 > 112.0f) {
            return -3090208;
        }
        if (f2 > 107.0f) {
            return m4236r((f2 - 107.0f) / 5.0f, -7825240, -3090208);
        }
        if (f2 < 75.0f) {
            return m4236r((f2 - 40.0f) / 35.0f, -14143432, -7825240);
        }
        return -7825240;
    }

    /* renamed from: y */
    public static void m4243y(MainActivity mainActivity) {
        cfgData m1784i = cfgData.m1784i();
        carData cardata = carData.getInstance();
        if (m1784i == null || !m1784i.f2549N2 || m4196R(m1784i.f2548N1)) {
            return;
        }
        m1784i.f2549N2 = false;
        m1784i.m1795o(mainActivity);
        cardata.m1760l0(false);
    }

    /* renamed from: z */
    public static void m4244z(Canvas canvas, Path path, RectF rectF, RectF rectF2, float f2, float f3, float f4, float f5, float f6, float f7, int i, int i2, boolean z2, Paint paint) {
        int[] iArr;
        if (f7 <= 0.001f || f5 <= 0.0f) {
            return;
        }
        m4218g0(path, rectF, rectF2, f2, f3, f4, f5, f6, f7);
        float f8 = f5 * 0.5f;
        float f9 = f4 + f8;
        float max = Math.max(0.5f, f4 - f8);
        float f10 = max / f9;
        float f11 = 1.0f - f10;
        int[] iArr2 = z2 ? new int[]{m4233o(0.26f, i, -16777216), m4233o(0.12f, i, -16777216), m4233o(0.32f, i, i2), m4233o(0.64f, i, i2), m4233o(0.12f, i2, -1), m4233o(0.26f, i2, -1)} : new int[]{m4233o(0.68f, i, -16777216), m4233o(0.32f, i, -16777216), m4233o(0.28f, i, i2), m4233o(0.68f, i, i2), m4233o(0.42f, i2, -1), m4233o(0.72f, i2, -1)};
        if (z2) {
            int[] iArr3 = new int[iArr2.length];
            for (int i3 = 0; i3 < iArr2.length; i3++) {
                iArr3[i3] = iArr2[(iArr2.length - 1) - i3];
            }
            iArr = iArr3;
        } else {
            iArr = iArr2;
        }
        RadialGradient radialGradient = new RadialGradient(f2, f3, f9, iArr, new float[]{f10, (0.14f * f11) + f10, (0.38f * f11) + f10, (0.62f * f11) + f10, (f11 * 0.86f) + f10, 1.0f}, Shader.TileMode.CLAMP);
        paint.reset();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setShader(radialGradient);
        canvas.drawPath(path, paint);
        paint.setShader(null);
        float max2 = Math.max(2.5f, 0.16f * f5);
        float max3 = Math.max(1.5f, 0.09f * f5);
        rectF.set(f2 - f9, f3 - f9, f2 + f9, f3 + f9);
        rectF2.set(f2 - max, f3 - max, f2 + max, f3 + max);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setStrokeWidth(max2);
        paint.setColor(iArr[5]);
        canvas.drawArc(rectF, f6, f7, false, paint);
        paint.setStrokeWidth(max3);
        paint.setColor(iArr[0]);
        canvas.drawArc(rectF2, f6, f7, false, paint);
    }
}
