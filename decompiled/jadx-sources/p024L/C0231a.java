package p024L;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: L.a */
/* loaded from: classes.dex */
public final class C0231a extends ClickableSpan {

    /* renamed from: a */
    public final int f610a;

    /* renamed from: b */
    public final C0240j f611b;

    /* renamed from: c */
    public final int f612c;

    public C0231a(int i, C0240j c0240j, int i2) {
        this.f610a = i;
        this.f611b = c0240j;
        this.f612c = i2;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f610a);
        this.f611b.f627a.performAction(this.f612c, bundle);
    }
}
