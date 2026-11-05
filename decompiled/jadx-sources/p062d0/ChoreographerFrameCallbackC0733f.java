package p062d0;

import android.view.Choreographer;
import com.altaysoft.t500_split.MarqueeTextView;

/* renamed from: d0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class ChoreographerFrameCallbackC0733f implements Choreographer.FrameCallback {

    /* renamed from: a */
    public final /* synthetic */ int f3856a;

    /* renamed from: b */
    public final /* synthetic */ Object f3857b;

    public /* synthetic */ ChoreographerFrameCallbackC0733f(int i, Object obj) {
        this.f3856a = i;
        this.f3857b = obj;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        switch (this.f3856a) {
            case 0:
                ((Runnable) this.f3857b).run();
                break;
            default:
                MarqueeTextView.m1692a((MarqueeTextView) this.f3857b, j2);
                break;
        }
    }
}
