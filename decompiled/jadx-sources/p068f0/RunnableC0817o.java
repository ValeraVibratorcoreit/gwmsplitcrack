package p068f0;

import android.os.Trace;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import p014G.AbstractC0107h;
import p034Q0.C0295l;

/* renamed from: f0.o */
/* loaded from: classes.dex */
public final class RunnableC0817o implements Runnable {

    /* renamed from: e */
    public static final ThreadLocal f4146e = new ThreadLocal();

    /* renamed from: f */
    public static final C0295l f4147f = new C0295l(2);

    /* renamed from: a */
    public ArrayList f4148a;

    /* renamed from: b */
    public long f4149b;

    /* renamed from: c */
    public long f4150c;

    /* renamed from: d */
    public ArrayList f4151d;

    /* renamed from: c */
    public static AbstractC0792W m2317c(RecyclerView recyclerView, int i, long j2) {
        int m603m = recyclerView.f2089j.m603m();
        for (int i2 = 0; i2 < m603m; i2++) {
            AbstractC0792W m1483J = RecyclerView.m1483J(recyclerView.f2089j.m602l(i2));
            if (m1483J.f3997c == i && !m1483J.m2274g()) {
                return null;
            }
        }
        C0784N c0784n = recyclerView.f2083g;
        try {
            recyclerView.m1503Q();
            AbstractC0792W m2260i = c0784n.m2260i(i, j2);
            if (m2260i != null) {
                if (!m2260i.m2273f() || m2260i.m2274g()) {
                    c0784n.m2252a(m2260i, false);
                } else {
                    c0784n.m2257f(m2260i.f3995a);
                }
            }
            recyclerView.m1504R(false);
            return m2260i;
        } catch (Throwable th) {
            recyclerView.m1504R(false);
            throw th;
        }
    }

    /* renamed from: a */
    public final void m2318a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.f2111u && this.f4149b == 0) {
            this.f4149b = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        C0815m c0815m = recyclerView.f2086h0;
        c0815m.f4137a = i;
        c0815m.f4138b = i2;
    }

    /* renamed from: b */
    public final void m2319b(long j2) {
        C0816n c0816n;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        C0816n c0816n2;
        ArrayList arrayList = this.f4148a;
        int size = arrayList.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView3 = (RecyclerView) arrayList.get(i2);
            if (recyclerView3.getWindowVisibility() == 0) {
                C0815m c0815m = recyclerView3.f2086h0;
                c0815m.m2316b(recyclerView3, false);
                i += c0815m.f4140d;
            }
        }
        ArrayList arrayList2 = this.f4151d;
        arrayList2.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView4 = (RecyclerView) arrayList.get(i4);
            if (recyclerView4.getWindowVisibility() == 0) {
                C0815m c0815m2 = recyclerView4.f2086h0;
                int abs = Math.abs(c0815m2.f4138b) + Math.abs(c0815m2.f4137a);
                for (int i5 = 0; i5 < c0815m2.f4140d * 2; i5 += 2) {
                    if (i3 >= arrayList2.size()) {
                        c0816n2 = new C0816n();
                        arrayList2.add(c0816n2);
                    } else {
                        c0816n2 = (C0816n) arrayList2.get(i3);
                    }
                    int[] iArr = c0815m2.f4139c;
                    int i6 = iArr[i5 + 1];
                    c0816n2.f4141a = i6 <= abs;
                    c0816n2.f4142b = abs;
                    c0816n2.f4143c = i6;
                    c0816n2.f4144d = recyclerView4;
                    c0816n2.f4145e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(arrayList2, f4147f);
        for (int i7 = 0; i7 < arrayList2.size() && (recyclerView = (c0816n = (C0816n) arrayList2.get(i7)).f4144d) != null; i7++) {
            AbstractC0792W m2317c = m2317c(recyclerView, c0816n.f4145e, c0816n.f4141a ? Long.MAX_VALUE : j2);
            if (m2317c != null && m2317c.f3996b != null && m2317c.m2273f() && !m2317c.m2274g() && (recyclerView2 = (RecyclerView) m2317c.f3996b.get()) != null) {
                if (recyclerView2.f2057E && recyclerView2.f2089j.m603m() != 0) {
                    AbstractC0774D abstractC0774D = recyclerView2.f2066N;
                    if (abstractC0774D != null) {
                        abstractC0774D.mo2211e();
                    }
                    AbstractC0778H abstractC0778H = recyclerView2.f2103q;
                    C0784N c0784n = recyclerView2.f2083g;
                    if (abstractC0778H != null) {
                        abstractC0778H.m2237i0(c0784n);
                        recyclerView2.f2103q.m2238j0(c0784n);
                    }
                    c0784n.f3957a.clear();
                    c0784n.m2255d();
                }
                C0815m c0815m3 = recyclerView2.f2086h0;
                c0815m3.m2316b(recyclerView2, true);
                if (c0815m3.f4140d != 0) {
                    try {
                        int i8 = AbstractC0107h.f342a;
                        Trace.beginSection("RV Nested Prefetch");
                        C0789T c0789t = recyclerView2.f2088i0;
                        AbstractC0828z abstractC0828z = recyclerView2.f2101p;
                        c0789t.f3976d = 1;
                        c0789t.f3977e = abstractC0828z.mo2089a();
                        c0789t.f3979g = false;
                        c0789t.f3980h = false;
                        c0789t.f3981i = false;
                        for (int i9 = 0; i9 < c0815m3.f4140d * 2; i9 += 2) {
                            m2317c(recyclerView2, c0815m3.f4139c[i9], j2);
                        }
                        Trace.endSection();
                        c0816n.f4141a = false;
                        c0816n.f4142b = 0;
                        c0816n.f4143c = 0;
                        c0816n.f4144d = null;
                        c0816n.f4145e = 0;
                    } catch (Throwable th) {
                        int i10 = AbstractC0107h.f342a;
                        Trace.endSection();
                        throw th;
                    }
                }
            }
            c0816n.f4141a = false;
            c0816n.f4142b = 0;
            c0816n.f4143c = 0;
            c0816n.f4144d = null;
            c0816n.f4145e = 0;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            int i = AbstractC0107h.f342a;
            Trace.beginSection("RV Prefetch");
            ArrayList arrayList = this.f4148a;
            if (arrayList.isEmpty()) {
                this.f4149b = 0L;
                Trace.endSection();
                return;
            }
            int size = arrayList.size();
            long j2 = 0;
            for (int i2 = 0; i2 < size; i2++) {
                RecyclerView recyclerView = (RecyclerView) arrayList.get(i2);
                if (recyclerView.getWindowVisibility() == 0) {
                    j2 = Math.max(recyclerView.getDrawingTime(), j2);
                }
            }
            if (j2 == 0) {
                this.f4149b = 0L;
                Trace.endSection();
            } else {
                m2319b(TimeUnit.MILLISECONDS.toNanos(j2) + this.f4150c);
                this.f4149b = 0L;
                Trace.endSection();
            }
        } catch (Throwable th) {
            this.f4149b = 0L;
            int i3 = AbstractC0107h.f342a;
            Trace.endSection();
            throw th;
        }
    }
}
