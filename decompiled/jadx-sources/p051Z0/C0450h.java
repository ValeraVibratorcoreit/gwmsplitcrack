package p051Z0;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.StateSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.tabs.TabLayout;
import com.jcraft.jsch.SftpATTRS;
import java.util.WeakHashMap;
import p010D1.AbstractC0088l;
import p012E0.C0093a;
import p012E0.C0095c;
import p022K.AbstractC0160H;
import p022K.AbstractC0169Q;
import p022K.AbstractC0218u;
import p024L.C0235e;
import p024L.C0239i;
import p034Q0.AbstractC0294k;
import p041U0.AbstractC0338a;
import p082l.AbstractC1099Z0;

/* renamed from: Z0.h */
/* loaded from: classes.dex */
public final class C0450h extends LinearLayout {

    /* renamed from: q */
    public static final /* synthetic */ int f1434q = 0;

    /* renamed from: f */
    public C0448f f1435f;

    /* renamed from: g */
    public TextView f1436g;

    /* renamed from: h */
    public ImageView f1437h;

    /* renamed from: i */
    public View f1438i;

    /* renamed from: j */
    public C0093a f1439j;

    /* renamed from: k */
    public View f1440k;

    /* renamed from: l */
    public TextView f1441l;

    /* renamed from: m */
    public ImageView f1442m;

    /* renamed from: n */
    public Drawable f1443n;

    /* renamed from: o */
    public int f1444o;

    /* renamed from: p */
    public final /* synthetic */ TabLayout f1445p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0450h(TabLayout tabLayout, Context context) {
        super(context);
        this.f1445p = tabLayout;
        this.f1444o = 2;
        m1156e(context);
        int i = tabLayout.f3626j;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setPaddingRelative(i, tabLayout.f3627k, tabLayout.f3628l, tabLayout.f3629m);
        setGravity(17);
        setOrientation(!tabLayout.f3610H ? 1 : 0);
        setClickable(true);
        AbstractC0160H.m453d(this, AbstractC0218u.m676b(getContext(), 1002));
    }

    private C0093a getBadge() {
        return this.f1439j;
    }

    private C0093a getOrCreateBadge() {
        if (this.f1439j == null) {
            this.f1439j = new C0093a(getContext());
        }
        m1153b();
        C0093a c0093a = this.f1439j;
        if (c0093a != null) {
            return c0093a;
        }
        throw new IllegalStateException("Unable to create badge");
    }

    /* renamed from: a */
    public final void m1152a() {
        if (this.f1439j != null) {
            setClipChildren(true);
            setClipToPadding(true);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(true);
                viewGroup.setClipToPadding(true);
            }
            View view = this.f1438i;
            if (view != null) {
                C0093a c0093a = this.f1439j;
                if (c0093a != null) {
                    if (c0093a.m329c() != null) {
                        c0093a.m329c().setForeground(null);
                    } else {
                        view.getOverlay().remove(c0093a);
                    }
                }
                this.f1438i = null;
            }
        }
    }

    /* renamed from: b */
    public final void m1153b() {
        if (this.f1439j != null) {
            if (this.f1440k != null) {
                m1152a();
                return;
            }
            TextView textView = this.f1436g;
            if (textView == null || this.f1435f == null) {
                m1152a();
                return;
            }
            if (this.f1438i == textView) {
                m1154c(textView);
                return;
            }
            m1152a();
            TextView textView2 = this.f1436g;
            if (this.f1439j == null || textView2 == null) {
                return;
            }
            setClipChildren(false);
            setClipToPadding(false);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
                viewGroup.setClipToPadding(false);
            }
            C0093a c0093a = this.f1439j;
            Rect rect = new Rect();
            textView2.getDrawingRect(rect);
            c0093a.setBounds(rect);
            c0093a.m334h(textView2, null);
            if (c0093a.m329c() != null) {
                c0093a.m329c().setForeground(c0093a);
            } else {
                textView2.getOverlay().add(c0093a);
            }
            this.f1438i = textView2;
        }
    }

    /* renamed from: c */
    public final void m1154c(View view) {
        C0093a c0093a = this.f1439j;
        if (c0093a == null || view != this.f1438i) {
            return;
        }
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        c0093a.setBounds(rect);
        c0093a.m334h(view, null);
    }

    /* renamed from: d */
    public final void m1155d() {
        boolean z2;
        m1157f();
        C0448f c0448f = this.f1435f;
        if (c0448f != null) {
            TabLayout tabLayout = c0448f.f1430d;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            if (selectedTabPosition != -1 && selectedTabPosition == c0448f.f1428b) {
                z2 = true;
                setSelected(z2);
            }
        }
        z2 = false;
        setSelected(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f1443n;
        if ((drawable == null || !drawable.isStateful()) ? false : this.f1443n.setState(drawableState)) {
            invalidate();
            this.f1445p.invalidate();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [android.graphics.drawable.RippleDrawable] */
    /* JADX WARN: Type inference failed for: r9v0, types: [Z0.h, android.view.View] */
    /* renamed from: e */
    public final void m1156e(Context context) {
        TabLayout tabLayout = this.f1445p;
        int i = tabLayout.f3640x;
        if (i != 0) {
            Drawable m257D = AbstractC0088l.m257D(context, i);
            this.f1443n = m257D;
            if (m257D != null && m257D.isStateful()) {
                this.f1443n.setState(getDrawableState());
            }
        } else {
            this.f1443n = null;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(0);
        if (tabLayout.f3635s != null) {
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setCornerRadius(1.0E-5f);
            gradientDrawable2.setColor(-1);
            ColorStateList colorStateList = tabLayout.f3635s;
            int[] iArr = AbstractC0338a.f968d;
            int m936a = AbstractC0338a.m936a(colorStateList, AbstractC0338a.f967c);
            int[] iArr2 = AbstractC0338a.f966b;
            ColorStateList colorStateList2 = new ColorStateList(new int[][]{iArr, iArr2, StateSet.NOTHING}, new int[]{m936a, AbstractC0338a.m936a(colorStateList, iArr2), AbstractC0338a.m936a(colorStateList, AbstractC0338a.f965a)});
            boolean z2 = tabLayout.f3614L;
            if (z2) {
                gradientDrawable = null;
            }
            gradientDrawable = new RippleDrawable(colorStateList2, gradientDrawable, z2 ? null : gradientDrawable2);
        }
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        setBackground(gradientDrawable);
        tabLayout.invalidate();
    }

    /* renamed from: f */
    public final void m1157f() {
        int i;
        ViewParent parent;
        C0448f c0448f = this.f1435f;
        View view = c0448f != null ? c0448f.f1429c : null;
        if (view != null) {
            ViewParent parent2 = view.getParent();
            if (parent2 != this) {
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeView(view);
                }
                View view2 = this.f1440k;
                if (view2 != null && (parent = view2.getParent()) != null) {
                    ((ViewGroup) parent).removeView(this.f1440k);
                }
                addView(view);
            }
            this.f1440k = view;
            TextView textView = this.f1436g;
            if (textView != null) {
                textView.setVisibility(8);
            }
            ImageView imageView = this.f1437h;
            if (imageView != null) {
                imageView.setVisibility(8);
                this.f1437h.setImageDrawable(null);
            }
            TextView textView2 = (TextView) view.findViewById(R.id.text1);
            this.f1441l = textView2;
            if (textView2 != null) {
                this.f1444o = textView2.getMaxLines();
            }
            this.f1442m = (ImageView) view.findViewById(R.id.icon);
        } else {
            View view3 = this.f1440k;
            if (view3 != null) {
                removeView(view3);
                this.f1440k = null;
            }
            this.f1441l = null;
            this.f1442m = null;
        }
        if (this.f1440k == null) {
            if (this.f1437h == null) {
                ImageView imageView2 = (ImageView) LayoutInflater.from(getContext()).inflate(com.altaysoft.t500_split.R.layout.design_layout_tab_icon, (ViewGroup) this, false);
                this.f1437h = imageView2;
                addView(imageView2, 0);
            }
            if (this.f1436g == null) {
                TextView textView3 = (TextView) LayoutInflater.from(getContext()).inflate(com.altaysoft.t500_split.R.layout.design_layout_tab_text, (ViewGroup) this, false);
                this.f1436g = textView3;
                addView(textView3);
                this.f1444o = this.f1436g.getMaxLines();
            }
            TextView textView4 = this.f1436g;
            TabLayout tabLayout = this.f1445p;
            textView4.setTextAppearance(tabLayout.f3630n);
            if (!isSelected() || (i = tabLayout.f3632p) == -1) {
                this.f1436g.setTextAppearance(tabLayout.f3631o);
            } else {
                this.f1436g.setTextAppearance(i);
            }
            ColorStateList colorStateList = tabLayout.f3633q;
            if (colorStateList != null) {
                this.f1436g.setTextColor(colorStateList);
            }
            m1158g(this.f1436g, this.f1437h, true);
            m1153b();
            ImageView imageView3 = this.f1437h;
            if (imageView3 != null) {
                imageView3.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0449g(this, imageView3));
            }
            TextView textView5 = this.f1436g;
            if (textView5 != null) {
                textView5.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC0449g(this, textView5));
            }
        } else {
            TextView textView6 = this.f1441l;
            if (textView6 != null || this.f1442m != null) {
                m1158g(textView6, this.f1442m, false);
            }
        }
        if (c0448f == null || TextUtils.isEmpty(null)) {
            return;
        }
        setContentDescription(null);
    }

    /* renamed from: g */
    public final void m1158g(TextView textView, ImageView imageView, boolean z2) {
        boolean z3;
        C0448f c0448f = this.f1435f;
        String str = c0448f != null ? c0448f.f1427a : null;
        if (imageView != null) {
            imageView.setVisibility(8);
            imageView.setImageDrawable(null);
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (textView != null) {
            if (isEmpty) {
                z3 = false;
            } else {
                this.f1435f.getClass();
                z3 = true;
            }
            textView.setText(!isEmpty ? str : null);
            textView.setVisibility(z3 ? 0 : 8);
            if (!isEmpty) {
                setVisibility(0);
            }
        } else {
            z3 = false;
        }
        if (z2 && imageView != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
            int m843d = (z3 && imageView.getVisibility() == 0) ? (int) AbstractC0294k.m843d(getContext(), 8) : 0;
            if (this.f1445p.f3610H) {
                if (m843d != marginLayoutParams.getMarginEnd()) {
                    marginLayoutParams.setMarginEnd(m843d);
                    marginLayoutParams.bottomMargin = 0;
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            } else if (m843d != marginLayoutParams.bottomMargin) {
                marginLayoutParams.bottomMargin = m843d;
                marginLayoutParams.setMarginEnd(0);
                imageView.setLayoutParams(marginLayoutParams);
                imageView.requestLayout();
            }
        }
        AbstractC1099Z0.m2725a(this, isEmpty ? null : str);
    }

    public int getContentHeight() {
        View[] viewArr = {this.f1436g, this.f1437h, this.f1440k};
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z2 ? Math.min(i2, view.getTop()) : view.getTop();
                i = z2 ? Math.max(i, view.getBottom()) : view.getBottom();
                z2 = true;
            }
        }
        return i - i2;
    }

    public int getContentWidth() {
        View[] viewArr = {this.f1436g, this.f1437h, this.f1440k};
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        for (int i3 = 0; i3 < 3; i3++) {
            View view = viewArr[i3];
            if (view != null && view.getVisibility() == 0) {
                i2 = z2 ? Math.min(i2, view.getLeft()) : view.getLeft();
                i = z2 ? Math.max(i, view.getRight()) : view.getRight();
                z2 = true;
            }
        }
        return i - i2;
    }

    public C0448f getTab() {
        return this.f1435f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        Context context;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C0093a c0093a = this.f1439j;
        if (c0093a != null && c0093a.isVisible()) {
            C0093a c0093a2 = this.f1439j;
            CharSequence charSequence = null;
            if (c0093a2.isVisible()) {
                C0095c c0095c = c0093a2.f276j.f317b;
                String str = c0095c.f299j;
                if (str != null) {
                    String str2 = c0095c.f304o;
                    charSequence = str2 != null ? str2 : str;
                } else if (!c0093a2.m332f()) {
                    charSequence = c0095c.f305p;
                } else if (c0095c.f306q != 0 && (context = (Context) c0093a2.f272f.get()) != null) {
                    if (c0093a2.f279m != -2) {
                        int m330d = c0093a2.m330d();
                        int i = c0093a2.f279m;
                        if (m330d > i) {
                            charSequence = context.getString(c0095c.f307r, Integer.valueOf(i));
                        }
                    }
                    charSequence = context.getResources().getQuantityString(c0095c.f306q, c0093a2.m330d(), Integer.valueOf(c0093a2.m330d()));
                }
            }
            accessibilityNodeInfo.setContentDescription(charSequence);
        }
        accessibilityNodeInfo.setCollectionItemInfo(C0239i.m727a(isSelected(), 0, 1, this.f1435f.f1428b, 1).f626a);
        if (isSelected()) {
            accessibilityNodeInfo.setClickable(false);
            accessibilityNodeInfo.removeAction((AccessibilityNodeInfo.AccessibilityAction) C0235e.f614e.f622a);
        }
        accessibilityNodeInfo.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", getResources().getString(com.altaysoft.t500_split.R.string.item_view_role_description));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        TabLayout tabLayout = this.f1445p;
        int tabMaxWidth = tabLayout.getTabMaxWidth();
        if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
            i = View.MeasureSpec.makeMeasureSpec(tabLayout.f3641y, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        }
        super.onMeasure(i, i2);
        if (this.f1436g != null) {
            float f2 = tabLayout.f3638v;
            int i3 = this.f1444o;
            ImageView imageView = this.f1437h;
            if (imageView == null || imageView.getVisibility() != 0) {
                TextView textView = this.f1436g;
                if (textView != null && textView.getLineCount() > 1) {
                    f2 = tabLayout.f3639w;
                }
            } else {
                i3 = 1;
            }
            float textSize = this.f1436g.getTextSize();
            int lineCount = this.f1436g.getLineCount();
            int maxLines = this.f1436g.getMaxLines();
            if (f2 != textSize || (maxLines >= 0 && i3 != maxLines)) {
                if (tabLayout.f3609G == 1 && f2 > textSize && lineCount == 1) {
                    Layout layout = this.f1436g.getLayout();
                    if (layout == null) {
                        return;
                    }
                    if ((f2 / layout.getPaint().getTextSize()) * layout.getLineWidth(0) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) {
                        return;
                    }
                }
                this.f1436g.setTextSize(0, f2);
                this.f1436g.setMaxLines(i3);
                super.onMeasure(i, i2);
            }
        }
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean performClick = super.performClick();
        if (this.f1435f == null) {
            return performClick;
        }
        if (!performClick) {
            playSoundEffect(0);
        }
        C0448f c0448f = this.f1435f;
        TabLayout tabLayout = c0448f.f1430d;
        if (tabLayout == null) {
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }
        tabLayout.m2109h(c0448f, true);
        return true;
    }

    @Override // android.view.View
    public void setSelected(boolean z2) {
        isSelected();
        super.setSelected(z2);
        TextView textView = this.f1436g;
        if (textView != null) {
            textView.setSelected(z2);
        }
        ImageView imageView = this.f1437h;
        if (imageView != null) {
            imageView.setSelected(z2);
        }
        View view = this.f1440k;
        if (view != null) {
            view.setSelected(z2);
        }
    }

    public void setTab(C0448f c0448f) {
        if (c0448f != this.f1435f) {
            this.f1435f = c0448f;
            m1155d();
        }
    }
}
