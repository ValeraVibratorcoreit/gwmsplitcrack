package p098q0;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.altaysoft.t500_split.AppsList;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.StatisticsActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import com.altaysoft.t500_split.userthemes.UserThemeSlotsActivity;
import p001A0.RunnableC0018l;
import p001A0.RunnableC0024r;

/* renamed from: q0.e */
/* loaded from: classes.dex */
public final class C1310e {

    /* renamed from: h */
    public static C1310e f6084h;

    /* renamed from: a */
    public final Context f6085a;

    /* renamed from: b */
    public final cfgData f6086b = cfgData.m1784i();

    /* renamed from: c */
    public final Handler f6087c = new Handler(Looper.getMainLooper());

    /* renamed from: d */
    public final RunnableC0024r f6088d = new RunnableC0024r(15, this);

    /* renamed from: e */
    public WindowManager f6089e;

    /* renamed from: f */
    public View f6090f;

    /* renamed from: g */
    public boolean f6091g;

    public C1310e(Context context) {
        this.f6085a = context.getApplicationContext();
    }

    /* renamed from: d */
    public static void m3161d(Context context) {
        if (f6084h == null) {
            f6084h = new C1310e(context);
        }
        final C1310e c1310e = f6084h;
        boolean z2 = c1310e.f6091g;
        if (z2) {
            c1310e.m3162a();
            return;
        }
        if (z2) {
            return;
        }
        cfgData cfgdata = c1310e.f6086b;
        Context context2 = c1310e.f6085a;
        cfgdata.m1791k(context2, false);
        c1310e.f6089e = (WindowManager) context2.getSystemService("window");
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context2, R.style.Theme_T500_Split)).inflate(R.layout.overlay_apps_quick_menu, (ViewGroup) null);
        c1310e.f6090f = inflate;
        ((TextView) inflate.findViewById(R.id.aqm_title)).setText(R.string.app_name);
        Button button = (Button) c1310e.f6090f.findViewById(R.id.aqm_android_settings);
        Button button2 = (Button) c1310e.f6090f.findViewById(R.id.aqm_apps);
        Button button3 = (Button) c1310e.f6090f.findViewById(R.id.aqm_stats);
        Button button4 = (Button) c1310e.f6090f.findViewById(R.id.aqm_trips);
        Button button5 = (Button) c1310e.f6090f.findViewById(R.id.aqm_refuels);
        Button button6 = (Button) c1310e.f6090f.findViewById(R.id.aqm_reminders);
        Button button7 = (Button) c1310e.f6090f.findViewById(R.id.aqm_user_themes);
        final int i = 0;
        button.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        final int i2 = 1;
        button2.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i2) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        final int i3 = 2;
        button3.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        final int i4 = 3;
        button4.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i4) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        final int i5 = 4;
        button5.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i5) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        final int i6 = 5;
        button6.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i6) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        final int i7 = 6;
        button7.setOnClickListener(new View.OnClickListener(c1310e) { // from class: q0.d

            /* renamed from: g */
            public final /* synthetic */ C1310e f6075g;

            {
                this.f6075g = c1310e;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        C1310e c1310e2 = this.f6075g;
                        c1310e2.m3162a();
                        AbstractC1372y1.m3280K(c1310e2.f6085a);
                        break;
                    case 1:
                        this.f6075g.m3163b(AppsList.class);
                        break;
                    case 2:
                        this.f6075g.m3163b(StatisticsActivity.class);
                        break;
                    case 3:
                        this.f6075g.m3163b(TripsActivity.class);
                        break;
                    case 4:
                        this.f6075g.m3163b(RefuelsActivity.class);
                        break;
                    case 5:
                        this.f6075g.m3163b(RemindersActivity.class);
                        break;
                    default:
                        C1310e c1310e3 = this.f6075g;
                        c1310e3.m3162a();
                        c1310e3.m3164c(UserThemeSlotsActivity.class);
                        break;
                }
            }
        });
        if (AbstractC1372y1.m3299e("allapps")) {
            int color = context2.getColor(R.color.config_text_paywall_locked);
            button2.setTextColor(color);
            button3.setTextColor(color);
            button4.setTextColor(color);
            button5.setTextColor(color);
            button6.setTextColor(color);
        }
        int m1792l = cfgdata.m1792l();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams((int) (context2.getResources().getDisplayMetrics().density * 420.0f), -2, 2038, 776, -3);
        layoutParams.gravity = 8388693;
        layoutParams.x = 16;
        layoutParams.y = m1792l + 12;
        try {
            AbstractC1256E0.m2995J(c1310e.f6090f);
            c1310e.f6089e.addView(c1310e.f6090f, layoutParams);
            AbstractC1256E0.m3010c(c1310e.f6090f);
            c1310e.f6091g = true;
            Handler handler = c1310e.f6087c;
            RunnableC0024r runnableC0024r = c1310e.f6088d;
            handler.removeCallbacks(runnableC0024r);
            handler.postDelayed(runnableC0024r, 15000L);
        } catch (Exception unused) {
            c1310e.f6090f = null;
            c1310e.f6091g = false;
        }
    }

    /* renamed from: a */
    public final void m3162a() {
        WindowManager windowManager;
        View view;
        this.f6087c.removeCallbacks(this.f6088d);
        if (!this.f6091g || (windowManager = this.f6089e) == null || (view = this.f6090f) == null) {
            this.f6091g = false;
            return;
        }
        this.f6091g = false;
        this.f6090f = null;
        AbstractC1256E0.m3012e(view, new RunnableC0018l(windowManager, 10, view));
    }

    /* renamed from: b */
    public final void m3163b(Class cls) {
        m3162a();
        if (AbstractC1372y1.m3299e("allapps")) {
            Toast.makeText(this.f6085a, R.string.msgFeatureDemoOrPaidOnly, 1).show();
        } else {
            m3164c(cls);
        }
    }

    /* renamed from: c */
    public final void m3164c(Class cls) {
        Context context = this.f6085a;
        try {
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.addFlags(402722816);
            intent.putExtra("caller", "top");
            context.startActivity(intent, ActivityOptions.makeBasic().toBundle());
        } catch (Exception unused) {
        }
    }
}
