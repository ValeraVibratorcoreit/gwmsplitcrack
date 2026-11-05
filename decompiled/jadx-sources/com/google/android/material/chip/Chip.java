package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.jcraft.jsch.SftpATTRS;
import com.sun.jna.Function;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Locale;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p007C0.C0068b;
import p008D.AbstractC0071b;
import p008D.InterfaceC0073d;
import p010D1.AbstractC0088l;
import p017H0.C0125d;
import p018I.AbstractC0136g;
import p018I.C0131b;
import p022K.AbstractC0158F;
import p022K.AbstractC0169Q;
import p025L0.C0250a;
import p025L0.C0251b;
import p025L0.C0252c;
import p025L0.C0253d;
import p025L0.C0255f;
import p025L0.InterfaceC0254e;
import p034Q0.AbstractC0294k;
import p034Q0.C0292i;
import p034Q0.InterfaceC0288e;
import p039T0.C0335d;
import p045W0.C0361k;
import p045W0.InterfaceC0372v;
import p060c1.AbstractC0577a;
import p082l.C1135q;
import p121y0.AbstractC1687o;
import p123z.AbstractC1695c;

/* loaded from: classes.dex */
public class Chip extends C1135q implements InterfaceC0254e, InterfaceC0372v, Checkable {

    /* renamed from: B */
    public static final Rect f3450B = new Rect();

    /* renamed from: C */
    public static final int[] f3451C = {R.attr.state_selected};

    /* renamed from: D */
    public static final int[] f3452D = {R.attr.state_checkable};

    /* renamed from: A */
    public final C0251b f3453A;

    /* renamed from: j */
    public C0255f f3454j;

    /* renamed from: k */
    public InsetDrawable f3455k;

    /* renamed from: l */
    public RippleDrawable f3456l;

    /* renamed from: m */
    public View.OnClickListener f3457m;

    /* renamed from: n */
    public CompoundButton.OnCheckedChangeListener f3458n;

    /* renamed from: o */
    public boolean f3459o;

    /* renamed from: p */
    public boolean f3460p;

    /* renamed from: q */
    public boolean f3461q;

    /* renamed from: r */
    public boolean f3462r;

    /* renamed from: s */
    public boolean f3463s;

    /* renamed from: t */
    public int f3464t;

    /* renamed from: u */
    public int f3465u;

    /* renamed from: v */
    public CharSequence f3466v;

    /* renamed from: w */
    public final C0253d f3467w;

    /* renamed from: x */
    public boolean f3468x;

    /* renamed from: y */
    public final Rect f3469y;

    /* renamed from: z */
    public final RectF f3470z;

    public Chip(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, com.altaysoft.t500_split.R.attr.chipStyle);
        int resourceId;
        int resourceId2;
        int resourceId3;
        this.f3469y = new Rect();
        this.f3470z = new RectF();
        this.f3453A = new C0251b(0, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                throw new UnsupportedOperationException("Chip does not support multi-line text");
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        C0255f c0255f = new C0255f(context2, attributeSet);
        int[] iArr = AbstractC0051a.f169d;
        TypedArray m846g = AbstractC0294k.m846g(c0255f.f681j0, attributeSet, iArr, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        c0255f.f655J0 = m846g.hasValue(37);
        Context context3 = c0255f.f681j0;
        ColorStateList m255B = AbstractC0088l.m255B(context3, m846g, 24);
        if (c0255f.f640C != m255B) {
            c0255f.f640C = m255B;
            c0255f.onStateChange(c0255f.getState());
        }
        ColorStateList m255B2 = AbstractC0088l.m255B(context3, m846g, 11);
        if (c0255f.f642D != m255B2) {
            c0255f.f642D = m255B2;
            c0255f.onStateChange(c0255f.getState());
        }
        float dimension = m846g.getDimension(19, 0.0f);
        if (c0255f.f644E != dimension) {
            c0255f.f644E = dimension;
            c0255f.invalidateSelf();
            c0255f.m769v();
        }
        if (m846g.hasValue(12)) {
            c0255f.m745B(m846g.getDimension(12, 0.0f));
        }
        c0255f.m750G(AbstractC0088l.m255B(context3, m846g, 22));
        c0255f.m751H(m846g.getDimension(23, 0.0f));
        c0255f.m760Q(AbstractC0088l.m255B(context3, m846g, 36));
        String text = m846g.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(c0255f.f654J, text);
        C0292i c0292i = c0255f.f687p0;
        if (!equals) {
            c0255f.f654J = text;
            c0292i.f820e = true;
            c0255f.invalidateSelf();
            c0255f.m769v();
        }
        C0335d c0335d = (!m846g.hasValue(0) || (resourceId3 = m846g.getResourceId(0, 0)) == 0) ? null : new C0335d(context3, resourceId3);
        c0335d.f961k = m846g.getDimension(1, c0335d.f961k);
        c0292i.m839b(c0335d, context3);
        int i = m846g.getInt(3, 0);
        if (i == 1) {
            c0255f.f649G0 = TextUtils.TruncateAt.START;
        } else if (i == 2) {
            c0255f.f649G0 = TextUtils.TruncateAt.MIDDLE;
        } else if (i == 3) {
            c0255f.f649G0 = TextUtils.TruncateAt.END;
        }
        c0255f.m749F(m846g.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            c0255f.m749F(m846g.getBoolean(15, false));
        }
        c0255f.m746C(AbstractC0088l.m258E(context3, m846g, 14));
        if (m846g.hasValue(17)) {
            c0255f.m748E(AbstractC0088l.m255B(context3, m846g, 17));
        }
        c0255f.m747D(m846g.getDimension(16, -1.0f));
        c0255f.m757N(m846g.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            c0255f.m757N(m846g.getBoolean(26, false));
        }
        c0255f.m752I(AbstractC0088l.m258E(context3, m846g, 25));
        c0255f.m756M(AbstractC0088l.m255B(context3, m846g, 30));
        c0255f.m754K(m846g.getDimension(28, 0.0f));
        c0255f.m771x(m846g.getBoolean(6, false));
        c0255f.m744A(m846g.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            c0255f.m744A(m846g.getBoolean(8, false));
        }
        c0255f.m772y(AbstractC0088l.m258E(context3, m846g, 7));
        if (m846g.hasValue(9)) {
            c0255f.m773z(AbstractC0088l.m255B(context3, m846g, 9));
        }
        c0255f.f671Z = (!m846g.hasValue(39) || (resourceId2 = m846g.getResourceId(39, 0)) == 0) ? null : C0068b.m196a(context3, resourceId2);
        c0255f.f672a0 = (!m846g.hasValue(33) || (resourceId = m846g.getResourceId(33, 0)) == 0) ? null : C0068b.m196a(context3, resourceId);
        float dimension2 = m846g.getDimension(21, 0.0f);
        if (c0255f.f673b0 != dimension2) {
            c0255f.f673b0 = dimension2;
            c0255f.invalidateSelf();
            c0255f.m769v();
        }
        c0255f.m759P(m846g.getDimension(35, 0.0f));
        c0255f.m758O(m846g.getDimension(34, 0.0f));
        float dimension3 = m846g.getDimension(41, 0.0f);
        if (c0255f.f676e0 != dimension3) {
            c0255f.f676e0 = dimension3;
            c0255f.invalidateSelf();
            c0255f.m769v();
        }
        float dimension4 = m846g.getDimension(40, 0.0f);
        if (c0255f.f677f0 != dimension4) {
            c0255f.f677f0 = dimension4;
            c0255f.invalidateSelf();
            c0255f.m769v();
        }
        c0255f.m755L(m846g.getDimension(29, 0.0f));
        c0255f.m753J(m846g.getDimension(27, 0.0f));
        float dimension5 = m846g.getDimension(13, 0.0f);
        if (c0255f.f680i0 != dimension5) {
            c0255f.f680i0 = dimension5;
            c0255f.invalidateSelf();
            c0255f.m769v();
        }
        c0255f.f653I0 = m846g.getDimensionPixelSize(4, Integer.MAX_VALUE);
        m846g.recycle();
        AbstractC0294k.m840a(context2, attributeSet, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0294k.m841b(context2, attributeSet, iArr, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action);
        this.f3463s = obtainStyledAttributes.getBoolean(32, false);
        this.f3465u = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (float) Math.ceil(AbstractC0294k.m843d(getContext(), 48))));
        obtainStyledAttributes.recycle();
        setChipDrawable(c0255f);
        c0255f.m957j(AbstractC0158F.m428i(this));
        AbstractC0294k.m840a(context2, attributeSet, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action);
        AbstractC0294k.m841b(context2, attributeSet, iArr, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, com.altaysoft.t500_split.R.attr.chipStyle, com.altaysoft.t500_split.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.f3467w = new C0253d(this, this);
        m2069e();
        if (!hasValue) {
            setOutlineProvider(new C0252c(this));
        }
        setChecked(this.f3459o);
        setText(c0255f.f654J);
        setEllipsize(c0255f.f649G0);
        m2072h();
        if (!this.f3454j.f651H0) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        m2071g();
        if (this.f3463s) {
            setMinHeight(this.f3465u);
        }
        this.f3464t = getLayoutDirection();
        super.setOnCheckedChangeListener(new C0250a(0, this));
    }

    private RectF getCloseIconTouchBounds() {
        RectF rectF = this.f3470z;
        rectF.setEmpty();
        if (m2067c() && this.f3457m != null) {
            C0255f c0255f = this.f3454j;
            Rect bounds = c0255f.getBounds();
            rectF.setEmpty();
            if (c0255f.m763T()) {
                float f2 = c0255f.f680i0 + c0255f.f679h0 + c0255f.f665T + c0255f.f678g0 + c0255f.f677f0;
                if (AbstractC0071b.m208a(c0255f) == 0) {
                    float f3 = bounds.right;
                    rectF.right = f3;
                    rectF.left = f3 - f2;
                } else {
                    float f4 = bounds.left;
                    rectF.left = f4;
                    rectF.right = f4 + f2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.f3469y;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private C0335d getTextAppearance() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f687p0.f822g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f3461q != z2) {
            this.f3461q = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f3460p != z2) {
            this.f3460p = z2;
            refreshDrawableState();
        }
    }

    /* renamed from: b */
    public final void m2066b(int i) {
        this.f3465u = i;
        if (!this.f3463s) {
            InsetDrawable insetDrawable = this.f3455k;
            if (insetDrawable == null) {
                m2070f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f3455k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m2070f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.f3454j.f644E));
        int max2 = Math.max(0, i - this.f3454j.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f3455k;
            if (insetDrawable2 == null) {
                m2070f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f3455k = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    m2070f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f3455k != null) {
            Rect rect = new Rect();
            this.f3455k.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                m2070f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f3455k = new InsetDrawable((Drawable) this.f3454j, i2, i3, i2, i3);
        m2070f();
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0011 A[RETURN, SYNTHETIC] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m2067c() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            Object obj = c0255f.f662Q;
            if (obj != null) {
                if (obj instanceof InterfaceC0073d) {
                }
                if (obj == null) {
                    return true;
                }
            }
            obj = null;
            if (obj == null) {
            }
        }
        return false;
    }

    /* renamed from: d */
    public final boolean m2068d() {
        C0255f c0255f = this.f3454j;
        return c0255f != null && c0255f.f667V;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i;
        if (!this.f3468x) {
            return super.dispatchHoverEvent(motionEvent);
        }
        C0253d c0253d = this.f3467w;
        AccessibilityManager accessibilityManager = c0253d.f842h;
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7 || action == 9) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                Chip chip = c0253d.f635q;
                int i2 = (chip.m2067c() && chip.getCloseIconTouchBounds().contains(x2, y2)) ? 1 : 0;
                int i3 = c0253d.f847m;
                if (i3 != i2) {
                    c0253d.f847m = i2;
                    c0253d.m856q(i2, 128);
                    c0253d.m856q(i3, Function.MAX_NARGS);
                }
                if (i2 != Integer.MIN_VALUE) {
                    return true;
                }
            } else if (action == 10 && (i = c0253d.f847m) != Integer.MIN_VALUE) {
                if (i == Integer.MIN_VALUE) {
                    return true;
                }
                c0253d.f847m = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
                c0253d.m856q(i, Function.MAX_NARGS);
                return true;
            }
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f3468x) {
            return super.dispatchKeyEvent(keyEvent);
        }
        C0253d c0253d = this.f3467w;
        c0253d.getClass();
        boolean z2 = false;
        int i = 0;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        z2 = false;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                int i2 = 66;
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i2 = 33;
                                } else if (keyCode == 21) {
                                    i2 = 17;
                                } else if (keyCode != 22) {
                                    i2 = 130;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z3 = false;
                                while (i < repeatCount && c0253d.m853m(i2, null)) {
                                    i++;
                                    z3 = true;
                                }
                                z2 = z3;
                                break;
                            }
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = c0253d.f846l;
                    if (i3 != Integer.MIN_VALUE) {
                        Chip chip = c0253d.f635q;
                        if (i3 == 0) {
                            chip.performClick();
                        } else if (i3 == 1) {
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.f3457m;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                            }
                            if (chip.f3468x) {
                                chip.f3467w.m856q(1, 1);
                            }
                        }
                    }
                    z2 = true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                z2 = c0253d.m853m(2, null);
            } else if (keyEvent.hasModifiers(1)) {
                z2 = c0253d.m853m(1, null);
            }
        }
        if (!z2 || c0253d.f846l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // p082l.C1135q, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        int i;
        super.drawableStateChanged();
        C0255f c0255f = this.f3454j;
        boolean z2 = false;
        if (c0255f != null && C0255f.m743u(c0255f.f662Q)) {
            C0255f c0255f2 = this.f3454j;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.f3462r) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.f3461q) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.f3460p) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            } else {
                i = 0;
            }
            if (this.f3462r) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.f3461q) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.f3460p) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            if (!Arrays.equals(c0255f2.f643D0, iArr)) {
                c0255f2.f643D0 = iArr;
                if (c0255f2.m763T()) {
                    z2 = c0255f2.m770w(c0255f2.getState(), iArr);
                }
            }
        }
        if (z2) {
            invalidate();
        }
    }

    /* renamed from: e */
    public final void m2069e() {
        C0255f c0255f;
        if (!m2067c() || (c0255f = this.f3454j) == null || !c0255f.f661P || this.f3457m == null) {
            AbstractC0169Q.m505j(this, null);
            this.f3468x = false;
        } else {
            AbstractC0169Q.m505j(this, this.f3467w);
            this.f3468x = true;
        }
    }

    /* renamed from: f */
    public final void m2070f() {
        ColorStateList colorStateList = this.f3454j.f652I;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f3456l = new RippleDrawable(colorStateList, getBackgroundDrawable(), null);
        this.f3454j.getClass();
        RippleDrawable rippleDrawable = this.f3456l;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setBackground(rippleDrawable);
        m2071g();
    }

    /* renamed from: g */
    public final void m2071g() {
        C0255f c0255f;
        if (TextUtils.isEmpty(getText()) || (c0255f = this.f3454j) == null) {
            return;
        }
        int m767r = (int) (c0255f.m767r() + c0255f.f680i0 + c0255f.f677f0);
        C0255f c0255f2 = this.f3454j;
        int m766q = (int) (c0255f2.m766q() + c0255f2.f673b0 + c0255f2.f676e0);
        if (this.f3455k != null) {
            Rect rect = new Rect();
            this.f3455k.getPadding(rect);
            m766q += rect.left;
            m767r += rect.right;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setPaddingRelative(m766q, paddingTop, m767r, paddingBottom);
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.f3466v)) {
            return this.f3466v;
        }
        if (!m2068d()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f3455k;
        return insetDrawable == null ? this.f3454j : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f669X;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f670Y;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f642D;
        }
        return null;
    }

    public float getChipCornerRadius() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return Math.max(0.0f, c0255f.m768s());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f3454j;
    }

    public float getChipEndPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f680i0;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getChipIcon() {
        Drawable drawable;
        C0255f c0255f = this.f3454j;
        if (c0255f == null || (drawable = c0255f.f657L) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof InterfaceC0073d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public float getChipIconSize() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f659N;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f658M;
        }
        return null;
    }

    public float getChipMinHeight() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f644E;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f673b0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f648G;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f650H;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Drawable getCloseIcon() {
        Drawable drawable;
        C0255f c0255f = this.f3454j;
        if (c0255f == null || (drawable = c0255f.f662Q) == 0) {
            return null;
        }
        boolean z2 = drawable instanceof InterfaceC0073d;
        Drawable drawable2 = drawable;
        if (z2) {
            drawable2 = null;
        }
        return drawable2;
    }

    public CharSequence getCloseIconContentDescription() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f666U;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f679h0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f665T;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f678g0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f664S;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f649G0;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.f3468x) {
            C0253d c0253d = this.f3467w;
            if (c0253d.f846l == 1 || c0253d.f845k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public C0068b getHideMotionSpec() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f672a0;
        }
        return null;
    }

    public float getIconEndPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f675d0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f674c0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f652I;
        }
        return null;
    }

    public C0361k getShapeAppearanceModel() {
        return this.f3454j.f1026f.f1008a;
    }

    public C0068b getShowMotionSpec() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f671Z;
        }
        return null;
    }

    public float getTextEndPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f677f0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            return c0255f.f676e0;
        }
        return 0.0f;
    }

    /* renamed from: h */
    public final void m2072h() {
        TextPaint paint = getPaint();
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            paint.drawableState = c0255f.getState();
        }
        C0335d textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.m933e(getContext(), paint, this.f3453A);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AbstractC1687o.m4929X(this, this.f3454j);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, f3451C);
        }
        if (m2068d()) {
            View.mergeDrawableStates(onCreateDrawableState, f3452D);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.f3468x) {
            C0253d c0253d = this.f3467w;
            int i2 = c0253d.f846l;
            if (i2 != Integer.MIN_VALUE) {
                c0253d.m851j(i2);
            }
            if (z2) {
                c0253d.m853m(i, rect);
            }
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(m2068d());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.f3464t != i) {
            this.f3464t = i;
            m2071g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f3460p) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.f3460p) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.f3457m;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.f3468x) {
                    this.f3467w.m856q(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.f3466v = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3456l) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // p082l.C1135q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.f3456l) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // p082l.C1135q, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m771x(z2);
        }
    }

    public void setCheckableResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m771x(c0255f.f681j0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null) {
            this.f3459o = z2;
        } else if (c0255f.f667V) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m772y(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m772y(AbstractC0088l.m257D(c0255f.f681j0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m773z(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m773z(AbstractC1695c.m4959b(c0255f.f681j0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m744A(c0255f.f681j0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f642D == colorStateList) {
            return;
        }
        c0255f.f642D = colorStateList;
        c0255f.onStateChange(c0255f.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList m4959b;
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f642D == (m4959b = AbstractC1695c.m4959b(c0255f.f681j0, i))) {
            return;
        }
        c0255f.f642D = m4959b;
        c0255f.onStateChange(c0255f.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m745B(f2);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m745B(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(C0255f c0255f) {
        C0255f c0255f2 = this.f3454j;
        if (c0255f2 != c0255f) {
            if (c0255f2 != null) {
                c0255f2.f647F0 = new WeakReference(null);
            }
            this.f3454j = c0255f;
            c0255f.f651H0 = false;
            c0255f.f647F0 = new WeakReference(this);
            m2066b(this.f3465u);
        }
    }

    public void setChipEndPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f680i0 == f2) {
            return;
        }
        c0255f.f680i0 = f2;
        c0255f.invalidateSelf();
        c0255f.m769v();
    }

    public void setChipEndPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            float dimension = c0255f.f681j0.getResources().getDimension(i);
            if (c0255f.f680i0 != dimension) {
                c0255f.f680i0 = dimension;
                c0255f.invalidateSelf();
                c0255f.m769v();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m746C(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m746C(AbstractC0088l.m257D(c0255f.f681j0, i));
        }
    }

    public void setChipIconSize(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m747D(f2);
        }
    }

    public void setChipIconSizeResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m747D(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m748E(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m748E(AbstractC1695c.m4959b(c0255f.f681j0, i));
        }
    }

    public void setChipIconVisible(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m749F(c0255f.f681j0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f644E == f2) {
            return;
        }
        c0255f.f644E = f2;
        c0255f.invalidateSelf();
        c0255f.m769v();
    }

    public void setChipMinHeightResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            float dimension = c0255f.f681j0.getResources().getDimension(i);
            if (c0255f.f644E != dimension) {
                c0255f.f644E = dimension;
                c0255f.invalidateSelf();
                c0255f.m769v();
            }
        }
    }

    public void setChipStartPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f673b0 == f2) {
            return;
        }
        c0255f.f673b0 = f2;
        c0255f.invalidateSelf();
        c0255f.m769v();
    }

    public void setChipStartPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            float dimension = c0255f.f681j0.getResources().getDimension(i);
            if (c0255f.f673b0 != dimension) {
                c0255f.f673b0 = dimension;
                c0255f.invalidateSelf();
                c0255f.m769v();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m750G(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m750G(AbstractC1695c.m4959b(c0255f.f681j0, i));
        }
    }

    public void setChipStrokeWidth(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m751H(f2);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m751H(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m752I(drawable);
        }
        m2069e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f666U == charSequence) {
            return;
        }
        String str = C0131b.f406b;
        C0131b c0131b = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? C0131b.f409e : C0131b.f408d;
        c0131b.getClass();
        C0125d c0125d = AbstractC0136g.f416a;
        c0255f.f666U = c0131b.m389c(charSequence);
        c0255f.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m753J(f2);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m753J(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m752I(AbstractC0088l.m257D(c0255f.f681j0, i));
        }
        m2069e();
    }

    public void setCloseIconSize(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m754K(f2);
        }
    }

    public void setCloseIconSizeResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m754K(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m755L(f2);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m755L(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m756M(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m756M(AbstractC1695c.m4959b(c0255f.f681j0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // p082l.C1135q, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // p082l.C1135q, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i3 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m957j(f2);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f3454j == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f649G0 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.f3463s = z2;
        m2066b(this.f3465u);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(C0068b c0068b) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f672a0 = c0068b;
        }
    }

    public void setHideMotionSpecResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f672a0 = C0068b.m196a(c0255f.f681j0, i);
        }
    }

    public void setIconEndPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m758O(f2);
        }
    }

    public void setIconEndPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m758O(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m759P(f2);
        }
    }

    public void setIconStartPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m759P(c0255f.f681j0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(InterfaceC0288e interfaceC0288e) {
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.f3454j == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i);
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f653I0 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f3458n = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f3457m = onClickListener;
        m2069e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m760Q(colorStateList);
        }
        this.f3454j.getClass();
        m2070f();
    }

    public void setRippleColorResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m760Q(AbstractC1695c.m4959b(c0255f.f681j0, i));
            this.f3454j.getClass();
            m2070f();
        }
    }

    @Override // p045W0.InterfaceC0372v
    public void setShapeAppearanceModel(C0361k c0361k) {
        this.f3454j.setShapeAppearanceModel(c0361k);
    }

    public void setShowMotionSpec(C0068b c0068b) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f671Z = c0068b;
        }
    }

    public void setShowMotionSpecResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f671Z = C0068b.m196a(c0255f.f681j0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(c0255f.f651H0 ? null : charSequence, bufferType);
        C0255f c0255f2 = this.f3454j;
        if (c0255f2 == null || TextUtils.equals(c0255f2.f654J, charSequence)) {
            return;
        }
        c0255f2.f654J = charSequence;
        c0255f2.f687p0.f820e = true;
        c0255f2.invalidateSelf();
        c0255f2.m769v();
    }

    public void setTextAppearance(C0335d c0335d) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.f687p0.m839b(c0335d, c0255f.f681j0);
        }
        m2072h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f677f0 == f2) {
            return;
        }
        c0255f.f677f0 = f2;
        c0255f.invalidateSelf();
        c0255f.m769v();
    }

    public void setTextEndPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            float dimension = c0255f.f681j0.getResources().getDimension(i);
            if (c0255f.f677f0 != dimension) {
                c0255f.f677f0 = dimension;
                c0255f.invalidateSelf();
                c0255f.m769v();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        super.setTextSize(i, f2);
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            float applyDimension = TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics());
            C0292i c0292i = c0255f.f687p0;
            C0335d c0335d = c0292i.f822g;
            if (c0335d != null) {
                c0335d.f961k = applyDimension;
                c0292i.f816a.setTextSize(applyDimension);
                c0255f.mo327a();
            }
        }
        m2072h();
    }

    public void setTextStartPadding(float f2) {
        C0255f c0255f = this.f3454j;
        if (c0255f == null || c0255f.f676e0 == f2) {
            return;
        }
        c0255f.f676e0 = f2;
        c0255f.invalidateSelf();
        c0255f.m769v();
    }

    public void setTextStartPaddingResource(int i) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            float dimension = c0255f.f681j0.getResources().getDimension(i);
            if (c0255f.f676e0 != dimension) {
                c0255f.f676e0 = dimension;
                c0255f.invalidateSelf();
                c0255f.m769v();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m757N(z2);
        }
        m2069e();
    }

    public void setCheckedIconVisible(boolean z2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m744A(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            c0255f.m749F(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            Context context2 = c0255f.f681j0;
            c0255f.f687p0.m839b(new C0335d(context2, i), context2);
        }
        m2072h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        C0255f c0255f = this.f3454j;
        if (c0255f != null) {
            Context context = c0255f.f681j0;
            c0255f.f687p0.m839b(new C0335d(context, i), context);
        }
        m2072h();
    }
}
