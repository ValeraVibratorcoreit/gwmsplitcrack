package p072g1;

import java.util.concurrent.atomic.AtomicInteger;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p084l1.C1158a;

/* renamed from: g1.X */
/* loaded from: classes.dex */
public class C0916X extends AbstractC0764y {
    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        try {
            return new AtomicInteger(c1158a.m2810u());
        } catch (NumberFormatException e2) {
            throw new C0755p(e2);
        }
    }
}
