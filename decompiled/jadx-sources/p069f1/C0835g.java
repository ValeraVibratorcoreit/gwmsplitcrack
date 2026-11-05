package p069f1;

import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p066e1.InterfaceC0768a;
import p072g1.C0928i;
import p081k1.C1048a;
import p084l1.C1158a;

/* renamed from: f1.g */
/* loaded from: classes.dex */
public final class C0835g extends AbstractC0764y {

    /* renamed from: a */
    public volatile AbstractC0764y f4222a;

    /* renamed from: b */
    public final /* synthetic */ boolean f4223b;

    /* renamed from: c */
    public final /* synthetic */ C0752m f4224c;

    /* renamed from: d */
    public final /* synthetic */ C1048a f4225d;

    /* renamed from: e */
    public final /* synthetic */ C0836h f4226e;

    public C0835g(C0836h c0836h, boolean z2, boolean z3, C0752m c0752m, C1048a c1048a) {
        this.f4226e = c0836h;
        this.f4223b = z2;
        this.f4224c = c0752m;
        this.f4225d = c1048a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0068, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c A[SYNTHETIC] */
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo2196a(C1158a c1158a) {
        Iterator it;
        if (this.f4223b) {
            c1158a.m2794I();
            return null;
        }
        AbstractC0764y abstractC0764y = this.f4222a;
        if (abstractC0764y == null) {
            C0752m c0752m = this.f4224c;
            C0836h c0836h = this.f4226e;
            C1048a c1048a = this.f4225d;
            c0752m.getClass();
            Objects.requireNonNull(c0836h, "skipPast must not be null");
            C0928i c0928i = c0752m.f3884d;
            c0928i.getClass();
            if (c0836h != C0928i.f4524c) {
                ConcurrentHashMap concurrentHashMap = c0928i.f4526b;
                Class cls = c1048a.f4990a;
                InterfaceC0765z interfaceC0765z = (InterfaceC0765z) concurrentHashMap.get(cls);
                if (interfaceC0765z == null) {
                    InterfaceC0768a interfaceC0768a = (InterfaceC0768a) cls.getAnnotation(InterfaceC0768a.class);
                    if (interfaceC0768a != null) {
                        Class value = interfaceC0768a.value();
                        if (InterfaceC0765z.class.isAssignableFrom(value)) {
                            InterfaceC0765z interfaceC0765z2 = (InterfaceC0765z) c0928i.f4525a.m95z(new C1048a(value)).mo902o();
                            InterfaceC0765z interfaceC0765z3 = (InterfaceC0765z) concurrentHashMap.putIfAbsent(cls, interfaceC0765z2);
                            if (interfaceC0765z3 != null) {
                                interfaceC0765z2 = interfaceC0765z3;
                            }
                        }
                    }
                    it = c0752m.f3885e.iterator();
                    boolean z2 = false;
                    while (true) {
                        if (!it.hasNext()) {
                            InterfaceC0765z interfaceC0765z4 = (InterfaceC0765z) it.next();
                            if (z2) {
                                AbstractC0764y mo2205a = interfaceC0765z4.mo2205a(c0752m, c1048a);
                                if (mo2205a != null) {
                                    abstractC0764y = mo2205a;
                                    break;
                                }
                            } else if (interfaceC0765z4 == c0836h) {
                                z2 = true;
                            }
                        } else {
                            if (z2) {
                                throw new IllegalArgumentException("GSON cannot serialize or deserialize " + c1048a);
                            }
                            abstractC0764y = c0752m.m2198b(c1048a);
                        }
                    }
                    this.f4222a = abstractC0764y;
                }
            }
            c0836h = c0928i;
            it = c0752m.f3885e.iterator();
            boolean z22 = false;
            while (true) {
                if (!it.hasNext()) {
                }
            }
            this.f4222a = abstractC0764y;
        }
        return abstractC0764y.mo2196a(c1158a);
    }
}
