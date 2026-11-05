package p051Z0;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import p007C0.AbstractC0067a;
import p045W0.C0355e;

/* renamed from: Z0.a */
/* loaded from: classes.dex */
public final class C0443a extends C0355e {

    /* renamed from: h */
    public final /* synthetic */ int f1420h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0443a(int i) {
        super(15);
        this.f1420h = i;
    }

    @Override // p045W0.C0355e
    /* renamed from: f */
    public final void mo946f(TabLayout tabLayout, View view, View view2, float f2, Drawable drawable) {
        float cos;
        float f3;
        switch (this.f1420h) {
            case 0:
                RectF m941a = C0355e.m941a(tabLayout, view);
                RectF m941a2 = C0355e.m941a(tabLayout, view2);
                if (m941a.left < m941a2.left) {
                    double d = (f2 * 3.141592653589793d) / 2.0d;
                    f3 = (float) (1.0d - Math.cos(d));
                    cos = (float) Math.sin(d);
                } else {
                    double d2 = (f2 * 3.141592653589793d) / 2.0d;
                    float sin = (float) Math.sin(d2);
                    cos = (float) (1.0d - Math.cos(d2));
                    f3 = sin;
                }
                drawable.setBounds(AbstractC0067a.m195c((int) m941a.left, (int) m941a2.left, f3), drawable.getBounds().top, AbstractC0067a.m195c((int) m941a.right, (int) m941a2.right, cos), drawable.getBounds().bottom);
                break;
            default:
                if (f2 >= 0.5f) {
                    view = view2;
                }
                RectF m941a3 = C0355e.m941a(tabLayout, view);
                float m194b = f2 < 0.5f ? AbstractC0067a.m194b(1.0f, 0.0f, 0.0f, 0.5f, f2) : AbstractC0067a.m194b(0.0f, 1.0f, 0.5f, 1.0f, f2);
                drawable.setBounds((int) m941a3.left, drawable.getBounds().top, (int) m941a3.right, drawable.getBounds().bottom);
                drawable.setAlpha((int) (m194b * 255.0f));
                break;
        }
    }
}
