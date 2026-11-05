package p054a1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.TextView;
import p082l.C1096Y;

/* renamed from: a1.q */
/* loaded from: classes.dex */
public final class C0508q extends AnimatorListenerAdapter {

    /* renamed from: a */
    public final /* synthetic */ int f1617a;

    /* renamed from: b */
    public final /* synthetic */ TextView f1618b;

    /* renamed from: c */
    public final /* synthetic */ int f1619c;

    /* renamed from: d */
    public final /* synthetic */ TextView f1620d;

    /* renamed from: e */
    public final /* synthetic */ C0510s f1621e;

    public C0508q(C0510s c0510s, int i, TextView textView, int i2, TextView textView2) {
        this.f1621e = c0510s;
        this.f1617a = i;
        this.f1618b = textView;
        this.f1619c = i2;
        this.f1620d = textView2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1096Y c1096y;
        int i = this.f1617a;
        C0510s c0510s = this.f1621e;
        c0510s.f1638n = i;
        c0510s.f1636l = null;
        TextView textView = this.f1618b;
        if (textView != null) {
            textView.setVisibility(4);
            if (this.f1619c == 1 && (c1096y = c0510s.f1642r) != null) {
                c1096y.setText((CharSequence) null);
            }
        }
        TextView textView2 = this.f1620d;
        if (textView2 != null) {
            textView2.setTranslationY(0.0f);
            textView2.setAlpha(1.0f);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        TextView textView = this.f1620d;
        if (textView != null) {
            textView.setVisibility(0);
            textView.setAlpha(0.0f);
        }
    }
}
