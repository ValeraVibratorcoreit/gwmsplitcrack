package p082l;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0184d;
import p022K.C0188f;
import p022K.InterfaceC0182c;
import p022K.InterfaceC0214s;
import p031P.C0264b;
import p031P.C0265c;
import p033Q.C0282p;

/* renamed from: l.v */
/* loaded from: classes.dex */
public class C1145v extends EditText implements InterfaceC0214s {

    /* renamed from: f */
    public final C1133p f5277f;

    /* renamed from: g */
    public final C1090V f5278g;

    /* renamed from: h */
    public final C0282p f5279h;

    /* renamed from: i */
    public final C1051B f5280i;

    /* renamed from: j */
    public C1143u f5281j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1145v(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1076N0.m2694a(context);
        AbstractC1074M0.m2690a(this, getContext());
        C1133p c1133p = new C1133p(this);
        this.f5277f = c1133p;
        c1133p.m2747d(attributeSet, R.attr.editTextStyle);
        C1090V c1090v = new C1090V(this);
        this.f5278g = c1090v;
        c1090v.m2713f(attributeSet, R.attr.editTextStyle);
        c1090v.m2710b();
        this.f5279h = new C0282p();
        C1051B c1051b = new C1051B(this);
        this.f5280i = c1051b;
        c1051b.mo2658e(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener m2657d = c1051b.m2657d(keyListener);
        if (m2657d == keyListener) {
            return;
        }
        super.setKeyListener(m2657d);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    private C1143u getSuperCaller() {
        if (this.f5281j == null) {
            this.f5281j = new C1143u(this);
        }
        return this.f5281j;
    }

    @Override // p022K.InterfaceC0214s
    /* renamed from: a */
    public final C0188f mo673a(C0188f c0188f) {
        return this.f5279h.m822a(this, c0188f);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1090V c1090v = this.f5278g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return super.getCustomSelectionActionModeCallback();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f5278g.m2711d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f5278g.m2712e();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return super.getTextClassifier();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] m499d;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f5278g.getClass();
        C1090V.m2708h(editorInfo, onCreateInputConnection, this);
        AbstractC0088l.m265Z(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && Build.VERSION.SDK_INT <= 30 && (m499d = AbstractC0169Q.m499d(this)) != null) {
            editorInfo.contentMimeTypes = m499d;
            onCreateInputConnection = new C0265c(onCreateInputConnection, new C0264b(this));
        }
        return this.f5280i.m2659f(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z2 = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && AbstractC0169Q.m499d(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z2 = AbstractC1057E.m2665a(dragEvent, this, activity);
            }
        }
        if (z2) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        InterfaceC0182c interfaceC0182c;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || AbstractC0169Q.m499d(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                interfaceC0182c = new C0639g(primaryClip, 1);
            } else {
                C0184d c0184d = new C0184d();
                c0184d.f499g = primaryClip;
                c0184d.f500h = 1;
                interfaceC0182c = c0184d;
            }
            interfaceC0182c.mo537s(i == 16908322 ? 0 : 1);
            AbstractC0169Q.m501f(this, interfaceC0182c.mo534f());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5278g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C1090V c1090v = this.f5278g;
        if (c1090v != null) {
            c1090v.m2710b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f5280i.m2660g(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f5280i.m2657d(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5277f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C1090V c1090v = this.f5278g;
        c1090v.m2715i(colorStateList);
        c1090v.m2710b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C1090V c1090v = this.f5278g;
        c1090v.m2716j(mode);
        c1090v.m2710b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C1090V c1090v = this.f5278g;
        if (c1090v != null) {
            c1090v.m2714g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        super.setTextClassifier(textClassifier);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }
}
