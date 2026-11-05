package p079k;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;
import p076j.InterfaceC0953b;

/* renamed from: k.q */
/* loaded from: classes.dex */
public final class C1022q extends FrameLayout implements InterfaceC0953b {

    /* renamed from: f */
    public final CollapsibleActionView f4888f;

    /* JADX WARN: Multi-variable type inference failed */
    public C1022q(View view) {
        super(view.getContext());
        this.f4888f = (CollapsibleActionView) view;
        addView(view);
    }
}
