package p022K;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Collection;

/* renamed from: K.I */
/* loaded from: classes.dex */
public abstract class AbstractC0161I {
    /* renamed from: a */
    public static void m456a(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    /* renamed from: b */
    public static AutofillId m457b(View view) {
        return view.getAutofillId();
    }

    /* renamed from: c */
    public static int m458c(View view) {
        return view.getImportantForAutofill();
    }

    /* renamed from: d */
    public static int m459d(View view) {
        return view.getNextClusterForwardId();
    }

    /* renamed from: e */
    public static boolean m460e(View view) {
        return view.hasExplicitFocusable();
    }

    /* renamed from: f */
    public static boolean m461f(View view) {
        return view.isFocusedByDefault();
    }

    /* renamed from: g */
    public static boolean m462g(View view) {
        return view.isImportantForAutofill();
    }

    /* renamed from: h */
    public static boolean m463h(View view) {
        return view.isKeyboardNavigationCluster();
    }

    /* renamed from: i */
    public static View m464i(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    /* renamed from: j */
    public static boolean m465j(View view) {
        return view.restoreDefaultFocus();
    }

    /* renamed from: k */
    public static void m466k(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }

    /* renamed from: l */
    public static void m467l(View view, boolean z2) {
        view.setFocusedByDefault(z2);
    }

    /* renamed from: m */
    public static void m468m(View view, int i) {
        view.setImportantForAutofill(i);
    }

    /* renamed from: n */
    public static void m469n(View view, boolean z2) {
        view.setKeyboardNavigationCluster(z2);
    }

    /* renamed from: o */
    public static void m470o(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    /* renamed from: p */
    public static void m471p(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }
}
