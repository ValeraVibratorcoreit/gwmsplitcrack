package androidx.lifecycle;

/* renamed from: androidx.lifecycle.x */
/* loaded from: classes.dex */
public abstract class AbstractC0559x {

    /* renamed from: a */
    public final InterfaceC0561z f2012a;

    /* renamed from: b */
    public boolean f2013b;

    /* renamed from: c */
    public int f2014c = -1;

    /* renamed from: d */
    public final /* synthetic */ C0560y f2015d;

    public AbstractC0559x(C0560y c0560y, InterfaceC0561z interfaceC0561z) {
        this.f2015d = c0560y;
        this.f2012a = interfaceC0561z;
    }

    /* renamed from: a */
    public final void m1391a(boolean z2) {
        if (z2 == this.f2013b) {
            return;
        }
        this.f2013b = z2;
        int i = z2 ? 1 : -1;
        C0560y c0560y = this.f2015d;
        int i2 = c0560y.f2019c;
        c0560y.f2019c = i + i2;
        if (!c0560y.f2020d) {
            c0560y.f2020d = true;
            while (true) {
                try {
                    int i3 = c0560y.f2019c;
                    if (i2 == i3) {
                        break;
                    } else {
                        i2 = i3;
                    }
                } finally {
                    c0560y.f2020d = false;
                }
            }
        }
        if (this.f2013b) {
            c0560y.m1394c(this);
        }
    }

    /* renamed from: b */
    public void mo1389b() {
    }

    /* renamed from: c */
    public boolean mo1390c(InterfaceC0553r interfaceC0553r) {
        return false;
    }

    /* renamed from: e */
    public abstract boolean mo1388e();
}
