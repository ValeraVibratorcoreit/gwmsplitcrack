package p080k0;

import android.graphics.Matrix;
import android.graphics.Paint;
import java.util.ArrayList;
import p091o.C1192b;

/* renamed from: k0.j */
/* loaded from: classes.dex */
public final class C1041j extends AbstractC1042k {

    /* renamed from: a */
    public final Matrix f4938a;

    /* renamed from: b */
    public final ArrayList f4939b;

    /* renamed from: c */
    public float f4940c;

    /* renamed from: d */
    public float f4941d;

    /* renamed from: e */
    public float f4942e;

    /* renamed from: f */
    public float f4943f;

    /* renamed from: g */
    public float f4944g;

    /* renamed from: h */
    public float f4945h;

    /* renamed from: i */
    public float f4946i;

    /* renamed from: j */
    public final Matrix f4947j;

    /* renamed from: k */
    public String f4948k;

    public C1041j() {
        this.f4938a = new Matrix();
        this.f4939b = new ArrayList();
        this.f4940c = 0.0f;
        this.f4941d = 0.0f;
        this.f4942e = 0.0f;
        this.f4943f = 1.0f;
        this.f4944g = 1.0f;
        this.f4945h = 0.0f;
        this.f4946i = 0.0f;
        this.f4947j = new Matrix();
        this.f4948k = null;
    }

    @Override // p080k0.AbstractC1042k
    /* renamed from: a */
    public final boolean mo2639a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4939b;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((AbstractC1042k) arrayList.get(i)).mo2639a()) {
                return true;
            }
            i++;
        }
    }

    @Override // p080k0.AbstractC1042k
    /* renamed from: b */
    public final boolean mo2640b(int[] iArr) {
        int i = 0;
        boolean z2 = false;
        while (true) {
            ArrayList arrayList = this.f4939b;
            if (i >= arrayList.size()) {
                return z2;
            }
            z2 |= ((AbstractC1042k) arrayList.get(i)).mo2640b(iArr);
            i++;
        }
    }

    /* renamed from: c */
    public final void m2641c() {
        Matrix matrix = this.f4947j;
        matrix.reset();
        matrix.postTranslate(-this.f4941d, -this.f4942e);
        matrix.postScale(this.f4943f, this.f4944g);
        matrix.postRotate(this.f4940c, 0.0f, 0.0f);
        matrix.postTranslate(this.f4945h + this.f4941d, this.f4946i + this.f4942e);
    }

    public String getGroupName() {
        return this.f4948k;
    }

    public Matrix getLocalMatrix() {
        return this.f4947j;
    }

    public float getPivotX() {
        return this.f4941d;
    }

    public float getPivotY() {
        return this.f4942e;
    }

    public float getRotation() {
        return this.f4940c;
    }

    public float getScaleX() {
        return this.f4943f;
    }

    public float getScaleY() {
        return this.f4944g;
    }

    public float getTranslateX() {
        return this.f4945h;
    }

    public float getTranslateY() {
        return this.f4946i;
    }

    public void setPivotX(float f2) {
        if (f2 != this.f4941d) {
            this.f4941d = f2;
            m2641c();
        }
    }

    public void setPivotY(float f2) {
        if (f2 != this.f4942e) {
            this.f4942e = f2;
            m2641c();
        }
    }

    public void setRotation(float f2) {
        if (f2 != this.f4940c) {
            this.f4940c = f2;
            m2641c();
        }
    }

    public void setScaleX(float f2) {
        if (f2 != this.f4943f) {
            this.f4943f = f2;
            m2641c();
        }
    }

    public void setScaleY(float f2) {
        if (f2 != this.f4944g) {
            this.f4944g = f2;
            m2641c();
        }
    }

    public void setTranslateX(float f2) {
        if (f2 != this.f4945h) {
            this.f4945h = f2;
            m2641c();
        }
    }

    public void setTranslateY(float f2) {
        if (f2 != this.f4946i) {
            this.f4946i = f2;
            m2641c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1041j(C1041j c1041j, C1192b c1192b) {
        C1039h c1039h;
        this.f4938a = new Matrix();
        this.f4939b = new ArrayList();
        this.f4940c = 0.0f;
        this.f4941d = 0.0f;
        this.f4942e = 0.0f;
        this.f4943f = 1.0f;
        this.f4944g = 1.0f;
        this.f4945h = 0.0f;
        this.f4946i = 0.0f;
        Matrix matrix = new Matrix();
        this.f4947j = matrix;
        this.f4948k = null;
        this.f4940c = c1041j.f4940c;
        this.f4941d = c1041j.f4941d;
        this.f4942e = c1041j.f4942e;
        this.f4943f = c1041j.f4943f;
        this.f4944g = c1041j.f4944g;
        this.f4945h = c1041j.f4945h;
        this.f4946i = c1041j.f4946i;
        String str = c1041j.f4948k;
        this.f4948k = str;
        if (str != null) {
            c1192b.put(str, this);
        }
        matrix.set(c1041j.f4947j);
        ArrayList arrayList = c1041j.f4939b;
        for (int i = 0; i < arrayList.size(); i++) {
            Object obj = arrayList.get(i);
            if (obj instanceof C1041j) {
                this.f4939b.add(new C1041j((C1041j) obj, c1192b));
            } else {
                if (obj instanceof C1040i) {
                    C1040i c1040i = (C1040i) obj;
                    C1040i c1040i2 = new C1040i(c1040i);
                    c1040i2.f4928e = 0.0f;
                    c1040i2.f4930g = 1.0f;
                    c1040i2.f4931h = 1.0f;
                    c1040i2.f4932i = 0.0f;
                    c1040i2.f4933j = 1.0f;
                    c1040i2.f4934k = 0.0f;
                    c1040i2.f4935l = Paint.Cap.BUTT;
                    c1040i2.f4936m = Paint.Join.MITER;
                    c1040i2.f4937n = 4.0f;
                    c1040i2.f4927d = c1040i.f4927d;
                    c1040i2.f4928e = c1040i.f4928e;
                    c1040i2.f4930g = c1040i.f4930g;
                    c1040i2.f4929f = c1040i.f4929f;
                    c1040i2.f4951c = c1040i.f4951c;
                    c1040i2.f4931h = c1040i.f4931h;
                    c1040i2.f4932i = c1040i.f4932i;
                    c1040i2.f4933j = c1040i.f4933j;
                    c1040i2.f4934k = c1040i.f4934k;
                    c1040i2.f4935l = c1040i.f4935l;
                    c1040i2.f4936m = c1040i.f4936m;
                    c1040i2.f4937n = c1040i.f4937n;
                    c1039h = c1040i2;
                } else if (obj instanceof C1039h) {
                    c1039h = new C1039h((C1039h) obj);
                } else {
                    throw new IllegalStateException("Unknown object in the tree!");
                }
                this.f4939b.add(c1039h);
                Object obj2 = c1039h.f4950b;
                if (obj2 != null) {
                    c1192b.put(obj2, c1039h);
                }
            }
        }
    }
}
