package p003B;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* renamed from: B.k */
/* loaded from: classes.dex */
public abstract class AbstractC0044k {
    /* renamed from: a */
    public static Drawable m96a(Resources resources, int i, Resources.Theme theme) {
        return resources.getDrawable(i, theme);
    }

    /* renamed from: b */
    public static Drawable m97b(Resources resources, int i, int i2, Resources.Theme theme) {
        return resources.getDrawableForDensity(i, i2, theme);
    }
}
