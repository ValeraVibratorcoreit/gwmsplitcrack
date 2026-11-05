package p045W0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import com.altaysoft.t500_split.media.C0639g;
import com.sun.jna.Function;
import java.util.BitSet;
import java.util.Objects;
import p006C.AbstractC0055c;
import p030O0.AbstractC0260a;
import p030O0.AbstractC0262c;
import p032P0.C0266a;
import p043V0.C0349a;
import p121y0.AbstractC1687o;

/* renamed from: W0.g */
/* loaded from: classes.dex */
public class C0357g extends Drawable implements InterfaceC0372v {

    /* renamed from: B */
    public static final Paint f1024B;

    /* renamed from: A */
    public final boolean f1025A;

    /* renamed from: f */
    public C0356f f1026f;

    /* renamed from: g */
    public final AbstractC0370t[] f1027g;

    /* renamed from: h */
    public final AbstractC0370t[] f1028h;

    /* renamed from: i */
    public final BitSet f1029i;

    /* renamed from: j */
    public boolean f1030j;

    /* renamed from: k */
    public final Matrix f1031k;

    /* renamed from: l */
    public final Path f1032l;

    /* renamed from: m */
    public final Path f1033m;

    /* renamed from: n */
    public final RectF f1034n;

    /* renamed from: o */
    public final RectF f1035o;

    /* renamed from: p */
    public final Region f1036p;

    /* renamed from: q */
    public final Region f1037q;

    /* renamed from: r */
    public C0361k f1038r;

    /* renamed from: s */
    public final Paint f1039s;

    /* renamed from: t */
    public final Paint f1040t;

    /* renamed from: u */
    public final C0349a f1041u;

    /* renamed from: v */
    public final C0639g f1042v;

    /* renamed from: w */
    public final C0363m f1043w;

    /* renamed from: x */
    public PorterDuffColorFilter f1044x;

    /* renamed from: y */
    public PorterDuffColorFilter f1045y;

    /* renamed from: z */
    public final RectF f1046z;

    static {
        Paint paint = new Paint(1);
        f1024B = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public C0357g() {
        this(new C0361k());
    }

    /* renamed from: b */
    public final void m949b(RectF rectF, Path path) {
        C0356f c0356f = this.f1026f;
        this.f1043w.m969a(c0356f.f1008a, c0356f.f1016i, rectF, this.f1042v, path);
        if (this.f1026f.f1015h != 1.0f) {
            Matrix matrix = this.f1031k;
            matrix.reset();
            float f2 = this.f1026f.f1015h;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(matrix);
        }
        path.computeBounds(this.f1046z, true);
    }

    /* renamed from: c */
    public final int m950c(int i) {
        int i2;
        C0356f c0356f = this.f1026f;
        float f2 = c0356f.f1020m + 0.0f + c0356f.f1019l;
        C0266a c0266a = c0356f.f1009b;
        if (c0266a == null || !c0266a.f704a || AbstractC0055c.m107d(i, Function.USE_VARARGS) != c0266a.f707d) {
            return i;
        }
        float min = (c0266a.f708e <= 0.0f || f2 <= 0.0f) ? 0.0f : Math.min(((((float) Math.log1p(f2 / r4)) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        int alpha = Color.alpha(i);
        int m4909B = AbstractC1687o.m4909B(min, AbstractC0055c.m107d(i, Function.USE_VARARGS), c0266a.f705b);
        if (min > 0.0f && (i2 = c0266a.f706c) != 0) {
            m4909B = AbstractC0055c.m105b(AbstractC0055c.m107d(i2, C0266a.f703f), m4909B);
        }
        return AbstractC0055c.m107d(m4909B, alpha);
    }

    /* renamed from: d */
    public final void m951d(Canvas canvas) {
        if (this.f1029i.cardinality() > 0) {
            Log.w("g", "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        int i = this.f1026f.f1022o;
        Path path = this.f1032l;
        C0349a c0349a = this.f1041u;
        if (i != 0) {
            canvas.drawPath(path, c0349a.f993a);
        }
        for (int i2 = 0; i2 < 4; i2++) {
            AbstractC0370t abstractC0370t = this.f1027g[i2];
            int i3 = this.f1026f.f1021n;
            Matrix matrix = AbstractC0370t.f1101b;
            abstractC0370t.mo971a(matrix, c0349a, i3, canvas);
            this.f1028h[i2].mo971a(matrix, c0349a, this.f1026f.f1021n, canvas);
        }
        if (this.f1025A) {
            double d = 0;
            int sin = (int) (Math.sin(Math.toRadians(d)) * this.f1026f.f1022o);
            int cos = (int) (Math.cos(Math.toRadians(d)) * this.f1026f.f1022o);
            canvas.translate(-sin, -cos);
            canvas.drawPath(path, f1024B);
            canvas.translate(sin, cos);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Paint paint = this.f1039s;
        paint.setColorFilter(this.f1044x);
        int alpha = paint.getAlpha();
        int i = this.f1026f.f1018k;
        paint.setAlpha(((i + (i >>> 7)) * alpha) >>> 8);
        Paint paint2 = this.f1040t;
        paint2.setColorFilter(this.f1045y);
        paint2.setStrokeWidth(this.f1026f.f1017j);
        int alpha2 = paint2.getAlpha();
        int i2 = this.f1026f.f1018k;
        paint2.setAlpha(((i2 + (i2 >>> 7)) * alpha2) >>> 8);
        boolean z2 = this.f1030j;
        Path path = this.f1032l;
        if (z2) {
            float f2 = -(m955h() ? paint2.getStrokeWidth() / 2.0f : 0.0f);
            C0361k c0361k = this.f1026f.f1008a;
            C0360j m968e = c0361k.m968e();
            InterfaceC0353c interfaceC0353c = c0361k.f1064e;
            if (!(interfaceC0353c instanceof C0358h)) {
                interfaceC0353c = new C0352b(f2, interfaceC0353c);
            }
            m968e.f1052e = interfaceC0353c;
            InterfaceC0353c interfaceC0353c2 = c0361k.f1065f;
            if (!(interfaceC0353c2 instanceof C0358h)) {
                interfaceC0353c2 = new C0352b(f2, interfaceC0353c2);
            }
            m968e.f1053f = interfaceC0353c2;
            InterfaceC0353c interfaceC0353c3 = c0361k.f1067h;
            if (!(interfaceC0353c3 instanceof C0358h)) {
                interfaceC0353c3 = new C0352b(f2, interfaceC0353c3);
            }
            m968e.f1055h = interfaceC0353c3;
            InterfaceC0353c interfaceC0353c4 = c0361k.f1066g;
            if (!(interfaceC0353c4 instanceof C0358h)) {
                interfaceC0353c4 = new C0352b(f2, interfaceC0353c4);
            }
            m968e.f1054g = interfaceC0353c4;
            C0361k m963a = m968e.m963a();
            this.f1038r = m963a;
            float f3 = this.f1026f.f1016i;
            RectF rectF = this.f1035o;
            rectF.set(m954g());
            float strokeWidth = m955h() ? paint2.getStrokeWidth() / 2.0f : 0.0f;
            rectF.inset(strokeWidth, strokeWidth);
            this.f1043w.m969a(m963a, f3, rectF, null, this.f1033m);
            m949b(m954g(), path);
            this.f1030j = false;
        }
        C0356f c0356f = this.f1026f;
        c0356f.getClass();
        if (c0356f.f1021n > 0) {
            int i3 = Build.VERSION.SDK_INT;
            if (!this.f1026f.f1008a.m967d(m954g()) && !path.isConvex() && i3 < 29) {
                canvas.save();
                double d = 0;
                canvas.translate((int) (Math.sin(Math.toRadians(d)) * this.f1026f.f1022o), (int) (Math.cos(Math.toRadians(d)) * this.f1026f.f1022o));
                if (this.f1025A) {
                    RectF rectF2 = this.f1046z;
                    int width = (int) (rectF2.width() - getBounds().width());
                    int height = (int) (rectF2.height() - getBounds().height());
                    if (width < 0 || height < 0) {
                        throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
                    }
                    Bitmap createBitmap = Bitmap.createBitmap((this.f1026f.f1021n * 2) + ((int) rectF2.width()) + width, (this.f1026f.f1021n * 2) + ((int) rectF2.height()) + height, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    float f4 = (getBounds().left - this.f1026f.f1021n) - width;
                    float f5 = (getBounds().top - this.f1026f.f1021n) - height;
                    canvas2.translate(-f4, -f5);
                    m951d(canvas2);
                    canvas.drawBitmap(createBitmap, f4, f5, (Paint) null);
                    createBitmap.recycle();
                    canvas.restore();
                } else {
                    m951d(canvas);
                    canvas.restore();
                }
            }
        }
        C0356f c0356f2 = this.f1026f;
        Paint.Style style = c0356f2.f1023p;
        if (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL) {
            m952e(canvas, paint, path, c0356f2.f1008a, m954g());
        }
        if (m955h()) {
            mo953f(canvas);
        }
        paint.setAlpha(alpha);
        paint2.setAlpha(alpha2);
    }

    /* renamed from: e */
    public final void m952e(Canvas canvas, Paint paint, Path path, C0361k c0361k, RectF rectF) {
        if (!c0361k.m967d(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float mo939a = c0361k.f1065f.mo939a(rectF) * this.f1026f.f1016i;
            canvas.drawRoundRect(rectF, mo939a, mo939a, paint);
        }
    }

    /* renamed from: f */
    public void mo953f(Canvas canvas) {
        Paint paint = this.f1040t;
        Path path = this.f1033m;
        C0361k c0361k = this.f1038r;
        RectF rectF = this.f1035o;
        rectF.set(m954g());
        float strokeWidth = m955h() ? paint.getStrokeWidth() / 2.0f : 0.0f;
        rectF.inset(strokeWidth, strokeWidth);
        m952e(canvas, paint, path, c0361k, rectF);
    }

    /* renamed from: g */
    public final RectF m954g() {
        RectF rectF = this.f1034n;
        rectF.set(getBounds());
        return rectF;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f1026f.f1018k;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.f1026f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        this.f1026f.getClass();
        if (this.f1026f.f1008a.m967d(m954g())) {
            outline.setRoundRect(getBounds(), this.f1026f.f1008a.f1064e.mo939a(m954g()) * this.f1026f.f1016i);
            return;
        }
        RectF m954g = m954g();
        Path path = this.f1032l;
        m949b(m954g, path);
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            AbstractC0262c.m781a(outline, path);
            return;
        }
        if (i >= 29) {
            try {
                AbstractC0260a.m777a(outline, path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            AbstractC0260a.m777a(outline, path);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.f1026f.f1014g;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Region getTransparentRegion() {
        Rect bounds = getBounds();
        Region region = this.f1036p;
        region.set(bounds);
        RectF m954g = m954g();
        Path path = this.f1032l;
        m949b(m954g, path);
        Region region2 = this.f1037q;
        region2.setPath(path, region);
        region.op(region2, Region.Op.DIFFERENCE);
        return region;
    }

    /* renamed from: h */
    public final boolean m955h() {
        Paint.Style style = this.f1026f.f1023p;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f1040t.getStrokeWidth() > 0.0f;
    }

    /* renamed from: i */
    public final void m956i(Context context) {
        this.f1026f.f1009b = new C0266a(context);
        m961n();
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        this.f1030j = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        if (!super.isStateful() && ((colorStateList = this.f1026f.f1012e) == null || !colorStateList.isStateful())) {
            this.f1026f.getClass();
            ColorStateList colorStateList3 = this.f1026f.f1011d;
            if ((colorStateList3 == null || !colorStateList3.isStateful()) && ((colorStateList2 = this.f1026f.f1010c) == null || !colorStateList2.isStateful())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public final void m957j(float f2) {
        C0356f c0356f = this.f1026f;
        if (c0356f.f1020m != f2) {
            c0356f.f1020m = f2;
            m961n();
        }
    }

    /* renamed from: k */
    public final void m958k(ColorStateList colorStateList) {
        C0356f c0356f = this.f1026f;
        if (c0356f.f1010c != colorStateList) {
            c0356f.f1010c = colorStateList;
            onStateChange(getState());
        }
    }

    /* renamed from: l */
    public final boolean m959l(int[] iArr) {
        boolean z2;
        Paint paint;
        int color;
        int colorForState;
        Paint paint2;
        int color2;
        int colorForState2;
        if (this.f1026f.f1010c == null || color2 == (colorForState2 = this.f1026f.f1010c.getColorForState(iArr, (color2 = (paint2 = this.f1039s).getColor())))) {
            z2 = false;
        } else {
            paint2.setColor(colorForState2);
            z2 = true;
        }
        if (this.f1026f.f1011d == null || color == (colorForState = this.f1026f.f1011d.getColorForState(iArr, (color = (paint = this.f1040t).getColor())))) {
            return z2;
        }
        paint.setColor(colorForState);
        return true;
    }

    /* renamed from: m */
    public final boolean m960m() {
        PorterDuffColorFilter porterDuffColorFilter;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f1044x;
        PorterDuffColorFilter porterDuffColorFilter3 = this.f1045y;
        C0356f c0356f = this.f1026f;
        ColorStateList colorStateList = c0356f.f1012e;
        PorterDuff.Mode mode = c0356f.f1013f;
        Paint paint = this.f1039s;
        if (colorStateList == null || mode == null) {
            int color = paint.getColor();
            int m950c = m950c(color);
            porterDuffColorFilter = m950c != color ? new PorterDuffColorFilter(m950c, PorterDuff.Mode.SRC_IN) : null;
        } else {
            porterDuffColorFilter = new PorterDuffColorFilter(m950c(colorStateList.getColorForState(getState(), 0)), mode);
        }
        this.f1044x = porterDuffColorFilter;
        this.f1026f.getClass();
        this.f1045y = null;
        this.f1026f.getClass();
        return (Objects.equals(porterDuffColorFilter2, this.f1044x) && Objects.equals(porterDuffColorFilter3, this.f1045y)) ? false : true;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        this.f1026f = new C0356f(this.f1026f);
        return this;
    }

    /* renamed from: n */
    public final void m961n() {
        C0356f c0356f = this.f1026f;
        float f2 = c0356f.f1020m + 0.0f;
        c0356f.f1021n = (int) Math.ceil(0.75f * f2);
        this.f1026f.f1022o = (int) Math.ceil(f2 * 0.25f);
        m960m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.f1030j = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, p034Q0.InterfaceC0291h
    public boolean onStateChange(int[] iArr) {
        boolean z2 = m959l(iArr) || m960m();
        if (z2) {
            invalidateSelf();
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        C0356f c0356f = this.f1026f;
        if (c0356f.f1018k != i) {
            c0356f.f1018k = i;
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1026f.getClass();
        super.invalidateSelf();
    }

    @Override // p045W0.InterfaceC0372v
    public final void setShapeAppearanceModel(C0361k c0361k) {
        this.f1026f.f1008a = c0361k;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1026f.f1012e = colorStateList;
        m960m();
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        C0356f c0356f = this.f1026f;
        if (c0356f.f1013f != mode) {
            c0356f.f1013f = mode;
            m960m();
            super.invalidateSelf();
        }
    }

    public C0357g(Context context, AttributeSet attributeSet, int i, int i2) {
        this(C0361k.m965b(context, attributeSet, i, i2).m963a());
    }

    public C0357g(C0361k c0361k) {
        this(new C0356f(c0361k));
    }

    public C0357g(C0356f c0356f) {
        C0363m c0363m;
        this.f1027g = new AbstractC0370t[4];
        this.f1028h = new AbstractC0370t[4];
        this.f1029i = new BitSet(8);
        this.f1031k = new Matrix();
        this.f1032l = new Path();
        this.f1033m = new Path();
        this.f1034n = new RectF();
        this.f1035o = new RectF();
        this.f1036p = new Region();
        this.f1037q = new Region();
        Paint paint = new Paint(1);
        this.f1039s = paint;
        Paint paint2 = new Paint(1);
        this.f1040t = paint2;
        this.f1041u = new C0349a();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            c0363m = AbstractC0362l.f1072a;
        } else {
            c0363m = new C0363m();
        }
        this.f1043w = c0363m;
        this.f1046z = new RectF();
        this.f1025A = true;
        this.f1026f = c0356f;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        m960m();
        m959l(getState());
        this.f1042v = new C0639g(15, this);
    }
}
