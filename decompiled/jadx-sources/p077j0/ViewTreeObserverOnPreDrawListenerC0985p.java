package p077j0;

import android.animation.Animator;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowId;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import p038T.C0326t;
import p091o.C1192b;
import p091o.C1195e;

/* renamed from: j0.p */
/* loaded from: classes.dex */
public final class ViewTreeObserverOnPreDrawListenerC0985p implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: f */
    public AbstractC0982m f4718f;

    /* renamed from: g */
    public FrameLayout f4719g;

    /* JADX WARN: Removed duplicated region for block: B:117:0x01e7 A[EDGE_INSN: B:117:0x01e7->B:118:0x01e7 BREAK  A[LOOP:1: B:17:0x0088->B:29:0x01dd], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onPreDraw() {
        ArrayList arrayList;
        AbstractC0982m abstractC0982m;
        int i;
        C1192b c1192b;
        C1192b c1192b2;
        int i2;
        int[] iArr;
        int i3;
        int i4;
        int i5;
        C0979j c0979j;
        View view;
        AbstractC0982m abstractC0982m2;
        C0989t c0989t;
        View view2;
        AbstractC0982m abstractC0982m3;
        FrameLayout frameLayout = this.f4719g;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList2 = AbstractC0986q.f4722c;
        FrameLayout frameLayout2 = this.f4719g;
        int i6 = 1;
        if (!arrayList2.remove(frameLayout2)) {
            return true;
        }
        C1192b m2564b = AbstractC0986q.m2564b();
        Long l2 = null;
        ArrayList arrayList3 = (ArrayList) m2564b.getOrDefault(frameLayout2, null);
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            m2564b.put(frameLayout2, arrayList3);
        } else if (arrayList3.size() > 0) {
            arrayList = new ArrayList(arrayList3);
            abstractC0982m = this.f4718f;
            arrayList3.add(abstractC0982m);
            abstractC0982m.m2553a(new C0984o(this, m2564b));
            i = 0;
            abstractC0982m.m2555h(frameLayout2, false);
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((AbstractC0982m) it.next()).mo2537y(frameLayout2);
                }
            }
            abstractC0982m.f4704k = new ArrayList();
            abstractC0982m.f4705l = new ArrayList();
            C0326t c0326t = abstractC0982m.f4700g;
            C0326t c0326t2 = abstractC0982m.f4701h;
            c1192b = new C1192b((C1192b) c0326t.f923a);
            c1192b2 = new C1192b((C1192b) c0326t2.f923a);
            i2 = 0;
            while (true) {
                iArr = abstractC0982m.f4703j;
                if (i2 < iArr.length) {
                    break;
                }
                int i7 = iArr[i2];
                if (i7 == i6) {
                    abstractC0982m2 = abstractC0982m;
                    for (int i8 = c1192b.f5418c - 1; i8 >= 0; i8--) {
                        View view3 = (View) c1192b.m2871h(i8);
                        if (view3 != null && abstractC0982m2.m2561t(view3) && (c0989t = (C0989t) c1192b2.remove(view3)) != null && abstractC0982m2.m2561t(c0989t.f4726b)) {
                            abstractC0982m2.f4704k.add((C0989t) c1192b.m2872i(i8));
                            abstractC0982m2.f4705l.add(c0989t);
                        }
                    }
                } else if (i7 == 2) {
                    abstractC0982m2 = abstractC0982m;
                    C1192b c1192b3 = (C1192b) c0326t.f926d;
                    int i9 = c1192b3.f5418c;
                    for (int i10 = 0; i10 < i9; i10++) {
                        View view4 = (View) c1192b3.m2873j(i10);
                        if (view4 != null && abstractC0982m2.m2561t(view4)) {
                            View view5 = (View) ((C1192b) c0326t2.f926d).getOrDefault(c1192b3.m2871h(i10), null);
                            if (view5 != null && abstractC0982m2.m2561t(view5)) {
                                C0989t c0989t2 = (C0989t) c1192b.getOrDefault(view4, null);
                                C0989t c0989t3 = (C0989t) c1192b2.getOrDefault(view5, null);
                                if (c0989t2 != null && c0989t3 != null) {
                                    abstractC0982m2.f4704k.add(c0989t2);
                                    abstractC0982m2.f4705l.add(c0989t3);
                                    c1192b.remove(view4);
                                    c1192b2.remove(view5);
                                }
                            }
                        }
                    }
                } else if (i7 != 3) {
                    if (i7 == 4) {
                        C1195e c1195e = (C1195e) c0326t.f925c;
                        int m2859g = c1195e.m2859g();
                        int i11 = i;
                        while (i11 < m2859g) {
                            View view6 = (View) c1195e.m2860h(i11);
                            if (view6 == null || !abstractC0982m.m2561t(view6)) {
                                abstractC0982m3 = abstractC0982m;
                            } else {
                                View view7 = (View) ((C1195e) c0326t2.f925c).m2855c(c1195e.m2856d(i11), l2);
                                abstractC0982m3 = abstractC0982m;
                                if (view7 != null && abstractC0982m3.m2561t(view7)) {
                                    C0989t c0989t4 = (C0989t) c1192b.getOrDefault(view6, l2);
                                    C0989t c0989t5 = (C0989t) c1192b2.getOrDefault(view7, l2);
                                    if (c0989t4 != null && c0989t5 != null) {
                                        abstractC0982m3.f4704k.add(c0989t4);
                                        abstractC0982m3.f4705l.add(c0989t5);
                                        c1192b.remove(view6);
                                        c1192b2.remove(view7);
                                    }
                                }
                            }
                            i11++;
                            abstractC0982m = abstractC0982m3;
                            l2 = null;
                        }
                    }
                    abstractC0982m2 = abstractC0982m;
                } else {
                    abstractC0982m2 = abstractC0982m;
                    SparseArray sparseArray = (SparseArray) c0326t.f924b;
                    SparseArray sparseArray2 = (SparseArray) c0326t2.f924b;
                    int size = sparseArray.size();
                    for (int i12 = 0; i12 < size; i12++) {
                        View view8 = (View) sparseArray.valueAt(i12);
                        if (view8 != null && abstractC0982m2.m2561t(view8) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i12))) != null && abstractC0982m2.m2561t(view2)) {
                            C0989t c0989t6 = (C0989t) c1192b.getOrDefault(view8, null);
                            C0989t c0989t7 = (C0989t) c1192b2.getOrDefault(view2, null);
                            if (c0989t6 != null && c0989t7 != null) {
                                abstractC0982m2.f4704k.add(c0989t6);
                                abstractC0982m2.f4705l.add(c0989t7);
                                c1192b.remove(view8);
                                c1192b2.remove(view2);
                            }
                        }
                    }
                }
                i2++;
                abstractC0982m = abstractC0982m2;
                i = 0;
                l2 = null;
                i6 = 1;
            }
            AbstractC0982m abstractC0982m4 = abstractC0982m;
            for (i3 = 0; i3 < c1192b.f5418c; i3++) {
                C0989t c0989t8 = (C0989t) c1192b.m2873j(i3);
                if (abstractC0982m4.m2561t(c0989t8.f4726b)) {
                    abstractC0982m4.f4704k.add(c0989t8);
                    abstractC0982m4.f4705l.add(null);
                }
            }
            for (i4 = 0; i4 < c1192b2.f5418c; i4++) {
                C0989t c0989t9 = (C0989t) c1192b2.m2873j(i4);
                if (abstractC0982m4.m2561t(c0989t9.f4726b)) {
                    abstractC0982m4.f4705l.add(c0989t9);
                    abstractC0982m4.f4704k.add(null);
                }
            }
            C1192b m2550p = AbstractC0982m.m2550p();
            int i13 = m2550p.f5418c;
            WindowId windowId = frameLayout2.getWindowId();
            for (i5 = i13 - 1; i5 >= 0; i5--) {
                Animator animator = (Animator) m2550p.m2871h(i5);
                if (animator != null && (c0979j = (C0979j) m2550p.getOrDefault(animator, null)) != null && (view = c0979j.f4679a) != null && windowId.equals(c0979j.f4682d)) {
                    C0989t m2560r = abstractC0982m4.m2560r(view, true);
                    C0989t m2558n = abstractC0982m4.m2558n(view, true);
                    if (m2560r == null && m2558n == null) {
                        m2558n = (C0989t) ((C1192b) abstractC0982m4.f4701h.f923a).getOrDefault(view, null);
                    }
                    if (m2560r != null || m2558n != null) {
                        C0989t c0989t10 = c0979j.f4681c;
                        AbstractC0982m abstractC0982m5 = c0979j.f4683e;
                        if (abstractC0982m5.mo2547s(c0989t10, m2558n)) {
                            abstractC0982m5.m2559o().getClass();
                            if (animator.isRunning() || animator.isStarted()) {
                                animator.cancel();
                            } else {
                                m2550p.remove(animator);
                            }
                        }
                    }
                }
            }
            abstractC0982m4.mo2534l(frameLayout2, abstractC0982m4.f4700g, abstractC0982m4.f4701h, abstractC0982m4.f4704k, abstractC0982m4.f4705l);
            abstractC0982m4.mo2538z();
            return true;
        }
        arrayList = null;
        abstractC0982m = this.f4718f;
        arrayList3.add(abstractC0982m);
        abstractC0982m.m2553a(new C0984o(this, m2564b));
        i = 0;
        abstractC0982m.m2555h(frameLayout2, false);
        if (arrayList != null) {
        }
        abstractC0982m.f4704k = new ArrayList();
        abstractC0982m.f4705l = new ArrayList();
        C0326t c0326t3 = abstractC0982m.f4700g;
        C0326t c0326t22 = abstractC0982m.f4701h;
        c1192b = new C1192b((C1192b) c0326t3.f923a);
        c1192b2 = new C1192b((C1192b) c0326t22.f923a);
        i2 = 0;
        while (true) {
            iArr = abstractC0982m.f4703j;
            if (i2 < iArr.length) {
            }
            i2++;
            abstractC0982m = abstractC0982m2;
            i = 0;
            l2 = null;
            i6 = 1;
        }
        AbstractC0982m abstractC0982m42 = abstractC0982m;
        while (i3 < c1192b.f5418c) {
        }
        while (i4 < c1192b2.f5418c) {
        }
        C1192b m2550p2 = AbstractC0982m.m2550p();
        int i132 = m2550p2.f5418c;
        WindowId windowId2 = frameLayout2.getWindowId();
        while (i5 >= 0) {
        }
        abstractC0982m42.mo2534l(frameLayout2, abstractC0982m42.f4700g, abstractC0982m42.f4701h, abstractC0982m42.f4704k, abstractC0982m42.f4705l);
        abstractC0982m42.mo2538z();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        FrameLayout frameLayout = this.f4719g;
        frameLayout.getViewTreeObserver().removeOnPreDrawListener(this);
        frameLayout.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = AbstractC0986q.f4722c;
        FrameLayout frameLayout2 = this.f4719g;
        arrayList.remove(frameLayout2);
        ArrayList arrayList2 = (ArrayList) AbstractC0986q.m2564b().getOrDefault(frameLayout2, null);
        if (arrayList2 != null && arrayList2.size() > 0) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                ((AbstractC0982m) it.next()).mo2537y(frameLayout2);
            }
        }
        this.f4718f.m2556i(true);
    }
}
