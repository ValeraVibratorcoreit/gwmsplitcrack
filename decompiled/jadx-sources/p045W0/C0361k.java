package p045W0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p004B0.AbstractC0051a;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: W0.k */
/* loaded from: classes.dex */
public final class C0361k {

    /* renamed from: a */
    public AbstractC1680h f1060a = new C0359i();

    /* renamed from: b */
    public AbstractC1680h f1061b = new C0359i();

    /* renamed from: c */
    public AbstractC1680h f1062c = new C0359i();

    /* renamed from: d */
    public AbstractC1680h f1063d = new C0359i();

    /* renamed from: e */
    public InterfaceC0353c f1064e = new C0351a(0.0f);

    /* renamed from: f */
    public InterfaceC0353c f1065f = new C0351a(0.0f);

    /* renamed from: g */
    public InterfaceC0353c f1066g = new C0351a(0.0f);

    /* renamed from: h */
    public InterfaceC0353c f1067h = new C0351a(0.0f);

    /* renamed from: i */
    public C0355e f1068i = new C0355e(0);

    /* renamed from: j */
    public C0355e f1069j = new C0355e(0);

    /* renamed from: k */
    public C0355e f1070k = new C0355e(0);

    /* renamed from: l */
    public C0355e f1071l = new C0355e(0);

    /* renamed from: a */
    public static C0360j m964a(Context context, int i, int i2, C0351a c0351a) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
        if (i2 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i2);
        }
        TypedArray obtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(AbstractC0051a.f188w);
        try {
            int i3 = obtainStyledAttributes.getInt(0, 0);
            int i4 = obtainStyledAttributes.getInt(3, i3);
            int i5 = obtainStyledAttributes.getInt(4, i3);
            int i6 = obtainStyledAttributes.getInt(2, i3);
            int i7 = obtainStyledAttributes.getInt(1, i3);
            InterfaceC0353c m966c = m966c(obtainStyledAttributes, 5, c0351a);
            InterfaceC0353c m966c2 = m966c(obtainStyledAttributes, 8, m966c);
            InterfaceC0353c m966c3 = m966c(obtainStyledAttributes, 9, m966c);
            InterfaceC0353c m966c4 = m966c(obtainStyledAttributes, 7, m966c);
            InterfaceC0353c m966c5 = m966c(obtainStyledAttributes, 6, m966c);
            C0360j c0360j = new C0360j();
            AbstractC1680h m4944m = AbstractC1687o.m4944m(i4);
            c0360j.f1048a = m4944m;
            C0360j.m962b(m4944m);
            c0360j.f1052e = m966c2;
            AbstractC1680h m4944m2 = AbstractC1687o.m4944m(i5);
            c0360j.f1049b = m4944m2;
            C0360j.m962b(m4944m2);
            c0360j.f1053f = m966c3;
            AbstractC1680h m4944m3 = AbstractC1687o.m4944m(i6);
            c0360j.f1050c = m4944m3;
            C0360j.m962b(m4944m3);
            c0360j.f1054g = m966c4;
            AbstractC1680h m4944m4 = AbstractC1687o.m4944m(i7);
            c0360j.f1051d = m4944m4;
            C0360j.m962b(m4944m4);
            c0360j.f1055h = m966c5;
            return c0360j;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: b */
    public static C0360j m965b(Context context, AttributeSet attributeSet, int i, int i2) {
        C0351a c0351a = new C0351a(0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0051a.f182q, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return m964a(context, resourceId, resourceId2, c0351a);
    }

    /* renamed from: c */
    public static InterfaceC0353c m966c(TypedArray typedArray, int i, InterfaceC0353c interfaceC0353c) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return interfaceC0353c;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new C0351a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new C0358h(peekValue.getFraction(1.0f, 1.0f)) : interfaceC0353c;
    }

    /* renamed from: d */
    public final boolean m967d(RectF rectF) {
        boolean z2 = this.f1071l.getClass().equals(C0355e.class) && this.f1069j.getClass().equals(C0355e.class) && this.f1068i.getClass().equals(C0355e.class) && this.f1070k.getClass().equals(C0355e.class);
        float mo939a = this.f1064e.mo939a(rectF);
        return z2 && ((this.f1065f.mo939a(rectF) > mo939a ? 1 : (this.f1065f.mo939a(rectF) == mo939a ? 0 : -1)) == 0 && (this.f1067h.mo939a(rectF) > mo939a ? 1 : (this.f1067h.mo939a(rectF) == mo939a ? 0 : -1)) == 0 && (this.f1066g.mo939a(rectF) > mo939a ? 1 : (this.f1066g.mo939a(rectF) == mo939a ? 0 : -1)) == 0) && ((this.f1061b instanceof C0359i) && (this.f1060a instanceof C0359i) && (this.f1062c instanceof C0359i) && (this.f1063d instanceof C0359i));
    }

    /* renamed from: e */
    public final C0360j m968e() {
        C0360j c0360j = new C0360j();
        c0360j.f1048a = this.f1060a;
        c0360j.f1049b = this.f1061b;
        c0360j.f1050c = this.f1062c;
        c0360j.f1051d = this.f1063d;
        c0360j.f1052e = this.f1064e;
        c0360j.f1053f = this.f1065f;
        c0360j.f1054g = this.f1066g;
        c0360j.f1055h = this.f1067h;
        c0360j.f1056i = this.f1068i;
        c0360j.f1057j = this.f1069j;
        c0360j.f1058k = this.f1070k;
        c0360j.f1059l = this.f1071l;
        return c0360j;
    }
}
