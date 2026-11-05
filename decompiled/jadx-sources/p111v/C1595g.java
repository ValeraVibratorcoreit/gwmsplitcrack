package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: v.g */
/* loaded from: classes.dex */
public final class C1595g {

    /* renamed from: a */
    public final float f9083a;

    /* renamed from: b */
    public final float f9084b;

    /* renamed from: c */
    public final float f9085c;

    /* renamed from: d */
    public final float f9086d;

    /* renamed from: e */
    public final int f9087e;

    public C1595g(Context context, XmlResourceParser xmlResourceParser) {
        this.f9083a = Float.NaN;
        this.f9084b = Float.NaN;
        this.f9085c = Float.NaN;
        this.f9086d = Float.NaN;
        this.f9087e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1605q.f9217j);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f9087e);
                this.f9087e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1602n().m4767b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.f9086d = obtainStyledAttributes.getDimension(index, this.f9086d);
            } else if (index == 2) {
                this.f9084b = obtainStyledAttributes.getDimension(index, this.f9084b);
            } else if (index == 3) {
                this.f9085c = obtainStyledAttributes.getDimension(index, this.f9085c);
            } else if (index == 4) {
                this.f9083a = obtainStyledAttributes.getDimension(index, this.f9083a);
            } else {
                Log.v("ConstraintLayoutStates", "Unknown tag");
            }
        }
        obtainStyledAttributes.recycle();
    }
}
