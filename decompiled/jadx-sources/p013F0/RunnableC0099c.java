package p013F0;

import android.graphics.Typeface;
import android.view.View;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;
import p003B.AbstractC0035b;
import p016H.C0114f;
import p022K.AbstractC0169Q;
import p036S.C0305e;

/* renamed from: F0.c */
/* loaded from: classes.dex */
public final class RunnableC0099c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f332a;

    /* renamed from: b */
    public final Object f333b;

    /* renamed from: c */
    public final /* synthetic */ Object f334c;

    public /* synthetic */ RunnableC0099c(Object obj, int i, Object obj2) {
        this.f332a = i;
        this.f333b = obj;
        this.f334c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = this.f334c;
        Object obj2 = this.f333b;
        switch (this.f332a) {
            case 0:
                C0305e c0305e = ((SwipeDismissBehavior) obj).f3357a;
                if (c0305e != null && c0305e.m862f()) {
                    WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                    ((View) obj2).postOnAnimation(this);
                    break;
                }
                break;
            case 1:
                AbstractC0035b abstractC0035b = (AbstractC0035b) ((C0639g) obj2).f3011g;
                if (abstractC0035b != null) {
                    abstractC0035b.mo53h((Typeface) obj);
                    break;
                }
                break;
            default:
                ((C0114f) obj2).accept(obj);
                break;
        }
    }

    public RunnableC0099c(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z2) {
        this.f332a = 0;
        this.f334c = swipeDismissBehavior;
        this.f333b = view;
    }
}
