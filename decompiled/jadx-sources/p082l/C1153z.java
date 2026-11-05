package p082l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p010D1.AbstractC0088l;
import p022K.C0198k;

/* renamed from: l.z */
/* loaded from: classes.dex */
public final class C1153z extends MultiAutoCompleteTextView {

    /* renamed from: i */
    public static final int[] f5291i = {R.attr.popupBackground};

    /* renamed from: f */
    public final C1133p f5292f;

    /* renamed from: g */
    public final C1090V f5293g;

    /* renamed from: h */
    public final C1051B f5294h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1153z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.altaysoft.t500_split.R.attr.autoCompleteTextViewStyle);
        AbstractC1076N0.m2694a(context);
        AbstractC1074M0.m2690a(this, getContext());
        C0198k m591r = C0198k.m591r(getContext(), attributeSet, f5291i, com.altaysoft.t500_split.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) m591r.f534c).hasValue(0)) {
            setDropDownBackgroundDrawable(m591r.m598h(0));
        }
        m591r.m609t();
        C1133p c1133p = new C1133p(this);
        this.f5292f = c1133p;
        c1133p.m2747d(attributeSet, com.altaysoft.t500_split.R.attr.autoCompleteTextViewStyle);
        C1090V c1090v = new C1090V(this);
        this.f5293g = c1090v;
        c1090v.m2713f(attributeSet, com.altaysoft.t500_split.R.attr.autoCompleteTextViewStyle);
        c1090v.m2710b();
        C1051B c1051b = new C1051B(this);
        this.f5294h = c1051b;
        c1051b.mo2658e(attributeSet, com.altaysoft.t500_split.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener m2657d = c1051b.m2657d(keyListener);
        if (m2657d == keyListener) {
            return;
        }
        super.setKeyListener(m2657d);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1090V c1090v = this.f5293g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5293g.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5293g.m2712e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0088l.m265Z(editorInfo, onCreateInputConnection, this);
        return this.f5294h.m2659f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5293g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5293g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(AbstractC0088l.m257D(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f5294h.m2660g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5294h.m2657d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5292f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f5293g;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f5293g;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1090V c1090v = this.f5293g;
        if (c1090v != null) {
            c1090v.m2714g(context, i);
        }
    }
}
