package p082l;

import androidx.appcompat.widget.ActionBarContextView;
import p022K.InterfaceC0176Y;

/* renamed from: l.a */
/* loaded from: classes.dex */
public final class C1100a implements InterfaceC0176Y {

    /* renamed from: a */
    public boolean f5147a = false;

    /* renamed from: b */
    public int f5148b;

    /* renamed from: c */
    public final /* synthetic */ ActionBarContextView f5149c;

    public C1100a(ActionBarContextView actionBarContextView) {
        this.f5149c = actionBarContextView;
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: a */
    public final void mo525a() {
        if (this.f5147a) {
            return;
        }
        ActionBarContextView actionBarContextView = this.f5149c;
        actionBarContextView.f1727k = null;
        super/*android.view.View*/.setVisibility(this.f5148b);
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: b */
    public final void mo299b() {
        this.f5147a = true;
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: c */
    public final void mo301c() {
        super/*android.view.View*/.setVisibility(0);
        this.f5147a = false;
    }
}
