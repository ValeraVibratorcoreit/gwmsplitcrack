package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.WeakHashMap;
import p003B.AbstractC0044k;
import p003B.AbstractC0049p;
import p008D.AbstractC0070a;
import p019I0.C0141e;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0287d;
import p079k.C1020o;
import p079k.InterfaceC1031z;
import p082l.AbstractC1099Z0;
import p082l.C1138r0;

/* loaded from: classes.dex */
public class NavigationMenuItemView extends AbstractC0287d implements InterfaceC1031z {

    /* renamed from: L */
    public static final int[] f3563L = {R.attr.state_checked};

    /* renamed from: A */
    public int f3564A;

    /* renamed from: B */
    public boolean f3565B;

    /* renamed from: C */
    public boolean f3566C;

    /* renamed from: D */
    public final boolean f3567D;

    /* renamed from: E */
    public final CheckedTextView f3568E;

    /* renamed from: F */
    public FrameLayout f3569F;

    /* renamed from: G */
    public C1020o f3570G;

    /* renamed from: H */
    public ColorStateList f3571H;

    /* renamed from: I */
    public boolean f3572I;

    /* renamed from: J */
    public Drawable f3573J;

    /* renamed from: K */
    public final C0141e f3574K;

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3567D = true;
        C0141e c0141e = new C0141e(2, this);
        this.f3574K = c0141e;
        setOrientation(0);
        LayoutInflater.from(context).inflate(com.altaysoft.t500_split.R.layout.design_navigation_menu_item, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.design_navigation_icon_size));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(com.altaysoft.t500_split.R.id.design_menu_item_text);
        this.f3568E = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        AbstractC0169Q.m505j(checkedTextView, c0141e);
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f3569F == null) {
                this.f3569F = (FrameLayout) ((ViewStub) findViewById(com.altaysoft.t500_split.R.id.design_menu_item_action_area_stub)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f3569F.removeAllViews();
            this.f3569F.addView(view);
        }
    }

    @Override // p079k.InterfaceC1031z
    /* renamed from: b */
    public final void mo1258b(C1020o c1020o) {
        StateListDrawable stateListDrawable;
        this.f3570G = c1020o;
        int i = c1020o.f4859a;
        if (i > 0) {
            setId(i);
        }
        setVisibility(c1020o.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            TypedValue typedValue = new TypedValue();
            if (getContext().getTheme().resolveAttribute(com.altaysoft.t500_split.R.attr.colorControlHighlight, typedValue, true)) {
                stateListDrawable = new StateListDrawable();
                stateListDrawable.addState(f3563L, new ColorDrawable(typedValue.data));
                stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            } else {
                stateListDrawable = null;
            }
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            setBackground(stateListDrawable);
        }
        setCheckable(c1020o.isCheckable());
        setChecked(c1020o.isChecked());
        setEnabled(c1020o.isEnabled());
        setTitle(c1020o.f4863e);
        setIcon(c1020o.getIcon());
        setActionView(c1020o.getActionView());
        setContentDescription(c1020o.f4875q);
        AbstractC1099Z0.m2725a(this, c1020o.f4876r);
        C1020o c1020o2 = this.f3570G;
        CharSequence charSequence = c1020o2.f4863e;
        CheckedTextView checkedTextView = this.f3568E;
        if (charSequence == null && c1020o2.getIcon() == null && this.f3570G.getActionView() != null) {
            checkedTextView.setVisibility(8);
            FrameLayout frameLayout = this.f3569F;
            if (frameLayout != null) {
                C1138r0 c1138r0 = (C1138r0) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) c1138r0).width = -1;
                this.f3569F.setLayoutParams(c1138r0);
                return;
            }
            return;
        }
        checkedTextView.setVisibility(0);
        FrameLayout frameLayout2 = this.f3569F;
        if (frameLayout2 != null) {
            C1138r0 c1138r02 = (C1138r0) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) c1138r02).width = -2;
            this.f3569F.setLayoutParams(c1138r02);
        }
    }

    @Override // p079k.InterfaceC1031z
    public C1020o getItemData() {
        return this.f3570G;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        C1020o c1020o = this.f3570G;
        if (c1020o != null && c1020o.isCheckable() && this.f3570G.isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3563L);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f3566C != z2) {
            this.f3566C = z2;
            this.f3574K.mo532h(this.f3568E, 2048);
        }
    }

    public void setChecked(boolean z2) {
        refreshDrawableState();
        CheckedTextView checkedTextView = this.f3568E;
        checkedTextView.setChecked(z2);
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z2 && this.f3567D) ? 1 : 0);
    }

    public void setHorizontalPadding(int i) {
        setPadding(i, getPaddingTop(), i, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f3572I) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = drawable.mutate();
                AbstractC0070a.m206h(drawable, this.f3571H);
            }
            int i = this.f3564A;
            drawable.setBounds(0, 0, i, i);
        } else if (this.f3565B) {
            if (this.f3573J == null) {
                Resources resources = getResources();
                Resources.Theme theme = getContext().getTheme();
                ThreadLocal threadLocal = AbstractC0049p.f148a;
                Drawable m96a = AbstractC0044k.m96a(resources, com.altaysoft.t500_split.R.drawable.navigation_empty_icon, theme);
                this.f3573J = m96a;
                if (m96a != null) {
                    int i2 = this.f3564A;
                    m96a.setBounds(0, 0, i2, i2);
                }
            }
            drawable = this.f3573J;
        }
        this.f3568E.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i) {
        this.f3568E.setCompoundDrawablePadding(i);
    }

    public void setIconSize(int i) {
        this.f3564A = i;
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.f3571H = colorStateList;
        this.f3572I = colorStateList != null;
        C1020o c1020o = this.f3570G;
        if (c1020o != null) {
            setIcon(c1020o.getIcon());
        }
    }

    public void setMaxLines(int i) {
        this.f3568E.setMaxLines(i);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f3565B = z2;
    }

    public void setTextAppearance(int i) {
        this.f3568E.setTextAppearance(i);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f3568E.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f3568E.setText(charSequence);
    }
}
