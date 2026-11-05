package p082l;

import android.content.Context;
import android.view.View;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import p079k.AbstractC1026u;
import p079k.C1028w;
import p079k.MenuC1018m;
import p079k.SubMenuC1005E;

/* renamed from: l.g */
/* loaded from: classes.dex */
public final class C1115g extends C1028w {

    /* renamed from: l */
    public final /* synthetic */ int f5165l = 0;

    /* renamed from: m */
    public final /* synthetic */ C1123k f5166m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115g(C1123k c1123k, Context context, MenuC1018m menuC1018m, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, menuC1018m, true);
        this.f5166m = c1123k;
        this.f4902f = 8388613;
        C0639g c0639g = c1123k.f5178B;
        this.f4904h = c0639g;
        AbstractC1026u abstractC1026u = this.f4905i;
        if (abstractC1026u != null) {
            abstractC1026u.mo2584k(c0639g);
        }
    }

    @Override // p079k.C1028w
    /* renamed from: c */
    public final void mo2637c() {
        switch (this.f5165l) {
            case 0:
                C1123k c1123k = this.f5166m;
                c1123k.f5198y = null;
                c1123k.getClass();
                super.mo2637c();
                break;
            default:
                C1123k c1123k2 = this.f5166m;
                MenuC1018m menuC1018m = c1123k2.f5181h;
                if (menuC1018m != null) {
                    menuC1018m.m2615c(true);
                }
                c1123k2.f5197x = null;
                super.mo2637c();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1115g(C1123k c1123k, Context context, SubMenuC1005E subMenuC1005E, View view) {
        super(R.attr.actionOverflowMenuStyle, context, view, subMenuC1005E, false);
        this.f5166m = c1123k;
        if (!subMenuC1005E.f4760A.m2631f()) {
            View view2 = c1123k.f5187n;
            this.f4901e = view2 == null ? (View) c1123k.f5186m : view2;
        }
        C0639g c0639g = c1123k.f5178B;
        this.f4904h = c0639g;
        AbstractC1026u abstractC1026u = this.f4905i;
        if (abstractC1026u != null) {
            abstractC1026u.mo2584k(c0639g);
        }
    }
}
