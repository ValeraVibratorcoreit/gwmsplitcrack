package p001A0;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Locale;
import p098q0.AbstractC1256E0;
import p098q0.AbstractC1372y1;
import p098q0.EnumC1314f0;

/* renamed from: A0.i */
/* loaded from: classes.dex */
public abstract class AbstractC0015i {

    /* renamed from: a */
    public static final EnumMap f43a;

    static {
        EnumMap enumMap = new EnumMap(EnumC1314f0.class);
        f43a = enumMap;
        EnumC1314f0 enumC1314f0 = EnumC1314f0.f6114a;
        enumMap.put((EnumMap) enumC1314f0, (EnumC1314f0) m21a(enumC1314f0));
        EnumC1314f0 enumC1314f02 = EnumC1314f0.f6115b;
        enumMap.put((EnumMap) enumC1314f02, (EnumC1314f0) m21a(enumC1314f02));
        EnumC1314f0 enumC1314f03 = EnumC1314f0.f6116c;
        enumMap.put((EnumMap) enumC1314f03, (EnumC1314f0) m21a(enumC1314f03));
    }

    /* renamed from: a */
    public static C0014h m21a(EnumC1314f0 enumC1314f0) {
        ArrayList arrayList = new ArrayList();
        EnumC0007a[] values = EnumC0007a.values();
        int length = values.length;
        for (int i = 0; i < length; i++) {
            EnumC0007a enumC0007a = values[i];
            enumC0007a.getClass();
            int ordinal = enumC1314f0.ordinal();
            String str = ordinal != 1 ? ordinal != 2 ? enumC0007a.f22c : enumC0007a.f24e : enumC0007a.f23d;
            final int i2 = enumC0007a.f20a;
            if (i2 < 1 || i2 > 7 || !enumC0007a.f21b.startsWith("preset")) {
                i2 = 0;
            }
            InterfaceC0012f c0009c = i2 > 0 ? new InterfaceC0012f() { // from class: A0.b
                @Override // p001A0.InterfaceC0012f
                /* renamed from: d */
                public final void mo15d(Context context) {
                    AbstractC0015i.m26f(context, i2);
                }
            } : enumC0007a == EnumC0007a.SETTINGS ? new C0009c(0) : new C0009c(1);
            int ordinal2 = enumC1314f0.ordinal();
            arrayList.add(new C0013g(enumC0007a, str, c0009c, ordinal2 != 1 ? ordinal2 != 2 ? enumC0007a.f25f : enumC0007a.f27h : enumC0007a.f26g));
        }
        int ordinal3 = enumC1314f0.ordinal();
        return new C0014h(ordinal3 != 1 ? ordinal3 != 2 ? new String[]{"сплит", "split", "привет сплит", "привет split", "эй сплит", "слушай сплит"} : new String[]{"سبلت", "split", "مرحبا سبلت", "يا سبلت", "اسمع سبلت"} : new String[]{"split", "hello split", "hey split", "listen split"}, arrayList);
    }

    /* renamed from: b */
    public static boolean m22b(Context context, String str) {
        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(context);
        C0014h m25e = m25e(m3026s);
        String m24d = m24d(str);
        if (m24d.isEmpty() || "[unk]".equals(m24d)) {
            return false;
        }
        for (String str2 : m25e.f40a) {
            String m24d2 = m24d(str2);
            if (m24d.equals(m24d2)) {
                return true;
            }
            if (m24d2.contains(" ") && m24d.contains(m24d2)) {
                return true;
            }
        }
        int ordinal = m3026s.ordinal();
        if (ordinal == 1) {
            boolean z2 = m24d.contains("hello") || m24d.contains("hey") || m24d.contains("listen");
            boolean contains = m24d.contains("split");
            if (!z2 || !contains) {
                return false;
            }
        } else if (ordinal != 2) {
            boolean z3 = m24d.contains("привет") || m24d.contains("эй") || m24d.contains("слушай");
            boolean z4 = m24d.contains("сплит") || m24d.contains("split") || m24d.contains("спит") || m24d.contains("слит") || m24d.contains("спилит") || m24d.contains("сплет") || m24d.contains("сплид");
            if (!z3 || !z4) {
                return false;
            }
        } else {
            boolean z5 = m24d.contains("مرحبا") || m24d.contains("يا") || m24d.contains("اسمع");
            boolean z6 = m24d.contains("سبلت") || m24d.contains("split");
            if (!z5 || !z6) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static String m23c(EnumC1314f0 enumC1314f0) {
        int ordinal = enumC1314f0.ordinal();
        return ordinal != 1 ? ordinal != 2 ? "RU" : "AR" : "EN";
    }

    /* renamed from: d */
    public static String m24d(String str) {
        return str == null ? "" : str.toLowerCase(Locale.ROOT).trim().replace((char) 1105, (char) 1077).replaceAll("[^a-zа-я0-9\\u0600-\\u06FF\\s]", " ").replaceAll("\\s+", " ").trim();
    }

    /* renamed from: e */
    public static C0014h m25e(EnumC1314f0 enumC1314f0) {
        EnumMap enumMap = f43a;
        C0014h c0014h = (C0014h) enumMap.get(enumC1314f0);
        return c0014h != null ? c0014h : (C0014h) enumMap.get(EnumC1314f0.f6114a);
    }

    /* renamed from: f */
    public static void m26f(Context context, int i) {
        if (i < 1 || i > 7) {
            return;
        }
        if (i <= 2 || !AbstractC1372y1.m3299e("presets5")) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0010d(context.getApplicationContext(), i));
        }
    }
}
