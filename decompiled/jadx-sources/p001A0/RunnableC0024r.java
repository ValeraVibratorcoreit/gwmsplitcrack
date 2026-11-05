package p001A0;

import android.content.Context;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Trace;
import android.view.View;
import android.widget.ScrollView;
import androidx.lifecycle.C0521D;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.C0560y;
import androidx.lifecycle.EnumC0547l;
import com.altaysoft.t500_split.ActivityC0632IP;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.InternetMonitoringService;
import com.altaysoft.t500_split.MarqueeTextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0650r;
import com.altaysoft.t500_split.media.CallState;
import com.altaysoft.t500_split.media.MediaInfoService;
import com.altaysoft.t500_split.network.ApiResponse;
import com.altaysoft.t500_split.p061ip.HolePunchLayout;
import com.altaysoft.t500_split.radio.RadioState;
import com.altaysoft.t500_split.splitinfo.WeatherFullscreenActivity;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.timepicker.AbstractC0689e;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.nio.MappedByteBuffer;
import java.util.ArrayList;
import p006C.AbstractC0064l;
import p014G.AbstractC0107h;
import p016H.C0112d;
import p016H.C0118j;
import p017H0.C0129h;
import p036S.C0305e;
import p038T.C0323q;
import p038T.C0326t;
import p045W0.C0355e;
import p046X.AbstractComponentCallbacksC0423v;
import p051Z0.C0454l;
import p052a.DialogC0473m;
import p052a.ViewTreeObserverOnDrawListenerC0469i;
import p054a1.C0496e;
import p054a1.C0502k;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1294Y;
import p098q0.C1287U0;
import p098q0.C1288V;
import p098q0.C1310e;
import p098q0.C1344p0;
import p098q0.RunnableC1338n0;
import p103s0.C1416d;
import p107t1.AbstractC1461d;
import p109u0.C1518Z0;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: A0.r */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0024r implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f84a;

    /* renamed from: b */
    public final /* synthetic */ Object f85b;

    public /* synthetic */ RunnableC0024r(int i, Object obj) {
        this.f84a = i;
        this.f85b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view;
        ScrollView scrollView;
        int i = 1;
        switch (this.f84a) {
            case 0:
                VoiceSettingsActivity voiceSettingsActivity = (VoiceSettingsActivity) this.f85b;
                Handler handler = voiceSettingsActivity.f3330J;
                ArrayList arrayList = new ArrayList();
                try {
                    arrayList.addAll(AbstractC1680h.m4872m(voiceSettingsActivity));
                    handler.post(new RunnableC0018l(voiceSettingsActivity, i, arrayList));
                    return;
                } catch (Throwable th) {
                    handler.post(new RunnableC0030x(voiceSettingsActivity, th.getMessage() != null ? th.getMessage() : String.valueOf(th), i));
                    return;
                }
            case 1:
                ((CarouselLayoutManager) this.f85b).m2241n0();
                return;
            case 2:
                C0323q c0323q = (C0323q) this.f85b;
                synchronized (c0323q.f915i) {
                    try {
                        if (c0323q.f919m == null) {
                            return;
                        }
                        try {
                            C0118j m906b = c0323q.m906b();
                            int i2 = m906b.f374e;
                            if (i2 == 2) {
                                synchronized (c0323q.f915i) {
                                }
                            }
                            if (i2 != 0) {
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            }
                            try {
                                int i3 = AbstractC0107h.f342a;
                                Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                C0355e c0355e = c0323q.f914h;
                                Context context = c0323q.f912f;
                                c0355e.getClass();
                                Typeface mo184v = AbstractC0064l.f210a.mo184v(context, new C0118j[]{m906b}, 0);
                                MappedByteBuffer m4845C = AbstractC1680h.m4845C(c0323q.f912f, m906b.f370a);
                                if (m4845C == null || mo184v == null) {
                                    throw new RuntimeException("Unable to open file.");
                                }
                                try {
                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                    C0326t c0326t = new C0326t(mo184v, AbstractC1680h.m4849K(m4845C));
                                    Trace.endSection();
                                    Trace.endSection();
                                    synchronized (c0323q.f915i) {
                                        try {
                                            AbstractC1687o abstractC1687o = c0323q.f919m;
                                            if (abstractC1687o != null) {
                                                abstractC1687o.mo876I(c0326t);
                                            }
                                        } finally {
                                        }
                                    }
                                    c0323q.m905a();
                                    return;
                                } finally {
                                    int i4 = AbstractC0107h.f342a;
                                    Trace.endSection();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        } catch (Throwable th3) {
                            synchronized (c0323q.f915i) {
                                try {
                                    AbstractC1687o abstractC1687o2 = c0323q.f919m;
                                    if (abstractC1687o2 != null) {
                                        abstractC1687o2.mo875H(th3);
                                    }
                                    c0323q.m905a();
                                    return;
                                } finally {
                                }
                            }
                        }
                    } finally {
                    }
                }
            case 3:
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = (AbstractComponentCallbacksC0423v) this.f85b;
                abstractComponentCallbacksC0423v.f1352T.f1225j.m2468b(abstractComponentCallbacksC0423v.f1360i);
                abstractComponentCallbacksC0423v.f1360i = null;
                return;
            case 4:
                C0129h c0129h = (C0129h) this.f85b;
                c0129h.f398c = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0129h.f400e;
                C0305e c0305e = sideSheetBehavior.f3584i;
                if (c0305e != null && c0305e.m862f()) {
                    c0129h.m385a(c0129h.f397b);
                    return;
                } else {
                    if (sideSheetBehavior.f3583h == 2) {
                        sideSheetBehavior.m2097r(c0129h.f397b);
                        return;
                    }
                    return;
                }
            case 5:
                ViewTreeObserverOnDrawListenerC0469i viewTreeObserverOnDrawListenerC0469i = (ViewTreeObserverOnDrawListenerC0469i) this.f85b;
                AbstractC1461d.m3494e("this$0", viewTreeObserverOnDrawListenerC0469i);
                Runnable runnable = viewTreeObserverOnDrawListenerC0469i.f1487b;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0469i.f1487b = null;
                    return;
                }
                return;
            case 6:
                DialogC0473m.m1190a((DialogC0473m) this.f85b);
                return;
            case 7:
                ((C0496e) this.f85b).m1210t(true);
                return;
            case 8:
                C0502k c0502k = (C0502k) this.f85b;
                boolean isPopupShowing = c0502k.f1574h.isPopupShowing();
                c0502k.m1219t(isPopupShowing);
                c0502k.f1579m = isPopupShowing;
                return;
            case Platform.GNU /* 9 */:
                ((TextInputLayout) this.f85b).f3687i.requestLayout();
                return;
            case Platform.KFREEBSD /* 10 */:
                C0521D c0521d = (C0521D) this.f85b;
                AbstractC1461d.m3494e("this$0", c0521d);
                int i5 = c0521d.f1958g;
                C0555t c0555t = c0521d.f1962k;
                if (i5 == 0) {
                    c0521d.f1959h = true;
                    c0555t.m1380d(EnumC0547l.ON_PAUSE);
                }
                if (c0521d.f1957f == 0 && c0521d.f1959h) {
                    c0555t.m1380d(EnumC0547l.ON_STOP);
                    c0521d.f1960i = true;
                    return;
                }
                return;
            case Platform.NETBSD /* 11 */:
                ((CallState) this.f85b).onTick();
                return;
            case Platform.DRAGONFLYBSD /* 12 */:
                MediaInfoService mediaInfoService = (MediaInfoService) this.f85b;
                if (mediaInfoService.f2976h) {
                    try {
                        mediaInfoService.m1846a();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 13:
                ((RadioState) this.f85b).lambda$refreshGet$1();
                return;
            case 14:
                ((AbstractC0689e) this.f85b).mo2142l();
                return;
            case 15:
                ((C1310e) this.f85b).m3162a();
                return;
            case DLLCallback.DLL_FPTRS /* 16 */:
                int i6 = ClimateTestActivity.f2265I;
                ((C0009c) this.f85b).m20f(1);
                return;
            case 17:
                int i7 = ActivityC0632IP.f2290G;
                ((ActivityC0632IP) this.f85b).m1666v();
                return;
            case 18:
                ((C0112d) this.f85b).m357h();
                return;
            case 19:
                int i8 = InternetMonitoringService.f2296l;
                InternetMonitoringService internetMonitoringService = (InternetMonitoringService) this.f85b;
                internetMonitoringService.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                cfgData cfgdata = internetMonitoringService.f2298g;
                if (cfgdata.f2665n1 > currentTimeMillis || cfgdata.f2670o1 > currentTimeMillis) {
                    cfgdata.f2665n1 = currentTimeMillis;
                    cfgdata.f2670o1 = currentTimeMillis;
                    internetMonitoringService.m1673b();
                }
                try {
                    internetMonitoringService.m1672a();
                } catch (Exception unused2) {
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                carData cardata = internetMonitoringService.f2297f;
                if ((cardata.m1763n() || cardata.m1713A()) && currentTimeMillis2 - cfgdata.f2665n1 >= 180000 && currentTimeMillis2 - cfgdata.f2670o1 >= 10800000) {
                    C1344p0 c1344p0 = C1344p0.f6319i;
                    c1344p0.getClass();
                    c1344p0.f6326g.execute(new RunnableC1338n0(c1344p0, r2));
                    cfgdata.f2665n1 = currentTimeMillis2;
                    internetMonitoringService.m1673b();
                }
                if (cfgdata.f2513E3 == 1 && (System.currentTimeMillis() - cfgdata.f2670o1) / 86400000 > 2) {
                    int i9 = cfgdata.f2540L1;
                    cfgdata.f2610c1 = 1;
                    cfgdata.f2513E3 = 2;
                    cfgdata.m1785a();
                    cfgdata.m1795o(internetMonitoringService);
                    AbstractC1294Y.m3149a(internetMonitoringService);
                    if (i9 > 2) {
                        internetMonitoringService.getSharedPreferences("T500_SPLIT_AS", 0).edit().putInt("presetnum", 1).apply();
                        cfgdata.m1791k(internetMonitoringService, false);
                        cfgdata.m1795o(internetMonitoringService);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                C1288V c1288v = (C1288V) this.f85b;
                c1288v.f6025u = false;
                int i10 = c1288v.f6024t;
                if (i10 == 2) {
                    if (c1288v.m3143t() > 0) {
                        c1288v.f6022r = false;
                        c1288v.f6030z = 0;
                        c1288v.f6002A = "";
                        c1288v.f6003B = "";
                    }
                    r2 = c1288v.m3139j() ? 0 : c1288v.m3141m() ? 1 : -1;
                    c1288v.f6024t = r2 >= 0 ? r2 : 2;
                } else {
                    int i11 = 0;
                    while (true) {
                        if (i11 < 2) {
                            i10 = i10 == 0 ? 1 : 0;
                            if (i10 == 0 ? c1288v.m3139j() : i10 == 1 ? c1288v.m3141m() : i10 == 2 ? c1288v.m3140k() : false) {
                                c1288v.f6024t = i10;
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                c1288v.m3133a();
                return;
            case 21:
                int i12 = MarqueeTextView.f2317p;
                ((MarqueeTextView) this.f85b).m1694c();
                return;
            case 22:
                ((C1287U0) this.f85b).m3111i();
                return;
            case 23:
                ((C0454l) this.f85b).m1163b();
                return;
            case 24:
                YmSettingsActivity ymSettingsActivity = (YmSettingsActivity) this.f85b;
                int i13 = YmSettingsActivity.f2370J;
                ymSettingsActivity.getClass();
                AbstractC0650r.f3069c = false;
                ymSettingsActivity.m1710u(true);
                return;
            case 25:
                C0560y c0560y = ((carData) this.f85b).f2423X;
                Integer num = (Integer) c0560y.m1395d();
                if (num == null || num.intValue() == 0) {
                    return;
                }
                c0560y.m1401j(0);
                return;
            case 26:
                C1416d c1416d = (C1416d) this.f85b;
                if (c1416d.m1134q()) {
                    ApiResponse apiResponse = (ApiResponse) C1344p0.f6319i.f6321b.m1395d();
                    if (apiResponse == null) {
                        c1416d.f6787n0.setText(c1416d.m1130m(R.string.update_error) + "\n" + c1416d.m1130m(R.string.update_no_inet));
                        c1416d.f6790q0.setText("");
                        c1416d.f6795v0 = false;
                        c1416d.m3426P();
                        return;
                    }
                    if (apiResponse.actual) {
                        c1416d.f6787n0.setText(c1416d.m1130m(R.string.no_updates));
                        c1416d.f6790q0.setText("");
                        c1416d.f6795v0 = false;
                        c1416d.m3426P();
                        return;
                    }
                    c1416d.f6787n0.setText(String.format(c1416d.m1130m(R.string.split_new_version), Integer.valueOf(apiResponse.version.f3075a)));
                    c1416d.f6790q0.setText(apiResponse.version.f3076b);
                    c1416d.f6795v0 = true;
                    c1416d.m3426P();
                    DialogInterfaceC0867f dialogInterfaceC0867f = c1416d.f6794u0;
                    if (dialogInterfaceC0867f == null || (view = c1416d.f6793t0) == null || (scrollView = c1416d.f6789p0) == null) {
                        return;
                    }
                    view.post(new RunnableC0005B(dialogInterfaceC0867f, view, scrollView, 5));
                    return;
                }
                return;
            case 27:
                ((HolePunchLayout) this.f85b).invalidate();
                return;
            case 28:
                ((C1518Z0) this.f85b).m4114i();
                return;
            default:
                ((WeatherFullscreenActivity) this.f85b).f3265S.scrollTo(0, 0);
                return;
        }
    }
}
