package p077j0;

import java.util.ArrayList;
import p091o.C1192b;

/* renamed from: j0.o */
/* loaded from: classes.dex */
public final class C0984o extends AbstractC0983n {

    /* renamed from: a */
    public final /* synthetic */ C1192b f4716a;

    /* renamed from: b */
    public final /* synthetic */ ViewTreeObserverOnPreDrawListenerC0985p f4717b;

    public C0984o(ViewTreeObserverOnPreDrawListenerC0985p viewTreeObserverOnPreDrawListenerC0985p, C1192b c1192b) {
        this.f4717b = viewTreeObserverOnPreDrawListenerC0985p;
        this.f4716a = c1192b;
    }

    @Override // p077j0.InterfaceC0980k
    /* renamed from: e */
    public final void mo2517e(AbstractC0982m abstractC0982m) {
        ((ArrayList) this.f4716a.getOrDefault(this.f4717b.f4719g, null)).remove(abstractC0982m);
        abstractC0982m.mo2536x(this);
    }
}
