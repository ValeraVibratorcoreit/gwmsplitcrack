package com.altaysoft.t500_split;

import android.R;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0031y;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.C1249C;

/* loaded from: classes.dex */
public class DriveModeSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final int[] f2270E = {R.id.swDriveModeAuto, R.id.swDriveModeNormal, R.id.swDriveModeSport, R.id.swDriveModeEco, R.id.swDriveModeSnow, R.id.swDriveModeSand, R.id.swDriveModeMud, R.id.swDriveMode4h};

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_drive_mode_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.drive_modes_title);
        cfgData m1784i = cfgData.m1784i();
        Switch r02 = (Switch) findViewById(R.id.swDriveModeControl);
        r02.setChecked(m1784i.f2567S0);
        r02.setOnCheckedChangeListener(new C0031y(this, 3, m1784i));
        m1661t(R.id.swDriveModeAuto, m1784i.f2571T0, new C1249C(m1784i, 0));
        m1661t(R.id.swDriveModeNormal, m1784i.f2575U0, new C1249C(m1784i, 1));
        m1661t(R.id.swDriveModeSport, m1784i.f2579V0, new C1249C(m1784i, 2));
        m1661t(R.id.swDriveModeEco, m1784i.f2583W0, new C1249C(m1784i, 3));
        m1661t(R.id.swDriveModeSnow, m1784i.f2587X0, new C1249C(m1784i, 4));
        m1661t(R.id.swDriveModeSand, m1784i.f2591Y0, new C1249C(m1784i, 5));
        m1661t(R.id.swDriveModeMud, m1784i.f2595Z0, new C1249C(m1784i, 6));
        m1661t(R.id.swDriveMode4h, m1784i.f2600a1, new C1249C(m1784i, 7));
        m1662u(m1784i.f2567S0);
        ((TextView) findViewById(R.id.tvDriveModeHelp)).setText(getString(R.string.help_drive_modes_text));
        ((AppCompatButton) findViewById(R.id.btnDriveModeBack)).setOnClickListener(new ViewOnClickListenerC0492a(8, this));
        AbstractC1256E0.m3021n(findViewById(R.id.content));
    }

    /* renamed from: t */
    public final void m1661t(int i, boolean z2, C1249C c1249c) {
        Switch r2 = (Switch) findViewById(i);
        r2.setChecked(z2);
        r2.setOnCheckedChangeListener(new C0031y(this, 4, c1249c));
    }

    /* renamed from: u */
    public final void m1662u(boolean z2) {
        findViewById(R.id.box_drive_modes).setAlpha(z2 ? 1.0f : 0.4f);
        findViewById(R.id.tvDriveModesBoxTitle).setEnabled(z2);
        int[] iArr = f2270E;
        for (int i = 0; i < 8; i++) {
            Switch r2 = (Switch) findViewById(iArr[i]);
            r2.setEnabled(z2);
            r2.setClickable(z2);
        }
    }
}
