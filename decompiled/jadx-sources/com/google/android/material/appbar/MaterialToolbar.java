package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p034Q0.C0295l;
import p045W0.C0357g;
import p060c1.AbstractC0577a;
import p079k.MenuC1018m;
import p121y0.AbstractC1687o;

/* loaded from: classes.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: e0 */
    public static final ImageView.ScaleType[] f3343e0 = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: W */
    public Integer f3344W;

    /* renamed from: a0 */
    public boolean f3345a0;

    /* renamed from: b0 */
    public boolean f3346b0;

    /* renamed from: c0 */
    public ImageView.ScaleType f3347c0;

    /* renamed from: d0 */
    public Boolean f3348d0;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar), attributeSet, 0);
        Context context2 = getContext();
        TypedArray m846g = AbstractC0294k.m846g(context2, attributeSet, AbstractC0051a.f185t, R.attr.toolbarStyle, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (m846g.hasValue(2)) {
            setNavigationIconTint(m846g.getColor(2, -1));
        }
        this.f3345a0 = m846g.getBoolean(4, false);
        this.f3346b0 = m846g.getBoolean(3, false);
        int i = m846g.getInt(1, -1);
        if (i >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f3343e0;
            if (i < scaleTypeArr.length) {
                this.f3347c0 = scaleTypeArr[i];
            }
        }
        if (m846g.hasValue(0)) {
            this.f3348d0 = Boolean.valueOf(m846g.getBoolean(0, false));
        }
        m846g.recycle();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : AbstractC0088l.m256C(background);
        if (valueOf != null) {
            C0357g c0357g = new C0357g();
            c0357g.m958k(valueOf);
            c0357g.m956i(context2);
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            c0357g.m957j(AbstractC0158F.m428i(this));
            setBackground(c0357g);
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f3347c0;
    }

    public Integer getNavigationIconTint() {
        return this.f3344W;
    }

    @Override // androidx.appcompat.widget.Toolbar
    /* renamed from: m */
    public final void mo1298m(int i) {
        Menu menu = getMenu();
        boolean z2 = menu instanceof MenuC1018m;
        if (z2) {
            ((MenuC1018m) menu).m2627w();
        }
        super.mo1298m(i);
        if (z2) {
            ((MenuC1018m) menu).m2626v();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable background = getBackground();
        if (background instanceof C0357g) {
            AbstractC1687o.m4929X(this, (C0357g) background);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z2, i, i2, i3, i4);
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.f3345a0 || this.f3346b0) {
            ArrayList m844e = AbstractC0294k.m844e(this, getTitle());
            boolean isEmpty = m844e.isEmpty();
            C0295l c0295l = AbstractC0294k.f825c;
            TextView textView = isEmpty ? null : (TextView) Collections.min(m844e, c0295l);
            ArrayList m844e2 = AbstractC0294k.m844e(this, getSubtitle());
            TextView textView2 = m844e2.isEmpty() ? null : (TextView) Collections.max(m844e2, c0295l);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.f3345a0 && textView != null) {
                    m2026v(textView, pair);
                }
                if (this.f3346b0 && textView2 != null) {
                    m2026v(textView2, pair);
                }
            }
        }
        Drawable logo = getLogo();
        if (logo != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(logo.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.f3348d0;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f3347c0;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        Drawable background = getBackground();
        if (background instanceof C0357g) {
            ((C0357g) background).m957j(f2);
        }
    }

    public void setLogoAdjustViewBounds(boolean z2) {
        Boolean bool = this.f3348d0;
        if (bool == null || bool.booleanValue() != z2) {
            this.f3348d0 = Boolean.valueOf(z2);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f3347c0 != scaleType) {
            this.f3347c0 = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.f3344W != null) {
            drawable = drawable.mutate();
            AbstractC0070a.m205g(drawable, this.f3344W.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.f3344W = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z2) {
        if (this.f3346b0 != z2) {
            this.f3346b0 = z2;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z2) {
        if (this.f3345a0 != z2) {
            this.f3345a0 = z2;
            requestLayout();
        }
    }

    /* renamed from: v */
    public final void m2026v(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }
}
