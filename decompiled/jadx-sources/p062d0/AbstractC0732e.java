package p062d0;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import p006C.AbstractC0062j;
import p045W0.C0355e;
import p097q.AbstractC1241e;

/* renamed from: d0.e */
/* loaded from: classes.dex */
public abstract class AbstractC0732e {

    /* renamed from: a */
    public static final C0355e f3846a = new C0355e(22);

    /* renamed from: b */
    public static final byte[] f3847b = {112, 114, 111, 0};

    /* renamed from: c */
    public static final byte[] f3848c = {112, 114, 109, 0};

    /* renamed from: d */
    public static final byte[] f3849d = {48, 49, 53, 0};

    /* renamed from: e */
    public static final byte[] f3850e = {48, 49, 48, 0};

    /* renamed from: f */
    public static final byte[] f3851f = {48, 48, 57, 0};

    /* renamed from: g */
    public static final byte[] f3852g = {48, 48, 53, 0};

    /* renamed from: h */
    public static final byte[] f3853h = {48, 48, 49, 0};

    /* renamed from: i */
    public static final byte[] f3854i = {48, 48, 49, 0};

    /* renamed from: j */
    public static final byte[] f3855j = {48, 48, 50, 0};

    /* renamed from: a */
    public static byte[] m2164a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } finally {
            }
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    /* renamed from: b */
    public static byte[] m2165b(C0729b[] c0729bArr, byte[] bArr) {
        int i = 0;
        for (C0729b c0729b : c0729bArr) {
            i += ((((c0729b.f3843g * 2) + 7) & (-8)) / 8) + (c0729b.f3841e * 2) + m2167d(c0729b.f3837a, c0729b.f3838b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + c0729b.f3842f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i);
        if (Arrays.equals(bArr, f3851f)) {
            for (C0729b c0729b2 : c0729bArr) {
                m2179p(byteArrayOutputStream, c0729b2, m2167d(c0729b2.f3837a, c0729b2.f3838b, bArr));
                m2181r(byteArrayOutputStream, c0729b2);
                int[] iArr = c0729b2.f3844h;
                int length = iArr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = iArr[i2];
                    m2184u(byteArrayOutputStream, i4 - i3);
                    i2++;
                    i3 = i4;
                }
                m2180q(byteArrayOutputStream, c0729b2);
            }
        } else {
            for (C0729b c0729b3 : c0729bArr) {
                m2179p(byteArrayOutputStream, c0729b3, m2167d(c0729b3.f3837a, c0729b3.f3838b, bArr));
            }
            for (C0729b c0729b4 : c0729bArr) {
                m2181r(byteArrayOutputStream, c0729b4);
                int[] iArr2 = c0729b4.f3844h;
                int length2 = iArr2.length;
                int i5 = 0;
                int i6 = 0;
                while (i5 < length2) {
                    int i7 = iArr2[i5];
                    m2184u(byteArrayOutputStream, i7 - i6);
                    i5++;
                    i6 = i7;
                }
                m2180q(byteArrayOutputStream, c0729b4);
            }
        }
        if (byteArrayOutputStream.size() == i) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i);
    }

    /* renamed from: c */
    public static boolean m2166c(File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z2 = true;
        for (File file2 : listFiles) {
            z2 = m2166c(file2) && z2;
        }
        return z2;
    }

    /* renamed from: d */
    public static String m2167d(String str, String str2, byte[] bArr) {
        byte[] bArr2 = f3853h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f3852g;
        String str3 = (equals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.equals("classes.dex")) {
            return str;
        }
        if (str2.contains("!") || str2.contains(":")) {
            return "!".equals(str3) ? str2.replace(":", "!") : ":".equals(str3) ? str2.replace("!", ":") : str2;
        }
        if (str2.endsWith(".apk")) {
            return str2;
        }
        return AbstractC0062j.m162p(AbstractC1241e.m2942a(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2);
    }

    /* renamed from: e */
    public static void m2168e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } finally {
            }
        } catch (IOException unused) {
        }
    }

    /* renamed from: f */
    public static byte[] m2169f(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                throw new IllegalStateException(AbstractC0062j.m156j(i, "Not enough bytes to read: "));
            }
            i2 += read;
        }
        return bArr;
    }

    /* renamed from: g */
    public static int[] m2170g(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) m2176m(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        if (r0.finished() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0062, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006a, code lost:
    
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static byte[] m2171h(FileInputStream fileInputStream, int i, int i2) {
        Inflater inflater = new Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int i4 = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int read = fileInputStream.read(bArr2);
                if (read < 0) {
                    throw new IllegalStateException("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, read);
                try {
                    i4 += inflater.inflate(bArr, i4, i2 - i4);
                    i3 += read;
                } catch (DataFormatException e2) {
                    throw new IllegalStateException(e2.getMessage());
                }
            }
            throw new IllegalStateException("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
        } finally {
            inflater.end();
        }
    }

    /* renamed from: i */
    public static C0729b[] m2172i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, C0729b[] c0729bArr) {
        byte[] bArr3 = f3854i;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, f3855j)) {
                throw new IllegalStateException("Unsupported meta version");
            }
            int m2176m = (int) m2176m(fileInputStream, 2);
            byte[] m2171h = m2171h(fileInputStream, (int) m2176m(fileInputStream, 4), (int) m2176m(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                throw new IllegalStateException("Content found after the end of file");
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m2171h);
            try {
                C0729b[] m2174k = m2174k(byteArrayInputStream, bArr2, m2176m, c0729bArr);
                byteArrayInputStream.close();
                return m2174k;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(f3849d, bArr2)) {
            throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
        }
        if (!Arrays.equals(bArr, bArr3)) {
            throw new IllegalStateException("Unsupported meta version");
        }
        int m2176m2 = (int) m2176m(fileInputStream, 1);
        byte[] m2171h2 = m2171h(fileInputStream, (int) m2176m(fileInputStream, 4), (int) m2176m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(m2171h2);
        try {
            C0729b[] m2173j = m2173j(byteArrayInputStream2, m2176m2, c0729bArr);
            byteArrayInputStream2.close();
            return m2173j;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    /* renamed from: j */
    public static C0729b[] m2173j(ByteArrayInputStream byteArrayInputStream, int i, C0729b[] c0729bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0729b[0];
        }
        if (i != c0729bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m2176m = (int) m2176m(byteArrayInputStream, 2);
            iArr[i2] = (int) m2176m(byteArrayInputStream, 2);
            strArr[i2] = new String(m2169f(byteArrayInputStream, m2176m), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0729b c0729b = c0729bArr[i3];
            if (!c0729b.f3838b.equals(strArr[i3])) {
                throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
            }
            int i4 = iArr[i3];
            c0729b.f3841e = i4;
            c0729b.f3844h = m2170g(byteArrayInputStream, i4);
        }
        return c0729bArr;
    }

    /* renamed from: k */
    public static C0729b[] m2174k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, C0729b[] c0729bArr) {
        if (byteArrayInputStream.available() == 0) {
            return new C0729b[0];
        }
        if (i != c0729bArr.length) {
            throw new IllegalStateException("Mismatched number of dex files found in metadata");
        }
        for (int i2 = 0; i2 < i; i2++) {
            m2176m(byteArrayInputStream, 2);
            String str = new String(m2169f(byteArrayInputStream, (int) m2176m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long m2176m = m2176m(byteArrayInputStream, 4);
            int m2176m2 = (int) m2176m(byteArrayInputStream, 2);
            C0729b c0729b = null;
            if (c0729bArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                int i3 = 0;
                while (true) {
                    if (i3 >= c0729bArr.length) {
                        break;
                    }
                    if (c0729bArr[i3].f3838b.equals(substring)) {
                        c0729b = c0729bArr[i3];
                        break;
                    }
                    i3++;
                }
            }
            if (c0729b == null) {
                throw new IllegalStateException("Missing profile key: ".concat(str));
            }
            c0729b.f3840d = m2176m;
            int[] m2170g = m2170g(byteArrayInputStream, m2176m2);
            if (Arrays.equals(bArr, f3853h)) {
                c0729b.f3841e = m2176m2;
                c0729b.f3844h = m2170g;
            }
        }
        return c0729bArr;
    }

    /* renamed from: l */
    public static C0729b[] m2175l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (!Arrays.equals(bArr, f3850e)) {
            throw new IllegalStateException("Unsupported version");
        }
        int m2176m = (int) m2176m(fileInputStream, 1);
        byte[] m2171h = m2171h(fileInputStream, (int) m2176m(fileInputStream, 4), (int) m2176m(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            throw new IllegalStateException("Content found after the end of file");
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(m2171h);
        try {
            C0729b[] m2177n = m2177n(byteArrayInputStream, str, m2176m);
            byteArrayInputStream.close();
            return m2177n;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: m */
    public static long m2176m(InputStream inputStream, int i) {
        byte[] m2169f = m2169f(inputStream, i);
        long j2 = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j2 += (m2169f[i2] & 255) << (i2 * 8);
        }
        return j2;
    }

    /* renamed from: n */
    public static C0729b[] m2177n(ByteArrayInputStream byteArrayInputStream, String str, int i) {
        TreeMap treeMap;
        if (byteArrayInputStream.available() == 0) {
            return new C0729b[0];
        }
        C0729b[] c0729bArr = new C0729b[i];
        for (int i2 = 0; i2 < i; i2++) {
            int m2176m = (int) m2176m(byteArrayInputStream, 2);
            int m2176m2 = (int) m2176m(byteArrayInputStream, 2);
            c0729bArr[i2] = new C0729b(str, new String(m2169f(byteArrayInputStream, m2176m), StandardCharsets.UTF_8), m2176m(byteArrayInputStream, 4), m2176m2, (int) m2176m(byteArrayInputStream, 4), (int) m2176m(byteArrayInputStream, 4), new int[m2176m2], new TreeMap());
        }
        for (int i3 = 0; i3 < i; i3++) {
            C0729b c0729b = c0729bArr[i3];
            int available = byteArrayInputStream.available() - c0729b.f3842f;
            int i4 = 0;
            while (true) {
                int available2 = byteArrayInputStream.available();
                treeMap = c0729b.f3845i;
                if (available2 <= available) {
                    break;
                }
                i4 += (int) m2176m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i4), 1);
                for (int m2176m3 = (int) m2176m(byteArrayInputStream, 2); m2176m3 > 0; m2176m3--) {
                    m2176m(byteArrayInputStream, 2);
                    int m2176m4 = (int) m2176m(byteArrayInputStream, 1);
                    if (m2176m4 != 6 && m2176m4 != 7) {
                        while (m2176m4 > 0) {
                            m2176m(byteArrayInputStream, 1);
                            for (int m2176m5 = (int) m2176m(byteArrayInputStream, 1); m2176m5 > 0; m2176m5--) {
                                m2176m(byteArrayInputStream, 2);
                            }
                            m2176m4--;
                        }
                    }
                }
            }
            if (byteArrayInputStream.available() != available) {
                throw new IllegalStateException("Read too much data during profile line parse");
            }
            c0729b.f3844h = m2170g(byteArrayInputStream, c0729b.f3841e);
            int i5 = c0729b.f3843g;
            BitSet valueOf = BitSet.valueOf(m2169f(byteArrayInputStream, (((i5 * 2) + 7) & (-8)) / 8));
            for (int i6 = 0; i6 < i5; i6++) {
                int i7 = valueOf.get(i6) ? 2 : 0;
                if (valueOf.get(i6 + i5)) {
                    i7 |= 4;
                }
                if (i7 != 0) {
                    Integer num = (Integer) treeMap.get(Integer.valueOf(i6));
                    if (num == null) {
                        num = 0;
                    }
                    treeMap.put(Integer.valueOf(i6), Integer.valueOf(i7 | num.intValue()));
                }
            }
        }
        return c0729bArr;
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: o */
    public static boolean m2178o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, C0729b[] c0729bArr) {
        long j2;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f3849d;
        int i = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = f3850e;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] m2165b = m2165b(c0729bArr, bArr3);
                m2183t(byteArrayOutputStream, c0729bArr.length, 1);
                m2183t(byteArrayOutputStream, m2165b.length, 4);
                byte[] m2164a = m2164a(m2165b);
                m2183t(byteArrayOutputStream, m2164a.length, 4);
                byteArrayOutputStream.write(m2164a);
                return true;
            }
            byte[] bArr4 = f3852g;
            if (Arrays.equals(bArr, bArr4)) {
                m2183t(byteArrayOutputStream, c0729bArr.length, 1);
                for (C0729b c0729b : c0729bArr) {
                    int size = c0729b.f3845i.size() * 4;
                    String m2167d = m2167d(c0729b.f3837a, c0729b.f3838b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    m2184u(byteArrayOutputStream, m2167d.getBytes(charset).length);
                    m2184u(byteArrayOutputStream, c0729b.f3844h.length);
                    m2183t(byteArrayOutputStream, size, 4);
                    m2183t(byteArrayOutputStream, c0729b.f3839c, 4);
                    byteArrayOutputStream.write(m2167d.getBytes(charset));
                    Iterator it = c0729b.f3845i.keySet().iterator();
                    while (it.hasNext()) {
                        m2184u(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        m2184u(byteArrayOutputStream, 0);
                    }
                    for (int i2 : c0729b.f3844h) {
                        m2184u(byteArrayOutputStream, i2);
                    }
                }
                return true;
            }
            byte[] bArr5 = f3851f;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] m2165b2 = m2165b(c0729bArr, bArr5);
                m2183t(byteArrayOutputStream, c0729bArr.length, 1);
                m2183t(byteArrayOutputStream, m2165b2.length, 4);
                byte[] m2164a2 = m2164a(m2165b2);
                m2183t(byteArrayOutputStream, m2164a2.length, 4);
                byteArrayOutputStream.write(m2164a2);
                return true;
            }
            byte[] bArr6 = f3853h;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            m2184u(byteArrayOutputStream, c0729bArr.length);
            for (C0729b c0729b2 : c0729bArr) {
                String m2167d2 = m2167d(c0729b2.f3837a, c0729b2.f3838b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                m2184u(byteArrayOutputStream, m2167d2.getBytes(charset2).length);
                TreeMap treeMap = c0729b2.f3845i;
                m2184u(byteArrayOutputStream, treeMap.size());
                m2184u(byteArrayOutputStream, c0729b2.f3844h.length);
                m2183t(byteArrayOutputStream, c0729b2.f3839c, 4);
                byteArrayOutputStream.write(m2167d2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    m2184u(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i3 : c0729b2.f3844h) {
                    m2184u(byteArrayOutputStream, i3);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            m2184u(byteArrayOutputStream2, c0729bArr.length);
            int i4 = 2;
            int i5 = 2;
            for (C0729b c0729b3 : c0729bArr) {
                m2183t(byteArrayOutputStream2, c0729b3.f3839c, 4);
                m2183t(byteArrayOutputStream2, c0729b3.f3840d, 4);
                m2183t(byteArrayOutputStream2, c0729b3.f3843g, 4);
                String m2167d3 = m2167d(c0729b3.f3837a, c0729b3.f3838b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = m2167d3.getBytes(charset3).length;
                m2184u(byteArrayOutputStream2, length2);
                i5 = i5 + 14 + length2;
                byteArrayOutputStream2.write(m2167d3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i5 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i5 + ", does not match actual size " + byteArray.length);
            }
            C0739l c0739l = new C0739l(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList2.add(c0739l);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i6 = 0;
            int i7 = 0;
            while (i6 < c0729bArr.length) {
                try {
                    C0729b c0729b4 = c0729bArr[i6];
                    m2184u(byteArrayOutputStream3, i6);
                    m2184u(byteArrayOutputStream3, c0729b4.f3841e);
                    i7 = i7 + 4 + (c0729b4.f3841e * 2);
                    int[] iArr = c0729b4.f3844h;
                    int length3 = iArr.length;
                    int i8 = i;
                    while (i < length3) {
                        int i9 = iArr[i];
                        m2184u(byteArrayOutputStream3, i9 - i8);
                        i++;
                        i8 = i9;
                    }
                    i6++;
                    i = 0;
                } catch (Throwable th) {
                }
            }
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i7 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i7 + ", does not match actual size " + byteArray2.length);
            }
            C0739l c0739l2 = new C0739l(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0739l2);
            byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i10 = 0;
            int i11 = 0;
            while (i10 < c0729bArr.length) {
                try {
                    C0729b c0729b5 = c0729bArr[i10];
                    Iterator it3 = c0729b5.f3845i.entrySet().iterator();
                    int i12 = 0;
                    while (it3.hasNext()) {
                        i12 |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                    try {
                        m2180q(byteArrayOutputStream4, c0729b5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            m2181r(byteArrayOutputStream4, c0729b5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            m2184u(byteArrayOutputStream3, i10);
                            int length4 = byteArray3.length + i4 + byteArray4.length;
                            int i13 = i11 + 6;
                            ArrayList arrayList4 = arrayList3;
                            m2183t(byteArrayOutputStream3, length4, 4);
                            m2184u(byteArrayOutputStream3, i12);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i11 = i13 + length4;
                            i10++;
                            arrayList3 = arrayList4;
                            i4 = 2;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i11 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray5.length);
            }
            C0739l c0739l3 = new C0739l(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList2.add(c0739l3);
            long j3 = 4;
            long size2 = j3 + j3 + 4 + (arrayList2.size() * 16);
            m2183t(byteArrayOutputStream, arrayList2.size(), 4);
            int i14 = 0;
            while (i14 < arrayList2.size()) {
                C0739l c0739l4 = (C0739l) arrayList2.get(i14);
                int i15 = c0739l4.f3865a;
                if (i15 == 1) {
                    j2 = 0;
                } else if (i15 == 2) {
                    j2 = 1;
                } else if (i15 == 3) {
                    j2 = 2;
                } else if (i15 == 4) {
                    j2 = 3;
                } else {
                    if (i15 != 5) {
                        throw null;
                    }
                    j2 = 4;
                }
                m2183t(byteArrayOutputStream, j2, 4);
                m2183t(byteArrayOutputStream, size2, 4);
                byte[] bArr7 = c0739l4.f3866b;
                if (c0739l4.f3867c) {
                    long length5 = bArr7.length;
                    byte[] m2164a3 = m2164a(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(m2164a3);
                    m2183t(byteArrayOutputStream, m2164a3.length, 4);
                    m2183t(byteArrayOutputStream, length5, 4);
                    length = m2164a3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    m2183t(byteArrayOutputStream, bArr7.length, 4);
                    m2183t(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i14++;
                arrayList5 = arrayList;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i16 = 0; i16 < arrayList6.size(); i16++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i16));
            }
            return true;
        } catch (Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    /* renamed from: p */
    public static void m2179p(ByteArrayOutputStream byteArrayOutputStream, C0729b c0729b, String str) {
        Charset charset = StandardCharsets.UTF_8;
        m2184u(byteArrayOutputStream, str.getBytes(charset).length);
        m2184u(byteArrayOutputStream, c0729b.f3841e);
        m2183t(byteArrayOutputStream, c0729b.f3842f, 4);
        m2183t(byteArrayOutputStream, c0729b.f3839c, 4);
        m2183t(byteArrayOutputStream, c0729b.f3843g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    /* renamed from: q */
    public static void m2180q(ByteArrayOutputStream byteArrayOutputStream, C0729b c0729b) {
        byte[] bArr = new byte[(((c0729b.f3843g * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : c0729b.f3845i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i = intValue / 8;
                bArr[i] = (byte) (bArr[i] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i2 = intValue + c0729b.f3843g;
                int i3 = i2 / 8;
                bArr[i3] = (byte) ((1 << (i2 % 8)) | bArr[i3]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: r */
    public static void m2181r(ByteArrayOutputStream byteArrayOutputStream, C0729b c0729b) {
        int i = 0;
        for (Map.Entry entry : c0729b.f3845i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                m2184u(byteArrayOutputStream, intValue - i);
                m2184u(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01c2, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0104 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02b3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d3  */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v30 */
    /* JADX WARN: Type inference failed for: r6v34 */
    /* JADX WARN: Type inference failed for: r6v35 */
    /* JADX WARN: Type inference failed for: r6v36 */
    /* JADX WARN: Type inference failed for: r6v37 */
    /* JADX WARN: Type inference failed for: r6v38 */
    /* JADX WARN: Type inference failed for: r6v39 */
    /* JADX WARN: Type inference failed for: r6v40 */
    /* JADX WARN: Type inference failed for: r6v44 */
    /* JADX WARN: Type inference failed for: r6v45 */
    /* JADX WARN: Type inference failed for: r6v46 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m2182s(Context context, Executor executor, InterfaceC0731d interfaceC0731d, boolean z2) {
        boolean z3;
        ?? r6;
        IOException iOException;
        int i;
        C0729b[] c0729bArr;
        C0729b[] c0729bArr2;
        C0728a c0728a;
        C0729b[] c0729bArr3;
        byte[] bArr;
        boolean z4;
        boolean z5;
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream m2161f;
        boolean z6;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z2) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
                        try {
                            long readLong = dataInputStream.readLong();
                            dataInputStream.close();
                            z6 = readLong == packageInfo.lastUpdateTime;
                            if (z6) {
                                interfaceC0731d.mo947g(2, null);
                            }
                        } finally {
                        }
                    } catch (IOException unused) {
                    }
                    if (z6) {
                        Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                        AbstractC0738k.m2192c(context, false);
                        return;
                    }
                }
                z6 = false;
                if (z6) {
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            int i2 = Build.VERSION.SDK_INT;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            C0728a c0728a2 = new C0728a(assets, executor, interfaceC0731d, name, file2);
            byte[] bArr2 = (byte[]) c0728a2.f3832d;
            if (bArr2 == null) {
                c0728a2.m2163h(3, Integer.valueOf(i2));
            } else {
                if (!file2.exists()) {
                    try {
                        file2.createNewFile();
                    } catch (IOException unused2) {
                        z3 = true;
                        c0728a2.m2163h(4, null);
                    }
                } else if (!file2.canWrite()) {
                    c0728a2.m2163h(4, null);
                }
                c0728a2.f3829a = true;
                byte[] bArr3 = f3847b;
                try {
                    try {
                        r6 = c0728a2.m2161f(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e2) {
                        interfaceC0731d.mo947g(6, e2);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                        if (c0729bArr2 != null) {
                        }
                        c0728a = c0728a2;
                        InterfaceC0731d interfaceC0731d2 = (InterfaceC0731d) c0728a.f3831c;
                        c0729bArr3 = (C0729b[]) c0728a.f3836h;
                        ?? r62 = r6;
                        if (c0729bArr3 != null) {
                        }
                        bArr = (byte[]) c0728a.f3833e;
                        if (bArr != null) {
                        }
                        if (z5) {
                        }
                        AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                    } catch (IOException e3) {
                        interfaceC0731d.mo947g(7, e3);
                        r6 = 0;
                        if (r6 != 0) {
                        }
                        c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                        if (c0729bArr2 != null) {
                        }
                        c0728a = c0728a2;
                        InterfaceC0731d interfaceC0731d22 = (InterfaceC0731d) c0728a.f3831c;
                        c0729bArr3 = (C0729b[]) c0728a.f3836h;
                        ?? r622 = r6;
                        if (c0729bArr3 != null) {
                        }
                        bArr = (byte[]) c0728a.f3833e;
                        if (bArr != null) {
                        }
                        if (z5) {
                        }
                        AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                    }
                    if (r6 != 0) {
                        try {
                        } catch (IOException e4) {
                            i = 7;
                            interfaceC0731d.mo947g(7, e4);
                            try {
                                r6.close();
                            } catch (IOException e5) {
                                iOException = e5;
                                interfaceC0731d.mo947g(i, iOException);
                                c0729bArr = null;
                                r6 = r6;
                                c0728a2.f3836h = c0729bArr;
                                c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                                if (c0729bArr2 != null) {
                                }
                                c0728a = c0728a2;
                                InterfaceC0731d interfaceC0731d222 = (InterfaceC0731d) c0728a.f3831c;
                                c0729bArr3 = (C0729b[]) c0728a.f3836h;
                                ?? r6222 = r6;
                                if (c0729bArr3 != null) {
                                }
                                bArr = (byte[]) c0728a.f3833e;
                                if (bArr != null) {
                                }
                                if (z5) {
                                }
                                AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                            }
                            c0729bArr = null;
                            r6 = r6;
                            c0728a2.f3836h = c0729bArr;
                            c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                            if (c0729bArr2 != null) {
                            }
                            c0728a = c0728a2;
                            InterfaceC0731d interfaceC0731d2222 = (InterfaceC0731d) c0728a.f3831c;
                            c0729bArr3 = (C0729b[]) c0728a.f3836h;
                            ?? r62222 = r6;
                            if (c0729bArr3 != null) {
                            }
                            bArr = (byte[]) c0728a.f3833e;
                            if (bArr != null) {
                            }
                            if (z5) {
                            }
                            AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                        } catch (IllegalStateException e6) {
                            try {
                                interfaceC0731d.mo947g(8, e6);
                                try {
                                    r6.close();
                                } catch (IOException e7) {
                                    iOException = e7;
                                    i = 7;
                                    interfaceC0731d.mo947g(i, iOException);
                                    c0729bArr = null;
                                    r6 = r6;
                                    c0728a2.f3836h = c0729bArr;
                                    c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                                    if (c0729bArr2 != null) {
                                    }
                                    c0728a = c0728a2;
                                    InterfaceC0731d interfaceC0731d22222 = (InterfaceC0731d) c0728a.f3831c;
                                    c0729bArr3 = (C0729b[]) c0728a.f3836h;
                                    ?? r622222 = r6;
                                    if (c0729bArr3 != null) {
                                    }
                                    bArr = (byte[]) c0728a.f3833e;
                                    if (bArr != null) {
                                    }
                                    if (z5) {
                                    }
                                    AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                                }
                                c0729bArr = null;
                                r6 = r6;
                                c0728a2.f3836h = c0729bArr;
                                c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                                if (c0729bArr2 != null) {
                                }
                                c0728a = c0728a2;
                                InterfaceC0731d interfaceC0731d222222 = (InterfaceC0731d) c0728a.f3831c;
                                c0729bArr3 = (C0729b[]) c0728a.f3836h;
                                ?? r6222222 = r6;
                                if (c0729bArr3 != null) {
                                }
                                bArr = (byte[]) c0728a.f3833e;
                                if (bArr != null) {
                                }
                                if (z5) {
                                }
                                AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                            } catch (Throwable th) {
                                th = th;
                                Throwable th2 = th;
                                try {
                                    r6.close();
                                    throw th2;
                                } catch (IOException e8) {
                                    interfaceC0731d.mo947g(7, e8);
                                    throw th2;
                                }
                            }
                        }
                        if (!Arrays.equals(bArr3, m2169f(r6, 4))) {
                            throw new IllegalStateException("Invalid magic");
                        }
                        c0729bArr = m2175l(r6, m2169f(r6, 4), (String) c0728a2.f3835g);
                        try {
                            r6.close();
                            r6 = r6;
                        } catch (IOException e9) {
                            IOException iOException2 = e9;
                            interfaceC0731d.mo947g(7, iOException2);
                            r6 = iOException2;
                        }
                        c0728a2.f3836h = c0729bArr;
                    }
                    c0729bArr2 = (C0729b[]) c0728a2.f3836h;
                    if (c0729bArr2 != null) {
                        int i3 = Build.VERSION.SDK_INT;
                        r6 = 34;
                        r6 = 34;
                        r6 = 34;
                        if (i3 <= 34) {
                            switch (i3) {
                                case 31:
                                case 32:
                                case 33:
                                case 34:
                                    try {
                                        m2161f = c0728a2.m2161f(assets, "dexopt/baseline.profm");
                                    } catch (FileNotFoundException e10) {
                                        interfaceC0731d.mo947g(9, e10);
                                    } catch (IOException e11) {
                                        interfaceC0731d.mo947g(7, e11);
                                    } catch (IllegalStateException e12) {
                                        c0728a2.f3836h = null;
                                        interfaceC0731d.mo947g(8, e12);
                                    }
                                    if (m2161f == null) {
                                        if (m2161f != null) {
                                            m2161f.close();
                                        }
                                        c0728a = null;
                                        break;
                                    } else {
                                        try {
                                            boolean equals = Arrays.equals(f3848c, m2169f(m2161f, 4));
                                            if (!equals) {
                                                throw new IllegalStateException("Invalid magic");
                                            }
                                            c0728a2.f3836h = m2172i(m2161f, m2169f(m2161f, 4), bArr2, c0729bArr2);
                                            m2161f.close();
                                            c0728a = c0728a2;
                                            r6 = equals;
                                            break;
                                        } finally {
                                        }
                                    }
                                default:
                                    c0728a = c0728a2;
                                    InterfaceC0731d interfaceC0731d2222222 = (InterfaceC0731d) c0728a.f3831c;
                                    c0729bArr3 = (C0729b[]) c0728a.f3836h;
                                    ?? r62222222 = r6;
                                    if (c0729bArr3 != null) {
                                        byte[] bArr4 = (byte[]) c0728a.f3832d;
                                        r62222222 = bArr4;
                                        if (bArr4 != null) {
                                            if (!c0728a.f3829a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                byteArrayOutputStream = new ByteArrayOutputStream();
                                                try {
                                                    byteArrayOutputStream.write(bArr3);
                                                    byteArrayOutputStream.write(bArr4);
                                                } finally {
                                                }
                                            } catch (IOException e13) {
                                                interfaceC0731d2222222.mo947g(7, e13);
                                            } catch (IllegalStateException e14) {
                                                interfaceC0731d2222222.mo947g(8, e14);
                                            }
                                            if (m2178o(byteArrayOutputStream, bArr4, c0729bArr3)) {
                                                c0728a.f3833e = byteArrayOutputStream.toByteArray();
                                                byteArrayOutputStream.close();
                                                c0728a.f3836h = null;
                                                r62222222 = bArr4;
                                            } else {
                                                interfaceC0731d2222222.mo947g(5, null);
                                                c0728a.f3836h = null;
                                                byteArrayOutputStream.close();
                                                r62222222 = bArr4;
                                            }
                                        }
                                    }
                                    bArr = (byte[]) c0728a.f3833e;
                                    if (bArr != null) {
                                        z5 = false;
                                        z3 = true;
                                    } else {
                                        try {
                                            if (!c0728a.f3829a) {
                                                throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                            }
                                            try {
                                                try {
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                                                    try {
                                                        FileOutputStream fileOutputStream = new FileOutputStream((File) c0728a.f3834f);
                                                        try {
                                                            try {
                                                                byte[] bArr5 = new byte[512];
                                                                while (true) {
                                                                    int read = byteArrayInputStream.read(bArr5);
                                                                    if (read > 0) {
                                                                        fileOutputStream.write(bArr5, 0, read);
                                                                    } else {
                                                                        z3 = true;
                                                                        try {
                                                                            c0728a.m2163h(1, null);
                                                                            fileOutputStream.close();
                                                                            byteArrayInputStream.close();
                                                                            c0728a.f3833e = null;
                                                                            c0728a.f3836h = null;
                                                                            z5 = true;
                                                                        } catch (Throwable th3) {
                                                                            th = th3;
                                                                            Throwable th4 = th;
                                                                            try {
                                                                                fileOutputStream.close();
                                                                                throw th4;
                                                                            } catch (Throwable th5) {
                                                                                th4.addSuppressed(th5);
                                                                                throw th4;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } catch (Throwable th6) {
                                                                th = th6;
                                                                Throwable th7 = th;
                                                                try {
                                                                    byteArrayInputStream.close();
                                                                    throw th7;
                                                                } catch (Throwable th8) {
                                                                    th7.addSuppressed(th8);
                                                                    throw th7;
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                        }
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                    }
                                                } catch (FileNotFoundException e15) {
                                                    e = e15;
                                                    c0728a.m2163h(6, e);
                                                    z4 = r62222222;
                                                    z5 = false;
                                                    z3 = z4;
                                                    if (z5) {
                                                    }
                                                    AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                                                } catch (IOException e16) {
                                                    e = e16;
                                                    c0728a.m2163h(7, e);
                                                    z4 = r62222222;
                                                    z5 = false;
                                                    z3 = z4;
                                                    if (z5) {
                                                    }
                                                    AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                                                }
                                            } catch (FileNotFoundException e17) {
                                                e = e17;
                                                r62222222 = 1;
                                                c0728a.m2163h(6, e);
                                                z4 = r62222222;
                                                z5 = false;
                                                z3 = z4;
                                                if (z5) {
                                                }
                                                AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                                            } catch (IOException e18) {
                                                e = e18;
                                                r62222222 = 1;
                                                c0728a.m2163h(7, e);
                                                z4 = r62222222;
                                                z5 = false;
                                                z3 = z4;
                                                if (z5) {
                                                }
                                                AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                                            }
                                        } finally {
                                            c0728a.f3833e = null;
                                            c0728a.f3836h = null;
                                        }
                                    }
                                    if (z5) {
                                        m2168e(packageInfo, filesDir);
                                    }
                                    AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                            }
                        }
                    }
                    c0728a = c0728a2;
                    InterfaceC0731d interfaceC0731d22222222 = (InterfaceC0731d) c0728a.f3831c;
                    c0729bArr3 = (C0729b[]) c0728a.f3836h;
                    ?? r622222222 = r6;
                    if (c0729bArr3 != null) {
                    }
                    bArr = (byte[]) c0728a.f3833e;
                    if (bArr != null) {
                    }
                    if (z5) {
                    }
                    AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
                } catch (Throwable th11) {
                    th = th11;
                }
            }
            z3 = true;
            z5 = false;
            AbstractC0738k.m2192c(context, (z5 || !z2) ? false : z3);
        } catch (PackageManager.NameNotFoundException e19) {
            interfaceC0731d.mo947g(7, e19);
            AbstractC0738k.m2192c(context, false);
        }
    }

    /* renamed from: t */
    public static void m2183t(ByteArrayOutputStream byteArrayOutputStream, long j2, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j2 >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    /* renamed from: u */
    public static void m2184u(ByteArrayOutputStream byteArrayOutputStream, int i) {
        m2183t(byteArrayOutputStream, i, 2);
    }
}
