package com.altaysoft.t500_split.splitinfo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.splitinfo.WeatherFullscreenActivity;
import com.jcraft.jsch.SftpATTRS;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import p001A0.RunnableC0024r;
import p006C.AbstractC0062j;
import p031P.C0264b;
import p070g.AbstractActivityC0870i;
import p098q0.AbstractC1256E0;
import p118x0.C1667w;
import p118x0.C1668x;
import p118x0.C1669y;
import p118x0.C1670z;
import p118x0.ViewOnTouchListenerC1643A;

/* loaded from: classes.dex */
public final class WeatherFullscreenActivity extends AbstractActivityC0870i {

    /* renamed from: V */
    public static final /* synthetic */ int f3250V = 0;

    /* renamed from: E */
    public LottieAnimationView f3251E;

    /* renamed from: F */
    public TextView f3252F;

    /* renamed from: G */
    public TextView f3253G;

    /* renamed from: H */
    public TextView f3254H;

    /* renamed from: I */
    public TextView f3255I;

    /* renamed from: J */
    public TextView f3256J;

    /* renamed from: K */
    public TextView f3257K;

    /* renamed from: L */
    public TextView f3258L;

    /* renamed from: M */
    public TextView f3259M;

    /* renamed from: N */
    public TextView f3260N;

    /* renamed from: O */
    public View f3261O;

    /* renamed from: P */
    public LinearLayout f3262P;

    /* renamed from: Q */
    public LinearLayout f3263Q;

    /* renamed from: R */
    public GridLayout f3264R;

    /* renamed from: S */
    public HorizontalScrollView f3265S;

    /* renamed from: T */
    public TextView f3266T;

    /* renamed from: U */
    public String f3267U;

    /* renamed from: v */
    public static boolean m1979v(long j2, long j3) {
        long currentTimeMillis = System.currentTimeMillis();
        if (j2 > 0 && j3 > 0) {
            return currentTimeMillis < j2 || currentTimeMillis > j3;
        }
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 21;
    }

    @Override // p070g.AbstractActivityC0870i, p052a.AbstractActivityC0472l, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_weather_fullscreen);
        this.f3251E = (LottieAnimationView) findViewById(R.id.weather_fs_icon);
        this.f3252F = (TextView) findViewById(R.id.weather_fs_place);
        this.f3253G = (TextView) findViewById(R.id.weather_fs_updated);
        this.f3254H = (TextView) findViewById(R.id.weather_fs_temp);
        this.f3255I = (TextView) findViewById(R.id.weather_fs_feels);
        this.f3256J = (TextView) findViewById(R.id.weather_fs_desc);
        this.f3257K = (TextView) findViewById(R.id.weather_fs_today);
        this.f3258L = (TextView) findViewById(R.id.weather_fs_status);
        this.f3259M = (TextView) findViewById(R.id.weather_fs_sunrise);
        this.f3260N = (TextView) findViewById(R.id.weather_fs_sunset);
        this.f3261O = findViewById(R.id.weather_fs_sun_block);
        this.f3262P = (LinearLayout) findViewById(R.id.weather_fs_metrics);
        this.f3263Q = (LinearLayout) findViewById(R.id.weather_fs_hours);
        this.f3264R = (GridLayout) findViewById(R.id.weather_fs_days);
        HorizontalScrollView horizontalScrollView = (HorizontalScrollView) findViewById(R.id.weather_fs_hours_scroll);
        this.f3265S = horizontalScrollView;
        if (horizontalScrollView != null) {
            horizontalScrollView.setOnTouchListener(new ViewOnTouchListenerC1643A());
        }
        ImageButton imageButton = (ImageButton) findViewById(R.id.weather_fs_close);
        if (imageButton != null) {
            final int i = 0;
            imageButton.setOnClickListener(new View.OnClickListener(this) { // from class: x0.B

                /* renamed from: g */
                public final /* synthetic */ WeatherFullscreenActivity f9326g;

                {
                    this.f9326g = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherFullscreenActivity weatherFullscreenActivity = this.f9326g;
                    switch (i) {
                        case 0:
                            int i2 = WeatherFullscreenActivity.f3250V;
                            weatherFullscreenActivity.finish();
                            break;
                        default:
                            int i3 = WeatherFullscreenActivity.f3250V;
                            weatherFullscreenActivity.m1982w();
                            break;
                    }
                }
            });
        }
        TextView textView = (TextView) findViewById(R.id.weather_fs_refresh);
        this.f3266T = textView;
        if (textView != null) {
            final int i2 = 1;
            textView.setOnClickListener(new View.OnClickListener(this) { // from class: x0.B

                /* renamed from: g */
                public final /* synthetic */ WeatherFullscreenActivity f9326g;

                {
                    this.f9326g = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    WeatherFullscreenActivity weatherFullscreenActivity = this.f9326g;
                    switch (i2) {
                        case 0:
                            int i22 = WeatherFullscreenActivity.f3250V;
                            weatherFullscreenActivity.finish();
                            break;
                        default:
                            int i3 = WeatherFullscreenActivity.f3250V;
                            weatherFullscreenActivity.m1982w();
                            break;
                    }
                }
            });
        }
        C1669y c1669y = C1670z.m4822d(this).f9530e;
        if (c1669y == null || !c1669y.f9502a) {
            m1982w();
        } else {
            m1981u(c1669y);
        }
    }

    @Override // p070g.AbstractActivityC0870i, android.app.Activity
    public final void onDestroy() {
        AbstractC1256E0.m2989D(this, false);
        super.onDestroy();
    }

    /* renamed from: t */
    public final void m1980t(LayoutInflater layoutInflater, String str, String str2) {
        View inflate = layoutInflater.inflate(R.layout.item_weather_metric, (ViewGroup) this.f3262P, false);
        TextView textView = (TextView) inflate.findViewById(R.id.wm_label);
        TextView textView2 = (TextView) inflate.findViewById(R.id.wm_value);
        if (textView != null) {
            textView.setText(str);
        }
        if (textView2 != null) {
            textView2.setText(str2);
        }
        this.f3262P.addView(inflate);
    }

    /* JADX WARN: Removed duplicated region for block: B:173:0x04d7  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04fc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x05a3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x052b  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1981u(C1669y c1669y) {
        String str;
        long j2;
        float f2;
        String str2;
        long j3;
        long j4;
        String str3;
        List<C1667w> list;
        String str4;
        LottieAnimationView lottieAnimationView;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        TextView textView = this.f3266T;
        if (textView != null) {
            textView.setEnabled(true);
        }
        if (isFinishing() || isDestroyed()) {
            return;
        }
        boolean z2 = c1669y.f9502a;
        String str10 = c1669y.f9506e;
        if (!z2) {
            TextView textView2 = this.f3252F;
            if (textView2 != null) {
                textView2.setText(str10);
            }
            TextView textView3 = this.f3254H;
            if (textView3 != null) {
                textView3.setText("—");
            }
            TextView textView4 = this.f3255I;
            if (textView4 != null) {
                textView4.setText("");
            }
            TextView textView5 = this.f3256J;
            if (textView5 != null) {
                textView5.setText("");
            }
            TextView textView6 = this.f3257K;
            if (textView6 != null) {
                textView6.setText("");
            }
            TextView textView7 = this.f3258L;
            if (textView7 != null) {
                String str11 = c1669y.f9503b;
                if (str11 == null) {
                    str11 = getString(R.string.split_info_weather_error);
                }
                textView7.setText(str11);
                this.f3258L.setTextColor(-38037);
                return;
            }
            return;
        }
        if (this.f3258L != null) {
            if (c1669y.m4816b()) {
                this.f3258L.setText(getString(R.string.split_info_weather_stale));
                this.f3258L.setTextColor(-38037);
            } else {
                this.f3258L.setText("");
            }
        }
        TextView textView8 = this.f3252F;
        if (textView8 != null) {
            if (str10.isEmpty()) {
                str10 = c1669y.m4817c();
            }
            textView8.setText(str10);
        }
        TextView textView9 = this.f3253G;
        if (textView9 != null) {
            textView9.setText(getString(R.string.split_info_weather_updated, c1669y.m4818d()));
        }
        TextView textView10 = this.f3254H;
        if (textView10 != null) {
            textView10.setText(String.format(Locale.ENGLISH, "%.0f°", Float.valueOf(c1669y.f9507f)));
        }
        TextView textView11 = this.f3255I;
        if (textView11 != null) {
            textView11.setText(getString(R.string.weather_fs_feels, Float.valueOf(c1669y.f9508g)));
        }
        TextView textView12 = this.f3256J;
        int i = c1669y.f9509h;
        if (textView12 != null) {
            String str12 = c1669y.f9510i;
            if (str12.isEmpty()) {
                this.f3256J.setText(C1670z.m4826n(this, i));
            } else {
                this.f3256J.setText(str12);
            }
        }
        LottieAnimationView lottieAnimationView2 = this.f3251E;
        long j5 = c1669y.f9521t;
        long j6 = c1669y.f9520s;
        if (lottieAnimationView2 != null) {
            String m4827o = C1670z.m4827o(i, m1979v(j6, j5));
            if (!m4827o.equals(this.f3267U)) {
                this.f3267U = m4827o;
                try {
                    this.f3251E.setAnimation(m4827o);
                    this.f3251E.playAnimation();
                } catch (Exception unused) {
                }
            } else if (!this.f3251E.isAnimating()) {
                this.f3251E.playAnimation();
            }
        }
        TextView textView13 = this.f3257K;
        String str13 = "UTC";
        String str14 = "yyyy-MM-dd";
        List list2 = c1669y.f9522u;
        if (textView13 != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(new Date());
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f3257K.setText("");
                    break;
                }
                C1667w c1667w = (C1667w) it.next();
                if (format.equals(c1667w.f9486a)) {
                    this.f3257K.setText(getString(R.string.split_info_weather_today) + "  " + String.format(Locale.ENGLISH, "%.0f…%.0f°", Float.valueOf(c1667w.f9489d), Float.valueOf(c1667w.f9488c)));
                    break;
                }
            }
        }
        boolean z3 = j6 > 0;
        boolean z4 = j5 > 0;
        View view = this.f3261O;
        if (view != null) {
            view.setVisibility((z3 || z4) ? 0 : 8);
        }
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("HH:mm", Locale.getDefault());
        TextView textView14 = this.f3259M;
        String str15 = "";
        if (textView14 == null) {
            str = "%.0f°";
        } else if (z3) {
            StringBuilder sb = new StringBuilder();
            str = "%.0f°";
            sb.append(getString(R.string.weather_fs_sunrise));
            sb.append("\n");
            sb.append(simpleDateFormat2.format(new Date(j6)));
            textView14.setText(sb.toString());
            this.f3259M.setVisibility(0);
        } else {
            str = "%.0f°";
            textView14.setVisibility(8);
        }
        TextView textView15 = this.f3260N;
        if (textView15 != null) {
            if (z4) {
                textView15.setText(getString(R.string.weather_fs_sunset) + "\n" + simpleDateFormat2.format(new Date(j5)));
                this.f3260N.setVisibility(0);
            } else {
                textView15.setVisibility(8);
            }
        }
        LinearLayout linearLayout = this.f3262P;
        String str16 = "%";
        if (linearLayout == null) {
            j2 = j5;
        } else {
            linearLayout.removeAllViews();
            LayoutInflater from = LayoutInflater.from(this);
            Locale locale = Locale.ENGLISH;
            String format2 = String.format(locale, "%.0f км/ч", Float.valueOf(c1669y.f9511j));
            j2 = j5;
            String m4828p = C1670z.m4828p(this, c1669y.f9512k);
            if (!m4828p.isEmpty()) {
                format2 = AbstractC0062j.m169w(m4828p, " ", format2);
            }
            m1980t(from, getString(R.string.weather_fs_wind), format2);
            float f3 = c1669y.f9513l;
            if (f3 > 0.5f) {
                m1980t(from, getString(R.string.weather_fs_gust), String.format(locale, "%.0f км/ч", Float.valueOf(f3)));
            }
            int i2 = c1669y.f9514m;
            if (i2 >= 0) {
                m1980t(from, getString(R.string.weather_fs_humidity), i2 + "%");
            }
            float f4 = c1669y.f9515n;
            if (f4 > 0.0f) {
                m1980t(from, getString(R.string.weather_fs_pressure), String.format(locale, "%.0f гПа", Float.valueOf(f4)));
            }
            float f5 = c1669y.f9516o;
            if (f5 > 0.0f) {
                m1980t(from, getString(R.string.weather_fs_visibility), String.format(locale, "%.1f км", Float.valueOf(f5)));
            }
            m1980t(from, getString(R.string.weather_fs_clouds), c1669y.f9517p + "%");
            float f6 = c1669y.f9518q + c1669y.f9519r;
            m1980t(from, getString(R.string.weather_fs_metric_precip), f6 > 0.05f ? String.format(locale, "%.1f мм", Float.valueOf(f6)) : "0 мм");
            SimpleDateFormat simpleDateFormat3 = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
            simpleDateFormat3.setTimeZone(TimeZone.getTimeZone("UTC"));
            String format3 = simpleDateFormat3.format(new Date());
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    f2 = -1.0f;
                    break;
                }
                C1667w c1667w2 = (C1667w) it2.next();
                if (format3.equals(c1667w2.f9486a)) {
                    f2 = c1667w2.f9490e;
                    break;
                }
            }
            if (f2 >= 0.0f) {
                m1980t(from, getString(R.string.weather_fs_metric_pop), Math.round(f2 * 100.0f) + "%");
            }
        }
        LinearLayout linearLayout2 = this.f3263Q;
        if (linearLayout2 == null) {
            str2 = "UTC";
            j4 = j6;
            str3 = "yyyy-MM-dd";
            str4 = str15;
            j3 = j2;
            list = list2;
        } else {
            linearLayout2.removeAllViews();
            LayoutInflater from2 = LayoutInflater.from(this);
            SimpleDateFormat simpleDateFormat4 = new SimpleDateFormat("HH:mm", Locale.getDefault());
            long j7 = j2;
            boolean m1979v = m1979v(j6, j7);
            Iterator it3 = c1669y.f9523v.iterator();
            while (it3.hasNext()) {
                C1668x c1668x = (C1668x) it3.next();
                Iterator it4 = it3;
                List list3 = list2;
                long j8 = j7;
                View inflate = from2.inflate(R.layout.item_weather_hour, (ViewGroup) this.f3263Q, false);
                TextView textView16 = (TextView) inflate.findViewById(R.id.wh_time);
                TextView textView17 = (TextView) inflate.findViewById(R.id.wh_temp);
                TextView textView18 = (TextView) inflate.findViewById(R.id.wh_feels);
                LayoutInflater layoutInflater = from2;
                TextView textView19 = (TextView) inflate.findViewById(R.id.wh_desc);
                long j9 = j6;
                TextView textView20 = (TextView) inflate.findViewById(R.id.wh_pop);
                TextView textView21 = (TextView) inflate.findViewById(R.id.wh_wind);
                String str17 = str13;
                TextView textView22 = (TextView) inflate.findViewById(R.id.wh_humidity);
                String str18 = str14;
                TextView textView23 = (TextView) inflate.findViewById(R.id.wh_precip);
                boolean z5 = m1979v;
                LottieAnimationView lottieAnimationView3 = (LottieAnimationView) inflate.findViewById(R.id.wh_icon);
                if (textView16 != null) {
                    lottieAnimationView = lottieAnimationView3;
                    str5 = str16;
                    textView16.setText(simpleDateFormat4.format(new Date(c1668x.f9491a)));
                } else {
                    lottieAnimationView = lottieAnimationView3;
                    str5 = str16;
                }
                if (textView17 != null) {
                    str6 = str;
                    textView17.setText(String.format(Locale.ENGLISH, str6, Float.valueOf(c1668x.f9492b)));
                } else {
                    str6 = str;
                }
                if (textView18 != null) {
                    textView18.setText(getString(R.string.weather_fs_feels, Float.valueOf(c1668x.f9493c)));
                }
                if (textView19 != null) {
                    if (c1668x.f9495e.isEmpty()) {
                        textView19.setText(C1670z.m4826n(this, c1668x.f9494d));
                    } else {
                        textView19.setText(c1668x.f9495e);
                    }
                }
                if (textView20 != null) {
                    float f7 = c1668x.f9496f;
                    if (f7 >= 0.0f) {
                        textView20.setText(getString(R.string.weather_fs_pop_label, Integer.valueOf(Math.round(f7 * 100.0f))));
                    } else {
                        str7 = str15;
                        textView20.setText(str7);
                        if (textView21 != null) {
                            String format4 = String.format(Locale.ENGLISH, "%.0f км/ч", Float.valueOf(c1668x.f9497g));
                            String m4828p2 = C1670z.m4828p(this, c1668x.f9498h);
                            if (!m4828p2.isEmpty()) {
                                format4 = AbstractC0062j.m169w(m4828p2, " ", format4);
                            }
                            textView21.setText(format4);
                        }
                        if (textView22 == null) {
                            if (c1668x.f9499i >= 0) {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(getString(R.string.weather_fs_humidity));
                                sb2.append(" ");
                                sb2.append(c1668x.f9499i);
                                str8 = str5;
                                sb2.append(str8);
                                str9 = sb2.toString();
                            } else {
                                str8 = str5;
                                str9 = str7;
                            }
                            textView22.setText(str9);
                        } else {
                            str8 = str5;
                        }
                        if (textView23 == null) {
                            StringBuilder sb3 = new StringBuilder();
                            if (c1668x.f9500j > 0.05f) {
                                sb3.append(getString(R.string.weather_fs_rain));
                                sb3.append(' ');
                                sb3.append(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(c1668x.f9500j)));
                            }
                            float f8 = c1668x.f9501k;
                            if (f8 > 0.05f) {
                                if (sb3.length() > 0) {
                                    sb3.append(" · ");
                                }
                                sb3.append(getString(R.string.weather_fs_snow));
                                sb3.append(' ');
                                sb3.append(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(f8)));
                            }
                            textView23.setText(sb3.toString());
                        }
                        if (lottieAnimationView != null) {
                            try {
                                m1979v = z5;
                                try {
                                    LottieAnimationView lottieAnimationView4 = lottieAnimationView;
                                    lottieAnimationView4.setAnimation(C1670z.m4827o(c1668x.f9494d, m1979v));
                                    lottieAnimationView4.playAnimation();
                                } catch (Exception unused2) {
                                }
                            } catch (Exception unused3) {
                            }
                            this.f3263Q.addView(inflate);
                            str15 = str7;
                            str = str6;
                            str16 = str8;
                            list2 = list3;
                            j7 = j8;
                            from2 = layoutInflater;
                            j6 = j9;
                            str13 = str17;
                            str14 = str18;
                            it3 = it4;
                        }
                        m1979v = z5;
                        this.f3263Q.addView(inflate);
                        str15 = str7;
                        str = str6;
                        str16 = str8;
                        list2 = list3;
                        j7 = j8;
                        from2 = layoutInflater;
                        j6 = j9;
                        str13 = str17;
                        str14 = str18;
                        it3 = it4;
                    }
                }
                str7 = str15;
                if (textView21 != null) {
                }
                if (textView22 == null) {
                }
                if (textView23 == null) {
                }
                if (lottieAnimationView != null) {
                }
                m1979v = z5;
                this.f3263Q.addView(inflate);
                str15 = str7;
                str = str6;
                str16 = str8;
                list2 = list3;
                j7 = j8;
                from2 = layoutInflater;
                j6 = j9;
                str13 = str17;
                str14 = str18;
                it3 = it4;
            }
            str2 = str13;
            j3 = j7;
            j4 = j6;
            str3 = str14;
            list = list2;
            str4 = str15;
            HorizontalScrollView horizontalScrollView = this.f3265S;
            if (horizontalScrollView != null) {
                horizontalScrollView.post(new RunnableC0024r(29, this));
            }
        }
        GridLayout gridLayout = this.f3264R;
        if (gridLayout == null) {
            return;
        }
        gridLayout.removeAllViews();
        LayoutInflater from3 = LayoutInflater.from(this);
        SimpleDateFormat simpleDateFormat5 = new SimpleDateFormat(str3, Locale.US);
        simpleDateFormat5.setTimeZone(TimeZone.getTimeZone(str2));
        DateFormat dateInstance = DateFormat.getDateInstance(2, Locale.getDefault());
        String format5 = simpleDateFormat5.format(new Date());
        boolean m1979v2 = m1979v(j4, j3);
        int round = Math.round(getResources().getDisplayMetrics().density * 4.0f);
        for (C1667w c1667w3 : list) {
            String str19 = c1667w3.f9486a;
            if (!format5.equals(str19)) {
                View inflate2 = from3.inflate(R.layout.item_weather_day, (ViewGroup) this.f3264R, false);
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.width = 0;
                layoutParams.height = -2;
                layoutParams.columnSpec = GridLayout.spec(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED, 1.0f);
                layoutParams.setMargins(round, round, round, round);
                inflate2.setLayoutParams(layoutParams);
                TextView textView24 = (TextView) inflate2.findViewById(R.id.wd_date);
                TextView textView25 = (TextView) inflate2.findViewById(R.id.wd_desc);
                TextView textView26 = (TextView) inflate2.findViewById(R.id.wd_temps);
                TextView textView27 = (TextView) inflate2.findViewById(R.id.wd_pop);
                LayoutInflater layoutInflater2 = from3;
                LottieAnimationView lottieAnimationView5 = (LottieAnimationView) inflate2.findViewById(R.id.wd_icon);
                String str20 = format5;
                try {
                    Date parse = simpleDateFormat5.parse(str19);
                    if (textView24 != null && parse != null) {
                        textView24.setText(dateInstance.format(parse));
                    }
                } catch (Exception unused4) {
                    if (textView24 != null) {
                        textView24.setText(str19);
                    }
                }
                int i3 = c1667w3.f9487b;
                if (textView25 != null) {
                    textView25.setText(C1670z.m4826n(this, i3));
                }
                if (textView26 != null) {
                    textView26.setText(String.format(Locale.ENGLISH, "%.0f° / %.0f°", Float.valueOf(c1667w3.f9488c), Float.valueOf(c1667w3.f9489d)));
                }
                if (textView27 != null) {
                    float f9 = c1667w3.f9490e;
                    if (f9 >= 0.0f) {
                        textView27.setText(getString(R.string.weather_fs_pop_short, Integer.valueOf(Math.round(f9 * 100.0f))));
                    } else {
                        textView27.setText(str4);
                    }
                }
                if (lottieAnimationView5 != null) {
                    try {
                        lottieAnimationView5.setAnimation(C1670z.m4827o(i3, m1979v2));
                        lottieAnimationView5.playAnimation();
                    } catch (Exception unused5) {
                    }
                }
                this.f3264R.addView(inflate2);
                from3 = layoutInflater2;
                format5 = str20;
            }
        }
    }

    /* renamed from: w */
    public final void m1982w() {
        TextView textView = this.f3266T;
        if (textView != null) {
            textView.setEnabled(false);
        }
        TextView textView2 = this.f3258L;
        if (textView2 != null) {
            textView2.setText(getString(R.string.split_info_weather_loading));
            this.f3258L.setTextColor(-571083009);
        }
        C1670z.m4822d(this).m4831i(true, new C0264b(this));
    }
}
