package p082l;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import p010D1.AbstractC0088l;
import p022K.C0198k;
import p067f.AbstractC0770a;
import p076j.C0954c;
import p079k.ViewTreeObserverOnGlobalLayoutListenerC1009d;

/* renamed from: l.P */
/* loaded from: classes.dex */
public final class C1079P extends Spinner {

    /* renamed from: n */
    public static final int[] f5087n = {R.attr.spinnerMode};

    /* renamed from: f */
    public final C1133p f5088f;

    /* renamed from: g */
    public final Context f5089g;

    /* renamed from: h */
    public final C1063H f5090h;

    /* renamed from: i */
    public SpinnerAdapter f5091i;

    /* renamed from: j */
    public final boolean f5092j;

    /* renamed from: k */
    public final InterfaceC1077O f5093k;

    /* renamed from: l */
    public int f5094l;

    /* renamed from: m */
    public final Rect f5095m;

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        if (r7 == null) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1079P(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.altaysoft.t500_split.R.attr.spinnerStyle);
        TypedArray typedArray;
        this.f5095m = new Rect();
        AbstractC1074M0.m2690a(this, getContext());
        int[] iArr = AbstractC0770a.f3914u;
        C0198k m591r = C0198k.m591r(context, attributeSet, iArr, com.altaysoft.t500_split.R.attr.spinnerStyle);
        this.f5088f = new C1133p(this);
        TypedArray typedArray2 = (TypedArray) m591r.f534c;
        int resourceId = typedArray2.getResourceId(4, 0);
        if (resourceId != 0) {
            this.f5089g = new C0954c(context, resourceId);
        } else {
            this.f5089g = context;
        }
        int i = -1;
        TypedArray typedArray3 = null;
        try {
            typedArray = context.obtainStyledAttributes(attributeSet, f5087n, com.altaysoft.t500_split.R.attr.spinnerStyle, 0);
            try {
                try {
                    if (typedArray.hasValue(0)) {
                        i = typedArray.getInt(0, 0);
                    }
                } catch (Exception e2) {
                    e = e2;
                    Log.i("AppCompatSpinner", "Could not read android:spinnerMode", e);
                }
            } catch (Throwable th) {
                th = th;
                typedArray3 = typedArray;
                if (typedArray3 != null) {
                    typedArray3.recycle();
                }
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            typedArray = null;
        } catch (Throwable th2) {
            th = th2;
            if (typedArray3 != null) {
            }
            throw th;
        }
        typedArray.recycle();
        if (i == 0) {
            DialogInterfaceOnClickListenerC1067J dialogInterfaceOnClickListenerC1067J = new DialogInterfaceOnClickListenerC1067J(this);
            this.f5093k = dialogInterfaceOnClickListenerC1067J;
            dialogInterfaceOnClickListenerC1067J.f5055h = typedArray2.getString(2);
        } else if (i == 1) {
            C1073M c1073m = new C1073M(this, this.f5089g, attributeSet);
            C0198k m591r2 = C0198k.m591r(this.f5089g, attributeSet, iArr, com.altaysoft.t500_split.R.attr.spinnerStyle);
            this.f5094l = ((TypedArray) m591r2.f534c).getLayoutDimension(3, -2);
            c1073m.m2649l(m591r2.m598h(1));
            c1073m.f5069H = typedArray2.getString(2);
            m591r2.m609t();
            this.f5093k = c1073m;
            this.f5090h = new C1063H(this, this, c1073m);
        }
        CharSequence[] textArray = typedArray2.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter.setDropDownViewResource(com.altaysoft.t500_split.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter);
        }
        m591r.m609t();
        this.f5092j = true;
        SpinnerAdapter spinnerAdapter = this.f5091i;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.f5091i = null;
        }
        this.f5088f.m2747d(attributeSet, com.altaysoft.t500_split.R.attr.spinnerStyle);
    }

    /* renamed from: a */
    public final int m2695a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.f5095m;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        return interfaceC1077O != null ? interfaceC1077O.mo2679d() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        return interfaceC1077O != null ? interfaceC1077O.mo2681g() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.f5093k != null ? this.f5094l : super.getDropDownWidth();
    }

    public final InterfaceC1077O getInternalPopup() {
        return this.f5093k;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        return interfaceC1077O != null ? interfaceC1077O.mo2682h() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.f5089g;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        return interfaceC1077O != null ? interfaceC1077O.mo2683i() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O == null || !interfaceC1077O.mo2678b()) {
            return;
        }
        interfaceC1077O.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f5093k == null || View.MeasureSpec.getMode(i) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), m2695a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        C1075N c1075n = (C1075N) parcelable;
        super.onRestoreInstanceState(c1075n.getSuperState());
        if (!c1075n.f5081a || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC1009d(2, this));
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        C1075N c1075n = new C1075N(super.onSaveInstanceState());
        InterfaceC1077O interfaceC1077O = this.f5093k;
        c1075n.f5081a = interfaceC1077O != null && interfaceC1077O.mo2678b();
        return c1075n;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1063H c1063h = this.f5090h;
        if (c1063h == null || !c1063h.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O == null) {
            return super.performClick();
        }
        if (interfaceC1077O.mo2678b()) {
            return true;
        }
        this.f5093k.mo2680e(getTextDirection(), getTextAlignment());
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i) {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O == null) {
            super.setDropDownHorizontalOffset(i);
        } else {
            interfaceC1077O.mo2687o(i);
            interfaceC1077O.mo2677a(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i) {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O != null) {
            interfaceC1077O.mo2686m(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i) {
        if (this.f5093k != null) {
            this.f5094l = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O != null) {
            interfaceC1077O.mo2685l(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(AbstractC0088l.m257D(getPopupContext(), i));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O != null) {
            interfaceC1077O.mo2684k(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f5088f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f5092j) {
            this.f5091i = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        InterfaceC1077O interfaceC1077O = this.f5093k;
        if (interfaceC1077O != null) {
            Context context = this.f5089g;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            C1069K c1069k = new C1069K();
            c1069k.f5065a = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                c1069k.f5066b = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                AbstractC1065I.m2676a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
            interfaceC1077O.mo2651n(c1069k);
        }
    }
}
