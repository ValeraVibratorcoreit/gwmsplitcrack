package p034Q0;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import p000A.AbstractC0001b;

/* renamed from: Q0.m */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0296m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f827a;

    /* renamed from: b */
    public final /* synthetic */ View f828b;

    public /* synthetic */ RunnableC0296m(View view, int i) {
        this.f827a = i;
        this.f828b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f827a) {
            case 0:
                View view = this.f828b;
                ((InputMethodManager) AbstractC0001b.m4b(view.getContext(), InputMethodManager.class)).showSoftInput(view, 1);
                break;
            case 1:
                this.f828b.animate().scaleX(1.0f).scaleY(1.0f).setDuration(160L).setInterpolator(new DecelerateInterpolator()).start();
                break;
            case 2:
                View view2 = this.f828b;
                view2.setVisibility(8);
                view2.setTranslationX(0.0f);
                view2.setAlpha(1.0f);
                break;
            case 3:
                View view3 = this.f828b;
                view3.setVisibility(8);
                view3.setTranslationX(0.0f);
                view3.setAlpha(1.0f);
                break;
            default:
                View view4 = this.f828b;
                view4.setVisibility(8);
                view4.setTranslationX(0.0f);
                view4.setAlpha(1.0f);
                break;
        }
    }
}
