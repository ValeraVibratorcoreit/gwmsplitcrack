package com.altaysoft.t500_split.stats;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p101r0.C1392n;

/* loaded from: classes.dex */
public class StatsHelpActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f3292E = 0;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_stats_help);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(16);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        boolean z2 = getIntent().getIntExtra("topic", 0) == 1;
        TextView textView = (TextView) findViewById(R.id.stats_help_title);
        TextView textView2 = (TextView) findViewById(R.id.stats_help_text);
        textView.setText(z2 ? R.string.help_refuels_caption : R.string.help_trips_caption);
        AbstractC1256E0.m2999N(textView2, getString(z2 ? R.string.help_refuels_text : R.string.help_trips_text));
        textView2.setMovementMethod(ScrollingMovementMethod.getInstance());
        findViewById(R.id.btn_stats_help_close).setOnClickListener(new ViewOnClickListenerC0492a(15, this));
    }
}
