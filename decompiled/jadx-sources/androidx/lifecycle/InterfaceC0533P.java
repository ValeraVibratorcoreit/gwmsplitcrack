package androidx.lifecycle;

import p053a0.C0489c;

/* renamed from: androidx.lifecycle.P */
/* loaded from: classes.dex */
public interface InterfaceC0533P {
    /* renamed from: a */
    default AbstractC0532O mo1039a(Class cls) {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }

    /* renamed from: b */
    default AbstractC0532O mo1364b(Class cls, C0489c c0489c) {
        return mo1039a(cls);
    }
}
