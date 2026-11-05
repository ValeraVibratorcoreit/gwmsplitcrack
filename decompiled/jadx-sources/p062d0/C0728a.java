package p062d0;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Locale;
import java.util.concurrent.Executor;
import p001A0.RunnableC0017k;
import p001A0.RunnableC0020n;
import p106t0.EnumC1457c;

/* renamed from: d0.a */
/* loaded from: classes.dex */
public final class C0728a {

    /* renamed from: a */
    public boolean f3829a;

    /* renamed from: b */
    public final Object f3830b;

    /* renamed from: c */
    public Object f3831c;

    /* renamed from: d */
    public Object f3832d;

    /* renamed from: e */
    public Object f3833e;

    /* renamed from: f */
    public Object f3834f;

    /* renamed from: g */
    public Object f3835g;

    /* renamed from: h */
    public Object f3836h;

    public C0728a(Context context) {
        this.f3830b = new Handler(Looper.getMainLooper());
        this.f3836h = new RunnableC0020n(28, this);
        context.getApplicationContext();
    }

    /* renamed from: b */
    public static String m2155b(float f2) {
        if (!m2159i(f2)) {
            return "—";
        }
        Locale locale = Locale.US;
        return Math.round(f2) + " A";
    }

    /* renamed from: c */
    public static String m2156c(float f2, boolean z2) {
        return (!m2159i(f2) || f2 < 0.0f) ? "—" : z2 ? String.format(Locale.US, "%.1f %%", Float.valueOf(f2)) : f2 < 0.1f ? "—" : String.format(Locale.US, "%.1f V", Float.valueOf(f2));
    }

    /* renamed from: d */
    public static String m2157d(float f2) {
        return (!m2159i(f2) || f2 < 0.0f) ? "—" : String.format(Locale.US, "%.0f %%", Float.valueOf(f2));
    }

    /* renamed from: e */
    public static String m2158e(float f2) {
        return (!m2159i(f2) || f2 < 0.1f) ? "—" : String.format(Locale.US, "%.1f V", Float.valueOf(f2));
    }

    /* renamed from: i */
    public static boolean m2159i(float f2) {
        return (Float.isNaN(f2) || Float.isInfinite(f2)) ? false : true;
    }

    /* renamed from: a */
    public void m2160a(View view) {
        if (view == null) {
            return;
        }
        this.f3831c = (TextView) view.findViewById(R.id.elec_val_12v);
        this.f3832d = (TextView) view.findViewById(R.id.elec_val_48v);
        this.f3833e = (TextView) view.findViewById(R.id.elec_val_amp);
        this.f3834f = (TextView) view.findViewById(R.id.elec_val_level);
        View findViewById = view.findViewById(R.id.elec_hv);
        this.f3835g = findViewById;
        EnumC1457c enumC1457c = cfgData.m1784i().f2543M0;
        boolean z2 = enumC1457c != null && enumC1457c.f7149h;
        if (findViewById != null) {
            findViewById.setVisibility(z2 ? 0 : 4);
        }
    }

    /* renamed from: f */
    public FileInputStream m2161f(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message != null && message.contains("compressed")) {
                ((InterfaceC0731d) this.f3831c).mo948i();
            }
            return null;
        }
    }

    /* renamed from: g */
    public void m2162g() {
        carData cardata = carData.getInstance();
        EnumC1457c enumC1457c = cfgData.m1784i().f2543M0;
        TextView textView = (TextView) this.f3831c;
        String m2158e = m2158e(cardata.m1741c());
        if (textView != null) {
            textView.setText(m2158e);
        }
        TextView textView2 = (TextView) this.f3834f;
        Float f2 = (Float) cardata.f2442e0.m1395d();
        String m2157d = m2157d(f2 != null ? f2.floatValue() : 0.0f);
        if (textView2 != null) {
            textView2.setText(m2157d);
        }
        boolean z2 = true;
        boolean z3 = enumC1457c != null && enumC1457c.f7149h;
        View view = (View) this.f3835g;
        if (view != null) {
            view.setVisibility(z3 ? 0 : 4);
        }
        if (z3) {
            TextView textView3 = (TextView) this.f3832d;
            float m1761m = cardata.m1761m();
            if (enumC1457c != EnumC1457c.T500_Urban && enumC1457c != EnumC1457c.T400 && enumC1457c != EnumC1457c.T700_100 && enumC1457c != EnumC1457c.T700) {
                z2 = false;
            }
            String m2156c = m2156c(m1761m, z2);
            if (textView3 != null) {
                textView3.setText(m2156c);
            }
            TextView textView4 = (TextView) this.f3833e;
            String m2155b = m2155b(cardata.m1759l());
            if (textView4 != null) {
                textView4.setText(m2155b);
            }
        }
    }

    /* renamed from: h */
    public void m2163h(int i, Serializable serializable) {
        ((Executor) this.f3830b).execute(new RunnableC0017k(this, i, serializable, 4));
    }

    public C0728a(AssetManager assetManager, Executor executor, InterfaceC0731d interfaceC0731d, String str, File file) {
        this.f3829a = false;
        this.f3830b = executor;
        this.f3831c = interfaceC0731d;
        this.f3835g = str;
        this.f3834f = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i <= 34) {
            switch (i) {
                case 28:
                case 29:
                case 30:
                    bArr = AbstractC0732e.f3850e;
                    break;
                case 31:
                case 32:
                case 33:
                case 34:
                    bArr = AbstractC0732e.f3849d;
                    break;
            }
        }
        this.f3832d = bArr;
    }
}
