package p070g;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p014G.C0105f;
import p091o.C1193c;
import p091o.C1197g;

/* renamed from: g.o */
/* loaded from: classes.dex */
public abstract class AbstractC0876o {

    /* renamed from: f */
    public static final ExecutorC0874m f4373f = new ExecutorC0874m(new ExecutorC0875n());

    /* renamed from: g */
    public static final int f4374g = -100;

    /* renamed from: h */
    public static C0105f f4375h = null;

    /* renamed from: i */
    public static C0105f f4376i = null;

    /* renamed from: j */
    public static Boolean f4377j = null;

    /* renamed from: k */
    public static boolean f4378k = false;

    /* renamed from: l */
    public static final C1193c f4379l = new C1193c();

    /* renamed from: m */
    public static final Object f4380m = new Object();

    /* renamed from: n */
    public static final Object f4381n = new Object();

    /* renamed from: b */
    public static boolean m2416b(Context context) {
        if (f4377j == null) {
            try {
                int i = AbstractServiceC0856E.f4278f;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AbstractServiceC0856E.class), AbstractC0855D.m2374a() | 128).metaData;
                if (bundle != null) {
                    f4377j = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f4377j = Boolean.FALSE;
            }
        }
        return f4377j.booleanValue();
    }

    /* renamed from: e */
    public static void m2417e(LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z) {
        synchronized (f4380m) {
            try {
                Iterator it = f4379l.iterator();
                while (true) {
                    C1197g c1197g = (C1197g) it;
                    if (c1197g.hasNext()) {
                        AbstractC0876o abstractC0876o = (AbstractC0876o) ((WeakReference) c1197g.next()).get();
                        if (abstractC0876o == layoutInflaterFactory2C0887z || abstractC0876o == null) {
                            c1197g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: a */
    public abstract void mo2418a();

    /* renamed from: c */
    public abstract void mo2419c();

    /* renamed from: d */
    public abstract void mo2420d();

    /* renamed from: f */
    public abstract boolean mo2421f(int i);

    /* renamed from: g */
    public abstract void mo2422g(int i);

    /* renamed from: h */
    public abstract void mo2423h(View view);

    /* renamed from: i */
    public abstract void mo2424i(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: k */
    public abstract void mo2425k(CharSequence charSequence);
}
