package p109u0;

import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.carData;
import p001A0.RunnableC0024r;
import p098q0.AbstractC1372y1;

/* renamed from: u0.f0 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1535f0 implements InterfaceC0561z {

    /* renamed from: a */
    public final /* synthetic */ int f8195a;

    /* renamed from: b */
    public final /* synthetic */ Object f8196b;

    /* renamed from: c */
    public final /* synthetic */ Object f8197c;

    public /* synthetic */ C1535f0(Object obj, int i, Object obj2) {
        this.f8195a = i;
        this.f8196b = obj;
        this.f8197c = obj2;
    }

    @Override // androidx.lifecycle.InterfaceC0561z
    /* renamed from: a */
    public final void mo1100a(Object obj) {
        switch (this.f8195a) {
            case 0:
                C1541h0 c1541h0 = (C1541h0) this.f8196b;
                c1541h0.getClass();
                if (AbstractC1372y1.m3272C()) {
                    c1541h0.m4274l();
                }
                ((RunnableC1529d0) this.f8197c).run();
                break;
            case 1:
                AbstractC1539g1.m4225k(((C1541h0) this.f8196b).f8291c);
                ((RunnableC1529d0) this.f8197c).run();
                break;
            default:
                Integer num = (Integer) obj;
                carData cardata = (carData) this.f8196b;
                cardata.getClass();
                if (num != null && num.intValue() != 0) {
                    ((InterfaceC0561z) this.f8197c).mo1100a(num);
                    cardata.f2429a.post(new RunnableC0024r(25, cardata));
                    break;
                }
                break;
        }
    }
}
