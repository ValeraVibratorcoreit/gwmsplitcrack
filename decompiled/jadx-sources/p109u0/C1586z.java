package p109u0;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import p098q0.AbstractC1372y1;

/* renamed from: u0.z */
/* loaded from: classes.dex */
public final class C1586z extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int[] f8976a;

    /* renamed from: b */
    public final /* synthetic */ ImageView f8977b;

    /* renamed from: c */
    public final /* synthetic */ ImageView f8978c;

    /* renamed from: d */
    public final /* synthetic */ TextView f8979d;

    /* renamed from: e */
    public final /* synthetic */ float f8980e;

    /* renamed from: f */
    public final /* synthetic */ ImageView f8981f;

    /* renamed from: g */
    public final /* synthetic */ ImageView f8982g;

    /* renamed from: h */
    public final /* synthetic */ TextView f8983h;

    /* renamed from: i */
    public final /* synthetic */ float f8984i;

    /* renamed from: j */
    public final /* synthetic */ boolean f8985j;

    /* renamed from: k */
    public final /* synthetic */ C1474D f8986k;

    public C1586z(C1474D c1474d, int[] iArr, ImageView imageView, ImageView imageView2, TextView textView, float f2, ImageView imageView3, ImageView imageView4, TextView textView2, float f3, boolean z2) {
        this.f8986k = c1474d;
        this.f8976a = iArr;
        this.f8977b = imageView;
        this.f8978c = imageView2;
        this.f8979d = textView;
        this.f8980e = f2;
        this.f8981f = imageView3;
        this.f8982g = imageView4;
        this.f8983h = textView2;
        this.f8984i = f3;
        this.f8985j = z2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        C1474D c1474d = this.f8986k;
        c1474d.f7204I0 = false;
        c1474d.f7202H0 = null;
        AbstractC1372y1.m3295a(this.f8976a, 1.0f);
        TextView textView = this.f8979d;
        float f2 = this.f8980e;
        ImageView imageView = this.f8977b;
        ImageView imageView2 = this.f8978c;
        C1474D.m3502F(imageView, imageView2, textView, f2);
        TextView textView2 = this.f8983h;
        float f3 = this.f8984i;
        ImageView imageView3 = this.f8981f;
        ImageView imageView4 = this.f8982g;
        C1474D.m3502F(imageView3, imageView4, textView2, f3);
        if (this.f8985j && (view = c1474d.f7273o0) != null) {
            view.setTranslationY(0.0f);
        }
        ImageView imageView5 = c1474d.f7272o;
        if (imageView5 != null) {
            imageView5.setTranslationY(0.0f);
        }
        c1474d.m3516B();
        if (imageView2 != null) {
            C1472C c1472c = imageView2 == c1474d.f7278r ? c1474d.f7188A0 : c1474d.f7190B0;
            if (c1472c != null) {
                c1472c.m3499a(imageView2);
            }
        }
        if (imageView4 != null) {
            C1472C c1472c2 = imageView4 == c1474d.f7278r ? c1474d.f7188A0 : c1474d.f7190B0;
            if (c1472c2 != null) {
                c1472c2.m3499a(imageView4);
            }
        }
    }
}
