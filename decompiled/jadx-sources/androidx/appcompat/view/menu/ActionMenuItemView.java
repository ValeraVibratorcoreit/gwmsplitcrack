package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import p067f.AbstractC0770a;
import p079k.AbstractC1008c;
import p079k.C1007b;
import p079k.C1020o;
import p079k.InterfaceC1017l;
import p079k.InterfaceC1031z;
import p079k.MenuC1018m;
import p082l.AbstractC1099Z0;
import p082l.C1096Y;
import p082l.InterfaceC1125l;

/* loaded from: classes.dex */
public class ActionMenuItemView extends C1096Y implements InterfaceC1031z, View.OnClickListener, InterfaceC1125l {

    /* renamed from: l */
    public C1020o f1683l;

    /* renamed from: m */
    public CharSequence f1684m;

    /* renamed from: n */
    public Drawable f1685n;

    /* renamed from: o */
    public InterfaceC1017l f1686o;

    /* renamed from: p */
    public C1007b f1687p;

    /* renamed from: q */
    public AbstractC1008c f1688q;

    /* renamed from: r */
    public boolean f1689r;

    /* renamed from: s */
    public boolean f1690s;

    /* renamed from: t */
    public final int f1691t;

    /* renamed from: u */
    public int f1692u;

    /* renamed from: v */
    public final int f1693v;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.f1689r = m1260h();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3896c, 0, 0);
        this.f1691t = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.f1693v = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f1692u = -1;
        setSaveEnabled(false);
    }

    @Override // p082l.InterfaceC1125l
    /* renamed from: a */
    public final boolean mo1257a() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // p079k.InterfaceC1031z
    /* renamed from: b */
    public final void mo1258b(C1020o c1020o) {
        this.f1683l = c1020o;
        setIcon(c1020o.getIcon());
        setTitle(c1020o.getTitleCondensed());
        setId(c1020o.f4859a);
        setVisibility(c1020o.isVisible() ? 0 : 8);
        setEnabled(c1020o.isEnabled());
        if (c1020o.hasSubMenu() && this.f1687p == null) {
            this.f1687p = new C1007b(this);
        }
    }

    @Override // p082l.InterfaceC1125l
    /* renamed from: c */
    public final boolean mo1259c() {
        return !TextUtils.isEmpty(getText()) && this.f1683l.getIcon() == null;
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // p079k.InterfaceC1031z
    public C1020o getItemData() {
        return this.f1683l;
    }

    /* renamed from: h */
    public final boolean m1260h() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    /* renamed from: i */
    public final void m1261i() {
        boolean z2 = true;
        boolean z3 = !TextUtils.isEmpty(this.f1684m);
        if (this.f1685n != null && ((this.f1683l.f4883y & 4) != 4 || (!this.f1689r && !this.f1690s))) {
            z2 = false;
        }
        boolean z4 = z3 & z2;
        setText(z4 ? this.f1684m : null);
        CharSequence charSequence = this.f1683l.f4875q;
        if (TextUtils.isEmpty(charSequence)) {
            setContentDescription(z4 ? null : this.f1683l.f4863e);
        } else {
            setContentDescription(charSequence);
        }
        CharSequence charSequence2 = this.f1683l.f4876r;
        if (TextUtils.isEmpty(charSequence2)) {
            AbstractC1099Z0.m2725a(this, z4 ? null : this.f1683l.f4863e);
        } else {
            AbstractC1099Z0.m2725a(this, charSequence2);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC1017l interfaceC1017l = this.f1686o;
        if (interfaceC1017l != null) {
            interfaceC1017l.mo1262a(this.f1683l);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f1689r = m1260h();
        m1261i();
    }

    @Override // p082l.C1096Y, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean isEmpty = TextUtils.isEmpty(getText());
        if (!isEmpty && (i3 = this.f1692u) >= 0) {
            super.setPadding(i3, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i4 = this.f1691t;
        int min = mode == Integer.MIN_VALUE ? Math.min(size, i4) : i4;
        if (mode != 1073741824 && i4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i2);
        }
        if (!isEmpty || this.f1685n == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f1685n.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C1007b c1007b;
        if (this.f1683l.hasSubMenu() && (c1007b = this.f1687p) != null && c1007b.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z2) {
    }

    public void setChecked(boolean z2) {
    }

    public void setExpandedFormat(boolean z2) {
        if (this.f1690s != z2) {
            this.f1690s = z2;
            C1020o c1020o = this.f1683l;
            if (c1020o != null) {
                MenuC1018m menuC1018m = c1020o.f4872n;
                menuC1018m.f4839k = true;
                menuC1018m.m2620p(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1685n = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.f1693v;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        m1261i();
    }

    public void setItemInvoker(InterfaceC1017l interfaceC1017l) {
        this.f1686o = interfaceC1017l;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.f1692u = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC1008c abstractC1008c) {
        this.f1688q = abstractC1008c;
    }

    public void setTitle(CharSequence charSequence) {
        this.f1684m = charSequence;
        m1261i();
    }
}
