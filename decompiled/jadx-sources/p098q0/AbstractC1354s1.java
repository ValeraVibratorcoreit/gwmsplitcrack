package p098q0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Handler;
import com.altaysoft.t500_split.NativeLib;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/* renamed from: q0.s1 */
/* loaded from: classes.dex */
public abstract class AbstractC1354s1 {

    /* renamed from: a */
    public static final C1259G f6359a = new C1259G(12582912, 1);

    /* JADX WARN: Removed duplicated region for block: B:10:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ad  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m3252a(Context context, final String str, final InterfaceC1351r1 interfaceC1351r1, final Handler handler, final int i) {
        Bitmap bitmap;
        byte[] bArr;
        int i2;
        final Context applicationContext = context.getApplicationContext();
        C1259G c1259g = f6359a;
        Bitmap bitmap2 = null;
        if (str == null || (bitmap = (Bitmap) c1259g.get(str)) == null || bitmap.isRecycled()) {
            bitmap = null;
        }
        if (bitmap == null) {
            try {
                InputStream open = applicationContext.getAssets().open(str);
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[8192];
                        while (true) {
                            int read = open.read(bArr2);
                            if (read < 0) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr2, 0, read);
                            }
                        }
                        bArr = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        open.close();
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable unused) {
                bArr = null;
            }
            if (bArr != null && bArr.length != 0) {
                try {
                    byte[] decryptThemeImage = NativeLib.decryptThemeImage(applicationContext, bArr);
                    if (decryptThemeImage != null && decryptThemeImage.length >= 3 && (((i2 = decryptThemeImage[0] & 255) == 255 && (decryptThemeImage[1] & 255) == 216 && (decryptThemeImage[2] & 255) == 255) || (decryptThemeImage.length >= 4 && i2 == 137 && decryptThemeImage[1] == 80 && decryptThemeImage[2] == 78 && decryptThemeImage[3] == 71))) {
                        bitmap = BitmapFactory.decodeByteArray(decryptThemeImage, 0, decryptThemeImage.length);
                        if (bitmap != null) {
                            c1259g.put(str, bitmap);
                        }
                    }
                } catch (Throwable unused2) {
                }
            }
            if (bitmap2 == null) {
                interfaceC1351r1.mo57b(bitmap2);
                return;
            } else {
                if (i + 1 >= 75) {
                    return;
                }
                handler.postDelayed(new Runnable() { // from class: q0.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i3 = i + 1;
                        AbstractC1354s1.m3252a(applicationContext, str, interfaceC1351r1, handler, i3);
                    }
                }, 400L);
                return;
            }
        }
        bitmap2 = bitmap;
        if (bitmap2 == null) {
        }
    }
}
