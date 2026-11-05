package p036S;

import android.graphics.Rect;
import java.util.Comparator;
import p024L.C0240j;
import p045W0.C0355e;

/* renamed from: S.c */
/* loaded from: classes.dex */
public final class C0303c implements Comparator {

    /* renamed from: a */
    public final Rect f848a = new Rect();

    /* renamed from: b */
    public final Rect f849b = new Rect();

    /* renamed from: c */
    public final boolean f850c;

    /* renamed from: d */
    public final C0355e f851d;

    public C0303c(boolean z2, C0355e c0355e) {
        this.f850c = z2;
        this.f851d = c0355e;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f851d.getClass();
        Rect rect = this.f848a;
        ((C0240j) obj).m733f(rect);
        Rect rect2 = this.f849b;
        ((C0240j) obj2).m733f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z2 = this.f850c;
        if (i3 < i4) {
            return z2 ? 1 : -1;
        }
        if (i3 > i4) {
            return z2 ? -1 : 1;
        }
        int i5 = rect.bottom;
        int i6 = rect2.bottom;
        if (i5 < i6) {
            return -1;
        }
        if (i5 > i6) {
            return 1;
        }
        int i7 = rect.right;
        int i8 = rect2.right;
        if (i7 < i8) {
            return z2 ? 1 : -1;
        }
        if (i7 > i8) {
            return z2 ? -1 : 1;
        }
        return 0;
    }
}
