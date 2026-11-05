package p070g;

import android.R;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.media.C0639g;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import p001A0.RunnableC0011e;
import p003B.AbstractC0035b;
import p003B.AbstractC0048o;
import p014G.C0105f;
import p020J.InterfaceC0143a;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0387O;
import p046X.C0396Y;
import p046X.C0424w;
import p046X.C0426y;
import p046X.C0427z;
import p052a.AbstractActivityC0472l;
import p059c0.C0576a;
import p070g.AbstractActivityC0870i;
import p076j.C0954c;
import p076j.C0959h;
import p076j.C0961j;
import p082l.AbstractC1102a1;
import p082l.C1064H0;
import p082l.C1097Y0;
import p082l.C1141t;
import p091o.C1195e;
import p091o.C1202l;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;
import p123z.InterfaceC1694b;

/* renamed from: g.i */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0870i extends AbstractActivityC0472l implements InterfaceC0871j, InterfaceC1694b {

    /* renamed from: A */
    public boolean f4363A;

    /* renamed from: B */
    public boolean f4364B;

    /* renamed from: D */
    public LayoutInflaterFactory2C0887z f4366D;

    /* renamed from: y */
    public final C0639g f4367y = new C0639g(16, new C0427z(this));

    /* renamed from: z */
    public final C0555t f4368z = new C0555t(this);

    /* renamed from: C */
    public boolean f4365C = true;

    public AbstractActivityC0870i() {
        this.f1504i.f4475b.m2465e("android:support:lifecycle", new C0424w(0, this));
        final int i = 0;
        m1185f(new InterfaceC0143a(this) { // from class: X.x

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC0870i f1381b;

            {
                this.f1381b = this;
            }

            @Override // p020J.InterfaceC0143a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        this.f1381b.f4367y.m1882y();
                        break;
                    default:
                        this.f1381b.f4367y.m1882y();
                        break;
                }
            }
        });
        final int i2 = 1;
        this.f1512q.add(new InterfaceC0143a(this) { // from class: X.x

            /* renamed from: b */
            public final /* synthetic */ AbstractActivityC0870i f1381b;

            {
                this.f1381b = this;
            }

            @Override // p020J.InterfaceC0143a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        this.f1381b.f4367y.m1882y();
                        break;
                    default:
                        this.f1381b.f4367y.m1882y();
                        break;
                }
            }
        });
        m1186g(new C0426y(this, 0));
        this.f1504i.f4475b.m2465e("androidx:appcompat", new C0868g(this));
        m1186g(new C0869h(this));
    }

    /* renamed from: n */
    public static boolean m2403n(C0387O c0387o) {
        EnumC0548m enumC0548m = EnumC0548m.f1992c;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : c0387o.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null) {
                C0427z c0427z = abstractComponentCallbacksC0423v.f1375x;
                if ((c0427z == null ? null : c0427z.f1388o) != null) {
                    z2 |= m2403n(abstractComponentCallbacksC0423v.m1125h());
                }
                C0396Y c0396y = abstractComponentCallbacksC0423v.f1352T;
                EnumC0548m enumC0548m2 = EnumC0548m.f1993d;
                if (c0396y != null && c0396y.mo1068d().f2001c.compareTo(enumC0548m2) >= 0) {
                    C0555t c0555t = abstractComponentCallbacksC0423v.f1352T.f1224i;
                    c0555t.m1379c("setCurrentState");
                    c0555t.m1381e(enumC0548m);
                    z2 = true;
                }
                if (abstractComponentCallbacksC0423v.f1351S.f2001c.compareTo(enumC0548m2) >= 0) {
                    C0555t c0555t2 = abstractComponentCallbacksC0423v.f1351S;
                    c0555t2.m1379c("setCurrentState");
                    c0555t2.m1381e(enumC0548m);
                    z2 = true;
                }
            }
        }
        return z2;
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2406m();
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        layoutInflaterFactory2C0887z.m2456v();
        ((ViewGroup) layoutInflaterFactory2C0887z.f4421F.findViewById(R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0887z.f4457r.m2435a(layoutInflaterFactory2C0887z.f4456q.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        Configuration configuration;
        int i = 3;
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        layoutInflaterFactory2C0887z.f4435T = true;
        int i2 = layoutInflaterFactory2C0887z.f4439X;
        if (i2 == -100) {
            i2 = AbstractC0876o.f4374g;
        }
        int m2442B = layoutInflaterFactory2C0887z.m2442B(context, i2);
        if (AbstractC0876o.m2416b(context) && AbstractC0876o.m2416b(context)) {
            if (Build.VERSION.SDK_INT < 33) {
                synchronized (AbstractC0876o.f4381n) {
                    try {
                        C0105f c0105f = AbstractC0876o.f4375h;
                        if (c0105f == null) {
                            if (AbstractC0876o.f4376i == null) {
                                AbstractC0876o.f4376i = C0105f.m348a(AbstractC1695c.m4964g(context));
                            }
                            if (!AbstractC0876o.f4376i.f340a.f341a.isEmpty()) {
                                AbstractC0876o.f4375h = AbstractC0876o.f4376i;
                            }
                        } else if (!c0105f.equals(AbstractC0876o.f4376i)) {
                            C0105f c0105f2 = AbstractC0876o.f4375h;
                            AbstractC0876o.f4376i = c0105f2;
                            AbstractC1695c.m4963f(context, c0105f2.f340a.f341a.toLanguageTags());
                        }
                    } finally {
                    }
                }
            } else if (!AbstractC0876o.f4378k) {
                AbstractC0876o.f4373f.execute(new RunnableC0011e(context, i));
            }
        }
        C0105f m2439n = LayoutInflaterFactory2C0887z.m2439n(context);
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflaterFactory2C0887z.m2440s(context, m2442B, m2439n, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof C0954c) {
            try {
                ((C0954c) context).m2496a(LayoutInflaterFactory2C0887z.m2440s(context, m2442B, m2439n, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflaterFactory2C0887z.f4415o0) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (configuration3.equals(configuration4)) {
                configuration = null;
            } else {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f2 = configuration3.fontScale;
                    float f3 = configuration4.fontScale;
                    if (f2 != f3) {
                        configuration.fontScale = f3;
                    }
                    int i3 = configuration3.mcc;
                    int i4 = configuration4.mcc;
                    if (i3 != i4) {
                        configuration.mcc = i4;
                    }
                    int i5 = configuration3.mnc;
                    int i6 = configuration4.mnc;
                    if (i5 != i6) {
                        configuration.mnc = i6;
                    }
                    AbstractC0881t.m2428a(configuration3, configuration4, configuration);
                    int i7 = configuration3.touchscreen;
                    int i8 = configuration4.touchscreen;
                    if (i7 != i8) {
                        configuration.touchscreen = i8;
                    }
                    int i9 = configuration3.keyboard;
                    int i10 = configuration4.keyboard;
                    if (i9 != i10) {
                        configuration.keyboard = i10;
                    }
                    int i11 = configuration3.keyboardHidden;
                    int i12 = configuration4.keyboardHidden;
                    if (i11 != i12) {
                        configuration.keyboardHidden = i12;
                    }
                    int i13 = configuration3.navigation;
                    int i14 = configuration4.navigation;
                    if (i13 != i14) {
                        configuration.navigation = i14;
                    }
                    int i15 = configuration3.navigationHidden;
                    int i16 = configuration4.navigationHidden;
                    if (i15 != i16) {
                        configuration.navigationHidden = i16;
                    }
                    int i17 = configuration3.orientation;
                    int i18 = configuration4.orientation;
                    if (i17 != i18) {
                        configuration.orientation = i18;
                    }
                    int i19 = configuration3.screenLayout & 15;
                    int i20 = configuration4.screenLayout & 15;
                    if (i19 != i20) {
                        configuration.screenLayout |= i20;
                    }
                    int i21 = configuration3.screenLayout & 192;
                    int i22 = configuration4.screenLayout & 192;
                    if (i21 != i22) {
                        configuration.screenLayout |= i22;
                    }
                    int i23 = configuration3.screenLayout & 48;
                    int i24 = configuration4.screenLayout & 48;
                    if (i23 != i24) {
                        configuration.screenLayout |= i24;
                    }
                    int i25 = configuration3.screenLayout & 768;
                    int i26 = configuration4.screenLayout & 768;
                    if (i25 != i26) {
                        configuration.screenLayout |= i26;
                    }
                    int i27 = configuration3.colorMode & 3;
                    int i28 = 3 & configuration4.colorMode;
                    if (i27 != i28) {
                        configuration.colorMode = i28 | configuration.colorMode;
                    }
                    int i29 = configuration3.colorMode & 12;
                    int i30 = configuration4.colorMode & 12;
                    if (i29 != i30) {
                        configuration.colorMode |= i30;
                    }
                    int i31 = configuration3.uiMode & 15;
                    int i32 = configuration4.uiMode & 15;
                    if (i31 != i32) {
                        configuration.uiMode |= i32;
                    }
                    int i33 = configuration3.uiMode & 48;
                    int i34 = configuration4.uiMode & 48;
                    if (i33 != i34) {
                        configuration.uiMode |= i34;
                    }
                    int i35 = configuration3.screenWidthDp;
                    int i36 = configuration4.screenWidthDp;
                    if (i35 != i36) {
                        configuration.screenWidthDp = i36;
                    }
                    int i37 = configuration3.screenHeightDp;
                    int i38 = configuration4.screenHeightDp;
                    if (i37 != i38) {
                        configuration.screenHeightDp = i38;
                    }
                    int i39 = configuration3.smallestScreenWidthDp;
                    int i40 = configuration4.smallestScreenWidthDp;
                    if (i39 != i40) {
                        configuration.smallestScreenWidthDp = i40;
                    }
                    int i41 = configuration3.densityDpi;
                    int i42 = configuration4.densityDpi;
                    if (i41 != i42) {
                        configuration.densityDpi = i42;
                    }
                }
            }
            Configuration m2440s = LayoutInflaterFactory2C0887z.m2440s(context, m2442B, m2439n, configuration, true);
            C0954c c0954c = new C0954c(context, com.altaysoft.t500_split.R.style.Theme_AppCompat_Empty);
            c0954c.m2496a(m2440s);
            try {
                if (context.getTheme() != null) {
                    Resources.Theme theme = c0954c.getTheme();
                    if (Build.VERSION.SDK_INT >= 29) {
                        AbstractC0048o.m100a(theme);
                    } else {
                        synchronized (AbstractC0035b.f122e) {
                            if (!AbstractC0035b.f124g) {
                                try {
                                    Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                                    AbstractC0035b.f123f = declaredMethod;
                                    declaredMethod.setAccessible(true);
                                } catch (NoSuchMethodException e2) {
                                    Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e2);
                                }
                                AbstractC0035b.f124g = true;
                            }
                            Method method = AbstractC0035b.f123f;
                            if (method != null) {
                                try {
                                    method.invoke(theme, null);
                                } catch (IllegalAccessException | InvocationTargetException e3) {
                                    Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e3);
                                    AbstractC0035b.f123f = null;
                                }
                            }
                        }
                    }
                }
            } catch (NullPointerException unused3) {
            }
            context = c0954c;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflaterFactory2C0887z) m2404k()).m2460z();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflaterFactory2C0887z) m2404k()).m2460z();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1.equals("--list-dumpables") == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003c, code lost:
    
        if (r1.equals("--dump-dumpable") == false) goto L34;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        if (strArr != null && strArr.length != 0) {
            String str2 = strArr[0];
            switch (str2.hashCode()) {
                case -645125871:
                    if (str2.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    if (str2.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29) {
                        return;
                    }
                    break;
                case 1455016274:
                    if (str2.equals("--autofill")) {
                        return;
                    }
                    break;
            }
        }
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str3 = str + "  ";
        printWriter.print(str3);
        printWriter.print("mCreated=");
        printWriter.print(this.f4363A);
        printWriter.print(" mResumed=");
        printWriter.print(this.f4364B);
        printWriter.print(" mStopped=");
        printWriter.print(this.f4365C);
        if (getApplication() != null) {
            C1202l c1202l = ((C0576a) new C0639g(mo1067c(), C0576a.f2191c).m1881w(C0576a.class)).f2192b;
            if (c1202l.f5422c > 0) {
                printWriter.print(str3);
                printWriter.println("Loaders:");
                if (c1202l.f5422c > 0) {
                    if (c1202l.f5421b[0] != null) {
                        throw new ClassCastException();
                    }
                    printWriter.print(str3);
                    printWriter.print("  #");
                    printWriter.print(c1202l.f5420a[0]);
                    printWriter.print(": ");
                    throw null;
                }
            }
        }
        ((C0427z) this.f4367y.f3011g).f1387n.m1034v(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        layoutInflaterFactory2C0887z.m2456v();
        return layoutInflaterFactory2C0887z.f4456q.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        if (layoutInflaterFactory2C0887z.f4460u == null) {
            layoutInflaterFactory2C0887z.m2460z();
            C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
            layoutInflaterFactory2C0887z.f4460u = new C0959h(c0861j != null ? c0861j.m2392w0() : layoutInflaterFactory2C0887z.f4455p);
        }
        return layoutInflaterFactory2C0887z.f4460u;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC1102a1.f5150a;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        if (layoutInflaterFactory2C0887z.f4459t != null) {
            layoutInflaterFactory2C0887z.m2460z();
            layoutInflaterFactory2C0887z.f4459t.getClass();
            layoutInflaterFactory2C0887z.m2441A(0);
        }
    }

    /* renamed from: k */
    public final AbstractC0876o m2404k() {
        if (this.f4366D == null) {
            ExecutorC0874m executorC0874m = AbstractC0876o.f4373f;
            this.f4366D = new LayoutInflaterFactory2C0887z(this, null, this, this);
        }
        return this.f4366D;
    }

    /* renamed from: l */
    public final C0387O m2405l() {
        return ((C0427z) this.f4367y.f3011g).f1387n;
    }

    /* renamed from: m */
    public final void m2406m() {
        AbstractC0528K.m1368f(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC1461d.m3494e("<this>", decorView);
        decorView.setTag(com.altaysoft.t500_split.R.id.view_tree_view_model_store_owner, this);
        AbstractC1687o.m4928W(getWindow().getDecorView(), this);
        AbstractC1680h.m4854P(getWindow().getDecorView(), this);
    }

    /* renamed from: o */
    public final void m2407o() {
        super.onDestroy();
        ((C0427z) this.f4367y.f3011g).f1387n.m1023k();
        this.f4368z.m1380d(EnumC0547l.ON_DESTROY);
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.f4367y.m1882y();
        super.onActivityResult(i, i2, intent);
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        if (layoutInflaterFactory2C0887z.f4426K && layoutInflaterFactory2C0887z.f4420E) {
            layoutInflaterFactory2C0887z.m2460z();
            C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
            if (c0861j != null) {
                c0861j.m2395z0(c0861j.f4294c.getResources().getBoolean(com.altaysoft.t500_split.R.bool.abc_action_bar_embed_tabs));
            }
        }
        C1141t m2762a = C1141t.m2762a();
        Context context = layoutInflaterFactory2C0887z.f4455p;
        synchronized (m2762a) {
            C1064H0 c1064h0 = m2762a.f5273a;
            synchronized (c1064h0) {
                C1195e c1195e = (C1195e) c1064h0.f5049b.get(context);
                if (c1195e != null) {
                    c1195e.m2853a();
                }
            }
        }
        layoutInflaterFactory2C0887z.f4438W = new Configuration(layoutInflaterFactory2C0887z.f4455p.getResources().getConfiguration());
        layoutInflaterFactory2C0887z.m2449l(false, false);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f4368z.m1380d(EnumC0547l.ON_CREATE);
        C0387O c0387o = ((C0427z) this.f4367y.f3011g).f1387n;
        c0387o.f1140E = false;
        c0387o.f1141F = false;
        c0387o.f1147L.f1190g = false;
        c0387o.m1032t(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0427z) this.f4367y.f3011g).f1387n.f1154f.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        m2407o();
        m2404k().mo2420d();
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent m4960c;
        if (m2408p(i, menuItem)) {
            return true;
        }
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (menuItem.getItemId() == 16908332 && c0861j != null && (((C1097Y0) c0861j.f4298g).f5133b & 4) != 0 && (m4960c = AbstractC1695c.m4960c(this)) != null) {
            if (!shouldUpRecreateTask(m4960c)) {
                navigateUpTo(m4960c);
                return true;
            }
            ArrayList arrayList = new ArrayList();
            Intent m4960c2 = AbstractC1695c.m4960c(this);
            if (m4960c2 == null) {
                m4960c2 = AbstractC1695c.m4960c(this);
            }
            if (m4960c2 != null) {
                ComponentName component = m4960c2.getComponent();
                if (component == null) {
                    component = m4960c2.resolveActivity(getPackageManager());
                }
                int size = arrayList.size();
                try {
                    Intent m4961d = AbstractC1695c.m4961d(this, component);
                    while (m4961d != null) {
                        arrayList.add(size, m4961d);
                        m4961d = AbstractC1695c.m4961d(this, m4961d.getComponent());
                    }
                    arrayList.add(m4960c2);
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
                    throw new IllegalArgumentException(e2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
            intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
            startActivities(intentArr, null);
            try {
                finishAffinity();
                return true;
            } catch (IllegalStateException unused) {
                finish();
                return true;
            }
        }
        return false;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f4364B = false;
        ((C0427z) this.f4367y.f3011g).f1387n.m1032t(5);
        this.f4368z.m1380d(EnumC0547l.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflaterFactory2C0887z) m2404k()).m2456v();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        m2409q();
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (c0861j != null) {
            c0861j.f4313v = true;
        }
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.f4367y.m1882y();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0639g c0639g = this.f4367y;
        c0639g.m1882y();
        super.onResume();
        this.f4364B = true;
        ((C0427z) c0639g.f3011g).f1387n.m1037y(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        m2410r();
        ((LayoutInflaterFactory2C0887z) m2404k()).m2449l(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.f4367y.m1882y();
    }

    @Override // android.app.Activity
    public final void onStop() {
        m2411s();
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2404k();
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (c0861j != null) {
            c0861j.f4313v = false;
            C0961j c0961j = c0861j.f4312u;
            if (c0961j != null) {
                c0961j.m2502a();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        m2404k().mo2425k(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflaterFactory2C0887z) m2404k()).m2460z();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    /* renamed from: p */
    public final boolean m2408p(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0427z) this.f4367y.f3011g).f1387n.m1021i();
        }
        return false;
    }

    /* renamed from: q */
    public final void m2409q() {
        super.onPostResume();
        this.f4368z.m1380d(EnumC0547l.ON_RESUME);
        C0387O c0387o = ((C0427z) this.f4367y.f3011g).f1387n;
        c0387o.f1140E = false;
        c0387o.f1141F = false;
        c0387o.f1147L.f1190g = false;
        c0387o.m1032t(7);
    }

    /* renamed from: r */
    public final void m2410r() {
        C0639g c0639g = this.f4367y;
        c0639g.m1882y();
        super.onStart();
        this.f4365C = false;
        boolean z2 = this.f4363A;
        C0427z c0427z = (C0427z) c0639g.f3011g;
        if (!z2) {
            this.f4363A = true;
            C0387O c0387o = c0427z.f1387n;
            c0387o.f1140E = false;
            c0387o.f1141F = false;
            c0387o.f1147L.f1190g = false;
            c0387o.m1032t(4);
        }
        c0427z.f1387n.m1037y(true);
        this.f4368z.m1380d(EnumC0547l.ON_START);
        C0387O c0387o2 = c0427z.f1387n;
        c0387o2.f1140E = false;
        c0387o2.f1141F = false;
        c0387o2.f1147L.f1190g = false;
        c0387o2.m1032t(5);
    }

    /* renamed from: s */
    public final void m2411s() {
        super.onStop();
        this.f4365C = true;
        while (m2403n(m2405l())) {
        }
        C0387O c0387o = ((C0427z) this.f4367y.f3011g).f1387n;
        c0387o.f1141F = true;
        c0387o.f1147L.f1190g = true;
        c0387o.m1032t(4);
        this.f4368z.m1380d(EnumC0547l.ON_STOP);
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        m2406m();
        m2404k().mo2422g(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflaterFactory2C0887z) m2404k()).f4440Y = i;
    }

    @Override // p052a.AbstractActivityC0472l, android.app.Activity
    public void setContentView(View view) {
        m2406m();
        m2404k().mo2423h(view);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0427z) this.f4367y.f3011g).f1387n.f1154f.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2406m();
        m2404k().mo2424i(view, layoutParams);
    }
}
