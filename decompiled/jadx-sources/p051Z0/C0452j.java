package p051Z0;

import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;
import p095p0.AbstractC1230i;

/* renamed from: Z0.j */
/* loaded from: classes.dex */
public final class C0452j extends AbstractC1230i {

    /* renamed from: a */
    public final WeakReference f1446a;

    /* renamed from: c */
    public int f1448c = 0;

    /* renamed from: b */
    public int f1447b = 0;

    public C0452j(TabLayout tabLayout) {
        this.f1446a = new WeakReference(tabLayout);
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: a */
    public final void mo1159a(int i) {
        this.f1447b = this.f1448c;
        this.f1448c = i;
        TabLayout tabLayout = (TabLayout) this.f1446a.get();
        if (tabLayout != null) {
            tabLayout.f3620R = this.f1448c;
        }
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: b */
    public final void mo1160b(int i, float f2, int i2) {
        TabLayout tabLayout = (TabLayout) this.f1446a.get();
        if (tabLayout != null) {
            int i3 = this.f1448c;
            tabLayout.m2110i(i, f2, i3 != 2 || this.f1447b == 1, (i3 == 2 && this.f1447b == 0) ? false : true, false);
        }
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: c */
    public final void mo1161c(int i) {
        TabLayout tabLayout = (TabLayout) this.f1446a.get();
        if (tabLayout == null || tabLayout.getSelectedTabPosition() == i || i >= tabLayout.getTabCount()) {
            return;
        }
        int i2 = this.f1448c;
        tabLayout.m2109h(tabLayout.m2106e(i), i2 == 0 || (i2 == 2 && this.f1447b == 0));
    }
}
