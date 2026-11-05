package p098q0;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.splitinfo.HorizontalSwipeFrameLayout;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import com.sun.jna.Function;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
import p001A0.RunnableC0010d;
import p001A0.RunnableC0017k;
import p022K.AbstractC0169Q;
import p022K.C0217t0;
import p022K.C0221v0;
import p022K.InterfaceC0210q;
import p034Q0.RunnableC0296m;
import p117x.C1639d;
import p118x0.InterfaceC1647c;

/* renamed from: q0.f1 */
/* loaded from: classes.dex */
public final class C1315f1 implements InterfaceC1647c, InterfaceC0210q {

    /* renamed from: f */
    public final Object f6118f;

    public /* synthetic */ C1315f1(Object obj) {
        this.f6118f = obj;
    }

    /* renamed from: a */
    public void m3178a(cfgData cfgdata, int i, String str, int i2, int i3, int i4, int i5, boolean z2) {
        if (z2 && str != null && !str.trim().isEmpty() && !"---".equals(str) && i4 > i2 && i5 > i3) {
            Rect rect = new Rect(i2, i3, i4, i5);
            AbstractC1256E0.m3025r(cfgdata, str, rect, i);
            ((ArrayList) this.f6118f).add(new C1330k1(i, rect));
        }
    }

    /* renamed from: b */
    public boolean m3179b() {
        HorizontalSwipeFrameLayout horizontalSwipeFrameLayout;
        C1324i1 c1324i1 = (C1324i1) this.f6118f;
        if (c1324i1.f6180N0 || !c1324i1.f6172J0 || (horizontalSwipeFrameLayout = c1324i1.f6219f) == null) {
            return false;
        }
        c1324i1.f6184P0 = -1;
        c1324i1.f6182O0 = 0;
        float width = horizontalSwipeFrameLayout.getWidth();
        c1324i1.f6186Q0 = width;
        return width > 0.0f;
    }

    @Override // p022K.InterfaceC0210q
    /* renamed from: c */
    public C0221v0 mo18c(View view, C0221v0 c0221v0) {
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f6118f;
        if (!Objects.equals(coordinatorLayout.f1893s, c0221v0)) {
            coordinatorLayout.f1893s = c0221v0;
            boolean z2 = c0221v0.m684d() > 0;
            coordinatorLayout.f1894t = z2;
            coordinatorLayout.setWillNotDraw(!z2 && coordinatorLayout.getBackground() == null);
            C0217t0 c0217t0 = c0221v0.f573a;
            if (!c0217t0.mo666m()) {
                int childCount = coordinatorLayout.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    View childAt = coordinatorLayout.getChildAt(i);
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    if (childAt.getFitsSystemWindows() && ((C1639d) childAt.getLayoutParams()).f9306a != null && c0217t0.mo666m()) {
                        break;
                    }
                }
            }
            coordinatorLayout.requestLayout();
        }
        return c0221v0;
    }

    /* renamed from: d */
    public void m3180d(float f2, float f3) {
        boolean z2;
        int i;
        C1324i1 c1324i1 = (C1324i1) this.f6118f;
        HorizontalSwipeFrameLayout horizontalSwipeFrameLayout = c1324i1.f6219f;
        boolean z3 = Math.abs(f3) > (horizontalSwipeFrameLayout != null ? horizontalSwipeFrameLayout.getMinFlingVelocity() : 1000.0f);
        int i2 = f3 < 0.0f ? 1 : -1;
        if (z3) {
            z2 = true;
        } else {
            int i3 = f2 < 0.0f ? 1 : -1;
            z2 = Math.abs(f2) > c1324i1.f6186Q0 * 0.28f;
            i2 = i3;
        }
        if (!z2 || c1324i1.f6186Q0 <= 0.0f) {
            c1324i1.m3197C();
            return;
        }
        if (i2 != c1324i1.f6182O0 || c1324i1.f6184P0 < 0) {
            c1324i1.m3229q(i2 > 0 ? -1.0f : 1.0f);
            c1324i1.m3229q((i2 > 0 ? -c1324i1.f6186Q0 : c1324i1.f6186Q0) * 0.3f);
        }
        View m3230r = c1324i1.m3230r(c1324i1.f6178M0);
        View m3230r2 = c1324i1.m3230r(c1324i1.f6184P0);
        if (m3230r == null || m3230r2 == null || (i = c1324i1.f6184P0) < 0) {
            c1324i1.m3197C();
            return;
        }
        float f4 = c1324i1.f6182O0 > 0 ? -c1324i1.f6186Q0 : c1324i1.f6186Q0;
        c1324i1.f6180N0 = true;
        m3230r.animate().cancel();
        m3230r2.animate().cancel();
        m3230r.animate().translationX(f4).setDuration(240L).withEndAction(new RunnableC0296m(m3230r, 3)).start();
        m3230r2.animate().translationX(0.0f).setDuration(240L).withEndAction(new RunnableC0010d(c1324i1, i, 6)).start();
    }

    /* renamed from: e */
    public void m3181e(float f2, float f3, float f4) {
        int round;
        C1324i1 c1324i1 = (C1324i1) this.f6118f;
        HorizontalSwipeFrameLayout horizontalSwipeFrameLayout = c1324i1.f6219f;
        if (horizontalSwipeFrameLayout == null) {
            return;
        }
        int height = horizontalSwipeFrameLayout.getHeight();
        float f5 = height > 0 ? height / 39.0f : 24.0f;
        if (f5 < 8.0f) {
            f5 = 8.0f;
        }
        int round2 = Math.round((-f2) / f5) + c1324i1.f6233m;
        if (round2 < 0) {
            round2 = 0;
        } else if (round2 > 39) {
            round2 = 39;
        }
        c1324i1.f6235n = round2;
        if (c1324i1.f6221g == null && (c1324i1.f6217e instanceof FrameLayout)) {
            FrameLayout frameLayout = new FrameLayout(c1324i1.f6217e.getContext());
            int m3224j = c1324i1.m3224j(112);
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(m3224j, m3224j));
            frameLayout.setClickable(false);
            frameLayout.setFocusable(false);
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(1);
            gradientDrawable.setGradientType(1);
            gradientDrawable.setGradientRadius(c1324i1.m3224j(56));
            gradientDrawable.setColors(new int[]{-15316902, -16314344});
            gradientDrawable.setStroke(c1324i1.m3224j(3), -10551310);
            frameLayout.setBackground(gradientDrawable);
            frameLayout.setElevation(c1324i1.m3224j(10));
            c1324i1.f6227j = gradientDrawable;
            TextView m3228p = c1324i1.m3228p(true);
            TextView m3228p2 = c1324i1.m3228p(false);
            frameLayout.addView(m3228p);
            frameLayout.addView(m3228p2);
            frameLayout.setVisibility(4);
            ((FrameLayout) c1324i1.f6217e).addView(frameLayout);
            c1324i1.f6221g = frameLayout;
            c1324i1.f6223h = m3228p2;
            c1324i1.f6225i = m3228p;
        }
        if (c1324i1.f6221g != null && c1324i1.f6219f != null && c1324i1.f6217e != null) {
            c1324i1.f6231l++;
            ValueAnimator valueAnimator = c1324i1.f6229k;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                c1324i1.f6229k.cancel();
                c1324i1.f6229k = null;
            }
            c1324i1.f6221g.setAlpha(1.0f);
            c1324i1.f6221g.setScaleX(1.0f);
            c1324i1.f6221g.setScaleY(1.0f);
            c1324i1.f6221g.setTranslationX(0.0f);
            c1324i1.f6221g.setTranslationY(0.0f);
            String valueOf = String.valueOf(round2);
            TextView textView = c1324i1.f6225i;
            if (textView != null) {
                textView.setText(valueOf);
            }
            TextView textView2 = c1324i1.f6223h;
            if (textView2 != null) {
                textView2.setText(valueOf);
            }
            float f6 = round2 / 39.0f;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            int[] iArr = {-12714134, -12940033, -7862, -52412};
            float f7 = (f6 <= 1.0f ? f6 : 1.0f) * 3;
            int i = (int) f7;
            if (i >= 3) {
                round = iArr[3];
            } else {
                int i2 = iArr[i];
                int i3 = iArr[i + 1];
                float f8 = f7 - i;
                int i4 = (i2 >> 16) & Function.USE_VARARGS;
                int i5 = (i2 >> 8) & Function.USE_VARARGS;
                int i6 = i2 & Function.USE_VARARGS;
                int i7 = (i3 >> 16) & Function.USE_VARARGS;
                round = (Math.round(((i3 & Function.USE_VARARGS) - i6) * f8) + i6) | ((Math.round((((i3 >> 8) & Function.USE_VARARGS) - i5) * f8) + i5) << 8) | ((Math.round((i7 - i4) * f8) + i4) << 16) | (-16777216);
            }
            GradientDrawable gradientDrawable2 = c1324i1.f6227j;
            if (gradientDrawable2 != null) {
                gradientDrawable2.setStroke(c1324i1.m3224j(3), round);
                c1324i1.f6227j.setColors(new int[]{(Math.round(((round >> 16) & Function.USE_VARARGS) * 0.45f) << 16) | (-16777216) | (Math.round(((round >> 8) & Function.USE_VARARGS) * 0.45f) << 8) | Math.round((round & Function.USE_VARARGS) * 0.45f), -16447476});
            }
            TextView textView3 = c1324i1.f6225i;
            if (textView3 != null) {
                textView3.setTextColor(0);
                c1324i1.f6225i.setShadowLayer(c1324i1.m3224j(10), 0.0f, 0.0f, round);
            }
            TextView textView4 = c1324i1.f6223h;
            if (textView4 != null) {
                textView4.setTextColor(-1);
                c1324i1.f6223h.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
            }
            c1324i1.f6221g.setVisibility(0);
            c1324i1.f6221g.bringToFront();
            c1324i1.f6219f.getLocationOnScreen(new int[2]);
            c1324i1.f6217e.getLocationOnScreen(new int[2]);
            float f9 = (r5[0] - r3[0]) + f3;
            float f10 = (r5[1] - r3[1]) + f4;
            float width = c1324i1.f6221g.getWidth() > 0 ? c1324i1.f6221g.getWidth() : c1324i1.f6221g.getLayoutParams().width;
            float f11 = f9 - (width / 2.0f);
            float m3224j2 = (f10 - width) - c1324i1.m3224j(72);
            float width2 = c1324i1.f6217e.getWidth() - width;
            if (f11 < 0.0f) {
                f11 = 0.0f;
            }
            if (width2 <= 0.0f || f11 <= width2) {
                width2 = f11;
            }
            float f12 = m3224j2 >= 0.0f ? m3224j2 : 0.0f;
            c1324i1.f6221g.setX(width2);
            c1324i1.f6221g.setY(f12);
        }
        if (round2 != c1324i1.f6237o) {
            c1324i1.f6237o = round2;
            NativeLib.nativeSetVolMedia(round2);
        }
    }

    /* renamed from: f */
    public boolean m3182f(float f2) {
        HorizontalSwipeFrameLayout horizontalSwipeFrameLayout;
        int width;
        C1324i1 c1324i1 = (C1324i1) this.f6118f;
        c1324i1.getClass();
        int m1783d = cfgData.m1783d(cfgData.m1784i().f2517F2);
        if (m1783d == 0 || c1324i1.f6180N0 || !c1324i1.f6172J0 || (horizontalSwipeFrameLayout = c1324i1.f6219f) == null) {
            return false;
        }
        if (m1783d == 2 && (width = horizontalSwipeFrameLayout.getWidth()) > 0 && f2 >= width * 0.5f) {
            return false;
        }
        FrameLayout frameLayout = c1324i1.f6209b0;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            return false;
        }
        Integer num = (Integer) carData.getInstance().f2386E0.m1395d();
        int intValue = num != null ? num.intValue() : -1;
        if (intValue < 0) {
            return false;
        }
        c1324i1.f6233m = intValue;
        c1324i1.f6235n = intValue;
        c1324i1.f6237o = intValue;
        return true;
    }

    /* renamed from: g */
    public void m3183g() {
        C1324i1 c1324i1 = (C1324i1) this.f6118f;
        int i = c1324i1.f6235n;
        if (i >= 0 && i != c1324i1.f6237o) {
            NativeLib.nativeSetVolMedia(i);
            c1324i1.f6237o = c1324i1.f6235n;
        }
        FrameLayout frameLayout = c1324i1.f6221g;
        if (frameLayout != null && frameLayout.getVisibility() == 0) {
            final FrameLayout frameLayout2 = c1324i1.f6221g;
            int i2 = c1324i1.f6231l + 1;
            c1324i1.f6231l = i2;
            ValueAnimator valueAnimator = c1324i1.f6229k;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                c1324i1.f6229k.cancel();
                c1324i1.f6229k = null;
            }
            View view = c1324i1.f6217e;
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            final float y2 = frameLayout2.getY();
            final float m3224j = c1324i1.m3224j(220);
            frameLayout2.setPivotX(frameLayout2.getWidth() / 2.0f);
            frameLayout2.setPivotY(frameLayout2.getHeight() / 2.0f);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.setDuration(640L);
            ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: q0.b1
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    float floatValue = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                    float f2 = (1.4f * floatValue) + 1.0f;
                    FrameLayout frameLayout3 = frameLayout2;
                    frameLayout3.setScaleX(f2);
                    frameLayout3.setScaleY(f2);
                    frameLayout3.setAlpha(1.0f - floatValue);
                    frameLayout3.setY(y2 - (m3224j * floatValue));
                }
            });
            ofFloat.addListener(new C1318g1(c1324i1, i2, frameLayout2));
            c1324i1.f6229k = ofFloat;
            ofFloat.start();
        }
        c1324i1.f6235n = -1;
    }

    /* renamed from: h */
    public void m3184h(int i, String str) {
        UserThemeImportActivity userThemeImportActivity = (UserThemeImportActivity) this.f6118f;
        userThemeImportActivity.runOnUiThread(new RunnableC0017k(this, UserThemeImportActivity.m1997t(userThemeImportActivity, str), i, 8));
    }

    public C1315f1() {
        this.f6118f = new ArrayList();
    }
}
