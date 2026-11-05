package p118x0;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.splitinfo.CompassDialView;
import p003B.C0043j;
import p098q0.AbstractC1354s1;
import p098q0.InterfaceC1351r1;

/* renamed from: x0.l */
/* loaded from: classes.dex */
public final class C1656l {

    /* renamed from: a */
    public final Context f9438a;

    /* renamed from: c */
    public CompassDialView f9440c;

    /* renamed from: d */
    public ImageView f9441d;

    /* renamed from: e */
    public ImageView f9442e;

    /* renamed from: f */
    public TextView f9443f;

    /* renamed from: g */
    public TextView f9444g;

    /* renamed from: i */
    public boolean f9446i;

    /* renamed from: j */
    public boolean f9447j;

    /* renamed from: k */
    public boolean f9448k;

    /* renamed from: l */
    public Bitmap f9449l;

    /* renamed from: m */
    public Bitmap f9450m;

    /* renamed from: n */
    public Bitmap f9451n;

    /* renamed from: o */
    public Bitmap f9452o;

    /* renamed from: p */
    public Bitmap f9453p;

    /* renamed from: b */
    public final Handler f9439b = new Handler(Looper.getMainLooper());

    /* renamed from: h */
    public int f9445h = 0;

    /* renamed from: q */
    public final C1655k f9454q = new C1655k(this, 0);

    /* renamed from: r */
    public final C1655k f9455r = new C1655k(this, 1);

    /* renamed from: s */
    public final C1655k f9456s = new C1655k(this, 2);

    public C1656l(Context context) {
        this.f9438a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m4808a(View view) {
        this.f9440c = (CompassDialView) view.findViewById(R.id.overlay_compass_dial);
        this.f9441d = (ImageView) view.findViewById(R.id.overlay_tilt_side);
        this.f9442e = (ImageView) view.findViewById(R.id.overlay_tilt_behind);
        this.f9443f = (TextView) view.findViewById(R.id.overlay_tilt_label_side);
        this.f9444g = (TextView) view.findViewById(R.id.overlay_tilt_label_behind);
    }

    /* renamed from: b */
    public final void m4809b(String str, InterfaceC1351r1 interfaceC1351r1) {
        AbstractC1354s1.m3252a(this.f9438a, str, new C0043j(this, interfaceC1351r1, 20, false), this.f9439b, 0);
    }

    /* renamed from: c */
    public final void m4810c(int i) {
        Bitmap bitmap;
        Bitmap bitmap2;
        C1655k c1655k = this.f9456s;
        C1655k c1655k2 = this.f9455r;
        C1655k c1655k3 = this.f9454q;
        if (i != 1) {
            if (this.f9446i) {
                carData cardata = carData.getInstance();
                cardata.f2440d1.m1399h(c1655k3);
                cardata.f2443e1.m1399h(c1655k2);
                cardata.f2446f1.m1399h(c1655k);
                this.f9446i = false;
            }
            CompassDialView compassDialView = this.f9440c;
            if (compassDialView != null) {
                compassDialView.f3139m = false;
                compassDialView.invalidate();
            }
            if (this.f9447j) {
                this.f9447j = false;
                try {
                    NativeLib.nativeUnbindPanel();
                } catch (Throwable unused) {
                }
            }
            this.f9445h = 0;
            return;
        }
        this.f9445h = 1;
        if (this.f9448k) {
            m4811d();
            ImageView imageView = this.f9441d;
            if (imageView != null && (bitmap2 = this.f9452o) != null) {
                imageView.setImageBitmap(bitmap2);
            }
            ImageView imageView2 = this.f9442e;
            if (imageView2 != null && (bitmap = this.f9453p) != null) {
                imageView2.setImageBitmap(bitmap);
            }
        } else {
            final int i2 = 0;
            m4809b("themes/offroad/offroad_compass_bg.bin", new InterfaceC1351r1(this) { // from class: x0.j

                /* renamed from: g */
                public final /* synthetic */ C1656l f9435g;

                {
                    this.f9435g = this;
                }

                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap3) {
                    switch (i2) {
                        case 0:
                            C1656l c1656l = this.f9435g;
                            c1656l.f9449l = bitmap3;
                            c1656l.m4811d();
                            break;
                        case 1:
                            C1656l c1656l2 = this.f9435g;
                            c1656l2.f9450m = bitmap3;
                            c1656l2.m4811d();
                            break;
                        case 2:
                            C1656l c1656l3 = this.f9435g;
                            c1656l3.f9451n = bitmap3;
                            c1656l3.m4811d();
                            break;
                        case 3:
                            C1656l c1656l4 = this.f9435g;
                            c1656l4.f9452o = bitmap3;
                            ImageView imageView3 = c1656l4.f9441d;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                        default:
                            C1656l c1656l5 = this.f9435g;
                            c1656l5.f9453p = bitmap3;
                            ImageView imageView4 = c1656l5.f9442e;
                            if (imageView4 != null) {
                                imageView4.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i3 = 1;
            m4809b("themes/offroad/offroad_compass_disc.bin", new InterfaceC1351r1(this) { // from class: x0.j

                /* renamed from: g */
                public final /* synthetic */ C1656l f9435g;

                {
                    this.f9435g = this;
                }

                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap3) {
                    switch (i3) {
                        case 0:
                            C1656l c1656l = this.f9435g;
                            c1656l.f9449l = bitmap3;
                            c1656l.m4811d();
                            break;
                        case 1:
                            C1656l c1656l2 = this.f9435g;
                            c1656l2.f9450m = bitmap3;
                            c1656l2.m4811d();
                            break;
                        case 2:
                            C1656l c1656l3 = this.f9435g;
                            c1656l3.f9451n = bitmap3;
                            c1656l3.m4811d();
                            break;
                        case 3:
                            C1656l c1656l4 = this.f9435g;
                            c1656l4.f9452o = bitmap3;
                            ImageView imageView3 = c1656l4.f9441d;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                        default:
                            C1656l c1656l5 = this.f9435g;
                            c1656l5.f9453p = bitmap3;
                            ImageView imageView4 = c1656l5.f9442e;
                            if (imageView4 != null) {
                                imageView4.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i4 = 2;
            m4809b("themes/offroad/offroad_compass_pointer.bin", new InterfaceC1351r1(this) { // from class: x0.j

                /* renamed from: g */
                public final /* synthetic */ C1656l f9435g;

                {
                    this.f9435g = this;
                }

                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap3) {
                    switch (i4) {
                        case 0:
                            C1656l c1656l = this.f9435g;
                            c1656l.f9449l = bitmap3;
                            c1656l.m4811d();
                            break;
                        case 1:
                            C1656l c1656l2 = this.f9435g;
                            c1656l2.f9450m = bitmap3;
                            c1656l2.m4811d();
                            break;
                        case 2:
                            C1656l c1656l3 = this.f9435g;
                            c1656l3.f9451n = bitmap3;
                            c1656l3.m4811d();
                            break;
                        case 3:
                            C1656l c1656l4 = this.f9435g;
                            c1656l4.f9452o = bitmap3;
                            ImageView imageView3 = c1656l4.f9441d;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                        default:
                            C1656l c1656l5 = this.f9435g;
                            c1656l5.f9453p = bitmap3;
                            ImageView imageView4 = c1656l5.f9442e;
                            if (imageView4 != null) {
                                imageView4.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i5 = 3;
            m4809b("themes/offroad/offroad_slope_side.bin", new InterfaceC1351r1(this) { // from class: x0.j

                /* renamed from: g */
                public final /* synthetic */ C1656l f9435g;

                {
                    this.f9435g = this;
                }

                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap3) {
                    switch (i5) {
                        case 0:
                            C1656l c1656l = this.f9435g;
                            c1656l.f9449l = bitmap3;
                            c1656l.m4811d();
                            break;
                        case 1:
                            C1656l c1656l2 = this.f9435g;
                            c1656l2.f9450m = bitmap3;
                            c1656l2.m4811d();
                            break;
                        case 2:
                            C1656l c1656l3 = this.f9435g;
                            c1656l3.f9451n = bitmap3;
                            c1656l3.m4811d();
                            break;
                        case 3:
                            C1656l c1656l4 = this.f9435g;
                            c1656l4.f9452o = bitmap3;
                            ImageView imageView3 = c1656l4.f9441d;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                        default:
                            C1656l c1656l5 = this.f9435g;
                            c1656l5.f9453p = bitmap3;
                            ImageView imageView4 = c1656l5.f9442e;
                            if (imageView4 != null) {
                                imageView4.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                    }
                }
            });
            final int i6 = 4;
            m4809b("themes/offroad/offroad_slope_behind.bin", new InterfaceC1351r1(this) { // from class: x0.j

                /* renamed from: g */
                public final /* synthetic */ C1656l f9435g;

                {
                    this.f9435g = this;
                }

                @Override // p098q0.InterfaceC1351r1
                /* renamed from: b */
                public final void mo57b(Bitmap bitmap3) {
                    switch (i6) {
                        case 0:
                            C1656l c1656l = this.f9435g;
                            c1656l.f9449l = bitmap3;
                            c1656l.m4811d();
                            break;
                        case 1:
                            C1656l c1656l2 = this.f9435g;
                            c1656l2.f9450m = bitmap3;
                            c1656l2.m4811d();
                            break;
                        case 2:
                            C1656l c1656l3 = this.f9435g;
                            c1656l3.f9451n = bitmap3;
                            c1656l3.m4811d();
                            break;
                        case 3:
                            C1656l c1656l4 = this.f9435g;
                            c1656l4.f9452o = bitmap3;
                            ImageView imageView3 = c1656l4.f9441d;
                            if (imageView3 != null) {
                                imageView3.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                        default:
                            C1656l c1656l5 = this.f9435g;
                            c1656l5.f9453p = bitmap3;
                            ImageView imageView4 = c1656l5.f9442e;
                            if (imageView4 != null) {
                                imageView4.setImageBitmap(bitmap3);
                                break;
                            }
                            break;
                    }
                }
            });
            this.f9448k = true;
        }
        if (!this.f9447j) {
            try {
                NativeLib.nativeBindPanel(this.f9438a);
                this.f9447j = true;
            } catch (Throwable unused2) {
            }
        }
        if (!this.f9446i) {
            carData cardata2 = carData.getInstance();
            cardata2.f2440d1.m1397f(c1655k3);
            cardata2.f2443e1.m1397f(c1655k2);
            cardata2.f2446f1.m1397f(c1655k);
            this.f9446i = true;
        }
        carData cardata3 = carData.getInstance();
        c1655k.mo1100a(Float.valueOf(cardata3.m1751h()));
        Float f2 = (Float) cardata3.f2440d1.m1395d();
        c1655k3.mo1100a(Float.valueOf(f2 != null ? f2.floatValue() : 0.0f));
        Float f3 = (Float) cardata3.f2443e1.m1395d();
        c1655k2.mo1100a(Float.valueOf(f3 != null ? f3.floatValue() : 0.0f));
    }

    /* renamed from: d */
    public final void m4811d() {
        Bitmap bitmap;
        Bitmap bitmap2;
        CompassDialView compassDialView;
        Bitmap bitmap3 = this.f9449l;
        if (bitmap3 == null || (bitmap = this.f9450m) == null || (bitmap2 = this.f9451n) == null || (compassDialView = this.f9440c) == null) {
            return;
        }
        compassDialView.m1956c(bitmap3, bitmap, bitmap2);
        if (this.f9445h == 1) {
            this.f9456s.mo1100a(Float.valueOf(carData.getInstance().m1751h()));
        }
    }
}
