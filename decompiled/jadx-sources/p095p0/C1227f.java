package p095p0;

import androidx.viewpager2.widget.ViewPager2;

/* renamed from: p0.f */
/* loaded from: classes.dex */
public final class C1227f extends AbstractC1230i {

    /* renamed from: a */
    public final /* synthetic */ int f5483a;

    /* renamed from: b */
    public final /* synthetic */ ViewPager2 f5484b;

    public /* synthetic */ C1227f(ViewPager2 viewPager2, int i) {
        this.f5483a = i;
        this.f5484b = viewPager2;
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: a */
    public void mo1159a(int i) {
        switch (this.f5483a) {
            case 0:
                if (i == 0) {
                    this.f5484b.m1573c();
                    break;
                }
                break;
        }
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: c */
    public final void mo1161c(int i) {
        switch (this.f5483a) {
            case 0:
                ViewPager2 viewPager2 = this.f5484b;
                if (viewPager2.f2147i != i) {
                    viewPager2.f2147i = i;
                    viewPager2.f2163y.m920m();
                    break;
                }
                break;
            default:
                ViewPager2 viewPager22 = this.f5484b;
                viewPager22.clearFocus();
                if (viewPager22.hasFocus()) {
                    viewPager22.f2153o.requestFocus(2);
                    break;
                }
                break;
        }
    }
}
