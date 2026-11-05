package p080k0;

import android.animation.AnimatorSet;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import p091o.C1192b;

/* renamed from: k0.d */
/* loaded from: classes.dex */
public final class C1035d extends Drawable.ConstantState {

    /* renamed from: a */
    public C1047p f4916a;

    /* renamed from: b */
    public AnimatorSet f4917b;

    /* renamed from: c */
    public ArrayList f4918c;

    /* renamed from: d */
    public C1192b f4919d;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        throw new IllegalStateException("No constant state support for SDK < 24.");
    }
}
