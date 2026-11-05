package p080k0;

import android.graphics.drawable.Drawable;

/* renamed from: k0.c */
/* loaded from: classes.dex */
public final class C1034c implements Drawable.Callback {

    /* renamed from: f */
    public final /* synthetic */ C1037f f4915f;

    public C1034c(C1037f c1037f) {
        this.f4915f = c1037f;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        this.f4915f.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        this.f4915f.scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        this.f4915f.unscheduleSelf(runnable);
    }
}
