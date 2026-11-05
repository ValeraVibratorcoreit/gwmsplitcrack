package p082l;

/* renamed from: l.w0 */
/* loaded from: classes.dex */
public final class RunnableC1148w0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5284a;

    /* renamed from: b */
    public final /* synthetic */ C1050A0 f5285b;

    public /* synthetic */ RunnableC1148w0(C1050A0 c1050a0, int i) {
        this.f5284a = i;
        this.f5285b = c1050a0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5284a) {
            case 0:
                C1130n0 c1130n0 = this.f5285b.f5002h;
                if (c1130n0 != null) {
                    c1130n0.setListSelectionHidden(true);
                    c1130n0.requestLayout();
                    break;
                }
                break;
            default:
                C1050A0 c1050a0 = this.f5285b;
                C1130n0 c1130n02 = c1050a0.f5002h;
                if (c1130n02 != null && c1130n02.isAttachedToWindow() && c1050a0.f5002h.getCount() > c1050a0.f5002h.getChildCount() && c1050a0.f5002h.getChildCount() <= c1050a0.f5012r) {
                    c1050a0.f4999E.setInputMethodMode(2);
                    c1050a0.mo2578f();
                    break;
                }
                break;
        }
    }
}
