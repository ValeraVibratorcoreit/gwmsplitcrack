package p062d0;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.io.File;
import java.io.IOException;
import p045W0.C0355e;
import p094p.AbstractFutureC1220g;
import p094p.C1221h;

/* renamed from: d0.k */
/* loaded from: classes.dex */
public abstract class AbstractC0738k {

    /* renamed from: a */
    public static final C1221h f3862a = new C1221h();

    /* renamed from: b */
    public static final Object f3863b = new Object();

    /* renamed from: c */
    public static C0355e f3864c = null;

    /* renamed from: a */
    public static long m2190a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? AbstractC0736i.m2187a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    /* renamed from: b */
    public static C0355e m2191b() {
        C0355e c0355e = new C0355e(25);
        f3864c = c0355e;
        C1221h c1221h = f3862a;
        c1221h.getClass();
        if (AbstractFutureC1220g.f5462f.mo313m(c1221h, null, c0355e)) {
            AbstractFutureC1220g.m2893b(c1221h);
        }
        return f3864c;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(21:14|(1:79)(1:18)|19|(1:78)(1:23)|24|25|26|(2:64|65)(1:28)|29|(8:36|(1:40)|(1:59)(1:47)|48|(2:55|56)|52|53|54)|(1:63)|(1:40)|(1:42)|59|48|(1:50)|55|56|52|53|54) */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x009c, code lost:
    
        r4 = 1;
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2192c(Context context, boolean z2) {
        C0737j m2188a;
        C0737j c0737j;
        int i;
        if (z2 || f3864c == null) {
            synchronized (f3863b) {
                if (!z2) {
                    try {
                        if (f3864c != null) {
                            return;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (Build.VERSION.SDK_INT == 30) {
                    m2191b();
                    return;
                }
                File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
                long length = file.length();
                int i2 = 0;
                boolean z3 = file.exists() && length > 0;
                File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
                long length2 = file2.length();
                boolean z4 = file2.exists() && length2 > 0;
                try {
                    long m2190a = m2190a(context);
                    File file3 = new File(context.getFilesDir(), "profileInstalled");
                    if (file3.exists()) {
                        try {
                            m2188a = C0737j.m2188a(file3);
                        } catch (IOException unused) {
                            m2191b();
                            return;
                        }
                    } else {
                        m2188a = null;
                    }
                    if (m2188a != null && m2188a.f3860c == m2190a && (i = m2188a.f3859b) != 2) {
                        i2 = i;
                        if (z2 && z4 && i2 != 1) {
                            i2 = 2;
                        }
                        c0737j = new C0737j(1, (m2188a == null && m2188a.f3859b == 2 && i2 == 1 && length < m2188a.f3861d) ? 3 : i2, m2190a, length2);
                        if (m2188a != null || !m2188a.equals(c0737j)) {
                            c0737j.m2189b(file3);
                        }
                        m2191b();
                    }
                    if (z4) {
                        i2 = 2;
                    }
                    if (z2) {
                        i2 = 2;
                    }
                    c0737j = new C0737j(1, (m2188a == null && m2188a.f3859b == 2 && i2 == 1 && length < m2188a.f3861d) ? 3 : i2, m2190a, length2);
                    if (m2188a != null) {
                    }
                    c0737j.m2189b(file3);
                    m2191b();
                } catch (PackageManager.NameNotFoundException unused2) {
                    m2191b();
                }
            }
        }
    }
}
