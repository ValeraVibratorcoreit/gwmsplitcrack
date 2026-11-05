package p001A0;

import android.os.Handler;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.NativeLib;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.Iterator;
import p098q0.AbstractC1319h;

/* renamed from: A0.p */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0022p implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f80a;

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        switch (this.f80a) {
            case 0:
                Iterator it = AbstractC0023q.f82b.iterator();
                while (it.hasNext()) {
                    try {
                        ((Runnable) it.next()).run();
                    } catch (Exception unused) {
                    }
                }
                return;
            case 1:
                AbstractC1319h.m3187c();
                AbstractC1319h.m3185a(false);
                AbstractC1319h.m3186b(false);
                Handler handler = AbstractC1319h.f6137k;
                RunnableC0022p runnableC0022p = AbstractC1319h.f6138l;
                handler.removeCallbacks(runnableC0022p);
                handler.postDelayed(runnableC0022p, 60000L);
                return;
            case 2:
                synchronized (AbstractC1319h.f6127a) {
                    i = AbstractC1319h.f6131e;
                }
                if (i >= 0) {
                    AbstractC1319h.m3188d(i);
                    return;
                }
                return;
            case 3:
                AbstractC1319h.m3185a(true);
                return;
            case 4:
                int i2 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacPwr(2);
                return;
            case 5:
                int i3 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(2);
                return;
            case 6:
                int i4 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(3);
                return;
            case 7:
                int i5 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(4);
                return;
            case 8:
                int i6 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(5);
                return;
            case Platform.GNU /* 9 */:
                int i7 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(6);
                return;
            case Platform.KFREEBSD /* 10 */:
                int i8 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(7);
                return;
            case Platform.NETBSD /* 11 */:
                int i9 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacBlow(1);
                return;
            case Platform.DRAGONFLYBSD /* 12 */:
                int i10 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacBlow(2);
                return;
            case 13:
                int i11 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacBlow(3);
                return;
            case 14:
                int i12 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacBlow(4);
                return;
            case 15:
                int i13 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacPwr(1);
                return;
            case DLLCallback.DLL_FPTRS /* 16 */:
                int i14 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacDef(2);
                return;
            case 17:
                int i15 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacDef(1);
                return;
            case 18:
                int i16 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacWheel(2);
                return;
            case 19:
                int i17 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacWheel(1);
                return;
            case 20:
                int i18 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacAc(2);
                return;
            case 21:
                int i19 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacWin(0);
                return;
            case 22:
                int i20 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacWin(1);
                return;
            case 23:
                int i21 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacRear(1);
                return;
            case 24:
                int i22 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacRear(2);
                return;
            case 25:
                int i23 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacAc(1);
                return;
            case 26:
                int i24 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacAuto(2);
                return;
            case 27:
                int i25 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacInlet(1);
                return;
            case 28:
                int i26 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacInlet(2);
                return;
            default:
                int i27 = ClimateTestActivity.f2265I;
                NativeLib.nativePropHvacFan(1);
                return;
        }
    }
}
