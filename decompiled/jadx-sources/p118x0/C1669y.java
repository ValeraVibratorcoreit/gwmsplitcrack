package p118x0;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* renamed from: x0.y */
/* loaded from: classes.dex */
public final class C1669y {

    /* renamed from: a */
    public final boolean f9502a;

    /* renamed from: b */
    public final String f9503b;

    /* renamed from: c */
    public final float f9504c;

    /* renamed from: d */
    public final float f9505d;

    /* renamed from: e */
    public final String f9506e;

    /* renamed from: f */
    public final float f9507f;

    /* renamed from: g */
    public final float f9508g;

    /* renamed from: h */
    public final int f9509h;

    /* renamed from: i */
    public final String f9510i;

    /* renamed from: j */
    public final float f9511j;

    /* renamed from: k */
    public final int f9512k;

    /* renamed from: l */
    public final float f9513l;

    /* renamed from: m */
    public final int f9514m;

    /* renamed from: n */
    public final float f9515n;

    /* renamed from: o */
    public final float f9516o;

    /* renamed from: p */
    public final int f9517p;

    /* renamed from: q */
    public final float f9518q;

    /* renamed from: r */
    public final float f9519r;

    /* renamed from: s */
    public final long f9520s;

    /* renamed from: t */
    public final long f9521t;

    /* renamed from: u */
    public final List f9522u;

    /* renamed from: v */
    public final List f9523v;

    /* renamed from: w */
    public final long f9524w;

    public C1669y(boolean z2, String str, float f2, float f3, String str2, float f4, float f5, int i, String str3, float f6, int i2, float f7, int i3, float f8, float f9, int i4, float f10, float f11, long j2, long j3, ArrayList arrayList, ArrayList arrayList2, long j4) {
        this.f9502a = z2;
        this.f9503b = str;
        this.f9504c = f2;
        this.f9505d = f3;
        this.f9506e = str2;
        this.f9507f = f4;
        this.f9508g = f5;
        this.f9509h = i;
        this.f9510i = str3 != null ? str3 : "";
        this.f9511j = f6;
        this.f9512k = i2;
        this.f9513l = f7;
        this.f9514m = i3;
        this.f9515n = f8;
        this.f9516o = f9;
        this.f9517p = i4;
        this.f9518q = f10;
        this.f9519r = f11;
        this.f9520s = j2;
        this.f9521t = j3;
        this.f9522u = arrayList != null ? arrayList : new ArrayList();
        this.f9523v = arrayList2 != null ? arrayList2 : new ArrayList();
        this.f9524w = j4;
    }

    /* renamed from: a */
    public static C1669y m4815a(String str, float f2, float f3, String str2) {
        return new C1669y(false, str, f2, f3, str2, 0.0f, 0.0f, 0, "", 0.0f, 0, 0.0f, 0, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0L, 0L, null, null, 0L);
    }

    /* renamed from: b */
    public final boolean m4816b() {
        if (this.f9502a) {
            long j2 = this.f9524w;
            if (j2 > 0 && System.currentTimeMillis() - j2 > 21600000) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public final String m4817c() {
        String str = this.f9506e;
        if (str != null && !str.isEmpty()) {
            return str;
        }
        float f2 = this.f9504c;
        float f3 = this.f9505d;
        return (f2 == 0.0f && f3 == 0.0f) ? "" : String.format(Locale.US, "%.3f, %.3f", Float.valueOf(f2), Float.valueOf(f3));
    }

    /* renamed from: d */
    public final String m4818d() {
        long j2 = this.f9524w;
        return j2 <= 0 ? "—" : new SimpleDateFormat("HH:mm", Locale.getDefault()).format(new Date(j2));
    }
}
