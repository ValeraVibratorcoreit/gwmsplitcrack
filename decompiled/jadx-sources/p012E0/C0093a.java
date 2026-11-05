package p012E0;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
import java.util.WeakHashMap;
import p007C0.AbstractC0067a;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p034Q0.C0292i;
import p034Q0.InterfaceC0291h;
import p039T0.C0335d;
import p045W0.C0351a;
import p045W0.C0357g;
import p045W0.C0360j;
import p045W0.C0361k;

/* renamed from: E0.a */
/* loaded from: classes.dex */
public final class C0093a extends Drawable implements InterfaceC0291h {

    /* renamed from: f */
    public final WeakReference f272f;

    /* renamed from: g */
    public final C0357g f273g;

    /* renamed from: h */
    public final C0292i f274h;

    /* renamed from: i */
    public final Rect f275i;

    /* renamed from: j */
    public final C0096d f276j;

    /* renamed from: k */
    public float f277k;

    /* renamed from: l */
    public float f278l;

    /* renamed from: m */
    public final int f279m;

    /* renamed from: n */
    public float f280n;

    /* renamed from: o */
    public float f281o;

    /* renamed from: p */
    public float f282p;

    /* renamed from: q */
    public WeakReference f283q;

    /* renamed from: r */
    public WeakReference f284r;

    public C0093a(Context context) {
        C0335d c0335d;
        WeakReference weakReference = new WeakReference(context);
        this.f272f = weakReference;
        AbstractC0294k.m842c(context, AbstractC0294k.f824b, "Theme.MaterialComponents");
        this.f275i = new Rect();
        C0292i c0292i = new C0292i(this);
        this.f274h = c0292i;
        TextPaint textPaint = c0292i.f816a;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C0096d c0096d = new C0096d(context);
        this.f276j = c0096d;
        boolean m331e = m331e();
        C0095c c0095c = c0096d.f317b;
        C0357g c0357g = new C0357g(C0361k.m964a(context, m331e ? c0095c.f296g.intValue() : c0095c.f294e.intValue(), m331e() ? c0095c.f297h.intValue() : c0095c.f295f.intValue(), new C0351a(0)).m963a());
        this.f273g = c0357g;
        m333g();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c0292i.f822g != (c0335d = new C0335d(context2, c0095c.f293d.intValue()))) {
            c0292i.m839b(c0335d, context2);
            textPaint.setColor(c0095c.f292c.intValue());
            invalidateSelf();
            m335i();
            invalidateSelf();
        }
        int i = c0095c.f301l;
        if (i != -2) {
            this.f279m = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.f279m = c0095c.f302m;
        }
        c0292i.f820e = true;
        m335i();
        invalidateSelf();
        c0292i.f820e = true;
        m333g();
        m335i();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c0095c.f291b.intValue());
        if (c0357g.f1026f.f1010c != valueOf) {
            c0357g.m958k(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c0095c.f292c.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.f283q;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.f283q.get();
            WeakReference weakReference3 = this.f284r;
            m334h(view, weakReference3 != null ? (FrameLayout) weakReference3.get() : null);
        }
        m335i();
        setVisible(c0095c.f309t.booleanValue(), false);
    }

    @Override // p034Q0.InterfaceC0291h
    /* renamed from: a */
    public final void mo327a() {
        invalidateSelf();
    }

    /* renamed from: b */
    public final String m328b() {
        C0096d c0096d = this.f276j;
        C0095c c0095c = c0096d.f317b;
        String str = c0095c.f299j;
        boolean z2 = str != null;
        WeakReference weakReference = this.f272f;
        if (z2) {
            int i = c0095c.f301l;
            if (i == -2 || str == null || str.length() <= i) {
                return str;
            }
            Context context = (Context) weakReference.get();
            if (context == null) {
                return "";
            }
            return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i - 1), "…");
        }
        if (!m332f()) {
            return null;
        }
        int i2 = this.f279m;
        C0095c c0095c2 = c0096d.f317b;
        if (i2 == -2 || m330d() <= this.f279m) {
            return NumberFormat.getInstance(c0095c2.f303n).format(m330d());
        }
        Context context2 = (Context) weakReference.get();
        return context2 == null ? "" : String.format(c0095c2.f303n, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(this.f279m), "+");
    }

    /* renamed from: c */
    public final FrameLayout m329c() {
        WeakReference weakReference = this.f284r;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    /* renamed from: d */
    public final int m330d() {
        int i = this.f276j.f317b.f300k;
        if (i != -1) {
            return i;
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String m328b;
        if (getBounds().isEmpty() || getAlpha() == 0 || !isVisible()) {
            return;
        }
        this.f273g.draw(canvas);
        if (!m331e() || (m328b = m328b()) == null) {
            return;
        }
        Rect rect = new Rect();
        C0292i c0292i = this.f274h;
        c0292i.f816a.getTextBounds(m328b, 0, m328b.length(), rect);
        float exactCenterY = this.f278l - rect.exactCenterY();
        canvas.drawText(m328b, this.f277k, rect.bottom <= 0 ? (int) exactCenterY : Math.round(exactCenterY), c0292i.f816a);
    }

    /* renamed from: e */
    public final boolean m331e() {
        return this.f276j.f317b.f299j != null || m332f();
    }

    /* renamed from: f */
    public final boolean m332f() {
        C0095c c0095c = this.f276j.f317b;
        return c0095c.f299j == null && c0095c.f300k != -1;
    }

    /* renamed from: g */
    public final void m333g() {
        Context context = (Context) this.f272f.get();
        if (context == null) {
            return;
        }
        boolean m331e = m331e();
        C0096d c0096d = this.f276j;
        this.f273g.setShapeAppearanceModel(C0361k.m964a(context, m331e ? c0096d.f317b.f296g.intValue() : c0096d.f317b.f294e.intValue(), m331e() ? c0096d.f317b.f297h.intValue() : c0096d.f317b.f295f.intValue(), new C0351a(0)).m963a());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f276j.f317b.f298i;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.f275i.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.f275i.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public final void m334h(View view, FrameLayout frameLayout) {
        this.f283q = new WeakReference(view);
        this.f284r = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        m335i();
        invalidateSelf();
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0238  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m335i() {
        float f2;
        float f3;
        float y2;
        float x2;
        float height;
        float width;
        float f4;
        float f5;
        WeakReference weakReference = this.f272f;
        Context context = (Context) weakReference.get();
        WeakReference weakReference2 = this.f283q;
        View view = weakReference2 != null ? (View) weakReference2.get() : null;
        if (context == null || view == null) {
            return;
        }
        Rect rect = new Rect();
        Rect rect2 = this.f275i;
        rect.set(rect2);
        Rect rect3 = new Rect();
        view.getDrawingRect(rect3);
        WeakReference weakReference3 = this.f284r;
        ViewGroup viewGroup = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
        if (viewGroup != null) {
            viewGroup.offsetDescendantRectToMyCoords(view, rect3);
        }
        boolean m331e = m331e();
        C0096d c0096d = this.f276j;
        float f6 = m331e ? c0096d.f319d : c0096d.f318c;
        this.f280n = f6;
        if (f6 != -1.0f) {
            this.f281o = f6;
            this.f282p = f6;
        } else {
            this.f281o = Math.round((m331e() ? c0096d.f322g : c0096d.f320e) / 2.0f);
            this.f282p = Math.round((m331e() ? c0096d.f323h : c0096d.f321f) / 2.0f);
        }
        if (m331e()) {
            String m328b = m328b();
            float f7 = this.f281o;
            C0292i c0292i = this.f274h;
            if (c0292i.f820e) {
                c0292i.m838a(m328b);
                f4 = c0292i.f818c;
            } else {
                f4 = c0292i.f818c;
            }
            this.f281o = Math.max(f7, (f4 / 2.0f) + c0096d.f317b.f310u.intValue());
            float f8 = this.f282p;
            if (c0292i.f820e) {
                c0292i.m838a(m328b);
                f5 = c0292i.f819d;
            } else {
                f5 = c0292i.f819d;
            }
            float max = Math.max(f8, (f5 / 2.0f) + c0096d.f317b.f311v.intValue());
            this.f282p = max;
            this.f281o = Math.max(this.f281o, max);
        }
        int intValue = c0096d.f317b.f313x.intValue();
        boolean m331e2 = m331e();
        C0095c c0095c = c0096d.f317b;
        if (m331e2) {
            intValue = c0095c.f315z.intValue();
            Context context2 = (Context) weakReference.get();
            if (context2 != null) {
                intValue = AbstractC0067a.m195c(intValue, intValue - c0095c.f288C.intValue(), AbstractC0067a.m194b(0.0f, 1.0f, 0.3f, 1.0f, context2.getResources().getConfiguration().fontScale - 1.0f));
            }
        }
        int i = c0096d.f326k;
        if (i == 0) {
            intValue -= Math.round(this.f282p);
        }
        int intValue2 = c0095c.f287B.intValue() + intValue;
        int intValue3 = c0095c.f308s.intValue();
        if (intValue3 == 8388691 || intValue3 == 8388693) {
            this.f278l = rect3.bottom - intValue2;
        } else {
            this.f278l = rect3.top + intValue2;
        }
        int intValue4 = m331e() ? c0095c.f314y.intValue() : c0095c.f312w.intValue();
        if (i == 1) {
            intValue4 += m331e() ? c0096d.f325j : c0096d.f324i;
        }
        int intValue5 = c0095c.f286A.intValue() + intValue4;
        int intValue6 = c0095c.f308s.intValue();
        if (intValue6 == 8388659 || intValue6 == 8388691) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            this.f277k = view.getLayoutDirection() == 0 ? (rect3.left - this.f281o) + intValue5 : (rect3.right + this.f281o) - intValue5;
        } else {
            WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
            this.f277k = view.getLayoutDirection() == 0 ? (rect3.right + this.f281o) - intValue5 : (rect3.left - this.f281o) + intValue5;
        }
        if (c0095c.f289D.booleanValue()) {
            View m329c = m329c();
            if (m329c != null) {
                FrameLayout m329c2 = m329c();
                if (m329c2 == null || m329c2.getId() != R.id.mtrl_anchor_parent) {
                    f2 = 0.0f;
                    f3 = 0.0f;
                } else if (m329c.getParent() instanceof View) {
                    f2 = m329c.getY();
                    f3 = m329c.getX();
                    m329c = (View) m329c.getParent();
                }
                y2 = m329c.getY() + (this.f278l - this.f282p) + f2;
                x2 = m329c.getX() + (this.f277k - this.f281o) + f3;
                if (!(m329c.getParent() instanceof View)) {
                }
                if (!(m329c.getParent() instanceof View)) {
                }
                if (y2 < 0.0f) {
                }
                if (x2 < 0.0f) {
                }
                if (height > 0.0f) {
                }
                if (width > 0.0f) {
                }
            } else if (view.getParent() instanceof View) {
                float y3 = view.getY();
                f3 = view.getX();
                View view2 = (View) view.getParent();
                f2 = y3;
                m329c = view2;
                y2 = m329c.getY() + (this.f278l - this.f282p) + f2;
                x2 = m329c.getX() + (this.f277k - this.f281o) + f3;
                height = !(m329c.getParent() instanceof View) ? ((this.f278l + this.f282p) - (((View) m329c.getParent()).getHeight() - m329c.getY())) + f2 : 0.0f;
                width = !(m329c.getParent() instanceof View) ? ((this.f277k + this.f281o) - (((View) m329c.getParent()).getWidth() - m329c.getX())) + f3 : 0.0f;
                if (y2 < 0.0f) {
                    this.f278l = Math.abs(y2) + this.f278l;
                }
                if (x2 < 0.0f) {
                    this.f277k = Math.abs(x2) + this.f277k;
                }
                if (height > 0.0f) {
                    this.f278l -= Math.abs(height);
                }
                if (width > 0.0f) {
                    this.f277k -= Math.abs(width);
                }
            }
        }
        float f9 = this.f277k;
        float f10 = this.f278l;
        float f11 = this.f281o;
        float f12 = this.f282p;
        rect2.set((int) (f9 - f11), (int) (f10 - f12), (int) (f9 + f11), (int) (f10 + f12));
        float f13 = this.f280n;
        C0357g c0357g = this.f273g;
        if (f13 != -1.0f) {
            C0360j m968e = c0357g.f1026f.f1008a.m968e();
            m968e.f1052e = new C0351a(f13);
            m968e.f1053f = new C0351a(f13);
            m968e.f1054g = new C0351a(f13);
            m968e.f1055h = new C0351a(f13);
            c0357g.setShapeAppearanceModel(m968e.m963a());
        }
        if (rect.equals(rect2)) {
            return;
        }
        c0357g.setBounds(rect2);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, p034Q0.InterfaceC0291h
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C0096d c0096d = this.f276j;
        c0096d.f316a.f298i = i;
        c0096d.f317b.f298i = i;
        this.f274h.f816a.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
