package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.internal.CheckableImageButton;
import com.sun.jna.Function;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import p000A.AbstractC0001b;
import p001A0.C0009c;
import p001A0.RunnableC0020n;
import p001A0.RunnableC0024r;
import p004B0.AbstractC0051a;
import p006C.AbstractC0055c;
import p007C0.AbstractC0067a;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p017H0.C0124c;
import p017H0.C0125d;
import p018I.AbstractC0136g;
import p018I.C0131b;
import p022K.AbstractC0161I;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p034Q0.AbstractC0286c;
import p034Q0.AbstractC0294k;
import p034Q0.C0285b;
import p039T0.C0332a;
import p039T0.C0335d;
import p045W0.C0351a;
import p045W0.C0355e;
import p045W0.C0356f;
import p045W0.C0357g;
import p045W0.C0359i;
import p045W0.C0360j;
import p045W0.C0361k;
import p045W0.InterfaceC0353c;
import p054a1.C0491B;
import p054a1.C0498g;
import p054a1.C0499h;
import p054a1.C0502k;
import p054a1.C0504m;
import p054a1.C0506o;
import p054a1.C0509r;
import p054a1.C0510s;
import p054a1.C0513v;
import p054a1.C0515x;
import p054a1.C0516y;
import p054a1.C0517z;
import p054a1.InterfaceC0490A;
import p060c1.AbstractC0577a;
import p077j0.AbstractC0986q;
import p077j0.C0977h;
import p082l.AbstractC1118h0;
import p082l.C1096Y;
import p082l.C1141t;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: H0 */
    public static final int[][] f3645H0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A */
    public int f3646A;

    /* renamed from: A0 */
    public final C0285b f3647A0;

    /* renamed from: B */
    public C0977h f3648B;

    /* renamed from: B0 */
    public boolean f3649B0;

    /* renamed from: C */
    public C0977h f3650C;

    /* renamed from: C0 */
    public boolean f3651C0;

    /* renamed from: D */
    public ColorStateList f3652D;

    /* renamed from: D0 */
    public ValueAnimator f3653D0;

    /* renamed from: E */
    public ColorStateList f3654E;

    /* renamed from: E0 */
    public boolean f3655E0;

    /* renamed from: F */
    public ColorStateList f3656F;

    /* renamed from: F0 */
    public boolean f3657F0;

    /* renamed from: G */
    public ColorStateList f3658G;

    /* renamed from: G0 */
    public boolean f3659G0;

    /* renamed from: H */
    public boolean f3660H;

    /* renamed from: I */
    public CharSequence f3661I;

    /* renamed from: J */
    public boolean f3662J;

    /* renamed from: K */
    public C0357g f3663K;

    /* renamed from: L */
    public C0357g f3664L;

    /* renamed from: M */
    public StateListDrawable f3665M;

    /* renamed from: N */
    public boolean f3666N;

    /* renamed from: O */
    public C0357g f3667O;

    /* renamed from: P */
    public C0357g f3668P;

    /* renamed from: Q */
    public C0361k f3669Q;

    /* renamed from: R */
    public boolean f3670R;

    /* renamed from: S */
    public final int f3671S;

    /* renamed from: T */
    public int f3672T;

    /* renamed from: U */
    public int f3673U;

    /* renamed from: V */
    public int f3674V;

    /* renamed from: W */
    public int f3675W;

    /* renamed from: a0 */
    public int f3676a0;

    /* renamed from: b0 */
    public int f3677b0;

    /* renamed from: c0 */
    public int f3678c0;

    /* renamed from: d0 */
    public final Rect f3679d0;

    /* renamed from: e0 */
    public final Rect f3680e0;

    /* renamed from: f */
    public final FrameLayout f3681f;

    /* renamed from: f0 */
    public final RectF f3682f0;

    /* renamed from: g */
    public final C0515x f3683g;

    /* renamed from: g0 */
    public Typeface f3684g0;

    /* renamed from: h */
    public final C0506o f3685h;

    /* renamed from: h0 */
    public ColorDrawable f3686h0;

    /* renamed from: i */
    public EditText f3687i;

    /* renamed from: i0 */
    public int f3688i0;

    /* renamed from: j */
    public CharSequence f3689j;

    /* renamed from: j0 */
    public final LinkedHashSet f3690j0;

    /* renamed from: k */
    public int f3691k;

    /* renamed from: k0 */
    public ColorDrawable f3692k0;

    /* renamed from: l */
    public int f3693l;

    /* renamed from: l0 */
    public int f3694l0;

    /* renamed from: m */
    public int f3695m;

    /* renamed from: m0 */
    public Drawable f3696m0;

    /* renamed from: n */
    public int f3697n;

    /* renamed from: n0 */
    public ColorStateList f3698n0;

    /* renamed from: o */
    public final C0510s f3699o;

    /* renamed from: o0 */
    public ColorStateList f3700o0;

    /* renamed from: p */
    public boolean f3701p;

    /* renamed from: p0 */
    public int f3702p0;

    /* renamed from: q */
    public int f3703q;

    /* renamed from: q0 */
    public int f3704q0;

    /* renamed from: r */
    public boolean f3705r;

    /* renamed from: r0 */
    public int f3706r0;

    /* renamed from: s */
    public InterfaceC0490A f3707s;

    /* renamed from: s0 */
    public ColorStateList f3708s0;

    /* renamed from: t */
    public C1096Y f3709t;

    /* renamed from: t0 */
    public int f3710t0;

    /* renamed from: u */
    public int f3711u;

    /* renamed from: u0 */
    public int f3712u0;

    /* renamed from: v */
    public int f3713v;

    /* renamed from: v0 */
    public int f3714v0;

    /* renamed from: w */
    public CharSequence f3715w;

    /* renamed from: w0 */
    public int f3716w0;

    /* renamed from: x */
    public boolean f3717x;

    /* renamed from: x0 */
    public int f3718x0;

    /* renamed from: y */
    public C1096Y f3719y;

    /* renamed from: y0 */
    public int f3720y0;

    /* renamed from: z */
    public ColorStateList f3721z;

    /* renamed from: z0 */
    public boolean f3722z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, com.altaysoft.t500_split.R.attr.textInputStyle, com.altaysoft.t500_split.R.style.Widget_Design_TextInputLayout), attributeSet, com.altaysoft.t500_split.R.attr.textInputStyle);
        this.f3691k = -1;
        this.f3693l = -1;
        this.f3695m = -1;
        this.f3697n = -1;
        this.f3699o = new C0510s(this);
        this.f3707s = new C0009c(4);
        this.f3679d0 = new Rect();
        this.f3680e0 = new Rect();
        this.f3682f0 = new RectF();
        this.f3690j0 = new LinkedHashSet();
        C0285b c0285b = new C0285b(this);
        this.f3647A0 = c0285b;
        this.f3659G0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f3681f = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0067a.f224a;
        c0285b.f755Q = linearInterpolator;
        c0285b.m830h(false);
        c0285b.f754P = linearInterpolator;
        c0285b.m830h(false);
        if (c0285b.f777g != 8388659) {
            c0285b.f777g = 8388659;
            c0285b.m830h(false);
        }
        int[] iArr = AbstractC0051a.f164C;
        AbstractC0294k.m840a(context2, attributeSet, com.altaysoft.t500_split.R.attr.textInputStyle, com.altaysoft.t500_split.R.style.Widget_Design_TextInputLayout);
        AbstractC0294k.m841b(context2, attributeSet, iArr, com.altaysoft.t500_split.R.attr.textInputStyle, com.altaysoft.t500_split.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.altaysoft.t500_split.R.attr.textInputStyle, com.altaysoft.t500_split.R.style.Widget_Design_TextInputLayout);
        C0198k c0198k = new C0198k(context2, obtainStyledAttributes);
        C0515x c0515x = new C0515x(this, c0198k);
        this.f3683g = c0515x;
        this.f3660H = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f3651C0 = obtainStyledAttributes.getBoolean(47, true);
        this.f3649B0 = obtainStyledAttributes.getBoolean(42, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.f3669Q = C0361k.m965b(context2, attributeSet, com.altaysoft.t500_split.R.attr.textInputStyle, com.altaysoft.t500_split.R.style.Widget_Design_TextInputLayout).m963a();
        this.f3671S = context2.getResources().getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f3673U = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f3675W = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f3676a0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f3674V = this.f3675W;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        C0360j m968e = this.f3669Q.m968e();
        if (dimension >= 0.0f) {
            m968e.f1052e = new C0351a(dimension);
        }
        if (dimension2 >= 0.0f) {
            m968e.f1053f = new C0351a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            m968e.f1054g = new C0351a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            m968e.f1055h = new C0351a(dimension4);
        }
        this.f3669Q = m968e.m963a();
        ColorStateList m254A = AbstractC0088l.m254A(context2, c0198k, 7);
        if (m254A != null) {
            int defaultColor = m254A.getDefaultColor();
            this.f3710t0 = defaultColor;
            this.f3678c0 = defaultColor;
            if (m254A.isStateful()) {
                this.f3712u0 = m254A.getColorForState(new int[]{-16842910}, -1);
                this.f3714v0 = m254A.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f3716w0 = m254A.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f3714v0 = this.f3710t0;
                ColorStateList m4959b = AbstractC1695c.m4959b(context2, com.altaysoft.t500_split.R.color.mtrl_filled_background_color);
                this.f3712u0 = m4959b.getColorForState(new int[]{-16842910}, -1);
                this.f3716w0 = m4959b.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f3678c0 = 0;
            this.f3710t0 = 0;
            this.f3712u0 = 0;
            this.f3714v0 = 0;
            this.f3716w0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList m597g = c0198k.m597g(1);
            this.f3700o0 = m597g;
            this.f3698n0 = m597g;
        }
        ColorStateList m254A2 = AbstractC0088l.m254A(context2, c0198k, 14);
        this.f3706r0 = obtainStyledAttributes.getColor(14, 0);
        this.f3702p0 = AbstractC0001b.m3a(context2, com.altaysoft.t500_split.R.color.mtrl_textinput_default_box_stroke_color);
        this.f3718x0 = AbstractC0001b.m3a(context2, com.altaysoft.t500_split.R.color.mtrl_textinput_disabled_color);
        this.f3704q0 = AbstractC0001b.m3a(context2, com.altaysoft.t500_split.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (m254A2 != null) {
            setBoxStrokeColorStateList(m254A2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0088l.m254A(context2, c0198k, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f3656F = c0198k.m597g(24);
        this.f3658G = c0198k.m597g(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z2 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z3 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z4 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.f3713v = obtainStyledAttributes.getResourceId(22, 0);
        this.f3711u = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f3711u);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f3713v);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(c0198k.m597g(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(c0198k.m597g(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(c0198k.m597g(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(c0198k.m597g(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(c0198k.m597g(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(c0198k.m597g(58));
        }
        C0506o c0506o = new C0506o(this, c0198k);
        this.f3685h = c0506o;
        boolean z5 = obtainStyledAttributes.getBoolean(0, true);
        c0198k.m609t();
        setImportantForAccessibility(2);
        AbstractC0161I.m468m(this, 1);
        frameLayout.addView(c0515x);
        frameLayout.addView(c0506o);
        addView(frameLayout);
        setEnabled(z5);
        setHelperTextEnabled(z3);
        setErrorEnabled(z2);
        setCounterEnabled(z4);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f3687i;
        if (!(editText instanceof AutoCompleteTextView) || AbstractC1687o.m4953z(editText)) {
            return this.f3663K;
        }
        int m4948s = AbstractC1687o.m4948s(this.f3687i, com.altaysoft.t500_split.R.attr.colorControlHighlight);
        int i = this.f3672T;
        int[][] iArr = f3645H0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            C0357g c0357g = this.f3663K;
            int i2 = this.f3678c0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC1687o.m4909B(0.1f, m4948s, i2), i2}), c0357g, c0357g);
        }
        Context context = getContext();
        C0357g c0357g2 = this.f3663K;
        TypedValue m4924S = AbstractC1687o.m4924S(context, com.altaysoft.t500_split.R.attr.colorSurface, "TextInputLayout");
        int i3 = m4924S.resourceId;
        int m3a = i3 != 0 ? AbstractC0001b.m3a(context, i3) : m4924S.data;
        C0357g c0357g3 = new C0357g(c0357g2.f1026f.f1008a);
        int m4909B = AbstractC1687o.m4909B(0.1f, m4948s, m3a);
        c0357g3.m958k(new ColorStateList(iArr, new int[]{m4909B, 0}));
        c0357g3.setTint(m3a);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{m4909B, m3a});
        C0357g c0357g4 = new C0357g(c0357g2.f1026f.f1008a);
        c0357g4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, c0357g3, c0357g4), c0357g2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f3665M == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f3665M = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f3665M.addState(new int[0], m2118f(false));
        }
        return this.f3665M;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f3664L == null) {
            this.f3664L = m2118f(true);
        }
        return this.f3664L;
    }

    /* renamed from: k */
    public static void m2112k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                m2112k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f3687i != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f3687i = editText;
        int i = this.f3691k;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f3695m);
        }
        int i2 = this.f3693l;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.f3697n);
        }
        this.f3666N = false;
        m2121i();
        setTextInputAccessibilityDelegate(new C0517z(this));
        Typeface typeface = this.f3687i.getTypeface();
        C0285b c0285b = this.f3647A0;
        c0285b.m835m(typeface);
        float textSize = this.f3687i.getTextSize();
        if (c0285b.f778h != textSize) {
            c0285b.f778h = textSize;
            c0285b.m830h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f3687i.getLetterSpacing();
        if (c0285b.f761W != letterSpacing) {
            c0285b.f761W = letterSpacing;
            c0285b.m830h(false);
        }
        int gravity = this.f3687i.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (c0285b.f777g != i4) {
            c0285b.f777g = i4;
            c0285b.m830h(false);
        }
        if (c0285b.f775f != gravity) {
            c0285b.f775f = gravity;
            c0285b.m830h(false);
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        this.f3720y0 = editText.getMinimumHeight();
        this.f3687i.addTextChangedListener(new C0516y(this, editText));
        if (this.f3698n0 == null) {
            this.f3698n0 = this.f3687i.getHintTextColors();
        }
        if (this.f3660H) {
            if (TextUtils.isEmpty(this.f3661I)) {
                CharSequence hint = this.f3687i.getHint();
                this.f3689j = hint;
                setHint(hint);
                this.f3687i.setHint((CharSequence) null);
            }
            this.f3662J = true;
        }
        if (i3 >= 29) {
            m2127p();
        }
        if (this.f3709t != null) {
            m2125n(this.f3687i.getText());
        }
        m2129r();
        this.f3699o.m1240b();
        this.f3683g.bringToFront();
        C0506o c0506o = this.f3685h;
        c0506o.bringToFront();
        Iterator it = this.f3690j0.iterator();
        while (it.hasNext()) {
            ((C0504m) it.next()).m1221a(this);
        }
        c0506o.m1234m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        m2132u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f3661I)) {
            return;
        }
        this.f3661I = charSequence;
        C0285b c0285b = this.f3647A0;
        if (charSequence == null || !TextUtils.equals(c0285b.f739A, charSequence)) {
            c0285b.f739A = charSequence;
            c0285b.f740B = null;
            Bitmap bitmap = c0285b.f743E;
            if (bitmap != null) {
                bitmap.recycle();
                c0285b.f743E = null;
            }
            c0285b.m830h(false);
        }
        if (this.f3722z0) {
            return;
        }
        m2122j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f3717x == z2) {
            return;
        }
        if (z2) {
            C1096Y c1096y = this.f3719y;
            if (c1096y != null) {
                this.f3681f.addView(c1096y);
                this.f3719y.setVisibility(0);
            }
        } else {
            C1096Y c1096y2 = this.f3719y;
            if (c1096y2 != null) {
                c1096y2.setVisibility(8);
            }
            this.f3719y = null;
        }
        this.f3717x = z2;
    }

    /* renamed from: a */
    public final void m2113a(float f2) {
        int i = 2;
        C0285b c0285b = this.f3647A0;
        if (c0285b.f767b == f2) {
            return;
        }
        if (this.f3653D0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f3653D0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC1680h.m4852N(getContext(), com.altaysoft.t500_split.R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f225b));
            this.f3653D0.setDuration(AbstractC1680h.m4851M(getContext(), com.altaysoft.t500_split.R.attr.motionDurationMedium4, 167));
            this.f3653D0.addUpdateListener(new C0124c(i, this));
        }
        this.f3653D0.setFloatValues(c0285b.f767b, f2);
        this.f3653D0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f3681f;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        m2131t();
        setEditText((EditText) view);
    }

    /* renamed from: b */
    public final void m2114b() {
        int i;
        int i2;
        C0357g c0357g = this.f3663K;
        if (c0357g == null) {
            return;
        }
        C0361k c0361k = c0357g.f1026f.f1008a;
        C0361k c0361k2 = this.f3669Q;
        if (c0361k != c0361k2) {
            c0357g.setShapeAppearanceModel(c0361k2);
        }
        if (this.f3672T == 2 && (i = this.f3674V) > -1 && (i2 = this.f3677b0) != 0) {
            C0357g c0357g2 = this.f3663K;
            c0357g2.f1026f.f1017j = i;
            c0357g2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            C0356f c0356f = c0357g2.f1026f;
            if (c0356f.f1011d != valueOf) {
                c0356f.f1011d = valueOf;
                c0357g2.onStateChange(c0357g2.getState());
            }
        }
        int i3 = this.f3678c0;
        if (this.f3672T == 1) {
            i3 = AbstractC0055c.m105b(this.f3678c0, AbstractC1687o.m4947r(getContext(), com.altaysoft.t500_split.R.attr.colorSurface, 0));
        }
        this.f3678c0 = i3;
        this.f3663K.m958k(ColorStateList.valueOf(i3));
        C0357g c0357g3 = this.f3667O;
        if (c0357g3 != null && this.f3668P != null) {
            if (this.f3674V > -1 && this.f3677b0 != 0) {
                c0357g3.m958k(this.f3687i.isFocused() ? ColorStateList.valueOf(this.f3702p0) : ColorStateList.valueOf(this.f3677b0));
                this.f3668P.m958k(ColorStateList.valueOf(this.f3677b0));
            }
            invalidate();
        }
        m2130s();
    }

    /* renamed from: c */
    public final int m2115c() {
        float m827d;
        if (!this.f3660H) {
            return 0;
        }
        int i = this.f3672T;
        C0285b c0285b = this.f3647A0;
        if (i == 0) {
            m827d = c0285b.m827d();
        } else {
            if (i != 2) {
                return 0;
            }
            m827d = c0285b.m827d() / 2.0f;
        }
        return (int) m827d;
    }

    /* renamed from: d */
    public final C0977h m2116d() {
        C0977h c0977h = new C0977h();
        c0977h.f4696c = AbstractC1680h.m4851M(getContext(), com.altaysoft.t500_split.R.attr.motionDurationShort2, 87);
        c0977h.f4697d = AbstractC1680h.m4852N(getContext(), com.altaysoft.t500_split.R.attr.motionEasingLinearInterpolator, AbstractC0067a.f224a);
        return c0977h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f3687i;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f3689j != null) {
            boolean z2 = this.f3662J;
            this.f3662J = false;
            CharSequence hint = editText.getHint();
            this.f3687i.setHint(this.f3689j);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f3687i.setHint(hint);
                this.f3662J = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f3681f;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f3687i) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f3657F0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f3657F0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        C0357g c0357g;
        int i;
        super.draw(canvas);
        boolean z2 = this.f3660H;
        C0285b c0285b = this.f3647A0;
        if (z2) {
            c0285b.getClass();
            int save = canvas.save();
            if (c0285b.f740B != null) {
                RectF rectF = c0285b.f773e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c0285b.f752N;
                    textPaint.setTextSize(c0285b.f745G);
                    float f2 = c0285b.f786p;
                    float f3 = c0285b.f787q;
                    float f4 = c0285b.f744F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (c0285b.f772d0 <= 1 || c0285b.f741C) {
                        canvas.translate(f2, f3);
                        c0285b.f763Y.draw(canvas);
                    } else {
                        float lineStart = c0285b.f786p - c0285b.f763Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (c0285b.f768b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = c0285b.f746H;
                            float f7 = c0285b.f747I;
                            float f8 = c0285b.f748J;
                            int i3 = c0285b.f749K;
                            textPaint.setShadowLayer(f6, f7, f8, AbstractC0055c.m107d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / Function.USE_VARARGS));
                        }
                        c0285b.f763Y.draw(canvas);
                        textPaint.setAlpha((int) (c0285b.f766a0 * f5));
                        if (i2 >= 31) {
                            float f9 = c0285b.f746H;
                            float f10 = c0285b.f747I;
                            float f11 = c0285b.f748J;
                            int i4 = c0285b.f749K;
                            textPaint.setShadowLayer(f9, f10, f11, AbstractC0055c.m107d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / Function.USE_VARARGS));
                        }
                        int lineBaseline = c0285b.f763Y.getLineBaseline(0);
                        CharSequence charSequence = c0285b.f770c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), 0.0f, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(c0285b.f746H, c0285b.f747I, c0285b.f748J, c0285b.f749K);
                        }
                        String trim = c0285b.f770c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(c0285b.f763Y.getLineEnd(i), str.length()), 0.0f, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f3668P == null || (c0357g = this.f3667O) == null) {
            return;
        }
        c0357g.draw(canvas);
        if (this.f3687i.isFocused()) {
            Rect bounds = this.f3668P.getBounds();
            Rect bounds2 = this.f3667O.getBounds();
            float f13 = c0285b.f767b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0067a.m195c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0067a.m195c(centerX, bounds2.right, f13);
            this.f3668P.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.f3655E0) {
            return;
        }
        this.f3655E0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C0285b c0285b = this.f3647A0;
        if (c0285b != null) {
            c0285b.f750L = drawableState;
            ColorStateList colorStateList2 = c0285b.f781k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c0285b.f780j) != null && colorStateList.isStateful())) {
                c0285b.m830h(false);
                z2 = true;
                if (this.f3687i != null) {
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    m2132u(isLaidOut() && isEnabled(), false);
                }
                m2129r();
                m2135x();
                if (z2) {
                    invalidate();
                }
                this.f3655E0 = false;
            }
        }
        z2 = false;
        if (this.f3687i != null) {
        }
        m2129r();
        m2135x();
        if (z2) {
        }
        this.f3655E0 = false;
    }

    /* renamed from: e */
    public final boolean m2117e() {
        return this.f3660H && !TextUtils.isEmpty(this.f3661I) && (this.f3663K instanceof C0499h);
    }

    /* renamed from: f */
    public final C0357g m2118f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f3687i;
        float popupElevation = editText instanceof C0513v ? ((C0513v) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        C0359i c0359i = new C0359i();
        C0359i c0359i2 = new C0359i();
        C0359i c0359i3 = new C0359i();
        C0359i c0359i4 = new C0359i();
        C0355e c0355e = new C0355e(i);
        C0355e c0355e2 = new C0355e(i);
        C0355e c0355e3 = new C0355e(i);
        C0355e c0355e4 = new C0355e(i);
        C0351a c0351a = new C0351a(f2);
        C0351a c0351a2 = new C0351a(f2);
        C0351a c0351a3 = new C0351a(dimensionPixelOffset);
        C0351a c0351a4 = new C0351a(dimensionPixelOffset);
        C0361k c0361k = new C0361k();
        c0361k.f1060a = c0359i;
        c0361k.f1061b = c0359i2;
        c0361k.f1062c = c0359i3;
        c0361k.f1063d = c0359i4;
        c0361k.f1064e = c0351a;
        c0361k.f1065f = c0351a2;
        c0361k.f1066g = c0351a4;
        c0361k.f1067h = c0351a3;
        c0361k.f1068i = c0355e;
        c0361k.f1069j = c0355e2;
        c0361k.f1070k = c0355e3;
        c0361k.f1071l = c0355e4;
        EditText editText2 = this.f3687i;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof C0513v ? ((C0513v) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = C0357g.f1024B;
            TypedValue m4924S = AbstractC1687o.m4924S(context, com.altaysoft.t500_split.R.attr.colorSurface, C0357g.class.getSimpleName());
            int i2 = m4924S.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? AbstractC0001b.m3a(context, i2) : m4924S.data);
        }
        C0357g c0357g = new C0357g();
        c0357g.m956i(context);
        c0357g.m958k(dropDownBackgroundTintList);
        c0357g.m957j(popupElevation);
        c0357g.setShapeAppearanceModel(c0361k);
        C0356f c0356f = c0357g.f1026f;
        if (c0356f.f1014g == null) {
            c0356f.f1014g = new Rect();
        }
        c0357g.f1026f.f1014g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        c0357g.invalidateSelf();
        return c0357g;
    }

    /* renamed from: g */
    public final int m2119g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f3687i.getCompoundPaddingLeft() : this.f3685h.m1224c() : this.f3683g.m1252a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f3687i;
        if (editText == null) {
            return super.getBaseline();
        }
        return m2115c() + getPaddingTop() + editText.getBaseline();
    }

    public C0357g getBoxBackground() {
        int i = this.f3672T;
        if (i == 1 || i == 2) {
            return this.f3663K;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f3678c0;
    }

    public int getBoxBackgroundMode() {
        return this.f3672T;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f3673U;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean m845f = AbstractC0294k.m845f(this);
        RectF rectF = this.f3682f0;
        return m845f ? this.f3669Q.f1067h.mo939a(rectF) : this.f3669Q.f1066g.mo939a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean m845f = AbstractC0294k.m845f(this);
        RectF rectF = this.f3682f0;
        return m845f ? this.f3669Q.f1066g.mo939a(rectF) : this.f3669Q.f1067h.mo939a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean m845f = AbstractC0294k.m845f(this);
        RectF rectF = this.f3682f0;
        return m845f ? this.f3669Q.f1064e.mo939a(rectF) : this.f3669Q.f1065f.mo939a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean m845f = AbstractC0294k.m845f(this);
        RectF rectF = this.f3682f0;
        return m845f ? this.f3669Q.f1065f.mo939a(rectF) : this.f3669Q.f1064e.mo939a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f3706r0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f3708s0;
    }

    public int getBoxStrokeWidth() {
        return this.f3675W;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f3676a0;
    }

    public int getCounterMaxLength() {
        return this.f3703q;
    }

    public CharSequence getCounterOverflowDescription() {
        C1096Y c1096y;
        if (this.f3701p && this.f3705r && (c1096y = this.f3709t) != null) {
            return c1096y.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f3654E;
    }

    public ColorStateList getCounterTextColor() {
        return this.f3652D;
    }

    public ColorStateList getCursorColor() {
        return this.f3656F;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f3658G;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f3698n0;
    }

    public EditText getEditText() {
        return this.f3687i;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f3685h.f1598l.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f3685h.f1598l.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f3685h.f1604r;
    }

    public int getEndIconMode() {
        return this.f3685h.f1600n;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f3685h.f1605s;
    }

    public CheckableImageButton getEndIconView() {
        return this.f3685h.f1598l;
    }

    public CharSequence getError() {
        C0510s c0510s = this.f3699o;
        if (c0510s.f1641q) {
            return c0510s.f1640p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f3699o.f1644t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f3699o.f1643s;
    }

    public int getErrorCurrentTextColors() {
        C1096Y c1096y = this.f3699o.f1642r;
        if (c1096y != null) {
            return c1096y.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f3685h.f1594h.getDrawable();
    }

    public CharSequence getHelperText() {
        C0510s c0510s = this.f3699o;
        if (c0510s.f1648x) {
            return c0510s.f1647w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C1096Y c1096y = this.f3699o.f1649y;
        if (c1096y != null) {
            return c1096y.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f3660H) {
            return this.f3661I;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f3647A0.m827d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C0285b c0285b = this.f3647A0;
        return c0285b.m828e(c0285b.f781k);
    }

    public ColorStateList getHintTextColor() {
        return this.f3700o0;
    }

    public InterfaceC0490A getLengthCounter() {
        return this.f3707s;
    }

    public int getMaxEms() {
        return this.f3693l;
    }

    public int getMaxWidth() {
        return this.f3697n;
    }

    public int getMinEms() {
        return this.f3691k;
    }

    public int getMinWidth() {
        return this.f3695m;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f3685h.f1598l.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f3685h.f1598l.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f3717x) {
            return this.f3715w;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f3646A;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f3721z;
    }

    public CharSequence getPrefixText() {
        return this.f3683g.f1669h;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f3683g.f1668g.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f3683g.f1668g;
    }

    public C0361k getShapeAppearanceModel() {
        return this.f3669Q;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f3683g.f1670i.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f3683g.f1670i.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f3683g.f1673l;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f3683g.f1674m;
    }

    public CharSequence getSuffixText() {
        return this.f3685h.f1607u;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f3685h.f1608v.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f3685h.f1608v;
    }

    public Typeface getTypeface() {
        return this.f3684g0;
    }

    /* renamed from: h */
    public final int m2120h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f3687i.getCompoundPaddingRight() : this.f3683g.m1252a() : this.f3685h.m1224c());
    }

    /* renamed from: i */
    public final void m2121i() {
        int i = this.f3672T;
        if (i == 0) {
            this.f3663K = null;
            this.f3667O = null;
            this.f3668P = null;
        } else if (i == 1) {
            this.f3663K = new C0357g(this.f3669Q);
            this.f3667O = new C0357g();
            this.f3668P = new C0357g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f3672T + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f3660H || (this.f3663K instanceof C0499h)) {
                this.f3663K = new C0357g(this.f3669Q);
            } else {
                C0361k c0361k = this.f3669Q;
                int i2 = C0499h.f1566D;
                if (c0361k == null) {
                    c0361k = new C0361k();
                }
                C0498g c0498g = new C0498g(c0361k, new RectF());
                C0499h c0499h = new C0499h(c0498g);
                c0499h.f1567C = c0498g;
                this.f3663K = c0499h;
            }
            this.f3667O = null;
            this.f3668P = null;
        }
        m2130s();
        m2135x();
        if (this.f3672T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f3673U = getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0088l.m260S(getContext())) {
                this.f3673U = getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f3687i != null && this.f3672T == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f3687i;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f3687i.getPaddingEnd(), getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0088l.m260S(getContext())) {
                EditText editText2 = this.f3687i;
                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f3687i.getPaddingEnd(), getResources().getDimensionPixelSize(com.altaysoft.t500_split.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f3672T != 0) {
            m2131t();
        }
        EditText editText3 = this.f3687i;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f3672T;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* renamed from: j */
    public final void m2122j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        int i2;
        if (m2117e()) {
            int width = this.f3687i.getWidth();
            int gravity = this.f3687i.getGravity();
            C0285b c0285b = this.f3647A0;
            boolean m825b = c0285b.m825b(c0285b.f739A);
            c0285b.f741C = m825b;
            Rect rect = c0285b.f771d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (m825b) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = c0285b.f764Z;
                    }
                } else if (m825b) {
                    f2 = rect.right;
                    f3 = c0285b.f764Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f3682f0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (c0285b.f764Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c0285b.f741C) {
                        f5 = max + c0285b.f764Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (c0285b.f741C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = c0285b.f764Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = c0285b.m827d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.f3671S;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f3674V);
                C0499h c0499h = (C0499h) this.f3663K;
                c0499h.getClass();
                c0499h.m1212o(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = c0285b.f764Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f3682f0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (c0285b.f764Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = c0285b.m827d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    /* renamed from: l */
    public final void m2123l(C1096Y c1096y, int i) {
        try {
            c1096y.setTextAppearance(i);
            if (c1096y.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c1096y.setTextAppearance(com.altaysoft.t500_split.R.style.TextAppearance_AppCompat_Caption);
        c1096y.setTextColor(AbstractC0001b.m3a(getContext(), com.altaysoft.t500_split.R.color.design_error));
    }

    /* renamed from: m */
    public final boolean m2124m() {
        C0510s c0510s = this.f3699o;
        return (c0510s.f1639o != 1 || c0510s.f1642r == null || TextUtils.isEmpty(c0510s.f1640p)) ? false : true;
    }

    /* renamed from: n */
    public final void m2125n(Editable editable) {
        ((C0009c) this.f3707s).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f3705r;
        int i = this.f3703q;
        String str = null;
        if (i == -1) {
            this.f3709t.setText(String.valueOf(length));
            this.f3709t.setContentDescription(null);
            this.f3705r = false;
        } else {
            this.f3705r = length > i;
            Context context = getContext();
            this.f3709t.setContentDescription(context.getString(this.f3705r ? com.altaysoft.t500_split.R.string.character_counter_overflowed_content_description : com.altaysoft.t500_split.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f3703q)));
            if (z2 != this.f3705r) {
                m2126o();
            }
            String str2 = C0131b.f406b;
            C0131b c0131b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0131b.f409e : C0131b.f408d;
            C1096Y c1096y = this.f3709t;
            String string = getContext().getString(com.altaysoft.t500_split.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f3703q));
            if (string == null) {
                c0131b.getClass();
            } else {
                c0131b.getClass();
                C0125d c0125d = AbstractC0136g.f416a;
                str = c0131b.m389c(string).toString();
            }
            c1096y.setText(str);
        }
        if (this.f3687i == null || z2 == this.f3705r) {
            return;
        }
        m2132u(false, false);
        m2135x();
        m2129r();
    }

    /* renamed from: o */
    public final void m2126o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C1096Y c1096y = this.f3709t;
        if (c1096y != null) {
            m2123l(c1096y, this.f3705r ? this.f3711u : this.f3713v);
            if (!this.f3705r && (colorStateList2 = this.f3652D) != null) {
                this.f3709t.setTextColor(colorStateList2);
            }
            if (!this.f3705r || (colorStateList = this.f3654E) == null) {
                return;
            }
            this.f3709t.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f3647A0.m829g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        C0506o c0506o = this.f3685h;
        c0506o.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f3659G0 = false;
        if (this.f3687i != null && this.f3687i.getMeasuredHeight() < (max = Math.max(c0506o.getMeasuredHeight(), this.f3683g.getMeasuredHeight()))) {
            this.f3687i.setMinimumHeight(max);
            z2 = true;
        }
        boolean m2128q = m2128q();
        if (z2 || m2128q) {
            this.f3687i.post(new RunnableC0024r(9, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.f3687i;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC0286c.f797a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f3679d0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC0286c.f797a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC0286c.m836a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC0286c.f798b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            C0357g c0357g = this.f3667O;
            if (c0357g != null) {
                int i5 = rect.bottom;
                c0357g.setBounds(rect.left, i5 - this.f3675W, rect.right, i5);
            }
            C0357g c0357g2 = this.f3668P;
            if (c0357g2 != null) {
                int i6 = rect.bottom;
                c0357g2.setBounds(rect.left, i6 - this.f3676a0, rect.right, i6);
            }
            if (this.f3660H) {
                float textSize = this.f3687i.getTextSize();
                C0285b c0285b = this.f3647A0;
                if (c0285b.f778h != textSize) {
                    c0285b.f778h = textSize;
                    c0285b.m830h(false);
                }
                int gravity = this.f3687i.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (c0285b.f777g != i7) {
                    c0285b.f777g = i7;
                    c0285b.m830h(false);
                }
                if (c0285b.f775f != gravity) {
                    c0285b.f775f = gravity;
                    c0285b.m830h(false);
                }
                if (this.f3687i == null) {
                    throw new IllegalStateException();
                }
                boolean m845f = AbstractC0294k.m845f(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f3680e0;
                rect2.bottom = i8;
                int i9 = this.f3672T;
                if (i9 == 1) {
                    rect2.left = m2119g(rect.left, m845f);
                    rect2.top = rect.top + this.f3673U;
                    rect2.right = m2120h(rect.right, m845f);
                } else if (i9 != 2) {
                    rect2.left = m2119g(rect.left, m845f);
                    rect2.top = getPaddingTop();
                    rect2.right = m2120h(rect.right, m845f);
                } else {
                    rect2.left = this.f3687i.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - m2115c();
                    rect2.right = rect.right - this.f3687i.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = c0285b.f771d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    c0285b.f751M = true;
                }
                if (this.f3687i == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c0285b.f753O;
                textPaint.setTextSize(c0285b.f778h);
                textPaint.setTypeface(c0285b.f791u);
                textPaint.setLetterSpacing(c0285b.f761W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f3687i.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f3672T != 1 || this.f3687i.getMinLines() > 1) ? rect.top + this.f3687i.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f3687i.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f3672T != 1 || this.f3687i.getMinLines() > 1) ? rect.bottom - this.f3687i.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = c0285b.f769c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    c0285b.f751M = true;
                }
                c0285b.m830h(false);
                if (!m2117e() || this.f3722z0) {
                    return;
                }
                m2122j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.f3659G0;
        C0506o c0506o = this.f3685h;
        if (!z2) {
            c0506o.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f3659G0 = true;
        }
        if (this.f3719y != null && (editText = this.f3687i) != null) {
            this.f3719y.setGravity(editText.getGravity());
            this.f3719y.setPadding(this.f3687i.getCompoundPaddingLeft(), this.f3687i.getCompoundPaddingTop(), this.f3687i.getCompoundPaddingRight(), this.f3687i.getCompoundPaddingBottom());
        }
        c0506o.m1234m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0491B)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0491B c0491b = (C0491B) parcelable;
        super.onRestoreInstanceState(c0491b.f833a);
        setError(c0491b.f1545c);
        if (c0491b.f1546d) {
            post(new RunnableC0020n(7, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f3670R) {
            InterfaceC0353c interfaceC0353c = this.f3669Q.f1064e;
            RectF rectF = this.f3682f0;
            float mo939a = interfaceC0353c.mo939a(rectF);
            float mo939a2 = this.f3669Q.f1065f.mo939a(rectF);
            float mo939a3 = this.f3669Q.f1067h.mo939a(rectF);
            float mo939a4 = this.f3669Q.f1066g.mo939a(rectF);
            C0361k c0361k = this.f3669Q;
            AbstractC1680h abstractC1680h = c0361k.f1060a;
            AbstractC1680h abstractC1680h2 = c0361k.f1061b;
            AbstractC1680h abstractC1680h3 = c0361k.f1063d;
            AbstractC1680h abstractC1680h4 = c0361k.f1062c;
            C0355e c0355e = new C0355e(0);
            C0355e c0355e2 = new C0355e(0);
            C0355e c0355e3 = new C0355e(0);
            C0355e c0355e4 = new C0355e(0);
            C0360j.m962b(abstractC1680h2);
            C0360j.m962b(abstractC1680h);
            C0360j.m962b(abstractC1680h4);
            C0360j.m962b(abstractC1680h3);
            C0351a c0351a = new C0351a(mo939a2);
            C0351a c0351a2 = new C0351a(mo939a);
            C0351a c0351a3 = new C0351a(mo939a4);
            C0351a c0351a4 = new C0351a(mo939a3);
            C0361k c0361k2 = new C0361k();
            c0361k2.f1060a = abstractC1680h2;
            c0361k2.f1061b = abstractC1680h;
            c0361k2.f1062c = abstractC1680h3;
            c0361k2.f1063d = abstractC1680h4;
            c0361k2.f1064e = c0351a;
            c0361k2.f1065f = c0351a2;
            c0361k2.f1066g = c0351a4;
            c0361k2.f1067h = c0351a3;
            c0361k2.f1068i = c0355e;
            c0361k2.f1069j = c0355e2;
            c0361k2.f1070k = c0355e3;
            c0361k2.f1071l = c0355e4;
            this.f3670R = z2;
            setShapeAppearanceModel(c0361k2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0491B c0491b = new C0491B(super.onSaveInstanceState());
        if (m2124m()) {
            c0491b.f1545c = getError();
        }
        C0506o c0506o = this.f3685h;
        c0491b.f1546d = c0506o.f1600n != 0 && c0506o.f1598l.f3560i;
        return c0491b;
    }

    /* renamed from: p */
    public final void m2127p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f3656F;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue m4922Q = AbstractC1687o.m4922Q(context, com.altaysoft.t500_split.R.attr.colorControlActivated);
            if (m4922Q != null) {
                int i = m4922Q.resourceId;
                if (i != 0) {
                    colorStateList2 = AbstractC1695c.m4959b(context, i);
                } else {
                    int i2 = m4922Q.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f3687i;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f3687i.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m2124m() || (this.f3709t != null && this.f3705r)) && (colorStateList = this.f3658G) != null) {
                colorStateList2 = colorStateList;
            }
            AbstractC0070a.m206h(mutate, colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2128q() {
        boolean z2;
        C0506o c0506o;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f3687i == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            C0515x c0515x = this.f3683g;
            if (c0515x.getMeasuredWidth() > 0) {
                int measuredWidth = c0515x.getMeasuredWidth() - this.f3687i.getPaddingLeft();
                if (this.f3686h0 == null || this.f3688i0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f3686h0 = colorDrawable3;
                    this.f3688i0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f3687i.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f3686h0;
                if (drawable2 != colorDrawable4) {
                    this.f3687i.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    c0506o = this.f3685h;
                    if ((!c0506o.m1226e() || ((c0506o.f1600n != 0 && c0506o.m1225d()) || c0506o.f1607u != null)) && c0506o.getMeasuredWidth() > 0) {
                        int measuredWidth2 = c0506o.f1608v.getMeasuredWidth() - this.f3687i.getPaddingRight();
                        if (!c0506o.m1226e()) {
                            checkableImageButton = c0506o.f1594h;
                        } else if (c0506o.f1600n != 0 && c0506o.m1225d()) {
                            checkableImageButton = c0506o.f1598l;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f3687i.getCompoundDrawablesRelative();
                        colorDrawable = this.f3692k0;
                        if (colorDrawable != null || this.f3694l0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f3692k0 = colorDrawable5;
                                this.f3694l0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f3692k0;
                            if (drawable == colorDrawable2) {
                                this.f3696m0 = drawable;
                                this.f3687i.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f3694l0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f3687i.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f3692k0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f3692k0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.f3687i.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f3692k0) {
                            this.f3687i.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f3696m0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f3692k0 = null;
                    }
                    return z3;
                }
                z2 = false;
                c0506o = this.f3685h;
                if (c0506o.m1226e()) {
                }
                int measuredWidth22 = c0506o.f1608v.getMeasuredWidth() - this.f3687i.getPaddingRight();
                if (!c0506o.m1226e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f3687i.getCompoundDrawablesRelative();
                colorDrawable = this.f3692k0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f3692k0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f3686h0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f3687i.getCompoundDrawablesRelative();
            this.f3687i.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f3686h0 = null;
            z2 = true;
            c0506o = this.f3685h;
            if (c0506o.m1226e()) {
            }
            int measuredWidth222 = c0506o.f1608v.getMeasuredWidth() - this.f3687i.getPaddingRight();
            if (!c0506o.m1226e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f3687i.getCompoundDrawablesRelative();
            colorDrawable = this.f3692k0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f3692k0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        c0506o = this.f3685h;
        if (c0506o.m1226e()) {
        }
        int measuredWidth2222 = c0506o.f1608v.getMeasuredWidth() - this.f3687i.getPaddingRight();
        if (!c0506o.m1226e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f3687i.getCompoundDrawablesRelative();
        colorDrawable = this.f3692k0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f3692k0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    /* renamed from: r */
    public final void m2129r() {
        Drawable background;
        C1096Y c1096y;
        EditText editText = this.f3687i;
        if (editText == null || this.f3672T != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC1118h0.f5168a;
        Drawable mutate = background.mutate();
        if (m2124m()) {
            mutate.setColorFilter(C1141t.m2763c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f3705r && (c1096y = this.f3709t) != null) {
            mutate.setColorFilter(C1141t.m2763c(c1096y.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f3687i.refreshDrawableState();
        }
    }

    /* renamed from: s */
    public final void m2130s() {
        EditText editText = this.f3687i;
        if (editText == null || this.f3663K == null) {
            return;
        }
        if ((this.f3666N || editText.getBackground() == null) && this.f3672T != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f3687i;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            editText2.setBackground(editTextBoxBackground);
            this.f3666N = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f3678c0 != i) {
            this.f3678c0 = i;
            this.f3710t0 = i;
            this.f3714v0 = i;
            this.f3716w0 = i;
            m2114b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(AbstractC0001b.m3a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f3710t0 = defaultColor;
        this.f3678c0 = defaultColor;
        this.f3712u0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f3714v0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f3716w0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        m2114b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f3672T) {
            return;
        }
        this.f3672T = i;
        if (this.f3687i != null) {
            m2121i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f3673U = i;
    }

    public void setBoxCornerFamily(int i) {
        C0360j m968e = this.f3669Q.m968e();
        InterfaceC0353c interfaceC0353c = this.f3669Q.f1064e;
        AbstractC1680h m4944m = AbstractC1687o.m4944m(i);
        m968e.f1048a = m4944m;
        C0360j.m962b(m4944m);
        m968e.f1052e = interfaceC0353c;
        InterfaceC0353c interfaceC0353c2 = this.f3669Q.f1065f;
        AbstractC1680h m4944m2 = AbstractC1687o.m4944m(i);
        m968e.f1049b = m4944m2;
        C0360j.m962b(m4944m2);
        m968e.f1053f = interfaceC0353c2;
        InterfaceC0353c interfaceC0353c3 = this.f3669Q.f1067h;
        AbstractC1680h m4944m3 = AbstractC1687o.m4944m(i);
        m968e.f1051d = m4944m3;
        C0360j.m962b(m4944m3);
        m968e.f1055h = interfaceC0353c3;
        InterfaceC0353c interfaceC0353c4 = this.f3669Q.f1066g;
        AbstractC1680h m4944m4 = AbstractC1687o.m4944m(i);
        m968e.f1050c = m4944m4;
        C0360j.m962b(m4944m4);
        m968e.f1054g = interfaceC0353c4;
        this.f3669Q = m968e.m963a();
        m2114b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f3706r0 != i) {
            this.f3706r0 = i;
            m2135x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f3702p0 = colorStateList.getDefaultColor();
            this.f3718x0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f3704q0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f3706r0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f3706r0 != colorStateList.getDefaultColor()) {
            this.f3706r0 = colorStateList.getDefaultColor();
        }
        m2135x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f3708s0 != colorStateList) {
            this.f3708s0 = colorStateList;
            m2135x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f3675W = i;
        m2135x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f3676a0 = i;
        m2135x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f3701p != z2) {
            C0510s c0510s = this.f3699o;
            if (z2) {
                C1096Y c1096y = new C1096Y(getContext(), null);
                this.f3709t = c1096y;
                c1096y.setId(com.altaysoft.t500_split.R.id.textinput_counter);
                Typeface typeface = this.f3684g0;
                if (typeface != null) {
                    this.f3709t.setTypeface(typeface);
                }
                this.f3709t.setMaxLines(1);
                c0510s.m1239a(this.f3709t, 2);
                ((ViewGroup.MarginLayoutParams) this.f3709t.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.altaysoft.t500_split.R.dimen.mtrl_textinput_counter_margin_start));
                m2126o();
                if (this.f3709t != null) {
                    EditText editText = this.f3687i;
                    m2125n(editText != null ? editText.getText() : null);
                }
            } else {
                c0510s.m1245g(this.f3709t, 2);
                this.f3709t = null;
            }
            this.f3701p = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f3703q != i) {
            if (i > 0) {
                this.f3703q = i;
            } else {
                this.f3703q = -1;
            }
            if (!this.f3701p || this.f3709t == null) {
                return;
            }
            EditText editText = this.f3687i;
            m2125n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f3711u != i) {
            this.f3711u = i;
            m2126o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f3654E != colorStateList) {
            this.f3654E = colorStateList;
            m2126o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f3713v != i) {
            this.f3713v = i;
            m2126o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f3652D != colorStateList) {
            this.f3652D = colorStateList;
            m2126o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f3656F != colorStateList) {
            this.f3656F = colorStateList;
            m2127p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f3658G != colorStateList) {
            this.f3658G = colorStateList;
            if (m2124m() || (this.f3709t != null && this.f3705r)) {
                m2127p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f3698n0 = colorStateList;
        this.f3700o0 = colorStateList;
        if (this.f3687i != null) {
            m2132u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        m2112k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f3685h.f1598l.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f3685h.f1598l.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        C0506o c0506o = this.f3685h;
        CharSequence text = i != 0 ? c0506o.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = c0506o.f1598l;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        C0506o c0506o = this.f3685h;
        Drawable m257D = i != 0 ? AbstractC0088l.m257D(c0506o.getContext(), i) : null;
        CheckableImageButton checkableImageButton = c0506o.f1598l;
        checkableImageButton.setImageDrawable(m257D);
        if (m257D != null) {
            ColorStateList colorStateList = c0506o.f1602p;
            PorterDuff.Mode mode = c0506o.f1603q;
            TextInputLayout textInputLayout = c0506o.f1592f;
            AbstractC0088l.m268f(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0088l.m273i0(textInputLayout, checkableImageButton, c0506o.f1602p);
        }
    }

    public void setEndIconMinSize(int i) {
        C0506o c0506o = this.f3685h;
        if (i < 0) {
            c0506o.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != c0506o.f1604r) {
            c0506o.f1604r = i;
            CheckableImageButton checkableImageButton = c0506o.f1598l;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = c0506o.f1594h;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f3685h.m1228g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        C0506o c0506o = this.f3685h;
        View.OnLongClickListener onLongClickListener = c0506o.f1606t;
        CheckableImageButton checkableImageButton = c0506o.f1598l;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0506o c0506o = this.f3685h;
        c0506o.f1606t = onLongClickListener;
        CheckableImageButton checkableImageButton = c0506o.f1598l;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        C0506o c0506o = this.f3685h;
        c0506o.f1605s = scaleType;
        c0506o.f1598l.setScaleType(scaleType);
        c0506o.f1594h.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        C0506o c0506o = this.f3685h;
        if (c0506o.f1602p != colorStateList) {
            c0506o.f1602p = colorStateList;
            AbstractC0088l.m268f(c0506o.f1592f, c0506o.f1598l, colorStateList, c0506o.f1603q);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        C0506o c0506o = this.f3685h;
        if (c0506o.f1603q != mode) {
            c0506o.f1603q = mode;
            AbstractC0088l.m268f(c0506o.f1592f, c0506o.f1598l, c0506o.f1602p, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f3685h.m1229h(z2);
    }

    public void setError(CharSequence charSequence) {
        C0510s c0510s = this.f3699o;
        if (!c0510s.f1641q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            c0510s.m1244f();
            return;
        }
        c0510s.m1241c();
        c0510s.f1640p = charSequence;
        c0510s.f1642r.setText(charSequence);
        int i = c0510s.f1638n;
        if (i != 1) {
            c0510s.f1639o = 1;
        }
        c0510s.m1247i(i, c0510s.m1246h(c0510s.f1642r, charSequence), c0510s.f1639o);
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        C0510s c0510s = this.f3699o;
        c0510s.f1644t = i;
        C1096Y c1096y = c0510s.f1642r;
        if (c1096y != null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            c1096y.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        C0510s c0510s = this.f3699o;
        c0510s.f1643s = charSequence;
        C1096Y c1096y = c0510s.f1642r;
        if (c1096y != null) {
            c1096y.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        C0510s c0510s = this.f3699o;
        if (c0510s.f1641q == z2) {
            return;
        }
        c0510s.m1241c();
        TextInputLayout textInputLayout = c0510s.f1632h;
        if (z2) {
            C1096Y c1096y = new C1096Y(c0510s.f1631g, null);
            c0510s.f1642r = c1096y;
            c1096y.setId(com.altaysoft.t500_split.R.id.textinput_error);
            c0510s.f1642r.setTextAlignment(5);
            Typeface typeface = c0510s.f1624B;
            if (typeface != null) {
                c0510s.f1642r.setTypeface(typeface);
            }
            int i = c0510s.f1645u;
            c0510s.f1645u = i;
            C1096Y c1096y2 = c0510s.f1642r;
            if (c1096y2 != null) {
                textInputLayout.m2123l(c1096y2, i);
            }
            ColorStateList colorStateList = c0510s.f1646v;
            c0510s.f1646v = colorStateList;
            C1096Y c1096y3 = c0510s.f1642r;
            if (c1096y3 != null && colorStateList != null) {
                c1096y3.setTextColor(colorStateList);
            }
            CharSequence charSequence = c0510s.f1643s;
            c0510s.f1643s = charSequence;
            C1096Y c1096y4 = c0510s.f1642r;
            if (c1096y4 != null) {
                c1096y4.setContentDescription(charSequence);
            }
            int i2 = c0510s.f1644t;
            c0510s.f1644t = i2;
            C1096Y c1096y5 = c0510s.f1642r;
            if (c1096y5 != null) {
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                c1096y5.setAccessibilityLiveRegion(i2);
            }
            c0510s.f1642r.setVisibility(4);
            c0510s.m1239a(c0510s.f1642r, 0);
        } else {
            c0510s.m1244f();
            c0510s.m1245g(c0510s.f1642r, 0);
            c0510s.f1642r = null;
            textInputLayout.m2129r();
            textInputLayout.m2135x();
        }
        c0510s.f1641q = z2;
    }

    public void setErrorIconDrawable(int i) {
        C0506o c0506o = this.f3685h;
        c0506o.m1230i(i != 0 ? AbstractC0088l.m257D(c0506o.getContext(), i) : null);
        AbstractC0088l.m273i0(c0506o.f1592f, c0506o.f1594h, c0506o.f1595i);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        C0506o c0506o = this.f3685h;
        CheckableImageButton checkableImageButton = c0506o.f1594h;
        View.OnLongClickListener onLongClickListener = c0506o.f1597k;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0506o c0506o = this.f3685h;
        c0506o.f1597k = onLongClickListener;
        CheckableImageButton checkableImageButton = c0506o.f1594h;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        C0506o c0506o = this.f3685h;
        if (c0506o.f1595i != colorStateList) {
            c0506o.f1595i = colorStateList;
            AbstractC0088l.m268f(c0506o.f1592f, c0506o.f1594h, colorStateList, c0506o.f1596j);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        C0506o c0506o = this.f3685h;
        if (c0506o.f1596j != mode) {
            c0506o.f1596j = mode;
            AbstractC0088l.m268f(c0506o.f1592f, c0506o.f1594h, c0506o.f1595i, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        C0510s c0510s = this.f3699o;
        c0510s.f1645u = i;
        C1096Y c1096y = c0510s.f1642r;
        if (c1096y != null) {
            c0510s.f1632h.m2123l(c1096y, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        C0510s c0510s = this.f3699o;
        c0510s.f1646v = colorStateList;
        C1096Y c1096y = c0510s.f1642r;
        if (c1096y == null || colorStateList == null) {
            return;
        }
        c1096y.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f3649B0 != z2) {
            this.f3649B0 = z2;
            m2132u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C0510s c0510s = this.f3699o;
        if (isEmpty) {
            if (c0510s.f1648x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!c0510s.f1648x) {
            setHelperTextEnabled(true);
        }
        c0510s.m1241c();
        c0510s.f1647w = charSequence;
        c0510s.f1649y.setText(charSequence);
        int i = c0510s.f1638n;
        if (i != 2) {
            c0510s.f1639o = 2;
        }
        c0510s.m1247i(i, c0510s.m1246h(c0510s.f1649y, charSequence), c0510s.f1639o);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        C0510s c0510s = this.f3699o;
        c0510s.f1623A = colorStateList;
        C1096Y c1096y = c0510s.f1649y;
        if (c1096y == null || colorStateList == null) {
            return;
        }
        c1096y.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        C0510s c0510s = this.f3699o;
        if (c0510s.f1648x == z2) {
            return;
        }
        c0510s.m1241c();
        if (z2) {
            C1096Y c1096y = new C1096Y(c0510s.f1631g, null);
            c0510s.f1649y = c1096y;
            c1096y.setId(com.altaysoft.t500_split.R.id.textinput_helper_text);
            c0510s.f1649y.setTextAlignment(5);
            Typeface typeface = c0510s.f1624B;
            if (typeface != null) {
                c0510s.f1649y.setTypeface(typeface);
            }
            c0510s.f1649y.setVisibility(4);
            c0510s.f1649y.setAccessibilityLiveRegion(1);
            int i = c0510s.f1650z;
            c0510s.f1650z = i;
            C1096Y c1096y2 = c0510s.f1649y;
            if (c1096y2 != null) {
                c1096y2.setTextAppearance(i);
            }
            ColorStateList colorStateList = c0510s.f1623A;
            c0510s.f1623A = colorStateList;
            C1096Y c1096y3 = c0510s.f1649y;
            if (c1096y3 != null && colorStateList != null) {
                c1096y3.setTextColor(colorStateList);
            }
            c0510s.m1239a(c0510s.f1649y, 1);
            c0510s.f1649y.setAccessibilityDelegate(new C0509r(c0510s));
        } else {
            c0510s.m1241c();
            int i2 = c0510s.f1638n;
            if (i2 == 2) {
                c0510s.f1639o = 0;
            }
            c0510s.m1247i(i2, c0510s.m1246h(c0510s.f1649y, ""), c0510s.f1639o);
            c0510s.m1245g(c0510s.f1649y, 1);
            c0510s.f1649y = null;
            TextInputLayout textInputLayout = c0510s.f1632h;
            textInputLayout.m2129r();
            textInputLayout.m2135x();
        }
        c0510s.f1648x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        C0510s c0510s = this.f3699o;
        c0510s.f1650z = i;
        C1096Y c1096y = c0510s.f1649y;
        if (c1096y != null) {
            c1096y.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f3660H) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f3651C0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f3660H) {
            this.f3660H = z2;
            if (z2) {
                CharSequence hint = this.f3687i.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f3661I)) {
                        setHint(hint);
                    }
                    this.f3687i.setHint((CharSequence) null);
                }
                this.f3662J = true;
            } else {
                this.f3662J = false;
                if (!TextUtils.isEmpty(this.f3661I) && TextUtils.isEmpty(this.f3687i.getHint())) {
                    this.f3687i.setHint(this.f3661I);
                }
                setHintInternal(null);
            }
            if (this.f3687i != null) {
                m2131t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C0285b c0285b = this.f3647A0;
        TextInputLayout textInputLayout = c0285b.f765a;
        C0335d c0335d = new C0335d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c0335d.f960j;
        if (colorStateList != null) {
            c0285b.f781k = colorStateList;
        }
        float f2 = c0335d.f961k;
        if (f2 != 0.0f) {
            c0285b.f779i = f2;
        }
        ColorStateList colorStateList2 = c0335d.f951a;
        if (colorStateList2 != null) {
            c0285b.f759U = colorStateList2;
        }
        c0285b.f757S = c0335d.f955e;
        c0285b.f758T = c0335d.f956f;
        c0285b.f756R = c0335d.f957g;
        c0285b.f760V = c0335d.f959i;
        C0332a c0332a = c0285b.f795y;
        if (c0332a != null) {
            c0332a.f944m = true;
        }
        C0639g c0639g = new C0639g(11, c0285b);
        c0335d.m929a();
        c0285b.f795y = new C0332a(c0639g, c0335d.f964n);
        c0335d.m931c(textInputLayout.getContext(), c0285b.f795y);
        c0285b.m830h(false);
        this.f3700o0 = c0285b.f781k;
        if (this.f3687i != null) {
            m2132u(false, false);
            m2131t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f3700o0 != colorStateList) {
            if (this.f3698n0 == null) {
                C0285b c0285b = this.f3647A0;
                if (c0285b.f781k != colorStateList) {
                    c0285b.f781k = colorStateList;
                    c0285b.m830h(false);
                }
            }
            this.f3700o0 = colorStateList;
            if (this.f3687i != null) {
                m2132u(false, false);
            }
        }
    }

    public void setLengthCounter(InterfaceC0490A interfaceC0490A) {
        this.f3707s = interfaceC0490A;
    }

    public void setMaxEms(int i) {
        this.f3693l = i;
        EditText editText = this.f3687i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f3697n = i;
        EditText editText = this.f3687i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f3691k = i;
        EditText editText = this.f3687i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f3695m = i;
        EditText editText = this.f3687i;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        C0506o c0506o = this.f3685h;
        c0506o.f1598l.setContentDescription(i != 0 ? c0506o.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        C0506o c0506o = this.f3685h;
        c0506o.f1598l.setImageDrawable(i != 0 ? AbstractC0088l.m257D(c0506o.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        C0506o c0506o = this.f3685h;
        if (z2 && c0506o.f1600n != 1) {
            c0506o.m1228g(1);
        } else if (z2) {
            c0506o.getClass();
        } else {
            c0506o.m1228g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        C0506o c0506o = this.f3685h;
        c0506o.f1602p = colorStateList;
        AbstractC0088l.m268f(c0506o.f1592f, c0506o.f1598l, colorStateList, c0506o.f1603q);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        C0506o c0506o = this.f3685h;
        c0506o.f1603q = mode;
        AbstractC0088l.m268f(c0506o.f1592f, c0506o.f1598l, c0506o.f1602p, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f3719y == null) {
            C1096Y c1096y = new C1096Y(getContext(), null);
            this.f3719y = c1096y;
            c1096y.setId(com.altaysoft.t500_split.R.id.textinput_placeholder);
            this.f3719y.setImportantForAccessibility(2);
            C0977h m2116d = m2116d();
            this.f3648B = m2116d;
            m2116d.f4695b = 67L;
            this.f3650C = m2116d();
            setPlaceholderTextAppearance(this.f3646A);
            setPlaceholderTextColor(this.f3721z);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f3717x) {
                setPlaceholderTextEnabled(true);
            }
            this.f3715w = charSequence;
        }
        EditText editText = this.f3687i;
        m2133v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f3646A = i;
        C1096Y c1096y = this.f3719y;
        if (c1096y != null) {
            c1096y.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f3721z != colorStateList) {
            this.f3721z = colorStateList;
            C1096Y c1096y = this.f3719y;
            if (c1096y == null || colorStateList == null) {
                return;
            }
            c1096y.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        C0515x c0515x = this.f3683g;
        c0515x.getClass();
        c0515x.f1669h = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0515x.f1668g.setText(charSequence);
        c0515x.m1256e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f3683g.f1668g.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f3683g.f1668g.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(C0361k c0361k) {
        C0357g c0357g = this.f3663K;
        if (c0357g == null || c0357g.f1026f.f1008a == c0361k) {
            return;
        }
        this.f3669Q = c0361k;
        m2114b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f3683g.f1670i.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3683g.f1670i;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? AbstractC0088l.m257D(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        C0515x c0515x = this.f3683g;
        if (i < 0) {
            c0515x.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != c0515x.f1673l) {
            c0515x.f1673l = i;
            CheckableImageButton checkableImageButton = c0515x.f1670i;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        C0515x c0515x = this.f3683g;
        View.OnLongClickListener onLongClickListener = c0515x.f1675n;
        CheckableImageButton checkableImageButton = c0515x.f1670i;
        checkableImageButton.setOnClickListener(onClickListener);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        C0515x c0515x = this.f3683g;
        c0515x.f1675n = onLongClickListener;
        CheckableImageButton checkableImageButton = c0515x.f1670i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        C0515x c0515x = this.f3683g;
        c0515x.f1674m = scaleType;
        c0515x.f1670i.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        C0515x c0515x = this.f3683g;
        if (c0515x.f1671j != colorStateList) {
            c0515x.f1671j = colorStateList;
            AbstractC0088l.m268f(c0515x.f1667f, c0515x.f1670i, colorStateList, c0515x.f1672k);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        C0515x c0515x = this.f3683g;
        if (c0515x.f1672k != mode) {
            c0515x.f1672k = mode;
            AbstractC0088l.m268f(c0515x.f1667f, c0515x.f1670i, c0515x.f1671j, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f3683g.m1254c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        C0506o c0506o = this.f3685h;
        c0506o.getClass();
        c0506o.f1607u = TextUtils.isEmpty(charSequence) ? null : charSequence;
        c0506o.f1608v.setText(charSequence);
        c0506o.m1235n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f3685h.f1608v.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f3685h.f1608v.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C0517z c0517z) {
        EditText editText = this.f3687i;
        if (editText != null) {
            AbstractC0169Q.m505j(editText, c0517z);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f3684g0) {
            this.f3684g0 = typeface;
            this.f3647A0.m835m(typeface);
            C0510s c0510s = this.f3699o;
            if (typeface != c0510s.f1624B) {
                c0510s.f1624B = typeface;
                C1096Y c1096y = c0510s.f1642r;
                if (c1096y != null) {
                    c1096y.setTypeface(typeface);
                }
                C1096Y c1096y2 = c0510s.f1649y;
                if (c1096y2 != null) {
                    c1096y2.setTypeface(typeface);
                }
            }
            C1096Y c1096y3 = this.f3709t;
            if (c1096y3 != null) {
                c1096y3.setTypeface(typeface);
            }
        }
    }

    /* renamed from: t */
    public final void m2131t() {
        if (this.f3672T != 1) {
            FrameLayout frameLayout = this.f3681f;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int m2115c = m2115c();
            if (m2115c != layoutParams.topMargin) {
                layoutParams.topMargin = m2115c;
                frameLayout.requestLayout();
            }
        }
    }

    /* renamed from: u */
    public final void m2132u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C1096Y c1096y;
        boolean isEnabled = isEnabled();
        EditText editText = this.f3687i;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f3687i;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f3698n0;
        C0285b c0285b = this.f3647A0;
        if (colorStateList2 != null) {
            c0285b.m831i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f3698n0;
            c0285b.m831i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f3718x0) : this.f3718x0));
        } else if (m2124m()) {
            C1096Y c1096y2 = this.f3699o.f1642r;
            c0285b.m831i(c1096y2 != null ? c1096y2.getTextColors() : null);
        } else if (this.f3705r && (c1096y = this.f3709t) != null) {
            c0285b.m831i(c1096y.getTextColors());
        } else if (z5 && (colorStateList = this.f3700o0) != null && c0285b.f781k != colorStateList) {
            c0285b.f781k = colorStateList;
            c0285b.m830h(false);
        }
        C0506o c0506o = this.f3685h;
        C0515x c0515x = this.f3683g;
        if (z4 || !this.f3649B0 || (isEnabled() && z5)) {
            if (z3 || this.f3722z0) {
                ValueAnimator valueAnimator = this.f3653D0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f3653D0.cancel();
                }
                if (z2 && this.f3651C0) {
                    m2113a(1.0f);
                } else {
                    c0285b.m833k(1.0f);
                }
                this.f3722z0 = false;
                if (m2117e()) {
                    m2122j();
                }
                EditText editText3 = this.f3687i;
                m2133v(editText3 != null ? editText3.getText() : null);
                c0515x.f1676o = false;
                c0515x.m1256e();
                c0506o.f1609w = false;
                c0506o.m1235n();
                return;
            }
            return;
        }
        if (z3 || !this.f3722z0) {
            ValueAnimator valueAnimator2 = this.f3653D0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f3653D0.cancel();
            }
            if (z2 && this.f3651C0) {
                m2113a(0.0f);
            } else {
                c0285b.m833k(0.0f);
            }
            if (m2117e() && !((C0499h) this.f3663K).f1567C.f1565q.isEmpty() && m2117e()) {
                ((C0499h) this.f3663K).m1212o(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f3722z0 = true;
            C1096Y c1096y3 = this.f3719y;
            if (c1096y3 != null && this.f3717x) {
                c1096y3.setText((CharSequence) null);
                AbstractC0986q.m2563a(this.f3681f, this.f3650C);
                this.f3719y.setVisibility(4);
            }
            c0515x.f1676o = true;
            c0515x.m1256e();
            c0506o.f1609w = true;
            c0506o.m1235n();
        }
    }

    /* renamed from: v */
    public final void m2133v(Editable editable) {
        ((C0009c) this.f3707s).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f3681f;
        if (length != 0 || this.f3722z0) {
            C1096Y c1096y = this.f3719y;
            if (c1096y == null || !this.f3717x) {
                return;
            }
            c1096y.setText((CharSequence) null);
            AbstractC0986q.m2563a(frameLayout, this.f3650C);
            this.f3719y.setVisibility(4);
            return;
        }
        if (this.f3719y == null || !this.f3717x || TextUtils.isEmpty(this.f3715w)) {
            return;
        }
        this.f3719y.setText(this.f3715w);
        AbstractC0986q.m2563a(frameLayout, this.f3648B);
        this.f3719y.setVisibility(0);
        this.f3719y.bringToFront();
        announceForAccessibility(this.f3715w);
    }

    /* renamed from: w */
    public final void m2134w(boolean z2, boolean z3) {
        int defaultColor = this.f3708s0.getDefaultColor();
        int colorForState = this.f3708s0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f3708s0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f3677b0 = colorForState2;
        } else if (z3) {
            this.f3677b0 = colorForState;
        } else {
            this.f3677b0 = defaultColor;
        }
    }

    /* renamed from: x */
    public final void m2135x() {
        C1096Y c1096y;
        EditText editText;
        EditText editText2;
        if (this.f3663K == null || this.f3672T == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f3687i) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f3687i) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f3677b0 = this.f3718x0;
        } else if (m2124m()) {
            if (this.f3708s0 != null) {
                m2134w(z3, z2);
            } else {
                this.f3677b0 = getErrorCurrentTextColors();
            }
        } else if (!this.f3705r || (c1096y = this.f3709t) == null) {
            if (z3) {
                this.f3677b0 = this.f3706r0;
            } else if (z2) {
                this.f3677b0 = this.f3704q0;
            } else {
                this.f3677b0 = this.f3702p0;
            }
        } else if (this.f3708s0 != null) {
            m2134w(z3, z2);
        } else {
            this.f3677b0 = c1096y.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            m2127p();
        }
        C0506o c0506o = this.f3685h;
        c0506o.m1233l();
        CheckableImageButton checkableImageButton = c0506o.f1594h;
        ColorStateList colorStateList = c0506o.f1595i;
        TextInputLayout textInputLayout = c0506o.f1592f;
        AbstractC0088l.m273i0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = c0506o.f1602p;
        CheckableImageButton checkableImageButton2 = c0506o.f1598l;
        AbstractC0088l.m273i0(textInputLayout, checkableImageButton2, colorStateList2);
        if (c0506o.m1223b() instanceof C0502k) {
            if (!textInputLayout.m2124m() || checkableImageButton2.getDrawable() == null) {
                AbstractC0088l.m268f(textInputLayout, checkableImageButton2, c0506o.f1602p, c0506o.f1603q);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                AbstractC0070a.m205g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        C0515x c0515x = this.f3683g;
        AbstractC0088l.m273i0(c0515x.f1667f, c0515x.f1670i, c0515x.f1671j);
        if (this.f3672T == 2) {
            int i = this.f3674V;
            if (z3 && isEnabled()) {
                this.f3674V = this.f3676a0;
            } else {
                this.f3674V = this.f3675W;
            }
            if (this.f3674V != i && m2117e() && !this.f3722z0) {
                if (m2117e()) {
                    ((C0499h) this.f3663K).m1212o(0.0f, 0.0f, 0.0f, 0.0f);
                }
                m2122j();
            }
        }
        if (this.f3672T == 1) {
            if (!isEnabled()) {
                this.f3678c0 = this.f3712u0;
            } else if (z2 && !z3) {
                this.f3678c0 = this.f3716w0;
            } else if (z3) {
                this.f3678c0 = this.f3714v0;
            } else {
                this.f3678c0 = this.f3710t0;
            }
        }
        m2114b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f3683g.m1253b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f3685h.f1598l.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f3685h.f1598l.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f3685h.m1230i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f3685h.f1598l;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        C0506o c0506o = this.f3685h;
        CheckableImageButton checkableImageButton = c0506o.f1598l;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = c0506o.f1602p;
            PorterDuff.Mode mode = c0506o.f1603q;
            TextInputLayout textInputLayout = c0506o.f1592f;
            AbstractC0088l.m268f(textInputLayout, checkableImageButton, colorStateList, mode);
            AbstractC0088l.m273i0(textInputLayout, checkableImageButton, c0506o.f1602p);
        }
    }
}
