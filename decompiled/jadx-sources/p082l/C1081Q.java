package p082l;

import android.graphics.Typeface;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p003B.AbstractC0035b;
import p017H0.RunnableC0123b;

/* renamed from: l.Q */
/* loaded from: classes.dex */
public final class C1081Q extends AbstractC0035b {

    /* renamed from: h */
    public final /* synthetic */ int f5096h;

    /* renamed from: i */
    public final /* synthetic */ int f5097i;

    /* renamed from: j */
    public final /* synthetic */ WeakReference f5098j;

    /* renamed from: k */
    public final /* synthetic */ C1090V f5099k;

    public C1081Q(C1090V c1090v, int i, int i2, WeakReference weakReference) {
        this.f5099k = c1090v;
        this.f5096h = i;
        this.f5097i = i2;
        this.f5098j = weakReference;
    }

    @Override // p003B.AbstractC0035b
    /* renamed from: g */
    public final void mo52g(int i) {
    }

    @Override // p003B.AbstractC0035b
    /* renamed from: h */
    public final void mo53h(Typeface typeface) {
        int i = this.f5096h;
        if (i != -1) {
            typeface = AbstractC1088U.m2706a(typeface, i, (this.f5097i & 2) != 0);
        }
        C1090V c1090v = this.f5099k;
        if (c1090v.f5120m) {
            c1090v.f5119l = typeface;
            TextView textView = (TextView) this.f5098j.get();
            if (textView != null) {
                if (textView.isAttachedToWindow()) {
                    textView.post(new RunnableC0123b(textView, typeface, c1090v.f5117j));
                } else {
                    textView.setTypeface(typeface, c1090v.f5117j);
                }
            }
        }
    }
}
