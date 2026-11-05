package p038T;

import java.util.concurrent.ThreadPoolExecutor;
import p121y0.AbstractC1687o;

/* renamed from: T.k */
/* loaded from: classes.dex */
public final class C0317k extends AbstractC1687o {

    /* renamed from: d */
    public final /* synthetic */ AbstractC1687o f901d;

    /* renamed from: e */
    public final /* synthetic */ ThreadPoolExecutor f902e;

    public C0317k(AbstractC1687o abstractC1687o, ThreadPoolExecutor threadPoolExecutor) {
        this.f901d = abstractC1687o;
        this.f902e = threadPoolExecutor;
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: H */
    public final void mo875H(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.f902e;
        try {
            this.f901d.mo875H(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // p121y0.AbstractC1687o
    /* renamed from: I */
    public final void mo876I(C0326t c0326t) {
        ThreadPoolExecutor threadPoolExecutor = this.f902e;
        try {
            this.f901d.mo876I(c0326t);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
