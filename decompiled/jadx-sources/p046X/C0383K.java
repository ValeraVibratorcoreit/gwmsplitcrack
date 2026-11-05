package p046X;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import p010D1.AbstractC0088l;
import p049Y0.C0440f;
import p058c.C0567a;
import p058c.C0575i;
import p070g.AbstractActivityC0870i;
import p087m1.C1167b;
import p090n1.AbstractC1190n;
import p090n1.C1188l;
import p107t1.AbstractC1461d;
import p123z.AbstractC1695c;

/* renamed from: X.K */
/* loaded from: classes.dex */
public final class C0383K extends AbstractC0088l {

    /* renamed from: c */
    public final /* synthetic */ int f1131c;

    public /* synthetic */ C0383K(int i) {
        this.f1131c = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010D1.AbstractC0088l
    /* renamed from: O */
    public C0440f mo292O(AbstractActivityC0870i abstractActivityC0870i, Intent intent) {
        switch (this.f1131c) {
            case 1:
                String[] strArr = (String[]) intent;
                AbstractC1461d.m3494e("input", strArr);
                if (strArr.length == 0) {
                    return new C0440f(C1188l.f5369a);
                }
                for (String str : strArr) {
                    if (AbstractC1695c.m4958a(abstractActivityC0870i, str) != 0) {
                        return null;
                    }
                }
                int m2835c0 = AbstractC1190n.m2835c0(strArr.length);
                if (m2835c0 < 16) {
                    m2835c0 = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(m2835c0);
                for (String str2 : strArr) {
                    linkedHashMap.put(str2, Boolean.TRUE);
                }
                return new C0440f(linkedHashMap);
            default:
                return super.mo292O(abstractActivityC0870i, intent);
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: e0 */
    public final Object mo304e0(Intent intent, int i) {
        switch (this.f1131c) {
            case 0:
                return new C0567a(intent, i);
            case 1:
                C1188l c1188l = C1188l.f5369a;
                if (i != -1 || intent == null) {
                    return c1188l;
                }
                String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                if (intArrayExtra == null || stringArrayExtra == null) {
                    return c1188l;
                }
                ArrayList arrayList = new ArrayList(intArrayExtra.length);
                for (int i2 : intArrayExtra) {
                    arrayList.add(Boolean.valueOf(i2 == 0));
                }
                ArrayList arrayList2 = new ArrayList();
                for (String str : stringArrayExtra) {
                    if (str != null) {
                        arrayList2.add(str);
                    }
                }
                Iterator it = arrayList2.iterator();
                Iterator it2 = arrayList.iterator();
                ArrayList arrayList3 = new ArrayList(Math.min(arrayList2.size(), arrayList.size()));
                while (it.hasNext() && it2.hasNext()) {
                    arrayList3.add(new C1167b(it.next(), it2.next()));
                }
                return AbstractC1190n.m2836d0(arrayList3);
            default:
                return new C0567a(intent, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p010D1.AbstractC0088l
    /* renamed from: x */
    public final Intent mo321x(AbstractActivityC0870i abstractActivityC0870i, Intent intent) {
        Bundle bundleExtra;
        switch (this.f1131c) {
            case 0:
                C0575i c0575i = (C0575i) intent;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent3 = c0575i.f2188b;
                if (intent3 != null && (bundleExtra = intent3.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    intent2.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent3.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent3.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        c0575i = new C0575i(c0575i.f2187a, null, c0575i.f2189c, c0575i.f2190d);
                    }
                }
                intent2.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", c0575i);
                if (Log.isLoggable("FragmentManager", 2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent2);
                }
                return intent2;
            case 1:
                String[] strArr = (String[]) intent;
                AbstractC1461d.m3494e("input", strArr);
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
                AbstractC1461d.m3493d("Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)", putExtra);
                return putExtra;
            default:
                AbstractC1461d.m3494e("input", intent);
                return intent;
        }
    }
}
