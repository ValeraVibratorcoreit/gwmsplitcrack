package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0669j;
import com.jcraft.jsch.SftpATTRS;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0175X;
import p067f.AbstractC0770a;
import p076j.AbstractC0952a;
import p079k.InterfaceC1001A;
import p079k.MenuC1018m;
import p082l.C1100a;
import p082l.C1115g;
import p082l.C1123k;

/* loaded from: classes.dex */
public class ActionBarContextView extends ViewGroup {

    /* renamed from: f */
    public final C1100a f1722f;

    /* renamed from: g */
    public final Context f1723g;

    /* renamed from: h */
    public ActionMenuView f1724h;

    /* renamed from: i */
    public C1123k f1725i;

    /* renamed from: j */
    public int f1726j;

    /* renamed from: k */
    public C0175X f1727k;

    /* renamed from: l */
    public boolean f1728l;

    /* renamed from: m */
    public boolean f1729m;

    /* renamed from: n */
    public CharSequence f1730n;

    /* renamed from: o */
    public CharSequence f1731o;

    /* renamed from: p */
    public View f1732p;

    /* renamed from: q */
    public View f1733q;

    /* renamed from: r */
    public View f1734r;

    /* renamed from: s */
    public LinearLayout f1735s;

    /* renamed from: t */
    public TextView f1736t;

    /* renamed from: u */
    public TextView f1737u;

    /* renamed from: v */
    public final int f1738v;

    /* renamed from: w */
    public final int f1739w;

    /* renamed from: x */
    public boolean f1740x;

    /* renamed from: y */
    public final int f1741y;

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.actionModeStyle);
        int resourceId;
        this.f1722f = new C1100a(this);
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(R.attr.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f1723g = context;
        } else {
            this.f1723g = new ContextThemeWrapper(context, typedValue.resourceId);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3897d, R.attr.actionModeStyle, 0);
        setBackground((!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0) ? obtainStyledAttributes.getDrawable(0) : AbstractC0088l.m257D(context, resourceId));
        this.f1738v = obtainStyledAttributes.getResourceId(5, 0);
        this.f1739w = obtainStyledAttributes.getResourceId(4, 0);
        this.f1726j = obtainStyledAttributes.getLayoutDimension(3, 0);
        this.f1741y = obtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    public static int m1266f(View view, int i, int i2) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), i2);
        return Math.max(0, i - view.getMeasuredWidth());
    }

    /* renamed from: g */
    public static int m1267g(View view, int i, int i2, int i3, boolean z2) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = ((i3 - measuredHeight) / 2) + i2;
        if (z2) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z2 ? -measuredWidth : measuredWidth;
    }

    /* renamed from: c */
    public final void m1268c(AbstractC0952a abstractC0952a) {
        View view = this.f1732p;
        if (view == null) {
            View inflate = LayoutInflater.from(getContext()).inflate(this.f1741y, (ViewGroup) this, false);
            this.f1732p = inflate;
            addView(inflate);
        } else if (view.getParent() == null) {
            addView(this.f1732p);
        }
        View findViewById = this.f1732p.findViewById(R.id.action_mode_close_button);
        this.f1733q = findViewById;
        findViewById.setOnClickListener(new ViewOnClickListenerC0669j(2, abstractC0952a));
        MenuC1018m mo2378c = abstractC0952a.mo2378c();
        C1123k c1123k = this.f1725i;
        if (c1123k != null) {
            c1123k.m2733f();
            C1115g c1115g = c1123k.f5198y;
            if (c1115g != null && c1115g.m2636b()) {
                c1115g.f4905i.dismiss();
            }
        }
        C1123k c1123k2 = new C1123k(getContext());
        this.f1725i = c1123k2;
        c1123k2.f5190q = true;
        c1123k2.f5191r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        mo2378c.m2614b(this.f1725i, this.f1723g);
        C1123k c1123k3 = this.f1725i;
        InterfaceC1001A interfaceC1001A = c1123k3.f5186m;
        if (interfaceC1001A == null) {
            InterfaceC1001A interfaceC1001A2 = (InterfaceC1001A) c1123k3.f5182i.inflate(c1123k3.f5184k, (ViewGroup) this, false);
            c1123k3.f5186m = interfaceC1001A2;
            interfaceC1001A2.mo1263c(c1123k3.f5181h);
            c1123k3.mo2583i();
        }
        InterfaceC1001A interfaceC1001A3 = c1123k3.f5186m;
        if (interfaceC1001A != interfaceC1001A3) {
            ((ActionMenuView) interfaceC1001A3).setPresenter(c1123k3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) interfaceC1001A3;
        this.f1724h = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f1724h, layoutParams);
    }

    /* renamed from: d */
    public final void m1269d() {
        if (this.f1735s == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f1735s = linearLayout;
            this.f1736t = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.f1737u = (TextView) this.f1735s.findViewById(R.id.action_bar_subtitle);
            int i = this.f1738v;
            if (i != 0) {
                this.f1736t.setTextAppearance(getContext(), i);
            }
            int i2 = this.f1739w;
            if (i2 != 0) {
                this.f1737u.setTextAppearance(getContext(), i2);
            }
        }
        this.f1736t.setText(this.f1730n);
        this.f1737u.setText(this.f1731o);
        boolean isEmpty = TextUtils.isEmpty(this.f1730n);
        boolean isEmpty2 = TextUtils.isEmpty(this.f1731o);
        this.f1737u.setVisibility(!isEmpty2 ? 0 : 8);
        this.f1735s.setVisibility((isEmpty && isEmpty2) ? 8 : 0);
        if (this.f1735s.getParent() == null) {
            addView(this.f1735s);
        }
    }

    /* renamed from: e */
    public final void m1270e() {
        removeAllViews();
        this.f1734r = null;
        this.f1724h = null;
        this.f1725i = null;
        View view = this.f1733q;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    public int getAnimatedVisibility() {
        return this.f1727k != null ? this.f1722f.f5148b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1726j;
    }

    public CharSequence getSubtitle() {
        return this.f1731o;
    }

    public CharSequence getTitle() {
        return this.f1730n;
    }

    @Override // android.view.View
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void setVisibility(int i) {
        if (i != getVisibility()) {
            C0175X c0175x = this.f1727k;
            if (c0175x != null) {
                c0175x.m521b();
            }
            super.setVisibility(i);
        }
    }

    /* renamed from: i */
    public final C0175X m1272i(int i, long j2) {
        C0175X c0175x = this.f1727k;
        if (c0175x != null) {
            c0175x.m521b();
        }
        C1100a c1100a = this.f1722f;
        if (i != 0) {
            C0175X m496a = AbstractC0169Q.m496a(this);
            m496a.m520a(0.0f);
            m496a.m522c(j2);
            c1100a.f5149c.f1727k = m496a;
            c1100a.f5148b = i;
            m496a.m523d(c1100a);
            return m496a;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        C0175X m496a2 = AbstractC0169Q.m496a(this);
        m496a2.m520a(1.0f);
        m496a2.m522c(j2);
        c1100a.f5149c.f1727k = m496a2;
        c1100a.f5148b = i;
        m496a2.m523d(c1100a);
        return m496a2;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, AbstractC0770a.f3894a, R.attr.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(13, 0));
        obtainStyledAttributes.recycle();
        C1123k c1123k = this.f1725i;
        if (c1123k != null) {
            Configuration configuration2 = c1123k.f5180g.getResources().getConfiguration();
            int i = configuration2.screenWidthDp;
            int i2 = configuration2.screenHeightDp;
            c1123k.f5194u = (configuration2.smallestScreenWidthDp > 600 || i > 600 || (i > 960 && i2 > 720) || (i > 720 && i2 > 960)) ? 5 : (i >= 500 || (i > 640 && i2 > 480) || (i > 480 && i2 > 640)) ? 4 : i >= 360 ? 3 : 2;
            MenuC1018m menuC1018m = c1123k.f5181h;
            if (menuC1018m != null) {
                menuC1018m.m2620p(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1123k c1123k = this.f1725i;
        if (c1123k != null) {
            c1123k.m2733f();
            C1115g c1115g = this.f1725i.f5198y;
            if (c1115g == null || !c1115g.m2636b()) {
                return;
            }
            c1115g.f4905i.dismiss();
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1729m = false;
        }
        if (!this.f1729m) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1729m = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1729m = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        boolean z3 = getLayoutDirection() == 1;
        int paddingRight = z3 ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.f1732p;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1732p.getLayoutParams();
            int i5 = z3 ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = z3 ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = z3 ? paddingRight - i5 : paddingRight + i5;
            int m1267g = m1267g(this.f1732p, i7, paddingTop, paddingTop2, z3) + i7;
            paddingRight = z3 ? m1267g - i6 : m1267g + i6;
        }
        LinearLayout linearLayout = this.f1735s;
        if (linearLayout != null && this.f1734r == null && linearLayout.getVisibility() != 8) {
            paddingRight += m1267g(this.f1735s, paddingRight, paddingTop, paddingTop2, z3);
        }
        View view2 = this.f1734r;
        if (view2 != null) {
            m1267g(view2, paddingRight, paddingTop, paddingTop2, z3);
        }
        int paddingLeft = z3 ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.f1724h;
        if (actionMenuView != null) {
            m1267g(actionMenuView, paddingLeft, paddingTop, paddingTop2, !z3);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int i3 = this.f1726j;
        if (i3 <= 0) {
            i3 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int i4 = i3 - paddingBottom;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        View view = this.f1732p;
        if (view != null) {
            int m1266f = m1266f(view, paddingLeft, makeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1732p.getLayoutParams();
            paddingLeft = m1266f - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f1724h;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = m1266f(this.f1724h, paddingLeft, makeMeasureSpec);
        }
        LinearLayout linearLayout = this.f1735s;
        if (linearLayout != null && this.f1734r == null) {
            if (this.f1740x) {
                this.f1735s.measure(View.MeasureSpec.makeMeasureSpec(0, 0), makeMeasureSpec);
                int measuredWidth = this.f1735s.getMeasuredWidth();
                boolean z2 = measuredWidth <= paddingLeft;
                if (z2) {
                    paddingLeft -= measuredWidth;
                }
                this.f1735s.setVisibility(z2 ? 0 : 8);
            } else {
                paddingLeft = m1266f(linearLayout, paddingLeft, makeMeasureSpec);
            }
        }
        View view2 = this.f1734r;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i5 = layoutParams.width;
            int i6 = i5 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i5 >= 0) {
                paddingLeft = Math.min(i5, paddingLeft);
            }
            int i7 = layoutParams.height;
            int i8 = i7 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i7 >= 0) {
                i4 = Math.min(i7, i4);
            }
            this.f1734r.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i6), View.MeasureSpec.makeMeasureSpec(i4, i8));
        }
        if (this.f1726j > 0) {
            setMeasuredDimension(size, i3);
            return;
        }
        int childCount = getChildCount();
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            int measuredHeight = getChildAt(i10).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i9) {
                i9 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i9);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1728l = false;
        }
        if (!this.f1728l) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1728l = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1728l = false;
        }
        return true;
    }

    public void setContentHeight(int i) {
        this.f1726j = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f1734r;
        if (view2 != null) {
            removeView(view2);
        }
        this.f1734r = view;
        if (view != null && (linearLayout = this.f1735s) != null) {
            removeView(linearLayout);
            this.f1735s = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f1731o = charSequence;
        m1269d();
    }

    public void setTitle(CharSequence charSequence) {
        this.f1730n = charSequence;
        m1269d();
        AbstractC0169Q.m506k(this, charSequence);
    }

    public void setTitleOptional(boolean z2) {
        if (z2 != this.f1740x) {
            requestLayout();
        }
        this.f1740x = z2;
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
