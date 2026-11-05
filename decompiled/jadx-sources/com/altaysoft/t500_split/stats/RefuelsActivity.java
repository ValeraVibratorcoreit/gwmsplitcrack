package com.altaysoft.t500_split.stats;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.StatsHelpActivity;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p101r0.C1392n;
import p115w0.C1632n;
import p118x0.RunnableC1658n;
import p121y0.AbstractC1680h;
import p121y0.C1676d;
import p121y0.C1683k;

/* loaded from: classes.dex */
public class RefuelsActivity extends AbstractActivityC0870i {

    /* renamed from: H */
    public static final /* synthetic */ int f3268H = 0;

    /* renamed from: E */
    public final Handler f3269E = new Handler(Looper.getMainLooper());

    /* renamed from: F */
    public final ArrayList f3270F = new ArrayList();

    /* renamed from: G */
    public C1632n f3271G;

    /* renamed from: t */
    public static float m1983t(C1676d c1676d, int i) {
        cfgData m1784i = cfgData.m1784i();
        if (i == 0) {
            long j2 = c1676d.f9558b;
            if (j2 > 0 && j2 == m1784i.f2528I1) {
                float f2 = m1784i.f2524H1;
                if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 < 0.0f) {
                    return 0.0f;
                }
                return f2;
            }
        }
        return c1676d.f9561e;
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        final int i = 1;
        super.onCreate(bundle);
        final int i2 = 2;
        if (cfgData.m1784i().f2513E3 == 2 || AbstractC1372y1.m3299e("allapps")) {
            finish();
            return;
        }
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_refuels);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(14);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        ListView listView = (ListView) findViewById(R.id.refuels_list);
        C1632n c1632n = new C1632n(this, 1);
        this.f3271G = c1632n;
        listView.setAdapter((ListAdapter) c1632n);
        final int i3 = 0;
        findViewById(R.id.btn_refuels_close).setOnClickListener(new View.OnClickListener(this) { // from class: y0.e

            /* renamed from: g */
            public final /* synthetic */ RefuelsActivity f9565g;

            {
                this.f9565g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RefuelsActivity refuelsActivity = this.f9565g;
                switch (i3) {
                    case 0:
                        int i4 = RefuelsActivity.f3268H;
                        refuelsActivity.getClass();
                        AbstractC1256E0.m3024q(refuelsActivity);
                        break;
                    case 1:
                        if (!refuelsActivity.f3270F.isEmpty()) {
                            AbstractC1680h.m4857S(refuelsActivity, R.string.refuels_delete_title, refuelsActivity.getString(R.string.refuels_delete_all_confirm), R.string.refuels_delete_all, new RunnableC1678f(refuelsActivity, 0));
                            break;
                        }
                        break;
                    default:
                        int i5 = RefuelsActivity.f3268H;
                        refuelsActivity.getClass();
                        int i6 = StatsHelpActivity.f3292E;
                        Intent intent = new Intent(refuelsActivity, (Class<?>) StatsHelpActivity.class);
                        intent.putExtra("topic", 1);
                        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                        refuelsActivity.startActivity(intent);
                        break;
                }
            }
        });
        findViewById(R.id.btn_refuels_delete_all).setOnClickListener(new View.OnClickListener(this) { // from class: y0.e

            /* renamed from: g */
            public final /* synthetic */ RefuelsActivity f9565g;

            {
                this.f9565g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RefuelsActivity refuelsActivity = this.f9565g;
                switch (i) {
                    case 0:
                        int i4 = RefuelsActivity.f3268H;
                        refuelsActivity.getClass();
                        AbstractC1256E0.m3024q(refuelsActivity);
                        break;
                    case 1:
                        if (!refuelsActivity.f3270F.isEmpty()) {
                            AbstractC1680h.m4857S(refuelsActivity, R.string.refuels_delete_title, refuelsActivity.getString(R.string.refuels_delete_all_confirm), R.string.refuels_delete_all, new RunnableC1678f(refuelsActivity, 0));
                            break;
                        }
                        break;
                    default:
                        int i5 = RefuelsActivity.f3268H;
                        refuelsActivity.getClass();
                        int i6 = StatsHelpActivity.f3292E;
                        Intent intent = new Intent(refuelsActivity, (Class<?>) StatsHelpActivity.class);
                        intent.putExtra("topic", 1);
                        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                        refuelsActivity.startActivity(intent);
                        break;
                }
            }
        });
        findViewById(R.id.btn_refuels_help).setOnClickListener(new View.OnClickListener(this) { // from class: y0.e

            /* renamed from: g */
            public final /* synthetic */ RefuelsActivity f9565g;

            {
                this.f9565g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                RefuelsActivity refuelsActivity = this.f9565g;
                switch (i2) {
                    case 0:
                        int i4 = RefuelsActivity.f3268H;
                        refuelsActivity.getClass();
                        AbstractC1256E0.m3024q(refuelsActivity);
                        break;
                    case 1:
                        if (!refuelsActivity.f3270F.isEmpty()) {
                            AbstractC1680h.m4857S(refuelsActivity, R.string.refuels_delete_title, refuelsActivity.getString(R.string.refuels_delete_all_confirm), R.string.refuels_delete_all, new RunnableC1678f(refuelsActivity, 0));
                            break;
                        }
                        break;
                    default:
                        int i5 = RefuelsActivity.f3268H;
                        refuelsActivity.getClass();
                        int i6 = StatsHelpActivity.f3292E;
                        Intent intent = new Intent(refuelsActivity, (Class<?>) StatsHelpActivity.class);
                        intent.putExtra("topic", 1);
                        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                        refuelsActivity.startActivity(intent);
                        break;
                }
            }
        });
        m1984u();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onPause() {
        this.f3269E.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f3269E;
        handler.removeCallbacksAndMessages(null);
        handler.post(new RunnableC1658n(2, this));
    }

    /* renamed from: u */
    public final void m1984u() {
        ArrayList arrayList;
        this.f3270F.clear();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k != null) {
            ArrayList arrayList2 = this.f3270F;
            synchronized (c1683k) {
                arrayList = new ArrayList(c1683k.f9590j);
            }
            arrayList2.addAll(arrayList);
        } else {
            this.f3270F.addAll(AbstractC1680h.m4843A(this));
        }
        this.f3271G.notifyDataSetChanged();
    }
}
