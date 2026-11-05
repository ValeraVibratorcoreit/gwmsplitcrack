package p125z1;

import p107t1.AbstractC1461d;

/* renamed from: z1.g */
/* loaded from: classes.dex */
public abstract class AbstractC1718g extends AbstractC1717f {
    /* renamed from: v0 */
    public static String m4993v0(String str) {
        AbstractC1461d.m3494e("<this>", str);
        AbstractC1461d.m3494e("missingDelimiterValue", str);
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf == -1) {
            return str;
        }
        String substring = str.substring(lastIndexOf + 1, str.length());
        AbstractC1461d.m3493d("this as java.lang.String…ing(startIndex, endIndex)", substring);
        return substring;
    }
}
