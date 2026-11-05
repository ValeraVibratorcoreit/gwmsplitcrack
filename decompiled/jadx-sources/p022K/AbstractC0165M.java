package p022K;

import android.view.View;

/* renamed from: K.M */
/* loaded from: classes.dex */
public abstract class AbstractC0165M {
    /* renamed from: a */
    public static int m488a(View view) {
        return view.getImportantForContentCapture();
    }

    /* renamed from: b */
    public static CharSequence m489b(View view) {
        return view.getStateDescription();
    }

    /* renamed from: c */
    public static boolean m490c(View view) {
        return view.isImportantForContentCapture();
    }

    /* renamed from: d */
    public static void m491d(View view, int i) {
        view.setImportantForContentCapture(i);
    }

    /* renamed from: e */
    public static void m492e(View view, CharSequence charSequence) {
        view.setStateDescription(charSequence);
    }
}
