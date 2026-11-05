package p022K;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import p045W0.C0355e;

/* renamed from: K.C */
/* loaded from: classes.dex */
public abstract class AbstractC0155C {

    /* renamed from: a */
    public int f467a;

    /* renamed from: b */
    public int f468b;

    /* renamed from: c */
    public int f469c;

    /* renamed from: d */
    public Object f470d;

    public AbstractC0155C() {
        if (C0355e.f1006g == null) {
            C0355e.f1006g = new C0355e(10);
        }
    }

    /* renamed from: a */
    public int m415a(int i) {
        if (i < this.f469c) {
            return ((ByteBuffer) this.f470d).getShort(this.f468b + i);
        }
        return 0;
    }

    /* renamed from: b */
    public abstract Object mo412b(View view);

    /* renamed from: c */
    public abstract void mo413c(View view, Object obj);

    /* renamed from: d */
    public void m416d(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f468b) {
            mo413c(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f468b) {
            tag = mo412b(view);
        } else {
            tag = view.getTag(this.f467a);
            if (!((Class) this.f470d).isInstance(tag)) {
                tag = null;
            }
        }
        if (mo414e(tag, obj)) {
            View.AccessibilityDelegate m497b = AbstractC0169Q.m497b(view);
            C0180b c0180b = m497b == null ? null : m497b instanceof C0178a ? ((C0178a) m497b).f484a : new C0180b(m497b);
            if (c0180b == null) {
                c0180b = new C0180b();
            }
            AbstractC0169Q.m505j(view, c0180b);
            view.setTag(this.f467a, obj);
            AbstractC0169Q.m500e(view, this.f469c);
        }
    }

    /* renamed from: e */
    public abstract boolean mo414e(Object obj, Object obj2);
}
