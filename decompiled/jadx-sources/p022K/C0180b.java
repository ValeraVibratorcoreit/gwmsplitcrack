package p022K;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p024L.C0235e;
import p024L.C0240j;
import p024L.InterfaceC0249s;

/* renamed from: K.b */
/* loaded from: classes.dex */
public class C0180b {

    /* renamed from: c */
    public static final View.AccessibilityDelegate f490c = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f491a;

    /* renamed from: b */
    public final C0178a f492b;

    public C0180b() {
        this(f490c);
    }

    /* renamed from: a */
    public boolean mo527a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f491a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C0639g mo528b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f491a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0639g(7, accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: c */
    public void mo399c(View view, AccessibilityEvent accessibilityEvent) {
        this.f491a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: d */
    public void mo400d(View view, C0240j c0240j) {
        this.f491a.onInitializeAccessibilityNodeInfo(view, c0240j.f627a);
    }

    /* renamed from: e */
    public void mo529e(View view, AccessibilityEvent accessibilityEvent) {
        this.f491a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: f */
    public boolean mo530f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f491a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: g */
    public boolean mo531g(View view, int i, Bundle bundle) {
        boolean z2;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= list.size()) {
                break;
            }
            C0235e c0235e = (C0235e) list.get(i2);
            if (c0235e.m701a() == i) {
                InterfaceC0249s interfaceC0249s = c0235e.f625d;
                if (interfaceC0249s != null) {
                    Class cls = c0235e.f624c;
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e2) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e2);
                        }
                    }
                    z2 = interfaceC0249s.mo366e(view);
                }
            } else {
                i2++;
            }
        }
        z2 = false;
        if (!z2) {
            z2 = this.f491a.performAccessibilityAction(view, i, bundle);
        }
        if (z2 || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z2;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i3)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i4 = 0;
            while (true) {
                if (clickableSpanArr == null || i4 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i4])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i4++;
            }
        }
        return z3;
    }

    /* renamed from: h */
    public void mo532h(View view, int i) {
        this.f491a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: i */
    public void mo533i(View view, AccessibilityEvent accessibilityEvent) {
        this.f491a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C0180b(View.AccessibilityDelegate accessibilityDelegate) {
        this.f491a = accessibilityDelegate;
        this.f492b = new C0178a(this);
    }
}
