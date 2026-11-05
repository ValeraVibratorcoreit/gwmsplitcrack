package p079k;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p082l.AbstractViewOnTouchListenerC1136q0;
import p082l.C1115g;
import p082l.C1117h;
import p082l.C1121j;
import p082l.C1123k;

/* renamed from: k.b */
/* loaded from: classes.dex */
public final class C1007b extends AbstractViewOnTouchListenerC1136q0 {

    /* renamed from: o */
    public final /* synthetic */ int f4778o = 0;

    /* renamed from: p */
    public final /* synthetic */ View f4779p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f4779p = actionMenuItemView;
    }

    @Override // p082l.AbstractViewOnTouchListenerC1136q0
    /* renamed from: b */
    public final InterfaceC1003C mo2602b() {
        C1115g c1115g;
        switch (this.f4778o) {
            case 0:
                AbstractC1008c abstractC1008c = ((ActionMenuItemView) this.f4779p).f1688q;
                if (abstractC1008c == null || (c1115g = ((C1117h) abstractC1008c).f5167a.f5198y) == null) {
                    return null;
                }
                return c1115g.m2635a();
            default:
                C1115g c1115g2 = ((C1121j) this.f4779p).f5172f.f5197x;
                if (c1115g2 == null) {
                    return null;
                }
                return c1115g2.m2635a();
        }
    }

    @Override // p082l.AbstractViewOnTouchListenerC1136q0
    /* renamed from: c */
    public final boolean mo2603c() {
        InterfaceC1003C mo2602b;
        switch (this.f4778o) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f4779p;
                InterfaceC1017l interfaceC1017l = actionMenuItemView.f1686o;
                return interfaceC1017l != null && interfaceC1017l.mo1262a(actionMenuItemView.f1683l) && (mo2602b = mo2602b()) != null && mo2602b.mo2577b();
            default:
                ((C1121j) this.f4779p).f5172f.m2735l();
                return true;
        }
    }

    @Override // p082l.AbstractViewOnTouchListenerC1136q0
    /* renamed from: d */
    public boolean mo2604d() {
        switch (this.f4778o) {
            case 1:
                C1123k c1123k = ((C1121j) this.f4779p).f5172f;
                if (c1123k.f5199z != null) {
                    return false;
                }
                c1123k.m2733f();
                return true;
            default:
                return super.mo2604d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1007b(C1121j c1121j, C1121j c1121j2) {
        super(c1121j2);
        this.f4779p = c1121j;
    }
}
