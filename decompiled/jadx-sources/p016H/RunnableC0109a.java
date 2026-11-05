package p016H;

import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.datepicker.C0670k;
import java.util.ArrayList;
import java.util.List;
import p003B.AbstractC0035b;
import p038T.AbstractC0313g;
import p095p0.C1234m;
import p121y0.AbstractC1687o;

/* renamed from: H.a */
/* loaded from: classes.dex */
public final class RunnableC0109a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f345a;

    /* renamed from: b */
    public final int f346b;

    /* renamed from: c */
    public final Object f347c;

    public /* synthetic */ RunnableC0109a(Object obj, int i, int i2) {
        this.f345a = i2;
        this.f347c = obj;
        this.f346b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f345a) {
            case 0:
                AbstractC0035b abstractC0035b = (AbstractC0035b) ((C0639g) this.f347c).f3011g;
                if (abstractC0035b != null) {
                    abstractC0035b.mo52g(this.f346b);
                    break;
                }
                break;
            case 1:
                ArrayList arrayList = (ArrayList) this.f347c;
                int size = arrayList.size();
                int i = 0;
                if (this.f346b == 1) {
                    while (i < size) {
                        ((AbstractC0313g) arrayList.get(i)).mo893a();
                        i++;
                    }
                    break;
                } else {
                    while (i < size) {
                        ((AbstractC0313g) arrayList.get(i)).getClass();
                        i++;
                    }
                    break;
                }
            case 2:
                ((C0670k) this.f347c).f3504g0.m1514b0(this.f346b);
                break;
            default:
                ((C1234m) this.f347c).m1514b0(this.f346b);
                break;
        }
    }

    public RunnableC0109a(int i, C1234m c1234m) {
        this.f345a = 3;
        this.f346b = i;
        this.f347c = c1234m;
    }

    public RunnableC0109a(List list, int i, Throwable th) {
        this.f345a = 1;
        AbstractC1687o.m4939h("initCallbacks cannot be null", list);
        this.f347c = new ArrayList(list);
        this.f346b = i;
    }
}
