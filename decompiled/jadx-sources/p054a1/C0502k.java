package p054a1;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.altaysoft.t500_split.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p001A0.RunnableC0024r;
import p007C0.AbstractC0067a;
import p013F0.C0097a;
import p022K.AbstractC0169Q;
import p022K.C0174W;
import p024L.C0240j;
import p031P.C0264b;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: a1.k */
/* loaded from: classes.dex */
public final class C0502k extends AbstractC0507p {

    /* renamed from: e */
    public final int f1571e;

    /* renamed from: f */
    public final int f1572f;

    /* renamed from: g */
    public final TimeInterpolator f1573g;

    /* renamed from: h */
    public AutoCompleteTextView f1574h;

    /* renamed from: i */
    public final ViewOnClickListenerC0492a f1575i;

    /* renamed from: j */
    public final ViewOnFocusChangeListenerC0493b f1576j;

    /* renamed from: k */
    public final C0264b f1577k;

    /* renamed from: l */
    public boolean f1578l;

    /* renamed from: m */
    public boolean f1579m;

    /* renamed from: n */
    public boolean f1580n;

    /* renamed from: o */
    public long f1581o;

    /* renamed from: p */
    public AccessibilityManager f1582p;

    /* renamed from: q */
    public ValueAnimator f1583q;

    /* renamed from: r */
    public ValueAnimator f1584r;

    public C0502k(C0506o c0506o) {
        super(c0506o);
        int i = 1;
        this.f1575i = new ViewOnClickListenerC0492a(i, this);
        this.f1576j = new ViewOnFocusChangeListenerC0493b(this, i);
        this.f1577k = new C0264b(this);
        this.f1581o = Long.MAX_VALUE;
        this.f1572f = AbstractC1680h.m4851M(c0506o.getContext(), R.attr.motionDurationShort3, 67);
        this.f1571e = AbstractC1680h.m4851M(c0506o.getContext(), R.attr.motionDurationShort3, 50);
        this.f1573g = AbstractC1680h.m4852N(c0506o.getContext(), R.attr.motionEasingLinearInterpolator, AbstractC0067a.f224a);
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: a */
    public final void mo1200a() {
        if (this.f1582p.isTouchExplorationEnabled() && AbstractC1687o.m4953z(this.f1574h) && !this.f1616d.hasFocus()) {
            this.f1574h.dismissDropDown();
        }
        this.f1574h.post(new RunnableC0024r(8, this));
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: c */
    public final int mo1201c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: d */
    public final int mo1202d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: e */
    public final View.OnFocusChangeListener mo1203e() {
        return this.f1576j;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: f */
    public final View.OnClickListener mo1204f() {
        return this.f1575i;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: h */
    public final C0264b mo1213h() {
        return this.f1577k;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: i */
    public final boolean mo1214i(int i) {
        return i != 0;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: j */
    public final boolean mo1215j() {
        return this.f1578l;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: l */
    public final boolean mo1216l() {
        return this.f1580n;
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: m */
    public final void mo1206m(EditText editText) {
        int i = 0;
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f1574h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ViewOnTouchListenerC0500i(i, this));
        this.f1574h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: a1.j
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                C0502k c0502k = C0502k.this;
                c0502k.f1579m = true;
                c0502k.f1581o = System.currentTimeMillis();
                c0502k.m1219t(false);
            }
        });
        this.f1574h.setThreshold(0);
        TextInputLayout textInputLayout = this.f1613a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!AbstractC1687o.m4953z(editText) && this.f1582p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            this.f1616d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: n */
    public final void mo1217n(C0240j c0240j) {
        boolean m4953z = AbstractC1687o.m4953z(this.f1574h);
        AccessibilityNodeInfo accessibilityNodeInfo = c0240j.f627a;
        if (!m4953z) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: o */
    public final void mo1218o(AccessibilityEvent accessibilityEvent) {
        if (!this.f1582p.isEnabled() || AbstractC1687o.m4953z(this.f1574h)) {
            return;
        }
        boolean z2 = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.f1580n && !this.f1574h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z2) {
            m1220u();
            this.f1579m = true;
            this.f1581o = System.currentTimeMillis();
        }
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: r */
    public final void mo1208r() {
        int i = 1;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f1573g;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.f1572f);
        ofFloat.addUpdateListener(new C0174W(i, this));
        this.f1584r = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.f1571e);
        ofFloat2.addUpdateListener(new C0174W(i, this));
        this.f1583q = ofFloat2;
        ofFloat2.addListener(new C0097a(2, this));
        this.f1582p = (AccessibilityManager) this.f1615c.getSystemService("accessibility");
    }

    @Override // p054a1.AbstractC0507p
    /* renamed from: s */
    public final void mo1209s() {
        AutoCompleteTextView autoCompleteTextView = this.f1574h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f1574h.setOnDismissListener(null);
        }
    }

    /* renamed from: t */
    public final void m1219t(boolean z2) {
        if (this.f1580n != z2) {
            this.f1580n = z2;
            this.f1584r.cancel();
            this.f1583q.start();
        }
    }

    /* renamed from: u */
    public final void m1220u() {
        if (this.f1574h == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.f1581o;
        if (currentTimeMillis < 0 || currentTimeMillis > 300) {
            this.f1579m = false;
        }
        if (this.f1579m) {
            this.f1579m = false;
            return;
        }
        m1219t(!this.f1580n);
        if (!this.f1580n) {
            this.f1574h.dismissDropDown();
        } else {
            this.f1574h.requestFocus();
            this.f1574h.showDropDown();
        }
    }
}
