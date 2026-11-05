package p021J0;

import com.google.android.material.carousel.CarouselLayoutManager;

/* renamed from: J0.d */
/* loaded from: classes.dex */
public final class C0150d {

    /* renamed from: a */
    public final int f460a;

    /* renamed from: b */
    public final /* synthetic */ int f461b;

    /* renamed from: c */
    public final /* synthetic */ CarouselLayoutManager f462c;

    public C0150d(int i) {
        this.f460a = i;
    }

    /* renamed from: a */
    public final int m411a() {
        switch (this.f461b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f462c;
                if (carouselLayoutManager.m2060D0()) {
                    return carouselLayoutManager.f3945n;
                }
                return 0;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0150d(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.f461b = i;
        switch (i) {
            case 1:
                this.f462c = carouselLayoutManager;
                this(0);
                break;
            default:
                this.f462c = carouselLayoutManager;
                break;
        }
    }
}
