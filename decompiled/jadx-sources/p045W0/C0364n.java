package p045W0;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.Iterator;
import p043V0.C0349a;

/* renamed from: W0.n */
/* loaded from: classes.dex */
public final class C0364n extends AbstractC0370t {

    /* renamed from: c */
    public final /* synthetic */ ArrayList f1085c;

    /* renamed from: d */
    public final /* synthetic */ Matrix f1086d;

    public C0364n(ArrayList arrayList, Matrix matrix) {
        this.f1085c = arrayList;
        this.f1086d = matrix;
    }

    @Override // p045W0.AbstractC0370t
    /* renamed from: a */
    public final void mo971a(Matrix matrix, C0349a c0349a, int i, Canvas canvas) {
        Iterator it = this.f1085c.iterator();
        while (it.hasNext()) {
            ((AbstractC0370t) it.next()).mo971a(this.f1086d, c0349a, i, canvas);
        }
    }
}
