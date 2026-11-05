package p098q0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.sun.jna.Function;
import java.io.InputStream;
import java.util.HashMap;
import java.util.regex.Pattern;
import p001A0.RunnableC0019m;
import p001A0.RunnableC0024r;
import p109u0.AbstractC1539g1;

/* renamed from: q0.V */
/* loaded from: classes.dex */
public final class C1288V {

    /* renamed from: D */
    public static C1288V f5996D;

    /* renamed from: E */
    public static FrameLayout f5997E;

    /* renamed from: F */
    public static View f5998F;

    /* renamed from: G */
    public static final HashMap f5999G = new HashMap();

    /* renamed from: H */
    public static final ViewOnLayoutChangeListenerC1284T f6000H = new ViewOnLayoutChangeListenerC1284T(0);

    /* renamed from: I */
    public static ViewTreeObserverOnGlobalLayoutListenerC1286U f6001I;

    /* renamed from: a */
    public final Context f6005a;

    /* renamed from: b */
    public View f6006b;

    /* renamed from: c */
    public View f6007c;

    /* renamed from: d */
    public TextView f6008d;

    /* renamed from: e */
    public ImageView f6009e;

    /* renamed from: f */
    public View f6010f;

    /* renamed from: g */
    public View f6011g;

    /* renamed from: j */
    public ImageView f6014j;

    /* renamed from: k */
    public ImageView f6015k;

    /* renamed from: l */
    public ImageView f6016l;

    /* renamed from: m */
    public ImageView f6017m;

    /* renamed from: n */
    public WindowManager f6018n;

    /* renamed from: o */
    public boolean f6019o;

    /* renamed from: p */
    public boolean f6020p;

    /* renamed from: q */
    public boolean f6021q;

    /* renamed from: r */
    public boolean f6022r;

    /* renamed from: s */
    public int f6023s;

    /* renamed from: u */
    public boolean f6025u;

    /* renamed from: v */
    public int f6026v;

    /* renamed from: w */
    public RunnableC0019m f6027w;

    /* renamed from: z */
    public int f6030z;

    /* renamed from: h */
    public final ImageView[] f6012h = new ImageView[6];

    /* renamed from: i */
    public final ImageView[] f6013i = new ImageView[5];

    /* renamed from: t */
    public int f6024t = 0;

    /* renamed from: x */
    public final Handler f6028x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    public final RunnableC0024r f6029y = new RunnableC0024r(20, this);

    /* renamed from: C */
    public int f6004C = 1;

    /* renamed from: A */
    public String f6002A = "";

    /* renamed from: B */
    public String f6003B = "";

    public C1288V(Context context) {
        this.f6005a = context.getApplicationContext();
    }

    /* renamed from: f */
    public static void m3124f() {
        View view = f5998F;
        if (view != null) {
            view.removeOnLayoutChangeListener(f6000H);
            ViewTreeObserverOnGlobalLayoutListenerC1286U viewTreeObserverOnGlobalLayoutListenerC1286U = f6001I;
            if (viewTreeObserverOnGlobalLayoutListenerC1286U != null) {
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1286U);
                }
            }
        }
        f6001I = null;
    }

    /* renamed from: h */
    public static int[] m3125h(Context context) {
        return cfgData.m1784i().f2620e1 == 42 ? new int[]{1920, 720} : new int[]{Math.round(TypedValue.applyDimension(1, 1440.0f, context.getResources().getDisplayMetrics())), Math.round(TypedValue.applyDimension(1, 540.0f, context.getResources().getDisplayMetrics()))};
    }

    /* renamed from: i */
    public static C1288V m3126i(Context context) {
        if (f5996D == null) {
            f5996D = new C1288V(context);
        }
        return f5996D;
    }

    /* renamed from: l */
    public static boolean m3127l() {
        View view = f5998F;
        if (view == null) {
            return false;
        }
        if (view.getWidth() > 0 && view.getHeight() > 0) {
            return true;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0;
    }

    /* renamed from: n */
    public static void m3128n() {
        C1288V c1288v = f5996D;
        if (c1288v == null || !c1288v.f6020p) {
            return;
        }
        c1288v.m3142o(true);
    }

    /* renamed from: p */
    public static void m3129p(boolean z2) {
        C1288V c1288v = f5996D;
        if (c1288v == null || !c1288v.f6022r) {
            return;
        }
        c1288v.m3148y();
        C1288V c1288v2 = f5996D;
        c1288v2.f6022r = false;
        c1288v2.f6030z = 0;
        c1288v2.f6002A = "";
        c1288v2.f6003B = "";
        if (c1288v2.f6020p) {
            if (c1288v2.m3143t() == 0) {
                f5996D.m3142o(z2);
            } else {
                f5996D.m3133a();
            }
        }
    }

    /* renamed from: q */
    public static Rect m3130q(Context context) {
        int[] m3125h;
        int i;
        int i2;
        int i3;
        Rect m4239u = AbstractC1539g1.m4239u();
        View view = f5998F;
        if (view != null) {
            int width = view.getWidth();
            int height = view.getHeight();
            if (width <= 0 || height <= 0) {
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null || (i2 = layoutParams.width) <= 0 || (i3 = layoutParams.height) <= 0) {
                    Context context2 = view.getContext();
                    if (context2 != null) {
                        m3125h = m3125h(context2);
                    }
                } else {
                    m3125h = new int[]{i2, i3};
                }
            } else {
                m3125h = new int[]{width, height};
            }
            int i4 = 0;
            RectF m4208b0 = AbstractC1539g1.m4208b0(m4239u, m3125h[0], m3125h[1]);
            if (view != null || view.getWidth() <= 0 || view.getHeight() <= 0) {
                i = 0;
            } else {
                i4 = view.getLeft();
                i = view.getTop();
            }
            return new Rect(Math.round(m4208b0.left) + i4, Math.round(m4208b0.top) + i, Math.round(m4208b0.right) + i4, Math.round(m4208b0.bottom) + i);
        }
        FrameLayout frameLayout = f5997E;
        Context context3 = frameLayout != null ? frameLayout.getContext() : context;
        if (context3 != null) {
            context = context3;
        }
        m3125h = m3125h(context);
        int i42 = 0;
        RectF m4208b02 = AbstractC1539g1.m4208b0(m4239u, m3125h[0], m3125h[1]);
        if (view != null) {
        }
        i = 0;
        return new Rect(Math.round(m4208b02.left) + i42, Math.round(m4208b02.top) + i, Math.round(m4208b02.right) + i42, Math.round(m4208b02.bottom) + i);
    }

    /* renamed from: r */
    public static Bitmap m3131r(Context context, String str) {
        if (str != null && !str.isEmpty()) {
            HashMap hashMap = f5999G;
            Bitmap bitmap = (Bitmap) hashMap.get(str);
            if (bitmap != null) {
                return bitmap;
            }
            try {
                InputStream open = context.getAssets().open(str);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(open);
                    if (decodeStream != null) {
                        hashMap.put(str, decodeStream);
                    }
                    if (open != null) {
                        open.close();
                    }
                    return decodeStream;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    /* renamed from: s */
    public static void m3132s() {
        View view;
        C1288V c1288v = f5996D;
        if (c1288v == null || !c1288v.f6020p) {
            return;
        }
        boolean z2 = c1288v.f6019o;
        if (!z2) {
            if (z2 || (view = c1288v.f6006b) == null || c1288v.f6018n == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof WindowManager.LayoutParams) {
                try {
                    c1288v.f6018n.removeView(c1288v.f6006b);
                    c1288v.f6018n.addView(c1288v.f6006b, (WindowManager.LayoutParams) layoutParams);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        if (z2) {
            int i = c1288v.f6030z;
            int i2 = c1288v.f6004C;
            String str = c1288v.f6002A;
            String str2 = c1288v.f6003B;
            boolean z3 = c1288v.f6021q;
            boolean z4 = c1288v.f6022r;
            int i3 = c1288v.f6023s;
            c1288v.m3145v();
            c1288v.f6030z = i;
            c1288v.f6004C = i2;
            c1288v.f6002A = str;
            c1288v.f6003B = str2;
            c1288v.f6021q = z3;
            c1288v.f6022r = z4;
            c1288v.f6023s = i3;
            c1288v.m3147x(c1288v.f6005a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m3133a() {
        if ((m3140k() ? 1 : 0) + m3143t() == 0) {
            m3148y();
            if (this.f6020p) {
                m3142o(true);
                return;
            }
            return;
        }
        if (this.f6020p) {
            int i = this.f6024t;
            if (!(i == 0 ? m3139j() : i == 1 ? m3141m() : i == 2 ? m3140k() : false)) {
                this.f6024t = m3140k() ? 2 : m3139j() ? 0 : m3141m() ? 1 : -1;
            }
            int i2 = this.f6024t;
            Object[] objArr = i2 == 0;
            Object[] objArr2 = i2 == 1;
            Object[] objArr3 = i2 == 2;
            View view = this.f6010f;
            if (view != null) {
                view.setVisibility(objArr != false ? 0 : 8);
            }
            View view2 = this.f6011g;
            if (view2 != null) {
                view2.setVisibility(objArr2 != false ? 0 : 8);
            }
            View view3 = this.f6007c;
            if (view3 != null) {
                view3.setVisibility(objArr3 != false ? 0 : 8);
            }
            if (objArr == true) {
                int i3 = this.f6023s;
                int i4 = i3 & Function.USE_VARARGS;
                int i5 = (65280 & i3) >> 8;
                if ((i3 & 64) != 0 || (i3 & 128) != 0) {
                    i4 |= 16;
                }
                int i6 = 0;
                while (true) {
                    ImageView[] imageViewArr = this.f6012h;
                    if (i6 >= imageViewArr.length) {
                        break;
                    }
                    ImageView imageView = imageViewArr[i6];
                    if (imageView != null) {
                        imageView.setVisibility(((1 << i6) & i4) != 0 ? 0 : 8);
                    }
                    i6++;
                }
                if ((i5 & 32) != 0 || (i5 & 128) != 0) {
                    i5 |= 1;
                }
                if ((i5 & 64) != 0) {
                    i5 |= 2;
                }
                int i7 = 0;
                while (true) {
                    ImageView[] imageViewArr2 = this.f6013i;
                    if (i7 >= imageViewArr2.length) {
                        break;
                    }
                    ImageView imageView2 = imageViewArr2[i7];
                    if (imageView2 != null) {
                        imageView2.setVisibility((i7 >= 2 || ((1 << i7) & i5) == 0) ? 8 : 0);
                    }
                    i7++;
                }
                m3135c(1);
            } else if (objArr2 == true) {
                int i8 = (this.f6023s & 16711680) >> 16;
                m3137e(this.f6014j, "ip_msg/img_notification_important_007_leftfront_warming.png", (i8 & 17) != 0);
                m3137e(this.f6015k, "ip_msg/img_notification_important_007_rightfront_warming.png", (i8 & 34) != 0);
                m3137e(this.f6016l, "ip_msg/img_notification_important_007_leftback_warming.png", (i8 & 68) != 0);
                m3137e(this.f6017m, "ip_msg/img_notification_important_007_rightback_warming.png", (i8 & 136) != 0);
                m3135c(1);
            } else {
                String str = this.f6002A;
                String str2 = this.f6003B;
                boolean z2 = this.f6021q;
                View view4 = this.f6007c;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                TextView textView = this.f6008d;
                if (textView != null) {
                    textView.setText(str);
                    this.f6021q = z2;
                    TextView textView2 = this.f6008d;
                    if (textView2 != null) {
                        textView2.setTextDirection(z2 ? 4 : 3);
                        this.f6008d.setLayoutDirection(z2 ? 1 : 0);
                        this.f6008d.setGravity(17);
                    }
                }
                if (this.f6009e != null) {
                    Bitmap m3131r = m3131r(this.f6005a, str2);
                    if (m3131r != null) {
                        this.f6009e.setImageBitmap(m3131r);
                        this.f6009e.setVisibility(0);
                    } else {
                        this.f6009e.setImageDrawable(null);
                        this.f6009e.setVisibility(8);
                    }
                }
                m3135c(this.f6004C);
            }
            if (this.f6025u) {
                return;
            }
            if (!this.f6020p || ((this.f6024t != 2 || m3143t() <= 0) && m3143t() <= 1)) {
                m3148y();
            } else {
                this.f6025u = true;
                this.f6028x.postDelayed(this.f6029y, 3000L);
            }
        }
    }

    /* renamed from: b */
    public final void m3134b(Context context) {
        if (this.f6006b == null) {
            return;
        }
        FrameLayout frameLayout = f5997E;
        Context context2 = frameLayout != null ? frameLayout.getContext() : context;
        if (context2 != null) {
            context = context2;
        }
        Rect m3130q = m3130q(context);
        if (m3130q.width() <= 0 || m3130q.height() <= 0) {
            return;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m3130q.width(), m3130q.height(), 8388659);
        layoutParams.leftMargin = m3130q.left;
        layoutParams.topMargin = m3130q.top;
        this.f6006b.setLayoutParams(layoutParams);
    }

    /* renamed from: c */
    public final void m3135c(int i) {
        if (i == 0) {
            i = 1;
        }
        this.f6004C = i;
        View view = this.f6006b;
        if (view == null) {
            return;
        }
        Pattern pattern = C1302b0.f6060b;
        view.setBackgroundResource(i == 2 ? R.drawable.ip_msg_notify_overlay_bg_info : i == 3 ? R.drawable.ip_msg_notify_overlay_bg_alarm : R.drawable.ip_msg_notify_overlay_bg_warn);
        TextView textView = this.f6008d;
        if (textView != null) {
            textView.setTextColor(this.f6006b.getContext().getColor(i == 2 ? R.color.ip_msg_kind_info_text : i == 3 ? R.color.ip_msg_kind_alarm_text : R.color.ip_msg_kind_warn_text));
        }
    }

    /* renamed from: d */
    public final void m3136d(View view) {
        this.f6007c = view.findViewById(R.id.ip_msg_notify_text_block);
        this.f6008d = (TextView) view.findViewById(R.id.ip_msg_notify_text);
        this.f6009e = (ImageView) view.findViewById(R.id.ip_msg_notify_icon);
        this.f6010f = view.findViewById(R.id.ip_msg_notify_cabin);
        this.f6011g = view.findViewById(R.id.ip_msg_notify_wheels);
        ImageView imageView = (ImageView) view.findViewById(R.id.ip_msg_notify_d1);
        ImageView[] imageViewArr = this.f6012h;
        imageViewArr[0] = imageView;
        imageViewArr[1] = (ImageView) view.findViewById(R.id.ip_msg_notify_d2);
        imageViewArr[2] = (ImageView) view.findViewById(R.id.ip_msg_notify_d3);
        imageViewArr[3] = (ImageView) view.findViewById(R.id.ip_msg_notify_d4);
        imageViewArr[4] = (ImageView) view.findViewById(R.id.ip_msg_notify_d6);
        imageViewArr[5] = (ImageView) view.findViewById(R.id.ip_msg_notify_d5);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.ip_msg_notify_b1);
        ImageView[] imageViewArr2 = this.f6013i;
        imageViewArr2[0] = imageView2;
        imageViewArr2[1] = (ImageView) view.findViewById(R.id.ip_msg_notify_b2);
        imageViewArr2[2] = (ImageView) view.findViewById(R.id.ip_msg_notify_b3);
        imageViewArr2[3] = (ImageView) view.findViewById(R.id.ip_msg_notify_b4);
        imageViewArr2[4] = (ImageView) view.findViewById(R.id.ip_msg_notify_b5);
        this.f6014j = (ImageView) view.findViewById(R.id.ip_msg_notify_w_fl);
        this.f6015k = (ImageView) view.findViewById(R.id.ip_msg_notify_w_fr);
        this.f6016l = (ImageView) view.findViewById(R.id.ip_msg_notify_w_rl);
        this.f6017m = (ImageView) view.findViewById(R.id.ip_msg_notify_w_rr);
    }

    /* renamed from: e */
    public final void m3137e(ImageView imageView, String str, boolean z2) {
        if (imageView == null) {
            return;
        }
        if (!z2) {
            imageView.setVisibility(8);
            return;
        }
        Bitmap m3131r = m3131r(this.f6005a, str);
        if (m3131r == null) {
            imageView.setVisibility(8);
        } else {
            imageView.setImageBitmap(m3131r);
            imageView.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final void m3138g(Context context) {
        RunnableC0019m runnableC0019m;
        if (this.f6020p) {
            return;
        }
        FrameLayout frameLayout = f5997E;
        if (frameLayout == null || C1253D0.f5590I0) {
            m3147x(context);
            return;
        }
        this.f6026v++;
        if (frameLayout != null && (runnableC0019m = this.f6027w) != null) {
            frameLayout.removeCallbacks(runnableC0019m);
        }
        this.f6027w = null;
        RunnableC0019m runnableC0019m2 = new RunnableC0019m(this, this.f6026v, context, frameLayout, 1);
        if (frameLayout.getWidth() > 0 && frameLayout.getHeight() > 0) {
            runnableC0019m2.run();
        } else {
            this.f6027w = runnableC0019m2;
            frameLayout.post(runnableC0019m2);
        }
    }

    /* renamed from: j */
    public final boolean m3139j() {
        return (this.f6023s == 0 || !cfgData.m1784i().f2497B2 || AbstractC1372y1.m3299e("ip_message") || (this.f6023s & 65535) == 0) ? false : true;
    }

    /* renamed from: k */
    public final boolean m3140k() {
        String str;
        return (!this.f6022r || (str = this.f6002A) == null || str.isEmpty() || !cfgData.m1784i().f2502C2 || AbstractC1372y1.m3299e("ip_message")) ? false : true;
    }

    /* renamed from: m */
    public final boolean m3141m() {
        return (this.f6023s == 0 || !cfgData.m1784i().f2497B2 || AbstractC1372y1.m3299e("ip_message") || (this.f6023s & 16711680) == 0) ? false : true;
    }

    /* renamed from: o */
    public final void m3142o(boolean z2) {
        RunnableC0019m runnableC0019m;
        this.f6026v++;
        FrameLayout frameLayout = f5997E;
        if (frameLayout != null && (runnableC0019m = this.f6027w) != null) {
            frameLayout.removeCallbacks(runnableC0019m);
        }
        this.f6027w = null;
        m3148y();
        this.f6024t = 0;
        if (this.f6020p && z2) {
            if (AbstractC1372y1.f6441k) {
                AbstractC1372y1.f6441k = false;
            } else {
                AbstractC1372y1.f6440j = SystemClock.elapsedRealtime() + 1000;
            }
        }
        View view = this.f6006b;
        if (view != null) {
            view.animate().cancel();
        }
        m3145v();
        this.f6022r = false;
        this.f6023s = 0;
        this.f6030z = 0;
        this.f6004C = 1;
        this.f6002A = "";
        this.f6003B = "";
    }

    /* renamed from: t */
    public final int m3143t() {
        boolean m3139j = m3139j();
        return m3141m() ? (m3139j ? 1 : 0) + 1 : m3139j ? 1 : 0;
    }

    /* renamed from: u */
    public final void m3144u() {
        boolean z2 = this.f6019o;
        Context context = this.f6005a;
        if (z2) {
            if (!z2 || this.f6006b == null || f5997E == null || !m3127l()) {
                return;
            }
            m3134b(context);
            return;
        }
        if (z2 || this.f6006b == null || this.f6018n == null || !m3127l()) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f6006b.getLayoutParams();
        if (layoutParams instanceof WindowManager.LayoutParams) {
            FrameLayout frameLayout = f5997E;
            if (frameLayout != null) {
                context = frameLayout.getContext();
            }
            Rect m3130q = m3130q(context);
            if (m3130q.width() <= 0 || m3130q.height() <= 0) {
                return;
            }
            WindowManager.LayoutParams layoutParams2 = (WindowManager.LayoutParams) layoutParams;
            if (layoutParams2.width == m3130q.width() && layoutParams2.height == m3130q.height() && layoutParams2.x == m3130q.left && layoutParams2.y == m3130q.top) {
                return;
            }
            layoutParams2.width = m3130q.width();
            layoutParams2.height = m3130q.height();
            layoutParams2.x = m3130q.left;
            layoutParams2.y = m3130q.top;
            try {
                this.f6018n.updateViewLayout(this.f6006b, layoutParams2);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: v */
    public final void m3145v() {
        FrameLayout frameLayout;
        View view = this.f6006b;
        if (view != null) {
            try {
                if (!this.f6019o || (frameLayout = f5997E) == null) {
                    WindowManager windowManager = this.f6018n;
                    if (windowManager != null) {
                        windowManager.removeView(view);
                    }
                } else {
                    frameLayout.removeView(view);
                }
            } catch (Exception unused) {
            }
        }
        this.f6006b = null;
        this.f6007c = null;
        this.f6008d = null;
        this.f6009e = null;
        this.f6010f = null;
        this.f6011g = null;
        int i = 0;
        while (true) {
            ImageView[] imageViewArr = this.f6012h;
            if (i >= imageViewArr.length) {
                break;
            }
            imageViewArr[i] = null;
            i++;
        }
        int i2 = 0;
        while (true) {
            ImageView[] imageViewArr2 = this.f6013i;
            if (i2 >= imageViewArr2.length) {
                this.f6014j = null;
                this.f6015k = null;
                this.f6016l = null;
                this.f6017m = null;
                this.f6018n = null;
                this.f6019o = false;
                this.f6020p = false;
                return;
            }
            imageViewArr2[i2] = null;
            i2++;
        }
    }

    /* renamed from: w */
    public final void m3146w(int i) {
        if (AbstractC1372y1.m3299e("ip_message")) {
            m3142o(true);
            return;
        }
        this.f6023s = i;
        if (!cfgData.m1784i().f2497B2) {
            m3133a();
            return;
        }
        if (i == 0 && !this.f6022r) {
            if (this.f6020p) {
                m3142o(true);
            }
        } else {
            if (i != 0 || this.f6022r) {
                m3138g(this.f6005a);
            }
            m3144u();
            m3133a();
        }
    }

    /* renamed from: x */
    public final void m3147x(Context context) {
        Context context2 = this.f6005a;
        try {
            DisplayManager displayManager = (DisplayManager) context2.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(2) : null;
            if (display == null) {
                this.f6018n = (WindowManager) context2.getSystemService("window");
            } else {
                this.f6018n = (WindowManager) context2.createDisplayContext(display).getSystemService("window");
            }
            this.f6019o = false;
            View inflate = LayoutInflater.from(context).inflate(R.layout.ip_msg_notify_overlay, (ViewGroup) null);
            this.f6006b = inflate;
            m3136d(inflate);
            Rect m3130q = m3130q(context);
            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(m3130q.width(), m3130q.height(), 2038, 536, -3);
            layoutParams.gravity = 8388659;
            layoutParams.x = m3130q.left;
            layoutParams.y = m3130q.top;
            this.f6006b.setAlpha(1.0f);
            this.f6018n.addView(this.f6006b, layoutParams);
            this.f6020p = true;
            m3133a();
        } catch (Exception unused) {
            m3145v();
        }
    }

    /* renamed from: y */
    public final void m3148y() {
        this.f6028x.removeCallbacks(this.f6029y);
        this.f6025u = false;
    }
}
