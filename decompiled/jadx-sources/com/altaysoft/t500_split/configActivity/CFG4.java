package com.altaysoft.t500_split.configActivity;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.wifi.WifiConfiguration;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.viewpager2.widget.ViewPager2;
import com.altaysoft.t500_split.Help;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.OssLicensesActivity;
import com.altaysoft.t500_split.Pay;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p000A.AbstractC0001b;
import p001A0.C0009c;
import p006C.AbstractC0062j;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p031P.C0264b;
import p046X.C0387O;
import p046X.C0398a;
import p051Z0.C0448f;
import p051Z0.C0450h;
import p051Z0.C0451i;
import p051Z0.C0452j;
import p051Z0.C0453k;
import p051Z0.C0454l;
import p052a.AbstractC0474n;
import p068f0.AbstractC0828z;
import p070g.AbstractActivityC0870i;
import p092o0.C1204b;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1342o1;
import p098q0.AbstractC1372y1;
import p098q0.C1344p0;
import p098q0.C1375z1;
import p098q0.RunnableC1323i0;
import p101r0.C1379a;
import p103s0.C1414b;
import p103s0.C1416d;

/* loaded from: classes.dex */
public class CFG4 extends AbstractActivityC0870i {

    /* renamed from: F */
    public static final cfgData f2728F = cfgData.m1784i();

    /* renamed from: E */
    public Button f2729E;

    public CFG4() {
        carData.getInstance();
    }

    /* renamed from: u */
    public static void m1800u(C0448f c0448f, boolean z2, int i, int i2) {
        View view;
        if (c0448f == null || (view = c0448f.f1429c) == null || !(view instanceof TextView)) {
            return;
        }
        TextView textView = (TextView) view;
        if (!z2) {
            i = i2;
        }
        textView.setTextColor(i);
        textView.setTypeface(null, z2 ? 1 : 0);
    }

    public void onCfgAndroidButtonClick(View view) {
        AbstractC1372y1.m3280K(this);
    }

    public void onCheckUpdateButtonClick(View view) {
        if (f2728F.f2559Q0) {
            return;
        }
        C1344p0 c1344p0 = C1344p0.f6319i;
        if (c1344p0 == null || !c1344p0.f6325f) {
            C1416d c1416d = new C1416d();
            C0387O m2405l = m2405l();
            c1416d.f1315k0 = false;
            c1416d.f1316l0 = true;
            m2405l.getClass();
            C0398a c0398a = new C0398a(m2405l);
            c0398a.f1242o = true;
            c0398a.m1075e(0, c1416d, "update", 1);
            c0398a.m1074d(false);
            return;
        }
        C0387O m2405l2 = m2405l();
        if (m2405l2.m989C("update_progress") != null) {
            return;
        }
        C1414b c1414b = new C1414b();
        c1414b.f1315k0 = false;
        c1414b.f1316l0 = true;
        C0398a c0398a2 = new C0398a(m2405l2);
        c0398a2.f1242o = true;
        c0398a2.m1075e(0, c1414b, "update_progress", 1);
        c0398a2.m1074d(false);
    }

    public void onCloseButtonClick(View view) {
        f2728F.m1795o(this);
        finish();
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 2;
        cfgData cfgdata = f2728F;
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_cfg4);
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(28);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        cfgdata.m1791k(this, false);
        setContentView(R.layout.activity_cfg4);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        this.f2729E = (Button) findViewById(R.id.help_btn_cfg);
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        ((ArrayList) viewPager2.f2146h.f5427b).add(new C1204b(i, this));
        viewPager2.setAdapter(new C1375z1(this));
        C0454l c0454l = new C0454l(tabLayout, viewPager2, new C0264b(this));
        if (c0454l.f1451a) {
            throw new IllegalStateException("TabLayoutMediator is already attached");
        }
        AbstractC0828z adapter = viewPager2.getAdapter();
        c0454l.f1455e = adapter;
        if (adapter == null) {
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        c0454l.f1451a = true;
        ((ArrayList) viewPager2.f2146h.f5427b).add(new C0452j(tabLayout));
        C0453k c0453k = new C0453k(viewPager2);
        ArrayList arrayList = tabLayout.f3618P;
        if (!arrayList.contains(c0453k)) {
            arrayList.add(c0453k);
        }
        ((AbstractC0828z) c0454l.f1455e).f4209a.registerObserver(new C0451i(c0454l));
        TabLayout tabLayout2 = (TabLayout) c0454l.f1452b;
        tabLayout2.m2108g();
        AbstractC0828z abstractC0828z = (AbstractC0828z) c0454l.f1455e;
        if (abstractC0828z != null) {
            int mo2089a = abstractC0828z.mo2089a();
            int i2 = 0;
            while (i2 < mo2089a) {
                C0448f m2107f = tabLayout2.m2107f();
                CFG4 cfg4 = (CFG4) ((C0264b) c0454l.f1454d).f701f;
                if (i2 == 0) {
                    m2107f.m1151a(cfg4.getString(R.string.settings_group_general));
                } else if (i2 == 1) {
                    m2107f.m1151a(cfg4.getString(R.string.settings_group_data));
                } else if (i2 == i) {
                    m2107f.m1151a(cfg4.getString(R.string.settings_group_advanced) + " 1");
                } else if (i2 == 3) {
                    m2107f.m1151a(cfg4.getString(R.string.settings_group_advanced) + " 2");
                } else if (i2 != 4) {
                    cfg4.getClass();
                } else {
                    m2107f.m1151a(cfg4.getString(R.string.settings_group_about));
                }
                ArrayList arrayList2 = tabLayout2.f3623g;
                int size = arrayList2.size();
                if (m2107f.f1430d != tabLayout2) {
                    throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
                }
                m2107f.f1428b = size;
                arrayList2.add(size, m2107f);
                int size2 = arrayList2.size();
                int i3 = -1;
                for (int i4 = size + 1; i4 < size2; i4++) {
                    if (((C0448f) arrayList2.get(i4)).f1428b == tabLayout2.f3622f) {
                        i3 = i4;
                    }
                    ((C0448f) arrayList2.get(i4)).f1428b = i4;
                }
                tabLayout2.f3622f = i3;
                C0450h c0450h = m2107f.f1431e;
                c0450h.setSelected(false);
                c0450h.setActivated(false);
                int i5 = m2107f.f1428b;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
                if (tabLayout2.f3609G == 1 && tabLayout2.f3606D == 0) {
                    layoutParams.width = 0;
                    layoutParams.weight = 1.0f;
                } else {
                    layoutParams.width = -2;
                    layoutParams.weight = 0.0f;
                }
                tabLayout2.f3625i.addView(c0450h, i5, layoutParams);
                i2++;
                i = 2;
            }
            if (mo2089a > 0) {
                int min = Math.min(((ViewPager2) c0454l.f1453c).getCurrentItem(), tabLayout2.getTabCount() - 1);
                if (min != tabLayout2.getSelectedTabPosition()) {
                    tabLayout2.m2109h(tabLayout2.m2106e(min), true);
                }
            }
        }
        tabLayout.m2110i(viewPager2.getCurrentItem(), 0.0f, true, true, true);
        int m3a = AbstractC0001b.m3a(this, R.color.table_header_text);
        int m3a2 = AbstractC0001b.m3a(this, R.color.title_text);
        tabLayout.setSelectedTabIndicatorColor(AbstractC0001b.m3a(this, R.color.table_header_border));
        tabLayout.setTabRippleColor(ColorStateList.valueOf(AbstractC0001b.m3a(this, R.color.dialog_border_inner)));
        int i6 = 0;
        while (i6 < tabLayout.getTabCount()) {
            C0448f m2106e = tabLayout.m2106e(i6);
            if (m2106e != null) {
                m2106e.f1431e.setPadding(12, 0, 12, 0);
                TextView textView = new TextView(this);
                textView.setText(m2106e.f1427a);
                textView.setTextSize(26.0f);
                textView.setGravity(17);
                textView.setSingleLine(true);
                m2106e.f1429c = textView;
                C0450h c0450h2 = m2106e.f1431e;
                if (c0450h2 != null) {
                    c0450h2.m1155d();
                }
                m1800u(m2106e, tabLayout.getSelectedTabPosition() == i6, m3a, m3a2);
            }
            i6++;
        }
        C1379a c1379a = new C1379a(this, m3a, m3a2);
        ArrayList arrayList3 = tabLayout.f3618P;
        if (!arrayList3.contains(c1379a)) {
            arrayList3.add(c1379a);
        }
        if (cfgdata.f2660m1) {
            Toast.makeText(this, "У вас установлена программа TboxSwitch. \n  Переключатель ТBoxControl в настройках поэтому недоступен ", 1).show();
        }
        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        AbstractC1256E0.m2989D(this, true);
        super.onDestroy();
    }

    public void onHelpAboutClick(View view) {
        f2728F.f2724z0 = 0;
        m1801t(Help.class);
    }

    public void onHelpClick(View view) {
        m1801t(Help.class);
    }

    public void onHideBtn(View view) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.altaysoft.gwm_split_secret", "com.altaysoft.gwm_split_secret.MainActivity"));
            intent.putExtra("caller", "split_hide");
            startActivity(intent);
        } catch (Exception unused) {
            Toast.makeText(this, "Ошибка при запуске приложения", 0).show();
        }
    }

    public void onOssLicensesClick(View view) {
        m1801t(OssLicensesActivity.class);
    }

    public void onPaymentClick(View view) {
        m1801t(Pay.class);
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        ViewPager2 viewPager2 = (ViewPager2) findViewById(R.id.view_pager);
        View findViewById = findViewById(R.id.imageView_menu);
        TextView textView = (TextView) findViewById(R.id.text_config);
        TextView textView2 = (TextView) findViewById(R.id.text_preset);
        StringBuilder sb = new StringBuilder();
        sb.append((Object) getText(R.string.preset));
        cfgData cfgdata = f2728F;
        sb.append(String.valueOf(cfgdata.f2540L1));
        textView2.setText(sb.toString());
        if (cfgdata.f2704v0) {
            viewPager2.setLayoutDirection(1);
            findViewById.setLayoutDirection(1);
            textView.setLayoutDirection(1);
        } else {
            viewPager2.setLayoutDirection(0);
            findViewById.setLayoutDirection(0);
            textView.setLayoutDirection(0);
        }
    }

    public void onTBoxReboot(View view) {
        AbstractC1372y1.m3288S(this, getString(R.string.message), getString(R.string.message_tbox_reboot), null);
        AbstractC1342o1.f6315b.execute(new RunnableC1323i0(NativeLib.getStringByIndex(AbstractC1342o1.f6314a.f2628g), 3));
    }

    public void onWifiButtonClick(View view) {
        TextView textView = (TextView) findViewById(R.id.wifi_name_txt);
        TextView textView2 = (TextView) findViewById(R.id.wifi_psw_txt);
        String charSequence = textView.getText().toString();
        String charSequence2 = textView2.getText().toString();
        WifiManager wifiManager = (WifiManager) getApplicationContext().getSystemService("wifi");
        WifiConfiguration wifiConfiguration = new WifiConfiguration();
        wifiConfiguration.SSID = AbstractC0062j.m161o("\"", charSequence, "\"");
        wifiConfiguration.preSharedKey = AbstractC0062j.m161o("\"", charSequence2, "\"");
        int addNetwork = wifiManager.addNetwork(wifiConfiguration);
        wifiManager.disconnect();
        wifiManager.enableNetwork(addNetwork, true);
        wifiManager.reconnect();
        AbstractC1372y1.m3288S(this, getString(R.string.Message), getString(R.string.wifiNetworkCreated), null);
    }

    /* renamed from: t */
    public final void m1801t(Class cls) {
        String str = f2728F.f2504D;
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(this, (Class<?>) cls);
            intent.addFlags(268500992);
            if (str != null && !str.isEmpty()) {
                intent.putExtra("caller", str);
            }
            startActivity(intent, makeBasic.toBundle());
        } catch (Exception e2) {
            Toast.makeText(this, "ERROR" + e2, 1).show();
        }
    }
}
