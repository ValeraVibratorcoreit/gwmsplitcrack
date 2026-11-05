package p098q0;

import android.content.Context;
import android.graphics.Color;
import com.altaysoft.t500_split.R;
import p000A.AbstractC0001b;
import p006C.AbstractC0062j;

/* renamed from: q0.r0 */
/* loaded from: classes.dex */
public final class C1350r0 {

    /* renamed from: a */
    public final int f6346a;

    /* renamed from: b */
    public final int f6347b;

    /* renamed from: c */
    public final int f6348c;

    /* renamed from: d */
    public final int f6349d;

    /* renamed from: e */
    public final int f6350e;

    /* renamed from: f */
    public final int f6351f;

    /* renamed from: g */
    public final int f6352g;

    public C1350r0(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.f6346a = i;
        this.f6347b = i2;
        this.f6348c = i3;
        this.f6349d = i4;
        this.f6350e = i5;
        this.f6351f = i6;
        this.f6352g = i7;
    }

    /* renamed from: a */
    public static int m3242a(float f2, int i, int i2) {
        float max = Math.max(0.0f, Math.min(1.0f, f2));
        float f3 = 1.0f - max;
        return Color.argb(AbstractC0062j.m150d(Color.alpha(i2), max, Color.alpha(i) * f3), AbstractC0062j.m150d(Color.red(i2), max, Color.red(i) * f3), AbstractC0062j.m150d(Color.green(i2), max, Color.green(i) * f3), AbstractC0062j.m150d(Color.blue(i2), max, Color.blue(i) * f3));
    }

    /* renamed from: b */
    public static C1350r0 m3243b(Context context) {
        int m3a = AbstractC0001b.m3a(context, R.color.overlay_panel_border);
        int m3a2 = AbstractC0001b.m3a(context, R.color.overlay_panel_bg);
        AbstractC0001b.m3a(context, R.color.overlay_panel_border_inner);
        return new C1350r0(m3a, m3a2, AbstractC0001b.m3a(context, R.color.overlay_panel_content_bg), AbstractC0001b.m3a(context, R.color.overlay_panel_content_border), AbstractC0001b.m3a(context, R.color.overlay_panel_label_text), AbstractC0001b.m3a(context, R.color.overlay_panel_value_text), AbstractC0001b.m3a(context, R.color.overlay_panel_accent));
    }

    /* renamed from: c */
    public static int m3244c(int i, int i2) {
        float m3245d = m3245d(i2);
        float m3245d2 = m3245d(i);
        boolean z2 = m3245d < 0.45f;
        return (!z2 || m3245d2 >= 0.55f) ? (z2 || m3245d2 <= 0.55f) ? i : m3242a(0.72f, i, -14012360) : m3242a(0.72f, i, -1512208);
    }

    /* renamed from: d */
    public static float m3245d(int i) {
        return ((Color.blue(i) / 255.0f) * 0.114f) + ((Color.green(i) / 255.0f) * 0.587f) + ((Color.red(i) / 255.0f) * 0.299f);
    }
}
