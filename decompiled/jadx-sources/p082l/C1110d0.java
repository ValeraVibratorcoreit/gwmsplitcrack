package p082l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import p010D1.AbstractC0088l;

/* renamed from: l.d0 */
/* loaded from: classes.dex */
public final class C1110d0 extends ToggleButton {

    /* renamed from: f */
    public final C1133p f5162f;

    /* renamed from: g */
    public final C1090V f5163g;

    /* renamed from: h */
    public C1147w f5164h;

    public C1110d0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        AbstractC1074M0.m2690a(this, getContext());
        C1133p c1133p = new C1133p(this);
        this.f5162f = c1133p;
        c1133p.m2747d(attributeSet, R.attr.buttonStyleToggle);
        C1090V c1090v = new C1090V(this);
        this.f5163g = c1090v;
        c1090v.m2713f(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().m2772a(attributeSet, R.attr.buttonStyleToggle);
    }

    private C1147w getEmojiTextViewHelper() {
        if (this.f5164h == null) {
            this.f5164h = new C1147w(this);
        }
        return this.f5164h;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1090V c1090v = this.f5163g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5163g.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5163g.m2712e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2773b(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5163g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5163g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2774c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0088l) getEmojiTextViewHelper().f5283b.f3011g).mo285H(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5162f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f5163g;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f5163g;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }
}
