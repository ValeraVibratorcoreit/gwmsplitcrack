package p109u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.p061ip.Theme51GaugeArcView;
import com.altaysoft.t500_split.p061ip.Theme51SevenSegView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.p */
/* loaded from: classes.dex */
public final class C1564p extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f8512a;

    /* renamed from: b */
    public final /* synthetic */ int[] f8513b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f8514c;

    /* renamed from: d */
    public final /* synthetic */ ImageView f8515d;

    /* renamed from: e */
    public final /* synthetic */ View f8516e;

    /* renamed from: f */
    public final /* synthetic */ float f8517f;

    /* renamed from: g */
    public final /* synthetic */ View f8518g;

    /* renamed from: h */
    public final /* synthetic */ View f8519h;

    /* renamed from: i */
    public final /* synthetic */ View f8520i;

    /* renamed from: j */
    public final /* synthetic */ float f8521j;

    /* renamed from: k */
    public final /* synthetic */ boolean f8522k;

    /* renamed from: l */
    public final /* synthetic */ boolean f8523l;

    /* renamed from: m */
    public final /* synthetic */ Object f8524m;

    public /* synthetic */ C1564p(Object obj, int[] iArr, ImageView imageView, ImageView imageView2, TextView textView, float f2, ImageView imageView3, ImageView imageView4, TextView textView2, float f3, boolean z2, boolean z3, int i) {
        this.f8512a = i;
        this.f8524m = obj;
        this.f8513b = iArr;
        this.f8514c = imageView;
        this.f8515d = imageView2;
        this.f8516e = textView;
        this.f8517f = f2;
        this.f8518g = imageView3;
        this.f8519h = imageView4;
        this.f8520i = textView2;
        this.f8521j = f3;
        this.f8522k = z2;
        this.f8523l = z3;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        View view2;
        View view3;
        View view4;
        View view5;
        View view6;
        switch (this.f8512a) {
            case 0:
                C1576u c1576u = (C1576u) this.f8524m;
                c1576u.f8773g1 = false;
                c1576u.f8770f1 = null;
                AbstractC1372y1.m3295a(this.f8513b, 1.0f);
                TextView textView = (TextView) this.f8516e;
                float f2 = this.f8517f;
                ImageView imageView = this.f8514c;
                ImageView imageView2 = this.f8515d;
                c1576u.m4528R(imageView, imageView2, textView, f2);
                TextView textView2 = (TextView) this.f8520i;
                float f3 = this.f8521j;
                ImageView imageView3 = (ImageView) this.f8518g;
                ImageView imageView4 = (ImageView) this.f8519h;
                c1576u.m4528R(imageView3, imageView4, textView2, f3);
                if (this.f8522k && (view = c1576u.f8702C0) != null) {
                    view.setTranslationX(0.0f);
                    c1576u.f8702C0.setTranslationY(c1576u.f8740T0);
                }
                ImageView imageView5 = c1576u.f8795o;
                if (imageView5 != null) {
                    imageView5.setTranslationY(0.0f);
                }
                c1576u.m4517L();
                if (!this.f8523l && c1576u.f8827y1 == 0) {
                    c1576u.f8827y1 = -1;
                    c1576u.f8824x1 = false;
                    if (c1576u.f8762d.f2561Q2 && c1576u.f8761c1) {
                        c1576u.m4542c(null);
                    }
                }
                if (imageView2 != null) {
                    C1572s c1572s = imageView2 == c1576u.f8804r ? c1576u.f8746W0 : c1576u.f8748X0;
                    if (c1572s != null) {
                        c1572s.m4470a(imageView2);
                    }
                }
                if (imageView4 != null) {
                    C1572s c1572s2 = imageView4 == c1576u.f8804r ? c1576u.f8746W0 : c1576u.f8748X0;
                    if (c1572s2 != null) {
                        c1572s2.m4470a(imageView4);
                        break;
                    }
                }
                break;
            case 1:
                C1568q0 c1568q0 = (C1568q0) this.f8524m;
                c1568q0.f8579S0 = false;
                c1568q0.f8577R0 = null;
                AbstractC1372y1.m3295a(this.f8513b, 1.0f);
                TextView textView3 = (TextView) this.f8516e;
                float f4 = this.f8517f;
                ImageView imageView6 = this.f8514c;
                ImageView imageView7 = this.f8515d;
                c1568q0.m4367P(imageView6, imageView7, textView3, f4);
                TextView textView4 = (TextView) this.f8520i;
                float f5 = this.f8521j;
                ImageView imageView8 = (ImageView) this.f8518g;
                ImageView imageView9 = (ImageView) this.f8519h;
                c1568q0.m4367P(imageView8, imageView9, textView4, f5);
                if (this.f8522k && (view2 = c1568q0.f8637o0) != null) {
                    view2.setTranslationX(0.0f);
                    c1568q0.f8637o0.setTranslationY(c1568q0.f8553F0);
                }
                ImageView imageView10 = c1568q0.f8636o;
                if (imageView10 != null) {
                    imageView10.setTranslationY(0.0f);
                }
                c1568q0.m4356J();
                if (!this.f8523l && c1568q0.f8632m1 == 0) {
                    c1568q0.f8632m1 = -1;
                    c1568q0.f8629l1 = false;
                    if (c1568q0.f8603d.f2561Q2 && c1568q0.f8571O0) {
                        c1568q0.m4383c(null);
                    }
                }
                if (imageView7 != null) {
                    C1572s c1572s3 = imageView7 == c1568q0.f8645r ? c1568q0.f8559I0 : c1568q0.f8561J0;
                    if (c1572s3 != null) {
                        c1572s3.m4470a(imageView7);
                    }
                }
                if (imageView9 != null) {
                    C1572s c1572s4 = imageView9 == c1568q0.f8645r ? c1568q0.f8559I0 : c1568q0.f8561J0;
                    if (c1572s4 != null) {
                        c1572s4.m4470a(imageView9);
                        break;
                    }
                }
                break;
            case 2:
                C1583x0 c1583x0 = (C1583x0) this.f8524m;
                c1583x0.f8880Q0 = false;
                c1583x0.f8878P0 = null;
                AbstractC1372y1.m3295a(this.f8513b, 1.0f);
                TextView textView5 = (TextView) this.f8516e;
                float f6 = this.f8517f;
                ImageView imageView11 = this.f8514c;
                ImageView imageView12 = this.f8515d;
                c1583x0.m4658P(imageView11, imageView12, textView5, f6);
                TextView textView6 = (TextView) this.f8520i;
                float f7 = this.f8521j;
                ImageView imageView13 = (ImageView) this.f8518g;
                ImageView imageView14 = (ImageView) this.f8519h;
                c1583x0.m4658P(imageView13, imageView14, textView6, f7);
                if (this.f8522k && (view3 = c1583x0.f8936m0) != null) {
                    view3.setTranslationX(0.0f);
                    c1583x0.f8936m0.setTranslationY(c1583x0.f8854D0);
                }
                ImageView imageView15 = c1583x0.f8941o;
                if (imageView15 != null) {
                    imageView15.setTranslationY(0.0f);
                }
                c1583x0.m4647J();
                if (!this.f8523l && c1583x0.f8931k1 == 0) {
                    c1583x0.f8931k1 = -1;
                    c1583x0.f8928j1 = false;
                    if (c1583x0.f8908d.f2561Q2 && c1583x0.f8872M0) {
                        c1583x0.m4673c(null);
                    }
                }
                if (imageView12 != null) {
                    C1572s c1572s5 = imageView12 == c1583x0.f8950r ? c1583x0.f8860G0 : c1583x0.f8862H0;
                    if (c1572s5 != null) {
                        c1572s5.m4470a(imageView12);
                    }
                }
                if (imageView14 != null) {
                    C1572s c1572s6 = imageView14 == c1583x0.f8950r ? c1583x0.f8860G0 : c1583x0.f8862H0;
                    if (c1572s6 != null) {
                        c1572s6.m4470a(imageView14);
                        break;
                    }
                }
                break;
            case 3:
                C1477E0 c1477e0 = (C1477E0) this.f8524m;
                c1477e0.f7336Q0 = false;
                c1477e0.f7334P0 = null;
                AbstractC1372y1.m3295a(this.f8513b, 1.0f);
                TextView textView7 = (TextView) this.f8516e;
                float f8 = this.f8517f;
                ImageView imageView16 = this.f8514c;
                ImageView imageView17 = this.f8515d;
                c1477e0.m3642P(imageView16, imageView17, textView7, f8);
                TextView textView8 = (TextView) this.f8520i;
                float f9 = this.f8521j;
                ImageView imageView18 = (ImageView) this.f8518g;
                ImageView imageView19 = (ImageView) this.f8519h;
                c1477e0.m3642P(imageView18, imageView19, textView8, f9);
                if (this.f8522k && (view4 = c1477e0.f7392m0) != null) {
                    view4.setTranslationX(0.0f);
                    c1477e0.f7392m0.setTranslationY(c1477e0.f7310D0);
                }
                ImageView imageView20 = c1477e0.f7397o;
                if (imageView20 != null) {
                    imageView20.setTranslationY(0.0f);
                }
                c1477e0.m3630J();
                if (!this.f8523l && c1477e0.f7387k1 == 0) {
                    c1477e0.f7387k1 = -1;
                    c1477e0.f7384j1 = false;
                    if (c1477e0.f7364d.f2561Q2 && c1477e0.f7328M0) {
                        c1477e0.m3658c(null);
                    }
                }
                if (imageView17 != null) {
                    C1572s c1572s7 = imageView17 == c1477e0.f7406r ? c1477e0.f7316G0 : c1477e0.f7318H0;
                    if (c1572s7 != null) {
                        c1572s7.m4470a(imageView17);
                    }
                }
                if (imageView19 != null) {
                    C1572s c1572s8 = imageView19 == c1477e0.f7406r ? c1477e0.f7316G0 : c1477e0.f7318H0;
                    if (c1572s8 != null) {
                        c1572s8.m4470a(imageView19);
                        break;
                    }
                }
                break;
            case 4:
                C1491L0 c1491l0 = (C1491L0) this.f8524m;
                c1491l0.f7563Q0 = false;
                c1491l0.f7561P0 = null;
                AbstractC1372y1.m3295a(this.f8513b, 1.0f);
                TextView textView9 = (TextView) this.f8516e;
                float f10 = this.f8517f;
                ImageView imageView21 = this.f8514c;
                ImageView imageView22 = this.f8515d;
                c1491l0.m3808P(imageView21, imageView22, textView9, f10);
                TextView textView10 = (TextView) this.f8520i;
                float f11 = this.f8521j;
                ImageView imageView23 = (ImageView) this.f8518g;
                ImageView imageView24 = (ImageView) this.f8519h;
                c1491l0.m3808P(imageView23, imageView24, textView10, f11);
                if (this.f8522k && (view5 = c1491l0.f7619m0) != null) {
                    view5.setTranslationX(0.0f);
                    c1491l0.f7619m0.setTranslationY(c1491l0.f7537D0);
                }
                ImageView imageView25 = c1491l0.f7624o;
                if (imageView25 != null) {
                    imageView25.setTranslationY(0.0f);
                }
                c1491l0.m3796J();
                if (!this.f8523l && c1491l0.f7614k1 == 0) {
                    c1491l0.f7614k1 = -1;
                    c1491l0.f7611j1 = false;
                    if (c1491l0.f7591d.f2561Q2 && c1491l0.f7555M0) {
                        c1491l0.m3824c(null);
                    }
                }
                if (imageView22 != null) {
                    C1572s c1572s9 = imageView22 == c1491l0.f7633r ? c1491l0.f7543G0 : c1491l0.f7545H0;
                    if (c1572s9 != null) {
                        c1572s9.m4470a(imageView22);
                    }
                }
                if (imageView24 != null) {
                    C1572s c1572s10 = imageView24 == c1491l0.f7633r ? c1491l0.f7543G0 : c1491l0.f7545H0;
                    if (c1572s10 != null) {
                        c1572s10.m4470a(imageView24);
                        break;
                    }
                }
                break;
            default:
                C1506T0 c1506t0 = (C1506T0) this.f8524m;
                c1506t0.f7790M0 = false;
                c1506t0.f7788L0 = null;
                AbstractC1372y1.m3295a(this.f8513b, 1.0f);
                Theme51SevenSegView theme51SevenSegView = (Theme51SevenSegView) this.f8519h;
                float f12 = this.f8517f;
                ImageView imageView26 = this.f8514c;
                Theme51GaugeArcView theme51GaugeArcView = (Theme51GaugeArcView) this.f8518g;
                c1506t0.m3967O(imageView26, theme51GaugeArcView, theme51SevenSegView, f12);
                Theme51SevenSegView theme51SevenSegView2 = (Theme51SevenSegView) this.f8520i;
                float f13 = this.f8521j;
                ImageView imageView27 = this.f8515d;
                Theme51GaugeArcView theme51GaugeArcView2 = (Theme51GaugeArcView) this.f8516e;
                c1506t0.m3967O(imageView27, theme51GaugeArcView2, theme51SevenSegView2, f13);
                if (this.f8522k && (view6 = c1506t0.f7842i0) != null) {
                    view6.setTranslationX(0.0f);
                    c1506t0.f7842i0.setTranslationY(c1506t0.f7880z0);
                }
                ImageView imageView28 = c1506t0.f7857o;
                if (imageView28 != null) {
                    imageView28.setTranslationY(0.0f);
                }
                c1506t0.m3956I();
                if (!this.f8523l && c1506t0.f7831e1 == 0) {
                    c1506t0.f7831e1 = -1;
                    c1506t0.f7828d1 = false;
                    if (c1506t0.f7826d.f2561Q2 && c1506t0.f7782I0) {
                        c1506t0.m3983b(null);
                    }
                }
                if (theme51GaugeArcView != null) {
                    C1504S0 c1504s0 = theme51GaugeArcView == c1506t0.f7863r ? c1506t0.f7770C0 : c1506t0.f7772D0;
                    if (c1504s0 != null) {
                        c1504s0.m3920a(theme51GaugeArcView);
                    }
                }
                if (theme51GaugeArcView2 != null) {
                    C1504S0 c1504s02 = theme51GaugeArcView2 == c1506t0.f7863r ? c1506t0.f7770C0 : c1506t0.f7772D0;
                    if (c1504s02 != null) {
                        c1504s02.m3920a(theme51GaugeArcView2);
                        break;
                    }
                }
                break;
        }
    }

    public C1564p(C1506T0 c1506t0, int[] iArr, ImageView imageView, Theme51GaugeArcView theme51GaugeArcView, Theme51SevenSegView theme51SevenSegView, float f2, ImageView imageView2, Theme51GaugeArcView theme51GaugeArcView2, Theme51SevenSegView theme51SevenSegView2, float f3, boolean z2, boolean z3) {
        this.f8512a = 5;
        this.f8524m = c1506t0;
        this.f8513b = iArr;
        this.f8514c = imageView;
        this.f8518g = theme51GaugeArcView;
        this.f8519h = theme51SevenSegView;
        this.f8517f = f2;
        this.f8515d = imageView2;
        this.f8516e = theme51GaugeArcView2;
        this.f8520i = theme51SevenSegView2;
        this.f8521j = f3;
        this.f8522k = z2;
        this.f8523l = z3;
    }
}
