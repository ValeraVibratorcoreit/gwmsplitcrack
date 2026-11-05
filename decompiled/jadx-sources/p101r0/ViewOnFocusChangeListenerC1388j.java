package p101r0;

import android.view.View;
import android.widget.Toast;
import com.altaysoft.t500_split.configActivity.CFG4;

/* renamed from: r0.j */
/* loaded from: classes.dex */
public final class ViewOnFocusChangeListenerC1388j implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C1396r f6502a;

    public ViewOnFocusChangeListenerC1388j(C1396r c1396r) {
        this.f6502a = c1396r;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z2) {
        C1396r c1396r = this.f6502a;
        if (z2) {
            return;
        }
        try {
            CFG4.f2728F.f2702u3 = Float.parseFloat(c1396r.f6535Z.getText().toString());
        } catch (NumberFormatException unused) {
            Toast.makeText(c1396r.m1124g(), "Неправильный формат ввода", 1).show();
        }
        CFG4.f2728F.m1795o(c1396r.m1124g());
    }
}
