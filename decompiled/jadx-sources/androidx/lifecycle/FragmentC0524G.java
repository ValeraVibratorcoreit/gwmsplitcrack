package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import com.altaysoft.t500_split.media.C0639g;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.G */
/* loaded from: classes.dex */
public class FragmentC0524G extends Fragment {

    /* renamed from: g */
    public static final /* synthetic */ int f1965g = 0;

    /* renamed from: f */
    public C0639g f1966f;

    /* renamed from: androidx.lifecycle.G$a */
    public static final class a implements Application.ActivityLifecycleCallbacks {
        public static final C0523F Companion = new C0523F();

        public static final void registerIn(Activity activity) {
            Companion.getClass();
            AbstractC1461d.m3494e("activity", activity);
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            AbstractC1461d.m3494e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            AbstractC1461d.m3494e("activity", activity);
            int i = FragmentC0524G.f1965g;
            AbstractC0522E.m1360a(activity, EnumC0547l.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            int i = FragmentC0524G.f1965g;
            AbstractC0522E.m1360a(activity, EnumC0547l.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            int i = FragmentC0524G.f1965g;
            AbstractC0522E.m1360a(activity, EnumC0547l.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            int i = FragmentC0524G.f1965g;
            AbstractC0522E.m1360a(activity, EnumC0547l.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            int i = FragmentC0524G.f1965g;
            AbstractC0522E.m1360a(activity, EnumC0547l.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            int i = FragmentC0524G.f1965g;
            AbstractC0522E.m1360a(activity, EnumC0547l.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            AbstractC1461d.m3494e("activity", activity);
            AbstractC1461d.m3494e("bundle", bundle);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
        }
    }

    /* renamed from: a */
    public final void m1362a(EnumC0547l enumC0547l) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC1461d.m3493d("activity", activity);
            AbstractC0522E.m1360a(activity, enumC0547l);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m1362a(EnumC0547l.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        m1362a(EnumC0547l.ON_DESTROY);
        this.f1966f = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        m1362a(EnumC0547l.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0639g c0639g = this.f1966f;
        if (c0639g != null) {
            ((C0521D) c0639g.f3011g).m1359a();
        }
        m1362a(EnumC0547l.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0639g c0639g = this.f1966f;
        if (c0639g != null) {
            C0521D c0521d = (C0521D) c0639g.f3011g;
            int i = c0521d.f1957f + 1;
            c0521d.f1957f = i;
            if (i == 1 && c0521d.f1960i) {
                c0521d.f1962k.m1380d(EnumC0547l.ON_START);
                c0521d.f1960i = false;
            }
        }
        m1362a(EnumC0547l.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        m1362a(EnumC0547l.ON_STOP);
    }
}
