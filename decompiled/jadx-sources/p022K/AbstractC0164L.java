package p022K;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;
import p029O.AbstractC0259a;

/* renamed from: K.L */
/* loaded from: classes.dex */
public abstract class AbstractC0164L {
    /* renamed from: a */
    public static View.AccessibilityDelegate m482a(View view) {
        return view.getAccessibilityDelegate();
    }

    /* renamed from: b */
    public static ContentCaptureSession m483b(View view) {
        return view.getContentCaptureSession();
    }

    /* renamed from: c */
    public static List<Rect> m484c(View view) {
        return view.getSystemGestureExclusionRects();
    }

    /* renamed from: d */
    public static void m485d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i, int i2) {
        view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i, i2);
    }

    /* renamed from: e */
    public static void m486e(View view, AbstractC0259a abstractC0259a) {
        view.setContentCaptureSession(null);
    }

    /* renamed from: f */
    public static void m487f(View view, List<Rect> list) {
        view.setSystemGestureExclusionRects(list);
    }
}
