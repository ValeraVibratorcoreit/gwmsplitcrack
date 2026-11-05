package p021J0;

import android.view.View;
import com.google.android.material.carousel.CarouselLayoutManager;
import p001A0.RunnableC0024r;
import p109u0.C1488K;
import p109u0.C1498P;
import p109u0.C1509V;

/* renamed from: J0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnLayoutChangeListenerC0147a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f454a;

    /* renamed from: b */
    public final /* synthetic */ Object f455b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0147a(int i, Object obj) {
        this.f454a = i;
        this.f455b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f454a) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = (CarouselLayoutManager) this.f455b;
                carouselLayoutManager.getClass();
                if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
                    view.post(new RunnableC0024r(1, carouselLayoutManager));
                    break;
                }
            case 1:
                C1488K c1488k = (C1488K) this.f455b;
                c1488k.getClass();
                if (i3 - i != i7 - i5 || i4 - i2 != i8 - i6) {
                    c1488k.m3731D();
                    c1488k.m3729B();
                    c1488k.m3728A();
                    break;
                }
                break;
            case 2:
                ((C1498P) this.f455b).m3899a();
                break;
            default:
                ((C1509V) this.f455b).m4062a();
                break;
        }
    }
}
