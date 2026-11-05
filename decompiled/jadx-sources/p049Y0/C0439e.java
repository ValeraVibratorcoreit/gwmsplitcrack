package p049Y0;

import android.os.Handler;
import android.os.Message;

/* renamed from: Y0.e */
/* loaded from: classes.dex */
public final class C0439e implements Handler.Callback {

    /* renamed from: a */
    public final /* synthetic */ C0440f f1412a;

    public C0439e(C0440f c0440f) {
        this.f1412a = c0440f;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        C0440f c0440f = this.f1412a;
        if (message.obj != null) {
            throw new ClassCastException();
        }
        synchronized (c0440f.f1414a) {
            throw null;
        }
    }
}
