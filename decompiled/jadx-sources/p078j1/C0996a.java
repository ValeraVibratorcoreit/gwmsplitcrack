package p078j1;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.C0755p;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;
import p084l1.C1158a;

/* renamed from: j1.a */
/* loaded from: classes.dex */
public final class C0996a extends AbstractC0764y {

    /* renamed from: b */
    public static final a f4730b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f4731a;

    /* renamed from: j1.a$a */
    public class a implements InterfaceC0765z {
        @Override // p063d1.InterfaceC0765z
        /* renamed from: a */
        public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
            if (c1048a.f4990a == Date.class) {
                return new C0996a(0);
            }
            return null;
        }
    }

    public /* synthetic */ C0996a(int i) {
        this();
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        Date date;
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        String m2786A = c1158a.m2786A();
        synchronized (this) {
            TimeZone timeZone = this.f4731a.getTimeZone();
            try {
                try {
                    date = new Date(this.f4731a.parse(m2786A).getTime());
                } catch (ParseException e2) {
                    throw new C0755p("Failed parsing '" + m2786A + "' as SQL Date; at path " + c1158a.m2804o(true), e2);
                }
            } finally {
                this.f4731a.setTimeZone(timeZone);
            }
        }
        return date;
    }

    private C0996a() {
        this.f4731a = new SimpleDateFormat("MMM d, yyyy");
    }
}
