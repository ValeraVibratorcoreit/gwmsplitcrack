package p068f0;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: f0.c */
/* loaded from: classes.dex */
public final class RunnableC0800c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f4032a;

    /* renamed from: b */
    public final /* synthetic */ ArrayList f4033b;

    /* renamed from: c */
    public final /* synthetic */ C0811i f4034c;

    public /* synthetic */ RunnableC0800c(C0811i c0811i, ArrayList arrayList, int i) {
        this.f4032a = i;
        this.f4034c = c0811i;
        this.f4033b = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it;
        switch (this.f4032a) {
            case 0:
                ArrayList arrayList = this.f4033b;
                Iterator it2 = arrayList.iterator();
                while (true) {
                    boolean hasNext = it2.hasNext();
                    C0811i c0811i = this.f4034c;
                    if (!hasNext) {
                        arrayList.clear();
                        c0811i.f4098m.remove(arrayList);
                        break;
                    } else {
                        C0810h c0810h = (C0810h) it2.next();
                        AbstractC0792W abstractC0792W = c0810h.f4086a;
                        c0811i.getClass();
                        View view = abstractC0792W.f3995a;
                        int i = c0810h.f4089d - c0810h.f4087b;
                        int i2 = c0810h.f4090e - c0810h.f4088c;
                        if (i != 0) {
                            view.animate().translationX(0.0f);
                        }
                        if (i2 != 0) {
                            view.animate().translationY(0.0f);
                        }
                        ViewPropertyAnimator animate = view.animate();
                        c0811i.f4101p.add(abstractC0792W);
                        animate.setDuration(c0811i.f3924e).setListener(new C0804e(c0811i, abstractC0792W, i, view, i2, animate)).start();
                    }
                }
            case 1:
                ArrayList arrayList2 = this.f4033b;
                Iterator it3 = arrayList2.iterator();
                while (true) {
                    boolean hasNext2 = it3.hasNext();
                    C0811i c0811i2 = this.f4034c;
                    if (!hasNext2) {
                        arrayList2.clear();
                        c0811i2.f4099n.remove(arrayList2);
                        break;
                    } else {
                        C0808g c0808g = (C0808g) it3.next();
                        c0811i2.getClass();
                        AbstractC0792W abstractC0792W2 = c0808g.f4076a;
                        View view2 = abstractC0792W2 == null ? null : abstractC0792W2.f3995a;
                        AbstractC0792W abstractC0792W3 = c0808g.f4077b;
                        View view3 = abstractC0792W3 != null ? abstractC0792W3.f3995a : null;
                        ArrayList arrayList3 = c0811i2.f4103r;
                        long j2 = c0811i2.f3925f;
                        if (view2 != null) {
                            ViewPropertyAnimator duration = view2.animate().setDuration(j2);
                            arrayList3.add(c0808g.f4076a);
                            duration.translationX(c0808g.f4080e - c0808g.f4078c);
                            duration.translationY(c0808g.f4081f - c0808g.f4079d);
                            it = it3;
                            duration.alpha(0.0f).setListener(new C0806f(c0811i2, c0808g, duration, view2, 0)).start();
                        } else {
                            it = it3;
                        }
                        if (view3 != null) {
                            ViewPropertyAnimator animate2 = view3.animate();
                            arrayList3.add(c0808g.f4077b);
                            animate2.translationX(0.0f).translationY(0.0f).setDuration(j2).alpha(1.0f).setListener(new C0806f(c0811i2, c0808g, animate2, view3, 1)).start();
                        }
                        it3 = it;
                    }
                }
            default:
                ArrayList arrayList4 = this.f4033b;
                Iterator it4 = arrayList4.iterator();
                while (true) {
                    boolean hasNext3 = it4.hasNext();
                    C0811i c0811i3 = this.f4034c;
                    if (!hasNext3) {
                        arrayList4.clear();
                        c0811i3.f4097l.remove(arrayList4);
                        break;
                    } else {
                        AbstractC0792W abstractC0792W4 = (AbstractC0792W) it4.next();
                        c0811i3.getClass();
                        View view4 = abstractC0792W4.f3995a;
                        ViewPropertyAnimator animate3 = view4.animate();
                        c0811i3.f4100o.add(abstractC0792W4);
                        animate3.alpha(1.0f).setDuration(c0811i3.f3922c).setListener(new C0802d(c0811i3, abstractC0792W4, view4, animate3)).start();
                    }
                }
        }
    }
}
