package p022K;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: K.D */
/* loaded from: classes.dex */
public abstract class AbstractC0156D {
    /* renamed from: a */
    public static WindowInsets m417a(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    /* renamed from: b */
    public static WindowInsets m418b(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    /* renamed from: c */
    public static void m419c(View view) {
        view.requestApplyInsets();
    }
}
