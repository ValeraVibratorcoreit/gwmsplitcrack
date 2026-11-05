package p015G0;

import android.view.View;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import p109u0.C1518Z0;

/* renamed from: G0.a */
/* loaded from: classes.dex */
public final class ViewOnLayoutChangeListenerC0108a implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ int f343a;

    /* renamed from: b */
    public final /* synthetic */ Object f344b;

    public /* synthetic */ ViewOnLayoutChangeListenerC0108a(int i, Object obj) {
        this.f343a = i;
        this.f344b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        switch (this.f343a) {
            case 0:
                ((BottomAppBar$Behavior) this.f344b).getClass();
                throw null;
            default:
                view.removeOnLayoutChangeListener(this);
                ((C1518Z0) this.f344b).m4112g();
                return;
        }
    }
}
