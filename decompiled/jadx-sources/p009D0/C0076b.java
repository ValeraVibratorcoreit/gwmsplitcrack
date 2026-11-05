package p009D0;

import android.view.View;
import p022K.C0221v0;
import p022K.InterfaceC0210q;

/* renamed from: D0.b */
/* loaded from: classes.dex */
public final class C0076b implements InterfaceC0210q {

    /* renamed from: f */
    public int f236f;

    /* renamed from: g */
    public final View f237g;

    /* renamed from: h */
    public int f238h;

    public C0076b(View view) {
        this.f237g = view;
    }

    @Override // p022K.InterfaceC0210q
    /* renamed from: c */
    public C0221v0 mo18c(View view, C0221v0 c0221v0) {
        int i = c0221v0.f573a.mo654f(7).f204b;
        View view2 = this.f237g;
        int i2 = this.f236f;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.f238h + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c0221v0;
    }

    public C0076b(View view, int i, int i2) {
        this.f236f = i;
        this.f237g = view;
        this.f238h = i2;
    }
}
