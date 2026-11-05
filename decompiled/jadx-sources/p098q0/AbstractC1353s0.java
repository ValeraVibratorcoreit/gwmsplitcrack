package p098q0;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.util.LruCache;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.carData;
import com.altaysoft.t500_split.cfgData;
import p000A.AbstractC0001b;
import p106t0.EnumC1456b;

/* renamed from: q0.s0 */
/* loaded from: classes.dex */
public abstract class AbstractC1353s0 {

    /* renamed from: a */
    public static final LruCache f6358a = new LruCache(24);

    /* renamed from: a */
    public static C1350r0 m3246a(int i, int i2, int i3, int i4) {
        int m3242a = C1350r0.m3242a(0.18f, i, -16777216);
        int m3242a2 = C1350r0.m3242a(0.45f, i2, C1350r0.m3242a(0.25f, i, -1));
        C1350r0.m3242a(0.25f, i2, i);
        return new C1350r0(m3242a2, i, m3242a, C1350r0.m3242a(0.35f, i2, m3242a2), C1350r0.m3244c(i3, i), C1350r0.m3244c(i4, m3242a), C1350r0.m3244c(i2, i));
    }

    /* renamed from: b */
    public static C1350r0 m3247b(Context context, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14 = -1513240;
        int i15 = -6645094;
        int i16 = -4144960;
        int i17 = -723208;
        int i18 = -8879992;
        int i19 = -15197150;
        int i20 = -16777216;
        switch (i) {
            case 40:
                i3 = m3250e(cfgData.m1784i());
                try {
                    i19 = AbstractC0001b.m3a(context, R.color.ip_theme_40_panel);
                } catch (Exception unused) {
                }
                i4 = C1350r0.m3242a(0.16f, i19, i3);
                try {
                    i18 = AbstractC0001b.m3a(context, R.color.ip_theme_40_text_muted);
                } catch (Exception unused2) {
                }
                try {
                    i17 = AbstractC0001b.m3a(context, R.color.ip_theme_40_text);
                } catch (Exception unused3) {
                }
                i2 = i17;
                i15 = i18;
                return m3246a(i4, i3, i15, i2);
            case 41:
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_41_text);
                } catch (Exception unused4) {
                    i2 = -2952976;
                }
                i4 = -15722462;
                i3 = -11549705;
                i15 = -9733494;
                return m3246a(i4, i3, i15, i2);
            case 42:
                try {
                    i4 = AbstractC0001b.m3a(context, R.color.ip_theme_42_track);
                } catch (Exception unused5) {
                    i4 = -14541806;
                }
                try {
                    i3 = AbstractC0001b.m3a(context, R.color.ip_theme_42_gold);
                } catch (Exception unused6) {
                    i3 = -2838432;
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_42_text_muted);
                } catch (Exception unused7) {
                    i15 = -5728136;
                }
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_42_text);
                } catch (Exception unused8) {
                    i2 = -1714760;
                }
                return m3246a(i4, i3, i15, i2);
            case 43:
                try {
                    i4 = AbstractC0001b.m3a(context, R.color.ip_theme_43_bg);
                } catch (Exception unused9) {
                    i4 = -15463924;
                }
                try {
                    i3 = AbstractC0001b.m3a(context, R.color.ip_theme_43_border_solid);
                } catch (Exception unused10) {
                    i3 = -1754827;
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_43_text_muted);
                } catch (Exception unused11) {
                    i15 = -6655880;
                }
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_43_text);
                } catch (Exception unused12) {
                    i2 = -995120;
                }
                return m3246a(i4, i3, i15, i2);
            case 44:
                try {
                    i20 = AbstractC0001b.m3a(context, R.color.ip_theme_44_bg);
                } catch (Exception unused13) {
                }
                try {
                    i16 = AbstractC0001b.m3a(context, R.color.ip_theme_44_border_solid);
                } catch (Exception unused14) {
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_44_text_muted);
                } catch (Exception unused15) {
                }
                i14 = AbstractC0001b.m3a(context, R.color.ip_theme_44_text);
                i2 = i14;
                i3 = i16;
                i4 = i20;
                return m3246a(i4, i3, i15, i2);
            case 45:
                try {
                    i20 = AbstractC0001b.m3a(context, R.color.ip_theme_45_bg);
                } catch (Exception unused16) {
                }
                try {
                    i16 = AbstractC0001b.m3a(context, R.color.ip_theme_45_border_solid);
                } catch (Exception unused17) {
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_45_text_muted);
                } catch (Exception unused18) {
                }
                i14 = AbstractC0001b.m3a(context, R.color.ip_theme_45_text);
                i2 = i14;
                i3 = i16;
                i4 = i20;
                return m3246a(i4, i3, i15, i2);
            case 46:
                try {
                    i20 = AbstractC0001b.m3a(context, R.color.ip_theme_46_overlay_bg);
                } catch (Exception unused19) {
                }
                try {
                    i5 = AbstractC0001b.m3a(context, R.color.ip_theme_46_overlay_accent);
                } catch (Exception unused20) {
                    i5 = -3618616;
                }
                i3 = i5;
                try {
                    i6 = AbstractC0001b.m3a(context, R.color.ip_theme_46_text_muted);
                } catch (Exception unused21) {
                    i6 = -7303024;
                }
                i15 = i6;
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_46_text);
                } catch (Exception unused22) {
                    i2 = -986896;
                }
                i4 = i20;
                return m3246a(i4, i3, i15, i2);
            case 47:
                try {
                    i4 = AbstractC0001b.m3a(context, R.color.ip_theme_47_panel);
                } catch (Exception unused23) {
                    i4 = -15196128;
                }
                try {
                    i3 = AbstractC0001b.m3a(context, R.color.ip_theme_47_accent);
                } catch (Exception unused24) {
                    i3 = -7544664;
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_47_text_muted);
                } catch (Exception unused25) {
                    i15 = -7693680;
                }
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_47_text);
                } catch (Exception unused26) {
                    i2 = -1509908;
                }
                return m3246a(i4, i3, i15, i2);
            case 48:
                try {
                    i19 = AbstractC0001b.m3a(context, R.color.ip_theme_48_panel);
                } catch (Exception unused27) {
                }
                try {
                    i7 = AbstractC0001b.m3a(context, R.color.ip_theme_48_accent);
                } catch (Exception unused28) {
                    i7 = -3617580;
                }
                i3 = i7;
                try {
                    i18 = AbstractC0001b.m3a(context, R.color.ip_theme_48_text_muted);
                } catch (Exception unused29) {
                }
                try {
                    i17 = AbstractC0001b.m3a(context, R.color.ip_theme_48_text);
                } catch (Exception unused30) {
                }
                i2 = i17;
                i15 = i18;
                i4 = i19;
                return m3246a(i4, i3, i15, i2);
            case 49:
                try {
                    i4 = AbstractC0001b.m3a(context, R.color.ip_theme_49_panel);
                } catch (Exception unused31) {
                    i4 = -15068660;
                }
                try {
                    i3 = AbstractC0001b.m3a(context, R.color.ip_theme_49_accent);
                } catch (Exception unused32) {
                    i3 = -2057192;
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_49_text_muted);
                } catch (Exception unused33) {
                    i15 = -5736408;
                }
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_49_text);
                } catch (Exception unused34) {
                    i2 = -462624;
                }
                return m3246a(i4, i3, i15, i2);
            case 50:
                try {
                    i4 = AbstractC0001b.m3a(context, R.color.ip_theme_50_panel);
                } catch (Exception unused35) {
                    i4 = -15985376;
                }
                try {
                    i3 = AbstractC0001b.m3a(context, R.color.ip_theme_50_accent);
                } catch (Exception unused36) {
                    i3 = -11884312;
                }
                try {
                    i15 = AbstractC0001b.m3a(context, R.color.ip_theme_50_text_muted);
                } catch (Exception unused37) {
                    i15 = -9791304;
                }
                try {
                    i2 = AbstractC0001b.m3a(context, R.color.ip_theme_50_text);
                } catch (Exception unused38) {
                    i2 = -1510148;
                }
                return m3246a(i4, i3, i15, i2);
            case 51:
                try {
                    i8 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_border);
                } catch (Exception unused39) {
                    i8 = -7695456;
                }
                int i21 = -15592166;
                try {
                    i9 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_panel);
                } catch (Exception unused40) {
                    i9 = -15592166;
                }
                try {
                    AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_border_inner);
                } catch (Exception unused41) {
                }
                try {
                    i21 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_panel);
                } catch (Exception unused42) {
                }
                int i22 = i21;
                try {
                    i10 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_content_border);
                } catch (Exception unused43) {
                    i10 = -10853008;
                }
                int i23 = i10;
                try {
                    i11 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_label);
                } catch (Exception unused44) {
                    i11 = -7695456;
                }
                try {
                    i12 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_value);
                } catch (Exception unused45) {
                    i12 = -1511691;
                }
                int i24 = i12;
                try {
                    i13 = AbstractC0001b.m3a(context, R.color.ip_theme_51_overlay_accent);
                } catch (Exception unused46) {
                    i13 = -7695456;
                }
                return new C1350r0(i8, i9, i22, i23, i11, i24, i13);
            default:
                return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x024b  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C1350r0 m3248c(Context context, cfgData cfgdata) {
        String str;
        String str2;
        LruCache lruCache;
        C1350r0 m3247b;
        int i;
        int i2;
        int i3;
        int i4;
        Bitmap bitmap;
        Bitmap bitmap2;
        int m3242a;
        LruCache lruCache2;
        int i5;
        Bitmap bitmap3;
        if (context == null || cfgdata == null || cfgdata.f2615d1 == null) {
            return C1350r0.m3243b(context);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(cfgdata.f2620e1);
        sb.append(":");
        sb.append(cfgdata.f2636h2 ? 1 : 0);
        if (cfgdata.f2620e1 == 40) {
            str = ":" + m3250e(cfgdata);
        } else {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        LruCache lruCache3 = f6358a;
        C1350r0 c1350r0 = (C1350r0) lruCache3.get(sb2);
        if (c1350r0 != null) {
            return c1350r0;
        }
        int i6 = cfgdata.f2620e1;
        if (i6 == 40 || i6 == 41 || i6 == 42 || i6 == 43 || i6 == 44 || i6 == 45 || i6 == 46 || i6 == 47 || i6 == 48 || i6 == 49 || i6 == 50 || i6 == 51) {
            str2 = sb2;
            lruCache = lruCache3;
            m3247b = m3247b(context, i6);
        } else {
            EnumC1456b enumC1456b = cfgdata.f2615d1;
            boolean z2 = cfgdata.f2636h2;
            int i7 = 0;
            if (i6 == 24) {
                i = z2 ? R.drawable.theme_24_spd_r : R.drawable.theme_24_spd;
            } else if (i6 == 25) {
                i = z2 ? R.drawable.theme_25_spd_r : R.drawable.theme_25_spd;
            } else if (i6 == 33 || i6 == 37) {
                i = z2 ? R.drawable.theme_33_spd_r : R.drawable.theme_33_spd;
            } else if (i6 == 40) {
                i = R.drawable.theme_40_spd;
            } else if (i6 != 41) {
                switch (i6) {
                    case 47:
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                        i = 0;
                        break;
                    default:
                        i = enumC1456b.f7108h;
                        break;
                }
            } else {
                i = R.drawable.theme_41_spd;
            }
            if (i != 0) {
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeResource(context.getResources(), i, options);
                int i8 = options.outWidth;
                int i9 = options.outHeight;
                if (i9 > 256 || i8 > 256) {
                    int i10 = i9 / 2;
                    int i11 = i8 / 2;
                    i4 = 1;
                    while (i10 / i4 >= 256 && i11 / i4 >= 256) {
                        i4 *= 2;
                    }
                } else {
                    i4 = 1;
                }
                options.inSampleSize = Math.max(1, i4);
                options.inJustDecodeBounds = false;
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                try {
                    bitmap = BitmapFactory.decodeResource(context.getResources(), i, options);
                } catch (OutOfMemoryError unused) {
                    bitmap = null;
                }
                if (bitmap != null) {
                    try {
                        int i12 = enumC1456b.f7097G;
                        if (i12 <= 0) {
                            i12 = 110;
                        }
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int i13 = width * height;
                        int[] iArr = new int[i13];
                        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                        long j2 = 0;
                        int i14 = 0;
                        int i15 = 0;
                        int i16 = 0;
                        long j3 = 0;
                        long j4 = 0;
                        long j5 = 0;
                        long j6 = 0;
                        long j7 = 0;
                        long j8 = 0;
                        long j9 = 0;
                        long j10 = 0;
                        while (i15 < i13) {
                            int i17 = iArr[i15];
                            int i18 = i13;
                            String str3 = sb2;
                            if (Color.alpha(i17) < 96) {
                                bitmap3 = bitmap;
                                lruCache2 = lruCache3;
                                i5 = i6;
                            } else {
                                int red = Color.red(i17);
                                int green = Color.green(i17);
                                lruCache2 = lruCache3;
                                int blue = Color.blue(i17);
                                i5 = i6;
                                bitmap3 = bitmap;
                                float f2 = (blue * 0.114f) + (green * 0.587f) + (red * 0.299f);
                                if (f2 >= i12) {
                                    j2 += red;
                                    j3 += green;
                                    j4 += blue;
                                    i7++;
                                } else if (f2 <= 48.0f) {
                                    j5 += red;
                                    j7 += green;
                                    j9 += blue;
                                    i16++;
                                } else {
                                    j6 += red;
                                    j8 += green;
                                    j10 += blue;
                                    i14++;
                                }
                            }
                            i15++;
                            bitmap = bitmap3;
                            i13 = i18;
                            sb2 = str3;
                            lruCache3 = lruCache2;
                            i6 = i5;
                        }
                        bitmap2 = bitmap;
                        str2 = sb2;
                        lruCache = lruCache3;
                        i2 = i6;
                        if (i7 < 8) {
                            bitmap2.recycle();
                            m3247b = null;
                            if (m3247b != null && (i3 = i2) >= 40) {
                                m3247b = m3247b(context, i3);
                            }
                        } else {
                            long j11 = i7;
                            try {
                                int rgb = Color.rgb((int) (j2 / j11), (int) (j3 / j11), (int) (j4 / j11));
                                if (i16 >= 8) {
                                    long j12 = i16;
                                    m3242a = Color.rgb((int) (j5 / j12), (int) (j7 / j12), (int) (j9 / j12));
                                } else if (i14 >= 8) {
                                    long j13 = i14;
                                    m3242a = C1350r0.m3242a(0.35f, Color.rgb((int) (j6 / j13), (int) (j8 / j13), (int) (j10 / j13)), -16777216);
                                } else {
                                    m3242a = C1350r0.m3242a(0.78f, rgb, -16777216);
                                }
                                boolean z3 = C1350r0.m3245d(m3242a) < 0.42f;
                                m3247b = m3246a(m3242a, rgb, z3 ? -5196098 : -11906468, z3 ? -1906965 : -14801876);
                                bitmap2.recycle();
                                if (m3247b != null) {
                                }
                            } catch (Throwable th) {
                                th = th;
                                bitmap2.recycle();
                                throw th;
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap2 = bitmap;
                    }
                }
            }
            str2 = sb2;
            lruCache = lruCache3;
            i2 = i6;
            m3247b = null;
            if (m3247b != null) {
            }
        }
        if (m3247b == null) {
            m3247b = C1350r0.m3243b(context);
        }
        lruCache.put(str2, m3247b);
        return m3247b;
    }

    /* renamed from: d */
    public static int m3249d(int i) {
        switch (i) {
            case 40:
                return R.drawable.ip_theme_40_progress_media;
            case 41:
            default:
                return R.drawable.ip_theme_41_progress_media;
            case 42:
                return R.drawable.ip_theme_42_progress_media;
            case 43:
                return R.drawable.ip_theme_43_progress_coolant;
            case 44:
                return R.drawable.ip_theme_44_progress_media;
            case 45:
            case 46:
                return R.drawable.ip_theme_45_progress_media;
            case 47:
                return R.drawable.ip_theme_47_progress_media;
            case 48:
                return R.drawable.ip_theme_48_progress_media;
            case 49:
                return R.drawable.ip_theme_49_progress_media;
            case 50:
                return R.drawable.ip_theme_50_progress_media;
            case 51:
                return R.drawable.ip_theme_51_progress_media;
        }
    }

    /* renamed from: e */
    public static int m3250e(cfgData cfgdata) {
        if (cfgdata != null && cfgdata.f2641i2) {
            int m1753i = carData.getInstance().m1753i();
            if (m1753i == 1) {
                return -3838354;
            }
            if (m1753i == 2) {
                return -9790864;
            }
        }
        return -16730881;
    }

    /* renamed from: f */
    public static int m3251f(cfgData cfgdata) {
        int m3250e = m3250e(cfgdata);
        return m3250e == -3838354 ? R.drawable.ip_theme_40_info_frame_sport : m3250e == -9790864 ? R.drawable.ip_theme_40_info_frame_eco : R.drawable.ip_theme_40_info_frame;
    }
}
