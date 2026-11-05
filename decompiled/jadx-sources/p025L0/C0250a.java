package p025L0;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import android.widget.CompoundButton;
import com.altaysoft.t500_split.Launcher;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.google.android.material.chip.Chip;
import p098q0.AbstractC1372y1;
import p101r0.C1402x;

/* renamed from: L0.a */
/* loaded from: classes.dex */
public final /* synthetic */ class C0250a implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f630a;

    /* renamed from: b */
    public final /* synthetic */ Object f631b;

    public /* synthetic */ C0250a(int i, Object obj) {
        this.f630a = i;
        this.f631b = obj;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
        switch (this.f630a) {
            case 0:
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = ((Chip) this.f631b).f3458n;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
                    break;
                }
                break;
            default:
                C1402x c1402x = (C1402x) this.f631b;
                c1402x.getClass();
                cfgData cfgdata = CFG4.f2728F;
                cfgdata.f2672o3 = z2;
                boolean z3 = !z2;
                cfgdata.f2646j2 = z3;
                c1402x.f6592j0.setChecked(z3);
                c1402x.f6592j0.setEnabled((cfgdata.f2672o3 || AbstractC1372y1.m3299e("astart")) ? false : true);
                PackageManager packageManager = c1402x.m1124g().getPackageManager();
                ComponentName componentName = new ComponentName(c1402x.m1124g(), (Class<?>) Launcher.class);
                if (!cfgdata.f2672o3) {
                    packageManager.setComponentEnabledSetting(componentName, 2, 1);
                    break;
                } else {
                    packageManager.setComponentEnabledSetting(componentName, 1, 1);
                    break;
                }
        }
    }
}
