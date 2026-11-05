package p022K;

import android.view.View;
import com.altaysoft.t500_split.R;
import java.util.Objects;
import p027N.AbstractC0257a;
import p091o.C1201k;

/* renamed from: K.K */
/* loaded from: classes.dex */
public abstract class AbstractC0163K {
    /* renamed from: a */
    public static void m472a(View view, InterfaceC0168P interfaceC0168P) {
        C1201k c1201k = (C1201k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1201k == null) {
            c1201k = new C1201k();
            view.setTag(R.id.tag_unhandled_key_listeners, c1201k);
        }
        Objects.requireNonNull(interfaceC0168P);
        View.OnUnhandledKeyEventListener viewOnUnhandledKeyEventListenerC0162J = new ViewOnUnhandledKeyEventListenerC0162J();
        c1201k.put(interfaceC0168P, viewOnUnhandledKeyEventListenerC0162J);
        view.addOnUnhandledKeyEventListener(viewOnUnhandledKeyEventListenerC0162J);
    }

    /* renamed from: b */
    public static CharSequence m473b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    /* renamed from: c */
    public static boolean m474c(View view) {
        return view.isAccessibilityHeading();
    }

    /* renamed from: d */
    public static boolean m475d(View view) {
        return view.isScreenReaderFocusable();
    }

    /* renamed from: e */
    public static void m476e(View view, InterfaceC0168P interfaceC0168P) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        C1201k c1201k = (C1201k) view.getTag(R.id.tag_unhandled_key_listeners);
        if (c1201k == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c1201k.getOrDefault(interfaceC0168P, null)) == null) {
            return;
        }
        view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
    }

    /* renamed from: f */
    public static <T> T m477f(View view, int i) {
        return (T) view.requireViewById(i);
    }

    /* renamed from: g */
    public static void m478g(View view, boolean z2) {
        view.setAccessibilityHeading(z2);
    }

    /* renamed from: h */
    public static void m479h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    /* renamed from: i */
    public static void m480i(View view, AbstractC0257a abstractC0257a) {
        view.setAutofillId(null);
    }

    /* renamed from: j */
    public static void m481j(View view, boolean z2) {
        view.setScreenReaderFocusable(z2);
    }
}
