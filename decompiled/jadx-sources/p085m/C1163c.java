package p085m;

import android.os.Handler;
import java.util.concurrent.Executors;
import p121y0.AbstractC1687o;

/* renamed from: m.c */
/* loaded from: classes.dex */
public final class C1163c extends AbstractC1687o {

    /* renamed from: d */
    public final Object f5337d = new Object();

    /* renamed from: e */
    public volatile Handler f5338e;

    public C1163c() {
        Executors.newFixedThreadPool(4, new ThreadFactoryC1162b());
    }
}
