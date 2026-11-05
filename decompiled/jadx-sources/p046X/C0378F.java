package p046X;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;
import p038T.C0326t;
import p058c.C0567a;
import p058c.InterfaceC0568b;

/* renamed from: X.F */
/* loaded from: classes.dex */
public final class C0378F implements InterfaceC0568b {

    /* renamed from: f */
    public final /* synthetic */ int f1121f;

    /* renamed from: g */
    public final /* synthetic */ C0387O f1122g;

    public /* synthetic */ C0378F(C0387O c0387o, int i) {
        this.f1121f = i;
        this.f1122g = c0387o;
    }

    @Override // p058c.InterfaceC0568b
    /* renamed from: b */
    public final void mo784b(Object obj) {
        switch (this.f1121f) {
            case 0:
                Map map = (Map) obj;
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                C0387O c0387o = this.f1122g;
                C0384L c0384l = (C0384L) c0387o.f1138C.pollFirst();
                if (c0384l == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    break;
                } else {
                    C0326t c0326t = c0387o.f1151c;
                    String str = c0384l.f1132a;
                    if (c0326t.m911d(str) == null) {
                        Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                        break;
                    }
                }
                break;
            case 1:
                C0567a c0567a = (C0567a) obj;
                C0387O c0387o2 = this.f1122g;
                C0384L c0384l2 = (C0384L) c0387o2.f1138C.pollLast();
                if (c0384l2 == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    break;
                } else {
                    C0326t c0326t2 = c0387o2.f1151c;
                    String str2 = c0384l2.f1132a;
                    AbstractComponentCallbacksC0423v m911d = c0326t2.m911d(str2);
                    if (m911d == null) {
                        Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str2);
                        break;
                    } else {
                        m911d.m1137u(c0384l2.f1133b, c0567a.f2171a, c0567a.f2172b);
                        break;
                    }
                }
            default:
                C0567a c0567a2 = (C0567a) obj;
                C0387O c0387o3 = this.f1122g;
                C0384L c0384l3 = (C0384L) c0387o3.f1138C.pollFirst();
                if (c0384l3 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    break;
                } else {
                    C0326t c0326t3 = c0387o3.f1151c;
                    String str3 = c0384l3.f1132a;
                    AbstractComponentCallbacksC0423v m911d2 = c0326t3.m911d(str3);
                    if (m911d2 == null) {
                        Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str3);
                        break;
                    } else {
                        m911d2.m1137u(c0384l3.f1133b, c0567a2.f2171a, c0567a2.f2172b);
                        break;
                    }
                }
        }
    }
}
