package p068f0;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayList;

/* renamed from: f0.e0 */
/* loaded from: classes.dex */
public final class C0805e0 {

    /* renamed from: a */
    public final ArrayList f4060a = new ArrayList();

    /* renamed from: b */
    public int f4061b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: c */
    public int f4062c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;

    /* renamed from: d */
    public int f4063d = 0;

    /* renamed from: e */
    public final int f4064e;

    /* renamed from: f */
    public final /* synthetic */ StaggeredGridLayoutManager f4065f;

    public C0805e0(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.f4065f = staggeredGridLayoutManager;
        this.f4064e = i;
    }

    /* renamed from: a */
    public final void m2294a() {
        View view = (View) this.f4060a.get(r0.size() - 1);
        C0799b0 c0799b0 = (C0799b0) view.getLayoutParams();
        this.f4062c = this.f4065f.f2134r.mo878b(view);
        c0799b0.getClass();
    }

    /* renamed from: b */
    public final void m2295b() {
        this.f4060a.clear();
        this.f4061b = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f4062c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f4063d = 0;
    }

    /* renamed from: c */
    public final int m2296c() {
        return this.f4065f.f2139w ? m2298e(r1.size() - 1, -1) : m2298e(0, this.f4060a.size());
    }

    /* renamed from: d */
    public final int m2297d() {
        return this.f4065f.f2139w ? m2298e(0, this.f4060a.size()) : m2298e(r1.size() - 1, -1);
    }

    /* renamed from: e */
    public final int m2298e(int i, int i2) {
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4065f;
        int mo887k = staggeredGridLayoutManager.f2134r.mo887k();
        int mo883g = staggeredGridLayoutManager.f2134r.mo883g();
        int i3 = i2 > i ? 1 : -1;
        while (i != i2) {
            View view = (View) this.f4060a.get(i);
            int mo881e = staggeredGridLayoutManager.f2134r.mo881e(view);
            int mo878b = staggeredGridLayoutManager.f2134r.mo878b(view);
            boolean z2 = mo881e <= mo883g;
            boolean z3 = mo878b >= mo887k;
            if (z2 && z3 && (mo881e < mo887k || mo878b > mo883g)) {
                return AbstractC0778H.m2218H(view);
            }
            i += i3;
        }
        return -1;
    }

    /* renamed from: f */
    public final int m2299f(int i) {
        int i2 = this.f4062c;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f4060a.size() == 0) {
            return i;
        }
        m2294a();
        return this.f4062c;
    }

    /* renamed from: g */
    public final View m2300g(int i, int i2) {
        ArrayList arrayList = this.f4060a;
        StaggeredGridLayoutManager staggeredGridLayoutManager = this.f4065f;
        View view = null;
        if (i2 != -1) {
            int size = arrayList.size() - 1;
            while (size >= 0) {
                View view2 = (View) arrayList.get(size);
                if ((staggeredGridLayoutManager.f2139w && AbstractC0778H.m2218H(view2) >= i) || ((!staggeredGridLayoutManager.f2139w && AbstractC0778H.m2218H(view2) <= i) || !view2.hasFocusable())) {
                    break;
                }
                size--;
                view = view2;
            }
        } else {
            int size2 = arrayList.size();
            int i3 = 0;
            while (i3 < size2) {
                View view3 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.f2139w && AbstractC0778H.m2218H(view3) <= i) || ((!staggeredGridLayoutManager.f2139w && AbstractC0778H.m2218H(view3) >= i) || !view3.hasFocusable())) {
                    break;
                }
                i3++;
                view = view3;
            }
        }
        return view;
    }

    /* renamed from: h */
    public final int m2301h(int i) {
        int i2 = this.f4061b;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.f4060a.size() == 0) {
            return i;
        }
        View view = (View) this.f4060a.get(0);
        C0799b0 c0799b0 = (C0799b0) view.getLayoutParams();
        this.f4061b = this.f4065f.f2134r.mo881e(view);
        c0799b0.getClass();
        return this.f4061b;
    }
}
