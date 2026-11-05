package p098q0;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;

/* renamed from: q0.m1 */
/* loaded from: classes.dex */
public final class C1336m1 extends DrawableWrapper {

    /* renamed from: f */
    public final int f6294f;

    /* renamed from: g */
    public final int f6295g;

    public C1336m1(Drawable drawable, int i, int i2) {
        super(drawable);
        this.f6294f = i;
        this.f6295g = i2;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f6295g;
    }

    @Override // android.graphics.drawable.DrawableWrapper, android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f6294f;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = this.f6295g;
        int i8 = this.f6294f;
        if (i5 != i8 || i6 != i7) {
            i = ((i + i3) / 2) - (i8 / 2);
            i3 = i + i8;
            i2 = ((i2 + i4) / 2) - (i7 / 2);
            i4 = i2 + i7;
        }
        super.setBounds(i, i2, i3, i4);
    }
}
