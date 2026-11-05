package p002A1;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p005B1.AbstractC0052a;

/* renamed from: A1.a */
/* loaded from: classes.dex */
public final class C0033a extends AbstractC0052a {

    /* renamed from: c */
    public static final AtomicReferenceFieldUpdater f110c = AtomicReferenceFieldUpdater.newUpdater(C0033a.class, Object.class, "_state");
    private volatile Object _state;

    /* renamed from: b */
    public int f111b;

    public C0033a(Object obj) {
        this._state = obj;
    }
}
