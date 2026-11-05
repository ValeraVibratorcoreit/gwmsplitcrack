package p060c1;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p076j.C0954c;

/* renamed from: c1.a */
/* loaded from: classes.dex */
public abstract class AbstractC0577a {

    /* renamed from: a */
    public static final int[] f2193a = {R.attr.theme, com.altaysoft.t500_split.R.attr.theme};

    /* renamed from: b */
    public static final int[] f2194b = {com.altaysoft.t500_split.R.attr.materialThemeOverlay};

    /* renamed from: a */
    public static Context m1578a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f2194b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        boolean z2 = (context instanceof C0954c) && ((C0954c) context).f4570a == resourceId;
        if (resourceId == 0 || z2) {
            return context;
        }
        C0954c c0954c = new C0954c(context, resourceId);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, f2193a);
        int resourceId2 = obtainStyledAttributes2.getResourceId(0, 0);
        int resourceId3 = obtainStyledAttributes2.getResourceId(1, 0);
        obtainStyledAttributes2.recycle();
        if (resourceId2 == 0) {
            resourceId2 = resourceId3;
        }
        if (resourceId2 != 0) {
            c0954c.getTheme().applyStyle(resourceId2, true);
        }
        return c0954c;
    }
}
