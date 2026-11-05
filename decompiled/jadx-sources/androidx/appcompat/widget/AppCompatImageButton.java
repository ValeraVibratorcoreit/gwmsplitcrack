package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.altaysoft.t500_split.R;
import p010D1.AbstractC0088l;
import p082l.AbstractC1074M0;
import p082l.AbstractC1076N0;
import p082l.AbstractC1118h0;
import p082l.C1078O0;
import p082l.C1133p;
import p082l.C1149x;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {

    /* renamed from: f */
    public final C1133p f1788f;

    /* renamed from: g */
    public final C1149x f1789g;

    /* renamed from: h */
    public boolean f1790h;

    public AppCompatImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            c1133p.m2744a();
        }
        C1149x c1149x = this.f1789g;
        if (c1149x != null) {
            c1149x.m2775a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            return c1133p.m2745b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            return c1133p.m2746c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C1078O0 c1078o0;
        C1149x c1149x = this.f1789g;
        if (c1149x == null || (c1078o0 = c1149x.f5287b) == null) {
            return null;
        }
        return c1078o0.f5083a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1078O0 c1078o0;
        C1149x c1149x = this.f1789g;
        if (c1149x == null || (c1078o0 = c1149x.f5287b) == null) {
            return null;
        }
        return c1078o0.f5084b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.f1789g.f5286a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            c1133p.m2748e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            c1133p.m2749f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C1149x c1149x = this.f1789g;
        if (c1149x != null) {
            c1149x.m2775a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C1149x c1149x = this.f1789g;
        if (c1149x != null && drawable != null && !this.f1790h) {
            c1149x.f5288c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c1149x != null) {
            c1149x.m2775a();
            if (this.f1790h) {
                return;
            }
            ImageView imageView = c1149x.f5286a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c1149x.f5288c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f1790h = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        C1149x c1149x = this.f1789g;
        ImageView imageView = c1149x.f5286a;
        if (i != 0) {
            Drawable m257D = AbstractC0088l.m257D(imageView.getContext(), i);
            if (m257D != null) {
                AbstractC1118h0.m2729a(m257D);
            }
            imageView.setImageDrawable(m257D);
        } else {
            imageView.setImageDrawable(null);
        }
        c1149x.m2775a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C1149x c1149x = this.f1789g;
        if (c1149x != null) {
            c1149x.m2775a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            c1133p.m2751h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1133p c1133p = this.f1788f;
        if (c1133p != null) {
            c1133p.m2752i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C1149x c1149x = this.f1789g;
        if (c1149x != null) {
            if (c1149x.f5287b == null) {
                c1149x.f5287b = new C1078O0();
            }
            C1078O0 c1078o0 = c1149x.f5287b;
            c1078o0.f5083a = colorStateList;
            c1078o0.f5086d = true;
            c1149x.m2775a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C1149x c1149x = this.f1789g;
        if (c1149x != null) {
            if (c1149x.f5287b == null) {
                c1149x.f5287b = new C1078O0();
            }
            C1078O0 c1078o0 = c1149x.f5287b;
            c1078o0.f5084b = mode;
            c1078o0.f5085c = true;
            c1149x.m2775a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1076N0.m2694a(context);
        this.f1790h = false;
        AbstractC1074M0.m2690a(this, getContext());
        C1133p c1133p = new C1133p(this);
        this.f1788f = c1133p;
        c1133p.m2747d(attributeSet, i);
        C1149x c1149x = new C1149x(this);
        this.f1789g = c1149x;
        c1149x.m2776b(attributeSet, i);
    }
}
