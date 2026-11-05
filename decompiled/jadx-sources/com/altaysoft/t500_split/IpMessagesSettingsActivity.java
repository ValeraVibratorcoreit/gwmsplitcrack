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
public class IpMessagesSettingsActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f2303E = 0;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ip_messages);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        setTitle(R.string.btn_ip_messages);
        cfgData m1784i = cfgData.m1784i();
        m1675t(R.id.swIpMsgCar, m1784i.f2497B2, new C1249C(m1784i, 8));
        m1675t(R.id.swIpMsgWell, m1784i.f2502C2, new C1249C(m1784i, 9));
        m1675t(R.id.swIpMsgBottom, m1784i.f2507D2, new C1249C(m1784i, 10));
        m1675t(R.id.swIpMsgAutoHide, m1784i.f2512E2, new C1249C(m1784i, 11));
        ((TextView) findViewById(R.id.tvIpMessagesHelp)).setText(getString(R.string.help_ip_messages_text));
        findViewById(R.id.btnIpMessagesBack).setOnClickListener(new ViewOnClickListenerC0492a(9, this));
        AbstractC1256E0.m3021n(findViewById(R.id.content));
    }

    /* renamed from: t */
    public final void m1675t(int i, boolean z2, C1249C c1249c) {
        Switch r2 = (Switch) findViewById(i);
        r2.setChecked(z2);
        r2.setOnCheckedChangeListener(new C0031y(this, 5, c1249c));
    }
}
