package p049Y0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0156D;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p045W0.C0357g;
import p045W0.C0361k;
import p060c1.AbstractC0577a;
import p121y0.AbstractC1687o;

/* renamed from: Y0.c */
/* loaded from: classes.dex */
public abstract class AbstractC0437c extends FrameLayout {

    /* renamed from: n */
    public static final ViewOnTouchListenerC0436b f1402n = new ViewOnTouchListenerC0436b();

    /* renamed from: f */
    public final C0361k f1403f;

    /* renamed from: g */
    public int f1404g;

    /* renamed from: h */
    public final float f1405h;

    /* renamed from: i */
    public final float f1406i;

    /* renamed from: j */
    public final int f1407j;

    /* renamed from: k */
    public final int f1408k;

    /* renamed from: l */
    public ColorStateList f1409l;

    /* renamed from: m */
    public PorterDuff.Mode f1410m;

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC0437c(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, 0, 0), attributeSet);
        GradientDrawable gradientDrawable;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, AbstractC0051a.f190y);
        if (obtainStyledAttributes.hasValue(6)) {
            float dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(6, 0);
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            AbstractC0158F.m438s(this, dimensionPixelSize);
        }
        this.f1404g = obtainStyledAttributes.getInt(2, 0);
        if (obtainStyledAttributes.hasValue(8) || obtainStyledAttributes.hasValue(9)) {
            this.f1403f = C0361k.m965b(context2, attributeSet, 0, 0).m963a();
        }
        this.f1405h = obtainStyledAttributes.getFloat(3, 1.0f);
        setBackgroundTintList(AbstractC0088l.m255B(context2, obtainStyledAttributes, 4));
        setBackgroundTintMode(AbstractC0294k.m847h(obtainStyledAttributes.getInt(5, -1), PorterDuff.Mode.SRC_IN));
        this.f1406i = obtainStyledAttributes.getFloat(1, 1.0f);
        this.f1407j = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.f1408k = obtainStyledAttributes.getDimensionPixelSize(7, -1);
        obtainStyledAttributes.recycle();
        setOnTouchListener(f1402n);
        setFocusable(true);
        if (getBackground() == null) {
            int m4909B = AbstractC1687o.m4909B(getBackgroundOverlayColorAlpha(), AbstractC1687o.m4948s(this, R.attr.colorSurface), AbstractC1687o.m4948s(this, R.attr.colorOnSurface));
            C0361k c0361k = this.f1403f;
            if (c0361k != null) {
                int i = AbstractC0438d.f1411a;
                C0357g c0357g = new C0357g(c0361k);
                c0357g.m958k(ColorStateList.valueOf(m4909B));
                gradientDrawable = c0357g;
            } else {
                Resources resources = getResources();
                int i2 = AbstractC0438d.f1411a;
                float dimension = resources.getDimension(R.dimen.mtrl_snackbar_background_corner_radius);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setShape(0);
                gradientDrawable2.setCornerRadius(dimension);
                gradientDrawable2.setColor(m4909B);
                gradientDrawable = gradientDrawable2;
            }
            ColorStateList colorStateList = this.f1409l;
            if (colorStateList != null) {
                AbstractC0070a.m206h(gradientDrawable, colorStateList);
            }
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            setBackground(gradientDrawable);
        }
    }

    private void setBaseTransientBottomBar(AbstractC0438d abstractC0438d) {
    }

    public float getActionTextColorAlpha() {
        return this.f1406i;
    }

    public int getAnimationMode() {
        return this.f1404g;
    }

    public float getBackgroundOverlayColorAlpha() {
        return this.f1405h;
    }

    public int getMaxInlineActionWidth() {
        return this.f1408k;
    }

    public int getMaxWidth() {
        return this.f1407j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = this.f1407j;
        if (i3 <= 0 || getMeasuredWidth() <= i3) {
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
    }

    public void setAnimationMode(int i) {
        this.f1404g = i;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != null && this.f1409l != null) {
            drawable = drawable.mutate();
            AbstractC0070a.m206h(drawable, this.f1409l);
            AbstractC0070a.m207i(drawable, this.f1410m);
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        this.f1409l = colorStateList;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0070a.m206h(mutate, colorStateList);
            AbstractC0070a.m207i(mutate, this.f1410m);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        this.f1410m = mode;
        if (getBackground() != null) {
            Drawable mutate = getBackground().mutate();
            AbstractC0070a.m207i(mutate, mode);
            if (mutate != getBackground()) {
                super.setBackgroundDrawable(mutate);
            }
        }
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super.setLayoutParams(layoutParams);
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        setOnTouchListener(onClickListener != null ? null : f1402n);
        super.setOnClickListener(onClickListener);
    }
}
