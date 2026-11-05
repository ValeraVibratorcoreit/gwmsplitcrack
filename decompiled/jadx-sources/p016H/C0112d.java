package p016H;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import java.util.List;
import p001A0.RunnableC0024r;
import p020J.C0145c;
import p068f0.C0796a;
import p068f0.C0827y;
import p070g.DialogInterfaceC0867f;
import p098q0.AbstractC1372y1;
import p109u0.AbstractC1561o;

/* renamed from: H.d */
/* loaded from: classes.dex */
public final class C0112d {

    /* renamed from: a */
    public final /* synthetic */ int f349a;

    /* renamed from: b */
    public final Object f350b;

    /* renamed from: c */
    public Object f351c;

    /* renamed from: d */
    public Object f352d;

    /* renamed from: e */
    public Object f353e;

    /* renamed from: f */
    public Object f354f;

    public C0112d(FrameLayout frameLayout) {
        this.f349a = 3;
        this.f350b = frameLayout;
    }

    /* renamed from: a */
    public boolean m350a(int i) {
        ArrayList arrayList = (ArrayList) this.f352d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0796a c0796a = (C0796a) arrayList.get(i2);
            int i3 = c0796a.f4019a;
            if (i3 == 8) {
                if (m355f(c0796a.f4021c, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = c0796a.f4020b;
                int i5 = c0796a.f4021c + i4;
                while (i4 < i5) {
                    if (m355f(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* renamed from: b */
    public void m351b() {
        RunnableC0024r runnableC0024r = (RunnableC0024r) this.f354f;
        if (runnableC0024r != null) {
            ((FrameLayout) this.f350b).removeCallbacks(runnableC0024r);
            this.f354f = null;
        }
    }

    /* renamed from: c */
    public void m352c() {
        ArrayList arrayList = (ArrayList) this.f352d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((C0827y) this.f353e).m2337a((C0796a) arrayList.get(i));
        }
        m361l(arrayList);
        ArrayList arrayList2 = (ArrayList) this.f351c;
        int size2 = arrayList2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            C0796a c0796a = (C0796a) arrayList2.get(i2);
            int i3 = c0796a.f4019a;
            C0827y c0827y = (C0827y) this.f353e;
            if (i3 == 1) {
                c0827y.m2337a(c0796a);
                c0827y.m2340d(c0796a.f4020b, c0796a.f4021c);
            } else if (i3 == 2) {
                c0827y.m2337a(c0796a);
                int i4 = c0796a.f4020b;
                int i5 = c0796a.f4021c;
                RecyclerView recyclerView = c0827y.f4208a;
                recyclerView.m1502P(i4, true, i5);
                recyclerView.f2094l0 = true;
                recyclerView.f2088i0.f3975c += i5;
            } else if (i3 == 4) {
                c0827y.m2337a(c0796a);
                c0827y.m2339c(c0796a.f4020b, c0796a.f4021c);
            } else if (i3 == 8) {
                c0827y.m2337a(c0796a);
                c0827y.m2341e(c0796a.f4020b, c0796a.f4021c);
            }
        }
        m361l(arrayList2);
    }

    /* renamed from: d */
    public void m353d(C0796a c0796a) {
        int i;
        C0145c c0145c;
        int i2 = c0796a.f4019a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int m363n = m363n(c0796a.f4020b, i2);
        int i3 = c0796a.f4020b;
        int i4 = c0796a.f4019a;
        if (i4 == 2) {
            i = 0;
        } else {
            if (i4 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + c0796a);
            }
            i = 1;
        }
        int i5 = 1;
        int i6 = 1;
        while (true) {
            int i7 = c0796a.f4021c;
            c0145c = (C0145c) this.f350b;
            if (i5 >= i7) {
                break;
            }
            int m363n2 = m363n((i * i5) + c0796a.f4020b, c0796a.f4019a);
            int i8 = c0796a.f4019a;
            if (i8 == 2 ? m363n2 != m363n : !(i8 == 4 && m363n2 == m363n + 1)) {
                C0796a m358i = m358i(i8, m363n, i6);
                m354e(m358i, i3);
                c0145c.mo403c(m358i);
                if (c0796a.f4019a == 4) {
                    i3 += i6;
                }
                i6 = 1;
                m363n = m363n2;
            } else {
                i6++;
            }
            i5++;
        }
        c0145c.mo403c(c0796a);
        if (i6 > 0) {
            C0796a m358i2 = m358i(c0796a.f4019a, m363n, i6);
            m354e(m358i2, i3);
            c0145c.mo403c(m358i2);
        }
    }

    /* renamed from: e */
    public void m354e(C0796a c0796a, int i) {
        C0827y c0827y = (C0827y) this.f353e;
        c0827y.m2337a(c0796a);
        int i2 = c0796a.f4019a;
        if (i2 != 2) {
            if (i2 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            c0827y.m2339c(i, c0796a.f4021c);
        } else {
            int i3 = c0796a.f4021c;
            RecyclerView recyclerView = c0827y.f4208a;
            recyclerView.m1502P(i, true, i3);
            recyclerView.f2094l0 = true;
            recyclerView.f2088i0.f3975c += i3;
        }
    }

    /* renamed from: f */
    public int m355f(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.f352d;
        int size = arrayList.size();
        while (i2 < size) {
            C0796a c0796a = (C0796a) arrayList.get(i2);
            int i3 = c0796a.f4019a;
            if (i3 == 8) {
                int i4 = c0796a.f4020b;
                if (i4 == i) {
                    i = c0796a.f4021c;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (c0796a.f4021c <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = c0796a.f4020b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = c0796a.f4021c;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += c0796a.f4021c;
                }
            }
            i2++;
        }
        return i;
    }

    /* renamed from: g */
    public boolean m356g() {
        return ((ArrayList) this.f351c).size() > 0;
    }

    /* renamed from: h */
    public void m357h() {
        ValueAnimator valueAnimator = (ValueAnimator) this.f353e;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f353e = null;
        }
        m351b();
        View view = (View) this.f351c;
        if (view == null) {
            return;
        }
        view.animate().cancel();
        ((View) this.f351c).setTranslationY(0.0f);
        ((View) this.f351c).setVisibility(8);
    }

    /* renamed from: i */
    public C0796a m358i(int i, int i2, int i3) {
        C0796a c0796a = (C0796a) ((C0145c) this.f350b).mo401a();
        if (c0796a != null) {
            c0796a.f4019a = i;
            c0796a.f4020b = i2;
            c0796a.f4021c = i3;
            return c0796a;
        }
        C0796a c0796a2 = new C0796a();
        c0796a2.f4019a = i;
        c0796a2.f4020b = i2;
        c0796a2.f4021c = i3;
        return c0796a2;
    }

    /* renamed from: j */
    public void m359j(String str) {
        if (((YmSettingsActivity) this.f354f).f2373G != ((DialogInterfaceC0867f) this.f350b) || str == null || str.isEmpty()) {
            return;
        }
        ((TextView) this.f353e).setText(str);
    }

    /* renamed from: k */
    public void m360k(C0796a c0796a) {
        ((ArrayList) this.f352d).add(c0796a);
        int i = c0796a.f4019a;
        C0827y c0827y = (C0827y) this.f353e;
        if (i == 1) {
            c0827y.m2340d(c0796a.f4020b, c0796a.f4021c);
            return;
        }
        if (i == 2) {
            int i2 = c0796a.f4020b;
            int i3 = c0796a.f4021c;
            RecyclerView recyclerView = c0827y.f4208a;
            recyclerView.m1502P(i2, false, i3);
            recyclerView.f2094l0 = true;
            return;
        }
        if (i == 4) {
            c0827y.m2339c(c0796a.f4020b, c0796a.f4021c);
        } else if (i == 8) {
            c0827y.m2341e(c0796a.f4020b, c0796a.f4021c);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + c0796a);
        }
    }

    /* renamed from: l */
    public void m361l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            C0796a c0796a = (C0796a) arrayList.get(i);
            c0796a.getClass();
            ((C0145c) this.f350b).mo403c(c0796a);
        }
        arrayList.clear();
    }

    /* renamed from: m */
    public void m362m() {
        View view = (View) this.f351c;
        FrameLayout frameLayout = (FrameLayout) this.f350b;
        if (view == null) {
            View inflate = LayoutInflater.from(frameLayout.getContext()).inflate(R.layout.ip_reveal_cover, (ViewGroup) frameLayout, false);
            this.f351c = inflate;
            this.f352d = (TextView) inflate.findViewById(R.id.ip_reveal_message);
        }
        if (((View) this.f351c).getParent() != frameLayout) {
            frameLayout.addView((View) this.f351c, new ViewGroup.LayoutParams(-1, -1));
        }
        ((View) this.f351c).animate().cancel();
        ((View) this.f351c).setTranslationY(0.0f);
        ((View) this.f351c).setAlpha(1.0f);
        ((View) this.f351c).setVisibility(0);
        ((View) this.f351c).bringToFront();
        if (((TextView) this.f352d) == null) {
            return;
        }
        Context context = frameLayout.getContext();
        cfgData m1784i = cfgData.m1784i();
        SharedPreferences sharedPreferences = context.getSharedPreferences("T500_SPLIT_AS", 0);
        int i = m1784i.f2540L1;
        if (i <= 0) {
            i = 1;
        }
        ((TextView) this.f352d).setText(context.getString(R.string.ip_reveal_loading_theme, AbstractC1372y1.m3293X(context, sharedPreferences.getInt(AbstractC1561o.m4299c("ipthemes", Integer.toString(i)), m1784i.f2620e1))));
    }

    /* renamed from: n */
    public int m363n(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.f352d;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C0796a c0796a = (C0796a) arrayList.get(size);
            int i5 = c0796a.f4019a;
            if (i5 == 8) {
                int i6 = c0796a.f4020b;
                int i7 = c0796a.f4021c;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            c0796a.f4020b = i6 + 1;
                            c0796a.f4021c = i7 + 1;
                        } else if (i2 == 2) {
                            c0796a.f4020b = i6 - 1;
                            c0796a.f4021c = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        c0796a.f4021c = i7 + 1;
                    } else if (i2 == 2) {
                        c0796a.f4021c = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        c0796a.f4020b = i6 + 1;
                    } else if (i2 == 2) {
                        c0796a.f4020b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = c0796a.f4020b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= c0796a.f4021c;
                    } else if (i5 == 2) {
                        i += c0796a.f4021c;
                    }
                } else if (i2 == 1) {
                    c0796a.f4020b = i8 + 1;
                } else if (i2 == 2) {
                    c0796a.f4020b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            C0796a c0796a2 = (C0796a) arrayList.get(size2);
            int i9 = c0796a2.f4019a;
            C0145c c0145c = (C0145c) this.f350b;
            if (i9 == 8) {
                int i10 = c0796a2.f4021c;
                if (i10 == c0796a2.f4020b || i10 < 0) {
                    arrayList.remove(size2);
                    c0145c.mo403c(c0796a2);
                }
            } else if (c0796a2.f4021c <= 0) {
                arrayList.remove(size2);
                c0145c.mo403c(c0796a2);
            }
        }
        return i;
    }

    public String toString() {
        switch (this.f349a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("FontRequest {mProviderAuthority: " + ((String) this.f350b) + ", mProviderPackage: " + ((String) this.f351c) + ", mQuery: " + ((String) this.f352d) + ", mCertificates:");
                int i = 0;
                while (true) {
                    List list = (List) this.f354f;
                    if (i >= list.size()) {
                        sb.append("}mCertificatesArray: 0");
                        return sb.toString();
                    }
                    sb.append(" [");
                    List list2 = (List) list.get(i);
                    for (int i2 = 0; i2 < list2.size(); i2++) {
                        sb.append(" \"");
                        sb.append(Base64.encodeToString((byte[]) list2.get(i2), 0));
                        sb.append("\"");
                    }
                    sb.append(" ]");
                    i++;
                }
            default:
                return super.toString();
        }
    }

    public C0112d(String str, String str2, String str3, List list) {
        this.f349a = 0;
        str.getClass();
        this.f350b = str;
        str2.getClass();
        this.f351c = str2;
        this.f352d = str3;
        list.getClass();
        this.f354f = list;
        this.f353e = str + "-" + str2 + "-" + str3;
    }

    public C0112d(C0827y c0827y) {
        this.f349a = 1;
        this.f350b = new C0145c(30);
        this.f351c = new ArrayList();
        this.f352d = new ArrayList();
        this.f353e = c0827y;
        this.f354f = new C0639g(21, this);
    }

    public C0112d(YmSettingsActivity ymSettingsActivity, DialogInterfaceC0867f dialogInterfaceC0867f, TextView textView, TextView textView2, TextView textView3) {
        this.f349a = 2;
        this.f354f = ymSettingsActivity;
        this.f350b = dialogInterfaceC0867f;
        this.f351c = textView;
        this.f352d = textView2;
        this.f353e = textView3;
    }
}
