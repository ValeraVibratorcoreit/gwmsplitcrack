package p101r0;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import com.altaysoft.t500_split.IPOverlayService;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import p025L0.C0250a;
import p046X.AbstractComponentCallbacksC0423v;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.C1298a;
import p098q0.C1301b;
import p109u0.AbstractC1569q1;

/* renamed from: r0.x */
/* loaded from: classes.dex */
public class C1402x extends AbstractComponentCallbacksC0423v {

    /* renamed from: Z */
    public TextView f6582Z;

    /* renamed from: a0 */
    public TextView f6583a0;

    /* renamed from: b0 */
    public TextView f6584b0;

    /* renamed from: c0 */
    public TextView f6585c0;

    /* renamed from: d0 */
    public Button f6586d0;

    /* renamed from: e0 */
    public Button f6587e0;

    /* renamed from: f0 */
    public Button f6588f0;

    /* renamed from: g0 */
    public Button f6589g0;

    /* renamed from: h0 */
    public Spinner f6590h0;

    /* renamed from: i0 */
    public Spinner f6591i0;

    /* renamed from: j0 */
    public Switch f6592j0;

    /* renamed from: k0 */
    public Switch f6593k0;

    /* renamed from: l0 */
    public Switch f6594l0;

    /* renamed from: m0 */
    public Switch f6595m0;

    /* renamed from: n0 */
    public Switch f6596n0;

    /* renamed from: o0 */
    public final ArrayList f6597o0 = new ArrayList();

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: C */
    public final void mo1116C() {
        cfgData cfgdata = CFG4.f2728F;
        cfgdata.f2556P1 = Integer.parseInt(this.f6582Z.getText().toString());
        cfgdata.f2544M1 = ((C1298a) this.f6597o0.get(this.f6590h0.getSelectedItemPosition())).f6051a;
        cfgdata.f2548N1 = ((C1298a) this.f6597o0.get(this.f6591i0.getSelectedItemPosition())).f6051a;
        cfgdata.f2615d1 = AbstractC1372y1.m3309o(cfgdata.f2620e1);
        cfgdata.m1795o(m1124g());
        this.f1340H = true;
    }

    /* renamed from: O */
    public final void m3345O(int i) {
        AbstractC1372y1.m3294Y(m1124g(), i);
        int i2 = 0;
        while (true) {
            cfgData cfgdata = CFG4.f2728F;
            if (!AbstractC1569q1.m4455g(cfgdata.f2620e1) || AbstractC1569q1.m4469u(m1124g(), cfgdata.f2620e1) == null) {
                break;
            }
            int i3 = i2 + 1;
            if (i2 >= 16) {
                break;
            }
            AbstractC1372y1.m3294Y(m1124g(), i);
            i2 = i3;
        }
        m3346P();
        CFG4.f2728F.m1795o(m1124g());
        if (CFG4.f2728F.f2645j1) {
            return;
        }
        AbstractActivityC0870i m1124g = m1124g();
        if (cfgData.m1784i().f2645j1) {
            return;
        }
        AbstractC1372y1.m3303i();
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        IPOverlayService.m1667a();
        IPOverlayService.m1668b(m1124g);
    }

    /* renamed from: P */
    public final void m3346P() {
        String str;
        int i = CFG4.f2728F.f2620e1;
        TextView textView = this.f6583a0;
        StringBuilder sb = new StringBuilder();
        sb.append(m1130m(R.string.theme).trim());
        sb.append(" ");
        carData cardata = AbstractC1372y1.f6431a;
        if (!AbstractC1569q1.m4455g(i)) {
            str = "#" + AbstractC1372y1.m3309o(i).f7101a;
        } else if (AbstractC1569q1.m4455g(i)) {
            str = "#U" + AbstractC1569q1.m4466r(i);
        } else {
            str = "";
        }
        sb.append(str);
        textView.setText(sb.toString());
        this.f6584b0.setText(AbstractC1372y1.m3293X(m1119K(), i));
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
        final boolean z2 = false;
        View inflate = layoutInflater.inflate(R.layout.fragment_settings_general, viewGroup, false);
        cfgData cfgdata = CFG4.f2728F;
        cfgdata.f2724z0 = 2;
        TextView textView = (TextView) inflate.findViewById(R.id.id_bound);
        this.f6582Z = textView;
        Locale locale = Locale.ENGLISH;
        int i = cfgdata.f2556P1;
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        textView.setText(sb.toString());
        this.f6596n0 = (Switch) inflate.findViewById(R.id.CB_alicealways);
        this.f6592j0 = (Switch) inflate.findViewById(R.id.CB_AutoStart);
        this.f6593k0 = (Switch) inflate.findViewById(R.id.CB_Launcher);
        this.f6594l0 = (Switch) inflate.findViewById(R.id.CB_ymas);
        this.f6595m0 = (Switch) inflate.findViewById(R.id.CB_alice2w);
        this.f6594l0.setEnabled(!AbstractC1372y1.m3299e("ymastart"));
        this.f6592j0.setEnabled(!AbstractC1372y1.m3299e("astart"));
        this.f6596n0.setChecked(cfgdata.alicealways);
        this.f6592j0.setChecked(cfgdata.f2646j2);
        this.f6594l0.setChecked(cfgdata.f2651k2);
        this.f6592j0.setEnabled((cfgdata.f2672o3 || AbstractC1372y1.m3299e("astart")) ? false : true);
        this.f6595m0.setChecked(cfgdata.f2677p3);
        if (cfgdata.f2508D3 == 12) {
            this.f6596n0.setVisibility(4);
        }
        final int i2 = 0;
        this.f6596n0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r0.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i2) {
                    case 0:
                        CFG4.f2728F.alicealways = z3;
                        break;
                    case 1:
                        CFG4.f2728F.f2677p3 = z3;
                        break;
                    case 2:
                        CFG4.f2728F.f2651k2 = z3;
                        break;
                    default:
                        CFG4.f2728F.f2646j2 = z3;
                        break;
                }
            }
        });
        final int i3 = 1;
        this.f6595m0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r0.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i3) {
                    case 0:
                        CFG4.f2728F.alicealways = z3;
                        break;
                    case 1:
                        CFG4.f2728F.f2677p3 = z3;
                        break;
                    case 2:
                        CFG4.f2728F.f2651k2 = z3;
                        break;
                    default:
                        CFG4.f2728F.f2646j2 = z3;
                        break;
                }
            }
        });
        final int i4 = 2;
        this.f6594l0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r0.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i4) {
                    case 0:
                        CFG4.f2728F.alicealways = z3;
                        break;
                    case 1:
                        CFG4.f2728F.f2677p3 = z3;
                        break;
                    case 2:
                        CFG4.f2728F.f2651k2 = z3;
                        break;
                    default:
                        CFG4.f2728F.f2646j2 = z3;
                        break;
                }
            }
        });
        final int i5 = 3;
        this.f6592j0.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r0.u
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z3) {
                switch (i5) {
                    case 0:
                        CFG4.f2728F.alicealways = z3;
                        break;
                    case 1:
                        CFG4.f2728F.f2677p3 = z3;
                        break;
                    case 2:
                        CFG4.f2728F.f2651k2 = z3;
                        break;
                    default:
                        CFG4.f2728F.f2646j2 = z3;
                        break;
                }
            }
        });
        AbstractC1256E0.m3023p(this.f6593k0, "launcher", cfgdata.f2672o3, new C0250a(1, this));
        ArrayList arrayList = this.f6597o0;
        C1298a c1298a = new C1298a();
        c1298a.f6051a = "---";
        c1298a.f6052b = null;
        c1298a.f6053c = "---";
        arrayList.add(c1298a);
        PackageManager packageManager = m1124g().getPackageManager();
        List<ApplicationInfo> installedApplications = packageManager.getInstalledApplications(128);
        Collections.sort(installedApplications, new ApplicationInfo.DisplayNameComparator(packageManager));
        for (ApplicationInfo applicationInfo : installedApplications) {
            if ((applicationInfo.flags & 1) != 1 && !applicationInfo.packageName.contains("com.altaysoft.t500_split")) {
                arrayList.add(new C1298a(applicationInfo));
            }
        }
        if (AbstractC1372y1.m3283N(m1124g(), "com.android.car.media")) {
            ApplicationInfo applicationInfo2 = new ApplicationInfo();
            applicationInfo2.packageName = "com.android.car.media";
            applicationInfo2.name = "Стандартный проигрыватель";
            arrayList.add(new C1298a(applicationInfo2));
        }
        if (AbstractC1372y1.m3283N(m1124g(), "com.gwm.overseas.localmusic")) {
            ApplicationInfo applicationInfo3 = new ApplicationInfo();
            applicationInfo3.packageName = "com.gwm.overseas.localmusic";
            applicationInfo3.name = "Стандартный проигрыватель";
            arrayList.add(new C1298a(applicationInfo3));
        }
        if (AbstractC1372y1.m3283N(m1124g(), "com.gwm.app.mediatunerovs")) {
            ApplicationInfo applicationInfo4 = new ApplicationInfo();
            applicationInfo4.packageName = "com.gwm.app.mediatunerovs";
            applicationInfo4.name = "GWM Радио";
            arrayList.add(new C1298a(applicationInfo4));
        }
        if (AbstractC1372y1.m3283N(m1124g(), "ru.yandex.yandexnavi.auto")) {
            ApplicationInfo applicationInfo5 = new ApplicationInfo();
            applicationInfo5.packageName = "ru.yandex.yandexnavi.auto";
            applicationInfo5.name = "Яндекс Карты(встроено)";
            arrayList.add(new C1298a(applicationInfo5));
        }
        if (AbstractC1372y1.m3283N(m1124g(), "yandex.auto.uma")) {
            ApplicationInfo applicationInfo6 = new ApplicationInfo();
            applicationInfo6.packageName = "yandex.auto.uma";
            applicationInfo6.name = "Яндекс Музыка(встроено)";
            arrayList.add(new C1298a(applicationInfo6));
        }
        if (AbstractC1372y1.m3283N(m1124g(), "com.gwm.navi.app")) {
            ApplicationInfo applicationInfo7 = new ApplicationInfo();
            applicationInfo7.packageName = "com.gwm.navi.app";
            applicationInfo7.name = "GWM Navi";
            arrayList.add(new C1298a(applicationInfo7));
        }
        C1301b c1301b = new C1301b(m1124g(), R.layout.app_drawer_element_big, arrayList);
        c1301b.f6059a = arrayList;
        Spinner spinner = (Spinner) inflate.findViewById(R.id.app_spinner_left);
        this.f6590h0 = spinner;
        spinner.setAdapter((SpinnerAdapter) c1301b);
        Spinner spinner2 = (Spinner) inflate.findViewById(R.id.app_spinner_right);
        this.f6591i0 = spinner2;
        spinner2.setAdapter((SpinnerAdapter) c1301b);
        Spinner spinner3 = this.f6590h0;
        cfgData cfgdata2 = CFG4.f2728F;
        String str = cfgdata2.f2544M1;
        int i6 = 0;
        while (true) {
            ArrayList arrayList2 = this.f6597o0;
            if (i6 >= arrayList2.size()) {
                i6 = 0;
                break;
            }
            if (Objects.equals(((C1298a) arrayList2.get(i6)).f6051a, str)) {
                break;
            }
            i6++;
        }
        spinner3.setSelection(i6);
        Spinner spinner4 = this.f6591i0;
        String str2 = cfgdata2.f2548N1;
        int i7 = 0;
        while (true) {
            ArrayList arrayList3 = this.f6597o0;
            if (i7 >= arrayList3.size()) {
                i7 = 0;
                break;
            }
            if (Objects.equals(((C1298a) arrayList3.get(i7)).f6051a, str2)) {
                break;
            }
            i7++;
        }
        spinner4.setSelection(i7);
        this.f6585c0 = (TextView) inflate.findViewById(R.id.styleName);
        this.f6583a0 = (TextView) inflate.findViewById(R.id.tv17);
        this.f6584b0 = (TextView) inflate.findViewById(R.id.themeName);
        int i8 = cfgdata2.f2630g1;
        if (i8 < 31) {
            this.f6585c0.setText(cfgdata2.f2625f1.f7034b);
        } else {
            this.f6585c0.setText(cfgdata2.f2603b[i8 - 31]);
        }
        m3346P();
        this.f6586d0 = (Button) inflate.findViewById(R.id.btnThemeM);
        this.f6587e0 = (Button) inflate.findViewById(R.id.btnThemeP);
        this.f6588f0 = (Button) inflate.findViewById(R.id.btnStyleM);
        this.f6589g0 = (Button) inflate.findViewById(R.id.btnStyleP);
        boolean m3299e = AbstractC1372y1.m3299e("theme_change");
        if (m3299e && cfgdata2.f2513E3 != 2) {
            z2 = true;
        }
        this.f6586d0.setEnabled(true);
        this.f6587e0.setEnabled(true);
        this.f6588f0.setEnabled(true);
        this.f6589g0.setEnabled(true);
        AbstractC1256E0.m3018k(this.f6583a0, z2);
        AbstractC1256E0.m3018k(this.f6584b0, z2);
        AbstractC1256E0.m3018k(this.f6585c0, m3299e);
        AbstractC1256E0.m3018k(this.f6586d0, z2);
        AbstractC1256E0.m3018k(this.f6587e0, z2);
        AbstractC1256E0.m3018k(this.f6588f0, m3299e);
        AbstractC1256E0.m3018k(this.f6589g0, m3299e);
        final int i9 = 0;
        this.f6586d0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.v

            /* renamed from: g */
            public final /* synthetic */ C1402x f6578g;

            {
                this.f6578g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i9) {
                    case 0:
                        boolean z3 = z2;
                        C1402x c1402x = this.f6578g;
                        if (!z3) {
                            c1402x.m3345O(-1);
                            break;
                        } else {
                            AbstractC1256E0.m3003R(c1402x.m1124g());
                            break;
                        }
                    default:
                        boolean z4 = z2;
                        C1402x c1402x2 = this.f6578g;
                        if (!z4) {
                            c1402x2.m3345O(1);
                            break;
                        } else {
                            AbstractC1256E0.m3003R(c1402x2.m1124g());
                            break;
                        }
                }
            }
        });
        final int i10 = 1;
        this.f6587e0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.v

            /* renamed from: g */
            public final /* synthetic */ C1402x f6578g;

            {
                this.f6578g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        boolean z3 = z2;
                        C1402x c1402x = this.f6578g;
                        if (!z3) {
                            c1402x.m3345O(-1);
                            break;
                        } else {
                            AbstractC1256E0.m3003R(c1402x.m1124g());
                            break;
                        }
                    default:
                        boolean z4 = z2;
                        C1402x c1402x2 = this.f6578g;
                        if (!z4) {
                            c1402x2.m3345O(1);
                            break;
                        } else {
                            AbstractC1256E0.m3003R(c1402x2.m1124g());
                            break;
                        }
                }
            }
        });
        final int i11 = 0;
        this.f6588f0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.w

            /* renamed from: g */
            public final /* synthetic */ C1402x f6581g;

            {
                this.f6581g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1402x c1402x = this.f6581g;
                int i12 = i11;
                c1402x.getClass();
                switch (i12) {
                    case 0:
                        if (!AbstractC1372y1.m3299e("theme_change")) {
                            AbstractC1372y1.m3291V(-1);
                            cfgData cfgdata3 = CFG4.f2728F;
                            int i13 = cfgdata3.f2630g1;
                            if (i13 < 31) {
                                c1402x.f6585c0.setText(cfgdata3.f2625f1.f7034b);
                            } else {
                                c1402x.f6585c0.setText(cfgdata3.f2603b[i13 - 31]);
                            }
                            CFG4.f2728F.m1795o(c1402x.m1124g());
                            if (!CFG4.f2728F.f2645j1) {
                                AbstractActivityC0870i m1124g = c1402x.m1124g();
                                if (!cfgData.m1784i().f2645j1) {
                                    AbstractC1372y1.m3303i();
                                    AtomicBoolean atomicBoolean = MainActivity.f2306M;
                                    IPOverlayService.m1667a();
                                    IPOverlayService.m1668b(m1124g);
                                    break;
                                }
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1402x.m1124g());
                            break;
                        }
                        break;
                    default:
                        if (!AbstractC1372y1.m3299e("theme_change")) {
                            AbstractC1372y1.m3291V(1);
                            cfgData cfgdata4 = CFG4.f2728F;
                            int i14 = cfgdata4.f2630g1;
                            if (i14 < 31) {
                                c1402x.f6585c0.setText(cfgdata4.f2625f1.f7034b);
                            } else {
                                c1402x.f6585c0.setText(cfgdata4.f2603b[i14 - 31]);
                            }
                            CFG4.f2728F.m1795o(c1402x.m1124g());
                            if (!CFG4.f2728F.f2645j1) {
                                AbstractActivityC0870i m1124g2 = c1402x.m1124g();
                                if (!cfgData.m1784i().f2645j1) {
                                    AbstractC1372y1.m3303i();
                                    AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                    IPOverlayService.m1667a();
                                    IPOverlayService.m1668b(m1124g2);
                                    break;
                                }
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1402x.m1124g());
                            break;
                        }
                        break;
                }
            }
        });
        final int i12 = 1;
        this.f6589g0.setOnClickListener(new View.OnClickListener(this) { // from class: r0.w

            /* renamed from: g */
            public final /* synthetic */ C1402x f6581g;

            {
                this.f6581g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C1402x c1402x = this.f6581g;
                int i122 = i12;
                c1402x.getClass();
                switch (i122) {
                    case 0:
                        if (!AbstractC1372y1.m3299e("theme_change")) {
                            AbstractC1372y1.m3291V(-1);
                            cfgData cfgdata3 = CFG4.f2728F;
                            int i13 = cfgdata3.f2630g1;
                            if (i13 < 31) {
                                c1402x.f6585c0.setText(cfgdata3.f2625f1.f7034b);
                            } else {
                                c1402x.f6585c0.setText(cfgdata3.f2603b[i13 - 31]);
                            }
                            CFG4.f2728F.m1795o(c1402x.m1124g());
                            if (!CFG4.f2728F.f2645j1) {
                                AbstractActivityC0870i m1124g = c1402x.m1124g();
                                if (!cfgData.m1784i().f2645j1) {
                                    AbstractC1372y1.m3303i();
                                    AtomicBoolean atomicBoolean = MainActivity.f2306M;
                                    IPOverlayService.m1667a();
                                    IPOverlayService.m1668b(m1124g);
                                    break;
                                }
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1402x.m1124g());
                            break;
                        }
                        break;
                    default:
                        if (!AbstractC1372y1.m3299e("theme_change")) {
                            AbstractC1372y1.m3291V(1);
                            cfgData cfgdata4 = CFG4.f2728F;
                            int i14 = cfgdata4.f2630g1;
                            if (i14 < 31) {
                                c1402x.f6585c0.setText(cfgdata4.f2625f1.f7034b);
                            } else {
                                c1402x.f6585c0.setText(cfgdata4.f2603b[i14 - 31]);
                            }
                            CFG4.f2728F.m1795o(c1402x.m1124g());
                            if (!CFG4.f2728F.f2645j1) {
                                AbstractActivityC0870i m1124g2 = c1402x.m1124g();
                                if (!cfgData.m1784i().f2645j1) {
                                    AbstractC1372y1.m3303i();
                                    AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                                    IPOverlayService.m1667a();
                                    IPOverlayService.m1668b(m1124g2);
                                    break;
                                }
                            }
                        } else {
                            AbstractC1256E0.m3003R(c1402x.m1124g());
                            break;
                        }
                        break;
                }
            }
        });
        AbstractC1256E0.m3021n(inflate);
        return inflate;
    }
}
