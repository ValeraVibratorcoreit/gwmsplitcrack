package p068f0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import androidx.recyclerview.widget.RecyclerView;
import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p017H0.C0124c;
import p022K.AbstractC0169Q;

/* renamed from: f0.l */
/* loaded from: classes.dex */
public final class C0814l extends AbstractC0775E {

    /* renamed from: C */
    public static final int[] f4107C = {R.attr.state_pressed};

    /* renamed from: D */
    public static final int[] f4108D = new int[0];

    /* renamed from: A */
    public int f4109A;

    /* renamed from: B */
    public final RunnableC0020n f4110B;

    /* renamed from: a */
    public final int f4111a;

    /* renamed from: b */
    public final int f4112b;

    /* renamed from: c */
    public final StateListDrawable f4113c;

    /* renamed from: d */
    public final Drawable f4114d;

    /* renamed from: e */
    public final int f4115e;

    /* renamed from: f */
    public final int f4116f;

    /* renamed from: g */
    public final StateListDrawable f4117g;

    /* renamed from: h */
    public final Drawable f4118h;

    /* renamed from: i */
    public final int f4119i;

    /* renamed from: j */
    public final int f4120j;

    /* renamed from: k */
    public int f4121k;

    /* renamed from: l */
    public int f4122l;

    /* renamed from: m */
    public float f4123m;

    /* renamed from: n */
    public int f4124n;

    /* renamed from: o */
    public int f4125o;

    /* renamed from: p */
    public float f4126p;

    /* renamed from: s */
    public final RecyclerView f4129s;

    /* renamed from: z */
    public final ValueAnimator f4136z;

    /* renamed from: q */
    public int f4127q = 0;

    /* renamed from: r */
    public int f4128r = 0;

    /* renamed from: t */
    public boolean f4130t = false;

    /* renamed from: u */
    public boolean f4131u = false;

    /* renamed from: v */
    public int f4132v = 0;

    /* renamed from: w */
    public int f4133w = 0;

    /* renamed from: x */
    public final int[] f4134x = new int[2];

    /* renamed from: y */
    public final int[] f4135y = new int[2];

    public C0814l(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i, int i2, int i3) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f4136z = ofFloat;
        this.f4109A = 0;
        RunnableC0020n runnableC0020n = new RunnableC0020n(10, this);
        this.f4110B = runnableC0020n;
        C0812j c0812j = new C0812j(this);
        this.f4113c = stateListDrawable;
        this.f4114d = drawable;
        this.f4117g = stateListDrawable2;
        this.f4118h = drawable2;
        this.f4115e = Math.max(i, stateListDrawable.getIntrinsicWidth());
        this.f4116f = Math.max(i, drawable.getIntrinsicWidth());
        this.f4119i = Math.max(i, stateListDrawable2.getIntrinsicWidth());
        this.f4120j = Math.max(i, drawable2.getIntrinsicWidth());
        this.f4111a = i2;
        this.f4112b = i3;
        stateListDrawable.setAlpha(Function.USE_VARARGS);
        drawable.setAlpha(Function.USE_VARARGS);
        ofFloat.addListener(new C0813k(this));
        ofFloat.addUpdateListener(new C0124c(3, this));
        RecyclerView recyclerView2 = this.f4129s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            AbstractC0778H abstractC0778H = recyclerView2.f2103q;
            if (abstractC0778H != null) {
                abstractC0778H.mo1465c("Cannot remove item decoration during a scroll  or layout");
            }
            ArrayList arrayList = recyclerView2.f2105r;
            arrayList.remove(this);
            if (arrayList.isEmpty()) {
                recyclerView2.setWillNotDraw(recyclerView2.getOverScrollMode() == 2);
            }
            recyclerView2.m1501O();
            recyclerView2.requestLayout();
            RecyclerView recyclerView3 = this.f4129s;
            recyclerView3.f2107s.remove(this);
            if (recyclerView3.f2109t == this) {
                recyclerView3.f2109t = null;
            }
            ArrayList arrayList2 = this.f4129s.f2092k0;
            if (arrayList2 != null) {
                arrayList2.remove(c0812j);
            }
            this.f4129s.removeCallbacks(runnableC0020n);
        }
        this.f4129s = recyclerView;
        if (recyclerView != null) {
            recyclerView.m1519g(this);
            this.f4129s.f2107s.add(this);
            this.f4129s.m1520h(c0812j);
        }
    }

    /* renamed from: e */
    public static int m2310e(float f2, float f3, int[] iArr, int i, int i2, int i3) {
        int i4 = iArr[1] - iArr[0];
        if (i4 == 0) {
            return 0;
        }
        int i5 = i - i3;
        int i6 = (int) (((f3 - f2) / i4) * i5);
        int i7 = i2 + i6;
        if (i7 >= i5 || i7 < 0) {
            return 0;
        }
        return i6;
    }

    @Override // p068f0.AbstractC0775E
    /* renamed from: b */
    public final void mo410b(Canvas canvas, RecyclerView recyclerView) {
        int i = this.f4127q;
        RecyclerView recyclerView2 = this.f4129s;
        if (i != recyclerView2.getWidth() || this.f4128r != recyclerView2.getHeight()) {
            this.f4127q = recyclerView2.getWidth();
            this.f4128r = recyclerView2.getHeight();
            m2313f(0);
            return;
        }
        if (this.f4109A != 0) {
            if (this.f4130t) {
                int i2 = this.f4127q;
                int i3 = this.f4115e;
                int i4 = i2 - i3;
                int i5 = this.f4122l;
                int i6 = this.f4121k;
                int i7 = i5 - (i6 / 2);
                StateListDrawable stateListDrawable = this.f4113c;
                stateListDrawable.setBounds(0, 0, i3, i6);
                int i8 = this.f4128r;
                int i9 = this.f4116f;
                Drawable drawable = this.f4114d;
                drawable.setBounds(0, 0, i9, i8);
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i3, i7);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i3, -i7);
                } else {
                    canvas.translate(i4, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i7);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i4, -i7);
                }
            }
            if (this.f4131u) {
                int i10 = this.f4128r;
                int i11 = this.f4119i;
                int i12 = i10 - i11;
                int i13 = this.f4125o;
                int i14 = this.f4124n;
                int i15 = i13 - (i14 / 2);
                StateListDrawable stateListDrawable2 = this.f4117g;
                stateListDrawable2.setBounds(0, 0, i14, i11);
                int i16 = this.f4127q;
                int i17 = this.f4120j;
                Drawable drawable2 = this.f4118h;
                drawable2.setBounds(0, 0, i16, i17);
                canvas.translate(0.0f, i12);
                drawable2.draw(canvas);
                canvas.translate(i15, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i15, -i12);
            }
        }
    }

    /* renamed from: c */
    public final boolean m2311c(float f2, float f3) {
        if (f3 >= this.f4128r - this.f4119i) {
            int i = this.f4125o;
            int i2 = this.f4124n;
            if (f2 >= i - (i2 / 2) && f2 <= (i2 / 2) + i) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m2312d(float f2, float f3) {
        RecyclerView recyclerView = this.f4129s;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean z2 = recyclerView.getLayoutDirection() == 1;
        int i = this.f4115e;
        if (z2) {
            if (f2 > i / 2) {
                return false;
            }
        } else if (f2 < this.f4127q - i) {
            return false;
        }
        int i2 = this.f4122l;
        int i3 = this.f4121k / 2;
        return f3 >= ((float) (i2 - i3)) && f3 <= ((float) (i3 + i2));
    }

    /* renamed from: f */
    public final void m2313f(int i) {
        RunnableC0020n runnableC0020n = this.f4110B;
        StateListDrawable stateListDrawable = this.f4113c;
        if (i == 2 && this.f4132v != 2) {
            stateListDrawable.setState(f4107C);
            this.f4129s.removeCallbacks(runnableC0020n);
        }
        if (i == 0) {
            this.f4129s.invalidate();
        } else {
            m2314g();
        }
        if (this.f4132v == 2 && i != 2) {
            stateListDrawable.setState(f4108D);
            this.f4129s.removeCallbacks(runnableC0020n);
            this.f4129s.postDelayed(runnableC0020n, 1200);
        } else if (i == 1) {
            this.f4129s.removeCallbacks(runnableC0020n);
            this.f4129s.postDelayed(runnableC0020n, 1500);
        }
        this.f4132v = i;
    }

    /* renamed from: g */
    public final void m2314g() {
        int i = this.f4109A;
        ValueAnimator valueAnimator = this.f4136z;
        if (i != 0) {
            if (i != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f4109A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
