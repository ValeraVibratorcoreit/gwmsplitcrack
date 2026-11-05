package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import com.sun.jna.Platform;

/* renamed from: v.m */
/* loaded from: classes.dex */
public final class C1601m {

    /* renamed from: n */
    public static final SparseIntArray f9188n;

    /* renamed from: a */
    public float f9189a;

    /* renamed from: b */
    public float f9190b;

    /* renamed from: c */
    public float f9191c;

    /* renamed from: d */
    public float f9192d;

    /* renamed from: e */
    public float f9193e;

    /* renamed from: f */
    public float f9194f;

    /* renamed from: g */
    public float f9195g;

    /* renamed from: h */
    public int f9196h;

    /* renamed from: i */
    public float f9197i;

    /* renamed from: j */
    public float f9198j;

    /* renamed from: k */
    public float f9199k;

    /* renamed from: l */
    public boolean f9200l;

    /* renamed from: m */
    public float f9201m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f9188n = sparseIntArray;
        sparseIntArray.append(6, 1);
        sparseIntArray.append(7, 2);
        sparseIntArray.append(8, 3);
        sparseIntArray.append(4, 4);
        sparseIntArray.append(5, 5);
        sparseIntArray.append(0, 6);
        sparseIntArray.append(1, 7);
        sparseIntArray.append(2, 8);
        sparseIntArray.append(3, 9);
        sparseIntArray.append(9, 10);
        sparseIntArray.append(10, 11);
        sparseIntArray.append(11, 12);
    }

    /* renamed from: a */
    public final void m4760a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1605q.f9216i);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            switch (f9188n.get(index)) {
                case 1:
                    this.f9189a = obtainStyledAttributes.getFloat(index, this.f9189a);
                    break;
                case 2:
                    this.f9190b = obtainStyledAttributes.getFloat(index, this.f9190b);
                    break;
                case 3:
                    this.f9191c = obtainStyledAttributes.getFloat(index, this.f9191c);
                    break;
                case 4:
                    this.f9192d = obtainStyledAttributes.getFloat(index, this.f9192d);
                    break;
                case 5:
                    this.f9193e = obtainStyledAttributes.getFloat(index, this.f9193e);
                    break;
                case 6:
                    this.f9194f = obtainStyledAttributes.getDimension(index, this.f9194f);
                    break;
                case 7:
                    this.f9195g = obtainStyledAttributes.getDimension(index, this.f9195g);
                    break;
                case 8:
                    this.f9197i = obtainStyledAttributes.getDimension(index, this.f9197i);
                    break;
                case Platform.GNU /* 9 */:
                    this.f9198j = obtainStyledAttributes.getDimension(index, this.f9198j);
                    break;
                case Platform.KFREEBSD /* 10 */:
                    this.f9199k = obtainStyledAttributes.getDimension(index, this.f9199k);
                    break;
                case Platform.NETBSD /* 11 */:
                    this.f9200l = true;
                    this.f9201m = obtainStyledAttributes.getDimension(index, this.f9201m);
                    break;
                case Platform.DRAGONFLYBSD /* 12 */:
                    this.f9196h = C1602n.m4763f(obtainStyledAttributes, index, this.f9196h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
