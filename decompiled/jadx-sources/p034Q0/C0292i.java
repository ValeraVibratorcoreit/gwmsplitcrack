package p034Q0;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
import p025L0.C0251b;
import p039T0.C0335d;

/* renamed from: Q0.i */
/* loaded from: classes.dex */
public final class C0292i {

    /* renamed from: c */
    public float f818c;

    /* renamed from: d */
    public float f819d;

    /* renamed from: f */
    public final WeakReference f821f;

    /* renamed from: g */
    public C0335d f822g;

    /* renamed from: a */
    public final TextPaint f816a = new TextPaint(1);

    /* renamed from: b */
    public final C0251b f817b = new C0251b(1, this);

    /* renamed from: e */
    public boolean f820e = true;

    public C0292i(InterfaceC0291h interfaceC0291h) {
        this.f821f = new WeakReference(null);
        this.f821f = new WeakReference(interfaceC0291h);
    }

    /* renamed from: a */
    public final void m838a(String str) {
        TextPaint textPaint = this.f816a;
        this.f818c = str == null ? 0.0f : textPaint.measureText((CharSequence) str, 0, str.length());
        this.f819d = str != null ? Math.abs(textPaint.getFontMetrics().ascent) : 0.0f;
        this.f820e = false;
    }

    /* renamed from: b */
    public final void m839b(C0335d c0335d, Context context) {
        if (this.f822g != c0335d) {
            this.f822g = c0335d;
            if (c0335d != null) {
                TextPaint textPaint = this.f816a;
                C0251b c0251b = this.f817b;
                c0335d.m934f(context, textPaint, c0251b);
                InterfaceC0291h interfaceC0291h = (InterfaceC0291h) this.f821f.get();
                if (interfaceC0291h != null) {
                    textPaint.drawableState = interfaceC0291h.getState();
                }
                c0335d.m933e(context, textPaint, c0251b);
                this.f820e = true;
            }
            InterfaceC0291h interfaceC0291h2 = (InterfaceC0291h) this.f821f.get();
            if (interfaceC0291h2 != null) {
                interfaceC0291h2.mo327a();
                interfaceC0291h2.onStateChange(interfaceC0291h2.getState());
            }
        }
    }
}
