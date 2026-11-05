package p054a1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.altaysoft.t500_split.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p006C.AbstractC0062j;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p024L.AccessibilityManagerTouchExplorationStateChangeListenerC0232b;
import p031P.C0264b;
import p034Q0.AbstractC0294k;
import p046X.ViewOnAttachStateChangeListenerC0393V;
import p082l.C1096Y;

/* renamed from: a1.o */
/* loaded from: classes.dex */
public final class C0506o extends LinearLayout {

    /* renamed from: A */
    public final C0503l f1591A;

    /* renamed from: f */
    public final TextInputLayout f1592f;

    /* renamed from: g */
    public final FrameLayout f1593g;

    /* renamed from: h */
    public final CheckableImageButton f1594h;

    /* renamed from: i */
    public ColorStateList f1595i;

    /* renamed from: j */
    public PorterDuff.Mode f1596j;

    /* renamed from: k */
    public View.OnLongClickListener f1597k;

    /* renamed from: l */
    public final CheckableImageButton f1598l;

    /* renamed from: m */
    public final C0505n f1599m;

    /* renamed from: n */
    public int f1600n;

    /* renamed from: o */
    public final LinkedHashSet f1601o;

    /* renamed from: p */
    public ColorStateList f1602p;

    /* renamed from: q */
    public PorterDuff.Mode f1603q;

    /* renamed from: r */
    public int f1604r;

    /* renamed from: s */
    public ImageView.ScaleType f1605s;

    /* renamed from: t */
    public View.OnLongClickListener f1606t;

    /* renamed from: u */
    public CharSequence f1607u;

    /* renamed from: v */
    public final C1096Y f1608v;

    /* renamed from: w */
    public boolean f1609w;

    /* renamed from: x */
    public EditText f1610x;

    /* renamed from: y */
    public final AccessibilityManager f1611y;

    /* renamed from: z */
    public C0264b f1612z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0506o(TextInputLayout textInputLayout, C0198k c0198k) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 1;
        this.f1600n = 0;
        this.f1601o = new LinkedHashSet();
        this.f1591A = new C0503l(this);
        C0504m c0504m = new C0504m(this);
        this.f1611y = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1592f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1593g = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton m1222a = m1222a(this, from, R.id.text_input_error_icon);
        this.f1594h = m1222a;
        CheckableImageButton m1222a2 = m1222a(frameLayout, from, R.id.text_input_end_icon);
        this.f1598l = m1222a2;
        this.f1599m = new C0505n(this, c0198k);
        C1096Y c1096y = new C1096Y(getContext(), null);
        this.f1608v = c1096y;
        TypedArray typedArray = (TypedArray) c0198k.f534c;
        if (typedArray.hasValue(38)) {
            this.f1595i = AbstractC0088l.m254A(getContext(), c0198k, 38);
        }
        if (typedArray.hasValue(39)) {
            this.f1596j = AbstractC0294k.m847h(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            m1230i(c0198k.m598h(37));
        }
        m1222a.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        m1222a.setImportantForAccessibility(2);
        m1222a.setClickable(false);
        m1222a.setPressable(false);
        m1222a.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1602p = AbstractC0088l.m254A(getContext(), c0198k, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1603q = AbstractC0294k.m847h(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            m1228g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && m1222a2.getContentDescription() != (text = typedArray.getText(27))) {
                m1222a2.setContentDescription(text);
            }
            m1222a2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f1602p = AbstractC0088l.m254A(getContext(), c0198k, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1603q = AbstractC0294k.m847h(typedArray.getInt(55, -1), null);
            }
            m1228g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (m1222a2.getContentDescription() != text2) {
                m1222a2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1604r) {
            this.f1604r = dimensionPixelSize;
            m1222a2.setMinimumWidth(dimensionPixelSize);
            m1222a2.setMinimumHeight(dimensionPixelSize);
            m1222a.setMinimumWidth(dimensionPixelSize);
            m1222a.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType m281t = AbstractC0088l.m281t(typedArray.getInt(31, -1));
            this.f1605s = m281t;
            m1222a2.setScaleType(m281t);
            m1222a.setScaleType(m281t);
        }
        c1096y.setVisibility(8);
        c1096y.setId(R.id.textinput_suffix_text);
        c1096y.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c1096y.setAccessibilityLiveRegion(1);
        c1096y.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c1096y.setTextColor(c0198k.m597g(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1607u = TextUtils.isEmpty(text3) ? null : text3;
        c1096y.setText(text3);
        m1235n();
        frameLayout.addView(m1222a2);
        addView(c1096y);
        addView(frameLayout);
        addView(m1222a);
        textInputLayout.f3690j0.add(c0504m);
        if (textInputLayout.f3687i != null) {
            c0504m.m1221a(textInputLayout);
        }
        addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0393V(i, this));
    }

    /* renamed from: a */
    public final CheckableImageButton m1222a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0088l.m260S(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    /* renamed from: b */
    public final AbstractC0507p m1223b() {
        AbstractC0507p c0497f;
        int i = this.f1600n;
        C0505n c0505n = this.f1599m;
        SparseArray sparseArray = c0505n.f1587a;
        AbstractC0507p abstractC0507p = (AbstractC0507p) sparseArray.get(i);
        if (abstractC0507p == null) {
            C0506o c0506o = c0505n.f1588b;
            if (i == -1) {
                c0497f = new C0497f(c0506o, 0);
            } else if (i == 0) {
                c0497f = new C0497f(c0506o, 1);
            } else if (i == 1) {
                abstractC0507p = new C0514w(c0506o, c0505n.f1590d);
                sparseArray.append(i, abstractC0507p);
            } else if (i == 2) {
                c0497f = new C0496e(c0506o);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Invalid end icon mode: "));
                }
                c0497f = new C0502k(c0506o);
            }
            abstractC0507p = c0497f;
            sparseArray.append(i, abstractC0507p);
        }
        return abstractC0507p;
    }

    /* renamed from: c */
    public final int m1224c() {
        int marginStart;
        if (m1225d() || m1226e()) {
            CheckableImageButton checkableImageButton = this.f1598l;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return this.f1608v.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    /* renamed from: d */
    public final boolean m1225d() {
        return this.f1593g.getVisibility() == 0 && this.f1598l.getVisibility() == 0;
    }

    /* renamed from: e */
    public final boolean m1226e() {
        return this.f1594h.getVisibility() == 0;
    }

    /* renamed from: f */
    public final void m1227f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        AbstractC0507p m1223b = m1223b();
        boolean mo1237k = m1223b.mo1237k();
        CheckableImageButton checkableImageButton = this.f1598l;
        boolean z5 = true;
        if (!mo1237k || (z4 = checkableImageButton.f3560i) == m1223b.mo1216l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(m1223b instanceof C0502k) || (isActivated = checkableImageButton.isActivated()) == m1223b.mo1215j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            AbstractC0088l.m273i0(this.f1592f, checkableImageButton, this.f1602p);
        }
    }

    /* renamed from: g */
    public final void m1228g(int i) {
        if (this.f1600n == i) {
            return;
        }
        AbstractC0507p m1223b = m1223b();
        C0264b c0264b = this.f1612z;
        AccessibilityManager accessibilityManager = this.f1611y;
        if (c0264b != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0232b(c0264b));
        }
        this.f1612z = null;
        m1223b.mo1209s();
        this.f1600n = i;
        Iterator it = this.f1601o.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        m1229h(i != 0);
        AbstractC0507p m1223b2 = m1223b();
        int i2 = this.f1599m.f1589c;
        if (i2 == 0) {
            i2 = m1223b2.mo1202d();
        }
        Drawable m257D = i2 != 0 ? AbstractC0088l.m257D(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f1598l;
        checkableImageButton.setImageDrawable(m257D);
        TextInputLayout textInputLayout = this.f1592f;
        if (m257D != null) {
            AbstractC0088l.m268f(textInputLayout, checkableImageButton, this.f1602p, this.f1603q);
            AbstractC0088l.m273i0(textInputLayout, checkableImageButton, this.f1602p);
        }
        int mo1201c = m1223b2.mo1201c();
        CharSequence text = mo1201c != 0 ? getResources().getText(mo1201c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(m1223b2.mo1237k());
        if (!m1223b2.mo1214i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        m1223b2.mo1208r();
        C0264b mo1213h = m1223b2.mo1213h();
        this.f1612z = mo1213h;
        if (mo1213h != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new AccessibilityManagerTouchExplorationStateChangeListenerC0232b(this.f1612z));
            }
        }
        View.OnClickListener mo1204f = m1223b2.mo1204f();
        View.OnLongClickListener onLongClickListener = this.f1606t;
        checkableImageButton.setOnClickListener(mo1204f);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
        EditText editText = this.f1610x;
        if (editText != null) {
            m1223b2.mo1206m(editText);
            m1231j(m1223b2);
        }
        AbstractC0088l.m268f(textInputLayout, checkableImageButton, this.f1602p, this.f1603q);
        m1227f(true);
    }

    /* renamed from: h */
    public final void m1229h(boolean z2) {
        if (m1225d() != z2) {
            this.f1598l.setVisibility(z2 ? 0 : 8);
            m1232k();
            m1234m();
            this.f1592f.m2128q();
        }
    }

    /* renamed from: i */
    public final void m1230i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1594h;
        checkableImageButton.setImageDrawable(drawable);
        m1233l();
        AbstractC0088l.m268f(this.f1592f, checkableImageButton, this.f1595i, this.f1596j);
    }

    /* renamed from: j */
    public final void m1231j(AbstractC0507p abstractC0507p) {
        if (this.f1610x == null) {
            return;
        }
        if (abstractC0507p.mo1203e() != null) {
            this.f1610x.setOnFocusChangeListener(abstractC0507p.mo1203e());
        }
        if (abstractC0507p.mo1205g() != null) {
            this.f1598l.setOnFocusChangeListener(abstractC0507p.mo1205g());
        }
    }

    /* renamed from: k */
    public final void m1232k() {
        this.f1593g.setVisibility((this.f1598l.getVisibility() != 0 || m1226e()) ? 8 : 0);
        setVisibility((m1225d() || m1226e() || !((this.f1607u == null || this.f1609w) ? 8 : false)) ? 0 : 8);
    }

    /* renamed from: l */
    public final void m1233l() {
        CheckableImageButton checkableImageButton = this.f1594h;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1592f;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f3699o.f1641q && textInputLayout.m2124m()) ? 0 : 8);
        m1232k();
        m1234m();
        if (this.f1600n != 0) {
            return;
        }
        textInputLayout.m2128q();
    }

    /* renamed from: m */
    public final void m1234m() {
        int i;
        TextInputLayout textInputLayout = this.f1592f;
        if (textInputLayout.f3687i == null) {
            return;
        }
        if (m1225d() || m1226e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f3687i;
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f3687i.getPaddingTop();
        int paddingBottom = textInputLayout.f3687i.getPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
        this.f1608v.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    /* renamed from: n */
    public final void m1235n() {
        C1096Y c1096y = this.f1608v;
        int visibility = c1096y.getVisibility();
        int i = (this.f1607u == null || this.f1609w) ? 8 : 0;
        if (visibility != i) {
            m1223b().mo1207p(i == 0);
        }
        m1232k();
        c1096y.setVisibility(i);
        this.f1592f.m2128q();
    }
}
