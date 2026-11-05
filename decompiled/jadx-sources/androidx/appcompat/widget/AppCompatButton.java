package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.altaysoft.t500_split.R;
import p010D1.AbstractC0088l;
import p082l.AbstractC1074M0;
import p082l.AbstractC1076N0;
import p082l.C1090V;
import p082l.C1133p;
import p082l.C1147w;

/* loaded from: classes.dex */
public class AppCompatButton extends Button {

    /* renamed from: f */
    public final C1133p f1785f;

    /* renamed from: g */
    public final C1090V f1786g;

    /* renamed from: h */
    public C1147w f1787h;

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    private C1147w getEmojiTextViewHelper() {
        if (this.f1787h == null) {
            this.f1787h = new C1147w(this);
        }
        return this.f1787h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1090V c1090v = this.f1786g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        return super.getAutoSizeMaxTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        return super.getAutoSizeMinTextSize();
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        return super.getAutoSizeStepGranularity();
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        return super.getAutoSizeTextAvailableSizes();
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        return super.getAutoSizeTextType() == 1 ? 1 : 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1786g.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1786g.m2712e();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        C1090V c1090v = this.f1786g;
        if (c1090v != null) {
            c1090v.getClass();
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2773b(z2);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().m2774c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0088l) getEmojiTextViewHelper().f5283b.f3011g).mo285H(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z2) {
        C1090V c1090v = this.f1786g;
        if (c1090v != null) {
            c1090v.f5108a.setAllCaps(z2);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f1785f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f1786g;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f1786g;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1090V c1090v = this.f1786g;
        if (c1090v != null) {
            c1090v.m2714g(context, i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1076N0.m2694a(context);
        AbstractC1074M0.m2690a(this, getContext());
        C1133p c1133p = new C1133p(this);
        this.f1785f = c1133p;
        c1133p.m2747d(attributeSet, i);
        C1090V c1090v = new C1090V(this);
        this.f1786g = c1090v;
        c1090v.m2713f(attributeSet, i);
        c1090v.m2710b();
        getEmojiTextViewHelper().m2772a(attributeSet, i);
    }
}
