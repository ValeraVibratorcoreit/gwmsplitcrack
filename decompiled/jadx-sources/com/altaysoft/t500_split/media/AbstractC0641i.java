package com.altaysoft.t500_split.media;

import android.content.Context;
import android.graphics.PorterDuff;
import android.os.Handler;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import p047X0.C0429b;
import p054a1.ViewOnClickListenerC0492a;

/* renamed from: com.altaysoft.t500_split.media.i */
/* loaded from: classes.dex */
public abstract class AbstractC0641i {

    /* renamed from: c */
    public static Boolean f3016c;

    /* renamed from: d */
    public static boolean f3017d;

    /* renamed from: e */
    public static int f3018e;

    /* renamed from: a */
    public static final ArrayList f3014a = new ArrayList();

    /* renamed from: b */
    public static String f3015b = "";

    /* renamed from: f */
    public static C0636d f3019f = C0636d.f2994j;

    /* renamed from: a */
    public static ImageView m1884a(Context context, int i) {
        ImageView imageView = new ImageView(context);
        imageView.setId(R.id.ym_media_heart);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(i, i));
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        int max = Math.max(m1885b(context, 4), i / 6);
        imageView.setPadding(max, max, max, max);
        imageView.setBackgroundResource(R.drawable.ym_heart_scrim);
        imageView.setImageResource(R.drawable.ym_heart_off);
        imageView.setContentDescription(context.getString(R.string.ym_heart));
        imageView.setVisibility(4);
        imageView.setClickable(true);
        imageView.setFocusable(true);
        imageView.setElevation(m1885b(context, 4));
        return imageView;
    }

    /* renamed from: b */
    public static int m1885b(Context context, int i) {
        return Math.round(TypedValue.applyDimension(1, i, context.getResources().getDisplayMetrics()));
    }

    /* renamed from: c */
    public static ImageView m1886c(View view) {
        int i;
        ImageView m1887d;
        if (view == null) {
            return null;
        }
        ImageView m1887d2 = m1887d(view);
        if (m1887d2 != null) {
            m1893j(m1887d2);
            return m1887d2;
        }
        View findViewById = view.findViewById(R.id.overlay_media_art);
        View m1888e = findViewById instanceof ImageView ? (ImageView) findViewById : m1888e(view);
        if (m1888e == null) {
            if (!(view instanceof ViewGroup)) {
                return null;
            }
            ImageView m1884a = m1884a(view.getContext(), m1885b(view.getContext(), 22));
            ViewGroup viewGroup = (ViewGroup) view;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m1884a.getLayoutParams().width, m1884a.getLayoutParams().height);
            layoutParams.gravity = 8388693;
            layoutParams.bottomMargin = m1885b(view.getContext(), 2);
            layoutParams.setMarginEnd(m1885b(view.getContext(), 2));
            if (viewGroup instanceof FrameLayout) {
                viewGroup.addView(m1884a, layoutParams);
            } else {
                viewGroup.addView(m1884a, 0);
            }
            m1893j(m1884a);
            return m1884a;
        }
        ViewGroup viewGroup2 = (ViewGroup) m1888e.getParent();
        if (viewGroup2 == null) {
            return null;
        }
        if ((viewGroup2 instanceof FrameLayout) && (m1887d = m1887d(viewGroup2)) != null) {
            m1893j(m1887d);
            return m1887d;
        }
        Context context = m1888e.getContext();
        ViewGroup.LayoutParams layoutParams2 = m1888e.getLayoutParams();
        int indexOfChild = viewGroup2.indexOfChild(m1888e);
        viewGroup2.removeView(m1888e);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        frameLayout.setLayoutParams(layoutParams2);
        m1888e.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        frameLayout.addView(m1888e);
        int max = Math.max(m1885b(context, 20), (layoutParams2 == null || (i = layoutParams2.width) <= 0) ? m1885b(context, 22) : i / 4);
        ImageView m1884a2 = m1884a(context, max);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(max, max);
        layoutParams3.gravity = 8388693;
        layoutParams3.bottomMargin = m1885b(context, 2);
        layoutParams3.setMarginEnd(m1885b(context, 2));
        frameLayout.addView(m1884a2, layoutParams3);
        viewGroup2.addView(frameLayout, indexOfChild);
        m1893j(m1884a2);
        return m1884a2;
    }

    /* renamed from: d */
    public static ImageView m1887d(View view) {
        if (view == null) {
            return null;
        }
        View findViewById = view.findViewById(R.id.ym_media_heart);
        if (findViewById instanceof ImageView) {
            return (ImageView) findViewById;
        }
        View findViewById2 = view.findViewById(R.id.music_info_ym_heart);
        if (findViewById2 instanceof ImageView) {
            return (ImageView) findViewById2;
        }
        return null;
    }

    /* renamed from: e */
    public static ImageView m1888e(View view) {
        if ((view instanceof ImageView) && view.getId() != R.id.ym_media_heart && view.getId() != R.id.music_info_ym_heart) {
            try {
                String resourceEntryName = view.getResources().getResourceEntryName(view.getId());
                if (resourceEntryName != null && resourceEntryName.endsWith("media_art")) {
                    return (ImageView) view;
                }
            } catch (Exception unused) {
            }
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            ImageView m1888e = m1888e(viewGroup.getChildAt(i));
            if (m1888e != null) {
                return m1888e;
            }
        }
        return null;
    }

    /* renamed from: f */
    public static void m1889f(ImageView imageView, Boolean bool) {
        boolean z2 = bool != null && bool.booleanValue();
        imageView.setImageResource(z2 ? R.drawable.ym_heart_on : R.drawable.ym_heart_off);
        imageView.setColorFilter(z2 ? -1518168 : -657665, PorterDuff.Mode.SRC_IN);
        imageView.setSelected(z2);
    }

    /* renamed from: g */
    public static void m1890g() {
        m1891h();
        Iterator it = f3014a.iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            if (imageView.getVisibility() == 0) {
                m1889f(imageView, f3016c);
            }
        }
    }

    /* renamed from: h */
    public static void m1891h() {
        Iterator it = f3014a.iterator();
        while (it.hasNext()) {
            ImageView imageView = (ImageView) it.next();
            if (imageView == null || imageView.getParent() == null) {
                it.remove();
            }
        }
    }

    /* renamed from: i */
    public static void m1892i(View view, C0636d c0636d) {
        ImageView m1887d = m1887d(view);
        if (m1887d == null && (view instanceof ViewGroup)) {
            m1887d = m1886c(view);
        }
        if (m1887d != null) {
            m1894k(m1887d, c0636d, c0636d == null || !c0636d.m1851a() || CallState.isCall(c0636d));
        }
    }

    /* renamed from: j */
    public static void m1893j(ImageView imageView) {
        m1891h();
        ArrayList arrayList = f3014a;
        if (!arrayList.contains(imageView)) {
            arrayList.add(imageView);
        }
        imageView.setOnClickListener(new ViewOnClickListenerC0492a(3, imageView));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005f  */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m1894k(ImageView imageView, C0636d c0636d, boolean z2) {
        boolean z3;
        String str;
        if (imageView == null) {
            return;
        }
        m1893j(imageView);
        Context applicationContext = imageView.getContext().getApplicationContext();
        boolean z4 = c0636d != null && ((str = c0636d.f2995a) == null || str.isEmpty() || AbstractC0648p.m1910c(str));
        if (!z2 && z4 && c0636d != null && c0636d.m1851a()) {
            Handler handler = AbstractC0650r.f3067a;
            String string = applicationContext.getApplicationContext().getSharedPreferences("ym_oauth", 0).getString("token", "");
            if (string != null && !string.isEmpty()) {
                z3 = true;
                imageView.setVisibility(z3 ? 0 : 4);
                if (z3) {
                    m1889f(imageView, f3016c);
                    return;
                }
                StringBuilder sb = new StringBuilder();
                String str2 = c0636d.f2996b;
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
                sb.append("\n");
                String str3 = c0636d.f2997c;
                sb.append(str3 != null ? str3 : "");
                String sb2 = sb.toString();
                if (sb2.equals(f3015b)) {
                    m1889f(imageView, f3016c);
                    return;
                }
                f3015b = sb2;
                f3019f = c0636d;
                f3016c = null;
                m1890g();
                int i = f3018e + 1;
                f3018e = i;
                C0429b c0429b = new C0429b(i, sb2);
                Pattern pattern = AbstractC0645m.f3037a;
                AbstractC0645m.f3040d.execute(new RunnableC0642j(applicationContext.getApplicationContext(), c0636d.f2996b, c0636d.f2997c, c0636d.f2998d, c0636d.f3003i, c0429b, 0));
                return;
            }
        }
        z3 = false;
        imageView.setVisibility(z3 ? 0 : 4);
        if (z3) {
        }
    }
}
