package p051Z0;

import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.WindowManager;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p031P.C0264b;

/* renamed from: Z0.l */
/* loaded from: classes.dex */
public final class C0454l {

    /* renamed from: f */
    public static C0454l f1450f;

    /* renamed from: a */
    public boolean f1451a;

    /* renamed from: b */
    public final Object f1452b;

    /* renamed from: c */
    public final Object f1453c;

    /* renamed from: d */
    public final Object f1454d;

    /* renamed from: e */
    public Object f1455e;

    public C0454l(ContextWrapper contextWrapper) {
        this.f1453c = new Handler(Looper.getMainLooper());
        this.f1454d = new HashMap();
        this.f1455e = new HashMap();
        this.f1451a = true;
        this.f1452b = contextWrapper.getApplicationContext();
    }

    /* renamed from: a */
    public static C0454l m1162a(ContextWrapper contextWrapper) {
        if (f1450f == null) {
            f1450f = new C0454l(contextWrapper);
        }
        return f1450f;
    }

    /* renamed from: b */
    public void m1163b() {
        HashMap hashMap = (HashMap) this.f1455e;
        Iterator it = hashMap.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            HashMap hashMap2 = (HashMap) this.f1454d;
            if (!hasNext) {
                hashMap.clear();
                hashMap2.clear();
                return;
            } else {
                Map.Entry entry = (Map.Entry) it.next();
                WindowManager windowManager = (WindowManager) hashMap2.get(entry.getKey());
                if (windowManager != null && entry.getValue() != null) {
                    try {
                        windowManager.removeView((View) entry.getValue());
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    public C0454l(TabLayout tabLayout, ViewPager2 viewPager2, C0264b c0264b) {
        this.f1452b = tabLayout;
        this.f1453c = viewPager2;
        this.f1454d = c0264b;
    }
}
