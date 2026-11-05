package p006C;

import android.graphics.RenderNode;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.view.WindowInsets;

/* renamed from: C.d */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC0056d {
    /* renamed from: d */
    public static /* synthetic */ RenderNode m115d() {
        return new RenderNode("OffscreenLayer.main");
    }

    /* renamed from: e */
    public static /* bridge */ /* synthetic */ ColorStateListDrawable m116e(Drawable drawable) {
        return (ColorStateListDrawable) drawable;
    }

    /* renamed from: g */
    public static /* synthetic */ WindowInsets.Builder m118g() {
        return new WindowInsets.Builder();
    }

    /* renamed from: h */
    public static /* synthetic */ WindowInsets.Builder m119h(WindowInsets windowInsets) {
        return new WindowInsets.Builder(windowInsets);
    }

    /* renamed from: q */
    public static /* bridge */ /* synthetic */ boolean m128q(Drawable drawable) {
        return drawable instanceof ColorStateListDrawable;
    }
}
