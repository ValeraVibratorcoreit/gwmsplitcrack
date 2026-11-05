package p080k0;

import p006C.C0063k;
import p121y0.AbstractC1687o;

/* renamed from: k0.l */
/* loaded from: classes.dex */
public abstract class AbstractC1043l extends AbstractC1042k {

    /* renamed from: a */
    public C0063k[] f4949a;

    /* renamed from: b */
    public String f4950b;

    /* renamed from: c */
    public int f4951c;

    public AbstractC1043l() {
        this.f4949a = null;
        this.f4951c = 0;
    }

    public C0063k[] getPathData() {
        return this.f4949a;
    }

    public String getPathName() {
        return this.f4950b;
    }

    public void setPathData(C0063k[] c0063kArr) {
        C0063k[] c0063kArr2 = this.f4949a;
        boolean z2 = false;
        if (c0063kArr2 != null && c0063kArr != null && c0063kArr2.length == c0063kArr.length) {
            int i = 0;
            while (true) {
                if (i >= c0063kArr2.length) {
                    z2 = true;
                    break;
                }
                C0063k c0063k = c0063kArr2[i];
                char c2 = c0063k.f208a;
                C0063k c0063k2 = c0063kArr[i];
                if (c2 != c0063k2.f208a || c0063k.f209b.length != c0063k2.f209b.length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        if (!z2) {
            this.f4949a = AbstractC1687o.m4946o(c0063kArr);
            return;
        }
        C0063k[] c0063kArr3 = this.f4949a;
        for (int i2 = 0; i2 < c0063kArr.length; i2++) {
            c0063kArr3[i2].f208a = c0063kArr[i2].f208a;
            int i3 = 0;
            while (true) {
                float[] fArr = c0063kArr[i2].f209b;
                if (i3 < fArr.length) {
                    c0063kArr3[i2].f209b[i3] = fArr[i3];
                    i3++;
                }
            }
        }
    }

    public AbstractC1043l(AbstractC1043l abstractC1043l) {
        this.f4949a = null;
        this.f4951c = 0;
        this.f4950b = abstractC1043l.f4950b;
        this.f4949a = AbstractC1687o.m4946o(abstractC1043l.f4949a);
    }
}
