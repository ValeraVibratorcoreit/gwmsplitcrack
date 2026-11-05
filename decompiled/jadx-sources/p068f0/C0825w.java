package p068f0;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import p038T.AbstractC0312f;

/* renamed from: f0.w */
/* loaded from: classes.dex */
public final class C0825w extends AbstractC0312f {

    /* renamed from: d */
    public final /* synthetic */ int f4203d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0825w(AbstractC0778H abstractC0778H, int i) {
        super(abstractC0778H);
        this.f4203d = i;
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: b */
    public final int mo878b(View view) {
        switch (this.f4203d) {
            case 0:
                C0779I c0779i = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return view.getRight() + ((C0779I) view.getLayoutParams()).f3948b.right + ((ViewGroup.MarginLayoutParams) c0779i).rightMargin;
            default:
                C0779I c0779i2 = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return view.getBottom() + ((C0779I) view.getLayoutParams()).f3948b.bottom + ((ViewGroup.MarginLayoutParams) c0779i2).bottomMargin;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: c */
    public final int mo879c(View view) {
        switch (this.f4203d) {
            case 0:
                C0779I c0779i = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return AbstractC0778H.m2217A(view) + ((ViewGroup.MarginLayoutParams) c0779i).leftMargin + ((ViewGroup.MarginLayoutParams) c0779i).rightMargin;
            default:
                C0779I c0779i2 = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return AbstractC0778H.m2224z(view) + ((ViewGroup.MarginLayoutParams) c0779i2).topMargin + ((ViewGroup.MarginLayoutParams) c0779i2).bottomMargin;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: d */
    public final int mo880d(View view) {
        switch (this.f4203d) {
            case 0:
                C0779I c0779i = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return AbstractC0778H.m2224z(view) + ((ViewGroup.MarginLayoutParams) c0779i).topMargin + ((ViewGroup.MarginLayoutParams) c0779i).bottomMargin;
            default:
                C0779I c0779i2 = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return AbstractC0778H.m2217A(view) + ((ViewGroup.MarginLayoutParams) c0779i2).leftMargin + ((ViewGroup.MarginLayoutParams) c0779i2).rightMargin;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: e */
    public final int mo881e(View view) {
        switch (this.f4203d) {
            case 0:
                C0779I c0779i = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return (view.getLeft() - ((C0779I) view.getLayoutParams()).f3948b.left) - ((ViewGroup.MarginLayoutParams) c0779i).leftMargin;
            default:
                C0779I c0779i2 = (C0779I) view.getLayoutParams();
                ((AbstractC0778H) this.f886b).getClass();
                return (view.getTop() - ((C0779I) view.getLayoutParams()).f3948b.top) - ((ViewGroup.MarginLayoutParams) c0779i2).topMargin;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: f */
    public final int mo882f() {
        switch (this.f4203d) {
            case 0:
                return ((AbstractC0778H) this.f886b).f3945n;
            default:
                return ((AbstractC0778H) this.f886b).f3946o;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: g */
    public final int mo883g() {
        switch (this.f4203d) {
            case 0:
                AbstractC0778H abstractC0778H = (AbstractC0778H) this.f886b;
                return abstractC0778H.f3945n - abstractC0778H.m2230F();
            default:
                AbstractC0778H abstractC0778H2 = (AbstractC0778H) this.f886b;
                return abstractC0778H2.f3946o - abstractC0778H2.m2228D();
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: h */
    public final int mo884h() {
        switch (this.f4203d) {
            case 0:
                return ((AbstractC0778H) this.f886b).m2230F();
            default:
                return ((AbstractC0778H) this.f886b).m2228D();
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: i */
    public final int mo885i() {
        switch (this.f4203d) {
            case 0:
                return ((AbstractC0778H) this.f886b).f3943l;
            default:
                return ((AbstractC0778H) this.f886b).f3944m;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: j */
    public final int mo886j() {
        switch (this.f4203d) {
            case 0:
                return ((AbstractC0778H) this.f886b).f3944m;
            default:
                return ((AbstractC0778H) this.f886b).f3943l;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: k */
    public final int mo887k() {
        switch (this.f4203d) {
            case 0:
                return ((AbstractC0778H) this.f886b).m2229E();
            default:
                return ((AbstractC0778H) this.f886b).m2231G();
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: l */
    public final int mo888l() {
        switch (this.f4203d) {
            case 0:
                AbstractC0778H abstractC0778H = (AbstractC0778H) this.f886b;
                return (abstractC0778H.f3945n - abstractC0778H.m2229E()) - abstractC0778H.m2230F();
            default:
                AbstractC0778H abstractC0778H2 = (AbstractC0778H) this.f886b;
                return (abstractC0778H2.f3946o - abstractC0778H2.m2231G()) - abstractC0778H2.m2228D();
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: n */
    public final int mo890n(View view) {
        switch (this.f4203d) {
            case 0:
                AbstractC0778H abstractC0778H = (AbstractC0778H) this.f886b;
                Rect rect = (Rect) this.f887c;
                abstractC0778H.m2232K(view, rect);
                return rect.right;
            default:
                AbstractC0778H abstractC0778H2 = (AbstractC0778H) this.f886b;
                Rect rect2 = (Rect) this.f887c;
                abstractC0778H2.m2232K(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: o */
    public final int mo891o(View view) {
        switch (this.f4203d) {
            case 0:
                AbstractC0778H abstractC0778H = (AbstractC0778H) this.f886b;
                Rect rect = (Rect) this.f887c;
                abstractC0778H.m2232K(view, rect);
                return rect.left;
            default:
                AbstractC0778H abstractC0778H2 = (AbstractC0778H) this.f886b;
                Rect rect2 = (Rect) this.f887c;
                abstractC0778H2.m2232K(view, rect2);
                return rect2.top;
        }
    }

    @Override // p038T.AbstractC0312f
    /* renamed from: p */
    public final void mo892p(int i) {
        switch (this.f4203d) {
            case 0:
                ((AbstractC0778H) this.f886b).mo1551O(i);
                break;
            default:
                ((AbstractC0778H) this.f886b).mo1553P(i);
                break;
        }
    }
}
