package p080k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: k0.e */
/* loaded from: classes.dex */
public final class C1036e extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4920a;

    public C1036e(Drawable.ConstantState constantState) {
        this.f4920a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4920a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4920a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1037f c1037f = new C1037f(null);
        Drawable newDrawable = this.f4920a.newDrawable();
        c1037f.f4926f = newDrawable;
        newDrawable.setCallback(c1037f.f4925k);
        return c1037f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1037f c1037f = new C1037f(null);
        Drawable newDrawable = this.f4920a.newDrawable(resources);
        c1037f.f4926f = newDrawable;
        newDrawable.setCallback(c1037f.f4925k);
        return c1037f;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1037f c1037f = new C1037f(null);
        Drawable newDrawable = this.f4920a.newDrawable(resources, theme);
        c1037f.f4926f = newDrawable;
        newDrawable.setCallback(c1037f.f4925k);
        return c1037f;
    }
}
