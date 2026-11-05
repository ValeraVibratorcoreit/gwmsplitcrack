package p098q0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.sun.jna.Function;

/* renamed from: q0.H */
/* loaded from: classes.dex */
public abstract class AbstractC1261H {

    /* renamed from: a */
    public static final C1259G f5726a = new C1259G(6291456, 0);

    /* renamed from: a */
    public static void m3036a(Context context, ImageView imageView, int i, int i2, int i3, int i4, float f2) {
        if (context == null || imageView == null || i == 0) {
            return;
        }
        if (f2 <= 0.0f || i4 <= 0) {
            imageView.setImageResource(i);
            return;
        }
        int m3041f = m3041f(imageView);
        String str = i + ":" + i2 + ":" + i3 + ":" + i4 + ":" + f2 + ":" + m3041f;
        try {
            C1259G c1259g = f5726a;
            Bitmap bitmap = (Bitmap) c1259g.get(str);
            if (bitmap == null || bitmap.isRecycled()) {
                Bitmap m3040e = m3040e(context, i, m3041f);
                if (m3040e == null) {
                    imageView.setImageResource(i);
                    return;
                }
                bitmap = m3042g(m3040e, i2, i3, i4, f2);
                if (bitmap != m3040e) {
                    m3040e.recycle();
                }
                c1259g.put(str, bitmap);
            }
            imageView.setImageBitmap(bitmap);
        } catch (OutOfMemoryError unused) {
            m3039d();
            imageView.setImageResource(i);
        }
    }

    /* renamed from: b */
    public static void m3037b(Context context, ImageView imageView, Bitmap bitmap, String str, int i, int i2, int i3, float f2) {
        Bitmap bitmap2;
        if (context == null || imageView == null || bitmap == null || bitmap.isRecycled()) {
            return;
        }
        if (f2 <= 0.0f || i3 <= 0) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        int m3041f = m3041f(imageView);
        String str2 = "bmp:" + str + ":" + i + ":" + i2 + ":" + i3 + ":" + f2 + ":" + m3041f;
        try {
            C1259G c1259g = f5726a;
            Bitmap bitmap3 = (Bitmap) c1259g.get(str2);
            if (bitmap3 == null || bitmap3.isRecycled()) {
                int width = bitmap.getWidth();
                int height = bitmap.getHeight();
                int max = Math.max(width, height);
                if (max > m3041f && m3041f > 0) {
                    float f3 = m3041f / max;
                    bitmap2 = Bitmap.createScaledBitmap(bitmap, Math.max(1, Math.round(width * f3)), Math.max(1, Math.round(height * f3)), true);
                    bitmap3 = m3042g(bitmap2, i, i2, i3, f2);
                    if (bitmap3 != bitmap2 && bitmap2 != bitmap) {
                        bitmap2.recycle();
                    }
                    c1259g.put(str2, bitmap3);
                }
                bitmap2 = bitmap;
                bitmap3 = m3042g(bitmap2, i, i2, i3, f2);
                if (bitmap3 != bitmap2) {
                    bitmap2.recycle();
                }
                c1259g.put(str2, bitmap3);
            }
            imageView.setImageBitmap(bitmap3);
        } catch (OutOfMemoryError unused) {
            m3039d();
            imageView.setImageBitmap(bitmap);
        }
    }

    /* renamed from: c */
    public static int m3038c(float f2, int i, int i2) {
        float f3 = ((i2 - i) * f2) + i;
        if (f3 < 0.0f) {
            return 0;
        }
        return f3 > 255.0f ? Function.USE_VARARGS : Math.round(f3);
    }

    /* renamed from: d */
    public static void m3039d() {
        f5726a.evictAll();
    }

    /* renamed from: e */
    public static Bitmap m3040e(Context context, int i, int i2) {
        int i3;
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(context.getResources(), i, options);
        int i4 = options.outWidth;
        int i5 = options.outHeight;
        if (i5 > i2 || i4 > i2) {
            int i6 = i5 / 2;
            int i7 = i4 / 2;
            i3 = 1;
            while (i6 / i3 >= i2 && i7 / i3 >= i2) {
                i3 *= 2;
            }
        } else {
            i3 = 1;
        }
        options.inSampleSize = Math.max(1, i3);
        options.inJustDecodeBounds = false;
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        return BitmapFactory.decodeResource(context.getResources(), i, options);
    }

    /* renamed from: f */
    public static int m3041f(ImageView imageView) {
        ViewGroup.LayoutParams layoutParams;
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if ((width <= 0 || height <= 0) && (layoutParams = imageView.getLayoutParams()) != null) {
            width = layoutParams.width;
            height = layoutParams.height;
        }
        int max = Math.max(width, height);
        if (max <= 0) {
            return 512;
        }
        return max;
    }

    /* renamed from: g */
    public static Bitmap m3042g(Bitmap bitmap, int i, int i2, int i3, float f2) {
        int i4;
        int i5;
        float f3;
        Bitmap copy = bitmap.isMutable() ? bitmap : bitmap.copy(Bitmap.Config.ARGB_8888, true);
        int width = copy.getWidth();
        int height = copy.getHeight();
        int i6 = width * height;
        int[] iArr = new int[i6];
        int i7 = 0;
        copy.getPixels(iArr, 0, width, 0, 0, width, height);
        int red = Color.red(i);
        int green = Color.green(i);
        int blue = Color.blue(i);
        float f4 = i2;
        float f5 = i3;
        while (i7 < i6) {
            int i8 = iArr[i7];
            int alpha = Color.alpha(i8);
            if (alpha == 0) {
                i5 = height;
                i4 = i6;
            } else {
                int red2 = Color.red(i8);
                int green2 = Color.green(i8);
                int blue2 = Color.blue(i8);
                i4 = i6;
                i5 = height;
                float f6 = (blue2 * 0.114f) + (green2 * 0.587f) + (red2 * 0.299f);
                if (f6 > f4) {
                    float f7 = f4 + f5;
                    if (f6 <= f4) {
                        f3 = 0.0f;
                    } else if (f6 >= f7) {
                        f3 = 1.0f;
                    } else {
                        float f8 = (f6 - f4) / (f7 - f4);
                        f3 = f8 * f8 * (3.0f - (f8 * 2.0f));
                    }
                    float f9 = f3 * f2;
                    iArr[i7] = Color.argb(alpha, m3038c(f9, red2, red), m3038c(f9, green2, green), m3038c(f9, blue2, blue));
                }
            }
            i7++;
            i6 = i4;
            height = i5;
        }
        copy.setPixels(iArr, 0, width, 0, 0, width, height);
        return copy;
    }
}
