package p082l;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.widget.PopupWindow;
import com.altaysoft.t500_split.media.C0639g;
import java.lang.reflect.Method;
import p079k.C1020o;
import p079k.MenuC1018m;

/* renamed from: l.F0 */
/* loaded from: classes.dex */
public final class C1060F0 extends C1050A0 implements InterfaceC1052B0 {

    /* renamed from: I */
    public static final Method f5035I;

    /* renamed from: H */
    public C0639g f5036H;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f5035I = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // p082l.InterfaceC1052B0
    /* renamed from: c */
    public final void mo1876c(MenuC1018m menuC1018m, C1020o c1020o) {
        C0639g c0639g = this.f5036H;
        if (c0639g != null) {
            c0639g.mo1876c(menuC1018m, c1020o);
        }
    }

    @Override // p082l.C1050A0
    /* renamed from: p */
    public final C1130n0 mo2652p(Context context, boolean z2) {
        C1058E0 c1058e0 = new C1058E0(context, z2);
        c1058e0.setHoverListener(this);
        return c1058e0;
    }

    @Override // p082l.InterfaceC1052B0
    /* renamed from: r */
    public final void mo1879r(MenuC1018m menuC1018m, C1020o c1020o) {
        C0639g c0639g = this.f5036H;
        if (c0639g != null) {
            c0639g.mo1879r(menuC1018m, c1020o);
        }
    }
}
