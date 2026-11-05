package p052a;

import android.window.BackEvent;
import p107t1.AbstractC1461d;

/* renamed from: a.a */
/* loaded from: classes.dex */
public final class C0461a {

    /* renamed from: a */
    public static final C0461a f1473a = new C0461a();

    /* renamed from: a */
    public final BackEvent m1172a(float f2, float f3, float f4, int i) {
        return new BackEvent(f2, f3, f4, i);
    }

    /* renamed from: b */
    public final float m1173b(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        return backEvent.getProgress();
    }

    /* renamed from: c */
    public final int m1174c(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        return backEvent.getSwipeEdge();
    }

    /* renamed from: d */
    public final float m1175d(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        return backEvent.getTouchX();
    }

    /* renamed from: e */
    public final float m1176e(BackEvent backEvent) {
        AbstractC1461d.m3494e("backEvent", backEvent);
        return backEvent.getTouchY();
    }
}
