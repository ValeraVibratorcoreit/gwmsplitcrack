package p078j1;

import java.sql.Timestamp;
import java.util.Date;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;

/* renamed from: j1.c */
/* loaded from: classes.dex */
public class C0998c implements InterfaceC0765z {
    @Override // p063d1.InterfaceC0765z
    /* renamed from: a */
    public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
        if (c1048a.f4990a != Timestamp.class) {
            return null;
        }
        c0752m.getClass();
        return new C0999d(c0752m.m2198b(new C1048a(Date.class)));
    }
}
