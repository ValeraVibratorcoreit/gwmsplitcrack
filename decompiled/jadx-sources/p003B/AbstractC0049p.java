package p003B;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import java.io.IOException;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;
import p001A0.RunnableC0018l;
import p006C.AbstractC0064l;
import p091o.C1196f;

/* renamed from: B.p */
/* loaded from: classes.dex */
public abstract class AbstractC0049p {

    /* renamed from: a */
    public static final ThreadLocal f148a = new ThreadLocal();

    /* renamed from: b */
    public static final WeakHashMap f149b = new WeakHashMap(0);

    /* renamed from: c */
    public static final Object f150c = new Object();

    /* renamed from: a */
    public static Typeface m101a(Context context, int i) {
        if (context.isRestricted()) {
            return null;
        }
        return m102b(context, i, new TypedValue(), 0, null, false, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00dd A[ADDED_TO_REGION] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface m102b(Context context, int i, TypedValue typedValue, int i2, AbstractC0035b abstractC0035b, boolean z2, boolean z3) {
        Resources resources = context.getResources();
        resources.getValue(i, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i) + "\" (" + Integer.toHexString(i) + ") is not a Font: " + typedValue);
        }
        String charSequence2 = charSequence.toString();
        Typeface typeface = null;
        if (charSequence2.startsWith("res/")) {
            int i3 = typedValue.assetCookie;
            C1196f c1196f = AbstractC0064l.f211b;
            Typeface typeface2 = (Typeface) c1196f.m2861a(AbstractC0064l.m176b(resources, i, charSequence2, i3, i2));
            if (typeface2 != null) {
                if (abstractC0035b != null) {
                    new Handler(Looper.getMainLooper()).post(new RunnableC0018l(abstractC0035b, 3, typeface2));
                }
            } else if (!z3) {
                try {
                    if (charSequence2.toLowerCase().endsWith(".xml")) {
                        InterfaceC0039f m47i = AbstractC0035b.m47i(resources.getXml(i), resources);
                        if (m47i == null) {
                            Log.e("ResourcesCompat", "Failed to find font-family tag");
                            if (abstractC0035b != null) {
                                abstractC0035b.m51a(-3);
                            }
                        } else {
                            typeface = AbstractC0064l.m175a(context, m47i, resources, i, charSequence2, typedValue.assetCookie, i2, abstractC0035b, z2);
                        }
                    } else {
                        int i4 = typedValue.assetCookie;
                        typeface2 = AbstractC0064l.f210a.mo186w(context, resources, i, charSequence2, i2);
                        if (typeface2 != null) {
                            c1196f.m2862b(AbstractC0064l.m176b(resources, i, charSequence2, i4, i2), typeface2);
                        }
                        if (abstractC0035b != null) {
                            if (typeface2 != null) {
                                new Handler(Looper.getMainLooper()).post(new RunnableC0018l(abstractC0035b, 3, typeface2));
                            } else {
                                abstractC0035b.m51a(-3);
                            }
                        }
                    }
                } catch (IOException e2) {
                    Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e2);
                    if (abstractC0035b != null) {
                        abstractC0035b.m51a(-3);
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                } catch (XmlPullParserException e3) {
                    Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e3);
                    if (abstractC0035b != null) {
                    }
                    if (typeface == null) {
                    }
                    return typeface;
                }
            }
            typeface = typeface2;
        } else if (abstractC0035b != null) {
            abstractC0035b.m51a(-3);
        }
        if (typeface == null || abstractC0035b != null || z3) {
            return typeface;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i) + " could not be retrieved.");
    }
}
