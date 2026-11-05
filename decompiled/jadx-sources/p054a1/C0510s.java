package p054a1;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p007C0.AbstractC0067a;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p082l.C1096Y;
import p121y0.AbstractC1680h;

/* renamed from: a1.s */
/* loaded from: classes.dex */
public final class C0510s {

    /* renamed from: A */
    public ColorStateList f1623A;

    /* renamed from: B */
    public Typeface f1624B;

    /* renamed from: a */
    public final int f1625a;

    /* renamed from: b */
    public final int f1626b;

    /* renamed from: c */
    public final int f1627c;

    /* renamed from: d */
    public final TimeInterpolator f1628d;

    /* renamed from: e */
    public final TimeInterpolator f1629e;

    /* renamed from: f */
    public final TimeInterpolator f1630f;

    /* renamed from: g */
    public final Context f1631g;

    /* renamed from: h */
    public final TextInputLayout f1632h;

    /* renamed from: i */
    public LinearLayout f1633i;

    /* renamed from: j */
    public int f1634j;

    /* renamed from: k */
    public FrameLayout f1635k;

    /* renamed from: l */
    public AnimatorSet f1636l;

    /* renamed from: m */
    public final float f1637m;

    /* renamed from: n */
    public int f1638n;

    /* renamed from: o */
    public int f1639o;

    /* renamed from: p */
    public CharSequence f1640p;

    /* renamed from: q */
    public boolean f1641q;

    /* renamed from: r */
    public C1096Y f1642r;

    /* renamed from: s */
    public CharSequence f1643s;

    /* renamed from: t */
    public int f1644t;

    /* renamed from: u */
    public int f1645u;

    /* renamed from: v */
    public ColorStateList f1646v;

    /* renamed from: w */
    public CharSequence f1647w;

    /* renamed from: x */
    public boolean f1648x;

    /* renamed from: y */
    public C1096Y f1649y;

    /* renamed from: z */
    public int f1650z;

    public C0510s(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.f1631g = context;
        this.f1632h = textInputLayout;
        this.f1637m = context.getResources().getDimensionPixelSize(R.dimen.design_textinput_caption_translate_y);
        this.f1625a = AbstractC1680h.m4851M(context, R.attr.motionDurationShort4, 217);
        this.f1626b = AbstractC1680h.m4851M(context, R.attr.motionDurationMedium4, 167);
        this.f1627c = AbstractC1680h.m4851M(context, R.attr.motionDurationShort4, 167);
        this.f1628d = AbstractC1680h.m4852N(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, AbstractC0067a.f227d);
        LinearInterpolator linearInterpolator = AbstractC0067a.f224a;
        this.f1629e = AbstractC1680h.m4852N(context, R.attr.motionEasingEmphasizedDecelerateInterpolator, linearInterpolator);
        this.f1630f = AbstractC1680h.m4852N(context, R.attr.motionEasingLinearInterpolator, linearInterpolator);
    }

    /* renamed from: a */
    public final void m1239a(C1096Y c1096y, int i) {
        if (this.f1633i == null && this.f1635k == null) {
            Context context = this.f1631g;
            LinearLayout linearLayout = new LinearLayout(context);
            this.f1633i = linearLayout;
            linearLayout.setOrientation(0);
            LinearLayout linearLayout2 = this.f1633i;
            TextInputLayout textInputLayout = this.f1632h;
            textInputLayout.addView(linearLayout2, -1, -2);
            this.f1635k = new FrameLayout(context);
            this.f1633i.addView(this.f1635k, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (textInputLayout.getEditText() != null) {
                m1240b();
            }
        }
        if (i == 0 || i == 1) {
            this.f1635k.setVisibility(0);
            this.f1635k.addView(c1096y);
        } else {
            this.f1633i.addView(c1096y, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f1633i.setVisibility(0);
        this.f1634j++;
    }

    /* renamed from: b */
    public final void m1240b() {
        if (this.f1633i != null) {
            TextInputLayout textInputLayout = this.f1632h;
            if (textInputLayout.getEditText() != null) {
                EditText editText = textInputLayout.getEditText();
                Context context = this.f1631g;
                boolean m260S = AbstractC0088l.m260S(context);
                LinearLayout linearLayout = this.f1633i;
                WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                int paddingStart = editText.getPaddingStart();
                if (m260S) {
                    paddingStart = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_default_padding_top);
                if (m260S) {
                    dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_top);
                }
                int paddingEnd = editText.getPaddingEnd();
                if (m260S) {
                    paddingEnd = context.getResources().getDimensionPixelSize(R.dimen.material_helper_text_font_1_3_padding_horizontal);
                }
                linearLayout.setPaddingRelative(paddingStart, dimensionPixelSize, paddingEnd, 0);
            }
        }
    }

    /* renamed from: c */
    public final void m1241c() {
        AnimatorSet animatorSet = this.f1636l;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
    }

    /* renamed from: d */
    public final void m1242d(ArrayList arrayList, boolean z2, C1096Y c1096y, int i, int i2, int i3) {
        if (c1096y == null || !z2) {
            return;
        }
        if (i == i3 || i == i2) {
            boolean z3 = i3 == i;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1096y, (Property<C1096Y, Float>) View.ALPHA, z3 ? 1.0f : 0.0f);
            int i4 = this.f1627c;
            ofFloat.setDuration(z3 ? this.f1626b : i4);
            ofFloat.setInterpolator(z3 ? this.f1629e : this.f1630f);
            if (i == i3 && i2 != 0) {
                ofFloat.setStartDelay(i4);
            }
            arrayList.add(ofFloat);
            if (i3 != i || i2 == 0) {
                return;
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(c1096y, (Property<C1096Y, Float>) View.TRANSLATION_Y, -this.f1637m, 0.0f);
            ofFloat2.setDuration(this.f1625a);
            ofFloat2.setInterpolator(this.f1628d);
            ofFloat2.setStartDelay(i4);
            arrayList.add(ofFloat2);
        }
    }

    /* renamed from: e */
    public final TextView m1243e(int i) {
        if (i == 1) {
            return this.f1642r;
        }
        if (i != 2) {
            return null;
        }
        return this.f1649y;
    }

    /* renamed from: f */
    public final void m1244f() {
        this.f1640p = null;
        m1241c();
        if (this.f1638n == 1) {
            if (!this.f1648x || TextUtils.isEmpty(this.f1647w)) {
                this.f1639o = 0;
            } else {
                this.f1639o = 2;
            }
        }
        m1247i(this.f1638n, m1246h(this.f1642r, ""), this.f1639o);
    }

    /* renamed from: g */
    public final void m1245g(C1096Y c1096y, int i) {
        FrameLayout frameLayout;
        LinearLayout linearLayout = this.f1633i;
        if (linearLayout == null) {
            return;
        }
        if ((i == 0 || i == 1) && (frameLayout = this.f1635k) != null) {
            frameLayout.removeView(c1096y);
        } else {
            linearLayout.removeView(c1096y);
        }
        int i2 = this.f1634j - 1;
        this.f1634j = i2;
        LinearLayout linearLayout2 = this.f1633i;
        if (i2 == 0) {
            linearLayout2.setVisibility(8);
        }
    }

    /* renamed from: h */
    public final boolean m1246h(C1096Y c1096y, CharSequence charSequence) {
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        TextInputLayout textInputLayout = this.f1632h;
        return textInputLayout.isLaidOut() && textInputLayout.isEnabled() && !(this.f1639o == this.f1638n && c1096y != null && TextUtils.equals(c1096y.getText(), charSequence));
    }

    /* renamed from: i */
    public final void m1247i(int i, boolean z2, int i2) {
        TextView m1243e;
        TextView m1243e2;
        if (i == i2) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f1636l = animatorSet;
            ArrayList arrayList = new ArrayList();
            m1242d(arrayList, this.f1648x, this.f1649y, 2, i, i2);
            m1242d(arrayList, this.f1641q, this.f1642r, 1, i, i2);
            int size = arrayList.size();
            long j2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Animator animator = (Animator) arrayList.get(i3);
                j2 = Math.max(j2, animator.getDuration() + animator.getStartDelay());
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
            ofInt.setDuration(j2);
            arrayList.add(0, ofInt);
            animatorSet.playTogether(arrayList);
            animatorSet.addListener(new C0508q(this, i2, m1243e(i), i, m1243e(i2)));
            animatorSet.start();
        } else if (i != i2) {
            if (i2 != 0 && (m1243e2 = m1243e(i2)) != null) {
                m1243e2.setVisibility(0);
                m1243e2.setAlpha(1.0f);
            }
            if (i != 0 && (m1243e = m1243e(i)) != null) {
                m1243e.setVisibility(4);
                if (i == 1) {
                    m1243e.setText((CharSequence) null);
                }
            }
            this.f1638n = i2;
        }
        TextInputLayout textInputLayout = this.f1632h;
        textInputLayout.m2129r();
        textInputLayout.m2132u(z2, false);
        textInputLayout.m2135x();
    }
}
