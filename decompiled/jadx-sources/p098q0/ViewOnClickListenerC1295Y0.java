package p098q0;

import android.app.ActivityOptions;
import android.content.Context;
import android.content.Intent;
import android.media.session.MediaController;
import android.media.session.PlaybackState;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Spinner;
import android.widget.ToggleButton;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0648p;
import com.altaysoft.t500_split.splitinfo.ChartsFullscreenActivity;
import com.altaysoft.t500_split.splitinfo.WeatherFullscreenActivity;
import com.sun.jna.Platform;

/* renamed from: q0.Y0 */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC1295Y0 implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f6042f;

    /* renamed from: g */
    public final /* synthetic */ C1324i1 f6043g;

    public /* synthetic */ ViewOnClickListenerC1295Y0(C1324i1 c1324i1, int i) {
        this.f6042f = i;
        this.f6043g = c1324i1;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        C1324i1 c1324i1 = this.f6043g;
        switch (this.f6042f) {
            case 0:
                c1324i1.m3237z((c1324i1.f6178M0 + 6) % 7, -1);
                break;
            case 1:
                c1324i1.m3237z((c1324i1.f6178M0 + 1) % 7, 1);
                break;
            case 2:
                c1324i1.m3198D(-1);
                break;
            case 3:
                c1324i1.m3198D(1);
                break;
            case 4:
                AbstractC0638f.m1869r(c1324i1.f6205a);
                c1324i1.m3209O();
                break;
            case 5:
                c1324i1.getClass();
                int i = WeatherFullscreenActivity.f3250V;
                Context context = c1324i1.f6205a;
                if (context != null) {
                    try {
                        Intent intent = new Intent(context, (Class<?>) WeatherFullscreenActivity.class);
                        intent.addFlags(402722816);
                        intent.putExtra("caller", "top");
                        context.startActivity(intent, ActivityOptions.makeBasic().toBundle());
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
            case 6:
                c1324i1.m3234v(true);
                break;
            case 7:
                c1324i1.getClass();
                cfgData m1784i = cfgData.m1784i();
                String[] strArr = AbstractC0648p.f3051a;
                AbstractC0638f.m1867p(c1324i1.f6205a, (m1784i == null || (str = m1784i.f2656l2) == null) ? "" : str.trim());
                c1324i1.m3209O();
                break;
            case 8:
                MediaController m1854c = AbstractC0638f.m1854c(c1324i1.f6205a);
                if (m1854c != null) {
                    m1854c.getTransportControls().skipToPrevious();
                    break;
                }
                break;
            case Platform.GNU /* 9 */:
                MediaController m1854c2 = AbstractC0638f.m1854c(c1324i1.f6205a);
                if (m1854c2 != null) {
                    PlaybackState playbackState = m1854c2.getPlaybackState();
                    if (playbackState != null && playbackState.getState() == 3) {
                        m1854c2.getTransportControls().pause();
                        break;
                    } else {
                        m1854c2.getTransportControls().play();
                        break;
                    }
                }
                break;
            case Platform.KFREEBSD /* 10 */:
                MediaController m1854c3 = AbstractC0638f.m1854c(c1324i1.f6205a);
                if (m1854c3 != null) {
                    PlaybackState playbackState2 = m1854c3.getPlaybackState();
                    if (playbackState2 != null && playbackState2.getState() == 3) {
                        m1854c3.getTransportControls().pause();
                        break;
                    } else {
                        m1854c3.getTransportControls().play();
                        break;
                    }
                }
                break;
            case Platform.NETBSD /* 11 */:
                MediaController m1854c4 = AbstractC0638f.m1854c(c1324i1.f6205a);
                if (m1854c4 != null) {
                    m1854c4.getTransportControls().skipToNext();
                    break;
                }
                break;
            case Platform.DRAGONFLYBSD /* 12 */:
                if (c1324i1.f6209b0.getVisibility() != 0) {
                    if (c1324i1.f6209b0 != null) {
                        c1324i1.m3232t();
                        c1324i1.f6209b0.setVisibility(0);
                        ImageButton imageButton = c1324i1.f6206a0;
                        if (imageButton != null) {
                            imageButton.setVisibility(4);
                            break;
                        }
                    }
                } else {
                    c1324i1.m3226n();
                    break;
                }
                break;
            case 13:
                c1324i1.m3226n();
                break;
            default:
                int[] iArr = C1324i1.f6152f1;
                int i2 = iArr[1];
                Spinner spinner = c1324i1.f6226i0;
                if (spinner != null) {
                    i2 = iArr[Math.max(0, Math.min(spinner.getSelectedItemPosition(), 3))];
                }
                ToggleButton toggleButton = c1324i1.f6220f0;
                boolean z2 = toggleButton == null || toggleButton.isChecked();
                ToggleButton toggleButton2 = c1324i1.f6222g0;
                boolean z3 = toggleButton2 == null || toggleButton2.isChecked();
                ToggleButton toggleButton3 = c1324i1.f6224h0;
                boolean z4 = toggleButton3 == null || toggleButton3.isChecked();
                int[] iArr2 = ChartsFullscreenActivity.f3123M;
                Context context2 = c1324i1.f6205a;
                if (context2 != null) {
                    try {
                        Intent intent2 = new Intent(context2, (Class<?>) ChartsFullscreenActivity.class);
                        intent2.addFlags(402722816);
                        intent2.putExtra("caller", "top");
                        intent2.putExtra("window_min", i2);
                        intent2.putExtra("show_spd", z2);
                        intent2.putExtra("show_rpm", z3);
                        intent2.putExtra("show_gear", z4);
                        intent2.putExtra("chart", 1);
                        context2.startActivity(intent2, ActivityOptions.makeBasic().toBundle());
                        break;
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
        }
    }
}
