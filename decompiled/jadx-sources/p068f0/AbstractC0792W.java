package p068f0;

import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.sun.jna.Function;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import p022K.AbstractC0169Q;

/* renamed from: f0.W */
/* loaded from: classes.dex */
public abstract class AbstractC0792W {

    /* renamed from: s */
    public static final List f3994s = Collections.emptyList();

    /* renamed from: a */
    public final View f3995a;

    /* renamed from: b */
    public WeakReference f3996b;

    /* renamed from: j */
    public int f4004j;

    /* renamed from: r */
    public RecyclerView f4012r;

    /* renamed from: c */
    public int f3997c = -1;

    /* renamed from: d */
    public int f3998d = -1;

    /* renamed from: e */
    public long f3999e = -1;

    /* renamed from: f */
    public int f4000f = -1;

    /* renamed from: g */
    public int f4001g = -1;

    /* renamed from: h */
    public AbstractC0792W f4002h = null;

    /* renamed from: i */
    public AbstractC0792W f4003i = null;

    /* renamed from: k */
    public final ArrayList f4005k = null;

    /* renamed from: l */
    public final List f4006l = null;

    /* renamed from: m */
    public int f4007m = 0;

    /* renamed from: n */
    public C0784N f4008n = null;

    /* renamed from: o */
    public boolean f4009o = false;

    /* renamed from: p */
    public int f4010p = 0;

    /* renamed from: q */
    public int f4011q = -1;

    public AbstractC0792W(View view) {
        if (view == null) {
            throw new IllegalArgumentException("itemView may not be null");
        }
        this.f3995a = view;
    }

    /* renamed from: a */
    public final void m2268a(int i) {
        this.f4004j = i | this.f4004j;
    }

    /* renamed from: b */
    public final int m2269b() {
        int i = this.f4001g;
        return i == -1 ? this.f3997c : i;
    }

    /* renamed from: c */
    public final List m2270c() {
        ArrayList arrayList;
        return ((this.f4004j & 1024) != 0 || (arrayList = this.f4005k) == null || arrayList.size() == 0) ? f3994s : this.f4006l;
    }

    /* renamed from: d */
    public final boolean m2271d(int i) {
        return (i & this.f4004j) != 0;
    }

    /* renamed from: e */
    public final boolean m2272e() {
        View view = this.f3995a;
        return (view.getParent() == null || view.getParent() == this.f4012r) ? false : true;
    }

    /* renamed from: f */
    public final boolean m2273f() {
        return (this.f4004j & 1) != 0;
    }

    /* renamed from: g */
    public final boolean m2274g() {
        return (this.f4004j & 4) != 0;
    }

    /* renamed from: h */
    public final boolean m2275h() {
        if ((this.f4004j & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (!this.f3995a.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m2276i() {
        return (this.f4004j & 8) != 0;
    }

    /* renamed from: j */
    public final boolean m2277j() {
        return this.f4008n != null;
    }

    /* renamed from: k */
    public final boolean m2278k() {
        return (this.f4004j & Function.MAX_NARGS) != 0;
    }

    /* renamed from: l */
    public final boolean m2279l() {
        return (this.f4004j & 2) != 0;
    }

    /* renamed from: m */
    public final void m2280m(int i, boolean z2) {
        if (this.f3998d == -1) {
            this.f3998d = this.f3997c;
        }
        if (this.f4001g == -1) {
            this.f4001g = this.f3997c;
        }
        if (z2) {
            this.f4001g += i;
        }
        this.f3997c += i;
        View view = this.f3995a;
        if (view.getLayoutParams() != null) {
            ((C0779I) view.getLayoutParams()).f3949c = true;
        }
    }

    /* renamed from: n */
    public final void m2281n() {
        this.f4004j = 0;
        this.f3997c = -1;
        this.f3998d = -1;
        this.f3999e = -1L;
        this.f4001g = -1;
        this.f4007m = 0;
        this.f4002h = null;
        this.f4003i = null;
        ArrayList arrayList = this.f4005k;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.f4004j &= -1025;
        this.f4010p = 0;
        this.f4011q = -1;
        RecyclerView.m1488j(this);
    }

    /* renamed from: o */
    public final void m2282o(boolean z2) {
        int i = this.f4007m;
        int i2 = z2 ? i - 1 : i + 1;
        this.f4007m = i2;
        if (i2 < 0) {
            this.f4007m = 0;
            Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            return;
        }
        if (!z2 && i2 == 1) {
            this.f4004j |= 16;
        } else if (z2 && i2 == 0) {
            this.f4004j &= -17;
        }
    }

    /* renamed from: p */
    public final boolean m2283p() {
        return (this.f4004j & 128) != 0;
    }

    /* renamed from: q */
    public final boolean m2284q() {
        return (this.f4004j & 32) != 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName()) + "{" + Integer.toHexString(hashCode()) + " position=" + this.f3997c + " id=" + this.f3999e + ", oldPos=" + this.f3998d + ", pLpos:" + this.f4001g);
        if (m2277j()) {
            sb.append(" scrap ");
            sb.append(this.f4009o ? "[changeScrap]" : "[attachedScrap]");
        }
        if (m2274g()) {
            sb.append(" invalid");
        }
        if (!m2273f()) {
            sb.append(" unbound");
        }
        if ((this.f4004j & 2) != 0) {
            sb.append(" update");
        }
        if (m2276i()) {
            sb.append(" removed");
        }
        if (m2283p()) {
            sb.append(" ignored");
        }
        if (m2278k()) {
            sb.append(" tmpDetached");
        }
        if (!m2275h()) {
            sb.append(" not recyclable(" + this.f4007m + ")");
        }
        if ((this.f4004j & 512) != 0 || m2274g()) {
            sb.append(" undefined adapter position");
        }
        if (this.f3995a.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
