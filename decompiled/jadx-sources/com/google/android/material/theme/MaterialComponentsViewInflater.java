package com.google.android.material.theme;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.R;
import com.google.android.material.button.MaterialButton;
import p004B0.AbstractC0051a;
import p010D1.AbstractC0088l;
import p023K0.C0230c;
import p033Q.AbstractC0268b;
import p034Q0.AbstractC0294k;
import p037S0.C0306a;
import p054a1.C0513v;
import p057b1.C0566a;
import p060c1.AbstractC0577a;
import p070g.C0854C;
import p082l.C1053C;
import p082l.C1096Y;
import p082l.C1131o;
import p082l.C1135q;
import p121y0.AbstractC1687o;

/* loaded from: classes.dex */
public class MaterialComponentsViewInflater extends C0854C {
    @Override // p070g.C0854C
    /* renamed from: a */
    public final C1131o mo2136a(Context context, AttributeSet attributeSet) {
        return new C0513v(context, attributeSet);
    }

    @Override // p070g.C0854C
    /* renamed from: b */
    public final AppCompatButton mo2137b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // p070g.C0854C
    /* renamed from: c */
    public final C1135q mo2138c(Context context, AttributeSet attributeSet) {
        return new C0230c(context, attributeSet);
    }

    @Override // p070g.C0854C
    /* renamed from: d */
    public final C1053C mo2139d(Context context, AttributeSet attributeSet) {
        C0306a c0306a = new C0306a(AbstractC0577a.m1578a(context, attributeSet, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = c0306a.getContext();
        TypedArray m846g = AbstractC0294k.m846g(context2, attributeSet, AbstractC0051a.f181p, R.attr.radioButtonStyle, R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (m846g.hasValue(0)) {
            AbstractC0268b.m788c(c0306a, AbstractC0088l.m255B(context2, m846g, 0));
        }
        c0306a.f877k = m846g.getBoolean(1, false);
        m846g.recycle();
        return c0306a;
    }

    @Override // p070g.C0854C
    /* renamed from: e */
    public final C1096Y mo2140e(Context context, AttributeSet attributeSet) {
        C0566a c0566a = new C0566a(AbstractC0577a.m1578a(context, attributeSet, android.R.attr.textViewStyle, 0), attributeSet, android.R.attr.textViewStyle);
        Context context2 = c0566a.getContext();
        if (AbstractC1687o.m4923R(context2, R.attr.textAppearanceLineHeightEnabled, true)) {
            Resources.Theme theme = context2.getTheme();
            int[] iArr = AbstractC0051a.f184s;
            TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
            int m1575h = C0566a.m1575h(context2, obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m1575h == -1) {
                TypedArray obtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, android.R.attr.textViewStyle, 0);
                int resourceId = obtainStyledAttributes2.getResourceId(0, -1);
                obtainStyledAttributes2.recycle();
                if (resourceId != -1) {
                    TypedArray obtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, AbstractC0051a.f183r);
                    int m1575h2 = C0566a.m1575h(c0566a.getContext(), obtainStyledAttributes3, 1, 2);
                    obtainStyledAttributes3.recycle();
                    if (m1575h2 >= 0) {
                        c0566a.setLineHeight(m1575h2);
                    }
                }
            }
        }
        return c0566a;
    }
}
