package p098q0;

import com.altaysoft.t500_split.DriveModeSettingsActivity;
import com.altaysoft.t500_split.IpMessagesSettingsActivity;
import com.altaysoft.t500_split.SplitBallSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import com.sun.jna.Platform;

/* renamed from: q0.C */
/* loaded from: classes.dex */
public final /* synthetic */ class C1249C {

    /* renamed from: a */
    public final /* synthetic */ int f5581a;

    /* renamed from: b */
    public final /* synthetic */ cfgData f5582b;

    public /* synthetic */ C1249C(cfgData cfgdata, int i) {
        this.f5581a = i;
        this.f5582b = cfgdata;
    }

    /* renamed from: a */
    public final void m2961a(boolean z2) {
        cfgData cfgdata = this.f5582b;
        switch (this.f5581a) {
            case 0:
                int[] iArr = DriveModeSettingsActivity.f2270E;
                cfgdata.f2571T0 = z2;
                break;
            case 1:
                int[] iArr2 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2575U0 = z2;
                break;
            case 2:
                int[] iArr3 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2579V0 = z2;
                break;
            case 3:
                int[] iArr4 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2583W0 = z2;
                break;
            case 4:
                int[] iArr5 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2587X0 = z2;
                break;
            case 5:
                int[] iArr6 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2591Y0 = z2;
                break;
            case 6:
                int[] iArr7 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2595Z0 = z2;
                break;
            case 7:
                int[] iArr8 = DriveModeSettingsActivity.f2270E;
                cfgdata.f2600a1 = z2;
                break;
            case 8:
                int i = IpMessagesSettingsActivity.f2303E;
                cfgdata.f2497B2 = z2;
                break;
            case Platform.GNU /* 9 */:
                int i2 = IpMessagesSettingsActivity.f2303E;
                cfgdata.f2502C2 = z2;
                break;
            case Platform.KFREEBSD /* 10 */:
                int i3 = IpMessagesSettingsActivity.f2303E;
                cfgdata.f2507D2 = z2;
                break;
            case Platform.NETBSD /* 11 */:
                int i4 = IpMessagesSettingsActivity.f2303E;
                cfgdata.f2512E2 = z2;
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                int i5 = SplitBallSettingsActivity.f2341E;
                cfgdata.f2533J2 = z2;
                break;
            case 13:
                int i6 = SplitBallSettingsActivity.f2341E;
                cfgdata.f2521G2 = z2;
                break;
            case 14:
                int i7 = SplitBallSettingsActivity.f2341E;
                cfgdata.f2525H2 = z2;
                break;
            default:
                int i8 = SplitBallSettingsActivity.f2341E;
                cfgdata.f2529I2 = z2;
                break;
        }
    }
}
