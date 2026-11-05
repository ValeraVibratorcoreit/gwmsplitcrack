package p006C;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.altaysoft.t500_split.media.C0639g;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p001A0.RunnableC0018l;
import p003B.AbstractC0035b;
import p003B.C0040g;
import p003B.C0042i;
import p003B.C0043j;
import p003B.InterfaceC0039f;
import p010D1.AbstractC0088l;
import p013F0.RunnableC0099c;
import p016H.AbstractC0116h;
import p016H.C0112d;
import p016H.C0114f;
import p016H.C0115g;
import p016H.CallableC0113e;
import p016H.RunnableC0109a;
import p016H.RunnableC0121m;
import p091o.C1196f;
import p091o.C1201k;

/* renamed from: C.l */
/* loaded from: classes.dex */
public abstract class AbstractC0064l {

    /* renamed from: a */
    public static final AbstractC0088l f210a;

    /* renamed from: b */
    public static final C1196f f211b;

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f210a = new C0066n();
        } else {
            f210a = new C0065m();
        }
        f211b = new C1196f(16);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002d, code lost:
    
        if (r4.equals(r5) == false) goto L15;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m175a(Context context, InterfaceC0039f interfaceC0039f, Resources resources, int i, String str, int i2, int i3, AbstractC0035b abstractC0035b, boolean z2) {
        Typeface mo183u;
        Typeface typeface;
        Typeface typeface2;
        int i4 = 3;
        int i5 = 0;
        int i6 = 1;
        int i7 = -3;
        if (interfaceC0039f instanceof C0042i) {
            C0042i c0042i = (C0042i) interfaceC0039f;
            String str2 = c0042i.f139d;
            mo183u = null;
            if (str2 != null && !str2.isEmpty()) {
                typeface = Typeface.create(str2, 0);
                Typeface create = Typeface.create(Typeface.DEFAULT, 0);
                if (typeface != null) {
                }
            }
            typeface = null;
            if (typeface != null) {
                if (abstractC0035b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0018l(abstractC0035b, i4, typeface));
                }
                return typeface;
            }
            boolean z3 = !z2 ? abstractC0035b != null : c0042i.f138c != 0;
            int i8 = z2 ? c0042i.f137b : -1;
            Handler handler = new Handler(Looper.getMainLooper());
            C0639g c0639g = new C0639g(2);
            c0639g.f3011g = abstractC0035b;
            C0112d c0112d = c0042i.f136a;
            C0043j c0043j = new C0043j(c0639g, i6, handler);
            if (z3) {
                C1196f c1196f = AbstractC0116h.f364a;
                String str3 = ((String) c0112d.f353e) + "-" + i3;
                typeface2 = (Typeface) AbstractC0116h.f364a.m2861a(str3);
                if (typeface2 != null) {
                    handler.post(new RunnableC0099c(c0639g, i6, typeface2));
                } else if (i8 == -1) {
                    C0115g m364a = AbstractC0116h.m364a(str3, context, c0112d, i3);
                    c0043j.m70H(m364a);
                    mo183u = m364a.f362a;
                } else {
                    try {
                        try {
                            try {
                                C0115g c0115g = (C0115g) AbstractC0116h.f365b.submit(new CallableC0113e(str3, context, c0112d, i3, 0)).get(i8, TimeUnit.MILLISECONDS);
                                c0043j.m70H(c0115g);
                                mo183u = c0115g.f362a;
                            } catch (InterruptedException e2) {
                                throw e2;
                            }
                        } catch (ExecutionException e3) {
                            throw new RuntimeException(e3);
                        } catch (TimeoutException unused) {
                            throw new InterruptedException("timeout");
                        }
                    } catch (InterruptedException unused2) {
                        ((Handler) c0043j.f142h).post(new RunnableC0109a((C0639g) c0043j.f141g, i7, i5));
                    }
                }
            } else {
                C1196f c1196f2 = AbstractC0116h.f364a;
                String str4 = ((String) c0112d.f353e) + "-" + i3;
                typeface2 = (Typeface) AbstractC0116h.f364a.m2861a(str4);
                if (typeface2 != null) {
                    handler.post(new RunnableC0099c(c0639g, i6, typeface2));
                } else {
                    C0114f c0114f = new C0114f(i5, c0043j);
                    synchronized (AbstractC0116h.f366c) {
                        try {
                            C1201k c1201k = AbstractC0116h.f367d;
                            ArrayList arrayList = (ArrayList) c1201k.getOrDefault(str4, null);
                            if (arrayList != null) {
                                arrayList.add(c0114f);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(c0114f);
                                c1201k.put(str4, arrayList2);
                                CallableC0113e callableC0113e = new CallableC0113e(str4, context, c0112d, i3, 1);
                                ThreadPoolExecutor threadPoolExecutor = AbstractC0116h.f365b;
                                C0114f c0114f2 = new C0114f(i6, str4);
                                Handler handler2 = Looper.myLooper() == null ? new Handler(Looper.getMainLooper()) : new Handler();
                                RunnableC0121m runnableC0121m = new RunnableC0121m();
                                runnableC0121m.f377b = callableC0113e;
                                runnableC0121m.f378c = c0114f2;
                                runnableC0121m.f379d = handler2;
                                threadPoolExecutor.execute(runnableC0121m);
                            }
                        } finally {
                        }
                    }
                }
            }
            mo183u = typeface2;
        } else {
            mo183u = f210a.mo183u(context, (C0040g) interfaceC0039f, resources, i3);
            if (abstractC0035b != null) {
                if (mo183u != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0018l(abstractC0035b, i4, mo183u));
                } else {
                    abstractC0035b.m51a(-3);
                }
            }
        }
        if (mo183u != null) {
            f211b.m2862b(m176b(resources, i, str, i2, i3), mo183u);
        }
        return mo183u;
    }

    /* renamed from: b */
    public static String m176b(Resources resources, int i, String str, int i2, int i3) {
        return resources.getResourcePackageName(i) + '-' + str + '-' + i2 + '-' + i + '-' + i3;
    }
}
