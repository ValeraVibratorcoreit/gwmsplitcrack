package p052a;

import android.content.res.Resources;
import p104s1.InterfaceC1428l;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1462e;

/* renamed from: a.E */
/* loaded from: classes.dex */
public final class C0459E extends AbstractC1462e implements InterfaceC1428l {

    /* renamed from: b */
    public static final C0459E f1470b = new C0459E(1);

    @Override // p104s1.InterfaceC1428l
    /* renamed from: c */
    public final Object mo1171c(Object obj) {
        Resources resources = (Resources) obj;
        AbstractC1461d.m3494e("resources", resources);
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
