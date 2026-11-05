package p118x0;

import android.content.Context;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.p061ip.Theme43BarView;
import java.util.Locale;
import p000A.AbstractC0001b;
import p001A0.RunnableC0020n;
import p062d0.C0728a;
import p106t0.EnumC1457c;
import p121y0.C1683k;
import p121y0.C1685m;

/* renamed from: x0.b */
/* loaded from: classes.dex */
public final class C1646b {

    /* renamed from: A */
    public Theme43BarView f9329A;

    /* renamed from: B */
    public boolean f9330B;

    /* renamed from: C */
    public boolean f9331C;

    /* renamed from: a */
    public final Context f9333a;

    /* renamed from: c */
    public TextView f9335c;

    /* renamed from: d */
    public TextView f9336d;

    /* renamed from: e */
    public TextView f9337e;

    /* renamed from: f */
    public TextView f9338f;

    /* renamed from: g */
    public TextView f9339g;

    /* renamed from: h */
    public TextView f9340h;

    /* renamed from: i */
    public TextView f9341i;

    /* renamed from: j */
    public TextView f9342j;

    /* renamed from: k */
    public TextView f9343k;

    /* renamed from: l */
    public TextView f9344l;

    /* renamed from: m */
    public TextView f9345m;

    /* renamed from: n */
    public View f9346n;

    /* renamed from: o */
    public View f9347o;

    /* renamed from: p */
    public TextView f9348p;

    /* renamed from: q */
    public TextView f9349q;

    /* renamed from: r */
    public TextView f9350r;

    /* renamed from: s */
    public TextView f9351s;

    /* renamed from: t */
    public View f9352t;

    /* renamed from: u */
    public Theme43BarView f9353u;

    /* renamed from: v */
    public Theme43BarView f9354v;

    /* renamed from: w */
    public Theme43BarView f9355w;

    /* renamed from: x */
    public Theme43BarView f9356x;

    /* renamed from: y */
    public Theme43BarView f9357y;

    /* renamed from: z */
    public Theme43BarView f9358z;

    /* renamed from: b */
    public final Handler f9334b = new Handler(Looper.getMainLooper());

    /* renamed from: D */
    public final RunnableC0020n f9332D = new RunnableC0020n(29, this);

    public C1646b(Context context) {
        this.f9333a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static void m4778a(Theme43BarView theme43BarView, TextView textView, float f2) {
        int m4780e;
        if (f2 <= 0.0f || Float.isNaN(f2) || Float.isInfinite(f2)) {
            f2 = 0.0f;
        }
        float min = Math.min(f2, 29.9f);
        if (theme43BarView != null) {
            theme43BarView.setProgress(Math.min(299, Math.max(0, Math.round(10.0f * min))));
            if (min <= 0.001f) {
                m4780e = -11917264;
            } else {
                float max = Math.max(0.0f, Math.min(1.0f, min / 29.9f));
                m4780e = max < 0.35f ? m4780e(max / 0.35f, -11751576, -28640) : m4780e((max - 0.35f) / 0.65f, -28640, -1754827);
            }
            theme43BarView.setBarProgressColor(m4780e);
        }
        if (textView != null) {
            textView.setText(f2 > 0.001f ? String.format(Locale.US, "%.1f", Float.valueOf(f2)) : "—");
        }
    }

    /* renamed from: b */
    public static void m4779b(Theme43BarView theme43BarView, TextView textView, float f2, float f3, float f4) {
        if (theme43BarView != null) {
            theme43BarView.setProgress(Math.round(f2));
            int i = -6674408;
            if (f2 >= 15.0f) {
                if (f2 < 35.0f) {
                    i = m4780e((f2 - 15.0f) / 20.0f, -6674408, -3647456);
                } else {
                    i = -22454;
                    if (f2 < 55.0f) {
                        i = m4780e((f2 - 35.0f) / 20.0f, -3647456, -22454);
                    }
                }
            }
            theme43BarView.setBarProgressColor(i);
        }
        if (textView != null) {
            textView.setText(String.format(Locale.US, "%.0f%%  ·  %.0f л  ·  %.0f км", Float.valueOf(f2), Float.valueOf(Math.max(0.0f, f3)), Float.valueOf(Math.max(0.0f, f4))));
        }
    }

    /* renamed from: e */
    public static int m4780e(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        return Color.argb((int) (((Color.alpha(i2) - Color.alpha(i)) * max) + Color.alpha(i)), (int) (((Color.red(i2) - Color.red(i)) * max) + Color.red(i)), (int) (((Color.green(i2) - Color.green(i)) * max) + Color.green(i)), (int) (((Color.blue(i2) - Color.blue(i)) * max) + Color.blue(i)));
    }

    /* renamed from: f */
    public static float m4781f(float f2) {
        if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 < 0.0f) {
            return 0.0f;
        }
        return Math.min(100.0f, f2);
    }

    /* renamed from: h */
    public static void m4782h(Theme43BarView theme43BarView, int i) {
        if (theme43BarView == null) {
            return;
        }
        theme43BarView.setMax(299);
        theme43BarView.setOverlayBarStyle(true);
        theme43BarView.f2838m = -14013910;
        theme43BarView.f2839n = -14013910;
        theme43BarView.f2840o = i;
        theme43BarView.f2842q = true;
        theme43BarView.invalidate();
        theme43BarView.m1823c(-13998016, -7284568);
    }

    /* renamed from: i */
    public static void m4783i(Theme43BarView theme43BarView, int i) {
        if (theme43BarView == null) {
            return;
        }
        theme43BarView.setMax(100);
        theme43BarView.setOverlayBarStyle(true);
        theme43BarView.f2838m = -14013910;
        theme43BarView.f2839n = -14013910;
        theme43BarView.f2840o = i;
        theme43BarView.f2842q = true;
        theme43BarView.invalidate();
        theme43BarView.m1823c(-9816040, -18328);
    }

    /* renamed from: j */
    public static float m4784j(cfgData cfgdata, int i, float f2) {
        float max;
        float f3;
        float f4 = cfgdata.f2543M0 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
        if (i == 1) {
            f3 = Math.max(0.0f, f2) * f4;
            max = cfgdata.m1788g();
        } else {
            max = Math.max(0.0f, f2);
            f3 = 50.0f;
        }
        return (max * f3) / 100.0f;
    }

    /* renamed from: c */
    public final void m4785c(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        if (Float.isNaN(f2) || Float.isInfinite(f2) || f2 < 0.0f) {
            textView.setText(R.string.stats_value_na);
        } else {
            textView.setText(this.f9333a.getString(R.string.stats_value_liters, Float.valueOf(f2)));
        }
    }

    /* renamed from: d */
    public final void m4786d(View view) {
        if (view == null) {
            return;
        }
        this.f9335c = (TextView) view.findViewById(R.id.split_info_fuel_jour);
        this.f9336d = (TextView) view.findViewById(R.id.split_info_fuel_journal);
        this.f9337e = (TextView) view.findViewById(R.id.split_info_fuel_accum);
        this.f9338f = (TextView) view.findViewById(R.id.split_info_fuel_inst);
        this.f9339g = (TextView) view.findViewById(R.id.split_info_fuel_inst_unit);
        this.f9340h = (TextView) view.findViewById(R.id.split_info_fuel_used);
        this.f9341i = (TextView) view.findViewById(R.id.split_info_fuel_since_refuel);
        this.f9342j = (TextView) view.findViewById(R.id.split_info_fuel_trip);
        this.f9343k = (TextView) view.findViewById(R.id.split_info_fuel_remain_pct);
        this.f9344l = (TextView) view.findViewById(R.id.split_info_fuel_remain_pct1);
        this.f9345m = (TextView) view.findViewById(R.id.split_info_fuel_remain_pct2);
        this.f9346n = view.findViewById(R.id.split_info_fuel_remain_single);
        this.f9347o = view.findViewById(R.id.split_info_fuel_remain_dual);
        this.f9348p = (TextView) view.findViewById(R.id.split_info_fuel_elec_12v);
        this.f9349q = (TextView) view.findViewById(R.id.split_info_fuel_elec_level);
        this.f9350r = (TextView) view.findViewById(R.id.split_info_fuel_elec_48v);
        this.f9351s = (TextView) view.findViewById(R.id.split_info_fuel_elec_amp);
        View findViewById = view.findViewById(R.id.split_info_fuel_elec_hv);
        this.f9352t = findViewById;
        EnumC1457c enumC1457c = cfgData.m1784i().f2543M0;
        boolean z2 = enumC1457c != null && enumC1457c.f7149h;
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 0 : 4);
        }
        this.f9353u = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_jour);
        this.f9354v = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_journal);
        this.f9355w = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_accum);
        this.f9356x = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_inst);
        this.f9357y = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_remain);
        this.f9358z = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_remain1);
        this.f9329A = (Theme43BarView) view.findViewById(R.id.split_info_fuel_bar_remain2);
        this.f9331C = false;
    }

    /* renamed from: g */
    public final void m4787g() {
        if (this.f9331C) {
            return;
        }
        int m3a = AbstractC0001b.m3a(this.f9333a, R.color.overlay_panel_content_border);
        m4782h(this.f9353u, m3a);
        m4782h(this.f9354v, m3a);
        m4782h(this.f9355w, m3a);
        m4782h(this.f9356x, m3a);
        m4783i(this.f9357y, m3a);
        m4783i(this.f9358z, m3a);
        m4783i(this.f9329A, m3a);
        this.f9331C = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0186  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4788k() {
        float f2;
        TextView textView;
        View view;
        View view2;
        TextView textView2;
        TextView textView3;
        boolean z2;
        View view3;
        m4787g();
        carData cardata = carData.getInstance();
        cfgData m1784i = cfgData.m1784i();
        EnumC1457c enumC1457c = m1784i.f2543M0;
        boolean z3 = true;
        boolean z4 = enumC1457c != null && enumC1457c.f7147f;
        m4778a(this.f9353u, this.f9335c, cardata.m1739b());
        C1683k c1683k = C1683k.f9580s;
        Theme43BarView theme43BarView = this.f9354v;
        TextView textView4 = this.f9336d;
        float f3 = Float.NaN;
        if (c1683k != null) {
            synchronized (c1683k) {
                C1685m c1685m = c1683k.f9591k;
                if (c1685m != null) {
                    float max = Math.max(0.0f, c1685m.f9609f - c1685m.f9608e);
                    float f4 = c1683k.f9591k.f9613j;
                    if (max >= 0.1f && f4 > 0.0f && !Float.isNaN(f4)) {
                        if (!Float.isInfinite(f4)) {
                            f2 = (f4 * 100.0f) / max;
                        }
                    }
                }
            }
            m4778a(theme43BarView, textView4, f2);
            m4778a(this.f9355w, this.f9337e, cardata.m1737a());
            float m1765o = cardata.m1765o();
            boolean z5 = cardata.m1780z() <= 0.0f;
            m4778a(this.f9356x, this.f9338f, m1765o);
            textView = this.f9339g;
            if (textView != null) {
                textView.setText(z5 ? R.string.overlay_panel_inst_fuel_unit_l100 : R.string.overlay_panel_inst_fuel_unit_lph);
            }
            m4785c(this.f9340h, Math.max(cardata.m1755j(), m1784i.f2516F1));
            m4785c(this.f9341i, m1784i.f2524H1);
            TextView textView5 = this.f9342j;
            if (c1683k != null) {
                synchronized (c1683k) {
                    C1685m c1685m2 = c1683k.f9591k;
                    if (c1685m2 != null) {
                        f3 = c1685m2.f9613j;
                        if (!Float.isNaN(f3)) {
                            if (!Float.isInfinite(f3) && f3 >= 0.0f) {
                            }
                        }
                        f3 = 0.0f;
                    }
                }
            }
            m4785c(textView5, f3);
            view = this.f9346n;
            if (view != null) {
                view.setVisibility(z4 ? 8 : 0);
            }
            view2 = this.f9347o;
            if (view2 != null) {
                view2.setVisibility(z4 ? 0 : 8);
            }
            if (z4) {
                float m4781f = m4781f(cardata.m1774t());
                m4779b(this.f9357y, this.f9343k, m4781f, m1784i.m1789h() * m4781f, cardata.m1777w());
            } else {
                float m4781f2 = m4781f(cardata.m1775u());
                float m4781f3 = m4781f(cardata.m1776v());
                float m4784j = m4784j(m1784i, 1, m4781f2);
                float m4784j2 = m4784j(m1784i, 2, m4781f3);
                m4779b(this.f9358z, this.f9344l, m4781f2, m4784j, cardata.m1778x());
                m4779b(this.f9329A, this.f9345m, m4781f3, m4784j2, ((Float) cardata.f2457k0.m1395d()).floatValue());
            }
            textView2 = this.f9348p;
            String m2158e = C0728a.m2158e(cardata.m1741c());
            if (textView2 != null) {
                textView2.setText(m2158e);
            }
            textView3 = this.f9349q;
            Float f5 = (Float) cardata.f2442e0.m1395d();
            String m2157d = C0728a.m2157d(f5 != null ? f5.floatValue() : 0.0f);
            if (textView3 != null) {
                textView3.setText(m2157d);
            }
            EnumC1457c enumC1457c2 = m1784i.f2543M0;
            z2 = enumC1457c2 == null && enumC1457c2.f7149h;
            view3 = this.f9352t;
            if (view3 != null) {
                view3.setVisibility(z2 ? 0 : 4);
            }
            if (z2) {
                return;
            }
            TextView textView6 = this.f9350r;
            float m1761m = cardata.m1761m();
            EnumC1457c enumC1457c3 = m1784i.f2543M0;
            if (enumC1457c3 != EnumC1457c.T500_Urban && enumC1457c3 != EnumC1457c.T400 && enumC1457c3 != EnumC1457c.T700_100 && enumC1457c3 != EnumC1457c.T700) {
                z3 = false;
            }
            String m2156c = C0728a.m2156c(m1761m, z3);
            if (textView6 != null) {
                textView6.setText(m2156c);
            }
            TextView textView7 = this.f9351s;
            String m2155b = C0728a.m2155b(cardata.m1759l());
            if (textView7 != null) {
                textView7.setText(m2155b);
                return;
            }
            return;
        }
        f2 = Float.NaN;
        m4778a(theme43BarView, textView4, f2);
        m4778a(this.f9355w, this.f9337e, cardata.m1737a());
        float m1765o2 = cardata.m1765o();
        if (cardata.m1780z() <= 0.0f) {
        }
        m4778a(this.f9356x, this.f9338f, m1765o2);
        textView = this.f9339g;
        if (textView != null) {
        }
        m4785c(this.f9340h, Math.max(cardata.m1755j(), m1784i.f2516F1));
        m4785c(this.f9341i, m1784i.f2524H1);
        TextView textView52 = this.f9342j;
        if (c1683k != null) {
        }
        m4785c(textView52, f3);
        view = this.f9346n;
        if (view != null) {
        }
        view2 = this.f9347o;
        if (view2 != null) {
        }
        if (z4) {
        }
        textView2 = this.f9348p;
        String m2158e2 = C0728a.m2158e(cardata.m1741c());
        if (textView2 != null) {
        }
        textView3 = this.f9349q;
        Float f52 = (Float) cardata.f2442e0.m1395d();
        String m2157d2 = C0728a.m2157d(f52 != null ? f52.floatValue() : 0.0f);
        if (textView3 != null) {
        }
        EnumC1457c enumC1457c22 = m1784i.f2543M0;
        if (enumC1457c22 == null) {
        }
        view3 = this.f9352t;
        if (view3 != null) {
        }
        if (z2) {
        }
    }
}
