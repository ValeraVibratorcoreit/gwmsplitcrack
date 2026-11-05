package p046X;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0548m;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import com.sun.jna.Platform;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001A0.RunnableC0020n;
import p003B.C0043j;
import p006C.AbstractC0062j;
import p020J.InterfaceC0143a;
import p022K.C0198k;
import p038T.C0326t;
import p045W0.C0355e;
import p048Y.AbstractC0434d;
import p052a.C0456B;
import p052a.C0457C;
import p052a.C0470j;
import p052a.C0486z;
import p052a.InterfaceC0463c;
import p058c.C0574h;
import p059c0.C0576a;
import p070g.AbstractActivityC0870i;
import p071g0.C0891d;
import p091o.C1202l;
import p107t1.AbstractC1461d;
import p109u0.AbstractC1561o;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.C1698f;
import p123z.C1701i;

/* renamed from: X.O */
/* loaded from: classes.dex */
public final class C0387O {

    /* renamed from: A */
    public C0574h f1136A;

    /* renamed from: B */
    public C0574h f1137B;

    /* renamed from: C */
    public ArrayDeque f1138C;

    /* renamed from: D */
    public boolean f1139D;

    /* renamed from: E */
    public boolean f1140E;

    /* renamed from: F */
    public boolean f1141F;

    /* renamed from: G */
    public boolean f1142G;

    /* renamed from: H */
    public boolean f1143H;

    /* renamed from: I */
    public ArrayList f1144I;

    /* renamed from: J */
    public ArrayList f1145J;

    /* renamed from: K */
    public ArrayList f1146K;

    /* renamed from: L */
    public C0390S f1147L;

    /* renamed from: M */
    public final RunnableC0020n f1148M;

    /* renamed from: b */
    public boolean f1150b;

    /* renamed from: d */
    public ArrayList f1152d;

    /* renamed from: e */
    public ArrayList f1153e;

    /* renamed from: g */
    public C0457C f1155g;

    /* renamed from: l */
    public final C0043j f1160l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f1161m;

    /* renamed from: n */
    public final C0377E f1162n;

    /* renamed from: o */
    public final C0377E f1163o;

    /* renamed from: p */
    public final C0377E f1164p;

    /* renamed from: q */
    public final C0377E f1165q;

    /* renamed from: r */
    public final C0380H f1166r;

    /* renamed from: s */
    public int f1167s;

    /* renamed from: t */
    public C0427z f1168t;

    /* renamed from: u */
    public AbstractC1680h f1169u;

    /* renamed from: v */
    public AbstractComponentCallbacksC0423v f1170v;

    /* renamed from: w */
    public AbstractComponentCallbacksC0423v f1171w;

    /* renamed from: x */
    public final C0381I f1172x;

    /* renamed from: y */
    public final C0355e f1173y;

    /* renamed from: z */
    public C0574h f1174z;

    /* renamed from: a */
    public final ArrayList f1149a = new ArrayList();

    /* renamed from: c */
    public final C0326t f1151c = new C0326t(1);

    /* renamed from: f */
    public final LayoutInflaterFactory2C0375C f1154f = new LayoutInflaterFactory2C0375C(this);

    /* renamed from: h */
    public final C0379G f1156h = new C0379G(this);

    /* renamed from: i */
    public final AtomicInteger f1157i = new AtomicInteger();

    /* renamed from: j */
    public final Map f1158j = Collections.synchronizedMap(new HashMap());

    /* renamed from: k */
    public final Map f1159k = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v12, types: [X.E] */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.E] */
    /* JADX WARN: Type inference failed for: r0v14, types: [X.E] */
    /* JADX WARN: Type inference failed for: r0v15, types: [X.E] */
    public C0387O() {
        Collections.synchronizedMap(new HashMap());
        this.f1160l = new C0043j(this);
        this.f1161m = new CopyOnWriteArrayList();
        final int i = 0;
        this.f1162n = new InterfaceC0143a(this) { // from class: X.E

            /* renamed from: b */
            public final /* synthetic */ C0387O f1120b;

            {
                this.f1120b = this;
            }

            @Override // p020J.InterfaceC0143a
            public final void accept(Object obj) {
                switch (i) {
                    case 0:
                        C0387O c0387o = this.f1120b;
                        if (c0387o.m994I()) {
                            c0387o.m1020h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0387O c0387o2 = this.f1120b;
                        if (c0387o2.m994I() && num.intValue() == 80) {
                            c0387o2.m1024l(false);
                            break;
                        }
                        break;
                    case 2:
                        C1698f c1698f = (C1698f) obj;
                        C0387O c0387o3 = this.f1120b;
                        if (c0387o3.m994I()) {
                            c0387o3.m1025m(c1698f.f9627a, false);
                            break;
                        }
                        break;
                    default:
                        C1701i c1701i = (C1701i) obj;
                        C0387O c0387o4 = this.f1120b;
                        if (c0387o4.m994I()) {
                            c0387o4.m1030r(c1701i.f9629a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f1163o = new InterfaceC0143a(this) { // from class: X.E

            /* renamed from: b */
            public final /* synthetic */ C0387O f1120b;

            {
                this.f1120b = this;
            }

            @Override // p020J.InterfaceC0143a
            public final void accept(Object obj) {
                switch (i2) {
                    case 0:
                        C0387O c0387o = this.f1120b;
                        if (c0387o.m994I()) {
                            c0387o.m1020h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0387O c0387o2 = this.f1120b;
                        if (c0387o2.m994I() && num.intValue() == 80) {
                            c0387o2.m1024l(false);
                            break;
                        }
                        break;
                    case 2:
                        C1698f c1698f = (C1698f) obj;
                        C0387O c0387o3 = this.f1120b;
                        if (c0387o3.m994I()) {
                            c0387o3.m1025m(c1698f.f9627a, false);
                            break;
                        }
                        break;
                    default:
                        C1701i c1701i = (C1701i) obj;
                        C0387O c0387o4 = this.f1120b;
                        if (c0387o4.m994I()) {
                            c0387o4.m1030r(c1701i.f9629a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i3 = 2;
        this.f1164p = new InterfaceC0143a(this) { // from class: X.E

            /* renamed from: b */
            public final /* synthetic */ C0387O f1120b;

            {
                this.f1120b = this;
            }

            @Override // p020J.InterfaceC0143a
            public final void accept(Object obj) {
                switch (i3) {
                    case 0:
                        C0387O c0387o = this.f1120b;
                        if (c0387o.m994I()) {
                            c0387o.m1020h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0387O c0387o2 = this.f1120b;
                        if (c0387o2.m994I() && num.intValue() == 80) {
                            c0387o2.m1024l(false);
                            break;
                        }
                        break;
                    case 2:
                        C1698f c1698f = (C1698f) obj;
                        C0387O c0387o3 = this.f1120b;
                        if (c0387o3.m994I()) {
                            c0387o3.m1025m(c1698f.f9627a, false);
                            break;
                        }
                        break;
                    default:
                        C1701i c1701i = (C1701i) obj;
                        C0387O c0387o4 = this.f1120b;
                        if (c0387o4.m994I()) {
                            c0387o4.m1030r(c1701i.f9629a, false);
                            break;
                        }
                        break;
                }
            }
        };
        final int i4 = 3;
        this.f1165q = new InterfaceC0143a(this) { // from class: X.E

            /* renamed from: b */
            public final /* synthetic */ C0387O f1120b;

            {
                this.f1120b = this;
            }

            @Override // p020J.InterfaceC0143a
            public final void accept(Object obj) {
                switch (i4) {
                    case 0:
                        C0387O c0387o = this.f1120b;
                        if (c0387o.m994I()) {
                            c0387o.m1020h(false);
                            break;
                        }
                        break;
                    case 1:
                        Integer num = (Integer) obj;
                        C0387O c0387o2 = this.f1120b;
                        if (c0387o2.m994I() && num.intValue() == 80) {
                            c0387o2.m1024l(false);
                            break;
                        }
                        break;
                    case 2:
                        C1698f c1698f = (C1698f) obj;
                        C0387O c0387o3 = this.f1120b;
                        if (c0387o3.m994I()) {
                            c0387o3.m1025m(c1698f.f9627a, false);
                            break;
                        }
                        break;
                    default:
                        C1701i c1701i = (C1701i) obj;
                        C0387O c0387o4 = this.f1120b;
                        if (c0387o4.m994I()) {
                            c0387o4.m1030r(c1701i.f9629a, false);
                            break;
                        }
                        break;
                }
            }
        };
        this.f1166r = new C0380H(this);
        this.f1167s = -1;
        this.f1172x = new C0381I(this);
        this.f1173y = new C0355e(13);
        this.f1138C = new ArrayDeque();
        this.f1148M = new RunnableC0020n(6, this);
    }

    /* renamed from: H */
    public static boolean m983H(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        abstractComponentCallbacksC0423v.getClass();
        Iterator it = abstractComponentCallbacksC0423v.f1376y.f1151c.m914g().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = (AbstractComponentCallbacksC0423v) it.next();
            if (abstractComponentCallbacksC0423v2 != null) {
                z2 = m983H(abstractComponentCallbacksC0423v2);
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: J */
    public static boolean m984J(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (abstractComponentCallbacksC0423v == null) {
            return true;
        }
        return abstractComponentCallbacksC0423v.f1339G && (abstractComponentCallbacksC0423v.f1374w == null || m984J(abstractComponentCallbacksC0423v.f1377z));
    }

    /* renamed from: K */
    public static boolean m985K(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (abstractComponentCallbacksC0423v == null) {
            return true;
        }
        C0387O c0387o = abstractComponentCallbacksC0423v.f1374w;
        return abstractComponentCallbacksC0423v.equals(c0387o.f1171w) && m985K(c0387o.f1170v);
    }

    /* renamed from: a0 */
    public static void m986a0(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "show: " + abstractComponentCallbacksC0423v);
        }
        if (abstractComponentCallbacksC0423v.f1336D) {
            abstractComponentCallbacksC0423v.f1336D = false;
            abstractComponentCallbacksC0423v.f1346N = !abstractComponentCallbacksC0423v.f1346N;
        }
    }

    /* renamed from: A */
    public final void m987A(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        Object obj;
        ViewGroup viewGroup;
        C0326t c0326t;
        C0326t c0326t2;
        C0326t c0326t3;
        int i3;
        int i4;
        int i5;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        boolean z2 = ((C0398a) arrayList3.get(i)).f1242o;
        ArrayList arrayList5 = this.f1146K;
        if (arrayList5 == null) {
            this.f1146K = new ArrayList();
        } else {
            arrayList5.clear();
        }
        ArrayList arrayList6 = this.f1146K;
        C0326t c0326t4 = this.f1151c;
        arrayList6.addAll(c0326t4.m915h());
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1171w;
        int i6 = i;
        boolean z3 = false;
        while (true) {
            int i7 = 1;
            if (i6 >= i2) {
                C0326t c0326t5 = c0326t4;
                this.f1146K.clear();
                if (!z2 && this.f1167s >= 1) {
                    for (int i8 = i; i8 < i2; i8++) {
                        Iterator it = ((C0398a) arrayList.get(i8)).f1228a.iterator();
                        while (it.hasNext()) {
                            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = ((C0395X) it.next()).f1213b;
                            if (abstractComponentCallbacksC0423v2 == null || abstractComponentCallbacksC0423v2.f1374w == null) {
                                c0326t = c0326t5;
                            } else {
                                c0326t = c0326t5;
                                c0326t.m916i(m1018f(abstractComponentCallbacksC0423v2));
                            }
                            c0326t5 = c0326t;
                        }
                    }
                }
                for (int i9 = i; i9 < i2; i9++) {
                    C0398a c0398a = (C0398a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue()) {
                        c0398a.m1073c(-1);
                        ArrayList arrayList7 = c0398a.f1228a;
                        boolean z4 = true;
                        for (int size = arrayList7.size() - 1; size >= 0; size--) {
                            C0395X c0395x = (C0395X) arrayList7.get(size);
                            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = c0395x.f1213b;
                            if (abstractComponentCallbacksC0423v3 != null) {
                                if (abstractComponentCallbacksC0423v3.f1345M != null) {
                                    abstractComponentCallbacksC0423v3.m1123f().f1320a = z4;
                                }
                                int i10 = c0398a.f1233f;
                                int i11 = 8194;
                                int i12 = 4097;
                                if (i10 != 4097) {
                                    if (i10 != 8194) {
                                        i11 = 4100;
                                        i12 = 8197;
                                        if (i10 != 8197) {
                                            if (i10 == 4099) {
                                                i11 = 4099;
                                            } else if (i10 != 4100) {
                                                i11 = 0;
                                            }
                                        }
                                    }
                                    i11 = i12;
                                }
                                if (abstractComponentCallbacksC0423v3.f1345M != null || i11 != 0) {
                                    abstractComponentCallbacksC0423v3.m1123f();
                                    abstractComponentCallbacksC0423v3.f1345M.f1325f = i11;
                                }
                                abstractComponentCallbacksC0423v3.m1123f();
                                abstractComponentCallbacksC0423v3.f1345M.getClass();
                            }
                            int i13 = c0395x.f1212a;
                            C0387O c0387o = c0398a.f1243p;
                            switch (i13) {
                                case 1:
                                    abstractComponentCallbacksC0423v3.m1121M(c0395x.f1215d, c0395x.f1216e, c0395x.f1217f, c0395x.f1218g);
                                    z4 = true;
                                    c0387o.m1006W(abstractComponentCallbacksC0423v3, true);
                                    c0387o.m1001R(abstractComponentCallbacksC0423v3);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0395x.f1212a);
                                case 3:
                                    abstractComponentCallbacksC0423v3.m1121M(c0395x.f1215d, c0395x.f1216e, c0395x.f1217f, c0395x.f1218g);
                                    c0387o.m1010a(abstractComponentCallbacksC0423v3);
                                    z4 = true;
                                case 4:
                                    abstractComponentCallbacksC0423v3.m1121M(c0395x.f1215d, c0395x.f1216e, c0395x.f1217f, c0395x.f1218g);
                                    c0387o.getClass();
                                    m986a0(abstractComponentCallbacksC0423v3);
                                    z4 = true;
                                case 5:
                                    abstractComponentCallbacksC0423v3.m1121M(c0395x.f1215d, c0395x.f1216e, c0395x.f1217f, c0395x.f1218g);
                                    c0387o.m1006W(abstractComponentCallbacksC0423v3, true);
                                    c0387o.m993G(abstractComponentCallbacksC0423v3);
                                    z4 = true;
                                case 6:
                                    abstractComponentCallbacksC0423v3.m1121M(c0395x.f1215d, c0395x.f1216e, c0395x.f1217f, c0395x.f1218g);
                                    c0387o.m1013c(abstractComponentCallbacksC0423v3);
                                    z4 = true;
                                case 7:
                                    abstractComponentCallbacksC0423v3.m1121M(c0395x.f1215d, c0395x.f1216e, c0395x.f1217f, c0395x.f1218g);
                                    c0387o.m1006W(abstractComponentCallbacksC0423v3, true);
                                    c0387o.m1019g(abstractComponentCallbacksC0423v3);
                                    z4 = true;
                                case 8:
                                    c0387o.m1008Y(null);
                                    z4 = true;
                                case Platform.GNU /* 9 */:
                                    c0387o.m1008Y(abstractComponentCallbacksC0423v3);
                                    z4 = true;
                                case Platform.KFREEBSD /* 10 */:
                                    c0387o.m1007X(abstractComponentCallbacksC0423v3, c0395x.f1219h);
                                    z4 = true;
                            }
                        }
                    } else {
                        c0398a.m1073c(1);
                        ArrayList arrayList8 = c0398a.f1228a;
                        int size2 = arrayList8.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            C0395X c0395x2 = (C0395X) arrayList8.get(i14);
                            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v4 = c0395x2.f1213b;
                            if (abstractComponentCallbacksC0423v4 != null) {
                                if (abstractComponentCallbacksC0423v4.f1345M != null) {
                                    abstractComponentCallbacksC0423v4.m1123f().f1320a = false;
                                }
                                int i15 = c0398a.f1233f;
                                if (abstractComponentCallbacksC0423v4.f1345M != null || i15 != 0) {
                                    abstractComponentCallbacksC0423v4.m1123f();
                                    abstractComponentCallbacksC0423v4.f1345M.f1325f = i15;
                                }
                                abstractComponentCallbacksC0423v4.m1123f();
                                abstractComponentCallbacksC0423v4.f1345M.getClass();
                            }
                            int i16 = c0395x2.f1212a;
                            C0387O c0387o2 = c0398a.f1243p;
                            switch (i16) {
                                case 1:
                                    abstractComponentCallbacksC0423v4.m1121M(c0395x2.f1215d, c0395x2.f1216e, c0395x2.f1217f, c0395x2.f1218g);
                                    c0387o2.m1006W(abstractComponentCallbacksC0423v4, false);
                                    c0387o2.m1010a(abstractComponentCallbacksC0423v4);
                                case 2:
                                default:
                                    throw new IllegalArgumentException("Unknown cmd: " + c0395x2.f1212a);
                                case 3:
                                    abstractComponentCallbacksC0423v4.m1121M(c0395x2.f1215d, c0395x2.f1216e, c0395x2.f1217f, c0395x2.f1218g);
                                    c0387o2.m1001R(abstractComponentCallbacksC0423v4);
                                case 4:
                                    abstractComponentCallbacksC0423v4.m1121M(c0395x2.f1215d, c0395x2.f1216e, c0395x2.f1217f, c0395x2.f1218g);
                                    c0387o2.m993G(abstractComponentCallbacksC0423v4);
                                case 5:
                                    abstractComponentCallbacksC0423v4.m1121M(c0395x2.f1215d, c0395x2.f1216e, c0395x2.f1217f, c0395x2.f1218g);
                                    c0387o2.m1006W(abstractComponentCallbacksC0423v4, false);
                                    m986a0(abstractComponentCallbacksC0423v4);
                                case 6:
                                    abstractComponentCallbacksC0423v4.m1121M(c0395x2.f1215d, c0395x2.f1216e, c0395x2.f1217f, c0395x2.f1218g);
                                    c0387o2.m1019g(abstractComponentCallbacksC0423v4);
                                case 7:
                                    abstractComponentCallbacksC0423v4.m1121M(c0395x2.f1215d, c0395x2.f1216e, c0395x2.f1217f, c0395x2.f1218g);
                                    c0387o2.m1006W(abstractComponentCallbacksC0423v4, false);
                                    c0387o2.m1013c(abstractComponentCallbacksC0423v4);
                                case 8:
                                    c0387o2.m1008Y(abstractComponentCallbacksC0423v4);
                                case Platform.GNU /* 9 */:
                                    c0387o2.m1008Y(null);
                                case Platform.KFREEBSD /* 10 */:
                                    c0387o2.m1007X(abstractComponentCallbacksC0423v4, c0395x2.f1220i);
                            }
                        }
                    }
                }
                boolean booleanValue = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                for (int i17 = i; i17 < i2; i17++) {
                    C0398a c0398a2 = (C0398a) arrayList.get(i17);
                    if (booleanValue) {
                        for (int size3 = c0398a2.f1228a.size() - 1; size3 >= 0; size3--) {
                            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v5 = ((C0395X) c0398a2.f1228a.get(size3)).f1213b;
                            if (abstractComponentCallbacksC0423v5 != null) {
                                m1018f(abstractComponentCallbacksC0423v5).m1057k();
                            }
                        }
                    } else {
                        Iterator it2 = c0398a2.f1228a.iterator();
                        while (it2.hasNext()) {
                            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v6 = ((C0395X) it2.next()).f1213b;
                            if (abstractComponentCallbacksC0423v6 != null) {
                                m1018f(abstractComponentCallbacksC0423v6).m1057k();
                            }
                        }
                    }
                }
                m996M(this.f1167s, true);
                HashSet hashSet = new HashSet();
                for (int i18 = i; i18 < i2; i18++) {
                    Iterator it3 = ((C0398a) arrayList.get(i18)).f1228a.iterator();
                    while (it3.hasNext()) {
                        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v7 = ((C0395X) it3.next()).f1213b;
                        if (abstractComponentCallbacksC0423v7 != null && (viewGroup = abstractComponentCallbacksC0423v7.f1341I) != null) {
                            hashSet.add(C0412k.m1092g(viewGroup, this));
                        }
                    }
                }
                Iterator it4 = hashSet.iterator();
                while (it4.hasNext()) {
                    C0412k c0412k = (C0412k) it4.next();
                    c0412k.f1297d = booleanValue;
                    synchronized (c0412k.f1295b) {
                        try {
                            c0412k.m1099h();
                            ArrayList arrayList9 = c0412k.f1295b;
                            ListIterator listIterator = arrayList9.listIterator(arrayList9.size());
                            while (true) {
                                if (listIterator.hasPrevious()) {
                                    obj = listIterator.previous();
                                    C0401b0 c0401b0 = (C0401b0) obj;
                                    View view = c0401b0.f1265c.f1342J;
                                    AbstractC1461d.m3493d("operation.fragment.mView", view);
                                    int m4934c = AbstractC1687o.m4934c(view);
                                    if (c0401b0.f1263a != 2 || m4934c == 2) {
                                    }
                                } else {
                                    obj = null;
                                }
                            }
                            c0412k.f1298e = false;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    c0412k.m1096d();
                }
                for (int i19 = i; i19 < i2; i19++) {
                    C0398a c0398a3 = (C0398a) arrayList.get(i19);
                    if (((Boolean) arrayList2.get(i19)).booleanValue() && c0398a3.f1245r >= 0) {
                        c0398a3.f1245r = -1;
                    }
                    c0398a3.getClass();
                }
                return;
            }
            C0398a c0398a4 = (C0398a) arrayList3.get(i6);
            if (((Boolean) arrayList4.get(i6)).booleanValue()) {
                c0326t2 = c0326t4;
                int i20 = 1;
                ArrayList arrayList10 = this.f1146K;
                ArrayList arrayList11 = c0398a4.f1228a;
                int size4 = arrayList11.size() - 1;
                while (size4 >= 0) {
                    C0395X c0395x3 = (C0395X) arrayList11.get(size4);
                    int i21 = c0395x3.f1212a;
                    if (i21 != i20) {
                        if (i21 != 3) {
                            switch (i21) {
                                case 8:
                                    abstractComponentCallbacksC0423v = null;
                                    break;
                                case Platform.GNU /* 9 */:
                                    abstractComponentCallbacksC0423v = c0395x3.f1213b;
                                    break;
                                case Platform.KFREEBSD /* 10 */:
                                    c0395x3.f1220i = c0395x3.f1219h;
                                    break;
                            }
                            size4--;
                            i20 = 1;
                        }
                        arrayList10.add(c0395x3.f1213b);
                        size4--;
                        i20 = 1;
                    }
                    arrayList10.remove(c0395x3.f1213b);
                    size4--;
                    i20 = 1;
                }
            } else {
                ArrayList arrayList12 = this.f1146K;
                int i22 = 0;
                while (true) {
                    ArrayList arrayList13 = c0398a4.f1228a;
                    if (i22 < arrayList13.size()) {
                        C0395X c0395x4 = (C0395X) arrayList13.get(i22);
                        int i23 = c0395x4.f1212a;
                        if (i23 != i7) {
                            if (i23 != 2) {
                                if (i23 == 3 || i23 == 6) {
                                    arrayList12.remove(c0395x4.f1213b);
                                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v8 = c0395x4.f1213b;
                                    if (abstractComponentCallbacksC0423v8 == abstractComponentCallbacksC0423v) {
                                        arrayList13.add(i22, new C0395X(9, abstractComponentCallbacksC0423v8));
                                        i22++;
                                        c0326t3 = c0326t4;
                                        i3 = 1;
                                        abstractComponentCallbacksC0423v = null;
                                    }
                                } else if (i23 == 7) {
                                    c0326t3 = c0326t4;
                                    i3 = 1;
                                } else if (i23 == 8) {
                                    arrayList13.add(i22, new C0395X(9, abstractComponentCallbacksC0423v, 0));
                                    c0395x4.f1214c = true;
                                    i22++;
                                    abstractComponentCallbacksC0423v = c0395x4.f1213b;
                                }
                                c0326t3 = c0326t4;
                                i3 = 1;
                            } else {
                                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v9 = c0395x4.f1213b;
                                int i24 = abstractComponentCallbacksC0423v9.f1334B;
                                int size5 = arrayList12.size() - 1;
                                boolean z5 = false;
                                while (size5 >= 0) {
                                    C0326t c0326t6 = c0326t4;
                                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v10 = (AbstractComponentCallbacksC0423v) arrayList12.get(size5);
                                    if (abstractComponentCallbacksC0423v10.f1334B != i24) {
                                        i4 = i24;
                                    } else if (abstractComponentCallbacksC0423v10 == abstractComponentCallbacksC0423v9) {
                                        i4 = i24;
                                        z5 = true;
                                    } else {
                                        if (abstractComponentCallbacksC0423v10 == abstractComponentCallbacksC0423v) {
                                            i4 = i24;
                                            arrayList13.add(i22, new C0395X(9, abstractComponentCallbacksC0423v10, 0));
                                            i22++;
                                            i5 = 0;
                                            abstractComponentCallbacksC0423v = null;
                                        } else {
                                            i4 = i24;
                                            i5 = 0;
                                        }
                                        C0395X c0395x5 = new C0395X(3, abstractComponentCallbacksC0423v10, i5);
                                        c0395x5.f1215d = c0395x4.f1215d;
                                        c0395x5.f1217f = c0395x4.f1217f;
                                        c0395x5.f1216e = c0395x4.f1216e;
                                        c0395x5.f1218g = c0395x4.f1218g;
                                        arrayList13.add(i22, c0395x5);
                                        arrayList12.remove(abstractComponentCallbacksC0423v10);
                                        i22++;
                                        abstractComponentCallbacksC0423v = abstractComponentCallbacksC0423v;
                                    }
                                    size5--;
                                    i24 = i4;
                                    c0326t4 = c0326t6;
                                }
                                c0326t3 = c0326t4;
                                i3 = 1;
                                if (z5) {
                                    arrayList13.remove(i22);
                                    i22--;
                                } else {
                                    c0395x4.f1212a = 1;
                                    c0395x4.f1214c = true;
                                    arrayList12.add(abstractComponentCallbacksC0423v9);
                                }
                            }
                            i22 += i3;
                            i7 = i3;
                            c0326t4 = c0326t3;
                        } else {
                            c0326t3 = c0326t4;
                            i3 = i7;
                        }
                        arrayList12.add(c0395x4.f1213b);
                        i22 += i3;
                        i7 = i3;
                        c0326t4 = c0326t3;
                    } else {
                        c0326t2 = c0326t4;
                    }
                }
            }
            z3 = z3 || c0398a4.f1234g;
            i6++;
            arrayList3 = arrayList;
            arrayList4 = arrayList2;
            c0326t4 = c0326t2;
        }
    }

    /* renamed from: B */
    public final AbstractComponentCallbacksC0423v m988B(int i) {
        C0326t c0326t = this.f1151c;
        ArrayList arrayList = (ArrayList) c0326t.f923a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) arrayList.get(size);
            if (abstractComponentCallbacksC0423v != null && abstractComponentCallbacksC0423v.f1333A == i) {
                return abstractComponentCallbacksC0423v;
            }
        }
        for (C0394W c0394w : ((HashMap) c0326t.f924b).values()) {
            if (c0394w != null) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0394w.f1209c;
                if (abstractComponentCallbacksC0423v2.f1333A == i) {
                    return abstractComponentCallbacksC0423v2;
                }
            }
        }
        return null;
    }

    /* renamed from: C */
    public final AbstractComponentCallbacksC0423v m989C(String str) {
        C0326t c0326t = this.f1151c;
        ArrayList arrayList = (ArrayList) c0326t.f923a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) arrayList.get(size);
            if (abstractComponentCallbacksC0423v != null && str.equals(abstractComponentCallbacksC0423v.f1335C)) {
                return abstractComponentCallbacksC0423v;
            }
        }
        for (C0394W c0394w : ((HashMap) c0326t.f924b).values()) {
            if (c0394w != null) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0394w.f1209c;
                if (str.equals(abstractComponentCallbacksC0423v2.f1335C)) {
                    return abstractComponentCallbacksC0423v2;
                }
            }
        }
        return null;
    }

    /* renamed from: D */
    public final ViewGroup m990D(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        ViewGroup viewGroup = abstractComponentCallbacksC0423v.f1341I;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (abstractComponentCallbacksC0423v.f1334B > 0 && this.f1169u.mo1102I()) {
            View mo1101F = this.f1169u.mo1101F(abstractComponentCallbacksC0423v.f1334B);
            if (mo1101F instanceof ViewGroup) {
                return (ViewGroup) mo1101F;
            }
        }
        return null;
    }

    /* renamed from: E */
    public final C0381I m991E() {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1170v;
        return abstractComponentCallbacksC0423v != null ? abstractComponentCallbacksC0423v.f1374w.m991E() : this.f1172x;
    }

    /* renamed from: F */
    public final C0355e m992F() {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1170v;
        return abstractComponentCallbacksC0423v != null ? abstractComponentCallbacksC0423v.f1374w.m992F() : this.f1173y;
    }

    /* renamed from: G */
    public final void m993G(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "hide: " + abstractComponentCallbacksC0423v);
        }
        if (abstractComponentCallbacksC0423v.f1336D) {
            return;
        }
        abstractComponentCallbacksC0423v.f1336D = true;
        abstractComponentCallbacksC0423v.f1346N = true ^ abstractComponentCallbacksC0423v.f1346N;
        m1009Z(abstractComponentCallbacksC0423v);
    }

    /* renamed from: I */
    public final boolean m994I() {
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1170v;
        if (abstractComponentCallbacksC0423v == null) {
            return true;
        }
        return abstractComponentCallbacksC0423v.m1134q() && this.f1170v.m1128k().m994I();
    }

    /* renamed from: L */
    public final boolean m995L() {
        return this.f1140E || this.f1141F;
    }

    /* renamed from: M */
    public final void m996M(int i, boolean z2) {
        HashMap hashMap;
        C0427z c0427z;
        if (this.f1168t == null && i != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i != this.f1167s) {
            this.f1167s = i;
            C0326t c0326t = this.f1151c;
            Iterator it = ((ArrayList) c0326t.f923a).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                hashMap = (HashMap) c0326t.f924b;
                if (!hasNext) {
                    break;
                }
                C0394W c0394w = (C0394W) hashMap.get(((AbstractComponentCallbacksC0423v) it.next()).f1361j);
                if (c0394w != null) {
                    c0394w.m1057k();
                }
            }
            for (C0394W c0394w2 : hashMap.values()) {
                if (c0394w2 != null) {
                    c0394w2.m1057k();
                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w2.f1209c;
                    if (abstractComponentCallbacksC0423v.f1368q && !abstractComponentCallbacksC0423v.m1136s()) {
                        c0326t.m917j(c0394w2);
                    }
                }
            }
            m1012b0();
            if (this.f1139D && (c0427z = this.f1168t) != null && this.f1167s == 7) {
                c0427z.f1388o.invalidateOptionsMenu();
                this.f1139D = false;
            }
        }
    }

    /* renamed from: N */
    public final void m997N() {
        if (this.f1168t == null) {
            return;
        }
        this.f1140E = false;
        this.f1141F = false;
        this.f1147L.f1190g = false;
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null) {
                abstractComponentCallbacksC0423v.f1376y.m997N();
            }
        }
    }

    /* renamed from: O */
    public final boolean m998O() {
        return m999P(-1, 0);
    }

    /* renamed from: P */
    public final boolean m999P(int i, int i2) {
        m1037y(false);
        m1036x(true);
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1171w;
        if (abstractComponentCallbacksC0423v != null && i < 0 && abstractComponentCallbacksC0423v.m1125h().m998O()) {
            return true;
        }
        boolean m1000Q = m1000Q(this.f1144I, this.f1145J, i, i2);
        if (m1000Q) {
            this.f1150b = true;
            try {
                m1002S(this.f1144I, this.f1145J);
            } finally {
                m1015d();
            }
        }
        m1016d0();
        m1033u();
        ((HashMap) this.f1151c.f924b).values().removeAll(Collections.singleton(null));
        return m1000Q;
    }

    /* renamed from: Q */
    public final boolean m1000Q(ArrayList arrayList, ArrayList arrayList2, int i, int i2) {
        boolean z2 = (i2 & 1) != 0;
        ArrayList arrayList3 = this.f1152d;
        int i3 = -1;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            if (i < 0) {
                i3 = z2 ? 0 : this.f1152d.size() - 1;
            } else {
                int size = this.f1152d.size() - 1;
                while (size >= 0) {
                    C0398a c0398a = (C0398a) this.f1152d.get(size);
                    if (i >= 0 && i == c0398a.f1245r) {
                        break;
                    }
                    size--;
                }
                if (size >= 0) {
                    if (z2) {
                        while (size > 0) {
                            C0398a c0398a2 = (C0398a) this.f1152d.get(size - 1);
                            if (i < 0 || i != c0398a2.f1245r) {
                                break;
                            }
                            size--;
                        }
                    } else if (size != this.f1152d.size() - 1) {
                        size++;
                    }
                }
                i3 = size;
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.f1152d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((C0398a) this.f1152d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    /* renamed from: R */
    public final void m1001R(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "remove: " + abstractComponentCallbacksC0423v + " nesting=" + abstractComponentCallbacksC0423v.f1373v);
        }
        boolean m1136s = abstractComponentCallbacksC0423v.m1136s();
        if (abstractComponentCallbacksC0423v.f1337E && m1136s) {
            return;
        }
        C0326t c0326t = this.f1151c;
        synchronized (((ArrayList) c0326t.f923a)) {
            ((ArrayList) c0326t.f923a).remove(abstractComponentCallbacksC0423v);
        }
        abstractComponentCallbacksC0423v.f1367p = false;
        if (m983H(abstractComponentCallbacksC0423v)) {
            this.f1139D = true;
        }
        abstractComponentCallbacksC0423v.f1368q = true;
        m1009Z(abstractComponentCallbacksC0423v);
    }

    /* renamed from: S */
    public final void m1002S(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i < size) {
            if (!((C0398a) arrayList.get(i)).f1242o) {
                if (i2 != i) {
                    m987A(arrayList, arrayList2, i2, i);
                }
                i2 = i + 1;
                if (((Boolean) arrayList2.get(i)).booleanValue()) {
                    while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((C0398a) arrayList.get(i2)).f1242o) {
                        i2++;
                    }
                }
                m987A(arrayList, arrayList2, i, i2);
                i = i2 - 1;
            }
            i++;
        }
        if (i2 != size) {
            m987A(arrayList, arrayList2, i2, size);
        }
    }

    /* renamed from: T */
    public final void m1003T(Bundle bundle) {
        int i;
        C0043j c0043j;
        int i2;
        C0394W c0394w;
        Bundle bundle2;
        Bundle bundle3;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle3 = bundle.getBundle(str)) != null) {
                bundle3.setClassLoader(this.f1168t.f1385l.getClassLoader());
                this.f1159k.put(str.substring(7), bundle3);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle2 = bundle.getBundle(str2)) != null) {
                bundle2.setClassLoader(this.f1168t.f1385l.getClassLoader());
                hashMap.put(str2.substring(9), bundle2);
            }
        }
        C0326t c0326t = this.f1151c;
        HashMap hashMap2 = (HashMap) c0326t.f925c;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        C0388P c0388p = (C0388P) bundle.getParcelable("state");
        if (c0388p == null) {
            return;
        }
        HashMap hashMap3 = (HashMap) c0326t.f924b;
        hashMap3.clear();
        Iterator it = c0388p.f1175a.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            i = 2;
            c0043j = this.f1160l;
            if (!hasNext) {
                break;
            }
            Bundle bundle4 = (Bundle) ((HashMap) c0326t.f925c).remove((String) it.next());
            if (bundle4 != null) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) this.f1147L.f1185b.get(((C0392U) bundle4.getParcelable("state")).f1192b);
                if (abstractComponentCallbacksC0423v != null) {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + abstractComponentCallbacksC0423v);
                    }
                    c0394w = new C0394W(c0043j, c0326t, abstractComponentCallbacksC0423v, bundle4);
                } else {
                    c0394w = new C0394W(this.f1160l, this.f1151c, this.f1168t.f1385l.getClassLoader(), m991E(), bundle4);
                }
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = c0394w.f1209c;
                abstractComponentCallbacksC0423v2.f1358g = bundle4;
                abstractComponentCallbacksC0423v2.f1374w = this;
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + abstractComponentCallbacksC0423v2.f1361j + "): " + abstractComponentCallbacksC0423v2);
                }
                c0394w.m1059m(this.f1168t.f1385l.getClassLoader());
                c0326t.m916i(c0394w);
                c0394w.f1211e = this.f1167s;
            }
        }
        C0390S c0390s = this.f1147L;
        c0390s.getClass();
        Iterator it2 = new ArrayList(c0390s.f1185b.values()).iterator();
        while (it2.hasNext()) {
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = (AbstractComponentCallbacksC0423v) it2.next();
            if (hashMap3.get(abstractComponentCallbacksC0423v3.f1361j) == null) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + abstractComponentCallbacksC0423v3 + " that was not found in the set of active Fragments " + c0388p.f1175a);
                }
                this.f1147L.m1043e(abstractComponentCallbacksC0423v3);
                abstractComponentCallbacksC0423v3.f1374w = this;
                C0394W c0394w2 = new C0394W(c0043j, c0326t, abstractComponentCallbacksC0423v3);
                c0394w2.f1211e = 1;
                c0394w2.m1057k();
                abstractComponentCallbacksC0423v3.f1368q = true;
                c0394w2.m1057k();
            }
        }
        ArrayList<String> arrayList = c0388p.f1176b;
        ((ArrayList) c0326t.f923a).clear();
        if (arrayList != null) {
            for (String str3 : arrayList) {
                AbstractComponentCallbacksC0423v m910c = c0326t.m910c(str3);
                if (m910c == null) {
                    throw new IllegalStateException(AbstractC0062j.m161o("No instantiated fragment for (", str3, ")"));
                }
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + m910c);
                }
                c0326t.m908a(m910c);
            }
        }
        if (c0388p.f1177c != null) {
            this.f1152d = new ArrayList(c0388p.f1177c.length);
            int i3 = 0;
            while (true) {
                C0400b[] c0400bArr = c0388p.f1177c;
                if (i3 >= c0400bArr.length) {
                    break;
                }
                C0400b c0400b = c0400bArr[i3];
                c0400b.getClass();
                C0398a c0398a = new C0398a(this);
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    int[] iArr = c0400b.f1249a;
                    if (i4 >= iArr.length) {
                        break;
                    }
                    C0395X c0395x = new C0395X();
                    int i6 = i4 + 1;
                    c0395x.f1212a = iArr[i4];
                    if (Log.isLoggable("FragmentManager", i)) {
                        Log.v("FragmentManager", "Instantiate " + c0398a + " op #" + i5 + " base fragment #" + iArr[i6]);
                    }
                    c0395x.f1219h = EnumC0548m.values()[c0400b.f1251c[i5]];
                    c0395x.f1220i = EnumC0548m.values()[c0400b.f1252d[i5]];
                    int i7 = i4 + 2;
                    c0395x.f1214c = iArr[i6] != 0;
                    int i8 = iArr[i7];
                    c0395x.f1215d = i8;
                    int i9 = iArr[i4 + 3];
                    c0395x.f1216e = i9;
                    int i10 = i4 + 5;
                    int i11 = iArr[i4 + 4];
                    c0395x.f1217f = i11;
                    i4 += 6;
                    int i12 = iArr[i10];
                    c0395x.f1218g = i12;
                    c0398a.f1229b = i8;
                    c0398a.f1230c = i9;
                    c0398a.f1231d = i11;
                    c0398a.f1232e = i12;
                    c0398a.m1072b(c0395x);
                    i5++;
                    i = 2;
                }
                c0398a.f1233f = c0400b.f1253e;
                c0398a.f1235h = c0400b.f1254f;
                c0398a.f1234g = true;
                c0398a.f1236i = c0400b.f1256h;
                c0398a.f1237j = c0400b.f1257i;
                c0398a.f1238k = c0400b.f1258j;
                c0398a.f1239l = c0400b.f1259k;
                c0398a.f1240m = c0400b.f1260l;
                c0398a.f1241n = c0400b.f1261m;
                c0398a.f1242o = c0400b.f1262n;
                c0398a.f1245r = c0400b.f1255g;
                int i13 = 0;
                while (true) {
                    ArrayList arrayList2 = c0400b.f1250b;
                    if (i13 >= arrayList2.size()) {
                        break;
                    }
                    String str4 = (String) arrayList2.get(i13);
                    if (str4 != null) {
                        ((C0395X) c0398a.f1228a.get(i13)).f1213b = c0326t.m910c(str4);
                    }
                    i13++;
                }
                c0398a.m1073c(1);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "restoreAllState: back stack #" + i3 + " (index " + c0398a.f1245r + "): " + c0398a);
                    PrintWriter printWriter = new PrintWriter(new C0397Z());
                    c0398a.m1076f("  ", printWriter, false);
                    printWriter.close();
                }
                this.f1152d.add(c0398a);
                i3++;
                i = 2;
            }
            i2 = 0;
        } else {
            i2 = 0;
            this.f1152d = null;
        }
        this.f1157i.set(c0388p.f1178d);
        String str5 = c0388p.f1179e;
        if (str5 != null) {
            AbstractComponentCallbacksC0423v m910c2 = c0326t.m910c(str5);
            this.f1171w = m910c2;
            m1029q(m910c2);
        }
        ArrayList arrayList3 = c0388p.f1180f;
        if (arrayList3 != null) {
            for (int i14 = i2; i14 < arrayList3.size(); i14++) {
                this.f1158j.put((String) arrayList3.get(i14), (C0402c) c0388p.f1181g.get(i14));
            }
        }
        this.f1138C = new ArrayDeque(c0388p.f1182h);
    }

    /* renamed from: U */
    public final Bundle m1004U() {
        int i;
        ArrayList arrayList;
        C0400b[] c0400bArr;
        int size;
        Bundle bundle = new Bundle();
        Iterator it = m1017e().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0412k c0412k = (C0412k) it.next();
            if (c0412k.f1298e) {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                c0412k.f1298e = false;
                c0412k.m1096d();
            }
        }
        Iterator it2 = m1017e().iterator();
        while (it2.hasNext()) {
            ((C0412k) it2.next()).m1098f();
        }
        m1037y(true);
        this.f1140E = true;
        this.f1147L.f1190g = true;
        C0326t c0326t = this.f1151c;
        c0326t.getClass();
        HashMap hashMap = (HashMap) c0326t.f924b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (C0394W c0394w : hashMap.values()) {
            if (c0394w != null) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
                arrayList2.add(abstractComponentCallbacksC0423v.f1361j);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "Saved state of " + abstractComponentCallbacksC0423v + ": " + abstractComponentCallbacksC0423v.f1358g);
                }
            }
        }
        HashMap hashMap2 = (HashMap) this.f1151c.f925c;
        if (!hashMap2.isEmpty()) {
            C0326t c0326t2 = this.f1151c;
            synchronized (((ArrayList) c0326t2.f923a)) {
                try {
                    if (((ArrayList) c0326t2.f923a).isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(((ArrayList) c0326t2.f923a).size());
                        Iterator it3 = ((ArrayList) c0326t2.f923a).iterator();
                        while (it3.hasNext()) {
                            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = (AbstractComponentCallbacksC0423v) it3.next();
                            arrayList.add(abstractComponentCallbacksC0423v2.f1361j);
                            if (Log.isLoggable("FragmentManager", 2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + abstractComponentCallbacksC0423v2.f1361j + "): " + abstractComponentCallbacksC0423v2);
                            }
                        }
                    }
                } finally {
                }
            }
            ArrayList arrayList3 = this.f1152d;
            if (arrayList3 == null || (size = arrayList3.size()) <= 0) {
                c0400bArr = null;
            } else {
                c0400bArr = new C0400b[size];
                for (i = 0; i < size; i++) {
                    c0400bArr[i] = new C0400b((C0398a) this.f1152d.get(i));
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "saveAllState: adding back stack #" + i + ": " + this.f1152d.get(i));
                    }
                }
            }
            C0388P c0388p = new C0388P();
            c0388p.f1179e = null;
            ArrayList arrayList4 = new ArrayList();
            c0388p.f1180f = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            c0388p.f1181g = arrayList5;
            c0388p.f1175a = arrayList2;
            c0388p.f1176b = arrayList;
            c0388p.f1177c = c0400bArr;
            c0388p.f1178d = this.f1157i.get();
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = this.f1171w;
            if (abstractComponentCallbacksC0423v3 != null) {
                c0388p.f1179e = abstractComponentCallbacksC0423v3.f1361j;
            }
            arrayList4.addAll(this.f1158j.keySet());
            arrayList5.addAll(this.f1158j.values());
            c0388p.f1182h = new ArrayList(this.f1138C);
            bundle.putParcelable("state", c0388p);
            for (String str : this.f1159k.keySet()) {
                bundle.putBundle(AbstractC1561o.m4299c("result_", str), (Bundle) this.f1159k.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(AbstractC1561o.m4299c("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        } else if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* renamed from: V */
    public final void m1005V() {
        synchronized (this.f1149a) {
            try {
                if (this.f1149a.size() == 1) {
                    this.f1168t.f1386m.removeCallbacks(this.f1148M);
                    this.f1168t.f1386m.post(this.f1148M);
                    m1016d0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: W */
    public final void m1006W(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, boolean z2) {
        ViewGroup m990D = m990D(abstractComponentCallbacksC0423v);
        if (m990D == null || !(m990D instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) m990D).setDrawDisappearingViewsLast(!z2);
    }

    /* renamed from: X */
    public final void m1007X(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, EnumC0548m enumC0548m) {
        if (abstractComponentCallbacksC0423v.equals(this.f1151c.m910c(abstractComponentCallbacksC0423v.f1361j)) && (abstractComponentCallbacksC0423v.f1375x == null || abstractComponentCallbacksC0423v.f1374w == this)) {
            abstractComponentCallbacksC0423v.f1350R = enumC0548m;
            return;
        }
        throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0423v + " is not an active fragment of FragmentManager " + this);
    }

    /* renamed from: Y */
    public final void m1008Y(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (abstractComponentCallbacksC0423v != null) {
            if (!abstractComponentCallbacksC0423v.equals(this.f1151c.m910c(abstractComponentCallbacksC0423v.f1361j)) || (abstractComponentCallbacksC0423v.f1375x != null && abstractComponentCallbacksC0423v.f1374w != this)) {
                throw new IllegalArgumentException("Fragment " + abstractComponentCallbacksC0423v + " is not an active fragment of FragmentManager " + this);
            }
        }
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = this.f1171w;
        this.f1171w = abstractComponentCallbacksC0423v;
        m1029q(abstractComponentCallbacksC0423v2);
        m1029q(this.f1171w);
    }

    /* renamed from: Z */
    public final void m1009Z(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        ViewGroup m990D = m990D(abstractComponentCallbacksC0423v);
        if (m990D != null) {
            C0420s c0420s = abstractComponentCallbacksC0423v.f1345M;
            if ((c0420s == null ? 0 : c0420s.f1324e) + (c0420s == null ? 0 : c0420s.f1323d) + (c0420s == null ? 0 : c0420s.f1322c) + (c0420s == null ? 0 : c0420s.f1321b) > 0) {
                if (m990D.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    m990D.setTag(R.id.visible_removing_fragment_view_tag, abstractComponentCallbacksC0423v);
                }
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = (AbstractComponentCallbacksC0423v) m990D.getTag(R.id.visible_removing_fragment_view_tag);
                C0420s c0420s2 = abstractComponentCallbacksC0423v.f1345M;
                boolean z2 = c0420s2 != null ? c0420s2.f1320a : false;
                if (abstractComponentCallbacksC0423v2.f1345M == null) {
                    return;
                }
                abstractComponentCallbacksC0423v2.m1123f().f1320a = z2;
            }
        }
    }

    /* renamed from: a */
    public final C0394W m1010a(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        String str = abstractComponentCallbacksC0423v.f1349Q;
        if (str != null) {
            AbstractC0434d.m1144c(abstractComponentCallbacksC0423v, str);
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "add: " + abstractComponentCallbacksC0423v);
        }
        C0394W m1018f = m1018f(abstractComponentCallbacksC0423v);
        abstractComponentCallbacksC0423v.f1374w = this;
        C0326t c0326t = this.f1151c;
        c0326t.m916i(m1018f);
        if (!abstractComponentCallbacksC0423v.f1337E) {
            c0326t.m908a(abstractComponentCallbacksC0423v);
            abstractComponentCallbacksC0423v.f1368q = false;
            if (abstractComponentCallbacksC0423v.f1342J == null) {
                abstractComponentCallbacksC0423v.f1346N = false;
            }
            if (m983H(abstractComponentCallbacksC0423v)) {
                this.f1139D = true;
            }
        }
        return m1018f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public final void m1011b(C0427z c0427z, AbstractC1680h abstractC1680h, AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (this.f1168t != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f1168t = c0427z;
        this.f1169u = abstractC1680h;
        this.f1170v = abstractComponentCallbacksC0423v;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f1161m;
        if (abstractComponentCallbacksC0423v != 0) {
            copyOnWriteArrayList.add(new C0382J(abstractComponentCallbacksC0423v));
        } else if (c0427z != null) {
            copyOnWriteArrayList.add(c0427z);
        }
        if (this.f1170v != null) {
            m1016d0();
        }
        if (c0427z != null) {
            C0457C m1187h = c0427z.f1388o.m1187h();
            this.f1155g = m1187h;
            C0427z c0427z2 = abstractComponentCallbacksC0423v != 0 ? abstractComponentCallbacksC0423v : c0427z;
            m1187h.getClass();
            C0379G c0379g = this.f1156h;
            AbstractC1461d.m3494e("onBackPressedCallback", c0379g);
            C0555t mo1068d = c0427z2.mo1068d();
            if (mo1068d.f2001c != EnumC0548m.f1990a) {
                c0379g.f1124b.add(new C0486z(m1187h, mo1068d, c0379g));
                m1187h.m1170d();
                c0379g.f1125c = new C0456B(0, m1187h);
            }
        }
        if (abstractComponentCallbacksC0423v != 0) {
            C0390S c0390s = abstractComponentCallbacksC0423v.f1374w.f1147L;
            HashMap hashMap = c0390s.f1186c;
            C0390S c0390s2 = (C0390S) hashMap.get(abstractComponentCallbacksC0423v.f1361j);
            if (c0390s2 == null) {
                c0390s2 = new C0390S(c0390s.f1188e);
                hashMap.put(abstractComponentCallbacksC0423v.f1361j, c0390s2);
            }
            this.f1147L = c0390s2;
        } else if (c0427z != null) {
            this.f1147L = (C0390S) new C0639g(c0427z.f1388o.mo1067c(), C0390S.f1184h).m1881w(C0390S.class);
        } else {
            this.f1147L = new C0390S(false);
        }
        this.f1147L.f1190g = m995L();
        this.f1151c.f926d = this.f1147L;
        C0427z c0427z3 = this.f1168t;
        if (c0427z3 != null && abstractComponentCallbacksC0423v == 0) {
            C0891d mo1066b = c0427z3.mo1066b();
            mo1066b.m2465e("android:support:fragments", new C0424w(2, this));
            Bundle m2463c = mo1066b.m2463c("android:support:fragments");
            if (m2463c != null) {
                m1003T(m2463c);
            }
        }
        C0427z c0427z4 = this.f1168t;
        if (c0427z4 != null) {
            AbstractActivityC0870i abstractActivityC0870i = c0427z4.f1388o;
            String m4299c = AbstractC1561o.m4299c("FragmentManager:", abstractComponentCallbacksC0423v != 0 ? AbstractC0062j.m162p(new StringBuilder(), abstractComponentCallbacksC0423v.f1361j, ":") : "");
            String m160n = AbstractC0062j.m160n(m4299c, "StartActivityForResult");
            C0383K c0383k = new C0383K(2);
            C0378F c0378f = new C0378F(this, 1);
            C0470j c0470j = abstractActivityC0870i.f1509n;
            this.f1174z = c0470j.m1181c(m160n, c0383k, c0378f);
            this.f1136A = c0470j.m1181c(AbstractC0062j.m160n(m4299c, "StartIntentSenderForResult"), new C0383K(0), new C0378F(this, 2));
            this.f1137B = c0470j.m1181c(AbstractC0062j.m160n(m4299c, "RequestPermissions"), new C0383K(1), new C0378F(this, 0));
        }
        C0427z c0427z5 = this.f1168t;
        if (c0427z5 != null) {
            c0427z5.f1388o.m1185f(this.f1162n);
        }
        C0427z c0427z6 = this.f1168t;
        if (c0427z6 != null) {
            AbstractActivityC0870i abstractActivityC0870i2 = c0427z6.f1388o;
            C0377E c0377e = this.f1163o;
            abstractActivityC0870i2.getClass();
            AbstractC1461d.m3494e("listener", c0377e);
            abstractActivityC0870i2.f1511p.add(c0377e);
        }
        C0427z c0427z7 = this.f1168t;
        if (c0427z7 != null) {
            AbstractActivityC0870i abstractActivityC0870i3 = c0427z7.f1388o;
            C0377E c0377e2 = this.f1164p;
            abstractActivityC0870i3.getClass();
            AbstractC1461d.m3494e("listener", c0377e2);
            abstractActivityC0870i3.f1513r.add(c0377e2);
        }
        C0427z c0427z8 = this.f1168t;
        if (c0427z8 != null) {
            AbstractActivityC0870i abstractActivityC0870i4 = c0427z8.f1388o;
            C0377E c0377e3 = this.f1165q;
            abstractActivityC0870i4.getClass();
            AbstractC1461d.m3494e("listener", c0377e3);
            abstractActivityC0870i4.f1514s.add(c0377e3);
        }
        C0427z c0427z9 = this.f1168t;
        if (c0427z9 == null || abstractComponentCallbacksC0423v != 0) {
            return;
        }
        AbstractActivityC0870i abstractActivityC0870i5 = c0427z9.f1388o;
        C0380H c0380h = this.f1166r;
        abstractActivityC0870i5.getClass();
        AbstractC1461d.m3494e("provider", c0380h);
        C0198k c0198k = abstractActivityC0870i5.f1503h;
        ((CopyOnWriteArrayList) c0198k.f534c).add(c0380h);
        ((Runnable) c0198k.f533b).run();
    }

    /* renamed from: b0 */
    public final void m1012b0() {
        Iterator it = this.f1151c.m913f().iterator();
        while (it.hasNext()) {
            C0394W c0394w = (C0394W) it.next();
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
            if (abstractComponentCallbacksC0423v.f1343K) {
                if (this.f1150b) {
                    this.f1143H = true;
                } else {
                    abstractComponentCallbacksC0423v.f1343K = false;
                    c0394w.m1057k();
                }
            }
        }
    }

    /* renamed from: c */
    public final void m1013c(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "attach: " + abstractComponentCallbacksC0423v);
        }
        if (abstractComponentCallbacksC0423v.f1337E) {
            abstractComponentCallbacksC0423v.f1337E = false;
            if (abstractComponentCallbacksC0423v.f1367p) {
                return;
            }
            this.f1151c.m908a(abstractComponentCallbacksC0423v);
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "add from attach: " + abstractComponentCallbacksC0423v);
            }
            if (m983H(abstractComponentCallbacksC0423v)) {
                this.f1139D = true;
            }
        }
    }

    /* renamed from: c0 */
    public final void m1014c0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new C0397Z());
        C0427z c0427z = this.f1168t;
        if (c0427z == null) {
            try {
                m1034v("  ", null, printWriter, new String[0]);
                throw illegalStateException;
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
                throw illegalStateException;
            }
        }
        try {
            c0427z.f1388o.dump("  ", null, printWriter, new String[0]);
            throw illegalStateException;
        } catch (Exception e3) {
            Log.e("FragmentManager", "Failed dumping state", e3);
            throw illegalStateException;
        }
    }

    /* renamed from: d */
    public final void m1015d() {
        this.f1150b = false;
        this.f1145J.clear();
        this.f1144I.clear();
    }

    /* renamed from: d0 */
    public final void m1016d0() {
        synchronized (this.f1149a) {
            try {
                if (!this.f1149a.isEmpty()) {
                    C0379G c0379g = this.f1156h;
                    c0379g.f1123a = true;
                    C0456B c0456b = c0379g.f1125c;
                    if (c0456b != null) {
                        c0456b.mo1164a();
                    }
                    return;
                }
                C0379G c0379g2 = this.f1156h;
                ArrayList arrayList = this.f1152d;
                c0379g2.f1123a = (arrayList != null ? arrayList.size() : 0) > 0 && m985K(this.f1170v);
                C0456B c0456b2 = c0379g2.f1125c;
                if (c0456b2 != null) {
                    c0456b2.mo1164a();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public final HashSet m1017e() {
        C0412k c0412k;
        HashSet hashSet = new HashSet();
        Iterator it = this.f1151c.m913f().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = ((C0394W) it.next()).f1209c.f1341I;
            if (viewGroup != null) {
                AbstractC1461d.m3494e("factory", m992F());
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof C0412k) {
                    c0412k = (C0412k) tag;
                } else {
                    c0412k = new C0412k(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, c0412k);
                }
                hashSet.add(c0412k);
            }
        }
        return hashSet;
    }

    /* renamed from: f */
    public final C0394W m1018f(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        String str = abstractComponentCallbacksC0423v.f1361j;
        C0326t c0326t = this.f1151c;
        C0394W c0394w = (C0394W) ((HashMap) c0326t.f924b).get(str);
        if (c0394w != null) {
            return c0394w;
        }
        C0394W c0394w2 = new C0394W(this.f1160l, c0326t, abstractComponentCallbacksC0423v);
        c0394w2.m1059m(this.f1168t.f1385l.getClassLoader());
        c0394w2.f1211e = this.f1167s;
        return c0394w2;
    }

    /* renamed from: g */
    public final void m1019g(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "detach: " + abstractComponentCallbacksC0423v);
        }
        if (abstractComponentCallbacksC0423v.f1337E) {
            return;
        }
        abstractComponentCallbacksC0423v.f1337E = true;
        if (abstractComponentCallbacksC0423v.f1367p) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "remove from detach: " + abstractComponentCallbacksC0423v);
            }
            C0326t c0326t = this.f1151c;
            synchronized (((ArrayList) c0326t.f923a)) {
                ((ArrayList) c0326t.f923a).remove(abstractComponentCallbacksC0423v);
            }
            abstractComponentCallbacksC0423v.f1367p = false;
            if (m983H(abstractComponentCallbacksC0423v)) {
                this.f1139D = true;
            }
            m1009Z(abstractComponentCallbacksC0423v);
        }
    }

    /* renamed from: h */
    public final void m1020h(boolean z2) {
        if (z2 && this.f1168t != null) {
            m1014c0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null) {
                abstractComponentCallbacksC0423v.f1340H = true;
                if (z2) {
                    abstractComponentCallbacksC0423v.f1376y.m1020h(true);
                }
            }
        }
    }

    /* renamed from: i */
    public final boolean m1021i() {
        if (this.f1167s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null) {
                if (!abstractComponentCallbacksC0423v.f1336D ? abstractComponentCallbacksC0423v.f1376y.m1021i() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m1022j() {
        if (this.f1167s < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z2 = false;
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null && m984J(abstractComponentCallbacksC0423v)) {
                if (!abstractComponentCallbacksC0423v.f1336D ? abstractComponentCallbacksC0423v.f1376y.m1022j() : false) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(abstractComponentCallbacksC0423v);
                    z2 = true;
                }
            }
        }
        if (this.f1153e != null) {
            for (int i = 0; i < this.f1153e.size(); i++) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = (AbstractComponentCallbacksC0423v) this.f1153e.get(i);
                if (arrayList == null || !arrayList.contains(abstractComponentCallbacksC0423v2)) {
                    abstractComponentCallbacksC0423v2.getClass();
                }
            }
        }
        this.f1153e = arrayList;
        return z2;
    }

    /* renamed from: k */
    public final void m1023k() {
        boolean z2 = true;
        this.f1142G = true;
        m1037y(true);
        Iterator it = m1017e().iterator();
        while (it.hasNext()) {
            ((C0412k) it.next()).m1098f();
        }
        C0427z c0427z = this.f1168t;
        C0326t c0326t = this.f1151c;
        if (c0427z != null) {
            z2 = ((C0390S) c0326t.f926d).f1189f;
        } else {
            AbstractActivityC0870i abstractActivityC0870i = c0427z.f1385l;
            if (abstractActivityC0870i != null) {
                z2 = true ^ abstractActivityC0870i.isChangingConfigurations();
            }
        }
        if (z2) {
            Iterator it2 = this.f1158j.values().iterator();
            while (it2.hasNext()) {
                for (String str : ((C0402c) it2.next()).f1271a) {
                    C0390S c0390s = (C0390S) c0326t.f926d;
                    c0390s.getClass();
                    if (Log.isLoggable("FragmentManager", 3)) {
                        Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
                    }
                    c0390s.m1042d(str);
                }
            }
        }
        m1032t(-1);
        C0427z c0427z2 = this.f1168t;
        if (c0427z2 != null) {
            AbstractActivityC0870i abstractActivityC0870i2 = c0427z2.f1388o;
            C0377E c0377e = this.f1163o;
            abstractActivityC0870i2.getClass();
            AbstractC1461d.m3494e("listener", c0377e);
            abstractActivityC0870i2.f1511p.remove(c0377e);
        }
        C0427z c0427z3 = this.f1168t;
        if (c0427z3 != null) {
            AbstractActivityC0870i abstractActivityC0870i3 = c0427z3.f1388o;
            C0377E c0377e2 = this.f1162n;
            abstractActivityC0870i3.getClass();
            AbstractC1461d.m3494e("listener", c0377e2);
            abstractActivityC0870i3.f1510o.remove(c0377e2);
        }
        C0427z c0427z4 = this.f1168t;
        if (c0427z4 != null) {
            AbstractActivityC0870i abstractActivityC0870i4 = c0427z4.f1388o;
            C0377E c0377e3 = this.f1164p;
            abstractActivityC0870i4.getClass();
            AbstractC1461d.m3494e("listener", c0377e3);
            abstractActivityC0870i4.f1513r.remove(c0377e3);
        }
        C0427z c0427z5 = this.f1168t;
        if (c0427z5 != null) {
            AbstractActivityC0870i abstractActivityC0870i5 = c0427z5.f1388o;
            C0377E c0377e4 = this.f1165q;
            abstractActivityC0870i5.getClass();
            AbstractC1461d.m3494e("listener", c0377e4);
            abstractActivityC0870i5.f1514s.remove(c0377e4);
        }
        C0427z c0427z6 = this.f1168t;
        if (c0427z6 != null && this.f1170v == null) {
            AbstractActivityC0870i abstractActivityC0870i6 = c0427z6.f1388o;
            C0380H c0380h = this.f1166r;
            abstractActivityC0870i6.getClass();
            AbstractC1461d.m3494e("provider", c0380h);
            C0198k c0198k = abstractActivityC0870i6.f1503h;
            ((CopyOnWriteArrayList) c0198k.f534c).remove(c0380h);
            if (((HashMap) c0198k.f535d).remove(c0380h) != null) {
                throw new ClassCastException();
            }
            ((Runnable) c0198k.f533b).run();
        }
        this.f1168t = null;
        this.f1169u = null;
        this.f1170v = null;
        if (this.f1155g != null) {
            Iterator it3 = this.f1156h.f1124b.iterator();
            while (it3.hasNext()) {
                ((InterfaceC0463c) it3.next()).cancel();
            }
            this.f1155g = null;
        }
        C0574h c0574h = this.f1174z;
        if (c0574h != null) {
            c0574h.m1577Z();
            this.f1136A.m1577Z();
            this.f1137B.m1577Z();
        }
    }

    /* renamed from: l */
    public final void m1024l(boolean z2) {
        if (z2 && this.f1168t != null) {
            m1014c0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null) {
                abstractComponentCallbacksC0423v.f1340H = true;
                if (z2) {
                    abstractComponentCallbacksC0423v.f1376y.m1024l(true);
                }
            }
        }
    }

    /* renamed from: m */
    public final void m1025m(boolean z2, boolean z3) {
        if (z3 && this.f1168t != null) {
            m1014c0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null && z3) {
                abstractComponentCallbacksC0423v.f1376y.m1025m(z2, true);
            }
        }
    }

    /* renamed from: n */
    public final void m1026n() {
        Iterator it = this.f1151c.m914g().iterator();
        while (it.hasNext()) {
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) it.next();
            if (abstractComponentCallbacksC0423v != null) {
                abstractComponentCallbacksC0423v.m1135r();
                abstractComponentCallbacksC0423v.f1376y.m1026n();
            }
        }
    }

    /* renamed from: o */
    public final boolean m1027o() {
        if (this.f1167s < 1) {
            return false;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null) {
                if (!abstractComponentCallbacksC0423v.f1336D ? abstractComponentCallbacksC0423v.f1376y.m1027o() : false) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: p */
    public final void m1028p() {
        if (this.f1167s < 1) {
            return;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null && !abstractComponentCallbacksC0423v.f1336D) {
                abstractComponentCallbacksC0423v.f1376y.m1028p();
            }
        }
    }

    /* renamed from: q */
    public final void m1029q(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (abstractComponentCallbacksC0423v != null) {
            if (abstractComponentCallbacksC0423v.equals(this.f1151c.m910c(abstractComponentCallbacksC0423v.f1361j))) {
                abstractComponentCallbacksC0423v.f1374w.getClass();
                boolean m985K = m985K(abstractComponentCallbacksC0423v);
                Boolean bool = abstractComponentCallbacksC0423v.f1366o;
                if (bool == null || bool.booleanValue() != m985K) {
                    abstractComponentCallbacksC0423v.f1366o = Boolean.valueOf(m985K);
                    C0387O c0387o = abstractComponentCallbacksC0423v.f1376y;
                    c0387o.m1016d0();
                    c0387o.m1029q(c0387o.f1171w);
                }
            }
        }
    }

    /* renamed from: r */
    public final void m1030r(boolean z2, boolean z3) {
        if (z3 && this.f1168t != null) {
            m1014c0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null && z3) {
                abstractComponentCallbacksC0423v.f1376y.m1030r(z2, true);
            }
        }
    }

    /* renamed from: s */
    public final boolean m1031s() {
        if (this.f1167s < 1) {
            return false;
        }
        boolean z2 = false;
        for (AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v : this.f1151c.m915h()) {
            if (abstractComponentCallbacksC0423v != null && m984J(abstractComponentCallbacksC0423v)) {
                if (!abstractComponentCallbacksC0423v.f1336D ? abstractComponentCallbacksC0423v.f1376y.m1031s() : false) {
                    z2 = true;
                }
            }
        }
        return z2;
    }

    /* renamed from: t */
    public final void m1032t(int i) {
        try {
            this.f1150b = true;
            for (C0394W c0394w : ((HashMap) this.f1151c.f924b).values()) {
                if (c0394w != null) {
                    c0394w.f1211e = i;
                }
            }
            m996M(i, false);
            Iterator it = m1017e().iterator();
            while (it.hasNext()) {
                ((C0412k) it.next()).m1098f();
            }
            this.f1150b = false;
            m1037y(true);
        } catch (Throwable th) {
            this.f1150b = false;
            throw th;
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1170v;
        if (abstractComponentCallbacksC0423v != null) {
            sb.append(abstractComponentCallbacksC0423v.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f1170v)));
            sb.append("}");
        } else {
            C0427z c0427z = this.f1168t;
            if (c0427z != null) {
                sb.append(c0427z.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f1168t)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    /* renamed from: u */
    public final void m1033u() {
        if (this.f1143H) {
            this.f1143H = false;
            m1012b0();
        }
    }

    /* renamed from: v */
    public final void m1034v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        int size2;
        String str2;
        String m160n = AbstractC0062j.m160n(str, "    ");
        C0326t c0326t = this.f1151c;
        c0326t.getClass();
        String str3 = str + "    ";
        HashMap hashMap = (HashMap) c0326t.f924b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (C0394W c0394w : hashMap.values()) {
                printWriter.print(str);
                if (c0394w != null) {
                    AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0394w.f1209c;
                    printWriter.println(abstractComponentCallbacksC0423v);
                    abstractComponentCallbacksC0423v.getClass();
                    printWriter.print(str3);
                    printWriter.print("mFragmentId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0423v.f1333A));
                    printWriter.print(" mContainerId=#");
                    printWriter.print(Integer.toHexString(abstractComponentCallbacksC0423v.f1334B));
                    printWriter.print(" mTag=");
                    printWriter.println(abstractComponentCallbacksC0423v.f1335C);
                    printWriter.print(str3);
                    printWriter.print("mState=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1357f);
                    printWriter.print(" mWho=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1361j);
                    printWriter.print(" mBackStackNesting=");
                    printWriter.println(abstractComponentCallbacksC0423v.f1373v);
                    printWriter.print(str3);
                    printWriter.print("mAdded=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1367p);
                    printWriter.print(" mRemoving=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1368q);
                    printWriter.print(" mFromLayout=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1369r);
                    printWriter.print(" mInLayout=");
                    printWriter.println(abstractComponentCallbacksC0423v.f1370s);
                    printWriter.print(str3);
                    printWriter.print("mHidden=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1336D);
                    printWriter.print(" mDetached=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1337E);
                    printWriter.print(" mMenuVisible=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1339G);
                    printWriter.print(" mHasMenu=");
                    printWriter.println(false);
                    printWriter.print(str3);
                    printWriter.print("mRetainInstance=");
                    printWriter.print(abstractComponentCallbacksC0423v.f1338F);
                    printWriter.print(" mUserVisibleHint=");
                    printWriter.println(abstractComponentCallbacksC0423v.f1344L);
                    if (abstractComponentCallbacksC0423v.f1374w != null) {
                        printWriter.print(str3);
                        printWriter.print("mFragmentManager=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1374w);
                    }
                    if (abstractComponentCallbacksC0423v.f1375x != null) {
                        printWriter.print(str3);
                        printWriter.print("mHost=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1375x);
                    }
                    if (abstractComponentCallbacksC0423v.f1377z != null) {
                        printWriter.print(str3);
                        printWriter.print("mParentFragment=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1377z);
                    }
                    if (abstractComponentCallbacksC0423v.f1362k != null) {
                        printWriter.print(str3);
                        printWriter.print("mArguments=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1362k);
                    }
                    if (abstractComponentCallbacksC0423v.f1358g != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedFragmentState=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1358g);
                    }
                    if (abstractComponentCallbacksC0423v.f1359h != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewState=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1359h);
                    }
                    if (abstractComponentCallbacksC0423v.f1360i != null) {
                        printWriter.print(str3);
                        printWriter.print("mSavedViewRegistryState=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1360i);
                    }
                    Object obj = abstractComponentCallbacksC0423v.f1363l;
                    if (obj == null) {
                        C0387O c0387o = abstractComponentCallbacksC0423v.f1374w;
                        obj = (c0387o == null || (str2 = abstractComponentCallbacksC0423v.f1364m) == null) ? null : c0387o.f1151c.m910c(str2);
                    }
                    if (obj != null) {
                        printWriter.print(str3);
                        printWriter.print("mTarget=");
                        printWriter.print(obj);
                        printWriter.print(" mTargetRequestCode=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1365n);
                    }
                    printWriter.print(str3);
                    printWriter.print("mPopDirection=");
                    C0420s c0420s = abstractComponentCallbacksC0423v.f1345M;
                    printWriter.println(c0420s == null ? false : c0420s.f1320a);
                    C0420s c0420s2 = abstractComponentCallbacksC0423v.f1345M;
                    if ((c0420s2 == null ? 0 : c0420s2.f1321b) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getEnterAnim=");
                        C0420s c0420s3 = abstractComponentCallbacksC0423v.f1345M;
                        printWriter.println(c0420s3 == null ? 0 : c0420s3.f1321b);
                    }
                    C0420s c0420s4 = abstractComponentCallbacksC0423v.f1345M;
                    if ((c0420s4 == null ? 0 : c0420s4.f1322c) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getExitAnim=");
                        C0420s c0420s5 = abstractComponentCallbacksC0423v.f1345M;
                        printWriter.println(c0420s5 == null ? 0 : c0420s5.f1322c);
                    }
                    C0420s c0420s6 = abstractComponentCallbacksC0423v.f1345M;
                    if ((c0420s6 == null ? 0 : c0420s6.f1323d) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopEnterAnim=");
                        C0420s c0420s7 = abstractComponentCallbacksC0423v.f1345M;
                        printWriter.println(c0420s7 == null ? 0 : c0420s7.f1323d);
                    }
                    C0420s c0420s8 = abstractComponentCallbacksC0423v.f1345M;
                    if ((c0420s8 == null ? 0 : c0420s8.f1324e) != 0) {
                        printWriter.print(str3);
                        printWriter.print("getPopExitAnim=");
                        C0420s c0420s9 = abstractComponentCallbacksC0423v.f1345M;
                        printWriter.println(c0420s9 == null ? 0 : c0420s9.f1324e);
                    }
                    if (abstractComponentCallbacksC0423v.f1341I != null) {
                        printWriter.print(str3);
                        printWriter.print("mContainer=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1341I);
                    }
                    if (abstractComponentCallbacksC0423v.f1342J != null) {
                        printWriter.print(str3);
                        printWriter.print("mView=");
                        printWriter.println(abstractComponentCallbacksC0423v.f1342J);
                    }
                    if (abstractComponentCallbacksC0423v.m1126i() != null) {
                        C1202l c1202l = ((C0576a) new C0639g(abstractComponentCallbacksC0423v.mo1067c(), C0576a.f2191c).m1881w(C0576a.class)).f2192b;
                        if (c1202l.f5422c > 0) {
                            printWriter.print(str3);
                            printWriter.println("Loaders:");
                            if (c1202l.f5422c > 0) {
                                if (c1202l.f5421b[0] != null) {
                                    throw new ClassCastException();
                                }
                                printWriter.print(str3);
                                printWriter.print("  #");
                                printWriter.print(c1202l.f5420a[0]);
                                printWriter.print(": ");
                                throw null;
                            }
                        }
                    }
                    printWriter.print(str3);
                    printWriter.println("Child " + abstractComponentCallbacksC0423v.f1376y + ":");
                    abstractComponentCallbacksC0423v.f1376y.m1034v(AbstractC0062j.m160n(str3, "  "), fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        ArrayList arrayList = (ArrayList) c0326t.f923a;
        int size3 = arrayList.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size3; i++) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v2 = (AbstractComponentCallbacksC0423v) arrayList.get(i);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0423v2.toString());
            }
        }
        ArrayList arrayList2 = this.f1153e;
        if (arrayList2 != null && (size2 = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v3 = (AbstractComponentCallbacksC0423v) this.f1153e.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(abstractComponentCallbacksC0423v3.toString());
            }
        }
        ArrayList arrayList3 = this.f1152d;
        if (arrayList3 != null && (size = arrayList3.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0398a c0398a = (C0398a) this.f1152d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0398a.toString());
                c0398a.m1076f(m160n, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f1157i.get());
        synchronized (this.f1149a) {
            try {
                int size4 = this.f1149a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        Object obj2 = (InterfaceC0385M) this.f1149a.get(i4);
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println(obj2);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f1168t);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f1169u);
        if (this.f1170v != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f1170v);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f1167s);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f1140E);
        printWriter.print(" mStopped=");
        printWriter.print(this.f1141F);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f1142G);
        if (this.f1139D) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f1139D);
        }
    }

    /* renamed from: w */
    public final void m1035w(InterfaceC0385M interfaceC0385M, boolean z2) {
        if (!z2) {
            if (this.f1168t == null) {
                if (!this.f1142G) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            if (m995L()) {
                throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
            }
        }
        synchronized (this.f1149a) {
            try {
                if (this.f1168t == null) {
                    if (!z2) {
                        throw new IllegalStateException("Activity has been destroyed");
                    }
                } else {
                    this.f1149a.add(interfaceC0385M);
                    m1005V();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: x */
    public final void m1036x(boolean z2) {
        if (this.f1150b) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f1168t == null) {
            if (!this.f1142G) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f1168t.f1386m.getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2 && m995L()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (this.f1144I == null) {
            this.f1144I = new ArrayList();
            this.f1145J = new ArrayList();
        }
    }

    /* renamed from: y */
    public final boolean m1037y(boolean z2) {
        boolean z3;
        m1036x(z2);
        boolean z4 = false;
        while (true) {
            ArrayList arrayList = this.f1144I;
            ArrayList arrayList2 = this.f1145J;
            synchronized (this.f1149a) {
                if (this.f1149a.isEmpty()) {
                    z3 = false;
                } else {
                    try {
                        int size = this.f1149a.size();
                        z3 = false;
                        for (int i = 0; i < size; i++) {
                            z3 |= ((InterfaceC0385M) this.f1149a.get(i)).mo982a(arrayList, arrayList2);
                        }
                    } finally {
                    }
                }
            }
            if (!z3) {
                m1016d0();
                m1033u();
                ((HashMap) this.f1151c.f924b).values().removeAll(Collections.singleton(null));
                return z4;
            }
            z4 = true;
            this.f1150b = true;
            try {
                m1002S(this.f1144I, this.f1145J);
            } finally {
                m1015d();
            }
        }
    }

    /* renamed from: z */
    public final void m1038z(C0398a c0398a, boolean z2) {
        if (z2 && (this.f1168t == null || this.f1142G)) {
            return;
        }
        m1036x(z2);
        c0398a.mo982a(this.f1144I, this.f1145J);
        this.f1150b = true;
        try {
            m1002S(this.f1144I, this.f1145J);
            m1015d();
            m1016d0();
            m1033u();
            ((HashMap) this.f1151c.f924b).values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            m1015d();
            throw th;
        }
    }
}
