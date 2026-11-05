package p016H;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p006C.AbstractC0064l;
import p091o.C1196f;
import p091o.C1201k;

/* renamed from: H.h */
/* loaded from: classes.dex */
public abstract class AbstractC0116h {

    /* renamed from: a */
    public static final C1196f f364a = new C1196f(16);

    /* renamed from: b */
    public static final ThreadPoolExecutor f365b;

    /* renamed from: c */
    public static final Object f366c;

    /* renamed from: d */
    public static final C1201k f367d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0120l());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f365b = threadPoolExecutor;
        f366c = new Object();
        f367d = new C1201k();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0115g m364a(String str, Context context, C0112d c0112d, int i) {
        C1196f c1196f = f364a;
        Typeface typeface = (Typeface) c1196f.m2861a(str);
        if (typeface != null) {
            return new C0115g(typeface);
        }
        try {
            C0117i m349a = AbstractC0111c.m349a(context, c0112d);
            int i2 = 1;
            C0118j[] c0118jArr = (C0118j[]) m349a.f369g;
            int i3 = m349a.f368f;
            if (i3 != 0) {
                if (i3 == 1) {
                    i2 = -2;
                    if (i2 != 0) {
                        return new C0115g(i2);
                    }
                    Typeface mo184v = AbstractC0064l.f210a.mo184v(context, c0118jArr, i);
                    if (mo184v == null) {
                        return new C0115g(-3);
                    }
                    c1196f.m2862b(str, mo184v);
                    return new C0115g(mo184v);
                }
                i2 = -3;
                if (i2 != 0) {
                }
            } else {
                if (c0118jArr != null && c0118jArr.length != 0) {
                    int length = c0118jArr.length;
                    i2 = 0;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        int i5 = c0118jArr[i4].f374e;
                        if (i5 == 0) {
                            i4++;
                        } else if (i5 >= 0) {
                            i2 = i5;
                        }
                    }
                }
                if (i2 != 0) {
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0115g(-1);
        }
    }
}
