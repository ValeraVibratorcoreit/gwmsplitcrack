package p022K;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.PointerIcon;

/* renamed from: K.u */
/* loaded from: classes.dex */
public abstract class AbstractC0218u {
    /* renamed from: a */
    public static PointerIcon m675a(Bitmap bitmap, float f2, float f3) {
        return PointerIcon.create(bitmap, f2, f3);
    }

    /* renamed from: b */
    public static PointerIcon m676b(Context context, int i) {
        return PointerIcon.getSystemIcon(context, i);
    }

    /* renamed from: c */
    public static PointerIcon m677c(Resources resources, int i) {
        return PointerIcon.load(resources, i);
    }
}
