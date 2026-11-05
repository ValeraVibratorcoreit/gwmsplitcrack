package p109u0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* renamed from: u0.H */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1482H implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f7433a;

    /* renamed from: b */
    public final /* synthetic */ C1488K f7434b;

    /* renamed from: c */
    public final /* synthetic */ float[] f7435c;

    public /* synthetic */ RunnableC1482H(C1488K c1488k, float[] fArr, int i) {
        this.f7433a = i;
        this.f7434b = c1488k;
        this.f7435c = fArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7433a) {
            case 0:
                C1488K c1488k = this.f7434b;
                c1488k.getClass();
                float[] fArr = this.f7435c;
                float f2 = fArr[0];
                float f3 = fArr[1];
                View view = c1488k.f7495l;
                if (view != null) {
                    int width = view.getWidth();
                    int height = c1488k.f7495l.getHeight();
                    if (width > 0 && height > 0) {
                        c1488k.f7495l.setTranslationX(f2 - (width * 0.5f));
                        c1488k.f7495l.setTranslationY(f3 - (height * 0.5f));
                        c1488k.f7495l.bringToFront();
                        ViewParent parent = c1488k.f7495l.getParent();
                        if (parent instanceof ViewGroup) {
                            ((ViewGroup) parent).invalidate();
                            break;
                        }
                    } else {
                        c1488k.f7495l.requestLayout();
                        c1488k.f7495l.post(new RunnableC1476E(c1488k, 0));
                        break;
                    }
                }
                break;
            default:
                C1488K c1488k2 = this.f7434b;
                c1488k2.getClass();
                float[] fArr2 = this.f7435c;
                float f4 = fArr2[0];
                float f5 = fArr2[1];
                View view2 = c1488k2.f7499n;
                if (view2 != null) {
                    int width2 = view2.getWidth();
                    int height2 = c1488k2.f7499n.getHeight();
                    if (width2 > 0 && height2 > 0) {
                        c1488k2.f7499n.setTranslationX(f4 - (width2 * 0.5f));
                        c1488k2.f7499n.setTranslationY(f5 - (height2 * 0.5f));
                        break;
                    } else {
                        c1488k2.f7499n.requestLayout();
                        c1488k2.f7499n.post(new RunnableC1476E(c1488k2, 2));
                        break;
                    }
                }
                break;
        }
    }
}
