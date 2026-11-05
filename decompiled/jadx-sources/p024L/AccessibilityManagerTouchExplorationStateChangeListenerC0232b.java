package p024L;

import android.view.accessibility.AccessibilityManager;
import android.widget.AutoCompleteTextView;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;
import p031P.C0264b;
import p054a1.C0502k;
import p121y0.AbstractC1687o;

/* renamed from: L.b */
/* loaded from: classes.dex */
public final class AccessibilityManagerTouchExplorationStateChangeListenerC0232b implements AccessibilityManager.TouchExplorationStateChangeListener {

    /* renamed from: a */
    public final C0264b f613a;

    public AccessibilityManagerTouchExplorationStateChangeListenerC0232b(C0264b c0264b) {
        this.f613a = c0264b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AccessibilityManagerTouchExplorationStateChangeListenerC0232b) {
            return this.f613a.equals(((AccessibilityManagerTouchExplorationStateChangeListenerC0232b) obj).f613a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f613a.hashCode();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        C0502k c0502k = (C0502k) this.f613a.f701f;
        AutoCompleteTextView autoCompleteTextView = c0502k.f1574h;
        if (autoCompleteTextView == null || AbstractC1687o.m4953z(autoCompleteTextView)) {
            return;
        }
        int i = z2 ? 2 : 1;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        c0502k.f1616d.setImportantForAccessibility(i);
    }
}
