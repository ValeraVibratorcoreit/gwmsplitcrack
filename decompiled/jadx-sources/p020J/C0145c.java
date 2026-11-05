package p020J;

import com.sun.jna.Function;
import p097q.C1238b;
import p107t1.AbstractC1461d;

/* renamed from: J.c */
/* loaded from: classes.dex */
public class C0145c {

    /* renamed from: a */
    public final Object[] f451a;

    /* renamed from: b */
    public int f452b;

    public C0145c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f451a = new Object[i];
    }

    /* renamed from: a */
    public Object mo401a() {
        int i = this.f452b;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.f451a;
        Object obj = objArr[i2];
        AbstractC1461d.m3492c("null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool", obj);
        objArr[i2] = null;
        this.f452b--;
        return obj;
    }

    /* renamed from: b */
    public void m402b(C1238b c1238b) {
        int i = this.f452b;
        Object[] objArr = this.f451a;
        if (i < objArr.length) {
            objArr[i] = c1238b;
            this.f452b = i + 1;
        }
    }

    /* renamed from: c */
    public boolean mo403c(Object obj) {
        Object[] objArr;
        boolean z2;
        AbstractC1461d.m3494e("instance", obj);
        int i = this.f452b;
        int i2 = 0;
        while (true) {
            objArr = this.f451a;
            if (i2 >= i) {
                z2 = false;
                break;
            }
            if (objArr[i2] == obj) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i3 = this.f452b;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = obj;
        this.f452b = i3 + 1;
        return true;
    }

    public C0145c() {
        this.f451a = new Object[Function.MAX_NARGS];
    }
}
