package com.altaysoft.t500_split;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0031y;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1319h;
import p098q0.C1325j;
import p098q0.C1331l;
import p098q0.C1334m;
import p098q0.C1337n;
import p098q0.RunnableC1328k;

/* loaded from: classes.dex */
public class AutoPresetSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: F */
    public static final /* synthetic */ int f2263F = 0;

    /* renamed from: E */
    public TextView f2264E;

    /* renamed from: w */
    public static void m1645w(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1645w(viewGroup.getChildAt(i), z2);
            }
        }
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_auto_preset_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_auto_preset);
        cfgData m1784i = cfgData.m1784i();
        Switch r02 = (Switch) findViewById(R.id.swAutoPreset);
        Switch r1 = (Switch) findViewById(R.id.swAutoPresetSunset);
        View findViewById = findViewById(R.id.box_auto_preset);
        Spinner spinner = (Spinner) findViewById(R.id.spAutoPresetDay);
        Spinner spinner2 = (Spinner) findViewById(R.id.spAutoPresetNight);
        this.f2264E = (TextView) findViewById(R.id.tvAutoPresetMode);
        r02.setChecked(m1784i.f2691s2);
        r1.setChecked(m1784i.f2696t2);
        m1647u(spinner, cfgData.m1782c(m1784i.f2701u2, 1), new C1334m(this, m1784i, 0));
        m1647u(spinner2, cfgData.m1782c(m1784i.f2706v2, 2), new C1334m(this, m1784i, 1));
        boolean z2 = m1784i.f2691s2;
        findViewById.setAlpha(z2 ? 1.0f : 0.4f);
        m1645w(findViewById, z2);
        r02.setOnCheckedChangeListener(new C1325j(this, m1784i, findViewById, 1));
        r1.setOnCheckedChangeListener(new C0031y(this, 2, m1784i));
        Integer num = (Integer) carData.getInstance().f2396J0.m1395d();
        m1646t(Integer.valueOf(num != null ? num.intValue() : 0));
        carData.getInstance().f2396J0.m1396e(this, new C1337n(0, this));
        ((TextView) findViewById(R.id.tvAutoPresetHelp)).setText(getString(R.string.help_auto_preset_text));
        ((AppCompatButton) findViewById(R.id.btnAutoPresetBack)).setOnClickListener(new ViewOnClickListenerC0492a(7, this));
        AbstractC1256E0.m3021n(findViewById(R.id.content));
    }

    /* renamed from: t */
    public final void m1646t(Integer num) {
        if (this.f2264E == null) {
            return;
        }
        int intValue = num == null ? 0 : num.intValue();
        String string = intValue == 1 ? getString(R.string.auto_preset_mode_day) : intValue == 2 ? getString(R.string.auto_preset_mode_night) : getString(R.string.auto_preset_mode_unknown);
        this.f2264E.setText(getString(R.string.auto_preset_mode) + ": " + string);
    }

    /* renamed from: u */
    public final void m1647u(Spinner spinner, int i, C1334m c1334m) {
        String[] strArr = new String[7];
        int i2 = 0;
        while (i2 < 7) {
            int i3 = i2 + 1;
            strArr[i2] = Integer.toString(i3);
            i2 = i3;
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.split_info_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.split_info_spinner_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        boolean[] zArr = {true};
        spinner.setSelection(cfgData.m1782c(i, 1) - 1, false);
        spinner.setOnItemSelectedListener(new C1331l(zArr, c1334m, 1));
        spinner.post(new RunnableC1328k(zArr, 1));
    }

    /* renamed from: v */
    public final void m1648v() {
        cfgData.m1784i().m1795o(this);
        AbstractC1319h.m3189e(this);
        AbstractC1319h.m3186b(true);
    }
}
