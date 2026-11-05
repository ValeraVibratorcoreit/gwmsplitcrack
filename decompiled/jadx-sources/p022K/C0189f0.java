package p022K;

import android.graphics.Insets;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p006C.C0058f;

/* renamed from: K.f0 */
/* loaded from: classes.dex */
public final class C0189f0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a */
    public final C0184d f508a;

    /* renamed from: b */
    public List f509b;

    /* renamed from: c */
    public ArrayList f510c;

    /* renamed from: d */
    public final HashMap f511d;

    public C0189f0(C0184d c0184d) {
        super(0);
        this.f511d = new HashMap();
        this.f508a = c0184d;
    }

    /* renamed from: a */
    public final C0195i0 m579a(WindowInsetsAnimation windowInsetsAnimation) {
        C0195i0 c0195i0 = (C0195i0) this.f511d.get(windowInsetsAnimation);
        if (c0195i0 == null) {
            c0195i0 = new C0195i0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                c0195i0.f526a = new C0191g0(windowInsetsAnimation);
            }
            this.f511d.put(windowInsetsAnimation, c0195i0);
        }
        return c0195i0;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C0184d c0184d = this.f508a;
        m579a(windowInsetsAnimation);
        ((View) c0184d.f502j).setTranslationY(0.0f);
        this.f511d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        C0184d c0184d = this.f508a;
        m579a(windowInsetsAnimation);
        View view = (View) c0184d.f502j;
        int[] iArr = (int[]) c0184d.f503k;
        view.getLocationOnScreen(iArr);
        c0184d.f500h = iArr[1];
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        float fraction;
        ArrayList arrayList = this.f510c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f510c = arrayList2;
            this.f509b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation m562j = AbstractC0187e0.m562j(list.get(size));
            C0195i0 m579a = m579a(m562j);
            fraction = m562j.getFraction();
            m579a.f526a.mo583d(fraction);
            this.f510c.add(m579a);
        }
        C0184d c0184d = this.f508a;
        C0221v0 m680g = C0221v0.m680g(null, windowInsets);
        c0184d.m538a(m680g, this.f509b);
        return m680g.m685f();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        Insets lowerBound;
        Insets upperBound;
        C0184d c0184d = this.f508a;
        m579a(windowInsetsAnimation);
        lowerBound = bounds.getLowerBound();
        C0058f m141c = C0058f.m141c(lowerBound);
        upperBound = bounds.getUpperBound();
        C0058f m141c2 = C0058f.m141c(upperBound);
        View view = (View) c0184d.f502j;
        int[] iArr = (int[]) c0184d.f503k;
        view.getLocationOnScreen(iArr);
        int i = c0184d.f500h - iArr[1];
        c0184d.f501i = i;
        view.setTranslationY(i);
        AbstractC0187e0.m565m();
        return AbstractC0187e0.m560h(m141c.m142d(), m141c2.m142d());
    }
}
