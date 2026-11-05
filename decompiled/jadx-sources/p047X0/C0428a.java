package p047X0;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p010D1.AbstractC0088l;

/* renamed from: X0.a */
/* loaded from: classes.dex */
public final class C0428a extends AbstractC0088l {

    /* renamed from: c */
    public final /* synthetic */ int f1389c;

    /* renamed from: d */
    public final SideSheetBehavior f1390d;

    public /* synthetic */ C0428a(SideSheetBehavior sideSheetBehavior, int i) {
        this.f1389c = i;
        this.f1390d = sideSheetBehavior;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: G */
    public final int mo284G() {
        switch (this.f1389c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1390d;
                return Math.max(0, sideSheetBehavior.f3589n + sideSheetBehavior.f3590o);
            default:
                SideSheetBehavior sideSheetBehavior2 = this.f1390d;
                return Math.max(0, (sideSheetBehavior2.f3588m - sideSheetBehavior2.f3587l) - sideSheetBehavior2.f3590o);
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: I */
    public final int mo286I() {
        switch (this.f1389c) {
            case 0:
                SideSheetBehavior sideSheetBehavior = this.f1390d;
                return (-sideSheetBehavior.f3587l) - sideSheetBehavior.f3590o;
            default:
                return this.f1390d.f3588m;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: J */
    public final int mo287J() {
        switch (this.f1389c) {
            case 0:
                return this.f1390d.f3590o;
            default:
                return this.f1390d.f3588m;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: K */
    public final int mo288K() {
        switch (this.f1389c) {
            case 0:
                return -this.f1390d.f3587l;
            default:
                return mo284G();
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: L */
    public final int mo289L(View view) {
        switch (this.f1389c) {
            case 0:
                return view.getRight() + this.f1390d.f3590o;
            default:
                return view.getLeft() - this.f1390d.f3590o;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: M */
    public final int mo290M(CoordinatorLayout coordinatorLayout) {
        switch (this.f1389c) {
            case 0:
                return coordinatorLayout.getLeft();
            default:
                return coordinatorLayout.getRight();
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: N */
    public final int mo291N() {
        switch (this.f1389c) {
            case 0:
                return 1;
            default:
                return 0;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: R */
    public final boolean mo295R(float f2) {
        switch (this.f1389c) {
            case 0:
                if (f2 > 0.0f) {
                }
                break;
            default:
                if (f2 < 0.0f) {
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: V */
    public final boolean mo296V(View view) {
        switch (this.f1389c) {
            case 0:
                if (view.getRight() < (mo284G() - mo286I()) / 2) {
                }
                break;
            default:
                if (view.getLeft() > (mo284G() + this.f1390d.f3588m) / 2) {
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: X */
    public final boolean mo297X(float f2, float f3) {
        switch (this.f1389c) {
            case 0:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs = Math.abs(f2);
                    this.f1390d.getClass();
                    if (abs > 500) {
                    }
                }
                break;
            default:
                if (Math.abs(f2) > Math.abs(f3)) {
                    float abs2 = Math.abs(f2);
                    this.f1390d.getClass();
                    if (abs2 > 500) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: j */
    public final int mo307j(ViewGroup.MarginLayoutParams marginLayoutParams) {
        switch (this.f1389c) {
            case 0:
                return marginLayoutParams.leftMargin;
            default:
                return marginLayoutParams.rightMargin;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: k */
    public final float mo309k(int i) {
        switch (this.f1389c) {
            case 0:
                float mo286I = mo286I();
                return (i - mo286I) / (mo284G() - mo286I);
            default:
                float f2 = this.f1390d.f3588m;
                return (f2 - i) / (f2 - mo284G());
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: p0 */
    public final boolean mo316p0(View view, float f2) {
        switch (this.f1389c) {
            case 0:
                float left = view.getLeft();
                SideSheetBehavior sideSheetBehavior = this.f1390d;
                float abs = Math.abs((f2 * sideSheetBehavior.f3586k) + left);
                sideSheetBehavior.getClass();
                if (abs > 0.5f) {
                }
                break;
            default:
                float right = view.getRight();
                SideSheetBehavior sideSheetBehavior2 = this.f1390d;
                float abs2 = Math.abs((f2 * sideSheetBehavior2.f3586k) + right);
                sideSheetBehavior2.getClass();
                if (abs2 > 0.5f) {
                }
                break;
        }
        return false;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: t0 */
    public final void mo320t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2) {
        switch (this.f1389c) {
            case 0:
                if (i <= this.f1390d.f3588m) {
                    marginLayoutParams.leftMargin = i2;
                    break;
                }
                break;
            default:
                int i3 = this.f1390d.f3588m;
                if (i <= i3) {
                    marginLayoutParams.rightMargin = i3 - i;
                    break;
                }
                break;
        }
    }
}
