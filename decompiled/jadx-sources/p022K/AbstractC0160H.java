package p022K;

import android.content.ClipData;
import android.view.PointerIcon;
import android.view.View;

/* renamed from: K.H */
/* loaded from: classes.dex */
public abstract class AbstractC0160H {
    /* renamed from: a */
    public static void m450a(View view) {
        view.cancelDragAndDrop();
    }

    /* renamed from: b */
    public static void m451b(View view) {
        view.dispatchFinishTemporaryDetach();
    }

    /* renamed from: c */
    public static void m452c(View view) {
        view.dispatchStartTemporaryDetach();
    }

    /* renamed from: d */
    public static void m453d(View view, PointerIcon pointerIcon) {
        view.setPointerIcon(pointerIcon);
    }

    /* renamed from: e */
    public static boolean m454e(View view, ClipData clipData, View.DragShadowBuilder dragShadowBuilder, Object obj, int i) {
        return view.startDragAndDrop(clipData, dragShadowBuilder, obj, i);
    }

    /* renamed from: f */
    public static void m455f(View view, View.DragShadowBuilder dragShadowBuilder) {
        view.updateDragShadow(dragShadowBuilder);
    }
}
