package p025L0;

import android.graphics.Typeface;
import com.google.android.material.chip.Chip;
import p034Q0.C0292i;
import p034Q0.InterfaceC0291h;
import p121y0.AbstractC1680h;

/* renamed from: L0.b */
/* loaded from: classes.dex */
public final class C0251b extends AbstractC1680h {

    /* renamed from: k */
    public final /* synthetic */ int f632k;

    /* renamed from: l */
    public final /* synthetic */ Object f633l;

    public /* synthetic */ C0251b(int i, Object obj) {
        this.f632k = i;
        this.f633l = obj;
    }

    /* renamed from: Z */
    private final void m736Z(int i) {
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: G */
    public final void mo737G(int i) {
        switch (this.f632k) {
            case 0:
                break;
            default:
                C0292i c0292i = (C0292i) this.f633l;
                c0292i.f820e = true;
                InterfaceC0291h interfaceC0291h = (InterfaceC0291h) c0292i.f821f.get();
                if (interfaceC0291h != null) {
                    interfaceC0291h.mo327a();
                    break;
                }
                break;
        }
    }

    @Override // p121y0.AbstractC1680h
    /* renamed from: H */
    public final void mo738H(Typeface typeface, boolean z2) {
        switch (this.f632k) {
            case 0:
                Chip chip = (Chip) this.f633l;
                C0255f c0255f = chip.f3454j;
                chip.setText(c0255f.f651H0 ? c0255f.f654J : chip.getText());
                chip.requestLayout();
                chip.invalidate();
                break;
            default:
                if (!z2) {
                    C0292i c0292i = (C0292i) this.f633l;
                    c0292i.f820e = true;
                    InterfaceC0291h interfaceC0291h = (InterfaceC0291h) c0292i.f821f.get();
                    if (interfaceC0291h != null) {
                        interfaceC0291h.mo327a();
                        break;
                    }
                }
                break;
        }
    }
}
