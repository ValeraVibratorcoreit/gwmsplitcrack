package p042V;

import android.text.InputFilter;
import android.widget.TextView;
import p010D1.AbstractC0088l;
import p038T.C0315i;

/* renamed from: V.g */
/* loaded from: classes.dex */
public final class C0345g extends AbstractC0088l {

    /* renamed from: c */
    public final C0344f f983c;

    public C0345g(TextView textView) {
        this.f983c = new C0344f(textView);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: H */
    public final InputFilter[] mo285H(InputFilter[] inputFilterArr) {
        return !(C0315i.f889k != null) ? inputFilterArr : this.f983c.mo285H(inputFilterArr);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: j0 */
    public final void mo308j0(boolean z2) {
        if (C0315i.f889k != null) {
            this.f983c.mo308j0(z2);
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: m0 */
    public final void mo314m0(boolean z2) {
        boolean z3 = C0315i.f889k != null;
        C0344f c0344f = this.f983c;
        if (z3) {
            c0344f.mo314m0(z2);
        } else {
            c0344f.f982e = z2;
        }
    }
}
