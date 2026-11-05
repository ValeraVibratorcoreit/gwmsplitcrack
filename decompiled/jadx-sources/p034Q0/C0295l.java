package p034Q0;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p068f0.C0816n;
import p097q.C1242f;
import p124z0.C1708g;

/* renamed from: Q0.l */
/* loaded from: classes.dex */
public final class C0295l implements Comparator {

    /* renamed from: a */
    public final /* synthetic */ int f826a;

    public /* synthetic */ C0295l(int i) {
        this.f826a = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0061, code lost:
    
        if (r3 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
    
        r0 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x006d, code lost:
    
        if (r3 != false) goto L31;
     */
    @Override // java.util.Comparator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int compare(Object obj, Object obj2) {
        int i = 1;
        switch (this.f826a) {
            case 0:
                return ((View) obj).getTop() - ((View) obj2).getTop();
            case 1:
                return Integer.compare(((int[]) obj)[0], ((int[]) obj2)[0]);
            case 2:
                C0816n c0816n = (C0816n) obj;
                C0816n c0816n2 = (C0816n) obj2;
                RecyclerView recyclerView = c0816n.f4144d;
                if ((recyclerView == null) == (c0816n2.f4144d == null)) {
                    boolean z2 = c0816n.f4141a;
                    if (z2 == c0816n2.f4141a) {
                        i = c0816n2.f4142b - c0816n.f4142b;
                        if (i == 0) {
                            int i2 = c0816n.f4143c - c0816n2.f4143c;
                            if (i2 != 0) {
                                return i2;
                            }
                            return 0;
                        }
                    }
                    return i;
                }
                break;
            case 3:
                return ((Comparable) obj).compareTo((Comparable) obj2);
            case 4:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 5:
                return ((C1242f) obj).f5531b - ((C1242f) obj2).f5531b;
            case 6:
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                float m432m = AbstractC0158F.m432m((View) obj);
                float m432m2 = AbstractC0158F.m432m((View) obj2);
                if (m432m > m432m2) {
                    return -1;
                }
                return m432m < m432m2 ? 1 : 0;
            default:
                return ((C1708g) obj).f9654b.compareToIgnoreCase(((C1708g) obj2).f9654b);
        }
    }
}
