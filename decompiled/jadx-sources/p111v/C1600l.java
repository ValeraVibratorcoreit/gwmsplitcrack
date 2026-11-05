package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: v.l */
/* loaded from: classes.dex */
public final class C1600l {

    /* renamed from: a */
    public int f9184a;

    /* renamed from: b */
    public int f9185b;

    /* renamed from: c */
    public float f9186c;

    /* renamed from: d */
    public float f9187d;

    /* renamed from: a */
    public final void m4759a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1605q.f9214g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 1) {
                this.f9186c = obtainStyledAttributes.getFloat(index, this.f9186c);
            } else if (index == 0) {
                int i2 = obtainStyledAttributes.getInt(index, this.f9184a);
                this.f9184a = i2;
                this.f9184a = C1602n.f9202d[i2];
            } else if (index == 4) {
                this.f9185b = obtainStyledAttributes.getInt(index, this.f9185b);
            } else if (index == 3) {
                this.f9187d = obtainStyledAttributes.getFloat(index, this.f9187d);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
