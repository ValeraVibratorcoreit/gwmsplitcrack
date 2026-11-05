package p082l;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p006C.AbstractC0064l;
import p010D1.AbstractC0088l;
import p018I.AbstractC0134e;
import p018I.C0133d;
import p033Q.AbstractC0279m;
import p033Q.AbstractC0280n;
import p033Q.AbstractC0281o;

/* renamed from: l.Y */
/* loaded from: classes.dex */
public class C1096Y extends TextView {

    /* renamed from: f */
    public final C1133p f5126f;

    /* renamed from: g */
    public final C1090V f5127g;

    /* renamed from: h */
    public C1147w f5128h;

    /* renamed from: i */
    public boolean f5129i;

    /* renamed from: j */
    public C1051B f5130j;

    /* renamed from: k */
    public Future f5131k;

    public C1096Y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C1147w getEmojiTextViewHelper() {
        if (this.f5128h == null) {
            this.f5128h = new C1147w(this);
        }
        return this.f5128h;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    /* renamed from: g */
    public final void m2721g() {
        Future future = this.f5131k;
        if (future == null) {
            return;
        }
        try {
            this.f5131k = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            PrecomputedText.Params m819c = AbstractC0280n.m819c(this);
            m819c.getTextPaint();
            m819c.getTextDirection();
            m819c.getBreakStrategy();
            m819c.getHyphenationFrequency();
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public InterfaceC1092W getSuperCaller() {
        if (this.f5130j == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f5130j = new C1094X(this);
            } else {
                this.f5130j = new C1051B(this);
            }
        }
        return this.f5130j;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5127g.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5127g.m2712e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        m2721g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    public C0133d getTextMetricsParamsCompat() {
        return new C0133d(AbstractC0280n.m819c(this));
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5127g.getClass();
        C1090V.m2708h(editorInfo, onCreateInputConnection, this);
        AbstractC0088l.m265Z(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        m2721g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2773b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        super.setAutoSizeTextTypeWithDefaults(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
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

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        getSuperCaller().mo2655b(i);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        getSuperCaller().mo2654a(i);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        AbstractC0088l.m276o0(this, i);
    }

    public void setPrecomputedText(AbstractC0134e abstractC0134e) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        PrecomputedText.Params m819c = AbstractC0280n.m819c(this);
        m819c.getTextPaint();
        m819c.getTextDirection();
        m819c.getBreakStrategy();
        m819c.getHyphenationFrequency();
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5126f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f5127g;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f5127g;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2714g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    public void setTextFuture(Future<AbstractC0134e> future) {
        this.f5131k = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0133d c0133d) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0133d.f412b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(c0133d.f411a);
        AbstractC0279m.m813e(this, c0133d.f413c);
        AbstractC0279m.m816h(this, c0133d.f414d);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f5129i) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0088l abstractC0088l = AbstractC0064l.f210a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f5129i = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f5129i = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1096Y(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1076N0.m2694a(context);
        this.f5129i = false;
        this.f5130j = null;
        AbstractC1074M0.m2690a(this, getContext());
        C1133p c1133p = new C1133p(this);
        this.f5126f = c1133p;
        c1133p.m2747d(attributeSet, i);
        C1090V c1090v = new C1090V(this);
        this.f5127g = c1090v;
        c1090v.m2713f(attributeSet, i);
        c1090v.m2710b();
        getEmojiTextViewHelper().m2772a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().mo2656c(i, f2);
        } else if (i2 >= 34) {
            AbstractC0281o.m821a(this, i, f2);
        } else {
            AbstractC0088l.m276o0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? AbstractC0088l.m257D(context, i) : null, i2 != 0 ? AbstractC0088l.m257D(context, i2) : null, i3 != 0 ? AbstractC0088l.m257D(context, i3) : null, i4 != 0 ? AbstractC0088l.m257D(context, i4) : null);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? AbstractC0088l.m257D(context, i) : null, i2 != 0 ? AbstractC0088l.m257D(context, i2) : null, i3 != 0 ? AbstractC0088l.m257D(context, i3) : null, i4 != 0 ? AbstractC0088l.m257D(context, i4) : null);
        C1090V c1090v = this.f5127g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }
}
