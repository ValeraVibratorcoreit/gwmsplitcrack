package p046X;

import android.animation.Animator;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.WeakHashMap;
import p001A0.RunnableC0005B;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p014G.C0102c;
import p014G.InterfaceC0101b;
import p022K.AbstractC0169Q;
import p090n1.AbstractC1179c;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1687o;

/* renamed from: X.k */
/* loaded from: classes.dex */
public final class C0412k {

    /* renamed from: a */
    public final ViewGroup f1294a;

    /* renamed from: b */
    public final ArrayList f1295b;

    /* renamed from: c */
    public final ArrayList f1296c;

    /* renamed from: d */
    public boolean f1297d;

    /* renamed from: e */
    public boolean f1298e;

    public C0412k(ViewGroup viewGroup) {
        AbstractC1461d.m3494e("container", viewGroup);
        this.f1294a = viewGroup;
        this.f1295b = new ArrayList();
        this.f1296c = new ArrayList();
    }

    /* renamed from: g */
    public static final C0412k m1092g(ViewGroup viewGroup, C0387O c0387o) {
        AbstractC1461d.m3494e("container", viewGroup);
        AbstractC1461d.m3494e("fragmentManager", c0387o);
        AbstractC1461d.m3493d("fragmentManager.specialEffectsControllerFactory", c0387o.m992F());
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof C0412k) {
            return (C0412k) tag;
        }
        C0412k c0412k = new C0412k(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, c0412k);
        return c0412k;
    }

    /* renamed from: a */
    public final void m1093a(int i, int i2, C0394W c0394w) {
        synchronized (this.f1295b) {
            C0102c c0102c = new C0102c();
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
            AbstractC1461d.m3493d("fragmentStateManager.fragment", abstractComponentCallbacksC0423v);
            C0401b0 m1097e = m1097e(abstractComponentCallbacksC0423v);
            if (m1097e != null) {
                m1097e.m1081c(i, i2);
                return;
            }
            final C0401b0 c0401b0 = new C0401b0(i, i2, c0394w, c0102c);
            this.f1295b.add(c0401b0);
            final int i3 = 0;
            c0401b0.f1266d.add(new Runnable(this) { // from class: X.a0

                /* renamed from: b */
                public final /* synthetic */ C0412k f1247b;

                {
                    this.f1247b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i3) {
                        case 0:
                            C0412k c0412k = this.f1247b;
                            AbstractC1461d.m3494e("this$0", c0412k);
                            C0401b0 c0401b02 = c0401b0;
                            if (c0412k.f1295b.contains(c0401b02)) {
                                int i4 = c0401b02.f1263a;
                                View view = c0401b02.f1265c.f1342J;
                                AbstractC1461d.m3493d("operation.fragment.mView", view);
                                AbstractC0062j.m147a(view, i4);
                                break;
                            }
                            break;
                        default:
                            C0412k c0412k2 = this.f1247b;
                            AbstractC1461d.m3494e("this$0", c0412k2);
                            C0401b0 c0401b03 = c0401b0;
                            c0412k2.f1295b.remove(c0401b03);
                            c0412k2.f1296c.remove(c0401b03);
                            break;
                    }
                }
            });
            final int i4 = 1;
            c0401b0.f1266d.add(new Runnable(this) { // from class: X.a0

                /* renamed from: b */
                public final /* synthetic */ C0412k f1247b;

                {
                    this.f1247b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            C0412k c0412k = this.f1247b;
                            AbstractC1461d.m3494e("this$0", c0412k);
                            C0401b0 c0401b02 = c0401b0;
                            if (c0412k.f1295b.contains(c0401b02)) {
                                int i42 = c0401b02.f1263a;
                                View view = c0401b02.f1265c.f1342J;
                                AbstractC1461d.m3493d("operation.fragment.mView", view);
                                AbstractC0062j.m147a(view, i42);
                                break;
                            }
                            break;
                        default:
                            C0412k c0412k2 = this.f1247b;
                            AbstractC1461d.m3494e("this$0", c0412k2);
                            C0401b0 c0401b03 = c0401b0;
                            c0412k2.f1295b.remove(c0401b03);
                            c0412k2.f1296c.remove(c0401b03);
                            break;
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void m1094b(int i, C0394W c0394w) {
        AbstractC0062j.m165s(i, "finalState");
        AbstractC1461d.m3494e("fragmentStateManager", c0394w);
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Enqueuing add operation for fragment " + c0394w.f1209c);
        }
        m1093a(i, 2, c0394w);
    }

    /* renamed from: c */
    public final void m1095c(ArrayList arrayList, boolean z2) {
        Object obj;
        Object obj2;
        ArrayList arrayList2;
        Iterator it = arrayList.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            C0401b0 c0401b0 = (C0401b0) obj2;
            View view = c0401b0.f1265c.f1342J;
            AbstractC1461d.m3493d("operation.fragment.mView", view);
            if (AbstractC1687o.m4934c(view) == 2 && c0401b0.f1263a != 2) {
                break;
            }
        }
        C0401b0 c0401b02 = (C0401b0) obj2;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            C0401b0 c0401b03 = (C0401b0) previous;
            View view2 = c0401b03.f1265c.f1342J;
            AbstractC1461d.m3493d("operation.fragment.mView", view2);
            if (AbstractC1687o.m4934c(view2) != 2 && c0401b03.f1263a == 2) {
                obj = previous;
                break;
            }
        }
        C0401b0 c0401b04 = (C0401b0) obj;
        String str = " to ";
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Executing operations from " + c0401b02 + " to " + c0401b04);
        }
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        ArrayList m2834Z = AbstractC1179c.m2834Z(arrayList);
        if (arrayList.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = ((C0401b0) arrayList.get(arrayList.size() - 1)).f1265c;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            C0420s c0420s = ((C0401b0) it2.next()).f1265c.f1345M;
            C0420s c0420s2 = abstractComponentCallbacksC0423v.f1345M;
            c0420s.f1321b = c0420s2.f1321b;
            c0420s.f1322c = c0420s2.f1322c;
            c0420s.f1323d = c0420s2.f1323d;
            c0420s.f1324e = c0420s2.f1324e;
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            C0401b0 c0401b05 = (C0401b0) it3.next();
            C0102c c0102c = new C0102c();
            c0401b05.m1082d();
            LinkedHashSet linkedHashSet = c0401b05.f1267e;
            linkedHashSet.add(c0102c);
            arrayList3.add(new C0407f(c0401b05, c0102c, z2));
            C0102c c0102c2 = new C0102c();
            c0401b05.m1082d();
            linkedHashSet.add(c0102c2);
            boolean z3 = !z2 ? c0401b05 != c0401b04 : c0401b05 != c0401b02;
            C0409h c0409h = new C0409h(c0401b05, c0102c2);
            int i = c0401b05.f1263a;
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0401b05.f1265c;
            if (i == 2) {
                if (z2) {
                    C0420s c0420s3 = abstractComponentCallbacksC0423v2.f1345M;
                } else {
                    abstractComponentCallbacksC0423v2.getClass();
                }
            } else if (z2) {
                C0420s c0420s4 = abstractComponentCallbacksC0423v2.f1345M;
            } else {
                abstractComponentCallbacksC0423v2.getClass();
            }
            if (c0401b05.f1263a == 2) {
                if (z2) {
                    C0420s c0420s5 = abstractComponentCallbacksC0423v2.f1345M;
                } else {
                    C0420s c0420s6 = abstractComponentCallbacksC0423v2.f1345M;
                }
            }
            if (z3) {
                if (z2) {
                    C0420s c0420s7 = abstractComponentCallbacksC0423v2.f1345M;
                } else {
                    abstractComponentCallbacksC0423v2.getClass();
                }
            }
            arrayList4.add(c0409h);
            c0401b05.f1266d.add(new RunnableC0005B(m2834Z, c0401b05, this, 2));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList5 = new ArrayList();
        Iterator it4 = arrayList4.iterator();
        while (it4.hasNext()) {
            Object next = it4.next();
            if (!((C0409h) next).m1089h()) {
                arrayList5.add(next);
            }
        }
        ArrayList arrayList6 = new ArrayList();
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((C0409h) it5.next()).getClass();
        }
        Iterator it6 = arrayList6.iterator();
        while (it6.hasNext()) {
            ((C0409h) it6.next()).getClass();
        }
        Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            C0409h c0409h2 = (C0409h) it7.next();
            linkedHashMap.put((C0401b0) c0409h2.f1283a, Boolean.FALSE);
            c0409h2.m1085d();
        }
        boolean containsValue = linkedHashMap.containsValue(Boolean.TRUE);
        ViewGroup viewGroup = this.f1294a;
        Context context = viewGroup.getContext();
        ArrayList arrayList7 = new ArrayList();
        Iterator it8 = arrayList3.iterator();
        boolean z4 = false;
        while (it8.hasNext()) {
            C0407f c0407f = (C0407f) it8.next();
            if (c0407f.m1089h()) {
                c0407f.m1085d();
            } else {
                AbstractC1461d.m3493d("context", context);
                C0043j m1083k = c0407f.m1083k(context);
                if (m1083k == null) {
                    c0407f.m1085d();
                } else {
                    Animator animator = (Animator) m1083k.f142h;
                    if (animator == null) {
                        arrayList7.add(c0407f);
                    } else {
                        C0401b0 c0401b06 = (C0401b0) c0407f.f1283a;
                        arrayList2 = arrayList7;
                        boolean m3490a = AbstractC1461d.m3490a(linkedHashMap.get(c0401b06), Boolean.TRUE);
                        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = c0401b06.f1265c;
                        if (m3490a) {
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + abstractComponentCallbacksC0423v3 + " as this Fragment was involved in a Transition.");
                            }
                            c0407f.m1085d();
                            arrayList7 = arrayList2;
                        } else {
                            boolean z5 = c0401b06.f1263a == 3;
                            if (z5) {
                                m2834Z.remove(c0401b06);
                            }
                            View view3 = abstractComponentCallbacksC0423v3.f1342J;
                            viewGroup.startViewTransition(view3);
                            C0401b0 c0401b07 = c0401b04;
                            LinkedHashMap linkedHashMap2 = linkedHashMap;
                            String str2 = str;
                            boolean z6 = z5;
                            C0401b0 c0401b08 = c0401b02;
                            Context context2 = context;
                            ArrayList arrayList8 = m2834Z;
                            ViewGroup viewGroup2 = viewGroup;
                            animator.addListener(new C0410i(this, view3, z6, c0401b06, c0407f));
                            animator.setTarget(view3);
                            animator.start();
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "Animator from operation " + c0401b06 + " has started.");
                            }
                            ((C0102c) c0407f.f1284b).m342a(new C0404d(animator, c0401b06));
                            context = context2;
                            viewGroup = viewGroup2;
                            arrayList7 = arrayList2;
                            c0401b02 = c0401b08;
                            linkedHashMap = linkedHashMap2;
                            c0401b04 = c0401b07;
                            str = str2;
                            m2834Z = arrayList8;
                            z4 = true;
                        }
                    }
                }
            }
            arrayList2 = arrayList7;
            arrayList7 = arrayList2;
        }
        C0401b0 c0401b09 = c0401b02;
        C0401b0 c0401b010 = c0401b04;
        String str3 = str;
        ArrayList arrayList9 = m2834Z;
        Context context3 = context;
        ViewGroup viewGroup3 = viewGroup;
        Iterator it9 = arrayList7.iterator();
        while (it9.hasNext()) {
            final C0407f c0407f2 = (C0407f) it9.next();
            final C0401b0 c0401b011 = (C0401b0) c0407f2.f1283a;
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v4 = c0401b011.f1265c;
            if (containsValue) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0423v4 + " as Animations cannot run alongside Transitions.");
                }
                c0407f2.m1085d();
            } else if (z4) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + abstractComponentCallbacksC0423v4 + " as Animations cannot run alongside Animators.");
                }
                c0407f2.m1085d();
            } else {
                final View view4 = abstractComponentCallbacksC0423v4.f1342J;
                AbstractC1461d.m3493d("context", context3);
                C0043j m1083k2 = c0407f2.m1083k(context3);
                if (m1083k2 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation = (Animation) m1083k2.f141g;
                if (animation == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if (c0401b011.f1263a != 1) {
                    view4.startAnimation(animation);
                    c0407f2.m1085d();
                } else {
                    viewGroup3.startViewTransition(view4);
                    RunnableC0373A runnableC0373A = new RunnableC0373A(animation, viewGroup3, view4);
                    runnableC0373A.setAnimationListener(new AnimationAnimationListenerC0411j(c0407f2, this, c0401b011, view4));
                    view4.startAnimation(runnableC0373A);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Animation from operation " + c0401b011 + " has started.");
                    }
                }
                ((C0102c) c0407f2.f1284b).m342a(new InterfaceC0101b() { // from class: X.e
                    @Override // p014G.InterfaceC0101b
                    /* renamed from: c */
                    public final void mo341c() {
                        C0412k c0412k = this;
                        AbstractC1461d.m3494e("this$0", c0412k);
                        C0407f c0407f3 = c0407f2;
                        AbstractC1461d.m3494e("$animationInfo", c0407f3);
                        C0401b0 c0401b012 = c0401b011;
                        AbstractC1461d.m3494e("$operation", c0401b012);
                        View view5 = view4;
                        view5.clearAnimation();
                        c0412k.f1294a.endViewTransition(view5);
                        c0407f3.m1085d();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "Animation from operation " + c0401b012 + " has been cancelled.");
                        }
                    }
                });
            }
        }
        Iterator it10 = arrayList9.iterator();
        while (it10.hasNext()) {
            C0401b0 c0401b012 = (C0401b0) it10.next();
            View view5 = c0401b012.f1265c.f1342J;
            int i2 = c0401b012.f1263a;
            AbstractC1461d.m3493d("view", view5);
            AbstractC0062j.m147a(view5, i2);
        }
        arrayList9.clear();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Completed executing operations from " + c0401b09 + str3 + c0401b010);
        }
    }

    /* renamed from: d */
    public final void m1096d() {
        if (this.f1298e) {
            return;
        }
        ViewGroup viewGroup = this.f1294a;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (!viewGroup.isAttachedToWindow()) {
            m1098f();
            this.f1297d = false;
            return;
        }
        synchronized (this.f1295b) {
            try {
                if (!this.f1295b.isEmpty()) {
                    ArrayList m2834Z = AbstractC1179c.m2834Z(this.f1296c);
                    this.f1296c.clear();
                    Iterator it = m2834Z.iterator();
                    while (it.hasNext()) {
                        C0401b0 c0401b0 = (C0401b0) it.next();
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + c0401b0);
                        }
                        c0401b0.m1079a();
                        if (!c0401b0.f1269g) {
                            this.f1296c.add(c0401b0);
                        }
                    }
                    m1099h();
                    ArrayList m2834Z2 = AbstractC1179c.m2834Z(this.f1295b);
                    this.f1295b.clear();
                    this.f1296c.addAll(m2834Z2);
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    Iterator it2 = m2834Z2.iterator();
                    while (it2.hasNext()) {
                        ((C0401b0) it2.next()).m1082d();
                    }
                    m1095c(m2834Z2, this.f1297d);
                    this.f1297d = false;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final C0401b0 m1097e(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        Object obj;
        Iterator it = this.f1295b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            C0401b0 c0401b0 = (C0401b0) obj;
            if (AbstractC1461d.m3490a(c0401b0.f1265c, abstractComponentCallbacksC0423v) && !c0401b0.f1268f) {
                break;
            }
        }
        return (C0401b0) obj;
    }

    /* renamed from: f */
    public final void m1098f() {
        String str;
        String str2;
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.f1294a;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean isAttachedToWindow = viewGroup.isAttachedToWindow();
        synchronized (this.f1295b) {
            try {
                m1099h();
                Iterator it = this.f1295b.iterator();
                while (it.hasNext()) {
                    ((C0401b0) it.next()).m1082d();
                }
                Iterator it2 = AbstractC1179c.m2834Z(this.f1296c).iterator();
                while (it2.hasNext()) {
                    C0401b0 c0401b0 = (C0401b0) it2.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.f1294a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + c0401b0);
                    }
                    c0401b0.m1079a();
                }
                Iterator it3 = AbstractC1179c.m2834Z(this.f1295b).iterator();
                while (it3.hasNext()) {
                    C0401b0 c0401b02 = (C0401b0) it3.next();
                    if (Log.isLoggable("FragmentManager", 2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.f1294a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + c0401b02);
                    }
                    c0401b02.m1079a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: h */
    public final void m1099h() {
        Iterator it = this.f1295b.iterator();
        while (it.hasNext()) {
            C0401b0 c0401b0 = (C0401b0) it.next();
            int i = 2;
            if (c0401b0.f1264b == 2) {
                int visibility = c0401b0.f1265c.m1120L().getVisibility();
                if (visibility != 0) {
                    i = 4;
                    if (visibility != 4) {
                        if (visibility != 8) {
                            throw new IllegalArgumentException(AbstractC0062j.m156j(visibility, "Unknown visibility "));
                        }
                        i = 3;
                    }
                }
                c0401b0.m1081c(i, 1);
            }
        }
    }
}
