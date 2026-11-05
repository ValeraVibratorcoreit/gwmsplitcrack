package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
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
import com.altaysoft.t500_split.p061ip.Theme43F1RailGuideView;
import com.altaysoft.t500_split.p061ip.Theme44BarView;
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

/* renamed from: u0.V */
/* loaded from: classes.dex */
public final class C1509V {

    /* renamed from: D0 */
    public static final ColorMatrixColorFilter f7886D0;

    /* renamed from: A */
    public Theme44BarView f7887A;

    /* renamed from: B */
    public TextView f7889B;

    /* renamed from: C */
    public TextView f7891C;

    /* renamed from: D */
    public TextView f7893D;

    /* renamed from: E */
    public TextView f7894E;

    /* renamed from: F */
    public TextView f7895F;

    /* renamed from: G */
    public TextView f7896G;

    /* renamed from: H */
    public TextView f7897H;

    /* renamed from: I */
    public TextView f7898I;

    /* renamed from: J */
    public TextView f7899J;

    /* renamed from: K */
    public ImageView f7900K;

    /* renamed from: L */
    public ImageView f7901L;

    /* renamed from: M */
    public ImageView f7902M;

    /* renamed from: N */
    public Theme43F1RailGuideView f7903N;

    /* renamed from: O */
    public Theme43F1RailGuideView f7904O;

    /* renamed from: P */
    public TextView f7905P;

    /* renamed from: Q */
    public TextView f7906Q;

    /* renamed from: R */
    public TextView f7907R;

    /* renamed from: S */
    public ImageView f7908S;

    /* renamed from: T */
    public TextView f7909T;

    /* renamed from: U */
    public ImageView f7910U;

    /* renamed from: V */
    public View f7911V;

    /* renamed from: W */
    public ImageView f7912W;

    /* renamed from: X */
    public TextView f7913X;

    /* renamed from: Y */
    public TextView f7914Y;

    /* renamed from: Z */
    public TextView f7915Z;

    /* renamed from: a */
    public final C1537g f7916a;

    /* renamed from: a0 */
    public TextView f7917a0;

    /* renamed from: b */
    public final View f7918b;

    /* renamed from: b0 */
    public ProgressBar f7919b0;

    /* renamed from: c */
    public final Context f7920c;

    /* renamed from: d0 */
    public long f7923d0;

    /* renamed from: e0 */
    public long f7925e0;

    /* renamed from: f0 */
    public boolean f7927f0;

    /* renamed from: g */
    public ViewGroup f7928g;

    /* renamed from: g0 */
    public long f7929g0;

    /* renamed from: h */
    public View f7930h;

    /* renamed from: i */
    public TextView f7932i;

    /* renamed from: i0 */
    public float f7933i0;

    /* renamed from: j */
    public TextView f7934j;

    /* renamed from: j0 */
    public float f7935j0;

    /* renamed from: k */
    public Theme44BarView f7936k;

    /* renamed from: k0 */
    public float f7937k0;

    /* renamed from: l */
    public TextView f7938l;

    /* renamed from: l0 */
    public long f7939l0;

    /* renamed from: m */
    public TextView f7940m;

    /* renamed from: m0 */
    public View f7941m0;

    /* renamed from: n */
    public TextView f7942n;

    /* renamed from: n0 */
    public C1531e f7943n0;

    /* renamed from: o */
    public TextView f7944o;

    /* renamed from: o0 */
    public C1525c f7945o0;

    /* renamed from: p */
    public TextView f7946p;

    /* renamed from: p0 */
    public C1521a1 f7947p0;

    /* renamed from: q */
    public TextView f7948q;

    /* renamed from: q0 */
    public ValueAnimator f7949q0;

    /* renamed from: r */
    public Theme44BarView f7950r;

    /* renamed from: r0 */
    public boolean f7951r0;

    /* renamed from: s */
    public TextView f7952s;

    /* renamed from: t */
    public TextView f7954t;

    /* renamed from: u */
    public TextView f7956u;

    /* renamed from: u0 */
    public float f7957u0;

    /* renamed from: v */
    public TextView f7958v;

    /* renamed from: w */
    public TextView f7960w;

    /* renamed from: w0 */
    public boolean f7961w0;

    /* renamed from: x */
    public TextView f7962x;

    /* renamed from: x0 */
    public boolean f7963x0;

    /* renamed from: y */
    public TextView f7964y;

    /* renamed from: y0 */
    public float f7965y0;

    /* renamed from: z */
    public TextView f7966z;

    /* renamed from: d */
    public final cfgData f7922d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f7924e = carData.getInstance();

    /* renamed from: f */
    public final Handler f7926f = new Handler(Looper.getMainLooper());

    /* renamed from: c0 */
    public C0636d f7921c0 = C0636d.f2994j;

    /* renamed from: h0 */
    public float f7931h0 = 1.0f;

    /* renamed from: s0 */
    public final RunnableC1500Q f7953s0 = new RunnableC1500Q(this, 5);

    /* renamed from: t0 */
    public boolean f7955t0 = false;

    /* renamed from: v0 */
    public boolean f7959v0 = true;

    /* renamed from: z0 */
    public int f7967z0 = 999;

    /* renamed from: A0 */
    public final ViewOnLayoutChangeListenerC0147a f7888A0 = new ViewOnLayoutChangeListenerC0147a(3, this);

    /* renamed from: B0 */
    public final RunnableC1507U f7890B0 = new RunnableC1507U(this, 0);

    /* renamed from: C0 */
    public final RunnableC1507U f7892C0 = new RunnableC1507U(this, 1);

    static {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        f7886D0 = new ColorMatrixColorFilter(colorMatrix);
    }

    public C1509V(C1537g c1537g, View view) {
        this.f7916a = c1537g;
        this.f7918b = view;
        this.f7920c = view.getContext();
    }

    /* renamed from: i */
    public static String m4050i(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: j */
    public static RectF m4051j(int i, int i2) {
        RectF m4206a0 = AbstractC1539g1.m4206a0(AbstractC1539g1.m4238t(), i, i2);
        if (m4206a0.width() > 0.0f && m4206a0.height() > 0.0f) {
            float f2 = i2 - 20.0f;
            m4206a0.set(m4206a0.left, f2 - Math.max(0.0f, m4206a0.height() - 30.0f), m4206a0.right, f2);
        }
        return m4206a0;
    }

    /* renamed from: w */
    public static void m4052w(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        textView.setText(f2 > 0.0f ? String.format(Locale.ENGLISH, "%.1f L", Float.valueOf(f2)) : "-.- L");
    }

    /* renamed from: x */
    public static void m4053x(View view, float f2) {
        if (view == null) {
            return;
        }
        view.setVisibility(f2 > 0.01f ? 0 : 4);
        view.setAlpha(f2);
    }

    /* renamed from: z */
    public static void m4054z(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: A */
    public final void m4055A(TextView textView, float f2) {
        if (textView == null) {
            return;
        }
        if (f2 == -99.0f || f2 == 3.5f) {
            textView.setText("--");
            textView.setTextColor(-16776961);
        } else {
            textView.setText(String.format(Locale.ENGLISH, f2 > 10.0f ? "%.0f" : "%.1f", Float.valueOf(f2)).replace(",", "."));
            float f3 = this.f7922d.f2580V1;
            textView.setTextColor(f2 < 0.95f * f3 ? -65536 : f2 < f3 ? -256 : -1513240);
        }
    }

    /* renamed from: B */
    public final void m4056B() {
        View view = this.f7918b;
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.theme_44_root);
        this.f7928g = viewGroup;
        AbstractC1539g1.m4207b(viewGroup);
        float dimension = this.f7920c.getResources().getDimension(R.dimen.theme_44_bottom_panel_height) + 10.0f;
        AbstractC1539g1.m4217g(view.findViewById(R.id.theme_44_bottom_panel_left), dimension);
        AbstractC1539g1.m4217g(view.findViewById(R.id.theme_44_bottom_panel_right), dimension);
        this.f7930h = view.findViewById(R.id.theme_44_top_panel);
        this.f7932i = (TextView) view.findViewById(R.id.theme_44_inst_fuel);
        this.f7934j = (TextView) view.findViewById(R.id.theme_44_inst_fuel_sub);
        Theme44BarView theme44BarView = (Theme44BarView) view.findViewById(R.id.theme_44_inst_fuel_bar);
        this.f7936k = theme44BarView;
        if (theme44BarView != null) {
            theme44BarView.setMax(299);
        }
        this.f7938l = (TextView) view.findViewById(R.id.theme_44_lbl_avg_jour);
        this.f7940m = (TextView) view.findViewById(R.id.theme_44_avg_jour);
        this.f7942n = (TextView) view.findViewById(R.id.theme_44_avg_jour_sub);
        this.f7944o = (TextView) view.findViewById(R.id.theme_44_avg_total);
        this.f7946p = (TextView) view.findViewById(R.id.theme_44_fuel);
        this.f7948q = (TextView) view.findViewById(R.id.theme_44_fuel_liters);
        this.f7950r = (Theme44BarView) view.findViewById(R.id.theme_44_fuel_bar);
        this.f7952s = (TextView) view.findViewById(R.id.theme_44_remain);
        this.f7954t = (TextView) view.findViewById(R.id.theme_44_odo_label);
        this.f7956u = (TextView) view.findViewById(R.id.theme_44_odo_total);
        this.f7958v = (TextView) view.findViewById(R.id.theme_44_odo_day_label);
        this.f7960w = (TextView) view.findViewById(R.id.theme_44_odo_day);
        this.f7962x = (TextView) view.findViewById(R.id.theme_44_odo_trip_label);
        TextView textView = (TextView) view.findViewById(R.id.theme_44_odo_trip);
        this.f7964y = textView;
        TextView textView2 = this.f7956u;
        TextView textView3 = this.f7960w;
        AbstractC1539g1.m4219h(textView2, "888888");
        AbstractC1539g1.m4227l(textView3);
        AbstractC1539g1.m4219h(textView, "888888");
        AbstractC1539g1.m4219h(this.f7944o, "88.8 L");
        AbstractC1539g1.m4227l(this.f7940m);
        AbstractC1539g1.m4229m(this.f7932i, "88.8 L");
        AbstractC1539g1.m4227l(this.f7952s);
        this.f7966z = (TextView) view.findViewById(R.id.theme_44_coolant);
        this.f7887A = (Theme44BarView) view.findViewById(R.id.theme_44_coolant_bar);
        this.f7889B = (TextView) view.findViewById(R.id.theme_44_battery);
        this.f7891C = (TextView) view.findViewById(R.id.theme_44_hv);
        this.f7893D = (TextView) view.findViewById(R.id.theme_44_wheel_fl);
        this.f7894E = (TextView) view.findViewById(R.id.theme_44_wheel_fr);
        this.f7895F = (TextView) view.findViewById(R.id.theme_44_wheel_rl);
        this.f7896G = (TextView) view.findViewById(R.id.theme_44_wheel_rr);
        this.f7900K = (ImageView) view.findViewById(R.id.theme_44_tires_car);
        this.f7897H = (TextView) view.findViewById(R.id.theme_44_gear);
        this.f7898I = (TextView) view.findViewById(R.id.theme_44_clock);
        this.f7899J = (TextView) view.findViewById(R.id.theme_44_out_temp);
        this.f7901L = (ImageView) view.findViewById(R.id.theme_44_wifi);
        this.f7902M = (ImageView) view.findViewById(R.id.theme_44_inet);
        this.f7903N = (Theme43F1RailGuideView) view.findViewById(R.id.theme_44_rpm_rail);
        Theme43F1RailGuideView theme43F1RailGuideView = (Theme43F1RailGuideView) view.findViewById(R.id.theme_44_spd_rail);
        this.f7904O = theme43F1RailGuideView;
        if (this.f7903N != null && theme43F1RailGuideView != null) {
            ViewOnLayoutChangeListenerC0147a viewOnLayoutChangeListenerC0147a = this.f7888A0;
            theme43F1RailGuideView.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0147a);
            this.f7903N.addOnLayoutChangeListener(viewOnLayoutChangeListenerC0147a);
            view.post(new RunnableC1500Q(this, 1));
        }
        this.f7905P = (TextView) view.findViewById(R.id.theme_44_spd_value);
        this.f7906Q = (TextView) view.findViewById(R.id.theme_44_rpm_value);
        this.f7907R = (TextView) view.findViewById(R.id.theme_44_rpm_unit);
        this.f7908S = (ImageView) view.findViewById(R.id.theme_44_cruise);
        this.f7909T = (TextView) view.findViewById(R.id.theme_44_cruise_speed);
        this.f7910U = (ImageView) view.findViewById(R.id.theme_44_lane);
        View findViewById = view.findViewById(R.id.theme_44_media_wrap);
        this.f7911V = findViewById;
        AbstractC0641i.m1886c(findViewById);
        this.f7912W = (ImageView) view.findViewById(R.id.theme_44_media_art);
        this.f7913X = (TextView) view.findViewById(R.id.theme_44_media_title);
        this.f7914Y = (TextView) view.findViewById(R.id.theme_44_media_artist);
        this.f7915Z = (TextView) view.findViewById(R.id.theme_44_media_elapsed);
        this.f7917a0 = (TextView) view.findViewById(R.id.theme_44_media_total);
        this.f7919b0 = (ProgressBar) view.findViewById(R.id.theme_44_media_bar);
        ImageView imageView = this.f7912W;
        if (imageView != null) {
            imageView.setColorFilter(f7886D0);
        }
        this.f7941m0 = view.findViewById(R.id.theme_44_navi_hole);
        TextView textView4 = (TextView) view.findViewById(R.id.theme_44_free_mem);
        Handler handler = this.f7926f;
        this.f7943n0 = new C1531e(handler, textView4);
        C0043j m61g = C0043j.m61g(view, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f7916a);
        }
        m4066e();
        if (!this.f7963x0) {
            m4068g();
            this.f7963x0 = true;
        }
        ViewGroup viewGroup2 = this.f7928g;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f);
        }
        this.f7965y0 = 0.0f;
        cfgData cfgdata = this.f7922d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f7959v0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4067f();
        this.f7961w0 = true;
        handler.post(this.f7892C0);
        handler.post(this.f7890B0);
        this.f7943n0.m4171b();
        carData cardata = this.f7924e;
        m4071l(cardata.m1745e());
        int m1747f = cardata.m1747f();
        TextView textView5 = this.f7909T;
        if (textView5 != null) {
            textView5.setText(String.valueOf(m1747f));
        }
        m4071l(cardata.m1745e());
        m4061G();
        m4070k();
        m4073n(C0639g.m1872x().m1880u());
    }

    /* renamed from: C */
    public final void m4057C(float f2, float f3, RunnableC1500Q runnableC1500Q) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f7949q0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f7949q0);
        this.f7949q0.addUpdateListener(new C0174W(8, this));
        this.f7949q0.addListener(new C0181b0(this, 6, runnableC1500Q));
        this.f7949q0.start();
    }

    /* renamed from: D */
    public final void m4058D(String str) {
        Context context = this.f7920c;
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

    /* renamed from: E */
    public final void m4059E() {
        this.f7926f.removeCallbacks(this.f7953s0);
        ValueAnimator valueAnimator = this.f7949q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7949q0 = null;
        }
        if (!this.f7951r0 && AbstractC1372y1.m3272C()) {
            m4080u();
            return;
        }
        if (!this.f7951r0) {
            this.f7951r0 = true;
            AbstractC1372y1.m3287R(true, true);
            this.f7957u0 = 0.0f;
            m4061G();
            m4057C(0.0f, 1.0f, null);
            return;
        }
        float f2 = this.f7957u0;
        if (f2 > 0.0f) {
            m4057C(f2, 0.0f, new RunnableC1500Q(this, 6));
            return;
        }
        this.f7951r0 = false;
        AbstractC1372y1.m3287R(false, true);
        m4061G();
    }

    /* renamed from: F */
    public final void m4060F(RectF rectF, float f2) {
        ViewGroup viewGroup = this.f7928g;
        if (viewGroup == null) {
            return;
        }
        viewGroup.getOverlay().clear();
        cfgData cfgdata = this.f7922d;
        if (!cfgdata.f2537K2 || !this.f7959v0 || AbstractC1539g1.m4194P(cfgdata, this.f7924e) || rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        if (this.f7947p0 == null) {
            this.f7947p0 = new C1521a1();
        }
        this.f7947p0.setBounds(0, 0, this.f7928g.getWidth(), this.f7928g.getHeight());
        this.f7947p0.m4155a(rectF, f2, 0.0f, AbstractC0001b.m3a(this.f7920c, R.color.ip_theme_44_border), 10.0f, 7.0f);
        this.f7928g.getOverlay().add(this.f7947p0);
    }

    /* renamed from: G */
    public final void m4061G() {
        ViewGroup viewGroup = this.f7928g;
        if (viewGroup == null || this.f7945o0 == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7928g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7928g.post(new RunnableC1500Q(this, 4));
            return;
        }
        float f2 = this.f7920c.getResources().getDisplayMetrics().density;
        float f3 = 14.0f * f2;
        this.f7945o0.m4160b();
        RectF m4051j = m4051j(width, height);
        if (m4051j.width() <= 0.0f || m4051j.height() <= 0.0f) {
            m4060F(null, 0.0f);
        } else {
            this.f7945o0.m4159a(m4051j.left, m4051j.top, m4051j.right, m4051j.bottom, f3, 0.0f);
            m4060F(m4051j, f3);
        }
        if (this.f7951r0 || this.f7957u0 > 0.0f) {
            AbstractC1539g1.m4205a(this.f7945o0, width, height, f2, this.f7957u0, 0.0f);
        }
        boolean z2 = this.f7951r0;
        if (!z2 && this.f7957u0 <= 0.0f) {
            m4082y(1.0f);
        } else if (!z2 || this.f7957u0 < 1.0f) {
            m4082y(z2 ? 1.0f - this.f7957u0 : this.f7957u0);
        } else {
            m4082y(0.0f);
        }
        this.f7928g.invalidate();
    }

    /* renamed from: a */
    public final void m4062a() {
        Theme43F1RailGuideView theme43F1RailGuideView;
        float m1827d;
        if (this.f7903N == null || (theme43F1RailGuideView = this.f7904O) == null || theme43F1RailGuideView.getWidth() <= 0 || this.f7903N.getWidth() <= 0) {
            return;
        }
        Theme43F1RailGuideView theme43F1RailGuideView2 = this.f7904O;
        int width = theme43F1RailGuideView2.getWidth();
        if (width <= 0) {
            m1827d = 0.0f;
        } else {
            float strokeWidth = theme43F1RailGuideView2.f2872h.getStrokeWidth() * 0.5f;
            m1827d = theme43F1RailGuideView2.m1827d(strokeWidth, width - (2.0f * strokeWidth));
        }
        this.f7903N.setHorizontalEndX((((this.f7904O.getTranslationX() + this.f7904O.getLeft()) + m1827d) - this.f7903N.getLeft()) - this.f7903N.getTranslationX());
    }

    /* renamed from: b */
    public final void m4063b(long j2) {
        boolean z2 = this.f7925e0 > 0;
        ProgressBar progressBar = this.f7919b0;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7919b0.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f7925e0)));
            }
        }
        TextView textView = this.f7915Z;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7915Z.setText(m4050i(j2));
            }
        }
        TextView textView2 = this.f7917a0;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 4);
            if (z2) {
                this.f7917a0.setText(m4050i(this.f7925e0));
            }
        }
    }

    /* renamed from: c */
    public final void m4064c() {
        C0636d c0636d;
        if (this.f7911V == null) {
            return;
        }
        this.f7911V.setVisibility(this.f7922d.f2585W2 && (c0636d = this.f7921c0) != null && c0636d.m1851a() && (this.f7931h0 > 0.01f ? 1 : (this.f7931h0 == 0.01f ? 0 : -1)) > 0 ? 0 : 8);
        this.f7911V.setAlpha(this.f7931h0);
    }

    /* renamed from: d */
    public final void m4065d() {
        ViewGroup viewGroup;
        if (this.f7941m0 == null || (viewGroup = this.f7928g) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f7928g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f7928g.post(new RunnableC1500Q(this, 2));
            return;
        }
        if (this.f7941m0.getLayoutParams() instanceof C1592d) {
            RectF m4051j = m4051j(width, height);
            C1592d c1592d = (C1592d) this.f7941m0.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4051j.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4051j.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4051j.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4051j.top);
            this.f7941m0.setLayoutParams(c1592d);
            this.f7918b.post(new RunnableC1500Q(this, 3));
        }
    }

    /* renamed from: e */
    public final void m4066e() {
        if (this.f7928g == null) {
            return;
        }
        C1525c c1525c = this.f7945o0;
        Context context = this.f7920c;
        if (c1525c == null) {
            C1525c c1525c2 = new C1525c(-16777216);
            this.f7945o0 = c1525c2;
            c1525c2.m4164f(AbstractC0001b.m3a(context, R.color.ip_theme_44_border));
        }
        this.f7945o0.m4163e(AbstractC0000a.m1b(context, R.drawable.ip_theme_44_bg));
        this.f7928g.setLayerType(1, null);
        this.f7928g.setBackground(this.f7945o0);
        m4065d();
        m4061G();
        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, this.f7930h, AbstractC1539g1.m4230m0(this.f7922d, this.f7924e));
    }

    /* renamed from: f */
    public final void m4067f() {
        ViewGroup viewGroup = this.f7928g;
        if (viewGroup == null) {
            return;
        }
        AbstractC1539g1.m4228l0(viewGroup, !this.f7959v0);
        if (this.f7922d.f2537K2 && this.f7959v0) {
            this.f7928g.setVisibility(0);
            m4071l(this.f7924e.m1745e());
        } else {
            m4080u();
            this.f7928g.setVisibility(4);
            ImageView imageView = this.f7908S;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
            TextView textView = this.f7909T;
            if (textView != null) {
                textView.setVisibility(4);
            }
            ImageView imageView2 = this.f7910U;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
        m4061G();
    }

    /* renamed from: g */
    public final void m4068g() {
        final RunnableC1500Q runnableC1500Q = new RunnableC1500Q(this, 0);
        final int i = 0;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        };
        carData cardata = this.f7924e;
        C1537g c1537g = this.f7916a;
        cardata.m1742c0(c1537g, interfaceC0561z);
        final int i2 = 2;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i3 = 3;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i4 = 4;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i5 = 6;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i6 = 7;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i7 = 8;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i8 = 9;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i9 = 10;
        cardata.m1764n0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i10 = 1;
        cardata.m1766o0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i11 = 5;
        cardata.m1768p0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i12 = 11;
        cardata.m1770q0(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i13 = 12;
        cardata.m1731T(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i14 = 13;
        cardata.m1720I(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i15 = 14;
        cardata.m1719H(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i15) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i16 = 15;
        cardata.m1721J(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i16) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i17 = 16;
        cardata.m1728Q(c1537g, new InterfaceC0561z() { // from class: u0.T
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i17) {
                    case 0:
                        runnableC1500Q.run();
                        break;
                    case 1:
                        runnableC1500Q.run();
                        break;
                    case 2:
                        runnableC1500Q.run();
                        break;
                    case 3:
                        runnableC1500Q.run();
                        break;
                    case 4:
                        runnableC1500Q.run();
                        break;
                    case 5:
                        runnableC1500Q.run();
                        break;
                    case 6:
                        runnableC1500Q.run();
                        break;
                    case 7:
                        runnableC1500Q.run();
                        break;
                    case 8:
                        runnableC1500Q.run();
                        break;
                    case Platform.GNU /* 9 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.NETBSD /* 11 */:
                        runnableC1500Q.run();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        runnableC1500Q.run();
                        break;
                    case 13:
                        runnableC1500Q.run();
                        break;
                    case 14:
                        runnableC1500Q.run();
                        break;
                    case 15:
                        runnableC1500Q.run();
                        break;
                    default:
                        runnableC1500Q.run();
                        break;
                }
            }
        });
        final int i18 = 16;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i19 = 0;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i20 = 1;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i21 = 2;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i22 = 3;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i23 = 4;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f7920c);
        final int i24 = 5;
        cardata.m1754i0(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i25 = 6;
        cardata.m1750g0(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i26 = 7;
        cardata.m1726O(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i27 = 8;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i28 = 9;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i29 = 10;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i30 = 11;
        cardata.m1732U(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i31 = 12;
        cardata.m1733V(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i32 = 13;
        cardata.m1762m0(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i33 = 14;
        cardata.m1729R(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
        final int i34 = 15;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.S

            /* renamed from: b */
            public final /* synthetic */ C1509V f7755b;

            {
                this.f7755b = this;
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
                        this.f7755b.m4074o();
                        break;
                    case 1:
                        this.f7755b.m4074o();
                        break;
                    case 2:
                        this.f7755b.m4074o();
                        break;
                    case 3:
                        Integer num = (Integer) obj;
                        C1509V c1509v = this.f7755b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1509v.getClass();
                            intValue = num.intValue();
                        }
                        if (c1509v.f7967z0 > -1 && intValue == -1) {
                            AbstractC1372y1.m3306l();
                            Context context = c1509v.f7920c;
                            C1311e0.m3165d(context).m3171e();
                            AbstractC1294Y.m3153e(context);
                            cfgData cfgdata = c1509v.f7922d;
                            if (cfgdata.f2537K2) {
                                c1509v.f7965y0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1509v.f7967z0 == -1 && intValue > -1) {
                            c1509v.f7965y0 = 0.0f;
                            ViewGroup viewGroup2 = c1509v.f7928g;
                            if (viewGroup2 != null) {
                                viewGroup2.animate().cancel();
                                c1509v.f7928g.setAlpha(1.0f);
                            }
                            c1509v.m4058D("ip");
                        }
                        c1509v.f7967z0 = intValue;
                        c1509v.m4072m();
                        break;
                    case 4:
                        this.f7755b.m4072m();
                        break;
                    case 5:
                        C1509V c1509v2 = this.f7755b;
                        c1509v2.m4079t();
                        c1509v2.m4078s();
                        break;
                    case 6:
                        C1509V c1509v3 = this.f7755b;
                        c1509v3.m4076q();
                        c1509v3.m4077r();
                        break;
                    case 7:
                        C1509V c1509v4 = this.f7755b;
                        c1509v4.m4079t();
                        c1509v4.m4078s();
                        c1509v4.m4076q();
                        c1509v4.m4077r();
                        break;
                    case 8:
                        C1509V c1509v5 = this.f7755b;
                        Integer num2 = (Integer) obj;
                        c1509v5.getClass();
                        if (num2 != null && num2.intValue() != 0) {
                            if (num2.intValue() != 16) {
                                if (num2.intValue() != 1) {
                                    if (num2.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1509v5.f7920c, num2.intValue())) {
                                            if (num2.intValue() != 6) {
                                                if (num2.intValue() != 3) {
                                                    if (num2.intValue() != 13 && num2.intValue() != 14) {
                                                        if ((num2.intValue() != 7 && num2.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num2.intValue() != 7 && num2.intValue() != 8) || !c1509v5.f7955t0 || !c1509v5.f7951r0) {
                                                                if (num2.intValue() == 9 && AbstractC1539g1.m4209c(c1509v5.f7924e)) {
                                                                    cfgData cfgdata2 = c1509v5.f7922d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1509v5.f7924e.m1760l0(z2);
                                                                    c1509v5.f7922d.m1795o(c1509v5.f7920c);
                                                                    Context context2 = c1509v5.f7920c;
                                                                    AbstractC1372y1.m3289T(context2, context2.getString(c1509v5.f7922d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1509v5.f7922d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1509v5.f7920c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1509v5.m4058D("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                Handler handler = c1509v5.f7926f;
                                                                RunnableC1500Q runnableC1500Q2 = c1509v5.f7953s0;
                                                                handler.removeCallbacks(runnableC1500Q2);
                                                                handler.postDelayed(runnableC1500Q2, 15000L);
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1509v5.f7951r0) {
                                                        c1509v5.f7955t0 = true;
                                                        ViewGroup viewGroup3 = c1509v5.f7928g;
                                                        if (viewGroup3 != null && viewGroup3.isShown() && !AbstractC1372y1.m3272C()) {
                                                            if (!c1509v5.f7951r0 && ((valueAnimator = c1509v5.f7949q0) == null || !valueAnimator.isRunning())) {
                                                                c1509v5.m4059E();
                                                            }
                                                            Handler handler2 = c1509v5.f7926f;
                                                            RunnableC1500Q runnableC1500Q3 = c1509v5.f7953s0;
                                                            handler2.removeCallbacks(runnableC1500Q3);
                                                            handler2.postDelayed(runnableC1500Q3, 15000L);
                                                            break;
                                                        }
                                                    } else if (c1509v5.f7955t0) {
                                                        Handler handler3 = c1509v5.f7926f;
                                                        RunnableC1500Q runnableC1500Q4 = c1509v5.f7953s0;
                                                        handler3.removeCallbacks(runnableC1500Q4);
                                                        handler3.postDelayed(runnableC1500Q4, 15000L);
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1509v5.f7959v0;
                                                    c1509v5.f7959v0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1509v5.m4067f();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1509v5.f7920c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1509v5.f7922d.f2672o3) {
                                                    Context context3 = c1509v5.f7920c;
                                                    AbstractC1372y1.m3289T(context3, context3.getString(R.string.msgSplitRecovery));
                                                    c1509v5.m4058D("ip_rest");
                                                    break;
                                                } else {
                                                    c1509v5.m4058D("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1509v5.f7924e.m1714B()) {
                                        if (!AbstractC1372y1.f6437g) {
                                            cfgData cfgdata3 = c1509v5.f7922d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1509v5.f7920c, m3282M[0], m3282M[1], 0.9f, cfgdata3.f2657l3);
                                            break;
                                        } else {
                                            AbstractC1372y1.m3305k(c1509v5.f7920c);
                                            break;
                                        }
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1509v5.f7928g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1509v5.f7949q0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1509v5.f7955t0 = false;
                                        c1509v5.m4059E();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1509v5.f7920c);
                                break;
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        Integer num3 = (Integer) obj;
                        C1509V c1509v6 = this.f7755b;
                        if (num3 == null) {
                            intValue2 = 0;
                        } else {
                            c1509v6.getClass();
                            intValue2 = num3.intValue();
                        }
                        c1509v6.m4071l(intValue2);
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1509V c1509v7 = this.f7755b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1509v7.getClass();
                            intValue3 = num4.intValue();
                        }
                        TextView textView = c1509v7.f7909T;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue3));
                        }
                        c1509v7.m4071l(c1509v7.f7924e.m1745e());
                        break;
                    case Platform.NETBSD /* 11 */:
                        C1509V c1509v8 = this.f7755b;
                        c1509v8.m4061G();
                        c1509v8.m4064c();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        C1509V c1509v9 = this.f7755b;
                        c1509v9.getClass();
                        if (AbstractC1372y1.m3272C()) {
                            c1509v9.m4080u();
                        }
                        c1509v9.m4061G();
                        c1509v9.m4064c();
                        break;
                    case 13:
                        C1509V c1509v10 = this.f7755b;
                        c1509v10.m4061G();
                        c1509v10.m4064c();
                        break;
                    case 14:
                        C1509V c1509v11 = this.f7755b;
                        AbstractC1539g1.m4225k(c1509v11.f7920c);
                        c1509v11.m4061G();
                        AbstractC1539g1.m4215f(R.drawable.ip_theme_44_top_bar, c1509v11.f7930h, AbstractC1539g1.m4230m0(c1509v11.f7922d, c1509v11.f7924e));
                        break;
                    case 15:
                        this.f7755b.m4073n((C0636d) obj);
                        break;
                    default:
                        this.f7755b.m4075p();
                        break;
                }
            }
        });
    }

    /* renamed from: h */
    public final int m4069h(int i) {
        if (!this.f7922d.f2641i2) {
            return i;
        }
        int m1753i = this.f7924e.m1753i();
        if (m1753i == 1) {
            return -1947062;
        }
        if (m1753i == 2) {
            return -12345273;
        }
        return i;
    }

    /* renamed from: k */
    public final void m4070k() {
        float max;
        float max2;
        float max3;
        AbstractC1539g1.m4228l0(this.f7928g, !this.f7959v0);
        cfgData cfgdata = this.f7922d;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f7924e;
        if (z2) {
            float f2 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            max = cfgdata.m1787f(m1775u, cardata.m1776v(), f2);
            Theme44BarView theme44BarView = this.f7950r;
            if (theme44BarView != null) {
                theme44BarView.setProgress(Math.round(m1775u * f2));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            Theme44BarView theme44BarView2 = this.f7950r;
            if (theme44BarView2 != null) {
                theme44BarView2.setProgress(Math.round(max));
            }
        }
        EnumC1457c enumC1457c2 = cfgdata.f2543M0;
        if (enumC1457c2.f7147f) {
            max2 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c2 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
        } else {
            max2 = Math.max(0.0f, cardata.m1774t());
        }
        int i = -1513240;
        int i2 = max2 < 15.0f ? -65536 : max2 < 30.0f ? -256 : -1513240;
        Theme44BarView theme44BarView3 = this.f7950r;
        if (theme44BarView3 != null) {
            theme44BarView3.setBarProgressColor(AbstractC1539g1.m4189K(max));
        }
        TextView textView = this.f7946p;
        if (textView != null) {
            textView.setText(String.format(Locale.ENGLISH, "%.0f%%", Float.valueOf(max)));
            this.f7946p.setTextColor(i2);
        }
        TextView textView2 = this.f7948q;
        if (textView2 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c3 = cfgdata.f2543M0;
            if (enumC1457c3.f7147f) {
                max3 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
            } else {
                max3 = Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h();
            }
            textView2.setText(String.format(locale, "%.0f L", Float.valueOf(max3)));
            this.f7948q.setTextColor(i2);
        }
        float m1743d = cardata.m1743d();
        Theme44BarView theme44BarView4 = this.f7887A;
        if (theme44BarView4 != null) {
            theme44BarView4.setProgress(Math.round(m1743d < 40.0f ? 0 : m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f)));
            this.f7887A.setBarProgressColor(AbstractC1539g1.m4242x(m1743d));
        }
        TextView textView3 = this.f7966z;
        if (textView3 != null) {
            if (m1743d < -90.0f) {
                textView3.setText("-- °C");
                this.f7966z.setTextColor(-1513240);
            } else {
                textView3.setText(String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d)));
                TextView textView4 = this.f7966z;
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
        TextView textView5 = this.f7952s;
        if (textView5 != null) {
            textView5.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(cardata.m1777w())));
            this.f7952s.setTextColor(-1);
        }
        float m1765o = cardata.m1765o();
        float min = m1765o > 0.0f ? Math.min(m1765o, 29.9f) : 0.0f;
        if (Math.abs(min - this.f7935j0) > 0.001f) {
            this.f7937k0 = this.f7933i0;
            this.f7935j0 = min;
            this.f7939l0 = SystemClock.elapsedRealtime();
        }
        m4076q();
        m4077r();
        m4078s();
        m4079t();
        m4052w(this.f7940m, cardata.m1739b());
        m4052w(this.f7944o, cardata.m1737a());
        TextView textView6 = this.f7889B;
        if (textView6 != null) {
            textView6.setText(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(cardata.m1741c())));
        }
        TextView textView7 = this.f7891C;
        if (textView7 != null) {
            boolean z3 = cfgdata.f2543M0.f7149h;
            textView7.setVisibility(z3 ? 0 : 4);
            if (z3) {
                TextView textView8 = this.f7891C;
                Locale locale2 = Locale.ENGLISH;
                Float valueOf = Float.valueOf(cardata.m1761m());
                EnumC1457c enumC1457c4 = cfgdata.f2543M0;
                textView8.setText(String.format(locale2, "%.1f%s", valueOf, (enumC1457c4 == EnumC1457c.T500_Urban || enumC1457c4 == EnumC1457c.T400 || enumC1457c4 == EnumC1457c.T700_100 || enumC1457c4 == EnumC1457c.T700) ? "%" : "V"));
            }
        }
        TextView textView9 = this.f7956u;
        if (textView9 != null) {
            textView9.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1771r())).replace(",", "."));
        }
        TextView textView10 = this.f7960w;
        if (textView10 != null) {
            textView10.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(",", "."));
        }
        TextView textView11 = this.f7964y;
        if (textView11 != null) {
            textView11.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1767p())).replace(",", "."));
        }
        m4055A(this.f7893D, cardata.m1715C());
        m4055A(this.f7894E, cardata.m1716D());
        m4055A(this.f7895F, cardata.m1717E());
        m4055A(this.f7896G, cardata.m1718F());
        m4075p();
        m4074o();
        m4072m();
        TextView textView12 = this.f7898I;
        Context context = this.f7920c;
        if (textView12 != null) {
            textView12.setText(AbstractC1372y1.m3307m(context));
        }
        boolean z4 = cfgdata.f2569S2;
        m4054z(this.f7954t, z4);
        m4054z(this.f7956u, z4);
        boolean z5 = cfgdata.f2577U2;
        boolean z6 = cfgdata.f2573T2;
        int i3 = (z5 || z6) ? 8 : 4;
        TextView textView13 = this.f7958v;
        if (textView13 != null) {
            textView13.setVisibility(z5 ? 0 : i3);
        }
        TextView textView14 = this.f7960w;
        if (textView14 != null) {
            textView14.setVisibility(z5 ? 0 : i3);
        }
        TextView textView15 = this.f7962x;
        if (textView15 != null) {
            textView15.setVisibility(z6 ? 0 : i3);
        }
        TextView textView16 = this.f7964y;
        if (textView16 != null) {
            if (z6) {
                i3 = 0;
            }
            textView16.setVisibility(i3);
        }
        TextView textView17 = this.f7962x;
        if (textView17 != null) {
            ViewGroup.LayoutParams layoutParams = textView17.getLayoutParams();
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int round = z5 ? Math.round(context.getResources().getDisplayMetrics().density * 12.0f) : 0;
                if (marginLayoutParams.getMarginStart() != round) {
                    marginLayoutParams.setMarginStart(round);
                    this.f7962x.setLayoutParams(marginLayoutParams);
                }
            }
        }
        boolean z7 = cfgdata.useJourneyFuel;
        m4054z(this.f7938l, z7);
        m4054z(this.f7940m, z7);
        m4054z(this.f7942n, z7);
    }

    /* renamed from: l */
    public final void m4071l(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f7922d;
        if (!cfgdata.f2537K2) {
            ImageView imageView2 = this.f7908S;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView2 = this.f7909T;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            ImageView imageView3 = this.f7910U;
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
            ImageView imageView4 = this.f7908S;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            TextView textView3 = this.f7909T;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        } else if (b2 == 2) {
            ImageView imageView5 = this.f7908S;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                this.f7908S.setColorFilter(-7829368);
            }
            TextView textView4 = this.f7909T;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (b2 == 3) {
            ImageView imageView6 = this.f7908S;
            if (imageView6 != null) {
                imageView6.setVisibility(0);
                this.f7908S.setColorFilter(-16711936);
            }
            TextView textView5 = this.f7909T;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
        if (this.f7924e.m1747f() < 20 && (textView = this.f7909T) != null) {
            textView.setVisibility(4);
        }
        if (b3 == 1) {
            ImageView imageView7 = this.f7910U;
            if (imageView7 != null) {
                imageView7.setVisibility(4);
                return;
            }
            return;
        }
        if (b3 == 2) {
            ImageView imageView8 = this.f7910U;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
                this.f7910U.setColorFilter(-7829368);
                return;
            }
            return;
        }
        if (b3 != 3 || (imageView = this.f7910U) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f7910U.setColorFilter(-16711936);
    }

    /* renamed from: m */
    public final void m4072m() {
        TextView textView = this.f7897H;
        if (textView == null) {
            return;
        }
        if (!this.f7922d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f7924e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f7897H.setVisibility(4);
            return;
        }
        this.f7897H.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f7897H, -7829368, -1513240), 0, replace.length(), 33);
        this.f7897H.setText(spannableString);
    }

    /* renamed from: n */
    public final void m4073n(C0636d c0636d) {
        this.f7921c0 = c0636d != null ? c0636d : C0636d.f2994j;
        View view = this.f7911V;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        TextView textView = this.f7913X;
        if (textView != null) {
            String str = this.f7921c0.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f7914Y;
        if (textView2 != null) {
            String str2 = this.f7921c0.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            TextView textView3 = this.f7914Y;
            String str3 = this.f7921c0.f2997c;
            textView3.setVisibility((str3 == null || str3.isEmpty()) ? 8 : 0);
        }
        ImageView imageView = this.f7912W;
        if (imageView != null) {
            Bitmap bitmap = this.f7921c0.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f7912W.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f7912W.setVisibility(8);
            }
        }
        C0636d c0636d2 = this.f7921c0;
        this.f7925e0 = c0636d2.f3002h;
        this.f7923d0 = c0636d2.f3001g;
        this.f7927f0 = c0636d2.f3000f;
        this.f7929g0 = SystemClock.elapsedRealtime();
        m4063b(this.f7923d0);
        m4064c();
    }

    /* renamed from: o */
    public final void m4074o() {
        ImageView imageView = this.f7901L;
        carData cardata = this.f7924e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f7902M != null) {
            this.f7902M.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f7902M.setColorFilter(cardata.m1713A() ? -256 : -1513240);
        }
    }

    /* renamed from: p */
    public final void m4075p() {
        if (this.f7899J == null) {
            return;
        }
        float m1773s = this.f7924e.m1773s();
        if (m1773s < -90.0f) {
            this.f7899J.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        spannableString.setSpan(AbstractC0062j.m155i(this.f7899J, -7829368, -1513240), 0, replace.length(), 33);
        this.f7899J.setText(spannableString);
    }

    /* renamed from: q */
    public final void m4076q() {
        if (this.f7906Q == null) {
            return;
        }
        float max = Math.max(0.0f, this.f7924e.m1779y() / 1000.0f);
        TextView textView = this.f7906Q;
        cfgData cfgdata = this.f7922d;
        textView.setTextColor(max > cfgdata.f2576U1 ? -65536 : max > cfgdata.f2572T1 ? -256 : m4069h(-1513240));
        this.f7906Q.setText(AbstractC1256E0.m2986A(max));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0019, code lost:
    
        if (r0 > 8.5f) goto L7;
     */
    /* renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4077r() {
        if (this.f7903N == null) {
            return;
        }
        float m1779y = this.f7924e.m1779y() / 1000.0f;
        float f2 = m1779y >= 0.0f ? 8.5f : 0.0f;
        m1779y = f2;
        this.f7903N.setValue(m1779y);
        Theme43F1RailGuideView theme43F1RailGuideView = this.f7903N;
        cfgData cfgdata = this.f7922d;
        theme43F1RailGuideView.setFillColor(m1779y > cfgdata.f2576U1 ? -65536 : m1779y > cfgdata.f2572T1 ? -256 : -1601664888);
        Theme43F1RailGuideView theme43F1RailGuideView2 = this.f7903N;
        theme43F1RailGuideView2.setLabelColor(m4069h(theme43F1RailGuideView2.getBaseLabelColor()));
    }

    /* renamed from: s */
    public final void m4078s() {
        if (this.f7904O == null) {
            return;
        }
        float m1780z = this.f7924e.m1780z();
        float f2 = 0.0f;
        cfgData cfgdata = this.f7922d;
        float f3 = m1780z < 0.0f ? 0.0f : m1780z * cfgdata.f2702u3;
        if (f3 >= 0.0f) {
            f2 = 230.0f;
            if (f3 <= 230.0f) {
                f2 = f3;
            }
        }
        this.f7904O.setValue(f2);
        this.f7904O.setFillColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1331124056);
        Theme43F1RailGuideView theme43F1RailGuideView = this.f7904O;
        theme43F1RailGuideView.setLabelColor(m4069h(theme43F1RailGuideView.getBaseLabelColor()));
    }

    /* renamed from: t */
    public final void m4079t() {
        if (this.f7905P == null) {
            return;
        }
        float m1780z = this.f7924e.m1780z();
        cfgData cfgdata = this.f7922d;
        float f2 = m1780z >= 0.0f ? cfgdata.f2702u3 * m1780z : 0.0f;
        this.f7905P.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : m4069h(-1513240));
        this.f7905P.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)));
    }

    /* renamed from: u */
    public final void m4080u() {
        this.f7926f.removeCallbacks(this.f7953s0);
        ValueAnimator valueAnimator = this.f7949q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f7949q0 = null;
        }
        this.f7951r0 = false;
        this.f7957u0 = 0.0f;
        AbstractC1372y1.m3287R(false, false);
        m4061G();
    }

    /* renamed from: v */
    public final void m4081v() {
        ViewGroup viewGroup;
        if (!this.f7963x0) {
            m4068g();
            this.f7963x0 = true;
        }
        C1531e c1531e = this.f7943n0;
        if (c1531e != null) {
            c1531e.m4170a();
        }
        if (this.f7965y0 <= 0.0f && (viewGroup = this.f7928g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        cfgData cfgdata = this.f7922d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f7959v0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4066e();
        m4067f();
        m4071l(this.f7924e.m1745e());
        m4070k();
        m4073n(C0639g.m1872x().m1880u());
    }

    /* renamed from: y */
    public final void m4082y(float f2) {
        TextView textView = this.f7906Q;
        if (textView != null) {
            textView.setVisibility(f2 > 0.01f ? 0 : 4);
            this.f7906Q.setAlpha(f2);
        }
        TextView textView2 = this.f7907R;
        if (textView2 != null) {
            textView2.setVisibility(f2 > 0.01f ? 0 : 4);
            this.f7907R.setAlpha(f2);
        }
        float f3 = this.f7922d.f2581V2 ? f2 : 0.0f;
        m4053x(this.f7900K, f3);
        m4053x(this.f7893D, f3);
        m4053x(this.f7894E, f3);
        m4053x(this.f7895F, f3);
        m4053x(this.f7896G, f3);
        this.f7931h0 = f2;
        m4064c();
    }
}
