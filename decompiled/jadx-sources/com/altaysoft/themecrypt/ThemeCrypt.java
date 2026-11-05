package com.altaysoft.themecrypt;

import android.content.Context;
import java.nio.charset.StandardCharsets;
import p064e.InterfaceC0766a;

@InterfaceC0766a
/* loaded from: classes.dex */
public final class ThemeCrypt {

    /* renamed from: M0 */
    private static final byte f3333M0 = 84;

    /* renamed from: M1 */
    private static final byte f3334M1 = 76;

    /* renamed from: M2 */
    private static final byte f3335M2 = 67;

    /* renamed from: M3 */
    private static final byte f3336M3 = 49;
    private static String lastError;
    private static boolean loadFailed;
    private static boolean loaded;

    private ThemeCrypt() {
    }

    public static native byte[] decrypt(Context context, byte[] bArr);

    public static native byte[] encrypt(Context context, byte[] bArr);

    private static synchronized boolean ensureLoaded() {
        synchronized (ThemeCrypt.class) {
            if (loaded) {
                return true;
            }
            if (loadFailed) {
                return false;
            }
            try {
                System.loadLibrary("theme_crypt");
                loaded = true;
                lastError = null;
                return true;
            } catch (UnsatisfiedLinkError unused) {
                loadFailed = true;
                lastError = "native unavailable";
                return false;
            }
        }
    }

    public static boolean isWrapped(byte[] bArr) {
        return bArr != null && bArr.length >= 4 && bArr[0] == 84 && bArr[1] == 76 && bArr[2] == 67 && bArr[3] == 49;
    }

    public static String lastError() {
        return lastError;
    }

    public static String unwrapToJson(Context context, byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            lastError = "empty file";
            return null;
        }
        if (!isWrapped(bArr)) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
        if (context != null && ensureLoaded()) {
            try {
                byte[] decrypt = decrypt(context, bArr);
                if (decrypt == null) {
                    lastError = "decrypt failed";
                    return null;
                }
                lastError = null;
                return new String(decrypt, StandardCharsets.UTF_8);
            } catch (Throwable unused) {
                lastError = "decrypt failed";
            }
        }
        return null;
    }

    public static byte[] wrapJson(Context context, String str) {
        if (context == null || str == null) {
            lastError = "invalid input";
            return null;
        }
        if (!ensureLoaded()) {
            return null;
        }
        try {
            byte[] encrypt = encrypt(context, str.getBytes(StandardCharsets.UTF_8));
            if (encrypt == null) {
                lastError = "encrypt failed";
            } else {
                lastError = null;
            }
            return encrypt;
        } catch (Throwable unused) {
            lastError = "encrypt failed";
            return null;
        }
    }
}
