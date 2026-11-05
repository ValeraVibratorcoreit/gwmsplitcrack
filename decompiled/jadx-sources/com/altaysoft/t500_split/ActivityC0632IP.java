package com.altaysoft.t500_split;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import p001A0.C0009c;
import p001A0.RunnableC0024r;
import p022K.AbstractC0156D;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1540h;
import p109u0.C1537g;

/* renamed from: com.altaysoft.t500_split.IP */
/* loaded from: classes.dex */
public class ActivityC0632IP extends AbstractActivityC0870i {

    /* renamed from: G */
    public static final /* synthetic */ int f2290G = 0;

    /* renamed from: E */
    public final cfgData f2291E = cfgData.m1784i();

    /* renamed from: F */
    public C1537g f2292F;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC0474n.m1193a(this);
        setContentView(C1537g.m4173e(this.f2291E));
        m1664t();
        m1665u();
        View decorView = getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        decorView.setLayoutDirection(0);
        C1537g c1537g = new C1537g(this, getWindow().getDecorView());
        this.f2292F = c1537g;
        c1537g.f8248y = new RunnableC0024r(17, this);
        c1537g.m4178h();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        C1537g c1537g = this.f2292F;
        if (c1537g != null) {
            c1537g.m4174a();
        }
        super.onDestroy();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        m1666v();
    }

    /* renamed from: t */
    public final void m1664t() {
        View findViewById = findViewById(R.id.content);
        if (findViewById instanceof ViewGroup) {
            View findViewById2 = findViewById(R.id.ip_hole_root);
            if (findViewById2 == null) {
                findViewById2 = findViewById(R.id.main);
            }
            AbstractC1540h.m4245a((ViewGroup) findViewById, findViewById2, this.f2291E);
        }
    }

    /* renamed from: u */
    public final void m1665u() {
        View findViewById;
        if (AbstractC1539g1.m4191M(this.f2291E) && (findViewById = findViewById(R.id.content)) != null) {
            C0009c c0009c = new C0009c(23);
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            AbstractC0158F.m440u(findViewById, c0009c);
            AbstractC0156D.m419c(findViewById);
        }
    }

    /* renamed from: v */
    public final void m1666v() {
        setContentView(C1537g.m4173e(this.f2291E));
        m1664t();
        m1665u();
        View findViewById = getWindow().getDecorView().findViewById(R.id.main);
        if (findViewById != null) {
            findViewById.setAlpha(0.0f);
        }
        View decorView = getWindow().getDecorView();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        decorView.setLayoutDirection(0);
        C1537g c1537g = this.f2292F;
        if (c1537g != null) {
            c1537g.m4174a();
        }
        C1537g c1537g2 = new C1537g(this, getWindow().getDecorView());
        this.f2292F = c1537g2;
        c1537g2.f8248y = new RunnableC0024r(17, this);
        c1537g2.m4178h();
        this.f2292F.m4176f(false);
    }
}
