package p080k0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import p003B.C0037d;

/* renamed from: k0.i */
/* loaded from: classes.dex */
public final class C1040i extends AbstractC1043l {

    /* renamed from: d */
    public C0037d f4927d;

    /* renamed from: e */
    public float f4928e;

    /* renamed from: f */
    public C0037d f4929f;

    /* renamed from: g */
    public float f4930g;

    /* renamed from: h */
    public float f4931h;

    /* renamed from: i */
    public float f4932i;

    /* renamed from: j */
    public float f4933j;

    /* renamed from: k */
    public float f4934k;

    /* renamed from: l */
    public Paint.Cap f4935l;

    /* renamed from: m */
    public Paint.Join f4936m;

    /* renamed from: n */
    public float f4937n;

    @Override // p080k0.AbstractC1042k
    /* renamed from: a */
    public final boolean mo2639a() {
        return this.f4929f.m58c() || this.f4927d.m58c();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // p080k0.AbstractC1042k
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mo2640b(int[] iArr) {
        boolean z2;
        C0037d c0037d;
        C0037d c0037d2 = this.f4929f;
        boolean z3 = false;
        if (c0037d2.m58c()) {
            ColorStateList colorStateList = (ColorStateList) c0037d2.f128h;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != c0037d2.f126f) {
                c0037d2.f126f = colorForState;
                z2 = true;
                c0037d = this.f4927d;
                if (c0037d.m58c()) {
                    ColorStateList colorStateList2 = (ColorStateList) c0037d.f128h;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != c0037d.f126f) {
                        c0037d.f126f = colorForState2;
                        z3 = true;
                    }
                }
                return z2 | z3;
            }
        }
        z2 = false;
        c0037d = this.f4927d;
        if (c0037d.m58c()) {
        }
        return z2 | z3;
    }

    public float getFillAlpha() {
        return this.f4931h;
    }

    public int getFillColor() {
        return this.f4929f.f126f;
    }

    public float getStrokeAlpha() {
        return this.f4930g;
    }

    public int getStrokeColor() {
        return this.f4927d.f126f;
    }

    public float getStrokeWidth() {
        return this.f4928e;
    }

    public float getTrimPathEnd() {
        return this.f4933j;
    }

    public float getTrimPathOffset() {
        return this.f4934k;
    }

    public float getTrimPathStart() {
        return this.f4932i;
    }

    public void setFillAlpha(float f2) {
        this.f4931h = f2;
    }

    public void setFillColor(int i) {
        this.f4929f.f126f = i;
    }

    public void setStrokeAlpha(float f2) {
        this.f4930g = f2;
    }

    public void setStrokeColor(int i) {
        this.f4927d.f126f = i;
    }

    public void setStrokeWidth(float f2) {
        this.f4928e = f2;
    }

    public void setTrimPathEnd(float f2) {
        this.f4933j = f2;
    }

    public void setTrimPathOffset(float f2) {
        this.f4934k = f2;
    }

    public void setTrimPathStart(float f2) {
        this.f4932i = f2;
    }
}
