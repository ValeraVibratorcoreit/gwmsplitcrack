package p046X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import p052a.AbstractActivityC0472l;
import p052a.C0470j;
import p055b.InterfaceC0563b;
import p070g.AbstractActivityC0870i;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1466i;
import p110u1.InterfaceC1588a;

/* renamed from: X.y */
/* loaded from: classes.dex */
public final /* synthetic */ class C0426y implements InterfaceC0563b {

    /* renamed from: a */
    public final /* synthetic */ int f1382a;

    /* renamed from: b */
    public final /* synthetic */ AbstractActivityC0870i f1383b;

    public /* synthetic */ C0426y(AbstractActivityC0870i abstractActivityC0870i, int i) {
        this.f1382a = i;
        this.f1383b = abstractActivityC0870i;
    }

    @Override // p055b.InterfaceC0563b
    /* renamed from: a */
    public final void mo1141a(AbstractActivityC0472l abstractActivityC0472l) {
        switch (this.f1382a) {
            case 0:
                C0427z c0427z = (C0427z) this.f1383b.f4367y.f3011g;
                c0427z.f1387n.m1011b(c0427z, c0427z, null);
                return;
            default:
                AbstractActivityC0870i abstractActivityC0870i = this.f1383b;
                AbstractC1461d.m3494e("it", abstractActivityC0472l);
                Bundle m2463c = abstractActivityC0870i.f1504i.f4475b.m2463c("android:support:activity-result");
                if (m2463c != null) {
                    C0470j c0470j = abstractActivityC0870i.f1509n;
                    c0470j.getClass();
                    ArrayList<Integer> integerArrayList = m2463c.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
                    ArrayList<String> stringArrayList = m2463c.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
                    if (stringArrayList == null || integerArrayList == null) {
                        return;
                    }
                    ArrayList<String> stringArrayList2 = m2463c.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
                    if (stringArrayList2 != null) {
                        c0470j.f1493d.addAll(stringArrayList2);
                    }
                    Bundle bundle = m2463c.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
                    Bundle bundle2 = c0470j.f1496g;
                    if (bundle != null) {
                        bundle2.putAll(bundle);
                    }
                    int size = stringArrayList.size();
                    for (int i = 0; i < size; i++) {
                        String str = stringArrayList.get(i);
                        LinkedHashMap linkedHashMap = c0470j.f1491b;
                        boolean containsKey = linkedHashMap.containsKey(str);
                        LinkedHashMap linkedHashMap2 = c0470j.f1490a;
                        if (containsKey) {
                            Integer num = (Integer) linkedHashMap.remove(str);
                            if (bundle2.containsKey(str)) {
                                continue;
                            } else {
                                if (linkedHashMap2 instanceof InterfaceC1588a) {
                                    ClassCastException classCastException = new ClassCastException((linkedHashMap2 == null ? "null" : linkedHashMap2.getClass().getName()).concat(" cannot be cast to kotlin.collections.MutableMap"));
                                    AbstractC1461d.m3495f(classCastException, AbstractC1466i.class.getName());
                                    throw classCastException;
                                }
                                linkedHashMap2.remove(num);
                            }
                        }
                        Integer num2 = integerArrayList.get(i);
                        AbstractC1461d.m3493d("rcs[i]", num2);
                        int intValue = num2.intValue();
                        String str2 = stringArrayList.get(i);
                        AbstractC1461d.m3493d("keys[i]", str2);
                        String str3 = str2;
                        linkedHashMap2.put(Integer.valueOf(intValue), str3);
                        linkedHashMap.put(str3, Integer.valueOf(intValue));
                    }
                    return;
                }
                return;
        }
    }
}
