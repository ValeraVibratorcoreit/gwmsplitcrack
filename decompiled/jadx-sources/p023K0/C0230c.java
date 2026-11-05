package p023K0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p003B.AbstractC0044k;
import p003B.AbstractC0049p;
import p004B0.AbstractC0051a;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p013F0.C0097a;
import p022K.C0198k;
import p033Q.AbstractC0268b;
import p033Q.AbstractC0269c;
import p034Q0.AbstractC0294k;
import p060c1.AbstractC0577a;
import p080k0.C1033b;
import p080k0.C1035d;
import p080k0.C1036e;
import p080k0.C1037f;
import p082l.C1135q;
import p121y0.AbstractC1687o;

/* renamed from: K0.c */
/* loaded from: classes.dex */
public final class C0230c extends C1135q {

    /* renamed from: D */
    public static final int[] f586D = {R.attr.state_indeterminate};

    /* renamed from: E */
    public static final int[] f587E = {R.attr.state_error};

    /* renamed from: F */
    public static final int[][] f588F = {new int[]{android.R.attr.state_enabled, R.attr.state_error}, new int[]{android.R.attr.state_enabled, android.R.attr.state_checked}, new int[]{android.R.attr.state_enabled, -16842912}, new int[]{-16842910, android.R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: G */
    public static final int f589G = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", "android");

    /* renamed from: A */
    public CompoundButton.OnCheckedChangeListener f590A;

    /* renamed from: B */
    public final C1037f f591B;

    /* renamed from: C */
    public final C0228a f592C;

    /* renamed from: j */
    public final LinkedHashSet f593j;

    /* renamed from: k */
    public final LinkedHashSet f594k;

    /* renamed from: l */
    public ColorStateList f595l;

    /* renamed from: m */
    public boolean f596m;

    /* renamed from: n */
    public boolean f597n;

    /* renamed from: o */
    public boolean f598o;

    /* renamed from: p */
    public CharSequence f599p;

    /* renamed from: q */
    public Drawable f600q;

    /* renamed from: r */
    public Drawable f601r;

    /* renamed from: s */
    public boolean f602s;

    /* renamed from: t */
    public ColorStateList f603t;

    /* renamed from: u */
    public ColorStateList f604u;

    /* renamed from: v */
    public PorterDuff.Mode f605v;

    /* renamed from: w */
    public int f606w;

    /* renamed from: x */
    public int[] f607x;

    /* renamed from: y */
    public boolean f608y;

    /* renamed from: z */
    public CharSequence f609z;

    public C0230c(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox), attributeSet, R.attr.checkboxStyle);
        this.f593j = new LinkedHashSet();
        this.f594k = new LinkedHashSet();
        Context context2 = getContext();
        C1037f c1037f = new C1037f(context2);
        Resources resources = context2.getResources();
        Resources.Theme theme = context2.getTheme();
        ThreadLocal threadLocal = AbstractC0049p.f148a;
        Drawable m96a = AbstractC0044k.m96a(resources, R.drawable.mtrl_checkbox_button_checked_unchecked, theme);
        c1037f.f4926f = m96a;
        m96a.setCallback(c1037f.f4925k);
        new C1036e(c1037f.f4926f.getConstantState());
        this.f591B = c1037f;
        this.f592C = new C0228a(this);
        Context context3 = getContext();
        this.f600q = AbstractC0269c.m790a(this);
        this.f603t = getSuperButtonTintList();
        setSupportButtonTintList(null);
        int[] iArr = AbstractC0051a.f180o;
        AbstractC0294k.m840a(context3, attributeSet, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        AbstractC0294k.m841b(context3, attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox, new int[0]);
        TypedArray obtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, iArr, R.attr.checkboxStyle, R.style.Widget_MaterialComponents_CompoundButton_CheckBox);
        C0198k c0198k = new C0198k(context3, obtainStyledAttributes);
        this.f601r = c0198k.m598h(2);
        if (this.f600q != null && AbstractC1687o.m4923R(context3, R.attr.isMaterial3Theme, false)) {
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
            if (resourceId == f589G && resourceId2 == 0) {
                super.setButtonDrawable((Drawable) null);
                this.f600q = AbstractC0088l.m257D(context3, R.drawable.mtrl_checkbox_button);
                this.f602s = true;
                if (this.f601r == null) {
                    this.f601r = AbstractC0088l.m257D(context3, R.drawable.mtrl_checkbox_button_icon);
                }
            }
        }
        this.f604u = AbstractC0088l.m254A(context3, c0198k, 3);
        this.f605v = AbstractC0294k.m847h(obtainStyledAttributes.getInt(4, -1), PorterDuff.Mode.SRC_IN);
        this.f596m = obtainStyledAttributes.getBoolean(10, false);
        this.f597n = obtainStyledAttributes.getBoolean(6, true);
        this.f598o = obtainStyledAttributes.getBoolean(9, false);
        this.f599p = obtainStyledAttributes.getText(8);
        if (obtainStyledAttributes.hasValue(7)) {
            setCheckedState(obtainStyledAttributes.getInt(7, 0));
        }
        c0198k.m609t();
        m690a();
    }

    private String getButtonStateDescription() {
        int i = this.f606w;
        return i == 1 ? getResources().getString(R.string.mtrl_checkbox_state_description_checked) : i == 0 ? getResources().getString(R.string.mtrl_checkbox_state_description_unchecked) : getResources().getString(R.string.mtrl_checkbox_state_description_indeterminate);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f595l == null) {
            int m4948s = AbstractC1687o.m4948s(this, R.attr.colorControlActivated);
            int m4948s2 = AbstractC1687o.m4948s(this, R.attr.colorError);
            int m4948s3 = AbstractC1687o.m4948s(this, R.attr.colorSurface);
            int m4948s4 = AbstractC1687o.m4948s(this, R.attr.colorOnSurface);
            this.f595l = new ColorStateList(f588F, new int[]{AbstractC1687o.m4909B(1.0f, m4948s3, m4948s2), AbstractC1687o.m4909B(1.0f, m4948s3, m4948s), AbstractC1687o.m4909B(0.54f, m4948s3, m4948s4), AbstractC1687o.m4909B(0.38f, m4948s3, m4948s4), AbstractC1687o.m4909B(0.38f, m4948s3, m4948s4)});
        }
        return this.f595l;
    }

    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.f603t;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    /* renamed from: a */
    public final void m690a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0097a c0097a;
        Drawable drawable = this.f600q;
        ColorStateList colorStateList3 = this.f603t;
        PorterDuff.Mode m787b = AbstractC0268b.m787b(this);
        if (drawable == null) {
            drawable = null;
        } else if (colorStateList3 != null) {
            drawable = drawable.mutate();
            if (m787b != null) {
                AbstractC0070a.m207i(drawable, m787b);
            }
        }
        this.f600q = drawable;
        Drawable drawable2 = this.f601r;
        ColorStateList colorStateList4 = this.f604u;
        PorterDuff.Mode mode = this.f605v;
        if (drawable2 == null) {
            drawable2 = null;
        } else if (colorStateList4 != null) {
            drawable2 = drawable2.mutate();
            if (mode != null) {
                AbstractC0070a.m207i(drawable2, mode);
            }
        }
        this.f601r = drawable2;
        if (this.f602s) {
            C1037f c1037f = this.f591B;
            if (c1037f != null) {
                Drawable drawable3 = c1037f.f4926f;
                C0228a c0228a = this.f592C;
                if (drawable3 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) drawable3;
                    if (c0228a.f583a == null) {
                        c0228a.f583a = new C1033b(c0228a);
                    }
                    animatedVectorDrawable.unregisterAnimationCallback(c0228a.f583a);
                }
                ArrayList arrayList = c1037f.f4924j;
                C1035d c1035d = c1037f.f4921g;
                if (arrayList != null && c0228a != null) {
                    arrayList.remove(c0228a);
                    if (c1037f.f4924j.size() == 0 && (c0097a = c1037f.f4923i) != null) {
                        c1035d.f4917b.removeListener(c0097a);
                        c1037f.f4923i = null;
                    }
                }
                Drawable drawable4 = c1037f.f4926f;
                if (drawable4 != null) {
                    AnimatedVectorDrawable animatedVectorDrawable2 = (AnimatedVectorDrawable) drawable4;
                    if (c0228a.f583a == null) {
                        c0228a.f583a = new C1033b(c0228a);
                    }
                    animatedVectorDrawable2.registerAnimationCallback(c0228a.f583a);
                } else if (c0228a != null) {
                    if (c1037f.f4924j == null) {
                        c1037f.f4924j = new ArrayList();
                    }
                    if (!c1037f.f4924j.contains(c0228a)) {
                        c1037f.f4924j.add(c0228a);
                        if (c1037f.f4923i == null) {
                            c1037f.f4923i = new C0097a(4, c1037f);
                        }
                        c1035d.f4917b.addListener(c1037f.f4923i);
                    }
                }
            }
            Drawable drawable5 = this.f600q;
            if ((drawable5 instanceof AnimatedStateListDrawable) && c1037f != null) {
                ((AnimatedStateListDrawable) drawable5).addTransition(R.id.checked, R.id.unchecked, c1037f, false);
                ((AnimatedStateListDrawable) this.f600q).addTransition(R.id.indeterminate, R.id.unchecked, c1037f, false);
            }
        }
        Drawable drawable6 = this.f600q;
        if (drawable6 != null && (colorStateList2 = this.f603t) != null) {
            AbstractC0070a.m206h(drawable6, colorStateList2);
        }
        Drawable drawable7 = this.f601r;
        if (drawable7 != null && (colorStateList = this.f604u) != null) {
            AbstractC0070a.m206h(drawable7, colorStateList);
        }
        Drawable drawable8 = this.f600q;
        Drawable drawable9 = this.f601r;
        if (drawable8 == null) {
            drawable8 = drawable9;
        } else if (drawable9 != null) {
            int intrinsicWidth = drawable9.getIntrinsicWidth();
            if (intrinsicWidth == -1) {
                intrinsicWidth = drawable8.getIntrinsicWidth();
            }
            int intrinsicHeight = drawable9.getIntrinsicHeight();
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable8.getIntrinsicHeight();
            }
            if (intrinsicWidth > drawable8.getIntrinsicWidth() || intrinsicHeight > drawable8.getIntrinsicHeight()) {
                float f2 = intrinsicWidth / intrinsicHeight;
                if (f2 >= drawable8.getIntrinsicWidth() / drawable8.getIntrinsicHeight()) {
                    int intrinsicWidth2 = drawable8.getIntrinsicWidth();
                    intrinsicHeight = (int) (intrinsicWidth2 / f2);
                    intrinsicWidth = intrinsicWidth2;
                } else {
                    intrinsicHeight = drawable8.getIntrinsicHeight();
                    intrinsicWidth = (int) (f2 * intrinsicHeight);
                }
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable8, drawable9});
            layerDrawable.setLayerSize(1, intrinsicWidth, intrinsicHeight);
            layerDrawable.setLayerGravity(1, 17);
            drawable8 = layerDrawable;
        }
        super.setButtonDrawable(drawable8);
        refreshDrawableState();
    }

    @Override // android.widget.CompoundButton
    public Drawable getButtonDrawable() {
        return this.f600q;
    }

    public Drawable getButtonIconDrawable() {
        return this.f601r;
    }

    public ColorStateList getButtonIconTintList() {
        return this.f604u;
    }

    public PorterDuff.Mode getButtonIconTintMode() {
        return this.f605v;
    }

    @Override // android.widget.CompoundButton
    public ColorStateList getButtonTintList() {
        return this.f603t;
    }

    public int getCheckedState() {
        return this.f606w;
    }

    public CharSequence getErrorAccessibilityLabel() {
        return this.f599p;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final boolean isChecked() {
        return this.f606w == 1;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f596m && this.f603t == null && this.f604u == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] copyOf;
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(onCreateDrawableState, f586D);
        }
        if (this.f598o) {
            View.mergeDrawableStates(onCreateDrawableState, f587E);
        }
        int i2 = 0;
        while (true) {
            if (i2 >= onCreateDrawableState.length) {
                copyOf = Arrays.copyOf(onCreateDrawableState, onCreateDrawableState.length + 1);
                copyOf[onCreateDrawableState.length] = 16842912;
                break;
            }
            int i3 = onCreateDrawableState[i2];
            if (i3 == 16842912) {
                copyOf = onCreateDrawableState;
                break;
            }
            if (i3 == 0) {
                copyOf = (int[]) onCreateDrawableState.clone();
                copyOf[i2] = 16842912;
                break;
            }
            i2++;
        }
        this.f607x = copyOf;
        return onCreateDrawableState;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        Drawable m790a;
        if (!this.f597n || !TextUtils.isEmpty(getText()) || (m790a = AbstractC0269c.m790a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - m790a.getIntrinsicWidth()) / 2) * (AbstractC0294k.m845f(this) ? -1 : 1);
        int save = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(save);
        if (getBackground() != null) {
            Rect bounds = m790a.getBounds();
            AbstractC0070a.m204f(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && this.f598o) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f599p));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0229b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0229b c0229b = (C0229b) parcelable;
        super.onRestoreInstanceState(c0229b.getSuperState());
        setCheckedState(c0229b.f585a);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C0229b c0229b = new C0229b(super.onSaveInstanceState());
        c0229b.f585a = getCheckedState();
        return c0229b;
    }

    @Override // p082l.C1135q, android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0088l.m257D(getContext(), i));
    }

    public void setButtonIconDrawable(Drawable drawable) {
        this.f601r = drawable;
        m690a();
    }

    public void setButtonIconDrawableResource(int i) {
        setButtonIconDrawable(AbstractC0088l.m257D(getContext(), i));
    }

    public void setButtonIconTintList(ColorStateList colorStateList) {
        if (this.f604u == colorStateList) {
            return;
        }
        this.f604u = colorStateList;
        m690a();
    }

    public void setButtonIconTintMode(PorterDuff.Mode mode) {
        if (this.f605v == mode) {
            return;
        }
        this.f605v = mode;
        m690a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(ColorStateList colorStateList) {
        if (this.f603t == colorStateList) {
            return;
        }
        this.f603t = colorStateList;
        m690a();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        m690a();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.f597n = z2;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    public void setCheckedState(int i) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.f606w != i) {
            this.f606w = i;
            super.setChecked(i == 1);
            refreshDrawableState();
            if (Build.VERSION.SDK_INT >= 30 && this.f609z == null) {
                super.setStateDescription(getButtonStateDescription());
            }
            if (this.f608y) {
                return;
            }
            this.f608y = true;
            LinkedHashSet linkedHashSet = this.f594k;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    it.next().getClass();
                    throw new ClassCastException();
                }
            }
            if (this.f606w != 2 && (onCheckedChangeListener = this.f590A) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            AutofillManager autofillManager = (AutofillManager) getContext().getSystemService(AutofillManager.class);
            if (autofillManager != null) {
                autofillManager.notifyValueChanged(this);
            }
            this.f608y = false;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
    }

    public void setErrorAccessibilityLabel(CharSequence charSequence) {
        this.f599p = charSequence;
    }

    public void setErrorAccessibilityLabelResource(int i) {
        setErrorAccessibilityLabel(i != 0 ? getResources().getText(i) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f598o == z2) {
            return;
        }
        this.f598o = z2;
        refreshDrawableState();
        Iterator it = this.f593j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f590A = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    public void setStateDescription(CharSequence charSequence) {
        this.f609z = charSequence;
        if (charSequence != null) {
            super.setStateDescription(charSequence);
        } else {
            if (Build.VERSION.SDK_INT < 30 || charSequence != null) {
                return;
            }
            super.setStateDescription(getButtonStateDescription());
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f596m = z2;
        if (z2) {
            AbstractC0268b.m788c(this, getMaterialThemeColorsTintList());
        } else {
            AbstractC0268b.m788c(this, null);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public final void toggle() {
        setChecked(!isChecked());
    }

    @Override // p082l.C1135q, android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        this.f600q = drawable;
        this.f602s = false;
        m690a();
    }
}
