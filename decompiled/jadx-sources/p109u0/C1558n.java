package p109u0;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.p061ip.Theme51GaugeArcView;
import com.altaysoft.t500_split.p061ip.Theme51SevenSegView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C1558n implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    public final /* synthetic */ int f8407a;

    /* renamed from: b */
    public final /* synthetic */ boolean f8408b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f8409c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f8410d;

    /* renamed from: e */
    public final /* synthetic */ View f8411e;

    /* renamed from: f */
    public final /* synthetic */ float f8412f;

    /* renamed from: g */
    public final /* synthetic */ float f8413g;

    /* renamed from: h */
    public final /* synthetic */ View f8414h;

    /* renamed from: i */
    public final /* synthetic */ View f8415i;

    /* renamed from: j */
    public final /* synthetic */ View f8416j;

    /* renamed from: k */
    public final /* synthetic */ float f8417k;

    /* renamed from: l */
    public final /* synthetic */ float f8418l;

    /* renamed from: m */
    public final /* synthetic */ boolean f8419m;

    /* renamed from: n */
    public final /* synthetic */ float f8420n;

    /* renamed from: o */
    public final /* synthetic */ float f8421o;

    /* renamed from: p */
    public final /* synthetic */ int[] f8422p;

    /* renamed from: q */
    public final /* synthetic */ Object f8423q;

    public /* synthetic */ C1558n(Object obj, boolean z2, ImageView imageView, ImageView imageView2, TextView textView, float f2, float f3, ImageView imageView3, ImageView imageView4, TextView textView2, float f4, float f5, boolean z3, float f6, float f7, int[] iArr, int i) {
        this.f8407a = i;
        this.f8423q = obj;
        this.f8408b = z2;
        this.f8409c = imageView;
        this.f8410d = imageView2;
        this.f8411e = textView;
        this.f8412f = f2;
        this.f8413g = f3;
        this.f8414h = imageView3;
        this.f8415i = imageView4;
        this.f8416j = textView2;
        this.f8417k = f4;
        this.f8418l = f5;
        this.f8419m = z3;
        this.f8420n = f6;
        this.f8421o = f7;
        this.f8422p = iArr;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        switch (this.f8407a) {
            case 0:
                C1576u c1576u = (C1576u) this.f8423q;
                c1576u.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1576u.m4544d(this.f8408b ? floatValue : 1.0f - floatValue, this.f8409c, this.f8410d, (TextView) this.f8411e, this.f8412f, this.f8413g, (ImageView) this.f8414h, (ImageView) this.f8415i, (TextView) this.f8416j, this.f8417k, this.f8418l, this.f8419m, this.f8420n, this.f8421o);
                AbstractC1372y1.m3295a(this.f8422p, floatValue);
                break;
            case 1:
                C1474D c1474d = (C1474D) this.f8423q;
                c1474d.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f2 = this.f8408b ? floatValue2 : 1.0f - floatValue2;
                float f3 = f2;
                C1474D.m3506c(this.f8409c, this.f8410d, (TextView) this.f8411e, this.f8412f, this.f8413g, -540.0f, f3);
                C1474D.m3506c((ImageView) this.f8414h, (ImageView) this.f8415i, (TextView) this.f8416j, this.f8417k, this.f8418l, 540.0f, f3);
                if (this.f8419m && (view = c1474d.f7273o0) != null) {
                    view.setTranslationY(this.f8420n * f2);
                }
                ImageView imageView = c1474d.f7272o;
                if (imageView != null) {
                    imageView.setTranslationY(this.f8421o * f2);
                }
                AbstractC1372y1.m3295a(this.f8422p, floatValue2);
                break;
            case 2:
                C1568q0 c1568q0 = (C1568q0) this.f8423q;
                c1568q0.getClass();
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1568q0.m4386d(this.f8408b ? floatValue3 : 1.0f - floatValue3, this.f8409c, this.f8410d, (TextView) this.f8411e, this.f8412f, this.f8413g, (ImageView) this.f8414h, (ImageView) this.f8415i, (TextView) this.f8416j, this.f8417k, this.f8418l, this.f8419m, this.f8420n, this.f8421o);
                AbstractC1372y1.m3295a(this.f8422p, floatValue3);
                break;
            case 3:
                C1583x0 c1583x0 = (C1583x0) this.f8423q;
                c1583x0.getClass();
                float floatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1583x0.m4676d(this.f8408b ? floatValue4 : 1.0f - floatValue4, this.f8409c, this.f8410d, (TextView) this.f8411e, this.f8412f, this.f8413g, (ImageView) this.f8414h, (ImageView) this.f8415i, (TextView) this.f8416j, this.f8417k, this.f8418l, this.f8419m, this.f8420n, this.f8421o);
                AbstractC1372y1.m3295a(this.f8422p, floatValue4);
                break;
            case 4:
                C1477E0 c1477e0 = (C1477E0) this.f8423q;
                c1477e0.getClass();
                float floatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1477e0.m3660d(this.f8408b ? floatValue5 : 1.0f - floatValue5, this.f8409c, this.f8410d, (TextView) this.f8411e, this.f8412f, this.f8413g, (ImageView) this.f8414h, (ImageView) this.f8415i, (TextView) this.f8416j, this.f8417k, this.f8418l, this.f8419m, this.f8420n, this.f8421o);
                AbstractC1372y1.m3295a(this.f8422p, floatValue5);
                break;
            case 5:
                C1491L0 c1491l0 = (C1491L0) this.f8423q;
                c1491l0.getClass();
                float floatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1491l0.m3826d(this.f8408b ? floatValue6 : 1.0f - floatValue6, this.f8409c, this.f8410d, (TextView) this.f8411e, this.f8412f, this.f8413g, (ImageView) this.f8414h, (ImageView) this.f8415i, (TextView) this.f8416j, this.f8417k, this.f8418l, this.f8419m, this.f8420n, this.f8421o);
                AbstractC1372y1.m3295a(this.f8422p, floatValue6);
                break;
            default:
                C1506T0 c1506t0 = (C1506T0) this.f8423q;
                c1506t0.getClass();
                float floatValue7 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1506t0.m3984c(this.f8408b ? floatValue7 : 1.0f - floatValue7, this.f8409c, (Theme51GaugeArcView) this.f8414h, (Theme51SevenSegView) this.f8415i, this.f8412f, this.f8413g, this.f8410d, (Theme51GaugeArcView) this.f8411e, (Theme51SevenSegView) this.f8416j, this.f8417k, this.f8418l, this.f8419m, this.f8420n, this.f8421o);
                AbstractC1372y1.m3295a(this.f8422p, floatValue7);
                break;
        }
    }

    public /* synthetic */ C1558n(C1506T0 c1506t0, boolean z2, ImageView imageView, Theme51GaugeArcView theme51GaugeArcView, Theme51SevenSegView theme51SevenSegView, float f2, float f3, ImageView imageView2, Theme51GaugeArcView theme51GaugeArcView2, Theme51SevenSegView theme51SevenSegView2, float f4, float f5, boolean z3, float f6, float f7, int[] iArr) {
        this.f8407a = 6;
        this.f8423q = c1506t0;
        this.f8408b = z2;
        this.f8409c = imageView;
        this.f8414h = theme51GaugeArcView;
        this.f8415i = theme51SevenSegView;
        this.f8412f = f2;
        this.f8413g = f3;
        this.f8410d = imageView2;
        this.f8411e = theme51GaugeArcView2;
        this.f8416j = theme51SevenSegView2;
        this.f8417k = f4;
        this.f8418l = f5;
        this.f8419m = z3;
        this.f8420n = f6;
        this.f8421o = f7;
        this.f8422p = iArr;
    }
}
