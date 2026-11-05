package p052a;

import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.sun.jna.Function;
import p107t1.AbstractC1461d;

/* renamed from: a.n */
/* loaded from: classes.dex */
public abstract class AbstractC0474n {

    /* renamed from: a */
    public static final int f1522a = Color.argb(230, Function.USE_VARARGS, Function.USE_VARARGS, Function.USE_VARARGS);

    /* renamed from: b */
    public static final int f1523b = Color.argb(128, 27, 27, 27);

    /* renamed from: a */
    public static final void m1193a(AbstractActivityC0472l abstractActivityC0472l) {
        AbstractC1461d.m3494e("<this>", abstractActivityC0472l);
        C0459E c0459e = C0459E.f1470b;
        C0460F c0460f = new C0460F(0, 0, c0459e);
        C0460F c0460f2 = new C0460F(f1522a, f1523b, c0459e);
        View decorView = abstractActivityC0472l.getWindow().getDecorView();
        AbstractC1461d.m3493d("window.decorView", decorView);
        Resources resources = decorView.getResources();
        AbstractC1461d.m3493d("view.resources", resources);
        boolean booleanValue = ((Boolean) c0459e.mo1171c(resources)).booleanValue();
        Resources resources2 = decorView.getResources();
        AbstractC1461d.m3493d("view.resources", resources2);
        boolean booleanValue2 = ((Boolean) c0459e.mo1171c(resources2)).booleanValue();
        int i = Build.VERSION.SDK_INT;
        C0476p c0478r = i >= 30 ? new C0478r() : i >= 29 ? new C0477q() : new C0476p();
        Window window = abstractActivityC0472l.getWindow();
        AbstractC1461d.m3493d("window", window);
        c0478r.mo1194a(c0460f, c0460f2, window, decorView, booleanValue, booleanValue2);
        Window window2 = abstractActivityC0472l.getWindow();
        AbstractC1461d.m3493d("window", window2);
        c0478r.mo1195b(window2);
    }
}
