package p098q0;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.lifecycle.EnumC0548m;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.util.ArrayList;
import p000A.AbstractC0001b;
import p013F0.C0097a;

/* renamed from: q0.B */
/* loaded from: classes.dex */
public final class C1246B {

    /* renamed from: w */
    public static final int[] f5553w = {8, 0, 1, 2, 3, 4, 5, 29};

    /* renamed from: x */
    public static C1246B f5554x;

    /* renamed from: a */
    public final Context f5555a;

    /* renamed from: c */
    public WindowManager f5557c;

    /* renamed from: d */
    public View f5558d;

    /* renamed from: e */
    public TextView f5559e;

    /* renamed from: f */
    public TextView f5560f;

    /* renamed from: g */
    public TextView f5561g;

    /* renamed from: h */
    public TextView f5562h;

    /* renamed from: i */
    public TextView f5563i;

    /* renamed from: j */
    public ContextThemeWrapper f5564j;

    /* renamed from: k */
    public C1243A f5565k;

    /* renamed from: l */
    public boolean f5566l;

    /* renamed from: m */
    public int f5567m;

    /* renamed from: o */
    public boolean f5569o;

    /* renamed from: p */
    public float f5570p;

    /* renamed from: q */
    public float f5571q;

    /* renamed from: r */
    public ValueAnimator f5572r;

    /* renamed from: s */
    public long f5573s;

    /* renamed from: u */
    public final C1370y f5575u;

    /* renamed from: v */
    public final C1370y f5576v;

    /* renamed from: b */
    public final Handler f5556b = new Handler(Looper.getMainLooper());

    /* renamed from: n */
    public int f5568n = -1;

    /* renamed from: t */
    public final RunnableC1367x f5574t = new RunnableC1367x(this, 0);

    /* JADX WARN: Type inference failed for: r0v3, types: [q0.y] */
    /* JADX WARN: Type inference failed for: r0v4, types: [q0.y] */
    public C1246B(Context context) {
        final int i = 0;
        this.f5575u = new InterfaceC0561z(this) { // from class: q0.y

            /* renamed from: b */
            public final /* synthetic */ C1246B f6428b;

            {
                this.f6428b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int m2953g;
                Integer num = (Integer) obj;
                switch (i) {
                    case 0:
                        C1246B c1246b = this.f6428b;
                        c1246b.getClass();
                        if (num != null && num.intValue() != 0 && c1246b.f5566l) {
                            if (num.intValue() != 7) {
                                if (num.intValue() == 8) {
                                    c1246b.m2960j(1);
                                    break;
                                }
                            } else {
                                c1246b.m2960j(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        C1246B c1246b2 = this.f6428b;
                        if (c1246b2.f5566l && num != null && c1246b2.f5568n < 0 && SystemClock.uptimeMillis() - c1246b2.f5573s >= 1800 && (m2953g = C1246B.m2953g(num.intValue())) != c1246b2.f5567m) {
                            c1246b2.f5569o = true;
                            c1246b2.f5556b.removeCallbacks(c1246b2.f5574t);
                            c1246b2.f5568n = -1;
                            c1246b2.m2957c();
                            c1246b2.f5567m = m2953g;
                            c1246b2.m2959h();
                            c1246b2.f5569o = false;
                            break;
                        }
                        break;
                }
            }
        };
        final int i2 = 1;
        this.f5576v = new InterfaceC0561z(this) { // from class: q0.y

            /* renamed from: b */
            public final /* synthetic */ C1246B f6428b;

            {
                this.f6428b = this;
            }

            @Override // androidx.lifecycle.InterfaceC0561z
            /* renamed from: a */
            public final void mo1100a(Object obj) {
                int m2953g;
                Integer num = (Integer) obj;
                switch (i2) {
                    case 0:
                        C1246B c1246b = this.f6428b;
                        c1246b.getClass();
                        if (num != null && num.intValue() != 0 && c1246b.f5566l) {
                            if (num.intValue() != 7) {
                                if (num.intValue() == 8) {
                                    c1246b.m2960j(1);
                                    break;
                                }
                            } else {
                                c1246b.m2960j(-1);
                                break;
                            }
                        }
                        break;
                    default:
                        C1246B c1246b2 = this.f6428b;
                        if (c1246b2.f5566l && num != null && c1246b2.f5568n < 0 && SystemClock.uptimeMillis() - c1246b2.f5573s >= 1800 && (m2953g = C1246B.m2953g(num.intValue())) != c1246b2.f5567m) {
                            c1246b2.f5569o = true;
                            c1246b2.f5556b.removeCallbacks(c1246b2.f5574t);
                            c1246b2.f5568n = -1;
                            c1246b2.m2957c();
                            c1246b2.f5567m = m2953g;
                            c1246b2.m2959h();
                            c1246b2.f5569o = false;
                            break;
                        }
                        break;
                }
            }
        };
        this.f5555a = context.getApplicationContext();
    }

    /* renamed from: b */
    public static int[] m2950b() {
        cfgData m1784i = cfgData.m1784i();
        int m2953g = m2953g(carData.getInstance().m1753i());
        ArrayList arrayList = new ArrayList(8);
        int[] iArr = f5553w;
        for (int i = 0; i < 8; i++) {
            int i2 = iArr[i];
            if ((i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? i2 != 8 ? i2 != 29 ? m1784i.f2575U0 : m1784i.f2600a1 : m1784i.f2571T0 : m1784i.f2595Z0 : m1784i.f2591Y0 : m1784i.f2587X0 : m1784i.f2583W0 : m1784i.f2579V0) || i2 == m2953g) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(Integer.valueOf(m2953g));
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr2;
    }

    /* renamed from: e */
    public static int m2951e(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (iArr[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public static String m2952f(Context context, int i) {
        return context == null ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 8 ? i != 29 ? "Стандарт" : "4H-OFF Road" : "Авто" : "Грязь" : "Песок" : "Снег" : "Эко" : "Спорт" : i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 8 ? i != 29 ? context.getString(R.string.drive_mode_normal) : context.getString(R.string.drive_mode_4h) : context.getString(R.string.drive_mode_auto) : context.getString(R.string.drive_mode_mud) : context.getString(R.string.drive_mode_sand) : context.getString(R.string.drive_mode_snow) : context.getString(R.string.drive_mode_eco) : context.getString(R.string.drive_mode_sport);
    }

    /* renamed from: g */
    public static int m2953g(int i) {
        if (i == 6) {
            return 29;
        }
        if (m2951e(f5553w, i) >= 0) {
            return i;
        }
        return 0;
    }

    /* renamed from: i */
    public static void m2954i(TextView textView) {
        textView.setTranslationX(0.0f);
        textView.setTranslationY(0.0f);
        textView.setScaleX(1.0f);
        textView.setScaleY(1.0f);
        textView.setAlpha(1.0f);
    }

    /* renamed from: k */
    public static int m2955k(int i) {
        if (i == 1) {
            return 4;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 12;
        }
        if (i == 4) {
            return 13;
        }
        if (i == 5) {
            return 11;
        }
        if (i != 8) {
            return i != 29 ? 0 : 6;
        }
        return 9;
    }

    /* renamed from: a */
    public final void m2956a(TextView textView, float f2) {
        textView.setTranslationY((this.f5570p * f2) + this.f5571q);
        textView.setTranslationX(0.0f);
        textView.setScaleX(1.0f);
        float width = textView.getWidth();
        float height = textView.getHeight();
        if (width <= 0.0f) {
            width = Math.max(1.0f, textView.getMeasuredWidth());
        }
        if (height <= 0.0f) {
            height = Math.max(1.0f, textView.getLineHeight());
        }
        textView.setPivotX(width * 0.5f);
        if (f2 < -0.02f) {
            textView.setPivotY(height);
        } else if (f2 > 0.02f) {
            textView.setPivotY(0.0f);
        } else {
            textView.setPivotY(height * 0.5f);
        }
        float abs = Math.abs(f2);
        float min = Math.min(1.0f, abs);
        float f3 = ((-0.42000002f) * min) + 1.0f;
        float f4 = (min * (-0.38f)) + 1.0f;
        if (abs > 1.0f) {
            f4 *= Math.max(0.0f, 1.0f - (abs - 1.0f));
            f3 *= 0.88f;
        }
        textView.setScaleY(f3);
        textView.setAlpha(f4);
        int i = abs < 0.5f ? 1 : 0;
        Context context = this.f5564j;
        if (context == null) {
            context = this.f5555a;
        }
        textView.setTextColor(AbstractC0001b.m3a(context, i != 0 ? R.color.overlay_panel_value_text : R.color.overlay_panel_label_text));
        textView.setTypeface(Typeface.DEFAULT, i);
        textView.setTextSize(2, i != 0 ? 32.0f : 28.0f);
    }

    /* renamed from: c */
    public final void m2957c() {
        ValueAnimator valueAnimator = this.f5572r;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f5572r = null;
        }
        TextView textView = this.f5563i;
        if (textView != null) {
            textView.setVisibility(4);
            m2954i(this.f5563i);
        }
        TextView textView2 = this.f5560f;
        if (textView2 != null) {
            m2954i(textView2);
        }
        TextView textView3 = this.f5561g;
        if (textView3 != null) {
            m2954i(textView3);
        }
        TextView textView4 = this.f5562h;
        if (textView4 != null) {
            m2954i(textView4);
        }
    }

    /* renamed from: d */
    public final void m2958d() {
        WindowManager windowManager;
        C1243A c1243a = this.f5565k;
        if (c1243a != null) {
            c1243a.f5543g.m1383g(EnumC0548m.f1990a);
            this.f5565k = null;
        }
        this.f5556b.removeCallbacks(this.f5574t);
        m2957c();
        View view = this.f5558d;
        if (view != null && (windowManager = this.f5557c) != null) {
            try {
                windowManager.removeView(view);
            } catch (Throwable unused) {
            }
        }
        this.f5558d = null;
        this.f5559e = null;
        this.f5560f = null;
        this.f5561g = null;
        this.f5562h = null;
        this.f5563i = null;
        this.f5557c = null;
        this.f5564j = null;
        this.f5566l = false;
        AbstractC1372y1.f6438h = false;
        this.f5568n = -1;
        this.f5569o = false;
    }

    /* renamed from: h */
    public final void m2959h() {
        if (this.f5560f == null || this.f5561g == null || this.f5562h == null) {
            return;
        }
        m2957c();
        int[] m2950b = m2950b();
        Context context = this.f5564j;
        if (context == null) {
            context = this.f5555a;
        }
        int length = m2950b.length;
        int m2951e = m2951e(m2950b, this.f5567m);
        if (m2951e < 0) {
            m2951e = 0;
        }
        this.f5561g.setText(m2952f(context, this.f5567m));
        m2956a(this.f5561g, 0.0f);
        if (length <= 1) {
            this.f5560f.setText("");
            this.f5562h.setText("");
            this.f5560f.setVisibility(4);
            this.f5562h.setVisibility(4);
        } else {
            this.f5560f.setVisibility(0);
            this.f5562h.setVisibility(0);
            int i = m2950b[((m2951e - 1) + length) % length];
            int i2 = m2950b[(m2951e + 1) % length];
            this.f5560f.setText(m2952f(context, i));
            this.f5562h.setText(m2952f(context, i2));
            m2956a(this.f5560f, -1.0f);
            m2956a(this.f5562h, 1.0f);
        }
        TextView textView = this.f5563i;
        if (textView != null) {
            textView.setVisibility(4);
        }
    }

    /* renamed from: j */
    public final void m2960j(final int i) {
        int[] m2950b = m2950b();
        if (m2950b.length == 0) {
            return;
        }
        int m2951e = m2951e(m2950b, this.f5567m);
        if (m2951e < 0) {
            m2951e = 0;
        }
        int length = m2950b.length;
        if (length == 1) {
            m2959h();
            return;
        }
        int i2 = this.f5567m;
        int i3 = m2950b[(((m2951e + i) % length) + length) % length];
        this.f5567m = i3;
        if (i3 == i2) {
            return;
        }
        this.f5573s = SystemClock.uptimeMillis();
        if (!this.f5569o) {
            this.f5568n = this.f5567m;
            Handler handler = this.f5556b;
            RunnableC1367x runnableC1367x = this.f5574t;
            handler.removeCallbacks(runnableC1367x);
            handler.postDelayed(runnableC1367x, 1400L);
        }
        if (this.f5560f == null || this.f5561g == null || this.f5562h == null || this.f5563i == null) {
            m2959h();
            return;
        }
        m2957c();
        int length2 = m2950b.length;
        int m2951e2 = m2951e(m2950b, i2);
        if (m2951e2 < 0) {
            m2951e2 = 0;
        }
        int i4 = m2950b[((m2951e2 - 1) + length2) % length2];
        int i5 = m2950b[(1 + m2951e2) % length2];
        int i6 = i > 0 ? m2950b[(m2951e2 + 2) % length2] : m2950b[((m2951e2 - 2) + length2) % length2];
        Context context = this.f5564j;
        if (context == null) {
            context = this.f5555a;
        }
        this.f5560f.setText(m2952f(context, i4));
        this.f5561g.setText(m2952f(context, i2));
        this.f5562h.setText(m2952f(context, i5));
        this.f5563i.setText(m2952f(context, i6));
        this.f5563i.setVisibility(0);
        m2956a(this.f5560f, -1.0f);
        m2956a(this.f5561g, 0.0f);
        m2956a(this.f5562h, 1.0f);
        m2956a(this.f5563i, i > 0 ? 2.0f : -2.0f);
        final float f2 = -i;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f5572r = ofFloat;
        ofFloat.setDuration(240L);
        this.f5572r.setInterpolator(new DecelerateInterpolator(1.4f));
        this.f5572r.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: q0.z
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                C1246B c1246b = C1246B.this;
                c1246b.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                TextView textView = c1246b.f5560f;
                float f3 = f2 * floatValue;
                c1246b.m2956a(textView, (-1.0f) + f3);
                c1246b.m2956a(c1246b.f5561g, f3);
                c1246b.m2956a(c1246b.f5562h, 1.0f + f3);
                c1246b.m2956a(c1246b.f5563i, (i > 0 ? 2.0f : -2.0f) + f3);
            }
        });
        this.f5572r.addListener(new C0097a(6, this));
        this.f5572r.start();
    }
}
