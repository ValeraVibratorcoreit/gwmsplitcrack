package p052a;

import p070g.AbstractActivityC0870i;
import p107t1.AbstractC1461d;

/* renamed from: a.d */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0464d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f1478a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0870i f1479b;

    public /* synthetic */ RunnableC0464d(AbstractActivityC0870i abstractActivityC0870i, int i) {
        this.f1478a = i;
        this.f1479b = abstractActivityC0870i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f1478a) {
            case 0:
                this.f1479b.invalidateOptionsMenu();
                return;
            default:
                try {
                    super/*android.app.Activity*/.onBackPressed();
                    return;
                } catch (IllegalStateException e2) {
                    if (!AbstractC1461d.m3490a(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                        throw e2;
                    }
                    return;
                } catch (NullPointerException e3) {
                    if (!AbstractC1461d.m3490a(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                        throw e3;
                    }
                    return;
                }
        }
    }
}
