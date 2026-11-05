package p001A0;

import android.content.Context;
import android.graphics.Typeface;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import com.altaysoft.t500_split.radio.RadioState;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.sun.jna.Platform;
import java.util.ArrayList;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p006C.AbstractC0062j;
import p038T.C0317k;
import p038T.C0323q;
import p038T.C0324r;
import p038T.InterfaceC0314h;
import p046X.C0401b0;
import p046X.C0407f;
import p046X.C0412k;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1256E0;
import p098q0.RunnableC1317g0;
import p107t1.AbstractC1461d;
import p109u0.C1572s;
import p109u0.C1576u;
import p118x0.C1669y;
import p118x0.C1670z;
import p118x0.InterfaceC1666v;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: A0.B */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0005B implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4a;

    /* renamed from: b */
    public final /* synthetic */ Object f5b;

    /* renamed from: c */
    public final /* synthetic */ Object f6c;

    /* renamed from: d */
    public final /* synthetic */ Object f7d;

    public /* synthetic */ RunnableC0005B(Context context, DialogInterfaceC0867f dialogInterfaceC0867f, View view) {
        this.f4a = 7;
        this.f6c = context;
        this.f5b = dialogInterfaceC0867f;
        this.f7d = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Display display;
        FrameLayout frameLayout;
        Window window;
        switch (this.f4a) {
            case 0:
                C0006C c0006c = (C0006C) this.f5b;
                FrameLayout frameLayout2 = c0006c.f11c;
                Context context = (Context) this.f6c;
                if (frameLayout2 == null || c0006c.f13e == null) {
                    Context applicationContext = context.getApplicationContext();
                    try {
                        DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                        if (displayManager != null && (display = displayManager.getDisplay(2)) != null) {
                            applicationContext = context.createDisplayContext(display);
                        }
                    } catch (Exception unused) {
                    }
                    c0006c.f13e = (WindowManager) applicationContext.getSystemService("window");
                    FrameLayout frameLayout3 = new FrameLayout(applicationContext);
                    int m9b = C0006C.m9b(applicationContext, 32);
                    int m9b2 = C0006C.m9b(applicationContext, 22);
                    frameLayout3.setPadding(m9b, m9b2, m9b, m9b2);
                    TextView textView = new TextView(applicationContext);
                    c0006c.f12d = textView;
                    textView.setTextSize(2, 26.0f);
                    c0006c.f12d.setTypeface(Typeface.create("sans-serif-medium", 0));
                    c0006c.f12d.setGravity(17);
                    c0006c.f12d.setMinWidth(C0006C.m9b(applicationContext, 420));
                    c0006c.f12d.setMaxWidth(C0006C.m9b(applicationContext, 900));
                    frameLayout3.addView(c0006c.f12d, new FrameLayout.LayoutParams(-2, -2, 17));
                    c0006c.f11c = frameLayout3;
                    c0006c.m11a(applicationContext);
                }
                c0006c.m11a(context);
                TextView textView2 = c0006c.f12d;
                if (textView2 != null) {
                    textView2.setText((String) this.f7d);
                }
                if (c0006c.f14f) {
                    c0006c.f15g = false;
                    FrameLayout frameLayout4 = c0006c.f11c;
                    if (frameLayout4 != null) {
                        frameLayout4.animate().cancel();
                        c0006c.f11c.setAlpha(1.0f);
                        c0006c.f11c.setScaleX(1.0f);
                        c0006c.f11c.setScaleY(1.0f);
                        c0006c.f11c.setTranslationY(0.0f);
                        return;
                    }
                    return;
                }
                try {
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2038, 296, -3);
                    layoutParams.gravity = 17;
                    layoutParams.x = 0;
                    layoutParams.y = 0;
                    if (c0006c.f13e == null || (frameLayout = c0006c.f11c) == null) {
                        return;
                    }
                    AbstractC1256E0.m2994I(frameLayout);
                    c0006c.f13e.addView(c0006c.f11c, layoutParams);
                    c0006c.f14f = true;
                    c0006c.f15g = false;
                    AbstractC1256E0.m3009b(c0006c.f11c);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 1:
                C0639g c0639g = (C0639g) this.f5b;
                AbstractC1687o abstractC1687o = (AbstractC1687o) this.f6c;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f7d;
                c0639g.getClass();
                try {
                    C0324r m4870k = AbstractC1680h.m4870k((Context) c0639g.f3011g);
                    if (m4870k == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    C0323q c0323q = (C0323q) ((InterfaceC0314h) m4870k.f886b);
                    synchronized (c0323q.f915i) {
                        c0323q.f917k = threadPoolExecutor;
                    }
                    ((InterfaceC0314h) m4870k.f886b).mo894q(new C0317k(abstractC1687o, threadPoolExecutor));
                    return;
                } catch (Throwable th) {
                    abstractC1687o.mo875H(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 2:
                ArrayList arrayList = (ArrayList) this.f5b;
                C0401b0 c0401b0 = (C0401b0) this.f6c;
                AbstractC1461d.m3494e("this$0", (C0412k) this.f7d);
                if (arrayList.contains(c0401b0)) {
                    arrayList.remove(c0401b0);
                    View view = c0401b0.f1265c.f1342J;
                    int i = c0401b0.f1263a;
                    AbstractC1461d.m3493d("view", view);
                    AbstractC0062j.m147a(view, i);
                    return;
                }
                return;
            case 3:
                C0412k c0412k = (C0412k) this.f5b;
                AbstractC1461d.m3494e("this$0", c0412k);
                C0407f c0407f = (C0407f) this.f7d;
                AbstractC1461d.m3494e("$animationInfo", c0407f);
                c0412k.f1294a.endViewTransition((View) this.f6c);
                c0407f.m1085d();
                return;
            case 4:
                ((RadioState) this.f5b).lambda$refreshGet$0((String[]) this.f6c, (String[]) this.f7d);
                return;
            case 5:
                DialogInterfaceC0867f dialogInterfaceC0867f = (DialogInterfaceC0867f) this.f5b;
                if (dialogInterfaceC0867f.isShowing() && (window = dialogInterfaceC0867f.getWindow()) != null) {
                    View view2 = (View) this.f6c;
                    int round = Math.round(view2.getResources().getDisplayMetrics().heightPixels * 0.82f);
                    if (view2.getHeight() > round) {
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        int i2 = attributes != null ? attributes.width : -2;
                        window.setLayout(i2 != 0 ? i2 : -2, round);
                        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                        if (layoutParams2 != null) {
                            layoutParams2.height = -1;
                            view2.setLayoutParams(layoutParams2);
                        }
                        View view3 = (View) this.f7d;
                        ViewGroup.LayoutParams layoutParams3 = view3.getLayoutParams();
                        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
                            LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                            layoutParams4.width = -1;
                            layoutParams4.height = 0;
                            layoutParams4.weight = 1.0f;
                            view3.setLayoutParams(layoutParams4);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 6:
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                ((MainActivity) this.f5b).m1681D((RunnableC1317g0) this.f6c, (Handler) this.f7d);
                return;
            case 7:
                DialogInterfaceC0867f dialogInterfaceC0867f2 = (DialogInterfaceC0867f) this.f5b;
                if (dialogInterfaceC0867f2.getWindow() == null) {
                    return;
                }
                Context context2 = (Context) this.f6c;
                int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.update_dialog_max_height);
                int width = dialogInterfaceC0867f2.getWindow().getDecorView().getWidth();
                if (width <= 0) {
                    width = (int) (context2.getResources().getDisplayMetrics().widthPixels * 0.72f);
                }
                View view4 = (View) this.f7d;
                if (view4.getHeight() <= dimensionPixelSize) {
                    return;
                }
                dialogInterfaceC0867f2.getWindow().setLayout(width, dimensionPixelSize);
                View findViewById = view4.findViewById(R.id.scroll_msg);
                View findViewById2 = view4.findViewById(R.id.butOk);
                if (findViewById == null || findViewById2 == null) {
                    return;
                }
                int height = findViewById2.getHeight();
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewById2.getLayoutParams();
                if (marginLayoutParams != null) {
                    height += marginLayoutParams.topMargin;
                }
                int top = ((dimensionPixelSize - findViewById.getTop()) - height) - view4.getPaddingBottom();
                int i3 = (int) (context2.getResources().getDisplayMetrics().density * 96.0f);
                if (top < i3) {
                    top = i3;
                }
                ViewGroup.LayoutParams layoutParams5 = findViewById.getLayoutParams();
                layoutParams5.height = top;
                findViewById.setLayoutParams(layoutParams5);
                dialogInterfaceC0867f2.getWindow();
                return;
            case 8:
                C1576u c1576u = (C1576u) this.f5b;
                c1576u.getClass();
                ImageView imageView = (ImageView) this.f6c;
                if (imageView.getWidth() <= 0) {
                    return;
                }
                imageView.setPivotY(AbstractC0062j.m153g(imageView.getWidth(), 0.5f, imageView) * 0.5f);
                ((C1572s) this.f7d).m4470a(imageView);
                c1576u.m4579q1(imageView);
                return;
            case Platform.GNU /* 9 */:
                int i4 = RemindersActivity.f3106I;
                boolean isChecked = ((RadioButton) this.f5b).isChecked();
                ((View) this.f6c).setVisibility(isChecked ? 8 : 0);
                ((View) this.f7d).setVisibility(isChecked ? 0 : 8);
                return;
            default:
                C1670z c1670z = (C1670z) this.f5b;
                c1670z.f9533h = true;
                c1670z.f9528c.removeCallbacks(c1670z.f9537l);
                c1670z.m4834l();
                ((InterfaceC1666v) this.f6c).mo783a((C1669y) this.f7d);
                return;
        }
    }

    public /* synthetic */ RunnableC0005B(Object obj, Object obj2, Object obj3, int i) {
        this.f4a = i;
        this.f5b = obj;
        this.f6c = obj2;
        this.f7d = obj3;
    }
}
