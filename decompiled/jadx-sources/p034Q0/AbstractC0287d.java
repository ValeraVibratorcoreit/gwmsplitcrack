package p034Q0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import p004B0.AbstractC0051a;
import p082l.AbstractC1140s0;

/* renamed from: Q0.d */
/* loaded from: classes.dex */
public abstract class AbstractC0287d extends AbstractC1140s0 {

    /* renamed from: u */
    public Drawable f799u;

    /* renamed from: v */
    public final Rect f800v;

    /* renamed from: w */
    public final Rect f801w;

    /* renamed from: x */
    public int f802x;

    /* renamed from: y */
    public final boolean f803y;

    /* renamed from: z */
    public boolean f804z;

    public AbstractC0287d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f800v = new Rect();
        this.f801w = new Rect();
        this.f802x = 119;
        this.f803y = true;
        this.f804z = false;
        int[] iArr = AbstractC0051a.f174i;
        AbstractC0294k.m840a(context, attributeSet, 0, 0);
        AbstractC0294k.m841b(context, attributeSet, iArr, 0, 0, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        this.f802x = obtainStyledAttributes.getInt(1, this.f802x);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setForeground(drawable);
        }
        this.f803y = obtainStyledAttributes.getBoolean(2, true);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        Drawable drawable = this.f799u;
        if (drawable != null) {
            if (this.f804z) {
                this.f804z = false;
                int right = getRight() - getLeft();
                int bottom = getBottom() - getTop();
                boolean z2 = this.f803y;
                Rect rect = this.f800v;
                if (z2) {
                    rect.set(0, 0, right, bottom);
                } else {
                    rect.set(getPaddingLeft(), getPaddingTop(), right - getPaddingRight(), bottom - getPaddingBottom());
                }
                int i = this.f802x;
                int intrinsicWidth = drawable.getIntrinsicWidth();
                int intrinsicHeight = drawable.getIntrinsicHeight();
                Rect rect2 = this.f801w;
                Gravity.apply(i, intrinsicWidth, intrinsicHeight, rect, rect2);
                drawable.setBounds(rect2);
            }
            drawable.draw(canvas);
        }
    }

    @Override // android.view.View
    public final void drawableHotspotChanged(float f2, float f3) {
        super.drawableHotspotChanged(f2, f3);
        Drawable drawable = this.f799u;
        if (drawable != null) {
            drawable.setHotspot(f2, f3);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f799u;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        this.f799u.setState(getDrawableState());
    }

    @Override // android.view.View
    public Drawable getForeground() {
        return this.f799u;
    }

    @Override // android.view.View
    public int getForegroundGravity() {
        return this.f802x;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f799u;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // p082l.AbstractC1140s0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        this.f804z = z2 | this.f804z;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f804z = true;
    }

    @Override // android.view.View
    public void setForeground(Drawable drawable) {
        Drawable drawable2 = this.f799u;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
                unscheduleDrawable(this.f799u);
            }
            this.f799u = drawable;
            this.f804z = true;
            if (drawable != null) {
                setWillNotDraw(false);
                drawable.setCallback(this);
                if (drawable.isStateful()) {
                    drawable.setState(getDrawableState());
                }
                if (this.f802x == 119) {
                    drawable.getPadding(new Rect());
                }
            } else {
                setWillNotDraw(true);
            }
            requestLayout();
            invalidate();
        }
    }

    @Override // android.view.View
    public void setForegroundGravity(int i) {
        if (this.f802x != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.f802x = i;
            if (i == 119 && this.f799u != null) {
                this.f799u.getPadding(new Rect());
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f799u;
    }
}
