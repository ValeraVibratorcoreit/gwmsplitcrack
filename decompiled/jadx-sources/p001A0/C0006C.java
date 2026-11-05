package p001A0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.cfgData;
import p098q0.AbstractC1353s0;
import p098q0.C1350r0;

/* renamed from: A0.C */
/* loaded from: classes.dex */
public final class C0006C {

    /* renamed from: h */
    public static C0006C f8h;

    /* renamed from: a */
    public final Context f9a;

    /* renamed from: b */
    public final Handler f10b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public FrameLayout f11c;

    /* renamed from: d */
    public TextView f12d;

    /* renamed from: e */
    public WindowManager f13e;

    /* renamed from: f */
    public boolean f14f;

    /* renamed from: g */
    public boolean f15g;

    public C0006C(Context context) {
        this.f9a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static int m9b(Context context, int i) {
        return Math.round(i * context.getResources().getDisplayMetrics().density);
    }

    /* renamed from: c */
    public static C0006C m10c(Context context) {
        if (f8h == null) {
            f8h = new C0006C(context);
        }
        return f8h;
    }

    /* renamed from: a */
    public final void m11a(Context context) {
        if (this.f11c == null || this.f12d == null) {
            return;
        }
        if (context == null) {
            context = this.f9a;
        }
        C1350r0 m3248c = AbstractC1353s0.m3248c(context, cfgData.m1784i());
        float f2 = context.getResources().getDisplayMetrics().density;
        FrameLayout frameLayout = this.f11c;
        float f3 = 22.0f * f2;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f3);
        gradientDrawable.setColor(m3248c.f6346a);
        float f4 = f2 * 3.0f;
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(Math.max(0.0f, f3 - f4));
        gradientDrawable2.setColor(m3248c.f6347b);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, gradientDrawable2});
        int round = Math.round(f4);
        layerDrawable.setLayerInset(1, round, round, round, round);
        frameLayout.setBackground(layerDrawable);
        this.f12d.setTextColor(m3248c.f6351f);
    }
}
