package p078j1;

import java.sql.Timestamp;
import java.util.Date;
import p063d1.AbstractC0764y;
import p084l1.C1158a;

/* renamed from: j1.d */
/* loaded from: classes.dex */
public final class C0999d extends AbstractC0764y {

    /* renamed from: b */
    public static final C0998c f4734b = new C0998c();

    /* renamed from: a */
    public final AbstractC0764y f4735a;

    public C0999d(AbstractC0764y abstractC0764y) {
        this.f4735a = abstractC0764y;
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        Date date = (Date) this.f4735a.mo2196a(c1158a);
        if (date != null) {
            return new Timestamp(date.getTime());
        }
        return null;
    }
}
