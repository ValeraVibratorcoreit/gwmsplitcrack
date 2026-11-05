package p068f0;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: f0.F */
/* loaded from: classes.dex */
public final class C0776F {

    /* renamed from: a */
    public final /* synthetic */ int f3926a;

    /* renamed from: b */
    public final /* synthetic */ AbstractC0778H f3927b;

    public /* synthetic */ C0776F(AbstractC0778H abstractC0778H, int i) {
        this.f3926a = i;
        this.f3927b = abstractC0778H;
    }

    /* renamed from: a */
    public final int m2213a(View view) {
        switch (this.f3926a) {
            case 0:
                C0779I c0779i = (C0779I) view.getLayoutParams();
                this.f3927b.getClass();
                return view.getRight() + ((C0779I) view.getLayoutParams()).f3948b.right + ((ViewGroup.MarginLayoutParams) c0779i).rightMargin;
            default:
                C0779I c0779i2 = (C0779I) view.getLayoutParams();
                this.f3927b.getClass();
                return view.getBottom() + ((C0779I) view.getLayoutParams()).f3948b.bottom + ((ViewGroup.MarginLayoutParams) c0779i2).bottomMargin;
        }
    }

    /* renamed from: b */
    public final int m2214b(View view) {
        switch (this.f3926a) {
            case 0:
                C0779I c0779i = (C0779I) view.getLayoutParams();
                this.f3927b.getClass();
                return (view.getLeft() - ((C0779I) view.getLayoutParams()).f3948b.left) - ((ViewGroup.MarginLayoutParams) c0779i).leftMargin;
            default:
                C0779I c0779i2 = (C0779I) view.getLayoutParams();
                this.f3927b.getClass();
                return (view.getTop() - ((C0779I) view.getLayoutParams()).f3948b.top) - ((ViewGroup.MarginLayoutParams) c0779i2).topMargin;
        }
    }

    /* renamed from: c */
    public final int m2215c() {
        switch (this.f3926a) {
            case 0:
                AbstractC0778H abstractC0778H = this.f3927b;
                return abstractC0778H.f3945n - abstractC0778H.m2230F();
            default:
                AbstractC0778H abstractC0778H2 = this.f3927b;
                return abstractC0778H2.f3946o - abstractC0778H2.m2228D();
        }
    }

    /* renamed from: d */
    public final int m2216d() {
        switch (this.f3926a) {
            case 0:
                return this.f3927b.m2229E();
            default:
                return this.f3927b.m2231G();
        }
    }
}
