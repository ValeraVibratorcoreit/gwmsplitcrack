package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import com.altaysoft.t500_split.media.C0639g;
import com.jcraft.jsch.SftpATTRS;
import p069f1.C0833e;
import p079k.C1020o;
import p079k.InterfaceC1001A;
import p079k.InterfaceC1017l;
import p079k.MenuC1018m;
import p082l.AbstractC1140s0;
import p082l.C1083R0;
import p082l.C1115g;
import p082l.C1121j;
import p082l.C1123k;
import p082l.C1127m;
import p082l.C1138r0;
import p082l.InterfaceC1125l;
import p082l.InterfaceC1129n;

/* loaded from: classes.dex */
public class ActionMenuView extends AbstractC1140s0 implements InterfaceC1017l, InterfaceC1001A {

    /* renamed from: A */
    public boolean f1773A;

    /* renamed from: B */
    public int f1774B;

    /* renamed from: C */
    public final int f1775C;

    /* renamed from: D */
    public final int f1776D;

    /* renamed from: E */
    public InterfaceC1129n f1777E;

    /* renamed from: u */
    public MenuC1018m f1778u;

    /* renamed from: v */
    public Context f1779v;

    /* renamed from: w */
    public int f1780w;

    /* renamed from: x */
    public boolean f1781x;

    /* renamed from: y */
    public C1123k f1782y;

    /* renamed from: z */
    public C1083R0 f1783z;

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f1775C = (int) (56.0f * f2);
        this.f1776D = (int) (f2 * 4.0f);
        this.f1779v = context;
        this.f1780w = 0;
    }

    /* renamed from: j */
    public static C1127m m1279j() {
        C1127m c1127m = new C1127m(-2, -2);
        c1127m.f5202a = false;
        ((LinearLayout.LayoutParams) c1127m).gravity = 16;
        return c1127m;
    }

    /* renamed from: k */
    public static C1127m m1280k(ViewGroup.LayoutParams layoutParams) {
        C1127m c1127m;
        if (layoutParams == null) {
            return m1279j();
        }
        if (layoutParams instanceof C1127m) {
            C1127m c1127m2 = (C1127m) layoutParams;
            c1127m = new C1127m(c1127m2);
            c1127m.f5202a = c1127m2.f5202a;
        } else {
            c1127m = new C1127m(layoutParams);
        }
        if (((LinearLayout.LayoutParams) c1127m).gravity <= 0) {
            ((LinearLayout.LayoutParams) c1127m).gravity = 16;
        }
        return c1127m;
    }

    @Override // p079k.InterfaceC1017l
    /* renamed from: a */
    public final boolean mo1262a(C1020o c1020o) {
        return this.f1778u.m2621q(c1020o, null, 0);
    }

    @Override // p079k.InterfaceC1001A
    /* renamed from: c */
    public final void mo1263c(MenuC1018m menuC1018m) {
        this.f1778u = menuC1018m;
    }

    @Override // p082l.AbstractC1140s0, android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1127m;
    }

    @Override // android.view.View
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @Override // p082l.AbstractC1140s0
    /* renamed from: f */
    public final /* bridge */ /* synthetic */ C1138r0 generateDefaultLayoutParams() {
        return m1279j();
    }

    @Override // p082l.AbstractC1140s0
    /* renamed from: g */
    public final C1138r0 generateLayoutParams(AttributeSet attributeSet) {
        return new C1127m(getContext(), attributeSet);
    }

    @Override // p082l.AbstractC1140s0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return m1279j();
    }

    @Override // p082l.AbstractC1140s0, android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1280k(layoutParams);
    }

    public Menu getMenu() {
        if (this.f1778u == null) {
            Context context = getContext();
            MenuC1018m menuC1018m = new MenuC1018m(context);
            this.f1778u = menuC1018m;
            menuC1018m.f4833e = new C0639g(28, this);
            C1123k c1123k = new C1123k(context);
            this.f1782y = c1123k;
            c1123k.f5190q = true;
            c1123k.f5191r = true;
            c1123k.f5183j = new C0833e(6);
            this.f1778u.m2614b(c1123k, this.f1779v);
            C1123k c1123k2 = this.f1782y;
            c1123k2.f5186m = this;
            this.f1778u = c1123k2.f5181h;
        }
        return this.f1778u;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        C1123k c1123k = this.f1782y;
        C1121j c1121j = c1123k.f5187n;
        if (c1121j != null) {
            return c1121j.getDrawable();
        }
        if (c1123k.f5189p) {
            return c1123k.f5188o;
        }
        return null;
    }

    public int getPopupTheme() {
        return this.f1780w;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // p082l.AbstractC1140s0
    /* renamed from: h */
    public final /* bridge */ /* synthetic */ C1138r0 generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return m1280k(layoutParams);
    }

    /* renamed from: l */
    public final boolean m1284l(int i) {
        boolean z2 = false;
        if (i == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i - 1);
        KeyEvent.Callback childAt2 = getChildAt(i);
        if (i < getChildCount() && (childAt instanceof InterfaceC1125l)) {
            z2 = ((InterfaceC1125l) childAt).mo1257a();
        }
        return (i <= 0 || !(childAt2 instanceof InterfaceC1125l)) ? z2 : z2 | ((InterfaceC1125l) childAt2).mo1259c();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        C1123k c1123k = this.f1782y;
        if (c1123k != null) {
            c1123k.mo2583i();
            if (this.f1782y.m2734j()) {
                this.f1782y.m2733f();
                this.f1782y.m2735l();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1123k c1123k = this.f1782y;
        if (c1123k != null) {
            c1123k.m2733f();
            C1115g c1115g = c1123k.f5198y;
            if (c1115g == null || !c1115g.m2636b()) {
                return;
            }
            c1115g.f4905i.dismiss();
        }
    }

    @Override // p082l.AbstractC1140s0, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int width;
        int i5;
        if (!this.f1773A) {
            super.onLayout(z2, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        int i6 = (i4 - i2) / 2;
        int dividerWidth = getDividerWidth();
        int i7 = i3 - i;
        int paddingRight = (i7 - getPaddingRight()) - getPaddingLeft();
        boolean z3 = getLayoutDirection() == 1;
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                C1127m c1127m = (C1127m) childAt.getLayoutParams();
                if (c1127m.f5202a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (m1284l(i10)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (z3) {
                        i5 = getPaddingLeft() + ((LinearLayout.LayoutParams) c1127m).leftMargin;
                        width = i5 + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) c1127m).rightMargin;
                        i5 = width - measuredWidth;
                    }
                    int i11 = i6 - (measuredHeight / 2);
                    childAt.layout(i5, i11, width, measuredHeight + i11);
                    paddingRight -= measuredWidth;
                    i8 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) c1127m).leftMargin) + ((LinearLayout.LayoutParams) c1127m).rightMargin;
                    m1284l(i10);
                    i9++;
                }
            }
        }
        if (childCount == 1 && i8 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i12 = (i7 / 2) - (measuredWidth2 / 2);
            int i13 = i6 - (measuredHeight2 / 2);
            childAt2.layout(i12, i13, measuredWidth2 + i12, measuredHeight2 + i13);
            return;
        }
        int i14 = i9 - (i8 ^ 1);
        int max = Math.max(0, i14 > 0 ? paddingRight / i14 : 0);
        if (z3) {
            int width2 = getWidth() - getPaddingRight();
            for (int i15 = 0; i15 < childCount; i15++) {
                View childAt3 = getChildAt(i15);
                C1127m c1127m2 = (C1127m) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !c1127m2.f5202a) {
                    int i16 = width2 - ((LinearLayout.LayoutParams) c1127m2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i17 = i6 - (measuredHeight3 / 2);
                    childAt3.layout(i16 - measuredWidth3, i17, i16, measuredHeight3 + i17);
                    width2 = i16 - ((measuredWidth3 + ((LinearLayout.LayoutParams) c1127m2).leftMargin) + max);
                }
            }
            return;
        }
        int paddingLeft = getPaddingLeft();
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt4 = getChildAt(i18);
            C1127m c1127m3 = (C1127m) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !c1127m3.f5202a) {
                int i19 = paddingLeft + ((LinearLayout.LayoutParams) c1127m3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i20 = i6 - (measuredHeight4 / 2);
                childAt4.layout(i19, i20, i19 + measuredWidth4, measuredHeight4 + i20);
                paddingLeft = measuredWidth4 + ((LinearLayout.LayoutParams) c1127m3).rightMargin + max + i19;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v29, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v36 */
    @Override // p082l.AbstractC1140s0, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        int i5;
        int i6;
        int i7;
        ?? r4;
        int i8;
        int i9;
        int i10;
        MenuC1018m menuC1018m;
        boolean z4 = this.f1773A;
        boolean z5 = View.MeasureSpec.getMode(i) == 1073741824;
        this.f1773A = z5;
        if (z4 != z5) {
            this.f1774B = 0;
        }
        int size = View.MeasureSpec.getSize(i);
        if (this.f1773A && (menuC1018m = this.f1778u) != null && size != this.f1774B) {
            this.f1774B = size;
            menuC1018m.m2620p(true);
        }
        int childCount = getChildCount();
        if (!this.f1773A || childCount <= 0) {
            for (int i11 = 0; i11 < childCount; i11++) {
                C1127m c1127m = (C1127m) getChildAt(i11).getLayoutParams();
                ((LinearLayout.LayoutParams) c1127m).rightMargin = 0;
                ((LinearLayout.LayoutParams) c1127m).leftMargin = 0;
            }
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int size3 = View.MeasureSpec.getSize(i2);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, paddingBottom, -2);
        int i12 = size2 - paddingRight;
        int i13 = this.f1775C;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = (i15 / i14) + i13;
        int childCount2 = getChildCount();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        boolean z6 = false;
        int i21 = 0;
        long j2 = 0;
        while (true) {
            i3 = this.f1776D;
            if (i20 >= childCount2) {
                break;
            }
            View childAt = getChildAt(i20);
            int i22 = size3;
            int i23 = i12;
            if (childAt.getVisibility() == 8) {
                i8 = mode;
                i9 = paddingBottom;
            } else {
                boolean z7 = childAt instanceof ActionMenuItemView;
                int i24 = i18 + 1;
                if (z7) {
                    childAt.setPadding(i3, 0, i3, 0);
                }
                C1127m c1127m2 = (C1127m) childAt.getLayoutParams();
                c1127m2.f5207f = false;
                c1127m2.f5204c = 0;
                c1127m2.f5203b = 0;
                c1127m2.f5205d = false;
                ((LinearLayout.LayoutParams) c1127m2).leftMargin = 0;
                ((LinearLayout.LayoutParams) c1127m2).rightMargin = 0;
                c1127m2.f5206e = z7 && !TextUtils.isEmpty(((ActionMenuItemView) childAt).getText());
                int i25 = c1127m2.f5202a ? 1 : i14;
                C1127m c1127m3 = (C1127m) childAt.getLayoutParams();
                i8 = mode;
                i9 = paddingBottom;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(childMeasureSpec) - paddingBottom, View.MeasureSpec.getMode(childMeasureSpec));
                ActionMenuItemView actionMenuItemView = z7 ? (ActionMenuItemView) childAt : null;
                boolean z8 = (actionMenuItemView == null || TextUtils.isEmpty(actionMenuItemView.getText())) ? false : true;
                if (i25 <= 0 || (z8 && i25 < 2)) {
                    i10 = 0;
                } else {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i25 * i16, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), makeMeasureSpec);
                    int measuredWidth = childAt.getMeasuredWidth();
                    i10 = measuredWidth / i16;
                    if (measuredWidth % i16 != 0) {
                        i10++;
                    }
                    if (z8 && i10 < 2) {
                        i10 = 2;
                    }
                }
                c1127m3.f5205d = !c1127m3.f5202a && z8;
                c1127m3.f5203b = i10;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i10 * i16, 1073741824), makeMeasureSpec);
                i19 = Math.max(i19, i10);
                if (c1127m2.f5205d) {
                    i21++;
                }
                if (c1127m2.f5202a) {
                    z6 = true;
                }
                i14 -= i10;
                i17 = Math.max(i17, childAt.getMeasuredHeight());
                if (i10 == 1) {
                    j2 |= 1 << i20;
                }
                i18 = i24;
            }
            i20++;
            size3 = i22;
            i12 = i23;
            paddingBottom = i9;
            mode = i8;
        }
        int i26 = mode;
        int i27 = i12;
        int i28 = size3;
        boolean z9 = z6 && i18 == 2;
        boolean z10 = false;
        while (i21 > 0 && i14 > 0) {
            int i29 = Integer.MAX_VALUE;
            int i30 = 0;
            int i31 = 0;
            long j3 = 0;
            while (i31 < childCount2) {
                C1127m c1127m4 = (C1127m) getChildAt(i31).getLayoutParams();
                boolean z11 = z10;
                if (c1127m4.f5205d) {
                    int i32 = c1127m4.f5203b;
                    if (i32 < i29) {
                        j3 = 1 << i31;
                        i29 = i32;
                        i30 = 1;
                    } else if (i32 == i29) {
                        j3 |= 1 << i31;
                        i30++;
                    }
                }
                i31++;
                z10 = z11;
            }
            z2 = z10;
            j2 |= j3;
            if (i30 > i14) {
                break;
            }
            int i33 = i29 + 1;
            int i34 = 0;
            while (i34 < childCount2) {
                View childAt2 = getChildAt(i34);
                C1127m c1127m5 = (C1127m) childAt2.getLayoutParams();
                int i35 = i17;
                int i36 = childMeasureSpec;
                int i37 = childCount2;
                long j4 = 1 << i34;
                if ((j3 & j4) != 0) {
                    if (z9 && c1127m5.f5206e) {
                        r4 = 1;
                        r4 = 1;
                        if (i14 == 1) {
                            childAt2.setPadding(i3 + i16, 0, i3, 0);
                        }
                    } else {
                        r4 = 1;
                    }
                    c1127m5.f5203b += r4;
                    c1127m5.f5207f = r4;
                    i14--;
                } else if (c1127m5.f5203b == i33) {
                    j2 |= j4;
                }
                i34++;
                childMeasureSpec = i36;
                i17 = i35;
                childCount2 = i37;
            }
            z10 = true;
        }
        z2 = z10;
        int i38 = i17;
        int i39 = childMeasureSpec;
        int i40 = childCount2;
        boolean z12 = !z6 && i18 == 1;
        if (i14 <= 0 || j2 == 0 || (i14 >= i18 - 1 && !z12 && i19 <= 1)) {
            i4 = i40;
            z3 = z2;
        } else {
            float bitCount = Long.bitCount(j2);
            if (!z12) {
                if ((j2 & 1) != 0 && !((C1127m) getChildAt(0).getLayoutParams()).f5206e) {
                    bitCount -= 0.5f;
                }
                int i41 = i40 - 1;
                if ((j2 & (1 << i41)) != 0 && !((C1127m) getChildAt(i41).getLayoutParams()).f5206e) {
                    bitCount -= 0.5f;
                }
            }
            int i42 = bitCount > 0.0f ? (int) ((i14 * i16) / bitCount) : 0;
            boolean z13 = z2;
            i4 = i40;
            for (int i43 = 0; i43 < i4; i43++) {
                if ((j2 & (1 << i43)) != 0) {
                    View childAt3 = getChildAt(i43);
                    C1127m c1127m6 = (C1127m) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        c1127m6.f5204c = i42;
                        c1127m6.f5207f = true;
                        if (i43 == 0 && !c1127m6.f5206e) {
                            ((LinearLayout.LayoutParams) c1127m6).leftMargin = (-i42) / 2;
                        }
                        z13 = true;
                    } else {
                        if (c1127m6.f5202a) {
                            c1127m6.f5204c = i42;
                            c1127m6.f5207f = true;
                            ((LinearLayout.LayoutParams) c1127m6).rightMargin = (-i42) / 2;
                            z13 = true;
                        } else {
                            if (i43 != 0) {
                                ((LinearLayout.LayoutParams) c1127m6).leftMargin = i42 / 2;
                            }
                            if (i43 != i4 - 1) {
                                ((LinearLayout.LayoutParams) c1127m6).rightMargin = i42 / 2;
                            }
                        }
                    }
                }
            }
            z3 = z13;
        }
        if (z3) {
            int i44 = 0;
            while (i44 < i4) {
                View childAt4 = getChildAt(i44);
                C1127m c1127m7 = (C1127m) childAt4.getLayoutParams();
                if (c1127m7.f5207f) {
                    i7 = i39;
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((c1127m7.f5203b * i16) + c1127m7.f5204c, 1073741824), i7);
                } else {
                    i7 = i39;
                }
                i44++;
                i39 = i7;
            }
        }
        if (i26 != 1073741824) {
            i6 = i27;
            i5 = i38;
        } else {
            i5 = i28;
            i6 = i27;
        }
        setMeasuredDimension(i6, i5);
    }

    public void setExpandedActionViewsExclusive(boolean z2) {
        this.f1782y.f5195v = z2;
    }

    public void setOnMenuItemClickListener(InterfaceC1129n interfaceC1129n) {
        this.f1777E = interfaceC1129n;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        C1123k c1123k = this.f1782y;
        C1121j c1121j = c1123k.f5187n;
        if (c1121j != null) {
            c1121j.setImageDrawable(drawable);
        } else {
            c1123k.f5189p = true;
            c1123k.f5188o = drawable;
        }
    }

    public void setOverflowReserved(boolean z2) {
        this.f1781x = z2;
    }

    public void setPopupTheme(int i) {
        if (this.f1780w != i) {
            this.f1780w = i;
            if (i == 0) {
                this.f1779v = getContext();
            } else {
                this.f1779v = new ContextThemeWrapper(getContext(), i);
            }
        }
    }

    public void setPresenter(C1123k c1123k) {
        this.f1782y = c1123k;
        c1123k.f5186m = this;
        this.f1778u = c1123k.f5181h;
    }

    @Override // p082l.AbstractC1140s0, android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new C1127m(getContext(), attributeSet);
    }
}
