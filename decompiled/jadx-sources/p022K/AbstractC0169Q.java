package p022K;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.altaysoft.t500_split.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p024L.C0235e;
import p024L.InterfaceC0249s;
import p033Q.C0282p;
import p082l.C1145v;

/* renamed from: K.Q */
/* loaded from: classes.dex */
public abstract class AbstractC0169Q {

    /* renamed from: a */
    public static WeakHashMap f475a = null;

    /* renamed from: b */
    public static Field f476b = null;

    /* renamed from: c */
    public static boolean f477c = false;

    /* renamed from: d */
    public static final int[] f478d = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};

    /* renamed from: e */
    public static final C0227z f479e = new C0227z();

    /* renamed from: f */
    public static final ViewTreeObserverOnGlobalLayoutListenerC0154B f480f = new ViewTreeObserverOnGlobalLayoutListenerC0154B();

    /* renamed from: a */
    public static C0175X m496a(View view) {
        if (f475a == null) {
            f475a = new WeakHashMap();
        }
        C0175X c0175x = (C0175X) f475a.get(view);
        if (c0175x != null) {
            return c0175x;
        }
        C0175X c0175x2 = new C0175X(view);
        f475a.put(view, c0175x2);
        return c0175x2;
    }

    /* renamed from: b */
    public static View.AccessibilityDelegate m497b(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC0164L.m482a(view);
        }
        if (f477c) {
            return null;
        }
        if (f476b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f476b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f477c = true;
                return null;
            }
        }
        try {
            Object obj = f476b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f477c = true;
            return null;
        }
    }

    /* renamed from: c */
    public static ArrayList m498c(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    /* renamed from: d */
    public static String[] m499d(C1145v c1145v) {
        return Build.VERSION.SDK_INT >= 31 ? AbstractC0166N.m493a(c1145v) : (String[]) c1145v.getTag(R.id.tag_on_receive_content_mime_types);
    }

    /* renamed from: e */
    public static void m500e(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z2 = AbstractC0163K.m473b(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z2) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                obtain.setEventType(z2 ? 32 : 2048);
                obtain.setContentChangeTypes(i);
                if (z2) {
                    obtain.getText().add(AbstractC0163K.m473b(view));
                    if (view.getImportantForAccessibility() == 0) {
                        view.setImportantForAccessibility(1);
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
                return;
            }
            if (i != 32) {
                if (view.getParent() != null) {
                    try {
                        view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                        return;
                    } catch (AbstractMethodError e2) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e2);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(obtain2);
            obtain2.setEventType(32);
            obtain2.setContentChangeTypes(i);
            obtain2.setSource(view);
            view.onPopulateAccessibilityEvent(obtain2);
            obtain2.getText().add(AbstractC0163K.m473b(view));
            accessibilityManager.sendAccessibilityEvent(obtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: f */
    public static C0188f m501f(View view, C0188f c0188f) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c0188f + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0166N.m494b(view, c0188f);
        }
        InterfaceC0212r interfaceC0212r = (InterfaceC0212r) view.getTag(R.id.tag_on_receive_content_listener);
        InterfaceC0214s interfaceC0214s = f479e;
        if (interfaceC0212r == null) {
            if (view instanceof InterfaceC0214s) {
                interfaceC0214s = (InterfaceC0214s) view;
            }
            return interfaceC0214s.mo673a(c0188f);
        }
        C0188f m822a = ((C0282p) interfaceC0212r).m822a(view, c0188f);
        if (m822a == null) {
            return null;
        }
        if (view instanceof InterfaceC0214s) {
            interfaceC0214s = (InterfaceC0214s) view;
        }
        return interfaceC0214s.mo673a(m822a);
    }

    /* renamed from: g */
    public static void m502g(View view, int i) {
        ArrayList m498c = m498c(view);
        for (int i2 = 0; i2 < m498c.size(); i2++) {
            if (((C0235e) m498c.get(i2)).m701a() == i) {
                m498c.remove(i2);
                return;
            }
        }
    }

    /* renamed from: h */
    public static void m503h(View view, C0235e c0235e, InterfaceC0249s interfaceC0249s) {
        C0235e c0235e2 = new C0235e(null, c0235e.f623b, null, interfaceC0249s, c0235e.f624c);
        View.AccessibilityDelegate m497b = m497b(view);
        C0180b c0180b = m497b == null ? null : m497b instanceof C0178a ? ((C0178a) m497b).f484a : new C0180b(m497b);
        if (c0180b == null) {
            c0180b = new C0180b();
        }
        m505j(view, c0180b);
        m502g(view, c0235e2.m701a());
        m498c(view).add(c0235e2);
        m500e(view, 0);
    }

    /* renamed from: i */
    public static void m504i(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0164L.m485d(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    /* renamed from: j */
    public static void m505j(View view, C0180b c0180b) {
        if (c0180b == null && (m497b(view) instanceof C0178a)) {
            c0180b = new C0180b();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        view.setAccessibilityDelegate(c0180b == null ? null : c0180b.f492b);
    }

    /* renamed from: k */
    public static void m506k(View view, CharSequence charSequence) {
        new C0153A(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).m416d(view, charSequence);
        ViewTreeObserverOnGlobalLayoutListenerC0154B viewTreeObserverOnGlobalLayoutListenerC0154B = f480f;
        if (charSequence == null) {
            viewTreeObserverOnGlobalLayoutListenerC0154B.f466f.remove(view);
            view.removeOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0154B);
            view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0154B);
        } else {
            viewTreeObserverOnGlobalLayoutListenerC0154B.f466f.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(viewTreeObserverOnGlobalLayoutListenerC0154B);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC0154B);
            }
        }
    }
}
