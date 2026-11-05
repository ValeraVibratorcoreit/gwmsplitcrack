package com.altaysoft.t500_split;

import android.app.ActivityOptions;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import com.altaysoft.t500_split.configActivity.CFG4;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.C1310e;
import p109u0.AbstractC1539g1;

/* loaded from: classes.dex */
public class Top extends AbstractActivityC0870i {

    /* renamed from: E */
    public final cfgData f2343E = cfgData.m1784i();

    /* renamed from: F */
    public Button f2344F;

    /* renamed from: G */
    public Button f2345G;

    /* renamed from: H */
    public Button f2346H;

    /* renamed from: I */
    public Button f2347I;

    /* renamed from: J */
    public Button f2348J;

    /* renamed from: K */
    public Button f2349K;

    /* renamed from: L */
    public Button f2350L;

    /* renamed from: M */
    public Button f2351M;

    /* renamed from: N */
    public Button f2352N;

    /* renamed from: O */
    public Button f2353O;

    /* renamed from: P */
    public Button f2354P;

    /* renamed from: Q */
    public Button f2355Q;

    /* renamed from: R */
    public Button f2356R;

    /* renamed from: u */
    public static void m1701u(Button button, int i, int i2) {
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

    public void onAppsButtonClick(View view) {
        C1310e.m3161d(this);
    }

    public void onCfgButtonClick(View view) {
        this.f2355Q.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1702t(CFG4.class);
        super.finish();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_top);
        cfgData cfgdata = this.f2343E;
        cfgdata.m1791k(this, false);
        if (cfgdata.f2549N2) {
            super.finish();
            return;
        }
        View findViewById = findViewById(R.id.main);
        if (cfgdata.f2704v0) {
            findViewById.setLayoutDirection(1);
        }
        this.f2344F = (Button) findViewById(R.id.but_IP_Navi);
        this.f2345G = (Button) findViewById(R.id.butLF);
        this.f2346H = (Button) findViewById(R.id.butRF);
        this.f2347I = (Button) findViewById(R.id.butPS1);
        this.f2348J = (Button) findViewById(R.id.butPS2);
        this.f2349K = (Button) findViewById(R.id.butPS3);
        this.f2350L = (Button) findViewById(R.id.butPS4);
        this.f2351M = (Button) findViewById(R.id.butPS5);
        this.f2352N = (Button) findViewById(R.id.butPS6);
        this.f2353O = (Button) findViewById(R.id.butPS7);
        this.f2354P = (Button) findViewById(R.id.butSwap);
        this.f2355Q = (Button) findViewById(R.id.butCFG);
        this.f2356R = (Button) findViewById(R.id.butApps);
        if (cfgdata.m1790j()) {
            this.f2345G.setVisibility(4);
            this.f2346H.setVisibility(4);
        }
        if (AbstractC1372y1.m3299e("presets5")) {
            this.f2349K.setVisibility(4);
        }
        if (AbstractC1372y1.m3299e("presets5")) {
            this.f2350L.setVisibility(4);
        }
        if (AbstractC1372y1.m3299e("presets5")) {
            this.f2351M.setVisibility(4);
        }
        if (AbstractC1372y1.m3299e("presets5")) {
            this.f2352N.setVisibility(4);
        }
        if (AbstractC1372y1.m3299e("presets5")) {
            this.f2353O.setVisibility(4);
        }
        if (cfgdata.f2540L1 == 1) {
            this.f2347I.setEnabled(false);
            this.f2347I.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_1_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 2) {
            this.f2348J.setEnabled(false);
            this.f2348J.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_2_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 3) {
            this.f2349K.setEnabled(false);
            this.f2349K.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_3_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 4) {
            this.f2350L.setEnabled(false);
            this.f2350L.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_4_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 5) {
            this.f2351M.setEnabled(false);
            this.f2351M.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_5_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 6) {
            this.f2352N.setEnabled(false);
            this.f2352N.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_1_a, 0, 0, 0);
        }
        if (cfgdata.f2540L1 == 7) {
            this.f2353O.setEnabled(false);
            this.f2353O.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_2_a, 0, 0, 0);
        }
        if (cfgdata.f2692s3) {
            this.f2345G.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_resizeleft_a, 0, 0, 0);
        }
        if (cfgdata.f2697t3) {
            this.f2346H.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_resizeright_a, 0, 0, 0);
        }
        if (cfgdata.f2553O2) {
            this.f2344F.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_speed_a, 0, 0, 0);
        }
        if (cfgdata.f2535K0) {
            i = 56;
            i2 = 60;
        } else {
            i = 64;
            i2 = 120;
        }
        m1701u(this.f2344F, i, i2);
        m1701u(this.f2345G, i, i2);
        m1701u(this.f2346H, i, i2);
        m1701u(this.f2347I, i, i2);
        m1701u(this.f2348J, i, i2);
        m1701u(this.f2349K, i, i2);
        m1701u(this.f2350L, i, i2);
        m1701u(this.f2351M, i, i2);
        m1701u(this.f2352N, i, i2);
        m1701u(this.f2353O, i, i2);
        m1701u(this.f2354P, i, i2);
        m1701u(this.f2355Q, i, i2);
        m1701u(this.f2356R, i, i2);
        this.f2344F.setEnabled(true ^ AbstractC1372y1.m3299e("ip_navi"));
        this.f2344F.setVisibility(cfgdata.f2537K2 ? 0 : 4);
        this.f2345G.setVisibility((cfgdata.f2553O2 || cfgdata.m1790j()) ? 4 : 0);
        this.f2346H.setVisibility((cfgdata.f2553O2 || cfgdata.m1790j()) ? 4 : 0);
        this.f2354P.setVisibility(cfgdata.f2553O2 ? 4 : 0);
        if (!cfgdata.f2545M2) {
            new Handler().postDelayed(new RunnableC0020n(20, this), 7000L);
        }
        ImageView imageView = (ImageView) findViewById(R.id.logoView);
        AbstractC0062j.m148b(cfgdata.f2508D3);
        if (cfgdata.f2535K0) {
            imageView.setVisibility(4);
        } else {
            imageView.setVisibility(0);
            imageView.setImageResource(AbstractC0062j.m148b(cfgdata.f2508D3));
        }
    }

    public void onIpNaviButton(View view) {
        this.f2344F.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        AbstractC1372y1.m3296b();
        cfgData cfgdata = this.f2343E;
        boolean z2 = cfgdata.f2553O2;
        cfgdata.f2553O2 = !z2;
        if (!z2 && AbstractC1539g1.m4193O(cfgdata.f2620e1)) {
            cfgdata.f2635h1 = 0;
        }
        cfgdata.m1795o(this);
        AbstractC1372y1.m3300f();
        m1702t(MainActivity.class);
        super.finish();
    }

    public void onLFButtonClick(View view) {
        this.f2345G.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        cfgData cfgdata = this.f2343E;
        cfgdata.f2692s3 = !cfgdata.f2692s3;
        cfgdata.f2697t3 = false;
        cfgdata.m1795o(this);
        AbstractC1372y1.m3300f();
        m1702t(MainActivity.class);
        super.finish();
    }

    public void onPS1ButtonClick(View view) {
        this.f2347I.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(1);
    }

    public void onPS2ButtonClick(View view) {
        this.f2348J.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(2);
    }

    public void onPS3ButtonClick(View view) {
        this.f2349K.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(3);
    }

    public void onPS4ButtonClick(View view) {
        this.f2350L.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(4);
    }

    public void onPS5ButtonClick(View view) {
        this.f2351M.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(5);
    }

    public void onPS6ButtonClick(View view) {
        this.f2352N.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(6);
    }

    public void onPS7ButtonClick(View view) {
        this.f2353O.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        m1703v(7);
    }

    public void onRFButtonClick(View view) {
        this.f2346H.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        cfgData cfgdata = this.f2343E;
        cfgdata.f2697t3 = !cfgdata.f2697t3;
        cfgdata.f2692s3 = false;
        cfgdata.m1795o(this);
        AbstractC1372y1.m3300f();
        m1702t(MainActivity.class);
        super.finish();
    }

    public void onSwapButtonClick(View view) {
        cfgData cfgdata = this.f2343E;
        cfgdata.f2687r3 = !cfgdata.f2687r3;
        this.f2354P.setCompoundDrawablesWithIntrinsicBounds(R.drawable.mpng_hour, 0, 0, 0);
        cfgdata.m1795o(this);
        AbstractC1372y1.m3300f();
        m1702t(MainActivity.class);
        super.finish();
    }

    /* renamed from: t */
    public final void m1702t(Class cls) {
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(this, (Class<?>) cls);
            intent.addFlags(402722816);
            intent.putExtra("caller", "top");
            startActivity(intent, makeBasic.toBundle());
        } catch (Exception e2) {
            Toast.makeText(this, "ERROR3" + e2, 1).show();
        }
    }

    /* renamed from: v */
    public final void m1703v(int i) {
        cfgData cfgdata;
        int i2;
        if ((i <= 2 || !AbstractC1372y1.m3299e("presets5")) && (i2 = (cfgdata = this.f2343E).f2540L1) != i) {
            cfgdata.f2540L1 = i;
            cfgdata.m1797q(this);
            if (!AbstractC1256E0.m2988C(this, i2, i)) {
                AbstractC1256E0.m3014g(this, i2, i);
                super.finish();
            } else {
                AbstractC1256E0.m2993H(this);
                AbstractC1372y1.m3300f();
                m1702t(MainActivity.class);
                super.finish();
            }
        }
    }
}
