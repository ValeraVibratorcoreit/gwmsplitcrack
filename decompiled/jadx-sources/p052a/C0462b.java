package p052a;

import android.window.BackEvent;
import p107t1.AbstractC1461d;

/* renamed from: a.b */
/* loaded from: classes.dex */
public final class C0462b {

    /* renamed from: a */
    public final float f1474a;

    /* renamed from: b */
    public final float f1475b;

    /* renamed from: c */
    public final float f1476c;

    /* renamed from: d */
    public final int f1477d;

    public C0462b(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        C0461a c0461a = C0461a.f1473a;
        float m1175d = c0461a.m1175d(backEvent);
        float m1176e = c0461a.m1176e(backEvent);
        float m1173b = c0461a.m1173b(backEvent);
        int m1174c = c0461a.m1174c(backEvent);
        this.f1474a = m1175d;
        this.f1475b = m1176e;
        this.f1476c = m1173b;
        this.f1477d = m1174c;
    }

    public final String toString() {
        return "BackEventCompat{touchX=" + this.f1474a + ", touchY=" + this.f1475b + ", progress=" + this.f1476c + ", swipeEdge=" + this.f1477d + '}';
    }
}
