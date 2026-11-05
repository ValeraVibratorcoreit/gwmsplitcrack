package p068f0;

import android.view.animation.BaseInterpolator;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p036S.InterpolatorC0304d;

/* renamed from: f0.V */
/* loaded from: classes.dex */
public final class RunnableC0791V implements Runnable {

    /* renamed from: a */
    public int f3987a;

    /* renamed from: b */
    public int f3988b;

    /* renamed from: c */
    public OverScroller f3989c;

    /* renamed from: d */
    public Interpolator f3990d;

    /* renamed from: e */
    public boolean f3991e;

    /* renamed from: f */
    public boolean f3992f;

    /* renamed from: g */
    public final /* synthetic */ RecyclerView f3993g;

    public RunnableC0791V(RecyclerView recyclerView) {
        this.f3993g = recyclerView;
        InterpolatorC0304d interpolatorC0304d = RecyclerView.f2050A0;
        this.f3990d = interpolatorC0304d;
        this.f3991e = false;
        this.f3992f = false;
        this.f3989c = new OverScroller(recyclerView.getContext(), interpolatorC0304d);
    }

    /* renamed from: a */
    public final void m2266a() {
        if (this.f3991e) {
            this.f3992f = true;
            return;
        }
        RecyclerView recyclerView = this.f3993g;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        recyclerView.postOnAnimation(this);
    }

    /* renamed from: b */
    public final void m2267b(int i, int i2, int i3, BaseInterpolator baseInterpolator) {
        int i4;
        RecyclerView recyclerView = this.f3993g;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            boolean z2 = abs > abs2;
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            int width = z2 ? recyclerView.getWidth() : recyclerView.getHeight();
            int i5 = width / 2;
            float f2 = width;
            float f3 = i5;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f2) - 0.5f) * 0.47123894f)) * f3) + f3;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z2) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f2) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        Interpolator interpolator = baseInterpolator;
        if (baseInterpolator == null) {
            interpolator = RecyclerView.f2050A0;
        }
        if (this.f3990d != interpolator) {
            this.f3990d = interpolator;
            this.f3989c = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.f3988b = 0;
        this.f3987a = 0;
        recyclerView.setScrollState(2);
        this.f3989c.startScroll(0, 0, i, i2, i6);
        m2266a();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        RecyclerView recyclerView = this.f3993g;
        if (recyclerView.f2103q == null) {
            recyclerView.removeCallbacks(this);
            this.f3989c.abortAnimation();
            return;
        }
        this.f3992f = false;
        this.f3991e = true;
        recyclerView.m1524m();
        OverScroller overScroller = this.f3989c;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i5 = currX - this.f3987a;
            int i6 = currY - this.f3988b;
            this.f3987a = currX;
            this.f3988b = currY;
            int[] iArr = recyclerView.f2112u0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean m1530s = recyclerView.m1530s(i5, i6, iArr, null, 1);
            int[] iArr2 = recyclerView.f2112u0;
            if (m1530s) {
                i5 -= iArr2[0];
                i6 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.m1523l(i5, i6);
            }
            if (recyclerView.f2101p != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.m1511Y(i5, i6, iArr2);
                int i7 = iArr2[0];
                int i8 = iArr2[1];
                int i9 = i5 - i7;
                int i10 = i6 - i8;
                C0824v c0824v = recyclerView.f2103q.f3936e;
                if (c0824v != null && !c0824v.f4190d && c0824v.f4191e) {
                    int m2265b = recyclerView.f2088i0.m2265b();
                    if (m2265b == 0) {
                        c0824v.m2328i();
                    } else if (c0824v.f4187a >= m2265b) {
                        c0824v.f4187a = m2265b - 1;
                        c0824v.m2327g(i7, i8);
                    } else {
                        c0824v.m2327g(i7, i8);
                    }
                }
                i4 = i7;
                i = i9;
                i2 = i10;
                i3 = i8;
            } else {
                i = i5;
                i2 = i6;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.f2105r.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.f2112u0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i11 = i3;
            recyclerView.m1531t(i4, i3, i, i2, null, 1, iArr3);
            int i12 = i - iArr2[0];
            int i13 = i2 - iArr2[1];
            if (i4 != 0 || i11 != 0) {
                recyclerView.m1532u(i4, i11);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            boolean z2 = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i12 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i13 != 0));
            C0824v c0824v2 = recyclerView.f2103q.f3936e;
            if ((c0824v2 == null || !c0824v2.f4190d) && z2) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    int i14 = i12 < 0 ? -currVelocity : i12 > 0 ? currVelocity : 0;
                    if (i13 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i13 <= 0) {
                        currVelocity = 0;
                    }
                    if (i14 < 0) {
                        recyclerView.m1534w();
                        if (recyclerView.f2062J.isFinished()) {
                            recyclerView.f2062J.onAbsorb(-i14);
                        }
                    } else if (i14 > 0) {
                        recyclerView.m1535x();
                        if (recyclerView.f2064L.isFinished()) {
                            recyclerView.f2064L.onAbsorb(i14);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.m1536y();
                        if (recyclerView.f2063K.isFinished()) {
                            recyclerView.f2063K.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.m1533v();
                        if (recyclerView.f2065M.isFinished()) {
                            recyclerView.f2065M.onAbsorb(currVelocity);
                        }
                    }
                    if (i14 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                C0815m c0815m = recyclerView.f2086h0;
                int[] iArr4 = c0815m.f4139c;
                if (iArr4 != null) {
                    Arrays.fill(iArr4, -1);
                }
                c0815m.f4140d = 0;
            } else {
                m2266a();
                RunnableC0817o runnableC0817o = recyclerView.f2084g0;
                if (runnableC0817o != null) {
                    runnableC0817o.m2318a(recyclerView, i4, i11);
                }
            }
        }
        C0824v c0824v3 = recyclerView.f2103q.f3936e;
        if (c0824v3 != null && c0824v3.f4190d) {
            c0824v3.m2327g(0, 0);
        }
        this.f3991e = false;
        if (!this.f3992f) {
            recyclerView.setScrollState(0);
            recyclerView.m1517e0(1);
        } else {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            recyclerView.postOnAnimation(this);
        }
    }
}
