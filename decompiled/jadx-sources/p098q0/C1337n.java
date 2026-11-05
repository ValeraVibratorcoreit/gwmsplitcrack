package p098q0;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.R;
import p003B.C0043j;
import p101r0.C1384f;
import p103s0.C1414b;

/* renamed from: q0.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C1337n implements InterfaceC0561z {

    /* renamed from: a */
    public final /* synthetic */ int f6296a;

    /* renamed from: b */
    public final /* synthetic */ Object f6297b;

    public /* synthetic */ C1337n(int i, Object obj) {
        this.f6296a = i;
        this.f6297b = obj;
    }

    @Override // androidx.lifecycle.InterfaceC0561z
    /* renamed from: a */
    public final void mo1100a(Object obj) {
        float floatValue;
        Object obj2 = this.f6297b;
        switch (this.f6296a) {
            case 0:
                int i = AutoPresetSettingsActivity.f2263F;
                ((AutoPresetSettingsActivity) obj2).m1646t((Integer) obj);
                break;
            case 1:
                Float f2 = (Float) obj;
                C1287U0 c1287u0 = (C1287U0) obj2;
                if (f2 == null) {
                    floatValue = 0.0f;
                } else {
                    c1287u0.getClass();
                    floatValue = f2.floatValue();
                }
                c1287u0.m3119s(floatValue);
                break;
            case 2:
                C1384f c1384f = (C1384f) obj2;
                c1384f.getClass();
                int i2 = Boolean.TRUE.equals((Boolean) obj) ? 0 : 8;
                c1384f.f6482d0.setVisibility(i2);
                c1384f.f6483e0.setVisibility(i2);
                c1384f.f6484f0.setVisibility(i2);
                c1384f.f6485g0.setVisibility(i2);
                break;
            case 3:
                ((TextView) obj2).setText((String) obj);
                break;
            case 4:
                Integer num = (Integer) obj;
                C1414b c1414b = (C1414b) obj2;
                c1414b.f6782n0.setProgress(num.intValue());
                c1414b.f6783o0.setText(String.format(c1414b.m1130m(R.string.downloading_text_s), num, "%"));
                break;
            default:
                C0043j c0043j = (C0043j) obj2;
                c0043j.getClass();
                ((ImageView) c0043j.f141g).setVisibility(Boolean.TRUE.equals((Boolean) obj) ? 0 : 4);
                break;
        }
    }
}
