package p032P0;

import android.content.Context;
import com.altaysoft.t500_split.R;
import p121y0.AbstractC1687o;

/* renamed from: P0.a */
/* loaded from: classes.dex */
public final class C0266a {

    /* renamed from: f */
    public static final int f703f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a */
    public final boolean f704a;

    /* renamed from: b */
    public final int f705b;

    /* renamed from: c */
    public final int f706c;

    /* renamed from: d */
    public final int f707d;

    /* renamed from: e */
    public final float f708e;

    public C0266a(Context context) {
        boolean m4923R = AbstractC1687o.m4923R(context, R.attr.elevationOverlayEnabled, false);
        int m4947r = AbstractC1687o.m4947r(context, R.attr.elevationOverlayColor, 0);
        int m4947r2 = AbstractC1687o.m4947r(context, R.attr.elevationOverlayAccentColor, 0);
        int m4947r3 = AbstractC1687o.m4947r(context, R.attr.colorSurface, 0);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f704a = m4923R;
        this.f705b = m4947r;
        this.f706c = m4947r2;
        this.f707d = m4947r3;
        this.f708e = f2;
    }
}
