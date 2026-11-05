package p046X;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import java.util.WeakHashMap;
import p022K.AbstractC0156D;
import p022K.AbstractC0169Q;
import p024L.AccessibilityManagerTouchExplorationStateChangeListenerC0232b;
import p031P.C0264b;
import p054a1.C0506o;
import p079k.ViewOnKeyListenerC1004D;
import p079k.ViewOnKeyListenerC1012g;

/* renamed from: X.V */
/* loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0393V implements View.OnAttachStateChangeListener {

    /* renamed from: f */
    public final /* synthetic */ int f1205f;

    /* renamed from: g */
    public final /* synthetic */ Object f1206g;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0393V(int i, Object obj) {
        this.f1205f = i;
        this.f1206g = obj;
    }

    /* renamed from: a */
    private final void m1044a(View view) {
    }

    /* renamed from: b */
    private final void m1045b(View view) {
    }

    /* renamed from: c */
    private final void m1046c(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        Object obj = this.f1206g;
        switch (this.f1205f) {
            case 0:
                View view2 = (View) obj;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                AbstractC0156D.m419c(view2);
                break;
            case 1:
                C0506o c0506o = (C0506o) obj;
                if (c0506o.f1612z != null && (accessibilityManager = c0506o.f1611y) != null) {
                    WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
                    if (c0506o.isAttachedToWindow()) {
                        accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0232b(c0506o.f1612z));
                        break;
                    }
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.f1205f) {
            case 0:
                break;
            case 1:
                C0506o c0506o = (C0506o) this.f1206g;
                C0264b c0264b = c0506o.f1612z;
                if (c0264b != null && (accessibilityManager = c0506o.f1611y) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0232b(c0264b));
                    break;
                }
                break;
            case 2:
                ViewOnKeyListenerC1012g viewOnKeyListenerC1012g = (ViewOnKeyListenerC1012g) this.f1206g;
                ViewTreeObserver viewTreeObserver = viewOnKeyListenerC1012g.f4791C;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        viewOnKeyListenerC1012g.f4791C = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1012g.f4791C.removeGlobalOnLayoutListener(viewOnKeyListenerC1012g.f4801n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            default:
                ViewOnKeyListenerC1004D viewOnKeyListenerC1004D = (ViewOnKeyListenerC1004D) this.f1206g;
                ViewTreeObserver viewTreeObserver2 = viewOnKeyListenerC1004D.f4754t;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        viewOnKeyListenerC1004D.f4754t = view.getViewTreeObserver();
                    }
                    viewOnKeyListenerC1004D.f4754t.removeGlobalOnLayoutListener(viewOnKeyListenerC1004D.f4748n);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
        }
    }
}
