package p082l;

import android.content.Context;
import android.view.View;
import android.view.Window;
import p079k.C1006a;

/* renamed from: l.X0 */
/* loaded from: classes.dex */
public final class ViewOnClickListenerC1095X0 implements View.OnClickListener {

    /* renamed from: f */
    public final C1006a f5124f;

    /* renamed from: g */
    public final /* synthetic */ C1097Y0 f5125g;

    public ViewOnClickListenerC1095X0(C1097Y0 c1097y0) {
        this.f5125g = c1097y0;
        Context context = c1097y0.f5132a.getContext();
        CharSequence charSequence = c1097y0.f5139h;
        C1006a c1006a = new C1006a();
        c1006a.f4766e = 4096;
        c1006a.f4768g = 4096;
        c1006a.f4773l = null;
        c1006a.f4774m = null;
        c1006a.f4775n = false;
        c1006a.f4776o = false;
        c1006a.f4777p = 16;
        c1006a.f4770i = context;
        c1006a.f4762a = charSequence;
        this.f5124f = c1006a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C1097Y0 c1097y0 = this.f5125g;
        Window.Callback callback = c1097y0.f5142k;
        if (callback == null || !c1097y0.f5143l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f5124f);
    }
}
