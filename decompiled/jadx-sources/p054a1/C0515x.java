package p054a1;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.altaysoft.t500_split.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import p010D1.AbstractC0088l;
import p022K.AbstractC0169Q;
import p022K.C0198k;
import p034Q0.AbstractC0294k;
import p082l.C1096Y;

/* renamed from: a1.x */
/* loaded from: classes.dex */
public final class C0515x extends LinearLayout {

    /* renamed from: f */
    public final TextInputLayout f1667f;

    /* renamed from: g */
    public final C1096Y f1668g;

    /* renamed from: h */
    public CharSequence f1669h;

    /* renamed from: i */
    public final CheckableImageButton f1670i;

    /* renamed from: j */
    public ColorStateList f1671j;

    /* renamed from: k */
    public PorterDuff.Mode f1672k;

    /* renamed from: l */
    public int f1673l;

    /* renamed from: m */
    public ImageView.ScaleType f1674m;

    /* renamed from: n */
    public View.OnLongClickListener f1675n;

    /* renamed from: o */
    public boolean f1676o;

    public C0515x(TextInputLayout textInputLayout, C0198k c0198k) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.f1667f = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.f1670i = checkableImageButton;
        C1096Y c1096y = new C1096Y(getContext(), null);
        this.f1668g = c1096y;
        if (AbstractC0088l.m260S(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginEnd(0);
        }
        View.OnLongClickListener onLongClickListener = this.f1675n;
        checkableImageButton.setOnClickListener(null);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
        this.f1675n = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0088l.m274n0(checkableImageButton, null);
        TypedArray typedArray = (TypedArray) c0198k.f534c;
        if (typedArray.hasValue(69)) {
            this.f1671j = AbstractC0088l.m254A(getContext(), c0198k, 69);
        }
        if (typedArray.hasValue(70)) {
            this.f1672k = AbstractC0294k.m847h(typedArray.getInt(70, -1), null);
        }
        if (typedArray.hasValue(66)) {
            m1253b(c0198k.m598h(66));
            if (typedArray.hasValue(65) && checkableImageButton.getContentDescription() != (text = typedArray.getText(65))) {
                checkableImageButton.setContentDescription(text);
            }
            checkableImageButton.setCheckable(typedArray.getBoolean(64, true));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(67, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1673l) {
            this.f1673l = dimensionPixelSize;
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(68)) {
            ImageView.ScaleType m281t = AbstractC0088l.m281t(typedArray.getInt(68, -1));
            this.f1674m = m281t;
            checkableImageButton.setScaleType(m281t);
        }
        c1096y.setVisibility(8);
        c1096y.setId(R.id.textinput_prefix_text);
        c1096y.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        c1096y.setAccessibilityLiveRegion(1);
        c1096y.setTextAppearance(typedArray.getResourceId(60, 0));
        if (typedArray.hasValue(61)) {
            c1096y.setTextColor(c0198k.m597g(61));
        }
        CharSequence text2 = typedArray.getText(59);
        this.f1669h = TextUtils.isEmpty(text2) ? null : text2;
        c1096y.setText(text2);
        m1256e();
        addView(checkableImageButton);
        addView(c1096y);
    }

    /* renamed from: a */
    public final int m1252a() {
        int i;
        CheckableImageButton checkableImageButton = this.f1670i;
        if (checkableImageButton.getVisibility() == 0) {
            i = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginEnd() + checkableImageButton.getMeasuredWidth();
        } else {
            i = 0;
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        return this.f1668g.getPaddingStart() + getPaddingStart() + i;
    }

    /* renamed from: b */
    public final void m1253b(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1670i;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = this.f1671j;
            PorterDuff.Mode mode = this.f1672k;
            TextInputLayout textInputLayout = this.f1667f;
            AbstractC0088l.m268f(textInputLayout, checkableImageButton, colorStateList, mode);
            m1254c(true);
            AbstractC0088l.m273i0(textInputLayout, checkableImageButton, this.f1671j);
            return;
        }
        m1254c(false);
        View.OnLongClickListener onLongClickListener = this.f1675n;
        checkableImageButton.setOnClickListener(null);
        AbstractC0088l.m274n0(checkableImageButton, onLongClickListener);
        this.f1675n = null;
        checkableImageButton.setOnLongClickListener(null);
        AbstractC0088l.m274n0(checkableImageButton, null);
        if (checkableImageButton.getContentDescription() != null) {
            checkableImageButton.setContentDescription(null);
        }
    }

    /* renamed from: c */
    public final void m1254c(boolean z2) {
        CheckableImageButton checkableImageButton = this.f1670i;
        if ((checkableImageButton.getVisibility() == 0) != z2) {
            checkableImageButton.setVisibility(z2 ? 0 : 8);
            m1255d();
            m1256e();
        }
    }

    /* renamed from: d */
    public final void m1255d() {
        int paddingStart;
        EditText editText = this.f1667f.f3687i;
        if (editText == null) {
            return;
        }
        if (this.f1670i.getVisibility() == 0) {
            paddingStart = 0;
        } else {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            paddingStart = editText.getPaddingStart();
        }
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap weakHashMap2 = AbstractC0169Q.f475a;
        this.f1668g.setPaddingRelative(paddingStart, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }

    /* renamed from: e */
    public final void m1256e() {
        int i = (this.f1669h == null || this.f1676o) ? 8 : 0;
        setVisibility((this.f1670i.getVisibility() == 0 || i == 0) ? 0 : 8);
        this.f1668g.setVisibility(i);
        this.f1667f.m2128q();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m1255d();
    }
}
