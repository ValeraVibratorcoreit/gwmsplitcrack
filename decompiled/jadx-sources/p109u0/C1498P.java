package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.p061ip.Theme43BarView;
import com.altaysoft.t500_split.p061ip.Theme43F1RailGuideView;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import java.util.Locale;
import p000A.AbstractC0000a;
import p000A.AbstractC0001b;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p021J0.ViewOnLayoutChangeListenerC0147a;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1372y1;
import p098q0.C1311e0;
import p106t0.EnumC1457c;
import p111v.C1592d;

/* renamed from: u0.P */
/* loaded from: classes.dex */
public final class C1498P {

    /* renamed from: A */
    public Theme43BarView f7664A;

    /* renamed from: B */
    public TextView f7666B;

    /* renamed from: C */
    public TextView f7668C;

    /* renamed from: D */
    public TextView f7670D;

    /* renamed from: E */
    public TextView f7671E;

    /* renamed from: F */
    public TextView f7672F;

    /* renamed from: G */
    public TextView f7673G;

    /* renamed from: H */
    public TextView f7674H;

    /* renamed from: I */
    public TextView f7675I;

    /* renamed from: J */
    public TextView f7676J;

    /* renamed from: K */
    public ImageView f7677K;

    /* renamed from: L */
    public ImageView f7678L;

    /* renamed from: M */
    public ImageView f7679M;

    /* renamed from: N */
    public Theme43F1RailGuideView f7680N;

    /* renamed from: O */
    public Theme43F1RailGuideView f7681O;

    /* renamed from: P */
    public TextView f7682P;

    /* renamed from: Q */
    public TextView f7683Q;

    /* renamed from: R */
    public TextView f7684R;

    /* renamed from: S */
    public ImageView f7685S;

    /* renamed from: T */
    public TextView f7686T;

    /* renamed from: U */
    public ImageView f7687U;

    /* renamed from: V */
    public View f7688V;

    /* renamed from: W */
    public ImageView f7689W;

    /* renamed from: X */
    public TextView f7690X;

    /* renamed from: Y */
    public TextView f7691Y;

    /* renamed from: Z */
    public TextView f7692Z;

    /* renamed from: a */
    public final C1537g f7693a;

    /* renamed from: a0 */
    public TextView f7694a0;

    /* renamed from: b */
    public final View f7695b;

    /* renamed from: b0 */
    public ProgressBar f7696b0;

    /* renamed from: c */
    public final Context f7697c;

    /* renamed from: d0 */
    public long f7700d0;

    /* renamed from: e0 */
    public long f7702e0;

    /* renamed from: f0 */
    public boolean f7704f0;

    /* renamed from: g */
    public ViewGroup f7705g;

    /* renamed from: g0 */
    public long f7706g0;

    /* renamed from: h */
    public View f7707h;

    /* renamed from: i */
    public TextView f7709i;

    /* renamed from: i0 */
    public float f7710i0;

    /* renamed from: j */
    public TextView f7711j;

    /* renamed from: j0 */
    public float f7712j0;

    /* renamed from: k */
    public Theme43BarView f7713k;

    /* renamed from: k0 */
    public float f7714k0;

    /* renamed from: l */
    public TextView f7715l;

    /* renamed from: l0 */
    public long f7716l0;

    /* renamed from: m */
    public TextView f7717m;

    /* renamed from: m0 */
    public View f7718m0;

    /* renamed from: n */
    public TextView f7719n;

    /* renamed from: n0 */
    public C1531e f7720n0;

    /* renamed from: o */
    public TextView f7721o;

    /* renamed from: o0 */
    public C1525c f7722o0;

    /* renamed from: p */
    public TextView f7723p;

    /* renamed from: p0 */
    public C1521a1 f7724p0;

    /* renamed from: q */
    public TextView f7725q;

    /* renamed from: q0 */
    public ValueAnimator f7726q0;

    /* renamed from: r */
    public Theme43BarView f7727r;

    /* renamed from: r0 */
    public boolean f7728r0;

    /* renamed from: s */
    public TextView f7729s;

    /* renamed from: t */
    public TextView f7731t;

    /* renamed from: u */
    public TextView f7733u;

    /* renamed from: u0 */
    public float f7734u0;

    /* renamed from: v */
    public TextView f7735v;

    /* renamed from: w */
    public TextView f7737w;

    /* renamed from: w0 */
    public boolean f7738w0;

    /* renamed from: x */
    public TextView f7739x;

    /* renamed from: x0 */
    public boolean f7740x0;

    /* renamed from: y */
    public TextView f7741y;

    /* renamed from: y0 */
    public float f7742y0;

    /* renamed from: z */
    public TextView f7743z;

    /* renamed from: d */
    public final cfgData f7699d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7701e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7703f = new Handler(Looper.getMainLooper());

    /* renamed from: c0 */
    public C0636d f7698c0 = C0636d.f2994j;

    /* renamed from: h0 */
    public float f7708h0 = 1.0f;

    /* renamed from: s0 */
    public final RunnableC1490L f7730s0 = new RunnableC1490L(this, 5);

    /* renamed from: t0 */
    public boolean f7732t0 = false;

    /* renamed from: v0 */
    public boolean f7736v0 = true;

    /* renamed from: z0 */
    public int f7744z0 = 999;

    /* renamed from: A0 */
    public final ViewOnLayoutChangeListenerC0147a f7665A0 = new ViewOnLayoutChangeListenerC0147a(2, this);

    /* renamed from: B0 */
    public final RunnableC1496O f7667B0 = new RunnableC1496O(this, 0);

    /* renamed from: C0 */
    public final RunnableC1496O f7669C0 = new RunnableC1496O(this, 1);

    public C1498P(C1537g c1537g, View view) {
        this.f7693a = c1537g;
        this.f7695b = view;
        this.f7697c = view.getContext();
    }

    /* renamed from: i */
    public static String m3888i(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: j */
    public static RectF m3889j(int i, int i2) {
        RectF m4206a0 = AbstractC1539g1.m4206a0(AbstractC1539g1.m4238t(), i, i2);
        if (m4206a0.width() > 0.0f && m4206a0.height() > 0.0f) {
            float f2 = i2 - 20.0f;
            m4206a0.set(m4206a0.left, f2 - Math.max(0.0f, m4206a0.height() - 30.0f), m4206a0.right, f2);
        }
        return m4206a0;
    }

    /* renamed from: v */
    public static void m3890v(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: w */
    public static void m3891w(View view, float f2) {
        if (view == null) {
            return;
        }
        view.setVisibility(f2 > 0.01f ? 0 : 4);
        view.setAlpha(f2);
    }

    /* renamed from: y */
    public static void m3892y(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: A */
    public final void m3893A() {
        View view = this.f7695b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_43_root);
        this.f7705g = viewGroup;
        AbstractC1539g1.m4207b(viewGroup);
        float dimension = this.f7697c.getResources().getDimension(R.dimen.theme_43_bottom_panel_height) + 10.0f;
        AbstractC1539g1.m4217g(view.findViewById(R.id.theme_43_bottom_panel_left), dimension);
        AbstractC1539g1.m4217g(view.findViewById(R.id.theme_43_bottom_panel_right), dimension);
        this.f7707h = view.findViewById(R.id.theme_43_top_panel);
        this.f7709i = (TextView) view.findViewById(R.id.theme_43_inst_fuel);
        this.f7711j = (TextView) view.findViewById(R.id.theme_43_inst_fuel_sub);
        Theme43BarView theme43BarView = (Theme43BarView) view.findViewById(R.id.theme_43_inst_fuel_bar);
        this.f7713k = theme43BarView;
        if (theme43BarView != null) {
            theme43BarView.setMax(299);
        }
        this.f7715l = (TextView) view.findViewById(R.id.theme_43_lbl_avg_jour);
        this.f7717m = (TextView) view.findViewById(R.id.theme_43_avg_jour);
        this.f7719n = (TextView) view.findViewById(R.id.theme_43_avg_jour_sub);
        this.f7721o = (TextView) view.findViewById(R.id.theme_43_avg_total);
        this.f7723p = (TextView) view.findViewById(R.id.theme_43_fuel);
        this.f7725q = (TextView) view.findViewById(R.id.theme_43_fuel_liters);
        this.f7727r = (Theme43BarView) view.findViewById(R.id.theme_43_fuel_bar);
        this.f7729s = (TextView) view.findViewById(R.id.theme_43_remain);
        this.f7731t = (TextView) view.findViewById(R.id.theme_43_odo_label);
        this.f7733u = (TextView) view.findViewById(R.id.theme_43_odo_total);
        this.f7735v = (TextView) view.findViewById(R.id.theme_43_odo_day_label);
        this.f7737w = (TextView) view.findViewById(R.id.theme_43_odo_day);
        this.f7739x = (TextView) view.findViewById(R.id.theme_43_odo_trip_label);
        TextView textView = (TextView) view.findViewById(R.id.theme_43_odo_trip);
        this.f7741y = textView;
        TextView textView2 = this.f7733u;
        TextView textView3 = this.f7737w;
        AbstractC1539g1.m4219h(textView2, "888888");
        AbstractC1539g1.m4227l(textView3);
        AbstractC1539g1.m4219h(textView, "888888");
        AbstractC1539g1.m4219h(this.f7721o, "88.8 L");
        AbstractC1539g1.m4227l(this.f7717m);
        AbstractC1539g1.m4229m(this.f7709i, "88.8 L");
        AbstractC1539g1.m4227l(this.f7729s);
        this.f7743z = (TextView) view.findViewById(R.id.theme_43_coolant);
        this.f7664A = (Theme43BarView) view.findViewById(R.id.theme_43_coolant_bar);
        this.f7666B = (TextView) view.findViewById(R.id.theme_43_battery);
        this.f7668C = (TextView) view.findViewById(R.id.theme_43_hv);
        this.f7670D = (TextView) view.findViewById(R.id.theme_43_wheel_fl);
        this.f7671E = (TextView) view.findViewById(R.id.theme_43_wheel_fr);
        this.f7672F = (TextView) view.findViewById(R.id.theme_43_wheel_rl);
        this.f7673G = (TextView) view.findViewById(R.id.theme_43_wheel_rr);
        this.f7677K = (ImageView) view.findViewById(R.id.theme_43_tires_car);
        this.f7674H = (TextView) view.findViewById(R.id.theme_43_gear);
        this.f7675I = (TextView) view.findViewById(R.id.theme_43_clock);
        this.f7676J = (TextView) view.findViewById(R.id.theme_43_out_temp);
        this.f7678L = (ImageView) view.findViewById(R.id.theme_43_wifi);
        this.f7679M = (ImageView) view.findViewById(R.id.theme_43_inet);
        this.f7680N = (Theme43F1RailGuideView) view.findViewById(R.id.theme_43_rpm_rail);
        Theme43F1RailGuideView theme43F1RailGuideView = (Theme43F1RailGuideView) view.findViewById(R.id.theme_43_spd_rail);
        this.f7681O = theme43F1RailGuideView;
        if (this.f7680N != null && theme43F1RailGuideView != null) {
            ViewOnLayoutChangeListenerC0147a viewOnLayoutChangeListenerC0147a = this.f7665A0;
            theme43F1RailGuideView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0147a);
            this.f7680N.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0147a);
            view.post(new RunnableC1490L(this, 0));
        }
        this.f7682P = (TextView) view.findViewById(R.id.theme_43_spd_value);
        this.f7683Q = (TextView) view.findViewById(R.id.theme_43_rpm_value);
        this.f7684R = (TextView) view.findViewById(R.id.theme_43_rpm_unit);
        this.f7685S = (ImageView) view.findViewById(R.id.theme_43_cruise);
        this.f7686T = (TextView) view.findViewById(R.id.theme_43_cruise_speed);
        this.f7687U = (ImageView) view.findViewById(R.id.theme_43_lane);
        View findViewById = view.findViewById(R.id.theme_43_media_wrap);
        this.f7688V = findViewById;
        AbstractC0641i.m1886c(findViewById);
        this.f7689W = (ImageView) view.findViewById(R.id.theme_43_media_art);
        this.f7690X = (TextView) view.findViewById(R.id.theme_43_media_title);
        this.f7691Y = (TextView) view.findViewById(R.id.theme_43_media_artist);
        this.f7692Z = (TextView) view.findViewById(R.id.theme_43_media_elapsed);
        this.f7694a0 = (TextView) view.findViewById(R.id.theme_43_media_total);
        this.f7696b0 = (ProgressBar) view.findViewById(R.id.theme_43_media_bar);
        this.f7718m0 = view.findViewById(R.id.theme_43_navi_hole);
        TextView textView4 = (TextView) view.findViewById(R.id.theme_43_free_mem);
        Handler handler = this.f7703f;
        this.f7720n0 = new C1531e(handler, textView4);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f7693a);
        }
        m3903e();
        if (!this.f7740x0) {
            m3905g();
            this.f7740x0 = true;
        }
        ViewGroup viewGroup2 = this.f7705g;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f);
        }
        this.f7742y0 = 0.0f;
        cfgData cfgdata = this.f7699d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f7736v0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m3904f();
        this.f7738w0 = true;
        handler.post(this.f7669C0);
        handler.post(this.f7667B0);
        this.f7720n0.m4171b();
        carData cardata = this.f7701e;
        m3908l(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView5 = this.f7686T;
        if (textView5 != null) {
            textView5.setText(String.valueOf(m1747f));
        }
        m3908l(cardata.m1745e());
        m3898F();
        m3907k();
        m3910n(C0639g.m1872x().m1880u());
    }

    /* renamed from: B */
    public final void m3894B(float f2, float f3, RunnableC1490L runnableC1490L) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7726q0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7726q0);
        this.f7726q0.addUpdateListener(new C0174W(7, this));
        this.f7726q0.addListener(new C0181b0(this, 5, runnableC1490L));
        this.f7726q0.start();
    }

    /* renamed from: C */
    public final void m3895C(String str) {
        Context context = this.f7697c;
        try {
            ActivityOptions makeBasic = ActivityOptions.makeBasic();
            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
            intent.addFlags(402722816);
            intent.putExtra("caller", str);
            context.startActivity(intent, makeBasic.setLaunchBounds(new Rect(0, 0, 1920, 1080)).toBundle());
        } catch (Exception e2) {
            Toast.makeText(context, "ERROR3" + e2, 1).show();
        }
    }

    /* renamed from: D */
    public final void m3896D() {
        this.f7703f.removeCallbacks(this.f7730s0);
        ValueAnimator valueAnimator = this.f7726q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7726q0 = null;
        }
        if (!this.f7728r0 && AbstractC1372y1.m3272C()) {
            m3917u();
            return;
        }
        if (!this.f7728r0) {
            this.f7728r0 = true;
            AbstractC1372y1.m3287R(true, true);
            this.f7734u0 = 0.0f;
            m3898F();
            m3894B(0.0f, 1.0f, null);
            return;
        }
        float f2 = this.f7734u0;
        if (f2 > 0.0f) {
            m3894B(f2, 0.0f, new RunnableC1490L(this, 4));
            return;
        }
        this.f7728r0 = false;
        AbstractC1372y1.m3287R(false, true);
        m3898F();
    }

    /* renamed from: E */
    public final void m3897E(RectF rectF, float f2, float f3) {
        ViewGroup viewGroup = this.f7705g;
        if (viewGroup == null) {
            return;
        }
        viewGroup.getOverlay().clear();
        cfgData cfgdata = this.f7699d;
        if (!cfgdata.f2537K2 || !this.f7736v0 || AbstractC1539g1.m4194P(cfgdata, this.f7701e) || rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        if (this.f7724p0 == null) {
            this.f7724p0 = new C1521a1();
        }
        this.f7724p0.setBounds(0, 0, this.f7705g.getWidth(), this.f7705g.getHeight());
        this.f7724p0.m4155a(rectF, f2, f3, AbstractC0001b.m3a(this.f7697c, R.color.ip_theme_43_border), 10.0f, 7.0f);
        this.f7705g.getOverlay().add(this.f7724p0);
    }

    /* renamed from: F */
    public final void m3898F() {
        float f2;
        ViewGroup viewGroup = this.f7705g;
        if (viewGroup == null || this.f7722o0 == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7705g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7705g.post(new RunnableC1490L(this, 1));
            return;
        }
        float f3 = this.f7697c.getResources().getDisplayMetrics().density;
        float f4 = 14.0f * f3;
        this.f7722o0.m4160b();
        RectF m3889j = m3889j(width, height);
        if (m3889j.width() <= 0.0f || m3889j.height() <= 0.0f) {
            m3897E(null, 0.0f, 0.0f);
        } else {
            cfgData cfgdata = this.f7699d;
            boolean z2 = cfgdata.f2537K2 && this.f7736v0 && !AbstractC1539g1.m4194P(cfgdata, this.f7701e);
            this.f7722o0.m4159a(m3889j.left, m3889j.top, m3889j.right, m3889j.bottom, f4, z2 ? 0.0f : f3);
            m3897E(m3889j, f4, z2 ? f3 : 0.0f);
        }
        if (this.f7728r0 || this.f7734u0 > 0.0f) {
            f2 = 0.0f;
            AbstractC1539g1.m4205a(this.f7722o0, width, height, f3, this.f7734u0, f3);
        } else {
            f2 = 0.0f;
        }
        boolean z3 = this.f7728r0;
        if (!z3 && this.f7734u0 <= f2) {
            m3918x(1.0f);
        } else if (!z3 || this.f7734u0 < 1.0f) {
            m3918x(z3 ? 1.0f - this.f7734u0 : this.f7734u0);
        } else {
            m3918x(f2);
        }
        this.f7705g.invalidate();
    }

    /* renamed from: a */
    public final void m3899a() {
        Theme43F1RailGuideView theme43F1RailGuideView;
        float m1827d;
        if (this.f7680N == null || (theme43F1RailGuideView = this.f7681O) == null || theme43F1RailGuideView.getWidth() <= 0 || this.f7680N.getWidth() <= 0) {
            return;
        }
        Theme43F1RailGuideView theme43F1RailGuideView2 = this.f7681O;
        int width = theme43F1RailGuideView2.getWidth();
        if (width <= 0) {
            m1827d = 0.0f;
        } else {
            float strokeWidth = theme43F1RailGuideView2.f2872h.getStrokeWidth() * 0.5f;
            m1827d = theme43F1RailGuideView2.m1827d(strokeWidth, width - (2.0f * strokeWidth));
        }
        this.f7680N.setHorizontalEndX((((this.f7681O.getTranslationX() + this.f7681O.getLeft()) + m1827d) - this.f7680N.getLeft()) - this.f7680N.getTranslationX());
    }

    /* renamed from: b */
    public final void m3900b(long j2) {
        boolean z2 = this.f7702e0 > 0;
        ProgressBar progressBar = this.f7696b0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7696b0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7702e0)));
            }
        }
        TextView textView = this.f7692Z;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7692Z.setText(m3888i(j2));
            }
        }
        TextView textView2 = this.f7694a0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7694a0.setText(m3888i(this.f7702e0));
            }
        }
    }

    /* renamed from: c */
    public final void m3901c() {
        C0636d c0636d;
        if (this.f7688V == null) {
            return;
        }
        this.f7688V.setVisibility(this.f7699d.f2585W2 && (c0636d = this.f7698c0) != null && c0636d.m1851a() && (this.f7708h0 > 0.01f ? 1 : (this.f7708h0 == 0.01f ? 0 : -1)) > 0 ? 0 : 8);
        this.f7688V.setAlpha(this.f7708h0);
    }

    /* renamed from: d */
    public final void m3902d() {
        ViewGroup viewGroup;
        if (this.f7718m0 == null || (viewGroup = this.f7705g) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7705g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7705g.post(new RunnableC1490L(this, 2));
            return;
        }
        if (this.f7718m0.getLayoutParams() instanceof C1592d) {
            RectF m3889j = m3889j(width, height);
            C1592d c1592d = (C1592d) this.f7718m0.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m3889j.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m3889j.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m3889j.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m3889j.top);
            this.f7718m0.setLayoutParams(c1592d);
            this.f7695b.post(new RunnableC1490L(this, 3));
        }
    }

    /* renamed from: e */
    public final void m3903e() {
        if (this.f7705g == null) {
            return;
        }
        C1525c c1525c = this.f7722o0;
        Context context = this.f7697c;
        if (c1525c == null) {
            C1525c c1525c2 = new C1525c(-16777216);
            this.f7722o0 = c1525c2;
            c1525c2.m4164f(AbstractC0001b.m3a(context, R.color.ip_theme_43_border));
        }
        this.f7722o0.m4163e(AbstractC0000a.m1b(context, R.drawable.ip_theme_43_bg));
        this.f7705g.setLayerType(1, null);
        this.f7705g.setBackground(this.f7722o0);
        m3902d();
        m3898F();
        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, this.f7707h, AbstractC1539g1.m4230m0(this.f7699d, this.f7701e));
    }

    /* renamed from: f */
    public final void m3904f() {
        ViewGroup viewGroup = this.f7705g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7736v0);
        if (this.f7699d.f2537K2 && this.f7736v0) {
            this.f7705g.setVisibility(0);
            m3908l(this.f7701e.m1745e());
        } else {
            m3917u();
            this.f7705g.setVisibility(4);
            ImageView imageView = this.f7685S;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            TextView textView = this.f7686T;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ImageView imageView2 = this.f7687U;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
        m3898F();
    }

    /* renamed from: g */
    public final void m3905g() {
        final RunnableC1490L runnableC1490L = new RunnableC1490L(this, 6);
        final int i = 5;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        };
        carData cardata = this.f7701e;
        C1537g c1537g = this.f7693a;
        cardata.m1742c0(c1537g, interfaceC0561z);
        final int i2 = 6;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i3 = 7;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i4 = 8;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i5 = 9;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i6 = 10;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i7 = 11;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i8 = 12;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i9 = 13;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i10 = 14;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i11 = 15;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i12 = 16;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i13 = 0;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i14 = 1;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i15 = 2;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i16 = 3;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i17 = 4;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.M
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1490L.run();
                        break;
                    case 1:
                        runnableC1490L.run();
                        break;
                    case 2:
                        runnableC1490L.run();
                        break;
                    case 3:
                        runnableC1490L.run();
                        break;
                    case 4:
                        runnableC1490L.run();
                        break;
                    case 5:
                        runnableC1490L.run();
                        break;
                    case 6:
                        runnableC1490L.run();
                        break;
                    case 7:
                        runnableC1490L.run();
                        break;
                    case 8:
                        runnableC1490L.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1490L.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1490L.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1490L.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1490L.run();
                        break;
                    case 13:
                        runnableC1490L.run();
                        break;
                    case 14:
                        runnableC1490L.run();
                        break;
                    case 15:
                        runnableC1490L.run();
                        break;
                    default:
                        runnableC1490L.run();
                        break;
                }
            }
        });
        final int i18 = 0;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i18) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i19 = 1;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i19) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i20 = 2;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i20) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i21 = 3;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i21) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i22 = 4;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i22) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i23 = 5;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i23) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7697c);
        final int i24 = 6;
        cardata.m1754i0(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i24) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i25 = 7;
        cardata.m1750g0(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i25) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i26 = 8;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i26) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i27 = 9;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i27) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i28 = 10;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i28) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i29 = 11;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i29) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i30 = 12;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i30) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i31 = 13;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i31) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i32 = 14;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i32) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i33 = 15;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i33) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
        final int i34 = 16;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.N

            /* renamed from: b */
            public final /* synthetic */ C1498P f7657b;

            {
                this.f7657b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue2;
                int intValue3;
                switch (i34) {
                    case 0:
                        this.f7657b.m3912p();
                        break;
                    case 1:
                        this.f7657b.m3911o();
                        break;
                    case 2:
                        this.f7657b.m3911o();
                        break;
                    case 3:
                        this.f7657b.m3911o();
                        break;
                    case 4:
                        Integer num = (Integer) obj;
                        C1498P c1498p = this.f7657b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1498p.getClass();
                            intValue = num.intValue();
                        }
                        if (c1498p.f7744z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1498p.f7697c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1498p.f7699d;
                            if (cfgdata.f2537K2) {
                                c1498p.f7742y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1498p.f7744z0 == -1 && intValue > -1) {
                            c1498p.f7742y0 = 0.0f;
                            ViewGroup viewGroup2 = c1498p.f7705g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1498p.f7705g.setAlpha(1.0f);
                            }
                            c1498p.m3895C("ip");
                        }
                        c1498p.f7744z0 = intValue;
                        c1498p.m3909m();
                        break;
                    case 5:
                        this.f7657b.m3909m();
                        break;
                    case 6:
                        C1498P c1498p2 = this.f7657b;
                        c1498p2.m3916t();
                        c1498p2.m3915s();
                        break;
                    case 7:
                        C1498P c1498p3 = this.f7657b;
                        c1498p3.m3913q();
                        c1498p3.m3914r();
                        break;
                    case 8:
                        C1498P c1498p4 = this.f7657b;
                        c1498p4.m3916t();
                        c1498p4.m3915s();
                        c1498p4.m3913q();
                        c1498p4.m3914r();
                        break;
                    case Platform.GNU /* 9 */:
                        C1498P c1498p5 = this.f7657b;
                        Integer num2 = (Integer) obj;
                        c1498p5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1498p5.f7697c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1498p5.f7732t0 || !c1498p5.f7728r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1498p5.f7701e)) {
                                                                    cfgData cfgdata2 = c1498p5.f7699d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1498p5.f7701e.m1760l0(z2);
                                                                    c1498p5.f7699d.m1795o(c1498p5.f7697c);
                                                                    Context context2 = c1498p5.f7697c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1498p5.f7699d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1498p5.f7699d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1498p5.f7697c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1498p5.m3895C("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1498p5.f7703f;
                                                                RunnableC1490L runnableC1490L2 = c1498p5.f7730s0;
                                                                handler.removeCallbacks(runnableC1490L2);
                                                                handler.postDelayed(runnableC1490L2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1498p5.f7728r0) {
                                                        c1498p5.f7732t0 = true;
                                                        ViewGroup viewGroup3 = c1498p5.f7705g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1498p5.f7728r0 && ((valueAnimator = c1498p5.f7726q0) == null || !valueAnimator.isRunning())) {
                                                                c1498p5.m3896D();
                                                            }
                                                            Handler handler2 = c1498p5.f7703f;
                                                            RunnableC1490L runnableC1490L3 = c1498p5.f7730s0;
                                                            handler2.removeCallbacks(runnableC1490L3);
                                                            handler2.postDelayed(runnableC1490L3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1498p5.f7732t0) {
                                                        Handler handler3 = c1498p5.f7703f;
                                                        RunnableC1490L runnableC1490L4 = c1498p5.f7730s0;
                                                        handler3.removeCallbacks(runnableC1490L4);
                                                        handler3.postDelayed(runnableC1490L4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1498p5.f7736v0;
                                                    c1498p5.f7736v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1498p5.m3904f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1498p5.f7697c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1498p5.f7699d.f2672o3) {
                                                    Context context3 = c1498p5.f7697c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1498p5.m3895C("ip_rest");
                                                    break;
                                                } else {
                                                    c1498p5.m3895C("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1498p5.f7701e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1498p5.f7699d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1498p5.f7697c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1498p5.f7697c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1498p5.f7705g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1498p5.f7726q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1498p5.f7732t0 = false;
                                        c1498p5.m3896D();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1498p5.f7697c);
                                break;
                            }
                        }
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num3 = (Integer) obj;
                        C1498P c1498p6 = this.f7657b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1498p6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1498p6.m3908l(intValue2);
                        break;
                    case Platform.NETBSD /* 11 */:
                        Integer num4 = (Integer) obj;
                        C1498P c1498p7 = this.f7657b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1498p7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1498p7.f7686T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1498p7.m3908l(c1498p7.f7701e.m1745e());
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1498P c1498p8 = this.f7657b;
                        c1498p8.m3898F();
                        c1498p8.m3901c();
                        break;
                    case 13:
                        C1498P c1498p9 = this.f7657b;
                        c1498p9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1498p9.m3917u();
                        }
                        c1498p9.m3898F();
                        c1498p9.m3901c();
                        break;
                    case 14:
                        C1498P c1498p10 = this.f7657b;
                        c1498p10.m3898F();
                        c1498p10.m3901c();
                        break;
                    case 15:
                        C1498P c1498p11 = this.f7657b;
                        AbstractC1539g1.m4225k(c1498p11.f7697c);
                        c1498p11.m3898F();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_43_top_bar, c1498p11.f7707h, AbstractC1539g1.m4230m0(c1498p11.f7699d, c1498p11.f7701e));
                        break;
                    default:
                        this.f7657b.m3910n((C0636d) obj);
                        break;
                }
            }
        });
    }

    /* renamed from: h */
    public final int m3906h(int i) {
        if (!this.f7699d.f2641i2) {
            return i;
        }
        int m1753i = this.f7701e.m1753i();
        if (m1753i == 1) {
            return -1947062;
        }
        if (m1753i == 2) {
            return -12345273;
        }
        return i;
    }

    /* renamed from: k */
    public final void m3907k() {
        float max;
        float max2;
        float max3;
        AbstractC1539g1.m4228l0(this.f7705g, !this.f7736v0);
        cfgData cfgdata = this.f7699d;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f7701e;
        if (z2) {
            float f2 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            max = cfgdata.m1787f(m1775u, cardata.m1776v(), f2);
            Theme43BarView theme43BarView = this.f7727r;
            if (theme43BarView != null) {
                theme43BarView.setProgress(Math.round(m1775u * f2));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            Theme43BarView theme43BarView2 = this.f7727r;
            if (theme43BarView2 != null) {
                theme43BarView2.setProgress(Math.round(max));
            }
        }
        EnumC1457c enumC1457c2 = cfgdata.f2543M0;
        if (enumC1457c2.f7147f) {
            max2 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c2 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
        } else {
            max2 = Math.max(0.0f, cardata.m1774t());
        }
        int i = -995120;
        int i2 = max2 < 15.0f ? -65536 : max2 < 30.0f ? -256 : -995120;
        Theme43BarView theme43BarView3 = this.f7727r;
        if (theme43BarView3 != null) {
            int i3 = -6674408;
            if (max >= 15.0f) {
                if (max < 35.0f) {
                    i3 = AbstractC1539g1.m4235q((max - 15.0f) / 20.0f, -6674408, -3647456);
                } else {
                    i3 = -22454;
                    if (max < 55.0f) {
                        i3 = AbstractC1539g1.m4235q((max - 35.0f) / 20.0f, -3647456, -22454);
                    }
                }
            }
            theme43BarView3.setBarProgressColor(i3);
        }
        TextView textView = this.f7723p;
        if (textView != null) {
            textView.setText(String.format(Locale.ENGLISH, "%.0f%%", Float.valueOf(max)));
            this.f7723p.setTextColor(i2);
        }
        TextView textView2 = this.f7725q;
        if (textView2 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c3 = cfgdata.f2543M0;
            if (enumC1457c3.f7147f) {
                max3 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 != EnumC1457c.T500_BT_NEW ? 1.0f : 10.0f);
            } else {
                max3 = Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h();
            }
            textView2.setText(String.format(locale, "%.0f L", Float.valueOf(max3)));
            this.f7725q.setTextColor(i2);
        }
        float m1743d = cardata.m1743d();
        Theme43BarView theme43BarView4 = this.f7664A;
        if (theme43BarView4 != null) {
            theme43BarView4.setProgress(Math.round(m1743d < 40.0f ? 0 : m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f)));
            this.f7664A.setBarProgressColor(m1743d >= 40.0f ? m1743d > 112.0f ? -1552336 : m1743d > 107.0f ? AbstractC1539g1.m4235q((m1743d - 107.0f) / 5.0f, -11351809, -1552336) : m1743d < 75.0f ? AbstractC1539g1.m4235q((m1743d - 40.0f) / 35.0f, -14002048, -11351809) : -11351809 : -14002048);
        }
        TextView textView3 = this.f7743z;
        if (textView3 != null) {
            if (m1743d < -90.0f) {
                textView3.setText("-- °C");
                this.f7743z.setTextColor(-995120);
            } else {
                textView3.setText(String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d)));
                TextView textView4 = this.f7743z;
                if (m1743d < 40.0f) {
                    i = -16776961;
                } else if (m1743d > 112.0f) {
                    i = -65536;
                } else if (m1743d > 107.0f) {
                    i = -256;
                }
                textView4.setTextColor(i);
            }
        }
        TextView textView5 = this.f7729s;
        if (textView5 != null) {
            textView5.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(cardata.m1777w())));
        }
        float m1765o = cardata.m1765o();
        float min = m1765o > 0.0f ? Math.min(m1765o, 29.9f) : 0.0f;
        if (Math.abs(min - this.f7712j0) > 0.001f) {
            this.f7714k0 = this.f7710i0;
            this.f7712j0 = min;
            this.f7716l0 = SystemClock.elapsedRealtime();
        }
        m3913q();
        m3914r();
        m3915s();
        m3916t();
        m3890v(this.f7717m, cardata.m1739b());
        m3890v(this.f7721o, cardata.m1737a());
        TextView textView6 = this.f7666B;
        if (textView6 != null) {
            textView6.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(cardata.m1741c())));
        }
        TextView textView7 = this.f7668C;
        if (textView7 != null) {
            boolean z3 = cfgdata.f2543M0.f7149h;
            textView7.setVisibility(z3 ? 0 : 4);
            if (z3) {
                TextView textView8 = this.f7668C;
                Locale locale2 = Locale.ENGLISH;
                Float valueOf = Float.valueOf(cardata.m1761m());
                EnumC1457c enumC1457c4 = cfgdata.f2543M0;
                textView8.setText(String.format(locale2, "%.1f%s", valueOf, (enumC1457c4 == EnumC1457c.T500_Urban || enumC1457c4 == EnumC1457c.T400 || enumC1457c4 == EnumC1457c.T700_100 || enumC1457c4 == EnumC1457c.T700) ? "%" : "V"));
            }
        }
        TextView textView9 = this.f7733u;
        if (textView9 != null) {
            textView9.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1771r())).replace(",", "."));
        }
        TextView textView10 = this.f7737w;
        if (textView10 != null) {
            textView10.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", "."));
        }
        TextView textView11 = this.f7741y;
        if (textView11 != null) {
            textView11.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1767p())).replace(",", "."));
        }
        m3919z(this.f7670D, cardata.m1715C());
        m3919z(this.f7671E, cardata.m1716D());
        m3919z(this.f7672F, cardata.m1717E());
        m3919z(this.f7673G, cardata.m1718F());
        m3912p();
        m3911o();
        m3909m();
        TextView textView12 = this.f7675I;
        Context context = this.f7697c;
        if (textView12 != null) {
            textView12.setText(AbstractC1372y1.m3307m(context));
        }
        boolean z4 = cfgdata.f2569S2;
        m3892y(this.f7731t, z4);
        m3892y(this.f7733u, z4);
        boolean z5 = cfgdata.f2577U2;
        boolean z6 = cfgdata.f2573T2;
        int i4 = (z5 || z6) ? 8 : 4;
        TextView textView13 = this.f7735v;
        if (textView13 != null) {
            textView13.setVisibility(z5 ? 0 : i4);
        }
        TextView textView14 = this.f7737w;
        if (textView14 != null) {
            textView14.setVisibility(z5 ? 0 : i4);
        }
        TextView textView15 = this.f7739x;
        if (textView15 != null) {
            textView15.setVisibility(z6 ? 0 : i4);
        }
        TextView textView16 = this.f7741y;
        if (textView16 != null) {
            if (z6) {
                i4 = 0;
            }
            textView16.setVisibility(i4);
        }
        TextView textView17 = this.f7739x;
        if (textView17 != null) {
            ViewGroup.LayoutParams layoutParams = textView17.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int round = z5 ? Math.round(context.getResources().getDisplayMetrics().density * 12.0f) : 0;
                if (marginLayoutParams.getMarginStart() != round) {
                    marginLayoutParams.setMarginStart(round);
                    this.f7739x.setLayoutParams(marginLayoutParams);
                }
            }
        }
        boolean z7 = cfgdata.useJourneyFuel;
        m3892y(this.f7715l, z7);
        m3892y(this.f7717m, z7);
        m3892y(this.f7719n, z7);
    }

    /* renamed from: l */
    public final void m3908l(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f7699d;
        if (!cfgdata.f2537K2) {
            ImageView imageView2 = this.f7685S;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView2 = this.f7686T;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            ImageView imageView3 = this.f7687U;
            if (imageView3 != null) {
                imageView3.setVisibility(4);
                return;
            }
            return;
        }
        byte b2 = (byte) (i & 15);
        byte b3 = (byte) ((i >> 4) & Function.USE_VARARGS);
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        if (enumC1457c == EnumC1457c.H3_Premium || enumC1457c == EnumC1457c.H7_Premium || enumC1457c == EnumC1457c.H9_Elite || enumC1457c == EnumC1457c.F7_Elite) {
            b3 = 1;
            b2 = 1;
        }
        if (b2 == 1) {
            ImageView imageView4 = this.f7685S;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            TextView textView3 = this.f7686T;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        } else if (b2 == 2) {
            ImageView imageView5 = this.f7685S;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                this.f7685S.setColorFilter(-7829368);
            }
            TextView textView4 = this.f7686T;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (b2 == 3) {
            ImageView imageView6 = this.f7685S;
            if (imageView6 != null) {
                imageView6.setVisibility(0);
                this.f7685S.setColorFilter(-16711936);
            }
            TextView textView5 = this.f7686T;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
        if (this.f7701e.m1747f() < 20 && (textView = this.f7686T) != null) {
            textView.setVisibility(4);
        }
        if (b3 == 1) {
            ImageView imageView7 = this.f7687U;
            if (imageView7 != null) {
                imageView7.setVisibility(4);
                return;
            }
            return;
        }
        if (b3 == 2) {
            ImageView imageView8 = this.f7687U;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
                this.f7687U.setColorFilter(-7829368);
                return;
            }
            return;
        }
        if (b3 != 3 || (imageView = this.f7687U) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f7687U.setColorFilter(-16711936);
    }

    /* renamed from: m */
    public final void m3909m() {
        TextView textView = this.f7674H;
        if (textView == null) {
            return;
        }
        if (!this.f7699d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7701e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7674H.setVisibility(4);
            return;
        }
        this.f7674H.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7674H, -7829368, -995120), 0, replace.length(), 33);
        this.f7674H.setText(spannableString);
    }

    /* renamed from: n */
    public final void m3910n(C0636d c0636d) {
        this.f7698c0 = c0636d != null ? c0636d : C0636d.f2994j;
        View view = this.f7688V;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        TextView textView = this.f7690X;
        if (textView != null) {
            String str = this.f7698c0.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7691Y;
        if (textView2 != null) {
            String str2 = this.f7698c0.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            TextView textView3 = this.f7691Y;
            String str3 = this.f7698c0.f2997c;
            textView3.setVisibility((str3 == null || str3.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7689W;
        if (imageView != null) {
            Bitmap bitmap = this.f7698c0.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7689W.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7689W.setVisibility(8);
            }
        }
        C0636d c0636d2 = this.f7698c0;
        this.f7702e0 = c0636d2.f3002h;
        this.f7700d0 = c0636d2.f3001g;
        this.f7704f0 = c0636d2.f3000f;
        this.f7706g0 = SystemClock.elapsedRealtime();
        m3900b(this.f7700d0);
        m3901c();
    }

    /* renamed from: o */
    public final void m3911o() {
        ImageView imageView = this.f7678L;
        carData cardata = this.f7701e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7679M != null) {
            this.f7679M.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7679M.setColorFilter(cardata.m1713A() ? -256 : -995120);
        }
    }

    /* renamed from: p */
    public final void m3912p() {
        if (this.f7676J == null) {
            return;
        }
        float m1773s = this.f7701e.m1773s();
        if (m1773s < -90.0f) {
            this.f7676J.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        spannableString.setSpan(AbstractC0062j.m155i(this.f7676J, -7829368, -995120), 0, replace.length(), 33);
        this.f7676J.setText(spannableString);
    }

    /* renamed from: q */
    public final void m3913q() {
        if (this.f7683Q == null) {
            return;
        }
        float max = Math.max(0.0f, this.f7701e.m1779y() / 1000.0f);
        TextView textView = this.f7683Q;
        cfgData cfgdata = this.f7699d;
        textView.setTextColor(max > cfgdata.f2576U1 ? -65536 : max > cfgdata.f2572T1 ? -256 : m3906h(-995120));
        this.f7683Q.setText(AbstractC1256E0.m2986A(max));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0019, code lost:
    
        if (r0 > 8.5f) goto L7;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3914r() {
        if (this.f7680N == null) {
            return;
        }
        float m1779y = this.f7701e.m1779y() / 1000.0f;
        float f2 = m1779y >= 0.0f ? 8.5f : 0.0f;
        m1779y = f2;
        this.f7680N.setValue(m1779y);
        Theme43F1RailGuideView theme43F1RailGuideView = this.f7680N;
        cfgData cfgdata = this.f7699d;
        theme43F1RailGuideView.setFillColor(m1779y > cfgdata.f2576U1 ? -65536 : m1779y > cfgdata.f2572T1 ? -256 : -1607234561);
        Theme43F1RailGuideView theme43F1RailGuideView2 = this.f7680N;
        theme43F1RailGuideView2.setLabelColor(m3906h(theme43F1RailGuideView2.getBaseLabelColor()));
    }

    /* renamed from: s */
    public final void m3915s() {
        if (this.f7681O == null) {
            return;
        }
        float m1780z = this.f7701e.m1780z();
        float f2 = 0.0f;
        cfgData cfgdata = this.f7699d;
        float f3 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        if (f3 >= 0.0f) {
            f2 = 230.0f;
            if (f3 <= 230.0f) {
                f2 = f3;
            }
        }
        this.f7681O.setValue(f2);
        this.f7681O.setFillColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1325434342);
        Theme43F1RailGuideView theme43F1RailGuideView = this.f7681O;
        theme43F1RailGuideView.setLabelColor(m3906h(theme43F1RailGuideView.getBaseLabelColor()));
    }

    /* renamed from: t */
    public final void m3916t() {
        if (this.f7682P == null) {
            return;
        }
        float m1780z = this.f7701e.m1780z();
        cfgData cfgdata = this.f7699d;
        float f2 = m1780z >= 0.0f ? cfgdata.f2702u3 * m1780z : 0.0f;
        this.f7682P.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : m3906h(-995120));
        this.f7682P.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)));
    }

    /* renamed from: u */
    public final void m3917u() {
        this.f7703f.removeCallbacks(this.f7730s0);
        ValueAnimator valueAnimator = this.f7726q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7726q0 = null;
        }
        this.f7728r0 = false;
        this.f7734u0 = 0.0f;
        AbstractC1372y1.m3287R(false, false);
        m3898F();
    }

    /* renamed from: x */
    public final void m3918x(float f2) {
        TextView textView = this.f7683Q;
        if (textView != null) {
            textView.setVisibility(f2 > 0.01f ? 0 : 4);
            this.f7683Q.setAlpha(f2);
        }
        TextView textView2 = this.f7684R;
        if (textView2 != null) {
            textView2.setVisibility(f2 > 0.01f ? 0 : 4);
            this.f7684R.setAlpha(f2);
        }
        float f3 = this.f7699d.f2581V2 ? f2 : 0.0f;
        m3891w(this.f7677K, f3);
        m3891w(this.f7670D, f3);
        m3891w(this.f7671E, f3);
        m3891w(this.f7672F, f3);
        m3891w(this.f7673G, f3);
        this.f7708h0 = f2;
        m3901c();
    }

    /* renamed from: z */
    public final void m3919z(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        if (f2 == -99.0f || f2 == 3.5f) {
            textView.setText("--");
            textView.setTextColor(-16776961);
        } else {
            textView.setText(String.format(Locale.ENGLISH, f2 > 10.0f ? "%.0f" : "%.1f", Float.valueOf(f2)).replace(",", "."));
            float f3 = this.f7699d.f2580V1;
            textView.setTextColor(f2 < 0.95f * f3 ? -65536 : f2 < f3 ? -256 : -995120);
        }
    }
}
