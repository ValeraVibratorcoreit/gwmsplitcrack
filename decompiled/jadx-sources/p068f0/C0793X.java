package p068f0;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import com.altaysoft.t500_split.media.C0639g;
import java.util.WeakHashMap;
import p022K.C0180b;
import p024L.C0240j;

/* renamed from: f0.X */
/* loaded from: classes.dex */
public final class C0793X extends C0180b {

    /* renamed from: d */
    public final C0794Y f4013d;

    /* renamed from: e */
    public final WeakHashMap f4014e = new WeakHashMap();

    public C0793X(C0794Y c0794y) {
        this.f4013d = c0794y;
    }

    @Override // p022K.C0180b
    /* renamed from: a */
    public final boolean mo527a(View view, AccessibilityEvent accessibilityEvent) {
        C0180b c0180b = (C0180b) this.f4014e.get(view);
        return c0180b != null ? c0180b.mo527a(view, accessibilityEvent) : this.f491a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // p022K.C0180b
    /* renamed from: b */
    public final C0639g mo528b(View view) {
        C0180b c0180b = (C0180b) this.f4014e.get(view);
        return c0180b != null ? c0180b.mo528b(view) : super.mo528b(view);
    }

    @Override // p022K.C0180b
    /* renamed from: c */
    public final void mo399c(View view, AccessibilityEvent accessibilityEvent) {
        C0180b c0180b = (C0180b) this.f4014e.get(view);
        if (c0180b != null) {
            c0180b.mo399c(view, accessibilityEvent);
        } else {
            super.mo399c(view, accessibilityEvent);
        }
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        C0794Y c0794y = this.f4013d;
        boolean m1498L = c0794y.f4015d.m1498L();
        View.AccessibilityDelegate accessibilityDelegate = this.f491a;
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        if (!m1498L) {
            RecyclerView recyclerView = c0794y.f4015d;
            if (recyclerView.getLayoutManager() != null) {
                recyclerView.getLayoutManager().m2234V(view, c0240j);
                C0180b c0180b = (C0180b) this.f4014e.get(view);
                if (c0180b != null) {
                    c0180b.mo400d(view, c0240j);
                    return;
                } else {
                    accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                    return;
                }
            }
        }
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
    }

    @Override // p022K.C0180b
    /* renamed from: e */
    public final void mo529e(View view, AccessibilityEvent accessibilityEvent) {
        C0180b c0180b = (C0180b) this.f4014e.get(view);
        if (c0180b != null) {
            c0180b.mo529e(view, accessibilityEvent);
        } else {
            super.mo529e(view, accessibilityEvent);
        }
    }

    @Override // p022K.C0180b
    /* renamed from: f */
    public final boolean mo530f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0180b c0180b = (C0180b) this.f4014e.get(viewGroup);
        return c0180b != null ? c0180b.mo530f(viewGroup, view, accessibilityEvent) : this.f491a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // p022K.C0180b
    /* renamed from: g */
    public final boolean mo531g(View view, int i, Bundle bundle) {
        C0794Y c0794y = this.f4013d;
        if (!c0794y.f4015d.m1498L()) {
            RecyclerView recyclerView = c0794y.f4015d;
            if (recyclerView.getLayoutManager() != null) {
                C0180b c0180b = (C0180b) this.f4014e.get(view);
                if (c0180b != null) {
                    if (c0180b.mo531g(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo531g(view, i, bundle)) {
                    return true;
                }
                C0784N c0784n = recyclerView.getLayoutManager().f3933b.f2083g;
                return false;
            }
        }
        return super.mo531g(view, i, bundle);
    }

    @Override // p022K.C0180b
    /* renamed from: h */
    public final void mo532h(View view, int i) {
        C0180b c0180b = (C0180b) this.f4014e.get(view);
        if (c0180b != null) {
            c0180b.mo532h(view, i);
        } else {
            super.mo532h(view, i);
        }
    }

    @Override // p022K.C0180b
    /* renamed from: i */
    public final void mo533i(View view, AccessibilityEvent accessibilityEvent) {
        C0180b c0180b = (C0180b) this.f4014e.get(view);
        if (c0180b != null) {
            c0180b.mo533i(view, accessibilityEvent);
        } else {
            super.mo533i(view, accessibilityEvent);
        }
    }
}
