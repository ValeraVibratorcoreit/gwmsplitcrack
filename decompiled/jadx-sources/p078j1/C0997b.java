package p078j1;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.TimeZone;
import p063d1.AbstractC0764y;
import p063d1.C0752m;
import p063d1.C0755p;
import p063d1.InterfaceC0765z;
import p081k1.C1048a;
import p084l1.C1158a;

/* renamed from: j1.b */
/* loaded from: classes.dex */
public final class C0997b extends AbstractC0764y {

    /* renamed from: b */
    public static final a f4732b = new a();

    /* renamed from: a */
    public final SimpleDateFormat f4733a;

    /* renamed from: j1.b$a */
    public class a implements InterfaceC0765z {
        @Override // p063d1.InterfaceC0765z
        /* renamed from: a */
        public final AbstractC0764y mo2205a(C0752m c0752m, C1048a c1048a) {
            if (c1048a.f4990a == Time.class) {
                return new C0997b(0);
            }
            return null;
        }
    }

    public /* synthetic */ C0997b(int i) {
        this();
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        Time time;
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        String m2786A = c1158a.m2786A();
        synchronized (this) {
            TimeZone timeZone = this.f4733a.getTimeZone();
            try {
                try {
                    time = new Time(this.f4733a.parse(m2786A).getTime());
                } catch (ParseException e2) {
                    throw new C0755p("Failed parsing '" + m2786A + "' as SQL Time; at path " + c1158a.m2804o(true), e2);
                }
            } finally {
                this.f4733a.setTimeZone(timeZone);
            }
        }
        return time;
    }

    private C0997b() {
        this.f4733a = new SimpleDateFormat("hh:mm:ss a");
    }
}
