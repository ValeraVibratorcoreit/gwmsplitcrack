package p105t;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p006C.AbstractC0062j;
import p069f1.C0833e;
import p097q.C1239c;
import p102s.AbstractC1412j;
import p102s.C1406d;
import p102s.C1407e;

/* renamed from: t.n */
/* loaded from: classes.dex */
public final class C1453n {

    /* renamed from: f */
    public static int f6835f;

    /* renamed from: a */
    public ArrayList f6836a;

    /* renamed from: b */
    public int f6837b;

    /* renamed from: c */
    public int f6838c;

    /* renamed from: d */
    public ArrayList f6839d;

    /* renamed from: e */
    public int f6840e;

    /* renamed from: a */
    public final void m3461a(ArrayList arrayList) {
        int size = this.f6836a.size();
        if (this.f6840e != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1453n c1453n = (C1453n) arrayList.get(i);
                if (this.f6840e == c1453n.f6837b) {
                    m3463c(this.f6838c, c1453n);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    /* renamed from: b */
    public final int m3462b(C1239c c1239c, int i) {
        int m2920n;
        int m2920n2;
        ArrayList arrayList = this.f6836a;
        if (arrayList.size() == 0) {
            return 0;
        }
        C1407e c1407e = (C1407e) ((C1406d) arrayList.get(0)).f6647T;
        c1239c.m2939t();
        c1407e.mo3351b(c1239c, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C1406d) arrayList.get(i2)).mo3351b(c1239c, false);
        }
        if (i == 0 && c1407e.f6717z0 > 0) {
            AbstractC1412j.m3423a(c1407e, c1239c, arrayList, 0);
        }
        if (i == 1 && c1407e.f6696A0 > 0) {
            AbstractC1412j.m3423a(c1407e, c1239c, arrayList, 1);
        }
        try {
            c1239c.m2935p();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        this.f6839d = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C1406d c1406d = (C1406d) arrayList.get(i3);
            C0833e c0833e = new C0833e(8);
            new WeakReference(c1406d);
            C1239c.m2920n(c1406d.f6636I);
            C1239c.m2920n(c1406d.f6637J);
            C1239c.m2920n(c1406d.f6638K);
            C1239c.m2920n(c1406d.f6639L);
            C1239c.m2920n(c1406d.f6640M);
            this.f6839d.add(c0833e);
        }
        if (i == 0) {
            m2920n = C1239c.m2920n(c1407e.f6636I);
            m2920n2 = C1239c.m2920n(c1407e.f6638K);
            c1239c.m2939t();
        } else {
            m2920n = C1239c.m2920n(c1407e.f6637J);
            m2920n2 = C1239c.m2920n(c1407e.f6639L);
            c1239c.m2939t();
        }
        return m2920n2 - m2920n;
    }

    /* renamed from: c */
    public final void m3463c(int i, C1453n c1453n) {
        Iterator it = this.f6836a.iterator();
        while (it.hasNext()) {
            C1406d c1406d = (C1406d) it.next();
            ArrayList arrayList = c1453n.f6836a;
            if (!arrayList.contains(c1406d)) {
                arrayList.add(c1406d);
            }
            int i2 = c1453n.f6837b;
            if (i == 0) {
                c1406d.f6681n0 = i2;
            } else {
                c1406d.f6683o0 = i2;
            }
        }
        this.f6840e = c1453n.f6837b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f6838c;
        sb.append(i == 0 ? "Horizontal" : i == 1 ? "Vertical" : i == 2 ? "Both" : "Unknown");
        sb.append(" [");
        sb.append(this.f6837b);
        sb.append("] <");
        String sb2 = sb.toString();
        Iterator it = this.f6836a.iterator();
        while (it.hasNext()) {
            sb2 = sb2 + " " + ((C1406d) it.next()).f6669h0;
        }
        return AbstractC0062j.m160n(sb2, " >");
    }
}
