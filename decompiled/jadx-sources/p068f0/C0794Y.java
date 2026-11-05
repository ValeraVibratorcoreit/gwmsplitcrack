package p068f0;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import p022K.C0180b;
import p024L.C0240j;

/* renamed from: f0.Y */
/* loaded from: classes.dex */
public final class C0794Y extends C0180b {

    /* renamed from: d */
    public final RecyclerView f4015d;

    /* renamed from: e */
    public final C0793X f4016e;

    public C0794Y(RecyclerView recyclerView) {
        this.f4015d = recyclerView;
        C0793X c0793x = this.f4016e;
        if (c0793x != null) {
            this.f4016e = c0793x;
        } else {
            this.f4016e = new C0793X(this);
        }
    }

    @Override // p022K.C0180b
    /* renamed from: c */
    public final void mo399c(View view, AccessibilityEvent accessibilityEvent) {
        super.mo399c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f4015d.m1498L()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo1456T(accessibilityEvent);
        }
    }

    @Override // p022K.C0180b
    /* renamed from: d */
    public final void mo400d(View view, C0240j c0240j) {
        this.f491a.onInitializeAccessibilityNodeInfo(view, c0240j.f627a);
        RecyclerView recyclerView = this.f4015d;
        if (recyclerView.m1498L() || recyclerView.getLayoutManager() == null) {
            return;
        }
        AbstractC0778H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3933b;
        layoutManager.mo2233U(recyclerView2.f2083g, recyclerView2.f2088i0, c0240j);
    }

    @Override // p022K.C0180b
    /* renamed from: g */
    public final boolean mo531g(View view, int i, Bundle bundle) {
        if (super.mo531g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f4015d;
        if (recyclerView.m1498L() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        AbstractC0778H layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f3933b;
        return layoutManager.mo2236h0(recyclerView2.f2083g, recyclerView2.f2088i0, i, bundle);
    }
}
