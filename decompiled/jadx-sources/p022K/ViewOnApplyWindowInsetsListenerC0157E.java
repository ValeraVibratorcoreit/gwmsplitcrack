package p022K;

import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: K.E */
/* loaded from: classes.dex */
public final class ViewOnApplyWindowInsetsListenerC0157E implements View.OnApplyWindowInsetsListener {

    /* renamed from: a */
    public C0221v0 f471a = null;

    /* renamed from: b */
    public final /* synthetic */ View f472b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0210q f473c;

    public ViewOnApplyWindowInsetsListenerC0157E(View view, InterfaceC0210q interfaceC0210q) {
        this.f472b = view;
        this.f473c = interfaceC0210q;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        C0221v0 m680g = C0221v0.m680g(view, windowInsets);
        int i = Build.VERSION.SDK_INT;
        InterfaceC0210q interfaceC0210q = this.f473c;
        if (i < 30) {
            AbstractC0158F.m420a(windowInsets, this.f472b);
            if (m680g.equals(this.f471a)) {
                return interfaceC0210q.mo18c(view, m680g).m685f();
            }
        }
        this.f471a = m680g;
        C0221v0 mo18c = interfaceC0210q.mo18c(view, m680g);
        if (i >= 30) {
            return mo18c.m685f();
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0156D.m419c(view);
        return mo18c.m685f();
    }
}
