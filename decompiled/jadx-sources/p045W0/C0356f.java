package p045W0;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.sun.jna.Function;
import p032P0.C0266a;

/* renamed from: W0.f */
/* loaded from: classes.dex */
public class C0356f extends Drawable.ConstantState {

    /* renamed from: a */
    public C0361k f1008a;

    /* renamed from: b */
    public C0266a f1009b;

    /* renamed from: c */
    public ColorStateList f1010c;

    /* renamed from: d */
    public ColorStateList f1011d;

    /* renamed from: e */
    public ColorStateList f1012e;

    /* renamed from: f */
    public PorterDuff.Mode f1013f;

    /* renamed from: g */
    public Rect f1014g;

    /* renamed from: h */
    public final float f1015h;

    /* renamed from: i */
    public float f1016i;

    /* renamed from: j */
    public float f1017j;

    /* renamed from: k */
    public int f1018k;

    /* renamed from: l */
    public float f1019l;

    /* renamed from: m */
    public float f1020m;

    /* renamed from: n */
    public int f1021n;

    /* renamed from: o */
    public int f1022o;

    /* renamed from: p */
    public final Paint.Style f1023p;

    public C0356f(C0361k c0361k) {
        this.f1010c = null;
        this.f1011d = null;
        this.f1012e = null;
        this.f1013f = PorterDuff.Mode.SRC_IN;
        this.f1014g = null;
        this.f1015h = 1.0f;
        this.f1016i = 1.0f;
        this.f1018k = Function.USE_VARARGS;
        this.f1019l = 0.0f;
        this.f1020m = 0.0f;
        this.f1021n = 0;
        this.f1022o = 0;
        this.f1023p = Paint.Style.FILL_AND_STROKE;
        this.f1008a = c0361k;
        this.f1009b = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        C0357g c0357g = new C0357g(this);
        c0357g.f1030j = true;
        return c0357g;
    }

    public C0356f(C0356f c0356f) {
        this.f1010c = null;
        this.f1011d = null;
        this.f1012e = null;
        this.f1013f = PorterDuff.Mode.SRC_IN;
        this.f1014g = null;
        this.f1015h = 1.0f;
        this.f1016i = 1.0f;
        this.f1018k = Function.USE_VARARGS;
        this.f1019l = 0.0f;
        this.f1020m = 0.0f;
        this.f1021n = 0;
        this.f1022o = 0;
        this.f1023p = Paint.Style.FILL_AND_STROKE;
        this.f1008a = c0356f.f1008a;
        this.f1009b = c0356f.f1009b;
        this.f1017j = c0356f.f1017j;
        this.f1010c = c0356f.f1010c;
        this.f1011d = c0356f.f1011d;
        this.f1013f = c0356f.f1013f;
        this.f1012e = c0356f.f1012e;
        this.f1018k = c0356f.f1018k;
        this.f1015h = c0356f.f1015h;
        this.f1022o = c0356f.f1022o;
        this.f1016i = c0356f.f1016i;
        this.f1019l = c0356f.f1019l;
        this.f1020m = c0356f.f1020m;
        this.f1021n = c0356f.f1021n;
        this.f1023p = c0356f.f1023p;
        if (c0356f.f1014g != null) {
            this.f1014g = new Rect(c0356f.f1014g);
        }
    }
}
