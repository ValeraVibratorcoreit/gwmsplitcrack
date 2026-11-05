package com.altaysoft.t500_split.media;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.userthemes.UserThemeSlotsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import p006C.AbstractC0062j;
import p098q0.AbstractC1372y1;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1569q1;
import p109u0.C1527c1;
import p109u0.C1548j1;
import p109u0.C1554l1;
import p109u0.C1560n1;
import p109u0.C1563o1;
import p115w0.AbstractC1634p;
import p121y0.AbstractC1687o;

/* renamed from: com.altaysoft.t500_split.media.n */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0646n implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f3042a;

    /* renamed from: b */
    public final /* synthetic */ int f3043b;

    /* renamed from: c */
    public final /* synthetic */ int f3044c;

    /* renamed from: d */
    public final /* synthetic */ Object f3045d;

    public /* synthetic */ RunnableC0646n(Object obj, int i, int i2, int i3) {
        this.f3042a = i3;
        this.f3045d = obj;
        this.f3043b = i;
        this.f3044c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int m3313s;
        Bitmap createBitmap;
        String str;
        C1560n1 c1560n1;
        String str2;
        Bitmap m4458j;
        Bitmap m4458j2;
        int i = 0;
        int i2 = this.f3044c;
        int i3 = this.f3043b;
        Object obj = this.f3045d;
        switch (this.f3042a) {
            case 0:
                while (i < 6 && (m3313s = AbstractC1372y1.m3313s(i3, (String) obj)) > 0 && m3313s != i2) {
                    AbstractC1372y1.m3285P(m3313s, i3);
                    i++;
                }
            case 1:
                View view = AbstractC1634p.f9302b;
                if (AbstractC1634p.f9303c != null && view.getHeight() > i2) {
                    try {
                        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
                        layoutParams.width = i3;
                        layoutParams.height = i2;
                        AbstractC1634p.f9303c.updateViewLayout(view, layoutParams);
                        View findViewById = view.findViewById(R.id.scroll_msg);
                        View findViewById2 = view.findViewById(R.id.butOk);
                        if (findViewById != null && findViewById2 != null) {
                            int height = findViewById2.getHeight();
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                            if (marginLayoutParams != null) {
                                height += marginLayoutParams.topMargin;
                            }
                            int top = ((i2 - findViewById.getTop()) - height) - view.getPaddingBottom();
                            Context context = (Context) obj;
                            int i4 = (int) (context.getResources().getDisplayMetrics().density * 96.0f);
                            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.update_dialog_whatsnew_max_height);
                            if (top > dimensionPixelSize) {
                                top = dimensionPixelSize;
                            }
                            if (top >= i4) {
                                i4 = top;
                            }
                            ViewGroup.LayoutParams layoutParams2 = findViewById.getLayoutParams();
                            layoutParams2.height = i4;
                            findViewById.setLayoutParams(layoutParams2);
                            break;
                        }
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            default:
                int i5 = UserThemeSlotsActivity.f3316L;
                UserThemeSlotsActivity userThemeSlotsActivity = (UserThemeSlotsActivity) obj;
                if (!userThemeSlotsActivity.isFinishing() && i3 == userThemeSlotsActivity.f3322J) {
                    C1563o1 c1563o1 = (C1563o1) C1563o1.m4305f(userThemeSlotsActivity, i2).f141g;
                    if (c1563o1 == null) {
                        createBitmap = null;
                    } else {
                        FrameLayout frameLayout = new FrameLayout(userThemeSlotsActivity);
                        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(1920, 720));
                        frameLayout.setBackgroundColor(-16777216);
                        if (c1563o1.f8500g) {
                            ImageView imageView = new ImageView(userThemeSlotsActivity);
                            imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                            frameLayout.addView(imageView, new FrameLayout.LayoutParams(-1, -1));
                            if ("fill".equals(c1563o1.f8502i)) {
                                imageView.setImageDrawable(new ColorDrawable(AbstractC1687o.m4918M(-16777216, c1563o1.f8503j)));
                            } else if ("gradient".equals(c1563o1.f8502i)) {
                                imageView.setImageDrawable(new GradientDrawable("lr".equals(c1563o1.f8505l) ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.TOP_BOTTOM, new int[]{AbstractC1687o.m4918M(-16777216, c1563o1.f8503j), AbstractC1687o.m4918M(-16777216, c1563o1.f8504k)}));
                            } else {
                                Bitmap m4458j3 = AbstractC1569q1.m4458j(c1563o1.f8501h);
                                if (m4458j3 != null) {
                                    m4458j3.setDensity(0);
                                    imageView.setImageBitmap(m4458j3);
                                }
                            }
                        }
                        AbstractC1687o.m4931a(userThemeSlotsActivity, frameLayout, c1563o1, c1563o1.f8506m, true);
                        AbstractC1687o.m4931a(userThemeSlotsActivity, frameLayout, c1563o1, c1563o1.f8507n, false);
                        ArrayList arrayList = c1563o1.f8511r;
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                C1560n1 c1560n12 = (C1560n1) it.next();
                                if (c1560n12 != null && c1560n12.f8455b && ((str = c1560n12.f8453a) == null || !str.endsWith("_unit"))) {
                                    if (c1560n12.f8474k0 && (("fuel".equals(c1560n12.f8453a) || "coolant".equals(c1560n12.f8453a)) && !AbstractC1569q1.m4451c())) {
                                        C1554l1 c1554l1 = "fuel".equals(c1560n12.f8453a) ? c1563o1.f8506m : c1563o1.f8507n;
                                        if (c1554l1.f8375a && (m4458j2 = AbstractC1569q1.m4458j(AbstractC1569q1.m4460l(i2))) != null) {
                                            m4458j2.setDensity(i);
                                            int m4289a = c1554l1.m4289a();
                                            ImageView imageView2 = new ImageView(frameLayout.getContext());
                                            imageView2.setScaleType(ImageView.ScaleType.FIT_XY);
                                            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m4289a, m4289a);
                                            layoutParams3.leftMargin = c1554l1.m4290b();
                                            layoutParams3.topMargin = c1554l1.m4291c();
                                            frameLayout.addView(imageView2, layoutParams3);
                                            imageView2.setImageBitmap(m4458j2);
                                            float f2 = m4289a * 0.5f;
                                            imageView2.setPivotX(f2);
                                            imageView2.setPivotY(f2);
                                            imageView2.setRotation((c1560n12.f8476l0 + c1560n12.f8478m0) * 0.5f);
                                        }
                                    }
                                    if (c1560n12.f8457c) {
                                        String str3 = c1560n12.f8453a;
                                        if (str3 == null || !str3.startsWith("image_")) {
                                            String str4 = c1560n12.f8453a;
                                            if ("wifi".equals(str4) || "inet".equals(str4) || "cruise_ico".equals(str4) || "la".equals(str4)) {
                                                String str5 = c1560n12.f8453a;
                                                int i6 = "wifi".equals(str5) ? R.drawable.icon_wifi : "inet".equals(str5) ? R.drawable.icon_inet : "cruise_ico".equals(str5) ? R.drawable.icon_cruise : "la".equals(str5) ? R.drawable.icon_lane : 0;
                                                if (i6 != 0) {
                                                    int i7 = c1560n12.f8488w;
                                                    if (i7 <= 0) {
                                                        String str6 = c1560n12.f8453a;
                                                        i7 = "wifi".equals(str6) ? 32 : "inet".equals(str6) ? 30 : "cruise_ico".equals(str6) ? 70 : "la".equals(str6) ? 60 : 40;
                                                    }
                                                    ImageView imageView3 = new ImageView(userThemeSlotsActivity);
                                                    imageView3.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                                    imageView3.setColorFilter(-1);
                                                    imageView3.setImageResource(i6);
                                                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(i7, i7);
                                                    layoutParams4.leftMargin = c1560n12.f8459d;
                                                    layoutParams4.topMargin = c1560n12.f8461e;
                                                    frameLayout.addView(imageView3, layoutParams4);
                                                }
                                                i = 0;
                                            } else {
                                                if (c1560n12.m4296c()) {
                                                    int max = Math.max(1, c1560n12.f8440N);
                                                    int max2 = Math.max(1, c1560n12.f8441O);
                                                    C1548j1 c1548j1 = new C1548j1(frameLayout.getContext());
                                                    c1548j1.m4286a("bar_v".equals(c1560n12.f8437K), c1560n12.f8449W, c1560n12.f8450X, AbstractC1687o.m4918M(1716503543, c1560n12.f8443Q), AbstractC1687o.m4918M(-11549705, c1560n12.f8442P), AbstractC1687o.m4918M(-1, c1560n12.f8444R), c1560n12.f8445S, c1560n12.f8446T);
                                                    if ("bar_arc".equals(c1560n12.f8437K)) {
                                                        c1548j1.m4288d(c1560n12.f8451Y, c1560n12.f8452Z, c1560n12.f8454a0, c1560n12.f8456b0);
                                                    }
                                                    c1548j1.setInvert(c1560n12.f8458c0);
                                                    c1548j1.setFraction(0.55f);
                                                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(max, max2);
                                                    layoutParams5.leftMargin = c1560n12.f8459d;
                                                    layoutParams5.topMargin = c1560n12.f8461e;
                                                    frameLayout.addView(c1548j1, layoutParams5);
                                                }
                                                if (!c1560n12.m4296c() || c1560n12.f8460d0) {
                                                    if (c1560n12.m4296c()) {
                                                        c1560n1 = new C1560n1();
                                                        c1560n1.f8453a = c1560n12.f8453a;
                                                        c1560n1.f8459d = (Math.max(1, c1560n12.f8440N) / 2) + c1560n12.f8459d + c1560n12.f8462e0;
                                                        c1560n1.f8461e = (Math.max(1, c1560n12.f8441O) / 2) + c1560n12.f8461e + c1560n12.f8464f0;
                                                        String str7 = c1560n12.f8436J;
                                                        if (str7 == null) {
                                                            str7 = "";
                                                        }
                                                        c1560n1.f8436J = str7;
                                                        c1560n1.f8463f = C1563o1.m4304e(c1560n12) ? C1563o1.m4303d("center", c1560n12.f8436J) : "center";
                                                        c1560n1.f8486u = c1560n12.f8486u;
                                                        c1560n1.f8487v = c1560n12.f8487v;
                                                        c1560n1.f8467h = c1560n12.f8467h;
                                                        c1560n1.f8469i = c1560n12.f8469i;
                                                        c1560n1.f8471j = c1560n12.f8471j;
                                                        c1560n1.f8473k = c1560n12.f8473k;
                                                        c1560n1.f8475l = c1560n12.f8475l;
                                                        c1560n1.f8477m = c1560n12.f8477m;
                                                        c1560n1.f8479n = c1560n12.f8479n;
                                                        c1560n1.f8489x = c1560n12.f8489x;
                                                        c1560n1.f8427A = c1560n12.f8427A;
                                                        c1560n1.f8428B = c1560n12.f8428B;
                                                        c1560n1.f8429C = c1560n12.f8429C;
                                                        c1560n1.f8430D = c1560n12.f8430D;
                                                        c1560n1.f8431E = c1560n12.f8431E;
                                                        c1560n1.f8432F = c1560n12.f8432F;
                                                        c1560n1.f8433G = c1560n12.f8433G;
                                                        c1560n1.f8434H = c1560n12.f8434H;
                                                        c1560n1.f8435I = c1560n12.f8435I;
                                                    } else {
                                                        c1560n1 = c1560n12;
                                                    }
                                                    C1527c1 m4932b = AbstractC1687o.m4932b(userThemeSlotsActivity, frameLayout, c1560n1, false);
                                                    if (c1560n12.f8427A && (str2 = c1560n12.f8489x) != null && !str2.isEmpty()) {
                                                        C1527c1 m4932b2 = AbstractC1687o.m4932b(userThemeSlotsActivity, frameLayout, c1560n1, true);
                                                        C1527c1.m4165h(m4932b2, c1560n1.f8475l, c1560n1.f8477m);
                                                        AbstractC1539g1.m4200V(m4932b2, m4932b, c1560n1);
                                                    }
                                                }
                                                i = 0;
                                            }
                                        } else {
                                            String str8 = c1560n12.f8470i0;
                                            if (str8 != null && !str8.isEmpty() && (m4458j = AbstractC1569q1.m4458j(c1560n12.f8470i0)) != null) {
                                                m4458j.setDensity(i);
                                                float f3 = c1560n12.f8472j0;
                                                if (f3 <= 0.01f) {
                                                    f3 = 1.0f;
                                                }
                                                int m152f = AbstractC0062j.m152f(m4458j.getWidth(), f3, 1);
                                                int m152f2 = AbstractC0062j.m152f(m4458j.getHeight(), f3, 1);
                                                ImageView imageView4 = new ImageView(frameLayout.getContext());
                                                imageView4.setScaleType(ImageView.ScaleType.FIT_XY);
                                                imageView4.setImageBitmap(m4458j);
                                                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(m152f, m152f2);
                                                layoutParams6.leftMargin = c1560n12.f8459d;
                                                layoutParams6.topMargin = c1560n12.f8461e;
                                                frameLayout.addView(imageView4, layoutParams6);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        frameLayout.measure(View.MeasureSpec.makeMeasureSpec(1920, 1073741824), View.MeasureSpec.makeMeasureSpec(720, 1073741824));
                        frameLayout.layout(0, 0, 1920, 720);
                        createBitmap = Bitmap.createBitmap(1920, 720, Bitmap.Config.ARGB_8888);
                        frameLayout.draw(new Canvas(createBitmap));
                    }
                    if (!userThemeSlotsActivity.isFinishing() && i3 == userThemeSlotsActivity.f3322J) {
                        if (createBitmap != null) {
                            userThemeSlotsActivity.m2007t();
                            userThemeSlotsActivity.f3323K = createBitmap;
                            userThemeSlotsActivity.m2008u(createBitmap, 0);
                            userThemeSlotsActivity.f3319G.setVisibility(4);
                            userThemeSlotsActivity.f3318F.setVisibility(0);
                            break;
                        } else {
                            userThemeSlotsActivity.m2007t();
                            userThemeSlotsActivity.f3318F.setVisibility(4);
                            userThemeSlotsActivity.f3319G.setText(R.string.ut_preview_fail);
                            userThemeSlotsActivity.f3319G.setVisibility(0);
                            break;
                        }
                    } else if (createBitmap != null) {
                        createBitmap.recycle();
                        break;
                    }
                }
                break;
        }
    }
}
