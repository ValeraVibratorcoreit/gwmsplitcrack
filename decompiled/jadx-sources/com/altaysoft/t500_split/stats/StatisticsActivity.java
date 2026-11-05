package com.altaysoft.t500_split.stats;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.stats.StatisticsActivity;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p052a.AbstractC0474n;
import p054a1.ViewOnClickListenerC0492a;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1372y1;
import p101r0.C1392n;
import p109u0.RunnableC1559n0;
import p118x0.RunnableC1658n;
import p121y0.RunnableC1681i;

/* loaded from: classes.dex */
public class StatisticsActivity extends AbstractActivityC0870i {

    /* renamed from: X */
    public static final /* synthetic */ int f3272X = 0;

    /* renamed from: E */
    public final Handler f3273E = new Handler(Looper.getMainLooper());

    /* renamed from: F */
    public final RunnableC1681i f3274F = new RunnableC1681i(this, 1);

    /* renamed from: G */
    public View f3275G;

    /* renamed from: H */
    public View f3276H;

    /* renamed from: I */
    public View f3277I;

    /* renamed from: J */
    public View f3278J;

    /* renamed from: K */
    public View f3279K;

    /* renamed from: L */
    public View f3280L;

    /* renamed from: M */
    public View f3281M;

    /* renamed from: N */
    public View f3282N;

    /* renamed from: O */
    public View f3283O;

    /* renamed from: P */
    public View f3284P;

    /* renamed from: Q */
    public View f3285Q;

    /* renamed from: R */
    public View f3286R;

    /* renamed from: S */
    public View f3287S;

    /* renamed from: T */
    public View f3288T;

    /* renamed from: U */
    public View f3289U;

    /* renamed from: V */
    public View f3290V;

    /* renamed from: W */
    public View f3291W;

    /* renamed from: C */
    public static void m1985C(View view, int i) {
        ((TextView) view.findViewById(R.id.stat_label)).setText(i);
        view.findViewById(R.id.stat_reset).setVisibility(4);
        ((TextView) view.findViewById(R.id.stat_reset_date)).setText(R.string.stats_from_car);
    }

    /* renamed from: t */
    public static void m1986t(View view, String str) {
        ((TextView) view.findViewById(R.id.stat_value)).setText(str);
    }

    /* renamed from: x */
    public static String m1987x(long j2) {
        return DateFormat.getDateTimeInstance(2, 3, Locale.getDefault()).format(new Date(j2));
    }

    /* renamed from: A */
    public final String m1988A(float f2) {
        return (Float.isNaN(f2) || f2 < 0.0f) ? getString(R.string.stats_value_na) : getString(R.string.stats_value_liters, Float.valueOf(f2));
    }

    /* renamed from: B */
    public final String m1989B(float f2) {
        return Float.isNaN(f2) ? getString(R.string.stats_value_na) : getString(R.string.stats_value_temp, Float.valueOf(f2));
    }

    /* renamed from: D */
    public final void m1990D(View view, final int i, final Runnable runnable) {
        ((TextView) view.findViewById(R.id.stat_label)).setText(i);
        View findViewById = view.findViewById(R.id.stat_reset);
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new View.OnClickListener() { // from class: y0.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i2 = StatisticsActivity.f3272X;
                int i3 = i;
                StatisticsActivity statisticsActivity = StatisticsActivity.this;
                AbstractC1680h.m4857S(statisticsActivity, R.string.stats_reset_title, statisticsActivity.getString(R.string.stats_reset_confirm, statisticsActivity.getString(i3)), R.string.stats_reset, new RunnableC1559n0(statisticsActivity, 19, runnable));
            }
        });
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (cfgData.m1784i().f2513E3 == 2 || AbstractC1372y1.m3299e("allapps")) {
            finish();
            return;
        }
        AbstractC0474n.m1193a(this);
        setContentView(R.layout.activity_statistics);
        AtomicBoolean atomicBoolean = MainActivity.f2306M;
        View findViewById = findViewById(R.id.main);
        C1392n c1392n = new C1392n(15);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        AbstractC0158F.m440u(findViewById, c1392n);
        this.f3275G = findViewById(R.id.row_moto);
        this.f3276H = findViewById(R.id.row_max_speed);
        this.f3277I = findViewById(R.id.row_max_rpm);
        this.f3278J = findViewById(R.id.row_max_coolant);
        this.f3279K = findViewById(R.id.row_max_outside);
        this.f3280L = findViewById(R.id.row_min_outside);
        this.f3281M = findViewById(R.id.row_max_hv_current);
        this.f3282N = findViewById(R.id.row_min_hv_current);
        this.f3283O = findViewById(R.id.row_odo_total);
        this.f3284P = findViewById(R.id.row_odo_accum);
        this.f3285Q = findViewById(R.id.row_odo_journey);
        this.f3286R = findViewById(R.id.row_avg_fuel_accum);
        this.f3287S = findViewById(R.id.row_avg_fuel_jour);
        this.f3288T = findViewById(R.id.row_fuel_used);
        this.f3289U = findViewById(R.id.row_fuel_since_refuel);
        this.f3290V = findViewById(R.id.row_sunrise);
        this.f3291W = findViewById(R.id.row_sunset);
        m1990D(this.f3275G, R.string.stats_moto_hours, new RunnableC1681i(this, 2));
        m1990D(this.f3276H, R.string.stats_max_speed, new RunnableC1681i(this, 3));
        m1990D(this.f3277I, R.string.stats_max_rpm, new RunnableC1681i(this, 4));
        m1990D(this.f3278J, R.string.stats_max_coolant, new RunnableC1681i(this, 5));
        m1990D(this.f3279K, R.string.stats_max_outside, new RunnableC1681i(this, 6));
        m1990D(this.f3280L, R.string.stats_min_outside, new RunnableC1681i(this, 7));
        m1990D(this.f3281M, R.string.stats_max_hv_current, new RunnableC1681i(this, 8));
        m1990D(this.f3282N, R.string.stats_min_hv_current, new RunnableC1681i(this, 9));
        m1985C(this.f3283O, R.string.stats_odo_total);
        m1985C(this.f3284P, R.string.stats_odo_accum);
        m1985C(this.f3285Q, R.string.stats_odo_journey);
        m1985C(this.f3286R, R.string.stats_avg_fuel_accum);
        m1985C(this.f3287S, R.string.stats_avg_fuel_jour);
        m1990D(this.f3288T, R.string.stats_fuel_used, new RunnableC1681i(this, 0));
        m1985C(this.f3289U, R.string.stats_fuel_since_refuel);
        View view = this.f3290V;
        ((TextView) view.findViewById(R.id.stat_label)).setText(R.string.stats_sunrise);
        view.findViewById(R.id.stat_reset).setVisibility(4);
        View view2 = this.f3291W;
        ((TextView) view2.findViewById(R.id.stat_label)).setText(R.string.stats_sunset);
        view2.findViewById(R.id.stat_reset).setVisibility(4);
        findViewById(R.id.btn_stats_close).setOnClickListener(new ViewOnClickListenerC0492a(14, this));
        m1993w();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onPause() {
        this.f3273E.removeCallbacksAndMessages(null);
        super.onPause();
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onResume() {
        super.onResume();
        Handler handler = this.f3273E;
        handler.removeCallbacksAndMessages(null);
        handler.post(this.f3274F);
        handler.postDelayed(new RunnableC1658n(3, this), 1000L);
    }

    /* renamed from: u */
    public final void m1991u(View view, String str, long j2) {
        TextView textView = (TextView) view.findViewById(R.id.stat_value);
        TextView textView2 = (TextView) view.findViewById(R.id.stat_reset_date);
        textView.setText(str);
        if (j2 > 0) {
            textView2.setText(getString(R.string.stats_reset_at, m1987x(j2)));
        } else {
            textView2.setText(R.string.stats_reset_never);
        }
    }

    /* renamed from: v */
    public final void m1992v(View view, long j2, long j3) {
        TextView textView = (TextView) view.findViewById(R.id.stat_value);
        TextView textView2 = (TextView) view.findViewById(R.id.stat_reset_date);
        if (j2 > 0) {
            textView.setText(DateFormat.getTimeInstance(3, Locale.getDefault()).format(new Date(j2)));
        } else {
            textView.setText(R.string.stats_value_na);
        }
        if (j3 > 0) {
            textView2.setText(getString(R.string.stats_sun_at, m1987x(j3)));
        } else {
            textView2.setText(R.string.stats_sun_never);
        }
    }

    /* renamed from: w */
    public final void m1993w() {
        cfgData m1784i = cfgData.m1784i();
        carData cardata = carData.getInstance();
        View view = this.f3275G;
        long max = Math.max(0L, m1784i.f2675p1 / 60000);
        m1991u(view, getString(R.string.stats_value_moto, Long.valueOf(max / 60), String.format(Locale.getDefault(), "%02d", Long.valueOf(max % 60))), m1784i.f2680q1);
        m1991u(this.f3276H, getString(R.string.stats_value_speed, Float.valueOf(m1784i.f2685r1)), m1784i.f2690s1);
        m1991u(this.f3277I, getString(R.string.stats_value_rpm, Integer.valueOf(Math.round(m1784i.f2695t1))), m1784i.f2700u1);
        m1991u(this.f3278J, m1989B(m1784i.f2705v1), m1784i.f2710w1);
        m1991u(this.f3279K, m1989B(m1784i.f2715x1), m1784i.f2720y1);
        m1991u(this.f3280L, m1989B(m1784i.f2725z1), m1784i.f2491A1);
        View view2 = this.f3281M;
        float f2 = m1784i.f2496B1;
        m1991u(view2, Float.isNaN(f2) ? getString(R.string.stats_value_na) : getString(R.string.stats_value_amp, Integer.valueOf(Math.round(f2))), m1784i.f2501C1);
        View view3 = this.f3282N;
        float f3 = m1784i.f2506D1;
        m1991u(view3, Float.isNaN(f3) ? getString(R.string.stats_value_na) : getString(R.string.stats_value_amp, Integer.valueOf(Math.round(f3))), m1784i.f2511E1);
        m1986t(this.f3283O, m1995z(cardata.m1771r()));
        m1986t(this.f3284P, m1995z(cardata.m1767p()));
        m1986t(this.f3285Q, m1995z(cardata.m1769q()));
        m1986t(this.f3286R, m1994y(cardata.m1737a()));
        m1986t(this.f3287S, m1994y(cardata.m1739b()));
        m1991u(this.f3288T, m1988A(Math.max(cardata.m1755j(), m1784i.f2516F1)), m1784i.f2520G1);
        View view4 = this.f3289U;
        String m1988A = m1988A(m1784i.f2524H1);
        long j2 = m1784i.f2528I1;
        TextView textView = (TextView) view4.findViewById(R.id.stat_value);
        TextView textView2 = (TextView) view4.findViewById(R.id.stat_reset_date);
        textView.setText(m1988A);
        if (j2 > 0) {
            textView2.setText(getString(R.string.stats_refuel_at, m1987x(j2)));
        } else {
            textView2.setText(R.string.stats_refuel_never);
        }
        m1992v(this.f3290V, m1784i.f2721y2, m1784i.f2492A2);
        m1992v(this.f3291W, m1784i.f2726z2, m1784i.f2492A2);
    }

    /* renamed from: y */
    public final String m1994y(float f2) {
        return (f2 < 0.0f || Float.isNaN(f2)) ? getString(R.string.stats_value_na) : getString(R.string.stats_value_fuel, Float.valueOf(f2));
    }

    /* renamed from: z */
    public final String m1995z(float f2) {
        return (f2 < 0.0f || Float.isNaN(f2)) ? getString(R.string.stats_value_na) : getString(R.string.stats_value_km, Float.valueOf(f2));
    }
}
