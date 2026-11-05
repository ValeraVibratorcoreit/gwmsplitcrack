package com.altaysoft.t500_split.userthemes;

import android.os.Bundle;
import android.view.View;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p101r0.C1392n;

/* loaded from: classes.dex */
public class UserThemeHelpActivity extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f3297E = 0;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_user_theme_help);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(18);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        findViewById(R.id.ut_help_close).setOnClickListener(new ViewOnClickListenerC0492a(16, this));
    }
}
