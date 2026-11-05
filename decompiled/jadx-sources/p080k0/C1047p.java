package p080k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayDeque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p003B.AbstractC0035b;
import p003B.AbstractC0036c;
import p008D.AbstractC0070a;
import p008D.AbstractC0071b;
import p091o.C1192b;
import p121y0.AbstractC1687o;

/* renamed from: k0.p */
/* loaded from: classes.dex */
public final class C1047p extends AbstractC1038g {

    /* renamed from: o */
    public static final PorterDuff.Mode f4981o = PorterDuff.Mode.SRC_IN;

    /* renamed from: g */
    public C1045n f4982g;

    /* renamed from: h */
    public PorterDuffColorFilter f4983h;

    /* renamed from: i */
    public ColorFilter f4984i;

    /* renamed from: j */
    public boolean f4985j;

    /* renamed from: k */
    public boolean f4986k;

    /* renamed from: l */
    public final float[] f4987l;

    /* renamed from: m */
    public final Matrix f4988m;

    /* renamed from: n */
    public final Rect f4989n;

    public C1047p() {
        this.f4986k = true;
        this.f4987l = new float[9];
        this.f4988m = new Matrix();
        this.f4989n = new Rect();
        C1045n c1045n = new C1045n();
        c1045n.f4970c = null;
        c1045n.f4971d = f4981o;
        c1045n.f4969b = new C1044m();
        this.f4982g = c1045n;
    }

    /* renamed from: a */
    public final PorterDuffColorFilter m2643a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4926f;
        if (drawable == null) {
            return false;
        }
        AbstractC0070a.m200b(drawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Paint paint;
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        Rect rect = this.f4989n;
        copyBounds(rect);
        if (rect.width() <= 0 || rect.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f4984i;
        if (colorFilter == null) {
            colorFilter = this.f4983h;
        }
        Matrix matrix = this.f4988m;
        canvas.getMatrix(matrix);
        float[] fArr = this.f4987l;
        matrix.getValues(fArr);
        float abs = Math.abs(fArr[0]);
        float abs2 = Math.abs(fArr[4]);
        float abs3 = Math.abs(fArr[1]);
        float abs4 = Math.abs(fArr[3]);
        if (abs3 != 0.0f || abs4 != 0.0f) {
            abs = 1.0f;
            abs2 = 1.0f;
        }
        int width = (int) (rect.width() * abs);
        int min = Math.min(2048, width);
        int min2 = Math.min(2048, (int) (rect.height() * abs2));
        if (min <= 0 || min2 <= 0) {
            return;
        }
        int save = canvas.save();
        canvas.translate(rect.left, rect.top);
        if (isAutoMirrored() && AbstractC0071b.m208a(this) == 1) {
            canvas.translate(rect.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        rect.offsetTo(0, 0);
        C1045n c1045n = this.f4982g;
        Bitmap bitmap = c1045n.f4973f;
        if (bitmap == null || min != bitmap.getWidth() || min2 != c1045n.f4973f.getHeight()) {
            c1045n.f4973f = Bitmap.createBitmap(min, min2, Bitmap.Config.ARGB_8888);
            c1045n.f4978k = true;
        }
        if (this.f4986k) {
            C1045n c1045n2 = this.f4982g;
            if (c1045n2.f4978k || c1045n2.f4974g != c1045n2.f4970c || c1045n2.f4975h != c1045n2.f4971d || c1045n2.f4977j != c1045n2.f4972e || c1045n2.f4976i != c1045n2.f4969b.getRootAlpha()) {
                C1045n c1045n3 = this.f4982g;
                c1045n3.f4973f.eraseColor(0);
                Canvas canvas2 = new Canvas(c1045n3.f4973f);
                C1044m c1044m = c1045n3.f4969b;
                c1044m.m2642a(c1044m.f4959g, C1044m.f4952p, canvas2, min, min2);
                C1045n c1045n4 = this.f4982g;
                c1045n4.f4974g = c1045n4.f4970c;
                c1045n4.f4975h = c1045n4.f4971d;
                c1045n4.f4976i = c1045n4.f4969b.getRootAlpha();
                c1045n4.f4977j = c1045n4.f4972e;
                c1045n4.f4978k = false;
            }
        } else {
            C1045n c1045n5 = this.f4982g;
            c1045n5.f4973f.eraseColor(0);
            Canvas canvas3 = new Canvas(c1045n5.f4973f);
            C1044m c1044m2 = c1045n5.f4969b;
            c1044m2.m2642a(c1044m2.f4959g, C1044m.f4952p, canvas3, min, min2);
        }
        C1045n c1045n6 = this.f4982g;
        if (c1045n6.f4969b.getRootAlpha() >= 255 && colorFilter == null) {
            paint = null;
        } else {
            if (c1045n6.f4979l == null) {
                Paint paint2 = new Paint();
                c1045n6.f4979l = paint2;
                paint2.setFilterBitmap(true);
            }
            c1045n6.f4979l.setAlpha(c1045n6.f4969b.getRootAlpha());
            c1045n6.f4979l.setColorFilter(colorFilter);
            paint = c1045n6.f4979l;
        }
        canvas.drawBitmap(c1045n6.f4973f, (Rect) null, rect, paint);
        canvas.restoreToCount(save);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getAlpha() : this.f4982g.f4969b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f4982g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4926f;
        return drawable != null ? AbstractC0070a.m201c(drawable) : this.f4984i;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4926f != null) {
            return new C1046o(this.f4926f.getConstantState());
        }
        this.f4982g.f4968a = getChangingConfigurations();
        return this.f4982g;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f4982g.f4969b.f4961i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f4982g.f4969b.f4960h;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.isAutoMirrored() : this.f4982g.f4972e;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (!super.isStateful()) {
            C1045n c1045n = this.f4982g;
            if (c1045n != null) {
                C1044m c1044m = c1045n.f4969b;
                if (c1044m.f4966n == null) {
                    c1044m.f4966n = Boolean.valueOf(c1044m.f4959g.mo2639a());
                }
                if (c1044m.f4966n.booleanValue() || ((colorStateList = this.f4982g.f4970c) != null && colorStateList.isStateful())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f4985j && super.mutate() == this) {
            C1045n c1045n = this.f4982g;
            C1045n c1045n2 = new C1045n();
            c1045n2.f4970c = null;
            c1045n2.f4971d = f4981o;
            if (c1045n != null) {
                c1045n2.f4968a = c1045n.f4968a;
                C1044m c1044m = new C1044m(c1045n.f4969b);
                c1045n2.f4969b = c1044m;
                if (c1045n.f4969b.f4957e != null) {
                    c1044m.f4957e = new Paint(c1045n.f4969b.f4957e);
                }
                if (c1045n.f4969b.f4956d != null) {
                    c1045n2.f4969b.f4956d = new Paint(c1045n.f4969b.f4956d);
                }
                c1045n2.f4970c = c1045n.f4970c;
                c1045n2.f4971d = c1045n.f4971d;
                c1045n2.f4972e = c1045n.f4972e;
            }
            this.f4982g = c1045n2;
            this.f4985j = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        C1045n c1045n = this.f4982g;
        ColorStateList colorStateList = c1045n.f4970c;
        if (colorStateList == null || (mode = c1045n.f4971d) == null) {
            z2 = false;
        } else {
            this.f4983h = m2643a(colorStateList, mode);
            invalidateSelf();
            z2 = true;
        }
        C1044m c1044m = c1045n.f4969b;
        if (c1044m.f4966n == null) {
            c1044m.f4966n = Boolean.valueOf(c1044m.f4959g.mo2639a());
        }
        if (c1044m.f4966n.booleanValue()) {
            boolean mo2640b = c1045n.f4969b.f4959g.mo2640b(iArr);
            c1045n.f4978k |= mo2640b;
            if (mo2640b) {
                invalidateSelf();
                return true;
            }
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void scheduleSelf(Runnable runnable, long j2) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j2);
        } else {
            super.scheduleSelf(runnable, j2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else if (this.f4982g.f4969b.getRootAlpha() != i) {
            this.f4982g.f4969b.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4982g.f4972e = z2;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4984i = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC1687o.m4930Y(drawable, i);
        } else {
            setTintList(ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m206h(drawable, colorStateList);
            return;
        }
        C1045n c1045n = this.f4982g;
        if (c1045n.f4970c != colorStateList) {
            c1045n.f4970c = colorStateList;
            this.f4983h = m2643a(colorStateList, c1045n.f4971d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m207i(drawable, mode);
            return;
        }
        C1045n c1045n = this.f4982g;
        if (c1045n.f4971d != mode) {
            c1045n.f4971d = mode;
            this.f4983h = m2643a(c1045n.f4970c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.setVisible(z2, z3) : super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable
    public final void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1044m c1044m;
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        Paint.Join join;
        Paint.Cap cap;
        Paint.Join join2;
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m202d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        C1045n c1045n = this.f4982g;
        c1045n.f4969b = new C1044m();
        TypedArray m46f = AbstractC0035b.m46f(resources, theme, attributeSet, AbstractC1032a.f4908a);
        C1045n c1045n2 = this.f4982g;
        C1044m c1044m2 = c1045n2.f4969b;
        int i4 = !AbstractC0035b.m43c(xmlPullParser, "tintMode") ? -1 : m46f.getInt(6, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        int i5 = 3;
        if (i4 == 3) {
            mode = PorterDuff.Mode.SRC_OVER;
        } else if (i4 != 5) {
            if (i4 != 9) {
                switch (i4) {
                    case 14:
                        mode = PorterDuff.Mode.MULTIPLY;
                        break;
                    case 15:
                        mode = PorterDuff.Mode.SCREEN;
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        mode = PorterDuff.Mode.ADD;
                        break;
                }
            } else {
                mode = PorterDuff.Mode.SRC_ATOP;
            }
        }
        c1045n2.f4971d = mode;
        int i6 = 1;
        ColorStateList colorStateList = null;
        boolean z4 = false;
        if (AbstractC0035b.m43c(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            m46f.getValue(1, typedValue);
            int i7 = typedValue.type;
            if (i7 == 2) {
                throw new UnsupportedOperationException("Failed to resolve attribute at index 1: " + typedValue);
            }
            if (i7 >= 28 && i7 <= 31) {
                colorStateList = ColorStateList.valueOf(typedValue.data);
            } else {
                Resources resources2 = m46f.getResources();
                int resourceId = m46f.getResourceId(1, 0);
                ThreadLocal threadLocal = AbstractC0036c.f125a;
                try {
                    colorStateList = AbstractC0036c.m54a(resources2, resources2.getXml(resourceId), theme);
                } catch (Exception e2) {
                    Log.e("CSLCompat", "Failed to inflate ColorStateList.", e2);
                }
            }
        }
        ColorStateList colorStateList2 = colorStateList;
        if (colorStateList2 != null) {
            c1045n2.f4970c = colorStateList2;
        }
        boolean z5 = c1045n2.f4972e;
        if (AbstractC0035b.m43c(xmlPullParser, "autoMirrored")) {
            z5 = m46f.getBoolean(5, z5);
        }
        c1045n2.f4972e = z5;
        float f2 = c1044m2.f4962j;
        if (AbstractC0035b.m43c(xmlPullParser, "viewportWidth")) {
            f2 = m46f.getFloat(7, f2);
        }
        c1044m2.f4962j = f2;
        float f3 = c1044m2.f4963k;
        if (AbstractC0035b.m43c(xmlPullParser, "viewportHeight")) {
            f3 = m46f.getFloat(8, f3);
        }
        c1044m2.f4963k = f3;
        if (c1044m2.f4962j <= 0.0f) {
            throw new XmlPullParserException(m46f.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f3 > 0.0f) {
            c1044m2.f4960h = m46f.getDimension(3, c1044m2.f4960h);
            float dimension = m46f.getDimension(2, c1044m2.f4961i);
            c1044m2.f4961i = dimension;
            if (c1044m2.f4960h <= 0.0f) {
                throw new XmlPullParserException(m46f.getPositionDescription() + "<vector> tag requires width > 0");
            }
            if (dimension > 0.0f) {
                float alpha = c1044m2.getAlpha();
                if (AbstractC0035b.m43c(xmlPullParser, "alpha")) {
                    alpha = m46f.getFloat(4, alpha);
                }
                c1044m2.setAlpha(alpha);
                String string = m46f.getString(0);
                if (string != null) {
                    c1044m2.f4965m = string;
                    c1044m2.f4967o.put(string, c1044m2);
                }
                m46f.recycle();
                c1045n.f4968a = getChangingConfigurations();
                c1045n.f4978k = true;
                C1045n c1045n3 = this.f4982g;
                C1044m c1044m3 = c1045n3.f4969b;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(c1044m3.f4959g);
                int eventType = xmlPullParser.getEventType();
                int depth = xmlPullParser.getDepth() + 1;
                boolean z6 = true;
                while (eventType != i6 && (xmlPullParser.getDepth() >= depth || eventType != i5)) {
                    if (eventType == 2) {
                        String name = xmlPullParser.getName();
                        C1041j c1041j = (C1041j) arrayDeque.peek();
                        boolean equals = "path".equals(name);
                        i = depth;
                        C1192b c1192b = c1044m3.f4967o;
                        if (equals) {
                            C1040i c1040i = new C1040i();
                            c1040i.f4928e = 0.0f;
                            c1040i.f4930g = 1.0f;
                            c1040i.f4931h = 1.0f;
                            c1040i.f4932i = 0.0f;
                            c1040i.f4933j = 1.0f;
                            c1040i.f4934k = 0.0f;
                            Paint.Cap cap2 = Paint.Cap.BUTT;
                            c1040i.f4935l = cap2;
                            Paint.Join join3 = Paint.Join.MITER;
                            c1040i.f4936m = join3;
                            c1044m = c1044m3;
                            c1040i.f4937n = 4.0f;
                            TypedArray m46f2 = AbstractC0035b.m46f(resources, theme, attributeSet, AbstractC1032a.f4910c);
                            if (AbstractC0035b.m43c(xmlPullParser, "pathData")) {
                                String string2 = m46f2.getString(0);
                                if (string2 != null) {
                                    c1040i.f4950b = string2;
                                }
                                String string3 = m46f2.getString(2);
                                if (string3 != null) {
                                    c1040i.f4949a = AbstractC1687o.m4945n(string3);
                                }
                                c1040i.f4929f = AbstractC0035b.m42b(m46f2, xmlPullParser, theme, "fillColor", 1);
                                float f4 = c1040i.f4931h;
                                if (AbstractC0035b.m43c(xmlPullParser, "fillAlpha")) {
                                    f4 = m46f2.getFloat(12, f4);
                                }
                                c1040i.f4931h = f4;
                                int i8 = !AbstractC0035b.m43c(xmlPullParser, "strokeLineCap") ? -1 : m46f2.getInt(8, -1);
                                Paint.Cap cap3 = c1040i.f4935l;
                                if (i8 != 0) {
                                    join = join3;
                                    if (i8 != 1) {
                                        cap = i8 != 2 ? cap3 : Paint.Cap.SQUARE;
                                    } else {
                                        cap = Paint.Cap.ROUND;
                                    }
                                } else {
                                    join = join3;
                                    cap = cap2;
                                }
                                c1040i.f4935l = cap;
                                int i9 = !AbstractC0035b.m43c(xmlPullParser, "strokeLineJoin") ? -1 : m46f2.getInt(9, -1);
                                Paint.Join join4 = c1040i.f4936m;
                                if (i9 == 0) {
                                    join2 = join;
                                } else if (i9 != 1) {
                                    join2 = i9 != 2 ? join4 : Paint.Join.BEVEL;
                                } else {
                                    join2 = Paint.Join.ROUND;
                                }
                                c1040i.f4936m = join2;
                                float f5 = c1040i.f4937n;
                                if (AbstractC0035b.m43c(xmlPullParser, "strokeMiterLimit")) {
                                    f5 = m46f2.getFloat(10, f5);
                                }
                                c1040i.f4937n = f5;
                                c1040i.f4927d = AbstractC0035b.m42b(m46f2, xmlPullParser, theme, "strokeColor", 3);
                                float f6 = c1040i.f4930g;
                                if (AbstractC0035b.m43c(xmlPullParser, "strokeAlpha")) {
                                    f6 = m46f2.getFloat(11, f6);
                                }
                                c1040i.f4930g = f6;
                                float f7 = c1040i.f4928e;
                                if (AbstractC0035b.m43c(xmlPullParser, "strokeWidth")) {
                                    f7 = m46f2.getFloat(4, f7);
                                }
                                c1040i.f4928e = f7;
                                float f8 = c1040i.f4933j;
                                if (AbstractC0035b.m43c(xmlPullParser, "trimPathEnd")) {
                                    f8 = m46f2.getFloat(6, f8);
                                }
                                c1040i.f4933j = f8;
                                float f9 = c1040i.f4934k;
                                if (AbstractC0035b.m43c(xmlPullParser, "trimPathOffset")) {
                                    f9 = m46f2.getFloat(7, f9);
                                }
                                c1040i.f4934k = f9;
                                float f10 = c1040i.f4932i;
                                if (AbstractC0035b.m43c(xmlPullParser, "trimPathStart")) {
                                    f10 = m46f2.getFloat(5, f10);
                                }
                                c1040i.f4932i = f10;
                                int i10 = c1040i.f4951c;
                                if (AbstractC0035b.m43c(xmlPullParser, "fillType")) {
                                    i10 = m46f2.getInt(13, i10);
                                }
                                c1040i.f4951c = i10;
                            }
                            m46f2.recycle();
                            c1041j.f4939b.add(c1040i);
                            if (c1040i.getPathName() != null) {
                                c1192b.put(c1040i.getPathName(), c1040i);
                            }
                            c1045n3.f4968a = c1045n3.f4968a;
                            z3 = false;
                            i2 = 1;
                            z6 = false;
                        } else {
                            c1044m = c1044m3;
                            if ("clip-path".equals(name)) {
                                C1039h c1039h = new C1039h();
                                if (AbstractC0035b.m43c(xmlPullParser, "pathData")) {
                                    TypedArray m46f3 = AbstractC0035b.m46f(resources, theme, attributeSet, AbstractC1032a.f4911d);
                                    String string4 = m46f3.getString(0);
                                    if (string4 != null) {
                                        c1039h.f4950b = string4;
                                    }
                                    String string5 = m46f3.getString(1);
                                    if (string5 != null) {
                                        c1039h.f4949a = AbstractC1687o.m4945n(string5);
                                    }
                                    c1039h.f4951c = !AbstractC0035b.m43c(xmlPullParser, "fillType") ? 0 : m46f3.getInt(2, 0);
                                    m46f3.recycle();
                                }
                                c1041j.f4939b.add(c1039h);
                                if (c1039h.getPathName() != null) {
                                    c1192b.put(c1039h.getPathName(), c1039h);
                                }
                                c1045n3.f4968a = c1045n3.f4968a;
                            } else if ("group".equals(name)) {
                                C1041j c1041j2 = new C1041j();
                                TypedArray m46f4 = AbstractC0035b.m46f(resources, theme, attributeSet, AbstractC1032a.f4909b);
                                float f11 = c1041j2.f4940c;
                                if (AbstractC0035b.m43c(xmlPullParser, "rotation")) {
                                    f11 = m46f4.getFloat(5, f11);
                                }
                                c1041j2.f4940c = f11;
                                i2 = 1;
                                c1041j2.f4941d = m46f4.getFloat(1, c1041j2.f4941d);
                                c1041j2.f4942e = m46f4.getFloat(2, c1041j2.f4942e);
                                float f12 = c1041j2.f4943f;
                                if (AbstractC0035b.m43c(xmlPullParser, "scaleX")) {
                                    f12 = m46f4.getFloat(3, f12);
                                }
                                c1041j2.f4943f = f12;
                                float f13 = c1041j2.f4944g;
                                if (AbstractC0035b.m43c(xmlPullParser, "scaleY")) {
                                    f13 = m46f4.getFloat(4, f13);
                                }
                                c1041j2.f4944g = f13;
                                float f14 = c1041j2.f4945h;
                                if (AbstractC0035b.m43c(xmlPullParser, "translateX")) {
                                    f14 = m46f4.getFloat(6, f14);
                                }
                                c1041j2.f4945h = f14;
                                float f15 = c1041j2.f4946i;
                                if (AbstractC0035b.m43c(xmlPullParser, "translateY")) {
                                    f15 = m46f4.getFloat(7, f15);
                                }
                                c1041j2.f4946i = f15;
                                z3 = false;
                                String string6 = m46f4.getString(0);
                                if (string6 != null) {
                                    c1041j2.f4948k = string6;
                                }
                                c1041j2.m2641c();
                                m46f4.recycle();
                                c1041j.f4939b.add(c1041j2);
                                arrayDeque.push(c1041j2);
                                if (c1041j2.getGroupName() != null) {
                                    c1192b.put(c1041j2.getGroupName(), c1041j2);
                                }
                                c1045n3.f4968a = c1045n3.f4968a;
                            }
                            z3 = false;
                            i2 = 1;
                        }
                        z2 = z3;
                        i3 = 3;
                    } else {
                        c1044m = c1044m3;
                        i = depth;
                        i2 = i6;
                        z2 = z4;
                        i3 = 3;
                        if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                            arrayDeque.pop();
                        }
                    }
                    eventType = xmlPullParser.next();
                    i5 = i3;
                    z4 = z2;
                    i6 = i2;
                    depth = i;
                    c1044m3 = c1044m;
                }
                if (!z6) {
                    this.f4983h = m2643a(c1045n.f4970c, c1045n.f4971d);
                    return;
                }
                throw new XmlPullParserException("no path defined");
            }
            throw new XmlPullParserException(m46f.getPositionDescription() + "<vector> tag requires height > 0");
        }
        throw new XmlPullParserException(m46f.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
    }

    public C1047p(C1045n c1045n) {
        this.f4986k = true;
        this.f4987l = new float[9];
        this.f4988m = new Matrix();
        this.f4989n = new Rect();
        this.f4982g = c1045n;
        this.f4983h = m2643a(c1045n.f4970c, c1045n.f4971d);
    }
}
