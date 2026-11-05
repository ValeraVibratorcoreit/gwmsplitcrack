package p070g;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.AbstractC0528K;
import com.altaysoft.t500_split.R;
import com.google.android.material.datepicker.ViewOnClickListenerC0669j;
import com.sun.jna.Function;
import java.util.WeakHashMap;
import p022K.AbstractC0159G;
import p022K.AbstractC0169Q;
import p052a.DialogC0473m;
import p076j.C0961j;
import p082l.C1138r0;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: g.f */
/* loaded from: classes.dex */
public final class DialogInterfaceC0867f extends DialogC0473m implements DialogInterface, InterfaceC0871j {

    /* renamed from: i */
    public LayoutInflaterFactory2C0887z f4357i;

    /* renamed from: j */
    public final C0852A f4358j;

    /* renamed from: k */
    public final C0866e f4359k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogInterfaceC0867f(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, r2);
        int i2;
        int m2398i = m2398i(contextThemeWrapper, i);
        if (m2398i == 0) {
            TypedValue typedValue = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue, true);
            i2 = typedValue.resourceId;
        } else {
            i2 = m2398i;
        }
        this.f4358j = new C0852A(this);
        AbstractC0876o m2399f = m2399f();
        if (m2398i == 0) {
            TypedValue typedValue2 = new TypedValue();
            contextThemeWrapper.getTheme().resolveAttribute(R.attr.dialogTheme, typedValue2, true);
            m2398i = typedValue2.resourceId;
        }
        ((LayoutInflaterFactory2C0887z) m2399f).f4440Y = m2398i;
        m2399f.mo2419c();
        this.f4359k = new C0866e(getContext(), this, getWindow());
    }

    /* renamed from: i */
    public static int m2398i(Context context, int i) {
        if (((i >>> 24) & Function.USE_VARARGS) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // p052a.DialogC0473m, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2399f();
        layoutInflaterFactory2C0887z.m2456v();
        ((ViewGroup) layoutInflaterFactory2C0887z.f4421F.findViewById(android.R.id.content)).addView(view, layoutParams);
        layoutInflaterFactory2C0887z.f4457r.m2435a(layoutInflaterFactory2C0887z.f4456q.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        m2399f().mo2420d();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        C0852A c0852a = this.f4358j;
        if (c0852a == null) {
            return false;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    /* renamed from: f */
    public final AbstractC0876o m2399f() {
        if (this.f4357i == null) {
            ExecutorC0874m executorC0874m = AbstractC0876o.f4373f;
            this.f4357i = new LayoutInflaterFactory2C0887z(getContext(), getWindow(), this, this);
        }
        return this.f4357i;
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2399f();
        layoutInflaterFactory2C0887z.m2456v();
        return layoutInflaterFactory2C0887z.f4456q.findViewById(i);
    }

    /* renamed from: g */
    public final void m2400g() {
        AbstractC0528K.m1368f(getWindow().getDecorView(), this);
        AbstractC1687o.m4928W(getWindow().getDecorView(), this);
        AbstractC1680h.m4854P(getWindow().getDecorView(), this);
    }

    /* renamed from: h */
    public final void m2401h(Bundle bundle) {
        m2399f().mo2418a();
        super.onCreate(bundle);
        m2399f().mo2419c();
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2399f();
        if (layoutInflaterFactory2C0887z.f4459t != null) {
            layoutInflaterFactory2C0887z.m2460z();
            layoutInflaterFactory2C0887z.f4459t.getClass();
            layoutInflaterFactory2C0887z.m2441A(0);
        }
    }

    /* renamed from: j */
    public final void m2402j(CharSequence charSequence) {
        super.setTitle(charSequence);
        m2399f().mo2425k(charSequence);
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02ac  */
    @Override // p052a.DialogC0473m, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        int i;
        int i2;
        boolean z2;
        int i3;
        boolean z3;
        AlertController$RecycleListView alertController$RecycleListView;
        AlertController$RecycleListView alertController$RecycleListView2;
        ListAdapter listAdapter;
        View findViewById;
        m2401h(bundle);
        C0866e c0866e = this.f4359k;
        c0866e.f4333b.setContentView(c0866e.f4350s);
        Window window = c0866e.f4334c;
        View findViewById2 = window.findViewById(R.id.parentPanel);
        View findViewById3 = findViewById2.findViewById(R.id.topPanel);
        View findViewById4 = findViewById2.findViewById(R.id.contentPanel);
        View findViewById5 = findViewById2.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.customPanel);
        View view = c0866e.f4337f;
        if (view == null) {
            view = null;
        }
        boolean z4 = view != null;
        if (!z4 || !C0866e.m2396a(view)) {
            window.setFlags(131072, 131072);
        }
        if (z4) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (c0866e.f4338g) {
                frameLayout.setPadding(0, 0, 0, 0);
            }
            if (c0866e.f4336e != null) {
                ((LinearLayout.LayoutParams) ((C1138r0) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById6 = viewGroup.findViewById(R.id.topPanel);
        View findViewById7 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById8 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup m2397b = C0866e.m2397b(findViewById6, findViewById3);
        ViewGroup m2397b2 = C0866e.m2397b(findViewById7, findViewById4);
        ViewGroup m2397b3 = C0866e.m2397b(findViewById8, findViewById5);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        c0866e.f4342k = nestedScrollView;
        nestedScrollView.setFocusable(false);
        c0866e.f4342k.setNestedScrollingEnabled(false);
        TextView textView = (TextView) m2397b2.findViewById(android.R.id.message);
        c0866e.f4346o = textView;
        if (textView != null) {
            textView.setVisibility(8);
            c0866e.f4342k.removeView(c0866e.f4346o);
            if (c0866e.f4336e != null) {
                ViewGroup viewGroup2 = (ViewGroup) c0866e.f4342k.getParent();
                int indexOfChild = viewGroup2.indexOfChild(c0866e.f4342k);
                viewGroup2.removeViewAt(indexOfChild);
                viewGroup2.addView(c0866e.f4336e, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            } else {
                m2397b2.setVisibility(8);
            }
        }
        Button button = (Button) m2397b3.findViewById(android.R.id.button1);
        c0866e.f4339h = button;
        ViewOnClickListenerC0669j viewOnClickListenerC0669j = c0866e.f4356y;
        button.setOnClickListener(viewOnClickListenerC0669j);
        if (TextUtils.isEmpty(null)) {
            c0866e.f4339h.setVisibility(8);
            i = 0;
        } else {
            c0866e.f4339h.setText((CharSequence) null);
            c0866e.f4339h.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) m2397b3.findViewById(android.R.id.button2);
        c0866e.f4340i = button2;
        button2.setOnClickListener(viewOnClickListenerC0669j);
        if (TextUtils.isEmpty(null)) {
            c0866e.f4340i.setVisibility(8);
        } else {
            c0866e.f4340i.setText((CharSequence) null);
            c0866e.f4340i.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) m2397b3.findViewById(android.R.id.button3);
        c0866e.f4341j = button3;
        button3.setOnClickListener(viewOnClickListenerC0669j);
        if (TextUtils.isEmpty(null)) {
            c0866e.f4341j.setVisibility(8);
        } else {
            c0866e.f4341j.setText((CharSequence) null);
            c0866e.f4341j.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        c0866e.f4332a.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i != 1) {
                i2 = 2;
                if (i == 2) {
                    Button button4 = c0866e.f4340i;
                    LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                    layoutParams.gravity = 1;
                    layoutParams.weight = 0.5f;
                    button4.setLayoutParams(layoutParams);
                } else if (i == 4) {
                    Button button5 = c0866e.f4341j;
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                    layoutParams2.gravity = 1;
                    layoutParams2.weight = 0.5f;
                    button5.setLayoutParams(layoutParams2);
                }
                if (i == 0) {
                    m2397b3.setVisibility(8);
                }
                if (c0866e.f4347p == null) {
                    m2397b.addView(c0866e.f4347p, 0, new ViewGroup.LayoutParams(-1, -2));
                    window.findViewById(R.id.title_template).setVisibility(8);
                } else {
                    c0866e.f4344m = (ImageView) window.findViewById(android.R.id.icon);
                    if (TextUtils.isEmpty(c0866e.f4335d) || !c0866e.f4354w) {
                        window.findViewById(R.id.title_template).setVisibility(8);
                        c0866e.f4344m.setVisibility(8);
                        m2397b.setVisibility(8);
                    } else {
                        TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                        c0866e.f4345n = textView2;
                        textView2.setText(c0866e.f4335d);
                        Drawable drawable = c0866e.f4343l;
                        if (drawable != null) {
                            c0866e.f4344m.setImageDrawable(drawable);
                        } else {
                            c0866e.f4345n.setPadding(c0866e.f4344m.getPaddingLeft(), c0866e.f4344m.getPaddingTop(), c0866e.f4344m.getPaddingRight(), c0866e.f4344m.getPaddingBottom());
                            c0866e.f4344m.setVisibility(8);
                        }
                    }
                }
                z2 = viewGroup.getVisibility() == 8;
                i3 = (m2397b != null || m2397b.getVisibility() == 8) ? 0 : 1;
                z3 = m2397b3.getVisibility() == 8;
                if (!z3 && (findViewById = m2397b2.findViewById(R.id.textSpacerNoButtons)) != null) {
                    findViewById.setVisibility(0);
                }
                if (i3 == 0) {
                    NestedScrollView nestedScrollView2 = c0866e.f4342k;
                    if (nestedScrollView2 != null) {
                        nestedScrollView2.setClipToPadding(true);
                    }
                    View findViewById9 = c0866e.f4336e != null ? m2397b.findViewById(R.id.titleDividerNoCustom) : null;
                    if (findViewById9 != null) {
                        findViewById9.setVisibility(0);
                    }
                } else {
                    View findViewById10 = m2397b2.findViewById(R.id.textSpacerNoTitle);
                    if (findViewById10 != null) {
                        findViewById10.setVisibility(0);
                    }
                }
                alertController$RecycleListView = c0866e.f4336e;
                if (alertController$RecycleListView != null) {
                    alertController$RecycleListView.getClass();
                    if (!z3 || i3 == 0) {
                        alertController$RecycleListView.setPadding(alertController$RecycleListView.getPaddingLeft(), i3 != 0 ? alertController$RecycleListView.getPaddingTop() : alertController$RecycleListView.f1681f, alertController$RecycleListView.getPaddingRight(), z3 ? alertController$RecycleListView.getPaddingBottom() : alertController$RecycleListView.f1682g);
                    }
                }
                if (!z2) {
                    View view2 = c0866e.f4336e;
                    if (view2 == null) {
                        view2 = c0866e.f4342k;
                    }
                    if (view2 != null) {
                        int i4 = i3 | (z3 ? i2 : 0);
                        View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                        View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
                        AbstractC0159G.m449d(view2, i4, 3);
                        if (findViewById11 != null) {
                            m2397b2.removeView(findViewById11);
                        }
                        if (findViewById12 != null) {
                            m2397b2.removeView(findViewById12);
                        }
                    }
                }
                alertController$RecycleListView2 = c0866e.f4336e;
                if (alertController$RecycleListView2 != null || (listAdapter = c0866e.f4348q) == null) {
                }
                alertController$RecycleListView2.setAdapter(listAdapter);
                int i5 = c0866e.f4349r;
                if (i5 > -1) {
                    alertController$RecycleListView2.setItemChecked(i5, true);
                    alertController$RecycleListView2.setSelection(i5);
                    return;
                }
                return;
            }
            Button button6 = c0866e.f4339h;
            LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
            layoutParams3.gravity = 1;
            layoutParams3.weight = 0.5f;
            button6.setLayoutParams(layoutParams3);
        }
        i2 = 2;
        if (i == 0) {
        }
        if (c0866e.f4347p == null) {
        }
        if (viewGroup.getVisibility() == 8) {
        }
        if (m2397b != null) {
        }
        if (m2397b3.getVisibility() == 8) {
        }
        if (!z3) {
            findViewById.setVisibility(0);
        }
        if (i3 == 0) {
        }
        alertController$RecycleListView = c0866e.f4336e;
        if (alertController$RecycleListView != null) {
        }
        if (!z2) {
        }
        alertController$RecycleListView2 = c0866e.f4336e;
        if (alertController$RecycleListView2 != null) {
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4359k.f4342k;
        if (nestedScrollView == null || !nestedScrollView.m1341i(keyEvent)) {
            return super.onKeyDown(i, keyEvent);
        }
        return true;
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f4359k.f4342k;
        if (nestedScrollView == null || !nestedScrollView.m1341i(keyEvent)) {
            return super.onKeyUp(i, keyEvent);
        }
        return true;
    }

    @Override // p052a.DialogC0473m, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflaterFactory2C0887z layoutInflaterFactory2C0887z = (LayoutInflaterFactory2C0887z) m2399f();
        layoutInflaterFactory2C0887z.m2460z();
        C0861J c0861j = layoutInflaterFactory2C0887z.f4459t;
        if (c0861j != null) {
            c0861j.f4313v = false;
            C0961j c0961j = c0861j.f4312u;
            if (c0961j != null) {
                c0961j.m2502a();
            }
        }
    }

    @Override // p052a.DialogC0473m, android.app.Dialog
    public final void setContentView(int i) {
        m2400g();
        m2399f().mo2422g(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        m2399f().mo2425k(getContext().getString(i));
    }

    @Override // p052a.DialogC0473m, android.app.Dialog
    public final void setContentView(View view) {
        m2400g();
        m2399f().mo2423h(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        m2402j(charSequence);
        C0866e c0866e = this.f4359k;
        c0866e.f4335d = charSequence;
        TextView textView = c0866e.f4345n;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // p052a.DialogC0473m, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m2400g();
        m2399f().mo2424i(view, layoutParams);
    }
}
