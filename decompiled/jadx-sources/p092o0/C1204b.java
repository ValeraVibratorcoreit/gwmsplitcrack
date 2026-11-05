package p092o0;

import com.altaysoft.t500_split.configActivity.CFG4;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import p095p0.AbstractC1230i;

/* renamed from: o0.b */
/* loaded from: classes.dex */
public final class C1204b extends AbstractC1230i {

    /* renamed from: a */
    public final /* synthetic */ int f5426a;

    /* renamed from: b */
    public final Object f5427b;

    public /* synthetic */ C1204b(int i, Object obj) {
        this.f5426a = i;
        this.f5427b = obj;
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: a */
    public void mo1159a(int i) {
        switch (this.f5426a) {
            case 0:
                ((C1205c) this.f5427b).m2878b(false);
                return;
            case 1:
                try {
                    Iterator it = ((ArrayList) this.f5427b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC1230i) it.next()).mo1159a(i);
                    }
                    return;
                } catch (ConcurrentModificationException e2) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
                }
            default:
                return;
        }
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: b */
    public void mo1160b(int i, float f2, int i2) {
        switch (this.f5426a) {
            case 1:
                try {
                    Iterator it = ((ArrayList) this.f5427b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC1230i) it.next()).mo1160b(i, f2, i2);
                    }
                    return;
                } catch (ConcurrentModificationException e2) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
                }
            default:
                return;
        }
    }

    @Override // p095p0.AbstractC1230i
    /* renamed from: c */
    public final void mo1161c(int i) {
        switch (this.f5426a) {
            case 0:
                ((C1205c) this.f5427b).m2878b(false);
                return;
            case 1:
                try {
                    Iterator it = ((ArrayList) this.f5427b).iterator();
                    while (it.hasNext()) {
                        ((AbstractC1230i) it.next()).mo1161c(i);
                    }
                    return;
                } catch (ConcurrentModificationException e2) {
                    throw new IllegalStateException("Adding and removing callbacks during dispatch to callbacks is not supported", e2);
                }
            default:
                CFG4 cfg4 = (CFG4) this.f5427b;
                if (i == 0) {
                    CFG4.f2728F.f2724z0 = 2;
                    cfg4.f2729E.setVisibility(0);
                    return;
                }
                if (i == 1) {
                    CFG4.f2728F.f2724z0 = 3;
                    cfg4.f2729E.setVisibility(0);
                    return;
                }
                if (i == 2) {
                    CFG4.f2728F.f2724z0 = 4;
                    cfg4.f2729E.setVisibility(0);
                    return;
                } else if (i == 3) {
                    CFG4.f2728F.f2724z0 = 5;
                    cfg4.f2729E.setVisibility(0);
                    return;
                } else {
                    if (i != 4) {
                        return;
                    }
                    CFG4.f2728F.f2724z0 = 6;
                    cfg4.f2729E.setVisibility(4);
                    return;
                }
        }
    }

    public C1204b() {
        this.f5426a = 1;
        this.f5427b = new ArrayList(3);
    }
}
