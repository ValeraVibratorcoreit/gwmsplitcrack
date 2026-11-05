package p046X;

import android.os.Handler;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.InterfaceC0535S;
import p052a.InterfaceC0458D;
import p070g.AbstractActivityC0870i;
import p071g0.C0891d;
import p071g0.InterfaceC0893f;
import p121y0.AbstractC1680h;

/* renamed from: X.z */
/* loaded from: classes.dex */
public final class C0427z extends AbstractC1680h implements InterfaceC0535S, InterfaceC0458D, InterfaceC0893f, InterfaceC0391T {

    /* renamed from: k */
    public final AbstractActivityC0870i f1384k;

    /* renamed from: l */
    public final AbstractActivityC0870i f1385l;

    /* renamed from: m */
    public final Handler f1386m;

    /* renamed from: n */
    public final C0387O f1387n;

    /* renamed from: o */
    public final /* synthetic */ AbstractActivityC0870i f1388o;

    public C0427z(AbstractActivityC0870i abstractActivityC0870i) {
        this.f1388o = abstractActivityC0870i;
        Handler handler = new Handler();
        this.f1387n = new C0387O();
        this.f1384k = abstractActivityC0870i;
        this.f1385l = abstractActivityC0870i;
        this.f1386m = handler;
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: F */
    public final View mo1101F(int i) {
        return this.f1388o.findViewById(i);
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: I */
    public final boolean mo1102I() {
        Window window = this.f1388o.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // p046X.InterfaceC0391T
    /* renamed from: a */
    public final void mo981a() {
    }

    @Override // p071g0.InterfaceC0893f
    /* renamed from: b */
    public final C0891d mo1066b() {
        return this.f1388o.f1504i.f4475b;
    }

    @Override // androidx.lifecycle.InterfaceC0535S
    /* renamed from: c */
    public final C0534Q mo1067c() {
        return this.f1388o.mo1067c();
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        return this.f1388o.f4368z;
    }
}
