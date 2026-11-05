package p117x;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;
import p109u0.AbstractC1561o;
import p114w.AbstractC1618a;

/* renamed from: x.d */
/* loaded from: classes.dex */
public final class C1639d extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC1636a f9306a;

    /* renamed from: b */
    public boolean f9307b;

    /* renamed from: c */
    public final int f9308c;

    /* renamed from: d */
    public final int f9309d;

    /* renamed from: e */
    public final int f9310e;

    /* renamed from: f */
    public final int f9311f;

    /* renamed from: g */
    public final int f9312g;

    /* renamed from: h */
    public int f9313h;

    /* renamed from: i */
    public int f9314i;

    /* renamed from: j */
    public int f9315j;

    /* renamed from: k */
    public View f9316k;

    /* renamed from: l */
    public View f9317l;

    /* renamed from: m */
    public boolean f9318m;

    /* renamed from: n */
    public boolean f9319n;

    /* renamed from: o */
    public final Rect f9320o;

    public C1639d() {
        super(-2, -2);
        this.f9307b = false;
        this.f9308c = 0;
        this.f9309d = 0;
        this.f9310e = -1;
        this.f9311f = -1;
        this.f9312g = 0;
        this.f9313h = 0;
        this.f9320o = new Rect();
    }

    /* renamed from: a */
    public final boolean m4776a(int i) {
        if (i == 0) {
            return this.f9318m;
        }
        if (i != 1) {
            return false;
        }
        return this.f9319n;
    }

    public C1639d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1636a abstractC1636a;
        this.f9307b = false;
        this.f9308c = 0;
        this.f9309d = 0;
        this.f9310e = -1;
        this.f9311f = -1;
        this.f9312g = 0;
        this.f9313h = 0;
        this.f9320o = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1618a.f9250b);
        this.f9308c = obtainStyledAttributes.getInteger(0, 0);
        this.f9311f = obtainStyledAttributes.getResourceId(1, -1);
        this.f9309d = obtainStyledAttributes.getInteger(2, 0);
        this.f9310e = obtainStyledAttributes.getInteger(6, -1);
        this.f9312g = obtainStyledAttributes.getInt(5, 0);
        this.f9313h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f9307b = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            String str = CoordinatorLayout.f1878y;
            if (TextUtils.isEmpty(string)) {
                abstractC1636a = null;
            } else {
                if (string.startsWith(".")) {
                    string = context.getPackageName() + string;
                } else if (string.indexOf(46) < 0) {
                    String str2 = CoordinatorLayout.f1878y;
                    if (!TextUtils.isEmpty(str2)) {
                        string = str2 + '.' + string;
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.f1875A;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.f1879z);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    abstractC1636a = (AbstractC1636a) constructor.newInstance(context, attributeSet);
                } catch (Exception e2) {
                    throw new RuntimeException(AbstractC1561o.m4299c("Could not inflate Behavior subclass ", string), e2);
                }
            }
            this.f9306a = abstractC1636a;
        }
        obtainStyledAttributes.recycle();
        AbstractC1636a abstractC1636a2 = this.f9306a;
        if (abstractC1636a2 != null) {
            abstractC1636a2.mo2039c(this);
        }
    }

    public C1639d(C1639d c1639d) {
        super((ViewGroup.MarginLayoutParams) c1639d);
        this.f9307b = false;
        this.f9308c = 0;
        this.f9309d = 0;
        this.f9310e = -1;
        this.f9311f = -1;
        this.f9312g = 0;
        this.f9313h = 0;
        this.f9320o = new Rect();
    }

    public C1639d(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f9307b = false;
        this.f9308c = 0;
        this.f9309d = 0;
        this.f9310e = -1;
        this.f9311f = -1;
        this.f9312g = 0;
        this.f9313h = 0;
        this.f9320o = new Rect();
    }

    public C1639d(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9307b = false;
        this.f9308c = 0;
        this.f9309d = 0;
        this.f9310e = -1;
        this.f9311f = -1;
        this.f9312g = 0;
        this.f9313h = 0;
        this.f9320o = new Rect();
    }
}
