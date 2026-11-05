package com.altaysoft.t500_split;

import android.R;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.C1327j1;
import p098q0.RunnableC1328k;

/* loaded from: classes.dex */
public class SplitInfoSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f2342E = 0;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_split_info_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_split_info);
        cfgData m1784i = cfgData.m1784i();
        Spinner spinner = (Spinner) findViewById(R.id.spSplitInfoVolSwipe);
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, R.layout.split_info_spinner_item, new String[]{getString(R.string.split_info_vol_off), getString(R.string.split_info_vol_full), getString(R.string.split_info_vol_left)});
        arrayAdapter.setDropDownViewResource(R.layout.split_info_spinner_dropdown);
        spinner.setAdapter((SpinnerAdapter) arrayAdapter);
        boolean[] zArr = {true};
        spinner.setSelection(cfgData.m1783d(m1784i.f2517F2), false);
        spinner.setOnItemSelectedListener(new C1327j1(this, zArr, m1784i));
        spinner.post(new RunnableC1328k(zArr, 2));
        ((TextView) findViewById(R.id.tvSplitInfoSettingsHelp)).setText(getString(R.string.help_split_info_text));
        findViewById(R.id.btnSplitInfoSettingsBack).setOnClickListener(new ViewOnClickListenerC0492a(11, this));
        AbstractC1256E0.m3021n(findViewById(R.id.content));
    }
}
