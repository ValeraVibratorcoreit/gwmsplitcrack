package p017H0;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.sun.jna.win32.DLLCallback;
import p018I.AbstractC0136g;
import p018I.C0135f;

/* renamed from: H0.d */
/* loaded from: classes.dex */
public final class C0125d {

    /* renamed from: a */
    public final boolean f386a;

    /* renamed from: b */
    public final Object f387b;

    public C0125d(C0135f c0135f, boolean z2) {
        this.f387b = c0135f;
        this.f386a = z2;
    }

    /* renamed from: a */
    public boolean m383a() {
        return this.f386a;
    }

    /* renamed from: b */
    public boolean m384b(CharSequence charSequence, int i) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            throw new IllegalArgumentException();
        }
        if (((C0135f) this.f387b) == null) {
            return m383a();
        }
        char c2 = 2;
        for (int i2 = 0; i2 < i && c2 == 2; i2++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i2));
            C0125d c0125d = AbstractC0136g.f416a;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case DLLCallback.DLL_FPTRS /* 16 */:
                        case 17:
                            break;
                        default:
                            c2 = 2;
                            break;
                    }
                }
                c2 = 0;
            }
            c2 = 1;
        }
        if (c2 == 0) {
            return true;
        }
        if (c2 != 1) {
            return m383a();
        }
        return false;
    }

    public C0125d(BottomSheetBehavior bottomSheetBehavior, boolean z2) {
        this.f387b = bottomSheetBehavior;
        this.f386a = z2;
    }
}
