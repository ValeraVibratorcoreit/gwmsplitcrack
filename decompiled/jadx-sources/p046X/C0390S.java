package p046X;

import android.util.Log;
import androidx.lifecycle.AbstractC0532O;
import androidx.lifecycle.C0534Q;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.S */
/* loaded from: classes.dex */
public final class C0390S extends AbstractC0532O {

    /* renamed from: h */
    public static final C0389Q f1184h = new C0389Q(0);

    /* renamed from: e */
    public final boolean f1188e;

    /* renamed from: b */
    public final HashMap f1185b = new HashMap();

    /* renamed from: c */
    public final HashMap f1186c = new HashMap();

    /* renamed from: d */
    public final HashMap f1187d = new HashMap();

    /* renamed from: f */
    public boolean f1189f = false;

    /* renamed from: g */
    public boolean f1190g = false;

    public C0390S(boolean z2) {
        this.f1188e = z2;
    }

    @Override // androidx.lifecycle.AbstractC0532O
    /* renamed from: b */
    public final void mo1040b() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f1189f = true;
    }

    /* renamed from: c */
    public final void m1041c(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + abstractComponentCallbacksC0423v);
        }
        m1042d(abstractComponentCallbacksC0423v.f1361j);
    }

    /* renamed from: d */
    public final void m1042d(String str) {
        HashMap hashMap = this.f1186c;
        C0390S c0390s = (C0390S) hashMap.get(str);
        if (c0390s != null) {
            c0390s.mo1040b();
            hashMap.remove(str);
        }
        HashMap hashMap2 = this.f1187d;
        C0534Q c0534q = (C0534Q) hashMap2.get(str);
        if (c0534q != null) {
            c0534q.m1370a();
            hashMap2.remove(str);
        }
    }

    /* renamed from: e */
    public final void m1043e(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        if (this.f1190g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f1185b.remove(abstractComponentCallbacksC0423v.f1361j) == null || !Log.isLoggable("FragmentManager", 2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + abstractComponentCallbacksC0423v);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0390S.class != obj.getClass()) {
            return false;
        }
        C0390S c0390s = (C0390S) obj;
        return this.f1185b.equals(c0390s.f1185b) && this.f1186c.equals(c0390s.f1186c) && this.f1187d.equals(c0390s.f1187d);
    }

    public final int hashCode() {
        return this.f1187d.hashCode() + ((this.f1186c.hashCode() + (this.f1185b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FragmentManagerViewModel{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("} Fragments (");
        Iterator it = this.f1185b.values().iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") Child Non Config (");
        Iterator it2 = this.f1186c.keySet().iterator();
        while (it2.hasNext()) {
            sb.append((String) it2.next());
            if (it2.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(") ViewModelStores (");
        Iterator it3 = this.f1187d.keySet().iterator();
        while (it3.hasNext()) {
            sb.append((String) it3.next());
            if (it3.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append(')');
        return sb.toString();
    }
}
