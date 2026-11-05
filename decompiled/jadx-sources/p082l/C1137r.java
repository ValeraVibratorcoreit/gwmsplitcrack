package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.altaysoft.t500_split.R;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p067f.AbstractC0770a;
import p071g0.C0891d;

/* renamed from: l.r */
/* loaded from: classes.dex */
public final class C1137r extends CheckedTextView {

    /* renamed from: f */
    public final C0891d f5246f;

    /* renamed from: g */
    public final C1133p f5247g;

    /* renamed from: h */
    public final C1090V f5248h;

    /* renamed from: i */
    public C1147w f5249i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004d, B:5:0x0054, B:8:0x005a, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1137r(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        AbstractC1076N0.m2694a(context);
        AbstractC1074M0.m2690a(this, getContext());
        C1090V c1090v = new C1090V(this);
        this.f5248h = c1090v;
        c1090v.m2713f(attributeSet, R.attr.checkedTextViewStyle);
        c1090v.m2710b();
        C1133p c1133p = new C1133p(this);
        this.f5247g = c1133p;
        c1133p.m2747d(attributeSet, R.attr.checkedTextViewStyle);
        this.f5246f = new C0891d(this);
        Context context2 = getContext();
        int[] iArr = AbstractC0770a.f3905l;
        C0198k m591r = C0198k.m591r(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        AbstractC0169Q.m504i(this, getContext(), iArr, attributeSet, (TypedArray) m591r.f534c, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(AbstractC0088l.m257D(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(m591r.m597g(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(AbstractC1118h0.m2730b(typedArray.getInt(3, -1), null));
                }
                m591r.m609t();
                getEmojiTextViewHelper().m2772a(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(AbstractC0088l.m257D(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            m591r.m609t();
            getEmojiTextViewHelper().m2772a(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            m591r.m609t();
            throw th;
        }
    }

    private C1147w getEmojiTextViewHelper() {
        if (this.f5249i == null) {
            this.f5249i = new C1147w(this);
        }
        return this.f5249i;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1090V c1090v = this.f5248h;
        if (c1090v != null) {
            c1090v.m2710b();
        }
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C0891d c0891d = this.f5246f;
        if (c0891d != null) {
            c0891d.m2462b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0891d c0891d = this.f5246f;
        if (c0891d != null) {
            return (ColorStateList) c0891d.f4472e;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0891d c0891d = this.f5246f;
        if (c0891d != null) {
            return (PorterDuff.Mode) c0891d.f4473f;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5248h.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5248h.m2712e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0088l.m265Z(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().m2773b(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0891d c0891d = this.f5246f;
        if (c0891d != null) {
            if (c0891d.f4470c) {
                c0891d.f4470c = false;
            } else {
                c0891d.f4470c = true;
                c0891d.m2462b();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5248h;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5248h;
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

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5247g;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0891d c0891d = this.f5246f;
        if (c0891d != null) {
            c0891d.f4472e = colorStateList;
            c0891d.f4468a = true;
            c0891d.m2462b();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0891d c0891d = this.f5246f;
        if (c0891d != null) {
            c0891d.f4473f = mode;
            c0891d.f4469b = true;
            c0891d.m2462b();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f5248h;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f5248h;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1090V c1090v = this.f5248h;
        if (c1090v != null) {
            c1090v.m2714g(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0088l.m257D(getContext(), i));
    }
}
