package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import java.util.HashMap;
import p102s.C1403a;
import p102s.C1406d;
import p111v.AbstractC1590b;
import p111v.AbstractC1605q;

/* loaded from: classes.dex */
public class Barrier extends AbstractC1590b {

    /* renamed from: m */
    public int f1853m;

    /* renamed from: n */
    public int f1854n;

    /* renamed from: o */
    public C1403a f1855o;

    public Barrier(Context context) {
        super(context);
        this.f8996f = new int[32];
        this.f9002l = new HashMap();
        this.f8998h = context;
        mo1308g(null);
        super.setVisibility(8);
    }

    @Override // p111v.AbstractC1590b
    /* renamed from: g */
    public final void mo1308g(AttributeSet attributeSet) {
        super.mo1308g(attributeSet);
        C1403a c1403a = new C1403a();
        c1403a.f6598s0 = 0;
        c1403a.f6599t0 = true;
        c1403a.f6600u0 = 0;
        c1403a.f6601v0 = false;
        this.f1855o = c1403a;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1605q.f9209b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 26) {
                    setType(obtainStyledAttributes.getInt(index, 0));
                } else if (index == 25) {
                    this.f1855o.f6599t0 = obtainStyledAttributes.getBoolean(index, true);
                } else if (index == 27) {
                    this.f1855o.f6600u0 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.f8999i = this.f1855o;
        m4747i();
    }

    public boolean getAllowsGoneWidget() {
        return this.f1855o.f6599t0;
    }

    public int getMargin() {
        return this.f1855o.f6600u0;
    }

    public int getType() {
        return this.f1853m;
    }

    @Override // p111v.AbstractC1590b
    /* renamed from: h */
    public final void mo1309h(C1406d c1406d, boolean z2) {
        int i = this.f1853m;
        this.f1854n = i;
        if (z2) {
            if (i == 5) {
                this.f1854n = 1;
            } else if (i == 6) {
                this.f1854n = 0;
            }
        } else if (i == 5) {
            this.f1854n = 0;
        } else if (i == 6) {
            this.f1854n = 1;
        }
        if (c1406d instanceof C1403a) {
            ((C1403a) c1406d).f6598s0 = this.f1854n;
        }
    }

    public void setAllowsGoneWidget(boolean z2) {
        this.f1855o.f6599t0 = z2;
    }

    public void setDpMargin(int i) {
        this.f1855o.f6600u0 = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.f1855o.f6600u0 = i;
    }

    public void setType(int i) {
        this.f1853m = i;
    }

    public Barrier(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }
}
