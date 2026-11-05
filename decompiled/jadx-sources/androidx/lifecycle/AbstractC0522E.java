package androidx.lifecycle;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Build;
import androidx.lifecycle.FragmentC0524G;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.E */
/* loaded from: classes.dex */
public abstract class AbstractC0522E {
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public static void m1360a(Activity activity, EnumC0547l enumC0547l) {
        C0555t mo1068d;
        AbstractC1461d.m3494e("activity", activity);
        AbstractC1461d.m3494e("event", enumC0547l);
        if (!(activity instanceof InterfaceC0553r) || (mo1068d = ((InterfaceC0553r) activity).mo1068d()) == null) {
            return;
        }
        mo1068d.m1380d(enumC0547l);
    }

    /* renamed from: b */
    public static void m1361b(Activity activity) {
        AbstractC1461d.m3494e("activity", activity);
        if (Build.VERSION.SDK_INT >= 29) {
            FragmentC0524G.a.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new FragmentC0524G.a());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new FragmentC0524G(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }
}
