package p052a;

import android.window.OnBackInvokedCallback;
import p104s1.InterfaceC1417a;
import p104s1.InterfaceC1428l;
import p107t1.AbstractC1461d;

/* renamed from: a.y */
/* loaded from: classes.dex */
public final class C0485y {

    /* renamed from: a */
    public static final C0485y f1538a = new C0485y();

    /* renamed from: a */
    public final OnBackInvokedCallback m1199a(InterfaceC1428l interfaceC1428l, InterfaceC1428l interfaceC1428l2, InterfaceC1417a interfaceC1417a, InterfaceC1417a interfaceC1417a2) {
        AbstractC1461d.m3494e("onBackStarted", interfaceC1428l);
        AbstractC1461d.m3494e("onBackProgressed", interfaceC1428l2);
        AbstractC1461d.m3494e("onBackInvoked", interfaceC1417a);
        AbstractC1461d.m3494e("onBackCancelled", interfaceC1417a2);
        return new C0484x(interfaceC1428l, interfaceC1428l2, interfaceC1417a, interfaceC1417a2);
    }
}
