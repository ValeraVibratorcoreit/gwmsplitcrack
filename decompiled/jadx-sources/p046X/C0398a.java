package p046X;

import android.util.Log;
import androidx.lifecycle.EnumC0548m;
import com.sun.jna.Platform;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import p048Y.AbstractC0434d;

/* renamed from: X.a */
/* loaded from: classes.dex */
public final class C0398a implements InterfaceC0385M {

    /* renamed from: a */
    public final ArrayList f1228a;

    /* renamed from: b */
    public int f1229b;

    /* renamed from: c */
    public int f1230c;

    /* renamed from: d */
    public int f1231d;

    /* renamed from: e */
    public int f1232e;

    /* renamed from: f */
    public int f1233f;

    /* renamed from: g */
    public boolean f1234g;

    /* renamed from: h */
    public String f1235h;

    /* renamed from: i */
    public int f1236i;

    /* renamed from: j */
    public CharSequence f1237j;

    /* renamed from: k */
    public int f1238k;

    /* renamed from: l */
    public CharSequence f1239l;

    /* renamed from: m */
    public ArrayList f1240m;

    /* renamed from: n */
    public ArrayList f1241n;

    /* renamed from: o */
    public boolean f1242o;

    /* renamed from: p */
    public final C0387O f1243p;

    /* renamed from: q */
    public boolean f1244q;

    /* renamed from: r */
    public int f1245r;

    public C0398a(C0387O c0387o) {
        c0387o.m991E();
        C0427z c0427z = c0387o.f1168t;
        if (c0427z != null) {
            c0427z.f1385l.getClassLoader();
        }
        this.f1228a = new ArrayList();
        this.f1242o = false;
        this.f1245r = -1;
        this.f1243p = c0387o;
    }

    @Override // p046X.InterfaceC0385M
    /* renamed from: a */
    public final boolean mo982a(ArrayList arrayList, ArrayList arrayList2) {
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f1234g) {
            return true;
        }
        C0387O c0387o = this.f1243p;
        if (c0387o.f1152d == null) {
            c0387o.f1152d = new ArrayList();
        }
        c0387o.f1152d.add(this);
        return true;
    }

    /* renamed from: b */
    public final void m1072b(C0395X c0395x) {
        this.f1228a.add(c0395x);
        c0395x.f1215d = this.f1229b;
        c0395x.f1216e = this.f1230c;
        c0395x.f1217f = this.f1231d;
        c0395x.f1218g = this.f1232e;
    }

    /* renamed from: c */
    public final void m1073c(int i) {
        if (this.f1234g) {
            if (Log.isLoggable("FragmentManager", 2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i);
            }
            ArrayList arrayList = this.f1228a;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                C0395X c0395x = (C0395X) arrayList.get(i2);
                AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0395x.f1213b;
                if (abstractComponentCallbacksC0423v != null) {
                    abstractComponentCallbacksC0423v.f1373v += i;
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Log.v("FragmentManager", "Bump nesting of " + c0395x.f1213b + " to " + c0395x.f1213b.f1373v);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public final int m1074d(boolean z2) {
        if (this.f1244q) {
            throw new IllegalStateException("commit already called");
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new C0397Z());
            m1076f("  ", printWriter, true);
            printWriter.close();
        }
        this.f1244q = true;
        boolean z3 = this.f1234g;
        C0387O c0387o = this.f1243p;
        if (z3) {
            this.f1245r = c0387o.f1157i.getAndIncrement();
        } else {
            this.f1245r = -1;
        }
        c0387o.m1035w(this, z2);
        return this.f1245r;
    }

    /* renamed from: e */
    public final void m1075e(int i, AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, String str, int i2) {
        String str2 = abstractComponentCallbacksC0423v.f1349Q;
        if (str2 != null) {
            AbstractC0434d.m1144c(abstractComponentCallbacksC0423v, str2);
        }
        Class<?> cls = abstractComponentCallbacksC0423v.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = abstractComponentCallbacksC0423v.f1335C;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + abstractComponentCallbacksC0423v + ": was " + abstractComponentCallbacksC0423v.f1335C + " now " + str);
            }
            abstractComponentCallbacksC0423v.f1335C = str;
        }
        if (i != 0) {
            if (i == -1) {
                throw new IllegalArgumentException("Can't add fragment " + abstractComponentCallbacksC0423v + " with tag " + str + " to container view with no id");
            }
            int i3 = abstractComponentCallbacksC0423v.f1333A;
            if (i3 != 0 && i3 != i) {
                throw new IllegalStateException("Can't change container ID of fragment " + abstractComponentCallbacksC0423v + ": was " + abstractComponentCallbacksC0423v.f1333A + " now " + i);
            }
            abstractComponentCallbacksC0423v.f1333A = i;
            abstractComponentCallbacksC0423v.f1334B = i;
        }
        m1072b(new C0395X(i2, abstractComponentCallbacksC0423v));
        abstractComponentCallbacksC0423v.f1374w = this.f1243p;
    }

    /* renamed from: f */
    public final void m1076f(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f1235h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f1245r);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f1244q);
            if (this.f1233f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f1233f));
            }
            if (this.f1229b != 0 || this.f1230c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1229b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1230c));
            }
            if (this.f1231d != 0 || this.f1232e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f1231d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f1232e));
            }
            if (this.f1236i != 0 || this.f1237j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1236i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f1237j);
            }
            if (this.f1238k != 0 || this.f1239l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f1238k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f1239l);
            }
        }
        ArrayList arrayList = this.f1228a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0395X c0395x = (C0395X) arrayList.get(i);
            switch (c0395x.f1212a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case Platform.GNU /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case Platform.KFREEBSD /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + c0395x.f1212a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(c0395x.f1213b);
            if (z2) {
                if (c0395x.f1215d != 0 || c0395x.f1216e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(c0395x.f1215d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(c0395x.f1216e));
                }
                if (c0395x.f1217f != 0 || c0395x.f1218g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(c0395x.f1217f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(c0395x.f1218g));
                }
            }
        }
    }

    /* renamed from: g */
    public final void m1077g(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        C0387O c0387o = abstractComponentCallbacksC0423v.f1374w;
        if (c0387o == null || c0387o == this.f1243p) {
            m1072b(new C0395X(3, abstractComponentCallbacksC0423v));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0423v.toString() + " is already attached to a FragmentManager.");
    }

    /* renamed from: h */
    public final void m1078h(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v, EnumC0548m enumC0548m) {
        C0387O c0387o = abstractComponentCallbacksC0423v.f1374w;
        C0387O c0387o2 = this.f1243p;
        if (c0387o != c0387o2) {
            throw new IllegalArgumentException("Cannot setMaxLifecycle for Fragment not attached to FragmentManager " + c0387o2);
        }
        if (enumC0548m == EnumC0548m.f1991b && abstractComponentCallbacksC0423v.f1357f > -1) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0548m + " after the Fragment has been created");
        }
        if (enumC0548m == EnumC0548m.f1990a) {
            throw new IllegalArgumentException("Cannot set maximum Lifecycle to " + enumC0548m + ". Use remove() to remove the fragment from the FragmentManager and trigger its destruction.");
        }
        C0395X c0395x = new C0395X();
        c0395x.f1212a = 10;
        c0395x.f1213b = abstractComponentCallbacksC0423v;
        c0395x.f1214c = false;
        c0395x.f1219h = abstractComponentCallbacksC0423v.f1350R;
        c0395x.f1220i = enumC0548m;
        m1072b(c0395x);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f1245r >= 0) {
            sb.append(" #");
            sb.append(this.f1245r);
        }
        if (this.f1235h != null) {
            sb.append(" ");
            sb.append(this.f1235h);
        }
        sb.append("}");
        return sb.toString();
    }
}
