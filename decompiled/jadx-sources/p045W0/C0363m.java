package p045W0;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import java.util.BitSet;
import p121y0.AbstractC1680h;

/* renamed from: W0.m */
/* loaded from: classes.dex */
public final class C0363m {

    /* renamed from: a */
    public final C0371u[] f1073a = new C0371u[4];

    /* renamed from: b */
    public final Matrix[] f1074b = new Matrix[4];

    /* renamed from: c */
    public final Matrix[] f1075c = new Matrix[4];

    /* renamed from: d */
    public final PointF f1076d = new PointF();

    /* renamed from: e */
    public final Path f1077e = new Path();

    /* renamed from: f */
    public final Path f1078f = new Path();

    /* renamed from: g */
    public final C0371u f1079g = new C0371u();

    /* renamed from: h */
    public final float[] f1080h = new float[2];

    /* renamed from: i */
    public final float[] f1081i = new float[2];

    /* renamed from: j */
    public final Path f1082j = new Path();

    /* renamed from: k */
    public final Path f1083k = new Path();

    /* renamed from: l */
    public final boolean f1084l = true;

    public C0363m() {
        for (int i = 0; i < 4; i++) {
            this.f1073a[i] = new C0371u();
            this.f1074b[i] = new Matrix();
            this.f1075c[i] = new Matrix();
        }
    }

    /* renamed from: a */
    public final void m969a(C0361k c0361k, float f2, RectF rectF, C0639g c0639g, Path path) {
        Matrix[] matrixArr;
        Matrix[] matrixArr2;
        C0371u[] c0371uArr;
        int i;
        float[] fArr;
        int i2;
        C0363m c0363m = this;
        path.rewind();
        Path path2 = c0363m.f1077e;
        path2.rewind();
        Path path3 = c0363m.f1078f;
        path3.rewind();
        path3.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            matrixArr = c0363m.f1075c;
            matrixArr2 = c0363m.f1074b;
            c0371uArr = c0363m.f1073a;
            i = 4;
            fArr = c0363m.f1080h;
            if (i3 >= 4) {
                break;
            }
            InterfaceC0353c interfaceC0353c = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0361k.f1065f : c0361k.f1064e : c0361k.f1067h : c0361k.f1066g;
            AbstractC1680h abstractC1680h = i3 != 1 ? i3 != 2 ? i3 != 3 ? c0361k.f1061b : c0361k.f1060a : c0361k.f1063d : c0361k.f1062c;
            C0371u c0371u = c0371uArr[i3];
            abstractC1680h.getClass();
            abstractC1680h.mo940o(c0371u, f2, interfaceC0353c.mo939a(rectF));
            int i4 = i3 + 1;
            float f3 = (i4 % 4) * 90;
            matrixArr2[i3].reset();
            PointF pointF = c0363m.f1076d;
            if (i3 == 1) {
                i2 = i4;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i4;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i4;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i4;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            C0371u c0371u2 = c0371uArr[i3];
            fArr[0] = c0371u2.f1104b;
            fArr[1] = c0371u2.f1105c;
            matrixArr2[i3].mapPoints(fArr);
            matrixArr[i3].reset();
            matrixArr[i3].setTranslate(fArr[0], fArr[1]);
            matrixArr[i3].preRotate(f3);
            i3 = i2;
        }
        int i5 = 0;
        while (i5 < i) {
            C0371u c0371u3 = c0371uArr[i5];
            c0371u3.getClass();
            fArr[0] = 0.0f;
            fArr[1] = c0371u3.f1103a;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 0) {
                path.moveTo(fArr[0], fArr[1]);
            } else {
                path.lineTo(fArr[0], fArr[1]);
            }
            c0371uArr[i5].m975b(matrixArr2[i5], path);
            if (c0639g != null) {
                C0371u c0371u4 = c0371uArr[i5];
                Matrix matrix = matrixArr2[i5];
                C0357g c0357g = (C0357g) c0639g.f3011g;
                BitSet bitSet = c0357g.f1029i;
                c0371u4.getClass();
                bitSet.set(i5, false);
                c0371u4.m974a(c0371u4.f1107e);
                c0357g.f1027g[i5] = new C0364n(new ArrayList(c0371u4.f1109g), new Matrix(matrix));
            }
            int i6 = i5 + 1;
            int i7 = i6 % 4;
            C0371u c0371u5 = c0371uArr[i5];
            fArr[0] = c0371u5.f1104b;
            fArr[1] = c0371u5.f1105c;
            matrixArr2[i5].mapPoints(fArr);
            C0371u c0371u6 = c0371uArr[i7];
            c0371u6.getClass();
            float[] fArr2 = c0363m.f1081i;
            fArr2[0] = 0.0f;
            fArr2[1] = c0371u6.f1103a;
            matrixArr2[i7].mapPoints(fArr2);
            float max = Math.max(((float) Math.hypot(fArr[0] - fArr2[0], fArr[1] - fArr2[1])) - 0.001f, 0.0f);
            C0371u c0371u7 = c0371uArr[i5];
            fArr[0] = c0371u7.f1104b;
            fArr[1] = c0371u7.f1105c;
            matrixArr2[i5].mapPoints(fArr);
            if (i5 == 1 || i5 == 3) {
                Math.abs(rectF.centerX() - fArr[0]);
            } else {
                Math.abs(rectF.centerY() - fArr[1]);
            }
            C0371u c0371u8 = c0363m.f1079g;
            c0371u8.m977d(0.0f, 270.0f, 0.0f);
            (i5 != 1 ? i5 != 2 ? i5 != 3 ? c0361k.f1069j : c0361k.f1068i : c0361k.f1071l : c0361k.f1070k).getClass();
            c0371u8.m976c(max, 0.0f);
            Path path4 = c0363m.f1082j;
            path4.reset();
            c0371u8.m975b(matrixArr[i5], path4);
            if (c0363m.f1084l && (c0363m.m970b(path4, i5) || c0363m.m970b(path4, i7))) {
                path4.op(path4, path3, Path.Op.DIFFERENCE);
                fArr[0] = 0.0f;
                fArr[1] = c0371u8.f1103a;
                matrixArr[i5].mapPoints(fArr);
                path2.moveTo(fArr[0], fArr[1]);
                c0371u8.m975b(matrixArr[i5], path2);
            } else {
                c0371u8.m975b(matrixArr[i5], path);
            }
            if (c0639g != null) {
                Matrix matrix2 = matrixArr[i5];
                C0357g c0357g2 = (C0357g) c0639g.f3011g;
                c0357g2.f1029i.set(i5 + 4, false);
                c0371u8.m974a(c0371u8.f1107e);
                c0357g2.f1028h[i5] = new C0364n(new ArrayList(c0371u8.f1109g), new Matrix(matrix2));
            }
            i = 4;
            c0363m = this;
            i5 = i6;
        }
        path.close();
        path2.close();
        if (path2.isEmpty()) {
            return;
        }
        path.op(path2, Path.Op.UNION);
    }

    /* renamed from: b */
    public final boolean m970b(Path path, int i) {
        Path path2 = this.f1083k;
        path2.reset();
        this.f1073a[i].m975b(this.f1074b[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }
}
