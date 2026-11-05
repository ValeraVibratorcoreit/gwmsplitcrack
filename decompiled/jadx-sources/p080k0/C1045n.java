package p080k0;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* renamed from: k0.n */
/* loaded from: classes.dex */
public final class C1045n extends Drawable.ConstantState {

    /* renamed from: a */
    public int f4968a;

    /* renamed from: b */
    public C1044m f4969b;

    /* renamed from: c */
    public ColorStateList f4970c;

    /* renamed from: d */
    public PorterDuff.Mode f4971d;

    /* renamed from: e */
    public boolean f4972e;

    /* renamed from: f */
    public Bitmap f4973f;

    /* renamed from: g */
    public ColorStateList f4974g;

    /* renamed from: h */
    public PorterDuff.Mode f4975h;

    /* renamed from: i */
    public int f4976i;

    /* renamed from: j */
    public boolean f4977j;

    /* renamed from: k */
    public boolean f4978k;

    /* renamed from: l */
    public Paint f4979l;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.f4968a;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new C1047p(this);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new C1047p(this);
    }
}
