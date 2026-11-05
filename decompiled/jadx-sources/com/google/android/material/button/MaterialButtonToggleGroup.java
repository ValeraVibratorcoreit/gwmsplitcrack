package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import com.google.android.material.timepicker.C0690f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.WeakHashMap;
import p004B0.AbstractC0051a;
import p019I0.C0140d;
import p019I0.C0141e;
import p019I0.C0142f;
import p022K.AbstractC0169Q;
import p034Q0.AbstractC0294k;
import p045W0.C0351a;
import p045W0.C0360j;
import p045W0.C0361k;
import p060c1.AbstractC0577a;

/* loaded from: classes.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: p */
    public static final /* synthetic */ int f3436p = 0;

    /* renamed from: f */
    public final ArrayList f3437f;

    /* renamed from: g */
    public final C0639g f3438g;

    /* renamed from: h */
    public final LinkedHashSet f3439h;

    /* renamed from: i */
    public final C0140d f3440i;

    /* renamed from: j */
    public Integer[] f3441j;

    /* renamed from: k */
    public boolean f3442k;

    /* renamed from: l */
    public boolean f3443l;

    /* renamed from: m */
    public boolean f3444m;

    /* renamed from: n */
    public final int f3445n;

    /* renamed from: o */
    public HashSet f3446o;

    public MaterialButtonToggleGroup(Context context, AttributeSet attributeSet) {
        super(AbstractC0577a.m1578a(context, attributeSet, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup), attributeSet, R.attr.materialButtonToggleGroupStyle);
        this.f3437f = new ArrayList();
        this.f3438g = new C0639g(4, this);
        this.f3439h = new LinkedHashSet();
        this.f3440i = new C0140d(this);
        this.f3442k = false;
        this.f3446o = new HashSet();
        TypedArray m846g = AbstractC0294k.m846g(getContext(), attributeSet, AbstractC0051a.f177l, R.attr.materialButtonToggleGroupStyle, R.style.Widget_MaterialComponents_MaterialButtonToggleGroup, new int[0]);
        setSingleSelection(m846g.getBoolean(3, false));
        this.f3445n = m846g.getResourceId(1, -1);
        this.f3444m = m846g.getBoolean(2, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(m846g.getBoolean(0, true));
        m846g.recycle();
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setImportantForAccessibility(1);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (m2056c(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (m2056c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && m2056c(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f3438g);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    /* renamed from: a */
    public final void m2054a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            int min = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                layoutParams2.setMarginEnd(0);
                layoutParams2.setMarginStart(-min);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -min;
                layoutParams2.setMarginStart(0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            layoutParams3.setMarginEnd(0);
            layoutParams3.setMarginStart(0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e("MButtonToggleGroup", "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        m2055b(materialButton.getId(), materialButton.f3433t);
        C0361k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.f3437f.add(new C0142f(shapeAppearanceModel.f1064e, shapeAppearanceModel.f1067h, shapeAppearanceModel.f1065f, shapeAppearanceModel.f1066g));
        materialButton.setEnabled(isEnabled());
        AbstractC0169Q.m505j(materialButton, new C0141e(0, this));
    }

    /* renamed from: b */
    public final void m2055b(int i, boolean z2) {
        if (i == -1) {
            Log.e("MButtonToggleGroup", "Button ID is not valid: " + i);
            return;
        }
        HashSet hashSet = new HashSet(this.f3446o);
        if (z2 && !hashSet.contains(Integer.valueOf(i))) {
            if (this.f3443l && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i));
        } else {
            if (z2 || !hashSet.contains(Integer.valueOf(i))) {
                return;
            }
            if (!this.f3444m || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i));
            }
        }
        m2057d(hashSet);
    }

    /* renamed from: c */
    public final boolean m2056c(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    /* renamed from: d */
    public final void m2057d(Set set) {
        HashSet hashSet = this.f3446o;
        this.f3446o = new HashSet(set);
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            boolean contains = set.contains(Integer.valueOf(id));
            View findViewById = findViewById(id);
            if (findViewById instanceof MaterialButton) {
                this.f3442k = true;
                ((MaterialButton) findViewById).setChecked(contains);
                this.f3442k = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                set.contains(Integer.valueOf(id));
                Iterator it = this.f3439h.iterator();
                while (it.hasNext()) {
                    ((C0690f) it.next()).m2146a();
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f3440i);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put((MaterialButton) getChildAt(i), Integer.valueOf(i));
        }
        this.f3441j = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    /* renamed from: e */
    public final void m2058e() {
        C0142f c0142f;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i);
            if (materialButton.getVisibility() != 8) {
                C0360j m968e = materialButton.getShapeAppearanceModel().m968e();
                C0142f c0142f2 = (C0142f) this.f3437f.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z2 = getOrientation() == 0;
                    C0351a c0351a = C0142f.f444e;
                    if (i == firstVisibleChildIndex) {
                        c0142f = z2 ? AbstractC0294k.m845f(this) ? new C0142f(c0351a, c0351a, c0142f2.f446b, c0142f2.f447c) : new C0142f(c0142f2.f445a, c0142f2.f448d, c0351a, c0351a) : new C0142f(c0142f2.f445a, c0351a, c0142f2.f446b, c0351a);
                    } else if (i == lastVisibleChildIndex) {
                        c0142f = z2 ? AbstractC0294k.m845f(this) ? new C0142f(c0142f2.f445a, c0142f2.f448d, c0351a, c0351a) : new C0142f(c0351a, c0351a, c0142f2.f446b, c0142f2.f447c) : new C0142f(c0351a, c0142f2.f448d, c0351a, c0142f2.f447c);
                    } else {
                        c0142f2 = null;
                    }
                    c0142f2 = c0142f;
                }
                if (c0142f2 == null) {
                    m968e.f1052e = new C0351a(0.0f);
                    m968e.f1053f = new C0351a(0.0f);
                    m968e.f1054g = new C0351a(0.0f);
                    m968e.f1055h = new C0351a(0.0f);
                } else {
                    m968e.f1052e = c0142f2.f445a;
                    m968e.f1055h = c0142f2.f448d;
                    m968e.f1053f = c0142f2.f446b;
                    m968e.f1054g = c0142f2.f447c;
                }
                materialButton.setShapeAppearanceModel(m968e.m963a());
            }
        }
    }

    public int getCheckedButtonId() {
        if (!this.f3443l || this.f3446o.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f3446o.iterator().next()).intValue();
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            int id = ((MaterialButton) getChildAt(i)).getId();
            if (this.f3446o.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public final int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.f3441j;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i2;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f3445n;
        if (i != -1) {
            m2057d(Collections.singleton(Integer.valueOf(i)));
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(1, getVisibleButtonCount(), false, this.f3443l ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        m2058e();
        m2054a();
        super.onMeasure(i, i2);
    }

    @Override // android.view.ViewGroup
    public final void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f3437f.remove(indexOfChild);
        }
        m2058e();
        m2054a();
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setEnabled(z2);
        }
    }

    public void setSelectionRequired(boolean z2) {
        this.f3444m = z2;
    }

    public void setSingleSelection(boolean z2) {
        if (this.f3443l != z2) {
            this.f3443l = z2;
            m2057d(new HashSet());
        }
        for (int i = 0; i < getChildCount(); i++) {
            ((MaterialButton) getChildAt(i)).setA11yClassName((this.f3443l ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
