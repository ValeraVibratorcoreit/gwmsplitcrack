package p107t1;

import java.io.Serializable;

/* renamed from: t1.e */
/* loaded from: classes.dex */
public abstract class AbstractC1462e implements InterfaceC1460c, Serializable {

    /* renamed from: a */
    public final int f7162a;

    public AbstractC1462e(int i) {
        this.f7162a = i;
    }

    @Override // p107t1.InterfaceC1460c
    /* renamed from: b */
    public final int mo1165b() {
        return this.f7162a;
    }

    public final String toString() {
        AbstractC1464g.f7163a.getClass();
        String obj = getClass().getGenericInterfaces()[0].toString();
        if (obj.startsWith("kotlin.jvm.functions.")) {
            obj = obj.substring(21);
        }
        AbstractC1461d.m3493d("renderLambdaToString(this)", obj);
        return obj;
    }
}
