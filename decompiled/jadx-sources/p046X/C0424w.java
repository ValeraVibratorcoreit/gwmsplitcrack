package p046X;

import android.os.Bundle;
import androidx.lifecycle.EnumC0547l;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p052a.C0470j;
import p070g.AbstractActivityC0870i;
import p071g0.InterfaceC0890c;

/* renamed from: X.w */
/* loaded from: classes.dex */
public final /* synthetic */ class C0424w implements InterfaceC0890c {

    /* renamed from: a */
    public final /* synthetic */ int f1378a;

    /* renamed from: b */
    public final /* synthetic */ Object f1379b;

    public /* synthetic */ C0424w(int i, Object obj) {
        this.f1378a = i;
        this.f1379b = obj;
    }

    @Override // p071g0.InterfaceC0890c
    /* renamed from: a */
    public final Bundle mo1140a() {
        switch (this.f1378a) {
            case 0:
                AbstractActivityC0870i abstractActivityC0870i = (AbstractActivityC0870i) this.f1379b;
                while (AbstractActivityC0870i.m2403n(abstractActivityC0870i.m2405l())) {
                }
                abstractActivityC0870i.f4368z.m1380d(EnumC0547l.ON_STOP);
                return new Bundle();
            case 1:
                AbstractActivityC0870i abstractActivityC0870i2 = (AbstractActivityC0870i) this.f1379b;
                Bundle bundle = new Bundle();
                C0470j c0470j = abstractActivityC0870i2.f1509n;
                c0470j.getClass();
                LinkedHashMap linkedHashMap = c0470j.f1491b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(c0470j.f1493d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(c0470j.f1496g));
                return bundle;
            default:
                return ((C0387O) this.f1379b).m1004U();
        }
    }
}
