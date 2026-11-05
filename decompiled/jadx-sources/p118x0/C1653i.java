package p118x0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.C0560y;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.splitinfo.CompassDialView;
import java.util.Locale;
import p003B.C0043j;
import p098q0.AbstractC1354s1;
import p098q0.InterfaceC1351r1;

/* renamed from: x0.i */
/* loaded from: classes.dex */
public final class C1653i {

    /* renamed from: A */
    public boolean f9390A;

    /* renamed from: B */
    public boolean f9391B;

    /* renamed from: C */
    public Bitmap f9392C;

    /* renamed from: D */
    public Bitmap f9393D;

    /* renamed from: E */
    public Bitmap f9394E;

    /* renamed from: F */
    public Bitmap f9395F;

    /* renamed from: G */
    public Bitmap f9396G;

    /* renamed from: H */
    public Bitmap f9397H;

    /* renamed from: I */
    public Bitmap f9398I;

    /* renamed from: J */
    public Bitmap f9399J;

    /* renamed from: K */
    public Bitmap f9400K;

    /* renamed from: a */
    public final Context f9408a;

    /* renamed from: d */
    public CompassDialView f9411d;

    /* renamed from: e */
    public ImageView f9412e;

    /* renamed from: f */
    public ImageView f9413f;

    /* renamed from: g */
    public TextView f9414g;

    /* renamed from: h */
    public TextView f9415h;

    /* renamed from: i */
    public ImageView f9416i;

    /* renamed from: j */
    public ImageView f9417j;

    /* renamed from: k */
    public ImageView f9418k;

    /* renamed from: l */
    public ImageView f9419l;

    /* renamed from: m */
    public ImageView f9420m;

    /* renamed from: n */
    public ImageView f9421n;

    /* renamed from: o */
    public TextView f9422o;

    /* renamed from: p */
    public TextView f9423p;

    /* renamed from: q */
    public TextView f9424q;

    /* renamed from: r */
    public TextView f9425r;

    /* renamed from: s */
    public TextView f9426s;

    /* renamed from: t */
    public TextView f9427t;

    /* renamed from: u */
    public TextView f9428u;

    /* renamed from: v */
    public TextView f9429v;

    /* renamed from: w */
    public TextView f9430w;

    /* renamed from: x */
    public TextView f9431x;

    /* renamed from: y */
    public TextView f9432y;

    /* renamed from: z */
    public boolean f9433z;

    /* renamed from: b */
    public final Handler f9409b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final PorterDuffColorFilter f9410c = new PorterDuffColorFilter(-11344, PorterDuff.Mode.SRC_IN);

    /* renamed from: L */
    public final C1650f f9401L = new C1650f(this, 0);

    /* renamed from: M */
    public final C1650f f9402M = new C1650f(this, 1);

    /* renamed from: N */
    public final C1650f f9403N = new C1650f(this, 2);

    /* renamed from: O */
    public final C1650f f9404O = new C1650f(this, 3);

    /* renamed from: P */
    public final C1650f f9405P = new C1650f(this, 4);

    /* renamed from: Q */
    public final C1650f f9406Q = new C1650f(this, 5);

    /* renamed from: R */
    public final C1650f f9407R = new C1650f(this, 6);

    public C1653i(Context context) {
        this.f9408a = context.getApplicationContext();
    }

    /* renamed from: d */
    public static boolean m4796d(float f2) {
        return f2 > -500.0f && f2 < 10000.0f && Math.abs(f2 - 65535.0f) > 0.5f;
    }

    /* renamed from: e */
    public static boolean m4797e(float f2) {
        return (f2 == -99.0f || f2 == 3.5f) ? false : true;
    }

    /* renamed from: a */
    public final void m4798a(Float f2) {
        if (this.f9423p == null) {
            return;
        }
        Context context = this.f9408a;
        if (f2 != null && m4796d(f2.floatValue())) {
            this.f9423p.setText(context.getString(R.string.split_info_offroad_alt_fmt, f2));
            return;
        }
        this.f9423p.setText(context.getString(R.string.split_info_offroad_na) + " m");
    }

    /* renamed from: b */
    public final void m4799b(TextView textView, TextView textView2, float f2, float f3, String str) {
        String string = this.f9408a.getString(R.string.split_info_offroad_na);
        if (textView != null) {
            textView.setText(m4797e(f2) ? String.format(Locale.ENGLISH, str, Float.valueOf(f2)).replace(',', '.') : string);
            int i = -1519440;
            if (m4797e(f2)) {
                float f4 = cfgData.m1784i().f2580V1;
                if (f2 < 0.95f * f4) {
                    i = -65536;
                } else if (f2 < f4) {
                    i = -256;
                }
            }
            textView.setTextColor(i);
        }
        if (textView2 != null) {
            if (m4797e(f3)) {
                string = String.format(Locale.ENGLISH, "%.0f°", Float.valueOf(f3)).replace(',', '.');
            }
            textView2.setText(string);
            textView2.setTextColor(-1712795472);
        }
    }

    /* renamed from: c */
    public final void m4800c(CompassDialView compassDialView, ImageView imageView, ImageView imageView2, TextView textView, TextView textView2, ImageView imageView3, ImageView imageView4, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13) {
        this.f9411d = compassDialView;
        this.f9412e = imageView;
        this.f9413f = imageView2;
        this.f9414g = textView;
        this.f9415h = textView2;
        this.f9416i = imageView3;
        this.f9417j = imageView4;
        this.f9418k = imageView5;
        this.f9419l = imageView6;
        this.f9420m = imageView7;
        this.f9421n = imageView8;
        this.f9422o = textView3;
        this.f9423p = textView4;
        this.f9424q = textView5;
        this.f9425r = textView6;
        this.f9426s = textView7;
        this.f9427t = textView8;
        this.f9428u = textView9;
        this.f9429v = textView10;
        this.f9430w = textView11;
        this.f9431x = textView12;
        this.f9432y = textView13;
        PorterDuffColorFilter porterDuffColorFilter = this.f9410c;
        if (imageView3 != null) {
            imageView3.setColorFilter(porterDuffColorFilter);
        }
        ImageView imageView9 = this.f9417j;
        if (imageView9 != null) {
            imageView9.setColorFilter(porterDuffColorFilter);
        }
    }

    /* renamed from: f */
    public final void m4801f(String str, InterfaceC1351r1 interfaceC1351r1) {
        AbstractC1354s1.m3252a(this.f9408a, str, new C0043j(this, interfaceC1351r1, 19, false), this.f9409b, 0);
    }

    /* renamed from: g */
    public final void m4802g(Float f2) {
        if (!this.f9433z || this.f9423p == null) {
            return;
        }
        if (((Float) carData.getInstance().f2407P.m1395d()).floatValue() > 0.0f) {
            return;
        }
        if (!m4796d(f2 != null ? f2.floatValue() : 0.0f)) {
            f2 = null;
        }
        m4798a(f2);
    }

    /* renamed from: h */
    public final void m4803h(Float f2) {
        if (!this.f9433z || this.f9422o == null) {
            return;
        }
        Context context = this.f9408a;
        if (f2 != null && f2.floatValue() > 0.0f) {
            this.f9422o.setText(context.getString(R.string.split_info_offroad_baro_fmt, f2));
            m4798a(Float.valueOf(SensorManager.getAltitude(1013.25f, f2.floatValue())));
            return;
        }
        this.f9422o.setText(context.getString(R.string.split_info_offroad_na) + " hPa");
        m4798a(null);
    }

    /* renamed from: i */
    public final void m4804i(Float f2) {
        if (this.f9433z) {
            float f3 = (((-(f2 != null ? f2.floatValue() : 0.0f)) / 10.0f) / 2.0f) * 1.1290323f;
            ImageView imageView = this.f9418k;
            if (imageView != null) {
                imageView.setRotation(f3);
            }
            ImageView imageView2 = this.f9419l;
            if (imageView2 != null) {
                imageView2.setRotation(f3);
            }
            ImageView imageView3 = this.f9420m;
            if (imageView3 != null) {
                imageView3.setRotation(0.0f);
            }
            ImageView imageView4 = this.f9421n;
            if (imageView4 != null) {
                imageView4.setRotation(0.0f);
            }
            TextView textView = this.f9424q;
            if (textView != null) {
                textView.setText(this.f9408a.getString(R.string.split_info_offroad_steer_fmt, Float.valueOf(f3)));
            }
        }
    }

    /* renamed from: j */
    public final void m4805j() {
        if (this.f9433z) {
            this.f9433z = false;
            carData cardata = carData.getInstance();
            cardata.f2440d1.m1399h(this.f9401L);
            cardata.f2443e1.m1399h(this.f9402M);
            cardata.f2446f1.m1399h(this.f9403N);
            cardata.f2407P.m1399h(this.f9404O);
            cardata.f2405O.m1399h(this.f9405P);
            cardata.f2409Q.m1399h(this.f9406Q);
            C0560y c0560y = cardata.f2389G;
            C1650f c1650f = this.f9407R;
            c0560y.m1399h(c1650f);
            cardata.f2391H.m1399h(c1650f);
            cardata.f2393I.m1399h(c1650f);
            cardata.f2395J.m1399h(c1650f);
            cardata.f2397K.m1399h(c1650f);
            cardata.f2399L.m1399h(c1650f);
            cardata.f2401M.m1399h(c1650f);
            cardata.f2403N.m1399h(c1650f);
            CompassDialView compassDialView = this.f9411d;
            if (compassDialView != null) {
                compassDialView.f3139m = false;
                compassDialView.invalidate();
            }
        }
    }

    /* renamed from: k */
    public final void m4806k() {
        if (this.f9433z) {
            carData cardata = carData.getInstance();
            String str = (cardata.m1715C() > 10.0f || cardata.m1716D() > 10.0f || cardata.m1717E() > 10.0f || cardata.m1718F() > 10.0f) ? "%.0f" : "%.1f";
            m4799b(this.f9425r, this.f9426s, cardata.m1715C(), ((Float) cardata.f2391H.m1395d()).floatValue(), str);
            m4799b(this.f9427t, this.f9428u, cardata.m1716D(), ((Float) cardata.f2395J.m1395d()).floatValue(), str);
            m4799b(this.f9429v, this.f9430w, cardata.m1717E(), ((Float) cardata.f2399L.m1395d()).floatValue(), str);
            m4799b(this.f9431x, this.f9432y, cardata.m1718F(), ((Float) cardata.f2403N.m1395d()).floatValue(), str);
        }
    }

    /* renamed from: l */
    public final void m4807l() {
        Bitmap bitmap;
        Bitmap bitmap2;
        CompassDialView compassDialView;
        Bitmap bitmap3 = this.f9392C;
        if (bitmap3 == null || (bitmap = this.f9393D) == null || (bitmap2 = this.f9394E) == null || (compassDialView = this.f9411d) == null) {
            return;
        }
        compassDialView.m1956c(bitmap3, bitmap, bitmap2);
        if (this.f9433z) {
            this.f9403N.mo1100a(Float.valueOf(carData.getInstance().m1751h()));
        }
    }
}
