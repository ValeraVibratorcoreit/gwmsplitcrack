package p109u0;

import android.os.Handler;
import android.widget.TextView;
import p001A0.RunnableC0020n;

/* renamed from: u0.e */
/* loaded from: classes.dex */
public final class C1531e {

    /* renamed from: a */
    public final Handler f8186a;

    /* renamed from: b */
    public final TextView f8187b;

    /* renamed from: d */
    public boolean f8189d;

    /* renamed from: c */
    public int f8188c = 590;

    /* renamed from: e */
    public final RunnableC0020n f8190e = new RunnableC0020n(22, this);

    public C1531e(Handler handler, TextView textView) {
        this.f8186a = handler;
        this.f8187b = textView;
    }

    /* renamed from: a */
    public final void m4170a() {
        this.f8188c = 595;
        TextView textView = this.f8187b;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    /* renamed from: b */
    public final void m4171b() {
        TextView textView = this.f8187b;
        if (textView == null) {
            return;
        }
        this.f8189d = true;
        this.f8188c = 590;
        textView.setVisibility(4);
        RunnableC0020n runnableC0020n = this.f8190e;
        Handler handler = this.f8186a;
        handler.removeCallbacks(runnableC0020n);
        handler.postDelayed(runnableC0020n, 600L);
    }

    /* renamed from: c */
    public final void m4172c() {
        this.f8189d = false;
        this.f8186a.removeCallbacks(this.f8190e);
    }
}
