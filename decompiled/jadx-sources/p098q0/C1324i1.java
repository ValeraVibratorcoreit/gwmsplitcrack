package p098q0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.lifecycle.C0560y;
import androidx.lifecycle.InterfaceC0561z;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieListener;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.AbstractC0648p;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.media.CallState;
import com.altaysoft.t500_split.media.MediaInfoService;
import com.altaysoft.t500_split.radio.C0658d;
import com.altaysoft.t500_split.radio.RadioState;
import com.altaysoft.t500_split.splitinfo.AnalogClockView;
import com.altaysoft.t500_split.splitinfo.CompassDialView;
import com.altaysoft.t500_split.splitinfo.DigitalClockView;
import com.altaysoft.t500_split.splitinfo.HorizontalSwipeFrameLayout;
import com.altaysoft.t500_split.splitinfo.OemDigitClockView;
import com.altaysoft.t500_split.splitinfo.SkinAnalogClockView;
import com.altaysoft.t500_split.splitinfo.SplitChartsView;
import com.sun.jna.Platform;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p001A0.RunnableC0017k;
import p001A0.RunnableC0020n;
import p001A0.RunnableC0029w;
import p006C.AbstractC0062j;
import p034Q0.RunnableC0296m;
import p106t0.EnumC1457c;
import p109u0.AbstractC1561o;
import p118x0.C1646b;
import p118x0.C1650f;
import p118x0.C1653i;
import p118x0.C1660p;
import p118x0.C1667w;
import p118x0.C1669y;
import p118x0.C1670z;

/* renamed from: q0.i1 */
/* loaded from: classes.dex */
public final class C1324i1 {

    /* renamed from: e1 */
    public static final C1324i1[] f6151e1 = new C1324i1[2];

    /* renamed from: f1 */
    public static final int[] f6152f1 = {5, 10, 30, 60};

    /* renamed from: A */
    public Bitmap f6153A;

    /* renamed from: A0 */
    public DigitalClockView f6154A0;

    /* renamed from: B */
    public Bitmap f6155B;

    /* renamed from: B0 */
    public OemDigitClockView f6156B0;

    /* renamed from: C */
    public int f6157C;

    /* renamed from: C0 */
    public ImageView f6158C0;

    /* renamed from: D0 */
    public View f6160D0;

    /* renamed from: E */
    public TextView f6161E;

    /* renamed from: E0 */
    public TextView f6162E0;

    /* renamed from: F */
    public TextView f6163F;

    /* renamed from: F0 */
    public TextView f6164F0;

    /* renamed from: G */
    public TextView f6165G;

    /* renamed from: G0 */
    public C1653i f6166G0;

    /* renamed from: H */
    public TextView f6167H;

    /* renamed from: H0 */
    public C1646b f6168H0;

    /* renamed from: I */
    public TextView f6169I;

    /* renamed from: I0 */
    public String f6170I0;

    /* renamed from: J */
    public ProgressBar f6171J;

    /* renamed from: J0 */
    public boolean f6172J0;

    /* renamed from: K */
    public View f6173K;

    /* renamed from: K0 */
    public boolean f6174K0;

    /* renamed from: L */
    public ImageButton f6175L;

    /* renamed from: L0 */
    public boolean f6176L0;

    /* renamed from: M */
    public View f6177M;

    /* renamed from: N */
    public TextView f6179N;

    /* renamed from: N0 */
    public boolean f6180N0;

    /* renamed from: O */
    public TextView f6181O;

    /* renamed from: O0 */
    public int f6182O0;

    /* renamed from: P */
    public ImageView f6183P;

    /* renamed from: Q */
    public TextView f6185Q;

    /* renamed from: Q0 */
    public float f6186Q0;

    /* renamed from: R */
    public TextView f6187R;

    /* renamed from: S */
    public TextView f6189S;

    /* renamed from: T */
    public TextView f6191T;

    /* renamed from: T0 */
    public long f6192T0;

    /* renamed from: U */
    public TextView f6193U;

    /* renamed from: U0 */
    public long f6194U0;

    /* renamed from: V */
    public TextView f6195V;

    /* renamed from: V0 */
    public long f6196V0;

    /* renamed from: W */
    public TextView f6197W;

    /* renamed from: W0 */
    public boolean f6198W0;

    /* renamed from: X */
    public ImageView f6199X;

    /* renamed from: X0 */
    public final C1309d1 f6200X0;

    /* renamed from: Y */
    public ImageButton f6201Y;

    /* renamed from: Y0 */
    public final C1309d1 f6202Y0;

    /* renamed from: Z */
    public TextView f6203Z;

    /* renamed from: a */
    public final Context f6205a;

    /* renamed from: a0 */
    public ImageButton f6206a0;

    /* renamed from: b0 */
    public FrameLayout f6209b0;

    /* renamed from: c */
    public final int f6211c;

    /* renamed from: c0 */
    public LinearLayout f6212c0;

    /* renamed from: d */
    public WindowManager f6214d;

    /* renamed from: e */
    public View f6217e;

    /* renamed from: e0 */
    public SplitChartsView f6218e0;

    /* renamed from: f */
    public HorizontalSwipeFrameLayout f6219f;

    /* renamed from: f0 */
    public ToggleButton f6220f0;

    /* renamed from: g */
    public FrameLayout f6221g;

    /* renamed from: g0 */
    public ToggleButton f6222g0;

    /* renamed from: h */
    public TextView f6223h;

    /* renamed from: h0 */
    public ToggleButton f6224h0;

    /* renamed from: i */
    public TextView f6225i;

    /* renamed from: i0 */
    public Spinner f6226i0;

    /* renamed from: j */
    public GradientDrawable f6227j;

    /* renamed from: j0 */
    public ImageButton f6228j0;

    /* renamed from: k */
    public ValueAnimator f6229k;

    /* renamed from: k0 */
    public ImageButton f6230k0;

    /* renamed from: l */
    public int f6231l;

    /* renamed from: l0 */
    public TextView f6232l0;

    /* renamed from: m */
    public int f6233m;

    /* renamed from: m0 */
    public boolean f6234m0;

    /* renamed from: n0 */
    public ImageView f6236n0;

    /* renamed from: o0 */
    public int f6238o0;

    /* renamed from: p */
    public View f6239p;

    /* renamed from: p0 */
    public TextView f6240p0;

    /* renamed from: q */
    public View f6241q;

    /* renamed from: q0 */
    public LottieAnimationView f6242q0;

    /* renamed from: r */
    public View f6243r;

    /* renamed from: r0 */
    public TextView f6244r0;

    /* renamed from: s */
    public View f6245s;

    /* renamed from: s0 */
    public TextView f6246s0;

    /* renamed from: t */
    public View f6247t;

    /* renamed from: t0 */
    public TextView f6248t0;

    /* renamed from: u */
    public View f6249u;

    /* renamed from: u0 */
    public TextView f6250u0;

    /* renamed from: v */
    public View f6251v;

    /* renamed from: v0 */
    public TextView f6252v0;

    /* renamed from: w */
    public Spinner f6253w;

    /* renamed from: w0 */
    public TextView f6254w0;

    /* renamed from: x */
    public ImageView f6255x;

    /* renamed from: x0 */
    public TextView f6256x0;

    /* renamed from: y */
    public ImageView f6257y;

    /* renamed from: y0 */
    public AnalogClockView f6258y0;

    /* renamed from: z */
    public View f6259z;

    /* renamed from: z0 */
    public SkinAnalogClockView f6260z0;

    /* renamed from: b */
    public final Handler f6208b = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    public int f6235n = -1;

    /* renamed from: o */
    public int f6237o = -1;

    /* renamed from: D */
    public final ExecutorService f6159D = Executors.newSingleThreadExecutor();

    /* renamed from: d0 */
    public final TextView[] f6215d0 = new TextView[7];

    /* renamed from: M0 */
    public int f6178M0 = 0;

    /* renamed from: P0 */
    public int f6184P0 = -1;

    /* renamed from: R0 */
    public final ArrayList f6188R0 = new ArrayList();

    /* renamed from: S0 */
    public String f6190S0 = "";

    /* renamed from: Z0 */
    public final RunnableC1312e1 f6204Z0 = new RunnableC1312e1(this, 0);

    /* renamed from: a1 */
    public final RunnableC1312e1 f6207a1 = new RunnableC1312e1(this, 1);

    /* renamed from: b1 */
    public final RunnableC1312e1 f6210b1 = new RunnableC1312e1(this, 2);

    /* renamed from: c1 */
    public final RunnableC1312e1 f6213c1 = new RunnableC1312e1(this, 3);

    /* renamed from: d1 */
    public final RunnableC1312e1 f6216d1 = new RunnableC1312e1(this, 4);

    /* JADX WARN: Type inference failed for: r0v4, types: [q0.d1] */
    /* JADX WARN: Type inference failed for: r0v5, types: [q0.d1] */
    public C1324i1(MainActivity mainActivity, int i) {
        final int i2 = 0;
        this.f6200X0 = new InterfaceC0561z(this) { // from class: q0.d1

            /* renamed from: b */
            public final /* synthetic */ C1324i1 f6083b;

            {
                this.f6083b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f6083b.m3216b((C0636d) obj);
                        break;
                    default:
                        this.f6083b.m3218d((C0658d) obj);
                        break;
                }
            }
        };
        final int i3 = 1;
        this.f6202Y0 = new InterfaceC0561z(this) { // from class: q0.d1

            /* renamed from: b */
            public final /* synthetic */ C1324i1 f6083b;

            {
                this.f6083b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        this.f6083b.m3216b((C0636d) obj);
                        break;
                    default:
                        this.f6083b.m3218d((C0658d) obj);
                        break;
                }
            }
        };
        this.f6205a = mainActivity.getApplicationContext();
        this.f6211c = i == 1 ? 1 : 0;
    }

    /* renamed from: k */
    public static String m3192k(long j2) {
        if (j2 <= 0) {
            return "0:00";
        }
        long j3 = j2 / 1000;
        long j4 = j3 / 60;
        long j5 = j3 % 60;
        StringBuilder sb = new StringBuilder();
        sb.append(j4);
        sb.append(":");
        sb.append(j5 < 10 ? "0" : "");
        sb.append(j5);
        return sb.toString();
    }

    /* renamed from: l */
    public static C1324i1 m3193l(MainActivity mainActivity, int i) {
        int i2 = i != 1 ? 0 : 1;
        C1324i1[] c1324i1Arr = f6151e1;
        if (c1324i1Arr[i2] == null) {
            c1324i1Arr[i2] = new C1324i1(mainActivity, i2);
        }
        return c1324i1Arr[i2];
    }

    /* renamed from: y */
    public static void m3194y(boolean z2) {
        C1324i1[] c1324i1Arr = f6151e1;
        for (int i = 0; i < 2; i++) {
            C1324i1 c1324i1 = c1324i1Arr[i];
            if (c1324i1 != null) {
                c1324i1.f6208b.post(new RunnableC0029w(c1324i1, z2, 4));
            }
        }
    }

    /* renamed from: A */
    public final void m3195A(int i, int i2, int i3) {
        EnumC1457c enumC1457c;
        int i4 = 2;
        int i5 = 8;
        int i6 = 4;
        int i7 = 7;
        final int i8 = 1;
        final int i9 = 0;
        Context context = this.f6205a;
        if (!cfgData.m1784i().f2545M2 || cfgData.m1784i().f2549N2) {
            m3225m();
            return;
        }
        if (this.f6172J0) {
            m3206L(i, i2, i3);
            m3219e();
            m3216b(C0639g.m1872x().m1880u());
            m3218d(RadioState.getInstance().current());
            m3233u();
            C1660p.m4812a().m4814c();
            return;
        }
        try {
            MediaInfoService mediaInfoService = MediaInfoService.f2973o;
            context.startService(new Intent(context, (Class<?>) MediaInfoService.class));
            RadioState.getInstance().start(context);
            C1660p.m4812a().m4814c();
            cfgData m1784i = cfgData.m1784i();
            this.f6214d = (WindowManager) context.getSystemService("window");
            View inflate = LayoutInflater.from(new ContextThemeWrapper(context, R.style.Theme_T500_Split)).inflate(R.layout.split_info_overlay, (ViewGroup) null);
            this.f6217e = inflate;
            this.f6239p = inflate.findViewById(R.id.split_info_page_music);
            this.f6241q = this.f6217e.findViewById(R.id.split_info_page_radio);
            this.f6243r = this.f6217e.findViewById(R.id.split_info_page_charts);
            this.f6245s = this.f6217e.findViewById(R.id.split_info_page_weather);
            this.f6247t = this.f6217e.findViewById(R.id.split_info_page_clock);
            this.f6249u = this.f6217e.findViewById(R.id.split_info_page_offroad);
            this.f6251v = this.f6217e.findViewById(R.id.split_info_page_fuel);
            this.f6219f = (HorizontalSwipeFrameLayout) this.f6217e.findViewById(R.id.split_info_pages);
            this.f6253w = (Spinner) this.f6217e.findViewById(R.id.split_info_source);
            this.f6255x = (ImageView) this.f6217e.findViewById(R.id.music_info_art);
            this.f6257y = (ImageView) this.f6217e.findViewById(R.id.music_info_backdrop);
            this.f6259z = this.f6217e.findViewById(R.id.music_info_backdrop_scrim);
            this.f6161E = (TextView) this.f6217e.findViewById(R.id.music_info_title);
            this.f6163F = (TextView) this.f6217e.findViewById(R.id.music_info_artist);
            this.f6165G = (TextView) this.f6217e.findViewById(R.id.music_info_album);
            this.f6167H = (TextView) this.f6217e.findViewById(R.id.music_info_pos);
            this.f6169I = (TextView) this.f6217e.findViewById(R.id.music_info_dur);
            this.f6171J = (ProgressBar) this.f6217e.findViewById(R.id.music_info_progress);
            this.f6173K = this.f6217e.findViewById(R.id.music_info_progress_row);
            ImageView imageView = this.f6255x;
            if (imageView != null) {
                imageView.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: q0.X0

                    /* renamed from: b */
                    public final /* synthetic */ C1324i1 f6038b;

                    {
                        this.f6038b = this;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        switch (i9) {
                            case 0:
                                this.f6038b.m3203I();
                                break;
                            default:
                                int i18 = i12 - i10;
                                int i19 = i16 - i14;
                                C1324i1 c1324i1 = this.f6038b;
                                if (i18 == i19) {
                                    c1324i1.getClass();
                                    break;
                                } else {
                                    c1324i1.m3196B();
                                    break;
                                }
                        }
                    }
                });
            }
            this.f6175L = (ImageButton) this.f6217e.findViewById(R.id.music_info_play);
            this.f6177M = this.f6217e.findViewById(R.id.music_info_ym_modes);
            this.f6179N = (TextView) this.f6217e.findViewById(R.id.music_info_ym_wave);
            this.f6181O = (TextView) this.f6217e.findViewById(R.id.music_info_ym_likes);
            TextView textView = this.f6179N;
            if (textView != null) {
                textView.setOnClickListener(new ViewOnClickListenerC1295Y0(this, i6));
            }
            TextView textView2 = this.f6181O;
            if (textView2 != null) {
                textView2.setOnClickListener(new ViewOnClickListenerC1295Y0(this, i7));
            }
            ImageView imageView2 = (ImageView) this.f6217e.findViewById(R.id.music_info_ym_heart);
            this.f6183P = imageView2;
            ArrayList arrayList = AbstractC0641i.f3014a;
            if (imageView2 != null) {
                AbstractC0641i.m1893j(imageView2);
            }
            this.f6185Q = (TextView) this.f6217e.findViewById(R.id.radio_info_freq);
            this.f6187R = (TextView) this.f6217e.findViewById(R.id.radio_info_band);
            this.f6189S = (TextView) this.f6217e.findViewById(R.id.radio_info_unit);
            this.f6191T = (TextView) this.f6217e.findViewById(R.id.radio_info_ps);
            this.f6193U = (TextView) this.f6217e.findViewById(R.id.radio_info_status);
            this.f6195V = (TextView) this.f6217e.findViewById(R.id.radio_info_fm);
            this.f6197W = (TextView) this.f6217e.findViewById(R.id.radio_info_am);
            this.f6199X = (ImageView) this.f6217e.findViewById(R.id.radio_info_fav);
            this.f6201Y = (ImageButton) this.f6217e.findViewById(R.id.radio_info_play);
            this.f6203Z = (TextView) this.f6217e.findViewById(R.id.split_info_page_name);
            this.f6218e0 = (SplitChartsView) this.f6217e.findViewById(R.id.split_info_charts);
            this.f6220f0 = (ToggleButton) this.f6217e.findViewById(R.id.chart_tog_spd);
            this.f6222g0 = (ToggleButton) this.f6217e.findViewById(R.id.chart_tog_rpm);
            this.f6224h0 = (ToggleButton) this.f6217e.findViewById(R.id.chart_tog_gear);
            this.f6226i0 = (Spinner) this.f6217e.findViewById(R.id.chart_window_spinner);
            this.f6228j0 = (ImageButton) this.f6217e.findViewById(R.id.chart_fullscreen_btn);
            this.f6230k0 = (ImageButton) this.f6217e.findViewById(R.id.weather_fullscreen_btn);
            this.f6232l0 = (TextView) this.f6217e.findViewById(R.id.weather_refresh_btn);
            ImageView imageView3 = (ImageView) this.f6217e.findViewById(R.id.weather_page_bg);
            this.f6236n0 = imageView3;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new View.OnLayoutChangeListener(this) { // from class: q0.X0

                    /* renamed from: b */
                    public final /* synthetic */ C1324i1 f6038b;

                    {
                        this.f6038b = this;
                    }

                    @Override // android.view.View.OnLayoutChangeListener
                    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                        switch (i8) {
                            case 0:
                                this.f6038b.m3203I();
                                break;
                            default:
                                int i18 = i12 - i10;
                                int i19 = i16 - i14;
                                C1324i1 c1324i1 = this.f6038b;
                                if (i18 == i19) {
                                    c1324i1.getClass();
                                    break;
                                } else {
                                    c1324i1.m3196B();
                                    break;
                                }
                        }
                    }
                });
            }
            this.f6240p0 = (TextView) this.f6217e.findViewById(R.id.weather_now_temp);
            this.f6242q0 = (LottieAnimationView) this.f6217e.findViewById(R.id.weather_now_icon);
            this.f6244r0 = (TextView) this.f6217e.findViewById(R.id.weather_now_desc);
            this.f6246s0 = (TextView) this.f6217e.findViewById(R.id.weather_now_meta);
            this.f6248t0 = (TextView) this.f6217e.findViewById(R.id.weather_place);
            this.f6250u0 = (TextView) this.f6217e.findViewById(R.id.weather_today_range);
            this.f6252v0 = (TextView) this.f6217e.findViewById(R.id.weather_forecast);
            this.f6254w0 = (TextView) this.f6217e.findViewById(R.id.weather_updated);
            this.f6256x0 = (TextView) this.f6217e.findViewById(R.id.weather_status);
            this.f6258y0 = (AnalogClockView) this.f6217e.findViewById(R.id.split_info_clock_analog);
            this.f6260z0 = (SkinAnalogClockView) this.f6217e.findViewById(R.id.split_info_clock_skin);
            this.f6154A0 = (DigitalClockView) this.f6217e.findViewById(R.id.split_info_clock_digital);
            this.f6156B0 = (OemDigitClockView) this.f6217e.findViewById(R.id.split_info_clock_oem);
            this.f6158C0 = (ImageView) this.f6217e.findViewById(R.id.split_info_oem_backdrop);
            this.f6160D0 = this.f6217e.findViewById(R.id.split_info_content);
            this.f6162E0 = (TextView) this.f6217e.findViewById(R.id.split_info_clock_weekday);
            this.f6164F0 = (TextView) this.f6217e.findViewById(R.id.clock_style_name);
            C1653i c1653i = new C1653i(context);
            this.f6166G0 = c1653i;
            c1653i.m4800c((CompassDialView) this.f6217e.findViewById(R.id.split_info_offroad_compass), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_tilt_side), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_tilt_behind), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_label_side), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_label_behind), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_icon_baro), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_icon_alt), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_tyre_fl), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_tyre_fr), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_tyre_rl), (ImageView) this.f6217e.findViewById(R.id.split_info_offroad_tyre_rr), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_baro), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_alt), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_steer_angle), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_p_fl), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_t_fl), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_p_fr), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_t_fr), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_p_rl), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_t_rl), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_p_rr), (TextView) this.f6217e.findViewById(R.id.split_info_offroad_t_rr));
            C1646b c1646b = new C1646b(context);
            this.f6168H0 = c1646b;
            c1646b.m4786d(this.f6251v);
            Button button = (Button) this.f6217e.findViewById(R.id.clock_style_prev);
            Button button2 = (Button) this.f6217e.findViewById(R.id.clock_style_next);
            ImageButton imageButton = (ImageButton) this.f6217e.findViewById(R.id.music_info_prev);
            ImageButton imageButton2 = (ImageButton) this.f6217e.findViewById(R.id.music_info_next);
            Button button3 = (Button) this.f6217e.findViewById(R.id.split_info_page_prev);
            Button button4 = (Button) this.f6217e.findViewById(R.id.split_info_page_next);
            if (imageButton != null) {
                imageButton.setOnClickListener(new ViewOnClickListenerC1295Y0(this, i5));
            }
            ImageButton imageButton3 = this.f6175L;
            if (imageButton3 != null) {
                imageButton3.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 9));
            }
            ImageView imageView4 = this.f6255x;
            if (imageView4 != null) {
                imageView4.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 10));
            }
            if (imageButton2 != null) {
                imageButton2.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 11));
            }
            ImageButton imageButton4 = (ImageButton) this.f6217e.findViewById(R.id.radio_info_prev);
            ImageButton imageButton5 = (ImageButton) this.f6217e.findViewById(R.id.radio_info_next);
            ImageButton imageButton6 = (ImageButton) this.f6217e.findViewById(R.id.radio_info_seek_down);
            ImageButton imageButton7 = (ImageButton) this.f6217e.findViewById(R.id.radio_info_seek_up);
            if (imageButton4 != null) {
                imageButton4.setOnClickListener(new ViewOnClickListenerC1278P0(i7));
            }
            ImageButton imageButton8 = this.f6201Y;
            if (imageButton8 != null) {
                imageButton8.setOnClickListener(new ViewOnClickListenerC1278P0(i5));
            }
            View findViewById = this.f6217e.findViewById(R.id.radio_info_display);
            if (findViewById != null) {
                findViewById.setOnClickListener(new ViewOnClickListenerC1278P0(i8));
            }
            if (imageButton5 != null) {
                imageButton5.setOnClickListener(new ViewOnClickListenerC1278P0(i4));
            }
            if (imageButton6 != null) {
                imageButton6.setOnClickListener(new ViewOnClickListenerC1278P0(3));
            }
            if (imageButton7 != null) {
                imageButton7.setOnClickListener(new ViewOnClickListenerC1278P0(4));
            }
            TextView textView3 = this.f6195V;
            if (textView3 != null) {
                textView3.setOnClickListener(new ViewOnClickListenerC1278P0(5));
            }
            TextView textView4 = this.f6197W;
            if (textView4 != null) {
                textView4.setOnClickListener(new ViewOnClickListenerC1278P0(6));
            }
            if (button3 != null) {
                button3.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 0));
            }
            if (button4 != null) {
                button4.setOnClickListener(new ViewOnClickListenerC1295Y0(this, i8));
            }
            if (button != null) {
                button.setOnClickListener(new ViewOnClickListenerC1295Y0(this, i4));
            }
            if (button2 != null) {
                button2.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 3));
            }
            m3213S();
            m3212R();
            ProgressBar progressBar = this.f6171J;
            if (progressBar != null) {
                progressBar.setMax(1000);
            }
            m3214T();
            m3210P();
            ImageButton imageButton9 = this.f6230k0;
            if (imageButton9 != null) {
                imageButton9.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 5));
            }
            TextView textView5 = this.f6232l0;
            if (textView5 != null) {
                textView5.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 6));
            }
            m3211Q();
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(Math.max(1, 600), Math.max(1, i3), 2038, 808, -3);
            layoutParams.gravity = 8388659;
            int m2990E = i - AbstractC1256E0.m2990E(m1784i);
            if (m1784i != null && (enumC1457c = m1784i.f2543M0) != null && enumC1457c.f7155n) {
                m2990E += 15;
            }
            layoutParams.x = m2990E;
            layoutParams.y = i2;
            this.f6214d.addView(this.f6217e, layoutParams);
            this.f6172J0 = true;
            C1287U0.m3103p();
            cfgData m1784i2 = cfgData.m1784i();
            m3227o(m1784i2);
            int i10 = this.f6211c == 1 ? m1784i2.f2637h3 : m1784i2.f2632g3;
            if (i10 >= 0) {
                if (i10 >= 7) {
                }
                m3237z(i10, 0);
                ((C0560y) C0639g.m1872x().f3011g).m1397f(this.f6200X0);
                m3216b(C0639g.m1872x().m1880u());
                RadioState.getInstance().observeForever(this.f6202Y0);
                m3218d(RadioState.getInstance().current());
                m3233u();
                Handler handler = this.f6208b;
                RunnableC1312e1 runnableC1312e1 = this.f6204Z0;
                handler.removeCallbacks(runnableC1312e1);
                handler.post(runnableC1312e1);
                RunnableC1312e1 runnableC1312e12 = this.f6207a1;
                handler.removeCallbacks(runnableC1312e12);
                handler.postDelayed(runnableC1312e12, 2000L);
                RunnableC1312e1 runnableC1312e13 = this.f6210b1;
                handler.removeCallbacks(runnableC1312e13);
                handler.post(runnableC1312e13);
                m3234v(false);
                C1670z.m4822d(context).m4833k(new C1300a1(this, 0));
                RunnableC1312e1 runnableC1312e14 = this.f6213c1;
                handler.removeCallbacks(runnableC1312e14);
                handler.postDelayed(runnableC1312e14, 900000L);
                RunnableC1312e1 runnableC1312e15 = this.f6216d1;
                handler.removeCallbacks(runnableC1312e15);
                handler.post(runnableC1312e15);
            }
            i10 = 0;
            m3237z(i10, 0);
            ((C0560y) C0639g.m1872x().f3011g).m1397f(this.f6200X0);
            m3216b(C0639g.m1872x().m1880u());
            RadioState.getInstance().observeForever(this.f6202Y0);
            m3218d(RadioState.getInstance().current());
            m3233u();
            Handler handler2 = this.f6208b;
            RunnableC1312e1 runnableC1312e16 = this.f6204Z0;
            handler2.removeCallbacks(runnableC1312e16);
            handler2.post(runnableC1312e16);
            RunnableC1312e1 runnableC1312e122 = this.f6207a1;
            handler2.removeCallbacks(runnableC1312e122);
            handler2.postDelayed(runnableC1312e122, 2000L);
            RunnableC1312e1 runnableC1312e132 = this.f6210b1;
            handler2.removeCallbacks(runnableC1312e132);
            handler2.post(runnableC1312e132);
            m3234v(false);
            C1670z.m4822d(context).m4833k(new C1300a1(this, 0));
            RunnableC1312e1 runnableC1312e142 = this.f6213c1;
            handler2.removeCallbacks(runnableC1312e142);
            handler2.postDelayed(runnableC1312e142, 900000L);
            RunnableC1312e1 runnableC1312e152 = this.f6216d1;
            handler2.removeCallbacks(runnableC1312e152);
            handler2.post(runnableC1312e152);
        } catch (Throwable unused) {
            m3225m();
        }
    }

    /* renamed from: B */
    public final void m3196B() {
        Drawable drawable;
        int width;
        ImageView imageView = this.f6236n0;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0 || (width = this.f6236n0.getWidth()) <= 0) {
            return;
        }
        int round = Math.round((width * intrinsicHeight) / intrinsicWidth);
        ViewGroup.LayoutParams layoutParams = this.f6236n0.getLayoutParams();
        if (layoutParams == null || layoutParams.height == round) {
            return;
        }
        layoutParams.height = round;
        this.f6236n0.setLayoutParams(layoutParams);
    }

    /* renamed from: C */
    public final void m3197C() {
        View m3230r;
        View m3230r2 = m3230r(this.f6178M0);
        if (m3230r2 != null) {
            m3230r2.animate().cancel();
            m3230r2.animate().translationX(0.0f).alpha(1.0f).setDuration(180L).start();
        }
        int i = this.f6184P0;
        if (i >= 0 && i != this.f6178M0 && (m3230r = m3230r(i)) != null) {
            float f2 = this.f6182O0 > 0 ? this.f6186Q0 : -this.f6186Q0;
            m3230r.animate().cancel();
            m3230r.animate().translationX(f2).setDuration(180L).withEndAction(new RunnableC0296m(m3230r, 4)).start();
        }
        this.f6184P0 = -1;
        this.f6182O0 = 0;
    }

    /* renamed from: D */
    public final void m3198D(int i) {
        int i2 = 0;
        int[] iArr = {0, 1, 2, 3, 9, 4, 5, 6, 7, 8, 10, 11};
        int m1793m = cfgData.m1784i().m1793m(this.f6211c);
        if (m1793m < 0 || m1793m > 11) {
            m1793m = 0;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 12) {
                break;
            }
            if (iArr[i3] == m1793m) {
                i2 = i3;
                break;
            }
            i3++;
        }
        m3215a(iArr[(((i2 + i) % 12) + 12) % 12], true);
    }

    /* renamed from: E */
    public final void m3199E() {
        View view;
        boolean z2 = false;
        boolean z3 = this.f6172J0 && this.f6178M0 == 4 && (view = this.f6217e) != null && view.getVisibility() == 0;
        int m1793m = cfgData.m1784i().m1793m(this.f6211c);
        boolean z4 = m1793m == 0;
        boolean z5 = (m1793m >= 4 && m1793m <= 8) || m1793m == 10 || m1793m == 11;
        boolean z6 = m1793m == 1 || m1793m == 2;
        boolean z7 = m1793m == 3 || m1793m == 9;
        AnalogClockView analogClockView = this.f6258y0;
        if (analogClockView != null) {
            analogClockView.setRunning(z3 && z4);
        }
        SkinAnalogClockView skinAnalogClockView = this.f6260z0;
        if (skinAnalogClockView != null) {
            skinAnalogClockView.setRunning(z3 && z5);
        }
        DigitalClockView digitalClockView = this.f6154A0;
        if (digitalClockView != null) {
            digitalClockView.setRunning(z3 && z6);
        }
        OemDigitClockView oemDigitClockView = this.f6156B0;
        if (oemDigitClockView != null) {
            if (z3 && z7) {
                z2 = true;
            }
            oemDigitClockView.setRunning(z2);
        }
    }

    /* renamed from: F */
    public final void m3200F() {
        C1646b c1646b = this.f6168H0;
        if (c1646b == null) {
            return;
        }
        int i = this.f6178M0;
        RunnableC0020n runnableC0020n = c1646b.f9332D;
        Handler handler = c1646b.f9334b;
        if (i != 6 || !this.f6172J0) {
            c1646b.f9330B = false;
            handler.removeCallbacks(runnableC0020n);
        } else {
            if (c1646b.f9330B) {
                c1646b.m4788k();
                return;
            }
            c1646b.f9330B = true;
            c1646b.m4787g();
            handler.removeCallbacks(runnableC0020n);
            handler.post(runnableC0020n);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0011, code lost:
    
        if (r0 != 6) goto L12;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* renamed from: G */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3201G() {
        boolean z2;
        ImageView imageView;
        View view;
        if (this.f6172J0) {
            int i = this.f6178M0;
            z2 = true;
            if (i != 4) {
                if (i != 1) {
                    if (i != 5) {
                    }
                }
            }
            imageView = this.f6158C0;
            if (imageView != null) {
                if (z2) {
                    imageView.setImageResource(R.drawable.oem_card_time_bg);
                    this.f6158C0.setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                }
            }
            view = this.f6160D0;
            if (view == null) {
                if (z2) {
                    view.setBackgroundColor(0);
                    return;
                } else {
                    view.setBackgroundResource(R.color.split_info_bg);
                    return;
                }
            }
            return;
        }
        z2 = false;
        imageView = this.f6158C0;
        if (imageView != null) {
        }
        view = this.f6160D0;
        if (view == null) {
        }
    }

    /* renamed from: H */
    public final void m3202H() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        Bitmap bitmap4;
        final C1653i c1653i = this.f6166G0;
        if (c1653i == null) {
            return;
        }
        if (!this.f6172J0) {
            c1653i.m4805j();
            if (c1653i.f9390A) {
                c1653i.f9390A = false;
                try {
                    NativeLib.nativeUnbindPanel();
                    return;
                } catch (Throwable unused) {
                    return;
                }
            }
            return;
        }
        if (this.f6178M0 != 5) {
            c1653i.m4805j();
            return;
        }
        if (!c1653i.f9390A) {
            try {
                NativeLib.nativeBindPanel(c1653i.f9408a);
                c1653i.f9390A = true;
            } catch (Throwable unused2) {
            }
        }
        if (c1653i.f9391B) {
            c1653i.m4807l();
            ImageView imageView = c1653i.f9412e;
            if (imageView != null && (bitmap4 = c1653i.f9395F) != null) {
                imageView.setImageBitmap(bitmap4);
            }
            ImageView imageView2 = c1653i.f9413f;
            if (imageView2 != null && (bitmap3 = c1653i.f9396G) != null) {
                imageView2.setImageBitmap(bitmap3);
            }
            ImageView imageView3 = c1653i.f9416i;
            PorterDuffColorFilter porterDuffColorFilter = c1653i.f9410c;
            if (imageView3 != null && (bitmap2 = c1653i.f9397H) != null) {
                imageView3.setImageBitmap(bitmap2);
                c1653i.f9416i.setColorFilter(porterDuffColorFilter);
            }
            ImageView imageView4 = c1653i.f9417j;
            if (imageView4 != null && (bitmap = c1653i.f9398I) != null) {
                imageView4.setImageBitmap(bitmap);
                c1653i.f9417j.setColorFilter(porterDuffColorFilter);
            }
            Bitmap bitmap5 = c1653i.f9399J;
            if (bitmap5 != null) {
                ImageView imageView5 = c1653i.f9418k;
                if (imageView5 != null) {
                    imageView5.setImageBitmap(bitmap5);
                }
                ImageView imageView6 = c1653i.f9420m;
                if (imageView6 != null) {
                    imageView6.setImageBitmap(c1653i.f9399J);
                }
            }
            Bitmap bitmap6 = c1653i.f9400K;
            if (bitmap6 != null) {
                ImageView imageView7 = c1653i.f9419l;
                if (imageView7 != null) {
                    imageView7.setImageBitmap(bitmap6);
                }
                ImageView imageView8 = c1653i.f9421n;
                if (imageView8 != null) {
                    imageView8.setImageBitmap(c1653i.f9400K);
                }
            }
        } else {
            final int i = 6;
            c1653i.m4801f("themes/offroad/offroad_compass_bg.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i2 = 7;
            c1653i.m4801f("themes/offroad/offroad_compass_disc.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i2) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i3 = 8;
            c1653i.m4801f("themes/offroad/offroad_compass_pointer.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i3) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i4 = 0;
            c1653i.m4801f("themes/offroad/offroad_slope_side.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i4) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i5 = 1;
            c1653i.m4801f("themes/offroad/offroad_slope_behind.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i5) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i6 = 2;
            c1653i.m4801f("themes/offroad/offroad_kpa.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i6) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i7 = 3;
            c1653i.m4801f("themes/offroad/offroad_elevation.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i7) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i8 = 4;
            c1653i.m4801f("themes/offroad/offroad_tyre_l.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i8) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            final int i9 = 5;
            c1653i.m4801f("themes/offroad/offroad_tyre_r.bin", new InterfaceC1351r1() { // from class: x0.g
                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap7) {
                    switch (i9) {
                        case 0:
                            C1653i c1653i2 = c1653i;
                            c1653i2.f9395F = bitmap7;
                            ImageView imageView9 = c1653i2.f9412e;
                            if (imageView9 != null) {
                                imageView9.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 1:
                            C1653i c1653i3 = c1653i;
                            c1653i3.f9396G = bitmap7;
                            ImageView imageView10 = c1653i3.f9413f;
                            if (imageView10 != null) {
                                imageView10.setImageBitmap(bitmap7);
                                break;
                            }
                            break;
                        case 2:
                            C1653i c1653i4 = c1653i;
                            c1653i4.f9397H = bitmap7;
                            ImageView imageView11 = c1653i4.f9416i;
                            if (imageView11 != null) {
                                imageView11.setImageBitmap(bitmap7);
                                c1653i4.f9416i.setColorFilter(c1653i4.f9410c);
                                break;
                            }
                            break;
                        case 3:
                            C1653i c1653i5 = c1653i;
                            c1653i5.f9398I = bitmap7;
                            ImageView imageView12 = c1653i5.f9417j;
                            if (imageView12 != null) {
                                imageView12.setImageBitmap(bitmap7);
                                c1653i5.f9417j.setColorFilter(c1653i5.f9410c);
                                break;
                            }
                            break;
                        case 4:
                            C1653i c1653i6 = c1653i;
                            c1653i6.f9399J = bitmap7;
                            ImageView imageView13 = c1653i6.f9418k;
                            if (imageView13 != null) {
                                imageView13.setImageBitmap(bitmap7);
                            }
                            ImageView imageView14 = c1653i6.f9420m;
                            if (imageView14 != null) {
                                imageView14.setImageBitmap(c1653i6.f9399J);
                                break;
                            }
                            break;
                        case 5:
                            C1653i c1653i7 = c1653i;
                            c1653i7.f9400K = bitmap7;
                            ImageView imageView15 = c1653i7.f9419l;
                            if (imageView15 != null) {
                                imageView15.setImageBitmap(bitmap7);
                            }
                            ImageView imageView16 = c1653i7.f9421n;
                            if (imageView16 != null) {
                                imageView16.setImageBitmap(c1653i7.f9400K);
                                break;
                            }
                            break;
                        case 6:
                            C1653i c1653i8 = c1653i;
                            c1653i8.f9392C = bitmap7;
                            c1653i8.m4807l();
                            break;
                        case 7:
                            C1653i c1653i9 = c1653i;
                            c1653i9.f9393D = bitmap7;
                            c1653i9.m4807l();
                            break;
                        default:
                            C1653i c1653i10 = c1653i;
                            c1653i10.f9394E = bitmap7;
                            c1653i10.m4807l();
                            break;
                    }
                }
            });
            c1653i.f9391B = true;
        }
        boolean z2 = c1653i.f9433z;
        C1650f c1650f = c1653i.f9403N;
        C1650f c1650f2 = c1653i.f9402M;
        C1650f c1650f3 = c1653i.f9401L;
        if (!z2) {
            c1653i.f9433z = true;
            carData cardata = carData.getInstance();
            cardata.f2440d1.m1397f(c1650f3);
            cardata.f2443e1.m1397f(c1650f2);
            cardata.f2446f1.m1397f(c1650f);
            cardata.f2407P.m1397f(c1653i.f9404O);
            cardata.f2405O.m1397f(c1653i.f9405P);
            cardata.f2409Q.m1397f(c1653i.f9406Q);
            C0560y c0560y = cardata.f2389G;
            C1650f c1650f4 = c1653i.f9407R;
            c0560y.m1397f(c1650f4);
            cardata.f2391H.m1397f(c1650f4);
            cardata.f2393I.m1397f(c1650f4);
            cardata.f2395J.m1397f(c1650f4);
            cardata.f2397K.m1397f(c1650f4);
            cardata.f2399L.m1397f(c1650f4);
            cardata.f2401M.m1397f(c1650f4);
            cardata.f2403N.m1397f(c1650f4);
        }
        carData cardata2 = carData.getInstance();
        Float f2 = (Float) cardata2.f2440d1.m1395d();
        c1650f3.mo1100a(Float.valueOf(f2 != null ? f2.floatValue() : 0.0f));
        Float f3 = (Float) cardata2.f2443e1.m1395d();
        c1650f2.mo1100a(Float.valueOf(f3 != null ? f3.floatValue() : 0.0f));
        c1650f.mo1100a(Float.valueOf(cardata2.m1751h()));
        Float f4 = (Float) cardata2.f2407P.m1395d();
        f4.floatValue();
        c1653i.m4803h(f4);
        if (((Float) cardata2.f2407P.m1395d()).floatValue() <= 0.0f) {
            Float f5 = (Float) cardata2.f2405O.m1395d();
            f5.floatValue();
            c1653i.m4802g(f5);
        }
        Float f6 = (Float) cardata2.f2409Q.m1395d();
        c1653i.m4804i(Float.valueOf(f6 != null ? f6.floatValue() : 0.0f));
        c1653i.m4806k();
    }

    /* renamed from: I */
    public final void m3203I() {
        ImageView imageView;
        if (this.f6173K == null || (imageView = this.f6255x) == null) {
            return;
        }
        int width = imageView.getWidth();
        int height = this.f6255x.getHeight();
        int i = 0;
        if (width <= 0 || height <= 0) {
            View view = this.f6173K;
            view.setPadding(0, view.getPaddingTop(), 0, this.f6173K.getPaddingBottom());
            return;
        }
        Drawable drawable = this.f6255x.getDrawable();
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                Matrix imageMatrix = this.f6255x.getImageMatrix();
                float f2 = intrinsicWidth;
                float f3 = intrinsicHeight;
                RectF rectF = new RectF(0.0f, 0.0f, f2, f3);
                RectF rectF2 = new RectF();
                imageMatrix.mapRect(rectF2, rectF);
                int round = Math.round(rectF2.width());
                if (round <= 0) {
                    round = Math.round(Math.min(width / f2, height / f3) * f2);
                }
                i = Math.max(0, (width - round) / 2);
            }
        }
        View view2 = this.f6173K;
        view2.setPadding(i, view2.getPaddingTop(), i, this.f6173K.getPaddingBottom());
    }

    /* renamed from: J */
    public final void m3204J() {
        if (this.f6242q0 == null) {
            return;
        }
        View view = this.f6217e;
        boolean z2 = view != null && view.getVisibility() == 0;
        if (this.f6172J0 && z2 && this.f6178M0 == 3 && this.f6170I0 != null) {
            if (this.f6242q0.isAnimating()) {
                return;
            }
            this.f6242q0.playAnimation();
        } else if (this.f6242q0.isAnimating()) {
            this.f6242q0.pauseAnimation();
        }
    }

    /* renamed from: K */
    public final void m3205K() {
        Locale locale = this.f6205a.getResources().getConfiguration().getLocales().get(0);
        Date date = new Date();
        if (this.f6162E0 != null) {
            String format = new SimpleDateFormat("EEEE", locale).format(date);
            String format2 = DateFormat.getDateInstance(1, locale).format(date);
            this.f6162E0.setText(format + ", " + format2);
        }
    }

    /* renamed from: L */
    public final void m3206L(int i, int i2, int i3) {
        EnumC1457c enumC1457c;
        if (this.f6217e == null || this.f6214d == null) {
            return;
        }
        try {
            cfgData m1784i = cfgData.m1784i();
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) this.f6217e.getLayoutParams();
            layoutParams.width = Math.max(1, 600);
            layoutParams.height = Math.max(1, i3);
            int m2990E = i - AbstractC1256E0.m2990E(m1784i);
            if (m1784i != null && (enumC1457c = m1784i.f2543M0) != null && enumC1457c.f7155n) {
                m2990E += 15;
            }
            layoutParams.x = m2990E;
            layoutParams.y = i2;
            this.f6214d.updateViewLayout(this.f6217e, layoutParams);
            m3196B();
        } catch (Throwable unused) {
        }
    }

    /* renamed from: M */
    public final void m3207M() {
        TextView textView = this.f6203Z;
        if (textView == null) {
            return;
        }
        int i = this.f6178M0;
        textView.setText(this.f6205a.getString(i == 1 ? R.string.split_info_page_radio : i == 2 ? R.string.split_info_page_charts : i == 3 ? R.string.split_info_page_weather : i == 4 ? R.string.split_info_page_clock : i == 5 ? R.string.split_info_page_offroad : i == 6 ? R.string.split_info_page_fuel : R.string.split_info_page_music) + " (" + (this.f6178M0 + 1) + "/7)");
    }

    /* renamed from: N */
    public final void m3208N() {
        long j2 = this.f6194U0;
        if (this.f6198W0 && this.f6192T0 > 0) {
            j2 += SystemClock.elapsedRealtime() - this.f6196V0;
            long j3 = this.f6192T0;
            if (j2 > j3) {
                j2 = j3;
            }
        }
        TextView textView = this.f6167H;
        if (textView != null) {
            textView.setText(m3192k(j2));
        }
        TextView textView2 = this.f6169I;
        if (textView2 != null) {
            textView2.setText(m3192k(this.f6192T0));
        }
        if (this.f6171J != null) {
            long j4 = this.f6192T0;
            this.f6171J.setProgress(j4 > 0 ? (int) Math.min(1000L, (j2 * 1000) / j4) : 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* renamed from: O */
    public final void m3209O() {
        boolean z2;
        if (this.f6177M == null) {
            return;
        }
        cfgData m1784i = cfgData.m1784i();
        String[] strArr = AbstractC0648p.f3051a;
        if (!(m1784i != null && m1784i.f2666n2)) {
            this.f6177M.setVisibility(8);
            return;
        }
        String str = AbstractC0638f.f3008b;
        if (str == null || str.isEmpty()) {
            if (!AbstractC0648p.m1910c(C0639g.m1872x().m1880u().f2995a)) {
                Iterator it = AbstractC0638f.m1865n(this.f6205a).iterator();
                while (it.hasNext()) {
                    if (AbstractC0648p.m1910c((String) it.next())) {
                    }
                }
                z2 = false;
            }
            z2 = true;
            break;
        }
        z2 = AbstractC0648p.m1910c(str);
        this.f6177M.setVisibility(z2 ? 0 : 8);
        if (z2) {
            int m1911d = AbstractC0648p.m1911d(this.f6205a);
            if (AbstractC0648p.f3053c == 0 || SystemClock.elapsedRealtime() >= AbstractC0648p.f3054d) {
                AbstractC0648p.f3053c = 0;
            } else {
                int i = AbstractC0648p.f3053c;
                if (m1911d == i) {
                    AbstractC0648p.f3053c = 0;
                } else {
                    m1911d = i;
                }
            }
            TextView textView = this.f6179N;
            ?? r4 = m1911d == 1 ? 1 : 0;
            if (textView != 0) {
                textView.setSelected(r4);
                textView.refreshDrawableState();
                textView.setTextColor(r4 != 0 ? -1518168 : -657665);
                textView.setTypeface(null, r4);
            }
            TextView textView2 = this.f6181O;
            ?? r1 = m1911d == 2 ? 1 : 0;
            if (textView2 == 0) {
                return;
            }
            textView2.setSelected(r1);
            textView2.refreshDrawableState();
            textView2.setTextColor(r1 != 0 ? -1518168 : -657665);
            textView2.setTypeface(null, r1);
        }
    }

    /* renamed from: P */
    public final void m3210P() {
        if (this.f6218e0 == null) {
            return;
        }
        this.f6234m0 = false;
        ToggleButton toggleButton = this.f6220f0;
        if (toggleButton != null) {
            final int i = 0;
            toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q0.Z0

                /* renamed from: b */
                public final /* synthetic */ C1324i1 f6050b;

                {
                    this.f6050b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    switch (i) {
                        case 0:
                            C1324i1 c1324i1 = this.f6050b;
                            c1324i1.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i1.f6218e0.setShowSpd(z2);
                            break;
                        case 1:
                            C1324i1 c1324i12 = this.f6050b;
                            c1324i12.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i12.f6218e0.setShowRpm(z2);
                            break;
                        default:
                            C1324i1 c1324i13 = this.f6050b;
                            c1324i13.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i13.f6218e0.setShowGear(z2);
                            break;
                    }
                }
            });
            ToggleButton toggleButton2 = this.f6220f0;
            toggleButton2.setAlpha(toggleButton2.isChecked() ? 1.0f : 0.35f);
            this.f6218e0.setShowSpd(this.f6220f0.isChecked());
        }
        ToggleButton toggleButton3 = this.f6222g0;
        if (toggleButton3 != null) {
            final int i2 = 1;
            toggleButton3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q0.Z0

                /* renamed from: b */
                public final /* synthetic */ C1324i1 f6050b;

                {
                    this.f6050b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    switch (i2) {
                        case 0:
                            C1324i1 c1324i1 = this.f6050b;
                            c1324i1.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i1.f6218e0.setShowSpd(z2);
                            break;
                        case 1:
                            C1324i1 c1324i12 = this.f6050b;
                            c1324i12.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i12.f6218e0.setShowRpm(z2);
                            break;
                        default:
                            C1324i1 c1324i13 = this.f6050b;
                            c1324i13.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i13.f6218e0.setShowGear(z2);
                            break;
                    }
                }
            });
            ToggleButton toggleButton4 = this.f6222g0;
            toggleButton4.setAlpha(toggleButton4.isChecked() ? 1.0f : 0.35f);
            this.f6218e0.setShowRpm(this.f6222g0.isChecked());
        }
        ToggleButton toggleButton5 = this.f6224h0;
        if (toggleButton5 != null) {
            final int i3 = 2;
            toggleButton5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(this) { // from class: q0.Z0

                /* renamed from: b */
                public final /* synthetic */ C1324i1 f6050b;

                {
                    this.f6050b = this;
                }

                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                    switch (i3) {
                        case 0:
                            C1324i1 c1324i1 = this.f6050b;
                            c1324i1.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i1.f6218e0.setShowSpd(z2);
                            break;
                        case 1:
                            C1324i1 c1324i12 = this.f6050b;
                            c1324i12.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i12.f6218e0.setShowRpm(z2);
                            break;
                        default:
                            C1324i1 c1324i13 = this.f6050b;
                            c1324i13.getClass();
                            compoundButton.setAlpha(z2 ? 1.0f : 0.35f);
                            c1324i13.f6218e0.setShowGear(z2);
                            break;
                    }
                }
            });
            ToggleButton toggleButton6 = this.f6224h0;
            toggleButton6.setAlpha(toggleButton6.isChecked() ? 1.0f : 0.35f);
            this.f6218e0.setShowGear(this.f6224h0.isChecked());
        }
        Spinner spinner = this.f6226i0;
        if (spinner != null) {
            spinner.setSelection(1, false);
            this.f6218e0.setWindowMinutes(f6152f1[1]);
            this.f6226i0.setOnItemSelectedListener(new C1321h1(this, 0));
            this.f6234m0 = true;
        }
        ImageButton imageButton = this.f6228j0;
        if (imageButton != null) {
            imageButton.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 14));
        }
    }

    /* renamed from: Q */
    public final void m3211Q() {
        m3215a(cfgData.m1784i().m1793m(this.f6211c), false);
    }

    /* renamed from: R */
    public final void m3212R() {
        int i = 1;
        View view = this.f6217e;
        if (view == null) {
            return;
        }
        this.f6206a0 = (ImageButton) view.findViewById(R.id.split_info_menu_btn);
        this.f6209b0 = (FrameLayout) this.f6217e.findViewById(R.id.split_info_menu_overlay);
        LinearLayout linearLayout = (LinearLayout) this.f6217e.findViewById(R.id.split_info_menu_panel);
        this.f6212c0 = linearLayout;
        if (this.f6206a0 == null || this.f6209b0 == null || linearLayout == null) {
            return;
        }
        linearLayout.removeAllViews();
        int[] iArr = {R.string.split_info_page_music, R.string.split_info_page_radio, R.string.split_info_page_charts, R.string.split_info_page_weather, R.string.split_info_page_clock, R.string.split_info_page_offroad, R.string.split_info_page_fuel};
        Context context = this.f6205a;
        float f2 = context.getResources().getDisplayMetrics().density;
        int round = Math.round(18.0f * f2);
        int round2 = Math.round(f2 * 12.0f);
        for (int i2 = 0; i2 < 7; i2++) {
            TextView textView = new TextView(context);
            textView.setText(iArr[i2]);
            textView.setTextSize(20.0f);
            textView.setTextColor(-1513240);
            textView.setPadding(round, round2, round, round2);
            textView.setClickable(true);
            textView.setFocusable(true);
            textView.setOnClickListener(new ViewOnClickListenerC1280Q0(this, i2, i));
            this.f6212c0.addView(textView, new LinearLayout.LayoutParams(-1, -2));
            this.f6215d0[i2] = textView;
        }
        this.f6206a0.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 12));
        this.f6209b0.setOnClickListener(new ViewOnClickListenerC1295Y0(this, 13));
        this.f6212c0.setOnClickListener(new ViewOnClickListenerC1278P0(0));
        m3232t();
    }

    /* renamed from: S */
    public final void m3213S() {
        HorizontalSwipeFrameLayout horizontalSwipeFrameLayout = this.f6219f;
        if (horizontalSwipeFrameLayout == null) {
            return;
        }
        horizontalSwipeFrameLayout.setPreferSwipeTarget(null);
        this.f6219f.setDragListener(new C1315f1(this));
    }

    /* renamed from: T */
    public final void m3214T() {
        Spinner spinner = this.f6253w;
        if (spinner == null) {
            return;
        }
        this.f6174K0 = false;
        spinner.setOnItemSelectedListener(new C1321h1(this, 1));
    }

    /* renamed from: a */
    public final void m3215a(int i, boolean z2) {
        int i2;
        if (i < 0 || i > 11) {
            i = 0;
        }
        cfgData m1784i = cfgData.m1784i();
        int i3 = this.f6211c;
        int m1793m = m1784i.m1793m(i3);
        if (z2 && m1793m != i) {
            if (i3 == 1) {
                m1784i.f2647j3 = i;
            } else {
                m1784i.f2642i3 = i;
            }
            String num = Integer.toString(m1784i.f2540L1);
            SharedPreferences.Editor edit = this.f6205a.getSharedPreferences("T500_SPLIT_AS", 0).edit();
            edit.putInt(AbstractC0062j.m157k(edit, AbstractC1561o.m4299c("splitInfoClockStyle", num), m1784i.f2642i3, "splitInfoClockStyle2", num), m1784i.f2647j3);
            edit.apply();
        } else if (!z2) {
            if (i3 == 1) {
                m1784i.f2647j3 = i;
            } else {
                m1784i.f2642i3 = i;
            }
        }
        boolean z3 = i == 0;
        boolean z4 = (i >= 4 && i <= 8) || i == 10 || i == 11;
        boolean z5 = i == 1 || i == 2;
        boolean z6 = i == 3 || i == 9;
        AnalogClockView analogClockView = this.f6258y0;
        if (analogClockView != null) {
            analogClockView.setVisibility(z3 ? 0 : 8);
        }
        SkinAnalogClockView skinAnalogClockView = this.f6260z0;
        if (skinAnalogClockView != null) {
            skinAnalogClockView.setVisibility(z4 ? 0 : 8);
            if (z4) {
                this.f6260z0.setSkin(i == 10 ? 5 : i == 11 ? 6 : i - 4);
            }
        }
        DigitalClockView digitalClockView = this.f6154A0;
        if (digitalClockView != null) {
            digitalClockView.setVisibility(z5 ? 0 : 8);
            if (z5) {
                this.f6154A0.setStyle(i - 1);
            }
        }
        OemDigitClockView oemDigitClockView = this.f6156B0;
        if (oemDigitClockView != null) {
            oemDigitClockView.setVisibility(z6 ? 0 : 8);
            if (z6) {
                this.f6156B0.setVariant(i == 9 ? 1 : 0);
            }
        }
        TextView textView = this.f6164F0;
        if (textView != null) {
            switch (i) {
                case 1:
                    i2 = R.string.split_info_clock_digital_thin;
                    break;
                case 2:
                    i2 = R.string.split_info_clock_digital_led;
                    break;
                case 3:
                    i2 = R.string.split_info_clock_digital_flip;
                    break;
                case 4:
                    i2 = R.string.split_info_clock_new_horizons;
                    break;
                case 5:
                    i2 = R.string.split_info_clock_green_mile;
                    break;
                case 6:
                    i2 = R.string.split_info_clock_gears;
                    break;
                case 7:
                    i2 = R.string.split_info_clock_orange;
                    break;
                case 8:
                    i2 = R.string.split_info_clock_silver;
                    break;
                case Platform.GNU /* 9 */:
                    i2 = R.string.split_info_clock_gwm2;
                    break;
                case Platform.KFREEBSD /* 10 */:
                    i2 = R.string.split_info_clock_tank_white;
                    break;
                case Platform.NETBSD /* 11 */:
                    i2 = R.string.split_info_clock_tank_black;
                    break;
                default:
                    i2 = R.string.split_info_clock_analog;
                    break;
            }
            textView.setText(i2);
        }
        m3201G();
        m3199E();
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0197 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3216b(C0636d c0636d) {
        boolean z2;
        boolean z3;
        Bitmap bitmap;
        ImageButton imageButton;
        ImageView imageView;
        C0636d c0636d2;
        C0636d c0636d3;
        if (!this.f6172J0 || this.f6217e == null) {
            return;
        }
        C0636d c0636d4 = c0636d == null ? C0636d.f2994j : c0636d;
        boolean isCall = CallState.isCall(c0636d4);
        C0658d current = RadioState.getInstance().current();
        boolean z4 = current != null && current.f3093a && current.m1943c();
        if (z4 && !isCall) {
            MediaInfoService mediaInfoService = MediaInfoService.f2973o;
            if (mediaInfoService == null || (c0636d2 = mediaInfoService.f2980l) == null || !c0636d2.m1851a()) {
                c0636d3 = null;
            } else {
                Bitmap bitmap2 = mediaInfoService.f2979k;
                if (bitmap2 == null || bitmap2.isRecycled()) {
                    bitmap2 = c0636d2.f2999e;
                }
                c0636d3 = new C0636d(c0636d2.f2995a, c0636d2.f2996b, c0636d2.f2997c, c0636d2.f2998d, bitmap2, false, c0636d2.f3001g, c0636d2.f3002h, c0636d2.f3003i);
            }
            if (c0636d3 != null && c0636d3.m1851a()) {
                c0636d4 = c0636d3;
            }
        }
        TextView textView = this.f6161E;
        if (textView != null) {
            String str = c0636d4.f2996b;
            AbstractC1256E0.m3000O(textView, (str == null || str.isEmpty()) ? "—" : c0636d4.f2996b);
        }
        TextView textView2 = this.f6163F;
        String str2 = "";
        if (textView2 != null) {
            String str3 = c0636d4.f2997c;
            AbstractC1256E0.m3001P(textView2, (str3 == null || str3.isEmpty()) ? "" : c0636d4.f2997c);
        }
        TextView textView3 = this.f6165G;
        if (textView3 != null) {
            String str4 = c0636d4.f2998d;
            if (str4 != null && !str4.isEmpty()) {
                str2 = c0636d4.f2998d;
            }
            textView3.setText(str2);
        }
        ImageView imageView2 = this.f6255x;
        if (imageView2 != null) {
            if (isCall) {
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.f6255x.setImageResource(CallState.getInstance().isIncoming() ? R.drawable.overlay_call_in : R.drawable.overlay_call_out);
            } else {
                Bitmap bitmap3 = c0636d4.f2999e;
                if (bitmap3 == null || bitmap3.isRecycled()) {
                    this.f6255x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.f6255x.setImageDrawable(null);
                } else {
                    this.f6255x.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    this.f6255x.setImageBitmap(c0636d4.f2999e);
                }
            }
            this.f6255x.post(new RunnableC1289V0(this, 2));
        }
        if (isCall) {
            z3 = false;
            m3223i(false);
        } else {
            Bitmap bitmap4 = c0636d4.f2999e;
            if (this.f6257y != null) {
                if (bitmap4 == null) {
                    z2 = true;
                    z3 = false;
                } else if (bitmap4.isRecycled()) {
                    z3 = false;
                    z2 = true;
                } else {
                    if (bitmap4 != this.f6155B || (bitmap = this.f6153A) == null || bitmap.isRecycled()) {
                        z2 = true;
                        int i = this.f6157C + 1;
                        this.f6157C = i;
                        this.f6159D.execute(new RunnableC0017k(this, bitmap4, i, 7));
                        z3 = false;
                        imageButton = this.f6175L;
                        if (imageButton != null) {
                            imageButton.setImageResource((!c0636d4.f3000f || z4 || isCall) ? R.drawable.split_info_play_btn : R.drawable.split_info_pause_btn);
                        }
                        this.f6192T0 = Math.max(0L, c0636d4.f3002h);
                        this.f6194U0 = Math.max(0L, c0636d4.f3001g);
                        this.f6196V0 = SystemClock.elapsedRealtime();
                        if (c0636d4.f3000f && !z4 && !isCall && c0636d4.m1851a()) {
                            z3 = z2;
                        }
                        this.f6198W0 = z3;
                        m3208N();
                        m3209O();
                        imageView = this.f6183P;
                        if (imageView != null) {
                            AbstractC0641i.m1894k(imageView, c0636d4, isCall);
                            return;
                        }
                        return;
                    }
                    this.f6257y.setImageBitmap(this.f6153A);
                    this.f6257y.setVisibility(0);
                    View view = this.f6259z;
                    if (view != null) {
                        view.setVisibility(0);
                    }
                }
                m3223i(z3);
                imageButton = this.f6175L;
                if (imageButton != null) {
                }
                this.f6192T0 = Math.max(0L, c0636d4.f3002h);
                this.f6194U0 = Math.max(0L, c0636d4.f3001g);
                this.f6196V0 = SystemClock.elapsedRealtime();
                if (c0636d4.f3000f) {
                    z3 = z2;
                }
                this.f6198W0 = z3;
                m3208N();
                m3209O();
                imageView = this.f6183P;
                if (imageView != null) {
                }
            }
            z3 = false;
        }
        z2 = true;
        imageButton = this.f6175L;
        if (imageButton != null) {
        }
        this.f6192T0 = Math.max(0L, c0636d4.f3002h);
        this.f6194U0 = Math.max(0L, c0636d4.f3001g);
        this.f6196V0 = SystemClock.elapsedRealtime();
        if (c0636d4.f3000f) {
        }
        this.f6198W0 = z3;
        m3208N();
        m3209O();
        imageView = this.f6183P;
        if (imageView != null) {
        }
    }

    /* renamed from: c */
    public final void m3217c() {
        View view = this.f6239p;
        if (view != null) {
            view.animate().cancel();
            this.f6239p.setTranslationX(0.0f);
            this.f6239p.setAlpha(1.0f);
            this.f6239p.setVisibility(this.f6178M0 == 0 ? 0 : 8);
        }
        View view2 = this.f6241q;
        if (view2 != null) {
            view2.animate().cancel();
            this.f6241q.setTranslationX(0.0f);
            this.f6241q.setAlpha(1.0f);
            this.f6241q.setVisibility(this.f6178M0 == 1 ? 0 : 8);
        }
        View view3 = this.f6243r;
        if (view3 != null) {
            view3.animate().cancel();
            this.f6243r.setTranslationX(0.0f);
            this.f6243r.setAlpha(1.0f);
            this.f6243r.setVisibility(this.f6178M0 == 2 ? 0 : 8);
        }
        View view4 = this.f6245s;
        if (view4 != null) {
            view4.animate().cancel();
            this.f6245s.setTranslationX(0.0f);
            this.f6245s.setAlpha(1.0f);
            this.f6245s.setVisibility(this.f6178M0 == 3 ? 0 : 8);
            if (this.f6178M0 == 3) {
                this.f6245s.post(new RunnableC1289V0(this, 4));
            }
        }
        View view5 = this.f6247t;
        if (view5 != null) {
            view5.animate().cancel();
            this.f6247t.setTranslationX(0.0f);
            this.f6247t.setAlpha(1.0f);
            this.f6247t.setVisibility(this.f6178M0 == 4 ? 0 : 8);
        }
        View view6 = this.f6249u;
        if (view6 != null) {
            view6.animate().cancel();
            this.f6249u.setTranslationX(0.0f);
            this.f6249u.setAlpha(1.0f);
            this.f6249u.setVisibility(this.f6178M0 == 5 ? 0 : 8);
        }
        View view7 = this.f6251v;
        if (view7 != null) {
            view7.animate().cancel();
            this.f6251v.setTranslationX(0.0f);
            this.f6251v.setAlpha(1.0f);
            this.f6251v.setVisibility(this.f6178M0 == 6 ? 0 : 8);
        }
        m3207M();
        m3201G();
        if (this.f6178M0 == 0) {
            m3209O();
        }
        m3199E();
        m3202H();
        m3200F();
    }

    /* renamed from: d */
    public final void m3218d(C0658d c0658d) {
        if (!this.f6172J0 || this.f6217e == null) {
            return;
        }
        if (c0658d == null) {
            c0658d = C0658d.f3092i;
        }
        TextView textView = this.f6185Q;
        if (textView != null) {
            textView.setText(c0658d.m1942b());
        }
        TextView textView2 = this.f6187R;
        Context context = this.f6205a;
        if (textView2 != null) {
            textView2.setText(c0658d.m1941a(context));
        }
        TextView textView3 = this.f6189S;
        if (textView3 != null) {
            textView3.setText(c0658d.m1943c() ? c0658d.m1947g(context) : "");
        }
        if (this.f6191T != null) {
            boolean isEmpty = TextUtils.isEmpty(c0658d.f3099g);
            this.f6191T.setText(isEmpty ? "" : c0658d.f3099g);
            this.f6191T.setVisibility(!isEmpty ? 0 : 8);
        }
        TextView textView4 = this.f6193U;
        if (textView4 != null) {
            StringBuilder sb = new StringBuilder();
            String m1945e = c0658d.m1945e(context);
            if (!m1945e.isEmpty()) {
                sb.append(m1945e);
            }
            if (c0658d.f3094b) {
                if (sb.length() > 0) {
                    sb.append("  ");
                }
                sb.append(context != null ? context.getString(R.string.split_info_radio_search) : "поиск…");
            }
            textView4.setText(sb.toString());
        }
        TextView textView5 = this.f6195V;
        if (textView5 != null) {
            boolean z2 = c0658d.f3095c != 1;
            textView5.setSelected(z2);
            this.f6195V.setTextColor(z2 ? -1518168 : -3617582);
        }
        TextView textView6 = this.f6197W;
        if (textView6 != null) {
            boolean z3 = c0658d.f3095c == 1;
            textView6.setSelected(z3);
            this.f6197W.setTextColor(z3 ? -1518168 : -3617582);
        }
        if (this.f6199X != null) {
            boolean z4 = c0658d.m1944d() >= 0;
            this.f6199X.setVisibility(z4 ? 0 : 8);
            if (z4) {
                this.f6199X.setImageResource(R.drawable.split_info_radio_fav_on);
            }
        }
        ImageButton imageButton = this.f6201Y;
        if (imageButton != null) {
            imageButton.setImageResource(c0658d.f3093a ? R.drawable.split_info_pause_btn : R.drawable.split_info_play_btn);
        }
    }

    /* renamed from: e */
    public final void m3219e() {
        if (!this.f6172J0 || this.f6217e == null) {
            return;
        }
        this.f6180N0 = false;
        m3235w();
        View[] viewArr = {this.f6239p, this.f6241q, this.f6243r, this.f6245s, this.f6247t, this.f6249u, this.f6251v};
        for (int i = 0; i < 7; i++) {
            View view = viewArr[i];
            if (view != null) {
                view.animate().cancel();
                view.setTranslationX(0.0f);
                view.setAlpha(1.0f);
            }
        }
        cfgData m1784i = cfgData.m1784i();
        int i2 = this.f6211c;
        m3215a(m1784i.m1793m(i2), false);
        int i3 = i2 == 1 ? m1784i.f2637h3 : m1784i.f2632g3;
        if (i3 < 0 || i3 >= 7) {
            i3 = 0;
        }
        m3237z(i3, 0);
    }

    /* renamed from: f */
    public final void m3220f(C1669y c1669y) {
        TextView textView = this.f6232l0;
        if (textView != null) {
            textView.setEnabled(true);
        }
        if (!this.f6172J0 || this.f6245s == null) {
            return;
        }
        boolean z2 = c1669y.f9502a;
        String str = c1669y.f9506e;
        Context context = this.f6205a;
        if (!z2) {
            m3222h(-1);
            m3221g(-1);
            TextView textView2 = this.f6240p0;
            if (textView2 != null) {
                textView2.setText("—");
            }
            TextView textView3 = this.f6244r0;
            if (textView3 != null) {
                textView3.setText("");
            }
            TextView textView4 = this.f6246s0;
            if (textView4 != null) {
                textView4.setText("");
            }
            TextView textView5 = this.f6248t0;
            if (textView5 != null) {
                textView5.setText(str);
            }
            TextView textView6 = this.f6250u0;
            if (textView6 != null) {
                textView6.setText("");
            }
            TextView textView7 = this.f6252v0;
            if (textView7 != null) {
                textView7.setText("");
            }
            TextView textView8 = this.f6254w0;
            if (textView8 != null) {
                textView8.setText("");
            }
            TextView textView9 = this.f6256x0;
            if (textView9 != null) {
                String str2 = c1669y.f9503b;
                if (str2 == null || str2.isEmpty()) {
                    str2 = context.getString(R.string.split_info_weather_error);
                }
                textView9.setText(str2);
                this.f6256x0.setTextColor(-38037);
                return;
            }
            return;
        }
        TextView textView10 = this.f6248t0;
        if (textView10 != null) {
            if (str.isEmpty()) {
                str = c1669y.m4817c();
            }
            textView10.setText(str);
        }
        int i = c1669y.f9509h;
        m3222h(i);
        m3221g(i);
        TextView textView11 = this.f6240p0;
        if (textView11 != null) {
            textView11.setText(String.format(Locale.ENGLISH, "%.0f°", Float.valueOf(c1669y.f9507f)));
        }
        if (this.f6244r0 != null) {
            String str3 = c1669y.f9510i;
            if (str3.isEmpty()) {
                this.f6244r0.setText(C1670z.m4826n(context, i));
            } else {
                this.f6244r0.setText(str3);
            }
        }
        TextView textView12 = this.f6246s0;
        if (textView12 != null) {
            textView12.setText(context.getString(R.string.split_info_weather_wind, Float.valueOf(c1669y.f9511j)));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        String format = simpleDateFormat.format(new Date());
        StringBuilder sb = new StringBuilder();
        C1667w c1667w = null;
        for (C1667w c1667w2 : c1669y.f9522u) {
            if (c1667w == null && format.equals(c1667w2.f9486a)) {
                c1667w = c1667w2;
            } else {
                if (sb.length() > 0) {
                    sb.append('\n');
                }
                sb.append(C1670z.m4825m(c1667w2.f9487b));
                sb.append("  ");
                sb.append(c1667w2.f9486a);
                sb.append("  ");
                sb.append(C1670z.m4826n(context, c1667w2.f9487b));
                sb.append("  ");
                sb.append(String.format(Locale.ENGLISH, "%.0f…%.0f°", Float.valueOf(c1667w2.f9489d), Float.valueOf(c1667w2.f9488c)));
            }
        }
        TextView textView13 = this.f6250u0;
        if (textView13 != null) {
            if (c1667w != null) {
                StringBuilder sb2 = new StringBuilder();
                int i2 = c1667w.f9487b;
                sb2.append(C1670z.m4825m(i2));
                sb2.append("  ");
                sb2.append(context.getString(R.string.split_info_weather_today));
                sb2.append("  ");
                sb2.append(C1670z.m4826n(context, i2));
                sb2.append("  ");
                sb2.append(String.format(Locale.ENGLISH, "%.0f…%.0f°", Float.valueOf(c1667w.f9489d), Float.valueOf(c1667w.f9488c)));
                textView13.setText(sb2.toString());
            } else {
                textView13.setText("");
            }
        }
        if (this.f6252v0 != null) {
            this.f6252v0.setLineHeight(Math.round(context.getResources().getDisplayMetrics().density * 48.0f));
            this.f6252v0.setText(sb.toString());
        }
        TextView textView14 = this.f6254w0;
        if (textView14 != null) {
            textView14.setText(context.getString(R.string.split_info_weather_updated, c1669y.m4818d()));
        }
        if (this.f6256x0 != null) {
            if (c1669y.m4816b()) {
                this.f6256x0.setText(R.string.split_info_weather_stale);
                this.f6256x0.setTextColor(-38037);
            } else {
                this.f6256x0.setText("");
                this.f6256x0.setTextColor(-571083009);
            }
        }
        m3204J();
    }

    /* renamed from: g */
    public final void m3221g(int i) {
        ImageView imageView = this.f6236n0;
        if (imageView == null) {
            return;
        }
        if (i < 0) {
            this.f6238o0 = 0;
            imageView.setImageDrawable(null);
            this.f6236n0.setVisibility(8);
            return;
        }
        int i2 = R.drawable.weather_bg_rain_night;
        if ((i < 200 || i >= 600) && i != 771 && i != 781) {
            if (i < 600 || i >= 700) {
                i2 = R.drawable.weather_bg_clear_night;
                if (i != 800 && ((i >= 801 && i <= 804) || (i >= 700 && i < 800))) {
                    i2 = R.drawable.weather_bg_cloud_night;
                }
            } else {
                i2 = R.drawable.weather_bg_snow_night;
            }
        }
        if (i2 != this.f6238o0) {
            this.f6238o0 = i2;
            imageView.setImageResource(i2);
        }
        this.f6236n0.setVisibility(0);
        m3196B();
    }

    /* renamed from: h */
    public final void m3222h(int i) {
        LottieAnimationView lottieAnimationView = this.f6242q0;
        if (lottieAnimationView == null) {
            return;
        }
        if (i < 0) {
            lottieAnimationView.cancelAnimation();
            this.f6170I0 = null;
            return;
        }
        int i2 = Calendar.getInstance().get(11);
        String m4827o = C1670z.m4827o(i, i2 < 6 || i2 >= 20);
        if (m4827o.equals(this.f6170I0)) {
            m3204J();
            return;
        }
        this.f6170I0 = m4827o;
        this.f6242q0.setFailureListener(new LottieListener() { // from class: q0.W0
            @Override // com.airbnb.lottie.LottieListener
            public final void onResult(Object obj) {
                C1324i1 c1324i1 = C1324i1.this;
                c1324i1.getClass();
                try {
                    c1324i1.f6242q0.setAnimation("meteocons/fill/cloudy.json");
                    c1324i1.f6242q0.setRepeatCount(-1);
                    c1324i1.m3204J();
                } catch (Exception unused) {
                }
            }
        });
        this.f6242q0.setAnimation(m4827o);
        this.f6242q0.setRepeatCount(-1);
        m3204J();
    }

    /* renamed from: i */
    public final void m3223i(boolean z2) {
        Bitmap bitmap;
        this.f6157C++;
        this.f6155B = null;
        ImageView imageView = this.f6257y;
        if (imageView != null) {
            imageView.setImageDrawable(null);
            this.f6257y.setVisibility(8);
        }
        View view = this.f6259z;
        if (view != null) {
            view.setVisibility(8);
        }
        if (z2 && (bitmap = this.f6153A) != null && !bitmap.isRecycled()) {
            this.f6153A.recycle();
        }
        this.f6153A = null;
    }

    /* renamed from: j */
    public final int m3224j(int i) {
        return Math.round(i * this.f6205a.getResources().getDisplayMetrics().density);
    }

    /* renamed from: m */
    public final void m3225m() {
        WindowManager windowManager;
        Handler handler = this.f6208b;
        handler.removeCallbacks(this.f6204Z0);
        handler.removeCallbacks(this.f6207a1);
        handler.removeCallbacks(this.f6210b1);
        handler.removeCallbacks(this.f6213c1);
        handler.removeCallbacks(this.f6216d1);
        this.f6180N0 = false;
        m3226n();
        C1324i1 c1324i1 = f6151e1[this.f6211c == 1 ? (char) 0 : (char) 1];
        if (c1324i1 == null || !c1324i1.f6172J0) {
            C1670z m4822d = C1670z.m4822d(this.f6205a);
            m4822d.m4834l();
            m4822d.f9528c.removeCallbacks(m4822d.f9537l);
            C1660p m4812a = C1660p.m4812a();
            m4812a.f9469c = false;
            m4812a.f9468b.removeCallbacks(m4812a.f9470d);
        }
        ((C0560y) C0639g.m1872x().f3011g).m1399h(this.f6200X0);
        RadioState.getInstance().removeObserver(this.f6202Y0);
        AnalogClockView analogClockView = this.f6258y0;
        if (analogClockView != null) {
            analogClockView.setRunning(false);
        }
        SkinAnalogClockView skinAnalogClockView = this.f6260z0;
        if (skinAnalogClockView != null) {
            skinAnalogClockView.setRunning(false);
        }
        DigitalClockView digitalClockView = this.f6154A0;
        if (digitalClockView != null) {
            digitalClockView.setRunning(false);
        }
        OemDigitClockView oemDigitClockView = this.f6156B0;
        if (oemDigitClockView != null) {
            oemDigitClockView.setRunning(false);
        }
        C1653i c1653i = this.f6166G0;
        if (c1653i != null) {
            c1653i.m4805j();
            if (c1653i.f9390A) {
                c1653i.f9390A = false;
                try {
                    NativeLib.nativeUnbindPanel();
                } catch (Throwable unused) {
                }
            }
            c1653i.f9391B = false;
            c1653i.f9411d = null;
            c1653i.f9412e = null;
            c1653i.f9413f = null;
            c1653i.f9414g = null;
            c1653i.f9415h = null;
            c1653i.f9416i = null;
            c1653i.f9417j = null;
            c1653i.f9418k = null;
            c1653i.f9419l = null;
            c1653i.f9420m = null;
            c1653i.f9421n = null;
            c1653i.f9422o = null;
            c1653i.f9423p = null;
            c1653i.f9424q = null;
            c1653i.f9425r = null;
            c1653i.f9426s = null;
            c1653i.f9427t = null;
            c1653i.f9428u = null;
            c1653i.f9429v = null;
            c1653i.f9430w = null;
            c1653i.f9431x = null;
            c1653i.f9432y = null;
            this.f6166G0 = null;
        }
        C1646b c1646b = this.f6168H0;
        if (c1646b != null) {
            c1646b.f9330B = false;
            c1646b.f9334b.removeCallbacks(c1646b.f9332D);
            c1646b.f9335c = null;
            c1646b.f9336d = null;
            c1646b.f9337e = null;
            c1646b.f9338f = null;
            c1646b.f9339g = null;
            c1646b.f9340h = null;
            c1646b.f9341i = null;
            c1646b.f9342j = null;
            c1646b.f9343k = null;
            c1646b.f9344l = null;
            c1646b.f9345m = null;
            c1646b.f9346n = null;
            c1646b.f9347o = null;
            c1646b.f9348p = null;
            c1646b.f9349q = null;
            c1646b.f9350r = null;
            c1646b.f9351s = null;
            c1646b.f9352t = null;
            c1646b.f9353u = null;
            c1646b.f9354v = null;
            c1646b.f9355w = null;
            c1646b.f9356x = null;
            c1646b.f9357y = null;
            c1646b.f9358z = null;
            c1646b.f9329A = null;
            c1646b.f9331C = false;
            this.f6168H0 = null;
        }
        LottieAnimationView lottieAnimationView = this.f6242q0;
        if (lottieAnimationView != null) {
            lottieAnimationView.cancelAnimation();
        }
        this.f6170I0 = null;
        View view = this.f6217e;
        if (view != null && (windowManager = this.f6214d) != null) {
            try {
                windowManager.removeView(view);
            } catch (Throwable unused2) {
            }
        }
        this.f6217e = null;
        this.f6239p = null;
        this.f6241q = null;
        this.f6243r = null;
        this.f6245s = null;
        this.f6236n0 = null;
        this.f6238o0 = 0;
        this.f6247t = null;
        this.f6249u = null;
        this.f6251v = null;
        this.f6253w = null;
        this.f6255x = null;
        m3223i(true);
        this.f6257y = null;
        this.f6259z = null;
        this.f6161E = null;
        this.f6163F = null;
        this.f6165G = null;
        this.f6167H = null;
        this.f6169I = null;
        this.f6171J = null;
        this.f6173K = null;
        this.f6175L = null;
        this.f6177M = null;
        this.f6179N = null;
        this.f6181O = null;
        this.f6183P = null;
        this.f6185Q = null;
        this.f6187R = null;
        this.f6189S = null;
        this.f6191T = null;
        this.f6193U = null;
        this.f6195V = null;
        this.f6197W = null;
        this.f6199X = null;
        this.f6201Y = null;
        this.f6203Z = null;
        this.f6206a0 = null;
        this.f6209b0 = null;
        this.f6212c0 = null;
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.f6215d0;
            if (i >= textViewArr.length) {
                break;
            }
            textViewArr[i] = null;
            i++;
        }
        this.f6219f = null;
        this.f6231l++;
        ValueAnimator valueAnimator = this.f6229k;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.f6229k.cancel();
            this.f6229k = null;
        }
        this.f6221g = null;
        this.f6223h = null;
        this.f6225i = null;
        this.f6227j = null;
        this.f6218e0 = null;
        this.f6220f0 = null;
        this.f6222g0 = null;
        this.f6224h0 = null;
        this.f6226i0 = null;
        this.f6228j0 = null;
        this.f6230k0 = null;
        this.f6232l0 = null;
        this.f6234m0 = false;
        this.f6240p0 = null;
        this.f6242q0 = null;
        this.f6244r0 = null;
        this.f6246s0 = null;
        this.f6248t0 = null;
        this.f6250u0 = null;
        this.f6252v0 = null;
        this.f6254w0 = null;
        this.f6256x0 = null;
        this.f6258y0 = null;
        this.f6260z0 = null;
        this.f6154A0 = null;
        this.f6156B0 = null;
        this.f6158C0 = null;
        this.f6160D0 = null;
        this.f6162E0 = null;
        this.f6164F0 = null;
        this.f6214d = null;
        this.f6172J0 = false;
        this.f6180N0 = false;
        this.f6174K0 = false;
        this.f6198W0 = false;
        this.f6190S0 = "";
        this.f6188R0.clear();
        this.f6178M0 = 0;
    }

    /* renamed from: n */
    public final void m3226n() {
        FrameLayout frameLayout = this.f6209b0;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
        ImageButton imageButton = this.f6206a0;
        if (imageButton != null) {
            imageButton.setVisibility(0);
        }
    }

    /* renamed from: o */
    public final void m3227o(cfgData cfgdata) {
        Context context = this.f6205a;
        SharedPreferences sharedPreferences = context.getSharedPreferences("T500_SPLIT_AS", 0);
        StringBuilder sb = new StringBuilder();
        int i = this.f6211c;
        sb.append(i == 1 ? "splitInfoRadioInserted2" : "splitInfoRadioInserted");
        sb.append(cfgdata.f2540L1);
        String sb2 = sb.toString();
        if (sharedPreferences.getBoolean(sb2, false)) {
            return;
        }
        int i2 = i == 1 ? cfgdata.f2637h3 : cfgdata.f2632g3;
        if (i2 >= 1) {
            int i3 = i2 + 1;
            if (i == 1) {
                cfgdata.f2637h3 = i3;
            } else {
                cfgdata.f2632g3 = i3;
            }
            cfgdata.m1798r(context);
        }
        sharedPreferences.edit().putBoolean(sb2, true).apply();
    }

    /* renamed from: p */
    public final TextView m3228p(boolean z2) {
        TextView textView = new TextView(this.f6217e.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 17));
        textView.setGravity(17);
        textView.setTextSize(30.0f);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setClickable(false);
        textView.setFocusable(false);
        textView.setBackground(null);
        textView.setBackgroundColor(0);
        if (z2) {
            textView.setTextColor(0);
            textView.setShadowLayer(m3224j(10), 0.0f, 0.0f, -12714134);
        } else {
            textView.setTextColor(-1);
            textView.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        }
        return textView;
    }

    /* renamed from: q */
    public final void m3229q(float f2) {
        if (this.f6186Q0 <= 0.0f) {
            return;
        }
        int i = f2 < 0.0f ? 1 : f2 > 0.0f ? -1 : 0;
        if (i == 0) {
            return;
        }
        if (i != this.f6182O0 || this.f6184P0 < 0) {
            m3235w();
            this.f6182O0 = i;
            int i2 = this.f6178M0;
            this.f6184P0 = ((i + i2) + 70) % 7;
            View m3230r = m3230r(i2);
            View m3230r2 = m3230r(this.f6184P0);
            if (m3230r != null) {
                m3230r.animate().cancel();
                m3230r.setVisibility(0);
                m3230r.setAlpha(1.0f);
            }
            if (m3230r2 != null) {
                m3230r2.animate().cancel();
                m3230r2.setVisibility(0);
                m3230r2.setAlpha(1.0f);
            }
        }
        View m3230r3 = m3230r(this.f6178M0);
        View m3230r4 = m3230r(this.f6184P0);
        float f3 = this.f6182O0 > 0 ? this.f6186Q0 : -this.f6186Q0;
        if (m3230r3 != null) {
            m3230r3.setTranslationX(f2);
        }
        if (m3230r4 != null) {
            m3230r4.setTranslationX(f3 + f2);
        }
    }

    /* renamed from: r */
    public final View m3230r(int i) {
        return i == 1 ? this.f6241q : i == 2 ? this.f6243r : i == 3 ? this.f6245s : i == 4 ? this.f6247t : i == 5 ? this.f6249u : i == 6 ? this.f6251v : this.f6239p;
    }

    /* renamed from: s */
    public final void m3231s() {
        SplitChartsView splitChartsView = this.f6218e0;
        if (splitChartsView != null) {
            splitChartsView.setSamples(C1660p.m4812a().f9467a.m4751a());
        }
    }

    /* renamed from: t */
    public final void m3232t() {
        int i = 0;
        while (true) {
            TextView[] textViewArr = this.f6215d0;
            if (i >= textViewArr.length) {
                return;
            }
            TextView textView = textViewArr[i];
            if (textView != null) {
                int i2 = i == this.f6178M0 ? 1 : 0;
                textView.setTextColor(i2 != 0 ? -1 : -5461077);
                textView.setTypeface(null, i2);
                textView.setBackgroundColor(i2 != 0 ? 872415231 : 0);
            }
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3233u() {
        String str;
        CharSequence applicationLabel;
        if (this.f6253w == null || !this.f6172J0) {
            return;
        }
        Context context = this.f6205a;
        ArrayList m1865n = AbstractC0638f.m1865n(context);
        StringBuilder sb = new StringBuilder();
        Iterator it = m1865n.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append('|');
        }
        String sb2 = sb.toString();
        if (sb2.equals(this.f6190S0) && this.f6253w.getAdapter() != null) {
            m3236x();
            m3209O();
            return;
        }
        this.f6190S0 = sb2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f6188R0;
        arrayList2.clear();
        arrayList2.add(null);
        arrayList.add(context.getString(R.string.split_info_source_auto));
        Iterator it2 = m1865n.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            arrayList2.add(str2);
            if (str2 == null || str2.isEmpty()) {
                str = "";
            } else {
                try {
                    PackageManager packageManager = context.getPackageManager();
                    applicationLabel = packageManager.getApplicationLabel(packageManager.getApplicationInfo(str2, 0));
                } catch (Exception unused) {
                }
                if (applicationLabel != null && applicationLabel.length() > 0) {
                    str = applicationLabel.toString();
                    if (!str2.isEmpty() && !"yandex.auto.uma".equals(str2) && !"ru.yandex.music".equals(str2) && !"ru.auto.music".equals(str2)) {
                        if (!"yandex.auto.music".equals(str2)) {
                            if (AbstractC0638f.m1864m(str2)) {
                                try {
                                    int i = context.getPackageManager().getApplicationInfo(str2, 0).flags;
                                    if ((i & 1) == 0 && (i & 128) == 0) {
                                    }
                                } catch (Exception unused2) {
                                }
                            }
                        }
                        str = str + " (" + context.getString(R.string.split_info_source_builtin) + ")";
                    }
                }
                str = str2;
                if (!str2.isEmpty()) {
                    if (!"yandex.auto.music".equals(str2)) {
                    }
                    str = str + " (" + context.getString(R.string.split_info_source_builtin) + ")";
                }
            }
            arrayList.add(str);
        }
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.split_info_spinner_item, arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.split_info_spinner_dropdown);
        this.f6176L0 = true;
        this.f6174K0 = false;
        this.f6253w.setPopupBackgroundResource(R.drawable.split_info_spinner_popup);
        this.f6253w.setAdapter((SpinnerAdapter) arrayAdapter);
        m3236x();
        this.f6174K0 = true;
        this.f6176L0 = false;
        m3209O();
    }

    /* renamed from: v */
    public final void m3234v(boolean z2) {
        TextView textView;
        TextView textView2;
        TextView textView3 = this.f6256x0;
        Context context = this.f6205a;
        if (textView3 != null && this.f6178M0 == 3 && (z2 || ((textView2 = this.f6254w0) != null && (textView2.getText() == null || this.f6254w0.getText().length() == 0)))) {
            this.f6256x0.setText(context.getString(R.string.split_info_weather_loading));
            this.f6256x0.setTextColor(-571083009);
        }
        if (z2 && (textView = this.f6232l0) != null) {
            textView.setEnabled(false);
        }
        C1670z.m4822d(context).m4831i(z2, new C1300a1(this, 0));
    }

    /* renamed from: w */
    public final void m3235w() {
        View m3230r;
        int i = this.f6184P0;
        if (i >= 0 && i != this.f6178M0 && (m3230r = m3230r(i)) != null) {
            m3230r.animate().cancel();
            m3230r.setVisibility(8);
            m3230r.setTranslationX(0.0f);
            m3230r.setAlpha(1.0f);
        }
        this.f6184P0 = -1;
    }

    /* renamed from: x */
    public final void m3236x() {
        int i;
        if (this.f6253w == null || this.f6188R0.isEmpty()) {
            return;
        }
        String str = AbstractC0638f.f3008b;
        if (str != null && !str.isEmpty()) {
            i = 0;
            while (i < this.f6188R0.size()) {
                if (str.equals(this.f6188R0.get(i))) {
                    break;
                } else {
                    i++;
                }
            }
        }
        i = 0;
        if (this.f6253w.getSelectedItemPosition() != i) {
            this.f6176L0 = true;
            this.f6253w.setSelection(i, false);
            this.f6176L0 = false;
        }
    }

    /* renamed from: z */
    public final void m3237z(int i, int i2) {
        View view;
        if (this.f6180N0) {
            return;
        }
        int i3 = ((i % 7) + 7) % 7;
        int i4 = this.f6178M0;
        if (i3 != i4 || i2 == 0) {
            this.f6178M0 = i3;
            cfgData m1784i = cfgData.m1784i();
            int i5 = this.f6211c;
            int i6 = i5 == 1 ? m1784i.f2637h3 : m1784i.f2632g3;
            int i7 = this.f6178M0;
            if (i6 != i7) {
                if (i5 == 1) {
                    m1784i.f2637h3 = i7;
                } else {
                    m1784i.f2632g3 = i7;
                }
                m1784i.m1798r(this.f6205a);
            }
            int i8 = this.f6178M0;
            if (i8 == 2) {
                m3231s();
            } else if (i8 == 3) {
                m3234v(false);
            } else if (i8 == 4) {
                m3215a(m1784i.m1793m(i5), false);
                m3205K();
            }
            m3202H();
            m3200F();
            if (i2 == 0 || i4 == i3) {
                m3217c();
                m3204J();
                m3232t();
                return;
            }
            View m3230r = m3230r(i4);
            View m3230r2 = m3230r(i3);
            if (m3230r == null || m3230r2 == null) {
                m3217c();
                return;
            }
            HorizontalSwipeFrameLayout horizontalSwipeFrameLayout = this.f6219f;
            int width = horizontalSwipeFrameLayout != null ? horizontalSwipeFrameLayout.getWidth() : 0;
            if (width <= 0 && (view = this.f6217e) != null) {
                width = view.getWidth();
            }
            if (width <= 0) {
                m3217c();
                return;
            }
            float f2 = i2 > 0 ? -width : width;
            float f3 = i2 > 0 ? width : -width;
            this.f6180N0 = true;
            m3230r.animate().cancel();
            m3230r2.animate().cancel();
            m3230r.setVisibility(0);
            m3230r.setTranslationX(0.0f);
            m3230r.setAlpha(1.0f);
            m3230r2.setVisibility(0);
            m3230r2.setTranslationX(f3);
            m3230r2.setAlpha(0.85f);
            m3207M();
            m3230r.animate().translationX(f2).alpha(0.4f).setDuration(240L).withEndAction(new RunnableC0296m(m3230r, 2)).start();
            m3230r2.animate().translationX(0.0f).alpha(1.0f).setDuration(240L).withEndAction(new RunnableC1289V0(this, 1)).start();
        }
    }
}
