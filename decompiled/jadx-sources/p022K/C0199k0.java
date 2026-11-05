package p022K;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p006C.C0058f;

/* renamed from: K.k0 */
/* loaded from: classes.dex */
public final class C0199k0 extends AbstractC0205n0 {

    /* renamed from: e */
    public static Field f536e = null;

    /* renamed from: f */
    public static boolean f537f = false;

    /* renamed from: g */
    public static Constructor f538g = null;

    /* renamed from: h */
    public static boolean f539h = false;

    /* renamed from: c */
    public WindowInsets f540c;

    /* renamed from: d */
    public C0058f f541d;

    public C0199k0() {
        this.f540c = m613i();
    }

    /* renamed from: i */
    private static WindowInsets m613i() {
        if (!f537f) {
            try {
                f536e = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e2) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e2);
            }
            f537f = true;
        }
        Field field = f536e;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e3) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e3);
            }
        }
        if (!f539h) {
            try {
                f538g = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e4) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e4);
            }
            f539h = true;
        }
        Constructor constructor = f538g;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e5) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e5);
            }
        }
        return null;
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: b */
    public C0221v0 mo614b() {
        m647a();
        C0221v0 m680g = C0221v0.m680g(null, this.f540c);
        C0058f[] c0058fArr = this.f549b;
        C0217t0 c0217t0 = m680g.f573a;
        c0217t0.mo658o(c0058fArr);
        c0217t0.mo667q(this.f541d);
        return m680g;
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: e */
    public void mo615e(C0058f c0058f) {
        this.f541d = c0058f;
    }

    @Override // p022K.AbstractC0205n0
    /* renamed from: g */
    public void mo616g(C0058f c0058f) {
        WindowInsets windowInsets = this.f540c;
        if (windowInsets != null) {
            this.f540c = windowInsets.replaceSystemWindowInsets(c0058f.f203a, c0058f.f204b, c0058f.f205c, c0058f.f206d);
        }
    }

    public C0199k0(C0221v0 c0221v0) {
        super(c0221v0);
        this.f540c = c0221v0.m685f();
    }
}
