package p098q0;

import android.animation.ValueAnimator;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.p061ip.Theme43BarView;
import com.sun.jna.Platform;
import java.util.Locale;
import p000A.AbstractC0000a;
import p000A.AbstractC0001b;
import p001A0.RunnableC0010d;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p062d0.C0728a;
import p112v0.EnumC1609b;
import p118x0.C1656l;

/* renamed from: q0.D0 */
/* loaded from: classes.dex */
public final class C1253D0 {

    /* renamed from: H0 */
    public static C1253D0 f5589H0 = null;

    /* renamed from: I0 */
    public static boolean f5590I0 = false;

    /* renamed from: A */
    public TextView f5591A;

    /* renamed from: A0 */
    public final C1371y0 f5592A0;

    /* renamed from: B */
    public TextView f5593B;

    /* renamed from: B0 */
    public final C1371y0 f5594B0;

    /* renamed from: C */
    public TextView f5595C;

    /* renamed from: C0 */
    public final C1371y0 f5596C0;

    /* renamed from: D */
    public TextView f5597D;

    /* renamed from: D0 */
    public final C1371y0 f5598D0;

    /* renamed from: E */
    public TextView f5599E;

    /* renamed from: E0 */
    public final C1371y0 f5600E0;

    /* renamed from: F */
    public TextView f5601F;

    /* renamed from: F0 */
    public final C1371y0 f5602F0;

    /* renamed from: G */
    public TextView f5603G;

    /* renamed from: G0 */
    public final C1371y0 f5604G0;

    /* renamed from: H */
    public TextView f5605H;

    /* renamed from: I */
    public Theme43BarView f5606I;

    /* renamed from: J */
    public TextView f5607J;

    /* renamed from: K */
    public Theme43BarView f5608K;

    /* renamed from: L */
    public TextView f5609L;

    /* renamed from: M */
    public TextView f5610M;

    /* renamed from: N */
    public TextView f5611N;

    /* renamed from: O */
    public TextView f5612O;

    /* renamed from: P */
    public TextView f5613P;

    /* renamed from: Q */
    public TextView f5614Q;

    /* renamed from: R */
    public TextView f5615R;

    /* renamed from: S */
    public TextView f5616S;

    /* renamed from: T */
    public final ActivityManager f5617T;

    /* renamed from: U */
    public final ActivityManager.MemoryInfo f5618U;

    /* renamed from: V */
    public WindowManager f5619V;

    /* renamed from: a */
    public final Context f5624a;

    /* renamed from: a0 */
    public long f5625a0;

    /* renamed from: b0 */
    public long f5627b0;

    /* renamed from: c */
    public ContextThemeWrapper f5628c;

    /* renamed from: c0 */
    public long f5629c0;

    /* renamed from: d */
    public View f5630d;

    /* renamed from: d0 */
    public boolean f5631d0;

    /* renamed from: e */
    public View f5632e;

    /* renamed from: f */
    public View f5634f;

    /* renamed from: f0 */
    public RunnableC1247B0 f5635f0;

    /* renamed from: g */
    public View f5636g;

    /* renamed from: g0 */
    public C1243A f5637g0;

    /* renamed from: h */
    public ImageView f5638h;

    /* renamed from: h0 */
    public C1350r0 f5639h0;

    /* renamed from: i */
    public ImageView[] f5640i;

    /* renamed from: i0 */
    public boolean f5641i0;

    /* renamed from: j */
    public ImageView[] f5642j;

    /* renamed from: j0 */
    public float f5643j0;

    /* renamed from: k */
    public View f5644k;

    /* renamed from: k0 */
    public float f5645k0;

    /* renamed from: l */
    public View f5646l;

    /* renamed from: l0 */
    public ValueAnimator f5647l0;

    /* renamed from: m */
    public View f5648m;

    /* renamed from: m0 */
    public float f5649m0;

    /* renamed from: n */
    public View f5650n;

    /* renamed from: n0 */
    public long f5651n0;

    /* renamed from: o */
    public View f5652o;

    /* renamed from: o0 */
    public float f5653o0;

    /* renamed from: p */
    public View f5654p;

    /* renamed from: p0 */
    public float f5655p0;

    /* renamed from: q */
    public C1656l f5656q;

    /* renamed from: q0 */
    public float f5657q0;

    /* renamed from: r */
    public C0728a f5658r;

    /* renamed from: r0 */
    public long f5659r0;

    /* renamed from: s */
    public View f5660s;

    /* renamed from: s0 */
    public final RunnableC1247B0 f5661s0;

    /* renamed from: t */
    public TextView f5662t;

    /* renamed from: t0 */
    public final C1371y0 f5663t0;

    /* renamed from: u */
    public ImageView f5664u;

    /* renamed from: u0 */
    public final C1371y0 f5665u0;

    /* renamed from: v */
    public TextView f5666v;

    /* renamed from: v0 */
    public final C1371y0 f5667v0;

    /* renamed from: w */
    public TextView f5668w;

    /* renamed from: w0 */
    public final C1371y0 f5669w0;

    /* renamed from: x */
    public TextView f5670x;

    /* renamed from: x0 */
    public final C1371y0 f5671x0;

    /* renamed from: y */
    public TextView f5672y;

    /* renamed from: y0 */
    public final C1371y0 f5673y0;

    /* renamed from: z */
    public ProgressBar f5674z;

    /* renamed from: z0 */
    public final C1371y0 f5675z0;

    /* renamed from: b */
    public final cfgData f5626b = cfgData.m1784i();

    /* renamed from: W */
    public boolean f5620W = false;

    /* renamed from: X */
    public boolean f5621X = false;

    /* renamed from: Y */
    public boolean f5622Y = false;

    /* renamed from: Z */
    public int f5623Z = 0;

    /* renamed from: e0 */
    public final Handler f5633e0 = new Handler(Looper.getMainLooper());

    /* JADX WARN: Type inference failed for: r0v10, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v11, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v12, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v13, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v14, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v15, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v16, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v17, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v4, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v6, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v7, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v8, types: [q0.y0] */
    /* JADX WARN: Type inference failed for: r0v9, types: [q0.y0] */
    public C1253D0(Context context) {
        final int i = 0;
        this.f5661s0 = new RunnableC1247B0(this, i);
        this.f5663t0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i2 = 9;
        this.f5665u0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i2) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i3 = 10;
        this.f5667v0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i3) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i4 = 11;
        this.f5669w0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i4) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i5 = 12;
        this.f5671x0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i5) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i6 = 13;
        this.f5673y0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i6) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i7 = 1;
        this.f5675z0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i7) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i8 = 2;
        this.f5592A0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i8) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i9 = 3;
        this.f5594B0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i9) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i10 = 4;
        this.f5596C0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i10) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i11 = 5;
        this.f5598D0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i11) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i12 = 6;
        this.f5600E0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i12) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i13 = 7;
        this.f5602F0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i13) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        final int i14 = 8;
        this.f5604G0 = new InterfaceC0561z(this) { // from class: q0.y0

            /* renamed from: b */
            public final /* synthetic */ C1253D0 f6430b;

            {
                this.f6430b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                switch (i14) {
                    case 0:
                        this.f6430b.m2981t();
                        break;
                    case 1:
                        this.f6430b.m2981t();
                        break;
                    case 2:
                        this.f6430b.m2981t();
                        break;
                    case 3:
                        this.f6430b.m2981t();
                        break;
                    case 4:
                        this.f6430b.m2981t();
                        break;
                    case 5:
                        this.f6430b.m2981t();
                        break;
                    case 6:
                        this.f6430b.m2981t();
                        break;
                    case 7:
                        this.f6430b.m2981t();
                        break;
                    case 8:
                        C1253D0 c1253d0 = this.f6430b;
                        Integer num = (Integer) obj;
                        c1253d0.getClass();
                        if (num != null && num.intValue() != 0) {
                            if (!AbstractC1372y1.f6439i || (num.intValue() != 7 && num.intValue() != 8)) {
                                if (!AbstractC1372y1.f6438h || (num.intValue() != 7 && num.intValue() != 8)) {
                                    if (num.intValue() != 7) {
                                        if (num.intValue() == 8 && c1253d0.f5620W && !c1253d0.f5622Y) {
                                            c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, true), true);
                                            break;
                                        }
                                    } else if (c1253d0.f5620W && !c1253d0.f5622Y) {
                                        c1253d0.m2984w(c1253d0.m2979r(c1253d0.f5623Z, false), false);
                                        break;
                                    }
                                }
                            }
                        }
                        break;
                    case Platform.GNU /* 9 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.KFREEBSD /* 10 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.NETBSD /* 11 */:
                        this.f6430b.m2981t();
                        break;
                    case Platform.DRAGONFLYBSD /* 12 */:
                        this.f6430b.m2981t();
                        break;
                    default:
                        this.f6430b.m2981t();
                        break;
                }
            }
        };
        Context applicationContext = context.getApplicationContext();
        this.f5624a = applicationContext;
        this.f5617T = (ActivityManager) applicationContext.getSystemService("activity");
        this.f5618U = new ActivityManager.MemoryInfo();
    }

    /* renamed from: l */
    public static String m2962l(long j2) {
        if (j2 < 0) {
            j2 = 0;
        }
        long j3 = j2 / 1000;
        return String.format(Locale.US, "%d:%02d", Long.valueOf(j3 / 60), Long.valueOf(j3 % 60));
    }

    /* renamed from: a */
    public final void m2963a(Theme43BarView theme43BarView, TextView textView, float f2) {
        int m3242a;
        if (theme43BarView != null) {
            theme43BarView.setProgress(Math.min(299, Math.max(0, Math.round(Math.min(f2, 29.9f) * 10.0f))));
            C1350r0 c1350r0 = this.f5639h0;
            if (c1350r0 != null) {
                int i = c1350r0.f6348c;
                if (f2 <= 0.001f) {
                    m3242a = C1350r0.m3242a(0.25f, i, -16777216);
                } else {
                    float max = Math.max(0.0f, Math.min(1.0f, f2 / 29.9f));
                    int i2 = c1350r0.f6352g;
                    int m3242a2 = C1350r0.m3242a(0.35f, i2, i);
                    int m3242a3 = C1350r0.m3242a(0.1f, i2, -1);
                    m3242a = max < 0.35f ? C1350r0.m3242a(max / 0.35f, m3242a2, m3242a3) : C1350r0.m3242a((max - 0.35f) / 0.65f, m3242a3, C1350r0.m3242a(0.35f, -1754827, i2));
                }
                theme43BarView.setBarProgressColor(m3242a);
            }
        }
        if (textView != null) {
            if (f2 > 0.001f) {
                textView.setText(this.f5628c.getString(R.string.overlay_panel_inst_fuel_value, Float.valueOf(f2)));
            } else {
                textView.setText(R.string.overlay_panel_value_empty);
            }
        }
    }

    /* renamed from: b */
    public final void m2964b(carData cardata) {
        m2963a(this.f5606I, this.f5603G, this.f5643j0);
        m2963a(this.f5608K, this.f5607J, this.f5653o0);
        if (this.f5605H != null) {
            this.f5605H.setText((cardata.m1780z() > 0.0f ? 1 : (cardata.m1780z() == 0.0f ? 0 : -1)) > 0 ? R.string.overlay_panel_inst_fuel_unit_l100 : R.string.overlay_panel_inst_fuel_unit_lph);
        }
        TextView textView = this.f5609L;
        if (textView != null) {
            textView.setText(this.f5626b.useJourneyFuel ? R.string.overlay_panel_label_avg_fuel_journey : R.string.overlay_panel_label_avg_fuel_accum);
        }
    }

    /* renamed from: c */
    public final void m2965c(float f2) {
        Context context = this.f5624a;
        cfgData cfgdata = this.f5626b;
        C1350r0 m3248c = AbstractC1353s0.m3248c(context, cfgdata);
        this.f5639h0 = m3248c;
        int i = 0;
        int i2 = cfgdata != null ? cfgdata.f2620e1 : 0;
        switch (i2) {
            case 47:
                i = R.drawable.ip_theme_47_info_frame;
                break;
            case 48:
                i = R.drawable.ip_theme_48_info_frame;
                break;
            case 49:
                i = R.drawable.ip_theme_49_info_frame;
                break;
            case 50:
                i = R.drawable.ip_theme_50_info_frame;
                break;
            case 51:
                i = R.drawable.ip_theme_51_info_frame;
                break;
        }
        if (i2 == 40) {
            View view = this.f5630d;
            int m3251f = AbstractC1353s0.m3251f(cfgdata);
            if (view != null && m3251f != 0) {
                view.setBackgroundResource(m3251f);
                AbstractC1256E0.m3019l(view, m3248c);
            }
        } else if (i != 0) {
            View view2 = this.f5630d;
            if (view2 != null && i != 0) {
                view2.setBackgroundResource(i);
                AbstractC1256E0.m3019l(view2, m3248c);
            }
        } else {
            AbstractC1256E0.m3013f(this.f5630d, m3248c, f2);
        }
        m2972j(this.f5606I);
        m2972j(this.f5608K);
        int m3a = AbstractC0001b.m3a(context, R.color.overlay_fuel_bar_text_shadow);
        float f3 = context.getResources().getDisplayMetrics().density;
        TextView textView = this.f5603G;
        float f4 = 6.0f * f3;
        if (textView != null) {
            textView.setTextColor(AbstractC0001b.m3a(context, R.color.overlay_fuel_bar_value_text));
            textView.setShadowLayer(f4, 0.0f, 1.0f, m3a);
        }
        TextView textView2 = this.f5607J;
        if (textView2 != null) {
            textView2.setTextColor(AbstractC0001b.m3a(context, R.color.overlay_fuel_bar_value_text));
            textView2.setShadowLayer(f4, 0.0f, 1.0f, m3a);
        }
        TextView textView3 = this.f5605H;
        float f5 = f3 * 5.0f;
        if (textView3 != null) {
            textView3.setTextColor(AbstractC0001b.m3a(context, R.color.overlay_fuel_bar_unit_text));
            textView3.setShadowLayer(f5, 0.0f, 1.0f, m3a);
        }
        TextView textView4 = this.f5610M;
        if (textView4 != null) {
            textView4.setTextColor(AbstractC0001b.m3a(context, R.color.overlay_fuel_bar_unit_text));
            textView4.setShadowLayer(f5, 0.0f, 1.0f, m3a);
        }
        ProgressBar progressBar = this.f5674z;
        if (progressBar == null || cfgdata == null) {
            return;
        }
        progressBar.setProgressDrawable(AbstractC0000a.m1b(context, AbstractC1353s0.m3249d(cfgdata.f2620e1)));
    }

    /* renamed from: d */
    public final void m2966d(long j2) {
        boolean z2 = this.f5627b0 > 0;
        ProgressBar progressBar = this.f5674z;
        if (progressBar != null) {
            progressBar.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f5674z.setProgress((int) Math.max(0L, Math.min(1000L, (j2 * 1000) / this.f5627b0)));
            }
        }
        TextView textView = this.f5670x;
        if (textView != null) {
            textView.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f5670x.setText(m2962l(j2));
            }
        }
        TextView textView2 = this.f5672y;
        if (textView2 != null) {
            textView2.setVisibility(z2 ? 0 : 8);
            if (z2) {
                this.f5672y.setText(m2962l(this.f5627b0));
            }
        }
    }

    /* renamed from: e */
    public final void m2967e() {
        if (!this.f5620W || this.f5628c == null) {
            return;
        }
        int i = this.f5623Z == 0 ? 0 : 8;
        View view = this.f5634f;
        if (view != null) {
            view.setVisibility(i);
        }
        View view2 = this.f5636g;
        if (view2 != null) {
            view2.setVisibility(this.f5623Z == 3 ? 0 : 8);
        }
        View view3 = this.f5644k;
        if (view3 != null) {
            view3.setVisibility(this.f5623Z == 4 ? 0 : 8);
        }
        View view4 = this.f5646l;
        if (view4 != null) {
            view4.setVisibility(this.f5623Z == 5 ? 0 : 8);
        }
        View view5 = this.f5648m;
        if (view5 != null) {
            view5.setVisibility(this.f5623Z == 6 ? 0 : 8);
        }
        View view6 = this.f5650n;
        if (view6 != null) {
            view6.setVisibility(this.f5623Z == 10 ? 0 : 8);
        }
        View view7 = this.f5652o;
        if (view7 != null) {
            view7.setVisibility(this.f5623Z == 7 ? 0 : 8);
        }
        View view8 = this.f5654p;
        if (view8 != null) {
            view8.setVisibility(this.f5623Z == 8 ? 0 : 8);
        }
        int i2 = this.f5623Z;
        RunnableC1247B0 runnableC1247B0 = this.f5661s0;
        Handler handler = this.f5633e0;
        if (i2 == 0) {
            carData cardata = carData.getInstance();
            int max = Math.max(0, ((Integer) cardata.f2477u0.m1395d()).intValue());
            int i3 = max / 60;
            int i4 = max % 60;
            TextView textView = this.f5591A;
            if (textView != null) {
                textView.setText(this.f5628c.getString(R.string.overlay_panel_time_value, Integer.valueOf(i3), Integer.valueOf(i4)));
            }
            if (this.f5593B != null) {
                this.f5593B.setText(this.f5628c.getString(R.string.overlay_panel_distance_value, Float.valueOf(cardata.m1769q())));
            }
            if (this.f5595C != null) {
                Float f2 = (Float) cardata.f2473s0.m1395d();
                if (f2.floatValue() < 0.0f) {
                    this.f5595C.setText(R.string.overlay_panel_value_empty);
                } else {
                    this.f5595C.setText(this.f5628c.getString(R.string.overlay_panel_speed_value, f2));
                }
            }
            if (this.f5597D != null) {
                float m1739b = cardata.m1739b();
                if (m1739b > 0.0f) {
                    this.f5597D.setText(this.f5628c.getString(R.string.overlay_panel_fuel_value, Float.valueOf(m1739b)));
                } else {
                    this.f5597D.setText(R.string.overlay_panel_value_empty);
                }
            }
        } else if (i2 == 3) {
            carData cardata2 = carData.getInstance();
            int intValue = ((Integer) cardata2.f2454j.m1395d()).intValue();
            int intValue2 = ((Integer) cardata2.f2456k.m1395d()).intValue();
            if (this.f5640i != null) {
                for (int i5 = 0; i5 < 6; i5++) {
                    ImageView[] imageViewArr = this.f5640i;
                    if (i5 >= imageViewArr.length) {
                        break;
                    }
                    ImageView imageView = imageViewArr[i5];
                    if (imageView != null) {
                        imageView.setVisibility(((1 << (i5 + 1)) & intValue) != 0 ? 0 : 8);
                    }
                }
            }
            if (this.f5642j != null) {
                for (int i6 = 0; i6 < 5; i6++) {
                    ImageView[] imageViewArr2 = this.f5642j;
                    if (i6 >= imageViewArr2.length) {
                        break;
                    }
                    ImageView imageView2 = imageViewArr2[i6];
                    if (imageView2 != null) {
                        imageView2.setVisibility(((1 << (i6 + 1)) & intValue2) != 0 ? 0 : 8);
                    }
                }
            }
            carData cardata3 = carData.getInstance();
            String str = (cardata3.m1715C() > 10.0f || cardata3.m1716D() > 10.0f || cardata3.m1717E() > 10.0f || cardata3.m1718F() > 10.0f) ? "%.0f" : "%.1f";
            m2970h(this.f5611N, cardata3.m1715C(), ((Float) cardata3.f2391H.m1395d()).floatValue(), str);
            m2970h(this.f5612O, cardata3.m1716D(), ((Float) cardata3.f2395J.m1395d()).floatValue(), str);
            m2970h(this.f5613P, cardata3.m1717E(), ((Float) cardata3.f2399L.m1395d()).floatValue(), str);
            m2970h(this.f5614Q, cardata3.m1718F(), ((Float) cardata3.f2403N.m1395d()).floatValue(), str);
            ImageView imageView3 = this.f5638h;
            if (imageView3 != null) {
                imageView3.post(new RunnableC1374z0(this, 0));
            }
        } else if (i2 == 4) {
            m2968f();
        } else if (i2 == 5) {
            carData cardata4 = carData.getInstance();
            if (this.f5599E != null) {
                Float f3 = (Float) cardata4.f2465o0.m1395d();
                if (f3.floatValue() == 0.0f) {
                    this.f5599E.setText(R.string.overlay_panel_value_empty);
                } else {
                    this.f5599E.setText(this.f5628c.getString(R.string.overlay_panel_oil_temp_value, f3));
                }
            }
            if (this.f5601F != null) {
                Float f4 = (Float) cardata4.f2463n0.m1395d();
                if (f4.floatValue() == 0.0f) {
                    this.f5601F.setText(R.string.overlay_panel_value_empty);
                } else {
                    this.f5601F.setText(this.f5628c.getString(R.string.overlay_panel_oil_press_value, f4));
                }
            }
        } else if (i2 == 6) {
            carData cardata5 = carData.getInstance();
            float m1765o = cardata5.m1765o();
            float min = m1765o > 0.0f ? Math.min(m1765o, 29.9f) : 0.0f;
            if (Math.abs(min - this.f5645k0) > 0.001f) {
                this.f5649m0 = this.f5643j0;
                this.f5645k0 = min;
                this.f5651n0 = SystemClock.elapsedRealtime();
                handler.removeCallbacks(runnableC1247B0);
                handler.post(runnableC1247B0);
            }
            float m1739b2 = this.f5626b.useJourneyFuel ? cardata5.m1739b() : cardata5.m1737a();
            float min2 = m1739b2 > 0.0f ? Math.min(m1739b2, 29.9f) : 0.0f;
            if (Math.abs(min2 - this.f5655p0) > 0.001f) {
                this.f5657q0 = this.f5653o0;
                this.f5655p0 = min2;
                this.f5659r0 = SystemClock.elapsedRealtime();
                handler.removeCallbacks(runnableC1247B0);
                handler.post(runnableC1247B0);
            }
            m2964b(cardata5);
        } else if (i2 == 7) {
            C0636d m1880u = C0639g.m1872x().m1880u();
            boolean m1851a = m1880u.m1851a();
            TextView textView2 = this.f5662t;
            if (textView2 != null) {
                textView2.setVisibility(m1851a ? 8 : 0);
            }
            View view9 = this.f5660s;
            if (view9 != null) {
                view9.setVisibility(m1851a ? 0 : 8);
            }
            if (m1851a) {
                TextView textView3 = this.f5666v;
                if (textView3 != null) {
                    String str2 = m1880u.f2996b;
                    if (str2 == null) {
                        str2 = "";
                    }
                    AbstractC1256E0.m3000O(textView3, str2);
                }
                TextView textView4 = this.f5668w;
                if (textView4 != null) {
                    String str3 = m1880u.f2997c;
                    AbstractC1256E0.m3001P(textView4, str3 != null ? str3 : "");
                    this.f5668w.setVisibility((str3 == null || str3.isEmpty()) ? 8 : 0);
                }
                ImageView imageView4 = this.f5664u;
                if (imageView4 != null) {
                    Bitmap bitmap = m1880u.f2999e;
                    if (bitmap != null) {
                        imageView4.setImageBitmap(bitmap);
                        this.f5664u.setVisibility(0);
                    } else {
                        imageView4.setImageDrawable(null);
                        this.f5664u.setVisibility(4);
                    }
                }
                this.f5627b0 = m1880u.f3002h;
                this.f5625a0 = m1880u.f3001g;
                this.f5631d0 = m1880u.f3000f;
                this.f5629c0 = SystemClock.elapsedRealtime();
                m2966d(this.f5625a0);
                View view10 = this.f5652o;
                if (view10 == null) {
                    view10 = this.f5660s;
                }
                AbstractC0641i.m1892i(view10, m1880u);
            } else {
                View view11 = this.f5652o;
                if (view11 == null) {
                    view11 = this.f5660s;
                }
                AbstractC0641i.m1892i(view11, m1880u);
            }
        }
        C1656l c1656l = this.f5656q;
        if (c1656l != null) {
            if (this.f5623Z == 8) {
                c1656l.m4810c(1);
            } else {
                c1656l.m4810c(0);
            }
            C0728a c0728a = this.f5658r;
            if (c0728a != null) {
                int i7 = this.f5623Z;
                RunnableC0020n runnableC0020n = (RunnableC0020n) c0728a.f3836h;
                Handler handler2 = (Handler) c0728a.f3830b;
                if (i7 != 10) {
                    c0728a.f3829a = false;
                    handler2.removeCallbacks(runnableC0020n);
                } else if (c0728a.f3829a) {
                    c0728a.m2162g();
                } else {
                    c0728a.f3829a = true;
                    handler2.removeCallbacks(runnableC0020n);
                    handler2.post(runnableC0020n);
                }
            }
        }
        if (this.f5620W && this.f5623Z == 6 && !this.f5622Y) {
            handler.removeCallbacks(runnableC1247B0);
            handler.post(runnableC1247B0);
        } else {
            handler.removeCallbacks(runnableC1247B0);
        }
    }

    /* renamed from: f */
    public final void m2968f() {
        ActivityManager.MemoryInfo memoryInfo = this.f5618U;
        ActivityManager activityManager = this.f5617T;
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
        }
        long j2 = memoryInfo.availMem / 1048576;
        long j3 = memoryInfo.totalMem / 1048576;
        long m3308n = AbstractC1372y1.m3308n();
        long totalBytes = (new StatFs(Environment.getDataDirectory().getAbsolutePath()).getTotalBytes() / 1024) / 1024;
        C1350r0 c1350r0 = this.f5639h0;
        int m3a = c1350r0 != null ? c1350r0.f6351f : AbstractC0001b.m3a(this.f5628c, R.color.overlay_panel_value_text);
        TextView textView = this.f5615R;
        if (textView != null) {
            textView.setText(this.f5628c.getString(R.string.overlay_panel_mem_values, Long.valueOf(j2), Long.valueOf(j3)));
            this.f5615R.setTextColor(m3a);
        }
        TextView textView2 = this.f5616S;
        if (textView2 != null) {
            textView2.setText(this.f5628c.getString(R.string.overlay_panel_mem_values, Long.valueOf(m3308n), Long.valueOf(totalBytes)));
            TextView textView3 = this.f5616S;
            if (m3308n < 1000) {
                m3a = -256;
            }
            textView3.setTextColor(m3a);
        }
    }

    /* renamed from: g */
    public final void m2969g() {
        m2985x();
        this.f5637g0 = new C1243A(1);
        carData cardata = carData.getInstance();
        carData.m1712X(cardata.f2477u0, this.f5637g0, this.f5663t0);
        cardata.m1736Z(this.f5637g0, this.f5665u0);
        carData.m1712X(cardata.f2473s0, this.f5637g0, this.f5667v0);
        cardata.m1719H(this.f5637g0, this.f5669w0);
        cardata.m1720I(this.f5637g0, this.f5671x0);
        C1243A c1243a = this.f5637g0;
        C1371y0 c1371y0 = this.f5673y0;
        cardata.m1764n0(c1243a, c1371y0);
        carData.m1712X(cardata.f2391H, this.f5637g0, c1371y0);
        cardata.m1766o0(this.f5637g0, c1371y0);
        carData.m1712X(cardata.f2395J, this.f5637g0, c1371y0);
        cardata.m1768p0(this.f5637g0, c1371y0);
        carData.m1712X(cardata.f2399L, this.f5637g0, c1371y0);
        cardata.m1770q0(this.f5637g0, c1371y0);
        carData.m1712X(cardata.f2403N, this.f5637g0, c1371y0);
        carData.m1712X(cardata.f2465o0, this.f5637g0, this.f5675z0);
        carData.m1712X(cardata.f2463n0, this.f5637g0, this.f5592A0);
        cardata.m1731T(this.f5637g0, this.f5594B0);
        cardata.m1754i0(this.f5637g0, this.f5596C0);
        carData.m1712X(cardata.f2454j, this.f5637g0, this.f5598D0);
        carData.m1712X(cardata.f2456k, this.f5637g0, this.f5600E0);
        if (m2983v()) {
            C0639g.m1872x().m1883z(this.f5637g0, this.f5602F0);
        }
        cardata.m1734W(this.f5637g0, this.f5604G0);
    }

    /* renamed from: h */
    public final void m2970h(TextView textView, float f2, float f3, String str) {
        int m3a;
        if (textView == null) {
            return;
        }
        textView.setText(this.f5628c.getString(R.string.overlay_panel_tire_corner, (f2 == -99.0f || f2 == 3.5f) ? this.f5628c.getString(R.string.overlay_panel_value_empty) : String.format(Locale.ENGLISH, str, Float.valueOf(f2)).replace(",", "."), (f3 == -99.0f || f3 == 3.5f) ? this.f5628c.getString(R.string.overlay_panel_value_empty) : String.format(Locale.ENGLISH, "%.0f°", Float.valueOf(f3)).replace(",", ".")));
        if (f2 == -99.0f) {
            m3a = Color.parseColor("#FF5B9BD5");
        } else {
            float f4 = this.f5626b.f2580V1;
            if (f2 < 0.95f * f4) {
                m3a = -65536;
            } else if (f2 < f4) {
                m3a = -256;
            } else {
                C1350r0 c1350r0 = this.f5639h0;
                m3a = c1350r0 != null ? c1350r0.f6351f : AbstractC0001b.m3a(this.f5628c, R.color.overlay_panel_value_text);
            }
        }
        textView.setTextColor(m3a);
    }

    /* renamed from: i */
    public final void m2971i() {
        ValueAnimator valueAnimator = this.f5647l0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5647l0 = null;
        }
    }

    /* renamed from: j */
    public final void m2972j(Theme43BarView theme43BarView) {
        if (theme43BarView == null) {
            return;
        }
        theme43BarView.setMax(299);
        theme43BarView.setOverlayBarStyle(true);
        Context context = this.f5624a;
        theme43BarView.setMaxFrameStroke(context.getResources().getDimension(R.dimen.overlay_inst_fuel_bar_frame_stroke_max));
        C1350r0 c1350r0 = this.f5639h0;
        int m3242a = c1350r0 != null ? C1350r0.m3242a(0.18f, C1350r0.m3242a(0.62f, c1350r0.f6347b, c1350r0.f6348c), -16777216) : AbstractC0001b.m3a(context, R.color.overlay_panel_content_bg);
        C1350r0 c1350r02 = this.f5639h0;
        int m3a = c1350r02 != null ? c1350r02.f6349d : AbstractC0001b.m3a(context, R.color.overlay_panel_content_border);
        theme43BarView.f2838m = m3242a;
        theme43BarView.f2839n = m3242a;
        theme43BarView.f2840o = m3a;
        theme43BarView.f2842q = true;
        theme43BarView.invalidate();
        C1350r0 c1350r03 = this.f5639h0;
        if (c1350r03 != null) {
            theme43BarView.m1823c(C1350r0.m3242a(0.55f, c1350r03.f6352g, c1350r03.f6348c), C1350r0.m3242a(0.28f, this.f5639h0.f6352g, -1));
        }
    }

    /* renamed from: k */
    public final int m2973k(float f2) {
        return (int) ((f2 * this.f5628c.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: m */
    public final int[] m2974m() {
        View view;
        if (this.f5620W && (view = this.f5630d) != null) {
            try {
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                if (layoutParams == null) {
                    return null;
                }
                return new int[]{layoutParams.x, layoutParams.y};
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: n */
    public final void m2975n() {
        m2971i();
        m2985x();
        View view = this.f5630d;
        if (view != null) {
            view.animate().cancel();
        }
        View view2 = this.f5632e;
        if (view2 != null) {
            view2.animate().cancel();
        }
        m2982u();
        this.f5621X = false;
        this.f5622Y = false;
    }

    /* renamed from: o */
    public final void m2976o(int i, int i2) {
        View view;
        if (!this.f5620W || (view = this.f5630d) == null || this.f5619V == null) {
            return;
        }
        try {
            WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.x = i;
            layoutParams.y = i2;
            this.f5619V.updateViewLayout(this.f5630d, layoutParams);
        } catch (Exception unused) {
        }
    }

    /* renamed from: p */
    public final void m2977p(int i, int i2) {
        if (!this.f5620W || this.f5630d == null) {
            return;
        }
        m2971i();
        int[] m2974m = m2974m();
        if (m2974m == null) {
            return;
        }
        int i3 = m2974m[0];
        if (i3 == i && m2974m[1] == i2) {
            return;
        }
        final int[] iArr = {i3, m2974m[1], i, i2};
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5647l0 = ofFloat;
        ofFloat.setDuration(Math.max(1L, 420L));
        AbstractC0062j.m166t(this.f5647l0);
        this.f5647l0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: q0.A0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1253D0 c1253d0 = C1253D0.this;
                c1253d0.getClass();
                c1253d0.m2978q(iArr, ((Float) valueAnimator.getAnimatedValue()).floatValue());
            }
        });
        this.f5647l0.addListener(new C1250C0(this, i, i2));
        this.f5647l0.start();
    }

    /* renamed from: q */
    public final void m2978q(int[] iArr, float f2) {
        if (iArr == null || iArr.length < 4) {
            return;
        }
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        m2976o(AbstractC0062j.m150d(iArr[2] - r0, max, iArr[0]), Math.round(((iArr[3] - r1) * max) + iArr[1]));
    }

    /* renamed from: r */
    public final int m2979r(int i, boolean z2) {
        cfgData cfgdata = this.f5626b;
        if (!z2) {
            if (i == 0) {
                return 8;
            }
            if (i == 10) {
                return 6;
            }
            switch (i) {
                case 4:
                    return 3;
                case 5:
                    return m2983v() ? 7 : 4;
                case 6:
                    if (cfgdata.f2543M0.f7152k) {
                        return 5;
                    }
                    return m2983v() ? 7 : 4;
                case 7:
                    return 4;
                case 8:
                    return 10;
                default:
                    return 0;
            }
        }
        if (i == 0) {
            return 3;
        }
        if (i == 10) {
            return 8;
        }
        if (i == 3) {
            return 4;
        }
        if (i == 4) {
            if (m2983v()) {
                return 7;
            }
            return cfgdata.f2543M0.f7152k ? 5 : 6;
        }
        if (i == 5) {
            return 6;
        }
        if (i == 6) {
            return 10;
        }
        if (i != 7) {
            return 0;
        }
        return cfgdata.f2543M0.f7152k ? 5 : 6;
    }

    /* renamed from: s */
    public final void m2980s(TextView textView, float f2, float f3, boolean z2) {
        int m2973k;
        if (textView == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null || (m2973k = layoutParams.width) <= 0) {
            m2973k = m2973k(64.0f);
        }
        textView.measure(View.MeasureSpec.makeMeasureSpec(m2973k, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
        float measuredHeight = textView.getMeasuredHeight();
        float m2973k2 = m2973k(8.0f);
        textView.setX(z2 ? ((f2 - m2973k2) - m2973k) + m2973k(4.0f) : f2 + m2973k2);
        textView.setY(f3 - (measuredHeight / 2.0f));
    }

    /* renamed from: t */
    public final void m2981t() {
        if (!this.f5620W || this.f5628c == null || this.f5622Y) {
            return;
        }
        this.f5633e0.post(new RunnableC1374z0(this, 2));
    }

    /* renamed from: u */
    public final void m2982u() {
        WindowManager windowManager;
        View view = this.f5630d;
        if (view != null && (windowManager = this.f5619V) != null) {
            try {
                windowManager.removeView(view);
            } catch (Exception unused) {
            }
        }
        this.f5630d = null;
        this.f5632e = null;
        this.f5634f = null;
        this.f5636g = null;
        this.f5638h = null;
        this.f5640i = null;
        this.f5642j = null;
        this.f5644k = null;
        this.f5646l = null;
        this.f5648m = null;
        this.f5650n = null;
        this.f5652o = null;
        this.f5654p = null;
        C1656l c1656l = this.f5656q;
        if (c1656l != null) {
            c1656l.m4810c(0);
            c1656l.f9448k = false;
            c1656l.f9440c = null;
            c1656l.f9441d = null;
            c1656l.f9442e = null;
            c1656l.f9443f = null;
            c1656l.f9444g = null;
            this.f5656q = null;
        }
        C0728a c0728a = this.f5658r;
        if (c0728a != null) {
            c0728a.f3829a = false;
            ((Handler) c0728a.f3830b).removeCallbacks((RunnableC0020n) c0728a.f3836h);
            c0728a.f3831c = null;
            c0728a.f3832d = null;
            c0728a.f3833e = null;
            c0728a.f3834f = null;
            c0728a.f3835g = null;
            this.f5658r = null;
        }
        this.f5591A = null;
        this.f5593B = null;
        this.f5595C = null;
        this.f5597D = null;
        this.f5611N = null;
        this.f5612O = null;
        this.f5613P = null;
        this.f5614Q = null;
        this.f5615R = null;
        this.f5616S = null;
        this.f5599E = null;
        this.f5601F = null;
        this.f5603G = null;
        this.f5605H = null;
        this.f5606I = null;
        this.f5607J = null;
        this.f5608K = null;
        this.f5609L = null;
        this.f5610M = null;
        this.f5643j0 = 0.0f;
        this.f5645k0 = 0.0f;
        this.f5653o0 = 0.0f;
        this.f5655p0 = 0.0f;
        this.f5633e0.removeCallbacks(this.f5661s0);
        this.f5619V = null;
        this.f5620W = false;
        f5590I0 = false;
    }

    /* renamed from: v */
    public final boolean m2983v() {
        return AbstractC0088l.m261T(this.f5624a, EnumC1609b.NOTIFICATION_ACCESS);
    }

    /* renamed from: w */
    public final void m2984w(int i, boolean z2) {
        this.f5622Y = true;
        View view = this.f5632e;
        if (view != null) {
            RunnableC0010d runnableC0010d = new RunnableC0010d(this, i, 5);
            float m3028u = AbstractC1256E0.m3028u(view, 40.0f);
            float f2 = z2 ? -m3028u : m3028u;
            if (!z2) {
                m3028u = -m3028u;
            }
            view.animate().cancel();
            view.animate().translationY(f2).alpha(0.35f).setDuration(220L).setInterpolator(new AccelerateInterpolator()).withEndAction(new RunnableC1359u0(runnableC0010d, view, m3028u)).start();
            return;
        }
        this.f5623Z = i;
        m2967e();
        this.f5622Y = false;
        if (this.f5620W) {
            cfgData cfgdata = this.f5626b;
            cfgdata.f2652k3 = true;
            cfgdata.f2657l3 = this.f5623Z;
            cfgdata.m1796p(this.f5624a);
        }
    }

    /* renamed from: x */
    public final void m2985x() {
        RunnableC1247B0 runnableC1247B0 = this.f5635f0;
        Handler handler = this.f5633e0;
        if (runnableC1247B0 != null) {
            handler.removeCallbacks(runnableC1247B0);
            this.f5635f0 = null;
        }
        handler.removeCallbacks(this.f5661s0);
        C1243A c1243a = this.f5637g0;
        if (c1243a != null) {
            EnumC0548m enumC0548m = EnumC0548m.f1990a;
            C0555t c0555t = c1243a.f5543g;
            c0555t.m1379c("setCurrentState");
            c0555t.m1381e(enumC0548m);
            this.f5637g0 = null;
        }
    }
}
