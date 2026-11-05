package p077j0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import p006C.AbstractC0062j;

/* renamed from: j0.t */
/* loaded from: classes.dex */
public final class C0989t {

    /* renamed from: b */
    public final View f4726b;

    /* renamed from: a */
    public final HashMap f4725a = new HashMap();

    /* renamed from: c */
    public final ArrayList f4727c = new ArrayList();

    public C0989t(View view) {
        this.f4726b = view;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C0989t)) {
            return false;
        }
        C0989t c0989t = (C0989t) obj;
        return this.f4726b == c0989t.f4726b && this.f4725a.equals(c0989t.f4725a);
    }

    public final int hashCode() {
        return this.f4725a.hashCode() + (this.f4726b.hashCode() * 31);
    }

    public final String toString() {
        String m160n = AbstractC0062j.m160n(("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f4726b + "\n", "    values:");
        HashMap hashMap = this.f4725a;
        for (String str : hashMap.keySet()) {
            m160n = m160n + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return m160n;
    }
}
