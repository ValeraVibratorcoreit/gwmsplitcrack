package p054a1;

import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.EditText;
import com.altaysoft.t500_split.R;
import com.google.android.material.internal.CheckableImageButton;
import p001A0.RunnableC0024r;
import p007C0.AbstractC0067a;
import p121y0.AbstractC1680h;

/* renamed from: a1.e */
/* loaded from: classes.dex */
public final class C0496e extends AbstractC0507p {

    /* renamed from: e */
    public final int f1555e;

    /* renamed from: f */
    public final int f1556f;

    /* renamed from: g */
    public final TimeInterpolator f1557g;

    /* renamed from: h */
    public final TimeInterpolator f1558h;

    /* renamed from: i */
    public EditText f1559i;

    /* renamed from: j */
    public final ViewOnClickListenerC0492a f1560j;

    /* renamed from: k */
    public final ViewOnFocusChangeListenerC0493b f1561k;

    /* renamed from: l */
    public AnimatorSet f1562l;

    /* renamed from: m */
    public ValueAnimator f1563m;

    public C0496e(C0506o c0506o) {
        super(c0506o);
        this.f1560j = new ViewOnClickListenerC0492a(0, this);
        this.f1561k = new ViewOnFocusChangeListenerC0493b(this, 0);
        this.f1555e = AbstractC1680h.m4851M(c0506o.getContext(), R.attr.motionDurationShort3, 100);
        this.f1556f = AbstractC1680h.m4851M(c0506o.getContext(), R.attr.motionDurationShort3, 150);
        this.f1557g = AbstractC1680h.m4852N(c0506o.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0067a.f224a);
        this.f1558h = AbstractC1680h.m4852N(c0506o.getContext(), R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f227d);
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: a */
    public final void mo1200a() {
        if (this.f1614b.f1607u != null) {
            return;
        }
        m1210t(m1211u());
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: c */
    public final int mo1201c() {
        return R.string.clear_text_end_icon_content_description;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: d */
    public final int mo1202d() {
        return R.drawable.mtrl_ic_cancel;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1203e() {
        return this.f1561k;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: f */
    public final View.OnClickListener mo1204f() {
        return this.f1560j;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: g */
    public final View.OnFocusChangeListener mo1205g() {
        return this.f1561k;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: m */
    public final void mo1206m(EditText editText) {
        this.f1559i = editText;
        this.f1613a.setEndIconVisible(m1211u());
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: p */
    public final void mo1207p(boolean z2) {
        if (this.f1614b.f1607u == null) {
            return;
        }
        m1210t(z2);
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: r */
    public final void mo1208r() {
        final int i = 1;
        final int i2 = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        ofFloat.setInterpolator(this.f1558h);
        ofFloat.setDuration(this.f1556f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a1.c

            /* renamed from: b */
            public final /* synthetic */ C0496e f1552b;

            {
                this.f1552b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i) {
                    case 0:
                        C0496e c0496e = this.f1552b;
                        c0496e.getClass();
                        c0496e.f1616d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0496e c0496e2 = this.f1552b;
                        c0496e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0496e2.f1616d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1557g;
        ofFloat2.setInterpolator(timeInterpolator);
        int i3 = this.f1555e;
        ofFloat2.setDuration(i3);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a1.c

            /* renamed from: b */
            public final /* synthetic */ C0496e f1552b;

            {
                this.f1552b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0496e c0496e = this.f1552b;
                        c0496e.getClass();
                        c0496e.f1616d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0496e c0496e2 = this.f1552b;
                        c0496e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0496e2.f1616d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        AnimatorSet animatorSet = new AnimatorSet();
        this.f1562l = animatorSet;
        animatorSet.playTogether(ofFloat, ofFloat2);
        this.f1562l.addListener(new C0495d(this, i2));
        ValueAnimator ofFloat3 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat3.setInterpolator(timeInterpolator);
        ofFloat3.setDuration(i3);
        ofFloat3.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) { // from class: a1.c

            /* renamed from: b */
            public final /* synthetic */ C0496e f1552b;

            {
                this.f1552b = this;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (i2) {
                    case 0:
                        C0496e c0496e = this.f1552b;
                        c0496e.getClass();
                        c0496e.f1616d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                        break;
                    default:
                        C0496e c0496e2 = this.f1552b;
                        c0496e2.getClass();
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        CheckableImageButton checkableImageButton = c0496e2.f1616d;
                        checkableImageButton.setScaleX(floatValue);
                        checkableImageButton.setScaleY(floatValue);
                        break;
                }
            }
        });
        this.f1563m = ofFloat3;
        ofFloat3.addListener(new C0495d(this, i));
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: s */
    public final void mo1209s() {
        EditText editText = this.f1559i;
        if (editText != null) {
            editText.post(new RunnableC0024r(7, this));
        }
    }

    /* renamed from: t */
    public final void m1210t(boolean z2) {
        boolean z3 = this.f1614b.m1225d() == z2;
        if (z2 && !this.f1562l.isRunning()) {
            this.f1563m.cancel();
            this.f1562l.start();
            if (z3) {
                this.f1562l.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.f1562l.cancel();
        this.f1563m.start();
        if (z3) {
            this.f1563m.end();
        }
    }

    /* renamed from: u */
    public final boolean m1211u() {
        EditText editText = this.f1559i;
        return editText != null && (editText.hasFocus() || this.f1616d.hasFocus()) && this.f1559i.getText().length() > 0;
    }
}
