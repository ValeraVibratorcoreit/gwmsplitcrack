package p063d1;

import java.io.IOException;
import java.io.StringWriter;
import p072g1.AbstractC0920a0;
import p072g1.C0906M;
import p084l1.C1159b;

/* renamed from: d1.o */
/* loaded from: classes.dex */
public abstract class AbstractC0754o {
    public final String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C1159b c1159b = new C1159b(stringWriter);
            c1159b.f5331h = 1;
            AbstractC0920a0.f4511z.getClass();
            C0906M.m2471c(c1159b, this);
            return stringWriter.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }
}
