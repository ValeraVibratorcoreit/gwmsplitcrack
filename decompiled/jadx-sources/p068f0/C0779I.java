package p068f0;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewGroup;

/* renamed from: f0.I */
/* loaded from: classes.dex */
public class C0779I extends ViewGroup.MarginLayoutParams {

    /* renamed from: a */
    public AbstractC0792W f3947a;

    /* renamed from: b */
    public final Rect f3948b;

    /* renamed from: c */
    public boolean f3949c;

    /* renamed from: d */
    public boolean f3950d;

    public C0779I(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3948b = new Rect();
        this.f3949c = true;
        this.f3950d = false;
    }

    public C0779I(int i, int i2) {
        super(i, i2);
        this.f3948b = new Rect();
        this.f3949c = true;
        this.f3950d = false;
    }

    public C0779I(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f3948b = new Rect();
        this.f3949c = true;
        this.f3950d = false;
    }

    public C0779I(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f3948b = new Rect();
        this.f3949c = true;
        this.f3950d = false;
    }

    public C0779I(C0779I c0779i) {
        super((ViewGroup.LayoutParams) c0779i);
        this.f3948b = new Rect();
        this.f3949c = true;
        this.f3950d = false;
    }
}
