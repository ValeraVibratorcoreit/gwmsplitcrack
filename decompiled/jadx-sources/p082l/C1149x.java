package p082l;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p033Q.AbstractC0272f;
import p067f.AbstractC0770a;

/* renamed from: l.x */
/* loaded from: classes.dex */
public final class C1149x {

    /* renamed from: a */
    public final ImageView f5286a;

    /* renamed from: b */
    public C1078O0 f5287b;

    /* renamed from: c */
    public int f5288c = 0;

    public C1149x(ImageView imageView) {
        this.f5286a = imageView;
    }

    /* renamed from: a */
    public final void m2775a() {
        C1078O0 c1078o0;
        ImageView imageView = this.f5286a;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC1118h0.m2729a(drawable);
        }
        if (drawable == null || (c1078o0 = this.f5287b) == null) {
            return;
        }
        C1141t.m2765e(drawable, c1078o0, imageView.getDrawableState());
    }

    /* renamed from: b */
    public final void m2776b(AttributeSet attributeSet, int i) {
        int resourceId;
        ImageView imageView = this.f5286a;
        Context context = imageView.getContext();
        int[] iArr = AbstractC0770a.f3899f;
        C0198k m591r = C0198k.m591r(context, attributeSet, iArr, i);
        AbstractC0169Q.m504i(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m591r.f534c, i);
        try {
            Drawable drawable = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) m591r.f534c;
            if (drawable == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable = AbstractC0088l.m257D(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable);
            }
            if (drawable != null) {
                AbstractC1118h0.m2729a(drawable);
            }
            if (typedArray.hasValue(2)) {
                AbstractC0272f.m797c(imageView, m591r.m597g(2));
            }
            if (typedArray.hasValue(3)) {
                AbstractC0272f.m798d(imageView, AbstractC1118h0.m2730b(typedArray.getInt(3, -1), null));
            }
            m591r.m609t();
        } catch (Throwable th) {
            m591r.m609t();
            throw th;
        }
    }
}
