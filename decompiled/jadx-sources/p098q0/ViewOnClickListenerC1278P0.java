package p098q0;

import android.view.View;
import android.view.WindowManager;
import com.altaysoft.t500_split.radio.RadioState;
import p115w0.AbstractC1634p;

/* renamed from: q0.P0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1278P0 implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f5923f;

    /* renamed from: a */
    private final void m3092a(View view) {
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        WindowManager windowManager;
        switch (this.f5923f) {
            case 0:
                break;
            case 1:
                RadioState.getInstance().togglePlay();
                break;
            case 2:
                RadioState.getInstance().presetNext();
                break;
            case 3:
                RadioState.getInstance().seekDown();
                break;
            case 4:
                RadioState.getInstance().seekUp();
                break;
            case 5:
                RadioState.getInstance().playBand(0);
                break;
            case 6:
                RadioState.getInstance().playBand(1);
                break;
            case 7:
                RadioState.getInstance().presetPrev();
                break;
            case 8:
                RadioState.getInstance().togglePlay();
                break;
            default:
                View view2 = AbstractC1634p.f9302b;
                if (view2 != null && (windowManager = AbstractC1634p.f9303c) != null) {
                    try {
                        windowManager.removeView(view2);
                    } catch (Exception unused) {
                    }
                }
                AbstractC1634p.f9302b = null;
                AbstractC1634p.f9303c = null;
                break;
        }
    }
}
