package p080k0;

import android.content.res.ColorStateList;
import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;
import p008D.AbstractC0070a;
import p023K0.C0228a;
import p023K0.C0230c;

/* renamed from: k0.b */
/* loaded from: classes.dex */
public final class C1033b extends Animatable2.AnimationCallback {

    /* renamed from: a */
    public final /* synthetic */ C0228a f4914a;

    public C1033b(C0228a c0228a) {
        this.f4914a = c0228a;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        ColorStateList colorStateList = this.f4914a.f584b.f603t;
        if (colorStateList != null) {
            AbstractC0070a.m206h(drawable, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        C0230c c0230c = this.f4914a.f584b;
        ColorStateList colorStateList = c0230c.f603t;
        if (colorStateList != null) {
            AbstractC0070a.m205g(drawable, colorStateList.getColorForState(c0230c.f607x, colorStateList.getDefaultColor()));
        }
    }
}
