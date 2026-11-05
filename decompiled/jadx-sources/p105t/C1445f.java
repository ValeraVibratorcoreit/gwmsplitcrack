package p105t;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: t.f */
/* loaded from: classes.dex */
public class C1445f implements InterfaceC1443d {

    /* renamed from: d */
    public final AbstractC1454o f6819d;

    /* renamed from: f */
    public int f6821f;

    /* renamed from: g */
    public int f6822g;

    /* renamed from: a */
    public AbstractC1454o f6816a = null;

    /* renamed from: b */
    public boolean f6817b = false;

    /* renamed from: c */
    public boolean f6818c = false;

    /* renamed from: e */
    public int f6820e = 1;

    /* renamed from: h */
    public int f6823h = 1;

    /* renamed from: i */
    public C1446g f6824i = null;

    /* renamed from: j */
    public boolean f6825j = false;

    /* renamed from: k */
    public final ArrayList f6826k = new ArrayList();

    /* renamed from: l */
    public final ArrayList f6827l = new ArrayList();

    public C1445f(AbstractC1454o abstractC1454o) {
        this.f6819d = abstractC1454o;
    }

    @Override // p105t.InterfaceC1443d
    /* renamed from: a */
    public final void mo3427a(InterfaceC1443d interfaceC1443d) {
        ArrayList arrayList = this.f6827l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (!((C1445f) it.next()).f6825j) {
                return;
            }
        }
        this.f6818c = true;
        AbstractC1454o abstractC1454o = this.f6816a;
        if (abstractC1454o != null) {
            abstractC1454o.mo3427a(this);
        }
        if (this.f6817b) {
            this.f6819d.mo3427a(this);
            return;
        }
        Iterator it2 = arrayList.iterator();
        C1445f c1445f = null;
        int i = 0;
        while (it2.hasNext()) {
            C1445f c1445f2 = (C1445f) it2.next();
            if (!(c1445f2 instanceof C1446g)) {
                i++;
                c1445f = c1445f2;
            }
        }
        if (c1445f != null && i == 1 && c1445f.f6825j) {
            C1446g c1446g = this.f6824i;
            if (c1446g != null) {
                if (!c1446g.f6825j) {
                    return;
                } else {
                    this.f6821f = this.f6823h * c1446g.f6822g;
                }
            }
            mo3444d(c1445f.f6822g + this.f6821f);
        }
        AbstractC1454o abstractC1454o2 = this.f6816a;
        if (abstractC1454o2 != null) {
            abstractC1454o2.mo3427a(this);
        }
    }

    /* renamed from: b */
    public final void m3442b(AbstractC1454o abstractC1454o) {
        this.f6826k.add(abstractC1454o);
        if (this.f6825j) {
            abstractC1454o.mo3427a(abstractC1454o);
        }
    }

    /* renamed from: c */
    public final void m3443c() {
        this.f6827l.clear();
        this.f6826k.clear();
        this.f6825j = false;
        this.f6822g = 0;
        this.f6818c = false;
        this.f6817b = false;
    }

    /* renamed from: d */
    public void mo3444d(int i) {
        if (this.f6825j) {
            return;
        }
        this.f6825j = true;
        this.f6822g = i;
        Iterator it = this.f6826k.iterator();
        while (it.hasNext()) {
            InterfaceC1443d interfaceC1443d = (InterfaceC1443d) it.next();
            interfaceC1443d.mo3427a(interfaceC1443d);
        }
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f6819d.f6842b.f6669h0);
        sb.append(":");
        switch (this.f6820e) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append("(");
        sb.append(this.f6825j ? Integer.valueOf(this.f6822g) : "unresolved");
        sb.append(") <t=");
        sb.append(this.f6827l.size());
        sb.append(":d=");
        sb.append(this.f6826k.size());
        sb.append(">");
        return sb.toString();
    }
}
