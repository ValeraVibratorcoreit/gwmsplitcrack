package p057b1;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.altaysoft.t500_split.R;
import p004B0.AbstractC0051a;
import p082l.C1096Y;
import p121y0.AbstractC1687o;

/* renamed from: b1.a */
/* loaded from: classes.dex */
public final class C0566a extends C1096Y {
    /* renamed from: h */
    public static int m1575h(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            int i3 = iArr[i2];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i3, typedValue) && typedValue.type == 2) {
                TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
                obtainStyledAttributes.recycle();
                i = dimensionPixelSize;
            } else {
                i = typedArray.getDimensionPixelSize(i3, -1);
            }
        }
        return i;
    }

    @Override // p082l.C1096Y, android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (AbstractC1687o.m4923R(context, R.attr.textAppearanceLineHeightEnabled, true)) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(i, AbstractC0051a.f183r);
            int m1575h = m1575h(getContext(), obtainStyledAttributes, 1, 2);
            obtainStyledAttributes.recycle();
            if (m1575h >= 0) {
                setLineHeight(m1575h);
            }
        }
    }
}
