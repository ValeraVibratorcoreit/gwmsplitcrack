package p094p;

import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;

/* renamed from: p.g */
/* loaded from: classes.dex */
public abstract class AbstractFutureC1220g implements Future {

    /* renamed from: d */
    public static final boolean f5460d = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));

    /* renamed from: e */
    public static final Logger f5461e = Logger.getLogger(AbstractFutureC1220g.class.getName());

    /* renamed from: f */
    public static final AbstractC0088l f5462f;

    /* renamed from: g */
    public static final Object f5463g;

    /* renamed from: a */
    public volatile Object f5464a;

    /* renamed from: b */
    public volatile C1216c f5465b;

    /* renamed from: c */
    public volatile C1219f f5466c;

    static {
        AbstractC0088l c1218e;
        try {
            c1218e = new C1217d(AtomicReferenceFieldUpdater.newUpdater(C1219f.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C1219f.class, C1219f.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1220g.class, C1219f.class, "c"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1220g.class, C1216c.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractFutureC1220g.class, Object.class, "a"));
            th = null;
        } catch (Throwable th) {
            th = th;
            c1218e = new C1218e();
        }
        f5462f = c1218e;
        if (th != null) {
            f5461e.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
        f5463g = new Object();
    }

    /* renamed from: b */
    public static void m2893b(AbstractFutureC1220g abstractFutureC1220g) {
        C1219f c1219f;
        C1216c c1216c;
        do {
            c1219f = abstractFutureC1220g.f5466c;
        } while (!f5462f.mo315n(abstractFutureC1220g, c1219f, C1219f.f5457c));
        while (c1219f != null) {
            Thread thread = c1219f.f5458a;
            if (thread != null) {
                c1219f.f5458a = null;
                LockSupport.unpark(thread);
            }
            c1219f = c1219f.f5459b;
        }
        do {
            c1216c = abstractFutureC1220g.f5465b;
        } while (!f5462f.mo311l(abstractFutureC1220g, c1216c));
        C1216c c1216c2 = null;
        while (c1216c != null) {
            C1216c c1216c3 = c1216c.f5451a;
            c1216c.f5451a = c1216c2;
            c1216c2 = c1216c;
            c1216c = c1216c3;
        }
        while (c1216c2 != null) {
            c1216c2 = c1216c2.f5451a;
            try {
                throw null;
            } catch (RuntimeException e2) {
                f5461e.log(Level.SEVERE, "RuntimeException while executing runnable null with executor null", (Throwable) e2);
            }
        }
    }

    /* renamed from: c */
    public static Object m2894c(Object obj) {
        if (obj instanceof C1214a) {
            CancellationException cancellationException = ((C1214a) obj).f5449a;
            CancellationException cancellationException2 = new CancellationException("Task was cancelled.");
            cancellationException2.initCause(cancellationException);
            throw cancellationException2;
        }
        if (obj instanceof AbstractC1215b) {
            ((AbstractC1215b) obj).getClass();
            throw new ExecutionException((Throwable) null);
        }
        if (obj == f5463g) {
            return null;
        }
        return obj;
    }

    /* renamed from: d */
    public static Object m2895d(AbstractFutureC1220g abstractFutureC1220g) {
        Object obj;
        boolean z2 = false;
        while (true) {
            try {
                obj = abstractFutureC1220g.get();
                break;
            } catch (InterruptedException unused) {
                z2 = true;
            } catch (Throwable th) {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    /* renamed from: a */
    public final void m2896a(StringBuilder sb) {
        try {
            Object m2895d = m2895d(this);
            sb.append("SUCCESS, result=[");
            sb.append(m2895d == this ? "this future" : String.valueOf(m2895d));
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (RuntimeException e2) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e2.getClass());
            sb.append(" thrown from get()]");
        } catch (ExecutionException e3) {
            sb.append("FAILURE, cause=[");
            sb.append(e3.getCause());
            sb.append("]");
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z2) {
        Object obj = this.f5464a;
        if (obj != null) {
            return false;
        }
        if (!f5462f.mo313m(this, obj, f5460d ? new C1214a(z2, new CancellationException("Future.cancel() was called.")) : z2 ? C1214a.f5447b : C1214a.f5448c)) {
            return false;
        }
        m2893b(this);
        return true;
    }

    /* renamed from: e */
    public final void m2897e(C1219f c1219f) {
        c1219f.f5458a = null;
        while (true) {
            C1219f c1219f2 = this.f5466c;
            if (c1219f2 == C1219f.f5457c) {
                return;
            }
            C1219f c1219f3 = null;
            while (c1219f2 != null) {
                C1219f c1219f4 = c1219f2.f5459b;
                if (c1219f2.f5458a != null) {
                    c1219f3 = c1219f2;
                } else if (c1219f3 != null) {
                    c1219f3.f5459b = c1219f4;
                    if (c1219f3.f5458a == null) {
                        break;
                    }
                } else if (!f5462f.mo315n(this, c1219f2, c1219f4)) {
                    break;
                }
                c1219f2 = c1219f4;
            }
            return;
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj = this.f5464a;
        if (obj != null) {
            return m2894c(obj);
        }
        long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
        if (nanos >= 1000) {
            C1219f c1219f = this.f5466c;
            C1219f c1219f2 = C1219f.f5457c;
            if (c1219f != c1219f2) {
                C1219f c1219f3 = new C1219f();
                do {
                    AbstractC0088l abstractC0088l = f5462f;
                    abstractC0088l.mo305f0(c1219f3, c1219f);
                    if (abstractC0088l.mo315n(this, c1219f, c1219f3)) {
                        do {
                            LockSupport.parkNanos(this, nanos);
                            if (Thread.interrupted()) {
                                m2897e(c1219f3);
                                throw new InterruptedException();
                            }
                            Object obj2 = this.f5464a;
                            if (obj2 != null) {
                                return m2894c(obj2);
                            }
                            nanos = nanoTime - System.nanoTime();
                        } while (nanos >= 1000);
                        m2897e(c1219f3);
                    } else {
                        c1219f = this.f5466c;
                    }
                } while (c1219f != c1219f2);
            }
            return m2894c(this.f5464a);
        }
        while (nanos > 0) {
            Object obj3 = this.f5464a;
            if (obj3 != null) {
                return m2894c(obj3);
            }
            if (Thread.interrupted()) {
                throw new InterruptedException();
            }
            nanos = nanoTime - System.nanoTime();
        }
        String abstractFutureC1220g = toString();
        String obj4 = timeUnit.toString();
        Locale locale = Locale.ROOT;
        String lowerCase = obj4.toLowerCase(locale);
        String str = "Waited " + j2 + " " + timeUnit.toString().toLowerCase(locale);
        if (nanos + 1000 < 0) {
            String m160n = AbstractC0062j.m160n(str, " (plus ");
            long j3 = -nanos;
            long convert = timeUnit.convert(j3, TimeUnit.NANOSECONDS);
            long nanos2 = j3 - timeUnit.toNanos(convert);
            boolean z2 = convert == 0 || nanos2 > 1000;
            if (convert > 0) {
                String str2 = m160n + convert + " " + lowerCase;
                if (z2) {
                    str2 = AbstractC0062j.m160n(str2, ",");
                }
                m160n = AbstractC0062j.m160n(str2, " ");
            }
            if (z2) {
                m160n = m160n + nanos2 + " nanoseconds ";
            }
            str = AbstractC0062j.m160n(m160n, "delay)");
        }
        if (isDone()) {
            throw new TimeoutException(AbstractC0062j.m160n(str, " but future completed as timeout expired"));
        }
        throw new TimeoutException(AbstractC0062j.m169w(str, " for ", abstractFutureC1220g));
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f5464a instanceof C1214a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f5464a != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("[status=");
        if (this.f5464a instanceof C1214a) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            m2896a(sb);
        } else {
            try {
                if (this instanceof ScheduledFuture) {
                    str = "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
                } else {
                    str = null;
                }
            } catch (RuntimeException e2) {
                str = "Exception thrown from implementation: " + e2.getClass();
            }
            if (str != null && !str.isEmpty()) {
                sb.append("PENDING, info=[");
                sb.append(str);
                sb.append("]");
            } else if (isDone()) {
                m2896a(sb);
            } else {
                sb.append("PENDING");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (!Thread.interrupted()) {
            Object obj2 = this.f5464a;
            if (obj2 != null) {
                return m2894c(obj2);
            }
            C1219f c1219f = this.f5466c;
            C1219f c1219f2 = C1219f.f5457c;
            if (c1219f != c1219f2) {
                C1219f c1219f3 = new C1219f();
                do {
                    AbstractC0088l abstractC0088l = f5462f;
                    abstractC0088l.mo305f0(c1219f3, c1219f);
                    if (abstractC0088l.mo315n(this, c1219f, c1219f3)) {
                        do {
                            LockSupport.park(this);
                            if (!Thread.interrupted()) {
                                obj = this.f5464a;
                            } else {
                                m2897e(c1219f3);
                                throw new InterruptedException();
                            }
                        } while (obj == null);
                        return m2894c(obj);
                    }
                    c1219f = this.f5466c;
                } while (c1219f != c1219f2);
            }
            return m2894c(this.f5464a);
        }
        throw new InterruptedException();
    }
}
