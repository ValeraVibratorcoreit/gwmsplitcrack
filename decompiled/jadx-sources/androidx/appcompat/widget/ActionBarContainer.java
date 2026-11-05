package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.altaysoft.t500_split.R;
import com.jcraft.jsch.SftpATTRS;
import p067f.AbstractC0770a;
import p082l.AbstractC1070K0;
import p082l.C1103b;

/* loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: f */
    public boolean f1713f;

    /* renamed from: g */
    public View f1714g;

    /* renamed from: h */
    public View f1715h;

    /* renamed from: i */
    public Drawable f1716i;

    /* renamed from: j */
    public Drawable f1717j;

    /* renamed from: k */
    public Drawable f1718k;

    /* renamed from: l */
    public final boolean f1719l;

    /* renamed from: m */
    public boolean f1720m;

    /* renamed from: n */
    public final int f1721n;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C1103b(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3894a);
        boolean z2 = false;
        this.f1716i = obtainStyledAttributes.getDrawable(0);
        this.f1717j = obtainStyledAttributes.getDrawable(2);
        this.f1721n = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.f1719l = true;
            this.f1718k = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.f1719l ? !(this.f1716i != null || this.f1717j != null) : this.f1718k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f1716i;
        if (drawable != null && drawable.isStateful()) {
            this.f1716i.setState(getDrawableState());
        }
        Drawable drawable2 = this.f1717j;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f1717j.setState(getDrawableState());
        }
        Drawable drawable3 = this.f1718k;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f1718k.setState(getDrawableState());
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f1716i;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f1717j;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f1718k;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f1714g = findViewById(R.id.action_bar);
        this.f1715h = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f1713f || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        boolean z3 = true;
        if (this.f1719l) {
            Drawable drawable = this.f1718k;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z3 = false;
            }
        } else {
            if (this.f1716i == null) {
                z3 = false;
            } else if (this.f1714g.getVisibility() == 0) {
                this.f1716i.setBounds(this.f1714g.getLeft(), this.f1714g.getTop(), this.f1714g.getRight(), this.f1714g.getBottom());
            } else {
                View view = this.f1715h;
                if (view == null || view.getVisibility() != 0) {
                    this.f1716i.setBounds(0, 0, 0, 0);
                } else {
                    this.f1716i.setBounds(this.f1715h.getLeft(), this.f1715h.getTop(), this.f1715h.getRight(), this.f1715h.getBottom());
                }
            }
            this.f1720m = false;
        }
        if (z3) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.f1714g == null && View.MeasureSpec.getMode(i2) == Integer.MIN_VALUE && (i3 = this.f1721n) >= 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(i3, View.MeasureSpec.getSize(i2)), SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        }
        super.onMeasure(i, i2);
        if (this.f1714g == null) {
            return;
        }
        View.MeasureSpec.getMode(i2);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f1716i;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1716i);
        }
        this.f1716i = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f1714g;
            if (view != null) {
                this.f1716i.setBounds(view.getLeft(), this.f1714g.getTop(), this.f1714g.getRight(), this.f1714g.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.f1719l ? !(this.f1716i != null || this.f1717j != null) : this.f1718k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f1718k;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f1718k);
        }
        this.f1718k = drawable;
        boolean z2 = this.f1719l;
        boolean z3 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.f1718k) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.f1716i != null || this.f1717j != null) : this.f1718k == null) {
            z3 = true;
        }
        setWillNotDraw(z3);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.f1717j;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f1717j);
        }
        this.f1717j = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f1720m && this.f1717j != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.f1719l ? !(this.f1716i != null || this.f1717j != null) : this.f1718k == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC1070K0 abstractC1070K0) {
    }

    public void setTransitioning(boolean z2) {
        this.f1713f = z2;
        setDescendantFocusability(z2 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        boolean z2 = i == 0;
        Drawable drawable = this.f1716i;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.f1717j;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.f1718k;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.f1716i;
        boolean z2 = this.f1719l;
        return (drawable == drawable2 && !z2) || (drawable == this.f1717j && this.f1720m) || ((drawable == this.f1718k && z2) || super.verifyDrawable(drawable));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i) {
        if (i != 0) {
            return super.startActionModeForChild(view, callback, i);
        }
        return null;
    }
}
