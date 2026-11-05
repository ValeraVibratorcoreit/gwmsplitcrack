package p046X;

import android.animation.Animator;
import android.util.Log;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.media.InterfaceC0649q;
import p014G.InterfaceC0101b;
import p016H.C0112d;
import p070g.DialogInterfaceC0867f;
import p107t1.AbstractC1461d;

/* renamed from: X.d */
/* loaded from: classes.dex */
public final /* synthetic */ class C0404d implements InterfaceC0101b, InterfaceC0649q {

    /* renamed from: f */
    public final /* synthetic */ Object f1274f;

    /* renamed from: g */
    public final /* synthetic */ Object f1275g;

    public /* synthetic */ C0404d(Object obj, Object obj2) {
        this.f1274f = obj;
        this.f1275g = obj2;
    }

    @Override // p014G.InterfaceC0101b
    /* renamed from: c */
    public void mo341c() {
        C0401b0 c0401b0 = (C0401b0) this.f1275g;
        AbstractC1461d.m3494e("$operation", c0401b0);
        ((Animator) this.f1274f).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Animator from operation " + c0401b0 + " has been canceled.");
        }
    }

    @Override // com.altaysoft.t500_split.media.InterfaceC0649q
    /* renamed from: e */
    public void mo19e(C0112d c0112d) {
        YmSettingsActivity ymSettingsActivity = (YmSettingsActivity) c0112d.f354f;
        if (ymSettingsActivity.f2373G != ((DialogInterfaceC0867f) c0112d.f350b)) {
            return;
        }
        String str = (String) this.f1275g;
        if (str == null || str.isEmpty()) {
            str = "https://ya.ru/device";
        }
        ((TextView) c0112d.f351c).setText(ymSettingsActivity.getString(R.string.ym_token_dialog_open, str));
        ((TextView) c0112d.f352d).setText((String) this.f1274f);
    }
}
