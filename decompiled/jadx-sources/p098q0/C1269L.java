package p098q0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.p061ip.HolePunchImageView;

/* renamed from: q0.L */
/* loaded from: classes.dex */
public final class C1269L extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int[] f5772a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f5773b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f5774c;

    /* renamed from: d */
    public final /* synthetic */ TextView f5775d;

    /* renamed from: e */
    public final /* synthetic */ TextView f5776e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f5777f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f5778g;

    /* renamed from: h */
    public final /* synthetic */ TextView f5779h;

    /* renamed from: i */
    public final /* synthetic */ TextView f5780i;

    /* renamed from: j */
    public final /* synthetic */ boolean f5781j;

    /* renamed from: k */
    public final /* synthetic */ C1275O f5782k;

    public C1269L(C1275O c1275o, int[] iArr, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, ImageView imageView3, ImageView imageView4, TextView textView3, TextView textView4, boolean z2) {
        this.f5782k = c1275o;
        this.f5772a = iArr;
        this.f5773b = imageView;
        this.f5774c = imageView2;
        this.f5775d = textView;
        this.f5776e = textView2;
        this.f5777f = imageView3;
        this.f5778g = imageView4;
        this.f5779h = textView3;
        this.f5780i = textView4;
        this.f5781j = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1275O c1275o = this.f5782k;
        c1275o.f5884m1 = false;
        c1275o.f5881l1 = null;
        AbstractC1372y1.m3295a(this.f5772a, 1.0f);
        C1275O.m3050a(c1275o, this.f5773b, this.f5774c, this.f5775d, this.f5776e);
        C1275O.m3050a(c1275o, this.f5777f, this.f5778g, this.f5779h, this.f5780i);
        if (c1275o.f5887n1) {
            C1275O.m3050a(c1275o, c1275o.f5898r0, c1275o.f5901s0, null, null);
            C1275O.m3050a(c1275o, c1275o.f5904t0, c1275o.f5907u0, null, null);
        }
        c1275o.f5887n1 = false;
        HolePunchImageView holePunchImageView = c1275o.f5811G;
        if (holePunchImageView != null) {
            holePunchImageView.setTranslationY(0.0f);
        }
        ImageView imageView = c1275o.f5813H;
        if (imageView != null) {
            imageView.setTranslationY(0.0f);
        }
        if (!this.f5781j) {
            C1260G0 c1260g0 = c1275o.f5799A;
            if (c1260g0 != null) {
                c1260g0.f5725k = true;
            }
            C1260G0 c1260g02 = c1275o.f5917z;
            if (c1260g02 != null) {
                c1260g02.f5725k = true;
            }
        }
        c1275o.m3069W();
        c1275o.m3059H();
        c1275o.m3060I();
    }
}
