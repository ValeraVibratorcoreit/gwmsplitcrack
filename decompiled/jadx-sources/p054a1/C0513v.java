package p054a1;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.Filterable;
import android.widget.ListAdapter;
import com.altaysoft.t500_split.R;
import com.google.android.material.textfield.TextInputLayout;
import java.util.List;
import java.util.Locale;
import p004B0.AbstractC0051a;
import p010D1.AbstractC0088l;
import p034Q0.AbstractC0294k;
import p045W0.C0357g;
import p060c1.AbstractC0577a;
import p082l.C1050A0;
import p082l.C1131o;

/* renamed from: a1.v */
/* loaded from: classes.dex */
public final class C0513v extends C1131o {

    /* renamed from: j */
    public final C1050A0 f1656j;

    /* renamed from: k */
    public final AccessibilityManager f1657k;

    /* renamed from: l */
    public final Rect f1658l;

    /* renamed from: m */
    public final int f1659m;

    /* renamed from: n */
    public final float f1660n;

    /* renamed from: o */
    public ColorStateList f1661o;

    /* renamed from: p */
    public int f1662p;

    /* renamed from: q */
    public ColorStateList f1663q;

    public C0513v(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet);
        this.f1658l = new Rect();
        Context context2 = getContext();
        TypedArray m846g = AbstractC0294k.m846g(context2, attributeSet, AbstractC0051a.f175j, R.attr.autoCompleteTextViewStyle, R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (m846g.hasValue(0) && m846g.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.f1659m = m846g.getResourceId(3, R.layout.mtrl_auto_complete_simple_item);
        this.f1660n = m846g.getDimensionPixelOffset(1, R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        if (m846g.hasValue(2)) {
            this.f1661o = ColorStateList.valueOf(m846g.getColor(2, 0));
        }
        this.f1662p = m846g.getColor(4, 0);
        this.f1663q = AbstractC0088l.m255B(context2, m846g, 5);
        this.f1657k = (AccessibilityManager) context2.getSystemService("accessibility");
        C1050A0 c1050a0 = new C1050A0(context2, null, R.attr.listPopupWindowStyle);
        this.f1656j = c1050a0;
        c1050a0.f4998D = true;
        c1050a0.f4999E.setFocusable(true);
        c1050a0.f5014t = this;
        c1050a0.f4999E.setInputMethodMode(2);
        c1050a0.mo2651n(getAdapter());
        c1050a0.f5015u = new C0511t(0, this);
        if (m846g.hasValue(6)) {
            setSimpleItems(m846g.getResourceId(6, 0));
        }
        m846g.recycle();
    }

    /* renamed from: a */
    public static void m1249a(C0513v c0513v, Object obj) {
        c0513v.setText(c0513v.convertSelectionToString(obj), false);
    }

    /* renamed from: b */
    public final TextInputLayout m1250b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m1251c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f1657k;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        if (m1251c()) {
            this.f1656j.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    public ColorStateList getDropDownBackgroundTintList() {
        return this.f1661o;
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout m1250b = m1250b();
        return (m1250b == null || !m1250b.f3662J) ? super.getHint() : m1250b.getHint();
    }

    public float getPopupElevation() {
        return this.f1660n;
    }

    public int getSimpleItemSelectedColor() {
        return this.f1662p;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.f1663q;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout m1250b = m1250b();
        if (m1250b != null && m1250b.f3662J && super.getHint() == null) {
            String str = Build.MANUFACTURER;
            if ((str != null ? str.toLowerCase(Locale.ENGLISH) : "").equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1656j.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout m1250b = m1250b();
            int i3 = 0;
            if (adapter != null && m1250b != null) {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                C1050A0 c1050a0 = this.f1656j;
                int min = Math.min(adapter.getCount(), Math.max(0, !c1050a0.f4999E.isShowing() ? -1 : c1050a0.f5002h.getSelectedItemPosition()) + 15);
                View view = null;
                int i4 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i3) {
                        view = null;
                        i3 = itemViewType;
                    }
                    view = adapter.getView(max, view, m1250b);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i4 = Math.max(i4, view.getMeasuredWidth());
                }
                Drawable background = c1050a0.f4999E.getBackground();
                if (background != null) {
                    Rect rect = this.f1658l;
                    background.getPadding(rect);
                    i4 += rect.left + rect.right;
                }
                i3 = m1250b.getEndIconView().getMeasuredWidth() + i4;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z2) {
        if (m1251c()) {
            return;
        }
        super.onWindowFocusChanged(z2);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t2) {
        super.setAdapter(t2);
        this.f1656j.mo2651n(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        C1050A0 c1050a0 = this.f1656j;
        if (c1050a0 != null) {
            c1050a0.m2649l(drawable);
        }
    }

    public void setDropDownBackgroundTint(int i) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i));
    }

    public void setDropDownBackgroundTintList(ColorStateList colorStateList) {
        this.f1661o = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof C0357g) {
            ((C0357g) dropDownBackground).m958k(this.f1661o);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f1656j.f5016v = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout m1250b = m1250b();
        if (m1250b != null) {
            m1250b.m2130s();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.f1662p = i;
        if (getAdapter() instanceof C0512u) {
            ((C0512u) getAdapter()).m1248a();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.f1663q = colorStateList;
        if (getAdapter() instanceof C0512u) {
            ((C0512u) getAdapter()).m1248a();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        if (m1251c()) {
            this.f1656j.mo2578f();
        } else {
            super.showDropDown();
        }
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new C0512u(this, getContext(), this.f1659m, strArr));
    }
}
