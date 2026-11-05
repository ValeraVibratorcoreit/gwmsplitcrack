package p010D1;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.app.AppOpsManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.provider.Settings;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.altaysoft.t500_split.MyAccessibilityService;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.MediaNotificationListenerService;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.sun.jna.Function;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import p003B.C0040g;
import p006C.AbstractC0056d;
import p008D.AbstractC0070a;
import p016H.C0118j;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p022K.InterfaceC0176Y;
import p045W0.C0355e;
import p049Y0.C0440f;
import p070g.AbstractActivityC0870i;
import p082l.C1064H0;
import p094p.AbstractFutureC1220g;
import p094p.C1216c;
import p094p.C1219f;
import p098q0.AbstractC1372y1;
import p112v0.EnumC1609b;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;
import p123z.AbstractC1696d;
import p123z.AbstractC1697e;

/* renamed from: D1.l */
/* loaded from: classes.dex */
public abstract class AbstractC0088l implements InterfaceC0176Y {

    /* renamed from: a */
    public static C0087k f267a;

    /* renamed from: b */
    public static long f268b;

    public AbstractC0088l() {
        new ConcurrentHashMap();
    }

    /* renamed from: A */
    public static ColorStateList m254A(Context context, C0198k c0198k, int i) {
        int resourceId;
        ColorStateList m4959b;
        TypedArray typedArray = (TypedArray) c0198k.f534c;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m4959b = AbstractC1695c.m4959b(context, resourceId)) == null) ? c0198k.m597g(i) : m4959b;
    }

    /* renamed from: B */
    public static ColorStateList m255B(Context context, TypedArray typedArray, int i) {
        int resourceId;
        ColorStateList m4959b;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m4959b = AbstractC1695c.m4959b(context, resourceId)) == null) ? typedArray.getColorStateList(i) : m4959b;
    }

    /* renamed from: C */
    public static ColorStateList m256C(Drawable drawable) {
        ColorStateList colorStateList;
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !AbstractC0056d.m128q(drawable)) {
            return null;
        }
        colorStateList = AbstractC0056d.m116e(drawable).getColorStateList();
        return colorStateList;
    }

    /* renamed from: D */
    public static Drawable m257D(Context context, int i) {
        return C1064H0.m2669b().m2672c(context, i);
    }

    /* renamed from: E */
    public static Drawable m258E(Context context, TypedArray typedArray, int i) {
        int resourceId;
        Drawable m257D;
        return (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (m257D = m257D(context, resourceId)) == null) ? typedArray.getDrawable(i) : m257D;
    }

    /* renamed from: F */
    public static Set m259F() {
        try {
            Object invoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return Collections.emptySet();
            }
            Set set = (Set) invoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.emptySet();
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.emptySet();
        }
    }

    /* renamed from: S */
    public static boolean m260S(Context context) {
        return context.getResources().getConfiguration().fontScale >= 1.3f;
    }

    /* renamed from: T */
    public static boolean m261T(Context context, EnumC1609b enumC1609b) {
        boolean isExternalStorageManager;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        boolean z2 = true;
        switch (enumC1609b.ordinal()) {
            case 1:
                if (AbstractC1695c.m4958a(context, "android.permission.READ_PHONE_STATE") != 0) {
                    break;
                }
                break;
            case 2:
                if (Build.VERSION.SDK_INT >= 30) {
                    isExternalStorageManager = Environment.isExternalStorageManager();
                    break;
                } else if (AbstractC1695c.m4958a(context, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
                    break;
                }
                break;
            case 4:
                if (MyAccessibilityService.f2328m == null) {
                    ComponentName componentName = new ComponentName(context, (Class<?>) MyAccessibilityService.class);
                    String flattenToString = componentName.flattenToString();
                    String flattenToShortString = componentName.flattenToShortString();
                    String packageName = componentName.getPackageName();
                    AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService("accessibility");
                    if (accessibilityManager != null && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1)) != null) {
                        Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
                        while (it.hasNext()) {
                            String id = it.next().getId();
                            if (id != null) {
                                if (!id.equalsIgnoreCase(flattenToString) && !id.equalsIgnoreCase(flattenToShortString)) {
                                    if ((!id.contains(packageName) || !id.contains("MyAccessibilityService")) && !m263W(componentName, ComponentName.unflattenFromString(id))) {
                                    }
                                }
                            }
                        }
                    }
                    try {
                        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_accessibility_services");
                        if (!TextUtils.isEmpty(string)) {
                            if (!string.contains(flattenToString) && !string.contains(flattenToShortString)) {
                                if (string.contains(packageName) && string.contains("MyAccessibilityService")) {
                                    break;
                                } else {
                                    for (String str : string.split("[:,]")) {
                                        String trim = str.trim();
                                        if (!trim.isEmpty() && (trim.equalsIgnoreCase(flattenToString) || trim.equalsIgnoreCase(flattenToShortString) || m263W(componentName, ComponentName.unflattenFromString(trim)))) {
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                    break;
                }
                break;
            case 6:
                String string2 = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
                if (!TextUtils.isEmpty(string2)) {
                    ComponentName componentName2 = new ComponentName(context, (Class<?>) MediaNotificationListenerService.class);
                    if (!string2.contains(componentName2.flattenToString()) && !string2.contains(componentName2.flattenToShortString())) {
                        z2 = false;
                    }
                    break;
                }
                break;
            case 7:
                if (AbstractC1695c.m4958a(context, "android.permission.ACCESS_COARSE_LOCATION") != 0 && AbstractC1695c.m4958a(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                    break;
                }
                break;
        }
        return false;
    }

    /* renamed from: U */
    public static boolean m262U(EnumC1609b enumC1609b) {
        cfgData m1784i = cfgData.m1784i();
        if (enumC1609b == EnumC1609b.WRITE_SETTINGS) {
            return m1784i.f2563R0;
        }
        if (enumC1609b == EnumC1609b.NOTIFICATION_ACCESS) {
            return m1784i.f2585W2 || m1784i.f2651k2 || m1784i.f2597Z2;
        }
        if (enumC1609b == EnumC1609b.LOCATION) {
            return m1784i.f2597Z2;
        }
        return true;
    }

    /* renamed from: W */
    public static boolean m263W(ComponentName componentName, ComponentName componentName2) {
        if (componentName2 == null || !componentName.getPackageName().equals(componentName2.getPackageName())) {
            return false;
        }
        String className = componentName.getClassName();
        String className2 = componentName2.getClassName();
        if (className.equals(className2)) {
            return true;
        }
        if (className2.startsWith(".")) {
            StringBuilder sb = new StringBuilder();
            sb.append(componentName.getPackageName());
            sb.append(className2);
            return className.equals(sb.toString()) || className.endsWith(className2);
        }
        if (!className.startsWith(".")) {
            int lastIndexOf = className.lastIndexOf(46);
            int lastIndexOf2 = className2.lastIndexOf(46);
            return lastIndexOf >= 0 && lastIndexOf2 >= 0 && className.substring(lastIndexOf + 1).equals(className2.substring(lastIndexOf2 + 1));
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(componentName2.getPackageName());
        sb2.append(className);
        return className2.equals(sb2.toString()) || className2.endsWith(className);
    }

    /* renamed from: Y */
    public static void m264Y(AbstractActivityC0870i abstractActivityC0870i, EnumC1609b enumC1609b) {
        ComponentName resolveActivity;
        EnumC1609b enumC1609b2 = EnumC1609b.PHONE;
        EnumC1609b enumC1609b3 = EnumC1609b.LOCATION;
        EnumC1609b enumC1609b4 = EnumC1609b.STORAGE;
        if (enumC1609b == enumC1609b2 || enumC1609b == enumC1609b4 || enumC1609b == enumC1609b3) {
            m283y(abstractActivityC0870i);
        }
        cfgData m1784i = cfgData.m1784i();
        int m4921P = AbstractC1687o.m4921P(m1784i.f2655l1);
        if (!m282u0(m1784i) || (enumC1609b != enumC1609b2 && enumC1609b != enumC1609b4 && enumC1609b != enumC1609b3)) {
            Intent m272i = m272i(abstractActivityC0870i, enumC1609b);
            if (m272i == null) {
                return;
            }
            m272i.addFlags(268435456);
            try {
                abstractActivityC0870i.startActivity(m272i);
                return;
            } catch (Exception unused) {
                Intent m272i2 = m272i(abstractActivityC0870i, enumC1609b);
                if (m272i2 == null) {
                    m272i2 = m267e(abstractActivityC0870i.getPackageName());
                }
                m272i2.addFlags(268435456);
                try {
                    abstractActivityC0870i.startActivity(m272i2);
                    return;
                } catch (Exception unused2) {
                    return;
                }
            }
        }
        String packageName = abstractActivityC0870i.getPackageName();
        PackageManager packageManager = abstractActivityC0870i.getPackageManager();
        ArrayList arrayList = new ArrayList(5);
        if (enumC1609b == enumC1609b4 && Build.VERSION.SDK_INT >= 30) {
            arrayList.add(new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + packageName)));
        }
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setComponent(new ComponentName("com.android.settings", "com.android.settings.Settings"));
        if (m4921P == 3) {
            intent.addFlags(268435456);
        } else {
            intent.addFlags(335544320);
        }
        arrayList.add(intent);
        Intent intent2 = new Intent();
        intent2.setComponent(new ComponentName("com.android.settings", "com.android.settings.applications.InstalledAppDetails"));
        intent2.putExtra("pkg", packageName);
        arrayList.add(intent2);
        Intent intent3 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + packageName));
        intent3.setPackage("com.android.settings");
        arrayList.add(intent3);
        Intent intent4 = new Intent("android.intent.action.MANAGE_APP_PERMISSIONS");
        intent4.setComponent(new ComponentName("com.android.packageinstaller", "com.android.packageinstaller.permission.ui.ManagePermissionsActivity"));
        intent4.putExtra("android.intent.extra.PACKAGE_NAME", packageName);
        arrayList.add(intent4);
        for (int i = 0; i < arrayList.size(); i++) {
            Intent intent5 = (Intent) arrayList.get(i);
            if (intent5 != null && ((resolveActivity = intent5.resolveActivity(packageManager)) == null || !"com.gwm.app.settings".equals(resolveActivity.getPackageName()))) {
                intent5.addFlags(268435456);
                try {
                    abstractActivityC0870i.startActivity(intent5);
                    return;
                } catch (Exception unused3) {
                    continue;
                }
            }
        }
    }

    /* renamed from: Z */
    public static void m265Z(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (inputConnection == null || editorInfo.hintText != null) {
            return;
        }
        for (ViewParent parent = textView.getParent(); parent instanceof View; parent = parent.getParent()) {
        }
    }

    /* renamed from: d */
    public static boolean m266d(AbstractActivityC0870i abstractActivityC0870i) {
        for (EnumC1609b enumC1609b : EnumC1609b.values()) {
            if (m262U(enumC1609b) && enumC1609b.f9230c && !m261T(abstractActivityC0870i, enumC1609b)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static Intent m267e(String str) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.fromParts("package", str, null));
    }

    /* renamed from: f */
    public static void m268f(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                AbstractC0070a.m206h(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                AbstractC0070a.m206h(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                AbstractC0070a.m207i(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    /* renamed from: g */
    public static void m269g(int[] iArr, int[] iArr2, int i, int i2, int i3, boolean z2) {
        int i4 = (i3 * 2) + 1;
        if (!z2) {
            for (int i5 = 0; i5 < i; i5++) {
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                for (int i10 = -i3; i10 <= i3; i10++) {
                    int i11 = iArr[(m277p(i10, i2 - 1) * i) + i5];
                    i6 += (i11 >>> 24) & Function.USE_VARARGS;
                    i7 += (i11 >> 16) & Function.USE_VARARGS;
                    i8 += (i11 >> 8) & Function.USE_VARARGS;
                    i9 += i11 & Function.USE_VARARGS;
                }
                for (int i12 = 0; i12 < i2; i12++) {
                    iArr2[(i12 * i) + i5] = ((i6 / i4) << 24) | ((i7 / i4) << 16) | ((i8 / i4) << 8) | (i9 / i4);
                    int i13 = i2 - 1;
                    int i14 = iArr[(m277p(i12 - i3, i13) * i) + i5];
                    int i15 = iArr[(m277p(i12 + i3 + 1, i13) * i) + i5];
                    i6 += ((i15 >>> 24) & Function.USE_VARARGS) - ((i14 >>> 24) & Function.USE_VARARGS);
                    i7 += ((i15 >> 16) & Function.USE_VARARGS) - ((i14 >> 16) & Function.USE_VARARGS);
                    i8 += ((i15 >> 8) & Function.USE_VARARGS) - ((i14 >> 8) & Function.USE_VARARGS);
                    i9 += (i15 & Function.USE_VARARGS) - (i14 & Function.USE_VARARGS);
                }
            }
            return;
        }
        for (int i16 = 0; i16 < i2; i16++) {
            int i17 = i16 * i;
            int i18 = 0;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            for (int i22 = -i3; i22 <= i3; i22++) {
                int i23 = iArr[m277p(i22, i - 1) + i17];
                i18 += (i23 >>> 24) & Function.USE_VARARGS;
                i19 += (i23 >> 16) & Function.USE_VARARGS;
                i20 += (i23 >> 8) & Function.USE_VARARGS;
                i21 += i23 & Function.USE_VARARGS;
            }
            for (int i24 = 0; i24 < i; i24++) {
                iArr2[i17 + i24] = ((i18 / i4) << 24) | ((i19 / i4) << 16) | ((i20 / i4) << 8) | (i21 / i4);
                int i25 = i - 1;
                int i26 = iArr[m277p(i24 - i3, i25) + i17];
                int i27 = iArr[m277p(i24 + i3 + 1, i25) + i17];
                i18 += ((i27 >>> 24) & Function.USE_VARARGS) - ((i26 >>> 24) & Function.USE_VARARGS);
                i19 += ((i27 >> 16) & Function.USE_VARARGS) - ((i26 >> 16) & Function.USE_VARARGS);
                i20 += ((i27 >> 8) & Function.USE_VARARGS) - ((i26 >> 8) & Function.USE_VARARGS);
                i21 += (i27 & Function.USE_VARARGS) - (i26 & Function.USE_VARARGS);
            }
        }
    }

    /* renamed from: h */
    public static void m270h(Bitmap bitmap, int i) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i2 = width * height;
        int[] iArr = new int[i2];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int[] iArr2 = new int[i2];
        m269g(iArr, iArr2, width, height, i, true);
        m269g(iArr2, iArr, width, height, i, false);
        bitmap.setPixels(iArr, 0, width, 0, 0, width, height);
    }

    /* renamed from: h0 */
    public static void m271h0(C0087k c0087k) {
        if (c0087k.f265f != null || c0087k.f266g != null) {
            throw new IllegalArgumentException();
        }
        if (c0087k.f263d) {
            return;
        }
        synchronized (AbstractC0088l.class) {
            try {
                long j2 = f268b + 8192;
                if (j2 > 65536) {
                    return;
                }
                f268b = j2;
                c0087k.f265f = f267a;
                c0087k.f262c = 0;
                c0087k.f261b = 0;
                f267a = c0087k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: i */
    public static Intent m272i(AbstractActivityC0870i abstractActivityC0870i, EnumC1609b enumC1609b) {
        String packageName = abstractActivityC0870i.getPackageName();
        String str = "package:";
        String str2 = null;
        switch (enumC1609b.ordinal()) {
            case 0:
                String str3 = cfgData.m1784i().f2718y;
                if (str3 != null && !str3.isEmpty()) {
                    str = str3;
                }
                Intent intent = new Intent("android.settings.action.MANAGE_OVERLAY_PERMISSION", Uri.parse(str + packageName));
                return intent.resolveActivity(abstractActivityC0870i.getPackageManager()) != null ? intent : m267e(packageName);
            case 1:
                return m267e(packageName);
            case 2:
                if (Build.VERSION.SDK_INT < 30) {
                    return m267e(packageName);
                }
                return new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION", Uri.parse("package:" + packageName));
            case 3:
                return new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + packageName));
            case 4:
                Intent intent2 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                intent2.addCategory("android.intent.category.DEFAULT");
                PackageManager packageManager = abstractActivityC0870i.getPackageManager();
                String[] strArr = {"com.android.settings", "com.gwm.settings", "com.gwm.car.settings"};
                int i = 0;
                while (true) {
                    if (i < 3) {
                        String str4 = strArr[i];
                        Intent intent3 = new Intent("android.settings.ACCESSIBILITY_SETTINGS");
                        intent3.setPackage(str4);
                        if (intent3.resolveActivity(packageManager) != null) {
                            str2 = str4;
                        } else {
                            i++;
                        }
                    }
                }
                if (str2 != null) {
                    intent2.setPackage(str2);
                }
                return intent2;
            case 5:
                return new Intent("android.settings.action.MANAGE_WRITE_SETTINGS", Uri.fromParts("package", packageName, null));
            case 6:
                return new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
            case 7:
                return m267e(packageName);
            default:
                return null;
        }
    }

    /* renamed from: i0 */
    public static void m273i0(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        AbstractC0070a.m206h(mutate, ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    /* renamed from: n0 */
    public static void m274n0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z2 = onLongClickListener != null;
        boolean z3 = hasOnClickListeners || z2;
        checkableImageButton.setFocusable(z3);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z2);
        checkableImageButton.setImportantForAccessibility(z3 ? 1 : 2);
    }

    /* renamed from: o */
    public static int m275o(Context context, String str) {
        int m4968c;
        int myPid = Process.myPid();
        int myUid = Process.myUid();
        String packageName = context.getPackageName();
        if (context.checkPermission(str, myPid, myUid) == -1) {
            return -1;
        }
        String m4969d = AbstractC1696d.m4969d(str);
        if (m4969d != null) {
            if (packageName == null) {
                String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                if (packagesForUid == null || packagesForUid.length <= 0) {
                    return -1;
                }
                packageName = packagesForUid[0];
            }
            int myUid2 = Process.myUid();
            String packageName2 = context.getPackageName();
            if (myUid2 != myUid || !Objects.equals(packageName2, packageName)) {
                m4968c = AbstractC1696d.m4968c((AppOpsManager) AbstractC1696d.m4966a(context, AppOpsManager.class), m4969d, packageName);
            } else if (Build.VERSION.SDK_INT >= 29) {
                AppOpsManager m4972c = AbstractC1697e.m4972c(context);
                m4968c = AbstractC1697e.m4970a(m4972c, m4969d, Binder.getCallingUid(), packageName);
                if (m4968c == 0) {
                    m4968c = AbstractC1697e.m4970a(m4972c, m4969d, myUid, AbstractC1697e.m4971b(context));
                }
            } else {
                m4968c = AbstractC1696d.m4968c((AppOpsManager) AbstractC1696d.m4966a(context, AppOpsManager.class), m4969d, packageName);
            }
            if (m4968c != 0) {
                return -2;
            }
        }
        return 0;
    }

    /* renamed from: o0 */
    public static void m276o0(TextView textView, int i) {
        AbstractC1687o.m4938g(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    /* renamed from: p */
    public static int m277p(int i, int i2) {
        if (i < 0) {
            return 0;
        }
        return Math.min(i, i2);
    }

    /* renamed from: q */
    public static int m278q(int i, int i2, int i3) {
        return i < i2 ? i2 : i > i3 ? i3 : i;
    }

    /* renamed from: q0 */
    public static C0087k m279q0() {
        synchronized (AbstractC0088l.class) {
            try {
                C0087k c0087k = f267a;
                if (c0087k == null) {
                    return new C0087k();
                }
                f267a = c0087k.f265f;
                c0087k.f265f = null;
                f268b -= 8192;
                return c0087k;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* renamed from: r0 */
    public static int m280r0(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: t */
    public static ImageView.ScaleType m281t(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    /* renamed from: u0 */
    public static boolean m282u0(cfgData cfgdata) {
        int m4921P = AbstractC1687o.m4921P(cfgdata.f2655l1);
        if (m4921P == 2 || m4921P == 3) {
            return true;
        }
        String str = cfgdata.f2650k1;
        if (str != null && str.length() >= 4) {
            String substring = str.substring(str.length() - 4);
            if ("1791".equalsIgnoreCase(substring)) {
                return true;
            }
            try {
                if (Integer.parseInt(substring, 16) >= 6672) {
                    return true;
                }
            } catch (NumberFormatException unused) {
            }
        }
        return false;
    }

    /* renamed from: y */
    public static void m283y(AbstractActivityC0870i abstractActivityC0870i) {
        cfgData m1784i = cfgData.m1784i();
        String str = m1784i.f2650k1;
        if (str != null && !str.isEmpty()) {
            if (m1784i.f2655l1 == 0) {
                m1784i.f2655l1 = AbstractC1372y1.m3318x(m1784i.f2650k1);
                return;
            }
            return;
        }
        try {
            String m3312r = AbstractC1372y1.m3312r("ro.software.version");
            if (m3312r != null && !m3312r.isEmpty()) {
                String trim = m3312r.trim();
                m1784i.f2650k1 = trim;
                m1784i.f2655l1 = AbstractC1372y1.m3318x(trim);
                m1784i.m1795o(abstractActivityC0870i);
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: G */
    public abstract int mo284G();

    /* renamed from: H */
    public abstract InputFilter[] mo285H(InputFilter[] inputFilterArr);

    /* renamed from: I */
    public abstract int mo286I();

    /* renamed from: J */
    public abstract int mo287J();

    /* renamed from: K */
    public abstract int mo288K();

    /* renamed from: L */
    public abstract int mo289L(View view);

    /* renamed from: M */
    public abstract int mo290M(CoordinatorLayout coordinatorLayout);

    /* renamed from: N */
    public abstract int mo291N();

    /* renamed from: O */
    public C0440f mo292O(AbstractActivityC0870i abstractActivityC0870i, Intent intent) {
        return null;
    }

    /* renamed from: P */
    public int mo293P(View view) {
        return 0;
    }

    /* renamed from: Q */
    public int mo294Q() {
        return 0;
    }

    /* renamed from: R */
    public abstract boolean mo295R(float f2);

    /* renamed from: V */
    public abstract boolean mo296V(View view);

    /* renamed from: X */
    public abstract boolean mo297X(float f2, float f3);

    /* renamed from: a0 */
    public void mo298a0(View view, int i) {
    }

    @Override // p022K.InterfaceC0176Y
    /* renamed from: b */
    public void mo299b() {
    }

    /* renamed from: b0 */
    public abstract void mo300b0(int i);

    @Override // p022K.InterfaceC0176Y
    /* renamed from: c */
    public void mo301c() {
    }

    /* renamed from: c0 */
    public abstract void mo302c0(View view, int i, int i2);

    /* renamed from: d0 */
    public abstract void mo303d0(View view, float f2, float f3);

    /* renamed from: e0 */
    public abstract Object mo304e0(Intent intent, int i);

    /* renamed from: f0 */
    public abstract void mo305f0(C1219f c1219f, C1219f c1219f2);

    /* renamed from: g0 */
    public abstract void mo306g0(C1219f c1219f, Thread thread);

    /* renamed from: j */
    public abstract int mo307j(ViewGroup.MarginLayoutParams marginLayoutParams);

    /* renamed from: j0 */
    public abstract void mo308j0(boolean z2);

    /* renamed from: k */
    public abstract float mo309k(int i);

    /* renamed from: k0 */
    public abstract void mo310k0(boolean z2);

    /* renamed from: l */
    public abstract boolean mo311l(AbstractFutureC1220g abstractFutureC1220g, C1216c c1216c);

    /* renamed from: l0 */
    public abstract void mo312l0(boolean z2);

    /* renamed from: m */
    public abstract boolean mo313m(AbstractFutureC1220g abstractFutureC1220g, Object obj, Object obj2);

    /* renamed from: m0 */
    public abstract void mo314m0(boolean z2);

    /* renamed from: n */
    public abstract boolean mo315n(AbstractFutureC1220g abstractFutureC1220g, C1219f c1219f, C1219f c1219f2);

    /* renamed from: p0 */
    public abstract boolean mo316p0(View view, float f2);

    /* renamed from: r */
    public abstract int mo317r(View view, int i);

    /* renamed from: s */
    public abstract int mo318s(View view, int i);

    /* renamed from: s0 */
    public abstract boolean mo319s0(View view, int i);

    /* renamed from: t0 */
    public abstract void mo320t0(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    /* renamed from: u */
    public abstract Typeface mo183u(Context context, C0040g c0040g, Resources resources, int i);

    /* renamed from: v */
    public abstract Typeface mo184v(Context context, C0118j[] c0118jArr, int i);

    /* renamed from: w */
    public Typeface mo186w(Context context, Resources resources, int i, String str, int i2) {
        File m4878t = AbstractC1680h.m4878t(context);
        if (m4878t == null) {
            return null;
        }
        try {
            if (AbstractC1680h.m4867h(m4878t, resources, i)) {
                return Typeface.createFromFile(m4878t.getPath());
            }
            return null;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            m4878t.delete();
        }
    }

    /* renamed from: x */
    public abstract Intent mo321x(AbstractActivityC0870i abstractActivityC0870i, Intent intent);

    /* renamed from: z */
    public C0118j mo192z(int i, C0118j[] c0118jArr) {
        new C0355e(1);
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z2 = (i & 2) != 0;
        C0118j c0118j = null;
        int i3 = Integer.MAX_VALUE;
        for (C0118j c0118j2 : c0118jArr) {
            int abs = (Math.abs(c0118j2.f372c - i2) * 2) + (c0118j2.f373d == z2 ? 0 : 1);
            if (c0118j == null || i3 > abs) {
                c0118j = c0118j2;
                i3 = abs;
            }
        }
        return c0118j;
    }
}
