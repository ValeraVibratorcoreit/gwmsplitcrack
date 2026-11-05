package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import p022K.C0198k;
import p067f.AbstractC0770a;
import p079k.C1020o;
import p079k.InterfaceC1031z;
import p079k.MenuC1018m;

/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC1031z, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: f */
    public C1020o f1696f;

    /* renamed from: g */
    public ImageView f1697g;

    /* renamed from: h */
    public RadioButton f1698h;

    /* renamed from: i */
    public TextView f1699i;

    /* renamed from: j */
    public CheckBox f1700j;

    /* renamed from: k */
    public TextView f1701k;

    /* renamed from: l */
    public ImageView f1702l;

    /* renamed from: m */
    public ImageView f1703m;

    /* renamed from: n */
    public LinearLayout f1704n;

    /* renamed from: o */
    public final Drawable f1705o;

    /* renamed from: p */
    public final int f1706p;

    /* renamed from: q */
    public final Context f1707q;

    /* renamed from: r */
    public boolean f1708r;

    /* renamed from: s */
    public final Drawable f1709s;

    /* renamed from: t */
    public final boolean f1710t;

    /* renamed from: u */
    public LayoutInflater f1711u;

    /* renamed from: v */
    public boolean f1712v;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0198k m591r = C0198k.m591r(getContext(), attributeSet, AbstractC0770a.f3911r, R.attr.listMenuViewStyle);
        this.f1705o = m591r.m598h(5);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        this.f1706p = typedArray.getResourceId(1, -1);
        this.f1708r = typedArray.getBoolean(7, false);
        this.f1707q = context;
        this.f1709s = m591r.m598h(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.f1710t = obtainStyledAttributes.hasValue(0);
        m591r.m609t();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.f1711u == null) {
            this.f1711u = LayoutInflater.from(getContext());
        }
        return this.f1711u;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f1702l;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f1703m;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f1703m.getLayoutParams();
        rect.top = this.f1703m.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005b, code lost:
    
        if (r0 == false) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0125  */
    @Override // p079k.InterfaceC1031z
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo1258b(C1020o c1020o) {
        boolean z2;
        String sb;
        boolean z3;
        this.f1696f = c1020o;
        int i = 0;
        setVisibility(c1020o.isVisible() ? 0 : 8);
        setTitle(c1020o.f4863e);
        setCheckable(c1020o.isCheckable());
        if (c1020o.f4872n.mo2600o()) {
            if ((c1020o.f4872n.mo2599n() ? c1020o.f4868j : c1020o.f4866h) != 0) {
                z2 = true;
                c1020o.f4872n.mo2599n();
                if (z2) {
                    C1020o c1020o2 = this.f1696f;
                    if (c1020o2.f4872n.mo2600o()) {
                        if ((c1020o2.f4872n.mo2599n() ? c1020o2.f4868j : c1020o2.f4866h) != 0) {
                            z3 = true;
                        }
                    }
                    z3 = false;
                }
                i = 8;
                if (i == 0) {
                    TextView textView = this.f1701k;
                    C1020o c1020o3 = this.f1696f;
                    char c2 = c1020o3.f4872n.mo2599n() ? c1020o3.f4868j : c1020o3.f4866h;
                    if (c2 == 0) {
                        sb = "";
                    } else {
                        MenuC1018m menuC1018m = c1020o3.f4872n;
                        Resources resources = menuC1018m.f4829a.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(menuC1018m.f4829a).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        int i2 = menuC1018m.mo2599n() ? c1020o3.f4869k : c1020o3.f4867i;
                        C1020o.m2628c(i2, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label), sb2);
                        C1020o.m2628c(i2, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label), sb2);
                        C1020o.m2628c(i2, 2, resources.getString(R.string.abc_menu_alt_shortcut_label), sb2);
                        C1020o.m2628c(i2, 1, resources.getString(R.string.abc_menu_shift_shortcut_label), sb2);
                        C1020o.m2628c(i2, 4, resources.getString(R.string.abc_menu_sym_shortcut_label), sb2);
                        C1020o.m2628c(i2, 8, resources.getString(R.string.abc_menu_function_shortcut_label), sb2);
                        if (c2 == '\b') {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        } else if (c2 == '\n') {
                            sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                        } else if (c2 != ' ') {
                            sb2.append(c2);
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f1701k.getVisibility() != i) {
                    this.f1701k.setVisibility(i);
                }
                setIcon(c1020o.getIcon());
                setEnabled(c1020o.isEnabled());
                setSubMenuArrowVisible(c1020o.hasSubMenu());
                setContentDescription(c1020o.f4875q);
            }
        }
        z2 = false;
        c1020o.f4872n.mo2599n();
        if (z2) {
        }
        i = 8;
        if (i == 0) {
        }
        if (this.f1701k.getVisibility() != i) {
        }
        setIcon(c1020o.getIcon());
        setEnabled(c1020o.isEnabled());
        setSubMenuArrowVisible(c1020o.hasSubMenu());
        setContentDescription(c1020o.f4875q);
    }

    @Override // p079k.InterfaceC1031z
    public C1020o getItemData() {
        return this.f1696f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f1705o);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f1699i = textView;
        int i = this.f1706p;
        if (i != -1) {
            textView.setTextAppearance(this.f1707q, i);
        }
        this.f1701k = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f1702l = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f1709s);
        }
        this.f1703m = (ImageView) findViewById(R.id.group_divider);
        this.f1704n = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.f1697g != null && this.f1708r) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f1697g.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f1698h == null && this.f1700j == null) {
            return;
        }
        if ((this.f1696f.f4882x & 4) != 0) {
            if (this.f1698h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1698h = radioButton;
                LinearLayout linearLayout = this.f1704n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1698h;
            view = this.f1700j;
        } else {
            if (this.f1700j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1700j = checkBox;
                LinearLayout linearLayout2 = this.f1704n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1700j;
            view = this.f1698h;
        }
        if (z2) {
            compoundButton.setChecked(this.f1696f.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f1700j;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f1698h;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f1696f.f4882x & 4) != 0) {
            if (this.f1698h == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f1698h = radioButton;
                LinearLayout linearLayout = this.f1704n;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f1698h;
        } else {
            if (this.f1700j == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f1700j = checkBox;
                LinearLayout linearLayout2 = this.f1704n;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f1700j;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.f1712v = z2;
        this.f1708r = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.f1703m;
        if (imageView != null) {
            imageView.setVisibility((this.f1710t || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.f1696f.f4872n.getClass();
        boolean z2 = this.f1712v;
        if (z2 || this.f1708r) {
            ImageView imageView = this.f1697g;
            if (imageView == null && drawable == null && !this.f1708r) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f1697g = imageView2;
                LinearLayout linearLayout = this.f1704n;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.f1708r) {
                this.f1697g.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f1697g;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f1697g.getVisibility() != 0) {
                this.f1697g.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f1699i.getVisibility() != 8) {
                this.f1699i.setVisibility(8);
            }
        } else {
            this.f1699i.setText(charSequence);
            if (this.f1699i.getVisibility() != 0) {
                this.f1699i.setVisibility(0);
            }
        }
    }
}
