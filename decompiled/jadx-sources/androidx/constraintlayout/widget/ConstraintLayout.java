package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
import p003B.C0043j;
import p022K.C0198k;
import p097q.C1239c;
import p102s.AbstractC1411i;
import p102s.AbstractC1412j;
import p102s.C1403a;
import p102s.C1406d;
import p102s.C1407e;
import p102s.C1409g;
import p102s.C1410h;
import p105t.AbstractC1454o;
import p105t.C1442c;
import p105t.C1444e;
import p105t.C1448i;
import p105t.C1450k;
import p105t.C1452m;
import p111v.AbstractC1590b;
import p111v.AbstractC1591c;
import p111v.AbstractC1603o;
import p111v.AbstractC1605q;
import p111v.C1592d;
import p111v.C1593e;
import p111v.C1594f;
import p111v.C1595g;
import p111v.C1602n;
import p111v.C1606r;

/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* renamed from: w */
    public static C1606r f1856w;

    /* renamed from: f */
    public final SparseArray f1857f;

    /* renamed from: g */
    public final ArrayList f1858g;

    /* renamed from: h */
    public final C1407e f1859h;

    /* renamed from: i */
    public int f1860i;

    /* renamed from: j */
    public int f1861j;

    /* renamed from: k */
    public int f1862k;

    /* renamed from: l */
    public int f1863l;

    /* renamed from: m */
    public boolean f1864m;

    /* renamed from: n */
    public int f1865n;

    /* renamed from: o */
    public C1602n f1866o;

    /* renamed from: p */
    public C0043j f1867p;

    /* renamed from: q */
    public int f1868q;

    /* renamed from: r */
    public HashMap f1869r;

    /* renamed from: s */
    public final SparseArray f1870s;

    /* renamed from: t */
    public final C1593e f1871t;

    /* renamed from: u */
    public int f1872u;

    /* renamed from: v */
    public int f1873v;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1857f = new SparseArray();
        this.f1858g = new ArrayList(4);
        this.f1859h = new C1407e();
        this.f1860i = 0;
        this.f1861j = 0;
        this.f1862k = Integer.MAX_VALUE;
        this.f1863l = Integer.MAX_VALUE;
        this.f1864m = true;
        this.f1865n = 257;
        this.f1866o = null;
        this.f1867p = null;
        this.f1868q = -1;
        this.f1869r = new HashMap();
        this.f1870s = new SparseArray();
        this.f1871t = new C1593e(this, this);
        this.f1872u = 0;
        this.f1873v = 0;
        m1312h(attributeSet, 0);
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    public static C1606r getSharedValues() {
        if (f1856w == null) {
            C1606r c1606r = new C1606r();
            new SparseIntArray();
            new HashMap();
            f1856w = c1606r;
        }
        return f1856w;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C1592d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f1858g;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC1590b) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f2 = i3;
                        float f3 = i4;
                        float f4 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f2, f3, f4, f3, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f4, f3, f4, parseInt4, paint);
                        canvas.drawLine(f4, parseInt4, f2, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f2, f3, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f2, f3, f4, parseInt4, paint);
                        canvas.drawLine(f2, parseInt4, f4, f3, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.f1864m = true;
        super.forceLayout();
    }

    /* renamed from: g */
    public final C1406d m1311g(View view) {
        if (view == this) {
            return this.f1859h;
        }
        if (view == null) {
            return null;
        }
        if (view.getLayoutParams() instanceof C1592d) {
            return ((C1592d) view.getLayoutParams()).f9061p0;
        }
        view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
        if (view.getLayoutParams() instanceof C1592d) {
            return ((C1592d) view.getLayoutParams()).f9061p0;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new C1592d(-2, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        C1592d c1592d = new C1592d(context, attributeSet);
        c1592d.f9030a = -1;
        c1592d.f9032b = -1;
        c1592d.f9034c = -1.0f;
        c1592d.f9036d = true;
        c1592d.f9038e = -1;
        c1592d.f9040f = -1;
        c1592d.f9042g = -1;
        c1592d.f9044h = -1;
        c1592d.f9046i = -1;
        c1592d.f9048j = -1;
        c1592d.f9050k = -1;
        c1592d.f9052l = -1;
        c1592d.f9054m = -1;
        c1592d.f9056n = -1;
        c1592d.f9058o = -1;
        c1592d.f9060p = -1;
        c1592d.f9062q = 0;
        c1592d.f9063r = 0.0f;
        c1592d.f9064s = -1;
        c1592d.f9065t = -1;
        c1592d.f9066u = -1;
        c1592d.f9067v = -1;
        c1592d.f9068w = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9069x = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9070y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9071z = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9004A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9005B = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9006C = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9007D = 0;
        c1592d.f9008E = 0.5f;
        c1592d.f9009F = 0.5f;
        c1592d.f9010G = null;
        c1592d.f9011H = -1.0f;
        c1592d.f9012I = -1.0f;
        c1592d.f9013J = 0;
        c1592d.f9014K = 0;
        c1592d.f9015L = 0;
        c1592d.f9016M = 0;
        c1592d.f9017N = 0;
        c1592d.f9018O = 0;
        c1592d.f9019P = 0;
        c1592d.f9020Q = 0;
        c1592d.f9021R = 1.0f;
        c1592d.f9022S = 1.0f;
        c1592d.f9023T = -1;
        c1592d.f9024U = -1;
        c1592d.f9025V = -1;
        c1592d.f9026W = false;
        c1592d.f9027X = false;
        c1592d.f9028Y = null;
        c1592d.f9029Z = 0;
        c1592d.f9031a0 = true;
        c1592d.f9033b0 = true;
        c1592d.f9035c0 = false;
        c1592d.f9037d0 = false;
        c1592d.f9039e0 = false;
        c1592d.f9041f0 = -1;
        c1592d.f9043g0 = -1;
        c1592d.f9045h0 = -1;
        c1592d.f9047i0 = -1;
        c1592d.f9049j0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9051k0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9053l0 = 0.5f;
        c1592d.f9061p0 = new C1406d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1605q.f9209b);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC1591c.f9003a.get(index);
            switch (i2) {
                case 1:
                    c1592d.f9025V = obtainStyledAttributes.getInt(index, c1592d.f9025V);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, c1592d.f9060p);
                    c1592d.f9060p = resourceId;
                    if (resourceId == -1) {
                        c1592d.f9060p = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    c1592d.f9062q = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9062q);
                    break;
                case 4:
                    float f2 = obtainStyledAttributes.getFloat(index, c1592d.f9063r) % 360.0f;
                    c1592d.f9063r = f2;
                    if (f2 < 0.0f) {
                        c1592d.f9063r = (360.0f - f2) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    c1592d.f9030a = obtainStyledAttributes.getDimensionPixelOffset(index, c1592d.f9030a);
                    break;
                case 6:
                    c1592d.f9032b = obtainStyledAttributes.getDimensionPixelOffset(index, c1592d.f9032b);
                    break;
                case 7:
                    c1592d.f9034c = obtainStyledAttributes.getFloat(index, c1592d.f9034c);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, c1592d.f9038e);
                    c1592d.f9038e = resourceId2;
                    if (resourceId2 == -1) {
                        c1592d.f9038e = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Platform.GNU /* 9 */:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, c1592d.f9040f);
                    c1592d.f9040f = resourceId3;
                    if (resourceId3 == -1) {
                        c1592d.f9040f = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Platform.KFREEBSD /* 10 */:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, c1592d.f9042g);
                    c1592d.f9042g = resourceId4;
                    if (resourceId4 == -1) {
                        c1592d.f9042g = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Platform.NETBSD /* 11 */:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, c1592d.f9044h);
                    c1592d.f9044h = resourceId5;
                    if (resourceId5 == -1) {
                        c1592d.f9044h = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case Platform.DRAGONFLYBSD /* 12 */:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, c1592d.f9046i);
                    c1592d.f9046i = resourceId6;
                    if (resourceId6 == -1) {
                        c1592d.f9046i = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, c1592d.f9048j);
                    c1592d.f9048j = resourceId7;
                    if (resourceId7 == -1) {
                        c1592d.f9048j = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, c1592d.f9050k);
                    c1592d.f9050k = resourceId8;
                    if (resourceId8 == -1) {
                        c1592d.f9050k = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, c1592d.f9052l);
                    c1592d.f9052l = resourceId9;
                    if (resourceId9 == -1) {
                        c1592d.f9052l = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case DLLCallback.DLL_FPTRS /* 16 */:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, c1592d.f9054m);
                    c1592d.f9054m = resourceId10;
                    if (resourceId10 == -1) {
                        c1592d.f9054m = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, c1592d.f9064s);
                    c1592d.f9064s = resourceId11;
                    if (resourceId11 == -1) {
                        c1592d.f9064s = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, c1592d.f9065t);
                    c1592d.f9065t = resourceId12;
                    if (resourceId12 == -1) {
                        c1592d.f9065t = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, c1592d.f9066u);
                    c1592d.f9066u = resourceId13;
                    if (resourceId13 == -1) {
                        c1592d.f9066u = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, c1592d.f9067v);
                    c1592d.f9067v = resourceId14;
                    if (resourceId14 == -1) {
                        c1592d.f9067v = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    c1592d.f9068w = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9068w);
                    break;
                case 22:
                    c1592d.f9069x = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9069x);
                    break;
                case 23:
                    c1592d.f9070y = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9070y);
                    break;
                case 24:
                    c1592d.f9071z = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9071z);
                    break;
                case 25:
                    c1592d.f9004A = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9004A);
                    break;
                case 26:
                    c1592d.f9005B = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9005B);
                    break;
                case 27:
                    c1592d.f9026W = obtainStyledAttributes.getBoolean(index, c1592d.f9026W);
                    break;
                case 28:
                    c1592d.f9027X = obtainStyledAttributes.getBoolean(index, c1592d.f9027X);
                    break;
                case 29:
                    c1592d.f9008E = obtainStyledAttributes.getFloat(index, c1592d.f9008E);
                    break;
                case 30:
                    c1592d.f9009F = obtainStyledAttributes.getFloat(index, c1592d.f9009F);
                    break;
                case 31:
                    int i3 = obtainStyledAttributes.getInt(index, 0);
                    c1592d.f9015L = i3;
                    if (i3 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 32:
                    int i4 = obtainStyledAttributes.getInt(index, 0);
                    c1592d.f9016M = i4;
                    if (i4 == 1) {
                        Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        break;
                    } else {
                        break;
                    }
                case 33:
                    try {
                        c1592d.f9017N = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9017N);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, c1592d.f9017N) == -2) {
                            c1592d.f9017N = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        c1592d.f9019P = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9019P);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, c1592d.f9019P) == -2) {
                            c1592d.f9019P = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    c1592d.f9021R = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c1592d.f9021R));
                    c1592d.f9015L = 2;
                    break;
                case 36:
                    try {
                        c1592d.f9018O = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9018O);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, c1592d.f9018O) == -2) {
                            c1592d.f9018O = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        c1592d.f9020Q = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9020Q);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, c1592d.f9020Q) == -2) {
                            c1592d.f9020Q = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    c1592d.f9022S = Math.max(0.0f, obtainStyledAttributes.getFloat(index, c1592d.f9022S));
                    c1592d.f9016M = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C1602n.m4765h(c1592d, obtainStyledAttributes.getString(index));
                            break;
                        case 45:
                            c1592d.f9011H = obtainStyledAttributes.getFloat(index, c1592d.f9011H);
                            break;
                        case 46:
                            c1592d.f9012I = obtainStyledAttributes.getFloat(index, c1592d.f9012I);
                            break;
                        case 47:
                            c1592d.f9013J = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 48:
                            c1592d.f9014K = obtainStyledAttributes.getInt(index, 0);
                            break;
                        case 49:
                            c1592d.f9023T = obtainStyledAttributes.getDimensionPixelOffset(index, c1592d.f9023T);
                            break;
                        case 50:
                            c1592d.f9024U = obtainStyledAttributes.getDimensionPixelOffset(index, c1592d.f9024U);
                            break;
                        case 51:
                            c1592d.f9028Y = obtainStyledAttributes.getString(index);
                            break;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, c1592d.f9056n);
                            c1592d.f9056n = resourceId15;
                            if (resourceId15 == -1) {
                                c1592d.f9056n = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, c1592d.f9058o);
                            c1592d.f9058o = resourceId16;
                            if (resourceId16 == -1) {
                                c1592d.f9058o = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                break;
                            }
                        case 54:
                            c1592d.f9007D = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9007D);
                            break;
                        case 55:
                            c1592d.f9006C = obtainStyledAttributes.getDimensionPixelSize(index, c1592d.f9006C);
                            break;
                        default:
                            switch (i2) {
                                case Function.THROW_LAST_ERROR /* 64 */:
                                    C1602n.m4764g(c1592d, obtainStyledAttributes, index, 0);
                                    break;
                                case 65:
                                    C1602n.m4764g(c1592d, obtainStyledAttributes, index, 1);
                                    break;
                                case 66:
                                    c1592d.f9029Z = obtainStyledAttributes.getInt(index, c1592d.f9029Z);
                                    break;
                                case 67:
                                    c1592d.f9036d = obtainStyledAttributes.getBoolean(index, c1592d.f9036d);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        c1592d.m4748a();
        return c1592d;
    }

    public int getMaxHeight() {
        return this.f1863l;
    }

    public int getMaxWidth() {
        return this.f1862k;
    }

    public int getMinHeight() {
        return this.f1861j;
    }

    public int getMinWidth() {
        return this.f1860i;
    }

    public int getOptimizationLevel() {
        return this.f1859h.f6699D0;
    }

    public String getSceneString() {
        int id;
        StringBuilder sb = new StringBuilder();
        C1407e c1407e = this.f1859h;
        if (c1407e.f6672j == null) {
            int id2 = getId();
            if (id2 != -1) {
                c1407e.f6672j = getContext().getResources().getResourceEntryName(id2);
            } else {
                c1407e.f6672j = "parent";
            }
        }
        if (c1407e.f6669h0 == null) {
            c1407e.f6669h0 = c1407e.f6672j;
            Log.v("ConstraintLayout", " setDebugName " + c1407e.f6669h0);
        }
        Iterator it = c1407e.f6708q0.iterator();
        while (it.hasNext()) {
            C1406d c1406d = (C1406d) it.next();
            View view = c1406d.f6665f0;
            if (view != null) {
                if (c1406d.f6672j == null && (id = view.getId()) != -1) {
                    c1406d.f6672j = getContext().getResources().getResourceEntryName(id);
                }
                if (c1406d.f6669h0 == null) {
                    c1406d.f6669h0 = c1406d.f6672j;
                    Log.v("ConstraintLayout", " setDebugName " + c1406d.f6669h0);
                }
            }
        }
        c1407e.mo3393n(sb);
        return sb.toString();
    }

    /* renamed from: h */
    public final void m1312h(AttributeSet attributeSet, int i) {
        C1407e c1407e = this.f1859h;
        c1407e.f6665f0 = this;
        C1593e c1593e = this.f1871t;
        c1407e.f6712u0 = c1593e;
        c1407e.f6710s0.f6813f = c1593e;
        this.f1857f.put(getId(), this);
        this.f1866o = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1605q.f9209b, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.f1860i = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1860i);
                } else if (index == 17) {
                    this.f1861j = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1861j);
                } else if (index == 14) {
                    this.f1862k = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1862k);
                } else if (index == 15) {
                    this.f1863l = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1863l);
                } else if (index == 113) {
                    this.f1865n = obtainStyledAttributes.getInt(index, this.f1865n);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m1313i(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f1867p = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C1602n c1602n = new C1602n();
                        this.f1866o = c1602n;
                        c1602n.m4768e(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f1866o = null;
                    }
                    this.f1868q = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c1407e.f6699D0 = this.f1865n;
        C1239c.f5508p = c1407e.m3409W(512);
    }

    /* renamed from: i */
    public final void m1313i(int i) {
        int eventType;
        C1594f c1594f;
        Context context = getContext();
        C0043j c0043j = new C0043j(18, false);
        c0043j.f141g = new SparseArray();
        c0043j.f142h = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            c1594f = null;
        } catch (IOException e2) {
            e2.printStackTrace();
        } catch (XmlPullParserException e3) {
            e3.printStackTrace();
        }
        while (true) {
            char c2 = 1;
            if (eventType == 1) {
                this.f1867p = c0043j;
                return;
            }
            if (eventType == 0) {
                xml.getName();
            } else if (eventType == 2) {
                String name = xml.getName();
                switch (name.hashCode()) {
                    case -1349929691:
                        if (name.equals("ConstraintSet")) {
                            c2 = 4;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 80204913:
                        if (name.equals("State")) {
                            c2 = 2;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1382829617:
                        if (name.equals("StateSet")) {
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1657696882:
                        if (name.equals("layoutDescription")) {
                            c2 = 0;
                            break;
                        }
                        c2 = 65535;
                        break;
                    case 1901439077:
                        if (name.equals("Variant")) {
                            c2 = 3;
                            break;
                        }
                        c2 = 65535;
                        break;
                    default:
                        c2 = 65535;
                        break;
                }
                if (c2 == 2) {
                    c1594f = new C1594f(context, xml);
                    ((SparseArray) c0043j.f141g).put(c1594f.f9080a, c1594f);
                } else if (c2 == 3) {
                    C1595g c1595g = new C1595g(context, xml);
                    if (c1594f != null) {
                        ((ArrayList) c1594f.f9082c).add(c1595g);
                    }
                } else if (c2 == 4) {
                    c0043j.m71I(context, xml);
                }
            }
            eventType = xml.next();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x032b  */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m1314j(C1407e c1407e, int i, int i2, int i3) {
        int i4;
        int max;
        int i5;
        int max2;
        int i6;
        int i7;
        boolean z2;
        C1593e c1593e;
        int i8;
        int i9;
        int i10;
        boolean z3;
        ArrayList arrayList;
        int i11;
        C1593e c1593e2;
        int i12;
        C1593e c1593e3;
        boolean z4;
        C1450k c1450k;
        C1452m c1452m;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z5;
        Iterator it;
        Iterator it2;
        boolean z6;
        C1407e c1407e2 = c1407e;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int max3 = Math.max(0, getPaddingTop());
        int max4 = Math.max(0, getPaddingBottom());
        int i19 = max3 + max4;
        int paddingWidth = getPaddingWidth();
        C1593e c1593e4 = this.f1871t;
        c1593e4.f9073b = max3;
        c1593e4.f9074c = max4;
        c1593e4.f9075d = paddingWidth;
        c1593e4.f9076e = i19;
        c1593e4.f9077f = i2;
        c1593e4.f9078g = i3;
        int max5 = Math.max(0, getPaddingStart());
        int max6 = Math.max(0, getPaddingEnd());
        int i20 = 1;
        if (max5 <= 0 && max6 <= 0) {
            max5 = Math.max(0, getPaddingLeft());
        } else if ((getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection()) {
            max5 = max6;
        }
        int i21 = size - paddingWidth;
        int i22 = size2 - i19;
        int i23 = c1593e4.f9076e;
        int i24 = c1593e4.f9075d;
        int childCount = getChildCount();
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode != 1073741824) {
                    i4 = 0;
                } else {
                    i4 = Math.min(this.f1862k - i24, i21);
                    i20 = 1;
                }
            } else if (childCount == 0) {
                max = Math.max(0, this.f1860i);
                i4 = max;
                i20 = 2;
            } else {
                i4 = 0;
                i20 = 2;
            }
        } else if (childCount == 0) {
            max = Math.max(0, this.f1860i);
            i4 = max;
            i20 = 2;
        } else {
            i4 = i21;
            i20 = 2;
        }
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 != 0) {
                i5 = mode2 != 1073741824 ? 0 : Math.min(this.f1863l - i23, i22);
                i6 = 1;
            } else if (childCount == 0) {
                max2 = Math.max(0, this.f1861j);
                i5 = max2;
                i6 = 2;
            } else {
                i5 = 0;
                i6 = 2;
            }
        } else if (childCount == 0) {
            max2 = Math.max(0, this.f1861j);
            i5 = max2;
            i6 = 2;
        } else {
            i5 = i22;
            i6 = 2;
        }
        int m3394q = c1407e.m3394q();
        C1444e c1444e = c1407e2.f6710s0;
        int i25 = i4;
        if (i25 != m3394q || i5 != c1407e.m3390k()) {
            c1444e.f6810c = true;
        }
        c1407e2.f6652Y = 0;
        c1407e2.f6653Z = 0;
        int i26 = this.f1862k - i24;
        int[] iArr = c1407e2.f6630C;
        iArr[0] = i26;
        iArr[1] = this.f1863l - i23;
        c1407e2.f6657b0 = 0;
        c1407e2.f6659c0 = 0;
        c1407e2.m3377M(i20);
        c1407e2.m3379O(i25);
        c1407e2.m3378N(i6);
        c1407e2.m3376L(i5);
        int i27 = this.f1860i - i24;
        if (i27 < 0) {
            c1407e2.f6657b0 = 0;
        } else {
            c1407e2.f6657b0 = i27;
        }
        int i28 = this.f1861j - i23;
        if (i28 < 0) {
            c1407e2.f6659c0 = 0;
        } else {
            c1407e2.f6659c0 = i28;
        }
        c1407e2.f6715x0 = max5;
        c1407e2.f6716y0 = max3;
        C0198k c0198k = c1407e2.f6709r0;
        c0198k.getClass();
        C1593e c1593e5 = c1407e2.f6712u0;
        int size3 = c1407e2.f6708q0.size();
        int m3394q2 = c1407e.m3394q();
        int m3390k = c1407e.m3390k();
        boolean m3425c = AbstractC1412j.m3425c(i, 128);
        boolean z7 = m3425c || AbstractC1412j.m3425c(i, 64);
        if (z7) {
            for (int i29 = 0; i29 < size3; i29++) {
                C1406d c1406d = (C1406d) c1407e2.f6708q0.get(i29);
                int[] iArr2 = c1406d.f6685p0;
                boolean z8 = (iArr2[0] == 3) && (iArr2[1] == 3) && c1406d.f6650W > 0.0f;
                if ((c1406d.m3401x() && z8) || ((c1406d.m3402y() && z8) || (c1406d instanceof C1409g) || c1406d.m3401x() || c1406d.m3402y())) {
                    i7 = 1073741824;
                    z7 = false;
                    break;
                }
            }
        }
        i7 = 1073741824;
        boolean z9 = ((mode == i7 && mode2 == i7) || m3425c) & z7;
        if (z9) {
            int min = Math.min(iArr[0], i21);
            int min2 = Math.min(iArr[1], i22);
            if (mode == 1073741824 && c1407e.m3394q() != min) {
                c1407e2.m3379O(min);
                c1407e2.f6710s0.f6809b = true;
            }
            if (mode2 == 1073741824 && c1407e.m3390k() != min2) {
                c1407e2.m3376L(min2);
                c1407e2.f6710s0.f6809b = true;
            }
            if (mode == 1073741824 && mode2 == 1073741824) {
                boolean z10 = c1444e.f6809b;
                C1407e c1407e3 = c1444e.f6808a;
                if (z10 || c1444e.f6810c) {
                    Iterator it3 = c1407e3.f6708q0.iterator();
                    while (it3.hasNext()) {
                        C1406d c1406d2 = (C1406d) it3.next();
                        c1406d2.m3387h();
                        c1406d2.f6654a = false;
                        c1406d2.f6660d.m3457n();
                        c1406d2.f6662e.m3460m();
                    }
                    i15 = 0;
                    c1407e3.m3387h();
                    c1407e3.f6654a = false;
                    c1407e3.f6660d.m3457n();
                    c1407e3.f6662e.m3460m();
                    c1444e.f6810c = false;
                } else {
                    i15 = 0;
                }
                c1444e.m3436b(c1444e.f6811d);
                c1407e3.f6652Y = i15;
                c1407e3.f6653Z = i15;
                int m3389j = c1407e3.m3389j(i15);
                int m3389j2 = c1407e3.m3389j(1);
                if (c1444e.f6809b) {
                    c1444e.m3437c();
                }
                int m3395r = c1407e3.m3395r();
                int m3396s = c1407e3.m3396s();
                z2 = z9;
                c1407e3.f6660d.f6848h.mo3444d(m3395r);
                c1407e3.f6662e.f6848h.mo3444d(m3396s);
                c1444e.m3441g();
                ArrayList arrayList2 = c1444e.f6812e;
                c1593e = c1593e5;
                if (m3389j == 2 || m3389j2 == 2) {
                    if (m3425c) {
                        Iterator it4 = arrayList2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                if (!((AbstractC1454o) it4.next()).mo3432k()) {
                                    m3425c = false;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    if (m3425c && m3389j == 2) {
                        c1407e3.m3377M(1);
                        i8 = m3394q2;
                        c1407e3.m3379O(c1444e.m3438d(c1407e3, 0));
                        c1407e3.f6660d.f6845e.mo3444d(c1407e3.m3394q());
                    } else {
                        i8 = m3394q2;
                    }
                    if (m3425c && m3389j2 == 2) {
                        i16 = 1;
                        c1407e3.m3378N(1);
                        c1407e3.m3376L(c1444e.m3438d(c1407e3, 1));
                        c1407e3.f6662e.f6845e.mo3444d(c1407e3.m3390k());
                        int[] iArr3 = c1407e3.f6685p0;
                        i9 = m3390k;
                        i17 = iArr3[0];
                        if (i17 != i16 || i17 == 4) {
                            int m3394q3 = c1407e3.m3394q() + m3395r;
                            c1407e3.f6660d.f6849i.mo3444d(m3394q3);
                            c1407e3.f6660d.f6845e.mo3444d(m3394q3 - m3395r);
                            c1444e.m3441g();
                            i18 = iArr3[1];
                            if (i18 != 1 || i18 == 4) {
                                int m3390k2 = c1407e3.m3390k() + m3396s;
                                c1407e3.f6662e.f6849i.mo3444d(m3390k2);
                                c1407e3.f6662e.f6845e.mo3444d(m3390k2 - m3396s);
                            }
                            c1444e.m3441g();
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        it = arrayList2.iterator();
                        while (it.hasNext()) {
                            AbstractC1454o abstractC1454o = (AbstractC1454o) it.next();
                            if (abstractC1454o.f6842b != c1407e3 || abstractC1454o.f6847g) {
                                abstractC1454o.mo3429e();
                            }
                        }
                        it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            AbstractC1454o abstractC1454o2 = (AbstractC1454o) it2.next();
                            if (z5 || abstractC1454o2.f6842b != c1407e3) {
                                if (!abstractC1454o2.f6848h.f6825j || ((!abstractC1454o2.f6849i.f6825j && !(abstractC1454o2 instanceof C1448i)) || (!abstractC1454o2.f6845e.f6825j && !(abstractC1454o2 instanceof C1442c) && !(abstractC1454o2 instanceof C1448i)))) {
                                    z6 = false;
                                    break;
                                }
                            }
                        }
                        z6 = true;
                        c1407e3.m3377M(m3389j);
                        c1407e3.m3378N(m3389j2);
                        z3 = z6;
                        i14 = 1073741824;
                        i10 = 2;
                    }
                } else {
                    i8 = m3394q2;
                }
                i16 = 1;
                int[] iArr32 = c1407e3.f6685p0;
                i9 = m3390k;
                i17 = iArr32[0];
                if (i17 != i16) {
                }
                int m3394q32 = c1407e3.m3394q() + m3395r;
                c1407e3.f6660d.f6849i.mo3444d(m3394q32);
                c1407e3.f6660d.f6845e.mo3444d(m3394q32 - m3395r);
                c1444e.m3441g();
                i18 = iArr32[1];
                if (i18 != 1) {
                }
                int m3390k22 = c1407e3.m3390k() + m3396s;
                c1407e3.f6662e.f6849i.mo3444d(m3390k22);
                c1407e3.f6662e.f6845e.mo3444d(m3390k22 - m3396s);
                c1444e.m3441g();
                z5 = true;
                it = arrayList2.iterator();
                while (it.hasNext()) {
                }
                it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                }
                z6 = true;
                c1407e3.m3377M(m3389j);
                c1407e3.m3378N(m3389j2);
                z3 = z6;
                i14 = 1073741824;
                i10 = 2;
            } else {
                z2 = z9;
                c1593e = c1593e5;
                i8 = m3394q2;
                i9 = m3390k;
                boolean z11 = c1444e.f6809b;
                C1407e c1407e4 = c1444e.f6808a;
                if (z11) {
                    Iterator it5 = c1407e4.f6708q0.iterator();
                    while (it5.hasNext()) {
                        C1406d c1406d3 = (C1406d) it5.next();
                        c1406d3.m3387h();
                        c1406d3.f6654a = false;
                        C1450k c1450k2 = c1406d3.f6660d;
                        c1450k2.f6845e.f6825j = false;
                        c1450k2.f6847g = false;
                        c1450k2.m3457n();
                        C1452m c1452m2 = c1406d3.f6662e;
                        c1452m2.f6845e.f6825j = false;
                        c1452m2.f6847g = false;
                        c1452m2.m3460m();
                    }
                    i13 = 0;
                    c1407e4.m3387h();
                    c1407e4.f6654a = false;
                    C1450k c1450k3 = c1407e4.f6660d;
                    c1450k3.f6845e.f6825j = false;
                    c1450k3.f6847g = false;
                    c1450k3.m3457n();
                    C1452m c1452m3 = c1407e4.f6662e;
                    c1452m3.f6845e.f6825j = false;
                    c1452m3.f6847g = false;
                    c1452m3.m3460m();
                    c1444e.m3437c();
                } else {
                    i13 = 0;
                }
                c1444e.m3436b(c1444e.f6811d);
                c1407e4.f6652Y = i13;
                c1407e4.f6653Z = i13;
                c1407e4.f6660d.f6848h.mo3444d(i13);
                c1407e4.f6662e.f6848h.mo3444d(i13);
                i14 = 1073741824;
                if (mode == 1073741824) {
                    z3 = c1407e2.m3407T(i13, m3425c);
                    i10 = 1;
                } else {
                    i10 = 0;
                    z3 = true;
                }
                if (mode2 == 1073741824) {
                    z3 &= c1407e2.m3407T(1, m3425c);
                    i10++;
                }
            }
            if (z3) {
                c1407e2.mo3380P(mode == i14, mode2 == i14);
            }
        } else {
            z2 = z9;
            c1593e = c1593e5;
            i8 = m3394q2;
            i9 = m3390k;
            i10 = 0;
            z3 = false;
        }
        if (z3 && i10 == 2) {
            return;
        }
        int i30 = c1407e2.f6699D0;
        if (size3 > 0) {
            int size4 = c1407e2.f6708q0.size();
            boolean m3409W = c1407e2.m3409W(64);
            C1593e c1593e6 = c1407e2.f6712u0;
            for (int i31 = 0; i31 < size4; i31++) {
                C1406d c1406d4 = (C1406d) c1407e2.f6708q0.get(i31);
                if (!(c1406d4 instanceof C1410h) && !(c1406d4 instanceof C1403a) && !c1406d4.f6633F && (!m3409W || (c1450k = c1406d4.f6660d) == null || (c1452m = c1406d4.f6662e) == null || !c1450k.f6845e.f6825j || !c1452m.f6845e.f6825j)) {
                    int m3389j3 = c1406d4.m3389j(0);
                    int m3389j4 = c1406d4.m3389j(1);
                    boolean z12 = m3389j3 == 3 && c1406d4.f6687r != 1 && m3389j4 == 3 && c1406d4.f6688s != 1;
                    if (!z12 && c1407e2.m3409W(1) && !(c1406d4 instanceof C1409g)) {
                        if (m3389j3 == 3 && c1406d4.f6687r == 0 && m3389j4 != 3 && !c1406d4.m3401x()) {
                            z12 = true;
                        }
                        if (m3389j4 == 3 && c1406d4.f6688s == 0 && m3389j3 != 3 && !c1406d4.m3401x()) {
                            z12 = true;
                        }
                        if (m3389j3 == 3 || m3389j4 == 3) {
                            if (c1406d4.f6650W > 0.0f) {
                                z12 = true;
                            }
                            if (z12) {
                                c0198k.m607q(0, c1406d4, c1593e6);
                            }
                        }
                    }
                    if (z12) {
                    }
                }
            }
            ConstraintLayout constraintLayout = c1593e6.f9072a;
            int childCount2 = constraintLayout.getChildCount();
            for (int i32 = 0; i32 < childCount2; i32++) {
                constraintLayout.getChildAt(i32);
            }
            ArrayList arrayList3 = constraintLayout.f1858g;
            int size5 = arrayList3.size();
            if (size5 > 0) {
                for (int i33 = 0; i33 < size5; i33++) {
                    ((AbstractC1590b) arrayList3.get(i33)).getClass();
                }
            }
        }
        c0198k.m612w(c1407e2);
        ArrayList arrayList4 = (ArrayList) c0198k.f533b;
        int size6 = arrayList4.size();
        int i34 = i8;
        int i35 = i9;
        if (size3 > 0) {
            c0198k.m610u(c1407e2, 0, i34, i35);
        }
        if (size6 > 0) {
            int[] iArr4 = c1407e2.f6685p0;
            boolean z13 = iArr4[0] == 2;
            boolean z14 = iArr4[1] == 2;
            int m3394q4 = c1407e.m3394q();
            C1407e c1407e5 = (C1407e) c0198k.f535d;
            int max7 = Math.max(m3394q4, c1407e5.f6657b0);
            int max8 = Math.max(c1407e.m3390k(), c1407e5.f6659c0);
            int i36 = 0;
            boolean z15 = false;
            while (i36 < size6) {
                C1406d c1406d5 = (C1406d) arrayList4.get(i36);
                if (c1406d5 instanceof C1409g) {
                    int m3394q5 = c1406d5.m3394q();
                    int m3390k3 = c1406d5.m3390k();
                    i12 = i30;
                    c1593e3 = c1593e;
                    boolean m607q = z15 | c0198k.m607q(1, c1406d5, c1593e3);
                    int m3394q6 = c1406d5.m3394q();
                    int m3390k4 = c1406d5.m3390k();
                    if (m3394q6 != m3394q5) {
                        c1406d5.m3379O(m3394q6);
                        if (z13 && c1406d5.m3395r() + c1406d5.f6648U > max7) {
                            max7 = Math.max(max7, c1406d5.mo3388i(4).m3357e() + c1406d5.m3395r() + c1406d5.f6648U);
                        }
                        z4 = true;
                    } else {
                        z4 = m607q;
                    }
                    if (m3390k4 != m3390k3) {
                        c1406d5.m3376L(m3390k4);
                        if (z14 && c1406d5.m3396s() + c1406d5.f6649V > max8) {
                            max8 = Math.max(max8, c1406d5.mo3388i(5).m3357e() + c1406d5.m3396s() + c1406d5.f6649V);
                        }
                        z4 = true;
                    }
                    z15 = ((C1409g) c1406d5).f6770y0 | z4;
                } else {
                    i12 = i30;
                    c1593e3 = c1593e;
                }
                i36++;
                c1593e = c1593e3;
                i30 = i12;
            }
            int i37 = i30;
            C1593e c1593e7 = c1593e;
            int i38 = 0;
            while (i38 < 2) {
                int i39 = 0;
                while (i39 < size6) {
                    C1406d c1406d6 = (C1406d) arrayList4.get(i39);
                    if (((c1406d6 instanceof AbstractC1411i) && !(c1406d6 instanceof C1409g)) || (c1406d6 instanceof C1410h) || c1406d6.f6667g0 == 8 || ((z2 && c1406d6.f6660d.f6845e.f6825j && c1406d6.f6662e.f6845e.f6825j) || (c1406d6 instanceof C1409g))) {
                        c1593e2 = c1593e7;
                        arrayList = arrayList4;
                        i11 = size6;
                    } else {
                        int m3394q7 = c1406d6.m3394q();
                        int m3390k5 = c1406d6.m3390k();
                        arrayList = arrayList4;
                        int i40 = c1406d6.f6655a0;
                        i11 = size6;
                        boolean m607q2 = c0198k.m607q(i38 == 1 ? 2 : 1, c1406d6, c1593e7) | z15;
                        int m3394q8 = c1406d6.m3394q();
                        c1593e2 = c1593e7;
                        int m3390k6 = c1406d6.m3390k();
                        if (m3394q8 != m3394q7) {
                            c1406d6.m3379O(m3394q8);
                            if (z13 && c1406d6.m3395r() + c1406d6.f6648U > max7) {
                                max7 = Math.max(max7, c1406d6.mo3388i(4).m3357e() + c1406d6.m3395r() + c1406d6.f6648U);
                            }
                            m607q2 = true;
                        }
                        if (m3390k6 != m3390k5) {
                            c1406d6.m3376L(m3390k6);
                            if (z14 && c1406d6.m3396s() + c1406d6.f6649V > max8) {
                                max8 = Math.max(max8, c1406d6.mo3388i(5).m3357e() + c1406d6.m3396s() + c1406d6.f6649V);
                            }
                            m607q2 = true;
                        }
                        z15 = (!c1406d6.f6632E || i40 == c1406d6.f6655a0) ? m607q2 : true;
                    }
                    i39++;
                    arrayList4 = arrayList;
                    size6 = i11;
                    c1593e7 = c1593e2;
                }
                C1593e c1593e8 = c1593e7;
                ArrayList arrayList5 = arrayList4;
                int i41 = size6;
                if (!z15) {
                    break;
                }
                i38++;
                c0198k.m610u(c1407e, i38, i34, i35);
                c1593e7 = c1593e8;
                arrayList4 = arrayList5;
                size6 = i41;
                z15 = false;
            }
            c1407e2 = c1407e;
            i30 = i37;
        }
        c1407e2.f6699D0 = i30;
        C1239c.f5508p = c1407e2.m3409W(512);
    }

    /* renamed from: k */
    public final void m1315k(C1406d c1406d, C1592d c1592d, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.f1857f.get(i);
        C1406d c1406d2 = (C1406d) sparseArray.get(i);
        if (c1406d2 == null || view == null || !(view.getLayoutParams() instanceof C1592d)) {
            return;
        }
        c1592d.f9035c0 = true;
        if (i2 == 6) {
            C1592d c1592d2 = (C1592d) view.getLayoutParams();
            c1592d2.f9035c0 = true;
            c1592d2.f9061p0.f6632E = true;
        }
        c1406d.mo3388i(6).m3354b(c1406d2.mo3388i(i2), c1592d.f9007D, c1592d.f9006C, true);
        c1406d.f6632E = true;
        c1406d.mo3388i(3).m3362j();
        c1406d.mo3388i(5).m3362j();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C1592d c1592d = (C1592d) childAt.getLayoutParams();
            C1406d c1406d = c1592d.f9061p0;
            if (childAt.getVisibility() != 8 || c1592d.f9037d0 || c1592d.f9039e0 || isInEditMode) {
                int m3395r = c1406d.m3395r();
                int m3396s = c1406d.m3396s();
                childAt.layout(m3395r, m3396s, c1406d.m3394q() + m3395r, c1406d.m3390k() + m3396s);
            }
        }
        ArrayList arrayList = this.f1858g;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC1590b) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:276:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x03c6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x0310  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        boolean z2;
        int i3;
        int i4;
        C1406d c1406d;
        int i5;
        C1406d c1406d2;
        int i6;
        C1406d c1406d3;
        int i7;
        C1592d c1592d;
        float f2;
        int i8;
        int i9;
        int i10;
        float parseFloat;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        String resourceName;
        int id;
        C1406d c1406d4;
        ConstraintLayout constraintLayout = this;
        if (constraintLayout.f1872u == i) {
            int i12 = constraintLayout.f1873v;
        }
        int i13 = 0;
        if (!constraintLayout.f1864m) {
            int childCount = getChildCount();
            int i14 = 0;
            while (true) {
                if (i14 >= childCount) {
                    break;
                }
                if (constraintLayout.getChildAt(i14).isLayoutRequested()) {
                    constraintLayout.f1864m = true;
                    break;
                }
                i14++;
            }
        }
        constraintLayout.f1872u = i;
        constraintLayout.f1873v = i2;
        boolean z3 = (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
        C1407e c1407e = constraintLayout.f1859h;
        c1407e.f6713v0 = z3;
        if (constraintLayout.f1864m) {
            constraintLayout.f1864m = false;
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    z2 = false;
                    break;
                } else {
                    if (constraintLayout.getChildAt(i15).isLayoutRequested()) {
                        z2 = true;
                        break;
                    }
                    i15++;
                }
            }
            if (z2) {
                boolean isInEditMode = isInEditMode();
                int childCount3 = getChildCount();
                for (int i16 = 0; i16 < childCount3; i16++) {
                    C1406d m1311g = constraintLayout.m1311g(constraintLayout.getChildAt(i16));
                    if (m1311g != null) {
                        m1311g.mo3369C();
                    }
                }
                Object obj = null;
                if (isInEditMode) {
                    for (int i17 = 0; i17 < childCount3; i17++) {
                        View childAt = constraintLayout.getChildAt(i17);
                        try {
                            resourceName = getResources().getResourceName(childAt.getId());
                            Integer valueOf = Integer.valueOf(childAt.getId());
                            if (resourceName != null) {
                                if (constraintLayout.f1869r == null) {
                                    constraintLayout.f1869r = new HashMap();
                                }
                                int indexOf = resourceName.indexOf("/");
                                constraintLayout.f1869r.put(indexOf != -1 ? resourceName.substring(indexOf + 1) : resourceName, valueOf);
                            }
                            int indexOf2 = resourceName.indexOf(47);
                            if (indexOf2 != -1) {
                                resourceName = resourceName.substring(indexOf2 + 1);
                            }
                            id = childAt.getId();
                        } catch (Resources.NotFoundException unused) {
                        }
                        if (id != 0) {
                            View view = (View) constraintLayout.f1857f.get(id);
                            if (view == null && (view = constraintLayout.findViewById(id)) != null && view != constraintLayout && view.getParent() == constraintLayout) {
                                constraintLayout.onViewAdded(view);
                            }
                            if (view != constraintLayout) {
                                c1406d4 = view == null ? null : ((C1592d) view.getLayoutParams()).f9061p0;
                                c1406d4.f6669h0 = resourceName;
                            }
                        }
                        c1406d4 = c1407e;
                        c1406d4.f6669h0 = resourceName;
                    }
                }
                if (constraintLayout.f1868q != -1) {
                    for (int i18 = 0; i18 < childCount3; i18++) {
                        constraintLayout.getChildAt(i18).getId();
                    }
                }
                C1602n c1602n = constraintLayout.f1866o;
                if (c1602n != null) {
                    c1602n.m4766a(constraintLayout);
                }
                c1407e.f6708q0.clear();
                ArrayList arrayList3 = constraintLayout.f1858g;
                int size = arrayList3.size();
                if (size > 0) {
                    int i19 = 0;
                    while (i19 < size) {
                        AbstractC1590b abstractC1590b = (AbstractC1590b) arrayList3.get(i19);
                        if (abstractC1590b.isInEditMode()) {
                            abstractC1590b.setIds(abstractC1590b.f9000j);
                        }
                        AbstractC1411i abstractC1411i = abstractC1590b.f8999i;
                        if (abstractC1411i == null) {
                            arrayList = arrayList3;
                        } else {
                            abstractC1411i.f6779r0 = i13;
                            Arrays.fill(abstractC1411i.f6778q0, obj);
                            int i20 = i13;
                            while (i20 < abstractC1590b.f8997g) {
                                int i21 = abstractC1590b.f8996f[i20];
                                View view2 = (View) constraintLayout.f1857f.get(i21);
                                if (view2 == null) {
                                    Integer valueOf2 = Integer.valueOf(i21);
                                    HashMap hashMap = abstractC1590b.f9002l;
                                    String str = (String) hashMap.get(valueOf2);
                                    int m4746f = abstractC1590b.m4746f(constraintLayout, str);
                                    if (m4746f != 0) {
                                        abstractC1590b.f8996f[i20] = m4746f;
                                        hashMap.put(Integer.valueOf(m4746f), str);
                                        view2 = (View) constraintLayout.f1857f.get(m4746f);
                                    }
                                }
                                if (view2 != null) {
                                    AbstractC1411i abstractC1411i2 = abstractC1590b.f8999i;
                                    C1406d m1311g2 = constraintLayout.m1311g(view2);
                                    abstractC1411i2.getClass();
                                    if (m1311g2 != abstractC1411i2 && m1311g2 != null) {
                                        int i22 = abstractC1411i2.f6779r0 + 1;
                                        C1406d[] c1406dArr = abstractC1411i2.f6778q0;
                                        arrayList2 = arrayList3;
                                        if (i22 > c1406dArr.length) {
                                            abstractC1411i2.f6778q0 = (C1406d[]) Arrays.copyOf(c1406dArr, c1406dArr.length * 2);
                                        }
                                        C1406d[] c1406dArr2 = abstractC1411i2.f6778q0;
                                        int i23 = abstractC1411i2.f6779r0;
                                        c1406dArr2[i23] = m1311g2;
                                        abstractC1411i2.f6779r0 = i23 + 1;
                                        i20++;
                                        arrayList3 = arrayList2;
                                    }
                                }
                                arrayList2 = arrayList3;
                                i20++;
                                arrayList3 = arrayList2;
                            }
                            arrayList = arrayList3;
                            abstractC1590b.f8999i.mo3416S();
                        }
                        i19++;
                        arrayList3 = arrayList;
                        obj = null;
                        i13 = 0;
                    }
                }
                for (int i24 = 0; i24 < childCount3; i24++) {
                    constraintLayout.getChildAt(i24);
                }
                SparseArray sparseArray = constraintLayout.f1870s;
                sparseArray.clear();
                sparseArray.put(0, c1407e);
                sparseArray.put(getId(), c1407e);
                for (int i25 = 0; i25 < childCount3; i25++) {
                    View childAt2 = constraintLayout.getChildAt(i25);
                    sparseArray.put(childAt2.getId(), constraintLayout.m1311g(childAt2));
                }
                int i26 = 0;
                while (i26 < childCount3) {
                    View childAt3 = constraintLayout.getChildAt(i26);
                    C1406d m1311g3 = constraintLayout.m1311g(childAt3);
                    if (m1311g3 != null) {
                        C1592d c1592d2 = (C1592d) childAt3.getLayoutParams();
                        c1407e.f6708q0.add(m1311g3);
                        C1406d c1406d5 = m1311g3.f6647T;
                        if (c1406d5 != null) {
                            ((C1407e) c1406d5).f6708q0.remove(m1311g3);
                            m1311g3.mo3369C();
                        }
                        m1311g3.f6647T = c1407e;
                        c1592d2.m4748a();
                        m1311g3.f6667g0 = childAt3.getVisibility();
                        m1311g3.f6665f0 = childAt3;
                        if (childAt3 instanceof AbstractC1590b) {
                            ((AbstractC1590b) childAt3).mo1309h(m1311g3, c1407e.f6713v0);
                        }
                        if (c1592d2.f9037d0) {
                            C1410h c1410h = (C1410h) m1311g3;
                            int i27 = c1592d2.f9055m0;
                            int i28 = c1592d2.f9057n0;
                            float f3 = c1592d2.f9059o0;
                            if (f3 != -1.0f) {
                                if (f3 > -1.0f) {
                                    c1410h.f6772q0 = f3;
                                    c1410h.f6773r0 = -1;
                                    c1410h.f6774s0 = -1;
                                }
                            } else if (i27 != -1) {
                                if (i27 > -1) {
                                    c1410h.f6772q0 = -1.0f;
                                    c1410h.f6773r0 = i27;
                                    c1410h.f6774s0 = -1;
                                }
                            } else if (i28 != -1 && i28 > -1) {
                                c1410h.f6772q0 = -1.0f;
                                c1410h.f6773r0 = -1;
                                c1410h.f6774s0 = i28;
                            }
                        } else {
                            int i29 = c1592d2.f9041f0;
                            int i30 = c1592d2.f9043g0;
                            int i31 = c1592d2.f9045h0;
                            int i32 = c1592d2.f9047i0;
                            int i33 = c1592d2.f9049j0;
                            i3 = childCount3;
                            int i34 = c1592d2.f9051k0;
                            float f4 = c1592d2.f9053l0;
                            int i35 = c1592d2.f9060p;
                            if (i35 != -1) {
                                C1406d c1406d6 = (C1406d) sparseArray.get(i35);
                                if (c1406d6 != null) {
                                    float f5 = c1592d2.f9063r;
                                    m1311g3.m3399v(7, 7, c1592d2.f9062q, 0, c1406d6);
                                    m1311g3.f6631D = f5;
                                }
                                c1592d = c1592d2;
                            } else {
                                if (i29 != -1) {
                                    C1406d c1406d7 = (C1406d) sparseArray.get(i29);
                                    if (c1406d7 != null) {
                                        m1311g3.m3399v(2, 2, ((ViewGroup.MarginLayoutParams) c1592d2).leftMargin, i33, c1406d7);
                                    }
                                } else {
                                    i4 = -1;
                                    if (i30 != -1) {
                                        C1406d c1406d8 = (C1406d) sparseArray.get(i30);
                                        if (c1406d8 != null) {
                                            m1311g3.m3399v(2, 4, ((ViewGroup.MarginLayoutParams) c1592d2).leftMargin, i33, c1406d8);
                                        }
                                    }
                                    if (i31 == i4) {
                                        C1406d c1406d9 = (C1406d) sparseArray.get(i31);
                                        if (c1406d9 != null) {
                                            m1311g3.m3399v(4, 2, ((ViewGroup.MarginLayoutParams) c1592d2).rightMargin, i34, c1406d9);
                                        }
                                    } else if (i32 != i4 && (c1406d = (C1406d) sparseArray.get(i32)) != null) {
                                        m1311g3.m3399v(4, 4, ((ViewGroup.MarginLayoutParams) c1592d2).rightMargin, i34, c1406d);
                                    }
                                    i5 = c1592d2.f9046i;
                                    if (i5 == -1) {
                                        C1406d c1406d10 = (C1406d) sparseArray.get(i5);
                                        if (c1406d10 != null) {
                                            m1311g3.m3399v(3, 3, ((ViewGroup.MarginLayoutParams) c1592d2).topMargin, c1592d2.f9069x, c1406d10);
                                        }
                                    } else {
                                        int i36 = c1592d2.f9048j;
                                        if (i36 != -1 && (c1406d2 = (C1406d) sparseArray.get(i36)) != null) {
                                            m1311g3.m3399v(3, 5, ((ViewGroup.MarginLayoutParams) c1592d2).topMargin, c1592d2.f9069x, c1406d2);
                                        }
                                    }
                                    i6 = c1592d2.f9050k;
                                    if (i6 == -1) {
                                        C1406d c1406d11 = (C1406d) sparseArray.get(i6);
                                        if (c1406d11 != null) {
                                            m1311g3.m3399v(5, 3, ((ViewGroup.MarginLayoutParams) c1592d2).bottomMargin, c1592d2.f9071z, c1406d11);
                                        }
                                    } else {
                                        int i37 = c1592d2.f9052l;
                                        if (i37 != -1 && (c1406d3 = (C1406d) sparseArray.get(i37)) != null) {
                                            m1311g3.m3399v(5, 5, ((ViewGroup.MarginLayoutParams) c1592d2).bottomMargin, c1592d2.f9071z, c1406d3);
                                        }
                                    }
                                    i7 = c1592d2.f9054m;
                                    if (i7 == -1) {
                                        c1592d = c1592d2;
                                        m1315k(m1311g3, c1592d2, sparseArray, i7, 6);
                                    } else {
                                        c1592d = c1592d2;
                                        int i38 = c1592d.f9056n;
                                        if (i38 != -1) {
                                            m1315k(m1311g3, c1592d, sparseArray, i38, 3);
                                        } else {
                                            int i39 = c1592d.f9058o;
                                            if (i39 != -1) {
                                                m1315k(m1311g3, c1592d, sparseArray, i39, 5);
                                            }
                                        }
                                    }
                                    if (f4 >= 0.0f) {
                                        m1311g3.f6661d0 = f4;
                                    }
                                    f2 = c1592d.f9009F;
                                    if (f2 >= 0.0f) {
                                        m1311g3.f6663e0 = f2;
                                    }
                                }
                                i4 = -1;
                                if (i31 == i4) {
                                }
                                i5 = c1592d2.f9046i;
                                if (i5 == -1) {
                                }
                                i6 = c1592d2.f9050k;
                                if (i6 == -1) {
                                }
                                i7 = c1592d2.f9054m;
                                if (i7 == -1) {
                                }
                                if (f4 >= 0.0f) {
                                }
                                f2 = c1592d.f9009F;
                                if (f2 >= 0.0f) {
                                }
                            }
                            if (isInEditMode && ((i11 = c1592d.f9023T) != -1 || c1592d.f9024U != -1)) {
                                int i40 = c1592d.f9024U;
                                m1311g3.f6652Y = i11;
                                m1311g3.f6653Z = i40;
                            }
                            if (c1592d.f9031a0) {
                                m1311g3.m3377M(1);
                                m1311g3.m3379O(((ViewGroup.MarginLayoutParams) c1592d).width);
                                if (((ViewGroup.MarginLayoutParams) c1592d).width == -2) {
                                    m1311g3.m3377M(2);
                                }
                            } else if (((ViewGroup.MarginLayoutParams) c1592d).width == -1) {
                                if (c1592d.f9026W) {
                                    m1311g3.m3377M(3);
                                } else {
                                    m1311g3.m3377M(4);
                                }
                                m1311g3.mo3388i(2).f6625g = ((ViewGroup.MarginLayoutParams) c1592d).leftMargin;
                                m1311g3.mo3388i(4).f6625g = ((ViewGroup.MarginLayoutParams) c1592d).rightMargin;
                            } else {
                                m1311g3.m3377M(3);
                                m1311g3.m3379O(0);
                            }
                            if (c1592d.f9033b0) {
                                i8 = -1;
                                m1311g3.m3378N(1);
                                m1311g3.m3376L(((ViewGroup.MarginLayoutParams) c1592d).height);
                                if (((ViewGroup.MarginLayoutParams) c1592d).height == -2) {
                                    m1311g3.m3378N(2);
                                }
                            } else {
                                i8 = -1;
                                if (((ViewGroup.MarginLayoutParams) c1592d).height == -1) {
                                    if (c1592d.f9027X) {
                                        m1311g3.m3378N(3);
                                    } else {
                                        m1311g3.m3378N(4);
                                    }
                                    m1311g3.mo3388i(3).f6625g = ((ViewGroup.MarginLayoutParams) c1592d).topMargin;
                                    m1311g3.mo3388i(5).f6625g = ((ViewGroup.MarginLayoutParams) c1592d).bottomMargin;
                                } else {
                                    m1311g3.m3378N(3);
                                    m1311g3.m3376L(0);
                                }
                            }
                            String str2 = c1592d.f9010G;
                            if (str2 == null || str2.length() == 0) {
                                m1311g3.f6650W = 0.0f;
                            } else {
                                int length = str2.length();
                                int indexOf3 = str2.indexOf(44);
                                if (indexOf3 <= 0 || indexOf3 >= length - 1) {
                                    i9 = i8;
                                    i10 = 0;
                                } else {
                                    String substring = str2.substring(0, indexOf3);
                                    i9 = substring.equalsIgnoreCase("W") ? 0 : substring.equalsIgnoreCase("H") ? 1 : i8;
                                    i10 = indexOf3 + 1;
                                }
                                int indexOf4 = str2.indexOf(58);
                                if (indexOf4 < 0 || indexOf4 >= length - 1) {
                                    String substring2 = str2.substring(i10);
                                    if (substring2.length() > 0) {
                                        parseFloat = Float.parseFloat(substring2);
                                    }
                                    parseFloat = 0.0f;
                                } else {
                                    String substring3 = str2.substring(i10, indexOf4);
                                    String substring4 = str2.substring(indexOf4 + 1);
                                    if (substring3.length() > 0 && substring4.length() > 0) {
                                        try {
                                            float parseFloat2 = Float.parseFloat(substring3);
                                            float parseFloat3 = Float.parseFloat(substring4);
                                            if (parseFloat2 > 0.0f && parseFloat3 > 0.0f) {
                                                parseFloat = i9 == 1 ? Math.abs(parseFloat3 / parseFloat2) : Math.abs(parseFloat2 / parseFloat3);
                                            }
                                        } catch (NumberFormatException unused2) {
                                        }
                                    }
                                    parseFloat = 0.0f;
                                }
                                if (parseFloat > 0.0f) {
                                    m1311g3.f6650W = parseFloat;
                                    m1311g3.f6651X = i9;
                                }
                            }
                            float f6 = c1592d.f9011H;
                            float[] fArr = m1311g3.f6675k0;
                            fArr[0] = f6;
                            fArr[1] = c1592d.f9012I;
                            m1311g3.f6671i0 = c1592d.f9013J;
                            m1311g3.f6673j0 = c1592d.f9014K;
                            int i41 = c1592d.f9029Z;
                            if (i41 >= 0 && i41 <= 3) {
                                m1311g3.f6686q = i41;
                            }
                            int i42 = c1592d.f9015L;
                            int i43 = c1592d.f9017N;
                            int i44 = c1592d.f9019P;
                            float f7 = c1592d.f9021R;
                            m1311g3.f6687r = i42;
                            m1311g3.f6690u = i43;
                            if (i44 == Integer.MAX_VALUE) {
                                i44 = 0;
                            }
                            m1311g3.f6691v = i44;
                            m1311g3.f6692w = f7;
                            if (f7 > 0.0f && f7 < 1.0f && i42 == 0) {
                                m1311g3.f6687r = 2;
                            }
                            int i45 = c1592d.f9016M;
                            int i46 = c1592d.f9018O;
                            int i47 = c1592d.f9020Q;
                            float f8 = c1592d.f9022S;
                            m1311g3.f6688s = i45;
                            m1311g3.f6693x = i46;
                            if (i47 == Integer.MAX_VALUE) {
                                i47 = 0;
                            }
                            m1311g3.f6694y = i47;
                            m1311g3.f6695z = f8;
                            if (f8 > 0.0f && f8 < 1.0f && i45 == 0) {
                                m1311g3.f6688s = 2;
                            }
                            i26++;
                            constraintLayout = this;
                            childCount3 = i3;
                        }
                    }
                    i3 = childCount3;
                    i26++;
                    constraintLayout = this;
                    childCount3 = i3;
                }
            }
            if (z2) {
                c1407e.f6709r0.m612w(c1407e);
            }
        }
        m1314j(c1407e, this.f1865n, i, i2);
        int m3394q = c1407e.m3394q();
        int m3390k = c1407e.m3390k();
        boolean z4 = c1407e.f6700E0;
        boolean z5 = c1407e.f6701F0;
        C1593e c1593e = this.f1871t;
        int i48 = c1593e.f9076e;
        int resolveSizeAndState = View.resolveSizeAndState(m3394q + c1593e.f9075d, i, 0);
        int resolveSizeAndState2 = View.resolveSizeAndState(m3390k + i48, i2, 0) & 16777215;
        int min = Math.min(this.f1862k, resolveSizeAndState & 16777215);
        int min2 = Math.min(this.f1863l, resolveSizeAndState2);
        if (z4) {
            min |= 16777216;
        }
        if (z5) {
            min2 |= 16777216;
        }
        setMeasuredDimension(min, min2);
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C1406d m1311g = m1311g(view);
        if ((view instanceof Guideline) && !(m1311g instanceof C1410h)) {
            C1592d c1592d = (C1592d) view.getLayoutParams();
            C1410h c1410h = new C1410h();
            c1592d.f9061p0 = c1410h;
            c1592d.f9037d0 = true;
            c1410h.m3421S(c1592d.f9025V);
        }
        if (view instanceof AbstractC1590b) {
            AbstractC1590b abstractC1590b = (AbstractC1590b) view;
            abstractC1590b.m4747i();
            ((C1592d) view.getLayoutParams()).f9039e0 = true;
            ArrayList arrayList = this.f1858g;
            if (!arrayList.contains(abstractC1590b)) {
                arrayList.add(abstractC1590b);
            }
        }
        this.f1857f.put(view.getId(), view);
        this.f1864m = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f1857f.remove(view.getId());
        C1406d m1311g = m1311g(view);
        this.f1859h.f6708q0.remove(m1311g);
        m1311g.mo3369C();
        this.f1858g.remove(view);
        this.f1864m = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.f1864m = true;
        super.requestLayout();
    }

    public void setConstraintSet(C1602n c1602n) {
        this.f1866o = c1602n;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.f1857f;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.f1863l) {
            return;
        }
        this.f1863l = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.f1862k) {
            return;
        }
        this.f1862k = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.f1861j) {
            return;
        }
        this.f1861j = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.f1860i) {
            return;
        }
        this.f1860i = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC1603o abstractC1603o) {
        C0043j c0043j = this.f1867p;
        if (c0043j != null) {
            c0043j.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.f1865n = i;
        C1407e c1407e = this.f1859h;
        c1407e.f6699D0 = i;
        C1239c.f5508p = c1407e.m3409W(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1857f = new SparseArray();
        this.f1858g = new ArrayList(4);
        this.f1859h = new C1407e();
        this.f1860i = 0;
        this.f1861j = 0;
        this.f1862k = Integer.MAX_VALUE;
        this.f1863l = Integer.MAX_VALUE;
        this.f1864m = true;
        this.f1865n = 257;
        this.f1866o = null;
        this.f1867p = null;
        this.f1868q = -1;
        this.f1869r = new HashMap();
        this.f1870s = new SparseArray();
        this.f1871t = new C1593e(this, this);
        this.f1872u = 0;
        this.f1873v = 0;
        m1312h(attributeSet, i);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        C1592d c1592d = new C1592d(layoutParams);
        c1592d.f9030a = -1;
        c1592d.f9032b = -1;
        c1592d.f9034c = -1.0f;
        c1592d.f9036d = true;
        c1592d.f9038e = -1;
        c1592d.f9040f = -1;
        c1592d.f9042g = -1;
        c1592d.f9044h = -1;
        c1592d.f9046i = -1;
        c1592d.f9048j = -1;
        c1592d.f9050k = -1;
        c1592d.f9052l = -1;
        c1592d.f9054m = -1;
        c1592d.f9056n = -1;
        c1592d.f9058o = -1;
        c1592d.f9060p = -1;
        c1592d.f9062q = 0;
        c1592d.f9063r = 0.0f;
        c1592d.f9064s = -1;
        c1592d.f9065t = -1;
        c1592d.f9066u = -1;
        c1592d.f9067v = -1;
        c1592d.f9068w = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9069x = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9070y = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9071z = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9004A = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9005B = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9006C = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9007D = 0;
        c1592d.f9008E = 0.5f;
        c1592d.f9009F = 0.5f;
        c1592d.f9010G = null;
        c1592d.f9011H = -1.0f;
        c1592d.f9012I = -1.0f;
        c1592d.f9013J = 0;
        c1592d.f9014K = 0;
        c1592d.f9015L = 0;
        c1592d.f9016M = 0;
        c1592d.f9017N = 0;
        c1592d.f9018O = 0;
        c1592d.f9019P = 0;
        c1592d.f9020Q = 0;
        c1592d.f9021R = 1.0f;
        c1592d.f9022S = 1.0f;
        c1592d.f9023T = -1;
        c1592d.f9024U = -1;
        c1592d.f9025V = -1;
        c1592d.f9026W = false;
        c1592d.f9027X = false;
        c1592d.f9028Y = null;
        c1592d.f9029Z = 0;
        c1592d.f9031a0 = true;
        c1592d.f9033b0 = true;
        c1592d.f9035c0 = false;
        c1592d.f9037d0 = false;
        c1592d.f9039e0 = false;
        c1592d.f9041f0 = -1;
        c1592d.f9043g0 = -1;
        c1592d.f9045h0 = -1;
        c1592d.f9047i0 = -1;
        c1592d.f9049j0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9051k0 = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        c1592d.f9053l0 = 0.5f;
        c1592d.f9061p0 = new C1406d();
        return c1592d;
    }
}
