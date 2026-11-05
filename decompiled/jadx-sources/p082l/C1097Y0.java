package p082l;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* renamed from: l.Y0 */
/* loaded from: classes.dex */
public final class C1097Y0 implements InterfaceC1116g0 {

    /* renamed from: a */
    public Toolbar f5132a;

    /* renamed from: b */
    public int f5133b;

    /* renamed from: c */
    public View f5134c;

    /* renamed from: d */
    public Drawable f5135d;

    /* renamed from: e */
    public Drawable f5136e;

    /* renamed from: f */
    public Drawable f5137f;

    /* renamed from: g */
    public boolean f5138g;

    /* renamed from: h */
    public CharSequence f5139h;

    /* renamed from: i */
    public CharSequence f5140i;

    /* renamed from: j */
    public CharSequence f5141j;

    /* renamed from: k */
    public Window.Callback f5142k;

    /* renamed from: l */
    public boolean f5143l;

    /* renamed from: m */
    public C1123k f5144m;

    /* renamed from: n */
    public int f5145n;

    /* renamed from: o */
    public Drawable f5146o;

    /* renamed from: a */
    public final void m2722a(int i) {
        View view;
        int i2 = this.f5133b ^ i;
        this.f5133b = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    m2723b();
                }
                int i3 = this.f5133b & 4;
                Toolbar toolbar = this.f5132a;
                if (i3 != 0) {
                    Drawable drawable = this.f5137f;
                    if (drawable == null) {
                        drawable = this.f5146o;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                m2724c();
            }
            int i4 = i2 & 8;
            Toolbar toolbar2 = this.f5132a;
            if (i4 != 0) {
                if ((i & 8) != 0) {
                    toolbar2.setTitle(this.f5139h);
                    toolbar2.setSubtitle(this.f5140i);
                } else {
                    toolbar2.setTitle((CharSequence) null);
                    toolbar2.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.f5134c) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar2.addView(view);
            } else {
                toolbar2.removeView(view);
            }
        }
    }

    /* renamed from: b */
    public final void m2723b() {
        if ((this.f5133b & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.f5141j);
            Toolbar toolbar = this.f5132a;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.f5145n);
            } else {
                toolbar.setNavigationContentDescription(this.f5141j);
            }
        }
    }

    /* renamed from: c */
    public final void m2724c() {
        Drawable drawable;
        int i = this.f5133b;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.f5136e;
            if (drawable == null) {
                drawable = this.f5135d;
            }
        } else {
            drawable = this.f5135d;
        }
        this.f5132a.setLogo(drawable);
    }
}
