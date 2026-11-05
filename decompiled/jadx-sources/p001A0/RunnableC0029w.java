package p001A0;

import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieCompositionFactory;
import com.altaysoft.t500_split.MainActivity;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.voice.VoiceSettingsActivity;
import java.io.InputStream;
import java.util.HashMap;
import p051Z0.C0454l;
import p098q0.C1275O;
import p098q0.C1324i1;
import p109u0.C1474D;
import p109u0.C1541h0;

/* renamed from: A0.w */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0029w implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f99a;

    /* renamed from: b */
    public final /* synthetic */ boolean f100b;

    /* renamed from: c */
    public final /* synthetic */ Object f101c;

    public /* synthetic */ RunnableC0029w(Object obj, boolean z2, int i) {
        this.f99a = i;
        this.f101c = obj;
        this.f100b = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if (com.altaysoft.t500_split.cfgData.m1784i().f2549N2 == false) goto L26;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z2 = true;
        boolean z3 = this.f100b;
        Object obj = this.f101c;
        switch (this.f99a) {
            case 0:
                int i = VoiceSettingsActivity.f3324M;
                VoiceSettingsActivity voiceSettingsActivity = (VoiceSettingsActivity) obj;
                if (!voiceSettingsActivity.isFinishing()) {
                    voiceSettingsActivity.m2012v(voiceSettingsActivity.getString(z3 ? R.string.voice_dlg_deleted : R.string.voice_dlg_delete_failed));
                    voiceSettingsActivity.m2011u();
                    break;
                }
                break;
            case 1:
                LottieCompositionFactory.lambda$fromJsonInputStream$7(z3, (InputStream) obj);
                break;
            case 2:
                ((C1275O) obj).m3071e(z3);
                break;
            case 3:
                Context context = (Context) obj;
                if (z3) {
                    MainActivity.m1676C(context, true);
                    break;
                } else {
                    MainActivity.m1676C(context, false);
                    break;
                }
            case 4:
                C1324i1 c1324i1 = (C1324i1) obj;
                if (z3) {
                    c1324i1.getClass();
                    if (cfgData.m1784i().f2545M2) {
                        break;
                    }
                }
                z2 = false;
                View view = c1324i1.f6217e;
                if (view != null) {
                    view.setVisibility(z2 ? 0 : 8);
                }
                c1324i1.m3204J();
                c1324i1.m3199E();
                break;
            case 5:
                C0454l c0454l = (C0454l) obj;
                c0454l.f1451a = z3;
                int i2 = z3 ? 0 : 8;
                for (View view2 : ((HashMap) c0454l.f1455e).values()) {
                    if (view2 != null) {
                        view2.setVisibility(i2);
                    }
                }
                break;
            case 6:
                ((C1474D) obj).m3544a(z3);
                break;
            default:
                ((C1541h0) obj).m4265b(z3);
                break;
        }
    }

    public /* synthetic */ RunnableC0029w(boolean z2, Object obj, int i) {
        this.f99a = i;
        this.f100b = z2;
        this.f101c = obj;
    }
}
