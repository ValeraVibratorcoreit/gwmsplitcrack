package p046X;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.InterfaceC0535S;
import androidx.lifecycle.InterfaceC0543h;
import java.util.LinkedHashMap;
import p001A0.RunnableC0024r;
import p053a0.C0489c;
import p071g0.C0891d;
import p071g0.C0892e;
import p071g0.InterfaceC0893f;

/* renamed from: X.Y */
/* loaded from: classes.dex */
public final class C0396Y implements InterfaceC0543h, InterfaceC0893f, InterfaceC0535S {

    /* renamed from: f */
    public final AbstractComponentCallbacksC0423v f1221f;

    /* renamed from: g */
    public final C0534Q f1222g;

    /* renamed from: h */
    public final RunnableC0024r f1223h;

    /* renamed from: i */
    public C0555t f1224i = null;

    /* renamed from: j */
    public C0892e f1225j = null;

    public C0396Y(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, C0534Q c0534q, RunnableC0024r runnableC0024r) {
        this.f1221f = abstractComponentCallbacksC0423v;
        this.f1222g = c0534q;
        this.f1223h = runnableC0024r;
    }

    @Override // androidx.lifecycle.InterfaceC0543h
    /* renamed from: a */
    public final C0489c mo1065a() {
        Application application;
        AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = this.f1221f;
        Context applicationContext = abstractComponentCallbacksC0423v.m1119K().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        C0489c c0489c = new C0489c(0);
        LinkedHashMap linkedHashMap = c0489c.f1544a;
        if (application != null) {
            linkedHashMap.put(AbstractC0528K.f1970d, application);
        }
        linkedHashMap.put(AbstractC0528K.f1967a, abstractComponentCallbacksC0423v);
        linkedHashMap.put(AbstractC0528K.f1968b, this);
        Bundle bundle = abstractComponentCallbacksC0423v.f1362k;
        if (bundle != null) {
            linkedHashMap.put(AbstractC0528K.f1969c, bundle);
        }
        return c0489c;
    }

    @Override // p071g0.InterfaceC0893f
    /* renamed from: b */
    public final C0891d mo1066b() {
        m1070f();
        return this.f1225j.f4475b;
    }

    @Override // androidx.lifecycle.InterfaceC0535S
    /* renamed from: c */
    public final C0534Q mo1067c() {
        m1070f();
        return this.f1222g;
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        m1070f();
        return this.f1224i;
    }

    /* renamed from: e */
    public final void m1069e(EnumC0547l enumC0547l) {
        this.f1224i.m1380d(enumC0547l);
    }

    /* renamed from: f */
    public final void m1070f() {
        if (this.f1224i == null) {
            this.f1224i = new C0555t(this);
            C0892e c0892e = new C0892e(this);
            this.f1225j = c0892e;
            c0892e.m2467a();
            this.f1223h.run();
        }
    }
}
