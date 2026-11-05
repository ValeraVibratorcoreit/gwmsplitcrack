package p109u0;

import android.graphics.Bitmap;
import java.util.function.Consumer;
import p098q0.InterfaceC1351r1;

/* renamed from: u0.o0 */
/* loaded from: classes.dex */
public final class C1562o0 implements InterfaceC1351r1 {

    /* renamed from: f */
    public final /* synthetic */ int f8492f;

    /* renamed from: g */
    public final /* synthetic */ Consumer f8493g;

    public /* synthetic */ C1562o0(Consumer consumer, int i) {
        this.f8492f = i;
        this.f8493g = consumer;
    }

    @Override // p098q0.InterfaceC1351r1
    /* renamed from: b */
    public final void mo57b(Bitmap bitmap) {
        switch (this.f8492f) {
            case 0:
                this.f8493g.accept(bitmap);
                break;
            case 1:
                this.f8493g.accept(bitmap);
                break;
            case 2:
                this.f8493g.accept(bitmap);
                break;
            case 3:
                this.f8493g.accept(bitmap);
                break;
            default:
                this.f8493g.accept(bitmap);
                break;
        }
    }
}
