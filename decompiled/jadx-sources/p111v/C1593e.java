package p111v;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sun.jna.Function;
import p097q.AbstractC1241e;
import p102s.AbstractC1412j;
import p102s.C1405c;
import p102s.C1406d;
import p102s.C1407e;
import p102s.C1409g;
import p105t.C1441b;

/* renamed from: v.e */
/* loaded from: classes.dex */
public final class C1593e {

    /* renamed from: a */
    public final ConstraintLayout f9072a;

    /* renamed from: b */
    public int f9073b;

    /* renamed from: c */
    public int f9074c;

    /* renamed from: d */
    public int f9075d;

    /* renamed from: e */
    public int f9076e;

    /* renamed from: f */
    public int f9077f;

    /* renamed from: g */
    public int f9078g;

    /* renamed from: h */
    public final /* synthetic */ ConstraintLayout f9079h;

    public C1593e(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.f9079h = constraintLayout;
        this.f9072a = constraintLayout2;
    }

    /* renamed from: a */
    public static boolean m4749a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    /* renamed from: b */
    public final void m4750b(C1406d c1406d, C1441b c1441b) {
        int makeMeasureSpec;
        int makeMeasureSpec2;
        int max;
        int i;
        int i2;
        boolean z2;
        int measuredWidth;
        int baseline;
        int i3;
        if (c1406d == null) {
            return;
        }
        if (c1406d.f6667g0 == 8) {
            c1441b.f6800e = 0;
            c1441b.f6801f = 0;
            c1441b.f6802g = 0;
            return;
        }
        if (c1406d.f6647T == null) {
            return;
        }
        int i4 = c1441b.f6796a;
        int i5 = c1441b.f6797b;
        int i6 = c1441b.f6798c;
        int i7 = c1441b.f6799d;
        int i8 = this.f9073b + this.f9074c;
        int i9 = this.f9075d;
        View view = c1406d.f6665f0;
        int m2943b = AbstractC1241e.m2943b(i4);
        C1405c c1405c = c1406d.f6638K;
        C1405c c1405c2 = c1406d.f6636I;
        if (m2943b == 0) {
            makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        } else if (m2943b == 1) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9077f, i9, -2);
        } else if (m2943b == 2) {
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f9077f, i9, -2);
            boolean z3 = c1406d.f6687r == 1;
            int i10 = c1441b.f6805j;
            if (i10 == 1 || i10 == 2) {
                boolean z4 = view.getMeasuredHeight() == c1406d.m3390k();
                if (c1441b.f6805j == 2 || !z3 || ((z3 && z4) || c1406d.mo3347A())) {
                    makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(c1406d.m3394q(), 1073741824);
                }
            }
        } else if (m2943b != 3) {
            makeMeasureSpec = 0;
        } else {
            int i11 = this.f9077f;
            int i12 = c1405c2 != null ? c1405c2.f6625g : 0;
            if (c1405c != null) {
                i12 += c1405c.f6625g;
            }
            makeMeasureSpec = ViewGroup.getChildMeasureSpec(i11, i9 + i12, -1);
        }
        int m2943b2 = AbstractC1241e.m2943b(i5);
        if (m2943b2 == 0) {
            makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else if (m2943b2 == 1) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9078g, i8, -2);
        } else if (m2943b2 == 2) {
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f9078g, i8, -2);
            boolean z5 = c1406d.f6688s == 1;
            int i13 = c1441b.f6805j;
            if (i13 == 1 || i13 == 2) {
                boolean z6 = view.getMeasuredWidth() == c1406d.m3394q();
                if (c1441b.f6805j == 2 || !z5 || ((z5 && z6) || c1406d.mo3348B())) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(c1406d.m3390k(), 1073741824);
                }
            }
        } else if (m2943b2 != 3) {
            makeMeasureSpec2 = 0;
        } else {
            int i14 = this.f9078g;
            int i15 = c1405c2 != null ? c1406d.f6637J.f6625g : 0;
            if (c1405c != null) {
                i15 += c1406d.f6639L.f6625g;
            }
            makeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i14, i8 + i15, -1);
        }
        C1407e c1407e = (C1407e) c1406d.f6647T;
        ConstraintLayout constraintLayout = this.f9079h;
        if (c1407e != null && AbstractC1412j.m3425c(constraintLayout.f1865n, Function.MAX_NARGS) && view.getMeasuredWidth() == c1406d.m3394q() && view.getMeasuredWidth() < c1407e.m3394q() && view.getMeasuredHeight() == c1406d.m3390k() && view.getMeasuredHeight() < c1407e.m3390k() && view.getBaseline() == c1406d.f6655a0 && !c1406d.m3403z() && m4749a(c1406d.f6634G, makeMeasureSpec, c1406d.m3394q()) && m4749a(c1406d.f6635H, makeMeasureSpec2, c1406d.m3390k())) {
            c1441b.f6800e = c1406d.m3394q();
            c1441b.f6801f = c1406d.m3390k();
            c1441b.f6802g = c1406d.f6655a0;
            return;
        }
        boolean z7 = i4 == 3;
        boolean z8 = i5 == 3;
        boolean z9 = i5 == 4 || i5 == 1;
        boolean z10 = i4 == 4 || i4 == 1;
        boolean z11 = z7 && c1406d.f6650W > 0.0f;
        boolean z12 = z8 && c1406d.f6650W > 0.0f;
        if (view == null) {
            return;
        }
        C1592d c1592d = (C1592d) view.getLayoutParams();
        int i16 = c1441b.f6805j;
        if (i16 != 1 && i16 != 2 && z7 && c1406d.f6687r == 0 && z8 && c1406d.f6688s == 0) {
            z2 = false;
            measuredWidth = 0;
            i3 = -1;
            baseline = 0;
            max = 0;
        } else {
            if ((view instanceof AbstractC1607s) && (c1406d instanceof C1409g)) {
                ((AbstractC1607s) view).mo1310j((C1409g) c1406d, makeMeasureSpec, makeMeasureSpec2);
            } else {
                view.measure(makeMeasureSpec, makeMeasureSpec2);
            }
            c1406d.f6634G = makeMeasureSpec;
            c1406d.f6635H = makeMeasureSpec2;
            c1406d.f6666g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i17 = c1406d.f6690u;
            int max2 = i17 > 0 ? Math.max(i17, measuredWidth2) : measuredWidth2;
            int i18 = c1406d.f6691v;
            if (i18 > 0) {
                max2 = Math.min(i18, max2);
            }
            int i19 = c1406d.f6693x;
            max = i19 > 0 ? Math.max(i19, measuredHeight) : measuredHeight;
            int i20 = makeMeasureSpec;
            int i21 = c1406d.f6694y;
            if (i21 > 0) {
                max = Math.min(i21, max);
            }
            if (!AbstractC1412j.m3425c(constraintLayout.f1865n, 1)) {
                if (z11 && z9) {
                    max2 = (int) ((max * c1406d.f6650W) + 0.5f);
                } else if (z12 && z10) {
                    max = (int) ((max2 / c1406d.f6650W) + 0.5f);
                }
            }
            if (measuredWidth2 == max2 && measuredHeight == max) {
                baseline = baseline2;
                measuredWidth = max2;
                z2 = false;
            } else {
                if (measuredWidth2 != max2) {
                    i = 1073741824;
                    i2 = View.MeasureSpec.makeMeasureSpec(max2, 1073741824);
                } else {
                    i = 1073741824;
                    i2 = i20;
                }
                if (measuredHeight != max) {
                    makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(max, i);
                }
                view.measure(i2, makeMeasureSpec2);
                c1406d.f6634G = i2;
                c1406d.f6635H = makeMeasureSpec2;
                z2 = false;
                c1406d.f6666g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                max = measuredHeight2;
            }
            i3 = -1;
        }
        boolean z13 = baseline != i3 ? true : z2;
        if (measuredWidth != c1441b.f6798c || max != c1441b.f6799d) {
            z2 = true;
        }
        c1441b.f6804i = z2;
        boolean z14 = c1592d.f9035c0 ? true : z13;
        if (z14 && baseline != -1 && c1406d.f6655a0 != baseline) {
            c1441b.f6804i = true;
        }
        c1441b.f6800e = measuredWidth;
        c1441b.f6801f = max;
        c1441b.f6803h = z14;
        c1441b.f6802g = baseline;
    }
}
