package p022K;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;
import com.altaysoft.t500_split.media.C0639g;
import java.util.Objects;
import p017H0.AbstractC0122a;
import p033Q.C0282p;

/* renamed from: K.O */
/* loaded from: classes.dex */
public final class OnReceiveContentListenerC0167O implements OnReceiveContentListener {

    /* renamed from: a */
    public final InterfaceC0212r f474a;

    public OnReceiveContentListenerC0167O(InterfaceC0212r interfaceC0212r) {
        this.f474a = interfaceC0212r;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        C0188f c0188f = new C0188f(new C0639g(contentInfo));
        C0188f m822a = ((C0282p) this.f474a).m822a(view, c0188f);
        if (m822a == null) {
            return null;
        }
        if (m822a == c0188f) {
            return contentInfo;
        }
        ContentInfo mo541k = m822a.f507a.mo541k();
        Objects.requireNonNull(mo541k);
        return AbstractC0122a.m375i(mo541k);
    }
}
