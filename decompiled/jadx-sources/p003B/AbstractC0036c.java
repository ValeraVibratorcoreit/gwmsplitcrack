package p003B;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import com.altaysoft.t500_split.R;
import com.sun.jna.Function;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;
import p010D1.AbstractC0088l;
import p120y.AbstractC1672a;

/* renamed from: B.c */
/* loaded from: classes.dex */
public abstract class AbstractC0036c {

    /* renamed from: a */
    public static final ThreadLocal f125a = new ThreadLocal();

    /* renamed from: a */
    public static ColorStateList m54a(Resources resources, XmlResourceParser xmlResourceParser, Resources.Theme theme) {
        int next;
        AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return m55b(resources, xmlResourceParser, asAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0136  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.res.Resources] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v5, types: [android.content.res.TypedArray] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList m55b(Resources resources, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth;
        int color;
        float f2;
        int attributeCount;
        int i;
        boolean z2;
        int[] iArr;
        int i2;
        boolean z3;
        int m44d;
        float f3;
        float f4;
        float f5;
        float cbrt;
        float f6;
        int i3;
        TypedValue typedValue;
        ?? r02 = resources;
        AttributeSet attributeSet2 = attributeSet;
        Resources.Theme theme2 = theme;
        String name = xmlResourceParser.getName();
        if (!name.equals("selector")) {
            throw new XmlPullParserException(xmlResourceParser.getPositionDescription() + ": invalid color state list tag " + name);
        }
        boolean z4 = 1;
        int depth2 = xmlResourceParser.getDepth() + 1;
        int[][] iArr2 = new int[20][];
        int[] iArr3 = new int[20];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int next = xmlResourceParser.next();
            if (next == z4 || ((depth = xmlResourceParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlResourceParser.getName().equals("item")) {
                int[] iArr4 = AbstractC1672a.f9540a;
                ?? obtainAttributes = theme2 == null ? r02.obtainAttributes(attributeSet2, iArr4) : theme2.obtainStyledAttributes(attributeSet2, iArr4, i4, i4);
                int resourceId = obtainAttributes.getResourceId(i4, -1);
                if (resourceId != -1) {
                    ThreadLocal threadLocal = f125a;
                    TypedValue typedValue2 = (TypedValue) threadLocal.get();
                    if (typedValue2 == null) {
                        typedValue = new TypedValue();
                        threadLocal.set(typedValue);
                    } else {
                        typedValue = typedValue2;
                    }
                    r02.getValue(resourceId, typedValue, z4);
                    int i6 = typedValue.type;
                    if (i6 < 28 || i6 > 31) {
                        try {
                            color = m54a(r02, r02.getXml(resourceId), theme2).getDefaultColor();
                        } catch (Exception unused) {
                            color = obtainAttributes.getColor(i4, -65281);
                        }
                        f2 = !obtainAttributes.hasValue(z4) ? obtainAttributes.getFloat(z4, 1.0f) : obtainAttributes.hasValue(3) ? obtainAttributes.getFloat(3, 1.0f) : 1.0f;
                        float f7 = (Build.VERSION.SDK_INT >= 31 || !obtainAttributes.hasValue(2)) ? obtainAttributes.getFloat(4, -1.0f) : obtainAttributes.getFloat(2, -1.0f);
                        obtainAttributes.recycle();
                        attributeCount = attributeSet.getAttributeCount();
                        int[] iArr5 = new int[attributeCount];
                        int i7 = i4;
                        for (i = i7; i < attributeCount; i++) {
                            int attributeNameResource = attributeSet2.getAttributeNameResource(i);
                            if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != R.attr.alpha && attributeNameResource != R.attr.lStar) {
                                int i8 = i7 + 1;
                                if (!attributeSet2.getAttributeBooleanValue(i, false)) {
                                    attributeNameResource = -attributeNameResource;
                                }
                                iArr5[i7] = attributeNameResource;
                                i7 = i8;
                            }
                        }
                        int[] trimStateSet = StateSet.trimStateSet(iArr5, i7);
                        float f8 = 0.0f;
                        float f9 = 100.0f;
                        z2 = f7 < 0.0f && f7 <= 100.0f;
                        if (f2 == 1.0f || z2) {
                            int m278q = AbstractC0088l.m278q((int) ((Color.alpha(color) * f2) + 0.5f), 0, Function.USE_VARARGS);
                            if (z2) {
                                iArr = trimStateSet;
                                i2 = depth2;
                                z3 = true;
                            } else {
                                C0034a m39a = C0034a.m39a(color);
                                C0050q c0050q = C0050q.f151k;
                                float f10 = m39a.f113b;
                                if (f10 < 1.0d || Math.round(f7) <= 0.0d || Math.round(f7) >= 100.0d) {
                                    iArr = trimStateSet;
                                    i2 = depth2;
                                    z3 = true;
                                    m44d = AbstractC0035b.m44d(f7);
                                } else {
                                    float f11 = m39a.f112a;
                                    float min = f11 < 0.0f ? 0.0f : Math.min(360.0f, f11);
                                    float f12 = 0.0f;
                                    float f13 = f10;
                                    C0034a c0034a = null;
                                    boolean z5 = true;
                                    while (true) {
                                        if (Math.abs(f12 - f10) >= 0.4f) {
                                            float f14 = 1000.0f;
                                            float f15 = f8;
                                            float f16 = f9;
                                            float f17 = 1000.0f;
                                            C0034a c0034a2 = null;
                                            while (true) {
                                                if (Math.abs(f15 - f16) <= 0.01f) {
                                                    i2 = depth2;
                                                    f3 = min;
                                                    f4 = f9;
                                                    z3 = true;
                                                    float f18 = f8;
                                                    iArr = trimStateSet;
                                                    f5 = f18;
                                                    break;
                                                }
                                                float f19 = ((f16 - f15) / 2.0f) + f15;
                                                int m41c = C0034a.m40b(f19, f13, min).m41c(C0050q.f151k);
                                                float m45e = AbstractC0035b.m45e(Color.red(m41c));
                                                float m45e2 = AbstractC0035b.m45e(Color.green(m41c));
                                                float m45e3 = AbstractC0035b.m45e(Color.blue(m41c));
                                                z3 = true;
                                                float[] fArr = AbstractC0035b.f121d[1];
                                                f4 = 100.0f;
                                                float f20 = ((m45e3 * fArr[2]) + ((m45e2 * fArr[1]) + (m45e * fArr[0]))) / 100.0f;
                                                if (f20 <= 0.008856452f) {
                                                    cbrt = f20 * 903.2963f;
                                                    i2 = depth2;
                                                } else {
                                                    i2 = depth2;
                                                    cbrt = (((float) Math.cbrt(f20)) * 116.0f) - 16.0f;
                                                }
                                                float abs = Math.abs(f7 - cbrt);
                                                if (abs < 0.2f) {
                                                    C0034a m39a2 = C0034a.m39a(m41c);
                                                    C0034a m40b = C0034a.m40b(m39a2.f114c, m39a2.f113b, min);
                                                    f6 = f19;
                                                    float f21 = m39a2.f115d - m40b.f115d;
                                                    f3 = min;
                                                    float f22 = m39a2.f116e - m40b.f116e;
                                                    float f23 = m39a2.f117f - m40b.f117f;
                                                    double sqrt = Math.sqrt((f23 * f23) + (f22 * f22) + (f21 * f21));
                                                    iArr = trimStateSet;
                                                    float pow = (float) (Math.pow(sqrt, 0.63d) * 1.41d);
                                                    if (pow <= 1.0f) {
                                                        f17 = pow;
                                                        c0034a2 = m39a2;
                                                        f14 = abs;
                                                    }
                                                } else {
                                                    f6 = f19;
                                                    f3 = min;
                                                    iArr = trimStateSet;
                                                }
                                                f5 = 0.0f;
                                                if (f14 == 0.0f && f17 == 0.0f) {
                                                    break;
                                                }
                                                if (cbrt < f7) {
                                                    f15 = f6;
                                                } else {
                                                    f16 = f6;
                                                }
                                                f9 = 100.0f;
                                                depth2 = i2;
                                                min = f3;
                                                int[] iArr6 = iArr;
                                                f8 = 0.0f;
                                                trimStateSet = iArr6;
                                            }
                                            C0034a c0034a3 = c0034a2;
                                            if (!z5) {
                                                if (c0034a3 == null) {
                                                    f10 = f13;
                                                } else {
                                                    c0034a = c0034a3;
                                                    f12 = f13;
                                                }
                                                f13 = ((f10 - f12) / 2.0f) + f12;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                            } else {
                                                if (c0034a3 != null) {
                                                    m44d = c0034a3.m41c(c0050q);
                                                    break;
                                                }
                                                f13 = ((f10 - f12) / 2.0f) + f12;
                                                f9 = f4;
                                                depth2 = i2;
                                                min = f3;
                                                z5 = false;
                                            }
                                            int[] iArr7 = iArr;
                                            f8 = f5;
                                            trimStateSet = iArr7;
                                        } else {
                                            iArr = trimStateSet;
                                            i2 = depth2;
                                            z3 = true;
                                            m44d = c0034a == null ? AbstractC0035b.m44d(f7) : c0034a.m41c(c0050q);
                                        }
                                    }
                                }
                                color = m44d;
                            }
                            color = (16777215 & color) | (m278q << 24);
                        } else {
                            iArr = trimStateSet;
                            i2 = depth2;
                            z3 = true;
                        }
                        i3 = i5 + 1;
                        if (i3 > iArr3.length) {
                            int[] iArr8 = new int[i5 <= 4 ? 8 : i5 * 2];
                            System.arraycopy(iArr3, 0, iArr8, 0, i5);
                            iArr3 = iArr8;
                        }
                        iArr3[i5] = color;
                        if (i3 > iArr2.length) {
                            ?? r1 = (Object[]) Array.newInstance(iArr2.getClass().getComponentType(), i5 > 4 ? i5 * 2 : 8);
                            System.arraycopy(iArr2, 0, r1, 0, i5);
                            iArr2 = r1;
                        }
                        iArr2[i5] = iArr;
                        iArr2 = iArr2;
                        attributeSet2 = attributeSet;
                        theme2 = theme;
                        i5 = i3;
                        z4 = z3;
                        depth2 = i2;
                        i4 = 0;
                        r02 = resources;
                    }
                }
                color = obtainAttributes.getColor(i4, -65281);
                if (!obtainAttributes.hasValue(z4)) {
                }
                if (Build.VERSION.SDK_INT >= 31) {
                }
                obtainAttributes.recycle();
                attributeCount = attributeSet.getAttributeCount();
                int[] iArr52 = new int[attributeCount];
                int i72 = i4;
                while (i < attributeCount) {
                }
                int[] trimStateSet2 = StateSet.trimStateSet(iArr52, i72);
                float f82 = 0.0f;
                float f92 = 100.0f;
                if (f7 < 0.0f) {
                }
                if (f2 == 1.0f) {
                }
                int m278q2 = AbstractC0088l.m278q((int) ((Color.alpha(color) * f2) + 0.5f), 0, Function.USE_VARARGS);
                if (z2) {
                }
                color = (16777215 & color) | (m278q2 << 24);
                i3 = i5 + 1;
                if (i3 > iArr3.length) {
                }
                iArr3[i5] = color;
                if (i3 > iArr2.length) {
                }
                iArr2[i5] = iArr;
                iArr2 = iArr2;
                attributeSet2 = attributeSet;
                theme2 = theme;
                i5 = i3;
                z4 = z3;
                depth2 = i2;
                i4 = 0;
                r02 = resources;
            } else {
                r02 = resources;
                attributeSet2 = attributeSet;
                theme2 = theme;
                z4 = z4;
                depth2 = depth2;
                i4 = 0;
            }
        }
        int[] iArr9 = new int[i5];
        int[][] iArr10 = new int[i5][];
        System.arraycopy(iArr3, 0, iArr9, 0, i5);
        System.arraycopy(iArr2, 0, iArr10, 0, i5);
        return new ColorStateList(iArr10, iArr9);
    }
}
