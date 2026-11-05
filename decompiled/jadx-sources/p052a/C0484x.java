package p052a;

import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import p104s1.InterfaceC1417a;
import p104s1.InterfaceC1428l;
import p107t1.AbstractC1461d;

/* renamed from: a.x */
/* loaded from: classes.dex */
public final class C0484x implements OnBackAnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ InterfaceC1428l f1534a;

    /* renamed from: b */
    public final /* synthetic */ InterfaceC1428l f1535b;

    /* renamed from: c */
    public final /* synthetic */ InterfaceC1417a f1536c;

    /* renamed from: d */
    public final /* synthetic */ InterfaceC1417a f1537d;

    public C0484x(InterfaceC1428l interfaceC1428l, InterfaceC1428l interfaceC1428l2, InterfaceC1417a interfaceC1417a, InterfaceC1417a interfaceC1417a2) {
        this.f1534a = interfaceC1428l;
        this.f1535b = interfaceC1428l2;
        this.f1536c = interfaceC1417a;
        this.f1537d = interfaceC1417a2;
    }

    public final void onBackCancelled() {
        this.f1537d.mo1164a();
    }

    public final void onBackInvoked() {
        this.f1536c.mo1164a();
    }

    public final void onBackProgressed(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        this.f1535b.mo1171c(new C0462b(backEvent));
    }

    public final void onBackStarted(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        this.f1534a.mo1171c(new C0462b(backEvent));
    }
}
