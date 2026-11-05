package p006C;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import p003B.C0040g;
import p003B.C0041h;
import p010D1.AbstractC0088l;
import p016H.C0118j;

/* renamed from: C.n */
/* loaded from: classes.dex */
public final class C0066n extends AbstractC0088l {
    /* renamed from: v0 */
    public static Font m190v0(FontFamily fontFamily, int i) {
        FontStyle fontStyle = new FontStyle((i & 1) != 0 ? 700 : 400, (i & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int m191w0 = m191w0(fontStyle, font.getStyle());
        for (int i2 = 1; i2 < fontFamily.getSize(); i2++) {
            Font font2 = fontFamily.getFont(i2);
            int m191w02 = m191w0(fontStyle, font2.getStyle());
            if (m191w02 < m191w0) {
                font = font2;
                m191w0 = m191w02;
            }
        }
        return font;
    }

    /* renamed from: w0 */
    public static int m191w0(FontStyle fontStyle, FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: u */
    public final Typeface mo183u(Context context, C0040g c0040g, Resources resources, int i) {
        try {
            FontFamily.Builder builder = null;
            for (C0041h c0041h : c0040g.f129a) {
                try {
                    Font build = new Font.Builder(resources, c0041h.f135f).setWeight(c0041h.f131b).setSlant(c0041h.f132c ? 1 : 0).setTtcIndex(c0041h.f134e).setFontVariationSettings(c0041h.f133d).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(build);
                    } else {
                        builder.addFont(build);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m190v0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: v */
    public final Typeface mo184v(Context context, C0118j[] c0118jArr, int i) {
        int i2;
        ParcelFileDescriptor openFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            int length = c0118jArr.length;
            FontFamily.Builder builder = null;
            while (i2 < length) {
                C0118j c0118j = c0118jArr[i2];
                try {
                    openFileDescriptor = contentResolver.openFileDescriptor(c0118j.f370a, "r", null);
                } catch (IOException unused) {
                }
                if (openFileDescriptor == null) {
                    i2 = openFileDescriptor == null ? i2 + 1 : 0;
                } else {
                    try {
                        Font build = new Font.Builder(openFileDescriptor).setWeight(c0118j.f372c).setSlant(c0118j.f373d ? 1 : 0).setTtcIndex(c0118j.f371b).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(build);
                        } else {
                            builder.addFont(build);
                        }
                    } catch (Throwable th) {
                        try {
                            openFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                openFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily build2 = builder.build();
            return new Typeface.CustomFallbackBuilder(build2).setStyle(m190v0(build2, i).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: w */
    public final Typeface mo186w(Context context, Resources resources, int i, String str, int i2) {
        try {
            Font build = new Font.Builder(resources, i).build();
            return new Typeface.CustomFallbackBuilder(new FontFamily.Builder(build).build()).setStyle(build.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: z */
    public final C0118j mo192z(int i, C0118j[] c0118jArr) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }
}
