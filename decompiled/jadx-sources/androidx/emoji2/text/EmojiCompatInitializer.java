package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.InterfaceC0553r;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.altaysoft.t500_split.media.C0639g;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p038T.C0315i;
import p038T.C0316j;
import p038T.C0324r;
import p073h0.C0946a;
import p073h0.InterfaceC0947b;

/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0947b {
    @Override // p073h0.InterfaceC0947b
    /* renamed from: a */
    public final List mo1355a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // p073h0.InterfaceC0947b
    /* renamed from: b */
    public final Object mo1356b(Context context) {
        Object obj;
        C0324r c0324r = new C0324r(new C0639g(context));
        c0324r.f885a = 1;
        if (C0315i.f889k == null) {
            synchronized (C0315i.f888j) {
                try {
                    if (C0315i.f889k == null) {
                        C0315i.f889k = new C0315i(c0324r);
                    }
                } finally {
                }
            }
        }
        C0946a m2480c = C0946a.m2480c(context);
        m2480c.getClass();
        synchronized (C0946a.f4557e) {
            try {
                obj = m2480c.f4558a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = m2480c.m2482b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        C0555t mo1068d = ((InterfaceC0553r) obj).mo1068d();
        mo1068d.m1377a(new C0316j(this, mo1068d));
        return Boolean.TRUE;
    }
}
