package p111v;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;
import p097q.AbstractC1241e;

/* renamed from: v.a */
/* loaded from: classes.dex */
public final class C1589a {

    /* renamed from: a */
    public boolean f8989a = false;

    /* renamed from: b */
    public int f8990b;

    /* renamed from: c */
    public int f8991c;

    /* renamed from: d */
    public float f8992d;

    /* renamed from: e */
    public String f8993e;

    /* renamed from: f */
    public boolean f8994f;

    /* renamed from: g */
    public int f8995g;

    public C1589a(C1589a c1589a, Object obj) {
        c1589a.getClass();
        this.f8990b = c1589a.f8990b;
        m4740b(obj);
    }

    /* renamed from: a */
    public static void m4739a(Context context, XmlResourceParser xmlResourceParser, HashMap hashMap) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1605q.f9211d);
        int indexCount = obtainStyledAttributes.getIndexCount();
        String str = null;
        int i = 0;
        boolean z2 = false;
        Object obj = null;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            int i3 = 1;
            if (index == 0) {
                str = obtainStyledAttributes.getString(index);
                if (str != null && str.length() > 0) {
                    str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
                }
            } else if (index == 10) {
                str = obtainStyledAttributes.getString(index);
                z2 = true;
            } else if (index == 1) {
                obj = Boolean.valueOf(obtainStyledAttributes.getBoolean(index, false));
                i = 6;
            } else {
                int i4 = 3;
                if (index == 3) {
                    obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                } else {
                    i4 = 4;
                    if (index == 2) {
                        obj = Integer.valueOf(obtainStyledAttributes.getColor(index, 0));
                    } else {
                        if (index == 7) {
                            obj = Float.valueOf(TypedValue.applyDimension(1, obtainStyledAttributes.getDimension(index, 0.0f), context.getResources().getDisplayMetrics()));
                        } else if (index == 4) {
                            obj = Float.valueOf(obtainStyledAttributes.getDimension(index, 0.0f));
                        } else {
                            i4 = 5;
                            if (index == 5) {
                                obj = Float.valueOf(obtainStyledAttributes.getFloat(index, Float.NaN));
                                i = 2;
                            } else {
                                if (index == 6) {
                                    obj = Integer.valueOf(obtainStyledAttributes.getInteger(index, -1));
                                } else if (index == 9) {
                                    obj = obtainStyledAttributes.getString(index);
                                } else {
                                    i3 = 8;
                                    if (index == 8) {
                                        int resourceId = obtainStyledAttributes.getResourceId(index, -1);
                                        if (resourceId == -1) {
                                            resourceId = obtainStyledAttributes.getInt(index, -1);
                                        }
                                        obj = Integer.valueOf(resourceId);
                                    }
                                }
                                i = i3;
                            }
                        }
                        i = 7;
                    }
                }
                i = i4;
            }
        }
        if (str != null && obj != null) {
            C1589a c1589a = new C1589a();
            c1589a.f8990b = i;
            c1589a.f8989a = z2;
            c1589a.m4740b(obj);
            hashMap.put(str, c1589a);
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: b */
    public final void m4740b(Object obj) {
        switch (AbstractC1241e.m2943b(this.f8990b)) {
            case 0:
            case 7:
                this.f8991c = ((Integer) obj).intValue();
                break;
            case 1:
                this.f8992d = ((Float) obj).floatValue();
                break;
            case 2:
            case 3:
                this.f8995g = ((Integer) obj).intValue();
                break;
            case 4:
                this.f8993e = (String) obj;
                break;
            case 5:
                this.f8994f = ((Boolean) obj).booleanValue();
                break;
            case 6:
                this.f8992d = ((Float) obj).floatValue();
                break;
        }
    }
}
