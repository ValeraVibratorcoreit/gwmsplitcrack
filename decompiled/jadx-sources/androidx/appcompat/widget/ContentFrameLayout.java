package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import p022K.C0175X;
import p070g.C0878q;
import p070g.LayoutInflaterFactory2C0887z;
import p079k.MenuC1018m;
import p082l.C1097Y0;
import p082l.C1115g;
import p082l.C1123k;
import p082l.InterfaceC1112e0;
import p082l.InterfaceC1114f0;

/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: f */
    public TypedValue f1794f;

    /* renamed from: g */
    public TypedValue f1795g;

    /* renamed from: h */
    public TypedValue f1796h;

    /* renamed from: i */
    public TypedValue f1797i;

    /* renamed from: j */
    public TypedValue f1798j;

    /* renamed from: k */
    public TypedValue f1799k;

    /* renamed from: l */
    public final Rect f1800l;

    /* renamed from: m */
    public InterfaceC1112e0 f1801m;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f1800l = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1798j == null) {
            this.f1798j = new TypedValue();
        }
        return this.f1798j;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1799k == null) {
            this.f1799k = new TypedValue();
        }
        return this.f1799k;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1796h == null) {
            this.f1796h = new TypedValue();
        }
        return this.f1796h;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1797i == null) {
            this.f1797i = new TypedValue();
        }
        return this.f1797i;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1794f == null) {
            this.f1794f = new TypedValue();
        }
        return this.f1794f;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1795g == null) {
            this.f1795g = new TypedValue();
        }
        return this.f1795g;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC1112e0 interfaceC1112e0 = this.f1801m;
        if (interfaceC1112e0 != null) {
            interfaceC1112e0.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C1123k c1123k;
        super.onDetachedFromWindow();
        InterfaceC1112e0 interfaceC1112e0 = this.f1801m;
        if (interfaceC1112e0 != null) {
            LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = ((C0878q) interfaceC1112e0).f4385g;
            InterfaceC1114f0 interfaceC1114f0 = layoutInflaterFactory2C0887z.f4462w;
            if (interfaceC1114f0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC1114f0;
                actionBarOverlayLayout.m1277k();
                ActionMenuView actionMenuView = ((C1097Y0) actionBarOverlayLayout.f1756j).f5132a.f1827f;
                if (actionMenuView != null && (c1123k = actionMenuView.f1782y) != null) {
                    c1123k.m2733f();
                    C1115g c1115g = c1123k.f5198y;
                    if (c1115g != null && c1115g.m2636b()) {
                        c1115g.f4905i.dismiss();
                    }
                }
            }
            if (layoutInflaterFactory2C0887z.f4417B != null) {
                layoutInflaterFactory2C0887z.f4456q.getDecorView().removeCallbacks(layoutInflaterFactory2C0887z.f4418C);
                if (layoutInflaterFactory2C0887z.f4417B.isShowing()) {
                    try {
                        layoutInflaterFactory2C0887z.f4417B.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflaterFactory2C0887z.f4417B = null;
            }
            C0175X c0175x = layoutInflaterFactory2C0887z.f4419D;
            if (c0175x != null) {
                c0175x.m521b();
            }
            MenuC1018m menuC1018m = layoutInflaterFactory2C0887z.m2459y(0).f4404h;
            if (menuC1018m != null) {
                menuC1018m.m2615c(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int measuredWidth;
        TypedValue typedValue;
        int i5;
        int i6;
        float fraction;
        int i7;
        int i8;
        float fraction2;
        int i9;
        int i10;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z3 = true;
        boolean z4 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        Rect rect = this.f1800l;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z4 ? this.f1797i : this.f1796h;
            if (typedValue2 != null && (i9 = typedValue2.type) != 0) {
                if (i9 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i9 == 6) {
                    int i11 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i11, i11);
                } else {
                    i10 = 0;
                    if (i10 > 0) {
                        i3 = View.MeasureSpec.makeMeasureSpec(Math.min(i10 - (rect.left + rect.right), View.MeasureSpec.getSize(i)), 1073741824);
                        z2 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z4 ? this.f1798j : this.f1799k;
                            if (typedValue3 != null && (i7 = typedValue3.type) != 0) {
                                if (i7 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i7 == 6) {
                                    int i12 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i12, i12);
                                } else {
                                    i8 = 0;
                                    if (i8 > 0) {
                                        i4 = View.MeasureSpec.makeMeasureSpec(Math.min(i8 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i2)), 1073741824);
                                        super.onMeasure(i3, i4);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z2 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z4 ? this.f1795g : this.f1794f;
                                            if (typedValue != null && (i5 = typedValue.type) != 0) {
                                                if (i5 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i5 == 6) {
                                                    int i13 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i13, i13);
                                                } else {
                                                    i6 = 0;
                                                    if (i6 > 0) {
                                                        i6 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i6) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
                                                        if (z3) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i4);
                                                        return;
                                                    }
                                                }
                                                i6 = (int) fraction;
                                                if (i6 > 0) {
                                                }
                                                if (measuredWidth < i6) {
                                                }
                                            }
                                        }
                                        z3 = false;
                                        if (z3) {
                                        }
                                    }
                                }
                                i8 = (int) fraction2;
                                if (i8 > 0) {
                                }
                            }
                        }
                        i4 = i2;
                        super.onMeasure(i3, i4);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z2) {
                            if (!z4) {
                            }
                            if (typedValue != null) {
                                if (i5 != 5) {
                                }
                                i6 = (int) fraction;
                                if (i6 > 0) {
                                }
                                if (measuredWidth < i6) {
                                }
                            }
                        }
                        z3 = false;
                        if (z3) {
                        }
                    }
                }
                i10 = (int) fraction3;
                if (i10 > 0) {
                }
            }
        }
        i3 = i;
        z2 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i4 = i2;
        super.onMeasure(i3, i4);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z2) {
        }
        z3 = false;
        if (z3) {
        }
    }

    public void setAttachListener(InterfaceC1112e0 interfaceC1112e0) {
        this.f1801m = interfaceC1112e0;
    }
}
