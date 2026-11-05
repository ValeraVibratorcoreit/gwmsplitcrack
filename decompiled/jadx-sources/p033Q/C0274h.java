package p033Q;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;
import p022K.C0180b;
import p024L.C0235e;
import p024L.C0240j;

/* renamed from: Q.h */
/* loaded from: classes.dex */
public final class C0274h extends C0180b {

    /* renamed from: d */
    public final /* synthetic */ int f736d;

    public /* synthetic */ C0274h(int i) {
        this.f736d = i;
    }

    @Override // p022K.C0180b
    /* renamed from: c */
    public void mo399c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f736d) {
            case 0:
                super.mo399c(view, accessibilityEvent);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityEvent.setClassName(ScrollView.class.getName());
                accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
                accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
                accessibilityEvent.setMaxScrollX(nestedScrollView.getScrollX());
                accessibilityEvent.setMaxScrollY(nestedScrollView.getScrollRange());
                break;
            default:
                super.mo399c(view, accessibilityEvent);
                break;
        }
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        int scrollRange;
        switch (this.f736d) {
            case 0:
                View.AccessibilityDelegate accessibilityDelegate = this.f491a;
                AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                accessibilityNodeInfo.setClassName(ScrollView.class.getName());
                if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                    accessibilityNodeInfo.setScrollable(true);
                    if (nestedScrollView.getScrollY() > 0) {
                        c0240j.m730b(C0235e.f616g);
                        c0240j.m730b(C0235e.f620k);
                    }
                    if (nestedScrollView.getScrollY() < scrollRange) {
                        c0240j.m730b(C0235e.f615f);
                        c0240j.m730b(C0235e.f621l);
                        break;
                    }
                }
                break;
            case 1:
                View.AccessibilityDelegate accessibilityDelegate2 = this.f491a;
                AccessibilityNodeInfo accessibilityNodeInfo2 = c0240j.f627a;
                accessibilityDelegate2.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                accessibilityNodeInfo2.setCollectionInfo(null);
                break;
            case 2:
                View.AccessibilityDelegate accessibilityDelegate3 = this.f491a;
                AccessibilityNodeInfo accessibilityNodeInfo3 = c0240j.f627a;
                accessibilityDelegate3.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setScrollable(false);
                break;
            default:
                View.AccessibilityDelegate accessibilityDelegate4 = this.f491a;
                AccessibilityNodeInfo accessibilityNodeInfo4 = c0240j.f627a;
                accessibilityDelegate4.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo4);
                accessibilityNodeInfo4.setCollectionInfo(null);
                break;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
    
        if (r6 != 16908346) goto L11;
     */
    @Override // p022K.C0180b
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mo531g(View view, int i, Bundle bundle) {
        switch (this.f736d) {
            case 0:
                if (super.mo531g(view, i, bundle)) {
                    return true;
                }
                NestedScrollView nestedScrollView = (NestedScrollView) view;
                if (nestedScrollView.isEnabled()) {
                    int height = nestedScrollView.getHeight();
                    Rect rect = new Rect();
                    if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                        height = rect.height();
                    }
                    if (i != 4096) {
                        if (i != 8192 && i != 16908344) {
                            break;
                        } else {
                            int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                            if (max != nestedScrollView.getScrollY()) {
                                nestedScrollView.m1352u(0 - nestedScrollView.getScrollX(), true, max - nestedScrollView.getScrollY());
                                return true;
                            }
                        }
                    }
                    int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
                    if (min != nestedScrollView.getScrollY()) {
                        nestedScrollView.m1352u(0 - nestedScrollView.getScrollX(), true, min - nestedScrollView.getScrollY());
                        return true;
                    }
                }
                return false;
            default:
                return super.mo531g(view, i, bundle);
        }
    }
}
