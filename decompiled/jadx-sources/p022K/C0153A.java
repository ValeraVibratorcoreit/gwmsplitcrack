package p022K;

import android.text.TextUtils;
import android.view.View;

/* renamed from: K.A */
/* loaded from: classes.dex */
public final class C0153A extends AbstractC0155C {

    /* renamed from: e */
    public final /* synthetic */ int f465e;

    public C0153A(int i, Class cls, int i2, int i3, int i4) {
        this.f465e = i4;
        this.f467a = i;
        this.f470d = cls;
        this.f469c = i2;
        this.f468b = i3;
    }

    @Override // p022K.AbstractC0155C
    /* renamed from: b */
    public final Object mo412b(View view) {
        switch (this.f465e) {
            case 0:
                return Boolean.valueOf(AbstractC0163K.m475d(view));
            case 1:
                return AbstractC0163K.m473b(view);
            default:
                return Boolean.valueOf(AbstractC0163K.m474c(view));
        }
    }

    @Override // p022K.AbstractC0155C
    /* renamed from: c */
    public final void mo413c(View view, Object obj) {
        switch (this.f465e) {
            case 0:
                AbstractC0163K.m481j(view, ((Boolean) obj).booleanValue());
                break;
            case 1:
                AbstractC0163K.m479h(view, (CharSequence) obj);
                break;
            default:
                AbstractC0163K.m478g(view, ((Boolean) obj).booleanValue());
                break;
        }
    }

    @Override // p022K.AbstractC0155C
    /* renamed from: e */
    public final boolean mo414e(Object obj, Object obj2) {
        switch (this.f465e) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                return !((bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue()));
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                return !((bool3 != null && bool3.booleanValue()) == (bool4 != null && bool4.booleanValue()));
        }
    }
}
