package p054a1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import p001A0.RunnableC0024r;
import p006C.AbstractC0062j;
import p033Q.AbstractC0272f;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.C1283S0;
import p098q0.C1285T0;
import p098q0.C1287U0;
import p098q0.ViewOnClickListenerC1278P0;
import p098q0.ViewOnClickListenerC1280Q0;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1561o;

/* renamed from: a1.i */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnTouchListenerC0500i implements View.OnTouchListener {

    /* renamed from: f */
    public final /* synthetic */ int f1568f;

    /* renamed from: g */
    public final /* synthetic */ Object f1569g;

    public /* synthetic */ ViewOnTouchListenerC0500i(int i, Object obj) {
        this.f1568f = i;
        this.f1569g = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v40 */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r4v25 */
    /* JADX WARN: Type inference failed for: r4v27 */
    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int[] iArr;
        String str;
        switch (this.f1568f) {
            case 0:
                C0502k c0502k = (C0502k) this.f1569g;
                c0502k.getClass();
                if (motionEvent.getAction() == 1) {
                    long currentTimeMillis = System.currentTimeMillis() - c0502k.f1581o;
                    if ((currentTimeMillis < 0 || currentTimeMillis > 300) != false) {
                        c0502k.f1579m = false;
                    }
                    c0502k.m1220u();
                    c0502k.f1579m = true;
                    c0502k.f1581o = System.currentTimeMillis();
                    break;
                }
                break;
            default:
                final C1287U0 c1287u0 = (C1287U0) this.f1569g;
                if (c1287u0.f5976g != null && c1287u0.f5973d != null) {
                    int actionMasked = motionEvent.getActionMasked();
                    if (actionMasked != 0) {
                        cfgData cfgdata = c1287u0.f5971b;
                        if (actionMasked == 1) {
                            C1283S0 c1283s0 = c1287u0.f5992w;
                            Object[] objArr = c1283s0 != null && c1283s0.f5951e;
                            c1287u0.f5992w = null;
                            Context context = c1287u0.f5970a;
                            if (objArr == true) {
                                WindowManager.LayoutParams layoutParams = c1287u0.f5976g;
                                if (layoutParams != null) {
                                    cfgdata.f2612c3 = layoutParams.x;
                                    cfgdata.f2617d3 = layoutParams.y;
                                    if (context != null) {
                                        String num = Integer.toString(cfgdata.f2540L1);
                                        SharedPreferences.Editor edit = context.getSharedPreferences("T500_SPLIT_AS", 0).edit();
                                        edit.putInt(AbstractC0062j.m157k(edit, AbstractC1561o.m4299c("splitBallX", num), cfgdata.f2612c3, "splitBallY", num), cfgdata.f2617d3);
                                        edit.apply();
                                    }
                                }
                            } else if (c1287u0.m3115m()) {
                                c1287u0.m3111i();
                            } else if (c1287u0.f5977h && c1287u0.f5973d != null && c1287u0.f5976g != null && !c1287u0.f5990u) {
                                if (c1287u0.m3115m()) {
                                    c1287u0.m3111i();
                                } else {
                                    View view2 = c1287u0.f5978i;
                                    ImageButton[] imageButtonArr = c1287u0.f5984o;
                                    if (view2 == null) {
                                        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, R.style.Theme_T500_Split)).inflate(R.layout.overlay_split_ball_menu, (ViewGroup) null);
                                        c1287u0.f5978i = inflate;
                                        inflate.setLayoutDirection(0);
                                        final int i = 3;
                                        c1287u0.f5978i.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        View findViewById = c1287u0.f5978i.findViewById(R.id.split_ball_menu_panel);
                                        c1287u0.f5979j = findViewById;
                                        findViewById.getLayoutParams().height = 94;
                                        c1287u0.f5979j.setClipToOutline(true);
                                        c1287u0.f5979j.setOnClickListener(new ViewOnClickListenerC1278P0(0));
                                        c1287u0.f5980k = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ip);
                                        c1287u0.f5981l = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_lf);
                                        c1287u0.f5982m = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_rf);
                                        imageButtonArr[1] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps1);
                                        imageButtonArr[2] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps2);
                                        imageButtonArr[3] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps3);
                                        imageButtonArr[4] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps4);
                                        imageButtonArr[5] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps5);
                                        imageButtonArr[6] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps6);
                                        imageButtonArr[7] = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_ps7);
                                        c1287u0.f5983n = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_swap);
                                        ImageButton imageButton = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_cfg);
                                        ImageButton imageButton2 = (ImageButton) c1287u0.f5978i.findViewById(R.id.split_ball_apps);
                                        final int i2 = 4;
                                        c1287u0.f5980k.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i2) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i3 = 5;
                                        c1287u0.f5981l.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i3) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i4 = 6;
                                        c1287u0.f5982m.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i4) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        for (int i5 = 1; i5 <= 7; i5++) {
                                            imageButtonArr[i5].setOnClickListener(new ViewOnClickListenerC1280Q0(c1287u0, i5, 0));
                                        }
                                        final int i6 = 0;
                                        c1287u0.f5983n.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i6) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i7 = 1;
                                        imageButton.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i7) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        final int i8 = 2;
                                        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: q0.L0
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view3) {
                                                switch (i8) {
                                                    case 0:
                                                        C1287U0 c1287u02 = c1287u0;
                                                        c1287u02.m3110h();
                                                        cfgData cfgdata2 = c1287u02.f5971b;
                                                        cfgdata2.f2687r3 = !cfgdata2.f2687r3;
                                                        cfgdata2.m1795o(c1287u02.f5970a);
                                                        c1287u02.m3120t();
                                                        break;
                                                    case 1:
                                                        C1287U0 c1287u03 = c1287u0;
                                                        c1287u03.m3110h();
                                                        c1287u03.m3122w(CFG4.class);
                                                        break;
                                                    case 2:
                                                        C1287U0 c1287u04 = c1287u0;
                                                        c1287u04.m3110h();
                                                        C1310e.m3161d(c1287u04.f5970a);
                                                        break;
                                                    case 3:
                                                        c1287u0.m3111i();
                                                        break;
                                                    case 4:
                                                        C1287U0 c1287u05 = c1287u0;
                                                        c1287u05.getClass();
                                                        if (!AbstractC1372y1.m3299e("ip_navi")) {
                                                            c1287u05.m3110h();
                                                            AbstractC1372y1.m3296b();
                                                            cfgData cfgdata3 = c1287u05.f5971b;
                                                            boolean z2 = cfgdata3.f2553O2;
                                                            cfgdata3.f2553O2 = !z2;
                                                            if (!z2 && AbstractC1539g1.m4193O(cfgdata3.f2620e1)) {
                                                                cfgdata3.f2635h1 = 0;
                                                            }
                                                            cfgdata3.m1795o(c1287u05.f5970a);
                                                            c1287u05.m3120t();
                                                            break;
                                                        }
                                                        break;
                                                    case 5:
                                                        C1287U0 c1287u06 = c1287u0;
                                                        c1287u06.m3110h();
                                                        cfgData cfgdata4 = c1287u06.f5971b;
                                                        cfgdata4.f2692s3 = !cfgdata4.f2692s3;
                                                        cfgdata4.f2697t3 = false;
                                                        cfgdata4.m1795o(c1287u06.f5970a);
                                                        c1287u06.m3120t();
                                                        break;
                                                    default:
                                                        C1287U0 c1287u07 = c1287u0;
                                                        c1287u07.m3110h();
                                                        cfgData cfgdata5 = c1287u07.f5971b;
                                                        cfgdata5.f2697t3 = !cfgdata5.f2697t3;
                                                        cfgdata5.f2692s3 = false;
                                                        cfgdata5.m1795o(c1287u07.f5970a);
                                                        c1287u07.m3120t();
                                                        break;
                                                }
                                            }
                                        });
                                        AbstractC0272f.m797c(imageButton, null);
                                        AbstractC0272f.m797c(imageButton2, null);
                                    }
                                    boolean z2 = cfgdata.f2533J2;
                                    c1287u0.f5987r = z2;
                                    LinearLayout linearLayout = (LinearLayout) c1287u0.f5979j;
                                    if (z2) {
                                        linearLayout.setOrientation(1);
                                        linearLayout.setGravity(1);
                                    } else {
                                        linearLayout.setOrientation(0);
                                        linearLayout.setGravity(16);
                                    }
                                    int childCount = linearLayout.getChildCount();
                                    for (int i9 = 0; i9 < childCount; i9++) {
                                        View childAt = linearLayout.getChildAt(i9);
                                        ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                                        if (c1287u0.f5987r) {
                                            layoutParams2.width = 96;
                                            layoutParams2.height = 72;
                                            childAt.setPadding(16, 8, 16, 8);
                                        } else {
                                            layoutParams2.width = 96;
                                            layoutParams2.height = 96;
                                            childAt.setPadding(16, 16, 16, 16);
                                        }
                                        childAt.setLayoutParams(layoutParams2);
                                    }
                                    c1287u0.f5979j.setLayoutDirection(cfgdata.f2704v0 ? 1 : 0);
                                    boolean m3299e = AbstractC1372y1.m3299e("presets5");
                                    boolean z3 = (cfgdata.f2553O2 || cfgdata.m1790j()) ? false : true;
                                    int i10 = 1;
                                    while (i10 <= 7) {
                                        boolean z4 = cfgdata.f2540L1 == i10;
                                        C1287U0.m3102n(imageButtonArr[i10], i10 <= 2 || !m3299e, z4 ? C1287U0.f5958L[i10] : C1287U0.f5957K[i10]);
                                        imageButtonArr[i10].setEnabled(!z4);
                                        i10++;
                                    }
                                    C1287U0.m3102n(c1287u0.f5980k, cfgdata.f2537K2, cfgdata.f2553O2 ? R.drawable.mpng_speed_a : R.drawable.mpng_speed);
                                    c1287u0.f5980k.setEnabled(cfgdata.f2537K2 && !AbstractC1372y1.m3299e("ip_navi"));
                                    C1287U0.m3102n(c1287u0.f5981l, z3, cfgdata.f2692s3 ? R.drawable.mpng_resizeleft_a : R.drawable.mpng_resizeleft);
                                    C1287U0.m3102n(c1287u0.f5982m, z3, cfgdata.f2697t3 ? R.drawable.mpng_resizeright_a : R.drawable.mpng_resizeright);
                                    C1287U0.m3102n(c1287u0.f5983n, !cfgdata.f2553O2, R.drawable.mpng_replace);
                                    if (c1287u0.f5987r) {
                                        int i11 = c1287u0.m3121u()[1];
                                        int i12 = c1287u0.f5976g.y;
                                        int i13 = (i11 - (i12 + 94)) - 8;
                                        int i14 = i12 - 8;
                                        if (i13 < 0) {
                                            i13 = 0;
                                        }
                                        if (i14 < 0) {
                                            i14 = 0;
                                        }
                                        c1287u0.m3107d(true);
                                        int i15 = (Math.max(0, c1287u0.m3114l() - 94) <= i13 || i13 >= i14) ? 1 : 0;
                                        if (i15 == 0) {
                                            i13 = i14;
                                        }
                                        int max = Math.max(94, i13 + 94);
                                        c1287u0.m3107d(i15);
                                        int min = Math.min(max, c1287u0.m3114l());
                                        if (min < 94) {
                                            min = 94;
                                        }
                                        iArr = new int[]{i15, min};
                                    } else {
                                        int max2 = Math.max(1, c1287u0.m3121u()[0] - AbstractC1256E0.m2990E(cfgdata));
                                        int i16 = c1287u0.f5976g.x;
                                        int i17 = (max2 - (i16 + 94)) - 8;
                                        int i18 = i16 - 8;
                                        int i19 = i17 < 0 ? 0 : i17;
                                        if (i18 < 0) {
                                            i18 = 0;
                                        }
                                        c1287u0.m3107d(true);
                                        int i20 = (Math.max(0, c1287u0.m3114l() - 94) <= i19 || i19 >= i18) ? 1 : 0;
                                        if (i20 == 0) {
                                            i19 = i18;
                                        }
                                        int max3 = Math.max(94, i19 + 94);
                                        c1287u0.m3107d(i20);
                                        int min2 = Math.min(max3, c1287u0.m3114l());
                                        if (min2 < 94) {
                                            min2 = 94;
                                        }
                                        iArr = new int[]{i20, min2};
                                    }
                                    boolean z5 = iArr[0] == 1;
                                    c1287u0.f5986q = z5;
                                    int i21 = iArr[1];
                                    c1287u0.m3107d(z5);
                                    if (c1287u0.f5978i.getParent() == null) {
                                        WindowManager.LayoutParams layoutParams3 = new WindowManager.LayoutParams(-1, -1, 2038, 264, -3);
                                        layoutParams3.gravity = 51;
                                        try {
                                            c1287u0.f5973d.addView(c1287u0.f5978i, layoutParams3);
                                        } catch (Exception unused) {
                                        }
                                    }
                                    if (c1287u0.f5966G && (str = c1287u0.f5967H) != null) {
                                        c1287u0.f5995z.addFirst(new C1285T0(c1287u0.f5968I, str));
                                        c1287u0.m3109g();
                                    }
                                    int i22 = c1287u0.f5989t + 1;
                                    c1287u0.f5989t = i22;
                                    c1287u0.m3112j(94);
                                    c1287u0.m3117q(c1287u0.f5974e);
                                    c1287u0.m3105a(94, i21, 280, i22, null);
                                    Handler handler = c1287u0.f5993x;
                                    RunnableC0024r runnableC0024r = c1287u0.f5994y;
                                    handler.removeCallbacks(runnableC0024r);
                                    handler.postDelayed(runnableC0024r, 10000L);
                                }
                            }
                        } else if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                c1287u0.f5992w = null;
                            }
                        } else if (c1287u0.f5992w != null) {
                            int round = Math.round(motionEvent.getRawX() - c1287u0.f5992w.f5949c);
                            int round2 = Math.round(motionEvent.getRawY() - c1287u0.f5992w.f5950d);
                            if (!c1287u0.f5992w.f5951e) {
                                int abs = Math.abs(round);
                                int i23 = c1287u0.f5972c;
                                if (abs > i23 || Math.abs(round2) > i23) {
                                    c1287u0.f5992w.f5951e = true;
                                }
                            }
                            if (c1287u0.f5992w.f5951e) {
                                int[] m3121u = c1287u0.m3121u();
                                WindowManager.LayoutParams layoutParams4 = c1287u0.f5976g;
                                int i24 = c1287u0.f5992w.f5947a + round;
                                int max4 = Math.max(0, (m3121u[0] - AbstractC1256E0.m2990E(cfgdata)) - 94);
                                if (i24 < 0) {
                                    i24 = 0;
                                } else if (i24 > max4) {
                                    i24 = max4;
                                }
                                layoutParams4.x = i24;
                                int max5 = Math.max(0, m3121u[1] - 94);
                                WindowManager.LayoutParams layoutParams5 = c1287u0.f5976g;
                                int i25 = c1287u0.f5992w.f5948b + round2;
                                int min3 = Math.min(64, max5);
                                if (i25 < min3) {
                                    max5 = min3;
                                } else if (i25 <= max5) {
                                    max5 = i25;
                                }
                                layoutParams5.y = max5;
                                try {
                                    c1287u0.f5973d.updateViewLayout(c1287u0.f5974e, c1287u0.f5976g);
                                } catch (Exception unused2) {
                                }
                                c1287u0.m3113k(c1287u0.f5964E);
                                c1287u0.m3123x();
                            }
                        }
                    } else {
                        WindowManager.LayoutParams layoutParams6 = c1287u0.f5976g;
                        c1287u0.f5992w = new C1283S0(layoutParams6.x, layoutParams6.y, motionEvent.getRawX(), motionEvent.getRawY());
                    }
                    break;
                }
                break;
        }
        return false;
    }
}
