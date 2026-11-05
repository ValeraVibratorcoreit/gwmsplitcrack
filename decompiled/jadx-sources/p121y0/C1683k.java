package p121y0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import p118x0.RunnableC1658n;

/* renamed from: y0.k */
/* loaded from: classes.dex */
public final class C1683k {

    /* renamed from: s */
    public static C1683k f9580s;

    /* renamed from: a */
    public final Context f9581a;

    /* renamed from: b */
    public final Handler f9582b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final cfgData f9583c;

    /* renamed from: d */
    public final carData f9584d;

    /* renamed from: e */
    public boolean f9585e;

    /* renamed from: f */
    public long f9586f;

    /* renamed from: g */
    public long f9587g;

    /* renamed from: h */
    public long f9588h;

    /* renamed from: i */
    public final ArrayList f9589i;

    /* renamed from: j */
    public final ArrayList f9590j;

    /* renamed from: k */
    public C1685m f9591k;

    /* renamed from: l */
    public boolean f9592l;

    /* renamed from: m */
    public boolean f9593m;

    /* renamed from: n */
    public float f9594n;

    /* renamed from: o */
    public final C1675c f9595o;

    /* renamed from: p */
    public ArrayList f9596p;

    /* renamed from: q */
    public final RunnableC1658n f9597q;

    /* renamed from: r */
    public int f9598r;

    public C1683k(Context context) {
        cfgData m1784i = cfgData.m1784i();
        this.f9583c = m1784i;
        carData cardata = carData.getInstance();
        this.f9584d = cardata;
        this.f9589i = new ArrayList();
        this.f9590j = new ArrayList();
        this.f9594n = Float.NaN;
        this.f9595o = new C1675c(m1784i, cardata);
        this.f9597q = new RunnableC1658n(4, this);
        this.f9598r = -1;
        this.f9581a = context.getApplicationContext();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(41:2|3|(1:5)(1:105)|6|(32:8|(1:10)|11|(1:13)|14|(1:16)|17|(1:19)|20|21|22|(1:102)(1:26)|(1:32)|33|(1:37)|(4:39|(1:48)|43|(1:47))|49|(4:57|(1:67)|61|(1:65))|68|(1:70)|71|(2:73|(1:75))|76|(1:78)|79|(1:81)(1:101)|82|83|(1:85)|86|(2:94|(1:100))(1:90)|91)|104|11|(0)|14|(0)|17|(0)|20|21|22|(1:24)|102|(2:28|32)|33|(2:35|37)|(0)|49|(9:51|53|55|57|(1:59)|67|61|(1:63)|65)|68|(0)|71|(0)|76|(0)|79|(0)(0)|82|83|(0)|86|(1:88)|94|(1:96)|98|100|91) */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0065 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0072 A[Catch: all -> 0x0044, TRY_LEAVE, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc A[Catch: all -> 0x0044, RuntimeException -> 0x0140, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0152 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015f A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017f A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0185 A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019b A[Catch: all -> 0x0044, TryCatch #0 {all -> 0x0044, blocks: (B:3:0x0001, B:6:0x0029, B:8:0x003d, B:13:0x004e, B:14:0x005a, B:16:0x0065, B:17:0x006a, B:19:0x0072, B:22:0x0078, B:28:0x0090, B:30:0x009a, B:32:0x00a2, B:33:0x00a9, B:39:0x00bc, B:41:0x00c6, B:43:0x00d5, B:45:0x00df, B:47:0x00e7, B:48:0x00ce, B:49:0x00ee, B:51:0x00fa, B:55:0x0104, B:57:0x010e, B:59:0x0118, B:61:0x0127, B:63:0x0131, B:65:0x0139, B:67:0x0120, B:68:0x0140, B:70:0x0152, B:71:0x0157, B:73:0x015f, B:75:0x0165, B:76:0x0171, B:78:0x017f, B:81:0x0185, B:83:0x0196, B:85:0x019b, B:86:0x01a8, B:88:0x01b6, B:90:0x01be, B:94:0x01c2, B:96:0x01c6, B:98:0x01ca, B:100:0x01d1, B:105:0x0024), top: B:2:0x0001 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m4890a(C1683k c1683k) {
        cfgData cfgdata;
        cfgData cfgdata2;
        float m1755j;
        cfgData cfgdata3;
        int m4839e;
        List list;
        List list2;
        float m1743d;
        boolean z2;
        float m1773s;
        float m1759l;
        synchronized (c1683k) {
            try {
                float m4892n = m4892n(Float.valueOf(c1683k.f9584d.m1779y()));
                float m4892n2 = m4892n(Float.valueOf(c1683k.f9584d.m1780z()));
                float f2 = m4892n2 < 0.0f ? 0.0f : m4892n2 * c1683k.f9583c.f2702u3;
                float m4892n3 = m4892n(Float.valueOf(c1683k.f9584d.m1771r()));
                if (!Float.isNaN(f2)) {
                    if (Float.isInfinite(f2)) {
                    }
                    if (m4892n > 400.0f) {
                        c1683k.f9583c.f2675p1 += 1000;
                        c1683k.m4898g();
                    }
                    c1683k.m4904m();
                    cfgdata = c1683k.f9583c;
                    if (f2 > cfgdata.f2685r1) {
                        cfgdata.f2685r1 = f2;
                        c1683k.m4898g();
                    }
                    cfgdata2 = c1683k.f9583c;
                    if (m4892n > cfgdata2.f2695t1) {
                        cfgdata2.f2695t1 = m4892n;
                        c1683k.m4898g();
                    }
                    m1743d = c1683k.f9584d.m1743d();
                    z2 = false;
                    if ((Float.isNaN(m1743d) && m1743d > -90.0f) && (Float.isNaN(c1683k.f9583c.f2705v1) || m1743d > c1683k.f9583c.f2705v1)) {
                        c1683k.f9583c.f2705v1 = m1743d;
                        c1683k.m4898g();
                    }
                    m1773s = c1683k.f9584d.m1773s();
                    if (!Float.isNaN(m1773s) && m1773s > -90.0f) {
                        z2 = true;
                    }
                    if (z2) {
                        if (Float.isNaN(c1683k.f9583c.f2715x1) || m1773s > c1683k.f9583c.f2715x1) {
                            c1683k.f9583c.f2715x1 = m1773s;
                            c1683k.m4898g();
                        }
                        if (Float.isNaN(c1683k.f9583c.f2725z1) || m1773s < c1683k.f9583c.f2725z1) {
                            c1683k.f9583c.f2725z1 = m1773s;
                            c1683k.m4898g();
                        }
                    }
                    m1759l = c1683k.f9584d.m1759l();
                    if (!Float.isNaN(m1759l) && !Float.isInfinite(m1759l) && m1759l != 0.0f && Math.abs(m1759l) < 1000.0f) {
                        if (!Float.isNaN(c1683k.f9583c.f2496B1) || m1759l > c1683k.f9583c.f2496B1) {
                            c1683k.f9583c.f2496B1 = m1759l;
                            c1683k.m4898g();
                        }
                        if (!Float.isNaN(c1683k.f9583c.f2506D1) || m1759l < c1683k.f9583c.f2506D1) {
                            c1683k.f9583c.f2506D1 = m1759l;
                            c1683k.m4898g();
                        }
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    m1755j = c1683k.f9584d.m1755j();
                    cfgdata3 = c1683k.f9583c;
                    if (m1755j > cfgdata3.f2516F1) {
                        cfgdata3.f2516F1 = m1755j;
                        c1683k.m4898g();
                    }
                    if (!Float.isNaN(c1683k.f9594n)) {
                        float f3 = c1683k.f9594n;
                        if (m1755j > f3) {
                            cfgData cfgdata4 = c1683k.f9583c;
                            cfgdata4.f2524H1 = (m1755j - f3) + cfgdata4.f2524H1;
                            c1683k.m4898g();
                        }
                    }
                    cfgData cfgdata5 = c1683k.f9583c;
                    float f4 = cfgdata5.f2524H1;
                    long j2 = cfgdata5.f2528I1;
                    m4839e = c1683k.f9595o.m4839e(currentTimeMillis, f2);
                    if (m4839e == 1) {
                        c1683k.m4898g();
                    }
                    if (m4839e != 2) {
                        c1683k.m4898g();
                        C1675c c1675c = c1683k.f9595o;
                        list = c1675c.f9556f;
                        c1675c.f9556f = Collections.emptyList();
                    } else {
                        list = null;
                    }
                    list2 = list;
                    c1683k.m4905p(m4892n, f2, m4892n3, m1755j);
                    if (list2 != null) {
                        c1683k.m4899h(currentTimeMillis, list2, f4, j2, m4892n3);
                        c1683k.m4900i(currentTimeMillis, m4892n3, list2);
                        c1683k.m4901j();
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (c1683k.f9587g <= 0 && elapsedRealtime - c1683k.f9586f >= 15000) {
                        c1683k.m4901j();
                    } else if ((!c1683k.f9592l || c1683k.f9593m) && elapsedRealtime - c1683k.f9586f >= 15000) {
                        c1683k.m4903l();
                        c1683k.m4902k();
                    }
                }
                f2 = 0.0f;
                if (m4892n > 400.0f) {
                }
                c1683k.m4904m();
                cfgdata = c1683k.f9583c;
                if (f2 > cfgdata.f2685r1) {
                }
                cfgdata2 = c1683k.f9583c;
                if (m4892n > cfgdata2.f2695t1) {
                }
                m1743d = c1683k.f9584d.m1743d();
                z2 = false;
                if (Float.isNaN(m1743d) && m1743d > -90.0f) {
                    c1683k.f9583c.f2705v1 = m1743d;
                    c1683k.m4898g();
                }
                m1773s = c1683k.f9584d.m1773s();
                if (!Float.isNaN(m1773s)) {
                    z2 = true;
                }
                if (z2) {
                }
                m1759l = c1683k.f9584d.m1759l();
                if (!Float.isNaN(m1759l)) {
                    if (!Float.isNaN(c1683k.f9583c.f2496B1)) {
                    }
                    c1683k.f9583c.f2496B1 = m1759l;
                    c1683k.m4898g();
                    if (!Float.isNaN(c1683k.f9583c.f2506D1)) {
                    }
                    c1683k.f9583c.f2506D1 = m1759l;
                    c1683k.m4898g();
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                m1755j = c1683k.f9584d.m1755j();
                cfgdata3 = c1683k.f9583c;
                if (m1755j > cfgdata3.f2516F1) {
                }
                if (!Float.isNaN(c1683k.f9594n)) {
                }
                cfgData cfgdata52 = c1683k.f9583c;
                float f42 = cfgdata52.f2524H1;
                long j22 = cfgdata52.f2528I1;
                m4839e = c1683k.f9595o.m4839e(currentTimeMillis2, f2);
                if (m4839e == 1) {
                }
                if (m4839e != 2) {
                }
                list2 = list;
                c1683k.m4905p(m4892n, f2, m4892n3, m1755j);
                if (list2 != null) {
                }
                long elapsedRealtime2 = SystemClock.elapsedRealtime();
                if (c1683k.f9587g <= 0) {
                }
                if (!c1683k.f9592l) {
                }
                c1683k.m4903l();
                c1683k.m4902k();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: e */
    public static C1684l m4891e(ArrayList arrayList, C1673a c1673a, float f2, long j2) {
        int i;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            C1684l c1684l = (C1684l) arrayList.get(size);
            if (c1684l != null && (((i = c1684l.f9602d) == 0 || i == c1673a.f9545a) && Math.abs(c1684l.f9599a - f2) < 1.0f)) {
                long j3 = c1684l.f9603e;
                if (j3 > 0 && j2 >= j3 && j2 - j3 <= 120000 && Math.round(c1684l.f9601c) == Math.round(c1673a.f9546b)) {
                    return c1684l;
                }
            }
        }
        return null;
    }

    /* renamed from: n */
    public static float m4892n(Float f2) {
        if (Float.isNaN(f2.floatValue()) || Float.isInfinite(f2.floatValue())) {
            return 0.0f;
        }
        return f2.floatValue();
    }

    /* renamed from: o */
    public static synchronized void m4893o(Context context) {
        synchronized (C1683k.class) {
            try {
                if (f9580s == null) {
                    f9580s = new C1683k(context);
                }
                f9580s.m4896d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: b */
    public final void m4894b(float f2) {
        if (this.f9591k == null) {
            this.f9594n = f2;
            return;
        }
        if (!Float.isNaN(this.f9594n)) {
            float f3 = this.f9594n;
            if (f2 > f3) {
                C1685m c1685m = this.f9591k;
                c1685m.f9613j = (f2 - f3) + c1685m.f9613j;
                this.f9592l = true;
            }
        }
        this.f9594n = f2;
    }

    /* renamed from: c */
    public final void m4895c(long j2) {
        C1685m c1685m = this.f9591k;
        if (c1685m == null) {
            return;
        }
        c1685m.f9614k = true;
        c1685m.f9606c = j2;
        c1685m.m4907a();
        this.f9591k = null;
        this.f9588h = 0L;
        AbstractC1687o.m4933b0(this.f9589i);
        this.f9592l = true;
        m4903l();
    }

    /* renamed from: d */
    public final void m4896d() {
        if (!this.f9585e) {
            this.f9583c.m1791k(this.f9581a, false);
            synchronized (this) {
                try {
                    this.f9589i.clear();
                    this.f9589i.addAll(AbstractC1687o.m4910C(this.f9581a));
                    this.f9591k = null;
                    this.f9588h = 0L;
                    long currentTimeMillis = System.currentTimeMillis();
                    Iterator it = this.f9589i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C1685m c1685m = (C1685m) it.next();
                        if (!c1685m.f9614k) {
                            this.f9591k = c1685m;
                            long j2 = c1685m.f9607d;
                            if (j2 <= 0) {
                                j2 = c1685m.f9606c;
                            }
                            if (j2 <= currentTimeMillis && (j2 <= 0 || currentTimeMillis - j2 < 1800000)) {
                                this.f9588h = SystemClock.elapsedRealtime();
                            }
                            currentTimeMillis = j2;
                            m4895c(currentTimeMillis);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            m4897f();
            m4904m();
            this.f9584d.setFuelUsedLiters(this.f9583c.f2516F1);
            this.f9594n = this.f9584d.m1755j();
            this.f9585e = true;
            this.f9586f = SystemClock.elapsedRealtime();
        }
        this.f9582b.removeCallbacks(this.f9597q);
        this.f9582b.post(this.f9597q);
    }

    /* renamed from: f */
    public final synchronized void m4897f() {
        this.f9590j.clear();
        this.f9590j.addAll(AbstractC1680h.m4843A(this.f9581a));
        this.f9593m = false;
    }

    /* renamed from: g */
    public final void m4898g() {
        if (this.f9587g == 0) {
            this.f9587g = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: h */
    public final void m4899h(long j2, List list, float f2, long j3, float f3) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        C1676d c1676d;
        int i2;
        if (list.isEmpty()) {
            return;
        }
        float f4 = (Float.isNaN(f3) || Float.isInfinite(f3) || f3 < 0.0f) ? 0.0f : f3;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            arrayList = this.f9590j;
            if (!hasNext) {
                break;
            }
            C1673a c1673a = (C1673a) it.next();
            if (c1673a != null) {
                int i3 = 0;
                while (true) {
                    int size = arrayList.size();
                    i = c1673a.f9545a;
                    if (i3 >= size) {
                        arrayList2 = arrayList3;
                        c1676d = null;
                        break;
                    }
                    c1676d = (C1676d) arrayList.get(i3);
                    if (c1676d != null && (((i2 = c1676d.f9563g) == 0 || i2 == i) && Math.abs(c1676d.f9562f - f4) < 1.0f)) {
                        arrayList2 = arrayList3;
                        long j4 = c1676d.f9558b;
                        if (j4 > 0 && j2 >= j4 && j2 - j4 <= 120000 && Math.round(c1676d.f9560d) == Math.round(c1673a.f9546b)) {
                            break;
                        }
                    } else {
                        arrayList2 = arrayList3;
                    }
                    i3++;
                    arrayList3 = arrayList2;
                }
                if (c1676d != null) {
                    c1676d.f9560d = c1673a.f9547c;
                    c1676d.f9558b = j2;
                    if (c1676d.f9563g == 0) {
                        c1676d.f9563g = i;
                    }
                    if (arrayList.get(0) != c1676d) {
                        arrayList.remove(c1676d);
                        arrayList.add(0, c1676d);
                    }
                    arrayList3 = arrayList2;
                } else {
                    ArrayList arrayList4 = arrayList2;
                    arrayList4.add(c1673a);
                    arrayList3 = arrayList4;
                }
            }
        }
        ArrayList arrayList5 = arrayList3;
        if (!arrayList5.isEmpty() && !arrayList.isEmpty() && j3 > 0 && ((C1676d) arrayList.get(0)).f9558b == j3) {
            ((C1676d) arrayList.get(0)).f9561e = (Float.isNaN(f2) || Float.isInfinite(f2) || f2 < 0.0f) ? 0.0f : f2;
        }
        Iterator it2 = arrayList5.iterator();
        while (it2.hasNext()) {
            C1673a c1673a2 = (C1673a) it2.next();
            float f5 = c1673a2.f9546b;
            C1676d c1676d2 = new C1676d();
            c1676d2.f9557a = UUID.randomUUID().toString();
            c1676d2.f9558b = j2;
            c1676d2.f9559c = f5;
            c1676d2.f9560d = c1673a2.f9547c;
            c1676d2.f9561e = 0.0f;
            c1676d2.f9562f = f4;
            c1676d2.f9563g = c1673a2.f9545a;
            arrayList.add(0, c1676d2);
        }
        while (arrayList.size() > 30) {
            arrayList.remove(arrayList.size() - 1);
        }
        this.f9593m = true;
        m4902k();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d3  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4900i(long j2, float f2, List list) {
        float f3;
        if (list.isEmpty()) {
            return;
        }
        C1685m c1685m = this.f9591k;
        if (c1685m == null) {
            ArrayList arrayList = this.f9589i;
            Iterator it = arrayList.iterator();
            while (true) {
                if (it.hasNext()) {
                    C1685m c1685m2 = (C1685m) it.next();
                    if (c1685m2 != null && !c1685m2.f9614k) {
                        c1685m = c1685m2;
                        break;
                    }
                } else {
                    c1685m = !arrayList.isEmpty() ? (C1685m) arrayList.get(0) : null;
                }
            }
        }
        if (f2 <= 0.0f && c1685m != null) {
            float f4 = c1685m.f9609f;
            if (f4 > 0.0f) {
                f3 = f4;
                if (c1685m != null) {
                    if (this.f9596p == null) {
                        this.f9596p = new ArrayList();
                    }
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C1673a c1673a = (C1673a) it2.next();
                        if (c1673a != null) {
                            C1684l m4891e = m4891e(this.f9596p, c1673a, f3, j2);
                            if (m4891e != null) {
                                m4891e.f9601c = c1673a.f9547c;
                                m4891e.f9603e = j2;
                                if (m4891e.f9602d == 0) {
                                    m4891e.f9602d = c1673a.f9545a;
                                }
                            } else {
                                this.f9596p.add(new C1684l(f3, c1673a.f9546b, c1673a.f9547c, c1673a.f9545a, j2));
                            }
                        }
                    }
                    return;
                }
                ArrayList arrayList2 = c1685m.f9615l;
                int size = arrayList2.size();
                Iterator it3 = list.iterator();
                while (it3.hasNext()) {
                    C1673a c1673a2 = (C1673a) it3.next();
                    if (c1673a2 != null) {
                        int min = Math.min(size, arrayList2.size());
                        int round = Math.round(c1673a2.f9546b);
                        float f5 = c1673a2.f9547c;
                        int round2 = Math.round(f5);
                        int i = 0;
                        while (true) {
                            if (i >= min) {
                                C1684l m4891e2 = m4891e(arrayList2, c1673a2, f3, j2);
                                if (m4891e2 != null) {
                                    m4891e2.f9601c = f5;
                                    m4891e2.f9603e = j2;
                                    if (m4891e2.f9602d == 0) {
                                        m4891e2.f9602d = c1673a2.f9545a;
                                    }
                                } else {
                                    arrayList2.add(new C1684l(f3, c1673a2.f9546b, c1673a2.f9547c, c1673a2.f9545a, j2));
                                }
                            } else {
                                C1684l c1684l = (C1684l) arrayList2.get(i);
                                if (c1684l != null && Math.abs(c1684l.f9599a - f3) < 1.0f && Math.round(c1684l.f9600b) == round && Math.round(c1684l.f9601c) == round2) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                this.f9592l = true;
                m4903l();
                return;
            }
        }
        f3 = f2;
        if (c1685m != null) {
        }
    }

    /* renamed from: j */
    public final void m4901j() {
        if (this.f9587g > 0) {
            this.f9583c.m1799s(this.f9581a);
            this.f9587g = 0L;
        }
        m4903l();
        m4902k();
        this.f9586f = SystemClock.elapsedRealtime();
    }

    /* renamed from: k */
    public final void m4902k() {
        if (this.f9593m) {
            if (AbstractC1680h.m4853O(this.f9581a, this.f9590j)) {
                this.f9593m = false;
            }
            this.f9586f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: l */
    public final void m4903l() {
        if (this.f9592l) {
            if (AbstractC1687o.m4927V(this.f9581a, this.f9589i)) {
                this.f9592l = false;
            }
            this.f9586f = SystemClock.elapsedRealtime();
        }
    }

    /* renamed from: m */
    public final void m4904m() {
        int max = (int) (Math.max(0L, this.f9583c.f2675p1) / 60000);
        if (max == this.f9598r) {
            return;
        }
        this.f9598r = max;
        this.f9584d.setMotoHours(max);
    }

    /* renamed from: p */
    public final void m4905p(float f2, float f3, float f4, float f5) {
        long currentTimeMillis = System.currentTimeMillis();
        boolean z2 = f2 > 400.0f;
        boolean z3 = z2 || ((f3 > 1.0f ? 1 : (f3 == 1.0f ? 0 : -1)) >= 0);
        if (this.f9591k == null) {
            if (!z2) {
                this.f9594n = f5;
                return;
            }
            C1685m c1685m = new C1685m();
            c1685m.f9605b = currentTimeMillis;
            c1685m.f9606c = currentTimeMillis;
            c1685m.f9607d = currentTimeMillis;
            float max = Math.max(0.0f, f4);
            c1685m.f9608e = max;
            c1685m.f9609f = max;
            c1685m.f9613j = 0.0f;
            c1685m.f9614k = false;
            ArrayList arrayList = this.f9596p;
            if (arrayList != null && !arrayList.isEmpty()) {
                c1685m.f9615l.addAll(this.f9596p);
                this.f9596p = null;
                this.f9592l = true;
            }
            c1685m.m4907a();
            this.f9591k = c1685m;
            this.f9588h = SystemClock.elapsedRealtime();
            ArrayList arrayList2 = this.f9589i;
            arrayList2.add(0, c1685m);
            AbstractC1687o.m4933b0(arrayList2);
            this.f9592l = true;
            m4894b(f5);
            m4903l();
            return;
        }
        m4894b(f5);
        if (z3) {
            C1685m c1685m2 = this.f9591k;
            c1685m2.f9607d = currentTimeMillis;
            c1685m2.f9606c = currentTimeMillis;
            this.f9588h = SystemClock.elapsedRealtime();
            if (f4 > 0.0f) {
                C1685m c1685m3 = this.f9591k;
                if (c1685m3.f9608e <= 0.0f) {
                    c1685m3.f9608e = f4;
                }
                if (f4 > c1685m3.f9609f) {
                    c1685m3.f9609f = f4;
                }
            }
            this.f9591k.m4907a();
            this.f9592l = true;
            return;
        }
        C1685m c1685m4 = this.f9591k;
        long j2 = c1685m4.f9607d;
        if (j2 <= 0) {
            j2 = c1685m4.f9605b;
        }
        long elapsedRealtime = this.f9588h > 0 ? SystemClock.elapsedRealtime() - this.f9588h : currentTimeMillis - j2;
        if (j2 > currentTimeMillis || elapsedRealtime >= 1800000) {
            if (j2 <= currentTimeMillis) {
                currentTimeMillis = j2;
            }
            m4895c(currentTimeMillis);
        } else {
            C1685m c1685m5 = this.f9591k;
            if (f4 > c1685m5.f9609f) {
                c1685m5.f9609f = f4;
            }
            c1685m5.f9606c = j2;
            c1685m5.m4907a();
            this.f9592l = true;
        }
    }
}
