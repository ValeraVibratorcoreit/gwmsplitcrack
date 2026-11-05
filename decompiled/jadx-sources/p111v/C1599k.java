package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.sun.jna.Platform;
import p100r.AbstractC1378a;

/* renamed from: v.k */
/* loaded from: classes.dex */
public final class C1599k {

    /* renamed from: j */
    public static final SparseIntArray f9174j;

    /* renamed from: a */
    public int f9175a;

    /* renamed from: b */
    public int f9176b;

    /* renamed from: c */
    public int f9177c;

    /* renamed from: d */
    public float f9178d;

    /* renamed from: e */
    public float f9179e;

    /* renamed from: f */
    public float f9180f;

    /* renamed from: g */
    public int f9181g;

    /* renamed from: h */
    public String f9182h;

    /* renamed from: i */
    public int f9183i;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9174j = sparseIntArray;
        sparseIntArray.append(3, 1);
        sparseIntArray.append(5, 2);
        sparseIntArray.append(9, 3);
        sparseIntArray.append(2, 4);
        sparseIntArray.append(1, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(4, 7);
        sparseIntArray.append(8, 8);
        sparseIntArray.append(7, 9);
        sparseIntArray.append(6, 10);
    }

    /* renamed from: a */
    public final void m4758a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1605q.f9213f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f9174j.get(index)) {
                case 1:
                    this.f9179e = obtainStyledAttributes.getFloat(index, this.f9179e);
                    break;
                case 2:
                    this.f9177c = obtainStyledAttributes.getInt(index, this.f9177c);
                    break;
                case 3:
                    if (obtainStyledAttributes.peekValue(index).type == 3) {
                        obtainStyledAttributes.getString(index);
                        break;
                    } else {
                        String str = AbstractC1378a.f6463a[obtainStyledAttributes.getInteger(index, 0)];
                        break;
                    }
                case 4:
                    obtainStyledAttributes.getInt(index, 0);
                    break;
                case 5:
                    this.f9175a = C1602n.m4763f(obtainStyledAttributes, index, this.f9175a);
                    break;
                case 6:
                    this.f9176b = obtainStyledAttributes.getInteger(index, this.f9176b);
                    break;
                case 7:
                    this.f9178d = obtainStyledAttributes.getFloat(index, this.f9178d);
                    break;
                case 8:
                    this.f9181g = obtainStyledAttributes.getInteger(index, this.f9181g);
                    break;
                case Platform.GNU /* 9 */:
                    this.f9180f = obtainStyledAttributes.getFloat(index, this.f9180f);
                    break;
                case Platform.KFREEBSD /* 10 */:
                    int i2 = obtainStyledAttributes.peekValue(index).type;
                    if (i2 == 1) {
                        this.f9183i = obtainStyledAttributes.getResourceId(index, -1);
                        break;
                    } else if (i2 == 3) {
                        String string = obtainStyledAttributes.getString(index);
                        this.f9182h = string;
                        if (string.indexOf("/") > 0) {
                            this.f9183i = obtainStyledAttributes.getResourceId(index, -1);
                            break;
                        } else {
                            break;
                        }
                    } else {
                        obtainStyledAttributes.getInteger(index, this.f9183i);
                        break;
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
