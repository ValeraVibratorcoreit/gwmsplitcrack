package p095p0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p024L.C0240j;
import p068f0.C0784N;
import p068f0.C0789T;

/* renamed from: p0.h */
/* loaded from: classes.dex */
public final class C1229h extends LinearLayoutManager {

    /* renamed from: E */
    public final /* synthetic */ ViewPager2 f5485E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1229h(ViewPager2 viewPager2) {
        super(1);
        this.f5485E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /* renamed from: C0 */
    public final void mo1439C0(C0789T c0789t, int[] iArr) {
        ViewPager2 viewPager2 = this.f5485E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.mo1439C0(c0789t, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: U */
    public final void mo2233U(C0784N c0784n, C0789T c0789t, C0240j c0240j) {
        super.mo2233U(c0784n, c0789t, c0240j);
        this.f5485E.f2163y.getClass();
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: h0 */
    public final boolean mo2236h0(C0784N c0784n, C0789T c0789t, int i, Bundle bundle) {
        this.f5485E.f2163y.getClass();
        return super.mo2236h0(c0784n, c0789t, i, bundle);
    }

    @Override // p068f0.AbstractC0778H
    /* renamed from: m0 */
    public final boolean mo2063m0(RecyclerView recyclerView, View view, Rect rect, boolean z2, boolean z3) {
        return false;
    }
}
