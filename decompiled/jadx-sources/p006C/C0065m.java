package p006C;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p003B.C0040g;
import p003B.C0041h;
import p010D1.AbstractC0088l;
import p016H.C0118j;
import p121y0.AbstractC1680h;

/* renamed from: C.m */
/* loaded from: classes.dex */
public final class C0065m extends AbstractC0088l {

    /* renamed from: j */
    public static Class f212j = null;

    /* renamed from: k */
    public static Constructor f213k = null;

    /* renamed from: l */
    public static Method f214l = null;

    /* renamed from: m */
    public static Method f215m = null;

    /* renamed from: n */
    public static boolean f216n = false;

    /* renamed from: c */
    public final Class f217c;

    /* renamed from: d */
    public final Constructor f218d;

    /* renamed from: e */
    public final Method f219e;

    /* renamed from: f */
    public final Method f220f;

    /* renamed from: g */
    public final Method f221g;

    /* renamed from: h */
    public final Method f222h;

    /* renamed from: i */
    public final Method f223i;

    public C0065m() {
        Method method;
        Constructor<?> constructor;
        Method method2;
        Method method3;
        Method method4;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> cls2 = Class.forName("android.graphics.FontFamily");
            constructor = cls2.getConstructor(null);
            method2 = m178D0(cls2);
            Class cls3 = Integer.TYPE;
            method3 = cls2.getMethod("addFontFromBuffer", ByteBuffer.class, cls3, FontVariationAxis[].class, cls3, cls3);
            method4 = cls2.getMethod("freeze", null);
            method5 = cls2.getMethod("abortCreation", null);
            method = m182E0(cls2);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(e2.getClass().getName()), e2);
            method = null;
            constructor = null;
            method2 = null;
            method3 = null;
            method4 = null;
            method5 = null;
        }
        this.f217c = cls;
        this.f218d = constructor;
        this.f219e = method2;
        this.f220f = method3;
        this.f221g = method4;
        this.f222h = method5;
        this.f223i = method;
    }

    /* renamed from: A0 */
    public static void m177A0() {
        Method method;
        Class<?> cls;
        Method method2;
        if (f216n) {
            return;
        }
        f216n = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e2) {
            Log.e("TypefaceCompatApi21Impl", e2.getClass().getName(), e2);
            method = null;
            cls = null;
            method2 = null;
        }
        f213k = constructor;
        f212j = cls;
        f214l = method2;
        f215m = method;
    }

    /* renamed from: D0 */
    public static Method m178D0(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class);
    }

    /* renamed from: x0 */
    public static boolean m179x0(Object obj, String str, int i, boolean z2) {
        m177A0();
        try {
            return ((Boolean) f214l.invoke(obj, str, Integer.valueOf(i), Boolean.valueOf(z2))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: B0 */
    public final boolean m180B0() {
        Method method = this.f219e;
        if (method == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: C0 */
    public final Object m181C0() {
        try {
            return this.f218d.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: E0 */
    public final Method m182E0(Class cls) {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: u */
    public final Typeface mo183u(Context context, C0040g c0040g, Resources resources, int i) {
        if (m180B0()) {
            Object m181C0 = m181C0();
            if (m181C0 == null) {
                return null;
            }
            for (C0041h c0041h : c0040g.f129a) {
                if (!m187w0(context, m181C0, c0041h.f130a, c0041h.f134e, c0041h.f131b, c0041h.f132c ? 1 : 0, FontVariationAxis.fromFontVariationSettings(c0041h.f133d))) {
                    m185v0(m181C0);
                    return null;
                }
            }
            if (m189z0(m181C0)) {
                return m188y0(m181C0);
            }
            return null;
        }
        m177A0();
        try {
            Object newInstance = f213k.newInstance(null);
            for (C0041h c0041h2 : c0040g.f129a) {
                File m4878t = AbstractC1680h.m4878t(context);
                if (m4878t == null) {
                    return null;
                }
                try {
                    if (AbstractC1680h.m4867h(m4878t, resources, c0041h2.f135f) && m179x0(newInstance, m4878t.getPath(), c0041h2.f131b, c0041h2.f132c)) {
                        m4878t.delete();
                    }
                } catch (RuntimeException unused) {
                } catch (Throwable th) {
                    m4878t.delete();
                    throw th;
                }
                m4878t.delete();
                return null;
            }
            m177A0();
            try {
                Object newInstance2 = Array.newInstance((Class<?>) f212j, 1);
                Array.set(newInstance2, 0, newInstance);
                return (Typeface) f215m.invoke(null, newInstance2);
            } catch (IllegalAccessException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: v */
    public final Typeface mo184v(Context context, C0118j[] c0118jArr, int i) {
        Typeface m188y0;
        boolean z2;
        if (c0118jArr.length < 1) {
            return null;
        }
        if (!m180B0()) {
            C0118j mo192z = mo192z(i, c0118jArr);
            try {
                ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(mo192z.f370a, "r", null);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(mo192z.f372c).setItalic(mo192z.f373d).build();
                    openFileDescriptor.close();
                    return build;
                } finally {
                }
            } catch (IOException unused) {
                return null;
            }
        }
        HashMap hashMap = new HashMap();
        for (C0118j c0118j : c0118jArr) {
            if (c0118j.f374e == 0) {
                Uri uri = c0118j.f370a;
                if (!hashMap.containsKey(uri)) {
                    hashMap.put(uri, AbstractC1680h.m4845C(context, uri));
                }
            }
        }
        Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
        Object m181C0 = m181C0();
        if (m181C0 == null) {
            return null;
        }
        int length = c0118jArr.length;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            C0118j c0118j2 = c0118jArr[i2];
            ByteBuffer byteBuffer = (ByteBuffer) unmodifiableMap.get(c0118j2.f370a);
            if (byteBuffer != null) {
                try {
                    z2 = ((Boolean) this.f220f.invoke(m181C0, byteBuffer, Integer.valueOf(c0118j2.f371b), null, Integer.valueOf(c0118j2.f372c), Integer.valueOf(c0118j2.f373d ? 1 : 0))).booleanValue();
                } catch (IllegalAccessException | InvocationTargetException unused2) {
                    z2 = false;
                }
                if (!z2) {
                    m185v0(m181C0);
                    return null;
                }
                z3 = true;
            }
            i2++;
            z3 = z3;
        }
        if (!z3) {
            m185v0(m181C0);
            return null;
        }
        if (m189z0(m181C0) && (m188y0 = m188y0(m181C0)) != null) {
            return Typeface.create(m188y0, i);
        }
        return null;
    }

    /* renamed from: v0 */
    public final void m185v0(Object obj) {
        try {
            this.f222h.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: w */
    public final Typeface mo186w(Context context, Resources resources, int i, String str, int i2) {
        if (!m180B0()) {
            return super.mo186w(context, resources, i, str, i2);
        }
        Object m181C0 = m181C0();
        if (m181C0 == null) {
            return null;
        }
        if (!m187w0(context, m181C0, str, 0, -1, -1, null)) {
            m185v0(m181C0);
            return null;
        }
        if (m189z0(m181C0)) {
            return m188y0(m181C0);
        }
        return null;
    }

    /* renamed from: w0 */
    public final boolean m187w0(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f219e.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: y0 */
    public final Typeface m188y0(Object obj) {
        try {
            Object newInstance = Array.newInstance((Class<?>) this.f217c, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f223i.invoke(null, newInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: z0 */
    public final boolean m189z0(Object obj) {
        try {
            return ((Boolean) this.f221g.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }
}
