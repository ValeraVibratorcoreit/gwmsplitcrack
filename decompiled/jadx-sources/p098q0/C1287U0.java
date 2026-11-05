package p098q0;

import android.animation.ValueAnimator;
import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.graphics.Point;
import android.graphics.Typeface;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.lifecycle.C0560y;
import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.radio.RadioState;
import com.jcraft.jsch.SftpATTRS;
import java.util.ArrayDeque;
import java.util.Locale;
import p001A0.RunnableC0024r;
import p033Q.AbstractC0272f;
import p054a1.ViewOnTouchListenerC0500i;

/* renamed from: q0.U0 */
/* loaded from: classes.dex */
public final class C1287U0 {

    /* renamed from: K */
    public static final int[] f5957K = {0, R.drawable.mpng_1, R.drawable.mpng_2, R.drawable.mpng_3, R.drawable.mpng_4, R.drawable.mpng_5, R.drawable.mpng_6, R.drawable.mpng_7};

    /* renamed from: L */
    public static final int[] f5958L = {0, R.drawable.mpng_1_a, R.drawable.mpng_2_a, R.drawable.mpng_3_a, R.drawable.mpng_4_a, R.drawable.mpng_5_a, R.drawable.mpng_6_a, R.drawable.mpng_7_a};

    /* renamed from: M */
    public static C1287U0 f5959M;

    /* renamed from: A */
    public TextView f5960A;

    /* renamed from: B */
    public WindowManager.LayoutParams f5961B;

    /* renamed from: C */
    public ValueAnimator f5962C;

    /* renamed from: D */
    public boolean f5963D;

    /* renamed from: E */
    public int f5964E;

    /* renamed from: F */
    public int f5965F;

    /* renamed from: G */
    public boolean f5966G;

    /* renamed from: H */
    public String f5967H;

    /* renamed from: I */
    public long f5968I;

    /* renamed from: J */
    public RunnableC1272M0 f5969J;

    /* renamed from: a */
    public final Context f5970a;

    /* renamed from: c */
    public final int f5972c;

    /* renamed from: d */
    public WindowManager f5973d;

    /* renamed from: e */
    public View f5974e;

    /* renamed from: f */
    public TextView f5975f;

    /* renamed from: g */
    public WindowManager.LayoutParams f5976g;

    /* renamed from: h */
    public boolean f5977h;

    /* renamed from: i */
    public View f5978i;

    /* renamed from: j */
    public View f5979j;

    /* renamed from: k */
    public ImageButton f5980k;

    /* renamed from: l */
    public ImageButton f5981l;

    /* renamed from: m */
    public ImageButton f5982m;

    /* renamed from: n */
    public ImageButton f5983n;

    /* renamed from: p */
    public ValueAnimator f5985p;

    /* renamed from: q */
    public boolean f5986q;

    /* renamed from: r */
    public boolean f5987r;

    /* renamed from: s */
    public int f5988s;

    /* renamed from: t */
    public int f5989t;

    /* renamed from: u */
    public boolean f5990u;

    /* renamed from: v */
    public C1243A f5991v;

    /* renamed from: w */
    public C1283S0 f5992w;

    /* renamed from: b */
    public final cfgData f5971b = cfgData.m1784i();

    /* renamed from: o */
    public final ImageButton[] f5984o = new ImageButton[8];

    /* renamed from: x */
    public final Handler f5993x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    public final RunnableC0024r f5994y = new RunnableC0024r(22, this);

    /* renamed from: z */
    public final ArrayDeque f5995z = new ArrayDeque();

    public C1287U0(Context context) {
        this.f5970a = context;
        this.f5972c = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* renamed from: c */
    public static void m3100c(Context context) {
        float f2;
        WindowManager windowManager;
        View view;
        if (context == null) {
            return;
        }
        if (f5959M == null) {
            f5959M = new C1287U0(context.getApplicationContext());
        }
        C1287U0 c1287u0 = f5959M;
        Context context2 = c1287u0.f5970a;
        if (context2 != null) {
            if (C1268K0.f5752t == null) {
                C1268K0.f5752t = new C1268K0(context2.getApplicationContext());
            }
            C1268K0 c1268k0 = C1268K0.f5752t;
            if (!c1268k0.f5755c) {
                c1268k0.f5755c = true;
                c1268k0.f5757e = c1268k0.m3044b();
                c1268k0.f5758f = c1268k0.m3043a();
                ((C0560y) C0639g.m1872x().f3011g).m1397f(c1268k0.f5767o);
                RadioState.getInstance().observeForever(c1268k0.f5768p);
                ConnectivityManager connectivityManager = (ConnectivityManager) c1268k0.f5753a.getSystemService("connectivity");
                if (connectivityManager != null) {
                    try {
                        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), new C1266J0(0, c1268k0));
                    } catch (RuntimeException unused) {
                    }
                }
                c1268k0.f5754b.postDelayed(c1268k0.f5769q, 2000L);
            }
        }
        c1287u0.m3110h();
        cfgData cfgdata = c1287u0.f5971b;
        boolean z2 = cfgdata.f2607b3;
        EnumC0548m enumC0548m = EnumC0548m.f1990a;
        if (!z2) {
            c1287u0.f5995z.clear();
            c1287u0.m3109g();
            c1287u0.m3110h();
            C1243A c1243a = c1287u0.f5991v;
            if (c1243a != null) {
                c1243a.f5543g.m1383g(enumC0548m);
                c1287u0.f5991v = null;
            }
            if (c1287u0.f5977h && (windowManager = c1287u0.f5973d) != null && (view = c1287u0.f5974e) != null) {
                try {
                    windowManager.removeView(view);
                } catch (Exception unused2) {
                }
            }
            c1287u0.f5974e = null;
            c1287u0.f5975f = null;
            c1287u0.f5976g = null;
            c1287u0.f5977h = false;
            return;
        }
        float f3 = 0.0f;
        if (!c1287u0.f5977h) {
            WindowManager windowManager2 = (WindowManager) context2.getSystemService("window");
            c1287u0.f5973d = windowManager2;
            if (windowManager2 == null) {
                return;
            }
            View inflate = LayoutInflater.from(new ContextThemeWrapper(context2, R.style.Theme_T500_Split)).inflate(R.layout.overlay_split_ball, (ViewGroup) null);
            c1287u0.f5974e = inflate;
            c1287u0.f5975f = (TextView) inflate.findViewById(R.id.split_ball_speed);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(94, 94, 2038, 776, -3);
            c1287u0.f5976g = layoutParams;
            layoutParams.gravity = 51;
            c1287u0.m3108f(layoutParams, cfgdata.f2612c3, cfgdata.f2617d3);
            c1287u0.f5974e.setOnTouchListener(new ViewOnTouchListenerC0500i(1, c1287u0));
            try {
                c1287u0.f5973d.addView(c1287u0.f5974e, c1287u0.f5976g);
                c1287u0.f5977h = true;
                C1243A c1243a2 = c1287u0.f5991v;
                if (c1243a2 != null) {
                    c1243a2.f5543g.m1383g(enumC0548m);
                    c1287u0.f5991v = null;
                }
                c1287u0.f5991v = new C1243A(2);
                carData.getInstance().m1754i0(c1287u0.f5991v, new C1337n(1, c1287u0));
                try {
                    f2 = carData.getInstance().m1780z();
                } catch (RuntimeException unused3) {
                    f2 = 0.0f;
                }
                c1287u0.m3119s(f2);
            } catch (Exception unused4) {
                c1287u0.f5974e = null;
                c1287u0.f5975f = null;
                return;
            }
        }
        WindowManager.LayoutParams layoutParams2 = c1287u0.f5976g;
        if (layoutParams2 != null && c1287u0.f5973d != null && c1287u0.f5974e != null) {
            c1287u0.m3108f(layoutParams2, cfgdata.f2612c3, cfgdata.f2617d3);
            try {
                c1287u0.f5973d.updateViewLayout(c1287u0.f5974e, c1287u0.f5976g);
            } catch (Exception unused5) {
            }
            c1287u0.m3113k(c1287u0.f5964E);
            c1287u0.m3123x();
        }
        try {
            f3 = carData.getInstance().m1780z();
        } catch (RuntimeException unused6) {
        }
        c1287u0.m3119s(f3);
        c1287u0.m3116o();
    }

    /* renamed from: e */
    public static void m3101e(TextView textView, boolean z2) {
        textView.setPadding(z2 ? 106 : 28, 0, z2 ? 28 : 106, 0);
    }

    /* renamed from: n */
    public static void m3102n(ImageButton imageButton, boolean z2, int i) {
        imageButton.setVisibility(z2 ? 0 : 8);
        imageButton.setImageResource(i);
        AbstractC0272f.m797c(imageButton, null);
    }

    /* renamed from: p */
    public static void m3103p() {
        C1287U0 c1287u0 = f5959M;
        if (c1287u0 == null || !c1287u0.f5977h || c1287u0.f5973d == null) {
            return;
        }
        c1287u0.m3117q(c1287u0.f5960A);
        c1287u0.m3117q(c1287u0.f5978i);
        c1287u0.m3117q(c1287u0.f5974e);
    }

    /* renamed from: v */
    public static void m3104v(Context context, String str) {
        if (context == null || str == null) {
            return;
        }
        String trim = str.toString().trim();
        if (trim.isEmpty()) {
            return;
        }
        if (f5959M == null) {
            f5959M = new C1287U0(context.getApplicationContext());
        }
        f5959M.f5993x.post(new RunnableC1323i0(trim, 2));
    }

    /* renamed from: a */
    public final void m3105a(int i, int i2, int i3, int i4, RunnableC1272M0 runnableC1272M0) {
        ValueAnimator valueAnimator = this.f5985p;
        if (valueAnimator != null) {
            this.f5985p = null;
            valueAnimator.cancel();
        }
        if (i == i2) {
            m3112j(i2);
            if (i4 != this.f5989t || runnableC1272M0 == null) {
                return;
            }
            runnableC1272M0.run();
            return;
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        this.f5985p = ofInt;
        ofInt.setDuration(i3);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C1274N0(this, i4, 1));
        ofInt.addListener(new C1281R0(this, ofInt, i4, runnableC1272M0, 0));
        ofInt.start();
    }

    /* renamed from: b */
    public final void m3106b(int i, int i2, int i3, int i4, Runnable runnable) {
        ValueAnimator valueAnimator = this.f5962C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        this.f5962C = ofInt;
        ofInt.setDuration(i3);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.addUpdateListener(new C1274N0(this, i4, 0));
        ofInt.addListener(new C1281R0(this, ofInt, i4, runnable, 1));
        ofInt.start();
    }

    /* renamed from: d */
    public final void m3107d(boolean z2) {
        boolean z3 = this.f5987r;
        int i = z3 ? 14 : 20;
        if (z3) {
            View view = this.f5979j;
            int i2 = z2 ? 94 : i;
            if (!z2) {
                i = 94;
            }
            view.setPadding(0, i2, 0, i);
            return;
        }
        View view2 = this.f5979j;
        int i3 = z2 ? 94 : i;
        if (!z2) {
            i = 94;
        }
        view2.setPadding(i3, 0, i, 0);
    }

    /* renamed from: f */
    public final void m3108f(WindowManager.LayoutParams layoutParams, int i, int i2) {
        int[] m3121u = m3121u();
        int max = Math.max(0, (m3121u[0] - AbstractC1256E0.m2990E(this.f5971b)) - 94);
        int max2 = Math.max(0, m3121u[1] - 94);
        if (i < 0) {
            i = Math.max(0, max - 24);
        }
        if (i2 < 0) {
            i2 = Math.max(0, (m3121u[1] - 94) / 2);
        }
        layoutParams.x = i >= 0 ? i > max ? max : i : 0;
        int min = Math.min(64, max2);
        if (i2 < min) {
            max2 = min;
        } else if (i2 <= max2) {
            max2 = i2;
        }
        layoutParams.y = max2;
    }

    /* renamed from: g */
    public final void m3109g() {
        this.f5965F++;
        ValueAnimator valueAnimator = this.f5962C;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5962C = null;
        }
        RunnableC1272M0 runnableC1272M0 = this.f5969J;
        if (runnableC1272M0 != null) {
            this.f5993x.removeCallbacks(runnableC1272M0);
        }
        m3118r();
        this.f5966G = false;
        this.f5967H = null;
    }

    /* renamed from: h */
    public final void m3110h() {
        this.f5993x.removeCallbacks(this.f5994y);
        this.f5989t++;
        this.f5990u = false;
        ValueAnimator valueAnimator = this.f5985p;
        if (valueAnimator != null) {
            this.f5985p = null;
            valueAnimator.cancel();
        }
        View view = this.f5978i;
        if (view == null || this.f5973d == null || view.getParent() == null) {
            return;
        }
        View view2 = this.f5978i;
        if (view2 != null && this.f5973d != null && view2.getParent() != null) {
            try {
                this.f5973d.removeView(this.f5978i);
            } catch (Exception unused) {
            }
        }
        m3116o();
    }

    /* renamed from: i */
    public final void m3111i() {
        this.f5993x.removeCallbacks(this.f5994y);
        View view = this.f5978i;
        if (view == null || this.f5973d == null || view.getParent() == null || this.f5990u) {
            return;
        }
        this.f5990u = true;
        int i = this.f5989t;
        m3105a(this.f5988s, 94, 220, i, new RunnableC1272M0(this, i, 0));
    }

    /* renamed from: j */
    public final void m3112j(int i) {
        View view;
        if (this.f5979j == null || this.f5976g == null || (view = this.f5978i) == null || view.getParent() == null) {
            return;
        }
        if (i < 94) {
            i = 94;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f5979j.getLayoutParams();
        layoutParams.gravity = 51;
        if (this.f5987r) {
            int[] m3121u = m3121u();
            int max = Math.max(0, (m3121u[1] - (this.f5976g.y + 94)) - 8);
            int max2 = Math.max(0, this.f5976g.y - 8);
            if (!this.f5986q) {
                max = max2;
            }
            int min = Math.min(i, Math.max(94, max + 94));
            layoutParams.width = 94;
            layoutParams.height = min;
            WindowManager.LayoutParams layoutParams2 = this.f5976g;
            layoutParams.leftMargin = layoutParams2.x;
            int i2 = this.f5986q ? layoutParams2.y : (layoutParams2.y + 94) - min;
            if (i2 < 0) {
                i2 = 0;
            }
            int i3 = i2 + min;
            int i4 = m3121u[1];
            if (i3 > i4) {
                i2 = Math.max(0, i4 - min);
            }
            layoutParams.topMargin = i2;
            int max3 = this.f5986q ? 0 : Math.max(0, m3114l() - min);
            if (this.f5979j.getScrollY() != max3) {
                this.f5979j.scrollTo(0, max3);
            }
            this.f5988s = min;
        } else {
            layoutParams.width = i;
            layoutParams.height = 94;
            WindowManager.LayoutParams layoutParams3 = this.f5976g;
            layoutParams.topMargin = layoutParams3.y;
            layoutParams.leftMargin = this.f5986q ? layoutParams3.x : (layoutParams3.x + 94) - i;
            if (this.f5979j.getScrollY() != 0) {
                this.f5979j.scrollTo(0, 0);
            }
            this.f5988s = i;
        }
        this.f5979j.setLayoutParams(layoutParams);
    }

    /* renamed from: k */
    public final void m3113k(int i) {
        WindowManager.LayoutParams layoutParams;
        WindowManager.LayoutParams layoutParams2;
        TextView textView = this.f5960A;
        if (textView == null || (layoutParams = this.f5961B) == null || (layoutParams2 = this.f5976g) == null || this.f5973d == null) {
            return;
        }
        this.f5964E = i;
        layoutParams.width = i;
        layoutParams.height = 94;
        layoutParams.y = layoutParams2.y;
        layoutParams.x = this.f5963D ? layoutParams2.x : (layoutParams2.x + 94) - i;
        if (textView.getParent() == null) {
            return;
        }
        try {
            this.f5973d.updateViewLayout(this.f5960A, this.f5961B);
        } catch (Exception unused) {
        }
    }

    /* renamed from: l */
    public final int m3114l() {
        if (this.f5987r) {
            this.f5979j.measure(View.MeasureSpec.makeMeasureSpec(94, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return Math.max(this.f5979j.getMeasuredHeight(), 94);
        }
        this.f5979j.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(94, 1073741824));
        return Math.max(this.f5979j.getMeasuredWidth(), 94);
    }

    /* renamed from: m */
    public final boolean m3115m() {
        View view = this.f5978i;
        return (view == null || view.getParent() == null) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* renamed from: o */
    public final void m3116o() {
        C1285T0 c1285t0;
        if (this.f5966G || m3115m() || !this.f5977h) {
            return;
        }
        cfgData cfgdata = this.f5971b;
        if (!cfgdata.f2607b3 || (c1285t0 = (C1285T0) this.f5995z.pollFirst()) == null || this.f5973d == null || this.f5976g == null) {
            return;
        }
        String str = c1285t0.f5953a;
        this.f5967H = str;
        final long j2 = c1285t0.f5954b;
        this.f5968I = j2;
        this.f5966G = true;
        final int i = this.f5965F + 1;
        this.f5965F = i;
        TextView textView = new TextView(new ContextThemeWrapper(this.f5970a, R.style.Theme_T500_Split));
        textView.setText(str);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setGravity(16);
        textView.setTextColor(-525828);
        textView.setTextSize(0, 26.0f);
        textView.setTypeface(Typeface.create("sans-serif-medium", 0));
        textView.setIncludeFontPadding(false);
        textView.setBackgroundResource(R.drawable.split_ball_msg_bg);
        int max = Math.max(1, m3121u()[0] - AbstractC1256E0.m2990E(cfgdata));
        int i2 = this.f5976g.x;
        int i3 = (max - (i2 + 94)) - 8;
        int i4 = i2 - 8;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        textView.setText(str);
        m3101e(textView, true);
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, 900), SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), View.MeasureSpec.makeMeasureSpec(94, 1073741824));
        int i5 = (Math.max(0, Math.max(textView.getMeasuredWidth(), 94) - 94) <= i3 || i3 >= i4) ? 1 : 0;
        if (i5 == 0) {
            i3 = i4;
        }
        int max2 = Math.max(94, i3 + 94);
        m3101e(textView, i5);
        textView.measure(View.MeasureSpec.makeMeasureSpec(Math.max(1, max2), SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED), View.MeasureSpec.makeMeasureSpec(94, 1073741824));
        int min = Math.min(max2, Math.max(textView.getMeasuredWidth(), 94));
        if (min < 94) {
            min = 94;
        }
        int[] iArr = {i5, min};
        boolean z2 = iArr[0] == 1;
        this.f5963D = z2;
        int i6 = iArr[1];
        m3101e(textView, z2);
        this.f5960A = textView;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(94, 94, 2038, 776, -3);
        this.f5961B = layoutParams;
        layoutParams.gravity = 51;
        this.f5964E = 94;
        m3113k(94);
        try {
            this.f5973d.addView(this.f5960A, this.f5961B);
            m3117q(this.f5974e);
            m3106b(94, i6, 280, i, new Runnable() { // from class: q0.O0
                @Override // java.lang.Runnable
                public final void run() {
                    C1287U0 c1287u0 = C1287U0.this;
                    int i7 = c1287u0.f5965F;
                    int i8 = i;
                    if (i8 != i7) {
                        return;
                    }
                    RunnableC1272M0 runnableC1272M0 = c1287u0.f5969J;
                    Handler handler = c1287u0.f5993x;
                    if (runnableC1272M0 != null) {
                        handler.removeCallbacks(runnableC1272M0);
                    }
                    RunnableC1272M0 runnableC1272M02 = new RunnableC1272M0(c1287u0, i8, 1);
                    c1287u0.f5969J = runnableC1272M02;
                    handler.postDelayed(runnableC1272M02, j2);
                }
            });
        } catch (Exception unused) {
            this.f5960A = null;
            this.f5966G = false;
        }
    }

    /* renamed from: q */
    public final void m3117q(View view) {
        if (this.f5973d == null || view == null || view.getParent() == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            try {
                this.f5973d.removeView(view);
                this.f5973d.addView(view, layoutParams);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: r */
    public final void m3118r() {
        TextView textView = this.f5960A;
        if (textView != null && this.f5973d != null && textView.getParent() != null) {
            try {
                this.f5973d.removeView(this.f5960A);
            } catch (Exception unused) {
            }
        }
        this.f5960A = null;
        this.f5961B = null;
        this.f5964E = 0;
    }

    /* renamed from: s */
    public final void m3119s(float f2) {
        if (this.f5975f == null) {
            return;
        }
        float f3 = f2 * this.f5971b.f2702u3;
        if (Float.isNaN(f3) || f3 < 0.0f) {
            f3 = 0.0f;
        }
        this.f5975f.setText(String.format(Locale.US, "%.0f", Float.valueOf(f3)));
    }

    /* renamed from: t */
    public final void m3120t() {
        TopOverlayService.m1704c(this.f5970a);
        AbstractC1372y1.m3300f();
        m3122w(MainActivity.class);
    }

    /* renamed from: u */
    public final int[] m3121u() {
        cfgData cfgdata = this.f5971b;
        Point point = new Point(cfgdata.f2490A0, cfgdata.f2495B0);
        WindowManager windowManager = this.f5973d;
        if (windowManager != null) {
            try {
                windowManager.getDefaultDisplay().getRealSize(point);
            } catch (RuntimeException unused) {
            }
        }
        if (point.x <= 0) {
            int i = cfgdata.f2490A0;
            if (i <= 0) {
                i = 1920;
            }
            point.x = i;
        }
        if (point.y <= 0) {
            int i2 = cfgdata.f2495B0;
            if (i2 <= 0) {
                i2 = 720;
            }
            point.y = i2;
        }
        return new int[]{point.x, point.y};
    }

    /* renamed from: w */
    public final void m3122w(Class cls) {
        Context context = this.f5970a;
        try {
            Intent intent = new Intent(context, (Class<?>) cls);
            intent.addFlags(402722816);
            intent.putExtra("caller", "top");
            context.startActivity(intent, ActivityOptions.makeBasic().toBundle());
        } catch (Exception unused) {
        }
    }

    /* renamed from: x */
    public final void m3123x() {
        if (m3115m()) {
            if (!this.f5987r || this.f5985p != null || this.f5990u) {
                m3112j(this.f5988s);
            } else {
                m3107d(this.f5986q);
                m3112j(m3114l());
            }
        }
    }
}
