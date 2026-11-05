package p095p0;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Array;
import java.util.Arrays;
import p034Q0.C0295l;
import p068f0.AbstractC0781K;
import p068f0.C0779I;
import p092o0.C1204b;

/* renamed from: p0.d */
/* loaded from: classes.dex */
public final class C1225d extends AbstractC0781K {

    /* renamed from: a */
    public C1204b f5471a;

    /* renamed from: b */
    public final ViewPager2 f5472b;

    /* renamed from: c */
    public final C1234m f5473c;

    /* renamed from: d */
    public final LinearLayoutManager f5474d;

    /* renamed from: e */
    public int f5475e;

    /* renamed from: f */
    public int f5476f;

    /* renamed from: g */
    public final C1224c f5477g;

    /* renamed from: h */
    public int f5478h;

    /* renamed from: i */
    public int f5479i;

    /* renamed from: j */
    public boolean f5480j;

    /* renamed from: k */
    public boolean f5481k;

    /* renamed from: l */
    public boolean f5482l;

    public C1225d(ViewPager2 viewPager2) {
        this.f5472b = viewPager2;
        C1234m c1234m = viewPager2.f2153o;
        this.f5473c = c1234m;
        this.f5474d = (LinearLayoutManager) c1234m.getLayoutManager();
        this.f5477g = new C1224c();
        m2901e();
    }

    @Override // p068f0.AbstractC0781K
    /* renamed from: a */
    public final void mo2075a(RecyclerView recyclerView, int i) {
        C1204b c1204b;
        int i2 = this.f5475e;
        boolean z2 = true;
        if (!(i2 == 1 && this.f5476f == 1) && i == 1) {
            this.f5475e = 1;
            int i3 = this.f5479i;
            if (i3 != -1) {
                this.f5478h = i3;
                this.f5479i = -1;
            } else if (this.f5478h == -1) {
                this.f5478h = this.f5474d.m1449M0();
            }
            m2900d(1);
            return;
        }
        if ((i2 == 1 || i2 == 4) && i == 2) {
            if (this.f5481k) {
                m2900d(2);
                this.f5480j = true;
                return;
            }
            return;
        }
        if (i2 != 1 && i2 != 4) {
            z2 = false;
        }
        C1224c c1224c = this.f5477g;
        if (z2 && i == 0) {
            m2902f();
            if (!this.f5481k) {
                int i4 = c1224c.f5468a;
                if (i4 != -1 && (c1204b = this.f5471a) != null) {
                    c1204b.mo1160b(i4, 0.0f, 0);
                }
            } else if (c1224c.f5470c == 0) {
                int i5 = this.f5478h;
                int i6 = c1224c.f5468a;
                if (i5 != i6) {
                    m2899c(i6);
                }
            }
            m2900d(0);
            m2901e();
        }
        if (this.f5475e == 2 && i == 0 && this.f5482l) {
            m2902f();
            if (c1224c.f5470c == 0) {
                int i7 = this.f5479i;
                int i8 = c1224c.f5468a;
                if (i7 != i8) {
                    if (i8 == -1) {
                        i8 = 0;
                    }
                    m2899c(i8);
                }
                m2900d(0);
                m2901e();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if ((r7 < 0) == (r5.f5472b.f2150l.m2227C() == 1)) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    @Override // p068f0.AbstractC0781K
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo2076b(RecyclerView recyclerView, int i, int i2) {
        int i3;
        this.f5481k = true;
        m2902f();
        boolean z2 = this.f5480j;
        C1224c c1224c = this.f5477g;
        if (z2) {
            this.f5480j = false;
            if (i2 <= 0) {
                if (i2 == 0) {
                }
                i3 = c1224c.f5468a;
                this.f5479i = i3;
                if (this.f5478h != i3) {
                    m2899c(i3);
                }
            }
            if (c1224c.f5470c != 0) {
                i3 = c1224c.f5468a + 1;
                this.f5479i = i3;
                if (this.f5478h != i3) {
                }
            }
            i3 = c1224c.f5468a;
            this.f5479i = i3;
            if (this.f5478h != i3) {
            }
        } else if (this.f5475e == 0) {
            int i4 = c1224c.f5468a;
            if (i4 == -1) {
                i4 = 0;
            }
            m2899c(i4);
        }
        int i5 = c1224c.f5468a;
        if (i5 == -1) {
            i5 = 0;
        }
        float f2 = c1224c.f5469b;
        int i6 = c1224c.f5470c;
        C1204b c1204b = this.f5471a;
        if (c1204b != null) {
            c1204b.mo1160b(i5, f2, i6);
        }
        int i7 = c1224c.f5468a;
        int i8 = this.f5479i;
        if ((i7 == i8 || i8 == -1) && c1224c.f5470c == 0 && this.f5476f != 1) {
            m2900d(0);
            m2901e();
        }
    }

    /* renamed from: c */
    public final void m2899c(int i) {
        C1204b c1204b = this.f5471a;
        if (c1204b != null) {
            c1204b.mo1161c(i);
        }
    }

    /* renamed from: d */
    public final void m2900d(int i) {
        if ((this.f5475e == 3 && this.f5476f == 0) || this.f5476f == i) {
            return;
        }
        this.f5476f = i;
        C1204b c1204b = this.f5471a;
        if (c1204b != null) {
            c1204b.mo1159a(i);
        }
    }

    /* renamed from: e */
    public final void m2901e() {
        this.f5475e = 0;
        this.f5476f = 0;
        C1224c c1224c = this.f5477g;
        c1224c.f5468a = -1;
        c1224c.f5469b = 0.0f;
        c1224c.f5470c = 0;
        this.f5478h = -1;
        this.f5479i = -1;
        this.f5480j = false;
        this.f5481k = false;
        this.f5482l = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0138, code lost:
    
        r1 = r0.m2247v();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013c, code lost:
    
        if (r3 >= r1) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0146, code lost:
    
        if (p095p0.C1222a.m2898a(r0.m2245u(r3)) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0148, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0152, code lost:
    
        throw new java.lang.IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0153, code lost:
    
        r1 = java.util.Locale.US;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0162, code lost:
    
        throw new java.lang.IllegalStateException(p006C.AbstractC0062j.m156j(r2.f5470c, "Page can only be offset by a positive amount, not by "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012f, code lost:
    
        if (r5[r1 - 1][1] >= r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0136, code lost:
    
        if (r0.m2247v() <= 1) goto L63;
     */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2902f() {
        int top;
        int top2;
        int i;
        int bottom;
        int i2;
        LinearLayoutManager linearLayoutManager = this.f5474d;
        int m1449M0 = linearLayoutManager.m1449M0();
        C1224c c1224c = this.f5477g;
        c1224c.f5468a = m1449M0;
        int i3 = 0;
        if (m1449M0 == -1) {
            c1224c.f5468a = -1;
            c1224c.f5469b = 0.0f;
            c1224c.f5470c = 0;
            return;
        }
        View mo1479q = linearLayoutManager.mo1479q(m1449M0);
        if (mo1479q == null) {
            c1224c.f5468a = -1;
            c1224c.f5469b = 0.0f;
            c1224c.f5470c = 0;
            return;
        }
        int i4 = ((C0779I) mo1479q.getLayoutParams()).f3948b.left;
        int i5 = ((C0779I) mo1479q.getLayoutParams()).f3948b.right;
        int i6 = ((C0779I) mo1479q.getLayoutParams()).f3948b.top;
        int i7 = ((C0779I) mo1479q.getLayoutParams()).f3948b.bottom;
        ViewGroup.LayoutParams layoutParams = mo1479q.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            i4 += marginLayoutParams.leftMargin;
            i5 += marginLayoutParams.rightMargin;
            i6 += marginLayoutParams.topMargin;
            i7 += marginLayoutParams.bottomMargin;
        }
        int height = mo1479q.getHeight() + i6 + i7;
        int width = mo1479q.getWidth() + i4 + i5;
        int i8 = linearLayoutManager.f2039p;
        C1234m c1234m = this.f5473c;
        if (i8 == 0) {
            top = (mo1479q.getLeft() - i4) - c1234m.getPaddingLeft();
            if (this.f5472b.f2150l.m2227C() == 1) {
                top = -top;
            }
            height = width;
        } else {
            top = (mo1479q.getTop() - i6) - c1234m.getPaddingTop();
        }
        int i9 = -top;
        c1224c.f5470c = i9;
        if (i9 >= 0) {
            c1224c.f5469b = height != 0 ? i9 / height : 0.0f;
            return;
        }
        int m2247v = linearLayoutManager.m2247v();
        if (m2247v != 0) {
            boolean z2 = linearLayoutManager.f2039p == 0;
            int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, m2247v, 2);
            for (int i10 = 0; i10 < m2247v; i10++) {
                View m2245u = linearLayoutManager.m2245u(i10);
                if (m2245u == null) {
                    throw new IllegalStateException("null view contained in the view hierarchy");
                }
                ViewGroup.LayoutParams layoutParams2 = m2245u.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : C1222a.f5467a;
                int[] iArr2 = iArr[i10];
                if (z2) {
                    top2 = m2245u.getLeft();
                    i = marginLayoutParams2.leftMargin;
                } else {
                    top2 = m2245u.getTop();
                    i = marginLayoutParams2.topMargin;
                }
                iArr2[0] = top2 - i;
                int[] iArr3 = iArr[i10];
                if (z2) {
                    bottom = m2245u.getRight();
                    i2 = marginLayoutParams2.rightMargin;
                } else {
                    bottom = m2245u.getBottom();
                    i2 = marginLayoutParams2.bottomMargin;
                }
                iArr3[1] = bottom + i2;
            }
            Arrays.sort(iArr, new C0295l(4));
            int i11 = 1;
            while (true) {
                if (i11 >= m2247v) {
                    int[] iArr4 = iArr[0];
                    int i12 = iArr4[1];
                    int i13 = iArr4[0];
                    int i14 = i12 - i13;
                    if (i13 <= 0) {
                    }
                } else if (iArr[i11 - 1][1] != iArr[i11][0]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
    }
}
