package p001A0;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.altaysoft.t500_split.ClimateTestActivity;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.TopOverlayService;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p003B.AbstractC0035b;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.C1253D0;
import p098q0.C1324i1;

/* renamed from: A0.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0010d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f30a;

    /* renamed from: b */
    public final /* synthetic */ int f31b;

    /* renamed from: c */
    public final /* synthetic */ Object f32c;

    public /* synthetic */ RunnableC0010d(Context context, int i) {
        this.f30a = 0;
        this.f31b = i;
        this.f32c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f30a) {
            case 0:
                cfgData m1784i = cfgData.m1784i();
                int i = m1784i.f2540L1;
                int i2 = this.f31b;
                if (i != i2) {
                    m1784i.f2540L1 = i2;
                    Context context = (Context) this.f32c;
                    m1784i.m1797q(context);
                    if (!AbstractC1256E0.m2988C(context, i, i2)) {
                        AbstractC1256E0.m3014g(context, i, i2);
                        break;
                    } else {
                        AbstractC1256E0.m2993H(context);
                        TopOverlayService.m1704c(context);
                        AbstractC1372y1.m3300f();
                        try {
                            Intent intent = new Intent(context, (Class<?>) MainActivity.class);
                            intent.addFlags(335609856);
                            context.startActivity(intent);
                            break;
                        } catch (Exception unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                VoiceSettingsActivity voiceSettingsActivity = (VoiceSettingsActivity) this.f32c;
                int i3 = this.f31b;
                int i4 = VoiceSettingsActivity.f3324M;
                if (!voiceSettingsActivity.isFinishing()) {
                    voiceSettingsActivity.m2012v(voiceSettingsActivity.getString(R.string.voice_dlg_installed, Integer.valueOf(i3)));
                    C0021o m28d = C0021o.m28d();
                    m28d.getClass();
                    m28d.f67g = voiceSettingsActivity.getApplicationContext();
                    m28d.m35i();
                    m28d.m33g();
                    if (!cfgData.m1784i().f2551O0 || (!m28d.f71k && m28d.f65e <= 0)) {
                        m28d.m32f();
                    } else {
                        m28d.f71k = true;
                        m28d.m30b();
                    }
                    voiceSettingsActivity.m2011u();
                    break;
                }
                break;
            case 2:
                ((AbstractC0035b) this.f32c).mo52g(this.f31b);
                break;
            case 3:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f32c;
                View view = (View) sideSheetBehavior.f3591p.get();
                if (view != null) {
                    sideSheetBehavior.m2099t(this.f31b, view, false);
                    break;
                }
                break;
            case 4:
                int i5 = ClimateTestActivity.f2265I;
                ((C0009c) this.f32c).m20f(this.f31b);
                break;
            case 5:
                int i6 = this.f31b;
                C1253D0 c1253d0 = (C1253D0) this.f32c;
                c1253d0.f5623Z = i6;
                c1253d0.m2967e();
                c1253d0.f5622Y = false;
                if (c1253d0.f5620W) {
                    cfgData cfgdata = c1253d0.f5626b;
                    cfgdata.f2652k3 = true;
                    cfgdata.f2657l3 = c1253d0.f5623Z;
                    cfgdata.m1796p(c1253d0.f5624a);
                    break;
                }
                break;
            default:
                int i7 = this.f31b;
                C1324i1 c1324i1 = (C1324i1) this.f32c;
                c1324i1.f6178M0 = i7;
                cfgData m1784i2 = cfgData.m1784i();
                int i8 = c1324i1.f6211c;
                int i9 = i8 == 1 ? m1784i2.f2637h3 : m1784i2.f2632g3;
                int i10 = c1324i1.f6178M0;
                if (i9 != i10) {
                    if (i8 == 1) {
                        m1784i2.f2637h3 = i10;
                    } else {
                        m1784i2.f2632g3 = i10;
                    }
                    m1784i2.m1798r(c1324i1.f6205a);
                }
                int i11 = c1324i1.f6178M0;
                if (i11 == 2) {
                    c1324i1.m3231s();
                } else if (i11 == 3) {
                    c1324i1.m3234v(false);
                } else if (i11 == 4) {
                    c1324i1.m3215a(m1784i2.m1793m(i8), false);
                    c1324i1.m3205K();
                }
                c1324i1.f6180N0 = false;
                c1324i1.f6184P0 = -1;
                c1324i1.m3217c();
                c1324i1.m3204J();
                c1324i1.m3232t();
                break;
        }
    }

    public /* synthetic */ RunnableC0010d(Object obj, int i, int i2) {
        this.f30a = i2;
        this.f32c = obj;
        this.f31b = i;
    }
}
