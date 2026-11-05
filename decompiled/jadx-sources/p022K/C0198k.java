package p022K;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.lifecycle.AbstractC0531N;
import androidx.lifecycle.AbstractC0532O;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.InterfaceC0533P;
import androidx.recyclerview.widget.RecyclerView;
import com.sun.jna.Function;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p003B.AbstractC0049p;
import p006C.AbstractC0059g;
import p006C.AbstractC0061i;
import p010D1.AbstractC0088l;
import p038T.C0309c;
import p038T.C0321o;
import p038T.C0322p;
import p038T.C0325s;
import p038T.C0326t;
import p038T.C0329w;
import p038T.C0330x;
import p038T.InterfaceC0320n;
import p040U.C0336a;
import p045W0.C0355e;
import p046X.AbstractComponentCallbacksC0423v;
import p053a0.AbstractC0488b;
import p053a0.C0489c;
import p056b0.C0565b;
import p068f0.AbstractC0792W;
import p068f0.AbstractC0828z;
import p068f0.C0779I;
import p068f0.C0798b;
import p068f0.C0827y;
import p070g.C0858G;
import p082l.C1081Q;
import p082l.C1141t;
import p087m1.InterfaceC1166a;
import p095p0.C1228g;
import p098q0.C1375z1;
import p102s.C1406d;
import p102s.C1407e;
import p104s1.InterfaceC1417a;
import p104s1.InterfaceC1428l;
import p105t.C1441b;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1464g;
import p107t1.C1459b;
import p107t1.InterfaceC1460c;
import p111v.C1593e;
import p121y0.AbstractC1680h;
import p123z.AbstractC1695c;

/* renamed from: K.k */
/* loaded from: classes.dex */
public final class C0198k {

    /* renamed from: e */
    public static C0198k f531e;

    /* renamed from: a */
    public final /* synthetic */ int f532a;

    /* renamed from: b */
    public Object f533b;

    /* renamed from: c */
    public Object f534c;

    /* renamed from: d */
    public Object f535d;

    public /* synthetic */ C0198k(int i) {
        this.f532a = i;
    }

    /* renamed from: c */
    public static boolean m590c(Editable editable, KeyEvent keyEvent, boolean z2) {
        C0330x[] c0330xArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c0330xArr = (C0330x[]) editable.getSpans(selectionStart, selectionEnd, C0330x.class)) != null && c0330xArr.length > 0) {
            for (C0330x c0330x : c0330xArr) {
                int spanStart = editable.getSpanStart(c0330x);
                int spanEnd = editable.getSpanEnd(c0330x);
                if ((z2 && spanStart == selectionStart) || ((!z2 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public static C0198k m591r(Context context, AttributeSet attributeSet, int[] iArr, int i) {
        return new C0198k(context, context.obtainStyledAttributes(attributeSet, iArr, i, 0));
    }

    /* renamed from: a */
    public void m592a(int i, View view, boolean z2) {
        RecyclerView recyclerView = ((C0827y) this.f533b).f4208a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m601k(i);
        ((C0798b) this.f534c).m2290e(childCount, z2);
        if (z2) {
            m606p(view);
        }
        recyclerView.addView(view, childCount);
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        AbstractC0828z abstractC0828z = recyclerView.f2101p;
        if (abstractC0828z != null && m1483J != null) {
            abstractC0828z.mo2348h(m1483J);
        }
        ArrayList arrayList = recyclerView.f2056D;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((C1228g) recyclerView.f2056D.get(size)).getClass();
                C0779I c0779i = (C0779I) view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) c0779i).width != -1 || ((ViewGroup.MarginLayoutParams) c0779i).height != -1) {
                    throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                }
            }
        }
    }

    /* renamed from: b */
    public void m593b(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z2) {
        RecyclerView recyclerView = ((C0827y) this.f533b).f4208a;
        int childCount = i < 0 ? recyclerView.getChildCount() : m601k(i);
        ((C0798b) this.f534c).m2290e(childCount, z2);
        if (z2) {
            m606p(view);
        }
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        if (m1483J != null) {
            if (!m1483J.m2278k() && !m1483J.m2283p()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + m1483J + recyclerView.m1537z());
            }
            m1483J.f4004j &= -257;
        }
        recyclerView.attachViewToParent(view, childCount, layoutParams);
    }

    /* renamed from: d */
    public void m594d(int i) {
        AbstractC0792W m1483J;
        int m601k = m601k(i);
        ((C0798b) this.f534c).m2291f(m601k);
        RecyclerView recyclerView = ((C0827y) this.f533b).f4208a;
        View childAt = recyclerView.getChildAt(m601k);
        if (childAt != null && (m1483J = RecyclerView.m1483J(childAt)) != null) {
            if (m1483J.m2278k() && !m1483J.m2283p()) {
                throw new IllegalArgumentException("called detach on an already detached child " + m1483J + recyclerView.m1537z());
            }
            m1483J.m2268a(Function.MAX_NARGS);
        }
        recyclerView.detachViewFromParent(m601k);
    }

    /* renamed from: e */
    public View m595e(int i) {
        return ((C0827y) this.f533b).f4208a.getChildAt(m601k(i));
    }

    /* renamed from: f */
    public int m596f() {
        return ((C0827y) this.f533b).f4208a.getChildCount() - ((ArrayList) this.f535d).size();
    }

    /* renamed from: g */
    public ColorStateList m597g(int i) {
        int resourceId;
        ColorStateList m4959b;
        TypedArray typedArray = (TypedArray) this.f534c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m4959b = AbstractC1695c.m4959b((Context) this.f533b, resourceId)) == null) ? typedArray.getColorStateList(i) : m4959b;
    }

    /* renamed from: h */
    public Drawable m598h(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.f534c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) ? typedArray.getDrawable(i) : AbstractC0088l.m257D((Context) this.f533b, resourceId);
    }

    /* renamed from: i */
    public Drawable m599i(int i) {
        int resourceId;
        Drawable m2673d;
        if (!((TypedArray) this.f534c).hasValue(i) || (resourceId = ((TypedArray) this.f534c).getResourceId(i, 0)) == 0) {
            return null;
        }
        C1141t m2762a = C1141t.m2762a();
        Context context = (Context) this.f533b;
        synchronized (m2762a) {
            m2673d = m2762a.f5273a.m2673d(context, resourceId, true);
        }
        return m2673d;
    }

    /* renamed from: j */
    public Typeface m600j(int i, int i2, C1081Q c1081q) {
        int resourceId = ((TypedArray) this.f534c).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.f535d) == null) {
            this.f535d = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.f535d;
        ThreadLocal threadLocal = AbstractC0049p.f148a;
        Context context = (Context) this.f533b;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC0049p.m102b(context, resourceId, typedValue, i2, c1081q, true, false);
    }

    /* renamed from: k */
    public int m601k(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C0827y) this.f533b).f4208a.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            C0798b c0798b = (C0798b) this.f534c;
            int m2287b = i - (i2 - c0798b.m2287b(i2));
            if (m2287b == 0) {
                while (c0798b.m2289d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m2287b;
        }
        return -1;
    }

    /* renamed from: l */
    public View m602l(int i) {
        return ((C0827y) this.f533b).f4208a.getChildAt(i);
    }

    /* renamed from: m */
    public int m603m() {
        return ((C0827y) this.f533b).f4208a.getChildCount();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: n */
    public AbstractC0532O m604n(C1459b c1459b, String str) {
        boolean isInstance;
        AbstractC0532O mo1039a;
        AbstractC1461d.m3494e("key", str);
        C0534Q c0534q = (C0534Q) this.f533b;
        c0534q.getClass();
        LinkedHashMap linkedHashMap = c0534q.f1977a;
        AbstractC0532O abstractC0532O = (AbstractC0532O) linkedHashMap.get(str);
        Class cls = c1459b.f7160a;
        Map map = C1459b.f7158b;
        AbstractC1461d.m3492c("null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>", map);
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            int intValue = num.intValue();
            isInstance = false;
            if (abstractC0532O instanceof InterfaceC1166a) {
                if ((abstractC0532O instanceof InterfaceC1460c ? ((InterfaceC1460c) abstractC0532O).mo1165b() : abstractC0532O instanceof InterfaceC1417a ? 0 : abstractC0532O instanceof InterfaceC1428l ? 1 : -1) == intValue) {
                    isInstance = true;
                }
            }
        } else {
            boolean isPrimitive = cls.isPrimitive();
            Class cls2 = cls;
            if (isPrimitive) {
                cls2 = AbstractC1680h.m4875q(AbstractC1464g.m3498a(cls));
            }
            isInstance = cls2.isInstance(abstractC0532O);
        }
        InterfaceC0533P interfaceC0533P = (InterfaceC0533P) this.f534c;
        if (isInstance) {
            if (interfaceC0533P instanceof AbstractC0531N) {
                AbstractC1461d.m3491b(abstractC0532O);
            }
            AbstractC1461d.m3492c("null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel", abstractC0532O);
            return abstractC0532O;
        }
        C0489c c0489c = new C0489c((AbstractC0488b) this.f535d);
        c0489c.f1544a.put(C0565b.f2170a, str);
        try {
            try {
                interfaceC0533P.getClass();
                mo1039a = interfaceC0533P.mo1364b(AbstractC1680h.m4874p(c1459b), c0489c);
            } catch (AbstractMethodError unused) {
                mo1039a = interfaceC0533P.mo1039a(AbstractC1680h.m4874p(c1459b));
            }
        } catch (AbstractMethodError unused2) {
            mo1039a = interfaceC0533P.mo1364b(AbstractC1680h.m4874p(c1459b), c0489c);
        }
        AbstractC1461d.m3494e("viewModel", mo1039a);
        AbstractC0532O abstractC0532O2 = (AbstractC0532O) linkedHashMap.put(str, mo1039a);
        if (abstractC0532O2 != null) {
            abstractC0532O2.m1369a();
        }
        return mo1039a;
    }

    /* renamed from: o */
    public boolean m605o(CharSequence charSequence, int i, int i2, C0329w c0329w) {
        if ((c0329w.f934c & 3) == 0) {
            C0309c c0309c = (C0309c) this.f535d;
            C0336a m928c = c0329w.m928c();
            int m415a = m928c.m415a(8);
            if (m415a != 0) {
                ((ByteBuffer) m928c.f470d).getShort(m415a + m928c.f467a);
            }
            c0309c.getClass();
            ThreadLocal threadLocal = C0309c.f879b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            TextPaint textPaint = c0309c.f880a;
            String sb2 = sb.toString();
            int i3 = AbstractC0061i.f207a;
            boolean m143a = AbstractC0059g.m143a(textPaint, sb2);
            int i4 = c0329w.f934c & 4;
            c0329w.f934c = m143a ? i4 | 2 : i4 | 1;
        }
        return (c0329w.f934c & 3) == 2;
    }

    /* renamed from: p */
    public void m606p(View view) {
        ((ArrayList) this.f535d).add(view);
        C0827y c0827y = (C0827y) this.f533b;
        AbstractC0792W m1483J = RecyclerView.m1483J(view);
        if (m1483J != null) {
            int i = m1483J.f4011q;
            View view2 = m1483J.f3995a;
            if (i != -1) {
                m1483J.f4010p = i;
            } else {
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                m1483J.f4010p = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c0827y.f4208a;
            if (recyclerView.m1499M()) {
                m1483J.f4011q = 4;
                recyclerView.f2114v0.add(m1483J);
            } else {
                WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                view2.setImportantForAccessibility(4);
            }
        }
    }

    /* renamed from: q */
    public boolean m607q(int i, C1406d c1406d, C1593e c1593e) {
        int[] iArr = c1406d.f6685p0;
        int i2 = iArr[0];
        C1441b c1441b = (C1441b) this.f534c;
        c1441b.f6796a = i2;
        c1441b.f6797b = iArr[1];
        c1441b.f6798c = c1406d.m3394q();
        c1441b.f6799d = c1406d.m3390k();
        c1441b.f6804i = false;
        c1441b.f6805j = i;
        boolean z2 = c1441b.f6796a == 3;
        boolean z3 = c1441b.f6797b == 3;
        boolean z4 = z2 && c1406d.f6650W > 0.0f;
        boolean z5 = z3 && c1406d.f6650W > 0.0f;
        int[] iArr2 = c1406d.f6689t;
        if (z4 && iArr2[0] == 4) {
            c1441b.f6796a = 1;
        }
        if (z5 && iArr2[1] == 4) {
            c1441b.f6797b = 1;
        }
        c1593e.m4750b(c1406d, c1441b);
        c1406d.m3379O(c1441b.f6800e);
        c1406d.m3376L(c1441b.f6801f);
        c1406d.f6632E = c1441b.f6803h;
        c1406d.m3373I(c1441b.f6802g);
        c1441b.f6805j = 0;
        return c1441b.f6804i;
    }

    /* renamed from: s */
    public Object m608s(CharSequence charSequence, int i, int i2, int i3, boolean z2, InterfaceC0320n interfaceC0320n) {
        int i4;
        char c2;
        C0322p c0322p = new C0322p((C0325s) ((C0326t) this.f534c).f925c);
        int codePointAt = Character.codePointAt(charSequence, i);
        boolean z3 = true;
        int i5 = 0;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = c0322p.f908c.f921a;
                C0325s c0325s = sparseArray == null ? null : (C0325s) sparseArray.get(codePointAt);
                if (c0322p.f906a == 2) {
                    if (c0325s != null) {
                        c0322p.f908c = c0325s;
                        c0322p.f911f++;
                    } else {
                        if (codePointAt == 65038) {
                            c0322p.m903a();
                        } else if (codePointAt != 65039) {
                            C0325s c0325s2 = c0322p.f908c;
                            if (c0325s2.f922b != null) {
                                if (c0322p.f911f != 1) {
                                    c0322p.f909d = c0325s2;
                                    c0322p.m903a();
                                } else if (c0322p.m904b()) {
                                    c0322p.f909d = c0322p.f908c;
                                    c0322p.m903a();
                                } else {
                                    c0322p.m903a();
                                }
                                c2 = 3;
                            } else {
                                c0322p.m903a();
                            }
                        }
                        c2 = 1;
                    }
                    c2 = 2;
                } else if (c0325s == null) {
                    c0322p.m903a();
                    c2 = 1;
                } else {
                    c0322p.f906a = 2;
                    c0322p.f908c = c0325s;
                    c0322p.f911f = 1;
                    c2 = 2;
                }
                c0322p.f910e = codePointAt;
                if (c2 == 1) {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                } else if (c2 == 2) {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                } else if (c2 == 3) {
                    if (z2 || !m605o(charSequence, i4, i6, c0322p.f909d.f922b)) {
                        z3 = interfaceC0320n.mo76d(charSequence, i4, i6, c0322p.f909d.f922b);
                        i5++;
                    }
                }
            }
        }
        if (c0322p.f906a == 2 && c0322p.f908c.f922b != null && ((c0322p.f911f > 1 || c0322p.m904b()) && i5 < i3 && z3 && (z2 || !m605o(charSequence, i4, i6, c0322p.f908c.f922b)))) {
            interfaceC0320n.mo76d(charSequence, i4, i6, c0322p.f908c.f922b);
        }
        return interfaceC0320n.mo75a();
    }

    /* renamed from: t */
    public void m609t() {
        ((TypedArray) this.f534c).recycle();
    }

    public String toString() {
        switch (this.f532a) {
            case 3:
                return ((C0798b) this.f534c).toString() + ", hidden list:" + ((ArrayList) this.f535d).size();
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public void m610u(C1407e c1407e, int i, int i2, int i3) {
        int i4 = c1407e.f6657b0;
        int i5 = c1407e.f6659c0;
        c1407e.f6657b0 = 0;
        c1407e.f6659c0 = 0;
        c1407e.m3379O(i2);
        c1407e.m3376L(i3);
        if (i4 < 0) {
            c1407e.f6657b0 = 0;
        } else {
            c1407e.f6657b0 = i4;
        }
        if (i5 < 0) {
            c1407e.f6659c0 = 0;
        } else {
            c1407e.f6659c0 = i5;
        }
        C1407e c1407e2 = (C1407e) this.f535d;
        c1407e2.f6711t0 = i;
        c1407e2.m3408U();
    }

    /* renamed from: v */
    public void m611v(View view) {
        if (((ArrayList) this.f535d).remove(view)) {
            C0827y c0827y = (C0827y) this.f533b;
            AbstractC0792W m1483J = RecyclerView.m1483J(view);
            if (m1483J != null) {
                int i = m1483J.f4010p;
                RecyclerView recyclerView = c0827y.f4208a;
                if (recyclerView.m1499M()) {
                    m1483J.f4011q = i;
                    recyclerView.f2114v0.add(m1483J);
                } else {
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    m1483J.f3995a.setImportantForAccessibility(i);
                }
                m1483J.f4010p = 0;
            }
        }
    }

    /* renamed from: w */
    public void m612w(C1407e c1407e) {
        ArrayList arrayList = (ArrayList) this.f533b;
        arrayList.clear();
        int size = c1407e.f6708q0.size();
        for (int i = 0; i < size; i++) {
            C1406d c1406d = (C1406d) c1407e.f6708q0.get(i);
            int[] iArr = c1406d.f6685p0;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c1406d);
            }
        }
        c1407e.f6710s0.f6809b = true;
    }

    public C0198k(C0534Q c0534q, InterfaceC0533P interfaceC0533P, AbstractC0488b abstractC0488b) {
        this.f532a = 2;
        AbstractC1461d.m3494e("store", c0534q);
        AbstractC1461d.m3494e("extras", abstractC0488b);
        this.f533b = c0534q;
        this.f534c = interfaceC0533P;
        this.f535d = abstractC0488b;
    }

    public C0198k(C0827y c0827y) {
        this.f532a = 3;
        this.f533b = c0827y;
        this.f534c = new C0798b();
        this.f535d = new ArrayList();
    }

    public C0198k(Runnable runnable) {
        this.f532a = 0;
        this.f534c = new CopyOnWriteArrayList();
        this.f535d = new HashMap();
        this.f533b = runnable;
    }

    public C0198k(Context context, TypedArray typedArray) {
        this.f532a = 5;
        this.f533b = context;
        this.f534c = typedArray;
    }

    public C0198k(Context context, LocationManager locationManager) {
        this.f532a = 4;
        this.f535d = new C0858G();
        this.f533b = context;
        this.f534c = locationManager;
    }

    public C0198k(C1407e c1407e) {
        this.f532a = 8;
        this.f533b = new ArrayList();
        this.f534c = new C1441b();
        this.f535d = c1407e;
    }

    public C0198k(C0326t c0326t, C0355e c0355e, C0309c c0309c, Set set) {
        this.f532a = 1;
        this.f533b = c0355e;
        this.f534c = c0326t;
        this.f535d = c0309c;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            m608s(str, 0, str.length(), 1, true, new C0321o(str, 0));
        }
    }

    public C0198k(C1375z1 c1375z1, AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, FrameLayout frameLayout) {
        this.f532a = 6;
        this.f535d = c1375z1;
        this.f533b = abstractComponentCallbacksC0423v;
        this.f534c = frameLayout;
    }
}
