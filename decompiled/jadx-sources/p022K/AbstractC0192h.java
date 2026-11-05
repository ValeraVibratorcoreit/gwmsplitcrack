package p022K;

import android.graphics.Rect;
import android.view.DisplayCutout;
import java.util.List;

/* renamed from: K.h */
/* loaded from: classes.dex */
public abstract class AbstractC0192h {
    /* renamed from: a */
    public static DisplayCutout m584a(Rect rect, List<Rect> list) {
        return new DisplayCutout(rect, list);
    }

    /* renamed from: b */
    public static List<Rect> m585b(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    /* renamed from: c */
    public static int m586c(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    /* renamed from: d */
    public static int m587d(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    /* renamed from: e */
    public static int m588e(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    /* renamed from: f */
    public static int m589f(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }
}
