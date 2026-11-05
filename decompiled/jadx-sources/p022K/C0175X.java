package p022K;

import android.view.View;
import java.lang.ref.WeakReference;
import p013F0.C0097a;

/* renamed from: K.X */
/* loaded from: classes.dex */
public final class C0175X {

    /* renamed from: a */
    public final WeakReference f483a;

    public C0175X(View view) {
        this.f483a = new WeakReference(view);
    }

    /* renamed from: a */
    public final void m520a(float f2) {
        View view = (View) this.f483a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
    }

    /* renamed from: b */
    public final void m521b() {
        View view = (View) this.f483a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    /* renamed from: c */
    public final void m522c(long j2) {
        View view = (View) this.f483a.get();
        if (view != null) {
            view.animate().setDuration(j2);
        }
    }

    /* renamed from: d */
    public final void m523d(InterfaceC0176Y interfaceC0176Y) {
        View view = (View) this.f483a.get();
        if (view != null) {
            if (interfaceC0176Y != null) {
                view.animate().setListener(new C0097a(interfaceC0176Y, view));
            } else {
                view.animate().setListener(null);
            }
        }
    }

    /* renamed from: e */
    public final void m524e(float f2) {
        View view = (View) this.f483a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
    }
}
