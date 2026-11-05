package com.altaysoft.t500_split.media;

import android.content.ClipData;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.lifecycle.AbstractC0532O;
import androidx.lifecycle.C0534Q;
import androidx.lifecycle.C0560y;
import androidx.lifecycle.InterfaceC0533P;
import androidx.lifecycle.InterfaceC0553r;
import androidx.lifecycle.InterfaceC0561z;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.sun.jna.Platform;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p001A0.RunnableC0005B;
import p003B.C0043j;
import p017H0.AbstractC0122a;
import p019I0.InterfaceC0137a;
import p022K.AbstractC0169Q;
import p022K.C0188f;
import p022K.C0198k;
import p022K.InterfaceC0182c;
import p022K.InterfaceC0186e;
import p024L.C0240j;
import p024L.C0241k;
import p024L.InterfaceC0249s;
import p038T.InterfaceC0314h;
import p038T.ThreadFactoryC0307a;
import p042V.C0345g;
import p046X.C0380H;
import p046X.C0427z;
import p053a0.C0487a;
import p062d0.InterfaceC0731d;
import p069f1.AbstractC0851w;
import p069f1.InterfaceC0843o;
import p075i1.AbstractC0951c;
import p079k.C1011f;
import p079k.C1020o;
import p079k.InterfaceC1016k;
import p079k.InterfaceC1029x;
import p079k.MenuC1018m;
import p079k.RunnableC1010e;
import p079k.SubMenuC1005E;
import p079k.ViewOnKeyListenerC1012g;
import p082l.C1083R0;
import p082l.C1123k;
import p082l.InterfaceC1052B0;
import p082l.InterfaceC1129n;
import p107t1.AbstractC1461d;
import p107t1.AbstractC1464g;
import p107t1.C1459b;
import p121y0.AbstractC1687o;

/* renamed from: com.altaysoft.t500_split.media.g */
/* loaded from: classes.dex */
public class C0639g implements InterfaceC0249s, InterfaceC0137a, InterfaceC0182c, InterfaceC0186e, InterfaceC0314h, InterfaceC0731d, InterfaceC0843o, InterfaceC1052B0, InterfaceC1029x, InterfaceC1016k {

    /* renamed from: h */
    public static C0639g f3009h;

    /* renamed from: f */
    public final /* synthetic */ int f3010f;

    /* renamed from: g */
    public Object f3011g;

    public /* synthetic */ C0639g(int i, Object obj) {
        this.f3010f = i;
        this.f3011g = obj;
    }

    /* renamed from: x */
    public static synchronized C0639g m1872x() {
        C0639g c0639g;
        synchronized (C0639g.class) {
            try {
                if (f3009h == null) {
                    f3009h = new C0639g(0);
                }
                c0639g = f3009h;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0639g;
    }

    /* renamed from: A */
    public boolean mo848A(int i, int i2, Bundle bundle) {
        return false;
    }

    /* renamed from: B */
    public void m1873B(C0636d c0636d) {
        ((C0560y) this.f3011g).m1398g(c0636d);
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: a */
    public void mo1874a(MenuC1018m menuC1018m, boolean z2) {
        if (menuC1018m instanceof SubMenuC1005E) {
            ((SubMenuC1005E) menuC1018m).f4761z.mo2597k().m2615c(false);
        }
        InterfaceC1029x interfaceC1029x = ((C1123k) this.f3011g).f5183j;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1874a(menuC1018m, z2);
        }
    }

    @Override // p079k.InterfaceC1029x
    /* renamed from: b */
    public boolean mo1875b(MenuC1018m menuC1018m) {
        C1123k c1123k = (C1123k) this.f3011g;
        if (menuC1018m == c1123k.f5181h) {
            return false;
        }
        ((SubMenuC1005E) menuC1018m).f4760A.getClass();
        c1123k.getClass();
        InterfaceC1029x interfaceC1029x = c1123k.f5183j;
        if (interfaceC1029x != null) {
            return interfaceC1029x.mo1875b(menuC1018m);
        }
        return false;
    }

    @Override // p082l.InterfaceC1052B0
    /* renamed from: c */
    public void mo1876c(MenuC1018m menuC1018m, C1020o c1020o) {
        ViewOnKeyListenerC1012g viewOnKeyListenerC1012g = (ViewOnKeyListenerC1012g) this.f3011g;
        viewOnKeyListenerC1012g.f4798k.removeCallbacksAndMessages(null);
        ArrayList arrayList = viewOnKeyListenerC1012g.f4800m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1018m == ((C1011f) arrayList.get(i)).f4787b) {
                break;
            } else {
                i++;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        viewOnKeyListenerC1012g.f4798k.postAtTime(new RunnableC1010e(this, i2 < arrayList.size() ? (C1011f) arrayList.get(i2) : null, c1020o, menuC1018m), menuC1018m, SystemClock.uptimeMillis() + 200);
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: d */
    public ClipData mo539d() {
        ClipData clip;
        clip = ((ContentInfo) this.f3011g).getClip();
        return clip;
    }

    @Override // p024L.InterfaceC0249s
    /* renamed from: e */
    public boolean mo366e(View view) {
        SwipeDismissBehavior swipeDismissBehavior = (SwipeDismissBehavior) this.f3011g;
        if (!swipeDismissBehavior.mo2027r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean z2 = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f3360d;
        view.offsetLeftAndRight((!(i == 0 && z2) && (i != 1 || z2)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: f */
    public C0188f mo534f() {
        ContentInfo build;
        build = ((ContentInfo.Builder) this.f3011g).build();
        return new C0188f(new C0639g(build));
    }

    @Override // p062d0.InterfaceC0731d
    /* renamed from: g */
    public void mo947g(int i, Serializable serializable) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case Platform.GNU /* 9 */:
            default:
                str = "";
                break;
            case Platform.KFREEBSD /* 10 */:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case Platform.NETBSD /* 11 */:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        } else {
            Log.d("ProfileInstaller", str);
        }
        ((ProfileInstallReceiver) this.f3011g).setResultCode(i);
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: h */
    public int mo540h() {
        int flags;
        flags = ((ContentInfo) this.f3011g).getFlags();
        return flags;
    }

    @Override // p062d0.InterfaceC0731d
    /* renamed from: i */
    public void mo948i() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: j */
    public boolean mo1877j(MenuC1018m menuC1018m, MenuItem menuItem) {
        InterfaceC1129n interfaceC1129n = ((ActionMenuView) this.f3011g).f1777E;
        if (interfaceC1129n != null) {
            Iterator it = ((CopyOnWriteArrayList) ((C1083R0) interfaceC1129n).f5102f.f1816L.f534c).iterator();
            while (it.hasNext()) {
                if (((C0380H) it.next()).f1127a.m1027o()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: k */
    public ContentInfo mo541k() {
        return (ContentInfo) this.f3011g;
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: l */
    public void mo535l(Bundle bundle) {
        ((ContentInfo.Builder) this.f3011g).setExtras(bundle);
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: m */
    public void mo536m(Uri uri) {
        ((ContentInfo.Builder) this.f3011g).setLinkUri(uri);
    }

    @Override // p022K.InterfaceC0186e
    /* renamed from: n */
    public int mo542n() {
        int source;
        source = ((ContentInfo) this.f3011g).getSource();
        return source;
    }

    @Override // p069f1.InterfaceC0843o
    /* renamed from: o */
    public Object mo902o() {
        switch (this.f3010f) {
            case 22:
                Class cls = (Class) this.f3011g;
                try {
                    return AbstractC0851w.f4264a.mo2372a(cls);
                } catch (Exception e2) {
                    throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e2);
                }
            default:
                Constructor constructor = (Constructor) this.f3011g;
                try {
                    return constructor.newInstance(null);
                } catch (IllegalAccessException e3) {
                    AbstractC1687o abstractC1687o = AbstractC0951c.f4566a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.11.0). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e3);
                } catch (InstantiationException e4) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0951c.m2491b(constructor) + "' with no args", e4);
                } catch (InvocationTargetException e5) {
                    throw new RuntimeException("Failed to invoke constructor '" + AbstractC0951c.m2491b(constructor) + "' with no args", e5.getCause());
                }
        }
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: p */
    public void mo1878p(MenuC1018m menuC1018m) {
        C1083R0 c1083r0 = ((ActionMenuView) this.f3011g).f1783z;
        if (c1083r0 != null) {
            c1083r0.mo1878p(menuC1018m);
        }
    }

    @Override // p038T.InterfaceC0314h
    /* renamed from: q */
    public void mo894q(AbstractC1687o abstractC1687o) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0307a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0005B(this, abstractC1687o, threadPoolExecutor, 1));
    }

    @Override // p082l.InterfaceC1052B0
    /* renamed from: r */
    public void mo1879r(MenuC1018m menuC1018m, C1020o c1020o) {
        ((ViewOnKeyListenerC1012g) this.f3011g).f4798k.removeCallbacksAndMessages(menuC1018m);
    }

    @Override // p022K.InterfaceC0182c
    /* renamed from: s */
    public void mo537s(int i) {
        ((ContentInfo.Builder) this.f3011g).setFlags(i);
    }

    /* renamed from: t */
    public C0240j mo849t(int i) {
        return null;
    }

    public String toString() {
        switch (this.f3010f) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.f3011g) + "}";
            default:
                return super.toString();
        }
    }

    /* renamed from: u */
    public C0636d m1880u() {
        C0636d c0636d = (C0636d) ((C0560y) this.f3011g).m1395d();
        return c0636d != null ? c0636d : C0636d.f2994j;
    }

    /* renamed from: v */
    public C0240j mo850v(int i) {
        return null;
    }

    /* renamed from: w */
    public AbstractC0532O m1881w(Class cls) {
        String str;
        C1459b m3498a = AbstractC1464g.m3498a(cls);
        Class cls2 = m3498a.f7160a;
        String str2 = null;
        if (!cls2.isAnonymousClass() && !cls2.isLocalClass()) {
            boolean isArray = cls2.isArray();
            HashMap hashMap = C1459b.f7159c;
            if (isArray) {
                Class<?> componentType = cls2.getComponentType();
                if (componentType.isPrimitive() && (str = (String) hashMap.get(componentType.getName())) != null) {
                    str2 = str.concat("Array");
                }
                if (str2 == null) {
                    str2 = "kotlin.Array";
                }
            } else {
                str2 = (String) hashMap.get(cls2.getName());
                if (str2 == null) {
                    str2 = cls2.getCanonicalName();
                }
            }
        }
        if (str2 != null) {
            return ((C0198k) this.f3011g).m604n(m3498a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str2));
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* renamed from: y */
    public void m1882y() {
        ((C0427z) this.f3011g).f1387n.m997N();
    }

    /* renamed from: z */
    public void m1883z(InterfaceC0553r interfaceC0553r, InterfaceC0561z interfaceC0561z) {
        ((C0560y) this.f3011g).m1396e(interfaceC0553r, interfaceC0561z);
    }

    public C0639g(int i) {
        this.f3010f = i;
        switch (i) {
            case 2:
                break;
            case 7:
                this.f3011g = new C0241k(this);
                break;
            default:
                this.f3011g = new C0560y(C0636d.f2994j);
                break;
        }
    }

    public C0639g(C0534Q c0534q, InterfaceC0533P interfaceC0533P) {
        this.f3010f = 18;
        AbstractC1461d.m3494e("store", c0534q);
        C0487a c0487a = C0487a.f1543b;
        AbstractC1461d.m3494e("defaultCreationExtras", c0487a);
        this.f3011g = new C0198k(c0534q, interfaceC0533P, c0487a);
    }

    public C0639g(TextView textView) {
        this.f3010f = 14;
        this.f3011g = new C0345g(textView);
    }

    public C0639g(EditText editText) {
        this.f3010f = 13;
        this.f3011g = new C0043j(editText);
    }

    public C0639g(Context context) {
        this.f3010f = 12;
        this.f3011g = context.getApplicationContext();
    }

    public C0639g(ContentInfo contentInfo) {
        this.f3010f = 6;
        contentInfo.getClass();
        this.f3011g = AbstractC0122a.m375i(contentInfo);
    }

    public C0639g(ClipData clipData, int i) {
        this.f3010f = 5;
        this.f3011g = AbstractC0122a.m373g(clipData, i);
    }
}
