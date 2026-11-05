package p069f1;

import android.graphics.Path;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import p079k.InterfaceC1029x;
import p079k.MenuC1018m;

/* renamed from: f1.e */
/* loaded from: classes.dex */
public final class C0833e implements InterfaceC0843o, InterfaceC1029x {

    /* renamed from: g */
    public static volatile C0833e f4218g;

    /* renamed from: f */
    public final /* synthetic */ int f4219f;

    public /* synthetic */ C0833e(int i) {
        this.f4219f = i;
    }

    /* renamed from: c */
    public static Path m2361c(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(f2, f3);
        path.lineTo(f4, f5);
        return path;
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: a */
    public void mo1874a(MenuC1018m menuC1018m, boolean z2) {
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: b */
    public boolean mo1875b(MenuC1018m menuC1018m) {
        return false;
    }

    @Override // p069f1.InterfaceC0843o
    /* renamed from: o */
    public Object mo902o() {
        switch (this.f4219f) {
            case 0:
                return new ConcurrentSkipListMap();
            case 1:
                return new ConcurrentHashMap();
            case 2:
                return new TreeMap();
            case 3:
                return new LinkedHashMap();
            default:
                return new C0842n(true);
        }
    }
}
