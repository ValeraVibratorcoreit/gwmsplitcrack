package p082l;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import com.altaysoft.t500_split.R;
import p054a1.C0511t;
import p079k.ViewTreeObserverOnGlobalLayoutListenerC1009d;

/* renamed from: l.M */
/* loaded from: classes.dex */
public final class C1073M extends C1050A0 implements InterfaceC1077O {

    /* renamed from: H */
    public CharSequence f5069H;

    /* renamed from: I */
    public C1069K f5070I;

    /* renamed from: J */
    public final Rect f5071J;

    /* renamed from: K */
    public int f5072K;

    /* renamed from: L */
    public final /* synthetic */ C1079P f5073L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1073M(C1079P c1079p, Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.spinnerStyle);
        this.f5073L = c1079p;
        this.f5071J = new Rect();
        this.f5014t = c1079p;
        this.f4998D = true;
        this.f4999E.setFocusable(true);
        this.f5015u = new C0511t(1, this);
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: e */
    public final void mo2680e(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        C1049A c1049a = this.f4999E;
        boolean isShowing = c1049a.isShowing();
        m2689s();
        this.f4999E.setInputMethodMode(2);
        mo2578f();
        C1130n0 c1130n0 = this.f5002h;
        c1130n0.setChoiceMode(1);
        c1130n0.setTextDirection(i);
        c1130n0.setTextAlignment(i2);
        C1079P c1079p = this.f5073L;
        int selectedItemPosition = c1079p.getSelectedItemPosition();
        C1130n0 c1130n02 = this.f5002h;
        if (c1049a.isShowing() && c1130n02 != null) {
            c1130n02.setListSelectionHidden(false);
            c1130n02.setSelection(selectedItemPosition);
            if (c1130n02.getChoiceMode() != 0) {
                c1130n02.setItemChecked(selectedItemPosition, true);
            }
        }
        if (isShowing || (viewTreeObserver = c1079p.getViewTreeObserver()) == null) {
            return;
        }
        ViewTreeObserverOnGlobalLayoutListenerC1009d viewTreeObserverOnGlobalLayoutListenerC1009d = new ViewTreeObserverOnGlobalLayoutListenerC1009d(3, this);
        viewTreeObserver.addOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1009d);
        this.f4999E.setOnDismissListener(new C1071L(this, viewTreeObserverOnGlobalLayoutListenerC1009d));
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: i */
    public final CharSequence mo2683i() {
        return this.f5069H;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: k */
    public final void mo2684k(CharSequence charSequence) {
        this.f5069H = charSequence;
    }

    @Override // p082l.C1050A0, p082l.InterfaceC1077O
    /* renamed from: n */
    public final void mo2651n(ListAdapter listAdapter) {
        super.mo2651n(listAdapter);
        this.f5070I = (C1069K) listAdapter;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: o */
    public final void mo2687o(int i) {
        this.f5072K = i;
    }

    /* renamed from: s */
    public final void m2689s() {
        int i;
        C1049A c1049a = this.f4999E;
        Drawable background = c1049a.getBackground();
        C1079P c1079p = this.f5073L;
        if (background != null) {
            background.getPadding(c1079p.f5095m);
            int layoutDirection = c1079p.getLayoutDirection();
            Rect rect = c1079p.f5095m;
            i = layoutDirection == 1 ? rect.right : -rect.left;
        } else {
            Rect rect2 = c1079p.f5095m;
            rect2.right = 0;
            rect2.left = 0;
            i = 0;
        }
        int paddingLeft = c1079p.getPaddingLeft();
        int paddingRight = c1079p.getPaddingRight();
        int width = c1079p.getWidth();
        int i2 = c1079p.f5094l;
        if (i2 == -2) {
            int m2695a = c1079p.m2695a(this.f5070I, c1049a.getBackground());
            int i3 = c1079p.getContext().getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = c1079p.f5095m;
            int i4 = (i3 - rect3.left) - rect3.right;
            if (m2695a > i4) {
                m2695a = i4;
            }
            m2653q(Math.max(m2695a, (width - paddingLeft) - paddingRight));
        } else if (i2 == -1) {
            m2653q((width - paddingLeft) - paddingRight);
        } else {
            m2653q(i2);
        }
        this.f5005k = c1079p.getLayoutDirection() == 1 ? (((width - paddingRight) - this.f5004j) - this.f5072K) + i : paddingLeft + this.f5072K + i;
    }
}
