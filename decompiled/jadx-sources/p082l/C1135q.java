package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import p010D1.AbstractC0088l;
import p033Q.InterfaceC0283q;
import p071g0.C0891d;

/* renamed from: l.q */
/* loaded from: classes.dex */
public class C1135q extends CheckBox implements InterfaceC0283q {

    /* renamed from: f */
    public final C0891d f5233f;

    /* renamed from: g */
    public final C1133p f5234g;

    /* renamed from: h */
    public final C1090V f5235h;

    /* renamed from: i */
    public C1147w f5236i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1135q(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1076N0.m2694a(context);
        AbstractC1074M0.m2690a(this, getContext());
        C0891d c0891d = new C0891d(this);
        this.f5233f = c0891d;
        c0891d.m2464d(attributeSet, i);
        C1133p c1133p = new C1133p(this);
        this.f5234g = c1133p;
        c1133p.m2747d(attributeSet, i);
        C1090V c1090v = new C1090V(this);
        this.f5235h = c1090v;
        c1090v.m2713f(attributeSet, i);
        getEmojiTextViewHelper().m2772a(attributeSet, i);
    }

    private C1147w getEmojiTextViewHelper() {
        if (this.f5236i == null) {
            this.f5236i = new C1147w(this);
        }
        return this.f5236i;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1090V c1090v = this.f5235h;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    @Override // p033Q.InterfaceC0283q
    public ColorStateList getSupportButtonTintList() {
        C0891d c0891d = this.f5233f;
        if (c0891d != null) {
            return (ColorStateList) c0891d.f4472e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C0891d c0891d = this.f5233f;
        if (c0891d != null) {
            return (PorterDuff.Mode) c0891d.f4473f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5235h.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5235h.m2712e();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2773b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C0891d c0891d = this.f5233f;
        if (c0891d != null) {
            if (c0891d.f4470c) {
                c0891d.f4470c = false;
            } else {
                c0891d.f4470c = true;
                c0891d.m2461a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5235h;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5235h;
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
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5234g;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    @Override // p033Q.InterfaceC0283q
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C0891d c0891d = this.f5233f;
        if (c0891d != null) {
            c0891d.f4472e = colorStateList;
            c0891d.f4468a = true;
            c0891d.m2461a();
        }
    }

    @Override // p033Q.InterfaceC0283q
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C0891d c0891d = this.f5233f;
        if (c0891d != null) {
            c0891d.f4473f = mode;
            c0891d.f4469b = true;
            c0891d.m2461a();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f5235h;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f5235h;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(AbstractC0088l.m257D(getContext(), i));
    }
}
