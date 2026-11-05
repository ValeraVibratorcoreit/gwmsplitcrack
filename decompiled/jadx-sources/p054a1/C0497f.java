package p054a1;

import com.google.android.material.internal.CheckableImageButton;
import p010D1.AbstractC0088l;

/* renamed from: a1.f */
/* loaded from: classes.dex */
public final class C0497f extends AbstractC0507p {

    /* renamed from: e */
    public final /* synthetic */ int f1564e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0497f(C0506o c0506o, int i) {
        super(c0506o);
        this.f1564e = i;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: r */
    public void mo1208r() {
        switch (this.f1564e) {
            case 0:
                C0506o c0506o = this.f1614b;
                c0506o.f1606t = null;
                CheckableImageButton checkableImageButton = c0506o.f1598l;
                checkableImageButton.setOnLongClickListener(null);
                AbstractC0088l.m274n0(checkableImageButton, null);
                break;
        }
    }
}
