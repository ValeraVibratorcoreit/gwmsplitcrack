package p098q0;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import com.altaysoft.t500_split.TopOverlayService;

/* renamed from: q0.w1 */
/* loaded from: classes.dex */
public final class C1366w1 extends ContentObserver {

    /* renamed from: a */
    public final /* synthetic */ TopOverlayService f6419a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1366w1(TopOverlayService topOverlayService, Handler handler) {
        super(handler);
        this.f6419a = topOverlayService;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2) {
        TopOverlayService topOverlayService = TopOverlayService.f2357r;
        this.f6419a.m1705a();
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z2, Uri uri) {
        TopOverlayService topOverlayService = TopOverlayService.f2357r;
        this.f6419a.m1705a();
    }
}
