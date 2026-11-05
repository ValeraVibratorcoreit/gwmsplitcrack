package p052a;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.lifecycle.InterfaceC0551p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;
import p001A0.RunnableC0017k;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p049Y0.C0440f;
import p058c.C0567a;
import p058c.C0570d;
import p058c.C0571e;
import p058c.C0574h;
import p058c.C0575i;
import p058c.InterfaceC0568b;
import p070g.AbstractActivityC0870i;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;
import p122y1.C1688a;
import p122y1.C1690c;
import p122y1.C1692e;
import p123z.AbstractC1695c;

/* renamed from: a.j */
/* loaded from: classes.dex */
public final class C0470j {

    /* renamed from: a */
    public final LinkedHashMap f1490a = new LinkedHashMap();

    /* renamed from: b */
    public final LinkedHashMap f1491b = new LinkedHashMap();

    /* renamed from: c */
    public final LinkedHashMap f1492c = new LinkedHashMap();

    /* renamed from: d */
    public final ArrayList f1493d = new ArrayList();

    /* renamed from: e */
    public final transient LinkedHashMap f1494e = new LinkedHashMap();

    /* renamed from: f */
    public final LinkedHashMap f1495f = new LinkedHashMap();

    /* renamed from: g */
    public final Bundle f1496g = new Bundle();

    /* renamed from: h */
    public final /* synthetic */ AbstractActivityC0870i f1497h;

    public C0470j(AbstractActivityC0870i abstractActivityC0870i) {
        this.f1497h = abstractActivityC0870i;
    }

    /* renamed from: a */
    public final boolean m1179a(int i, int i2, Intent intent) {
        String str = (String) this.f1490a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        C0570d c0570d = (C0570d) this.f1494e.get(str);
        if ((c0570d != null ? c0570d.f2177a : null) != null) {
            ArrayList arrayList = this.f1493d;
            if (arrayList.contains(str)) {
                c0570d.f2177a.mo784b(c0570d.f2178b.mo304e0(intent, i2));
                arrayList.remove(str);
                return true;
            }
        }
        this.f1495f.remove(str);
        this.f1496g.putParcelable(str, new C0567a(intent, i2));
        return true;
    }

    /* renamed from: b */
    public final void m1180b(int i, AbstractC0088l abstractC0088l, Intent intent) {
        Bundle bundle;
        AbstractActivityC0870i abstractActivityC0870i = this.f1497h;
        C0440f mo292O = abstractC0088l.mo292O(abstractActivityC0870i, intent);
        if (mo292O != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0017k(this, i, mo292O, 1));
            return;
        }
        Intent mo321x = abstractC0088l.mo321x(abstractActivityC0870i, intent);
        if (mo321x.getExtras() != null) {
            Bundle extras = mo321x.getExtras();
            AbstractC1461d.m3491b(extras);
            if (extras.getClassLoader() == null) {
                mo321x.setExtrasClassLoader(abstractActivityC0870i.getClassLoader());
            }
        }
        if (mo321x.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = mo321x.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            mo321x.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(mo321x.getAction())) {
            String[] stringArrayExtra = mo321x.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1695c.m4965h(abstractActivityC0870i, stringArrayExtra, i);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(mo321x.getAction())) {
            abstractActivityC0870i.startActivityForResult(mo321x, i, bundle);
            return;
        }
        C0575i c0575i = (C0575i) mo321x.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            AbstractC1461d.m3491b(c0575i);
            abstractActivityC0870i.startIntentSenderForResult(c0575i.f2187a, i, c0575i.f2188b, c0575i.f2189c, c0575i.f2190d, 0, bundle);
        } catch (IntentSender.SendIntentException e2) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0017k(this, i, e2, 2));
        }
    }

    /* renamed from: c */
    public final C0574h m1181c(String str, AbstractC0088l abstractC0088l, InterfaceC0568b interfaceC0568b) {
        AbstractC1461d.m3494e("key", str);
        m1182d(str);
        this.f1494e.put(str, new C0570d(interfaceC0568b, abstractC0088l));
        LinkedHashMap linkedHashMap = this.f1495f;
        if (linkedHashMap.containsKey(str)) {
            Object obj = linkedHashMap.get(str);
            linkedHashMap.remove(str);
            interfaceC0568b.mo784b(obj);
        }
        Bundle bundle = this.f1496g;
        C0567a c0567a = (C0567a) AbstractC1680h.m4877s(bundle, str);
        if (c0567a != null) {
            bundle.remove(str);
            interfaceC0568b.mo784b(abstractC0088l.mo304e0(c0567a.f2172b, c0567a.f2171a));
        }
        return new C0574h(this, str, abstractC0088l);
    }

    /* renamed from: d */
    public final void m1182d(String str) {
        LinkedHashMap linkedHashMap = this.f1491b;
        if (((Integer) linkedHashMap.get(str)) != null) {
            return;
        }
        for (Number number : new C1688a(new C1690c(new C1692e(1)))) {
            int intValue = number.intValue();
            LinkedHashMap linkedHashMap2 = this.f1490a;
            if (!linkedHashMap2.containsKey(Integer.valueOf(intValue))) {
                int intValue2 = number.intValue();
                linkedHashMap2.put(Integer.valueOf(intValue2), str);
                linkedHashMap.put(str, Integer.valueOf(intValue2));
                return;
            }
        }
        throw new NoSuchElementException("Sequence contains no element matching the predicate.");
    }

    /* renamed from: e */
    public final void m1183e(String str) {
        Integer num;
        AbstractC1461d.m3494e("key", str);
        if (!this.f1493d.contains(str) && (num = (Integer) this.f1491b.remove(str)) != null) {
            this.f1490a.remove(num);
        }
        this.f1494e.remove(str);
        LinkedHashMap linkedHashMap = this.f1495f;
        if (linkedHashMap.containsKey(str)) {
            StringBuilder m163q = AbstractC0062j.m163q("Dropping pending result for request ", str, ": ");
            m163q.append(linkedHashMap.get(str));
            Log.w("ActivityResultRegistry", m163q.toString());
            linkedHashMap.remove(str);
        }
        Bundle bundle = this.f1496g;
        if (bundle.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((C0567a) AbstractC1680h.m4877s(bundle, str)));
            bundle.remove(str);
        }
        LinkedHashMap linkedHashMap2 = this.f1492c;
        C0571e c0571e = (C0571e) linkedHashMap2.get(str);
        if (c0571e != null) {
            ArrayList arrayList = c0571e.f2180b;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                c0571e.f2179a.m1382f((InterfaceC0551p) it.next());
            }
            arrayList.clear();
            linkedHashMap2.remove(str);
        }
    }
}
