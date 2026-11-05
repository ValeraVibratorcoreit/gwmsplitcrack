package p021J0;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import com.google.android.material.carousel.CarouselLayoutManager;
import p068f0.C0787Q;
import p068f0.C0824v;
import p068f0.C0826x;

/* renamed from: J0.b */
/* loaded from: classes.dex */
public final class C0148b extends C0824v {

    /* renamed from: q */
    public final /* synthetic */ int f456q;

    /* renamed from: r */
    public final /* synthetic */ Object f457r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0148b(Object obj, Context context, int i) {
        super(context);
        this.f456q = i;
        this.f457r = obj;
    }

    @Override // p068f0.C0824v
    /* renamed from: b */
    public int mo404b(View view, int i) {
        switch (this.f456q) {
            case 0:
                ((CarouselLayoutManager) this.f457r).getClass();
                return 0;
            default:
                return super.mo404b(view, i);
        }
    }

    @Override // p068f0.C0824v
    /* renamed from: c */
    public int mo405c(View view, int i) {
        switch (this.f456q) {
            case 0:
                ((CarouselLayoutManager) this.f457r).getClass();
                return 0;
            default:
                return super.mo405c(view, i);
        }
    }

    @Override // p068f0.C0824v
    /* renamed from: d */
    public float mo406d(DisplayMetrics displayMetrics) {
        switch (this.f456q) {
            case 1:
                return 100.0f / displayMetrics.densityDpi;
            default:
                return super.mo406d(displayMetrics);
        }
    }

    @Override // p068f0.C0824v
    /* renamed from: e */
    public int mo407e(int i) {
        switch (this.f456q) {
            case 1:
                return Math.min(100, super.mo407e(i));
            default:
                return super.mo407e(i);
        }
    }

    @Override // p068f0.C0824v
    /* renamed from: f */
    public PointF mo408f(int i) {
        switch (this.f456q) {
            case 0:
                ((CarouselLayoutManager) this.f457r).getClass();
                return null;
            default:
                return super.mo408f(i);
        }
    }

    @Override // p068f0.C0824v
    /* renamed from: h */
    public void mo409h(View view, C0787Q c0787q) {
        switch (this.f456q) {
            case 1:
                C0826x c0826x = (C0826x) this.f457r;
                int[] m2332b = c0826x.m2332b(c0826x.f4204a.getLayoutManager(), view);
                int i = m2332b[0];
                int i2 = m2332b[1];
                int ceil = (int) Math.ceil(mo407e(Math.max(Math.abs(i), Math.abs(i2))) / 0.3356d);
                if (ceil > 0) {
                    DecelerateInterpolator decelerateInterpolator = this.f4196j;
                    c0787q.f3966a = i;
                    c0787q.f3967b = i2;
                    c0787q.f3968c = ceil;
                    c0787q.f3970e = decelerateInterpolator;
                    c0787q.f3971f = true;
                    break;
                }
                break;
            default:
                super.mo409h(view, c0787q);
                break;
        }
    }
}
