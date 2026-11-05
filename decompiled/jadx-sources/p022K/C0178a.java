package p022K;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p024L.AbstractC0236f;
import p024L.C0235e;
import p024L.C0240j;

/* renamed from: K.a */
/* loaded from: classes.dex */
public final class C0178a extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final C0180b f484a;

    public C0178a(C0180b c0180b) {
        this.f484a = c0180b;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f484a.mo527a(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0639g mo528b = this.f484a.mo528b(view);
        if (mo528b != null) {
            return (AccessibilityNodeProvider) mo528b.f3011g;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f484a.mo399c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        Object tag;
        C0240j c0240j = new C0240j(accessibilityNodeInfo);
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        accessibilityNodeInfo.setScreenReaderFocusable(Boolean.valueOf(AbstractC0163K.m475d(view)).booleanValue());
        accessibilityNodeInfo.setHeading(Boolean.valueOf(AbstractC0163K.m474c(view)).booleanValue());
        accessibilityNodeInfo.setPaneTitle(AbstractC0163K.m473b(view));
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            tag = AbstractC0165M.m489b(view);
        } else {
            tag = view.getTag(R.id.tag_state_description);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        CharSequence charSequence = (CharSequence) tag;
        if (i >= 30) {
            AbstractC0236f.m704c(accessibilityNodeInfo, charSequence);
        } else {
            accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
        this.f484a.mo400d(view, c0240j);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            c0240j.m730b((C0235e) list.get(i2));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f484a.mo529e(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f484a.mo530f(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f484a.mo531g(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.f484a.mo532h(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f484a.mo533i(view, accessibilityEvent);
    }
}
