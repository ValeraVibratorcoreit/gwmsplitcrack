package p080k0;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import p003B.AbstractC0035b;
import p003B.AbstractC0044k;
import p003B.AbstractC0049p;
import p008D.AbstractC0070a;
import p013F0.C0097a;
import p091o.C1192b;
import p121y0.AbstractC1687o;

/* renamed from: k0.f */
/* loaded from: classes.dex */
public final class C1037f extends AbstractC1038g implements Animatable {

    /* renamed from: h */
    public final Context f4922h;

    /* renamed from: i */
    public C0097a f4923i = null;

    /* renamed from: j */
    public ArrayList f4924j = null;

    /* renamed from: k */
    public final C1034c f4925k = new C1034c(this);

    /* renamed from: g */
    public final C1035d f4921g = new C1035d();

    public C1037f(Context context) {
        this.f4922h = context;
    }

    @Override // p080k0.AbstractC1038g, android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m199a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            return AbstractC0070a.m200b(drawable);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C1035d c1035d = this.f4921g;
        c1035d.f4916a.draw(canvas);
        if (c1035d.f4917b.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getAlpha() : this.f4921g.f4916a.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        int changingConfigurations = super.getChangingConfigurations();
        this.f4921g.getClass();
        return changingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        Drawable drawable = this.f4926f;
        return drawable != null ? AbstractC0070a.m201c(drawable) : this.f4921g.f4916a.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        if (this.f4926f != null) {
            return new C1036e(this.f4926f.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f4921g.f4916a.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f4921g.f4916a.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.getOpacity() : this.f4921g.f4916a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1035d c1035d;
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m202d(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            c1035d = this.f4921g;
            if (eventType == 1 || (xmlPullParser.getDepth() < depth && eventType == 3)) {
                break;
            }
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m46f = AbstractC0035b.m46f(resources, theme, attributeSet, AbstractC1032a.f4912e);
                    int resourceId = m46f.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1047p c1047p = new C1047p();
                        ThreadLocal threadLocal = AbstractC0049p.f148a;
                        c1047p.f4926f = AbstractC0044k.m96a(resources, resourceId, theme);
                        new C1046o(c1047p.f4926f.getConstantState());
                        c1047p.f4986k = false;
                        c1047p.setCallback(this.f4925k);
                        C1047p c1047p2 = c1035d.f4916a;
                        if (c1047p2 != null) {
                            c1047p2.setCallback(null);
                        }
                        c1035d.f4916a = c1047p;
                    }
                    m46f.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, AbstractC1032a.f4913f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f4922h;
                        if (context == null) {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                        loadAnimator.setTarget(c1035d.f4916a.f4982g.f4969b.f4967o.getOrDefault(string, null));
                        if (c1035d.f4918c == null) {
                            c1035d.f4918c = new ArrayList();
                            c1035d.f4919d = new C1192b();
                        }
                        c1035d.f4918c.add(loadAnimator);
                        c1035d.f4919d.put(loadAnimator, string);
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        if (c1035d.f4917b == null) {
            c1035d.f4917b = new AnimatorSet();
        }
        c1035d.f4917b.playTogether(c1035d.f4918c);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.isAutoMirrored() : this.f4921g.f4916a.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawable = this.f4926f;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f4921g.f4917b.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.isStateful() : this.f4921g.f4916a.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f4921g.f4916a.setBounds(rect);
        }
    }

    @Override // p080k0.AbstractC1038g, android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.setLevel(i) : this.f4921g.f4916a.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f4926f;
        return drawable != null ? drawable.setState(iArr) : this.f4921g.f4916a.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f4921g.f4916a.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z2) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setAutoMirrored(z2);
        } else {
            this.f4921g.f4916a.setAutoMirrored(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f4921g.f4916a.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC1687o.m4930Y(drawable, i);
        } else {
            this.f4921g.f4916a.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m206h(drawable, colorStateList);
        } else {
            this.f4921g.f4916a.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            AbstractC0070a.m207i(drawable, mode);
        } else {
            this.f4921g.f4916a.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z2, boolean z3) {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            return drawable.setVisible(z2, z3);
        }
        this.f4921g.f4916a.setVisible(z2, z3);
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C1035d c1035d = this.f4921g;
        if (c1035d.f4917b.isStarted()) {
            return;
        }
        c1035d.f4917b.start();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Drawable drawable = this.f4926f;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f4921g.f4917b.end();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
