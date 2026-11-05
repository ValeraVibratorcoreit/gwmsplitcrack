package p000A;

import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: A.d */
/* loaded from: classes.dex */
public final class C0003d {

    /* renamed from: a */
    public final String f0a;

    /* renamed from: b */
    public final HashMap f1b = new HashMap();

    public C0003d(String str) {
        this.f0a = str;
    }

    /* renamed from: a */
    public static boolean m7a(String str, String str2) {
        String m1333a = FileProvider.m1333a(str);
        String m1333a2 = FileProvider.m1333a(str2);
        if (!m1333a.equals(m1333a2)) {
            if (!m1333a.startsWith(m1333a2 + '/')) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    public final File m8b(Uri uri) {
        String encodedPath = uri.getEncodedPath();
        int indexOf = encodedPath.indexOf(47, 1);
        String decode = Uri.decode(encodedPath.substring(1, indexOf));
        String decode2 = Uri.decode(encodedPath.substring(indexOf + 1));
        File file = (File) this.f1b.get(decode);
        if (file == null) {
            throw new IllegalArgumentException("Unable to find configured root for " + uri);
        }
        File file2 = new File(file, decode2);
        try {
            File canonicalFile = file2.getCanonicalFile();
            if (m7a(canonicalFile.getPath(), file.getPath())) {
                return canonicalFile;
            }
            throw new SecurityException("Resolved path jumped beyond configured root");
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
        }
    }
}
