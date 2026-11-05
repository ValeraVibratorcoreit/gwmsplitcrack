package p077j0;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import p121y0.AbstractC1687o;

/* renamed from: j0.A */
/* loaded from: classes.dex */
public class C0965A extends AbstractC1687o {

    /* renamed from: d */
    public static boolean f4633d = true;

    /* renamed from: e */
    public static boolean f4634e = true;

    /* renamed from: f */
    public static boolean f4635f = true;

    /* renamed from: g */
    public static boolean f4636g = true;

    @Override // p121y0.AbstractC1687o
    /* renamed from: a0 */
    public void mo2508a0(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.mo2508a0(view, i);
        } else if (f4636g) {
            try {
                AbstractC0995z.m2576a(view, i);
            } catch (NoSuchMethodError unused) {
                f4636g = false;
            }
        }
    }

    /* renamed from: c0 */
    public void mo2509c0(View view, int i, int i2, int i3, int i4) {
        if (f4635f) {
            try {
                AbstractC0994y.m2575a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f4635f = false;
            }
        }
    }

    /* renamed from: d0 */
    public void mo2510d0(View view, Matrix matrix) {
        if (f4633d) {
            try {
                AbstractC0993x.m2573b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4633d = false;
            }
        }
    }

    /* renamed from: e0 */
    public void mo2511e0(View view, Matrix matrix) {
        if (f4634e) {
            try {
                AbstractC0993x.m2574c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f4634e = false;
            }
        }
    }
}
