package com.altaysoft.t500_split;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p001A0.C0009c;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p054a1.C0511t;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.C1304c;

/* loaded from: classes.dex */
public class AppsList extends AbstractActivityC0870i {

    /* renamed from: G */
    public static final /* synthetic */ int f2259G = 0;

    /* renamed from: E */
    public GridView f2260E;

    /* renamed from: F */
    public ArrayList f2261F;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_apps_list);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C0009c c0009c = new C0009c(13);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c0009c);
        this.f2260E = (GridView) findViewById(R.id.gridview);
        PackageManager packageManager = getPackageManager();
        this.f2261F = new ArrayList();
        for (ApplicationInfo applicationInfo : packageManager.getInstalledApplications(128)) {
            if (packageManager.getLaunchIntentForPackage(applicationInfo.packageName) != null && (applicationInfo.flags & 1) != 1 && !applicationInfo.packageName.contains("com.altaysoft.t500_split")) {
                this.f2261F.add(applicationInfo);
            }
        }
        this.f2260E.setAdapter((ListAdapter) new C1304c(this, this.f2261F));
        findViewById(R.id.btn_apps_close).setOnClickListener(new ViewOnClickListenerC0492a(5, this));
        this.f2260E.setOnItemClickListener(new C0511t(2, this));
    }
}
