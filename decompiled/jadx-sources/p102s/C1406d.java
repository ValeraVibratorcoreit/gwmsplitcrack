package p102s;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import p006C.AbstractC0062j;
import p022K.C0198k;
import p097q.AbstractC1241e;
import p097q.C1238b;
import p097q.C1239c;
import p097q.C1242f;
import p105t.C1442c;
import p105t.C1445f;
import p105t.C1450k;
import p105t.C1452m;

/* renamed from: s.d */
/* loaded from: classes.dex */
public class C1406d {

    /* renamed from: A */
    public int f6628A;

    /* renamed from: B */
    public float f6629B;

    /* renamed from: C */
    public final int[] f6630C;

    /* renamed from: D */
    public float f6631D;

    /* renamed from: E */
    public boolean f6632E;

    /* renamed from: F */
    public boolean f6633F;

    /* renamed from: G */
    public int f6634G;

    /* renamed from: H */
    public int f6635H;

    /* renamed from: I */
    public final C1405c f6636I;

    /* renamed from: J */
    public final C1405c f6637J;

    /* renamed from: K */
    public final C1405c f6638K;

    /* renamed from: L */
    public final C1405c f6639L;

    /* renamed from: M */
    public final C1405c f6640M;

    /* renamed from: N */
    public final C1405c f6641N;

    /* renamed from: O */
    public final C1405c f6642O;

    /* renamed from: P */
    public final C1405c f6643P;

    /* renamed from: Q */
    public final C1405c[] f6644Q;

    /* renamed from: R */
    public final ArrayList f6645R;

    /* renamed from: S */
    public final boolean[] f6646S;

    /* renamed from: T */
    public C1406d f6647T;

    /* renamed from: U */
    public int f6648U;

    /* renamed from: V */
    public int f6649V;

    /* renamed from: W */
    public float f6650W;

    /* renamed from: X */
    public int f6651X;

    /* renamed from: Y */
    public int f6652Y;

    /* renamed from: Z */
    public int f6653Z;

    /* renamed from: a0 */
    public int f6655a0;

    /* renamed from: b */
    public C1442c f6656b;

    /* renamed from: b0 */
    public int f6657b0;

    /* renamed from: c */
    public C1442c f6658c;

    /* renamed from: c0 */
    public int f6659c0;

    /* renamed from: d0 */
    public float f6661d0;

    /* renamed from: e0 */
    public float f6663e0;

    /* renamed from: f0 */
    public View f6665f0;

    /* renamed from: g0 */
    public int f6667g0;

    /* renamed from: h0 */
    public String f6669h0;

    /* renamed from: i0 */
    public int f6671i0;

    /* renamed from: j */
    public String f6672j;

    /* renamed from: j0 */
    public int f6673j0;

    /* renamed from: k */
    public boolean f6674k;

    /* renamed from: k0 */
    public final float[] f6675k0;

    /* renamed from: l */
    public boolean f6676l;

    /* renamed from: l0 */
    public final C1406d[] f6677l0;

    /* renamed from: m */
    public boolean f6678m;

    /* renamed from: m0 */
    public final C1406d[] f6679m0;

    /* renamed from: n */
    public boolean f6680n;

    /* renamed from: n0 */
    public int f6681n0;

    /* renamed from: o */
    public int f6682o;

    /* renamed from: o0 */
    public int f6683o0;

    /* renamed from: p */
    public int f6684p;

    /* renamed from: p0 */
    public final int[] f6685p0;

    /* renamed from: q */
    public int f6686q;

    /* renamed from: r */
    public int f6687r;

    /* renamed from: s */
    public int f6688s;

    /* renamed from: t */
    public final int[] f6689t;

    /* renamed from: u */
    public int f6690u;

    /* renamed from: v */
    public int f6691v;

    /* renamed from: w */
    public float f6692w;

    /* renamed from: x */
    public int f6693x;

    /* renamed from: y */
    public int f6694y;

    /* renamed from: z */
    public float f6695z;

    /* renamed from: a */
    public boolean f6654a = false;

    /* renamed from: d */
    public C1450k f6660d = null;

    /* renamed from: e */
    public C1452m f6662e = null;

    /* renamed from: f */
    public final boolean[] f6664f = {true, true};

    /* renamed from: g */
    public boolean f6666g = true;

    /* renamed from: h */
    public int f6668h = -1;

    /* renamed from: i */
    public int f6670i = -1;

    public C1406d() {
        new HashMap();
        this.f6674k = false;
        this.f6676l = false;
        this.f6678m = false;
        this.f6680n = false;
        this.f6682o = -1;
        this.f6684p = -1;
        this.f6686q = 0;
        this.f6687r = 0;
        this.f6688s = 0;
        this.f6689t = new int[2];
        this.f6690u = 0;
        this.f6691v = 0;
        this.f6692w = 1.0f;
        this.f6693x = 0;
        this.f6694y = 0;
        this.f6695z = 1.0f;
        this.f6628A = -1;
        this.f6629B = 1.0f;
        this.f6630C = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f6631D = 0.0f;
        this.f6632E = false;
        this.f6633F = false;
        this.f6634G = 0;
        this.f6635H = 0;
        C1405c c1405c = new C1405c(this, 2);
        this.f6636I = c1405c;
        C1405c c1405c2 = new C1405c(this, 3);
        this.f6637J = c1405c2;
        C1405c c1405c3 = new C1405c(this, 4);
        this.f6638K = c1405c3;
        C1405c c1405c4 = new C1405c(this, 5);
        this.f6639L = c1405c4;
        C1405c c1405c5 = new C1405c(this, 6);
        this.f6640M = c1405c5;
        C1405c c1405c6 = new C1405c(this, 8);
        this.f6641N = c1405c6;
        C1405c c1405c7 = new C1405c(this, 9);
        this.f6642O = c1405c7;
        C1405c c1405c8 = new C1405c(this, 7);
        this.f6643P = c1405c8;
        this.f6644Q = new C1405c[]{c1405c, c1405c3, c1405c2, c1405c4, c1405c5, c1405c8};
        ArrayList arrayList = new ArrayList();
        this.f6645R = arrayList;
        this.f6646S = new boolean[2];
        this.f6685p0 = new int[]{1, 1};
        this.f6647T = null;
        this.f6648U = 0;
        this.f6649V = 0;
        this.f6650W = 0.0f;
        this.f6651X = -1;
        this.f6652Y = 0;
        this.f6653Z = 0;
        this.f6655a0 = 0;
        this.f6661d0 = 0.5f;
        this.f6663e0 = 0.5f;
        this.f6667g0 = 0;
        this.f6669h0 = null;
        this.f6671i0 = 0;
        this.f6673j0 = 0;
        this.f6675k0 = new float[]{-1.0f, -1.0f};
        this.f6677l0 = new C1406d[]{null, null};
        this.f6679m0 = new C1406d[]{null, null};
        this.f6681n0 = -1;
        this.f6683o0 = -1;
        arrayList.add(c1405c);
        arrayList.add(c1405c2);
        arrayList.add(c1405c3);
        arrayList.add(c1405c4);
        arrayList.add(c1405c6);
        arrayList.add(c1405c7);
        arrayList.add(c1405c8);
        arrayList.add(c1405c5);
    }

    /* renamed from: G */
    public static void m3365G(int i, int i2, String str, StringBuilder sb) {
        if (i == i2) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(i);
        sb.append(",\n");
    }

    /* renamed from: H */
    public static void m3366H(StringBuilder sb, String str, float f2, float f3) {
        if (f2 == f3) {
            return;
        }
        sb.append(str);
        sb.append(" :   ");
        sb.append(f2);
        sb.append(",\n");
    }

    /* renamed from: o */
    public static void m3367o(StringBuilder sb, String str, int i, int i2, int i3, int i4, int i5, float f2) {
        sb.append(str);
        sb.append(" :  {\n");
        m3365G(i, 0, "      size", sb);
        m3365G(i2, 0, "      min", sb);
        m3365G(i3, Integer.MAX_VALUE, "      max", sb);
        m3365G(i4, 0, "      matchMin", sb);
        m3365G(i5, 0, "      matchDef", sb);
        m3366H(sb, "      matchPercent", f2, 1.0f);
        sb.append("    },\n");
    }

    /* renamed from: p */
    public static void m3368p(StringBuilder sb, String str, C1405c c1405c) {
        if (c1405c.f6624f == null) {
            return;
        }
        sb.append("    ");
        sb.append(str);
        sb.append(" : [ '");
        sb.append(c1405c.f6624f);
        sb.append("'");
        if (c1405c.f6626h != Integer.MIN_VALUE || c1405c.f6625g != 0) {
            sb.append(",");
            sb.append(c1405c.f6625g);
            if (c1405c.f6626h != Integer.MIN_VALUE) {
                sb.append(",");
                sb.append(c1405c.f6626h);
                sb.append(",");
            }
        }
        sb.append(" ] ,\n");
    }

    /* renamed from: A */
    public boolean mo3347A() {
        return this.f6674k || (this.f6636I.f6621c && this.f6638K.f6621c);
    }

    /* renamed from: B */
    public boolean mo3348B() {
        return this.f6676l || (this.f6637J.f6621c && this.f6639L.f6621c);
    }

    /* renamed from: C */
    public void mo3369C() {
        this.f6636I.m3362j();
        this.f6637J.m3362j();
        this.f6638K.m3362j();
        this.f6639L.m3362j();
        this.f6640M.m3362j();
        this.f6641N.m3362j();
        this.f6642O.m3362j();
        this.f6643P.m3362j();
        this.f6647T = null;
        this.f6631D = 0.0f;
        this.f6648U = 0;
        this.f6649V = 0;
        this.f6650W = 0.0f;
        this.f6651X = -1;
        this.f6652Y = 0;
        this.f6653Z = 0;
        this.f6655a0 = 0;
        this.f6657b0 = 0;
        this.f6659c0 = 0;
        this.f6661d0 = 0.5f;
        this.f6663e0 = 0.5f;
        int[] iArr = this.f6685p0;
        iArr[0] = 1;
        iArr[1] = 1;
        this.f6665f0 = null;
        this.f6667g0 = 0;
        this.f6671i0 = 0;
        this.f6673j0 = 0;
        float[] fArr = this.f6675k0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f6682o = -1;
        this.f6684p = -1;
        int[] iArr2 = this.f6630C;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.f6687r = 0;
        this.f6688s = 0;
        this.f6692w = 1.0f;
        this.f6695z = 1.0f;
        this.f6691v = Integer.MAX_VALUE;
        this.f6694y = Integer.MAX_VALUE;
        this.f6690u = 0;
        this.f6693x = 0;
        this.f6628A = -1;
        this.f6629B = 1.0f;
        boolean[] zArr = this.f6664f;
        zArr[0] = true;
        zArr[1] = true;
        this.f6633F = false;
        boolean[] zArr2 = this.f6646S;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f6666g = true;
        int[] iArr3 = this.f6689t;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.f6668h = -1;
        this.f6670i = -1;
    }

    /* renamed from: D */
    public final void m3370D() {
        C1406d c1406d = this.f6647T;
        if (c1406d != null && (c1406d instanceof C1407e)) {
            ((C1407e) c1406d).getClass();
        }
        ArrayList arrayList = this.f6645R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C1405c) arrayList.get(i)).m3362j();
        }
    }

    /* renamed from: E */
    public final void m3371E() {
        this.f6674k = false;
        this.f6676l = false;
        this.f6678m = false;
        this.f6680n = false;
        ArrayList arrayList = this.f6645R;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C1405c c1405c = (C1405c) arrayList.get(i);
            c1405c.f6621c = false;
            c1405c.f6620b = 0;
        }
    }

    /* renamed from: F */
    public void mo3372F(C0198k c0198k) {
        this.f6636I.m3363k();
        this.f6637J.m3363k();
        this.f6638K.m3363k();
        this.f6639L.m3363k();
        this.f6640M.m3363k();
        this.f6643P.m3363k();
        this.f6641N.m3363k();
        this.f6642O.m3363k();
    }

    /* renamed from: I */
    public final void m3373I(int i) {
        this.f6655a0 = i;
        this.f6632E = i > 0;
    }

    /* renamed from: J */
    public final void m3374J(int i, int i2) {
        if (this.f6674k) {
            return;
        }
        this.f6636I.m3364l(i);
        this.f6638K.m3364l(i2);
        this.f6652Y = i;
        this.f6648U = i2 - i;
        this.f6674k = true;
    }

    /* renamed from: K */
    public final void m3375K(int i, int i2) {
        if (this.f6676l) {
            return;
        }
        this.f6637J.m3364l(i);
        this.f6639L.m3364l(i2);
        this.f6653Z = i;
        this.f6649V = i2 - i;
        if (this.f6632E) {
            this.f6640M.m3364l(i + this.f6655a0);
        }
        this.f6676l = true;
    }

    /* renamed from: L */
    public final void m3376L(int i) {
        this.f6649V = i;
        int i2 = this.f6659c0;
        if (i < i2) {
            this.f6649V = i2;
        }
    }

    /* renamed from: M */
    public final void m3377M(int i) {
        this.f6685p0[0] = i;
    }

    /* renamed from: N */
    public final void m3378N(int i) {
        this.f6685p0[1] = i;
    }

    /* renamed from: O */
    public final void m3379O(int i) {
        this.f6648U = i;
        int i2 = this.f6657b0;
        if (i < i2) {
            this.f6648U = i2;
        }
    }

    /* renamed from: P */
    public void mo3380P(boolean z2, boolean z3) {
        int i;
        int i2;
        C1450k c1450k = this.f6660d;
        boolean z4 = z2 & c1450k.f6847g;
        C1452m c1452m = this.f6662e;
        boolean z5 = z3 & c1452m.f6847g;
        int i3 = c1450k.f6848h.f6822g;
        int i4 = c1452m.f6848h.f6822g;
        int i5 = c1450k.f6849i.f6822g;
        int i6 = c1452m.f6849i.f6822g;
        int i7 = i6 - i4;
        if (i5 - i3 < 0 || i7 < 0 || i3 == Integer.MIN_VALUE || i3 == Integer.MAX_VALUE || i4 == Integer.MIN_VALUE || i4 == Integer.MAX_VALUE || i5 == Integer.MIN_VALUE || i5 == Integer.MAX_VALUE || i6 == Integer.MIN_VALUE || i6 == Integer.MAX_VALUE) {
            i5 = 0;
            i6 = 0;
            i3 = 0;
            i4 = 0;
        }
        int i8 = i5 - i3;
        int i9 = i6 - i4;
        if (z4) {
            this.f6652Y = i3;
        }
        if (z5) {
            this.f6653Z = i4;
        }
        if (this.f6667g0 == 8) {
            this.f6648U = 0;
            this.f6649V = 0;
            return;
        }
        int[] iArr = this.f6685p0;
        if (z4) {
            if (iArr[0] == 1 && i8 < (i2 = this.f6648U)) {
                i8 = i2;
            }
            this.f6648U = i8;
            int i10 = this.f6657b0;
            if (i8 < i10) {
                this.f6648U = i10;
            }
        }
        if (z5) {
            if (iArr[1] == 1 && i9 < (i = this.f6649V)) {
                i9 = i;
            }
            this.f6649V = i9;
            int i11 = this.f6659c0;
            if (i9 < i11) {
                this.f6649V = i11;
            }
        }
    }

    /* renamed from: Q */
    public void mo3381Q(C1239c c1239c, boolean z2) {
        int i;
        int i2;
        C1452m c1452m;
        C1450k c1450k;
        C1405c c1405c = this.f6636I;
        c1239c.getClass();
        int m2920n = C1239c.m2920n(c1405c);
        int m2920n2 = C1239c.m2920n(this.f6637J);
        int m2920n3 = C1239c.m2920n(this.f6638K);
        int m2920n4 = C1239c.m2920n(this.f6639L);
        if (z2 && (c1450k = this.f6660d) != null) {
            C1445f c1445f = c1450k.f6848h;
            if (c1445f.f6825j) {
                C1445f c1445f2 = c1450k.f6849i;
                if (c1445f2.f6825j) {
                    m2920n = c1445f.f6822g;
                    m2920n3 = c1445f2.f6822g;
                }
            }
        }
        if (z2 && (c1452m = this.f6662e) != null) {
            C1445f c1445f3 = c1452m.f6848h;
            if (c1445f3.f6825j) {
                C1445f c1445f4 = c1452m.f6849i;
                if (c1445f4.f6825j) {
                    m2920n2 = c1445f3.f6822g;
                    m2920n4 = c1445f4.f6822g;
                }
            }
        }
        int i3 = m2920n4 - m2920n2;
        if (m2920n3 - m2920n < 0 || i3 < 0 || m2920n == Integer.MIN_VALUE || m2920n == Integer.MAX_VALUE || m2920n2 == Integer.MIN_VALUE || m2920n2 == Integer.MAX_VALUE || m2920n3 == Integer.MIN_VALUE || m2920n3 == Integer.MAX_VALUE || m2920n4 == Integer.MIN_VALUE || m2920n4 == Integer.MAX_VALUE) {
            m2920n = 0;
            m2920n2 = 0;
            m2920n3 = 0;
            m2920n4 = 0;
        }
        int i4 = m2920n3 - m2920n;
        int i5 = m2920n4 - m2920n2;
        this.f6652Y = m2920n;
        this.f6653Z = m2920n2;
        if (this.f6667g0 == 8) {
            this.f6648U = 0;
            this.f6649V = 0;
            return;
        }
        int[] iArr = this.f6685p0;
        int i6 = iArr[0];
        if (i6 == 1 && i4 < (i2 = this.f6648U)) {
            i4 = i2;
        }
        if (iArr[1] == 1 && i5 < (i = this.f6649V)) {
            i5 = i;
        }
        this.f6648U = i4;
        this.f6649V = i5;
        int i7 = this.f6659c0;
        if (i5 < i7) {
            this.f6649V = i7;
        }
        int i8 = this.f6657b0;
        if (i4 < i8) {
            this.f6648U = i8;
        }
        int i9 = this.f6691v;
        if (i9 > 0 && i6 == 3) {
            this.f6648U = Math.min(this.f6648U, i9);
        }
        int i10 = this.f6694y;
        if (i10 > 0 && iArr[1] == 3) {
            this.f6649V = Math.min(this.f6649V, i10);
        }
        int i11 = this.f6648U;
        if (i4 != i11) {
            this.f6668h = i11;
        }
        int i12 = this.f6649V;
        if (i5 != i12) {
            this.f6670i = i12;
        }
    }

    /* renamed from: a */
    public final void m3382a(C1407e c1407e, C1239c c1239c, HashSet hashSet, int i, boolean z2) {
        if (z2) {
            if (!hashSet.contains(this)) {
                return;
            }
            AbstractC1412j.m3424b(c1407e, c1239c, this);
            hashSet.remove(this);
            mo3351b(c1239c, c1407e.m3409W(64));
        }
        if (i == 0) {
            HashSet hashSet2 = this.f6636I.f6619a;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((C1405c) it.next()).f6622d.m3382a(c1407e, c1239c, hashSet, i, true);
                }
            }
            HashSet hashSet3 = this.f6638K.f6619a;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((C1405c) it2.next()).f6622d.m3382a(c1407e, c1239c, hashSet, i, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.f6637J.f6619a;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((C1405c) it3.next()).f6622d.m3382a(c1407e, c1239c, hashSet, i, true);
            }
        }
        HashSet hashSet5 = this.f6639L.f6619a;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((C1405c) it4.next()).f6622d.m3382a(c1407e, c1239c, hashSet, i, true);
            }
        }
        HashSet hashSet6 = this.f6640M.f6619a;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((C1405c) it5.next()).f6622d.m3382a(c1407e, c1239c, hashSet, i, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0411  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0424  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0469  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x055b  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x05d7  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x06ad  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x070a  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0657  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x05d3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x05bd  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04c7  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x04e0  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x04d0  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x040c  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x020e  */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo3351b(C1239c c1239c, boolean z2) {
        boolean z3;
        boolean z4;
        int i;
        boolean[] zArr;
        boolean z5;
        C1406d c1406d;
        C1406d c1406d2;
        C1405c c1405c;
        boolean[] zArr2;
        boolean z6;
        boolean z7;
        int i2;
        int i3;
        int i4;
        int i5;
        float f2;
        int[] iArr;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z8;
        int i10;
        boolean z9;
        char c2;
        boolean z10;
        boolean z11;
        int i11;
        C1405c c1405c2;
        boolean z12;
        boolean z13;
        int i12;
        int[] iArr2;
        C1405c c1405c3;
        C1405c c1405c4;
        C1405c c1405c5;
        C1242f c1242f;
        C1242f c1242f2;
        C1242f c1242f3;
        C1242f c1242f4;
        C1242f c1242f5;
        int[] iArr3;
        int i13;
        int i14;
        int i15;
        C1406d c1406d3;
        C1239c c1239c2;
        C1242f c1242f6;
        C1242f c1242f7;
        C1242f c1242f8;
        int i16;
        C1242f c1242f9;
        C1242f c1242f10;
        C1239c c1239c3;
        boolean z14;
        C1450k c1450k;
        C1445f c1445f;
        int i17;
        boolean m3401x;
        boolean m3402y;
        boolean z15;
        C1450k c1450k2;
        C1452m c1452m;
        boolean z16;
        boolean z17;
        ?? r10;
        C1405c c1405c6 = this.f6636I;
        C1242f m2931k = c1239c.m2931k(c1405c6);
        C1405c c1405c7 = this.f6638K;
        C1242f m2931k2 = c1239c.m2931k(c1405c7);
        C1405c c1405c8 = this.f6637J;
        C1242f m2931k3 = c1239c.m2931k(c1405c8);
        C1405c c1405c9 = this.f6639L;
        C1242f m2931k4 = c1239c.m2931k(c1405c9);
        C1405c c1405c10 = this.f6640M;
        C1242f m2931k5 = c1239c.m2931k(c1405c10);
        C1406d c1406d4 = this.f6647T;
        if (c1406d4 != null) {
            int[] iArr4 = c1406d4.f6685p0;
            if (iArr4[0] == 2) {
                r10 = 1;
                z17 = true;
            } else {
                z17 = false;
                r10 = 1;
            }
            boolean z18 = iArr4[r10] == 2 ? r10 : false;
            int i18 = this.f6686q;
            if (i18 == r10) {
                z4 = z17;
                z3 = false;
            } else if (i18 == 2) {
                z3 = z18;
                z4 = false;
            } else if (i18 != 3) {
                z3 = z18;
                z4 = z17;
            }
            i = this.f6667g0;
            zArr = this.f6646S;
            if (i == 8) {
                ArrayList arrayList = this.f6645R;
                int size = arrayList.size();
                int i19 = 0;
                while (true) {
                    if (i19 < size) {
                        ArrayList arrayList2 = arrayList;
                        HashSet hashSet = ((C1405c) arrayList.get(i19)).f6619a;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i19++;
                        arrayList = arrayList2;
                    } else if (!zArr[0] && !zArr[1]) {
                        return;
                    }
                }
            }
            z5 = this.f6674k;
            if (!z5 || this.f6676l) {
                if (z5) {
                    c1239c.m2924d(m2931k, this.f6652Y);
                    c1239c.m2924d(m2931k2, this.f6652Y + this.f6648U);
                    if (z4 && (c1406d2 = this.f6647T) != null) {
                        C1407e c1407e = (C1407e) c1406d2;
                        WeakReference weakReference = c1407e.f6703H0;
                        if (weakReference == null || weakReference.get() == null || c1405c6.m3356d() > ((C1405c) c1407e.f6703H0.get()).m3356d()) {
                            c1407e.f6703H0 = new WeakReference(c1405c6);
                        }
                        WeakReference weakReference2 = c1407e.f6705J0;
                        if (weakReference2 == null || weakReference2.get() == null || c1405c7.m3356d() > ((C1405c) c1407e.f6705J0.get()).m3356d()) {
                            c1407e.f6705J0 = new WeakReference(c1405c7);
                        }
                    }
                }
                if (this.f6676l) {
                    c1239c.m2924d(m2931k3, this.f6653Z);
                    c1239c.m2924d(m2931k4, this.f6653Z + this.f6649V);
                    HashSet hashSet2 = c1405c10.f6619a;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        c1239c.m2924d(m2931k5, this.f6653Z + this.f6655a0);
                    }
                    if (z3 && (c1406d = this.f6647T) != null) {
                        C1407e c1407e2 = (C1407e) c1406d;
                        WeakReference weakReference3 = c1407e2.f6702G0;
                        if (weakReference3 == null || weakReference3.get() == null || c1405c8.m3356d() > ((C1405c) c1407e2.f6702G0.get()).m3356d()) {
                            c1407e2.f6702G0 = new WeakReference(c1405c8);
                        }
                        WeakReference weakReference4 = c1407e2.f6704I0;
                        if (weakReference4 == null || weakReference4.get() == null || c1405c9.m3356d() > ((C1405c) c1407e2.f6704I0.get()).m3356d()) {
                            c1407e2.f6704I0 = new WeakReference(c1405c9);
                        }
                    }
                }
                if (this.f6674k && this.f6676l) {
                    this.f6674k = false;
                    this.f6676l = false;
                    return;
                }
            }
            boolean[] zArr3 = this.f6664f;
            if (z2 || (c1450k2 = this.f6660d) == null || (c1452m = this.f6662e) == null) {
                c1405c = c1405c10;
                zArr2 = zArr;
            } else {
                zArr2 = zArr;
                C1445f c1445f2 = c1450k2.f6848h;
                c1405c = c1405c10;
                if (c1445f2.f6825j && c1450k2.f6849i.f6825j && c1452m.f6848h.f6825j && c1452m.f6849i.f6825j) {
                    c1239c.m2924d(m2931k, c1445f2.f6822g);
                    c1239c.m2924d(m2931k2, this.f6660d.f6849i.f6822g);
                    c1239c.m2924d(m2931k3, this.f6662e.f6848h.f6822g);
                    c1239c.m2924d(m2931k4, this.f6662e.f6849i.f6822g);
                    c1239c.m2924d(m2931k5, this.f6662e.f6833k.f6822g);
                    if (this.f6647T != null) {
                        if (z4 && zArr3[0] && !m3401x()) {
                            c1239c.m2926f(c1239c.m2931k(this.f6647T.f6638K), m2931k2, 0, 8);
                        }
                        if (z3 && zArr3[1] && !m3402y()) {
                            z16 = false;
                            c1239c.m2926f(c1239c.m2931k(this.f6647T.f6639L), m2931k4, 0, 8);
                            this.f6674k = z16;
                            this.f6676l = z16;
                            return;
                        }
                    }
                    z16 = false;
                    this.f6674k = z16;
                    this.f6676l = z16;
                    return;
                }
            }
            if (this.f6647T == null) {
                if (m3400w(0)) {
                    ((C1407e) this.f6647T).m3405R(this, 0);
                    m3401x = true;
                } else {
                    m3401x = m3401x();
                }
                if (m3400w(1)) {
                    ((C1407e) this.f6647T).m3405R(this, 1);
                    m3402y = true;
                } else {
                    m3402y = m3402y();
                }
                if (!m3401x && z4 && this.f6667g0 != 8 && c1405c6.f6624f == null && c1405c7.f6624f == null) {
                    z15 = m3401x;
                    c1239c.m2926f(c1239c.m2931k(this.f6647T.f6638K), m2931k2, 0, 1);
                } else {
                    z15 = m3401x;
                }
                if (!m3402y && z3 && this.f6667g0 != 8 && c1405c8.f6624f == null && c1405c9.f6624f == null && c1405c == null) {
                    c1239c.m2926f(c1239c.m2931k(this.f6647T.f6639L), m2931k4, 0, 1);
                }
                z6 = m3402y;
                z7 = z15;
            } else {
                z6 = false;
                z7 = false;
            }
            i2 = this.f6648U;
            i3 = this.f6657b0;
            if (i2 >= i3) {
                i3 = i2;
            }
            i4 = this.f6649V;
            i5 = this.f6659c0;
            if (i4 >= i5) {
                i5 = i4;
            }
            int[] iArr5 = this.f6685p0;
            int i20 = iArr5[0];
            int i21 = i3;
            boolean z19 = i20 == 3;
            int i22 = iArr5[1];
            int i23 = i5;
            boolean z20 = i22 == 3;
            int i24 = this.f6651X;
            this.f6628A = i24;
            f2 = this.f6650W;
            this.f6629B = f2;
            int i25 = this.f6687r;
            int i26 = this.f6688s;
            if (f2 <= 0.0f) {
                iArr = iArr5;
                if (this.f6667g0 != 8) {
                    if (i20 == 3 && i25 == 0) {
                        i25 = 3;
                    }
                    if (i22 == 3 && i26 == 0) {
                        i26 = 3;
                    }
                    if (i20 == 3 && i22 == 3 && i25 == 3 && i26 == 3) {
                        if (i24 == -1) {
                            if (z19 && !z20) {
                                this.f6628A = 0;
                            } else if (!z19 && z20) {
                                this.f6628A = 1;
                                if (i24 == -1) {
                                    this.f6629B = 1.0f / f2;
                                }
                            }
                        }
                        if (this.f6628A == 0 && (!c1405c8.m3360h() || !c1405c9.m3360h())) {
                            this.f6628A = 1;
                        } else if (this.f6628A == 1 && (!c1405c6.m3360h() || !c1405c7.m3360h())) {
                            this.f6628A = 0;
                        }
                        if (this.f6628A == -1 && (!c1405c8.m3360h() || !c1405c9.m3360h() || !c1405c6.m3360h() || !c1405c7.m3360h())) {
                            if (c1405c8.m3360h() && c1405c9.m3360h()) {
                                this.f6628A = 0;
                            } else if (c1405c6.m3360h() && c1405c7.m3360h()) {
                                this.f6629B = 1.0f / this.f6629B;
                                this.f6628A = 1;
                            }
                        }
                        if (this.f6628A == -1) {
                            int i27 = this.f6690u;
                            if (i27 > 0 && this.f6693x == 0) {
                                this.f6628A = 0;
                            } else if (i27 == 0 && this.f6693x > 0) {
                                this.f6629B = 1.0f / this.f6629B;
                                this.f6628A = 1;
                            }
                        }
                    } else {
                        if (i20 == 3 && i25 == 3) {
                            this.f6628A = 0;
                            i8 = (int) (f2 * i4);
                            if (i22 != 3) {
                                i7 = i26;
                                i9 = i23;
                                z8 = false;
                                i6 = 4;
                                int[] iArr6 = this.f6689t;
                                iArr6[0] = i6;
                                iArr6[1] = i7;
                                if (z8) {
                                }
                                z9 = false;
                                if (z8) {
                                }
                                c2 = 0;
                                z10 = false;
                                if (iArr[c2] != 2) {
                                }
                                if (!z11) {
                                }
                                c1405c2 = this.f6643P;
                                z12 = !c1405c2.m3360h();
                                z13 = zArr2[0];
                                boolean z21 = zArr2[1];
                                i12 = this.f6682o;
                                iArr2 = this.f6630C;
                                if (i12 != 2) {
                                }
                                c1405c3 = c1405c9;
                                c1405c4 = c1405c2;
                                c1405c5 = c1405c;
                                c1242f = m2931k3;
                                c1242f2 = m2931k5;
                                c1242f3 = m2931k4;
                                c1242f4 = m2931k2;
                                c1242f5 = m2931k;
                                iArr3 = iArr2;
                                if (z2) {
                                }
                                i16 = i15;
                                if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                                }
                                c1242f9 = c1242f7;
                                c1242f10 = c1242f8;
                                if (z8) {
                                }
                                if (c1405c4.m3360h()) {
                                }
                                this.f6674k = false;
                                this.f6676l = false;
                            }
                            i6 = i25;
                            i7 = i26;
                            i9 = i23;
                            z8 = true;
                            int[] iArr62 = this.f6689t;
                            iArr62[0] = i6;
                            iArr62[1] = i7;
                            if (z8) {
                            }
                            z9 = false;
                            if (z8) {
                            }
                            c2 = 0;
                            z10 = false;
                            if (iArr[c2] != 2) {
                            }
                            if (!z11) {
                            }
                            c1405c2 = this.f6643P;
                            z12 = !c1405c2.m3360h();
                            z13 = zArr2[0];
                            boolean z212 = zArr2[1];
                            i12 = this.f6682o;
                            iArr2 = this.f6630C;
                            if (i12 != 2) {
                            }
                            c1405c3 = c1405c9;
                            c1405c4 = c1405c2;
                            c1405c5 = c1405c;
                            c1242f = m2931k3;
                            c1242f2 = m2931k5;
                            c1242f3 = m2931k4;
                            c1242f4 = m2931k2;
                            c1242f5 = m2931k;
                            iArr3 = iArr2;
                            if (z2) {
                            }
                            i16 = i15;
                            if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                            }
                            c1242f9 = c1242f7;
                            c1242f10 = c1242f8;
                            if (z8) {
                            }
                            if (c1405c4.m3360h()) {
                            }
                            this.f6674k = false;
                            this.f6676l = false;
                        }
                        if (i22 == 3 && i26 == 3) {
                            this.f6628A = 1;
                            if (i24 == -1) {
                                this.f6629B = 1.0f / f2;
                            }
                            i9 = (int) (this.f6629B * i2);
                            i6 = i25;
                            if (i20 == 3) {
                                i7 = i26;
                                i8 = i21;
                                z8 = true;
                                int[] iArr622 = this.f6689t;
                                iArr622[0] = i6;
                                iArr622[1] = i7;
                                if (z8) {
                                }
                                z9 = false;
                                if (z8) {
                                }
                                c2 = 0;
                                z10 = false;
                                if (iArr[c2] != 2) {
                                }
                                if (!z11) {
                                }
                                c1405c2 = this.f6643P;
                                z12 = !c1405c2.m3360h();
                                z13 = zArr2[0];
                                boolean z2122 = zArr2[1];
                                i12 = this.f6682o;
                                iArr2 = this.f6630C;
                                if (i12 != 2) {
                                }
                                c1405c3 = c1405c9;
                                c1405c4 = c1405c2;
                                c1405c5 = c1405c;
                                c1242f = m2931k3;
                                c1242f2 = m2931k5;
                                c1242f3 = m2931k4;
                                c1242f4 = m2931k2;
                                c1242f5 = m2931k;
                                iArr3 = iArr2;
                                if (z2) {
                                }
                                i16 = i15;
                                if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                                }
                                c1242f9 = c1242f7;
                                c1242f10 = c1242f8;
                                if (z8) {
                                }
                                if (c1405c4.m3360h()) {
                                }
                                this.f6674k = false;
                                this.f6676l = false;
                            }
                            i8 = i21;
                            z8 = false;
                            i7 = 4;
                            int[] iArr6222 = this.f6689t;
                            iArr6222[0] = i6;
                            iArr6222[1] = i7;
                            if (z8) {
                                int i28 = this.f6628A;
                                i10 = -1;
                                if (i28 == 0 || i28 == -1) {
                                    z9 = true;
                                    if (z8 || !((i17 = this.f6628A) == 1 || i17 == i10)) {
                                        c2 = 0;
                                        z10 = false;
                                    } else {
                                        c2 = 0;
                                        z10 = true;
                                    }
                                    z11 = iArr[c2] != 2 && (this instanceof C1407e);
                                    i11 = !z11 ? 0 : i8;
                                    c1405c2 = this.f6643P;
                                    z12 = !c1405c2.m3360h();
                                    z13 = zArr2[0];
                                    boolean z21222 = zArr2[1];
                                    i12 = this.f6682o;
                                    iArr2 = this.f6630C;
                                    if (i12 != 2 && !this.f6674k) {
                                        if (z2 && (c1450k = this.f6660d) != null) {
                                            c1445f = c1450k.f6848h;
                                            if (c1445f.f6825j && c1450k.f6849i.f6825j) {
                                                if (!z2) {
                                                    c1239c.m2924d(m2931k, c1445f.f6822g);
                                                    c1239c.m2924d(m2931k2, this.f6660d.f6849i.f6822g);
                                                    if (this.f6647T != null && z4 && zArr3[0] && !m3401x()) {
                                                        c1239c.m2926f(c1239c.m2931k(this.f6647T.f6638K), m2931k2, 0, 8);
                                                    }
                                                    c1242f4 = m2931k2;
                                                    c1242f5 = m2931k;
                                                    c1405c3 = c1405c9;
                                                    c1405c4 = c1405c2;
                                                    c1405c5 = c1405c;
                                                    c1242f = m2931k3;
                                                    c1242f2 = m2931k5;
                                                    c1242f3 = m2931k4;
                                                    iArr3 = iArr2;
                                                    if (z2) {
                                                        c1406d3 = this;
                                                        C1452m c1452m2 = c1406d3.f6662e;
                                                        if (c1452m2 != null) {
                                                            C1445f c1445f3 = c1452m2.f6848h;
                                                            if (c1445f3.f6825j && c1452m2.f6849i.f6825j) {
                                                                c1239c2 = c1239c;
                                                                c1242f8 = c1242f;
                                                                c1239c2.m2924d(c1242f8, c1445f3.f6822g);
                                                                c1242f7 = c1242f3;
                                                                c1239c2.m2924d(c1242f7, c1406d3.f6662e.f6849i.f6822g);
                                                                c1242f6 = c1242f2;
                                                                c1239c2.m2924d(c1242f6, c1406d3.f6662e.f6833k.f6822g);
                                                                C1406d c1406d5 = c1406d3.f6647T;
                                                                if (c1406d5 == null || z6 || !z3) {
                                                                    i13 = 8;
                                                                    i14 = 0;
                                                                    i15 = 1;
                                                                } else {
                                                                    i15 = 1;
                                                                    if (zArr3[1]) {
                                                                        i13 = 8;
                                                                        i14 = 0;
                                                                        c1239c2.m2926f(c1239c2.m2931k(c1406d5.f6639L), c1242f7, 0, 8);
                                                                    } else {
                                                                        i13 = 8;
                                                                        i14 = 0;
                                                                    }
                                                                }
                                                                i16 = i14;
                                                                if ((c1406d3.f6684p != 2 ? i14 : i16) != 0 || c1406d3.f6676l) {
                                                                    c1242f9 = c1242f7;
                                                                    c1242f10 = c1242f8;
                                                                } else {
                                                                    boolean z22 = (iArr[i15] == 2 && (c1406d3 instanceof C1407e)) ? i15 : i14;
                                                                    if (z22) {
                                                                        i9 = i14;
                                                                    }
                                                                    C1406d c1406d6 = c1406d3.f6647T;
                                                                    C1242f m2931k6 = c1406d6 != null ? c1239c2.m2931k(c1406d6.f6639L) : null;
                                                                    C1406d c1406d7 = c1406d3.f6647T;
                                                                    C1242f m2931k7 = c1406d7 != null ? c1239c2.m2931k(c1406d7.f6637J) : null;
                                                                    int i29 = c1406d3.f6655a0;
                                                                    if (i29 > 0 || c1406d3.f6667g0 == i13) {
                                                                        C1405c c1405c11 = c1405c5;
                                                                        if (c1405c11.f6624f != null) {
                                                                            c1239c2.m2925e(c1242f6, c1242f8, i29, i13);
                                                                            c1239c2.m2925e(c1242f6, c1239c2.m2931k(c1405c11.f6624f), c1405c11.m3357e(), i13);
                                                                            if (z3) {
                                                                                c1239c2.m2926f(m2931k6, c1239c2.m2931k(c1405c3), i14, 5);
                                                                            }
                                                                            z14 = i14;
                                                                            c1242f9 = c1242f7;
                                                                            c1242f10 = c1242f8;
                                                                            m3383d(c1239c, false, z3, z4, zArr3[i15], m2931k7, m2931k6, iArr[i15], z22, c1406d3.f6637J, c1406d3.f6639L, c1406d3.f6653Z, i9, c1406d3.f6659c0, iArr3[i15], c1406d3.f6663e0, z10, iArr[i14] != 3 ? i15 : i14, z6, z7, z21222, i7, i6, c1406d3.f6693x, c1406d3.f6694y, c1406d3.f6695z, z14);
                                                                        } else if (c1406d3.f6667g0 == i13) {
                                                                            c1239c2.m2925e(c1242f6, c1242f8, c1405c11.m3357e(), i13);
                                                                        } else {
                                                                            c1239c2.m2925e(c1242f6, c1242f8, i29, i13);
                                                                        }
                                                                    }
                                                                    z14 = z12;
                                                                    c1242f9 = c1242f7;
                                                                    c1242f10 = c1242f8;
                                                                    m3383d(c1239c, false, z3, z4, zArr3[i15], m2931k7, m2931k6, iArr[i15], z22, c1406d3.f6637J, c1406d3.f6639L, c1406d3.f6653Z, i9, c1406d3.f6659c0, iArr3[i15], c1406d3.f6663e0, z10, iArr[i14] != 3 ? i15 : i14, z6, z7, z21222, i7, i6, c1406d3.f6693x, c1406d3.f6694y, c1406d3.f6695z, z14);
                                                                }
                                                                if (z8) {
                                                                    c1239c3 = c1239c;
                                                                } else if (this.f6628A == 1) {
                                                                    float f3 = this.f6629B;
                                                                    C1238b m2932l = c1239c.m2932l();
                                                                    m2932l.f5506d.m2909g(c1242f9, -1.0f);
                                                                    m2932l.f5506d.m2909g(c1242f10, 1.0f);
                                                                    m2932l.f5506d.m2909g(c1242f4, f3);
                                                                    m2932l.f5506d.m2909g(c1242f5, -f3);
                                                                    c1239c3 = c1239c;
                                                                    c1239c3.m2923c(m2932l);
                                                                } else {
                                                                    c1239c3 = c1239c;
                                                                    float f4 = this.f6629B;
                                                                    C1238b m2932l2 = c1239c.m2932l();
                                                                    m2932l2.f5506d.m2909g(c1242f4, -1.0f);
                                                                    m2932l2.f5506d.m2909g(c1242f5, 1.0f);
                                                                    m2932l2.f5506d.m2909g(c1242f9, f4);
                                                                    m2932l2.f5506d.m2909g(c1242f10, -f4);
                                                                    c1239c3.m2923c(m2932l2);
                                                                }
                                                                if (c1405c4.m3360h()) {
                                                                    C1405c c1405c12 = c1405c4;
                                                                    C1406d c1406d8 = c1405c12.f6624f.f6622d;
                                                                    float radians = (float) Math.toRadians(this.f6631D + 90.0f);
                                                                    int m3357e = c1405c12.m3357e();
                                                                    C1242f m2931k8 = c1239c3.m2931k(mo3388i(2));
                                                                    C1242f m2931k9 = c1239c3.m2931k(mo3388i(3));
                                                                    C1242f m2931k10 = c1239c3.m2931k(mo3388i(4));
                                                                    C1242f m2931k11 = c1239c3.m2931k(mo3388i(5));
                                                                    C1242f m2931k12 = c1239c3.m2931k(c1406d8.mo3388i(2));
                                                                    C1242f m2931k13 = c1239c3.m2931k(c1406d8.mo3388i(3));
                                                                    C1242f m2931k14 = c1239c3.m2931k(c1406d8.mo3388i(4));
                                                                    C1242f m2931k15 = c1239c3.m2931k(c1406d8.mo3388i(5));
                                                                    C1238b m2932l3 = c1239c.m2932l();
                                                                    double d = radians;
                                                                    double d2 = m3357e;
                                                                    float sin = (float) (Math.sin(d) * d2);
                                                                    m2932l3.f5506d.m2909g(m2931k13, 0.5f);
                                                                    m2932l3.f5506d.m2909g(m2931k15, 0.5f);
                                                                    m2932l3.f5506d.m2909g(m2931k9, -0.5f);
                                                                    m2932l3.f5506d.m2909g(m2931k11, -0.5f);
                                                                    m2932l3.f5504b = -sin;
                                                                    c1239c3.m2923c(m2932l3);
                                                                    C1238b m2932l4 = c1239c.m2932l();
                                                                    float cos = (float) (Math.cos(d) * d2);
                                                                    m2932l4.f5506d.m2909g(m2931k12, 0.5f);
                                                                    m2932l4.f5506d.m2909g(m2931k14, 0.5f);
                                                                    m2932l4.f5506d.m2909g(m2931k8, -0.5f);
                                                                    m2932l4.f5506d.m2909g(m2931k10, -0.5f);
                                                                    m2932l4.f5504b = -cos;
                                                                    c1239c3.m2923c(m2932l4);
                                                                }
                                                                this.f6674k = false;
                                                                this.f6676l = false;
                                                            }
                                                        }
                                                        c1239c2 = c1239c;
                                                        c1242f6 = c1242f2;
                                                        c1242f7 = c1242f3;
                                                        c1242f8 = c1242f;
                                                        i13 = 8;
                                                        i14 = 0;
                                                        i15 = 1;
                                                    } else {
                                                        i13 = 8;
                                                        i14 = 0;
                                                        i15 = 1;
                                                        c1406d3 = this;
                                                        c1239c2 = c1239c;
                                                        c1242f6 = c1242f2;
                                                        c1242f7 = c1242f3;
                                                        c1242f8 = c1242f;
                                                    }
                                                    i16 = i15;
                                                    if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                                                    }
                                                    c1242f9 = c1242f7;
                                                    c1242f10 = c1242f8;
                                                    if (z8) {
                                                    }
                                                    if (c1405c4.m3360h()) {
                                                    }
                                                    this.f6674k = false;
                                                    this.f6676l = false;
                                                }
                                            }
                                        }
                                        C1406d c1406d9 = this.f6647T;
                                        C1242f m2931k16 = c1406d9 == null ? c1239c.m2931k(c1406d9.f6638K) : null;
                                        C1406d c1406d10 = this.f6647T;
                                        c1242f2 = m2931k5;
                                        c1405c5 = c1405c;
                                        c1242f3 = m2931k4;
                                        iArr3 = iArr2;
                                        c1405c3 = c1405c9;
                                        c1242f = m2931k3;
                                        c1242f4 = m2931k2;
                                        c1405c4 = c1405c2;
                                        c1242f5 = m2931k;
                                        m3383d(c1239c, true, z4, z3, zArr3[0], c1406d10 == null ? c1239c.m2931k(c1406d10.f6636I) : null, m2931k16, iArr[0], z11, this.f6636I, this.f6638K, this.f6652Y, i11, this.f6657b0, iArr2[0], this.f6661d0, z9, iArr[1] != 3, z7, z6, z13, i6, i7, this.f6690u, this.f6691v, this.f6692w, z12);
                                        if (z2) {
                                        }
                                        i16 = i15;
                                        if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                                        }
                                        c1242f9 = c1242f7;
                                        c1242f10 = c1242f8;
                                        if (z8) {
                                        }
                                        if (c1405c4.m3360h()) {
                                        }
                                        this.f6674k = false;
                                        this.f6676l = false;
                                    }
                                    c1405c3 = c1405c9;
                                    c1405c4 = c1405c2;
                                    c1405c5 = c1405c;
                                    c1242f = m2931k3;
                                    c1242f2 = m2931k5;
                                    c1242f3 = m2931k4;
                                    c1242f4 = m2931k2;
                                    c1242f5 = m2931k;
                                    iArr3 = iArr2;
                                    if (z2) {
                                    }
                                    i16 = i15;
                                    if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                                    }
                                    c1242f9 = c1242f7;
                                    c1242f10 = c1242f8;
                                    if (z8) {
                                    }
                                    if (c1405c4.m3360h()) {
                                    }
                                    this.f6674k = false;
                                    this.f6676l = false;
                                }
                            } else {
                                i10 = -1;
                            }
                            z9 = false;
                            if (z8) {
                            }
                            c2 = 0;
                            z10 = false;
                            if (iArr[c2] != 2) {
                            }
                            if (!z11) {
                            }
                            c1405c2 = this.f6643P;
                            z12 = !c1405c2.m3360h();
                            z13 = zArr2[0];
                            boolean z212222 = zArr2[1];
                            i12 = this.f6682o;
                            iArr2 = this.f6630C;
                            if (i12 != 2) {
                                if (z2) {
                                    c1445f = c1450k.f6848h;
                                    if (c1445f.f6825j) {
                                        if (!z2) {
                                        }
                                    }
                                }
                                C1406d c1406d92 = this.f6647T;
                                if (c1406d92 == null) {
                                }
                                C1406d c1406d102 = this.f6647T;
                                if (c1406d102 == null) {
                                }
                                c1242f2 = m2931k5;
                                c1405c5 = c1405c;
                                c1242f3 = m2931k4;
                                iArr3 = iArr2;
                                c1405c3 = c1405c9;
                                c1242f = m2931k3;
                                c1242f4 = m2931k2;
                                c1405c4 = c1405c2;
                                c1242f5 = m2931k;
                                m3383d(c1239c, true, z4, z3, zArr3[0], c1406d102 == null ? c1239c.m2931k(c1406d102.f6636I) : null, m2931k16, iArr[0], z11, this.f6636I, this.f6638K, this.f6652Y, i11, this.f6657b0, iArr2[0], this.f6661d0, z9, iArr[1] != 3, z7, z6, z13, i6, i7, this.f6690u, this.f6691v, this.f6692w, z12);
                                if (z2) {
                                }
                                i16 = i15;
                                if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                                }
                                c1242f9 = c1242f7;
                                c1242f10 = c1242f8;
                                if (z8) {
                                }
                                if (c1405c4.m3360h()) {
                                }
                                this.f6674k = false;
                                this.f6676l = false;
                            }
                            c1405c3 = c1405c9;
                            c1405c4 = c1405c2;
                            c1405c5 = c1405c;
                            c1242f = m2931k3;
                            c1242f2 = m2931k5;
                            c1242f3 = m2931k4;
                            c1242f4 = m2931k2;
                            c1242f5 = m2931k;
                            iArr3 = iArr2;
                            if (z2) {
                            }
                            i16 = i15;
                            if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                            }
                            c1242f9 = c1242f7;
                            c1242f10 = c1242f8;
                            if (z8) {
                            }
                            if (c1405c4.m3360h()) {
                            }
                            this.f6674k = false;
                            this.f6676l = false;
                        }
                    }
                    i6 = i25;
                    i7 = i26;
                    i8 = i21;
                    i9 = i23;
                    z8 = true;
                    int[] iArr62222 = this.f6689t;
                    iArr62222[0] = i6;
                    iArr62222[1] = i7;
                    if (z8) {
                    }
                    z9 = false;
                    if (z8) {
                    }
                    c2 = 0;
                    z10 = false;
                    if (iArr[c2] != 2) {
                    }
                    if (!z11) {
                    }
                    c1405c2 = this.f6643P;
                    z12 = !c1405c2.m3360h();
                    z13 = zArr2[0];
                    boolean z2122222 = zArr2[1];
                    i12 = this.f6682o;
                    iArr2 = this.f6630C;
                    if (i12 != 2) {
                    }
                    c1405c3 = c1405c9;
                    c1405c4 = c1405c2;
                    c1405c5 = c1405c;
                    c1242f = m2931k3;
                    c1242f2 = m2931k5;
                    c1242f3 = m2931k4;
                    c1242f4 = m2931k2;
                    c1242f5 = m2931k;
                    iArr3 = iArr2;
                    if (z2) {
                    }
                    i16 = i15;
                    if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
                    }
                    c1242f9 = c1242f7;
                    c1242f10 = c1242f8;
                    if (z8) {
                    }
                    if (c1405c4.m3360h()) {
                    }
                    this.f6674k = false;
                    this.f6676l = false;
                }
            } else {
                iArr = iArr5;
            }
            i6 = i25;
            i7 = i26;
            i8 = i21;
            i9 = i23;
            z8 = false;
            int[] iArr622222 = this.f6689t;
            iArr622222[0] = i6;
            iArr622222[1] = i7;
            if (z8) {
            }
            z9 = false;
            if (z8) {
            }
            c2 = 0;
            z10 = false;
            if (iArr[c2] != 2) {
            }
            if (!z11) {
            }
            c1405c2 = this.f6643P;
            z12 = !c1405c2.m3360h();
            z13 = zArr2[0];
            boolean z21222222 = zArr2[1];
            i12 = this.f6682o;
            iArr2 = this.f6630C;
            if (i12 != 2) {
            }
            c1405c3 = c1405c9;
            c1405c4 = c1405c2;
            c1405c5 = c1405c;
            c1242f = m2931k3;
            c1242f2 = m2931k5;
            c1242f3 = m2931k4;
            c1242f4 = m2931k2;
            c1242f5 = m2931k;
            iArr3 = iArr2;
            if (z2) {
            }
            i16 = i15;
            if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
            }
            c1242f9 = c1242f7;
            c1242f10 = c1242f8;
            if (z8) {
            }
            if (c1405c4.m3360h()) {
            }
            this.f6674k = false;
            this.f6676l = false;
        }
        z3 = false;
        z4 = false;
        i = this.f6667g0;
        zArr = this.f6646S;
        if (i == 8) {
        }
        z5 = this.f6674k;
        if (!z5) {
        }
        if (z5) {
        }
        if (this.f6676l) {
        }
        if (this.f6674k) {
            this.f6674k = false;
            this.f6676l = false;
            return;
        }
        boolean[] zArr32 = this.f6664f;
        if (z2) {
        }
        c1405c = c1405c10;
        zArr2 = zArr;
        if (this.f6647T == null) {
        }
        i2 = this.f6648U;
        i3 = this.f6657b0;
        if (i2 >= i3) {
        }
        i4 = this.f6649V;
        i5 = this.f6659c0;
        if (i4 >= i5) {
        }
        int[] iArr52 = this.f6685p0;
        int i202 = iArr52[0];
        int i212 = i3;
        if (i202 == 3) {
        }
        int i222 = iArr52[1];
        int i232 = i5;
        if (i222 == 3) {
        }
        int i242 = this.f6651X;
        this.f6628A = i242;
        f2 = this.f6650W;
        this.f6629B = f2;
        int i252 = this.f6687r;
        int i262 = this.f6688s;
        if (f2 <= 0.0f) {
        }
        i6 = i252;
        i7 = i262;
        i8 = i212;
        i9 = i232;
        z8 = false;
        int[] iArr6222222 = this.f6689t;
        iArr6222222[0] = i6;
        iArr6222222[1] = i7;
        if (z8) {
        }
        z9 = false;
        if (z8) {
        }
        c2 = 0;
        z10 = false;
        if (iArr[c2] != 2) {
        }
        if (!z11) {
        }
        c1405c2 = this.f6643P;
        z12 = !c1405c2.m3360h();
        z13 = zArr2[0];
        boolean z212222222 = zArr2[1];
        i12 = this.f6682o;
        iArr2 = this.f6630C;
        if (i12 != 2) {
        }
        c1405c3 = c1405c9;
        c1405c4 = c1405c2;
        c1405c5 = c1405c;
        c1242f = m2931k3;
        c1242f2 = m2931k5;
        c1242f3 = m2931k4;
        c1242f4 = m2931k2;
        c1242f5 = m2931k;
        iArr3 = iArr2;
        if (z2) {
        }
        i16 = i15;
        if ((c1406d3.f6684p != 2 ? i14 : i16) != 0) {
        }
        c1242f9 = c1242f7;
        c1242f10 = c1242f8;
        if (z8) {
        }
        if (c1405c4.m3360h()) {
        }
        this.f6674k = false;
        this.f6676l = false;
    }

    /* renamed from: c */
    public boolean mo3352c() {
        return this.f6667g0 != 8;
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x03ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0455 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x04bc  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x04cf A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3383d(C1239c c1239c, boolean z2, boolean z3, boolean z4, boolean z5, C1242f c1242f, C1242f c1242f2, int i, boolean z6, C1405c c1405c, C1405c c1405c2, int i2, int i3, int i4, int i5, float f2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, int i6, int i7, int i8, int i9, float f3, boolean z12) {
        boolean z13;
        boolean z14;
        int i10;
        boolean z15;
        int i11;
        int i12;
        int i13;
        boolean z16;
        boolean z17;
        C1242f m2931k;
        C1242f m2931k2;
        C1242f c1242f3;
        C1242f c1242f4;
        C1242f c1242f5;
        C1242f c1242f6;
        boolean z18;
        int i14;
        char c2;
        int i15;
        C1405c c1405c3;
        C1242f c1242f7;
        int i16;
        boolean z19;
        C1242f c1242f8;
        boolean z20;
        boolean z21;
        int i17;
        int i18;
        C1242f c1242f9;
        int i19;
        boolean z22;
        int i20;
        boolean z23;
        C1405c c1405c4;
        C1242f c1242f10;
        C1242f c1242f11;
        boolean z24;
        int i21;
        C1406d c1406d;
        boolean z25;
        int i22;
        C1406d c1406d2;
        C1406d c1406d3;
        C1242f c1242f12;
        C1242f c1242f13;
        boolean z26;
        boolean z27;
        C1242f c1242f14;
        C1242f c1242f15;
        C1406d c1406d4;
        int i23;
        int i24;
        HashSet hashSet;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z28;
        boolean z29;
        boolean z30;
        int i29;
        int i30;
        C1242f c1242f16;
        int i31;
        int i32 = i8;
        int i33 = i9;
        C1242f m2931k3 = c1239c.m2931k(c1405c);
        C1242f m2931k4 = c1239c.m2931k(c1405c2);
        C1242f m2931k5 = c1239c.m2931k(c1405c.f6624f);
        C1242f m2931k6 = c1239c.m2931k(c1405c2.f6624f);
        boolean m3360h = c1405c.m3360h();
        boolean m3360h2 = c1405c2.m3360h();
        boolean m3360h3 = this.f6643P.m3360h();
        int i34 = m3360h2 ? (m3360h ? 1 : 0) + 1 : m3360h ? 1 : 0;
        if (m3360h3) {
            i34++;
        }
        int i35 = i34;
        int i36 = z7 ? 3 : i6;
        int m2943b = AbstractC1241e.m2943b(i);
        boolean z31 = (m2943b == 0 || m2943b == 1 || m2943b != 2 || i36 == 4) ? false : true;
        int i37 = this.f6668h;
        if (i37 == -1 || !z2) {
            i37 = i3;
            z13 = z31;
        } else {
            this.f6668h = -1;
            z13 = false;
        }
        int i38 = this.f6670i;
        if (i38 == -1 || z2) {
            z14 = z13;
        } else {
            this.f6670i = -1;
            i37 = i38;
            z14 = false;
        }
        int i39 = i37;
        if (this.f6667g0 == 8) {
            i10 = 0;
            z14 = false;
        } else {
            i10 = i39;
        }
        if (z12) {
            if (!m3360h && !m3360h2 && !m3360h3) {
                c1239c.m2924d(m2931k3, i2);
            } else if (m3360h && !m3360h2) {
                z15 = m3360h3;
                i11 = 8;
                c1239c.m2925e(m2931k3, m2931k5, c1405c.m3357e(), 8);
            }
            z15 = m3360h3;
            i11 = 8;
        } else {
            z15 = m3360h3;
            i11 = 8;
        }
        if (z14) {
            if (i35 == 2 || z7 || !(i36 == 1 || i36 == 0)) {
                if (i32 == -2) {
                    i32 = i10;
                }
                if (i33 == -2) {
                    i33 = i10;
                }
                if (i10 > 0 && i36 != 1) {
                    i10 = 0;
                }
                if (i32 > 0) {
                    c1239c.m2926f(m2931k4, m2931k3, i32, 8);
                    i10 = Math.max(i10, i32);
                }
                if (i33 > 0) {
                    if (!z3 || i36 != 1) {
                        c1239c.m2927g(m2931k4, m2931k3, i33, 8);
                    }
                    i10 = Math.min(i10, i33);
                }
                if (i36 == 1) {
                    if (z3) {
                        c1239c.m2925e(m2931k4, m2931k3, i10, 8);
                    } else if (z9) {
                        c1239c.m2925e(m2931k4, m2931k3, i10, 5);
                        c1239c.m2927g(m2931k4, m2931k3, i10, 8);
                    } else {
                        c1239c.m2925e(m2931k4, m2931k3, i10, 5);
                        c1239c.m2927g(m2931k4, m2931k3, i10, 8);
                    }
                } else if (i36 == 2) {
                    int i40 = c1405c.f6623e;
                    if (i40 == 3 || i40 == 5) {
                        m2931k = c1239c.m2931k(this.f6647T.mo3388i(3));
                        m2931k2 = c1239c.m2931k(this.f6647T.mo3388i(5));
                    } else {
                        m2931k = c1239c.m2931k(this.f6647T.mo3388i(2));
                        m2931k2 = c1239c.m2931k(this.f6647T.mo3388i(4));
                    }
                    C1238b m2932l = c1239c.m2932l();
                    i12 = i35;
                    m2932l.f5506d.m2909g(m2931k4, -1.0f);
                    m2932l.f5506d.m2909g(m2931k3, 1.0f);
                    m2932l.f5506d.m2909g(m2931k2, f3);
                    m2932l.f5506d.m2909g(m2931k, -f3);
                    c1239c.m2923c(m2932l);
                    z17 = z5;
                    i13 = i32;
                    z16 = z3 ? false : z14;
                } else {
                    i12 = i35;
                    i13 = i32;
                    z16 = z14;
                    z17 = true;
                }
            } else {
                int max = Math.max(i32, i10);
                if (i33 > 0) {
                    max = Math.min(i33, max);
                }
                c1239c.m2925e(m2931k4, m2931k3, max, 8);
                z17 = z5;
                i12 = i35;
                z16 = false;
                i13 = i32;
            }
            if (z12) {
                c1242f3 = c1242f;
                c1242f4 = c1242f2;
                c1242f5 = m2931k4;
                c1242f6 = m2931k3;
                z18 = z17;
                i14 = i12;
                c2 = 1;
                i15 = 2;
            } else if (z9) {
                c1242f3 = c1242f;
                c1242f4 = c1242f2;
                c1242f5 = m2931k4;
                c1242f6 = m2931k3;
                z18 = z17;
                i14 = i12;
                i15 = 2;
                c2 = 1;
            } else {
                if (!m3360h && !m3360h2 && !z15) {
                    c1405c4 = c1405c2;
                    c1242f15 = m2931k4;
                    z24 = z17;
                    c1242f14 = m2931k6;
                } else if (!m3360h || m3360h2) {
                    if (m3360h || !m3360h2) {
                        c1242f7 = m2931k6;
                        if (m3360h && m3360h2) {
                            C1406d c1406d5 = c1405c.f6624f.f6622d;
                            C1406d c1406d6 = c1405c2.f6624f.f6622d;
                            C1406d c1406d7 = this.f6647T;
                            int i41 = 6;
                            if (z16) {
                                if (i36 != 0) {
                                    if (i36 == 2) {
                                        if ((c1406d5 instanceof C1403a) || (c1406d6 instanceof C1403a)) {
                                            i16 = i36;
                                            i17 = 6;
                                            i18 = 5;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                            z22 = false;
                                            i20 = 4;
                                        } else {
                                            i16 = i36;
                                            i17 = 6;
                                            i18 = 5;
                                            z19 = true;
                                            z20 = true;
                                            z21 = true;
                                            z22 = false;
                                            i20 = 5;
                                        }
                                    } else if (i36 == 1) {
                                        i16 = i36;
                                        i17 = 6;
                                        i18 = 8;
                                        z19 = true;
                                        z20 = true;
                                        z21 = true;
                                        z22 = false;
                                        i20 = 4;
                                    } else if (i36 == 3) {
                                        i16 = i36;
                                        if (this.f6628A == -1) {
                                            if (z10) {
                                                c1242f8 = c1242f2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = z3 ? 5 : 4;
                                            } else {
                                                c1242f8 = c1242f2;
                                                i18 = 8;
                                                z19 = true;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 8;
                                            }
                                        } else if (z7) {
                                            if (i7 != 2) {
                                                z19 = true;
                                                if (i7 != 1) {
                                                    i18 = 8;
                                                    i27 = 5;
                                                    i20 = i27;
                                                    z20 = z19;
                                                    z21 = z20;
                                                    z22 = z21;
                                                    i17 = 6;
                                                }
                                            } else {
                                                z19 = true;
                                            }
                                            i18 = 5;
                                            i27 = 4;
                                            i20 = i27;
                                            z20 = z19;
                                            z21 = z20;
                                            z22 = z21;
                                            i17 = 6;
                                        } else {
                                            z19 = true;
                                            if (i33 > 0) {
                                                c1242f8 = c1242f2;
                                                z20 = true;
                                                z21 = true;
                                                z22 = true;
                                                i17 = 6;
                                                i18 = 5;
                                            } else {
                                                if (i33 != 0 || i13 != 0) {
                                                    c1242f8 = c1242f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                } else if (z10) {
                                                    i18 = (c1406d5 == c1406d7 || c1406d6 == c1406d7) ? 5 : 4;
                                                    c1242f8 = c1242f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                } else {
                                                    c1242f8 = c1242f2;
                                                    z20 = true;
                                                    z21 = true;
                                                    z22 = true;
                                                    i17 = 6;
                                                    i18 = 5;
                                                    i20 = 8;
                                                    if (z21 || m2931k5 != c1242f7 || c1406d5 == c1406d7) {
                                                        z23 = z19;
                                                    } else {
                                                        z21 = false;
                                                        z23 = false;
                                                    }
                                                    if (z20) {
                                                        if (z16 || z8 || z10 || m2931k5 != c1242f || c1242f7 != c1242f8) {
                                                            z26 = z3;
                                                            i25 = i17;
                                                            i26 = i18;
                                                        } else {
                                                            z26 = false;
                                                            i26 = 8;
                                                            z23 = false;
                                                            i25 = 8;
                                                        }
                                                        c1406d2 = c1406d6;
                                                        c1405c4 = c1405c2;
                                                        z24 = z17;
                                                        c1406d3 = c1406d5;
                                                        i21 = i13;
                                                        c1242f10 = c1242f7;
                                                        i22 = 4;
                                                        z25 = true;
                                                        c1242f12 = m2931k5;
                                                        c1406d = c1406d7;
                                                        c1242f11 = m2931k4;
                                                        c1242f13 = m2931k3;
                                                        c1239c.m2922b(m2931k3, m2931k5, c1405c.m3357e(), f2, c1242f7, m2931k4, c1405c2.m3357e(), i25);
                                                        i18 = i26;
                                                    } else {
                                                        c1405c4 = c1405c2;
                                                        c1242f10 = c1242f7;
                                                        c1242f11 = m2931k4;
                                                        z24 = z17;
                                                        i21 = i13;
                                                        c1406d = c1406d7;
                                                        z25 = z19;
                                                        i22 = 4;
                                                        c1406d2 = c1406d6;
                                                        c1406d3 = c1406d5;
                                                        c1242f12 = m2931k5;
                                                        c1242f13 = m2931k3;
                                                        z26 = z3;
                                                    }
                                                    z27 = z23;
                                                    if (this.f6667g0 != 8 && ((hashSet = c1405c4.f6619a) == null || hashSet.size() <= 0)) {
                                                        return;
                                                    }
                                                    c1242f14 = c1242f10;
                                                    if (z21) {
                                                        if (z26 && c1242f12 != c1242f14 && !z16 && ((c1406d3 instanceof C1403a) || (c1406d2 instanceof C1403a))) {
                                                            i18 = 6;
                                                        }
                                                        c1239c.m2926f(c1242f13, c1242f12, c1405c.m3357e(), i18);
                                                        c1242f15 = c1242f11;
                                                        c1239c.m2927g(c1242f15, c1242f14, -c1405c2.m3357e(), i18);
                                                    } else {
                                                        c1242f15 = c1242f11;
                                                    }
                                                    if (z26 || !z11 || (c1406d3 instanceof C1403a) || (c1406d2 instanceof C1403a)) {
                                                        c1406d4 = c1406d;
                                                    } else {
                                                        c1406d4 = c1406d;
                                                        if (c1406d2 != c1406d4) {
                                                            i18 = 6;
                                                            i23 = 6;
                                                            z27 = z25;
                                                            if (z27) {
                                                                if (z22 && (!z10 || z4)) {
                                                                    if (c1406d3 != c1406d4 && c1406d2 != c1406d4) {
                                                                        i41 = i23;
                                                                    }
                                                                    if ((c1406d3 instanceof C1410h) || (c1406d2 instanceof C1410h)) {
                                                                        i41 = 5;
                                                                    }
                                                                    if ((c1406d3 instanceof C1403a) || (c1406d2 instanceof C1403a)) {
                                                                        i41 = 5;
                                                                    }
                                                                    i23 = Math.max(z10 ? 5 : i41, i23);
                                                                }
                                                                int i42 = i23;
                                                                if (z26) {
                                                                    i42 = Math.min(i18, i42);
                                                                    if (z7 && !z10 && (c1406d3 == c1406d4 || c1406d2 == c1406d4)) {
                                                                        i42 = i22;
                                                                    }
                                                                }
                                                                c1239c.m2925e(c1242f13, c1242f12, c1405c.m3357e(), i42);
                                                                c1239c.m2925e(c1242f15, c1242f14, -c1405c2.m3357e(), i42);
                                                            }
                                                            if (z26) {
                                                                C1242f c1242f17 = c1242f12;
                                                                int m3357e = c1242f == c1242f17 ? c1405c.m3357e() : 0;
                                                                if (c1242f17 != c1242f) {
                                                                    c1239c.m2926f(c1242f13, c1242f, m3357e, 5);
                                                                }
                                                            }
                                                            if (z26 && z16 && i4 == 0 && i21 == 0) {
                                                                if (z16 || i16 != 3) {
                                                                    i24 = 5;
                                                                    c1239c.m2926f(c1242f15, c1242f13, 0, 5);
                                                                } else {
                                                                    c1239c.m2926f(c1242f15, c1242f13, 0, 8);
                                                                }
                                                            }
                                                            i24 = 5;
                                                        }
                                                    }
                                                    i23 = i20;
                                                    if (z27) {
                                                    }
                                                    if (z26) {
                                                    }
                                                    if (z26) {
                                                        if (z16) {
                                                        }
                                                        i24 = 5;
                                                        c1239c.m2926f(c1242f15, c1242f13, 0, 5);
                                                    }
                                                    i24 = 5;
                                                }
                                                i20 = 4;
                                                if (z21) {
                                                }
                                                z23 = z19;
                                                if (z20) {
                                                }
                                                z27 = z23;
                                                if (this.f6667g0 != 8) {
                                                }
                                                c1242f14 = c1242f10;
                                                if (z21) {
                                                }
                                                if (z26) {
                                                }
                                                c1406d4 = c1406d;
                                                i23 = i20;
                                                if (z27) {
                                                }
                                                if (z26) {
                                                }
                                                if (z26) {
                                                }
                                                i24 = 5;
                                            }
                                        }
                                        i20 = 5;
                                        if (z21) {
                                        }
                                        z23 = z19;
                                        if (z20) {
                                        }
                                        z27 = z23;
                                        if (this.f6667g0 != 8) {
                                        }
                                        c1242f14 = c1242f10;
                                        if (z21) {
                                        }
                                        if (z26) {
                                        }
                                        c1406d4 = c1406d;
                                        i23 = i20;
                                        if (z27) {
                                        }
                                        if (z26) {
                                        }
                                        if (z26) {
                                        }
                                        i24 = 5;
                                    } else {
                                        i16 = i36;
                                        z19 = true;
                                        c1242f8 = c1242f2;
                                        i17 = 6;
                                        i18 = 5;
                                        z20 = false;
                                        z21 = false;
                                    }
                                    i30 = i24;
                                    if (z26 || !z24) {
                                        return;
                                    }
                                    if (c1405c4.f6624f != null) {
                                        i31 = c1405c2.m3357e();
                                        c1242f16 = c1242f2;
                                    } else {
                                        c1242f16 = c1242f2;
                                        i31 = 0;
                                    }
                                    if (c1242f14 != c1242f16) {
                                        c1239c.m2926f(c1242f16, c1242f15, i31, i30);
                                        return;
                                    }
                                    return;
                                }
                                if (i33 != 0 || i13 != 0) {
                                    i28 = 5;
                                    z28 = true;
                                    z29 = false;
                                    z30 = true;
                                    i29 = 5;
                                } else if (m2931k5.f5535f && c1242f7.f5535f) {
                                    c1239c.m2925e(m2931k3, m2931k5, c1405c.m3357e(), 8);
                                    c1239c.m2925e(m2931k4, c1242f7, -c1405c2.m3357e(), 8);
                                    return;
                                } else {
                                    i28 = 8;
                                    z28 = false;
                                    z29 = true;
                                    z30 = false;
                                    i29 = 8;
                                }
                                if ((c1406d5 instanceof C1403a) || (c1406d6 instanceof C1403a)) {
                                    i18 = i28;
                                    i17 = 6;
                                    z21 = z30;
                                    z19 = true;
                                    i20 = 4;
                                } else {
                                    i18 = i28;
                                    z21 = z30;
                                    i20 = i29;
                                    z19 = true;
                                    i17 = 6;
                                }
                                z22 = z29;
                                z20 = z28;
                                i16 = i36;
                                c1242f8 = c1242f2;
                                if (z21) {
                                }
                                z23 = z19;
                                if (z20) {
                                }
                                z27 = z23;
                                if (this.f6667g0 != 8) {
                                }
                                c1242f14 = c1242f10;
                                if (z21) {
                                }
                                if (z26) {
                                }
                                c1406d4 = c1406d;
                                i23 = i20;
                                if (z27) {
                                }
                                if (z26) {
                                }
                                if (z26) {
                                }
                                i24 = 5;
                                i30 = i24;
                                if (z26) {
                                    return;
                                } else {
                                    return;
                                }
                            }
                            i16 = i36;
                            z19 = true;
                            if (m2931k5.f5535f && c1242f7.f5535f) {
                                c1239c.m2922b(m2931k3, m2931k5, c1405c.m3357e(), f2, c1242f7, m2931k4, c1405c2.m3357e(), 8);
                                if (z3 && z17) {
                                    if (c1405c2.f6624f != null) {
                                        i19 = c1405c2.m3357e();
                                        c1242f9 = c1242f2;
                                    } else {
                                        c1242f9 = c1242f2;
                                        i19 = 0;
                                    }
                                    if (c1242f7 != c1242f9) {
                                        c1239c.m2926f(c1242f9, m2931k4, i19, 5);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            c1242f8 = c1242f2;
                            z20 = true;
                            z21 = true;
                            i17 = 6;
                            i18 = 5;
                            z22 = false;
                            i20 = 4;
                            if (z21) {
                            }
                            z23 = z19;
                            if (z20) {
                            }
                            z27 = z23;
                            if (this.f6667g0 != 8) {
                            }
                            c1242f14 = c1242f10;
                            if (z21) {
                            }
                            if (z26) {
                            }
                            c1406d4 = c1406d;
                            i23 = i20;
                            if (z27) {
                            }
                            if (z26) {
                            }
                            if (z26) {
                            }
                            i24 = 5;
                            i30 = i24;
                            if (z26) {
                            }
                        }
                    } else {
                        c1242f7 = m2931k6;
                        c1239c.m2925e(m2931k4, c1242f7, -c1405c2.m3357e(), 8);
                        if (z3) {
                            c1239c.m2926f(m2931k3, c1242f, 0, 5);
                            c1405c4 = c1405c2;
                            i24 = 5;
                            c1242f14 = c1242f7;
                            c1242f15 = m2931k4;
                            z24 = z17;
                            z26 = z3;
                            i30 = i24;
                            if (z26) {
                            }
                        }
                    }
                    c1405c4 = c1405c2;
                    c1242f14 = c1242f7;
                    c1242f15 = m2931k4;
                    z24 = z17;
                } else {
                    c1405c4 = c1405c2;
                    c1242f15 = m2931k4;
                    z24 = z17;
                    i30 = (z3 && (c1405c.f6624f.f6622d instanceof C1403a)) ? 8 : 5;
                    c1242f14 = m2931k6;
                    z26 = z3;
                    if (z26) {
                    }
                }
                i24 = 5;
                z26 = z3;
                i30 = i24;
                if (z26) {
                }
            }
            if (i14 >= i15 && z3 && z18) {
                c1239c.m2926f(c1242f6, c1242f3, 0, 8);
                C1405c c1405c5 = this.f6640M;
                char c3 = (z2 || c1405c5.f6624f == null) ? c2 : (char) 0;
                if (!z2 && (c1405c3 = c1405c5.f6624f) != null) {
                    C1406d c1406d8 = c1405c3.f6622d;
                    if (c1406d8.f6650W != 0.0f) {
                        int[] iArr = c1406d8.f6685p0;
                        if (iArr[0] == 3 && iArr[c2] == 3) {
                            c3 = c2;
                        }
                    }
                    c3 = 0;
                }
                if (c3 != 0) {
                    c1239c.m2926f(c1242f4, c1242f5, 0, 8);
                    return;
                }
                return;
            }
            return;
        }
        if (z6) {
            c1239c.m2925e(m2931k4, m2931k3, 0, 3);
            if (i4 > 0) {
                c1239c.m2926f(m2931k4, m2931k3, i4, 8);
            }
            if (i5 < Integer.MAX_VALUE) {
                c1239c.m2927g(m2931k4, m2931k3, i5, 8);
            }
        } else {
            c1239c.m2925e(m2931k4, m2931k3, i10, i11);
        }
        z17 = z5;
        i12 = i35;
        i13 = i32;
        z16 = z14;
        if (z12) {
        }
        if (i14 >= i15) {
        }
    }

    /* renamed from: e */
    public final void m3384e(int i, C1406d c1406d, int i2, int i3) {
        boolean z2;
        if (i == 7) {
            if (i2 != 7) {
                if (i2 == 2 || i2 == 4) {
                    m3384e(2, c1406d, i2, 0);
                    m3384e(4, c1406d, i2, 0);
                    mo3388i(7).m3353a(c1406d.mo3388i(i2), 0);
                    return;
                } else {
                    if (i2 == 3 || i2 == 5) {
                        m3384e(3, c1406d, i2, 0);
                        m3384e(5, c1406d, i2, 0);
                        mo3388i(7).m3353a(c1406d.mo3388i(i2), 0);
                        return;
                    }
                    return;
                }
            }
            C1405c mo3388i = mo3388i(2);
            C1405c mo3388i2 = mo3388i(4);
            C1405c mo3388i3 = mo3388i(3);
            C1405c mo3388i4 = mo3388i(5);
            boolean z3 = true;
            if ((mo3388i == null || !mo3388i.m3360h()) && (mo3388i2 == null || !mo3388i2.m3360h())) {
                m3384e(2, c1406d, 2, 0);
                m3384e(4, c1406d, 4, 0);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((mo3388i3 == null || !mo3388i3.m3360h()) && (mo3388i4 == null || !mo3388i4.m3360h())) {
                m3384e(3, c1406d, 3, 0);
                m3384e(5, c1406d, 5, 0);
            } else {
                z3 = false;
            }
            if (z2 && z3) {
                mo3388i(7).m3353a(c1406d.mo3388i(7), 0);
                return;
            } else if (z2) {
                mo3388i(8).m3353a(c1406d.mo3388i(8), 0);
                return;
            } else {
                if (z3) {
                    mo3388i(9).m3353a(c1406d.mo3388i(9), 0);
                    return;
                }
                return;
            }
        }
        if (i == 8 && (i2 == 2 || i2 == 4)) {
            C1405c mo3388i5 = mo3388i(2);
            C1405c mo3388i6 = c1406d.mo3388i(i2);
            C1405c mo3388i7 = mo3388i(4);
            mo3388i5.m3353a(mo3388i6, 0);
            mo3388i7.m3353a(mo3388i6, 0);
            mo3388i(8).m3353a(mo3388i6, 0);
            return;
        }
        if (i == 9 && (i2 == 3 || i2 == 5)) {
            C1405c mo3388i8 = c1406d.mo3388i(i2);
            mo3388i(3).m3353a(mo3388i8, 0);
            mo3388i(5).m3353a(mo3388i8, 0);
            mo3388i(9).m3353a(mo3388i8, 0);
            return;
        }
        if (i == 8 && i2 == 8) {
            mo3388i(2).m3353a(c1406d.mo3388i(2), 0);
            mo3388i(4).m3353a(c1406d.mo3388i(4), 0);
            mo3388i(8).m3353a(c1406d.mo3388i(i2), 0);
            return;
        }
        if (i == 9 && i2 == 9) {
            mo3388i(3).m3353a(c1406d.mo3388i(3), 0);
            mo3388i(5).m3353a(c1406d.mo3388i(5), 0);
            mo3388i(9).m3353a(c1406d.mo3388i(i2), 0);
            return;
        }
        C1405c mo3388i9 = mo3388i(i);
        C1405c mo3388i10 = c1406d.mo3388i(i2);
        if (mo3388i9.m3361i(mo3388i10)) {
            if (i == 6) {
                C1405c mo3388i11 = mo3388i(3);
                C1405c mo3388i12 = mo3388i(5);
                if (mo3388i11 != null) {
                    mo3388i11.m3362j();
                }
                if (mo3388i12 != null) {
                    mo3388i12.m3362j();
                }
            } else if (i == 3 || i == 5) {
                C1405c mo3388i13 = mo3388i(6);
                if (mo3388i13 != null) {
                    mo3388i13.m3362j();
                }
                C1405c mo3388i14 = mo3388i(7);
                if (mo3388i14.f6624f != mo3388i10) {
                    mo3388i14.m3362j();
                }
                C1405c m3358f = mo3388i(i).m3358f();
                C1405c mo3388i15 = mo3388i(9);
                if (mo3388i15.m3360h()) {
                    m3358f.m3362j();
                    mo3388i15.m3362j();
                }
            } else if (i == 2 || i == 4) {
                C1405c mo3388i16 = mo3388i(7);
                if (mo3388i16.f6624f != mo3388i10) {
                    mo3388i16.m3362j();
                }
                C1405c m3358f2 = mo3388i(i).m3358f();
                C1405c mo3388i17 = mo3388i(8);
                if (mo3388i17.m3360h()) {
                    m3358f2.m3362j();
                    mo3388i17.m3362j();
                }
            }
            mo3388i9.m3353a(mo3388i10, i3);
        }
    }

    /* renamed from: f */
    public final void m3385f(C1405c c1405c, C1405c c1405c2, int i) {
        if (c1405c.f6622d == this) {
            m3384e(c1405c.f6623e, c1405c2.f6622d, c1405c2.f6623e, i);
        }
    }

    /* renamed from: g */
    public final void m3386g(C1239c c1239c) {
        c1239c.m2931k(this.f6636I);
        c1239c.m2931k(this.f6637J);
        c1239c.m2931k(this.f6638K);
        c1239c.m2931k(this.f6639L);
        if (this.f6655a0 > 0) {
            c1239c.m2931k(this.f6640M);
        }
    }

    /* renamed from: h */
    public final void m3387h() {
        if (this.f6660d == null) {
            C1450k c1450k = new C1450k(this);
            c1450k.f6848h.f6820e = 4;
            c1450k.f6849i.f6820e = 5;
            c1450k.f6846f = 0;
            this.f6660d = c1450k;
        }
        if (this.f6662e == null) {
            C1452m c1452m = new C1452m(this);
            C1445f c1445f = new C1445f(c1452m);
            c1452m.f6833k = c1445f;
            c1452m.f6834l = null;
            c1452m.f6848h.f6820e = 6;
            c1452m.f6849i.f6820e = 7;
            c1445f.f6820e = 8;
            c1452m.f6846f = 1;
            this.f6662e = c1452m;
        }
    }

    /* renamed from: i */
    public C1405c mo3388i(int i) {
        switch (AbstractC1241e.m2943b(i)) {
            case 0:
                return null;
            case 1:
                return this.f6636I;
            case 2:
                return this.f6637J;
            case 3:
                return this.f6638K;
            case 4:
                return this.f6639L;
            case 5:
                return this.f6640M;
            case 6:
                return this.f6643P;
            case 7:
                return this.f6641N;
            case 8:
                return this.f6642O;
            default:
                throw new AssertionError(AbstractC0062j.m170x(i));
        }
    }

    /* renamed from: j */
    public final int m3389j(int i) {
        int[] iArr = this.f6685p0;
        if (i == 0) {
            return iArr[0];
        }
        if (i == 1) {
            return iArr[1];
        }
        return 0;
    }

    /* renamed from: k */
    public final int m3390k() {
        if (this.f6667g0 == 8) {
            return 0;
        }
        return this.f6649V;
    }

    /* renamed from: l */
    public final C1406d m3391l(int i) {
        C1405c c1405c;
        C1405c c1405c2;
        if (i != 0) {
            if (i == 1 && (c1405c2 = (c1405c = this.f6639L).f6624f) != null && c1405c2.f6624f == c1405c) {
                return c1405c2.f6622d;
            }
            return null;
        }
        C1405c c1405c3 = this.f6638K;
        C1405c c1405c4 = c1405c3.f6624f;
        if (c1405c4 == null || c1405c4.f6624f != c1405c3) {
            return null;
        }
        return c1405c4.f6622d;
    }

    /* renamed from: m */
    public final C1406d m3392m(int i) {
        C1405c c1405c;
        C1405c c1405c2;
        if (i != 0) {
            if (i == 1 && (c1405c2 = (c1405c = this.f6637J).f6624f) != null && c1405c2.f6624f == c1405c) {
                return c1405c2.f6622d;
            }
            return null;
        }
        C1405c c1405c3 = this.f6636I;
        C1405c c1405c4 = c1405c3.f6624f;
        if (c1405c4 == null || c1405c4.f6624f != c1405c3) {
            return null;
        }
        return c1405c4.f6622d;
    }

    /* renamed from: n */
    public void mo3393n(StringBuilder sb) {
        sb.append("  " + this.f6672j + ":{\n");
        StringBuilder sb2 = new StringBuilder("    actualWidth:");
        sb2.append(this.f6648U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("    actualHeight:" + this.f6649V);
        sb.append("\n");
        sb.append("    actualLeft:" + this.f6652Y);
        sb.append("\n");
        sb.append("    actualTop:" + this.f6653Z);
        sb.append("\n");
        m3368p(sb, "left", this.f6636I);
        m3368p(sb, "top", this.f6637J);
        m3368p(sb, "right", this.f6638K);
        m3368p(sb, "bottom", this.f6639L);
        m3368p(sb, "baseline", this.f6640M);
        m3368p(sb, "centerX", this.f6641N);
        m3368p(sb, "centerY", this.f6642O);
        int i = this.f6648U;
        int i2 = this.f6657b0;
        int[] iArr = this.f6630C;
        int i3 = iArr[0];
        int i4 = this.f6690u;
        int i5 = this.f6687r;
        float f2 = this.f6692w;
        float[] fArr = this.f6675k0;
        float f3 = fArr[0];
        m3367o(sb, "    width", i, i2, i3, i4, i5, f2);
        int i6 = this.f6649V;
        int i7 = this.f6659c0;
        int i8 = iArr[1];
        int i9 = this.f6693x;
        int i10 = this.f6688s;
        float f4 = this.f6695z;
        float f5 = fArr[1];
        m3367o(sb, "    height", i6, i7, i8, i9, i10, f4);
        float f6 = this.f6650W;
        int i11 = this.f6651X;
        if (f6 != 0.0f) {
            sb.append("    dimensionRatio");
            sb.append(" :  [");
            sb.append(f6);
            sb.append(",");
            sb.append(i11);
            sb.append("");
            sb.append("],\n");
        }
        m3366H(sb, "    horizontalBias", this.f6661d0, 0.5f);
        m3366H(sb, "    verticalBias", this.f6663e0, 0.5f);
        m3365G(this.f6671i0, 0, "    horizontalChainStyle", sb);
        m3365G(this.f6673j0, 0, "    verticalChainStyle", sb);
        sb.append("  }");
    }

    /* renamed from: q */
    public final int m3394q() {
        if (this.f6667g0 == 8) {
            return 0;
        }
        return this.f6648U;
    }

    /* renamed from: r */
    public final int m3395r() {
        C1406d c1406d = this.f6647T;
        return (c1406d == null || !(c1406d instanceof C1407e)) ? this.f6652Y : ((C1407e) c1406d).f6715x0 + this.f6652Y;
    }

    /* renamed from: s */
    public final int m3396s() {
        C1406d c1406d = this.f6647T;
        return (c1406d == null || !(c1406d instanceof C1407e)) ? this.f6653Z : ((C1407e) c1406d).f6716y0 + this.f6653Z;
    }

    /* renamed from: t */
    public final boolean m3397t(int i) {
        if (i == 0) {
            return (this.f6636I.f6624f != null ? 1 : 0) + (this.f6638K.f6624f != null ? 1 : 0) < 2;
        }
        return ((this.f6637J.f6624f != null ? 1 : 0) + (this.f6639L.f6624f != null ? 1 : 0)) + (this.f6640M.f6624f != null ? 1 : 0) < 2;
    }

    public String toString() {
        StringBuilder m2942a = AbstractC1241e.m2942a("");
        m2942a.append(this.f6669h0 != null ? AbstractC0062j.m162p(new StringBuilder("id: "), this.f6669h0, " ") : "");
        m2942a.append("(");
        m2942a.append(this.f6652Y);
        m2942a.append(", ");
        m2942a.append(this.f6653Z);
        m2942a.append(") - (");
        m2942a.append(this.f6648U);
        m2942a.append(" x ");
        m2942a.append(this.f6649V);
        m2942a.append(")");
        return m2942a.toString();
    }

    /* renamed from: u */
    public final boolean m3398u(int i, int i2) {
        C1405c c1405c;
        C1405c c1405c2;
        C1405c c1405c3;
        C1405c c1405c4;
        if (i == 0) {
            C1405c c1405c5 = this.f6636I;
            C1405c c1405c6 = c1405c5.f6624f;
            if (c1405c6 != null && c1405c6.f6621c && (c1405c4 = (c1405c3 = this.f6638K).f6624f) != null && c1405c4.f6621c) {
                return (c1405c4.m3356d() - c1405c3.m3357e()) - (c1405c5.m3357e() + c1405c5.f6624f.m3356d()) >= i2;
            }
        } else {
            C1405c c1405c7 = this.f6637J;
            C1405c c1405c8 = c1405c7.f6624f;
            if (c1405c8 != null && c1405c8.f6621c && (c1405c2 = (c1405c = this.f6639L).f6624f) != null && c1405c2.f6621c) {
                return (c1405c2.m3356d() - c1405c.m3357e()) - (c1405c7.m3357e() + c1405c7.f6624f.m3356d()) >= i2;
            }
        }
        return false;
    }

    /* renamed from: v */
    public final void m3399v(int i, int i2, int i3, int i4, C1406d c1406d) {
        mo3388i(i).m3354b(c1406d.mo3388i(i2), i3, i4, true);
    }

    /* renamed from: w */
    public final boolean m3400w(int i) {
        C1405c c1405c;
        C1405c c1405c2;
        int i2 = i * 2;
        C1405c[] c1405cArr = this.f6644Q;
        C1405c c1405c3 = c1405cArr[i2];
        C1405c c1405c4 = c1405c3.f6624f;
        return (c1405c4 == null || c1405c4.f6624f == c1405c3 || (c1405c2 = (c1405c = c1405cArr[i2 + 1]).f6624f) == null || c1405c2.f6624f != c1405c) ? false : true;
    }

    /* renamed from: x */
    public final boolean m3401x() {
        C1405c c1405c = this.f6636I;
        C1405c c1405c2 = c1405c.f6624f;
        if (c1405c2 != null && c1405c2.f6624f == c1405c) {
            return true;
        }
        C1405c c1405c3 = this.f6638K;
        C1405c c1405c4 = c1405c3.f6624f;
        return c1405c4 != null && c1405c4.f6624f == c1405c3;
    }

    /* renamed from: y */
    public final boolean m3402y() {
        C1405c c1405c = this.f6637J;
        C1405c c1405c2 = c1405c.f6624f;
        if (c1405c2 != null && c1405c2.f6624f == c1405c) {
            return true;
        }
        C1405c c1405c3 = this.f6639L;
        C1405c c1405c4 = c1405c3.f6624f;
        return c1405c4 != null && c1405c4.f6624f == c1405c3;
    }

    /* renamed from: z */
    public final boolean m3403z() {
        return this.f6666g && this.f6667g0 != 8;
    }
}
