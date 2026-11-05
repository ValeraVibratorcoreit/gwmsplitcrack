package p095p0;

import android.view.View;
import androidx.viewpager2.widget.ViewPager2;
import p024L.InterfaceC0249s;
import p038T.C0326t;

/* renamed from: p0.j */
/* loaded from: classes.dex */
public final class C1231j implements InterfaceC0249s {

    /* renamed from: f */
    public final /* synthetic */ int f5486f;

    /* renamed from: g */
    public final /* synthetic */ C0326t f5487g;

    public /* synthetic */ C1231j(C0326t c0326t, int i) {
        this.f5486f = i;
        this.f5487g = c0326t;
    }

    @Override // p024L.InterfaceC0249s
    /* renamed from: e */
    public final boolean mo366e(View view) {
        switch (this.f5486f) {
            case 0:
                int currentItem = ((ViewPager2) view).getCurrentItem() + 1;
                ViewPager2 viewPager2 = (ViewPager2) this.f5487g.f926d;
                if (viewPager2.f2161w) {
                    viewPager2.m1572b(currentItem);
                    break;
                }
                break;
            default:
                int currentItem2 = ((ViewPager2) view).getCurrentItem() - 1;
                ViewPager2 viewPager22 = (ViewPager2) this.f5487g.f926d;
                if (viewPager22.f2161w) {
                    viewPager22.m1572b(currentItem2);
                    break;
                }
                break;
        }
        return true;
    }
}
