package p038T;

import android.text.TextUtils;
import p063d1.C0755p;
import p069f1.InterfaceC0843o;

/* renamed from: T.o */
/* loaded from: classes.dex */
public final class C0321o implements InterfaceC0320n, InterfaceC0843o {

    /* renamed from: f */
    public final /* synthetic */ int f904f;

    /* renamed from: g */
    public final String f905g;

    public /* synthetic */ C0321o(String str, int i) {
        this.f904f = i;
        this.f905g = str;
    }

    @Override // p038T.InterfaceC0320n
    /* renamed from: a */
    public Object mo75a() {
        return this;
    }

    @Override // p038T.InterfaceC0320n
    /* renamed from: d */
    public boolean mo76d(CharSequence charSequence, int i, int i2, C0329w c0329w) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.f905g)) {
            return true;
        }
        c0329w.f934c = (c0329w.f934c & 3) | 4;
        return false;
    }

    @Override // p069f1.InterfaceC0843o
    /* renamed from: o */
    public Object mo902o() {
        switch (this.f904f) {
            case 1:
                throw new C0755p(this.f905g);
            default:
                throw new C0755p(this.f905g);
        }
    }
}
