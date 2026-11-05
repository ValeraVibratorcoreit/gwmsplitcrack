package p022K;

import android.view.ContentInfo;
import android.view.View;
import com.altaysoft.t500_split.media.C0639g;
import java.util.Objects;
import p017H0.AbstractC0122a;

/* renamed from: K.N */
/* loaded from: classes.dex */
public abstract class AbstractC0166N {
    /* renamed from: a */
    public static String[] m493a(View view) {
        return view.getReceiveContentMimeTypes();
    }

    /* renamed from: b */
    public static C0188f m494b(View view, C0188f c0188f) {
        ContentInfo mo541k = c0188f.f507a.mo541k();
        Objects.requireNonNull(mo541k);
        ContentInfo m375i = AbstractC0122a.m375i(mo541k);
        ContentInfo performReceiveContent = view.performReceiveContent(m375i);
        if (performReceiveContent == null) {
            return null;
        }
        return performReceiveContent == m375i ? c0188f : new C0188f(new C0639g(performReceiveContent));
    }

    /* renamed from: c */
    public static void m495c(View view, String[] strArr, InterfaceC0212r interfaceC0212r) {
        if (interfaceC0212r == null) {
            view.setOnReceiveContentListener(strArr, null);
        } else {
            view.setOnReceiveContentListener(strArr, new OnReceiveContentListenerC0167O(interfaceC0212r));
        }
    }
}
