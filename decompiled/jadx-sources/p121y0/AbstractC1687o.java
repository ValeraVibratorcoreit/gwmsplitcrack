package p121y0;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.altaysoft.t500_split.NativeLib;
import com.altaysoft.t500_split.R;
import com.sun.jna.Function;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import p000A.AbstractC0001b;
import p006C.AbstractC0055c;
import p006C.AbstractC0062j;
import p006C.C0063k;
import p008D.AbstractC0070a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p032P0.C0266a;
import p033Q.AbstractC0270d;
import p033Q.AbstractC0271e;
import p038T.AbstractC0312f;
import p038T.C0326t;
import p045W0.C0354d;
import p045W0.C0356f;
import p045W0.C0357g;
import p045W0.C0359i;
import p068f0.AbstractC0778H;
import p068f0.C0789T;
import p071g0.InterfaceC0893f;
import p077j0.AbstractC0992w;
import p107t1.AbstractC1461d;
import p109u0.AbstractC1539g1;
import p109u0.AbstractC1569q1;
import p109u0.C1524b1;
import p109u0.C1527c1;
import p109u0.C1554l1;
import p109u0.C1560n1;
import p109u0.C1563o1;
import p115w0.C1619a;
import p115w0.EnumC1620b;

/* renamed from: y0.o */
/* loaded from: classes.dex */
public abstract class AbstractC1687o {

    /* renamed from: a */
    public static boolean f9618a = true;

    /* renamed from: b */
    public static Field f9619b;

    /* renamed from: c */
    public static boolean f9620c;

    /* renamed from: B */
    public static int m4909B(float f2, int i, int i2) {
        return AbstractC0055c.m105b(AbstractC0055c.m107d(i2, Math.round(Color.alpha(i2) * f2)), i);
    }

    /* renamed from: C */
    public static synchronized ArrayList m4910C(Context context) {
        synchronized (AbstractC1687o.class) {
            File file = new File(context.getApplicationContext().getFilesDir(), "trips.json");
            if (!file.isFile()) {
                return new ArrayList();
            }
            try {
                return m4916K(new JSONObject(m4919N(file)).optJSONArray("trips"));
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
    }

    /* renamed from: D */
    public static ArrayList m4911D(Context context) {
        File file = new File(context.getApplicationContext().getFilesDir(), "reminders.json");
        if (!file.isFile()) {
            return new ArrayList();
        }
        try {
            return m4917L(new JSONObject(m4920O(file)).optJSONArray("items"));
        } catch (Exception unused) {
            return new ArrayList();
        }
    }

    /* renamed from: E */
    public static int m4912E(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    /* renamed from: F */
    public static Typeface m4913F(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int i3;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, AbstractC0088l.m278q(i3 + weight, 1, 1000), typeface.isItalic());
    }

    /* renamed from: G */
    public static int m4914G(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    /* renamed from: J */
    public static float m4915J(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0271e.m794c(edgeEffect, f2, f3);
        }
        AbstractC0270d.m791a(edgeEffect, f2, f3);
        return f2;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0127 A[SYNTHETIC] */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList m4916K(JSONArray jSONArray) {
        int i;
        C1685m c1685m;
        C1685m c1685m2;
        C1684l c1684l;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int i2 = 0;
        while (i2 < jSONArray.length() && arrayList.size() < 30) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i2);
            if (optJSONObject == null) {
                i = i2;
                c1685m = null;
            } else {
                C1685m c1685m3 = new C1685m();
                c1685m3.f9604a = optJSONObject.optString("id", UUID.randomUUID().toString());
                c1685m3.f9605b = optJSONObject.optLong("start", 0L);
                long optLong = optJSONObject.optLong("end", 0L);
                c1685m3.f9606c = optLong;
                c1685m3.f9607d = optJSONObject.optLong("lastMove", optLong);
                c1685m3.f9608e = (float) optJSONObject.optDouble("odoStart", 0.0d);
                c1685m3.f9609f = (float) optJSONObject.optDouble("odoEnd", 0.0d);
                c1685m3.f9610g = (float) optJSONObject.optDouble("km", Math.max(0.0f, r7 - c1685m3.f9608e));
                i = i2;
                c1685m3.f9611h = optJSONObject.optLong("durationMs", Math.max(0L, c1685m3.f9606c - c1685m3.f9605b));
                c1685m3.f9612i = (float) optJSONObject.optDouble("avgSpeed", 0.0d);
                float optDouble = (float) optJSONObject.optDouble("fuelL", 0.0d);
                c1685m3.f9613j = optDouble;
                if (Float.isNaN(optDouble) || Float.isInfinite(c1685m3.f9613j) || c1685m3.f9613j < 0.0f) {
                    c1685m3.f9613j = 0.0f;
                }
                c1685m3.f9614k = optJSONObject.optBoolean("completed", true);
                JSONArray optJSONArray = optJSONObject.optJSONArray("refuels");
                if (optJSONArray != null) {
                    int i3 = 0;
                    while (i3 < optJSONArray.length()) {
                        JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                        if (optJSONObject2 == null) {
                            c1685m2 = c1685m3;
                        } else {
                            c1685m2 = c1685m3;
                            float optDouble2 = (float) optJSONObject2.optDouble("from", Double.NaN);
                            float optDouble3 = (float) optJSONObject2.optDouble("to", Double.NaN);
                            if (!Float.isNaN(optDouble2) && !Float.isNaN(optDouble3)) {
                                c1684l = new C1684l((float) optJSONObject2.optDouble("odo", 0.0d), optDouble2, optDouble3, 0, 0L);
                                c1684l.f9602d = optJSONObject2.optInt("tank", 0);
                                c1684l.f9603e = optJSONObject2.optLong("t", 0L);
                                C1685m c1685m4 = c1685m2;
                                if (c1684l == null) {
                                    c1685m4.f9615l.add(c1684l);
                                }
                                i3++;
                                c1685m3 = c1685m4;
                            }
                        }
                        c1684l = null;
                        C1685m c1685m42 = c1685m2;
                        if (c1684l == null) {
                        }
                        i3++;
                        c1685m3 = c1685m42;
                    }
                }
                C1685m c1685m5 = c1685m3;
                c1685m = c1685m5.f9605b <= 0 ? null : c1685m5;
            }
            if (c1685m != null) {
                arrayList.add(c1685m);
            }
            i2 = i + 1;
        }
        return arrayList;
    }

    /* renamed from: L */
    public static ArrayList m4917L(JSONArray jSONArray) {
        C1619a c1619a;
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length() && arrayList.size() < 20; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject == null) {
                c1619a = null;
            } else {
                C1619a c1619a2 = new C1619a();
                String optString = optJSONObject.optString("id", "");
                if (optString.isEmpty()) {
                    optString = UUID.randomUUID().toString();
                }
                c1619a2.f9251a = optString;
                String optString2 = optJSONObject.optString("icon", "star");
                EnumC1620b enumC1620b = EnumC1620b.STAR;
                if (optString2 != null) {
                    EnumC1620b[] values = EnumC1620b.values();
                    int length = values.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        EnumC1620b enumC1620b2 = values[i2];
                        if (enumC1620b2.f9259a.equals(optString2)) {
                            enumC1620b = enumC1620b2;
                            break;
                        }
                        i2++;
                    }
                }
                c1619a2.f9252b = enumC1620b;
                String optString3 = optJSONObject.optString("text", "");
                if (optString3.length() > 256) {
                    optString3 = optString3.substring(0, Function.MAX_NARGS);
                }
                c1619a2.f9253c = optString3;
                if ("date".equals(optJSONObject.optString("type", "odo"))) {
                    c1619a2.f9254d = 1;
                    c1619a2.f9256f = optJSONObject.optLong("targetEpochDay", 0L);
                } else {
                    c1619a2.f9254d = 0;
                    c1619a2.f9255e = optJSONObject.optInt("targetOdo", 0);
                }
                c1619a = c1619a2;
            }
            if (c1619a != null) {
                arrayList.add(c1619a);
            }
        }
        return arrayList;
    }

    /* renamed from: M */
    public static int m4918M(int i, String str) {
        if (str == null || str.isEmpty()) {
            return i;
        }
        try {
            return Color.parseColor(str);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: N */
    public static String m4919N(File file) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
                sb.append('\n');
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: O */
    public static String m4920O(File file) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), StandardCharsets.UTF_8));
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
                sb.append('\n');
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
    }

    /* renamed from: P */
    public static int m4921P(int i) {
        if (i <= 5952) {
            return 1;
        }
        return i == 6033 ? 2 : 3;
    }

    /* renamed from: Q */
    public static TypedValue m4922Q(Context context, int i) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* renamed from: R */
    public static boolean m4923R(Context context, int i, boolean z2) {
        TypedValue m4922Q = m4922Q(context, i);
        return (m4922Q == null || m4922Q.type != 18) ? z2 : m4922Q.data != 0;
    }

    /* renamed from: S */
    public static TypedValue m4924S(Context context, int i, String str) {
        TypedValue m4922Q = m4922Q(context, i);
        if (m4922Q != null) {
            return m4922Q;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i)));
    }

    /* renamed from: T */
    public static String m4925T(int i) {
        String javaStringByIndex = NativeLib.getJavaStringByIndex(i);
        return javaStringByIndex != null ? javaStringByIndex : "";
    }

    /* renamed from: U */
    public static void m4926U(Context context, ArrayList arrayList) {
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.size() > 20) {
            arrayList = new ArrayList(arrayList.subList(0, 20));
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("v", 1);
            JSONArray jSONArray = new JSONArray();
            for (C1619a c1619a : arrayList) {
                if (c1619a != null) {
                    jSONArray.put(c1619a.m4775a());
                }
            }
            jSONObject.put("items", jSONArray);
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(context.getApplicationContext().getFilesDir(), "reminders.json")), StandardCharsets.UTF_8));
            try {
                bufferedWriter.write(jSONObject.toString(2));
                bufferedWriter.close();
            } finally {
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: V */
    public static synchronized boolean m4927V(Context context, ArrayList arrayList) {
        synchronized (AbstractC1687o.class) {
            try {
                ArrayList<C1685m> arrayList2 = arrayList != null ? new ArrayList(arrayList) : new ArrayList();
                m4933b0(arrayList2);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("v", 1);
                    JSONArray jSONArray = new JSONArray();
                    for (C1685m c1685m : arrayList2) {
                        if (c1685m != null) {
                            jSONArray.put(c1685m.m4908b());
                        }
                    }
                    jSONObject.put("trips", jSONArray);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(context.getApplicationContext().getFilesDir(), "trips.json")), StandardCharsets.UTF_8));
                    try {
                        bufferedWriter.write(jSONObject.toString(2));
                        bufferedWriter.close();
                    } catch (Throwable th) {
                        try {
                            bufferedWriter.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    return false;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return true;
    }

    /* renamed from: W */
    public static final void m4928W(View view, InterfaceC0893f interfaceC0893f) {
        AbstractC1461d.m3494e("<this>", view);
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC0893f);
    }

    /* renamed from: X */
    public static void m4929X(View view, C0357g c0357g) {
        C0266a c0266a = c0357g.f1026f.f1009b;
        if (c0266a == null || !c0266a.f704a) {
            return;
        }
        float f2 = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            f2 += AbstractC0158F.m428i((View) parent);
        }
        C0356f c0356f = c0357g.f1026f;
        if (c0356f.f1019l != f2) {
            c0356f.f1019l = f2;
            c0357g.m961n();
        }
    }

    /* renamed from: Y */
    public static void m4930Y(Drawable drawable, int i) {
        AbstractC0070a.m205g(drawable, i);
    }

    /* renamed from: a */
    public static void m4931a(Context context, FrameLayout frameLayout, C1563o1 c1563o1, C1554l1 c1554l1, boolean z2) {
        Bitmap m4458j;
        if (c1554l1.f8375a) {
            int m4289a = c1554l1.m4289a();
            ImageView imageView = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
            imageView.setScaleType(scaleType);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(m4289a, m4289a);
            layoutParams.leftMargin = c1554l1.m4290b();
            layoutParams.topMargin = c1554l1.m4291c();
            frameLayout.addView(imageView, layoutParams);
            Bitmap bitmap = null;
            if (!AbstractC1569q1.m4451c()) {
                m4458j = AbstractC1569q1.m4458j(c1554l1.f8376b);
            } else if (context == null) {
                m4458j = null;
            } else {
                m4458j = BitmapFactory.decodeResource(context.getResources(), z2 ? R.drawable.theme_0_spd : R.drawable.theme_0_rpm);
            }
            if (m4458j != null) {
                m4458j.setDensity(0);
                imageView.setImageBitmap(m4458j);
            }
            if (c1563o1.f8499f.f8397a) {
                C1524b1 c1524b1 = new C1524b1(context);
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(m4289a, m4289a);
                layoutParams2.leftMargin = c1554l1.m4290b();
                layoutParams2.topMargin = c1554l1.m4291c();
                frameLayout.addView(c1524b1, layoutParams2);
                c1524b1.m4158a(c1563o1.f8499f, c1554l1.f8382h);
                c1524b1.setNeedleAngle((c1554l1.f8382h + c1554l1.f8383i) * 0.5f);
            }
            ImageView imageView2 = new ImageView(context);
            imageView2.setScaleType(scaleType);
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(m4289a, m4289a);
            layoutParams3.leftMargin = c1554l1.m4290b();
            layoutParams3.topMargin = c1554l1.m4291c();
            frameLayout.addView(imageView2, layoutParams3);
            if (!AbstractC1569q1.m4451c()) {
                bitmap = AbstractC1569q1.m4458j(c1554l1.f8377c);
            } else if (context != null) {
                bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.theme_0_needle);
            }
            if (bitmap != null) {
                bitmap.setDensity(0);
                imageView2.setImageBitmap(bitmap);
            }
            float f2 = m4289a * 0.5f;
            imageView2.setPivotX(f2);
            imageView2.setPivotY(f2);
            imageView2.setRotation((c1554l1.f8382h + c1554l1.f8383i) * 0.5f);
        }
    }

    /* renamed from: b */
    public static C1527c1 m4932b(Context context, FrameLayout frameLayout, C1560n1 c1560n1, boolean z2) {
        String str;
        C1527c1 c1527c1 = new C1527c1(context);
        int i = 0;
        c1527c1.setIncludeFontPadding(false);
        if (z2) {
            c1527c1.setText(c1560n1.f8489x);
            try {
                String str2 = c1560n1.f8428B;
                if (str2 == null) {
                    str2 = "#747679";
                }
                c1527c1.setTextColor(Color.parseColor(str2));
            } catch (Exception unused) {
                c1527c1.setTextColor(-7829368);
            }
            c1527c1.setTextSize(0, c1560n1.f8429C ? c1560n1.f8431E : c1560n1.f8469i);
            String m4295b = c1560n1.m4295b();
            boolean z3 = c1560n1.f8429C;
            boolean z4 = z3 ? c1560n1.f8432F : c1560n1.f8471j;
            boolean z5 = z3 ? c1560n1.f8433G : c1560n1.f8473k;
            if (z4 && z5) {
                i = 3;
            } else if (z4) {
                i = 1;
            } else if (z5) {
                i = 2;
            }
            c1527c1.setTypeface(AbstractC1539g1.m4216f0(context, i, m4295b));
        } else {
            String str3 = c1560n1.f8453a;
            if (str3 == null || !str3.startsWith("label_")) {
                str = c1560n1.f8486u;
            } else {
                String str4 = c1560n1.f8487v;
                str = (str4 == null || str4.isEmpty()) ? c1560n1.f8486u : c1560n1.f8487v;
            }
            if (str == null) {
                str = "";
            }
            c1527c1.setText(str);
            try {
                String str5 = c1560n1.f8479n;
                if (str5 == null) {
                    str5 = "#FFFFFF";
                }
                c1527c1.setTextColor(Color.parseColor(str5));
            } catch (Exception unused2) {
                c1527c1.setTextColor(-1);
            }
            c1527c1.setTextSize(0, c1560n1.f8469i);
            String str6 = c1560n1.f8467h;
            boolean z6 = c1560n1.f8471j;
            boolean z7 = c1560n1.f8473k;
            if (z6 && z7) {
                i = 3;
            } else if (z6) {
                i = 1;
            } else if (z7) {
                i = 2;
            }
            c1527c1.setTypeface(AbstractC1539g1.m4216f0(context, i, str6));
            C1527c1.m4165h(c1527c1, c1560n1.f8475l, c1560n1.f8477m);
        }
        frameLayout.addView(c1527c1, new FrameLayout.LayoutParams(-2, -2));
        if (!z2) {
            AbstractC1539g1.m4201W(c1527c1, c1560n1.f8459d, c1560n1.f8461e, c1560n1.f8463f);
        }
        return c1527c1;
    }

    /* renamed from: b0 */
    public static void m4933b0(ArrayList arrayList) {
        while (arrayList.size() > 30) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    /* renamed from: c */
    public static int m4934c(View view) {
        AbstractC1461d.m3494e("<this>", view);
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        int visibility = view.getVisibility();
        if (visibility == 0) {
            return 2;
        }
        if (visibility == 4) {
            return 4;
        }
        if (visibility == 8) {
            return 3;
        }
        throw new IllegalArgumentException(AbstractC0062j.m156j(visibility, "Unknown visibility "));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r10.bottom <= r12.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
    
        if (r9 == 17) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r9 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        r11 = m4912E(r9, r10, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
    
        if (r9 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
    
        if (r9 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r9 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r9 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        r9 = r12.bottom;
        r10 = r10.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r11 >= java.lang.Math.max(1, r9 - r10)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0076, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0060, code lost:
    
        r9 = r12.right;
        r10 = r10.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0065, code lost:
    
        r9 = r10.top;
        r10 = r12.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        r9 = r10.left;
        r10 = r12.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0033, code lost:
    
        if (r10.right <= r12.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003a, code lost:
    
        if (r10.top >= r12.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0041, code lost:
    
        if (r10.left >= r12.right) goto L24;
     */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean m4935d(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean m4936e = m4936e(i, rect, rect2);
        if (m4936e(i, rect, rect3) || !m4936e) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: e */
    public static boolean m4936e(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* renamed from: f */
    public static void m4937f(String str, boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: g */
    public static void m4938g(int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: h */
    public static void m4939h(String str, Object obj) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    /* renamed from: i */
    public static int m4940i(C0789T c0789t, AbstractC0312f abstractC0312f, View view, View view2, AbstractC0778H abstractC0778H, boolean z2) {
        if (abstractC0778H.m2247v() == 0 || c0789t.m2265b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return Math.abs(AbstractC0778H.m2218H(view) - AbstractC0778H.m2218H(view2)) + 1;
        }
        return Math.min(abstractC0312f.mo888l(), abstractC0312f.mo878b(view2) - abstractC0312f.mo881e(view));
    }

    /* renamed from: j */
    public static int m4941j(C0789T c0789t, AbstractC0312f abstractC0312f, View view, View view2, AbstractC0778H abstractC0778H, boolean z2, boolean z3) {
        if (abstractC0778H.m2247v() == 0 || c0789t.m2265b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z3 ? Math.max(0, (c0789t.m2265b() - Math.max(AbstractC0778H.m2218H(view), AbstractC0778H.m2218H(view2))) - 1) : Math.max(0, Math.min(AbstractC0778H.m2218H(view), AbstractC0778H.m2218H(view2)));
        if (z2) {
            return Math.round((max * (Math.abs(abstractC0312f.mo878b(view2) - abstractC0312f.mo881e(view)) / (Math.abs(AbstractC0778H.m2218H(view) - AbstractC0778H.m2218H(view2)) + 1))) + (abstractC0312f.mo887k() - abstractC0312f.mo881e(view)));
        }
        return max;
    }

    /* renamed from: k */
    public static int m4942k(C0789T c0789t, AbstractC0312f abstractC0312f, View view, View view2, AbstractC0778H abstractC0778H, boolean z2) {
        if (abstractC0778H.m2247v() == 0 || c0789t.m2265b() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z2) {
            return c0789t.m2265b();
        }
        return (int) (((abstractC0312f.mo878b(view2) - abstractC0312f.mo881e(view)) / (Math.abs(AbstractC0778H.m2218H(view) - AbstractC0778H.m2218H(view2)) + 1)) * c0789t.m2265b());
    }

    /* renamed from: l */
    public static float[] m4943l(float[] fArr, int i) {
        if (i < 0) {
            throw new IllegalArgumentException();
        }
        int length = fArr.length;
        if (length < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        int min = Math.min(i, length);
        float[] fArr2 = new float[i];
        System.arraycopy(fArr, 0, fArr2, 0, min);
        return fArr2;
    }

    /* renamed from: m */
    public static AbstractC1680h m4944m(int i) {
        if (i != 0 && i == 1) {
            return new C0354d();
        }
        return new C0359i();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0063k[] m4945n(String str) {
        int i;
        String trim;
        float[] fArr;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i4 < str.length()) {
            while (i4 < str.length()) {
                char charAt = str.charAt(i4);
                if ((charAt - 'Z') * (charAt - 'A') > 0) {
                    if ((charAt - 'z') * (charAt - 'a') > 0) {
                        continue;
                        i4++;
                    }
                }
                if (charAt != 'e' && charAt != 'E') {
                    trim = str.substring(i3, i4).trim();
                    if (!trim.isEmpty()) {
                        if (trim.charAt(i2) == 'z' || trim.charAt(i2) == 'Z') {
                            fArr = new float[i2];
                        } else {
                            try {
                                float[] fArr2 = new float[trim.length()];
                                int length = trim.length();
                                int i5 = i2;
                                int i6 = 1;
                                while (i6 < length) {
                                    int i7 = i2;
                                    int i8 = i7;
                                    int i9 = i8;
                                    int i10 = i9;
                                    for (int i11 = i6; i11 < trim.length(); i11++) {
                                        char charAt2 = trim.charAt(i11);
                                        if (charAt2 != ' ') {
                                            if (charAt2 != 'E' && charAt2 != 'e') {
                                                switch (charAt2) {
                                                    case ',':
                                                        break;
                                                    case '-':
                                                        if (i11 != i6 && i7 == 0) {
                                                            i7 = 0;
                                                            i9 = 1;
                                                            i10 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        break;
                                                    case '.':
                                                        if (i8 == 0) {
                                                            i7 = 0;
                                                            i8 = 1;
                                                            break;
                                                        }
                                                        i7 = 0;
                                                        i9 = 1;
                                                        i10 = 1;
                                                        break;
                                                    default:
                                                        i7 = 0;
                                                        break;
                                                }
                                            } else {
                                                i7 = 1;
                                            }
                                            if (i9 == 0) {
                                                if (i6 < i11) {
                                                    fArr2[i5] = Float.parseFloat(trim.substring(i6, i11));
                                                    i5++;
                                                }
                                                i6 = i10 == 0 ? i11 : i11 + 1;
                                                i2 = 0;
                                            }
                                        }
                                        i7 = 0;
                                        i9 = 1;
                                        if (i9 == 0) {
                                        }
                                    }
                                    if (i6 < i11) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    i2 = 0;
                                }
                                fArr = m4943l(fArr2, i5);
                                i2 = 0;
                            } catch (NumberFormatException e2) {
                                throw new RuntimeException(AbstractC0062j.m161o("error in parsing \"", trim, "\""), e2);
                            }
                        }
                        arrayList.add(new C0063k(trim.charAt(i2), fArr));
                    }
                    i3 = i4;
                    i4++;
                    i2 = 0;
                }
                i4++;
            }
            trim = str.substring(i3, i4).trim();
            if (!trim.isEmpty()) {
            }
            i3 = i4;
            i4++;
            i2 = 0;
        }
        if (i4 - i3 != 1 || i3 >= str.length()) {
            i = 0;
        } else {
            i = 0;
            arrayList.add(new C0063k(str.charAt(i3), new float[0]));
        }
        return (C0063k[]) arrayList.toArray(new C0063k[i]);
    }

    /* renamed from: o */
    public static C0063k[] m4946o(C0063k[] c0063kArr) {
        C0063k[] c0063kArr2 = new C0063k[c0063kArr.length];
        for (int i = 0; i < c0063kArr.length; i++) {
            c0063kArr2[i] = new C0063k(c0063kArr[i]);
        }
        return c0063kArr2;
    }

    /* renamed from: r */
    public static int m4947r(Context context, int i, int i2) {
        Integer num;
        TypedValue m4922Q = m4922Q(context, i);
        if (m4922Q != null) {
            int i3 = m4922Q.resourceId;
            num = Integer.valueOf(i3 != 0 ? AbstractC0001b.m3a(context, i3) : m4922Q.data);
        } else {
            num = null;
        }
        return num != null ? num.intValue() : i2;
    }

    /* renamed from: s */
    public static int m4948s(View view, int i) {
        Context context = view.getContext();
        TypedValue m4924S = m4924S(view.getContext(), i, view.getClass().getCanonicalName());
        int i2 = m4924S.resourceId;
        return i2 != 0 ? AbstractC0001b.m3a(context, i2) : m4924S.data;
    }

    /* renamed from: t */
    public static float m4949t(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC0271e.m793b(edgeEffect);
        }
        return 0.0f;
    }

    /* renamed from: w */
    public static int m4950w(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        throw new IllegalArgumentException(AbstractC0062j.m156j(i, "type needs to be >= FIRST and <= LAST, type="));
    }

    /* renamed from: x */
    public static boolean m4951x(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    /* renamed from: y */
    public static boolean m4952y(int i) {
        boolean z2;
        if (i != 0) {
            ThreadLocal threadLocal = AbstractC0055c.f201a;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length != 3) {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
            double d = red / 255.0d;
            double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
            double d2 = green / 255.0d;
            double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
            double d3 = blue / 255.0d;
            double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
            z2 = false;
            dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
            double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
            dArr[1] = d4;
            dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
            if (d4 / 100.0d > 0.5d) {
                return true;
            }
        } else {
            z2 = false;
        }
        return z2;
    }

    /* renamed from: z */
    public static boolean m4953z(EditText editText) {
        return editText.getInputType() != 0;
    }

    /* renamed from: A */
    public abstract boolean mo2486A(Class cls);

    /* renamed from: H */
    public abstract void mo875H(Throwable th);

    /* renamed from: I */
    public abstract void mo876I(C0326t c0326t);

    /* renamed from: Z */
    public void mo2512Z(View view, float f2) {
        if (f9618a) {
            try {
                AbstractC0992w.m2571b(view, f2);
                return;
            } catch (NoSuchMethodError unused) {
                f9618a = false;
            }
        }
        view.setAlpha(f2);
    }

    /* renamed from: a0 */
    public void mo2508a0(View view, int i) {
        if (!f9620c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f9619b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f9620c = true;
        }
        Field field = f9619b;
        if (field != null) {
            try {
                f9619b.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    /* renamed from: p */
    public abstract Method mo2487p(Field field, Class cls);

    /* renamed from: q */
    public abstract Constructor mo2488q(Class cls);

    /* renamed from: u */
    public abstract String[] mo2489u(Class cls);

    /* renamed from: v */
    public float mo2513v(View view) {
        if (f9618a) {
            try {
                return AbstractC0992w.m2570a(view);
            } catch (NoSuchMethodError unused) {
                f9618a = false;
            }
        }
        return view.getAlpha();
    }
}
