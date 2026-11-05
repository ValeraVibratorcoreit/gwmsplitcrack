package p001A0;

import android.app.ActivityOptions;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.media.RunnableC0646n;
import com.sun.jna.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import p014G.C0105f;
import p014G.C0106g;
import p062d0.AbstractC0732e;
import p062d0.ExecutorC0730c;
import p070g.AbstractC0872k;
import p070g.AbstractC0873l;
import p070g.AbstractC0876o;
import p070g.LayoutInflaterFactory2C0887z;
import p091o.C1197g;
import p098q0.AbstractC1256E0;
import p098q0.ViewOnClickListenerC1278P0;
import p115w0.AbstractC1634p;
import p115w0.C1619a;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;

/* renamed from: A0.e */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0011e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f33a;

    /* renamed from: b */
    public final /* synthetic */ Context f34b;

    public /* synthetic */ RunnableC0011e(Context context, int i) {
        this.f33a = i;
        this.f34b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:94:0x0225, code lost:
    
        if (r2 != null) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0234  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C0105f c0105f;
        Context context;
        int i;
        String format;
        WindowManager windowManager;
        boolean z2 = false;
        int i2 = 2;
        Object obj = null;
        int i3 = 1;
        Context context2 = this.f34b;
        switch (this.f33a) {
            case 0:
                try {
                    Intent intent = new Intent(context2, (Class<?>) CFG4.class);
                    intent.addFlags(402722816);
                    intent.putExtra("caller", "voice");
                    context2.startActivity(intent, ActivityOptions.makeBasic().toBundle());
                    break;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new RunnableC0011e(context2, i2));
                break;
            case 2:
                AbstractC0732e.m2182s(context2, new ExecutorC0730c(), AbstractC0732e.f3846a, false);
                break;
            case 3:
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    ComponentName componentName = new ComponentName(context2, "androidx.appcompat.app.AppLocalesMetadataHolderService");
                    if (context2.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                        if (i4 < 33) {
                            c0105f = AbstractC0876o.f4375h;
                            break;
                        } else {
                            Iterator it = AbstractC0876o.f4379l.iterator();
                            while (true) {
                                C1197g c1197g = (C1197g) it;
                                if (c1197g.hasNext()) {
                                    AbstractC0876o abstractC0876o = (AbstractC0876o) ((WeakReference) c1197g.next()).get();
                                    if (abstractC0876o != null && (context = ((LayoutInflaterFactory2C0887z) abstractC0876o).f4455p) != null) {
                                        obj = context.getSystemService("locale");
                                    }
                                }
                            }
                            if (obj != null) {
                                c0105f = new C0105f(new C0106g(AbstractC0873l.m2413a(obj)));
                                if (c0105f.f340a.f341a.isEmpty()) {
                                    String m4964g = AbstractC1695c.m4964g(context2);
                                    Object systemService = context2.getSystemService("locale");
                                    if (systemService != null) {
                                        AbstractC0873l.m2414b(systemService, AbstractC0872k.m2412a(m4964g));
                                    }
                                }
                                context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                            }
                            c0105f = C0105f.f339b;
                            if (c0105f.f340a.f341a.isEmpty()) {
                            }
                            context2.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
                        }
                    }
                }
                AbstractC0876o.f4378k = true;
                break;
            case 4:
                Context applicationContext = context2.getApplicationContext();
                AtomicBoolean atomicBoolean = MainActivity.f2306M;
                Intent intent2 = new Intent(applicationContext, (Class<?>) MainActivity.class);
                intent2.addFlags(402718720);
                intent2.putExtra("caller", "preset_relayout");
                applicationContext.startActivity(intent2);
                break;
            default:
                Handler handler = AbstractC1634p.f9301a;
                cfgData m1784i = cfgData.m1784i();
                if (m1784i.f2513E3 != 2 && !m1784i.f2645j1) {
                    float m1771r = carData.getInstance().m1771r();
                    ArrayList m4911D = AbstractC1687o.m4911D(context2);
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = m4911D.iterator();
                    while (it2.hasNext()) {
                        C1619a c1619a = (C1619a) it2.next();
                        if (c1619a != null && (AbstractC1680h.m4883y(c1619a, m1771r) || AbstractC1680h.m4884z(c1619a, m1771r))) {
                            arrayList.add(c1619a);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        View view = AbstractC1634p.f9302b;
                        if (view != null && (windowManager = AbstractC1634p.f9303c) != null) {
                            try {
                                windowManager.removeView(view);
                            } catch (Exception unused2) {
                            }
                        }
                        AbstractC1634p.f9302b = null;
                        AbstractC1634p.f9303c = null;
                        try {
                            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context2, R.style.Theme_T500_Split);
                            LayoutInflater from = LayoutInflater.from(contextThemeWrapper);
                            AbstractC1634p.f9303c = (WindowManager) context2.getSystemService("window");
                            View inflate = from.inflate(R.layout.dialog_reminders_alert, (ViewGroup) null);
                            AbstractC1634p.f9302b = inflate;
                            ((TextView) inflate.findViewById(R.id.txt_caption)).setText(R.string.reminders_alert_title);
                            int color = context2.getResources().getColor(R.color.highspeed, contextThemeWrapper.getTheme());
                            int color2 = context2.getResources().getColor(R.color.btn_write_text, contextThemeWrapper.getTheme());
                            LinearLayout linearLayout = (LinearLayout) AbstractC1634p.f9302b.findViewById(R.id.reminders_alert_list);
                            Iterator it3 = arrayList.iterator();
                            while (it3.hasNext()) {
                                C1619a c1619a2 = (C1619a) it3.next();
                                View inflate2 = from.inflate(R.layout.item_reminder_alert, linearLayout, z2);
                                ImageView imageView = (ImageView) inflate2.findViewById(R.id.reminder_alert_icon);
                                TextView textView = (TextView) inflate2.findViewById(R.id.reminder_alert_text);
                                imageView.setImageResource(c1619a2.f9252b.f9260b);
                                int i5 = AbstractC1680h.m4883y(c1619a2, m1771r) ? color : color2;
                                textView.setTextColor(i5);
                                imageView.setColorFilter(i5);
                                if (c1619a2.f9254d == 1) {
                                    i = color2;
                                    format = String.format(Locale.getDefault(), "%s (%d %s)", c1619a2.f9253c, Integer.valueOf((int) (c1619a2.f9256f - AbstractC1680h.m4862X())), context2.getString(R.string.reminder_unit_days));
                                } else {
                                    i = color2;
                                    format = String.format(Locale.getDefault(), "%s (%d %s)", c1619a2.f9253c, Integer.valueOf(c1619a2.f9255e - Math.round(m1771r)), context2.getString(R.string.reminder_unit_km));
                                }
                                textView.setText(format);
                                linearLayout.addView(inflate2);
                                color2 = i;
                                z2 = false;
                            }
                            int i6 = (int) (context2.getResources().getDisplayMetrics().widthPixels * 0.72f);
                            int dimensionPixelSize = context2.getResources().getDimensionPixelSize(R.dimen.update_dialog_max_height);
                            WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(i6, -2, 2038, Function.MAX_NARGS, -3);
                            layoutParams.gravity = 17;
                            AbstractC1256E0.m2994I(AbstractC1634p.f9302b);
                            AbstractC1634p.f9303c.addView(AbstractC1634p.f9302b, layoutParams);
                            AbstractC1256E0.m3009b(AbstractC1634p.f9302b);
                            AbstractC1634p.f9302b.findViewById(R.id.butOk).setOnClickListener(new ViewOnClickListenerC1278P0(9));
                            AbstractC1634p.f9302b.post(new RunnableC0646n(context2, i6, dimensionPixelSize, i3));
                            break;
                        } catch (Exception unused3) {
                            return;
                        }
                    }
                }
                break;
        }
    }
}
