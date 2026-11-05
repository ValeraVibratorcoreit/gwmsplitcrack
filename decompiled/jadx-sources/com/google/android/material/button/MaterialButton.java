package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.media.C0639g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p019I0.C0138b;
import p019I0.C0139c;
import p019I0.InterfaceC0137a;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p045W0.C0351a;
import p045W0.C0360j;
import p045W0.C0361k;
import p045W0.InterfaceC0372v;
import p060c1.AbstractC0577a;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;

/* loaded from: classes.dex */
public class MaterialButton extends AppCompatButton implements Checkable, InterfaceC0372v {

    /* renamed from: w */
    public static final int[] f3420w = {R.attr.state_checkable};

    /* renamed from: x */
    public static final int[] f3421x = {R.attr.state_checked};

    /* renamed from: i */
    public final C0139c f3422i;

    /* renamed from: j */
    public final LinkedHashSet f3423j;

    /* renamed from: k */
    public InterfaceC0137a f3424k;

    /* renamed from: l */
    public PorterDuff.Mode f3425l;

    /* renamed from: m */
    public ColorStateList f3426m;

    /* renamed from: n */
    public Drawable f3427n;

    /* renamed from: o */
    public String f3428o;

    /* renamed from: p */
    public int f3429p;

    /* renamed from: q */
    public int f3430q;

    /* renamed from: r */
    public int f3431r;

    /* renamed from: s */
    public int f3432s;

    /* renamed from: t */
    public boolean f3433t;

    /* renamed from: u */
    public boolean f3434u;

    /* renamed from: v */
    public int f3435v;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, com.altaysoft.t500_split.R.attr.materialButtonStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Button), attributeSet, com.altaysoft.t500_split.R.attr.materialButtonStyle);
        this.f3423j = new LinkedHashSet();
        this.f3433t = false;
        this.f3434u = false;
        Context context2 = getContext();
        TypedArray m846g = AbstractC0294k.m846g(context2, attributeSet, AbstractC0051a.f176k, com.altaysoft.t500_split.R.attr.materialButtonStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f3432s = m846g.getDimensionPixelSize(12, 0);
        int i = m846g.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f3425l = AbstractC0294k.m847h(i, mode);
        this.f3426m = AbstractC0088l.m255B(getContext(), m846g, 14);
        this.f3427n = AbstractC0088l.m258E(getContext(), m846g, 10);
        this.f3435v = m846g.getInteger(11, 1);
        this.f3429p = m846g.getDimensionPixelSize(13, 0);
        C0139c c0139c = new C0139c(this, C0361k.m965b(context2, attributeSet, com.altaysoft.t500_split.R.attr.materialButtonStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Button).m963a());
        this.f3422i = c0139c;
        c0139c.f423c = m846g.getDimensionPixelOffset(1, 0);
        c0139c.f424d = m846g.getDimensionPixelOffset(2, 0);
        c0139c.f425e = m846g.getDimensionPixelOffset(3, 0);
        c0139c.f426f = m846g.getDimensionPixelOffset(4, 0);
        if (m846g.hasValue(8)) {
            int dimensionPixelSize = m846g.getDimensionPixelSize(8, -1);
            c0139c.f427g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            C0360j m968e = c0139c.f422b.m968e();
            m968e.f1052e = new C0351a(f2);
            m968e.f1053f = new C0351a(f2);
            m968e.f1054g = new C0351a(f2);
            m968e.f1055h = new C0351a(f2);
            c0139c.m395c(m968e.m963a());
            c0139c.f436p = true;
        }
        c0139c.f428h = m846g.getDimensionPixelSize(20, 0);
        c0139c.f429i = AbstractC0294k.m847h(m846g.getInt(7, -1), mode);
        c0139c.f430j = AbstractC0088l.m255B(getContext(), m846g, 6);
        c0139c.f431k = AbstractC0088l.m255B(getContext(), m846g, 19);
        c0139c.f432l = AbstractC0088l.m255B(getContext(), m846g, 16);
        c0139c.f437q = m846g.getBoolean(5, false);
        c0139c.f440t = m846g.getDimensionPixelSize(9, 0);
        c0139c.f438r = m846g.getBoolean(21, true);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (m846g.hasValue(0)) {
            c0139c.f435o = true;
            setSupportBackgroundTintList(c0139c.f430j);
            setSupportBackgroundTintMode(c0139c.f429i);
        } else {
            c0139c.m397e();
        }
        setPaddingRelative(paddingStart + c0139c.f423c, paddingTop + c0139c.f425e, paddingEnd + c0139c.f424d, paddingBottom + c0139c.f426f);
        m846g.recycle();
        setCompoundDrawablePadding(this.f3432s);
        m2052d(this.f3427n != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f2 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    /* renamed from: a */
    public final boolean m2049a() {
        C0139c c0139c = this.f3422i;
        return c0139c != null && c0139c.f437q;
    }

    /* renamed from: b */
    public final boolean m2050b() {
        C0139c c0139c = this.f3422i;
        return (c0139c == null || c0139c.f435o) ? false : true;
    }

    /* renamed from: c */
    public final void m2051c() {
        int i = this.f3435v;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.f3427n, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f3427n, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f3427n, null, null);
        }
    }

    /* renamed from: d */
    public final void m2052d(boolean z2) {
        Drawable drawable = this.f3427n;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f3427n = mutate;
            AbstractC0070a.m206h(mutate, this.f3426m);
            PorterDuff.Mode mode = this.f3425l;
            if (mode != null) {
                AbstractC0070a.m207i(this.f3427n, mode);
            }
            int i = this.f3429p;
            if (i == 0) {
                i = this.f3427n.getIntrinsicWidth();
            }
            int i2 = this.f3429p;
            if (i2 == 0) {
                i2 = this.f3427n.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f3427n;
            int i3 = this.f3430q;
            int i4 = this.f3431r;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.f3427n.setVisible(true, z2);
        }
        if (z2) {
            m2051c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.f3435v;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.f3427n) || (((i5 == 3 || i5 == 4) && drawable5 != this.f3427n) || ((i5 == 16 || i5 == 32) && drawable4 != this.f3427n))) {
            m2051c();
        }
    }

    /* renamed from: e */
    public final void m2053e(int i, int i2) {
        if (this.f3427n == null || getLayout() == null) {
            return;
        }
        int i3 = this.f3435v;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f3430q = 0;
                if (i3 == 16) {
                    this.f3431r = 0;
                    m2052d(false);
                    return;
                }
                int i4 = this.f3429p;
                if (i4 == 0) {
                    i4 = this.f3427n.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f3432s) - getPaddingBottom()) / 2);
                if (this.f3431r != max) {
                    this.f3431r = max;
                    m2052d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f3431r = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f3435v;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f3430q = 0;
            m2052d(false);
            return;
        }
        int i6 = this.f3429p;
        if (i6 == 0) {
            i6 = this.f3427n.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f3432s) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f3435v == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f3430q != paddingEnd) {
            this.f3430q = paddingEnd;
            m2052d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.f3428o)) {
            return (m2049a() ? CompoundButton.class : Button.class).getName();
        }
        return this.f3428o;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m2050b()) {
            return this.f3422i.f427g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f3427n;
    }

    public int getIconGravity() {
        return this.f3435v;
    }

    public int getIconPadding() {
        return this.f3432s;
    }

    public int getIconSize() {
        return this.f3429p;
    }

    public ColorStateList getIconTint() {
        return this.f3426m;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f3425l;
    }

    public int getInsetBottom() {
        return this.f3422i.f426f;
    }

    public int getInsetTop() {
        return this.f3422i.f425e;
    }

    public ColorStateList getRippleColor() {
        if (m2050b()) {
            return this.f3422i.f432l;
        }
        return null;
    }

    public C0361k getShapeAppearanceModel() {
        if (m2050b()) {
            return this.f3422i.f422b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m2050b()) {
            return this.f3422i.f431k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m2050b()) {
            return this.f3422i.f428h;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m2050b() ? this.f3422i.f430j : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m2050b() ? this.f3422i.f429i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3433t;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m2050b()) {
            AbstractC1687o.m4929X(this, this.f3422i.m394b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (m2049a()) {
            View.mergeDrawableStates(onCreateDrawableState, f3420w);
        }
        if (this.f3433t) {
            View.mergeDrawableStates(onCreateDrawableState, f3421x);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f3433t);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(m2049a());
        accessibilityNodeInfo.setChecked(this.f3433t);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        m2053e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0138b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0138b c0138b = (C0138b) parcelable;
        super.onRestoreInstanceState(c0138b.f833a);
        setChecked(c0138b.f420c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0138b c0138b = new C0138b(super.onSaveInstanceState());
        c0138b.f420c = this.f3433t;
        return c0138b;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        m2053e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f3422i.f438r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f3427n != null) {
            if (this.f3427n.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f3428o = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!m2050b()) {
            super.setBackgroundColor(i);
            return;
        }
        C0139c c0139c = this.f3422i;
        if (c0139c.m394b(false) != null) {
            c0139c.m394b(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m2050b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C0139c c0139c = this.f3422i;
        c0139c.f435o = true;
        ColorStateList colorStateList = c0139c.f430j;
        MaterialButton materialButton = c0139c.f421a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c0139c.f429i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? AbstractC0088l.m257D(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (m2050b()) {
            this.f3422i.f437q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (m2049a() && isEnabled() && this.f3433t != z2) {
            this.f3433t = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f3433t;
                if (!materialButtonToggleGroup.f3442k) {
                    materialButtonToggleGroup.m2055b(getId(), z3);
                }
            }
            if (this.f3434u) {
                return;
            }
            this.f3434u = true;
            Iterator it = this.f3423j.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f3434u = false;
        }
    }

    public void setCornerRadius(int i) {
        if (m2050b()) {
            C0139c c0139c = this.f3422i;
            if (c0139c.f436p && c0139c.f427g == i) {
                return;
            }
            c0139c.f427g = i;
            c0139c.f436p = true;
            float f2 = i;
            C0360j m968e = c0139c.f422b.m968e();
            m968e.f1052e = new C0351a(f2);
            m968e.f1053f = new C0351a(f2);
            m968e.f1054g = new C0351a(f2);
            m968e.f1055h = new C0351a(f2);
            c0139c.m395c(m968e.m963a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (m2050b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (m2050b()) {
            this.f3422i.m394b(false).m957j(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f3427n != drawable) {
            this.f3427n = drawable;
            m2052d(true);
            m2053e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f3435v != i) {
            this.f3435v = i;
            m2053e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f3432s != i) {
            this.f3432s = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? AbstractC0088l.m257D(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f3429p != i) {
            this.f3429p = i;
            m2052d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f3426m != colorStateList) {
            this.f3426m = colorStateList;
            m2052d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f3425l != mode) {
            this.f3425l = mode;
            m2052d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC1695c.m4959b(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C0139c c0139c = this.f3422i;
        c0139c.m396d(c0139c.f425e, i);
    }

    public void setInsetTop(int i) {
        C0139c c0139c = this.f3422i;
        c0139c.m396d(i, c0139c.f426f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC0137a interfaceC0137a) {
        this.f3424k = interfaceC0137a;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        InterfaceC0137a interfaceC0137a = this.f3424k;
        if (interfaceC0137a != null) {
            ((MaterialButtonToggleGroup) ((C0639g) interfaceC0137a).f3011g).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m2050b()) {
            C0139c c0139c = this.f3422i;
            if (c0139c.f432l != colorStateList) {
                c0139c.f432l = colorStateList;
                MaterialButton materialButton = c0139c.f421a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    RippleDrawable rippleDrawable = (RippleDrawable) materialButton.getBackground();
                    if (colorStateList == null) {
                        colorStateList = ColorStateList.valueOf(0);
                    }
                    rippleDrawable.setColor(colorStateList);
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (m2050b()) {
            setRippleColor(AbstractC1695c.m4959b(getContext(), i));
        }
    }

    @Override // p045W0.InterfaceC0372v
    public void setShapeAppearanceModel(C0361k c0361k) {
        if (!m2050b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f3422i.m395c(c0361k);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (m2050b()) {
            C0139c c0139c = this.f3422i;
            c0139c.f434n = z2;
            c0139c.m398f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m2050b()) {
            C0139c c0139c = this.f3422i;
            if (c0139c.f431k != colorStateList) {
                c0139c.f431k = colorStateList;
                c0139c.m398f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (m2050b()) {
            setStrokeColor(AbstractC1695c.m4959b(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (m2050b()) {
            C0139c c0139c = this.f3422i;
            if (c0139c.f428h != i) {
                c0139c.f428h = i;
                c0139c.m398f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (m2050b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!m2050b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C0139c c0139c = this.f3422i;
        if (c0139c.f430j != colorStateList) {
            c0139c.f430j = colorStateList;
            if (c0139c.m394b(false) != null) {
                AbstractC0070a.m206h(c0139c.m394b(false), c0139c.f430j);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!m2050b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C0139c c0139c = this.f3422i;
        if (c0139c.f429i != mode) {
            c0139c.f429i = mode;
            if (c0139c.m394b(false) == null || c0139c.f429i == null) {
                return;
            }
            AbstractC0070a.m207i(c0139c.m394b(false), c0139c.f429i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        m2053e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f3422i.f438r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3433t);
    }
}
