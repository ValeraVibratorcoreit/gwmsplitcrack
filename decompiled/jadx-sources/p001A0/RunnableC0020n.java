package p001A0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.InputMethodManager;
import android.widget.ListView;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.SearchView$SearchAutoComplete;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.C0560y;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.Pay;
import com.altaysoft.t500_split.Top;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.media.AbstractC0635c;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.MediaInfoService;
import com.altaysoft.t500_split.p061ip.Theme40NeedleHaloView;
import com.altaysoft.t500_split.p061ip.Theme51GaugeArcView;
import com.altaysoft.t500_split.splitinfo.AnalogClockView;
import com.altaysoft.t500_split.splitinfo.ChartsFullscreenActivity;
import com.altaysoft.t500_split.splitinfo.DigitalClockView;
import com.altaysoft.t500_split.splitinfo.FullscreenChartsView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p017H0.C0129h;
import p022K.AbstractC0169Q;
import p033Q.C0267a;
import p033Q.ViewOnTouchListenerC0273g;
import p036S.C0305e;
import p046X.AbstractComponentCallbacksC0423v;
import p046X.C0387O;
import p046X.DialogInterfaceOnCancelListenerC0417p;
import p062d0.C0728a;
import p068f0.AbstractC0774D;
import p068f0.AbstractC0792W;
import p068f0.C0802d;
import p068f0.C0808g;
import p068f0.C0810h;
import p068f0.C0811i;
import p068f0.C0814l;
import p068f0.RunnableC0800c;
import p082l.C1123k;
import p082l.C1130n0;
import p098q0.AbstractC1342o1;
import p098q0.AbstractC1372y1;
import p098q0.C1375z1;
import p098q0.RunnableC1323i0;
import p098q0.RunnableC1332l0;
import p098q0.RunnableC1362v0;
import p109u0.C1531e;
import p109u0.C1536f1;
import p118x0.C1646b;
import p118x0.C1660p;

/* renamed from: A0.n */
/* loaded from: classes.dex */
public final class RunnableC0020n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f58a;

    /* renamed from: b */
    public final /* synthetic */ Object f59b;

    public /* synthetic */ RunnableC0020n(int i, Object obj) {
        this.f58a = i;
        this.f59b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Handler handler;
        int i;
        boolean z2;
        C1123k c1123k;
        int i2 = 3;
        boolean z3 = false;
        switch (this.f58a) {
            case 0:
                if (((C0021o) this.f59b).f72l) {
                    if (((C0021o) this.f59b).m31e()) {
                        AbstractC0023q.m38a(3);
                        ((C0021o) this.f59b).f61a.postDelayed(this, 400L);
                        return;
                    }
                    Context context = ((C0021o) this.f59b).f67g;
                    if (context != null) {
                        C0006C m10c = C0006C.m10c(context);
                        m10c.f10b.post(new RunnableC0004A(m10c, 0));
                    }
                    AbstractC0023q.m38a(2);
                    return;
                }
                return;
            case 1:
                C0129h c0129h = (C0129h) this.f59b;
                c0129h.f398c = false;
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) c0129h.f400e;
                C0305e c0305e = bottomSheetBehavior.f3376M;
                if (c0305e != null && c0305e.m862f()) {
                    c0129h.m385a(c0129h.f397b);
                    return;
                } else {
                    if (bottomSheetBehavior.f3375L == 2) {
                        bottomSheetBehavior.m2032C(c0129h.f397b);
                        return;
                    }
                    return;
                }
            case 2:
                ViewOnTouchListenerC0273g viewOnTouchListenerC0273g = (ViewOnTouchListenerC0273g) this.f59b;
                if (viewOnTouchListenerC0273g.f733t) {
                    boolean z4 = viewOnTouchListenerC0273g.f731r;
                    C0267a c0267a = viewOnTouchListenerC0273g.f719f;
                    if (z4) {
                        viewOnTouchListenerC0273g.f731r = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        c0267a.f713e = currentAnimationTimeMillis;
                        c0267a.f715g = -1L;
                        c0267a.f714f = currentAnimationTimeMillis;
                        c0267a.f716h = 0.5f;
                    }
                    if ((c0267a.f715g > 0 && AnimationUtils.currentAnimationTimeMillis() > c0267a.f715g + c0267a.f717i) || !viewOnTouchListenerC0273g.m803e()) {
                        viewOnTouchListenerC0273g.f733t = false;
                        return;
                    }
                    boolean z5 = viewOnTouchListenerC0273g.f732s;
                    ListView listView = viewOnTouchListenerC0273g.f721h;
                    if (z5) {
                        viewOnTouchListenerC0273g.f732s = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        listView.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (c0267a.f714f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float m785a = c0267a.m785a(currentAnimationTimeMillis2);
                    long j2 = currentAnimationTimeMillis2 - c0267a.f714f;
                    c0267a.f714f = currentAnimationTimeMillis2;
                    viewOnTouchListenerC0273g.f735v.scrollListBy((int) (j2 * ((m785a * 4.0f) + ((-4.0f) * m785a * m785a)) * c0267a.f712d));
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    listView.postOnAnimation(this);
                    return;
                }
                return;
            case 3:
                ((C0305e) this.f59b).m870n(0);
                return;
            case 4:
                DialogInterfaceOnCancelListenerC0417p dialogInterfaceOnCancelListenerC0417p = (DialogInterfaceOnCancelListenerC0417p) this.f59b;
                dialogInterfaceOnCancelListenerC0417p.f1305a0.onDismiss(dialogInterfaceOnCancelListenerC0417p.f1313i0);
                return;
            case 5:
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) this.f59b;
                if (abstractComponentCallbacksC0423v.f1345M != null) {
                    abstractComponentCallbacksC0423v.m1123f().getClass();
                    return;
                }
                return;
            case 6:
                ((C0387O) this.f59b).m1037y(true);
                return;
            case 7:
                CheckableImageButton checkableImageButton = ((TextInputLayout) this.f59b).f3685h.f1598l;
                checkableImageButton.performClick();
                checkableImageButton.jumpDrawablesToCurrentState();
                return;
            case 8:
                synchronized (((C0560y) this.f59b).f2017a) {
                    obj = ((C0560y) this.f59b).f2022f;
                    ((C0560y) this.f59b).f2022f = C0560y.f2016k;
                }
                ((C0560y) this.f59b).m1401j(obj);
                return;
            case Platform.GNU /* 9 */:
                if (((MediaInfoService) this.f59b).f2976h) {
                    try {
                        ((MediaInfoService) this.f59b).m1846a();
                    } catch (Exception unused) {
                    }
                    if (!((MediaInfoService) this.f59b).f2976h || (handler = ((MediaInfoService) this.f59b).f2975g) == null) {
                        return;
                    }
                    handler.postDelayed(this, 1500L);
                    return;
                }
                return;
            case Platform.KFREEBSD /* 10 */:
                C0814l c0814l = (C0814l) this.f59b;
                int i3 = c0814l.f4109A;
                ValueAnimator valueAnimator = c0814l.f4136z;
                if (i3 != 1) {
                    i = 2;
                    if (i3 != 2) {
                        return;
                    }
                } else {
                    i = 2;
                    valueAnimator.cancel();
                }
                c0814l.f4109A = 3;
                float[] fArr = new float[i];
                fArr[0] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fArr[1] = 0.0f;
                valueAnimator.setFloatValues(fArr);
                valueAnimator.setDuration(500);
                valueAnimator.start();
                return;
            case Platform.NETBSD /* 11 */:
                RecyclerView recyclerView = (RecyclerView) this.f59b;
                AbstractC0774D abstractC0774D = recyclerView.f2066N;
                if (abstractC0774D != null) {
                    C0811i c0811i = (C0811i) abstractC0774D;
                    ArrayList arrayList = c0811i.f4093h;
                    boolean isEmpty = arrayList.isEmpty();
                    ArrayList arrayList2 = c0811i.f4095j;
                    boolean isEmpty2 = arrayList2.isEmpty();
                    ArrayList arrayList3 = c0811i.f4096k;
                    boolean isEmpty3 = arrayList3.isEmpty();
                    ArrayList arrayList4 = c0811i.f4094i;
                    boolean isEmpty4 = arrayList4.isEmpty();
                    if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            boolean hasNext = it.hasNext();
                            long j3 = c0811i.f3923d;
                            if (hasNext) {
                                AbstractC0792W abstractC0792W = (AbstractC0792W) it.next();
                                View view = abstractC0792W.f3995a;
                                ViewPropertyAnimator animate = view.animate();
                                c0811i.f4102q.add(abstractC0792W);
                                animate.setDuration(j3).alpha(0.0f).setListener(new C0802d(c0811i, abstractC0792W, animate, view)).start();
                            } else {
                                arrayList.clear();
                                if (!isEmpty2) {
                                    ArrayList arrayList5 = new ArrayList();
                                    arrayList5.addAll(arrayList2);
                                    c0811i.f4098m.add(arrayList5);
                                    arrayList2.clear();
                                    RunnableC0800c runnableC0800c = new RunnableC0800c(c0811i, arrayList5, 0);
                                    if (isEmpty) {
                                        runnableC0800c.run();
                                    } else {
                                        View view2 = ((C0810h) arrayList5.get(0)).f4086a.f3995a;
                                        WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                                        view2.postOnAnimationDelayed(runnableC0800c, j3);
                                    }
                                }
                                if (!isEmpty3) {
                                    ArrayList arrayList6 = new ArrayList();
                                    arrayList6.addAll(arrayList3);
                                    c0811i.f4099n.add(arrayList6);
                                    arrayList3.clear();
                                    RunnableC0800c runnableC0800c2 = new RunnableC0800c(c0811i, arrayList6, 1);
                                    if (isEmpty) {
                                        runnableC0800c2.run();
                                    } else {
                                        View view3 = ((C0808g) arrayList6.get(0)).f4076a.f3995a;
                                        WeakHashMap weakHashMap3 = AbstractC0169Q.f475a;
                                        view3.postOnAnimationDelayed(runnableC0800c2, j3);
                                    }
                                }
                                if (!isEmpty4) {
                                    ArrayList arrayList7 = new ArrayList();
                                    arrayList7.addAll(arrayList4);
                                    c0811i.f4097l.add(arrayList7);
                                    arrayList4.clear();
                                    RunnableC0800c runnableC0800c3 = new RunnableC0800c(c0811i, arrayList7, 2);
                                    if (isEmpty && isEmpty2 && isEmpty3) {
                                        runnableC0800c3.run();
                                    } else {
                                        if (isEmpty) {
                                            j3 = 0;
                                        }
                                        long max = Math.max(!isEmpty2 ? c0811i.f3924e : 0L, !isEmpty3 ? c0811i.f3925f : 0L) + j3;
                                        View view4 = ((AbstractC0792W) arrayList7.get(0)).f3995a;
                                        WeakHashMap weakHashMap4 = AbstractC0169Q.f475a;
                                        view4.postOnAnimationDelayed(runnableC0800c3, max);
                                    }
                                }
                            }
                        }
                    }
                    z2 = false;
                } else {
                    z2 = false;
                }
                recyclerView.f2100o0 = z2;
                return;
            case Platform.DRAGONFLYBSD /* 12 */:
                ((StaggeredGridLayoutManager) this.f59b).m1540D0();
                return;
            case 13:
                C1130n0 c1130n0 = (C1130n0) this.f59b;
                c1130n0.f5220q = null;
                c1130n0.drawableStateChanged();
                return;
            case 14:
                SearchView$SearchAutoComplete searchView$SearchAutoComplete = (SearchView$SearchAutoComplete) this.f59b;
                if (searchView$SearchAutoComplete.f1803k) {
                    ((InputMethodManager) searchView$SearchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchView$SearchAutoComplete, 0);
                    searchView$SearchAutoComplete.f1803k = false;
                    return;
                }
                return;
            case 15:
                ActionMenuView actionMenuView = ((Toolbar) this.f59b).f1827f;
                if (actionMenuView == null || (c1123k = actionMenuView.f1782y) == null) {
                    return;
                }
                c1123k.m2735l();
                return;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1375z1 c1375z1 = (C1375z1) this.f59b;
                c1375z1.f6460i = false;
                c1375z1.m3323l();
                return;
            case 17:
                if (((MainActivity) this.f59b).f2309E.f2588X1) {
                    AbstractC1342o1.f6315b.execute(new RunnableC1323i0(NativeLib.getStringByIndex(AbstractC1342o1.f6314a.f2633h), i2));
                    return;
                } else {
                    AbstractC1342o1.f6315b.execute(new RunnableC1323i0(NativeLib.getStringByIndex(AbstractC1342o1.f6314a.f2638i), i2));
                    return;
                }
            case 18:
                RunnableC1332l0 runnableC1332l0 = (RunnableC1332l0) this.f59b;
                Context context2 = runnableC1332l0.f6285b;
                String str = runnableC1332l0.f6287d;
                if (AbstractC0638f.m1863l(context2, str)) {
                    return;
                }
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                Context context3 = runnableC1332l0.f6285b;
                if (!AbstractC0638f.m1863l(context3, str)) {
                    if (AbstractC0638f.m1862k(str)) {
                        AbstractC0635c.m1849b(context3, str);
                        AbstractC0638f.m1868q(context3, str);
                    } else {
                        AbstractC0638f.m1868q(context3, str);
                    }
                }
                if (System.currentTimeMillis() - runnableC1332l0.f6288e < 300000) {
                    runnableC1332l0.f6286c.postDelayed(this, 5000L);
                    return;
                }
                return;
            case 19:
                RunnableC1362v0 runnableC1362v0 = (RunnableC1362v0) this.f59b;
                Intent intent = new Intent(runnableC1362v0.f6400b, (Class<?>) CFG4.class);
                Pay pay = runnableC1362v0.f6402d;
                pay.startActivity(intent);
                pay.finish();
                return;
            case 20:
                ((Top) this.f59b).finish();
                return;
            case 21:
                TopOverlayService topOverlayService = (TopOverlayService) this.f59b;
                if (topOverlayService.f2360h) {
                    topOverlayService.m1705a();
                    topOverlayService.f2359g.postDelayed(this, 400L);
                    return;
                }
                return;
            case 22:
                C1531e c1531e = (C1531e) this.f59b;
                if (c1531e.f8189d) {
                    int i4 = c1531e.f8188c + 1;
                    c1531e.f8188c = i4;
                    if (i4 > 600) {
                        c1531e.f8188c = 0;
                        TextView textView = c1531e.f8187b;
                        if (textView != null) {
                            long m3308n = AbstractC1372y1.m3308n();
                            if (m3308n < 1000) {
                                textView.setVisibility(0);
                                textView.setTextColor(-256);
                                textView.setText(String.format("Free Storage  %,dMB", Long.valueOf(m3308n)));
                            } else {
                                textView.setVisibility(4);
                            }
                        }
                    }
                    c1531e.f8186a.postDelayed(this, 200L);
                    return;
                }
                return;
            case 23:
                Theme40NeedleHaloView theme40NeedleHaloView = (Theme40NeedleHaloView) this.f59b;
                theme40NeedleHaloView.f2780u = false;
                if (theme40NeedleHaloView.f2779t && theme40NeedleHaloView.f2766g != 2 && theme40NeedleHaloView.isAttachedToWindow() && theme40NeedleHaloView.getVisibility() == 0) {
                    z3 = true;
                }
                if (z3) {
                    C1536f1 c1536f1 = Theme40NeedleHaloView.f2760E;
                    if (c1536f1.f8226y) {
                        long uptimeMillis2 = SystemClock.uptimeMillis();
                        int i5 = c1536f1.f8224w;
                        long j4 = i5 < 32 ? 330L : 80L;
                        if (i5 <= 0 || uptimeMillis2 - c1536f1.f8227z >= j4) {
                            c1536f1.f8227z = uptimeMillis2;
                            if (i5 < 32) {
                                Theme40NeedleHaloView.m1808a();
                                if (c1536f1.f8224w == 32) {
                                    c1536f1.f8198A = SystemClock.uptimeMillis();
                                }
                            }
                        }
                    }
                    theme40NeedleHaloView.invalidate();
                    if (theme40NeedleHaloView.f2780u) {
                        return;
                    }
                    theme40NeedleHaloView.f2780u = true;
                    theme40NeedleHaloView.postDelayed(theme40NeedleHaloView.f2781v, c1536f1.f8224w < 32 ? 330L : 80L);
                    return;
                }
                return;
            case 24:
                Theme51GaugeArcView theme51GaugeArcView = (Theme51GaugeArcView) this.f59b;
                theme51GaugeArcView.f2959y = false;
                float f2 = theme51GaugeArcView.f2957w - theme51GaugeArcView.f2958x;
                if (Math.abs(f2) < 8.0E-4f) {
                    theme51GaugeArcView.f2958x = theme51GaugeArcView.f2957w;
                    theme51GaugeArcView.invalidate();
                    return;
                } else {
                    theme51GaugeArcView.f2958x = (f2 * 0.22f) + theme51GaugeArcView.f2958x;
                    theme51GaugeArcView.invalidate();
                    theme51GaugeArcView.f2959y = true;
                    theme51GaugeArcView.postOnAnimation(this);
                    return;
                }
            case 25:
                AnalogClockView analogClockView = (AnalogClockView) this.f59b;
                if (analogClockView.f3121p) {
                    analogClockView.invalidate();
                    analogClockView.postDelayed(this, 50L);
                    return;
                }
                return;
            case 26:
                ChartsFullscreenActivity chartsFullscreenActivity = (ChartsFullscreenActivity) this.f59b;
                if (chartsFullscreenActivity.isFinishing() || chartsFullscreenActivity.isDestroyed()) {
                    return;
                }
                FullscreenChartsView fullscreenChartsView = chartsFullscreenActivity.f3125F;
                if (fullscreenChartsView != null) {
                    fullscreenChartsView.setSamples(C1660p.m4812a().f9467a.m4751a());
                }
                chartsFullscreenActivity.f3124E.postDelayed(this, 2000L);
                return;
            case 27:
                DigitalClockView digitalClockView = (DigitalClockView) this.f59b;
                if (digitalClockView.f3144B) {
                    digitalClockView.invalidate();
                    digitalClockView.m1962f();
                    return;
                }
                return;
            case 28:
                C0728a c0728a = (C0728a) this.f59b;
                if (c0728a.f3829a) {
                    c0728a.m2162g();
                    ((Handler) c0728a.f3830b).postDelayed(this, 400L);
                    return;
                }
                return;
            default:
                C1646b c1646b = (C1646b) this.f59b;
                if (c1646b.f9330B) {
                    c1646b.m4788k();
                    c1646b.f9334b.postDelayed(this, 500L);
                    return;
                }
                return;
        }
    }
}
