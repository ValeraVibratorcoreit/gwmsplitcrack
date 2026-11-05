package androidx.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import p107t1.AbstractC1461d;

/* renamed from: androidx.lifecycle.C */
/* loaded from: classes.dex */
public final class C0520C extends AbstractC0541f {
    final /* synthetic */ C0521D this$0;

    /* renamed from: androidx.lifecycle.C$a */
    public static final class a extends AbstractC0541f {
        final /* synthetic */ C0521D this$0;

        public a(C0521D c0521d) {
            this.this$0 = c0521d;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            this.this$0.m1359a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            AbstractC1461d.m3494e("activity", activity);
            C0521D c0521d = this.this$0;
            int i = c0521d.f1957f + 1;
            c0521d.f1957f = i;
            if (i == 1 && c0521d.f1960i) {
                c0521d.f1962k.m1380d(EnumC0547l.ON_START);
                c0521d.f1960i = false;
            }
        }
    }

    public C0520C(C0521D c0521d) {
        this.this$0 = c0521d;
    }

    @Override // androidx.lifecycle.AbstractC0541f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        AbstractC1461d.m3494e("activity", activity);
        if (Build.VERSION.SDK_INT < 29) {
            int i = FragmentC0524G.f1965g;
            Fragment findFragmentByTag = activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
            AbstractC1461d.m3492c("null cannot be cast to non-null type androidx.lifecycle.ReportFragment", findFragmentByTag);
            ((FragmentC0524G) findFragmentByTag).f1966f = this.this$0.f1964m;
        }
    }

    @Override // androidx.lifecycle.AbstractC0541f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        AbstractC1461d.m3494e("activity", activity);
        C0521D c0521d = this.this$0;
        int i = c0521d.f1958g - 1;
        c0521d.f1958g = i;
        if (i == 0) {
            Handler handler = c0521d.f1961j;
            AbstractC1461d.m3491b(handler);
            handler.postDelayed(c0521d.f1963l, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPreCreated(Activity activity, Bundle bundle) {
        AbstractC1461d.m3494e("activity", activity);
        AbstractC0519B.m1358a(activity, new a(this.this$0));
    }

    @Override // androidx.lifecycle.AbstractC0541f, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        AbstractC1461d.m3494e("activity", activity);
        C0521D c0521d = this.this$0;
        int i = c0521d.f1957f - 1;
        c0521d.f1957f = i;
        if (i == 0 && c0521d.f1959h) {
            c0521d.f1962k.m1380d(EnumC0547l.ON_STOP);
            c0521d.f1960i = true;
        }
    }
}
