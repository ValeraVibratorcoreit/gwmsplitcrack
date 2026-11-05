package p022K;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import p010D1.AbstractC0088l;
import p045W0.C0355e;

/* renamed from: K.x0 */
/* loaded from: classes.dex */
public final class C0225x0 extends AbstractC0088l {

    /* renamed from: c */
    public final WindowInsetsController f576c;

    /* renamed from: d */
    public Window f577d;

    public C0225x0(WindowInsetsController windowInsetsController, C0355e c0355e) {
        this.f576c = windowInsetsController;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: k0 */
    public final void mo310k0(boolean z2) {
        Window window = this.f577d;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f576c.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f576c.setSystemBarsAppearance(0, 16);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: l0 */
    public final void mo312l0(boolean z2) {
        Window window = this.f577d;
        if (z2) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 8192);
            }
            this.f576c.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f576c.setSystemBarsAppearance(0, 8);
    }
}
