package p068f0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.jcraft.jsch.SftpATTRS;

/* renamed from: f0.v */
/* loaded from: classes.dex */
public class C0824v {

    /* renamed from: a */
    public int f4187a = -1;

    /* renamed from: b */
    public RecyclerView f4188b;

    /* renamed from: c */
    public AbstractC0778H f4189c;

    /* renamed from: d */
    public boolean f4190d;

    /* renamed from: e */
    public boolean f4191e;

    /* renamed from: f */
    public View f4192f;

    /* renamed from: g */
    public final C0787Q f4193g;

    /* renamed from: h */
    public boolean f4194h;

    /* renamed from: i */
    public final LinearInterpolator f4195i;

    /* renamed from: j */
    public final DecelerateInterpolator f4196j;

    /* renamed from: k */
    public PointF f4197k;

    /* renamed from: l */
    public final DisplayMetrics f4198l;

    /* renamed from: m */
    public boolean f4199m;

    /* renamed from: n */
    public float f4200n;

    /* renamed from: o */
    public int f4201o;

    /* renamed from: p */
    public int f4202p;

    public C0824v(Context context) {
        C0787Q c0787q = new C0787Q();
        c0787q.f3969d = -1;
        c0787q.f3971f = false;
        c0787q.f3972g = 0;
        c0787q.f3966a = 0;
        c0787q.f3967b = 0;
        c0787q.f3968c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c0787q.f3970e = null;
        this.f4193g = c0787q;
        this.f4195i = new LinearInterpolator();
        this.f4196j = new DecelerateInterpolator();
        this.f4199m = false;
        this.f4201o = 0;
        this.f4202p = 0;
        this.f4198l = context.getResources().getDisplayMetrics();
    }

    /* renamed from: a */
    public static int m2326a(int i, int i2, int i3, int i4, int i5) {
        if (i5 == -1) {
            return i3 - i;
        }
        if (i5 != 0) {
            if (i5 == 1) {
                return i4 - i2;
            }
            throw new IllegalArgumentException("snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_");
        }
        int i6 = i3 - i;
        if (i6 > 0) {
            return i6;
        }
        int i7 = i4 - i2;
        if (i7 < 0) {
            return i7;
        }
        return 0;
    }

    /* renamed from: b */
    public int mo404b(View view, int i) {
        AbstractC0778H abstractC0778H = this.f4189c;
        if (abstractC0778H == null || !abstractC0778H.mo1467d()) {
            return 0;
        }
        C0779I c0779i = (C0779I) view.getLayoutParams();
        return m2326a((view.getLeft() - ((C0779I) view.getLayoutParams()).f3948b.left) - ((ViewGroup.MarginLayoutParams) c0779i).leftMargin, view.getRight() + ((C0779I) view.getLayoutParams()).f3948b.right + ((ViewGroup.MarginLayoutParams) c0779i).rightMargin, abstractC0778H.m2229E(), abstractC0778H.f3945n - abstractC0778H.m2230F(), i);
    }

    /* renamed from: c */
    public int mo405c(View view, int i) {
        AbstractC0778H abstractC0778H = this.f4189c;
        if (abstractC0778H == null || !abstractC0778H.mo1468e()) {
            return 0;
        }
        C0779I c0779i = (C0779I) view.getLayoutParams();
        return m2326a((view.getTop() - ((C0779I) view.getLayoutParams()).f3948b.top) - ((ViewGroup.MarginLayoutParams) c0779i).topMargin, view.getBottom() + ((C0779I) view.getLayoutParams()).f3948b.bottom + ((ViewGroup.MarginLayoutParams) c0779i).bottomMargin, abstractC0778H.m2231G(), abstractC0778H.f3946o - abstractC0778H.m2228D(), i);
    }

    /* renamed from: d */
    public float mo406d(DisplayMetrics displayMetrics) {
        return 25.0f / displayMetrics.densityDpi;
    }

    /* renamed from: e */
    public int mo407e(int i) {
        float abs = Math.abs(i);
        if (!this.f4199m) {
            this.f4200n = mo406d(this.f4198l);
            this.f4199m = true;
        }
        return (int) Math.ceil(abs * this.f4200n);
    }

    /* renamed from: f */
    public PointF mo408f(int i) {
        Object obj = this.f4189c;
        if (obj instanceof InterfaceC0788S) {
            return ((InterfaceC0788S) obj).mo1462a(i);
        }
        Log.w("RecyclerView", "You should override computeScrollVectorForPosition when the LayoutManager does not implement " + InterfaceC0788S.class.getCanonicalName());
        return null;
    }

    /* renamed from: g */
    public final void m2327g(int i, int i2) {
        PointF mo408f;
        RecyclerView recyclerView = this.f4188b;
        if (this.f4187a == -1 || recyclerView == null) {
            m2328i();
        }
        if (this.f4190d && this.f4192f == null && this.f4189c != null && (mo408f = mo408f(this.f4187a)) != null) {
            float f2 = mo408f.x;
            if (f2 != 0.0f || mo408f.y != 0.0f) {
                recyclerView.m1511Y((int) Math.signum(f2), (int) Math.signum(mo408f.y), null);
            }
        }
        this.f4190d = false;
        View view = this.f4192f;
        C0787Q c0787q = this.f4193g;
        if (view != null) {
            this.f4188b.getClass();
            AbstractC0792W m1483J = RecyclerView.m1483J(view);
            if ((m1483J != null ? m1483J.m2269b() : -1) == this.f4187a) {
                View view2 = this.f4192f;
                C0789T c0789t = recyclerView.f2088i0;
                mo409h(view2, c0787q);
                c0787q.m2263a(recyclerView);
                m2328i();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.f4192f = null;
            }
        }
        if (this.f4191e) {
            C0789T c0789t2 = recyclerView.f2088i0;
            if (this.f4188b.f2103q.m2247v() == 0) {
                m2328i();
            } else {
                int i3 = this.f4201o;
                int i4 = i3 - i;
                if (i3 * i4 <= 0) {
                    i4 = 0;
                }
                this.f4201o = i4;
                int i5 = this.f4202p;
                int i6 = i5 - i2;
                if (i5 * i6 <= 0) {
                    i6 = 0;
                }
                this.f4202p = i6;
                if (i4 == 0 && i6 == 0) {
                    PointF mo408f2 = mo408f(this.f4187a);
                    if (mo408f2 != null) {
                        if (mo408f2.x != 0.0f || mo408f2.y != 0.0f) {
                            float f3 = mo408f2.y;
                            float sqrt = (float) Math.sqrt((f3 * f3) + (r10 * r10));
                            float f4 = mo408f2.x / sqrt;
                            mo408f2.x = f4;
                            float f5 = mo408f2.y / sqrt;
                            mo408f2.y = f5;
                            this.f4197k = mo408f2;
                            this.f4201o = (int) (f4 * 10000.0f);
                            this.f4202p = (int) (f5 * 10000.0f);
                            int mo407e = mo407e(10000);
                            LinearInterpolator linearInterpolator = this.f4195i;
                            c0787q.f3966a = (int) (this.f4201o * 1.2f);
                            c0787q.f3967b = (int) (this.f4202p * 1.2f);
                            c0787q.f3968c = (int) (mo407e * 1.2f);
                            c0787q.f3970e = linearInterpolator;
                            c0787q.f3971f = true;
                        }
                    }
                    c0787q.f3969d = this.f4187a;
                    m2328i();
                }
            }
            boolean z2 = c0787q.f3969d >= 0;
            c0787q.m2263a(recyclerView);
            if (z2 && this.f4191e) {
                this.f4190d = true;
                recyclerView.f2082f0.m2266a();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo409h(View view, C0787Q c0787q) {
        int i;
        PointF pointF;
        int ceil;
        PointF pointF2 = this.f4197k;
        int i2 = 0;
        if (pointF2 != null) {
            float f2 = pointF2.x;
            if (f2 != 0.0f) {
                i = f2 > 0.0f ? 1 : -1;
                int mo404b = mo404b(view, i);
                pointF = this.f4197k;
                if (pointF != null) {
                    float f3 = pointF.y;
                    if (f3 != 0.0f) {
                        i2 = f3 > 0.0f ? 1 : -1;
                    }
                }
                int mo405c = mo405c(view, i2);
                ceil = (int) Math.ceil(mo407e((int) Math.sqrt((mo405c * mo405c) + (mo404b * mo404b))) / 0.3356d);
                if (ceil <= 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f4196j;
                    c0787q.f3966a = -mo404b;
                    c0787q.f3967b = -mo405c;
                    c0787q.f3968c = ceil;
                    c0787q.f3970e = decelerateInterpolator;
                    c0787q.f3971f = true;
                    return;
                }
                return;
            }
        }
        i = 0;
        int mo404b2 = mo404b(view, i);
        pointF = this.f4197k;
        if (pointF != null) {
        }
        int mo405c2 = mo405c(view, i2);
        ceil = (int) Math.ceil(mo407e((int) Math.sqrt((mo405c2 * mo405c2) + (mo404b2 * mo404b2))) / 0.3356d);
        if (ceil <= 0) {
        }
    }

    /* renamed from: i */
    public final void m2328i() {
        if (this.f4191e) {
            this.f4191e = false;
            this.f4202p = 0;
            this.f4201o = 0;
            this.f4197k = null;
            this.f4188b.f2088i0.f3973a = -1;
            this.f4192f = null;
            this.f4187a = -1;
            this.f4190d = false;
            AbstractC0778H abstractC0778H = this.f4189c;
            if (abstractC0778H.f3936e == this) {
                abstractC0778H.f3936e = null;
            }
            this.f4189c = null;
            this.f4188b = null;
        }
    }
}
