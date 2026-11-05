package p033Q;

import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.widget.ListView;
import java.util.WeakHashMap;
import p001A0.RunnableC0020n;
import p022K.AbstractC0169Q;
import p082l.C1130n0;

/* renamed from: Q.g */
/* loaded from: classes.dex */
public final class ViewOnTouchListenerC0273g implements View.OnTouchListener {

    /* renamed from: w */
    public static final int f718w = ViewConfiguration.getTapTimeout();

    /* renamed from: f */
    public final C0267a f719f;

    /* renamed from: g */
    public final AccelerateInterpolator f720g;

    /* renamed from: h */
    public final ListView f721h;

    /* renamed from: i */
    public RunnableC0020n f722i;

    /* renamed from: j */
    public final float[] f723j;

    /* renamed from: k */
    public final float[] f724k;

    /* renamed from: l */
    public final int f725l;

    /* renamed from: m */
    public final int f726m;

    /* renamed from: n */
    public final float[] f727n;

    /* renamed from: o */
    public final float[] f728o;

    /* renamed from: p */
    public final float[] f729p;

    /* renamed from: q */
    public boolean f730q;

    /* renamed from: r */
    public boolean f731r;

    /* renamed from: s */
    public boolean f732s;

    /* renamed from: t */
    public boolean f733t;

    /* renamed from: u */
    public boolean f734u;

    /* renamed from: v */
    public final C1130n0 f735v;

    public ViewOnTouchListenerC0273g(C1130n0 c1130n0) {
        C0267a c0267a = new C0267a();
        c0267a.f713e = Long.MIN_VALUE;
        c0267a.f715g = -1L;
        c0267a.f714f = 0L;
        this.f719f = c0267a;
        this.f720g = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.f723j = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f724k = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.f727n = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.f728o = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f729p = fArr5;
        this.f721h = c1130n0;
        float f2 = Resources.getSystem().getDisplayMetrics().density;
        float f3 = ((int) ((1575.0f * f2) + 0.5f)) / 1000.0f;
        fArr5[0] = f3;
        fArr5[1] = f3;
        float f4 = ((int) ((f2 * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f4;
        fArr4[1] = f4;
        this.f725l = 1;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.f726m = f718w;
        c0267a.f709a = 500;
        c0267a.f710b = 500;
        this.f735v = c1130n0;
    }

    /* renamed from: b */
    public static float m799b(float f2, float f3, float f4) {
        return f2 > f4 ? f4 : f2 < f3 ? f3 : f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003c  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m800a(int i, float f2, float f3, float f4) {
        float f5;
        float interpolation;
        float m799b = m799b(this.f723j[i] * f3, 0.0f, this.f724k[i]);
        float m801c = m801c(f3 - f2, m799b) - m801c(f2, m799b);
        AccelerateInterpolator accelerateInterpolator = this.f720g;
        if (m801c < 0.0f) {
            interpolation = -accelerateInterpolator.getInterpolation(-m801c);
        } else {
            if (m801c <= 0.0f) {
                f5 = 0.0f;
                if (f5 != 0.0f) {
                    return 0.0f;
                }
                float f6 = this.f727n[i];
                float f7 = this.f728o[i];
                float f8 = this.f729p[i];
                float f9 = f6 * f4;
                return f5 > 0.0f ? m799b(f5 * f9, f7, f8) : -m799b((-f5) * f9, f7, f8);
            }
            interpolation = accelerateInterpolator.getInterpolation(m801c);
        }
        f5 = m799b(interpolation, -1.0f, 1.0f);
        if (f5 != 0.0f) {
        }
    }

    /* renamed from: c */
    public final float m801c(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        int i = this.f725l;
        if (i == 0 || i == 1) {
            if (f2 < f3) {
                if (f2 >= 0.0f) {
                    return 1.0f - (f2 / f3);
                }
                if (this.f733t && i == 1) {
                    return 1.0f;
                }
            }
        } else if (i == 2 && f2 < 0.0f) {
            return f2 / (-f3);
        }
        return 0.0f;
    }

    /* renamed from: d */
    public final void m802d() {
        int i = 0;
        if (this.f731r) {
            this.f733t = false;
            return;
        }
        C0267a c0267a = this.f719f;
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        int i2 = (int) (currentAnimationTimeMillis - c0267a.f713e);
        int i3 = c0267a.f710b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        c0267a.f717i = i;
        c0267a.f716h = c0267a.m785a(currentAnimationTimeMillis);
        c0267a.f715g = currentAnimationTimeMillis;
    }

    /* renamed from: e */
    public final boolean m803e() {
        C1130n0 c1130n0;
        int count;
        C0267a c0267a = this.f719f;
        float f2 = c0267a.f712d;
        int abs = (int) (f2 / Math.abs(f2));
        Math.abs(c0267a.f711c);
        if (abs == 0 || (count = (c1130n0 = this.f735v).getCount()) == 0) {
            return false;
        }
        int childCount = c1130n0.getChildCount();
        int firstVisiblePosition = c1130n0.getFirstVisiblePosition();
        int i = firstVisiblePosition + childCount;
        if (abs > 0) {
            if (i >= count && c1130n0.getChildAt(childCount - 1).getBottom() <= c1130n0.getHeight()) {
                return false;
            }
        } else {
            if (abs >= 0) {
                return false;
            }
            if (firstVisiblePosition <= 0 && c1130n0.getChildAt(0).getTop() >= 0) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0013, code lost:
    
        if (r1 != 3) goto L28;
     */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i;
        int i2 = 2;
        if (!this.f734u) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                }
            }
            m802d();
            return false;
        }
        this.f732s = true;
        this.f730q = false;
        float x2 = motionEvent.getX();
        float width = view.getWidth();
        ListView listView = this.f721h;
        float m800a = m800a(0, x2, width, listView.getWidth());
        float m800a2 = m800a(1, motionEvent.getY(), view.getHeight(), listView.getHeight());
        C0267a c0267a = this.f719f;
        c0267a.f711c = m800a;
        c0267a.f712d = m800a2;
        if (!this.f733t && m803e()) {
            if (this.f722i == null) {
                this.f722i = new RunnableC0020n(i2, this);
            }
            this.f733t = true;
            this.f731r = true;
            if (this.f730q || (i = this.f726m) <= 0) {
                this.f722i.run();
            } else {
                RunnableC0020n runnableC0020n = this.f722i;
                long j2 = i;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                listView.postOnAnimationDelayed(runnableC0020n, j2);
            }
            this.f730q = true;
        }
        return false;
    }
}
