package p016H;

import android.animation.ValueAnimator;
import android.os.Handler;
import android.view.View;
import p003B.C0043j;
import p013F0.RunnableC0099c;
import p022K.C0185d0;
import p022K.C0195i0;

/* renamed from: H.m */
/* loaded from: classes.dex */
public final class RunnableC0121m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f376a = 0;

    /* renamed from: b */
    public Object f377b;

    /* renamed from: c */
    public Object f378c;

    /* renamed from: d */
    public Object f379d;

    public /* synthetic */ RunnableC0121m() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        switch (this.f376a) {
            case 0:
                try {
                    obj = ((CallableC0113e) this.f377b).call();
                } catch (Exception unused) {
                    obj = null;
                }
                ((Handler) this.f379d).post(new RunnableC0099c((C0114f) this.f378c, 2, obj));
                break;
            default:
                C0185d0.m546h((View) this.f377b, (C0043j) this.f378c);
                ((ValueAnimator) this.f379d).start();
                break;
        }
    }

    public RunnableC0121m(View view, C0195i0 c0195i0, C0043j c0043j, ValueAnimator valueAnimator) {
        this.f377b = view;
        this.f378c = c0043j;
        this.f379d = valueAnimator;
    }
}
