package com.altaysoft.t500_split.radio;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0636d;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import p006C.AbstractC0062j;
import p121y0.AbstractC1687o;

/* renamed from: com.altaysoft.t500_split.radio.d */
/* loaded from: classes.dex */
public final class C0658d {

    /* renamed from: i */
    public static final C0658d f3092i = new C0658d(false, false, 0, 0, 0, 0, "", Collections.emptyList());

    /* renamed from: a */
    public final boolean f3093a;

    /* renamed from: b */
    public final boolean f3094b;

    /* renamed from: c */
    public final int f3095c;

    /* renamed from: d */
    public final int f3096d;

    /* renamed from: e */
    public final int f3097e;

    /* renamed from: f */
    public final int f3098f;

    /* renamed from: g */
    public final String f3099g;

    /* renamed from: h */
    public final List f3100h;

    public C0658d(boolean z2, boolean z3, int i, int i2, int i3, int i4, String str, List list) {
        this.f3093a = z2;
        this.f3094b = z3;
        this.f3095c = i;
        this.f3096d = i2;
        this.f3097e = i3;
        this.f3098f = i4;
        this.f3099g = str == null ? "" : str;
        this.f3100h = list == null ? Collections.emptyList() : list;
    }

    /* renamed from: a */
    public final String m1941a(Context context) {
        int i = this.f3095c;
        if (context == null) {
            return i == 1 ? "AM" : "FM";
        }
        return context.getString(i == 1 ? R.string.split_info_radio_am : R.string.split_info_radio_fm);
    }

    /* renamed from: b */
    public final String m1942b() {
        int i = this.f3096d;
        return i <= 0 ? "—" : this.f3095c == 1 ? Integer.toString(i) : String.format(Locale.US, "%.2f", Double.valueOf(i / 1000.0d));
    }

    /* renamed from: c */
    public final boolean m1943c() {
        return this.f3096d > 0;
    }

    /* renamed from: d */
    public final int m1944d() {
        int i = 0;
        while (true) {
            List list = this.f3100h;
            if (i >= list.size()) {
                return -1;
            }
            if (((Integer) list.get(i)).intValue() == this.f3096d) {
                return i;
            }
            i++;
        }
    }

    /* renamed from: e */
    public final String m1945e(Context context) {
        int m1944d = m1944d();
        if (m1944d < 0) {
            return "";
        }
        List list = this.f3100h;
        if (context != null) {
            return context.getString(R.string.split_info_radio_preset, Integer.valueOf(m1944d + 1), Integer.valueOf(list.size()));
        }
        return "Пресет частоты " + (m1944d + 1) + "/" + list.size();
    }

    /* renamed from: f */
    public final C0636d m1946f(Context context, Bitmap bitmap) {
        String str;
        if (this.f3096d <= 0) {
            str = "—";
        } else {
            str = m1941a(context) + "  " + m1942b() + " " + m1947g(context);
        }
        String m1945e = m1945e(context);
        String str2 = this.f3099g;
        String str3 = !TextUtils.isEmpty(str2) ? str2 : str;
        if (TextUtils.isEmpty(str2)) {
            str = m1945e.isEmpty() ? "" : "♥  ".concat(m1945e);
        } else if (!m1945e.isEmpty()) {
            str = AbstractC0062j.m169w(str, "  ♥  ", m1945e);
        }
        return new C0636d(AbstractC1687o.m4925T(275), str3, str, null, bitmap, this.f3093a, 0L, 0L, null);
    }

    /* renamed from: g */
    public final String m1947g(Context context) {
        int i = this.f3095c;
        if (context == null) {
            return i == 1 ? "kHz" : "MHz";
        }
        return context.getString(i == 1 ? R.string.split_info_radio_khz : R.string.split_info_radio_mhz);
    }
}
