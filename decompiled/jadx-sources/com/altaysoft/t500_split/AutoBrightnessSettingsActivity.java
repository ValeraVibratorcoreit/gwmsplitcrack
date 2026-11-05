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
import p098q0.C1322i;
import p098q0.C1325j;
import p098q0.C1331l;
import p098q0.RunnableC1328k;

/* loaded from: classes.dex */
public class AutoBrightnessSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f2262E = 0;

    /* renamed from: u */
    public static void m1643u(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m1643u(viewGroup.getChildAt(i), z2);
            }
        }
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_auto_brightness_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_auto_brightness);
        cfgData m1784i = cfgData.m1784i();
        Switch r02 = (Switch) findViewById(R.id.swAutoBrightness);
        Switch r1 = (Switch) findViewById(R.id.swAutoBrightnessSunset);
        View findViewById = findViewById(R.id.box_auto_brightness);
        Spinner spinner = (Spinner) findViewById(R.id.spAutoBrightnessDay);
        Spinner spinner2 = (Spinner) findViewById(R.id.spAutoBrightnessNight);
        r02.setChecked(m1784i.f2671o2);
        r1.setChecked(m1784i.f2686r2);
        m1644t(spinner, cfgData.m1781b(m1784i.f2676p2, 9), new C1322i(this, m1784i, 0));
        m1644t(spinner2, cfgData.m1781b(m1784i.f2681q2, 3), new C1322i(this, m1784i, 1));
        boolean z2 = m1784i.f2671o2;
        findViewById.setAlpha(z2 ? 1.0f : 0.4f);
        m1643u(findViewById, z2);
        r02.setOnCheckedChangeListener(new C1325j(this, m1784i, findViewById, 0));
        r1.setOnCheckedChangeListener(new C0031y(this, 1, m1784i));
        ((TextView) findViewById(R.id.tvAutoBrightnessHelp)).setText(getString(R.string.help_auto_brightness_text));
        ((AppCompatButton) findViewById(R.id.btnAutoBrightnessBack)).setOnClickListener(new ViewOnClickListenerC0492a(6, this));
        AbstractC1256E0.m3021n(findViewById(R.id.content));
    }

    /* renamed from: t */
    public final void m1644t(Spinner spinner, int i, C1322i c1322i) {
        String[] strArr = new String[10];
        for (int i2 = 0; i2 < 10; i2++) {
            strArr[i2] = Integer.toString(i2);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.split_info_spinner_item, strArr);
        arrayAdapter.setDropDownViewResource(R.layout.split_info_spinner_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        boolean[] zArr = {true};
        spinner.setSelection(cfgData.m1781b(i, 0), false);
        spinner.setOnItemSelectedListener(new C1331l(zArr, c1322i, 0));
        spinner.post(new RunnableC1328k(zArr, 0));
    }
}
