package p001A0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.altaysoft.t500_split.ActivityC0632IP;
import com.altaysoft.t500_split.AppsList;
import com.altaysoft.t500_split.Help;
import com.altaysoft.t500_split.Launcher;
import com.altaysoft.t500_split.LauncherBackGround;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.OssLicensesActivity;
import com.altaysoft.t500_split.Pay;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.media.InterfaceC0649q;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.EnumMap;
import p006C.C0058f;
import p016H.C0112d;
import p022K.C0221v0;
import p022K.InterfaceC0210q;
import p054a1.InterfaceC0490A;
import p070g.DialogInterfaceC0867f;
import p077j0.AbstractC0982m;
import p077j0.InterfaceC0980k;
import p077j0.InterfaceC0981l;
import p098q0.C1347q0;
import p101r0.InterfaceC1394p;

/* renamed from: A0.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0009c implements InterfaceC0012f, InterfaceC0490A, InterfaceC0649q, InterfaceC0981l, InterfaceC0210q, InterfaceC1394p {

    /* renamed from: f */
    public final /* synthetic */ int f29f;

    public /* synthetic */ C0009c(int i) {
        this.f29f = i;
    }

    @Override // p077j0.InterfaceC0981l
    /* renamed from: a */
    public void mo16a(InterfaceC0980k interfaceC0980k, AbstractC0982m abstractC0982m) {
        switch (this.f29f) {
            case 8:
                interfaceC0980k.mo2542c(abstractC0982m);
                break;
            case Platform.GNU /* 9 */:
                interfaceC0980k.mo2517e(abstractC0982m);
                break;
            case Platform.KFREEBSD /* 10 */:
                interfaceC0980k.mo2514a(abstractC0982m);
                break;
            case Platform.NETBSD /* 11 */:
                interfaceC0980k.mo2516d();
                break;
            default:
                interfaceC0980k.mo2518f();
                break;
        }
    }

    @Override // p101r0.InterfaceC1394p
    /* renamed from: b */
    public void mo17b(int i) {
        CFG4.f2728F.f2596Z1 = i;
    }

    @Override // p022K.InterfaceC0210q
    /* renamed from: c */
    public C0221v0 mo18c(View view, C0221v0 c0221v0) {
        switch (this.f29f) {
            case 13:
                int i = AppsList.f2259G;
                C0058f mo654f = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f.f203a, mo654f.f204b, mo654f.f205c, mo654f.f206d);
                break;
            case 22:
                int i2 = Help.f2283K;
                C0058f mo654f2 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f2.f203a, mo654f2.f204b, mo654f2.f205c, mo654f2.f206d);
                break;
            case 23:
                int i3 = ActivityC0632IP.f2290G;
                view.setPadding(0, 0, 0, 0);
                break;
            case 24:
                int i4 = Launcher.f2304E;
                C0058f mo654f3 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f3.f203a, mo654f3.f204b, mo654f3.f205c, mo654f3.f206d);
                break;
            case 25:
                int i5 = LauncherBackGround.f2305E;
                C0058f mo654f4 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f4.f203a, mo654f4.f204b, mo654f4.f205c, mo654f4.f206d);
                break;
            case 26:
                C1347q0[] c1347q0Arr = OssLicensesActivity.f2336E;
                C0058f mo654f5 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f5.f203a, mo654f5.f204b, mo654f5.f205c, mo654f5.f206d);
                break;
            case 27:
                int i6 = Pay.f2337H;
                C0058f mo654f6 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f6.f203a, mo654f6.f204b, mo654f6.f205c, mo654f6.f206d);
                break;
            default:
                cfgData cfgdata = CFG4.f2728F;
                C0058f mo654f7 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f7.f203a, mo654f7.f204b, mo654f7.f205c, mo654f7.f206d);
                break;
        }
        return c0221v0;
    }

    @Override // p001A0.InterfaceC0012f
    /* renamed from: d */
    public void mo15d(Context context) {
        switch (this.f29f) {
            case 0:
                new Handler(Looper.getMainLooper()).post(new RunnableC0011e(context.getApplicationContext(), 0));
                break;
            default:
                EnumMap enumMap = AbstractC0015i.f43a;
                break;
        }
    }

    @Override // com.altaysoft.t500_split.media.InterfaceC0649q
    /* renamed from: e */
    public void mo19e(C0112d c0112d) {
        switch (this.f29f) {
            case 5:
                c0112d.m359j("уже ожидаем подтверждение");
                break;
            case 6:
                YmSettingsActivity ymSettingsActivity = (YmSettingsActivity) c0112d.f354f;
                if (ymSettingsActivity.f2373G == ((DialogInterfaceC0867f) c0112d.f350b)) {
                    ymSettingsActivity.m1709t();
                    ymSettingsActivity.m1710u(true);
                    break;
                }
                break;
            default:
                c0112d.m359j("код истёк");
                break;
        }
    }

    /* renamed from: f */
    public boolean m20f(int i) {
        switch (this.f29f) {
            case 14:
                return NativeLib.nativePropHvacHeatFl(i);
            case 15:
                return NativeLib.nativePropHvacHeatFr(i);
            case DLLCallback.DLL_FPTRS /* 16 */:
                return NativeLib.nativePropHvacHeatRl(i);
            case 17:
                return NativeLib.nativePropHvacHeatRr(i);
            case 18:
                return NativeLib.nativePropHvacVentFl(i);
            case 19:
                return NativeLib.nativePropHvacVentFr(i);
            case 20:
                return NativeLib.nativePropHvacVentRl(i);
            default:
                return NativeLib.nativePropHvacVentRr(i);
        }
    }
}
