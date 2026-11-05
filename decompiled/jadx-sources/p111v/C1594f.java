package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import p118x0.C1659o;

/* renamed from: v.f */
/* loaded from: classes.dex */
public final class C1594f {

    /* renamed from: a */
    public int f9080a;

    /* renamed from: b */
    public int f9081b;

    /* renamed from: c */
    public final Object f9082c;

    public C1594f() {
        this.f9082c = new C1659o[1800];
    }

    /* renamed from: a */
    public synchronized C1659o[] m4751a() {
        int i = this.f9081b;
        if (i == 0) {
            return new C1659o[0];
        }
        C1659o[] c1659oArr = new C1659o[i];
        int i2 = ((this.f9080a - i) + 1800) % 1800;
        for (int i3 = 0; i3 < this.f9081b; i3++) {
            c1659oArr[i3] = ((C1659o[]) this.f9082c)[(i2 + i3) % 1800];
        }
        return c1659oArr;
    }

    public C1594f(Context context, XmlResourceParser xmlResourceParser) {
        this.f9082c = new ArrayList();
        this.f9081b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1605q.f9215h);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f9080a = obtainStyledAttributes.getResourceId(index, this.f9080a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f9081b);
                this.f9081b = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C1602n().m4767b((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
