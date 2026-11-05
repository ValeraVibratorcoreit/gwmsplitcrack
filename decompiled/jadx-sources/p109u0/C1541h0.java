package p109u0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
import com.altaysoft.t500_split.p061ip.Theme44BarView;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import java.util.Locale;
import p000A.AbstractC0000a;
import p000A.AbstractC0001b;
import p001A0.RunnableC0029w;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p022K.C0174W;
import p022K.C0181b0;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1294Y;
import p098q0.AbstractC1353s0;
import p098q0.AbstractC1372y1;
import p098q0.C1253D0;
import p098q0.C1311e0;
import p098q0.C1350r0;
import p098q0.RunnableC1359u0;
import p106t0.EnumC1457c;
import p111v.C1592d;

/* renamed from: u0.h0 */
/* loaded from: classes.dex */
public final class C1541h0 {

    /* renamed from: o0 */
    public static volatile float f8258o0;

    /* renamed from: p0 */
    public static volatile boolean f8259p0;

    /* renamed from: q0 */
    public static volatile boolean f8260q0;

    /* renamed from: A */
    public TextView f8261A;

    /* renamed from: B */
    public TextView f8262B;

    /* renamed from: C */
    public TextView f8263C;

    /* renamed from: D */
    public View f8264D;

    /* renamed from: E */
    public View f8265E;

    /* renamed from: F */
    public ImageView f8266F;

    /* renamed from: G */
    public TextView f8267G;

    /* renamed from: H */
    public ImageView f8268H;

    /* renamed from: I */
    public View f8269I;

    /* renamed from: J */
    public View f8270J;

    /* renamed from: K */
    public View f8271K;

    /* renamed from: L */
    public ImageView f8272L;

    /* renamed from: M */
    public TextView f8273M;

    /* renamed from: N */
    public TextView f8274N;

    /* renamed from: O */
    public TextView f8275O;

    /* renamed from: P */
    public TextView f8276P;

    /* renamed from: Q */
    public ProgressBar f8277Q;

    /* renamed from: S */
    public long f8279S;

    /* renamed from: T */
    public long f8280T;

    /* renamed from: U */
    public boolean f8281U;

    /* renamed from: V */
    public long f8282V;

    /* renamed from: X */
    public float f8284X;

    /* renamed from: Y */
    public boolean f8285Y;

    /* renamed from: Z */
    public boolean f8286Z;

    /* renamed from: a */
    public final C1537g f8287a;

    /* renamed from: a0 */
    public C1525c f8288a0;

    /* renamed from: b */
    public final View f8289b;

    /* renamed from: b0 */
    public C1521a1 f8290b0;

    /* renamed from: c */
    public final Context f8291c;

    /* renamed from: c0 */
    public ValueAnimator f8292c0;

    /* renamed from: d0 */
    public boolean f8294d0;

    /* renamed from: f0 */
    public boolean f8298f0;

    /* renamed from: g */
    public ViewGroup f8299g;

    /* renamed from: g0 */
    public float f8300g0;

    /* renamed from: h */
    public View f8301h;

    /* renamed from: i */
    public TextView f8303i;

    /* renamed from: i0 */
    public boolean f8304i0;

    /* renamed from: j */
    public TextView f8305j;

    /* renamed from: j0 */
    public boolean f8306j0;

    /* renamed from: k */
    public Theme44BarView f8307k;

    /* renamed from: k0 */
    public float f8308k0;

    /* renamed from: l */
    public TextView f8309l;

    /* renamed from: m */
    public TextView f8311m;

    /* renamed from: n */
    public Theme44BarView f8313n;

    /* renamed from: o */
    public TextView f8315o;

    /* renamed from: p */
    public TextView f8316p;

    /* renamed from: q */
    public TextView f8317q;

    /* renamed from: r */
    public ImageView f8318r;

    /* renamed from: s */
    public ImageView f8319s;

    /* renamed from: t */
    public LinearLayout f8320t;

    /* renamed from: u */
    public LinearLayout f8321u;

    /* renamed from: v */
    public TextView f8322v;

    /* renamed from: w */
    public TextView f8323w;

    /* renamed from: x */
    public TextView f8324x;

    /* renamed from: y */
    public TextView f8325y;

    /* renamed from: z */
    public TextView f8326z;

    /* renamed from: d */
    public final cfgData f8293d = cfgData.m1784i();

    /* renamed from: e */
    public final carData f8295e = carData.getInstance();

    /* renamed from: f */
    public final Handler f8297f = new Handler(Looper.getMainLooper());

    /* renamed from: R */
    public C0636d f8278R = C0636d.f2994j;

    /* renamed from: W */
    public int f8283W = -1;

    /* renamed from: e0 */
    public final RunnableC1529d0 f8296e0 = new RunnableC1529d0(this, 5);

    /* renamed from: h0 */
    public boolean f8302h0 = true;

    /* renamed from: l0 */
    public int f8310l0 = 999;

    /* renamed from: m0 */
    public final RunnableC1538g0 f8312m0 = new RunnableC1538g0(this, 0);

    /* renamed from: n0 */
    public final RunnableC1538g0 f8314n0 = new RunnableC1538g0(this, 1);

    public C1541h0(C1537g c1537g, View view) {
        this.f8287a = c1537g;
        this.f8289b = view;
        this.f8291c = view.getContext();
    }

    /* renamed from: E */
    public static void m4246E(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.setVisibility(z2 ? 0 : 4);
    }

    /* renamed from: k */
    public static Rect m4247k() {
        Rect m4238t = AbstractC1539g1.m4238t();
        return new Rect(m4238t.left, (r1 - Math.max(0, m4238t.height() - Math.round(30.0f))) - 90, m4238t.right, 800 - Math.round(20.0f));
    }

    /* renamed from: m */
    public static String m4248m(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: o */
    public static RectF m4249o(Rect rect, int i, int i2) {
        float f2 = i / 1920.0f;
        float f3 = i2 / 800.0f;
        return new RectF(rect.left * f2, rect.top * f3, rect.right * f2, rect.bottom * f3);
    }

    /* renamed from: p */
    public static Rect m4250p() {
        Rect m4247k = m4247k();
        int i = m4247k.top - 20;
        int i2 = m4247k.bottom - 70;
        if (i < 0) {
            i = 0;
        }
        if (i2 <= i) {
            i2 = i + 1;
        }
        return new Rect(m4247k.left, i, m4247k.right, i2);
    }

    /* renamed from: q */
    public static Rect m4251q(float f2) {
        Rect m4238t = AbstractC1539g1.m4238t();
        int i = m4238t.left - 310;
        int i2 = m4238t.top + 25;
        int i3 = m4238t.right + 310;
        int round = 800 - Math.round(20.0f);
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        if (max > 0.0f) {
            i3 = AbstractC0062j.m150d(1407 - i3, max, i3);
        }
        return new Rect(i, i2, i3, round);
    }

    /* renamed from: r */
    public static Rect m4252r() {
        Rect m4251q = m4251q(f8258o0);
        int i = m4251q.bottom - 80;
        int i2 = m4251q.top;
        if (i <= i2) {
            i = i2 + 1;
        }
        return new Rect(m4251q.left, m4251q.top, m4251q.right, i);
    }

    /* renamed from: A */
    public final void m4253A() {
        if (this.f8322v == null) {
            return;
        }
        float m1780z = this.f8295e.m1780z();
        cfgData cfgdata = this.f8293d;
        float f2 = m1780z >= 0.0f ? cfgdata.f2702u3 * m1780z : 0.0f;
        this.f8322v.setTextColor(f2 > cfgdata.f2568S1 ? -65536 : f2 > cfgdata.f2564R1 ? -256 : -1513240);
        this.f8322v.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(f2)));
    }

    /* renamed from: B */
    public final void m4254B() {
        AbstractC1372y1.m3296b();
        AbstractC1372y1.m3300f();
        m4259H(this.f8293d.f2672o3 ? "ip_rest_launcher" : "ip_rest");
    }

    /* renamed from: C */
    public final void m4255C() {
        ViewGroup viewGroup;
        if (!this.f8306j0) {
            m4273j();
            this.f8306j0 = true;
        }
        if (this.f8308k0 <= 0.0f && (viewGroup = this.f8299g) != null) {
            viewGroup.setAlpha(1.0f);
        }
        cfgData cfgdata = this.f8293d;
        boolean z2 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f8302h0 = z2;
        AbstractC1372y1.m3286Q(z2);
        m4270g();
        m4266c();
        m4271h();
        m4277t();
        m4280w(C0639g.m1872x().m1880u());
        this.f8286Z = AbstractC1372y1.f6437g;
        this.f8285Y = AbstractC1539g1.m4195Q(cfgdata, carData.getInstance());
        m4264a();
        m4260I(false);
        if (AbstractC1372y1.f6443m) {
            return;
        }
        this.f8297f.post(new RunnableC1529d0(this, 6));
    }

    /* renamed from: D */
    public final void m4256D(float f2) {
        LinearLayout linearLayout = this.f8321u;
        if (linearLayout != null) {
            linearLayout.setVisibility(f2 > 0.01f ? 0 : 4);
            linearLayout.setAlpha(f2);
        }
        LinearLayout linearLayout2 = this.f8320t;
        if (linearLayout2 != null) {
            linearLayout2.setVisibility(0);
            this.f8320t.setAlpha(1.0f);
        }
    }

    /* renamed from: F */
    public final void m4257F() {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup viewGroup = (ViewGroup) this.f8289b.findViewById(R.id.theme_46_root);
        this.f8299g = viewGroup;
        AbstractC1539g1.m4207b(viewGroup);
        View findViewById = this.f8289b.findViewById(R.id.theme_46_bottom_navi_cover);
        if (findViewById != null && (layoutParams = findViewById.getLayoutParams()) != null) {
            int i = layoutParams.height;
            if (i > 0) {
                AbstractC1539g1.m4217g(findViewById, i + 10.0f);
            } else {
                AbstractC1539g1.m4217g(findViewById, 10.0f);
            }
        }
        this.f8301h = this.f8289b.findViewById(R.id.theme_46_top_panel);
        this.f8303i = (TextView) this.f8289b.findViewById(R.id.theme_46_fuel);
        this.f8305j = (TextView) this.f8289b.findViewById(R.id.theme_46_fuel_liters);
        this.f8307k = (Theme44BarView) this.f8289b.findViewById(R.id.theme_46_fuel_bar);
        this.f8309l = (TextView) this.f8289b.findViewById(R.id.theme_46_remain);
        this.f8311m = (TextView) this.f8289b.findViewById(R.id.theme_46_coolant);
        this.f8313n = (Theme44BarView) this.f8289b.findViewById(R.id.theme_46_coolant_bar);
        this.f8315o = (TextView) this.f8289b.findViewById(R.id.theme_46_gear);
        this.f8316p = (TextView) this.f8289b.findViewById(R.id.theme_46_clock);
        this.f8317q = (TextView) this.f8289b.findViewById(R.id.theme_46_out_temp);
        this.f8318r = (ImageView) this.f8289b.findViewById(R.id.theme_46_wifi);
        this.f8319s = (ImageView) this.f8289b.findViewById(R.id.theme_46_inet);
        this.f8320t = (LinearLayout) this.f8289b.findViewById(R.id.theme_46_spd_gauge);
        this.f8321u = (LinearLayout) this.f8289b.findViewById(R.id.theme_46_rpm_gauge);
        this.f8322v = (TextView) this.f8289b.findViewById(R.id.theme_46_spd_value);
        this.f8323w = (TextView) this.f8289b.findViewById(R.id.theme_46_rpm_value);
        this.f8324x = (TextView) this.f8289b.findViewById(R.id.theme_46_odo_label);
        this.f8325y = (TextView) this.f8289b.findViewById(R.id.theme_46_odo_total);
        this.f8326z = (TextView) this.f8289b.findViewById(R.id.theme_46_odo_day_label);
        this.f8261A = (TextView) this.f8289b.findViewById(R.id.theme_46_odo_day);
        this.f8262B = (TextView) this.f8289b.findViewById(R.id.theme_46_odo_trip_label);
        TextView textView = (TextView) this.f8289b.findViewById(R.id.theme_46_odo_trip);
        this.f8263C = textView;
        AbstractC1539g1.m4204Z(this.f8325y, this.f8261A, textView);
        this.f8264D = this.f8289b.findViewById(R.id.theme_46_day_row);
        this.f8265E = this.f8289b.findViewById(R.id.theme_46_trip_row);
        this.f8266F = (ImageView) this.f8289b.findViewById(R.id.theme_46_cruise);
        this.f8267G = (TextView) this.f8289b.findViewById(R.id.theme_46_cruise_speed);
        this.f8268H = (ImageView) this.f8289b.findViewById(R.id.theme_46_lane);
        this.f8269I = this.f8289b.findViewById(R.id.theme_46_navi_hole);
        View findViewById2 = this.f8289b.findViewById(R.id.theme_46_media_wrap);
        this.f8270J = findViewById2;
        AbstractC0641i.m1886c(findViewById2);
        this.f8271K = this.f8289b.findViewById(R.id.overlay_media_content);
        this.f8272L = (ImageView) this.f8289b.findViewById(R.id.overlay_media_art);
        this.f8273M = (TextView) this.f8289b.findViewById(R.id.overlay_media_title);
        this.f8274N = (TextView) this.f8289b.findViewById(R.id.overlay_media_artist);
        this.f8275O = (TextView) this.f8289b.findViewById(R.id.overlay_media_elapsed);
        this.f8276P = (TextView) this.f8289b.findViewById(R.id.overlay_media_total);
        this.f8277Q = (ProgressBar) this.f8289b.findViewById(R.id.overlay_media_bar);
        View findViewById3 = this.f8289b.findViewById(R.id.overlay_media_empty);
        if (findViewById3 != null) {
            findViewById3.setVisibility(8);
        }
        C0043j m61g = C0043j.m61g(this.f8289b, R.id.ip_theme_update);
        if (m61g != null) {
            m61g.m78f(this.f8287a);
        }
        m4270g();
        m4266c();
        ViewGroup viewGroup2 = this.f8299g;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
            viewGroup2.setClipToPadding(false);
        }
        if (f8259p0) {
            this.f8294d0 = true;
            AbstractC1372y1.m3287R(true, true);
            this.f8300g0 = 1.0f;
            if (!m4275n()) {
                f8258o0 = this.f8300g0;
            }
            boolean z2 = f8260q0;
            this.f8298f0 = z2;
            if (z2) {
                m4272i();
            }
        } else {
            this.f8294d0 = false;
            this.f8300g0 = 0.0f;
            this.f8298f0 = false;
            AbstractC1372y1.m3287R(false, true);
        }
        if (!this.f8306j0) {
            m4273j();
            this.f8306j0 = true;
        }
        ViewGroup viewGroup3 = this.f8299g;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f);
        }
        this.f8308k0 = 0.0f;
        cfgData cfgdata = this.f8293d;
        boolean z3 = cfgdata.f2537K2 && cfgdata.f2561Q2;
        this.f8302h0 = z3;
        AbstractC1372y1.m3286Q(z3);
        m4271h();
        this.f8304i0 = true;
        this.f8297f.post(this.f8314n0);
        this.f8297f.post(this.f8312m0);
        m4263L();
        m4277t();
        m4280w(C0639g.m1872x().m1880u());
        this.f8286Z = AbstractC1372y1.f6437g;
        this.f8285Y = AbstractC1539g1.m4195Q(this.f8293d, carData.getInstance());
        m4264a();
        m4260I(false);
        if (AbstractC1372y1.f6443m) {
            return;
        }
        this.f8297f.post(new RunnableC1529d0(this, 6));
    }

    /* renamed from: G */
    public final void m4258G(float f2, float f3, RunnableC1529d0 runnableC1529d0) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f2, f3);
        this.f8292c0 = ofFloat;
        ofFloat.setDuration(400L);
        AbstractC0062j.m166t(this.f8292c0);
        this.f8292c0.addUpdateListener(new C0174W(10, this));
        this.f8292c0.addListener(new C0181b0(this, 8, runnableC1529d0));
        this.f8292c0.start();
    }

    /* renamed from: H */
    public final void m4259H(String str) {
        Context context = this.f8291c;
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

    /* renamed from: I */
    public final void m4260I(boolean z2) {
        boolean m4195Q = AbstractC1539g1.m4195Q(this.f8293d, carData.getInstance());
        if (m4195Q != this.f8285Y) {
            this.f8285Y = m4195Q;
            this.f8283W = -1;
            this.f8284X = 0.0f;
            z2 = true;
        }
        m4266c();
        m4265b(z2);
    }

    /* renamed from: J */
    public final void m4261J() {
        this.f8297f.removeCallbacks(this.f8296e0);
        ValueAnimator valueAnimator = this.f8292c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f8292c0 = null;
        }
        if (this.f8294d0) {
            m4274l();
            return;
        }
        if (AbstractC1372y1.m3272C()) {
            m4274l();
            return;
        }
        this.f8294d0 = true;
        AbstractC1372y1.m3287R(true, true);
        f8259p0 = true;
        f8260q0 = this.f8298f0;
        f8258o0 = m4275n() ? 1.0f : 0.0f;
        if (m4275n()) {
            this.f8300g0 = 1.0f;
            m4269f();
            m4254B();
        } else {
            this.f8300g0 = 0.0f;
            m4269f();
            m4258G(0.0f, 1.0f, null);
        }
    }

    /* renamed from: K */
    public final void m4262K(RectF rectF, float f2) {
        ViewGroup viewGroup = this.f8299g;
        if (viewGroup == null) {
            return;
        }
        viewGroup.getOverlay().clear();
        cfgData cfgdata = this.f8293d;
        if (!cfgdata.f2537K2 || !this.f8302h0 || AbstractC1539g1.m4194P(cfgdata, this.f8295e) || rectF == null || rectF.width() <= 0.0f || rectF.height() <= 0.0f) {
            return;
        }
        if (this.f8290b0 == null) {
            this.f8290b0 = new C1521a1();
        }
        this.f8290b0.setBounds(0, 0, this.f8299g.getWidth(), this.f8299g.getHeight());
        this.f8290b0.m4155a(rectF, f2, 0.0f, AbstractC0001b.m3a(this.f8291c, R.color.ip_theme_46_border), 20.0f, -74.0f);
        this.f8299g.getOverlay().add(this.f8290b0);
    }

    /* renamed from: L */
    public final void m4263L() {
        ViewGroup viewGroup = this.f8299g;
        if (viewGroup == null || this.f8288a0 == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8299g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8299g.post(new RunnableC1529d0(this, 2));
            return;
        }
        float f2 = this.f8291c.getResources().getDisplayMetrics().density;
        float f3 = 14.0f * f2;
        this.f8288a0.m4160b();
        RectF m4206a0 = m4275n() ? AbstractC1539g1.m4206a0(m4251q(this.f8300g0), width, height) : AbstractC1539g1.m4206a0(m4247k(), width, height);
        if (m4206a0.width() <= 0.0f || m4206a0.height() <= 0.0f) {
            m4262K(null, 0.0f);
        } else {
            this.f8288a0.m4159a(m4206a0.left, m4206a0.top, m4206a0.right, m4206a0.bottom, f3, 0.0f);
            m4262K(m4206a0, f3);
        }
        if (this.f8294d0 || this.f8300g0 > 0.0f) {
            AbstractC1539g1.m4205a(this.f8288a0, width, height, f2, this.f8300g0, 0.0f);
        }
        boolean z2 = this.f8294d0;
        if (!z2 && this.f8300g0 <= 0.0f) {
            m4256D(1.0f);
        } else if (!z2 || this.f8300g0 < 1.0f) {
            m4256D(z2 ? 1.0f - this.f8300g0 : this.f8300g0);
        } else {
            m4256D(0.0f);
        }
        this.f8299g.invalidate();
    }

    /* renamed from: a */
    public final void m4264a() {
        ViewGroup viewGroup = this.f8299g;
        if (viewGroup == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8299g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8299g.post(new RunnableC1529d0(this, 3));
            return;
        }
        Rect m4239u = AbstractC1539g1.m4239u();
        RectF m4249o = m4249o(new Rect(1920 - m4239u.right, m4239u.top, 1920 - m4239u.left, m4239u.bottom), width, height);
        m4249o(AbstractC1539g1.m4239u(), width, height);
        float f2 = width;
        float f3 = f2 / 1920.0f;
        float f4 = 150.0f * f3;
        float f5 = 20.0f * f3;
        float centerY = m4249o.centerY();
        m4276s(this.f8320t, this.f8322v, ((f3 * 50.0f) + f4) - f5, centerY);
        m4276s(this.f8321u, this.f8323w, (f2 - f4) - f5, centerY);
    }

    /* renamed from: b */
    public final void m4265b(boolean z2) {
        ViewGroup viewGroup;
        if (this.f8270J == null || (viewGroup = this.f8299g) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8299g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8299g.post(new RunnableC0029w(this, z2, 7));
            return;
        }
        boolean m4195Q = AbstractC1539g1.m4195Q(cfgData.m1784i(), carData.getInstance());
        int i = m4251q(f8258o0).left + 15;
        int i2 = m4195Q ? m4251q(f8258o0).bottom - 425 : 440;
        int max = Math.max(0, Math.min(i, Math.max(0, width - 470)));
        int max2 = Math.max(0, Math.min(i2, Math.max(0, height - 260)));
        float f2 = i - max;
        float f3 = i2 - max2;
        C1592d c1592d = new C1592d(470, 260);
        c1592d.f9046i = 0;
        c1592d.f9065t = 0;
        c1592d.f9067v = -1;
        c1592d.f9052l = -1;
        c1592d.setMarginStart(max);
        ((ViewGroup.MarginLayoutParams) c1592d).topMargin = max2;
        this.f8270J.setLayoutParams(c1592d);
        int i3 = this.f8283W;
        float f4 = i3 >= 0 ? i3 + this.f8284X : max2 + f3;
        float f5 = max2;
        float f6 = f5 + f3;
        if (!z2 || i3 < 0 || Math.abs(f4 - f6) <= 0.5f) {
            this.f8270J.animate().cancel();
            this.f8270J.setTranslationX(f2);
            this.f8270J.setTranslationY(f3);
        } else {
            this.f8270J.animate().cancel();
            this.f8270J.setTranslationX(f2);
            this.f8270J.setTranslationY(f4 - f5);
            this.f8270J.animate().translationY(f3).setDuration(350L).setInterpolator(new DecelerateInterpolator()).start();
        }
        this.f8283W = max2;
        this.f8284X = f3;
        this.f8270J.bringToFront();
        this.f8299g.requestLayout();
    }

    /* renamed from: c */
    public final void m4266c() {
        if (this.f8270J == null) {
            return;
        }
        Context context = this.f8291c;
        cfgData cfgdata = this.f8293d;
        C1350r0 m3248c = AbstractC1353s0.m3248c(context, cfgdata);
        AbstractC1256E0.m3013f(this.f8270J, m3248c, 1.0f);
        TextView textView = this.f8273M;
        if (textView != null) {
            textView.setTextColor(m3248c.f6351f);
        }
        TextView textView2 = this.f8274N;
        int i = m3248c.f6350e;
        if (textView2 != null) {
            textView2.setTextColor(i);
        }
        TextView textView3 = this.f8275O;
        if (textView3 != null) {
            textView3.setTextColor(i);
        }
        TextView textView4 = this.f8276P;
        if (textView4 != null) {
            textView4.setTextColor(i);
        }
        ProgressBar progressBar = this.f8277Q;
        if (progressBar != null) {
            progressBar.setProgressDrawable(AbstractC0000a.m1b(context, AbstractC1353s0.m3249d(cfgdata.f2620e1)));
        }
        Drawable background = this.f8270J.getBackground();
        if (background != null) {
            Drawable mutate = background.mutate();
            mutate.setAlpha(Math.round(127.5f));
            this.f8270J.setBackground(mutate);
        }
    }

    /* renamed from: d */
    public final void m4267d(long j2) {
        boolean z2 = this.f8280T > 0;
        ProgressBar progressBar = this.f8277Q;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f8277Q.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f8280T)));
            }
        }
        TextView textView = this.f8275O;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f8275O.setText(m4248m(j2));
            }
        }
        TextView textView2 = this.f8276P;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f8276P.setText(m4248m(this.f8280T));
            }
        }
    }

    /* renamed from: e */
    public final void m4268e() {
        C0636d c0636d;
        if (this.f8270J == null) {
            return;
        }
        boolean z2 = this.f8293d.f2585W2 && (c0636d = this.f8278R) != null && c0636d.m1851a() && this.f8302h0;
        this.f8270J.setVisibility(z2 ? 0 : 8);
        if (z2) {
            m4266c();
            this.f8270J.post(new RunnableC1529d0(this, 1));
        }
    }

    /* renamed from: f */
    public final void m4269f() {
        ViewGroup viewGroup;
        C1253D0 c1253d0;
        if (this.f8269I == null || (viewGroup = this.f8299g) == null) {
            return;
        }
        int width = viewGroup.getWidth();
        int height = this.f8299g.getHeight();
        if (width <= 0 || height <= 0) {
            this.f8299g.post(new RunnableC1529d0(this, 7));
            return;
        }
        if (this.f8269I.getLayoutParams() instanceof C1592d) {
            RectF m4206a0 = m4275n() ? AbstractC1539g1.m4206a0(m4251q(this.f8300g0), width, height) : AbstractC1539g1.m4206a0(m4247k(), width, height);
            C1592d c1592d = (C1592d) this.f8269I.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = Math.round(m4206a0.width());
            ((ViewGroup.MarginLayoutParams) c1592d).height = Math.round(m4206a0.height());
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(m4206a0.left));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(m4206a0.top);
            this.f8269I.setLayoutParams(c1592d);
            this.f8289b.post(new RunnableC1529d0(this, 2));
            if (AbstractC1372y1.f6443m) {
                return;
            }
            ValueAnimator valueAnimator = this.f8292c0;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m4260I(true);
                return;
            }
            m4265b(false);
            if (!this.f8293d.f2652k3 || AbstractC1372y1.m3299e("overlay") || AbstractC1372y1.f6443m || (c1253d0 = AbstractC1372y1.f6444n) == null || !c1253d0.f5620W) {
                return;
            }
            int[] m3282M = AbstractC1372y1.m3282M(cfgData.m1784i().f2620e1);
            AbstractC1372y1.f6444n.m2971i();
            AbstractC1372y1.f6444n.m2976o(m3282M[0], m3282M[1]);
        }
    }

    /* renamed from: g */
    public final void m4270g() {
        if (this.f8299g == null) {
            return;
        }
        if (this.f8288a0 == null) {
            C1525c c1525c = new C1525c(-16777216);
            this.f8288a0 = c1525c;
            c1525c.m4164f(AbstractC0001b.m3a(this.f8291c, R.color.ip_theme_46_border));
        }
        this.f8288a0.m4162d(-16777216);
        this.f8299g.setLayerType(1, null);
        this.f8299g.setBackground(this.f8288a0);
        m4269f();
        m4263L();
        AbstractC1539g1.m4215f(R.drawable.ip_theme_46_top_bar, this.f8301h, AbstractC1539g1.m4230m0(this.f8293d, this.f8295e));
    }

    /* renamed from: h */
    public final void m4271h() {
        ViewGroup viewGroup = this.f8299g;
        if (viewGroup == null) {
            return;
        }
        boolean z2 = true;
        AbstractC1539g1.m4228l0(viewGroup, !this.f8302h0);
        if (this.f8293d.f2537K2 && this.f8302h0) {
            this.f8299g.setVisibility(0);
        } else {
            if (!m4275n() || (f8258o0 <= 0.0f && !this.f8294d0 && this.f8300g0 <= 0.0f)) {
                z2 = false;
            }
            this.f8297f.removeCallbacks(this.f8296e0);
            ValueAnimator valueAnimator = this.f8292c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f8292c0 = null;
            }
            this.f8294d0 = false;
            this.f8300g0 = 0.0f;
            this.f8298f0 = false;
            f8259p0 = false;
            f8260q0 = false;
            f8258o0 = 0.0f;
            AbstractC1372y1.m3287R(false, false);
            m4263L();
            if (z2) {
                m4254B();
            }
            this.f8299g.setVisibility(4);
        }
        m4269f();
        m4268e();
    }

    /* renamed from: i */
    public final void m4272i() {
        Handler handler = this.f8297f;
        RunnableC1529d0 runnableC1529d0 = this.f8296e0;
        handler.removeCallbacks(runnableC1529d0);
        handler.postDelayed(runnableC1529d0, 15000L);
    }

    /* renamed from: j */
    public final void m4273j() {
        final RunnableC1529d0 runnableC1529d0 = new RunnableC1529d0(this, 4);
        final int i = 0;
        InterfaceC0561z interfaceC0561z = new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        };
        carData cardata = this.f8295e;
        C1537g c1537g = this.f8287a;
        cardata.m1742c0(c1537g, interfaceC0561z);
        final int i2 = 1;
        cardata.m1744d0(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i3 = 2;
        cardata.m1746e0(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i4 = 3;
        cardata.m1748f0(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i5 = 4;
        cardata.m1738a0(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i6 = 5;
        cardata.m1736Z(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i7 = 6;
        cardata.m1735Y(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i8 = 7;
        cardata.m1722K(c1537g, new InterfaceC0561z() { // from class: u0.c0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        runnableC1529d0.run();
                        break;
                    case 1:
                        runnableC1529d0.run();
                        break;
                    case 2:
                        runnableC1529d0.run();
                        break;
                    case 3:
                        runnableC1529d0.run();
                        break;
                    case 4:
                        runnableC1529d0.run();
                        break;
                    case 5:
                        runnableC1529d0.run();
                        break;
                    case 6:
                        runnableC1529d0.run();
                        break;
                    default:
                        runnableC1529d0.run();
                        break;
                }
            }
        });
        final int i9 = 4;
        cardata.m1754i0(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i9) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i10 = 5;
        cardata.m1750g0(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i10) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i11 = 6;
        cardata.m1740b0(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i11) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i12 = 7;
        cardata.m1772r0(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i12) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i13 = 8;
        cardata.m1730S(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i13) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i14 = 9;
        cardata.m1758k0(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i14) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i15 = 10;
        cardata.m1725N(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i15) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i16 = 11;
        cardata.m1727P(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i16) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        AbstractC1294Y.m3151c(c1537g, this.f8291c);
        final int i17 = 0;
        cardata.m1723L(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i17) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i18 = 1;
        cardata.m1724M(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i18) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i19 = 2;
        cardata.m1734W(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i19) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final int i20 = 3;
        C0639g.m1872x().m1883z(c1537g, new InterfaceC0561z(this) { // from class: u0.b0

            /* renamed from: b */
            public final /* synthetic */ C1541h0 f8140b;

            {
                this.f8140b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int intValue;
                int intValue2;
                ValueAnimator valueAnimator;
                ViewGroup viewGroup;
                int intValue3;
                switch (i20) {
                    case 0:
                        Integer num = (Integer) obj;
                        C1541h0 c1541h0 = this.f8140b;
                        if (num == null) {
                            intValue = 0;
                        } else {
                            c1541h0.getClass();
                            intValue = num.intValue();
                        }
                        c1541h0.m4278u(intValue);
                        break;
                    case 1:
                        Integer num2 = (Integer) obj;
                        C1541h0 c1541h02 = this.f8140b;
                        if (num2 == null) {
                            intValue2 = 0;
                        } else {
                            c1541h02.getClass();
                            intValue2 = num2.intValue();
                        }
                        TextView textView = c1541h02.f8267G;
                        if (textView != null) {
                            textView.setText(String.valueOf(intValue2));
                        }
                        c1541h02.m4278u(c1541h02.f8295e.m1745e());
                        break;
                    case 2:
                        C1541h0 c1541h03 = this.f8140b;
                        Integer num3 = (Integer) obj;
                        c1541h03.getClass();
                        if (num3 != null && num3.intValue() != 0) {
                            if (num3.intValue() != 16) {
                                if (num3.intValue() != 1) {
                                    if (num3.intValue() != 4) {
                                        if (!AbstractC1372y1.m3315u(c1541h03.f8291c, num3.intValue())) {
                                            if (num3.intValue() != 6) {
                                                if (num3.intValue() != 3) {
                                                    if (num3.intValue() != 13 && num3.intValue() != 14) {
                                                        if ((num3.intValue() != 7 && num3.intValue() != 8) || !AbstractC1372y1.f6438h) {
                                                            if ((num3.intValue() != 7 && num3.intValue() != 8) || !c1541h03.f8298f0 || !c1541h03.f8294d0) {
                                                                if (num3.intValue() != 9) {
                                                                    if (num3.intValue() == 12 && AbstractC1539g1.m4211d(c1541h03.f8293d, c1541h03.f8295e)) {
                                                                        AbstractC1372y1.m3296b();
                                                                        cfgData cfgdata = c1541h03.f8293d;
                                                                        cfgdata.f2557P2 = !cfgdata.f2557P2;
                                                                        cfgdata.m1795o(c1541h03.f8291c);
                                                                        AbstractC1372y1.m3300f();
                                                                        c1541h03.m4259H("ip");
                                                                        break;
                                                                    }
                                                                } else if (AbstractC1539g1.m4209c(c1541h03.f8295e)) {
                                                                    cfgData cfgdata2 = c1541h03.f8293d;
                                                                    boolean z2 = !cfgdata2.f2549N2;
                                                                    cfgdata2.f2549N2 = z2;
                                                                    c1541h03.f8295e.m1760l0(z2);
                                                                    c1541h03.f8293d.m1795o(c1541h03.f8291c);
                                                                    Context context = c1541h03.f8291c;
                                                                    AbstractC1372y1.m3289T(context, context.getString(c1541h03.f8293d.f2549N2 ? R.string.enablingAlice : R.string.disablingAlice));
                                                                    if (c1541h03.f8293d.f2549N2) {
                                                                        AbstractC1372y1.m3304j(c1541h03.f8291c);
                                                                    }
                                                                    AbstractC1372y1.m3300f();
                                                                    c1541h03.m4259H("ip");
                                                                    break;
                                                                }
                                                            } else {
                                                                c1541h03.m4272i();
                                                                break;
                                                            }
                                                        }
                                                    } else if (!c1541h03.f8294d0) {
                                                        c1541h03.f8298f0 = true;
                                                        ViewGroup viewGroup2 = c1541h03.f8299g;
                                                        if (viewGroup2 != null && viewGroup2.isShown() && !AbstractC1372y1.m3272C()) {
                                                            c1541h03.f8298f0 = true;
                                                            C1541h0.f8260q0 = true;
                                                            if (!c1541h03.f8294d0 && ((valueAnimator = c1541h03.f8292c0) == null || !valueAnimator.isRunning())) {
                                                                c1541h03.m4261J();
                                                            }
                                                            c1541h03.m4272i();
                                                            break;
                                                        }
                                                    } else if (c1541h03.f8298f0) {
                                                        c1541h03.m4272i();
                                                        break;
                                                    }
                                                } else {
                                                    boolean z3 = !c1541h03.f8302h0;
                                                    c1541h03.f8302h0 = z3;
                                                    AbstractC1372y1.m3286Q(z3);
                                                    c1541h03.m4271h();
                                                    if (AbstractC1372y1.f6437g) {
                                                        AbstractC1372y1.m3292W(c1541h03.f8291c, true);
                                                        break;
                                                    }
                                                }
                                            } else {
                                                AbstractC1372y1.m3300f();
                                                if (!c1541h03.f8293d.f2672o3) {
                                                    Context context2 = c1541h03.f8291c;
                                                    AbstractC1372y1.m3289T(context2, context2.getString(R.string.msgSplitRecovery));
                                                    c1541h03.m4259H("ip_rest");
                                                    break;
                                                } else {
                                                    c1541h03.m4259H("ip_rest_launcher");
                                                    break;
                                                }
                                            }
                                        }
                                    } else if (c1541h03.f8295e.m1714B()) {
                                        if (AbstractC1372y1.f6437g) {
                                            AbstractC1372y1.m3305k(c1541h03.f8291c);
                                        } else {
                                            cfgData cfgdata3 = c1541h03.f8293d;
                                            int[] m3282M = AbstractC1372y1.m3282M(cfgdata3.f2620e1);
                                            AbstractC1372y1.m3290U(c1541h03.f8291c, m3282M[0], m3282M[1], 0.5f, cfgdata3.f2657l3);
                                        }
                                        c1541h03.f8286Z = AbstractC1372y1.f6437g;
                                        c1541h03.m4260I(true);
                                        break;
                                    }
                                } else if (!AbstractC1372y1.m3302h() && (viewGroup = c1541h03.f8299g) != null && viewGroup.isShown()) {
                                    ValueAnimator valueAnimator2 = c1541h03.f8292c0;
                                    if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                                        c1541h03.f8298f0 = false;
                                        c1541h03.m4261J();
                                        break;
                                    }
                                }
                            } else {
                                AbstractC0638f.m1858g(c1541h03.f8291c);
                                break;
                            }
                        }
                        break;
                    case 3:
                        this.f8140b.m4280w((C0636d) obj);
                        break;
                    case 4:
                        this.f8140b.m4253A();
                        break;
                    case 5:
                        this.f8140b.m4283z();
                        break;
                    case 6:
                        this.f8140b.m4282y();
                        break;
                    case 7:
                        this.f8140b.m4281x();
                        break;
                    case 8:
                        this.f8140b.m4281x();
                        break;
                    case Platform.GNU /* 9 */:
                        this.f8140b.m4281x();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        Integer num4 = (Integer) obj;
                        C1541h0 c1541h04 = this.f8140b;
                        if (num4 == null) {
                            intValue3 = 0;
                        } else {
                            c1541h04.getClass();
                            intValue3 = num4.intValue();
                        }
                        if (c1541h04.f8310l0 > -1 && intValue3 == -1) {
                            AbstractC1372y1.m3306l();
                            Context context3 = c1541h04.f8291c;
                            C1311e0.m3165d(context3).m3171e();
                            AbstractC1294Y.m3153e(context3);
                            cfgData cfgdata4 = c1541h04.f8293d;
                            if (cfgdata4.f2537K2) {
                                c1541h04.f8308k0 = 1.0f;
                            }
                            if (AbstractC1539g1.m4197S(cfgdata4)) {
                                AbstractC1372y1.m3301g();
                            }
                        }
                        if (c1541h04.f8310l0 == -1 && intValue3 > -1) {
                            c1541h04.f8308k0 = 0.0f;
                            ViewGroup viewGroup3 = c1541h04.f8299g;
                            if (viewGroup3 != null) {
                                viewGroup3.animate().cancel();
                                c1541h04.f8299g.setAlpha(1.0f);
                            }
                            c1541h04.m4259H("ip");
                        }
                        c1541h04.f8310l0 = intValue3;
                        c1541h04.m4279v();
                        break;
                    default:
                        this.f8140b.m4279v();
                        break;
                }
            }
        });
        final RunnableC1529d0 runnableC1529d02 = new RunnableC1529d0(this, 0);
        final int i21 = 0;
        cardata.m1732U(c1537g, new InterfaceC0561z() { // from class: u0.e0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i21) {
                    case 0:
                        runnableC1529d02.run();
                        break;
                    default:
                        runnableC1529d02.run();
                        break;
                }
            }
        });
        cardata.m1733V(c1537g, new C1535f0(this, i21, runnableC1529d02));
        final int i22 = 1;
        cardata.m1762m0(c1537g, new InterfaceC0561z() { // from class: u0.e0
            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i22) {
                    case 0:
                        runnableC1529d02.run();
                        break;
                    default:
                        runnableC1529d02.run();
                        break;
                }
            }
        });
        cardata.m1729R(c1537g, new C1535f0(this, i22, runnableC1529d02));
    }

    /* renamed from: l */
    public final void m4274l() {
        f8259p0 = false;
        f8260q0 = false;
        this.f8298f0 = false;
        if (m4275n()) {
            f8258o0 = 0.0f;
            this.f8294d0 = false;
            this.f8300g0 = 0.0f;
            AbstractC1372y1.m3287R(false, true);
            m4269f();
            m4254B();
            return;
        }
        float f2 = this.f8300g0;
        if (f2 > 0.0f) {
            m4258G(f2, 0.0f, new RunnableC1529d0(this, 8));
            return;
        }
        f8258o0 = 0.0f;
        this.f8294d0 = false;
        AbstractC1372y1.m3287R(false, true);
        m4269f();
    }

    /* renamed from: n */
    public final boolean m4275n() {
        return AbstractC1539g1.m4195Q(this.f8293d, this.f8295e);
    }

    /* renamed from: s */
    public final void m4276s(View view, View view2, float f2, float f3) {
        if (view != null && (view.getLayoutParams() instanceof C1592d)) {
            view.measure(View.MeasureSpec.makeMeasureSpec(this.f8299g.getWidth(), SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            if (measuredWidth <= 0 || measuredHeight <= 0) {
                return;
            }
            C1592d c1592d = (C1592d) view.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) c1592d).width = -2;
            ((ViewGroup.MarginLayoutParams) c1592d).height = -2;
            c1592d.f9046i = 0;
            c1592d.f9065t = 0;
            c1592d.f9067v = -1;
            c1592d.f9052l = -1;
            c1592d.setMarginStart(Math.round(f2 - (measuredWidth * 0.5f)));
            ((ViewGroup.MarginLayoutParams) c1592d).topMargin = Math.round(f3 - (measuredHeight * 0.5f));
            view.setLayoutParams(c1592d);
            if (view2 == null) {
                return;
            }
            view.post(new RunnableC1359u0(view, view2, f3));
        }
    }

    /* renamed from: t */
    public final void m4277t() {
        float max;
        float max2;
        float max3;
        AbstractC1539g1.m4228l0(this.f8299g, !this.f8302h0);
        cfgData cfgdata = this.f8293d;
        EnumC1457c enumC1457c = cfgdata.f2543M0;
        boolean z2 = enumC1457c.f7147f;
        carData cardata = this.f8295e;
        if (z2) {
            float f2 = enumC1457c == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f;
            float m1775u = cardata.m1775u();
            max = cfgdata.m1787f(m1775u, cardata.m1776v(), f2);
            Theme44BarView theme44BarView = this.f8307k;
            if (theme44BarView != null) {
                theme44BarView.setProgress(Math.round(m1775u * f2));
            }
        } else {
            max = Math.max(0.0f, cardata.m1774t());
            Theme44BarView theme44BarView2 = this.f8307k;
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
        Theme44BarView theme44BarView3 = this.f8307k;
        if (theme44BarView3 != null) {
            theme44BarView3.setBarProgressColor(AbstractC1539g1.m4189K(max));
        }
        TextView textView = this.f8303i;
        if (textView != null) {
            textView.setText(String.format(Locale.ENGLISH, "%.0f%%", Float.valueOf(max)));
            this.f8303i.setTextColor(i2);
        }
        TextView textView2 = this.f8305j;
        if (textView2 != null) {
            Locale locale = Locale.ENGLISH;
            EnumC1457c enumC1457c3 = cfgdata.f2543M0;
            if (enumC1457c3.f7147f) {
                max3 = cfgdata.m1786e(cardata.m1775u(), cardata.m1776v(), enumC1457c3 == EnumC1457c.T500_BT_NEW ? 10.0f : 1.0f);
            } else {
                max3 = Math.max(0.0f, cardata.m1774t()) * cfgdata.m1789h();
            }
            textView2.setText(String.format(locale, "%.0f L", Float.valueOf(max3)));
            this.f8305j.setTextColor(i2);
        }
        float m1743d = cardata.m1743d();
        Theme44BarView theme44BarView4 = this.f8313n;
        if (theme44BarView4 != null) {
            theme44BarView4.setProgress(Math.round(m1743d < 40.0f ? 0 : m1743d > 130.0f ? 100 : Math.round(((m1743d - 40.0f) / 90.0f) * 100.0f)));
            this.f8313n.setBarProgressColor(AbstractC1539g1.m4242x(m1743d));
        }
        TextView textView3 = this.f8311m;
        if (textView3 != null) {
            if (m1743d < -90.0f) {
                textView3.setText("-- °C");
                this.f8311m.setTextColor(-1513240);
            } else {
                textView3.setText(String.format(Locale.ENGLISH, "%.0f °C", Float.valueOf(m1743d)));
                TextView textView4 = this.f8311m;
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
        TextView textView5 = this.f8309l;
        if (textView5 != null) {
            textView5.setText(String.format(Locale.ENGLISH, "%.0f km", Float.valueOf(cardata.m1777w())));
            this.f8309l.setTextColor(-1);
        }
        TextView textView6 = this.f8325y;
        if (textView6 != null) {
            textView6.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1771r())).replace(',', '.'));
        }
        TextView textView7 = this.f8261A;
        if (textView7 != null) {
            textView7.setText(String.format(Locale.ENGLISH, "%.1f", Float.valueOf(cardata.m1769q())).replace(',', '.'));
        }
        TextView textView8 = this.f8263C;
        if (textView8 != null) {
            textView8.setText(String.format(Locale.ENGLISH, "%.0f", Float.valueOf(cardata.m1767p())).replace(',', '.'));
        }
        m4282y();
        m4281x();
        m4279v();
        m4253A();
        m4283z();
        TextView textView9 = this.f8316p;
        if (textView9 != null) {
            textView9.setText(AbstractC1372y1.m3307m(this.f8291c));
        }
        boolean z3 = cfgdata.f2569S2;
        m4246E(this.f8324x, z3);
        m4246E(this.f8325y, z3);
        boolean z4 = cfgdata.f2577U2;
        boolean z5 = cfgdata.f2573T2;
        m4246E(this.f8264D, z4);
        m4246E(this.f8326z, z4);
        m4246E(this.f8261A, z4);
        m4246E(this.f8265E, z5);
        m4246E(this.f8262B, z5);
        m4246E(this.f8263C, z5);
        int m1747f = cardata.m1747f();
        TextView textView10 = this.f8267G;
        if (textView10 != null) {
            textView10.setText(String.valueOf(m1747f));
        }
        m4278u(cardata.m1745e());
    }

    /* renamed from: u */
    public final void m4278u(int i) {
        ImageView imageView;
        TextView textView;
        cfgData cfgdata = this.f8293d;
        if (!cfgdata.f2537K2) {
            ImageView imageView2 = this.f8266F;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
            TextView textView2 = this.f8267G;
            if (textView2 != null) {
                textView2.setVisibility(4);
            }
            ImageView imageView3 = this.f8268H;
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
            ImageView imageView4 = this.f8266F;
            if (imageView4 != null) {
                imageView4.setVisibility(4);
            }
            TextView textView3 = this.f8267G;
            if (textView3 != null) {
                textView3.setVisibility(4);
            }
        } else if (b2 == 2) {
            ImageView imageView5 = this.f8266F;
            if (imageView5 != null) {
                imageView5.setVisibility(0);
                this.f8266F.setColorFilter(-7829368);
            }
            TextView textView4 = this.f8267G;
            if (textView4 != null) {
                textView4.setVisibility(0);
            }
        } else if (b2 == 3) {
            ImageView imageView6 = this.f8266F;
            if (imageView6 != null) {
                imageView6.setVisibility(0);
                this.f8266F.setColorFilter(-16711936);
            }
            TextView textView5 = this.f8267G;
            if (textView5 != null) {
                textView5.setVisibility(0);
            }
        }
        if (this.f8295e.m1747f() < 20 && (textView = this.f8267G) != null) {
            textView.setVisibility(4);
        }
        if (b3 == 1) {
            ImageView imageView7 = this.f8268H;
            if (imageView7 != null) {
                imageView7.setVisibility(4);
                return;
            }
            return;
        }
        if (b3 == 2) {
            ImageView imageView8 = this.f8268H;
            if (imageView8 != null) {
                imageView8.setVisibility(0);
                this.f8268H.setColorFilter(-7829368);
                return;
            }
            return;
        }
        if (b3 != 3 || (imageView = this.f8268H) == null) {
            return;
        }
        imageView.setVisibility(0);
        this.f8268H.setColorFilter(-16711936);
    }

    /* renamed from: v */
    public final void m4279v() {
        TextView textView = this.f8315o;
        if (textView == null) {
            return;
        }
        if (!this.f8293d.f2543M0.f7150i) {
            textView.setVisibility(4);
            return;
        }
        carData cardata = this.f8295e;
        int m1749g = cardata.m1749g();
        if (cardata.m1757k() == 5 || m1749g <= 0) {
            this.f8315o.setVisibility(4);
            return;
        }
        this.f8315o.setVisibility(0);
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1749g)).replace(",", ".");
        SpannableString spannableString = new SpannableString(replace);
        spannableString.setSpan(AbstractC0062j.m155i(this.f8315o, -7829368, -1513240), 0, replace.length(), 33);
        this.f8315o.setText(spannableString);
    }

    /* renamed from: w */
    public final void m4280w(C0636d c0636d) {
        this.f8278R = c0636d != null ? c0636d : C0636d.f2994j;
        View view = this.f8270J;
        if (view == null) {
            return;
        }
        AbstractC0641i.m1892i(view, c0636d);
        TextView textView = this.f8273M;
        if (textView != null) {
            String str = this.f8278R.f2996b;
            if (str == null) {
                str = "";
            }
            AbstractC1256E0.m3000O(textView, str);
        }
        TextView textView2 = this.f8274N;
        if (textView2 != null) {
            String str2 = this.f8278R.f2997c;
            AbstractC1256E0.m3001P(textView2, str2 != null ? str2 : "");
            TextView textView3 = this.f8274N;
            String str3 = this.f8278R.f2997c;
            textView3.setVisibility((str3 == null || str3.isEmpty()) ? 8 : 0);
        }
        View view2 = this.f8271K;
        if (view2 != null) {
            view2.setVisibility(this.f8278R.m1851a() ? 0 : 8);
        }
        ImageView imageView = this.f8272L;
        if (imageView != null) {
            Bitmap bitmap = this.f8278R.f2999e;
            if (bitmap != null) {
                imageView.setImageBitmap(bitmap);
                this.f8272L.setVisibility(0);
            } else {
                imageView.setImageDrawable(null);
                this.f8272L.setVisibility(8);
            }
        }
        C0636d c0636d2 = this.f8278R;
        this.f8280T = c0636d2.f3002h;
        this.f8279S = c0636d2.f3001g;
        this.f8281U = c0636d2.f3000f;
        this.f8282V = SystemClock.elapsedRealtime();
        m4267d(this.f8279S);
        m4268e();
    }

    /* renamed from: x */
    public final void m4281x() {
        ImageView imageView = this.f8318r;
        carData cardata = this.f8295e;
        if (imageView != null) {
            imageView.setVisibility(cardata.getWifi() ? 0 : 4);
        }
        if (this.f8319s != null) {
            this.f8319s.setVisibility(cardata.m1763n() || cardata.m1713A() ? 0 : 4);
            this.f8319s.setColorFilter(cardata.m1713A() ? -256 : -1513240);
        }
    }

    /* renamed from: y */
    public final void m4282y() {
        if (this.f8317q == null) {
            return;
        }
        float m1773s = this.f8295e.m1773s();
        if (m1773s < -90.0f) {
            this.f8317q.setText("--°C");
            return;
        }
        String replace = String.format(Locale.ENGLISH, "%.0f", Float.valueOf(m1773s)).replace(",", ".");
        SpannableString spannableString = new SpannableString(AbstractC0062j.m160n(replace, "°C"));
        spannableString.setSpan(AbstractC0062j.m155i(this.f8317q, -7829368, -1513240), 0, replace.length(), 33);
        this.f8317q.setText(spannableString);
    }

    /* renamed from: z */
    public final void m4283z() {
        if (this.f8323w == null) {
            return;
        }
        float max = Math.max(0.0f, this.f8295e.m1779y() / 1000.0f);
        TextView textView = this.f8323w;
        cfgData cfgdata = this.f8293d;
        textView.setTextColor(max > cfgdata.f2576U1 ? -65536 : max > cfgdata.f2572T1 ? -256 : -1513240);
        this.f8323w.setText(AbstractC1256E0.m2986A(max));
    }
}
