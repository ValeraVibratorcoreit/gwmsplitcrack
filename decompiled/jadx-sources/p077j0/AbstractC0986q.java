package p077j0;

import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p091o.C1192b;

/* renamed from: j0.q */
/* loaded from: classes.dex */
public abstract class AbstractC0986q {

    /* renamed from: a */
    public static final C0970a f4720a;

    /* renamed from: b */
    public static final ThreadLocal f4721b;

    /* renamed from: c */
    public static final ArrayList f4722c;

    static {
        C0970a c0970a = new C0970a();
        c0970a.f4654A = new ArrayList();
        c0970a.f4657D = false;
        c0970a.f4658E = 0;
        c0970a.f4655B = false;
        c0970a.m2528I(new C0977h(2));
        c0970a.m2528I(new C0975f());
        c0970a.m2528I(new C0977h(1));
        f4720a = c0970a;
        f4721b = new ThreadLocal();
        f4722c = new ArrayList();
    }

    /* renamed from: a */
    public static void m2563a(FrameLayout frameLayout, AbstractC0982m abstractC0982m) {
        ArrayList arrayList = f4722c;
        if (arrayList.contains(frameLayout) || !frameLayout.isLaidOut()) {
            return;
        }
        arrayList.add(frameLayout);
        if (abstractC0982m == null) {
            abstractC0982m = f4720a;
        }
        AbstractC0982m clone = abstractC0982m.clone();
        ArrayList arrayList2 = (ArrayList) m2564b().getOrDefault(frameLayout, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0982m) it.next()).mo2535w(frameLayout);
            }
        }
        clone.m2555h(frameLayout, true);
        if (frameLayout.getTag(R.id.transition_current_scene) != null) {
            throw new ClassCastException();
        }
        frameLayout.setTag(R.id.transition_current_scene, null);
        ViewTreeObserverOnPreDrawListenerC0985p viewTreeObserverOnPreDrawListenerC0985p = new ViewTreeObserverOnPreDrawListenerC0985p();
        viewTreeObserverOnPreDrawListenerC0985p.f4718f = clone;
        viewTreeObserverOnPreDrawListenerC0985p.f4719g = frameLayout;
        frameLayout.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC0985p);
        frameLayout.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC0985p);
    }

    /* renamed from: b */
    public static C1192b m2564b() {
        C1192b c1192b;
        ThreadLocal threadLocal = f4721b;
        WeakReference weakReference = (WeakReference) threadLocal.get();
        if (weakReference != null && (c1192b = (C1192b) weakReference.get()) != null) {
            return c1192b;
        }
        C1192b c1192b2 = new C1192b();
        threadLocal.set(new WeakReference(c1192b2));
        return c1192b2;
    }
}
