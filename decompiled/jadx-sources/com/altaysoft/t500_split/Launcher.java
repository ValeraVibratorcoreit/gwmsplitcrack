package com.altaysoft.t500_split;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import java.util.WeakHashMap;
import p001A0.C0009c;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;

/* loaded from: classes.dex */
public class Launcher extends AbstractActivityC0870i {

    /* renamed from: E */
    public static final /* synthetic */ int f2304E = 0;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_launcher);
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(24);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        ActivityOptions makeBasic = ActivityOptions.makeBasic();
        Intent intent = new Intent(this, (Class<?>) MainActivity.class);
        intent.putExtra("caller", "launcher");
        startActivity(intent, makeBasic.toBundle());
        finish();
    }
}
