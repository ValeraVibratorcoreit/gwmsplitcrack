package p080k0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* renamed from: k0.o */
/* loaded from: classes.dex */
public final class C1046o extends Drawable.ConstantState {

    /* renamed from: a */
    public final Drawable.ConstantState f4980a;

    public C1046o(Drawable.ConstantState constantState) {
        this.f4980a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4980a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4980a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        C1047p c1047p = new C1047p();
        c1047p.f4926f = (VectorDrawable) this.f4980a.newDrawable();
        return c1047p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        C1047p c1047p = new C1047p();
        c1047p.f4926f = (VectorDrawable) this.f4980a.newDrawable(resources);
        return c1047p;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        C1047p c1047p = new C1047p();
        c1047p.f4926f = (VectorDrawable) this.f4980a.newDrawable(resources, theme);
        return c1047p;
    }
}
