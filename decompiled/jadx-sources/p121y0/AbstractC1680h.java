package p121y0;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.os.storage.StorageManager;
import android.os.storage.StorageVolume;
import android.text.SpannableStringBuilder;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.inputmethod.EditorInfo;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import com.altaysoft.t500_split.R;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.UUID;
import java.util.function.ToIntFunction;
import org.json.JSONArray;
import org.json.JSONObject;
import p001A0.AbstractC0015i;
import p001A0.ViewOnClickListenerC0027u;
import p006C.C0063k;
import p014G.AbstractC0100a;
import p016H.C0112d;
import p016H.C0117i;
import p022K.AbstractC0177Z;
import p026M.AbstractC0256a;
import p033Q.InterfaceC0276j;
import p038T.C0323q;
import p038T.C0324r;
import p040U.C0337b;
import p045W0.C0371u;
import p052a.InterfaceC0458D;
import p058c.C0567a;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;
import p077j0.AbstractC0990u;
import p098q0.AbstractC1256E0;
import p098q0.EnumC1314f0;
import p098q0.ViewOnClickListenerC1326j0;
import p107t1.AbstractC1461d;
import p107t1.C1459b;
import p107t1.InterfaceC1458a;
import p115w0.C1619a;
import p115w0.C1623e;
import p119x1.InterfaceC1671a;
import p121y0.AbstractC1680h;

/* renamed from: y0.h */
/* loaded from: classes.dex */
public abstract class AbstractC1680h implements InterfaceC0276j {

    /* renamed from: f */
    public static long f9570f = 0;

    /* renamed from: g */
    public static Method f9571g = null;

    /* renamed from: h */
    public static boolean f9572h = true;

    /* renamed from: i */
    public static boolean f9573i;

    /* renamed from: j */
    public static Method f9574j;

    /* renamed from: A */
    public static synchronized ArrayList m4843A(Context context) {
        synchronized (AbstractC1680h.class) {
            File file = new File(context.getApplicationContext().getFilesDir(), "refuels.json");
            if (!file.isFile()) {
                return new ArrayList();
            }
            try {
                return m4848J(new JSONObject(m4850L(file)).optJSONArray("refuels"));
            } catch (Exception unused) {
                return new ArrayList();
            }
        }
    }

    /* renamed from: B */
    public static boolean m4844B(File file) {
        if (file == null || !file.isDirectory()) {
            return false;
        }
        return new File(new File(file, "conf"), "model.conf").isFile();
    }

    /* renamed from: C */
    public static MappedByteBuffer m4845C(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                try {
                    FileChannel channel = fileInputStream.getChannel();
                    MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                    fileInputStream.close();
                    openFileDescriptor.close();
                    return map;
                } finally {
                }
            } finally {
            }
        } catch (IOException unused) {
            return null;
        }
    }

    /* renamed from: D */
    public static String m4846D(EnumC1314f0 enumC1314f0) {
        int ordinal = enumC1314f0.ordinal();
        return ordinal != 1 ? ordinal != 2 ? "vosk-model-small-ru-0.22" : "vosk-model-ar-mgb2-0.0" : "vosk-model-small-en-us-0.15";
    }

    /* renamed from: E */
    public static boolean m4847E(String str, EnumC1314f0 enumC1314f0) {
        if (str == null) {
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        if (!lowerCase.contains("vosk")) {
            return false;
        }
        String m4860V = m4860V(m4846D(enumC1314f0));
        String m4860V2 = m4860V(lowerCase);
        if (!m4860V2.equals(m4860V) && !lowerCase.equals(m4860V)) {
            if (!lowerCase.startsWith(m4860V + "-")) {
                if (!lowerCase.startsWith(m4860V + "_")) {
                    int ordinal = enumC1314f0.ordinal();
                    return ordinal != 1 ? ordinal != 2 ? (lowerCase.contains("-ru-") || lowerCase.contains("_ru_") || lowerCase.contains("small-ru") || m4860V2.contains("vosk-model-small-ru")) && lowerCase.contains("vosk") : (lowerCase.contains("-ar-") || lowerCase.contains("_ar_") || lowerCase.contains("ar-mgb") || m4860V2.contains("vosk-model-ar")) && lowerCase.contains("vosk") : (lowerCase.contains("en-us") || lowerCase.contains("en_us") || lowerCase.contains("-en-")) && lowerCase.contains("vosk");
                }
            }
        }
        return true;
    }

    /* renamed from: J */
    public static ArrayList m4848J(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        for (int i = 0; i < jSONArray.length() && arrayList.size() < 30; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            C1676d c1676d = null;
            if (optJSONObject != null) {
                long optLong = optJSONObject.optLong("t", 0L);
                float optDouble = (float) optJSONObject.optDouble("from", Double.NaN);
                float optDouble2 = (float) optJSONObject.optDouble("to", Double.NaN);
                if (optLong > 0 && !Float.isNaN(optDouble) && !Float.isNaN(optDouble2)) {
                    c1676d = new C1676d();
                    c1676d.f9557a = UUID.randomUUID().toString();
                    c1676d.f9557a = optJSONObject.optString("id", UUID.randomUUID().toString());
                    c1676d.f9558b = optLong;
                    c1676d.f9559c = optDouble;
                    c1676d.f9560d = optDouble2;
                    float optDouble3 = (float) optJSONObject.optDouble("l", 0.0d);
                    float f2 = 0.0f;
                    if (Float.isNaN(optDouble3) || Float.isInfinite(optDouble3) || optDouble3 < 0.0f) {
                        optDouble3 = 0.0f;
                    }
                    c1676d.f9561e = optDouble3;
                    float optDouble4 = (float) optJSONObject.optDouble("odo", 0.0d);
                    if (!Float.isNaN(optDouble4) && !Float.isInfinite(optDouble4) && optDouble4 >= 0.0f) {
                        f2 = optDouble4;
                    }
                    c1676d.f9562f = f2;
                    c1676d.f9563g = optJSONObject.optInt("tank", 0);
                }
            }
            if (c1676d != null) {
                arrayList.add(c1676d);
            }
        }
        return arrayList;
    }

    /* renamed from: K */
    public static C0337b m4849K(MappedByteBuffer mappedByteBuffer) {
        long j2;
        ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j2 = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j2 = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j2 != -1) {
            duplicate.position(duplicate.position() + ((int) (j2 - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j3 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j3; i4++) {
                int i5 = duplicate.getInt();
                long j4 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j4 + j2));
                    C0337b c0337b = new C0337b();
                    duplicate.order(ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    c0337b.f470d = duplicate;
                    c0337b.f467a = position;
                    int i6 = position - duplicate.getInt(position);
                    c0337b.f468b = i6;
                    c0337b.f469c = ((ByteBuffer) c0337b.f470d).getShort(i6);
                    return c0337b;
                }
            }
        }
        throw new IOException("Cannot read metadata.");
    }

    /* renamed from: L */
    public static String m4850L(File file) {
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

    /* renamed from: M */
    public static int m4851M(Context context, int i, int i2) {
        TypedValue m4922Q = AbstractC1687o.m4922Q(context, i);
        return (m4922Q == null || m4922Q.type != 16) ? i2 : m4922Q.data;
    }

    /* renamed from: N */
    public static TimeInterpolator m4852N(Context context, int i, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type != 3) {
            throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
        }
        String valueOf = String.valueOf(typedValue.string);
        if (!m4882x(valueOf, "cubic-bezier") && !m4882x(valueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (m4882x(valueOf, "cubic-bezier")) {
            String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
            if (split.length == 4) {
                return AbstractC0256a.m775b(m4876r(split, 0), m4876r(split, 1), m4876r(split, 2), m4876r(split, 3));
            }
            throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
        }
        if (!m4882x(valueOf, "path")) {
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        String substring = valueOf.substring(5, valueOf.length() - 1);
        Path path = new Path();
        try {
            C0063k.m174b(AbstractC1687o.m4945n(substring), path);
            return AbstractC0256a.m776c(path);
        } catch (RuntimeException e2) {
            throw new RuntimeException("Error in parsing ".concat(substring), e2);
        }
    }

    /* renamed from: O */
    public static synchronized boolean m4853O(Context context, ArrayList arrayList) {
        synchronized (AbstractC1680h.class) {
            try {
                ArrayList<C1676d> arrayList2 = arrayList != null ? new ArrayList(arrayList) : new ArrayList();
                while (arrayList2.size() > 30) {
                    arrayList2.remove(arrayList2.size() - 1);
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("v", 1);
                    JSONArray jSONArray = new JSONArray();
                    for (C1676d c1676d : arrayList2) {
                        if (c1676d != null) {
                            jSONArray.put(c1676d.m4842a());
                        }
                    }
                    jSONObject.put("refuels", jSONArray);
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(context.getApplicationContext().getFilesDir(), "refuels.json")), StandardCharsets.UTF_8));
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

    /* renamed from: P */
    public static final void m4854P(View view, InterfaceC0458D interfaceC0458D) {
        AbstractC1461d.m3494e("<this>", view);
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0458D);
    }

    /* renamed from: Q */
    public static void m4855Q(Window window, boolean z2) {
        if (Build.VERSION.SDK_INT >= 30) {
            AbstractC0177Z.m526a(window, z2);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z2 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    /* renamed from: R */
    public static void m4856R(EditorInfo editorInfo, CharSequence charSequence, int i, int i2) {
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        editorInfo.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", charSequence != null ? new SpannableStringBuilder(charSequence) : null);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", i);
        editorInfo.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", i2);
    }

    /* renamed from: S */
    public static void m4857S(Context context, int i, String str, int i2, Runnable runnable) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.dialog_confirm, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.txt_confirm_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_confirm_msg);
        AppCompatButton appCompatButton = (AppCompatButton) inflate.findViewById(R.id.btn_confirm_ok);
        textView.setText(i);
        textView2.setText(str);
        appCompatButton.setText(i2);
        C0117i c0117i = new C0117i(context, R.style.T500Split_Dialog);
        ((C0863b) c0117i.f369g).f4328i = inflate;
        DialogInterfaceC0867f m365a = c0117i.m365a();
        m365a.setCancelable(true);
        m365a.setCanceledOnTouchOutside(true);
        AbstractC1256E0.m3022o(m365a);
        inflate.findViewById(R.id.btn_confirm_cancel).setOnClickListener(new ViewOnClickListenerC0027u(m365a, inflate, 5));
        appCompatButton.setOnClickListener(new ViewOnClickListenerC1326j0(m365a, inflate, runnable, 4));
        AbstractC1256E0.m3002Q(m365a, inflate);
    }

    /* renamed from: T */
    public static void m4858T(ArrayList arrayList, final float f2) {
        final int i = 0;
        Comparator thenComparingInt = Comparator.comparingInt(new ToIntFunction() { // from class: w0.c
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                C1619a c1619a = (C1619a) obj;
                float f3 = f2;
                if (AbstractC1680h.m4883y(c1619a, f3)) {
                    return 0;
                }
                return AbstractC1680h.m4884z(c1619a, f3) ? 1 : 2;
            }
        }).thenComparingInt(new ToIntFunction() { // from class: w0.d
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                C1619a c1619a = (C1619a) obj;
                switch (i) {
                    case 0:
                        return c1619a.f9254d == 0 ? 0 : 1;
                    default:
                        if (c1619a.f9254d == 0) {
                            return c1619a.f9255e;
                        }
                        return 0;
                }
            }
        });
        final int i2 = 1;
        Collections.sort(arrayList, thenComparingInt.thenComparingInt(new ToIntFunction() { // from class: w0.d
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                C1619a c1619a = (C1619a) obj;
                switch (i2) {
                    case 0:
                        return c1619a.f9254d == 0 ? 0 : 1;
                    default:
                        if (c1619a.f9254d == 0) {
                            return c1619a.f9255e;
                        }
                        return 0;
                }
            }
        }).thenComparingLong(new C1623e()));
    }

    /* renamed from: U */
    public static ArrayList m4859U(Context context) {
        File[] listFiles;
        ArrayList arrayList = new ArrayList();
        try {
            StorageManager storageManager = (StorageManager) context.getSystemService(StorageManager.class);
            if (storageManager != null) {
                Iterator<StorageVolume> it = storageManager.getStorageVolumes().iterator();
                while (it.hasNext()) {
                    File m4863Y = m4863Y(it.next());
                    if (m4863Y != null) {
                        arrayList.add(m4863Y);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        if (externalStorageDirectory != null) {
            arrayList.add(externalStorageDirectory);
        }
        String[] strArr = {"/mnt/media_rw", "/mnt/usb", "/storage/usb0", "/storage/usb1", "/storage/udisk", "/storage/udisk0", "/storage/udisk1"};
        for (int i = 0; i < 7; i++) {
            String str = strArr[i];
            File file = new File(str);
            if (file.isDirectory()) {
                arrayList.add(file);
            }
            if (("/mnt/media_rw".equals(str) || str.endsWith("media_rw")) && (listFiles = file.listFiles()) != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        arrayList.add(file2);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: V */
    public static String m4860V(String str) {
        return str.toLowerCase(Locale.ROOT).replaceAll("[-_]\\d+(\\.\\d+)*$", "");
    }

    /* renamed from: W */
    public static void m4861W(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC0990u.m2567b(viewGroup, z2);
        } else if (f9572h) {
            try {
                AbstractC0990u.m2567b(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                f9572h = false;
            }
        }
    }

    /* renamed from: X */
    public static long m4862X() {
        return LocalDate.now().toEpochDay();
    }

    /* renamed from: Y */
    public static File m4863Y(StorageVolume storageVolume) {
        if (storageVolume == null) {
            return null;
        }
        try {
            Object invoke = StorageVolume.class.getMethod("getDirectory", null).invoke(storageVolume, null);
            if (invoke instanceof File) {
                return (File) invoke;
            }
        } catch (Throwable unused) {
        }
        try {
            Object invoke2 = StorageVolume.class.getMethod("getPathFile", null).invoke(storageVolume, null);
            if (invoke2 instanceof File) {
                return (File) invoke2;
            }
        } catch (Throwable unused2) {
        }
        try {
            Object invoke3 = StorageVolume.class.getMethod("getPath", null).invoke(storageVolume, null);
            if (invoke3 instanceof String) {
                File file = new File((String) invoke3);
                if (file.isDirectory()) {
                    return file;
                }
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    /* renamed from: e */
    public static void m4864e(File file, ArrayList arrayList, HashSet hashSet) {
        if (m4844B(file) && hashSet.add(file.getAbsolutePath())) {
            arrayList.add(file);
        }
    }

    /* renamed from: f */
    public static void m4865f(File file, EnumC1314f0 enumC1314f0, ArrayList arrayList, HashSet hashSet) {
        String m4846D = m4846D(enumC1314f0);
        String m4860V = m4860V(m4846D(enumC1314f0));
        m4864e(new File(file, m4846D), arrayList, hashSet);
        m4864e(new File(new File(file, m4846D), m4846D), arrayList, hashSet);
        m4864e(new File(file, m4860V), arrayList, hashSet);
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory() && m4847E(file2.getName(), enumC1314f0)) {
                m4864e(file2, arrayList, hashSet);
            }
        }
    }

    /* renamed from: g */
    public static void m4866g(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: h */
    public static boolean m4867h(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean m4868i = m4868i(file, inputStream);
                m4866g(inputStream);
                return m4868i;
            } catch (Throwable th) {
                th = th;
                m4866g(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    /* renamed from: i */
    public static boolean m4868i(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    m4866g(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
                fileOutputStream.write(bArr, 0, read);
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            m4866g(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            m4866g(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    /* renamed from: j */
    public static int m4869j(File file, File file2) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return 0;
        }
        int i = 0;
        for (File file3 : listFiles) {
            File file4 = new File(file2, file3.getName());
            if (file3.isDirectory()) {
                if (!file4.mkdirs() && !file4.isDirectory()) {
                    throw new IOException("mkdir " + file4);
                }
                i += m4869j(file3, file4);
            } else if (file3.isFile()) {
                FileInputStream fileInputStream = new FileInputStream(file3);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file4);
                    try {
                        byte[] bArr = new byte[262144];
                        while (true) {
                            int read = fileInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                        }
                        fileOutputStream.close();
                        fileInputStream.close();
                        i++;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } else {
                continue;
            }
        }
        return i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /* renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0324r m4870k(Context context) {
        ProviderInfo providerInfo;
        C0112d c0112d;
        ApplicationInfo applicationInfo;
        PackageManager packageManager = context.getPackageManager();
        AbstractC1687o.m4939h("Package manager required to locate emoji font provider", packageManager);
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArr = packageManager.getPackageInfo(str2, 64).signatures;
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArr) {
                    arrayList.add(signature.toByteArray());
                }
                c0112d = new C0112d(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("emoji2.text.DefaultEmojiConfig", e2);
            }
            if (c0112d != null) {
                return null;
            }
            return new C0324r(new C0323q(context, c0112d));
        }
        c0112d = null;
        if (c0112d != null) {
        }
    }

    /* renamed from: l */
    public static void m4871l(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                m4871l(file2);
            }
        }
        file.delete();
    }

    /* renamed from: m */
    public static ArrayList m4872m(Context context) {
        String absolutePath;
        EnumMap enumMap = AbstractC0015i.f43a;
        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(context);
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        ArrayDeque arrayDeque = new ArrayDeque();
        Iterator it = m4859U(context).iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null && file.isDirectory()) {
                arrayDeque.add(file);
            }
        }
        int i = 0;
        while (!arrayDeque.isEmpty()) {
            int i2 = i + 1;
            if (i >= 4000) {
                break;
            }
            File file2 = (File) arrayDeque.poll();
            if (file2 != null) {
                try {
                    absolutePath = file2.getCanonicalPath();
                } catch (Exception unused) {
                    absolutePath = file2.getAbsolutePath();
                }
                if (hashSet.add(absolutePath)) {
                    if (m4844B(file2) && m4847E(file2.getName(), m3026s)) {
                        arrayList.add(file2);
                    } else {
                        String lowerCase = file2.getName().toLowerCase(Locale.ROOT);
                        if (!lowerCase.contains("vosk") && !lowerCase.equals("download") && !lowerCase.equals("downloads") && !lowerCase.equals("usb") && !lowerCase.startsWith("udisk") && !lowerCase.equals("media") && file2.getParentFile() != null) {
                            Iterator it2 = m4859U(context).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    File file3 = (File) it2.next();
                                    if (file3 == null || !file3.equals(file2)) {
                                    }
                                } else {
                                    int i3 = 0;
                                    File file4 = file2;
                                    while (file4 != null && i3 < 20) {
                                        file4 = file4.getParentFile();
                                        i3++;
                                    }
                                    if (i3 > 3) {
                                    }
                                }
                            }
                        }
                        try {
                            File[] listFiles = file2.listFiles();
                            if (listFiles == null) {
                                m4865f(file2, m3026s, arrayList, hashSet);
                            } else {
                                for (File file5 : listFiles) {
                                    if (file5.isDirectory() && !file5.getName().startsWith(".") && (!file5.getName().equalsIgnoreCase("Android") || !file2.equals(Environment.getExternalStorageDirectory()))) {
                                        if (!m4844B(file5) || !m4847E(file5.getName(), m3026s)) {
                                            arrayDeque.add(file5);
                                        } else if (hashSet.add(file5.getAbsolutePath())) {
                                            arrayList.add(file5);
                                        }
                                    }
                                }
                                m4865f(file2, m3026s, arrayList, hashSet);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                }
            }
            i = i2;
        }
        return arrayList;
    }

    /* renamed from: n */
    public static File m4873n(Context context, EnumC1314f0 enumC1314f0) {
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        File file = new File(externalFilesDir, m4860V(m4846D(enumC1314f0)));
        if (m4844B(file)) {
            return file;
        }
        File file2 = new File(externalFilesDir, m4846D(enumC1314f0));
        if (m4844B(file2)) {
            return file2;
        }
        File[] listFiles = externalFilesDir.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (m4844B(file3) && m4847E(file3.getName(), enumC1314f0)) {
                    return file3;
                }
            }
        }
        return null;
    }

    /* renamed from: p */
    public static final Class m4874p(C1459b c1459b) {
        Class mo3489a = c1459b.mo3489a();
        AbstractC1461d.m3492c("null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>", mo3489a);
        return mo3489a;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* renamed from: q */
    public static final Class m4875q(InterfaceC1671a interfaceC1671a) {
        AbstractC1461d.m3494e("<this>", interfaceC1671a);
        Class mo3489a = ((InterfaceC1458a) interfaceC1671a).mo3489a();
        if (!mo3489a.isPrimitive()) {
            return mo3489a;
        }
        String name = mo3489a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (!name.equals("double")) {
                }
                break;
            case 104431:
                if (!name.equals("int")) {
                }
                break;
            case 3039496:
                if (!name.equals("byte")) {
                }
                break;
            case 3052374:
                if (!name.equals("char")) {
                }
                break;
            case 3327612:
                if (!name.equals("long")) {
                }
                break;
            case 3625364:
                if (!name.equals("void")) {
                }
                break;
            case 64711720:
                if (!name.equals("boolean")) {
                }
                break;
            case 97526364:
                if (!name.equals("float")) {
                }
                break;
            case 109413500:
                if (!name.equals("short")) {
                }
                break;
        }
        return mo3489a;
    }

    /* renamed from: r */
    public static float m4876r(String[] strArr, int i) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* renamed from: s */
    public static Object m4877s(Bundle bundle, String str) {
        if (Build.VERSION.SDK_INT >= 34) {
            return AbstractC0100a.m336a(bundle, str, C0567a.class);
        }
        Parcelable parcelable = bundle.getParcelable(str);
        if (C0567a.class.isInstance(parcelable)) {
            return parcelable;
        }
        return null;
    }

    /* renamed from: t */
    public static File m4878t(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    /* renamed from: u */
    public static int m4879u(File file, Context context) {
        EnumMap enumMap = AbstractC0015i.f43a;
        EnumC1314f0 m3026s = AbstractC1256E0.m3026s(context);
        File externalFilesDir = context.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            externalFilesDir = context.getFilesDir();
        }
        File file2 = new File(externalFilesDir, m4860V(m4846D(m3026s)));
        if (!m4844B(file)) {
            throw new IOException("not a vosk model: " + file);
        }
        if (file2.exists()) {
            m4871l(file2);
        }
        if (!file2.mkdirs() && !file2.isDirectory()) {
            throw new IOException("mkdir " + file2);
        }
        int m4869j = m4869j(file, file2);
        if (m4869j < 5 || !m4844B(file2)) {
            throw new IOException("copied only " + m4869j + " files from " + file);
        }
        File externalFilesDir2 = context.getExternalFilesDir(null);
        if (externalFilesDir2 == null) {
            externalFilesDir2 = context.getFilesDir();
        }
        File[] listFiles = externalFilesDir2.listFiles();
        if (listFiles != null) {
            for (File file3 : listFiles) {
                if (!file3.equals(file2) && m4847E(file3.getName(), m3026s)) {
                    m4871l(file3);
                }
            }
        }
        return m4869j;
    }

    /* renamed from: v */
    public static boolean m4880v() {
        boolean isEnabled;
        try {
            if (f9571g == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        try {
            if (f9571g == null) {
                f9570f = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9571g = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9571g.invoke(null, Long.valueOf(f9570f))).booleanValue();
        } catch (Exception e2) {
            if (!(e2 instanceof InvocationTargetException)) {
                Log.v("Trace", "Unable to call isTagEnabled via reflection", e2);
                return false;
            }
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
    }

    /* renamed from: w */
    public static boolean m4881w(Context context) {
        EnumMap enumMap = AbstractC0015i.f43a;
        return m4873n(context, AbstractC1256E0.m3026s(context)) != null;
    }

    /* renamed from: x */
    public static boolean m4882x(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* renamed from: y */
    public static boolean m4883y(C1619a c1619a, float f2) {
        return c1619a.f9254d == 1 ? ((int) (c1619a.f9256f - m4862X())) <= 0 : f2 > 0.0f && c1619a.f9255e - Math.round(f2) <= 0;
    }

    /* renamed from: z */
    public static boolean m4884z(C1619a c1619a, float f2) {
        int round;
        if (c1619a.f9254d != 1) {
            return f2 > 0.0f && (round = c1619a.f9255e - Math.round(f2)) > 0 && round <= 500;
        }
        int m4862X = (int) (c1619a.f9256f - m4862X());
        return m4862X > 0 && m4862X <= 3;
    }

    /* renamed from: F */
    public abstract View mo1101F(int i);

    /* renamed from: G */
    public abstract void mo737G(int i);

    /* renamed from: H */
    public abstract void mo738H(Typeface typeface, boolean z2);

    /* renamed from: I */
    public abstract boolean mo1102I();

    /* renamed from: o */
    public abstract void mo940o(C0371u c0371u, float f2, float f3);
}
