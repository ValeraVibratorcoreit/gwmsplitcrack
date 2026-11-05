package p111v;

import java.util.Arrays;

/* renamed from: v.h */
/* loaded from: classes.dex */
public final class C1596h {

    /* renamed from: a */
    public int[] f9088a;

    /* renamed from: b */
    public int[] f9089b;

    /* renamed from: c */
    public int f9090c;

    /* renamed from: d */
    public int[] f9091d;

    /* renamed from: e */
    public float[] f9092e;

    /* renamed from: f */
    public int f9093f;

    /* renamed from: g */
    public int[] f9094g;

    /* renamed from: h */
    public String[] f9095h;

    /* renamed from: i */
    public int f9096i;

    /* renamed from: j */
    public int[] f9097j;

    /* renamed from: k */
    public boolean[] f9098k;

    /* renamed from: l */
    public int f9099l;

    /* renamed from: a */
    public final void m4752a(int i, float f2) {
        int i2 = this.f9093f;
        int[] iArr = this.f9091d;
        if (i2 >= iArr.length) {
            this.f9091d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f9092e;
            this.f9092e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f9091d;
        int i3 = this.f9093f;
        iArr2[i3] = i;
        float[] fArr2 = this.f9092e;
        this.f9093f = i3 + 1;
        fArr2[i3] = f2;
    }

    /* renamed from: b */
    public final void m4753b(int i, int i2) {
        int i3 = this.f9090c;
        int[] iArr = this.f9088a;
        if (i3 >= iArr.length) {
            this.f9088a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f9089b;
            this.f9089b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f9088a;
        int i4 = this.f9090c;
        iArr3[i4] = i;
        int[] iArr4 = this.f9089b;
        this.f9090c = i4 + 1;
        iArr4[i4] = i2;
    }

    /* renamed from: c */
    public final void m4754c(int i, String str) {
        int i2 = this.f9096i;
        int[] iArr = this.f9094g;
        if (i2 >= iArr.length) {
            this.f9094g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f9095h;
            this.f9095h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f9094g;
        int i3 = this.f9096i;
        iArr2[i3] = i;
        String[] strArr2 = this.f9095h;
        this.f9096i = i3 + 1;
        strArr2[i3] = str;
    }

    /* renamed from: d */
    public final void m4755d(int i, boolean z2) {
        int i2 = this.f9099l;
        int[] iArr = this.f9097j;
        if (i2 >= iArr.length) {
            this.f9097j = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f9098k;
            this.f9098k = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.f9097j;
        int i3 = this.f9099l;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f9098k;
        this.f9099l = i3 + 1;
        zArr2[i3] = z2;
    }
}
