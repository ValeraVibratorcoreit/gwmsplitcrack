package p094p;

import java.util.concurrent.CancellationException;

/* renamed from: p.a */
/* loaded from: classes.dex */
public final class C1214a {

    /* renamed from: b */
    public static final C1214a f5447b;

    /* renamed from: c */
    public static final C1214a f5448c;

    /* renamed from: a */
    public final CancellationException f5449a;

    static {
        if (AbstractFutureC1220g.f5460d) {
            f5448c = null;
            f5447b = null;
        } else {
            f5448c = new C1214a(false, null);
            f5447b = new C1214a(true, null);
        }
    }

    public C1214a(boolean z2, CancellationException cancellationException) {
        this.f5449a = cancellationException;
    }
}
