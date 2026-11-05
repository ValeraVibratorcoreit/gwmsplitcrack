package p019I0;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.altaysoft.t500_split.R;
import com.google.android.material.button.MaterialButton;
import java.util.WeakHashMap;
import p008D.AbstractC0070a;
import p022K.AbstractC0169Q;
import p045W0.C0356f;
import p045W0.C0357g;
import p045W0.C0361k;
import p045W0.InterfaceC0372v;
import p121y0.AbstractC1687o;

/* renamed from: I0.c */
/* loaded from: classes.dex */
public final class C0139c {

    /* renamed from: a */
    public final MaterialButton f421a;

    /* renamed from: b */
    public C0361k f422b;

    /* renamed from: c */
    public int f423c;

    /* renamed from: d */
    public int f424d;

    /* renamed from: e */
    public int f425e;

    /* renamed from: f */
    public int f426f;

    /* renamed from: g */
    public int f427g;

    /* renamed from: h */
    public int f428h;

    /* renamed from: i */
    public PorterDuff.Mode f429i;

    /* renamed from: j */
    public ColorStateList f430j;

    /* renamed from: k */
    public ColorStateList f431k;

    /* renamed from: l */
    public ColorStateList f432l;

    /* renamed from: m */
    public C0357g f433m;

    /* renamed from: q */
    public boolean f437q;

    /* renamed from: s */
    public RippleDrawable f439s;

    /* renamed from: t */
    public int f440t;

    /* renamed from: n */
    public boolean f434n = false;

    /* renamed from: o */
    public boolean f435o = false;

    /* renamed from: p */
    public boolean f436p = false;

    /* renamed from: r */
    public boolean f438r = true;

    public C0139c(MaterialButton materialButton, C0361k c0361k) {
        this.f421a = materialButton;
        this.f422b = c0361k;
    }

    /* renamed from: a */
    public final InterfaceC0372v m393a() {
        RippleDrawable rippleDrawable = this.f439s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f439s.getNumberOfLayers() > 2 ? (InterfaceC0372v) this.f439s.getDrawable(2) : (InterfaceC0372v) this.f439s.getDrawable(1);
    }

    /* renamed from: b */
    public final C0357g m394b(boolean z2) {
        RippleDrawable rippleDrawable = this.f439s;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C0357g) ((LayerDrawable) ((InsetDrawable) this.f439s.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0);
    }

    /* renamed from: c */
    public final void m395c(C0361k c0361k) {
        this.f422b = c0361k;
        if (m394b(false) != null) {
            m394b(false).setShapeAppearanceModel(c0361k);
        }
        if (m394b(true) != null) {
            m394b(true).setShapeAppearanceModel(c0361k);
        }
        if (m393a() != null) {
            m393a().setShapeAppearanceModel(c0361k);
        }
    }

    /* renamed from: d */
    public final void m396d(int i, int i2) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        MaterialButton materialButton = this.f421a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.f425e;
        int i4 = this.f426f;
        this.f426f = i2;
        this.f425e = i;
        if (!this.f435o) {
            m397e();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    /* renamed from: e */
    public final void m397e() {
        C0357g c0357g = new C0357g(this.f422b);
        MaterialButton materialButton = this.f421a;
        c0357g.m956i(materialButton.getContext());
        AbstractC0070a.m206h(c0357g, this.f430j);
        PorterDuff.Mode mode = this.f429i;
        if (mode != null) {
            AbstractC0070a.m207i(c0357g, mode);
        }
        float f2 = this.f428h;
        ColorStateList colorStateList = this.f431k;
        c0357g.f1026f.f1017j = f2;
        c0357g.invalidateSelf();
        C0356f c0356f = c0357g.f1026f;
        if (c0356f.f1011d != colorStateList) {
            c0356f.f1011d = colorStateList;
            c0357g.onStateChange(c0357g.getState());
        }
        C0357g c0357g2 = new C0357g(this.f422b);
        c0357g2.setTint(0);
        float f3 = this.f428h;
        int m4948s = this.f434n ? AbstractC1687o.m4948s(materialButton, R.attr.colorSurface) : 0;
        c0357g2.f1026f.f1017j = f3;
        c0357g2.invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(m4948s);
        C0356f c0356f2 = c0357g2.f1026f;
        if (c0356f2.f1011d != valueOf) {
            c0356f2.f1011d = valueOf;
            c0357g2.onStateChange(c0357g2.getState());
        }
        C0357g c0357g3 = new C0357g(this.f422b);
        this.f433m = c0357g3;
        AbstractC0070a.m205g(c0357g3, -1);
        ColorStateList colorStateList2 = this.f432l;
        if (colorStateList2 == null) {
            colorStateList2 = ColorStateList.valueOf(0);
        }
        RippleDrawable rippleDrawable = new RippleDrawable(colorStateList2, new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{c0357g2, c0357g}), this.f423c, this.f425e, this.f424d, this.f426f), this.f433m);
        this.f439s = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        C0357g m394b = m394b(false);
        if (m394b != null) {
            m394b.m957j(this.f440t);
            m394b.setState(materialButton.getDrawableState());
        }
    }

    /* renamed from: f */
    public final void m398f() {
        C0357g m394b = m394b(false);
        C0357g m394b2 = m394b(true);
        if (m394b != null) {
            float f2 = this.f428h;
            ColorStateList colorStateList = this.f431k;
            m394b.f1026f.f1017j = f2;
            m394b.invalidateSelf();
            C0356f c0356f = m394b.f1026f;
            if (c0356f.f1011d != colorStateList) {
                c0356f.f1011d = colorStateList;
                m394b.onStateChange(m394b.getState());
            }
            if (m394b2 != null) {
                float f3 = this.f428h;
                int m4948s = this.f434n ? AbstractC1687o.m4948s(this.f421a, R.attr.colorSurface) : 0;
                m394b2.f1026f.f1017j = f3;
                m394b2.invalidateSelf();
                ColorStateList valueOf = ColorStateList.valueOf(m4948s);
                C0356f c0356f2 = m394b2.f1026f;
                if (c0356f2.f1011d != valueOf) {
                    c0356f2.f1011d = valueOf;
                    m394b2.onStateChange(m394b2.getState());
                }
            }
        }
    }
}
