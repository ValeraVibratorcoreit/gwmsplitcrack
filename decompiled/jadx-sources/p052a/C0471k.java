package p052a;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.InterfaceC0535S;
import p001A0.RunnableC0018l;
import p070g.AbstractActivityC0870i;
import p087m1.C1169d;
import p104s1.InterfaceC1417a;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1462e;

/* renamed from: a.k */
/* loaded from: classes.dex */
public final class C0471k extends AbstractC1462e implements InterfaceC1417a {

    /* renamed from: b */
    public final /* synthetic */ int f1498b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC0535S f1499c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0471k(InterfaceC0535S interfaceC0535S, int i) {
        super(0);
        this.f1498b = i;
        this.f1499c = interfaceC0535S;
    }

    @Override // p104s1.InterfaceC1417a
    /* renamed from: a */
    public final Object mo1164a() {
        switch (this.f1498b) {
            case 0:
                ((AbstractActivityC0870i) this.f1499c).reportFullyDrawn();
                return C1169d.f5345c;
            case 1:
                AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this.f1499c;
                return new C0479s(abstractActivityC0870i.f1506k, new C0471k(abstractActivityC0870i, 0));
            case 2:
                AbstractActivityC0870i abstractActivityC0870i2 = (AbstractActivityC0870i) this.f1499c;
                C0457C c0457c = new C0457C(new RunnableC0464d(abstractActivityC0870i2, 1));
                if (Build.VERSION.SDK_INT >= 33) {
                    if (AbstractC1461d.m3490a(Looper.myLooper(), Looper.getMainLooper())) {
                        abstractActivityC0870i2.f1501f.m1377a(new C0466f(c0457c, abstractActivityC0870i2));
                    } else {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0018l(abstractActivityC0870i2, 4, c0457c));
                    }
                }
                return c0457c;
            default:
                return AbstractC0528K.m1367e(this.f1499c);
        }
    }
}
