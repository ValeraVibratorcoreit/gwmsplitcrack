package p102s;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p022K.C0198k;
import p097q.C1239c;
import p097q.C1242f;
import p105t.AbstractC1447h;
import p105t.AbstractC1454o;
import p105t.C1441b;
import p105t.C1442c;
import p105t.C1444e;
import p105t.C1453n;
import p111v.C1593e;

/* renamed from: s.e */
/* loaded from: classes.dex */
public final class C1407e extends C1406d {

    /* renamed from: A0 */
    public int f6696A0;

    /* renamed from: B0 */
    public C1404b[] f6697B0;

    /* renamed from: C0 */
    public C1404b[] f6698C0;

    /* renamed from: D0 */
    public int f6699D0;

    /* renamed from: E0 */
    public boolean f6700E0;

    /* renamed from: F0 */
    public boolean f6701F0;

    /* renamed from: G0 */
    public WeakReference f6702G0;

    /* renamed from: H0 */
    public WeakReference f6703H0;

    /* renamed from: I0 */
    public WeakReference f6704I0;

    /* renamed from: J0 */
    public WeakReference f6705J0;

    /* renamed from: K0 */
    public final HashSet f6706K0;

    /* renamed from: L0 */
    public final C1441b f6707L0;

    /* renamed from: q0 */
    public ArrayList f6708q0 = new ArrayList();

    /* renamed from: r0 */
    public final C0198k f6709r0 = new C0198k(this);

    /* renamed from: s0 */
    public final C1444e f6710s0;

    /* renamed from: t0 */
    public int f6711t0;

    /* renamed from: u0 */
    public C1593e f6712u0;

    /* renamed from: v0 */
    public boolean f6713v0;

    /* renamed from: w0 */
    public final C1239c f6714w0;

    /* renamed from: x0 */
    public int f6715x0;

    /* renamed from: y0 */
    public int f6716y0;

    /* renamed from: z0 */
    public int f6717z0;

    public C1407e() {
        C1444e c1444e = new C1444e();
        c1444e.f6809b = true;
        c1444e.f6810c = true;
        c1444e.f6812e = new ArrayList();
        new ArrayList();
        c1444e.f6813f = null;
        c1444e.f6814g = new C1441b();
        c1444e.f6815h = new ArrayList();
        c1444e.f6808a = this;
        c1444e.f6811d = this;
        this.f6710s0 = c1444e;
        this.f6712u0 = null;
        this.f6713v0 = false;
        this.f6714w0 = new C1239c();
        this.f6717z0 = 0;
        this.f6696A0 = 0;
        this.f6697B0 = new C1404b[4];
        this.f6698C0 = new C1404b[4];
        this.f6699D0 = 257;
        this.f6700E0 = false;
        this.f6701F0 = false;
        this.f6702G0 = null;
        this.f6703H0 = null;
        this.f6704I0 = null;
        this.f6705J0 = null;
        this.f6706K0 = new HashSet();
        this.f6707L0 = new C1441b();
    }

    /* renamed from: V */
    public static void m3404V(C1406d c1406d, C1593e c1593e, C1441b c1441b) {
        int i;
        int i2;
        if (c1593e == null) {
            return;
        }
        if (c1406d.f6667g0 == 8 || (c1406d instanceof C1410h) || (c1406d instanceof C1403a)) {
            c1441b.f6800e = 0;
            c1441b.f6801f = 0;
            return;
        }
        int[] iArr = c1406d.f6685p0;
        c1441b.f6796a = iArr[0];
        c1441b.f6797b = iArr[1];
        c1441b.f6798c = c1406d.m3394q();
        c1441b.f6799d = c1406d.m3390k();
        c1441b.f6804i = false;
        c1441b.f6805j = 0;
        boolean z2 = c1441b.f6796a == 3;
        boolean z3 = c1441b.f6797b == 3;
        boolean z4 = z2 && c1406d.f6650W > 0.0f;
        boolean z5 = z3 && c1406d.f6650W > 0.0f;
        if (z2 && c1406d.m3397t(0) && c1406d.f6687r == 0 && !z4) {
            c1441b.f6796a = 2;
            if (z3 && c1406d.f6688s == 0) {
                c1441b.f6796a = 1;
            }
            z2 = false;
        }
        if (z3 && c1406d.m3397t(1) && c1406d.f6688s == 0 && !z5) {
            c1441b.f6797b = 2;
            if (z2 && c1406d.f6687r == 0) {
                c1441b.f6797b = 1;
            }
            z3 = false;
        }
        if (c1406d.mo3347A()) {
            c1441b.f6796a = 1;
            z2 = false;
        }
        if (c1406d.mo3348B()) {
            c1441b.f6797b = 1;
            z3 = false;
        }
        int[] iArr2 = c1406d.f6689t;
        if (z4) {
            if (iArr2[0] == 4) {
                c1441b.f6796a = 1;
            } else if (!z3) {
                if (c1441b.f6797b == 1) {
                    i2 = c1441b.f6799d;
                } else {
                    c1441b.f6796a = 2;
                    c1593e.m4750b(c1406d, c1441b);
                    i2 = c1441b.f6801f;
                }
                c1441b.f6796a = 1;
                c1441b.f6798c = (int) (c1406d.f6650W * i2);
            }
        }
        if (z5) {
            if (iArr2[1] == 4) {
                c1441b.f6797b = 1;
            } else if (!z2) {
                if (c1441b.f6796a == 1) {
                    i = c1441b.f6798c;
                } else {
                    c1441b.f6797b = 2;
                    c1593e.m4750b(c1406d, c1441b);
                    i = c1441b.f6800e;
                }
                c1441b.f6797b = 1;
                if (c1406d.f6651X == -1) {
                    c1441b.f6799d = (int) (i / c1406d.f6650W);
                } else {
                    c1441b.f6799d = (int) (c1406d.f6650W * i);
                }
            }
        }
        c1593e.m4750b(c1406d, c1441b);
        c1406d.m3379O(c1441b.f6800e);
        c1406d.m3376L(c1441b.f6801f);
        c1406d.f6632E = c1441b.f6803h;
        c1406d.m3373I(c1441b.f6802g);
        c1441b.f6805j = 0;
    }

    @Override // p102s.C1406d
    /* renamed from: C */
    public final void mo3369C() {
        this.f6714w0.m2939t();
        this.f6715x0 = 0;
        this.f6716y0 = 0;
        this.f6708q0.clear();
        super.mo3369C();
    }

    @Override // p102s.C1406d
    /* renamed from: F */
    public final void mo3372F(C0198k c0198k) {
        super.mo3372F(c0198k);
        int size = this.f6708q0.size();
        for (int i = 0; i < size; i++) {
            ((C1406d) this.f6708q0.get(i)).mo3372F(c0198k);
        }
    }

    @Override // p102s.C1406d
    /* renamed from: P */
    public final void mo3380P(boolean z2, boolean z3) {
        super.mo3380P(z2, z3);
        int size = this.f6708q0.size();
        for (int i = 0; i < size; i++) {
            ((C1406d) this.f6708q0.get(i)).mo3380P(z2, z3);
        }
    }

    /* renamed from: R */
    public final void m3405R(C1406d c1406d, int i) {
        if (i == 0) {
            int i2 = this.f6717z0 + 1;
            C1404b[] c1404bArr = this.f6698C0;
            if (i2 >= c1404bArr.length) {
                this.f6698C0 = (C1404b[]) Arrays.copyOf(c1404bArr, c1404bArr.length * 2);
            }
            C1404b[] c1404bArr2 = this.f6698C0;
            int i3 = this.f6717z0;
            c1404bArr2[i3] = new C1404b(c1406d, 0, this.f6713v0);
            this.f6717z0 = i3 + 1;
            return;
        }
        if (i == 1) {
            int i4 = this.f6696A0 + 1;
            C1404b[] c1404bArr3 = this.f6697B0;
            if (i4 >= c1404bArr3.length) {
                this.f6697B0 = (C1404b[]) Arrays.copyOf(c1404bArr3, c1404bArr3.length * 2);
            }
            C1404b[] c1404bArr4 = this.f6697B0;
            int i5 = this.f6696A0;
            c1404bArr4[i5] = new C1404b(c1406d, 1, this.f6713v0);
            this.f6696A0 = i5 + 1;
        }
    }

    /* renamed from: S */
    public final void m3406S(C1239c c1239c) {
        boolean m3409W = m3409W(64);
        mo3351b(c1239c, m3409W);
        int size = this.f6708q0.size();
        boolean z2 = false;
        for (int i = 0; i < size; i++) {
            C1406d c1406d = (C1406d) this.f6708q0.get(i);
            boolean[] zArr = c1406d.f6646S;
            zArr[0] = false;
            zArr[1] = false;
            if (c1406d instanceof C1403a) {
                z2 = true;
            }
        }
        if (z2) {
            for (int i2 = 0; i2 < size; i2++) {
                C1406d c1406d2 = (C1406d) this.f6708q0.get(i2);
                if (c1406d2 instanceof C1403a) {
                    C1403a c1403a = (C1403a) c1406d2;
                    for (int i3 = 0; i3 < c1403a.f6779r0; i3++) {
                        C1406d c1406d3 = c1403a.f6778q0[i3];
                        if (c1403a.f6599t0 || c1406d3.mo3352c()) {
                            int i4 = c1403a.f6598s0;
                            if (i4 == 0 || i4 == 1) {
                                c1406d3.f6646S[0] = true;
                            } else if (i4 == 2 || i4 == 3) {
                                c1406d3.f6646S[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet hashSet = this.f6706K0;
        hashSet.clear();
        for (int i5 = 0; i5 < size; i5++) {
            C1406d c1406d4 = (C1406d) this.f6708q0.get(i5);
            c1406d4.getClass();
            boolean z3 = c1406d4 instanceof C1409g;
            if (z3 || (c1406d4 instanceof C1410h)) {
                if (z3) {
                    hashSet.add(c1406d4);
                } else {
                    c1406d4.mo3351b(c1239c, m3409W);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator it = hashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C1409g c1409g = (C1409g) ((C1406d) it.next());
                for (int i6 = 0; i6 < c1409g.f6779r0; i6++) {
                    if (hashSet.contains(c1409g.f6778q0[i6])) {
                        c1409g.mo3351b(c1239c, m3409W);
                        hashSet.remove(c1409g);
                        break;
                    }
                }
            }
            if (size2 == hashSet.size()) {
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    ((C1406d) it2.next()).mo3351b(c1239c, m3409W);
                }
                hashSet.clear();
            }
        }
        if (C1239c.f5508p) {
            HashSet hashSet2 = new HashSet();
            for (int i7 = 0; i7 < size; i7++) {
                C1406d c1406d5 = (C1406d) this.f6708q0.get(i7);
                c1406d5.getClass();
                if (!(c1406d5 instanceof C1409g) && !(c1406d5 instanceof C1410h)) {
                    hashSet2.add(c1406d5);
                }
            }
            m3382a(this, c1239c, hashSet2, this.f6685p0[0] == 2 ? 0 : 1, false);
            Iterator it3 = hashSet2.iterator();
            while (it3.hasNext()) {
                C1406d c1406d6 = (C1406d) it3.next();
                AbstractC1412j.m3424b(this, c1239c, c1406d6);
                c1406d6.mo3351b(c1239c, m3409W);
            }
        } else {
            for (int i8 = 0; i8 < size; i8++) {
                C1406d c1406d7 = (C1406d) this.f6708q0.get(i8);
                if (c1406d7 instanceof C1407e) {
                    int[] iArr = c1406d7.f6685p0;
                    int i9 = iArr[0];
                    int i10 = iArr[1];
                    if (i9 == 2) {
                        c1406d7.m3377M(1);
                    }
                    if (i10 == 2) {
                        c1406d7.m3378N(1);
                    }
                    c1406d7.mo3351b(c1239c, m3409W);
                    if (i9 == 2) {
                        c1406d7.m3377M(i9);
                    }
                    if (i10 == 2) {
                        c1406d7.m3378N(i10);
                    }
                } else {
                    AbstractC1412j.m3424b(this, c1239c, c1406d7);
                    if (!(c1406d7 instanceof C1409g) && !(c1406d7 instanceof C1410h)) {
                        c1406d7.mo3351b(c1239c, m3409W);
                    }
                }
            }
        }
        if (this.f6717z0 > 0) {
            AbstractC1412j.m3423a(this, c1239c, null, 0);
        }
        if (this.f6696A0 > 0) {
            AbstractC1412j.m3423a(this, c1239c, null, 1);
        }
    }

    /* renamed from: T */
    public final boolean m3407T(int i, boolean z2) {
        boolean z3;
        C1444e c1444e = this.f6710s0;
        C1407e c1407e = c1444e.f6808a;
        boolean z4 = false;
        int m3389j = c1407e.m3389j(0);
        int m3389j2 = c1407e.m3389j(1);
        int m3395r = c1407e.m3395r();
        int m3396s = c1407e.m3396s();
        ArrayList arrayList = c1444e.f6812e;
        if (z2 && (m3389j == 2 || m3389j2 == 2)) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                AbstractC1454o abstractC1454o = (AbstractC1454o) it.next();
                if (abstractC1454o.f6846f == i && !abstractC1454o.mo3432k()) {
                    z2 = false;
                    break;
                }
            }
            if (i == 0) {
                if (z2 && m3389j == 2) {
                    c1407e.m3377M(1);
                    c1407e.m3379O(c1444e.m3438d(c1407e, 0));
                    c1407e.f6660d.f6845e.mo3444d(c1407e.m3394q());
                }
            } else if (z2 && m3389j2 == 2) {
                c1407e.m3378N(1);
                c1407e.m3376L(c1444e.m3438d(c1407e, 1));
                c1407e.f6662e.f6845e.mo3444d(c1407e.m3390k());
            }
        }
        int[] iArr = c1407e.f6685p0;
        if (i == 0) {
            int i2 = iArr[0];
            if (i2 == 1 || i2 == 4) {
                int m3394q = c1407e.m3394q() + m3395r;
                c1407e.f6660d.f6849i.mo3444d(m3394q);
                c1407e.f6660d.f6845e.mo3444d(m3394q - m3395r);
                z3 = true;
            }
            z3 = false;
        } else {
            int i3 = iArr[1];
            if (i3 == 1 || i3 == 4) {
                int m3390k = c1407e.m3390k() + m3396s;
                c1407e.f6662e.f6849i.mo3444d(m3390k);
                c1407e.f6662e.f6845e.mo3444d(m3390k - m3396s);
                z3 = true;
            }
            z3 = false;
        }
        c1444e.m3441g();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            AbstractC1454o abstractC1454o2 = (AbstractC1454o) it2.next();
            if (abstractC1454o2.f6846f == i && (abstractC1454o2.f6842b != c1407e || abstractC1454o2.f6847g)) {
                abstractC1454o2.mo3429e();
            }
        }
        Iterator it3 = arrayList.iterator();
        while (true) {
            if (!it3.hasNext()) {
                z4 = true;
                break;
            }
            AbstractC1454o abstractC1454o3 = (AbstractC1454o) it3.next();
            if (abstractC1454o3.f6846f == i && (z3 || abstractC1454o3.f6842b != c1407e)) {
                if (!abstractC1454o3.f6848h.f6825j) {
                    break;
                }
                if (!abstractC1454o3.f6849i.f6825j) {
                    break;
                }
                if (!(abstractC1454o3 instanceof C1442c) && !abstractC1454o3.f6845e.f6825j) {
                    break;
                }
            }
        }
        c1407e.m3377M(m3389j);
        c1407e.m3378N(m3389j2);
        return z4;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:227|228|229|(1:231)|232|233|(2:234|235)|(3:353|354|(28:356|357|358|359|360|361|362|238|239|(1:243)|244|(6:248|249|250|251|252|253)|325|(1:350)(9:329|330|331|332|333|334|335|336|337)|338|339|260|(4:262|(3:264|(2:270|271)(1:268)|269)|272|273)(4:320|(1:322)|323|324)|274|(6:279|(1:281)|282|283|(1:287)|(1:291))|292|(1:294)(1:319)|295|(1:297)(1:318)|(1:317)(4:299|(1:304)|305|(3:310|(2:312|313)(1:315)|314))|316|(0)(0)|314))|237|238|239|(2:241|243)|244|(7:246|248|249|250|251|252|253)|325|(1:327)|350|338|339|260|(0)(0)|274|(7:277|279|(0)|282|283|(2:285|287)|(2:289|291))|292|(0)(0)|295|(0)(0)|(0)(0)|316|(0)(0)|314) */
    /* JADX WARN: Code restructure failed: missing block: B:352:0x0797, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:204:0x065f  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0675 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0694  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x06b1  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x07c0  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0818 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0824 A[LOOP:14: B:280:0x0822->B:281:0x0824, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:294:0x088a  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x08a9  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x08b6  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x08f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:317:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0896  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x07fd  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x08fe  */
    /* JADX WARN: Removed duplicated region for block: B:603:0x05db  */
    /* JADX WARN: Removed duplicated region for block: B:622:0x0609 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:625:0x061a  */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0639  */
    /* JADX WARN: Removed duplicated region for block: B:639:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:641:0x0633  */
    /* JADX WARN: Type inference failed for: r6v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: U */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3408U() {
        int i;
        Object[] objArr;
        C1405c c1405c;
        int i2;
        int i3;
        C1405c c1405c2;
        int i4;
        int i5;
        C1239c c1239c;
        int i6;
        boolean z2;
        char c2;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int max;
        ?? r6;
        boolean z7;
        int max2;
        boolean z8;
        boolean z9;
        int i9;
        int i10;
        int max3;
        int max4;
        WeakReference weakReference;
        C1242f m2931k;
        C1239c c1239c2;
        WeakReference weakReference2;
        WeakReference weakReference3;
        WeakReference weakReference4;
        C1239c c1239c3;
        C1405c c1405c3;
        int i11;
        int i12;
        int i13;
        char c3;
        C1453n c1453n;
        C1453n c1453n2;
        int i14;
        int i15;
        int i16;
        int i17;
        int m3462b;
        C1453n c1453n3;
        C1453n c1453n4;
        int[] iArr;
        this.f6652Y = 0;
        this.f6653Z = 0;
        this.f6700E0 = false;
        this.f6701F0 = false;
        int size = this.f6708q0.size();
        int max5 = Math.max(0, m3394q());
        int max6 = Math.max(0, m3390k());
        int[] iArr2 = this.f6685p0;
        int i18 = iArr2[1];
        int i19 = iArr2[0];
        int i20 = this.f6711t0;
        C1405c c1405c4 = this.f6637J;
        C1405c c1405c5 = this.f6636I;
        if (i20 == 0 && AbstractC1412j.m3425c(this.f6699D0, 1)) {
            C1593e c1593e = this.f6712u0;
            int i21 = iArr2[0];
            int i22 = iArr2[1];
            m3371E();
            ArrayList arrayList = this.f6708q0;
            int size2 = arrayList.size();
            for (int i23 = 0; i23 < size2; i23++) {
                ((C1406d) arrayList.get(i23)).m3371E();
            }
            boolean z10 = this.f6713v0;
            if (i21 == 1) {
                m3374J(0, m3394q());
            } else {
                c1405c5.m3364l(0);
                this.f6652Y = 0;
            }
            int i24 = 0;
            boolean z11 = false;
            boolean z12 = false;
            while (i24 < size2) {
                C1405c c1405c6 = c1405c5;
                C1406d c1406d = (C1406d) arrayList.get(i24);
                int i25 = max6;
                if (c1406d instanceof C1410h) {
                    C1410h c1410h = (C1410h) c1406d;
                    iArr = iArr2;
                    if (c1410h.f6776u0 == 1) {
                        int i26 = c1410h.f6773r0;
                        if (i26 != -1) {
                            c1410h.m3420R(i26);
                        } else if (c1410h.f6774s0 != -1 && mo3347A()) {
                            c1410h.m3420R(m3394q() - c1410h.f6774s0);
                        } else if (mo3347A()) {
                            c1410h.m3420R((int) ((c1410h.f6772q0 * m3394q()) + 0.5f));
                        }
                        z11 = true;
                    }
                } else {
                    iArr = iArr2;
                    if ((c1406d instanceof C1403a) && ((C1403a) c1406d).m3350U() == 0) {
                        z12 = true;
                    }
                }
                i24++;
                max6 = i25;
                c1405c5 = c1405c6;
                iArr2 = iArr;
            }
            i = max6;
            objArr = iArr2;
            c1405c = c1405c5;
            if (z11) {
                for (int i27 = 0; i27 < size2; i27++) {
                    C1406d c1406d2 = (C1406d) arrayList.get(i27);
                    if (c1406d2 instanceof C1410h) {
                        C1410h c1410h2 = (C1410h) c1406d2;
                        if (c1410h2.f6776u0 == 1) {
                            AbstractC1447h.m3447c(0, c1410h2, c1593e, z10);
                        }
                    }
                }
            }
            AbstractC1447h.m3447c(0, this, c1593e, z10);
            if (z12) {
                for (int i28 = 0; i28 < size2; i28++) {
                    C1406d c1406d3 = (C1406d) arrayList.get(i28);
                    if (c1406d3 instanceof C1403a) {
                        C1403a c1403a = (C1403a) c1406d3;
                        if (c1403a.m3350U() == 0 && c1403a.m3349T()) {
                            AbstractC1447h.m3447c(1, c1403a, c1593e, z10);
                        }
                    }
                }
            }
            if (i22 == 1) {
                m3375K(0, m3390k());
            } else {
                c1405c4.m3364l(0);
                this.f6653Z = 0;
            }
            boolean z13 = false;
            boolean z14 = false;
            for (int i29 = 0; i29 < size2; i29++) {
                C1406d c1406d4 = (C1406d) arrayList.get(i29);
                if (c1406d4 instanceof C1410h) {
                    C1410h c1410h3 = (C1410h) c1406d4;
                    if (c1410h3.f6776u0 == 0) {
                        int i30 = c1410h3.f6773r0;
                        if (i30 != -1) {
                            c1410h3.m3420R(i30);
                        } else if (c1410h3.f6774s0 != -1 && mo3348B()) {
                            c1410h3.m3420R(m3390k() - c1410h3.f6774s0);
                        } else if (mo3348B()) {
                            c1410h3.m3420R((int) ((c1410h3.f6772q0 * m3390k()) + 0.5f));
                        }
                        z13 = true;
                    }
                } else if ((c1406d4 instanceof C1403a) && ((C1403a) c1406d4).m3350U() == 1) {
                    z14 = true;
                }
            }
            if (z13) {
                for (int i31 = 0; i31 < size2; i31++) {
                    C1406d c1406d5 = (C1406d) arrayList.get(i31);
                    if (c1406d5 instanceof C1410h) {
                        C1410h c1410h4 = (C1410h) c1406d5;
                        if (c1410h4.f6776u0 == 0) {
                            AbstractC1447h.m3453i(1, c1410h4, c1593e);
                        }
                    }
                }
            }
            AbstractC1447h.m3453i(0, this, c1593e);
            if (z14) {
                for (int i32 = 0; i32 < size2; i32++) {
                    C1406d c1406d6 = (C1406d) arrayList.get(i32);
                    if (c1406d6 instanceof C1403a) {
                        C1403a c1403a2 = (C1403a) c1406d6;
                        if (c1403a2.m3350U() == 1 && c1403a2.m3349T()) {
                            AbstractC1447h.m3453i(1, c1403a2, c1593e);
                        }
                    }
                }
            }
            for (int i33 = 0; i33 < size2; i33++) {
                C1406d c1406d7 = (C1406d) arrayList.get(i33);
                if (c1406d7.m3403z() && AbstractC1447h.m3445a(c1406d7)) {
                    m3404V(c1406d7, c1593e, AbstractC1447h.f6829a);
                    if (!(c1406d7 instanceof C1410h)) {
                        AbstractC1447h.m3447c(0, c1406d7, c1593e, z10);
                        AbstractC1447h.m3453i(0, c1406d7, c1593e);
                    } else if (((C1410h) c1406d7).f6776u0 == 0) {
                        AbstractC1447h.m3453i(0, c1406d7, c1593e);
                    } else {
                        AbstractC1447h.m3447c(0, c1406d7, c1593e, z10);
                    }
                }
            }
            for (int i34 = 0; i34 < size; i34++) {
                C1406d c1406d8 = (C1406d) this.f6708q0.get(i34);
                if (c1406d8.m3403z() && !(c1406d8 instanceof C1410h) && !(c1406d8 instanceof C1403a) && !(c1406d8 instanceof C1409g) && !c1406d8.f6633F) {
                    int m3389j = c1406d8.m3389j(0);
                    int m3389j2 = c1406d8.m3389j(1);
                    if (m3389j != 3 || c1406d8.f6687r == 1 || m3389j2 != 3 || c1406d8.f6688s == 1) {
                        m3404V(c1406d8, this.f6712u0, new C1441b());
                    }
                }
            }
        } else {
            i = max6;
            objArr = iArr2;
            c1405c = c1405c5;
        }
        C1239c c1239c4 = this.f6714w0;
        if (size <= 2 || !((i19 == 2 || i18 == 2) && AbstractC1412j.m3425c(this.f6699D0, 1024))) {
            i2 = size;
            i3 = i18;
            c1405c2 = c1405c4;
            i4 = i;
            i5 = max5;
            c1239c = c1239c4;
            i6 = i19;
        } else {
            C1593e c1593e2 = this.f6712u0;
            ArrayList arrayList2 = this.f6708q0;
            int size3 = arrayList2.size();
            int i35 = 0;
            while (i35 < size3) {
                C1406d c1406d9 = (C1406d) arrayList2.get(i35);
                char c4 = objArr[0];
                char c5 = objArr[1];
                int[] iArr3 = c1406d9.f6685p0;
                c1405c2 = c1405c4;
                if (!AbstractC1447h.m3452h(c4, c5, iArr3[0], iArr3[1]) || (c1406d9 instanceof C1409g)) {
                    i11 = max5;
                    i2 = size;
                    i12 = i18;
                    i13 = i19;
                    c1239c = c1239c4;
                    break;
                }
                i35++;
                c1405c4 = c1405c2;
            }
            c1405c2 = c1405c4;
            int i36 = 0;
            ArrayList arrayList3 = null;
            ArrayList arrayList4 = null;
            ArrayList arrayList5 = null;
            ArrayList arrayList6 = null;
            ArrayList arrayList7 = null;
            ArrayList arrayList8 = null;
            while (i36 < size3) {
                int i37 = size;
                C1406d c1406d10 = (C1406d) arrayList2.get(i36);
                int i38 = i18;
                char c6 = objArr[0];
                int i39 = max5;
                char c7 = objArr[1];
                int i40 = i19;
                int[] iArr4 = c1406d10.f6685p0;
                C1239c c1239c5 = c1239c4;
                if (!AbstractC1447h.m3452h(c6, c7, iArr4[0], iArr4[1])) {
                    m3404V(c1406d10, c1593e2, this.f6707L0);
                }
                boolean z15 = c1406d10 instanceof C1410h;
                if (z15) {
                    C1410h c1410h5 = (C1410h) c1406d10;
                    if (c1410h5.f6776u0 == 0) {
                        if (arrayList5 == null) {
                            arrayList5 = new ArrayList();
                        }
                        arrayList5.add(c1410h5);
                    }
                    if (c1410h5.f6776u0 == 1) {
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        arrayList3.add(c1410h5);
                    }
                }
                if (c1406d10 instanceof AbstractC1411i) {
                    if (c1406d10 instanceof C1403a) {
                        C1403a c1403a3 = (C1403a) c1406d10;
                        if (c1403a3.m3350U() == 0) {
                            if (arrayList4 == null) {
                                arrayList4 = new ArrayList();
                            }
                            arrayList4.add(c1403a3);
                        }
                        if (c1403a3.m3350U() == 1) {
                            if (arrayList6 == null) {
                                arrayList6 = new ArrayList();
                            }
                            arrayList6.add(c1403a3);
                        }
                    } else {
                        AbstractC1411i abstractC1411i = (AbstractC1411i) c1406d10;
                        if (arrayList4 == null) {
                            arrayList4 = new ArrayList();
                        }
                        arrayList4.add(abstractC1411i);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                        }
                        arrayList6.add(abstractC1411i);
                    }
                }
                if (c1406d10.f6636I.f6624f == null && c1406d10.f6638K.f6624f == null && !z15 && !(c1406d10 instanceof C1403a)) {
                    if (arrayList7 == null) {
                        arrayList7 = new ArrayList();
                    }
                    arrayList7.add(c1406d10);
                }
                if (c1406d10.f6637J.f6624f == null && c1406d10.f6639L.f6624f == null && c1406d10.f6640M.f6624f == null && !z15 && !(c1406d10 instanceof C1403a)) {
                    if (arrayList8 == null) {
                        arrayList8 = new ArrayList();
                    }
                    arrayList8.add(c1406d10);
                }
                i36++;
                i18 = i38;
                size = i37;
                max5 = i39;
                i19 = i40;
                c1239c4 = c1239c5;
            }
            i11 = max5;
            C1239c c1239c6 = c1239c4;
            i2 = size;
            i12 = i18;
            i13 = i19;
            ArrayList arrayList9 = new ArrayList();
            if (arrayList3 != null) {
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    AbstractC1447h.m3446b((C1410h) it.next(), 0, arrayList9, null);
                }
            }
            int i41 = 0;
            C1453n c1453n5 = null;
            if (arrayList4 != null) {
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    AbstractC1411i abstractC1411i2 = (AbstractC1411i) it2.next();
                    C1453n m3446b = AbstractC1447h.m3446b(abstractC1411i2, i41, arrayList9, c1453n5);
                    abstractC1411i2.m3422R(i41, arrayList9, m3446b);
                    m3446b.m3461a(arrayList9);
                    i41 = 0;
                    c1453n5 = null;
                }
            }
            HashSet hashSet = mo3388i(2).f6619a;
            if (hashSet != null) {
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it3.next()).f6622d, 0, arrayList9, null);
                }
            }
            HashSet hashSet2 = mo3388i(4).f6619a;
            if (hashSet2 != null) {
                Iterator it4 = hashSet2.iterator();
                while (it4.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it4.next()).f6622d, 0, arrayList9, null);
                }
            }
            HashSet hashSet3 = mo3388i(7).f6619a;
            if (hashSet3 != null) {
                Iterator it5 = hashSet3.iterator();
                while (it5.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it5.next()).f6622d, 0, arrayList9, null);
                }
            }
            C1453n c1453n6 = null;
            if (arrayList7 != null) {
                Iterator it6 = arrayList7.iterator();
                while (it6.hasNext()) {
                    AbstractC1447h.m3446b((C1406d) it6.next(), 0, arrayList9, null);
                }
            }
            if (arrayList5 != null) {
                Iterator it7 = arrayList5.iterator();
                while (it7.hasNext()) {
                    AbstractC1447h.m3446b((C1410h) it7.next(), 1, arrayList9, null);
                }
            }
            int i42 = 1;
            if (arrayList6 != null) {
                Iterator it8 = arrayList6.iterator();
                while (it8.hasNext()) {
                    AbstractC1411i abstractC1411i3 = (AbstractC1411i) it8.next();
                    C1453n m3446b2 = AbstractC1447h.m3446b(abstractC1411i3, i42, arrayList9, c1453n6);
                    abstractC1411i3.m3422R(i42, arrayList9, m3446b2);
                    m3446b2.m3461a(arrayList9);
                    i42 = 1;
                    c1453n6 = null;
                }
            }
            HashSet hashSet4 = mo3388i(3).f6619a;
            if (hashSet4 != null) {
                Iterator it9 = hashSet4.iterator();
                while (it9.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it9.next()).f6622d, 1, arrayList9, null);
                }
            }
            HashSet hashSet5 = mo3388i(6).f6619a;
            if (hashSet5 != null) {
                Iterator it10 = hashSet5.iterator();
                while (it10.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it10.next()).f6622d, 1, arrayList9, null);
                }
            }
            HashSet hashSet6 = mo3388i(5).f6619a;
            if (hashSet6 != null) {
                Iterator it11 = hashSet6.iterator();
                while (it11.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it11.next()).f6622d, 1, arrayList9, null);
                }
            }
            HashSet hashSet7 = mo3388i(7).f6619a;
            if (hashSet7 != null) {
                Iterator it12 = hashSet7.iterator();
                while (it12.hasNext()) {
                    AbstractC1447h.m3446b(((C1405c) it12.next()).f6622d, 1, arrayList9, null);
                }
            }
            if (arrayList8 != null) {
                Iterator it13 = arrayList8.iterator();
                while (it13.hasNext()) {
                    AbstractC1447h.m3446b((C1406d) it13.next(), 1, arrayList9, null);
                }
            }
            for (int i43 = 0; i43 < size3; i43++) {
                C1406d c1406d11 = (C1406d) arrayList2.get(i43);
                int[] iArr5 = c1406d11.f6685p0;
                if (iArr5[0] == 3 && iArr5[1] == 3) {
                    int i44 = c1406d11.f6681n0;
                    int size4 = arrayList9.size();
                    int i45 = 0;
                    while (true) {
                        if (i45 >= size4) {
                            c1453n3 = null;
                            break;
                        }
                        c1453n3 = (C1453n) arrayList9.get(i45);
                        if (i44 == c1453n3.f6837b) {
                            break;
                        } else {
                            i45++;
                        }
                    }
                    int i46 = c1406d11.f6683o0;
                    int size5 = arrayList9.size();
                    int i47 = 0;
                    while (true) {
                        if (i47 >= size5) {
                            c1453n4 = null;
                            break;
                        }
                        c1453n4 = (C1453n) arrayList9.get(i47);
                        if (i46 == c1453n4.f6837b) {
                            break;
                        } else {
                            i47++;
                        }
                    }
                    if (c1453n3 != null && c1453n4 != null) {
                        c1453n3.m3463c(0, c1453n4);
                        c1453n4.f6838c = 2;
                        arrayList9.remove(c1453n3);
                    }
                }
            }
            if (arrayList9.size() > 1) {
                if (objArr[0] == 2) {
                    Iterator it14 = arrayList9.iterator();
                    int i48 = 0;
                    c1453n = null;
                    while (it14.hasNext()) {
                        C1453n c1453n7 = (C1453n) it14.next();
                        if (c1453n7.f6838c != 1) {
                            C1239c c1239c7 = c1239c6;
                            int m3462b2 = c1453n7.m3462b(c1239c7, 0);
                            if (m3462b2 > i48) {
                                c1453n = c1453n7;
                                i48 = m3462b2;
                            }
                            c1239c6 = c1239c7;
                        }
                    }
                    c1239c = c1239c6;
                    c3 = 1;
                    if (c1453n != null) {
                        m3377M(1);
                        m3379O(i48);
                        if (objArr[c3] == 2) {
                            Iterator it15 = arrayList9.iterator();
                            int i49 = 0;
                            c1453n2 = null;
                            while (it15.hasNext()) {
                                C1453n c1453n8 = (C1453n) it15.next();
                                if (c1453n8.f6838c != 0 && (m3462b = c1453n8.m3462b(c1239c, 1)) > i49) {
                                    c1453n2 = c1453n8;
                                    i49 = m3462b;
                                }
                            }
                            if (c1453n2 != null) {
                                m3378N(1);
                                m3376L(i49);
                                if (c1453n == null || c1453n2 != null) {
                                    i6 = i13;
                                    if (i6 == 2) {
                                        i14 = i11;
                                        if (i14 >= m3394q() || i14 <= 0) {
                                            i15 = m3394q();
                                            i3 = i12;
                                            if (i3 != 2) {
                                                i16 = i;
                                                if (i16 >= m3390k() || i16 <= 0) {
                                                    i17 = m3390k();
                                                    i4 = i17;
                                                    i5 = i15;
                                                    z2 = true;
                                                    boolean z16 = !m3409W(64) || m3409W(128);
                                                    c1239c.getClass();
                                                    c1239c.f5516g = false;
                                                    if (this.f6699D0 == 0 && z16) {
                                                        c2 = 1;
                                                        c1239c.f5516g = true;
                                                    } else {
                                                        c2 = 1;
                                                    }
                                                    ArrayList arrayList10 = this.f6708q0;
                                                    boolean z17 = objArr[0] != 2 || objArr[c2] == 2;
                                                    this.f6717z0 = 0;
                                                    this.f6696A0 = 0;
                                                    i7 = i2;
                                                    for (i8 = 0; i8 < i7; i8++) {
                                                        C1406d c1406d12 = (C1406d) this.f6708q0.get(i8);
                                                        if (c1406d12 instanceof C1407e) {
                                                            ((C1407e) c1406d12).m3408U();
                                                        }
                                                    }
                                                    boolean m3409W = m3409W(64);
                                                    boolean z18 = z2;
                                                    int i50 = 0;
                                                    z3 = true;
                                                    while (z3) {
                                                        int i51 = i50 + 1;
                                                        try {
                                                            c1239c.m2939t();
                                                            this.f6717z0 = 0;
                                                            this.f6696A0 = 0;
                                                            m3386g(c1239c);
                                                            for (int i52 = 0; i52 < i7; i52++) {
                                                                ((C1406d) this.f6708q0.get(i52)).m3386g(c1239c);
                                                            }
                                                            m3406S(c1239c);
                                                            try {
                                                                weakReference = this.f6702G0;
                                                            } catch (Exception e2) {
                                                                e = e2;
                                                                z5 = z18;
                                                            }
                                                        } catch (Exception e3) {
                                                            e = e3;
                                                            z5 = z18;
                                                        }
                                                        if (weakReference != null) {
                                                            try {
                                                            } catch (Exception e4) {
                                                                e = e4;
                                                                z5 = z18;
                                                            }
                                                            if (weakReference.get() != null) {
                                                                C1405c c1405c7 = (C1405c) this.f6702G0.get();
                                                                C1405c c1405c8 = c1405c2;
                                                                try {
                                                                    m2931k = c1239c.m2931k(c1405c8);
                                                                    c1239c2 = this.f6714w0;
                                                                    z5 = z18;
                                                                    c1405c2 = c1405c8;
                                                                } catch (Exception e5) {
                                                                    e = e5;
                                                                    z5 = z18;
                                                                    c1405c2 = c1405c8;
                                                                }
                                                                try {
                                                                    c1239c2.m2926f(c1239c2.m2931k(c1405c7), m2931k, 0, 5);
                                                                    this.f6702G0 = null;
                                                                    weakReference2 = this.f6704I0;
                                                                    if (weakReference2 != null && weakReference2.get() != null) {
                                                                        C1405c c1405c9 = (C1405c) this.f6704I0.get();
                                                                        C1242f m2931k2 = c1239c.m2931k(this.f6639L);
                                                                        C1239c c1239c8 = this.f6714w0;
                                                                        c1239c8.m2926f(m2931k2, c1239c8.m2931k(c1405c9), 0, 5);
                                                                        this.f6704I0 = null;
                                                                    }
                                                                    weakReference3 = this.f6703H0;
                                                                    if (weakReference3 != null && weakReference3.get() != null) {
                                                                        C1405c c1405c10 = (C1405c) this.f6703H0.get();
                                                                        c1405c3 = c1405c;
                                                                        try {
                                                                            C1242f m2931k3 = c1239c.m2931k(c1405c3);
                                                                            C1239c c1239c9 = this.f6714w0;
                                                                            c1405c = c1405c3;
                                                                            c1239c9.m2926f(c1239c9.m2931k(c1405c10), m2931k3, 0, 5);
                                                                            this.f6703H0 = null;
                                                                        } catch (Exception e6) {
                                                                            e = e6;
                                                                            c1405c = c1405c3;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr = AbstractC1412j.f6780a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f6657b0, m3394q());
                                                                            if (max > m3394q()) {
                                                                            }
                                                                            max2 = Math.max(this.f6659c0, m3390k());
                                                                            if (max2 > m3390k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    weakReference4 = this.f6705J0;
                                                                    if (weakReference4 == null && weakReference4.get() != null) {
                                                                        C1405c c1405c11 = (C1405c) this.f6705J0.get();
                                                                        C1242f m2931k4 = c1239c.m2931k(this.f6638K);
                                                                        try {
                                                                            c1239c3 = this.f6714w0;
                                                                        } catch (Exception e7) {
                                                                            e = e7;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr2 = AbstractC1412j.f6780a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f6657b0, m3394q());
                                                                            if (max > m3394q()) {
                                                                            }
                                                                            max2 = Math.max(this.f6659c0, m3390k());
                                                                            if (max2 > m3390k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                        try {
                                                                            c1239c3.m2926f(m2931k4, c1239c3.m2931k(c1405c11), 0, 5);
                                                                            try {
                                                                                this.f6705J0 = null;
                                                                            } catch (Exception e8) {
                                                                                e = e8;
                                                                                z3 = true;
                                                                                e.printStackTrace();
                                                                                System.out.println("EXCEPTION : " + e);
                                                                                boolean[] zArr22 = AbstractC1412j.f6780a;
                                                                                if (z3) {
                                                                                }
                                                                                if (z17) {
                                                                                }
                                                                                max = Math.max(this.f6657b0, m3394q());
                                                                                if (max > m3394q()) {
                                                                                }
                                                                                max2 = Math.max(this.f6659c0, m3390k());
                                                                                if (max2 > m3390k()) {
                                                                                }
                                                                                if (!z8) {
                                                                                }
                                                                                z18 = z8;
                                                                                z9 = z6;
                                                                                i9 = 8;
                                                                                if (i51 <= i9) {
                                                                                }
                                                                                z3 = z9;
                                                                                i50 = i51;
                                                                            }
                                                                        } catch (Exception e9) {
                                                                            e = e9;
                                                                            z3 = true;
                                                                            e.printStackTrace();
                                                                            System.out.println("EXCEPTION : " + e);
                                                                            boolean[] zArr222 = AbstractC1412j.f6780a;
                                                                            if (z3) {
                                                                            }
                                                                            if (z17) {
                                                                            }
                                                                            max = Math.max(this.f6657b0, m3394q());
                                                                            if (max > m3394q()) {
                                                                            }
                                                                            max2 = Math.max(this.f6659c0, m3390k());
                                                                            if (max2 > m3390k()) {
                                                                            }
                                                                            if (!z8) {
                                                                            }
                                                                            z18 = z8;
                                                                            z9 = z6;
                                                                            i9 = 8;
                                                                            if (i51 <= i9) {
                                                                            }
                                                                            z3 = z9;
                                                                            i50 = i51;
                                                                        }
                                                                    }
                                                                    c1239c.m2935p();
                                                                    z3 = true;
                                                                } catch (Exception e10) {
                                                                    e = e10;
                                                                    z3 = true;
                                                                    e.printStackTrace();
                                                                    System.out.println("EXCEPTION : " + e);
                                                                    boolean[] zArr2222 = AbstractC1412j.f6780a;
                                                                    if (z3) {
                                                                    }
                                                                    if (z17) {
                                                                    }
                                                                    max = Math.max(this.f6657b0, m3394q());
                                                                    if (max > m3394q()) {
                                                                    }
                                                                    max2 = Math.max(this.f6659c0, m3390k());
                                                                    if (max2 > m3390k()) {
                                                                    }
                                                                    if (!z8) {
                                                                    }
                                                                    z18 = z8;
                                                                    z9 = z6;
                                                                    i9 = 8;
                                                                    if (i51 <= i9) {
                                                                    }
                                                                    z3 = z9;
                                                                    i50 = i51;
                                                                }
                                                                boolean[] zArr22222 = AbstractC1412j.f6780a;
                                                                if (z3) {
                                                                    zArr22222[2] = false;
                                                                    boolean m3409W2 = m3409W(64);
                                                                    mo3381Q(c1239c, m3409W2);
                                                                    int size6 = this.f6708q0.size();
                                                                    int i53 = 0;
                                                                    z6 = false;
                                                                    while (i53 < size6) {
                                                                        C1406d c1406d13 = (C1406d) this.f6708q0.get(i53);
                                                                        c1406d13.mo3381Q(c1239c, m3409W2);
                                                                        boolean z19 = m3409W2;
                                                                        int i54 = size6;
                                                                        if (c1406d13.f6668h != -1 || c1406d13.f6670i != -1) {
                                                                            z6 = true;
                                                                        }
                                                                        i53++;
                                                                        m3409W2 = z19;
                                                                        size6 = i54;
                                                                    }
                                                                } else {
                                                                    mo3381Q(c1239c, m3409W);
                                                                    for (int i55 = 0; i55 < i7; i55++) {
                                                                        ((C1406d) this.f6708q0.get(i55)).mo3381Q(c1239c, m3409W);
                                                                    }
                                                                    z6 = false;
                                                                }
                                                                if (z17 && i51 < 8 && zArr22222[2]) {
                                                                    int i56 = 0;
                                                                    int i57 = 0;
                                                                    for (i10 = 0; i10 < i7; i10++) {
                                                                        C1406d c1406d14 = (C1406d) this.f6708q0.get(i10);
                                                                        i56 = Math.max(i56, c1406d14.m3394q() + c1406d14.f6652Y);
                                                                        i57 = Math.max(i57, c1406d14.m3390k() + c1406d14.f6653Z);
                                                                    }
                                                                    max3 = Math.max(this.f6657b0, i56);
                                                                    max4 = Math.max(this.f6659c0, i57);
                                                                    if (i6 == 2 && m3394q() < max3) {
                                                                        m3379O(max3);
                                                                        objArr[0] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                    if (i3 == 2 && m3390k() < max4) {
                                                                        m3376L(max4);
                                                                        objArr[1] = 2;
                                                                        z6 = true;
                                                                        z5 = true;
                                                                    }
                                                                }
                                                                max = Math.max(this.f6657b0, m3394q());
                                                                if (max > m3394q()) {
                                                                    m3379O(max);
                                                                    r6 = 1;
                                                                    objArr[0] = 1;
                                                                    z6 = true;
                                                                    z7 = true;
                                                                } else {
                                                                    r6 = 1;
                                                                    z7 = z5;
                                                                }
                                                                max2 = Math.max(this.f6659c0, m3390k());
                                                                if (max2 > m3390k()) {
                                                                    m3376L(max2);
                                                                    objArr[r6] = r6;
                                                                    z8 = r6;
                                                                    z6 = z8;
                                                                } else {
                                                                    z8 = z7;
                                                                }
                                                                if (!z8) {
                                                                    if (objArr[0] == 2 && i5 > 0 && m3394q() > i5) {
                                                                        this.f6700E0 = r6;
                                                                        objArr[0] = r6;
                                                                        m3379O(i5);
                                                                        z8 = r6;
                                                                        z6 = z8;
                                                                    }
                                                                    if (objArr[r6] == 2 && i4 > 0 && m3390k() > i4) {
                                                                        this.f6701F0 = r6;
                                                                        objArr[r6] = r6;
                                                                        m3376L(i4);
                                                                        i9 = 8;
                                                                        z9 = true;
                                                                        z18 = true;
                                                                        if (i51 <= i9) {
                                                                            z9 = false;
                                                                        }
                                                                        z3 = z9;
                                                                        i50 = i51;
                                                                    }
                                                                }
                                                                z18 = z8;
                                                                z9 = z6;
                                                                i9 = 8;
                                                                if (i51 <= i9) {
                                                                }
                                                                z3 = z9;
                                                                i50 = i51;
                                                            }
                                                        }
                                                        z5 = z18;
                                                        weakReference2 = this.f6704I0;
                                                        if (weakReference2 != null) {
                                                            C1405c c1405c92 = (C1405c) this.f6704I0.get();
                                                            C1242f m2931k22 = c1239c.m2931k(this.f6639L);
                                                            C1239c c1239c82 = this.f6714w0;
                                                            c1239c82.m2926f(m2931k22, c1239c82.m2931k(c1405c92), 0, 5);
                                                            this.f6704I0 = null;
                                                        }
                                                        weakReference3 = this.f6703H0;
                                                        if (weakReference3 != null) {
                                                            C1405c c1405c102 = (C1405c) this.f6703H0.get();
                                                            c1405c3 = c1405c;
                                                            C1242f m2931k32 = c1239c.m2931k(c1405c3);
                                                            C1239c c1239c92 = this.f6714w0;
                                                            c1405c = c1405c3;
                                                            c1239c92.m2926f(c1239c92.m2931k(c1405c102), m2931k32, 0, 5);
                                                            this.f6703H0 = null;
                                                        }
                                                        weakReference4 = this.f6705J0;
                                                        if (weakReference4 == null) {
                                                        }
                                                        c1239c.m2935p();
                                                        z3 = true;
                                                        boolean[] zArr222222 = AbstractC1412j.f6780a;
                                                        if (z3) {
                                                        }
                                                        if (z17) {
                                                            int i562 = 0;
                                                            int i572 = 0;
                                                            while (i10 < i7) {
                                                            }
                                                            max3 = Math.max(this.f6657b0, i562);
                                                            max4 = Math.max(this.f6659c0, i572);
                                                            if (i6 == 2) {
                                                                m3379O(max3);
                                                                objArr[0] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                            if (i3 == 2) {
                                                                m3376L(max4);
                                                                objArr[1] = 2;
                                                                z6 = true;
                                                                z5 = true;
                                                            }
                                                        }
                                                        max = Math.max(this.f6657b0, m3394q());
                                                        if (max > m3394q()) {
                                                        }
                                                        max2 = Math.max(this.f6659c0, m3390k());
                                                        if (max2 > m3390k()) {
                                                        }
                                                        if (!z8) {
                                                        }
                                                        z18 = z8;
                                                        z9 = z6;
                                                        i9 = 8;
                                                        if (i51 <= i9) {
                                                        }
                                                        z3 = z9;
                                                        i50 = i51;
                                                    }
                                                    z4 = z18;
                                                    this.f6708q0 = arrayList10;
                                                    if (z4) {
                                                        objArr[0] = i6;
                                                        objArr[1] = i3;
                                                    }
                                                    mo3372F(c1239c.f5521l);
                                                }
                                                m3376L(i16);
                                                this.f6701F0 = true;
                                            } else {
                                                i16 = i;
                                            }
                                            i17 = i16;
                                            i4 = i17;
                                            i5 = i15;
                                            z2 = true;
                                            if (m3409W(64)) {
                                            }
                                            c1239c.getClass();
                                            c1239c.f5516g = false;
                                            if (this.f6699D0 == 0) {
                                            }
                                            c2 = 1;
                                            ArrayList arrayList102 = this.f6708q0;
                                            if (objArr[0] != 2) {
                                            }
                                            this.f6717z0 = 0;
                                            this.f6696A0 = 0;
                                            i7 = i2;
                                            while (i8 < i7) {
                                            }
                                            boolean m3409W3 = m3409W(64);
                                            boolean z182 = z2;
                                            int i502 = 0;
                                            z3 = true;
                                            while (z3) {
                                            }
                                            z4 = z182;
                                            this.f6708q0 = arrayList102;
                                            if (z4) {
                                            }
                                            mo3372F(c1239c.f5521l);
                                        }
                                        m3379O(i14);
                                        this.f6700E0 = true;
                                    } else {
                                        i14 = i11;
                                    }
                                    i15 = i14;
                                    i3 = i12;
                                    if (i3 != 2) {
                                    }
                                    i17 = i16;
                                    i4 = i17;
                                    i5 = i15;
                                    z2 = true;
                                    if (m3409W(64)) {
                                    }
                                    c1239c.getClass();
                                    c1239c.f5516g = false;
                                    if (this.f6699D0 == 0) {
                                    }
                                    c2 = 1;
                                    ArrayList arrayList1022 = this.f6708q0;
                                    if (objArr[0] != 2) {
                                    }
                                    this.f6717z0 = 0;
                                    this.f6696A0 = 0;
                                    i7 = i2;
                                    while (i8 < i7) {
                                    }
                                    boolean m3409W32 = m3409W(64);
                                    boolean z1822 = z2;
                                    int i5022 = 0;
                                    z3 = true;
                                    while (z3) {
                                    }
                                    z4 = z1822;
                                    this.f6708q0 = arrayList1022;
                                    if (z4) {
                                    }
                                    mo3372F(c1239c.f5521l);
                                }
                            }
                        }
                        c1453n2 = null;
                        if (c1453n == null) {
                        }
                        i6 = i13;
                        if (i6 == 2) {
                        }
                        i15 = i14;
                        i3 = i12;
                        if (i3 != 2) {
                        }
                        i17 = i16;
                        i4 = i17;
                        i5 = i15;
                        z2 = true;
                        if (m3409W(64)) {
                        }
                        c1239c.getClass();
                        c1239c.f5516g = false;
                        if (this.f6699D0 == 0) {
                        }
                        c2 = 1;
                        ArrayList arrayList10222 = this.f6708q0;
                        if (objArr[0] != 2) {
                        }
                        this.f6717z0 = 0;
                        this.f6696A0 = 0;
                        i7 = i2;
                        while (i8 < i7) {
                        }
                        boolean m3409W322 = m3409W(64);
                        boolean z18222 = z2;
                        int i50222 = 0;
                        z3 = true;
                        while (z3) {
                        }
                        z4 = z18222;
                        this.f6708q0 = arrayList10222;
                        if (z4) {
                        }
                        mo3372F(c1239c.f5521l);
                    }
                } else {
                    c1239c = c1239c6;
                    c3 = 1;
                }
                c1453n = null;
                if (objArr[c3] == 2) {
                }
                c1453n2 = null;
                if (c1453n == null) {
                }
                i6 = i13;
                if (i6 == 2) {
                }
                i15 = i14;
                i3 = i12;
                if (i3 != 2) {
                }
                i17 = i16;
                i4 = i17;
                i5 = i15;
                z2 = true;
                if (m3409W(64)) {
                }
                c1239c.getClass();
                c1239c.f5516g = false;
                if (this.f6699D0 == 0) {
                }
                c2 = 1;
                ArrayList arrayList102222 = this.f6708q0;
                if (objArr[0] != 2) {
                }
                this.f6717z0 = 0;
                this.f6696A0 = 0;
                i7 = i2;
                while (i8 < i7) {
                }
                boolean m3409W3222 = m3409W(64);
                boolean z182222 = z2;
                int i502222 = 0;
                z3 = true;
                while (z3) {
                }
                z4 = z182222;
                this.f6708q0 = arrayList102222;
                if (z4) {
                }
                mo3372F(c1239c.f5521l);
            }
            c1239c = c1239c6;
            i4 = i;
            i3 = i12;
            i5 = i11;
            i6 = i13;
        }
        z2 = false;
        if (m3409W(64)) {
        }
        c1239c.getClass();
        c1239c.f5516g = false;
        if (this.f6699D0 == 0) {
        }
        c2 = 1;
        ArrayList arrayList1022222 = this.f6708q0;
        if (objArr[0] != 2) {
        }
        this.f6717z0 = 0;
        this.f6696A0 = 0;
        i7 = i2;
        while (i8 < i7) {
        }
        boolean m3409W32222 = m3409W(64);
        boolean z1822222 = z2;
        int i5022222 = 0;
        z3 = true;
        while (z3) {
        }
        z4 = z1822222;
        this.f6708q0 = arrayList1022222;
        if (z4) {
        }
        mo3372F(c1239c.f5521l);
    }

    /* renamed from: W */
    public final boolean m3409W(int i) {
        return (this.f6699D0 & i) == i;
    }

    @Override // p102s.C1406d
    /* renamed from: n */
    public final void mo3393n(StringBuilder sb) {
        sb.append(this.f6672j + ":{\n");
        StringBuilder sb2 = new StringBuilder("  actualWidth:");
        sb2.append(this.f6648U);
        sb.append(sb2.toString());
        sb.append("\n");
        sb.append("  actualHeight:" + this.f6649V);
        sb.append("\n");
        Iterator it = this.f6708q0.iterator();
        while (it.hasNext()) {
            ((C1406d) it.next()).mo3393n(sb);
            sb.append(",\n");
        }
        sb.append("}");
    }
}
