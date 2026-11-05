package p082l;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p031P.AbstractC0263a;
import p033Q.AbstractC0279m;
import p033Q.AbstractC0280n;
import p033Q.AbstractC0281o;
import p067f.AbstractC0770a;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;

/* renamed from: l.V */
/* loaded from: classes.dex */
public final class C1090V {

    /* renamed from: a */
    public final TextView f5108a;

    /* renamed from: b */
    public C1078O0 f5109b;

    /* renamed from: c */
    public C1078O0 f5110c;

    /* renamed from: d */
    public C1078O0 f5111d;

    /* renamed from: e */
    public C1078O0 f5112e;

    /* renamed from: f */
    public C1078O0 f5113f;

    /* renamed from: g */
    public C1078O0 f5114g;

    /* renamed from: h */
    public C1078O0 f5115h;

    /* renamed from: i */
    public final C1107c0 f5116i;

    /* renamed from: j */
    public int f5117j = 0;

    /* renamed from: k */
    public int f5118k = -1;

    /* renamed from: l */
    public Typeface f5119l;

    /* renamed from: m */
    public boolean f5120m;

    public C1090V(TextView textView) {
        this.f5108a = textView;
        this.f5116i = new C1107c0(textView);
    }

    /* renamed from: c */
    public static C1078O0 m2707c(Context context, C1141t c1141t, int i) {
        ColorStateList m2674f;
        synchronized (c1141t) {
            m2674f = c1141t.f5273a.m2674f(context, i);
        }
        if (m2674f == null) {
            return null;
        }
        C1078O0 c1078o0 = new C1078O0();
        c1078o0.f5086d = true;
        c1078o0.f5083a = m2674f;
        return c1078o0;
    }

    /* renamed from: h */
    public static void m2708h(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 || inputConnection == null) {
            return;
        }
        CharSequence text = textView.getText();
        if (i >= 30) {
            AbstractC0263a.m782a(editorInfo, text);
            return;
        }
        text.getClass();
        if (i >= 30) {
            AbstractC0263a.m782a(editorInfo, text);
            return;
        }
        int i2 = editorInfo.initialSelStart;
        int i3 = editorInfo.initialSelEnd;
        int i4 = i2 > i3 ? i3 : i2;
        if (i2 <= i3) {
            i2 = i3;
        }
        int length = text.length();
        if (i4 < 0 || i2 > length) {
            AbstractC1680h.m4856R(editorInfo, null, 0, 0);
            return;
        }
        int i5 = editorInfo.inputType & 4095;
        if (i5 == 129 || i5 == 225 || i5 == 18) {
            AbstractC1680h.m4856R(editorInfo, null, 0, 0);
            return;
        }
        if (length <= 2048) {
            AbstractC1680h.m4856R(editorInfo, text, i4, i2);
            return;
        }
        int i6 = i2 - i4;
        int i7 = i6 > 1024 ? 0 : i6;
        int i8 = 2048 - i7;
        int min = Math.min(text.length() - i2, i8 - Math.min(i4, (int) (i8 * 0.8d)));
        int min2 = Math.min(i4, i8 - min);
        int i9 = i4 - min2;
        if (Character.isLowSurrogate(text.charAt(i9))) {
            i9++;
            min2--;
        }
        if (Character.isHighSurrogate(text.charAt((i2 + min) - 1))) {
            min--;
        }
        int i10 = min2 + i7;
        AbstractC1680h.m4856R(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i2, min + i2)) : text.subSequence(i9, i10 + min + i9), min2, i10);
    }

    /* renamed from: a */
    public final void m2709a(Drawable drawable, C1078O0 c1078o0) {
        if (drawable == null || c1078o0 == null) {
            return;
        }
        C1141t.m2765e(drawable, c1078o0, this.f5108a.getDrawableState());
    }

    /* renamed from: b */
    public final void m2710b() {
        C1078O0 c1078o0 = this.f5109b;
        TextView textView = this.f5108a;
        if (c1078o0 != null || this.f5110c != null || this.f5111d != null || this.f5112e != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            m2709a(compoundDrawables[0], this.f5109b);
            m2709a(compoundDrawables[1], this.f5110c);
            m2709a(compoundDrawables[2], this.f5111d);
            m2709a(compoundDrawables[3], this.f5112e);
        }
        if (this.f5113f == null && this.f5114g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
        m2709a(compoundDrawablesRelative[0], this.f5113f);
        m2709a(compoundDrawablesRelative[2], this.f5114g);
    }

    /* renamed from: d */
    public final ColorStateList m2711d() {
        C1078O0 c1078o0 = this.f5115h;
        if (c1078o0 != null) {
            return c1078o0.f5083a;
        }
        return null;
    }

    /* renamed from: e */
    public final PorterDuff.Mode m2712e() {
        C1078O0 c1078o0 = this.f5115h;
        if (c1078o0 != null) {
            return c1078o0.f5084b;
        }
        return null;
    }

    /* renamed from: f */
    public final void m2713f(AttributeSet attributeSet, int i) {
        boolean z2;
        boolean z3;
        String str;
        String str2;
        int i2;
        int i3;
        int i4;
        float f2;
        ColorStateList colorStateList;
        int resourceId;
        int i5;
        int resourceId2;
        int i6;
        TextView textView = this.f5108a;
        Context context = textView.getContext();
        C1141t m2762a = C1141t.m2762a();
        int[] iArr = AbstractC0770a.f3901h;
        C0198k m591r = C0198k.m591r(context, attributeSet, iArr, i);
        AbstractC0169Q.m504i(textView, textView.getContext(), iArr, attributeSet, (TypedArray) m591r.f534c, i);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        int resourceId3 = typedArray.getResourceId(0, -1);
        if (typedArray.hasValue(3)) {
            this.f5109b = m2707c(context, m2762a, typedArray.getResourceId(3, 0));
        }
        if (typedArray.hasValue(1)) {
            this.f5110c = m2707c(context, m2762a, typedArray.getResourceId(1, 0));
        }
        if (typedArray.hasValue(4)) {
            this.f5111d = m2707c(context, m2762a, typedArray.getResourceId(4, 0));
        }
        if (typedArray.hasValue(2)) {
            this.f5112e = m2707c(context, m2762a, typedArray.getResourceId(2, 0));
        }
        if (typedArray.hasValue(5)) {
            this.f5113f = m2707c(context, m2762a, typedArray.getResourceId(5, 0));
        }
        if (typedArray.hasValue(6)) {
            this.f5114g = m2707c(context, m2762a, typedArray.getResourceId(6, 0));
        }
        m591r.m609t();
        boolean z4 = textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        int[] iArr2 = AbstractC0770a.f3915v;
        if (resourceId3 != -1) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(resourceId3, iArr2);
            C0198k c0198k = new C0198k(context, obtainStyledAttributes);
            if (z4 || !obtainStyledAttributes.hasValue(14)) {
                z2 = false;
                z3 = false;
            } else {
                z2 = obtainStyledAttributes.getBoolean(14, false);
                z3 = true;
            }
            m2717k(context, c0198k);
            if (obtainStyledAttributes.hasValue(15)) {
                str2 = obtainStyledAttributes.getString(15);
                i6 = 13;
            } else {
                i6 = 13;
                str2 = null;
            }
            str = obtainStyledAttributes.hasValue(i6) ? obtainStyledAttributes.getString(i6) : null;
            c0198k.m609t();
        } else {
            z2 = false;
            z3 = false;
            str = null;
            str2 = null;
        }
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr2, i, 0);
        C0198k c0198k2 = new C0198k(context, obtainStyledAttributes2);
        if (!z4 && obtainStyledAttributes2.hasValue(14)) {
            z2 = obtainStyledAttributes2.getBoolean(14, false);
            z3 = true;
        }
        boolean z5 = z2;
        if (obtainStyledAttributes2.hasValue(15)) {
            str2 = obtainStyledAttributes2.getString(15);
        }
        if (obtainStyledAttributes2.hasValue(13)) {
            str = obtainStyledAttributes2.getString(13);
        }
        if (obtainStyledAttributes2.hasValue(0) && obtainStyledAttributes2.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2717k(context, c0198k2);
        c0198k2.m609t();
        if (!z4 && z3) {
            textView.setAllCaps(z5);
        }
        Typeface typeface = this.f5119l;
        if (typeface != null) {
            if (this.f5118k == -1) {
                textView.setTypeface(typeface, this.f5117j);
            } else {
                textView.setTypeface(typeface);
            }
        }
        if (str != null) {
            AbstractC1086T.m2705d(textView, str);
        }
        if (str2 != null) {
            AbstractC1084S.m2697b(textView, AbstractC1084S.m2696a(str2));
        }
        int[] iArr3 = AbstractC0770a.f3902i;
        C1107c0 c1107c0 = this.f5116i;
        Context context2 = c1107c0.f5161h;
        TypedArray obtainStyledAttributes3 = context2.obtainStyledAttributes(attributeSet, iArr3, i, 0);
        TextView textView2 = c1107c0.f5160g;
        AbstractC0169Q.m504i(textView2, textView2.getContext(), iArr3, attributeSet, obtainStyledAttributes3, i);
        if (obtainStyledAttributes3.hasValue(5)) {
            c1107c0.f5154a = obtainStyledAttributes3.getInt(5, 0);
        }
        float dimension = obtainStyledAttributes3.hasValue(4) ? obtainStyledAttributes3.getDimension(4, -1.0f) : -1.0f;
        float dimension2 = obtainStyledAttributes3.hasValue(2) ? obtainStyledAttributes3.getDimension(2, -1.0f) : -1.0f;
        float dimension3 = obtainStyledAttributes3.hasValue(1) ? obtainStyledAttributes3.getDimension(1, -1.0f) : -1.0f;
        if (obtainStyledAttributes3.hasValue(3) && (resourceId2 = obtainStyledAttributes3.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes3.getResources().obtainTypedArray(resourceId2);
            int length = obtainTypedArray.length();
            int[] iArr4 = new int[length];
            if (length > 0) {
                for (int i7 = 0; i7 < length; i7++) {
                    iArr4[i7] = obtainTypedArray.getDimensionPixelSize(i7, -1);
                }
                int[] m2726a = C1107c0.m2726a(iArr4);
                c1107c0.f5158e = m2726a;
                boolean z6 = m2726a.length > 0;
                c1107c0.f5159f = z6;
                if (z6) {
                    c1107c0.f5154a = 1;
                    c1107c0.f5156c = m2726a[0];
                    c1107c0.f5157d = m2726a[r4 - 1];
                    c1107c0.f5155b = -1.0f;
                }
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes3.recycle();
        if (!c1107c0.m2727b()) {
            c1107c0.f5154a = 0;
        } else if (c1107c0.f5154a == 1) {
            if (!c1107c0.f5159f) {
                DisplayMetrics displayMetrics = context2.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    i5 = 2;
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                } else {
                    i5 = 2;
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(i5, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                if (dimension2 <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + dimension2 + "px) is less or equal to (0px)");
                }
                if (dimension3 <= dimension2) {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + dimension3 + "px) is less or equal to minimum auto-size text size (" + dimension2 + "px)");
                }
                if (dimension <= 0.0f) {
                    throw new IllegalArgumentException("The auto-size step granularity (" + dimension + "px) is less or equal to (0px)");
                }
                c1107c0.f5154a = 1;
                c1107c0.f5156c = dimension2;
                c1107c0.f5157d = dimension3;
                c1107c0.f5155b = dimension;
                c1107c0.f5159f = false;
            }
            if (c1107c0.m2727b() && c1107c0.f5154a == 1 && (!c1107c0.f5159f || c1107c0.f5158e.length == 0)) {
                int floor = ((int) Math.floor((c1107c0.f5157d - c1107c0.f5156c) / c1107c0.f5155b)) + 1;
                int[] iArr5 = new int[floor];
                for (int i8 = 0; i8 < floor; i8++) {
                    iArr5[i8] = AbstractC0062j.m150d(i8, c1107c0.f5155b, c1107c0.f5156c);
                }
                c1107c0.f5158e = C1107c0.m2726a(iArr5);
            }
        }
        if (c1107c0.f5154a != 0) {
            int[] iArr6 = c1107c0.f5158e;
            if (iArr6.length > 0) {
                if (AbstractC1086T.m2702a(textView) != -1.0f) {
                    AbstractC1086T.m2703b(textView, Math.round(c1107c0.f5156c), Math.round(c1107c0.f5157d), Math.round(c1107c0.f5155b), 0);
                } else {
                    AbstractC1086T.m2704c(textView, iArr6, 0);
                }
            }
        }
        TypedArray obtainStyledAttributes4 = context.obtainStyledAttributes(attributeSet, iArr3);
        int resourceId4 = obtainStyledAttributes4.getResourceId(8, -1);
        Drawable m2766b = resourceId4 != -1 ? m2762a.m2766b(context, resourceId4) : null;
        int resourceId5 = obtainStyledAttributes4.getResourceId(13, -1);
        Drawable m2766b2 = resourceId5 != -1 ? m2762a.m2766b(context, resourceId5) : null;
        int resourceId6 = obtainStyledAttributes4.getResourceId(9, -1);
        Drawable m2766b3 = resourceId6 != -1 ? m2762a.m2766b(context, resourceId6) : null;
        int resourceId7 = obtainStyledAttributes4.getResourceId(6, -1);
        Drawable m2766b4 = resourceId7 != -1 ? m2762a.m2766b(context, resourceId7) : null;
        int resourceId8 = obtainStyledAttributes4.getResourceId(10, -1);
        Drawable m2766b5 = resourceId8 != -1 ? m2762a.m2766b(context, resourceId8) : null;
        int resourceId9 = obtainStyledAttributes4.getResourceId(7, -1);
        Drawable m2766b6 = resourceId9 != -1 ? m2762a.m2766b(context, resourceId9) : null;
        if (m2766b5 != null || m2766b6 != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            if (m2766b5 == null) {
                m2766b5 = compoundDrawablesRelative[0];
            }
            if (m2766b2 == null) {
                m2766b2 = compoundDrawablesRelative[1];
            }
            if (m2766b6 == null) {
                m2766b6 = compoundDrawablesRelative[2];
            }
            if (m2766b4 == null) {
                m2766b4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(m2766b5, m2766b2, m2766b6, m2766b4);
        } else if (m2766b != null || m2766b2 != null || m2766b3 != null || m2766b4 != null) {
            Drawable[] compoundDrawablesRelative2 = textView.getCompoundDrawablesRelative();
            Drawable drawable = compoundDrawablesRelative2[0];
            if (drawable == null && compoundDrawablesRelative2[2] == null) {
                Drawable[] compoundDrawables = textView.getCompoundDrawables();
                if (m2766b == null) {
                    m2766b = compoundDrawables[0];
                }
                if (m2766b2 == null) {
                    m2766b2 = compoundDrawables[1];
                }
                if (m2766b3 == null) {
                    m2766b3 = compoundDrawables[2];
                }
                if (m2766b4 == null) {
                    m2766b4 = compoundDrawables[3];
                }
                textView.setCompoundDrawablesWithIntrinsicBounds(m2766b, m2766b2, m2766b3, m2766b4);
            } else {
                if (m2766b2 == null) {
                    m2766b2 = compoundDrawablesRelative2[1];
                }
                if (m2766b4 == null) {
                    m2766b4 = compoundDrawablesRelative2[3];
                }
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, m2766b2, compoundDrawablesRelative2[2], m2766b4);
            }
        }
        if (obtainStyledAttributes4.hasValue(11)) {
            if (!obtainStyledAttributes4.hasValue(11) || (resourceId = obtainStyledAttributes4.getResourceId(11, 0)) == 0 || (colorStateList = AbstractC1695c.m4959b(context, resourceId)) == null) {
                colorStateList = obtainStyledAttributes4.getColorStateList(11);
            }
            AbstractC0279m.m814f(textView, colorStateList);
        }
        if (obtainStyledAttributes4.hasValue(12)) {
            i2 = -1;
            AbstractC0279m.m815g(textView, AbstractC1118h0.m2730b(obtainStyledAttributes4.getInt(12, -1), null));
        } else {
            i2 = -1;
        }
        int dimensionPixelSize = obtainStyledAttributes4.getDimensionPixelSize(15, i2);
        int dimensionPixelSize2 = obtainStyledAttributes4.getDimensionPixelSize(18, i2);
        if (obtainStyledAttributes4.hasValue(19)) {
            TypedValue peekValue = obtainStyledAttributes4.peekValue(19);
            if (peekValue == null || peekValue.type != 5) {
                i3 = -1;
                f2 = obtainStyledAttributes4.getDimensionPixelSize(19, -1);
                i4 = -1;
            } else {
                int i9 = peekValue.data;
                int i10 = i9 & 15;
                f2 = TypedValue.complexToFloat(i9);
                i4 = i10;
                i3 = -1;
            }
        } else {
            i3 = -1;
            i4 = -1;
            f2 = -1.0f;
        }
        obtainStyledAttributes4.recycle();
        if (dimensionPixelSize != i3) {
            AbstractC1687o.m4938g(dimensionPixelSize);
            AbstractC0280n.m820d(textView, dimensionPixelSize);
        }
        if (dimensionPixelSize2 != i3) {
            AbstractC1687o.m4938g(dimensionPixelSize2);
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            int i11 = textView.getIncludeFontPadding() ? fontMetricsInt.bottom : fontMetricsInt.descent;
            if (dimensionPixelSize2 > Math.abs(i11)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), dimensionPixelSize2 - i11);
            }
        }
        if (f2 != -1.0f) {
            if (i4 == -1) {
                AbstractC0088l.m276o0(textView, (int) f2);
            } else if (Build.VERSION.SDK_INT >= 34) {
                AbstractC0281o.m821a(textView, i4, f2);
            } else {
                AbstractC0088l.m276o0(textView, Math.round(TypedValue.applyDimension(i4, f2, textView.getResources().getDisplayMetrics())));
            }
        }
    }

    /* renamed from: g */
    public final void m2714g(Context context, int i) {
        String string;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC0770a.f3915v);
        C0198k c0198k = new C0198k(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.f5108a;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        m2717k(context, c0198k);
        if (obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            AbstractC1086T.m2705d(textView, string);
        }
        c0198k.m609t();
        Typeface typeface = this.f5119l;
        if (typeface != null) {
            textView.setTypeface(typeface, this.f5117j);
        }
    }

    /* renamed from: i */
    public final void m2715i(ColorStateList colorStateList) {
        if (this.f5115h == null) {
            this.f5115h = new C1078O0();
        }
        C1078O0 c1078o0 = this.f5115h;
        c1078o0.f5083a = colorStateList;
        c1078o0.f5086d = colorStateList != null;
        this.f5109b = c1078o0;
        this.f5110c = c1078o0;
        this.f5111d = c1078o0;
        this.f5112e = c1078o0;
        this.f5113f = c1078o0;
        this.f5114g = c1078o0;
    }

    /* renamed from: j */
    public final void m2716j(PorterDuff.Mode mode) {
        if (this.f5115h == null) {
            this.f5115h = new C1078O0();
        }
        C1078O0 c1078o0 = this.f5115h;
        c1078o0.f5084b = mode;
        c1078o0.f5085c = mode != null;
        this.f5109b = c1078o0;
        this.f5110c = c1078o0;
        this.f5111d = c1078o0;
        this.f5112e = c1078o0;
        this.f5113f = c1078o0;
        this.f5114g = c1078o0;
    }

    /* renamed from: k */
    public final void m2717k(Context context, C0198k c0198k) {
        String string;
        int i = this.f5117j;
        TypedArray typedArray = (TypedArray) c0198k.f534c;
        this.f5117j = typedArray.getInt(2, i);
        int i2 = typedArray.getInt(11, -1);
        this.f5118k = i2;
        if (i2 != -1) {
            this.f5117j &= 2;
        }
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.f5120m = false;
                int i3 = typedArray.getInt(1, 1);
                if (i3 == 1) {
                    this.f5119l = Typeface.SANS_SERIF;
                    return;
                } else if (i3 == 2) {
                    this.f5119l = Typeface.SERIF;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.f5119l = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f5119l = null;
        int i4 = typedArray.hasValue(12) ? 12 : 10;
        int i5 = this.f5118k;
        int i6 = this.f5117j;
        if (!context.isRestricted()) {
            try {
                Typeface m600j = c0198k.m600j(i4, this.f5117j, new C1081Q(this, i5, i6, new WeakReference(this.f5108a)));
                if (m600j != null) {
                    if (this.f5118k != -1) {
                        this.f5119l = AbstractC1088U.m2706a(Typeface.create(m600j, 0), this.f5118k, (this.f5117j & 2) != 0);
                    } else {
                        this.f5119l = m600j;
                    }
                }
                this.f5120m = this.f5119l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f5119l != null || (string = typedArray.getString(i4)) == null) {
            return;
        }
        if (this.f5118k != -1) {
            this.f5119l = AbstractC1088U.m2706a(Typeface.create(string, 0), this.f5118k, (this.f5117j & 2) != 0);
        } else {
            this.f5119l = Typeface.create(string, this.f5117j);
        }
    }
}
