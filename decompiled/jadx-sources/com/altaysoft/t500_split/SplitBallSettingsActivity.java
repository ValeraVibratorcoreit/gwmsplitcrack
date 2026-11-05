package com.altaysoft.t500_split;

import android.R;
import android.os.Bundle;
import android.widget.Switch;
import android.widget.TextView;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0031y;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.C1249C;

/* loaded from: classes.dex */
public class SplitBallSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f2341E = 0;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_split_ball_settings);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_split_ball);
        cfgData m1784i = cfgData.m1784i();
        m1700t(R.id.swBallMenuVertical, m1784i.f2533J2, new C1249C(m1784i, 12));
        m1700t(R.id.swBallMsgNet, m1784i.f2521G2, new C1249C(m1784i, 13));
        m1700t(R.id.swBallMsgTrack, m1784i.f2525H2, new C1249C(m1784i, 14));
        m1700t(R.id.swBallMsgRadio, m1784i.f2529I2, new C1249C(m1784i, 15));
        ((TextView) findViewById(R.id.tvSplitBallSettingsHelp)).setText(getString(R.string.help_split_ball_text));
        findViewById(R.id.btnSplitBallSettingsBack).setOnClickListener(new ViewOnClickListenerC0492a(10, this));
        AbstractC1256E0.m3021n(findViewById(R.id.content));
    }

    /* renamed from: t */
    public final void m1700t(int i, boolean z2, C1249C c1249c) {
        Switch r2 = (Switch) findViewById(i);
        r2.setChecked(z2);
        r2.setOnCheckedChangeListener(new C0031y(this, 7, c1249c));
    }
}
