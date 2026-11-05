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
import com.altaysoft.t500_split.stats.StatsHelpActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
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
import p121y0.AbstractC1687o;
import p121y0.C1683k;

/* loaded from: classes.dex */
public class TripsActivity extends AbstractActivityC0870i {

    /* renamed from: H */
    public static final /* synthetic */ int f3293H = 0;

    /* renamed from: E */
    public final Handler f3294E = new Handler(Looper.getMainLooper());

    /* renamed from: F */
    public final ArrayList f3295F = new ArrayList();

    /* renamed from: G */
    public C1632n f3296G;

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        final int i = 2;
        if (cfgData.m1784i().f2513E3 == 2 || AbstractC1372y1.m3299e("allapps")) {
            finish();
            return;
        }
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_trips);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(17);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        ListView listView = (ListView) findViewById(R.id.trips_list);
        C1632n c1632n = new C1632n(this, 2);
        this.f3296G = c1632n;
        listView.setAdapter((ListAdapter) c1632n);
        final int i2 = 0;
        findViewById(R.id.btn_trips_close).setOnClickListener(new View.OnClickListener(this) { // from class: y0.n

            /* renamed from: g */
            public final /* synthetic */ TripsActivity f9617g;

            {
                this.f9617g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripsActivity tripsActivity = this.f9617g;
                switch (i2) {
                    case 0:
                        int i3 = TripsActivity.f3293H;
                        tripsActivity.getClass();
                        AbstractC1256E0.m3024q(tripsActivity);
                        break;
                    case 1:
                        if (!tripsActivity.f3295F.isEmpty()) {
                            AbstractC1680h.m4857S(tripsActivity, R.string.trips_delete_title, tripsActivity.getString(R.string.trips_delete_all_confirm), R.string.trips_delete_all, new RunnableC1678f(tripsActivity, 1));
                            break;
                        }
                        break;
                    default:
                        int i4 = TripsActivity.f3293H;
                        tripsActivity.getClass();
                        int i5 = StatsHelpActivity.f3292E;
                        Intent intent = new Intent(tripsActivity, (Class<?>) StatsHelpActivity.class);
                        intent.putExtra("topic", 0);
                        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                        tripsActivity.startActivity(intent);
                        break;
                }
            }
        });
        final int i3 = 1;
        findViewById(R.id.btn_trips_delete_all).setOnClickListener(new View.OnClickListener(this) { // from class: y0.n

            /* renamed from: g */
            public final /* synthetic */ TripsActivity f9617g;

            {
                this.f9617g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripsActivity tripsActivity = this.f9617g;
                switch (i3) {
                    case 0:
                        int i32 = TripsActivity.f3293H;
                        tripsActivity.getClass();
                        AbstractC1256E0.m3024q(tripsActivity);
                        break;
                    case 1:
                        if (!tripsActivity.f3295F.isEmpty()) {
                            AbstractC1680h.m4857S(tripsActivity, R.string.trips_delete_title, tripsActivity.getString(R.string.trips_delete_all_confirm), R.string.trips_delete_all, new RunnableC1678f(tripsActivity, 1));
                            break;
                        }
                        break;
                    default:
                        int i4 = TripsActivity.f3293H;
                        tripsActivity.getClass();
                        int i5 = StatsHelpActivity.f3292E;
                        Intent intent = new Intent(tripsActivity, (Class<?>) StatsHelpActivity.class);
                        intent.putExtra("topic", 0);
                        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                        tripsActivity.startActivity(intent);
                        break;
                }
            }
        });
        findViewById(R.id.btn_trips_help).setOnClickListener(new View.OnClickListener(this) { // from class: y0.n

            /* renamed from: g */
            public final /* synthetic */ TripsActivity f9617g;

            {
                this.f9617g = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TripsActivity tripsActivity = this.f9617g;
                switch (i) {
                    case 0:
                        int i32 = TripsActivity.f3293H;
                        tripsActivity.getClass();
                        AbstractC1256E0.m3024q(tripsActivity);
                        break;
                    case 1:
                        if (!tripsActivity.f3295F.isEmpty()) {
                            AbstractC1680h.m4857S(tripsActivity, R.string.trips_delete_title, tripsActivity.getString(R.string.trips_delete_all_confirm), R.string.trips_delete_all, new RunnableC1678f(tripsActivity, 1));
                            break;
                        }
                        break;
                    default:
                        int i4 = TripsActivity.f3293H;
                        tripsActivity.getClass();
                        int i5 = StatsHelpActivity.f3292E;
                        Intent intent = new Intent(tripsActivity, (Class<?>) StatsHelpActivity.class);
                        intent.putExtra("topic", 0);
                        AtomicBoolean atomicBoolean2 = MainActivity.f2306M;
                        tripsActivity.startActivity(intent);
                        break;
                }
            }
        });
        m1996t();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onPause() {
        this.f3294E.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f3294E;
        handler.removeCallbacksAndMessages(null);
        handler.post(new RunnableC1658n(5, this));
    }

    /* renamed from: t */
    public final void m1996t() {
        ArrayList arrayList;
        this.f3295F.clear();
        C1683k c1683k = C1683k.f9580s;
        if (c1683k != null) {
            ArrayList arrayList2 = this.f3295F;
            synchronized (c1683k) {
                arrayList = new ArrayList(c1683k.f9589i);
            }
            arrayList2.addAll(arrayList);
        } else {
            this.f3295F.addAll(AbstractC1687o.m4910C(this));
        }
        this.f3296G.notifyDataSetChanged();
    }
}
