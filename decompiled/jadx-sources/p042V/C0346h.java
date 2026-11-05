package p042V;

import android.widget.EditText;
import java.lang.ref.WeakReference;
import p038T.AbstractC0313g;

/* renamed from: V.h */
/* loaded from: classes.dex */
public final class C0346h extends AbstractC0313g {

    /* renamed from: a */
    public final WeakReference f984a;

    public C0346h(EditText editText) {
        this.f984a = new WeakReference(editText);
    }

    @Override // p038T.AbstractC0313g
    /* renamed from: a */
    public final void mo893a() {
        C0347i.m938a((EditText) this.f984a.get(), 1);
    }
}
