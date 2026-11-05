package p101r0;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.Switch;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.media.MediaInfoService;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.concurrent.atomic.AtomicBoolean;
import p046X.AbstractComponentCallbacksC0423v;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.C1279Q;
import p098q0.C1287U0;
import p098q0.RunnableC1363v1;
import p109u0.C1477E0;
import p109u0.C1491L0;
import p109u0.C1506T0;
import p109u0.C1537g;
import p109u0.C1568q0;
import p109u0.C1576u;
import p109u0.C1583x0;

/* renamed from: r0.t */
/* loaded from: classes.dex */
public class C1398t extends AbstractComponentCallbacksC0423v {

    /* renamed from: Z */
    public Switch f6550Z;

    /* renamed from: a0 */
    public Switch f6551a0;

    /* renamed from: b0 */
    public Switch f6552b0;

    /* renamed from: c0 */
    public Switch f6553c0;

    /* renamed from: d0 */
    public Switch f6554d0;

    /* renamed from: e0 */
    public Switch f6555e0;

    /* renamed from: f0 */
    public Switch f6556f0;

    /* renamed from: g0 */
    public Switch f6557g0;

    /* renamed from: h0 */
    public Switch f6558h0;

    /* renamed from: i0 */
    public Switch f6559i0;

    /* renamed from: j0 */
    public Switch f6560j0;

    /* renamed from: k0 */
    public Switch f6561k0;

    /* renamed from: l0 */
    public Switch f6562l0;

    /* renamed from: m0 */
    public Switch f6563m0;

    /* renamed from: n0 */
    public Switch f6564n0;

    /* renamed from: o0 */
    public Switch f6565o0;

    /* renamed from: p0 */
    public Switch f6566p0;

    /* renamed from: q0 */
    public Switch f6567q0;

    /* renamed from: r0 */
    public Switch f6568r0;

    /* renamed from: s0 */
    public Switch f6569s0;

    /* renamed from: t0 */
    public Switch f6570t0;

    /* renamed from: u0 */
    public Switch f6571u0;

    /* renamed from: v0 */
    public Switch f6572v0;

    /* renamed from: w0 */
    public Switch f6573w0;

    /* renamed from: x0 */
    public boolean f6574x0;

    /* renamed from: y0 */
    public boolean f6575y0;

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: C */
    public final void mo1116C() {
        CFG4.f2728F.m1795o(m1124g());
        this.f1340H = true;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: D */
    public final void mo1117D() {
        this.f1340H = true;
        m3344Q();
    }

    /* renamed from: O */
    public final void m3342O() {
        boolean z2;
        C1537g c1537g;
        cfgData cfgdata = CFG4.f2728F;
        cfgdata.m1795o(m1124g());
        if (cfgdata.f2645j1) {
            return;
        }
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        AbstractActivityC0870i m1124g = m1124g();
        C1279Q c1279q = IPOverlayService.f2293g;
        if (c1279q == null || !(z2 = c1279q.f5935l)) {
            IPOverlayService.m1669c(m1124g);
            return;
        }
        if (!z2 || (c1537g = c1279q.f5933j) == null) {
            return;
        }
        C1576u c1576u = c1537g.f8234k;
        if (c1576u != null) {
            c1576u.m4558j();
            return;
        }
        C1568q0 c1568q0 = c1537g.f8241r;
        if (c1568q0 != null) {
            c1568q0.m4394h();
            return;
        }
        C1583x0 c1583x0 = c1537g.f8242s;
        if (c1583x0 != null) {
            c1583x0.m4684h();
            return;
        }
        C1477E0 c1477e0 = c1537g.f8243t;
        if (c1477e0 != null) {
            c1477e0.m3669h();
            return;
        }
        C1491L0 c1491l0 = c1537g.f8244u;
        if (c1491l0 != null) {
            c1491l0.m3835h();
            return;
        }
        C1506T0 c1506t0 = c1537g.f8245v;
        if (c1506t0 != null) {
            c1506t0.m3994g();
        }
    }

    /* renamed from: P */
    public final void m3343P() {
        CFG4.f2728F.m1795o(m1124g());
        if (CFG4.f2728F.f2645j1) {
            return;
        }
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        IPOverlayService.m1669c(m1124g());
    }

    /* renamed from: Q */
    public final void m3344Q() {
        if (this.f6570t0 == null) {
            return;
        }
        boolean m3299e = AbstractC1372y1.m3299e("splitInfo");
        boolean z2 = !m3299e && CFG4.f2728F.f2597Z2;
        this.f6570t0.setEnabled(z2);
        AbstractC1256E0.m3017j(this.f6570t0, m3299e || !CFG4.f2728F.f2597Z2);
        if (!z2) {
            this.f6570t0.setChecked(CFG4.f2728F.f2622e3);
        }
        if (this.f6571u0 == null) {
            return;
        }
        boolean z3 = (AbstractC1372y1.m3299e("splitInfo") ? m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? m1130m(R.string.msg_split_info_2win_need_si) : null) == null;
        this.f6574x0 = true;
        this.f6571u0.setEnabled(true);
        AbstractC1256E0.m3017j(this.f6571u0, !z3);
        this.f6571u0.setChecked(CFG4.f2728F.f2627f3);
        this.f6574x0 = false;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public final void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        Bundle bundle2 = this.f1362k;
        if (bundle2 != null) {
            bundle2.getString("param1");
            this.f1362k.getString("param2");
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: x */
    public final View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_data, viewGroup, false);
        this.f6550Z = (Switch) inflate.findViewById(R.id.CB_useip);
        this.f6551a0 = (Switch) inflate.findViewById(R.id.CB_usehut);
        this.f6552b0 = (Switch) inflate.findViewById(R.id.CB_show_gauge);
        this.f6553c0 = (Switch) inflate.findViewById(R.id.CB_show_gauge_txt);
        this.f6554d0 = (Switch) inflate.findViewById(R.id.CB_show_ODO);
        this.f6555e0 = (Switch) inflate.findViewById(R.id.CB_show_Trip);
        this.f6556f0 = (Switch) inflate.findViewById(R.id.CB_show_Day);
        this.f6557g0 = (Switch) inflate.findViewById(R.id.CB_show_Tires);
        this.f6558h0 = (Switch) inflate.findViewById(R.id.CB_show_Back);
        this.f6559i0 = (Switch) inflate.findViewById(R.id.CB_show_PIP);
        this.f6560j0 = (Switch) inflate.findViewById(R.id.CB_show_Navi);
        this.f6561k0 = (Switch) inflate.findViewById(R.id.CB_speed_right);
        this.f6562l0 = (Switch) inflate.findViewById(R.id.CB_noCorrectYN);
        this.f6563m0 = (Switch) inflate.findViewById(R.id.CB_mode_color);
        this.f6564n0 = (Switch) inflate.findViewById(R.id.CB_journey_fc);
        this.f6565o0 = (Switch) inflate.findViewById(R.id.smallMenu);
        this.f6566p0 = (Switch) inflate.findViewById(R.id.CB_mediaData);
        this.f6567q0 = (Switch) inflate.findViewById(R.id.CB_show_cruise);
        this.f6568r0 = (Switch) inflate.findViewById(R.id.CB_show_frame);
        this.f6569s0 = (Switch) inflate.findViewById(R.id.CB_showSplitInfo);
        this.f6570t0 = (Switch) inflate.findViewById(R.id.CB_splitInfoRight);
        this.f6571u0 = (Switch) inflate.findViewById(R.id.CB_splitInfo2win);
        this.f6572v0 = (Switch) inflate.findViewById(R.id.CB_splitBall);
        this.f6573w0 = (Switch) inflate.findViewById(R.id.CB_showMenu);
        this.f6550Z.setEnabled(!AbstractC1372y1.m3299e("useip"));
        this.f6551a0.setEnabled(!AbstractC1372y1.m3299e("usehut"));
        this.f6554d0.setEnabled(!AbstractC1372y1.m3299e("show_odo"));
        this.f6556f0.setEnabled(!AbstractC1372y1.m3299e("show_day"));
        this.f6555e0.setEnabled(!AbstractC1372y1.m3299e("show_trip"));
        this.f6557g0.setEnabled(!AbstractC1372y1.m3299e("show_tires"));
        this.f6552b0.setEnabled(!AbstractC1372y1.m3299e("show_gauge"));
        this.f6553c0.setEnabled(!AbstractC1372y1.m3299e("show_gauge"));
        this.f6558h0.setEnabled(!AbstractC1372y1.m3299e("show_back"));
        this.f6560j0.setEnabled(!AbstractC1372y1.m3299e("show_navi_but"));
        this.f6559i0.setEnabled(true);
        this.f6567q0.setEnabled(!AbstractC1372y1.m3299e("show_cruise"));
        this.f6568r0.setEnabled(!AbstractC1372y1.m3299e("show_frame"));
        Switch r6 = this.f6550Z;
        cfgData cfgdata = CFG4.f2728F;
        r6.setChecked(cfgdata.f2537K2);
        this.f6551a0.setChecked(cfgdata.f2545M2);
        this.f6552b0.setChecked(cfgdata.f2561Q2);
        this.f6553c0.setChecked(cfgdata.f2565R2);
        this.f6554d0.setChecked(cfgdata.f2569S2);
        this.f6555e0.setChecked(cfgdata.f2573T2);
        this.f6556f0.setChecked(cfgdata.f2577U2);
        this.f6557g0.setChecked(cfgdata.f2581V2);
        this.f6558h0.setChecked(cfgdata.f2662m3);
        this.f6560j0.setChecked(cfgdata.f2667n3);
        this.f6561k0.setChecked(cfgdata.f2636h2);
        this.f6562l0.setChecked(cfgdata.f2592Y1);
        this.f6563m0.setChecked(cfgdata.f2641i2);
        this.f6564n0.setChecked(cfgdata.useJourneyFuel);
        this.f6565o0.setChecked(cfgdata.f2535K0);
        this.f6567q0.setChecked(cfgdata.f2589X2);
        this.f6568r0.setChecked(cfgdata.f2593Y2);
        final int i = 0;
        this.f6565o0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i2 = cfgdata7.f2495B0;
                            if (i2 > 0) {
                                cfgdata7.f2505D0 = i2 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i3 = cfgdata9.f2495B0;
                                    if (i3 > 0) {
                                        cfgdata9.f2505D0 = i3 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i2 = 2;
        AbstractC1256E0.m3023p(this.f6566p0, "mediaData", cfgdata.f2585W2, new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i2) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i3 = cfgdata9.f2495B0;
                                    if (i3 > 0) {
                                        cfgdata9.f2505D0 = i3 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i3 = 7;
        AbstractC1256E0.m3023p(this.f6559i0, "pip", cfgdata.f2699u0, new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i3) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i4 = 8;
        this.f6567q0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i4) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i5 = 9;
        this.f6568r0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i5) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        this.f6573w0.setChecked(cfgdata.f2602a3);
        final int i6 = 10;
        this.f6573w0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i6) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        this.f6572v0.setChecked(cfgdata.f2607b3);
        final int i7 = 12;
        this.f6572v0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i7) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i8 = 13;
        AbstractC1256E0.m3023p(this.f6569s0, "splitInfo", cfgdata.f2597Z2, new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i8) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        this.f6570t0.setChecked(cfgdata.f2622e3);
        final int i9 = 14;
        this.f6570t0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i9) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        this.f6571u0.setChecked(cfgdata.f2627f3);
        final int i10 = 15;
        this.f6571u0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i10) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        m3344Q();
        final int i11 = 11;
        this.f6564n0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i11) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i12 = 16;
        this.f6558h0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i12) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i13 = 17;
        this.f6560j0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i13) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i14 = 18;
        this.f6561k0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i14) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i15 = 19;
        this.f6552b0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i15) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i16 = 20;
        this.f6553c0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i16) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i17 = 21;
        this.f6554d0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i17) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i18 = 22;
        this.f6555e0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i18) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i19 = 23;
        this.f6556f0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i19) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i20 = 1;
        this.f6557g0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i20) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i21 = 3;
        this.f6562l0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i21) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i22 = cfgdata7.f2495B0;
                            if (i22 > 0) {
                                cfgdata7.f2505D0 = i22 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i22 = 4;
        this.f6563m0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i22) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i222 = cfgdata7.f2495B0;
                            if (i222 > 0) {
                                cfgdata7.f2505D0 = i222 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i23 = 5;
        this.f6550Z.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i23) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i222 = cfgdata7.f2495B0;
                            if (i222 > 0) {
                                cfgdata7.f2505D0 = i222 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        final int i24 = 6;
        this.f6551a0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: r0.s

            /* renamed from: b */
            public final /* synthetic */ C1398t f6549b;

            {
                this.f6549b = this;
            }

            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                switch (i24) {
                    case 0:
                        C1398t c1398t = this.f6549b;
                        c1398t.getClass();
                        CFG4.f2728F.f2535K0 = z2;
                        c1398t.m3343P();
                        break;
                    case 1:
                        C1398t c1398t2 = this.f6549b;
                        c1398t2.getClass();
                        CFG4.f2728F.f2581V2 = z2;
                        c1398t2.m3342O();
                        break;
                    case 2:
                        C1398t c1398t3 = this.f6549b;
                        c1398t3.getClass();
                        CFG4.f2728F.f2585W2 = z2;
                        if (c1398t3.m1124g() != null) {
                            if (z2) {
                                AbstractActivityC0870i m1124g = c1398t3.m1124g();
                                MediaInfoService mediaInfoService = MediaInfoService.f2973o;
                                m1124g.startService(new Intent(m1124g, (Class<?>) MediaInfoService.class));
                            } else {
                                AbstractActivityC0870i m1124g2 = c1398t3.m1124g();
                                MediaInfoService mediaInfoService2 = MediaInfoService.f2973o;
                                m1124g2.stopService(new Intent(m1124g2, (Class<?>) MediaInfoService.class));
                            }
                        }
                        c1398t3.m3343P();
                        break;
                    case 3:
                        C1398t c1398t4 = this.f6549b;
                        c1398t4.getClass();
                        CFG4.f2728F.f2592Y1 = z2;
                        c1398t4.m3343P();
                        break;
                    case 4:
                        C1398t c1398t5 = this.f6549b;
                        c1398t5.getClass();
                        CFG4.f2728F.f2641i2 = z2;
                        c1398t5.m3343P();
                        break;
                    case 5:
                        C1398t c1398t6 = this.f6549b;
                        c1398t6.getClass();
                        cfgData cfgdata2 = CFG4.f2728F;
                        cfgdata2.f2537K2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata2.f2545M2 = true;
                            c1398t6.f6551a0.setChecked(true);
                        }
                        c1398t6.m3343P();
                        break;
                    case 6:
                        C1398t c1398t7 = this.f6549b;
                        c1398t7.getClass();
                        cfgData cfgdata3 = CFG4.f2728F;
                        cfgdata3.f2545M2 = z2;
                        if (AbstractC1372y1.m3299e("hide_mode") && !z2) {
                            cfgdata3.f2537K2 = true;
                            c1398t7.f6550Z.setChecked(true);
                        }
                        cfgdata3.m1795o(c1398t7.m1124g());
                        break;
                    case 7:
                        C1398t c1398t8 = this.f6549b;
                        c1398t8.getClass();
                        CFG4.f2728F.f2699u0 = z2;
                        c1398t8.m3343P();
                        break;
                    case 8:
                        C1398t c1398t9 = this.f6549b;
                        c1398t9.getClass();
                        cfgData cfgdata4 = CFG4.f2728F;
                        cfgdata4.f2589X2 = z2;
                        cfgdata4.m1795o(c1398t9.m1124g());
                        break;
                    case Platform.GNU /* 9 */:
                        C1398t c1398t10 = this.f6549b;
                        c1398t10.getClass();
                        cfgData cfgdata5 = CFG4.f2728F;
                        cfgdata5.f2593Y2 = z2;
                        cfgdata5.m1795o(c1398t10.m1124g());
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        C1398t c1398t11 = this.f6549b;
                        if (!c1398t11.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata6 = CFG4.f2728F;
                                if (!cfgdata6.f2607b3) {
                                    c1398t11.f6575y0 = true;
                                    cfgdata6.f2607b3 = true;
                                    c1398t11.f6572v0.setChecked(true);
                                    c1398t11.f6575y0 = false;
                                    C1287U0.m3100c(c1398t11.m1124g());
                                }
                            }
                            cfgData cfgdata7 = CFG4.f2728F;
                            cfgdata7.f2602a3 = z2;
                            int i222 = cfgdata7.f2495B0;
                            if (i222 > 0) {
                                cfgdata7.f2505D0 = i222 - cfgdata7.m1792l();
                            }
                            cfgdata7.m1795o(c1398t11.m1124g());
                            TopOverlayService topOverlayService = TopOverlayService.f2357r;
                            if (topOverlayService != null) {
                                topOverlayService.f2359g.post(new RunnableC1363v1(topOverlayService, 3));
                                break;
                            }
                        }
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1398t c1398t12 = this.f6549b;
                        c1398t12.getClass();
                        CFG4.f2728F.useJourneyFuel = z2;
                        c1398t12.m3342O();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1398t c1398t13 = this.f6549b;
                        if (!c1398t13.f6575y0) {
                            if (!z2) {
                                cfgData cfgdata8 = CFG4.f2728F;
                                if (!cfgdata8.f2602a3) {
                                    c1398t13.f6575y0 = true;
                                    cfgdata8.f2602a3 = true;
                                    c1398t13.f6573w0.setChecked(true);
                                    c1398t13.f6575y0 = false;
                                    cfgData cfgdata9 = CFG4.f2728F;
                                    int i32 = cfgdata9.f2495B0;
                                    if (i32 > 0) {
                                        cfgdata9.f2505D0 = i32 - cfgdata9.m1792l();
                                    }
                                    TopOverlayService topOverlayService2 = TopOverlayService.f2357r;
                                    if (topOverlayService2 != null) {
                                        topOverlayService2.f2359g.post(new RunnableC1363v1(topOverlayService2, 3));
                                    }
                                }
                            }
                            cfgData cfgdata10 = CFG4.f2728F;
                            cfgdata10.f2607b3 = z2;
                            cfgdata10.m1795o(c1398t13.m1124g());
                            C1287U0.m3100c(c1398t13.m1124g());
                            break;
                        }
                        break;
                    case 13:
                        C1398t c1398t14 = this.f6549b;
                        c1398t14.getClass();
                        cfgData cfgdata11 = CFG4.f2728F;
                        cfgdata11.f2597Z2 = z2;
                        cfgdata11.m1795o(c1398t14.m1124g());
                        c1398t14.m3344Q();
                        break;
                    case 14:
                        C1398t c1398t15 = this.f6549b;
                        c1398t15.getClass();
                        cfgData cfgdata12 = CFG4.f2728F;
                        if (cfgdata12.f2597Z2 && !AbstractC1372y1.m3299e("splitInfo")) {
                            cfgdata12.f2622e3 = z2;
                            cfgdata12.m1795o(c1398t15.m1124g());
                            break;
                        } else {
                            compoundButton.setChecked(cfgdata12.f2622e3);
                            break;
                        }
                        break;
                    case 15:
                        C1398t c1398t16 = this.f6549b;
                        if (!c1398t16.f6574x0) {
                            String m1130m = AbstractC1372y1.m3299e("splitInfo") ? c1398t16.m1130m(R.string.msgFeatureDemoOrPaidOnly) : !CFG4.f2728F.f2597Z2 ? c1398t16.m1130m(R.string.msg_split_info_2win_need_si) : null;
                            if (m1130m == null) {
                                cfgData cfgdata13 = CFG4.f2728F;
                                cfgdata13.f2627f3 = z2;
                                cfgdata13.m1795o(c1398t16.m1124g());
                                break;
                            } else {
                                c1398t16.f6574x0 = true;
                                compoundButton.setChecked(CFG4.f2728F.f2627f3);
                                c1398t16.f6574x0 = false;
                                AbstractC1372y1.m3288S(c1398t16.m1124g(), c1398t16.m1130m(R.string.Message), m1130m, null);
                                break;
                            }
                        }
                        break;
                    case DLLCallback.DLL_FPTRS /* 16 */:
                        C1398t c1398t17 = this.f6549b;
                        c1398t17.getClass();
                        CFG4.f2728F.f2662m3 = z2;
                        c1398t17.m3343P();
                        break;
                    case 17:
                        C1398t c1398t18 = this.f6549b;
                        c1398t18.getClass();
                        CFG4.f2728F.f2667n3 = z2;
                        c1398t18.m3343P();
                        break;
                    case 18:
                        C1398t c1398t19 = this.f6549b;
                        c1398t19.getClass();
                        CFG4.f2728F.f2636h2 = z2;
                        carData.getInstance().setSpeed_right(z2);
                        c1398t19.m3343P();
                        break;
                    case 19:
                        C1398t c1398t20 = this.f6549b;
                        c1398t20.getClass();
                        CFG4.f2728F.f2561Q2 = z2;
                        c1398t20.m3343P();
                        break;
                    case 20:
                        C1398t c1398t21 = this.f6549b;
                        c1398t21.getClass();
                        CFG4.f2728F.f2565R2 = z2;
                        c1398t21.m3343P();
                        break;
                    case 21:
                        C1398t c1398t22 = this.f6549b;
                        c1398t22.getClass();
                        CFG4.f2728F.f2569S2 = z2;
                        c1398t22.m3342O();
                        break;
                    case 22:
                        C1398t c1398t23 = this.f6549b;
                        c1398t23.getClass();
                        CFG4.f2728F.f2573T2 = z2;
                        c1398t23.m3342O();
                        break;
                    default:
                        C1398t c1398t24 = this.f6549b;
                        c1398t24.getClass();
                        CFG4.f2728F.f2577U2 = z2;
                        c1398t24.m3342O();
                        break;
                }
            }
        });
        AbstractC1256E0.m3021n(inflate);
        return inflate;
    }
}
