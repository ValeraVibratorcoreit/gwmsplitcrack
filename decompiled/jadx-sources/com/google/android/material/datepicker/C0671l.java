package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p009D0.C0076b;
import p010D1.AbstractC0088l;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0223w0;
import p022K.C0225x0;
import p028N0.ViewOnTouchListenerC0258a;
import p045W0.C0355e;
import p045W0.C0357g;
import p046X.DialogInterfaceOnCancelListenerC0417p;
import p054a1.ViewOnClickListenerC0492a;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: com.google.android.material.datepicker.l */
/* loaded from: classes.dex */
public final class C0671l<S> extends DialogInterfaceOnCancelListenerC0417p {

    /* renamed from: A0 */
    public CharSequence f3509A0;

    /* renamed from: B0 */
    public int f3510B0;

    /* renamed from: C0 */
    public CharSequence f3511C0;

    /* renamed from: D0 */
    public int f3512D0;

    /* renamed from: E0 */
    public CharSequence f3513E0;

    /* renamed from: F0 */
    public TextView f3514F0;

    /* renamed from: G0 */
    public CheckableImageButton f3515G0;

    /* renamed from: H0 */
    public C0357g f3516H0;

    /* renamed from: I0 */
    public boolean f3517I0;

    /* renamed from: J0 */
    public CharSequence f3518J0;

    /* renamed from: K0 */
    public CharSequence f3519K0;

    /* renamed from: n0 */
    public final LinkedHashSet f3520n0;

    /* renamed from: o0 */
    public final LinkedHashSet f3521o0;

    /* renamed from: p0 */
    public int f3522p0;

    /* renamed from: q0 */
    public AbstractC0678s f3523q0;

    /* renamed from: r0 */
    public C0661b f3524r0;

    /* renamed from: s0 */
    public C0670k f3525s0;

    /* renamed from: t0 */
    public int f3526t0;

    /* renamed from: u0 */
    public CharSequence f3527u0;

    /* renamed from: v0 */
    public boolean f3528v0;

    /* renamed from: w0 */
    public int f3529w0;

    /* renamed from: x0 */
    public int f3530x0;

    /* renamed from: y0 */
    public CharSequence f3531y0;

    /* renamed from: z0 */
    public int f3532z0;

    public C0671l() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.f3520n0 = new LinkedHashSet();
        this.f3521o0 = new LinkedHashSet();
    }

    /* renamed from: Q */
    public static int m2079Q(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar m2094b = AbstractC0681v.m2094b();
        m2094b.set(5, 1);
        Calendar m2093a = AbstractC0681v.m2093a(m2094b);
        m2093a.get(2);
        m2093a.get(1);
        int maximum = m2093a.getMaximum(7);
        m2093a.getActualMaximum(5);
        m2093a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    /* renamed from: R */
    public static boolean m2080R(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC1687o.m4924S(context, R.attr.materialCalendarStyle, C0670k.class.getCanonicalName()).data, new int[]{i});
        boolean z2 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z2;
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, p046X.AbstractComponentCallbacksC0423v
    /* renamed from: E */
    public final void mo1105E(Bundle bundle) {
        super.mo1105E(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f3522p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        C0661b c0661b = this.f3524r0;
        C0660a c0660a = new C0660a();
        int i = C0660a.f3472b;
        int i2 = C0660a.f3472b;
        long j2 = c0661b.f3474a.f3540f;
        long j3 = c0661b.f3475b.f3540f;
        c0660a.f3473a = Long.valueOf(c0661b.f3477d.f3540f);
        C0670k c0670k = this.f3525s0;
        C0673n c0673n = c0670k == null ? null : c0670k.f3500c0;
        if (c0673n != null) {
            c0660a.f3473a = Long.valueOf(c0673n.f3540f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", c0661b.f3476c);
        C0673n m2083b = C0673n.m2083b(j2);
        C0673n m2083b2 = C0673n.m2083b(j3);
        C0663d c0663d = (C0663d) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l2 = c0660a.f3473a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new C0661b(m2083b, m2083b2, c0663d, l2 == null ? null : C0673n.m2083b(l2.longValue()), c0661b.f3478e));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f3526t0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f3527u0);
        bundle.putInt("INPUT_MODE_KEY", this.f3529w0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f3530x0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f3531y0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3532z0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3509A0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f3510B0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f3511C0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f3512D0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f3513E0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, p046X.AbstractComponentCallbacksC0423v
    /* renamed from: F */
    public final void mo1106F() {
        C0223w0 c0223w0;
        C0223w0 c0223w02;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        super.mo1106F();
        Dialog dialog = this.f1313i0;
        if (dialog == null) {
            throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
        }
        Window window = dialog.getWindow();
        if (this.f3528v0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f3516H0);
            if (!this.f3517I0) {
                View findViewById = m1120L().findViewById(R.id.fullscreen_header);
                ColorStateList m256C = AbstractC0088l.m256C(findViewById.getBackground());
                Integer valueOf = m256C != null ? Integer.valueOf(m256C.getDefaultColor()) : null;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int m4947r = AbstractC1687o.m4947r(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(m4947r);
                }
                AbstractC1680h.m4855Q(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                boolean z3 = AbstractC1687o.m4952y(0) || AbstractC1687o.m4952y(valueOf.intValue());
                C0355e c0355e = new C0355e(window.getDecorView(), 5);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController2 = window.getInsetsController();
                    C0225x0 c0225x0 = new C0225x0(insetsController2, c0355e);
                    c0225x0.f577d = window;
                    c0223w0 = c0225x0;
                } else {
                    c0223w0 = new C0223w0(window, c0355e);
                }
                c0223w0.mo312l0(z3);
                boolean z4 = AbstractC1687o.m4952y(0) || AbstractC1687o.m4952y(m4947r);
                C0355e c0355e2 = new C0355e(window.getDecorView(), 5);
                if (Build.VERSION.SDK_INT >= 30) {
                    insetsController = window.getInsetsController();
                    C0225x0 c0225x02 = new C0225x0(insetsController, c0355e2);
                    c0225x02.f577d = window;
                    c0223w02 = c0225x02;
                } else {
                    c0223w02 = new C0223w0(window, c0355e2);
                }
                c0223w02.mo310k0(z4);
                C0076b c0076b = new C0076b(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                AbstractC0158F.m440u(findViewById, c0076b);
                this.f3517I0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = m1129l().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f3516H0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            View decorView = window.getDecorView();
            Dialog dialog2 = this.f1313i0;
            if (dialog2 == null) {
                throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
            }
            decorView.setOnTouchListener(new ViewOnTouchListenerC0258a(dialog2, rect));
        }
        m1119K();
        int i = this.f3522p0;
        if (i == 0) {
            m2081P();
            throw null;
        }
        m2081P();
        C0661b c0661b = this.f3524r0;
        C0670k c0670k = new C0670k();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0661b);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", c0661b.f3477d);
        c0670k.m1122N(bundle);
        this.f3525s0 = c0670k;
        AbstractC0678s abstractC0678s = c0670k;
        if (this.f3529w0 == 1) {
            m2081P();
            C0661b c0661b2 = this.f3524r0;
            AbstractC0678s c0672m = new C0672m();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", c0661b2);
            c0672m.m1122N(bundle2);
            abstractC0678s = c0672m;
        }
        this.f3523q0 = abstractC0678s;
        this.f3514F0.setText((this.f3529w0 == 1 && m1129l().getConfiguration().orientation == 2) ? this.f3519K0 : this.f3518J0);
        m2081P();
        throw null;
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, p046X.AbstractComponentCallbacksC0423v
    /* renamed from: G */
    public final void mo1107G() {
        this.f3523q0.f3554Z.clear();
        super.mo1107G();
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p
    /* renamed from: O */
    public final Dialog mo1110O() {
        Context m1119K = m1119K();
        m1119K();
        int i = this.f3522p0;
        if (i == 0) {
            m2081P();
            throw null;
        }
        Dialog dialog = new Dialog(m1119K, i);
        Context context = dialog.getContext();
        this.f3528v0 = m2080R(context, android.R.attr.windowFullscreen);
        this.f3516H0 = new C0357g(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC0051a.f178m, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.f3516H0.m956i(context);
        this.f3516H0.m958k(ColorStateList.valueOf(color));
        C0357g c0357g = this.f3516H0;
        View decorView = dialog.getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        c0357g.m957j(AbstractC0158F.m428i(decorView));
        return dialog;
    }

    /* renamed from: P */
    public final void m2081P() {
        if (this.f1362k.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f3520n0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f3521o0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.f1342J;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // p046X.DialogInterfaceOnCancelListenerC0417p, p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public final void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        if (bundle == null) {
            bundle = this.f1362k;
        }
        this.f3522p0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3524r0 = (C0661b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        if (bundle.getParcelable("DAY_VIEW_DECORATOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3526t0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f3527u0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f3529w0 = bundle.getInt("INPUT_MODE_KEY");
        this.f3530x0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3531y0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f3532z0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3509A0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.f3510B0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f3511C0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.f3512D0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.f3513E0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.f3527u0;
        if (charSequence == null) {
            charSequence = m1119K().getResources().getText(this.f3526t0);
        }
        this.f3518J0 = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f3519K0 = charSequence;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: x */
    public final View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(this.f3528v0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.f3528v0) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m2079Q(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m2079Q(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        textView.setAccessibilityLiveRegion(1);
        this.f3515G0 = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.f3514F0 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.f3515G0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.f3515G0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AbstractC0088l.m257D(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AbstractC0088l.m257D(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.f3515G0.setChecked(this.f3529w0 != 0);
        AbstractC0169Q.m505j(this.f3515G0, null);
        CheckableImageButton checkableImageButton2 = this.f3515G0;
        this.f3515G0.setContentDescription(this.f3529w0 == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.f3515G0.setOnClickListener(new ViewOnClickListenerC0492a(4, this));
        m2081P();
        throw null;
    }
}
