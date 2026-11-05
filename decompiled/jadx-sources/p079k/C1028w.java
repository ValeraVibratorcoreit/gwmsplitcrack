package p079k;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import com.altaysoft.t500_split.R;

/* renamed from: k.w */
/* loaded from: classes.dex */
public class C1028w {

    /* renamed from: a */
    public final Context f4897a;

    /* renamed from: b */
    public final MenuC1018m f4898b;

    /* renamed from: c */
    public final boolean f4899c;

    /* renamed from: d */
    public final int f4900d;

    /* renamed from: e */
    public View f4901e;

    /* renamed from: g */
    public boolean f4903g;

    /* renamed from: h */
    public InterfaceC1029x f4904h;

    /* renamed from: i */
    public AbstractC1026u f4905i;

    /* renamed from: j */
    public C1027v f4906j;

    /* renamed from: f */
    public int f4902f = 8388611;

    /* renamed from: k */
    public final C1027v f4907k = new C1027v(this);

    public C1028w(int i, Context context, View view, MenuC1018m menuC1018m, boolean z2) {
        this.f4897a = context;
        this.f4898b = menuC1018m;
        this.f4901e = view;
        this.f4899c = z2;
        this.f4900d = i;
    }

    /* renamed from: a */
    public final AbstractC1026u m2635a() {
        AbstractC1026u viewOnKeyListenerC1004D;
        if (this.f4905i == null) {
            Context context = this.f4897a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                viewOnKeyListenerC1004D = new ViewOnKeyListenerC1012g(context, this.f4901e, this.f4900d, this.f4899c);
            } else {
                View view = this.f4901e;
                Context context2 = this.f4897a;
                boolean z2 = this.f4899c;
                viewOnKeyListenerC1004D = new ViewOnKeyListenerC1004D(this.f4900d, context2, view, this.f4898b, z2);
            }
            viewOnKeyListenerC1004D.mo2585l(this.f4898b);
            viewOnKeyListenerC1004D.mo2590r(this.f4907k);
            viewOnKeyListenerC1004D.mo2586n(this.f4901e);
            viewOnKeyListenerC1004D.mo2584k(this.f4904h);
            viewOnKeyListenerC1004D.mo2587o(this.f4903g);
            viewOnKeyListenerC1004D.mo2588p(this.f4902f);
            this.f4905i = viewOnKeyListenerC1004D;
        }
        return this.f4905i;
    }

    /* renamed from: b */
    public final boolean m2636b() {
        AbstractC1026u abstractC1026u = this.f4905i;
        return abstractC1026u != null && abstractC1026u.mo2577b();
    }

    /* renamed from: c */
    public void mo2637c() {
        this.f4905i = null;
        C1027v c1027v = this.f4906j;
        if (c1027v != null) {
            c1027v.onDismiss();
        }
    }

    /* renamed from: d */
    public final void m2638d(int i, int i2, boolean z2, boolean z3) {
        AbstractC1026u m2635a = m2635a();
        m2635a.mo2591s(z3);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f4902f, this.f4901e.getLayoutDirection()) & 7) == 5) {
                i -= this.f4901e.getWidth();
            }
            m2635a.mo2589q(i);
            m2635a.mo2592t(i2);
            int i3 = (int) ((this.f4897a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            m2635a.f4895f = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        m2635a.mo2578f();
    }
}
