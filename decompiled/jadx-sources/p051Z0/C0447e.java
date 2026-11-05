package p051Z0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.material.tabs.TabLayout;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p045W0.C0355e;

/* renamed from: Z0.e */
/* loaded from: classes.dex */
public final class C0447e extends LinearLayout {

    /* renamed from: h */
    public static final /* synthetic */ int f1424h = 0;

    /* renamed from: f */
    public ValueAnimator f1425f;

    /* renamed from: g */
    public final /* synthetic */ TabLayout f1426g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0447e(TabLayout tabLayout, Context context) {
        super(context);
        this.f1426g = tabLayout;
        setWillNotDraw(false);
    }

    /* renamed from: a */
    public final void m1147a(int i) {
        TabLayout tabLayout = this.f1426g;
        if (tabLayout.f3620R == 0 || (tabLayout.getTabSelectedIndicator().getBounds().left == -1 && tabLayout.getTabSelectedIndicator().getBounds().right == -1)) {
            View childAt = getChildAt(i);
            C0355e c0355e = tabLayout.f3615M;
            Drawable drawable = tabLayout.f3636t;
            c0355e.getClass();
            RectF m941a = C0355e.m941a(tabLayout, childAt);
            drawable.setBounds((int) m941a.left, drawable.getBounds().top, (int) m941a.right, drawable.getBounds().bottom);
            tabLayout.f3622f = i;
        }
    }

    /* renamed from: b */
    public final void m1148b(int i) {
        TabLayout tabLayout = this.f1426g;
        Rect bounds = tabLayout.f3636t.getBounds();
        tabLayout.f3636t.setBounds(bounds.left, 0, bounds.right, i);
        requestLayout();
    }

    /* renamed from: c */
    public final void m1149c(View view, View view2, float f2) {
        TabLayout tabLayout = this.f1426g;
        if (view == null || view.getWidth() <= 0) {
            Drawable drawable = tabLayout.f3636t;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f3636t.getBounds().bottom);
        } else {
            tabLayout.f3615M.mo946f(tabLayout, view, view2, f2, tabLayout.f3636t);
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        postInvalidateOnAnimation();
    }

    /* renamed from: d */
    public final void m1150d(int i, boolean z2, int i2) {
        TabLayout tabLayout = this.f1426g;
        if (tabLayout.f3622f == i) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i);
        if (childAt2 == null) {
            m1147a(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.f3622f = i;
        C0446d c0446d = new C0446d(this, childAt, childAt2);
        if (!z2) {
            this.f1425f.removeAllUpdateListeners();
            this.f1425f.addUpdateListener(c0446d);
            return;
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        this.f1425f = valueAnimator;
        valueAnimator.setInterpolator(tabLayout.f3616N);
        valueAnimator.setDuration(i2);
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.addUpdateListener(c0446d);
        valueAnimator.start();
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.f1426g;
        int height2 = tabLayout.f3636t.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f3636t.getIntrinsicHeight();
        }
        int i = tabLayout.f3608F;
        if (i == 0) {
            height = getHeight() - height2;
            height2 = getHeight();
        } else if (i != 1) {
            height = 0;
            if (i != 2) {
                height2 = i != 3 ? 0 : getHeight();
            }
        } else {
            height = (getHeight() - height2) / 2;
            height2 = (getHeight() + height2) / 2;
        }
        if (tabLayout.f3636t.getBounds().width() > 0) {
            Rect bounds = tabLayout.f3636t.getBounds();
            tabLayout.f3636t.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f3636t.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        ValueAnimator valueAnimator = this.f1425f;
        TabLayout tabLayout = this.f1426g;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            m1150d(tabLayout.getSelectedTabPosition(), false, -1);
            return;
        }
        if (tabLayout.f3622f == -1) {
            tabLayout.f3622f = tabLayout.getSelectedTabPosition();
        }
        m1147a(tabLayout.f3622f);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            return;
        }
        TabLayout tabLayout = this.f1426g;
        boolean z2 = true;
        if (tabLayout.f3606D == 1 || tabLayout.f3609G == 2) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = getChildAt(i4);
                if (childAt.getVisibility() == 0) {
                    i3 = Math.max(i3, childAt.getMeasuredWidth());
                }
            }
            if (i3 <= 0) {
                return;
            }
            if (i3 * childCount <= getMeasuredWidth() - (((int) AbstractC0294k.m843d(getContext(), 16)) * 2)) {
                boolean z3 = false;
                for (int i5 = 0; i5 < childCount; i5++) {
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                    if (layoutParams.width != i3 || layoutParams.weight != 0.0f) {
                        layoutParams.width = i3;
                        layoutParams.weight = 0.0f;
                        z3 = true;
                    }
                }
                z2 = z3;
            } else {
                tabLayout.f3606D = 0;
                tabLayout.m2111j(false);
            }
            if (z2) {
                super.onMeasure(i, i2);
            }
        }
    }
}
