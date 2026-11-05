package p072g1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.TimeZone;
import p006C.AbstractC0062j;
import p063d1.AbstractC0764y;
import p063d1.C0755p;
import p069f1.AbstractC0837i;
import p074h1.AbstractC0948a;
import p084l1.C1158a;

/* renamed from: g1.g */
/* loaded from: classes.dex */
public final class C0926g extends AbstractC0764y {

    /* renamed from: c */
    public static final C0924e f4521c = new C0924e();

    /* renamed from: a */
    public final C0925f f4522a;

    /* renamed from: b */
    public final ArrayList f4523b;

    public C0926g() {
        C0925f c0925f = C0925f.f4520a;
        ArrayList arrayList = new ArrayList();
        this.f4523b = arrayList;
        this.f4522a = c0925f;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (AbstractC0837i.f4230a >= 9) {
            arrayList.add(new SimpleDateFormat(AbstractC0062j.m169w("MMM d, yyyy", " ", "h:mm:ss a"), locale));
        }
    }

    @Override // p063d1.AbstractC0764y
    /* renamed from: a */
    public final Object mo2196a(C1158a c1158a) {
        Date m2484b;
        if (c1158a.m2788C() == 9) {
            c1158a.m2814y();
            return null;
        }
        String m2786A = c1158a.m2786A();
        synchronized (this.f4523b) {
            try {
                Iterator it = this.f4523b.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        try {
                            m2484b = AbstractC0948a.m2484b(m2786A, new ParsePosition(0));
                            break;
                        } catch (ParseException e2) {
                            StringBuilder m163q = AbstractC0062j.m163q("Failed parsing '", m2786A, "' as Date; at path ");
                            m163q.append(c1158a.m2804o(true));
                            throw new C0755p(m163q.toString(), e2);
                        }
                    }
                    DateFormat dateFormat = (DateFormat) it.next();
                    TimeZone timeZone = dateFormat.getTimeZone();
                    try {
                        try {
                            m2484b = dateFormat.parse(m2786A);
                            break;
                        } finally {
                            dateFormat.setTimeZone(timeZone);
                        }
                    } catch (ParseException unused) {
                        dateFormat.setTimeZone(timeZone);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f4522a.getClass();
        return m2484b;
    }

    public final String toString() {
        DateFormat dateFormat = (DateFormat) this.f4523b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
