package p098q0;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.cfgData;
import p006C.AbstractC0062j;

/* renamed from: q0.u1 */
/* loaded from: classes.dex */
public final class C1360u1 {

    /* renamed from: a */
    public final Context f6379a;

    /* renamed from: b */
    public final cfgData f6380b = cfgData.m1784i();

    /* renamed from: c */
    public WindowManager f6381c;

    /* renamed from: d */
    public View f6382d;

    /* renamed from: e */
    public boolean f6383e;

    /* renamed from: f */
    public Button f6384f;

    /* renamed from: g */
    public Button f6385g;

    /* renamed from: h */
    public Button f6386h;

    /* renamed from: i */
    public Button f6387i;

    /* renamed from: j */
    public Button f6388j;

    /* renamed from: k */
    public Button f6389k;

    /* renamed from: l */
    public Button f6390l;

    /* renamed from: m */
    public Button f6391m;

    /* renamed from: n */
    public Button f6392n;

    /* renamed from: o */
    public Button f6393o;

    /* renamed from: p */
    public Button f6394p;

    /* renamed from: q */
    public Button f6395q;

    /* renamed from: r */
    public Button f6396r;

    public C1360u1(Context context) {
        this.f6379a = context.getApplicationContext();
    }

    /* renamed from: f */
    public static void m3253f(Button button, int i, int i2) {
        ViewGroup.LayoutParams layoutParams = button.getLayoutParams();
        layoutParams.width = 100;
        layoutParams.height = i2;
        button.setLayoutParams(layoutParams);
        button.requestLayout();
        Drawable drawable = button.getCompoundDrawables()[0];
        if (drawable != null) {
            drawable.setBounds(0, 0, i, i);
            button.setCompoundDrawables(drawable, null, null, null);
        }
    }

    /* renamed from: a */
    public final void m3254a() {
        int i;
        int i2;
        this.f6384f.setEnabled(true);
        this.f6385g.setEnabled(true);
        this.f6386h.setEnabled(true);
        this.f6387i.setEnabled(true);
        this.f6388j.setEnabled(true);
        this.f6389k.setEnabled(true);
        this.f6390l.setEnabled(true);
        this.f6391m.setEnabled(true);
        this.f6392n.setEnabled(true);
        this.f6393o.setEnabled(true);
        this.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_speed, 0, 0, 0);
        this.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_resizeleft, 0, 0, 0);
        this.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_resizeright, 0, 0, 0);
        this.f6394p.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_replace, 0, 0, 0);
        this.f6395q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_settings, 0, 0, 0);
        this.f6396r.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_apps, 0, 0, 0);
        this.f6387i.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_1, 0, 0, 0);
        this.f6388j.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_2, 0, 0, 0);
        this.f6389k.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_3, 0, 0, 0);
        this.f6390l.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_4, 0, 0, 0);
        this.f6391m.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_5, 0, 0, 0);
        this.f6392n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_6, 0, 0, 0);
        this.f6393o.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_7, 0, 0, 0);
        cfgData cfgdata = this.f6380b;
        if (cfgdata.m1790j()) {
            this.f6385g.setVisibility(4);
            this.f6386h.setVisibility(4);
        }
        if (AbstractC1372y1.m3299e("presets5")) {
            this.f6389k.setVisibility(4);
            this.f6390l.setVisibility(4);
            this.f6391m.setVisibility(4);
            this.f6392n.setVisibility(4);
            this.f6393o.setVisibility(4);
        }
        if (cfgdata.f2540L1 == 1) {
            this.f6387i.setEnabled(false);
            this.f6387i.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_1_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 2) {
            this.f6388j.setEnabled(false);
            this.f6388j.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_2_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 3) {
            this.f6389k.setEnabled(false);
            this.f6389k.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_3_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 4) {
            this.f6390l.setEnabled(false);
            this.f6390l.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_4_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 5) {
            this.f6391m.setEnabled(false);
            this.f6391m.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_5_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 6) {
            this.f6392n.setEnabled(false);
            this.f6392n.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_6_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 7) {
            this.f6393o.setEnabled(false);
            this.f6393o.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_7_a, 0, 0, 0);
        }
        if (cfgdata.f2692s3) {
            this.f6385g.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_resizeleft_a, 0, 0, 0);
        }
        if (cfgdata.f2697t3) {
            this.f6386h.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_resizeright_a, 0, 0, 0);
        }
        if (cfgdata.f2553O2) {
            this.f6384f.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_speed_a, 0, 0, 0);
        }
        if (cfgdata.f2535K0) {
            i = 56;
            i2 = 60;
        } else {
            i = 64;
            i2 = 120;
        }
        m3253f(this.f6384f, i, i2);
        m3253f(this.f6385g, i, i2);
        m3253f(this.f6386h, i, i2);
        m3253f(this.f6387i, i, i2);
        m3253f(this.f6388j, i, i2);
        m3253f(this.f6389k, i, i2);
        m3253f(this.f6390l, i, i2);
        m3253f(this.f6391m, i, i2);
        m3253f(this.f6392n, i, i2);
        m3253f(this.f6393o, i, i2);
        m3253f(this.f6394p, i, i2);
        m3253f(this.f6395q, i, i2);
        m3253f(this.f6396r, i, i2);
        this.f6384f.setEnabled(true ^ AbstractC1372y1.m3299e("ip_navi"));
        this.f6384f.setVisibility(cfgdata.f2537K2 ? 0 : 4);
        this.f6385g.setVisibility((cfgdata.f2553O2 || cfgdata.m1790j()) ? 4 : 0);
        this.f6386h.setVisibility((cfgdata.f2553O2 || cfgdata.m1790j()) ? 4 : 0);
        this.f6394p.setVisibility(cfgdata.f2553O2 ? 4 : 0);
        ImageView imageView = (ImageView) this.f6382d.findViewById(R.id.logoView);
        AbstractC0062j.m148b(cfgdata.f2508D3);
        if (cfgdata.f2535K0) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(AbstractC0062j.m148b(cfgdata.f2508D3));
        }
    }

    /* renamed from: b */
    public final void m3255b() {
        if (!this.f6383e || this.f6382d == null) {
            return;
        }
        this.f6380b.m1791k(this.f6379a, false);
        m3254a();
    }

    /* renamed from: c */
    public final void m3256c() {
        cfgData cfgdata;
        int m1792l;
        if (!this.f6383e || this.f6381c == null || this.f6382d == null || (m1792l = (cfgdata = this.f6380b).m1792l()) <= 0) {
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f6382d.getLayoutParams();
        int i = cfgdata.f2515F0;
        int i2 = cfgdata.f2510E0;
        int i3 = i - i2;
        int m2990E = i2 - AbstractC1256E0.m2990E(cfgdata);
        int i4 = cfgdata.f2505D0;
        if (layoutParams.width == i3 && layoutParams.height == m1792l && layoutParams.x == m2990E && layoutParams.y == i4) {
            return;
        }
        layoutParams.width = i3;
        layoutParams.height = m1792l;
        layoutParams.x = m2990E;
        layoutParams.y = i4;
        try {
            this.f6381c.updateViewLayout(this.f6382d, layoutParams);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    public final void m3257d() {
        TopOverlayService.m1704c(this.f6379a);
        AbstractC1372y1.m3300f();
        m3259g(MainActivity.class);
    }

    /* renamed from: e */
    public final void m3258e(int i, Button button) {
        if (i <= 2 || !AbstractC1372y1.m3299e("presets5")) {
            cfgData cfgdata = this.f6380b;
            if (cfgdata.f2540L1 == i) {
                return;
            }
            button.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
            int i2 = cfgdata.f2540L1;
            cfgdata.f2540L1 = i;
            Context context = this.f6379a;
            cfgdata.m1797q(context);
            if (!AbstractC1256E0.m2988C(context, i2, i)) {
                AbstractC1256E0.m3014g(context, i2, i);
            } else {
                AbstractC1256E0.m2993H(context);
                m3257d();
            }
        }
    }

    /* renamed from: g */
    public final void m3259g(Class cls) {
        Context context = this.f6379a;
        try {
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.addFlags(402722816);
            intent.putExtra("caller", "top");
            context.startActivity(intent, ActivityOptions.makeBasic().toBundle());
        } catch (Exception unused) {
        }
    }

    /* renamed from: h */
    public final void m3260h(boolean z2) {
        View view = this.f6382d;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
        }
    }
}
