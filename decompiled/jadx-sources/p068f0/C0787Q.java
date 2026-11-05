package p068f0;

import android.util.Log;
import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: f0.Q */
/* loaded from: classes.dex */
public final class C0787Q {

    /* renamed from: a */
    public int f3966a;

    /* renamed from: b */
    public int f3967b;

    /* renamed from: c */
    public int f3968c;

    /* renamed from: d */
    public int f3969d;

    /* renamed from: e */
    public BaseInterpolator f3970e;

    /* renamed from: f */
    public boolean f3971f;

    /* renamed from: g */
    public int f3972g;

    /* renamed from: a */
    public final void m2263a(RecyclerView recyclerView) {
        int i = this.f3969d;
        if (i >= 0) {
            this.f3969d = -1;
            recyclerView.m1500N(i);
            this.f3971f = false;
            return;
        }
        if (!this.f3971f) {
            this.f3972g = 0;
            return;
        }
        BaseInterpolator baseInterpolator = this.f3970e;
        if (baseInterpolator != null && this.f3968c < 1) {
            throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
        }
        int i2 = this.f3968c;
        if (i2 < 1) {
            throw new IllegalStateException("Scroll duration must be a positive number");
        }
        recyclerView.f2082f0.m2267b(this.f3966a, this.f3967b, i2, baseInterpolator);
        int i3 = this.f3972g + 1;
        this.f3972g = i3;
        if (i3 > 10) {
            Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f3971f = false;
    }
}
