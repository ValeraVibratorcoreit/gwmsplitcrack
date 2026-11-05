package p077j0;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.FrameLayout;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import p010D1.AbstractC0088l;
import p013F0.C0097a;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p022K.C0181b0;
import p038T.C0326t;
import p069f1.C0833e;
import p091o.AbstractC1194d;
import p091o.C1192b;
import p091o.C1195e;

/* renamed from: j0.m */
/* loaded from: classes.dex */
public abstract class AbstractC0982m implements Cloneable {

    /* renamed from: w */
    public static final Animator[] f4690w = new Animator[0];

    /* renamed from: x */
    public static final int[] f4691x = {2, 1, 3, 4};

    /* renamed from: y */
    public static final C0833e f4692y = new C0833e(5);

    /* renamed from: z */
    public static final ThreadLocal f4693z = new ThreadLocal();

    /* renamed from: k */
    public ArrayList f4704k;

    /* renamed from: l */
    public ArrayList f4705l;

    /* renamed from: m */
    public InterfaceC0980k[] f4706m;

    /* renamed from: a */
    public final String f4694a = getClass().getName();

    /* renamed from: b */
    public long f4695b = -1;

    /* renamed from: c */
    public long f4696c = -1;

    /* renamed from: d */
    public TimeInterpolator f4697d = null;

    /* renamed from: e */
    public final ArrayList f4698e = new ArrayList();

    /* renamed from: f */
    public final ArrayList f4699f = new ArrayList();

    /* renamed from: g */
    public C0326t f4700g = new C0326t(3);

    /* renamed from: h */
    public C0326t f4701h = new C0326t(3);

    /* renamed from: i */
    public C0970a f4702i = null;

    /* renamed from: j */
    public final int[] f4703j = f4691x;

    /* renamed from: n */
    public final ArrayList f4707n = new ArrayList();

    /* renamed from: o */
    public Animator[] f4708o = f4690w;

    /* renamed from: p */
    public int f4709p = 0;

    /* renamed from: q */
    public boolean f4710q = false;

    /* renamed from: r */
    public boolean f4711r = false;

    /* renamed from: s */
    public AbstractC0982m f4712s = null;

    /* renamed from: t */
    public ArrayList f4713t = null;

    /* renamed from: u */
    public ArrayList f4714u = new ArrayList();

    /* renamed from: v */
    public C0833e f4715v = f4692y;

    /* renamed from: b */
    public static void m2549b(C0326t c0326t, View view, C0989t c0989t) {
        ((C1192b) c0326t.f923a).put(view, c0989t);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) c0326t.f924b;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        String m430k = AbstractC0158F.m430k(view);
        if (m430k != null) {
            C1192b c1192b = (C1192b) c0326t.f926d;
            if (c1192b.containsKey(m430k)) {
                c1192b.put(m430k, null);
            } else {
                c1192b.put(m430k, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C1195e c1195e = (C1195e) c0326t.f925c;
                if (c1195e.f5391a) {
                    c1195e.m2854b();
                }
                if (AbstractC1194d.m2852b(c1195e.f5392b, c1195e.f5394d, itemIdAtPosition) < 0) {
                    view.setHasTransientState(true);
                    c1195e.m2857e(itemIdAtPosition, view);
                    return;
                }
                View view2 = (View) c1195e.m2855c(itemIdAtPosition, null);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                    c1195e.m2857e(itemIdAtPosition, null);
                }
            }
        }
    }

    /* renamed from: p */
    public static C1192b m2550p() {
        ThreadLocal threadLocal = f4693z;
        C1192b c1192b = (C1192b) threadLocal.get();
        if (c1192b != null) {
            return c1192b;
        }
        C1192b c1192b2 = new C1192b();
        threadLocal.set(c1192b2);
        return c1192b2;
    }

    /* renamed from: u */
    public static boolean m2551u(C0989t c0989t, C0989t c0989t2, String str) {
        Object obj = c0989t.f4725a.get(str);
        Object obj2 = c0989t2.f4725a.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj == null || obj2 == null) {
            return true;
        }
        return !obj.equals(obj2);
    }

    /* renamed from: A */
    public void mo2521A(long j2) {
        this.f4696c = j2;
    }

    /* renamed from: B */
    public void mo2522B(AbstractC0088l abstractC0088l) {
    }

    /* renamed from: C */
    public void mo2523C(TimeInterpolator timeInterpolator) {
        this.f4697d = timeInterpolator;
    }

    /* renamed from: D */
    public void mo2524D(C0833e c0833e) {
        if (c0833e == null) {
            this.f4715v = f4692y;
        } else {
            this.f4715v = c0833e;
        }
    }

    /* renamed from: E */
    public void mo2525E() {
    }

    /* renamed from: F */
    public void mo2526F(long j2) {
        this.f4695b = j2;
    }

    /* renamed from: G */
    public final void m2552G() {
        if (this.f4709p == 0) {
            m2562v(this, InterfaceC0981l.f4685a);
            this.f4711r = false;
        }
        this.f4709p++;
    }

    /* renamed from: H */
    public String mo2527H(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.f4696c != -1) {
            sb.append("dur(");
            sb.append(this.f4696c);
            sb.append(") ");
        }
        if (this.f4695b != -1) {
            sb.append("dly(");
            sb.append(this.f4695b);
            sb.append(") ");
        }
        if (this.f4697d != null) {
            sb.append("interp(");
            sb.append(this.f4697d);
            sb.append(") ");
        }
        ArrayList arrayList = this.f4698e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4699f;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m2553a(InterfaceC0980k interfaceC0980k) {
        if (this.f4713t == null) {
            this.f4713t = new ArrayList();
        }
        this.f4713t.add(interfaceC0980k);
    }

    /* renamed from: c */
    public void mo2529c() {
        ArrayList arrayList = this.f4707n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4708o);
        this.f4708o = f4690w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.f4708o = animatorArr;
        m2562v(this, InterfaceC0981l.f4687c);
    }

    /* renamed from: d */
    public abstract void mo2530d(C0989t c0989t);

    /* renamed from: e */
    public final void m2554e(View view, boolean z2) {
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C0989t c0989t = new C0989t(view);
            if (z2) {
                mo2532g(c0989t);
            } else {
                mo2530d(c0989t);
            }
            c0989t.f4727c.add(this);
            mo2531f(c0989t);
            if (z2) {
                m2549b(this.f4700g, view, c0989t);
            } else {
                m2549b(this.f4701h, view, c0989t);
            }
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                m2554e(viewGroup.getChildAt(i), z2);
            }
        }
    }

    /* renamed from: f */
    public void mo2531f(C0989t c0989t) {
    }

    /* renamed from: g */
    public abstract void mo2532g(C0989t c0989t);

    /* renamed from: h */
    public final void m2555h(FrameLayout frameLayout, boolean z2) {
        m2556i(z2);
        ArrayList arrayList = this.f4698e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4699f;
        if (size <= 0 && arrayList2.size() <= 0) {
            m2554e(frameLayout, z2);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = frameLayout.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C0989t c0989t = new C0989t(findViewById);
                if (z2) {
                    mo2532g(c0989t);
                } else {
                    mo2530d(c0989t);
                }
                c0989t.f4727c.add(this);
                mo2531f(c0989t);
                if (z2) {
                    m2549b(this.f4700g, findViewById, c0989t);
                } else {
                    m2549b(this.f4701h, findViewById, c0989t);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C0989t c0989t2 = new C0989t(view);
            if (z2) {
                mo2532g(c0989t2);
            } else {
                mo2530d(c0989t2);
            }
            c0989t2.f4727c.add(this);
            mo2531f(c0989t2);
            if (z2) {
                m2549b(this.f4700g, view, c0989t2);
            } else {
                m2549b(this.f4701h, view, c0989t2);
            }
        }
    }

    /* renamed from: i */
    public final void m2556i(boolean z2) {
        if (z2) {
            ((C1192b) this.f4700g.f923a).clear();
            ((SparseArray) this.f4700g.f924b).clear();
            ((C1195e) this.f4700g.f925c).m2853a();
        } else {
            ((C1192b) this.f4701h.f923a).clear();
            ((SparseArray) this.f4701h.f924b).clear();
            ((C1195e) this.f4701h.f925c).m2853a();
        }
    }

    @Override // 
    /* renamed from: j */
    public AbstractC0982m clone() {
        try {
            AbstractC0982m abstractC0982m = (AbstractC0982m) super.clone();
            abstractC0982m.f4714u = new ArrayList();
            abstractC0982m.f4700g = new C0326t(3);
            abstractC0982m.f4701h = new C0326t(3);
            abstractC0982m.f4704k = null;
            abstractC0982m.f4705l = null;
            abstractC0982m.f4712s = this;
            abstractC0982m.f4713t = null;
            return abstractC0982m;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: k */
    public Animator mo2540k(FrameLayout frameLayout, C0989t c0989t, C0989t c0989t2) {
        return null;
    }

    /* renamed from: l */
    public void mo2534l(FrameLayout frameLayout, C0326t c0326t, C0326t c0326t2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C0989t c0989t;
        Animator animator;
        C0989t c0989t2;
        C1192b m2550p = m2550p();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        m2559o().getClass();
        int i2 = 0;
        while (i2 < size) {
            C0989t c0989t3 = (C0989t) arrayList.get(i2);
            C0989t c0989t4 = (C0989t) arrayList2.get(i2);
            if (c0989t3 != null && !c0989t3.f4727c.contains(this)) {
                c0989t3 = null;
            }
            if (c0989t4 != null && !c0989t4.f4727c.contains(this)) {
                c0989t4 = null;
            }
            if ((c0989t3 != null || c0989t4 != null) && (c0989t3 == null || c0989t4 == null || mo2547s(c0989t3, c0989t4))) {
                Animator mo2540k = mo2540k(frameLayout, c0989t3, c0989t4);
                if (mo2540k != null) {
                    String str = this.f4694a;
                    if (c0989t4 != null) {
                        String[] mo2541q = mo2541q();
                        view = c0989t4.f4726b;
                        if (mo2541q != null && mo2541q.length > 0) {
                            c0989t2 = new C0989t(view);
                            C0989t c0989t5 = (C0989t) ((C1192b) c0326t2.f923a).getOrDefault(view, null);
                            i = size;
                            if (c0989t5 != null) {
                                int i3 = 0;
                                while (i3 < mo2541q.length) {
                                    HashMap hashMap = c0989t2.f4725a;
                                    String str2 = mo2541q[i3];
                                    hashMap.put(str2, c0989t5.f4725a.get(str2));
                                    i3++;
                                    mo2541q = mo2541q;
                                }
                            }
                            int i4 = m2550p.f5418c;
                            int i5 = 0;
                            while (true) {
                                if (i5 >= i4) {
                                    animator = mo2540k;
                                    break;
                                }
                                C0979j c0979j = (C0979j) m2550p.getOrDefault((Animator) m2550p.m2871h(i5), null);
                                if (c0979j.f4681c != null && c0979j.f4679a == view && c0979j.f4680b.equals(str) && c0979j.f4681c.equals(c0989t2)) {
                                    animator = null;
                                    break;
                                }
                                i5++;
                            }
                        } else {
                            i = size;
                            animator = mo2540k;
                            c0989t2 = null;
                        }
                        mo2540k = animator;
                        c0989t = c0989t2;
                    } else {
                        i = size;
                        view = c0989t3.f4726b;
                        c0989t = null;
                    }
                    if (mo2540k != null) {
                        WindowId windowId = frameLayout.getWindowId();
                        C0979j c0979j2 = new C0979j();
                        c0979j2.f4679a = view;
                        c0979j2.f4680b = str;
                        c0979j2.f4681c = c0989t;
                        c0979j2.f4682d = windowId;
                        c0979j2.f4683e = this;
                        c0979j2.f4684f = mo2540k;
                        m2550p.put(mo2540k, c0979j2);
                        this.f4714u.add(mo2540k);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C0979j c0979j3 = (C0979j) m2550p.getOrDefault((Animator) this.f4714u.get(sparseIntArray.keyAt(i6)), null);
                c0979j3.f4684f.setStartDelay(c0979j3.f4684f.getStartDelay() + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    /* renamed from: m */
    public final void m2557m() {
        int i = this.f4709p - 1;
        this.f4709p = i;
        if (i == 0) {
            m2562v(this, InterfaceC0981l.f4686b);
            for (int i2 = 0; i2 < ((C1195e) this.f4700g.f925c).m2859g(); i2++) {
                View view = (View) ((C1195e) this.f4700g.f925c).m2860h(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C1195e) this.f4701h.f925c).m2859g(); i3++) {
                View view2 = (View) ((C1195e) this.f4701h.f925c).m2860h(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.f4711r = true;
        }
    }

    /* renamed from: n */
    public final C0989t m2558n(View view, boolean z2) {
        C0970a c0970a = this.f4702i;
        if (c0970a != null) {
            return c0970a.m2558n(view, z2);
        }
        ArrayList arrayList = z2 ? this.f4704k : this.f4705l;
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            }
            C0989t c0989t = (C0989t) arrayList.get(i);
            if (c0989t == null) {
                return null;
            }
            if (c0989t.f4726b == view) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return (C0989t) (z2 ? this.f4705l : this.f4704k).get(i);
        }
        return null;
    }

    /* renamed from: o */
    public final AbstractC0982m m2559o() {
        C0970a c0970a = this.f4702i;
        return c0970a != null ? c0970a.m2559o() : this;
    }

    /* renamed from: q */
    public String[] mo2541q() {
        return null;
    }

    /* renamed from: r */
    public final C0989t m2560r(View view, boolean z2) {
        C0970a c0970a = this.f4702i;
        if (c0970a != null) {
            return c0970a.m2560r(view, z2);
        }
        return (C0989t) ((C1192b) (z2 ? this.f4700g : this.f4701h).f923a).getOrDefault(view, null);
    }

    /* renamed from: s */
    public boolean mo2547s(C0989t c0989t, C0989t c0989t2) {
        if (c0989t == null || c0989t2 == null) {
            return false;
        }
        String[] mo2541q = mo2541q();
        if (mo2541q == null) {
            Iterator it = c0989t.f4725a.keySet().iterator();
            while (it.hasNext()) {
                if (m2551u(c0989t, c0989t2, (String) it.next())) {
                }
            }
            return false;
        }
        for (String str : mo2541q) {
            if (!m2551u(c0989t, c0989t2, str)) {
            }
        }
        return false;
        return true;
    }

    /* renamed from: t */
    public final boolean m2561t(View view) {
        int id = view.getId();
        ArrayList arrayList = this.f4698e;
        int size = arrayList.size();
        ArrayList arrayList2 = this.f4699f;
        return (size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view);
    }

    public final String toString() {
        return mo2527H("");
    }

    /* renamed from: v */
    public final void m2562v(AbstractC0982m abstractC0982m, InterfaceC0981l interfaceC0981l) {
        AbstractC0982m abstractC0982m2 = this.f4712s;
        if (abstractC0982m2 != null) {
            abstractC0982m2.m2562v(abstractC0982m, interfaceC0981l);
        }
        ArrayList arrayList = this.f4713t;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        int size = this.f4713t.size();
        InterfaceC0980k[] interfaceC0980kArr = this.f4706m;
        if (interfaceC0980kArr == null) {
            interfaceC0980kArr = new InterfaceC0980k[size];
        }
        this.f4706m = null;
        InterfaceC0980k[] interfaceC0980kArr2 = (InterfaceC0980k[]) this.f4713t.toArray(interfaceC0980kArr);
        for (int i = 0; i < size; i++) {
            interfaceC0981l.mo16a(interfaceC0980kArr2[i], abstractC0982m);
            interfaceC0980kArr2[i] = null;
        }
        this.f4706m = interfaceC0980kArr2;
    }

    /* renamed from: w */
    public void mo2535w(ViewGroup viewGroup) {
        if (this.f4711r) {
            return;
        }
        ArrayList arrayList = this.f4707n;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4708o);
        this.f4708o = f4690w;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.pause();
        }
        this.f4708o = animatorArr;
        m2562v(this, InterfaceC0981l.f4688d);
        this.f4710q = true;
    }

    /* renamed from: x */
    public AbstractC0982m mo2536x(InterfaceC0980k interfaceC0980k) {
        AbstractC0982m abstractC0982m;
        ArrayList arrayList = this.f4713t;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC0980k) && (abstractC0982m = this.f4712s) != null) {
            abstractC0982m.mo2536x(interfaceC0980k);
        }
        if (this.f4713t.size() == 0) {
            this.f4713t = null;
        }
        return this;
    }

    /* renamed from: y */
    public void mo2537y(FrameLayout frameLayout) {
        if (this.f4710q) {
            if (!this.f4711r) {
                ArrayList arrayList = this.f4707n;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.f4708o);
                this.f4708o = f4690w;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.f4708o = animatorArr;
                m2562v(this, InterfaceC0981l.f4689e);
            }
            this.f4710q = false;
        }
    }

    /* renamed from: z */
    public void mo2538z() {
        m2552G();
        C1192b m2550p = m2550p();
        Iterator it = this.f4714u.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (m2550p.containsKey(animator)) {
                m2552G();
                if (animator != null) {
                    animator.addListener(new C0181b0(this, 1, m2550p));
                    long j2 = this.f4696c;
                    if (j2 >= 0) {
                        animator.setDuration(j2);
                    }
                    long j3 = this.f4695b;
                    if (j3 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j3);
                    }
                    TimeInterpolator timeInterpolator = this.f4697d;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0097a(3, this));
                    animator.start();
                }
            }
        }
        this.f4714u.clear();
        m2557m();
    }
}
