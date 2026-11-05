package p079k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.media.C0639g;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import p046X.ViewOnAttachStateChangeListenerC0393V;
import p082l.AbstractC1054C0;
import p082l.AbstractC1056D0;
import p082l.C1049A;
import p082l.C1060F0;
import p082l.C1130n0;

/* renamed from: k.g */
/* loaded from: classes.dex */
public final class ViewOnKeyListenerC1012g extends AbstractC1026u implements View.OnKeyListener, PopupWindow.OnDismissListener {

    /* renamed from: A */
    public boolean f4789A;

    /* renamed from: B */
    public InterfaceC1029x f4790B;

    /* renamed from: C */
    public ViewTreeObserver f4791C;

    /* renamed from: D */
    public C1027v f4792D;

    /* renamed from: E */
    public boolean f4793E;

    /* renamed from: g */
    public final Context f4794g;

    /* renamed from: h */
    public final int f4795h;

    /* renamed from: i */
    public final int f4796i;

    /* renamed from: j */
    public final boolean f4797j;

    /* renamed from: k */
    public final Handler f4798k;

    /* renamed from: s */
    public View f4806s;

    /* renamed from: t */
    public View f4807t;

    /* renamed from: u */
    public int f4808u;

    /* renamed from: v */
    public boolean f4809v;

    /* renamed from: w */
    public boolean f4810w;

    /* renamed from: x */
    public int f4811x;

    /* renamed from: y */
    public int f4812y;

    /* renamed from: l */
    public final ArrayList f4799l = new ArrayList();

    /* renamed from: m */
    public final ArrayList f4800m = new ArrayList();

    /* renamed from: n */
    public final ViewTreeObserverOnGlobalLayoutListenerC1009d f4801n = new ViewTreeObserverOnGlobalLayoutListenerC1009d(0, this);

    /* renamed from: o */
    public final ViewOnAttachStateChangeListenerC0393V f4802o = new ViewOnAttachStateChangeListenerC0393V(2, this);

    /* renamed from: p */
    public final C0639g f4803p = new C0639g(25, this);

    /* renamed from: q */
    public int f4804q = 0;

    /* renamed from: r */
    public int f4805r = 0;

    /* renamed from: z */
    public boolean f4813z = false;

    public ViewOnKeyListenerC1012g(Context context, View view, int i, boolean z2) {
        this.f4794g = context;
        this.f4806s = view;
        this.f4796i = i;
        this.f4797j = z2;
        this.f4808u = view.getLayoutDirection() != 1 ? 1 : 0;
        Resources resources = context.getResources();
        this.f4795h = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.f4798k = new Handler();
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: a */
    public final void mo2580a(MenuC1018m menuC1018m, boolean z2) {
        ArrayList arrayList = this.f4800m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                i = -1;
                break;
            } else if (menuC1018m == ((C1011f) arrayList.get(i)).f4787b) {
                break;
            } else {
                i++;
            }
        }
        if (i < 0) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ((C1011f) arrayList.get(i2)).f4787b.m2615c(false);
        }
        C1011f c1011f = (C1011f) arrayList.remove(i);
        c1011f.f4787b.m2622r(this);
        boolean z3 = this.f4793E;
        C1060F0 c1060f0 = c1011f.f4786a;
        if (z3) {
            AbstractC1054C0.m2663b(c1060f0.f4999E, null);
            c1060f0.f4999E.setAnimationStyle(0);
        }
        c1060f0.dismiss();
        int size2 = arrayList.size();
        if (size2 > 0) {
            this.f4808u = ((C1011f) arrayList.get(size2 - 1)).f4788c;
        } else {
            this.f4808u = this.f4806s.getLayoutDirection() == 1 ? 0 : 1;
        }
        if (size2 != 0) {
            if (z2) {
                ((C1011f) arrayList.get(0)).f4787b.m2615c(false);
                return;
            }
            return;
        }
        dismiss();
        InterfaceC1029x interfaceC1029x = this.f4790B;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1874a(menuC1018m, true);
        }
        ViewTreeObserver viewTreeObserver = this.f4791C;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f4791C.removeGlobalOnLayoutListener(this.f4801n);
            }
            this.f4791C = null;
        }
        this.f4807t.removeOnAttachStateChangeListener(this.f4802o);
        this.f4792D.onDismiss();
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: b */
    public final boolean mo2577b() {
        ArrayList arrayList = this.f4800m;
        return arrayList.size() > 0 && ((C1011f) arrayList.get(0)).f4786a.f4999E.isShowing();
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: d */
    public final boolean mo2581d(SubMenuC1005E subMenuC1005E) {
        Iterator it = this.f4800m.iterator();
        while (it.hasNext()) {
            C1011f c1011f = (C1011f) it.next();
            if (subMenuC1005E == c1011f.f4787b) {
                c1011f.f4786a.f5002h.requestFocus();
                return true;
            }
        }
        if (!subMenuC1005E.hasVisibleItems()) {
            return false;
        }
        mo2585l(subMenuC1005E);
        InterfaceC1029x interfaceC1029x = this.f4790B;
        if (interfaceC1029x != null) {
            interfaceC1029x.mo1875b(subMenuC1005E);
        }
        return true;
    }

    @Override // p079k.InterfaceC1003C
    public final void dismiss() {
        ArrayList arrayList = this.f4800m;
        int size = arrayList.size();
        if (size > 0) {
            C1011f[] c1011fArr = (C1011f[]) arrayList.toArray(new C1011f[size]);
            for (int i = size - 1; i >= 0; i--) {
                C1011f c1011f = c1011fArr[i];
                if (c1011f.f4786a.f4999E.isShowing()) {
                    c1011f.f4786a.dismiss();
                }
            }
        }
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: f */
    public final void mo2578f() {
        if (mo2577b()) {
            return;
        }
        ArrayList arrayList = this.f4799l;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            m2605v((MenuC1018m) it.next());
        }
        arrayList.clear();
        View view = this.f4806s;
        this.f4807t = view;
        if (view != null) {
            boolean z2 = this.f4791C == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f4791C = viewTreeObserver;
            if (z2) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f4801n);
            }
            this.f4807t.addOnAttachStateChangeListener(this.f4802o);
        }
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: h */
    public final boolean mo2582h() {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: i */
    public final void mo2583i() {
        Iterator it = this.f4800m.iterator();
        while (it.hasNext()) {
            ListAdapter adapter = ((C1011f) it.next()).f4786a.f5002h.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((C1015j) adapter).notifyDataSetChanged();
        }
    }

    @Override // p079k.InterfaceC1003C
    /* renamed from: j */
    public final C1130n0 mo2579j() {
        ArrayList arrayList = this.f4800m;
        if (arrayList.isEmpty()) {
            return null;
        }
        return ((C1011f) arrayList.get(arrayList.size() - 1)).f4786a.f5002h;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: k */
    public final void mo2584k(InterfaceC1029x interfaceC1029x) {
        this.f4790B = interfaceC1029x;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: l */
    public final void mo2585l(MenuC1018m menuC1018m) {
        menuC1018m.m2614b(this, this.f4794g);
        if (mo2577b()) {
            m2605v(menuC1018m);
        } else {
            this.f4799l.add(menuC1018m);
        }
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: n */
    public final void mo2586n(View view) {
        if (this.f4806s != view) {
            this.f4806s = view;
            this.f4805r = Gravity.getAbsoluteGravity(this.f4804q, view.getLayoutDirection());
        }
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: o */
    public final void mo2587o(boolean z2) {
        this.f4813z = z2;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        C1011f c1011f;
        ArrayList arrayList = this.f4800m;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                c1011f = null;
                break;
            }
            c1011f = (C1011f) arrayList.get(i);
            if (!c1011f.f4786a.f4999E.isShowing()) {
                break;
            } else {
                i++;
            }
        }
        if (c1011f != null) {
            c1011f.f4787b.m2615c(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: p */
    public final void mo2588p(int i) {
        if (this.f4804q != i) {
            this.f4804q = i;
            this.f4805r = Gravity.getAbsoluteGravity(i, this.f4806s.getLayoutDirection());
        }
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: q */
    public final void mo2589q(int i) {
        this.f4809v = true;
        this.f4811x = i;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: r */
    public final void mo2590r(PopupWindow.OnDismissListener onDismissListener) {
        this.f4792D = (C1027v) onDismissListener;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: s */
    public final void mo2591s(boolean z2) {
        this.f4789A = z2;
    }

    @Override // p079k.AbstractC1026u
    /* renamed from: t */
    public final void mo2592t(int i) {
        this.f4810w = true;
        this.f4812y = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x013f, code lost:
    
        if (((r8.getWidth() + r9[0]) + r5) > r11.right) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0141, code lost:
    
        r9 = 0;
        r8 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0144, code lost:
    
        r8 = 1;
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if ((r9[0] - r5) < 0) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a  */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m2605v(MenuC1018m menuC1018m) {
        C1011f c1011f;
        View view;
        int i;
        int i2;
        MenuItem menuItem;
        C1015j c1015j;
        int i3;
        int firstVisiblePosition;
        Context context = this.f4794g;
        LayoutInflater from = LayoutInflater.from(context);
        C1015j c1015j2 = new C1015j(menuC1018m, from, this.f4797j, R.layout.abc_cascading_menu_item_layout);
        if (!mo2577b() && this.f4813z) {
            c1015j2.f4824c = true;
        } else if (mo2577b()) {
            c1015j2.f4824c = AbstractC1026u.m2634u(menuC1018m);
        }
        int m2633m = AbstractC1026u.m2633m(c1015j2, context, this.f4795h);
        C1060F0 c1060f0 = new C1060F0(context, null, this.f4796i);
        c1060f0.f5036H = this.f4803p;
        c1060f0.f5015u = this;
        c1060f0.f4999E.setOnDismissListener(this);
        c1060f0.f5014t = this.f4806s;
        c1060f0.f5011q = this.f4805r;
        c1060f0.f4998D = true;
        c1060f0.f4999E.setFocusable(true);
        c1060f0.f4999E.setInputMethodMode(2);
        c1060f0.mo2651n(c1015j2);
        c1060f0.m2653q(m2633m);
        c1060f0.f5011q = this.f4805r;
        ArrayList arrayList = this.f4800m;
        if (arrayList.size() > 0) {
            c1011f = (C1011f) arrayList.get(arrayList.size() - 1);
            MenuC1018m menuC1018m2 = c1011f.f4787b;
            int size = menuC1018m2.f4834f.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size) {
                    menuItem = null;
                    break;
                }
                menuItem = menuC1018m2.getItem(i4);
                if (menuItem.hasSubMenu() && menuC1018m == menuItem.getSubMenu()) {
                    break;
                } else {
                    i4++;
                }
            }
            if (menuItem == null) {
                view = null;
            } else {
                C1130n0 c1130n0 = c1011f.f4786a.f5002h;
                ListAdapter adapter = c1130n0.getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    i3 = headerViewListAdapter.getHeadersCount();
                    c1015j = (C1015j) headerViewListAdapter.getWrappedAdapter();
                } else {
                    c1015j = (C1015j) adapter;
                    i3 = 0;
                }
                int count = c1015j.getCount();
                int i5 = 0;
                while (true) {
                    if (i5 >= count) {
                        i5 = -1;
                        break;
                    } else if (menuItem == c1015j.getItem(i5)) {
                        break;
                    } else {
                        i5++;
                    }
                }
                if (i5 != -1 && (firstVisiblePosition = (i5 + i3) - c1130n0.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < c1130n0.getChildCount()) {
                    view = c1130n0.getChildAt(firstVisiblePosition);
                }
            }
            if (view == null) {
                int i6 = Build.VERSION.SDK_INT;
                C1049A c1049a = c1060f0.f4999E;
                if (i6 <= 28) {
                    Method method = C1060F0.f5035I;
                    if (method != null) {
                        try {
                            method.invoke(c1049a, Boolean.FALSE);
                        } catch (Exception unused) {
                            Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
                        }
                    }
                } else {
                    AbstractC1056D0.m2664a(c1049a, false);
                }
                AbstractC1054C0.m2662a(c1060f0.f4999E, null);
                C1130n0 c1130n02 = ((C1011f) arrayList.get(arrayList.size() - 1)).f4786a.f5002h;
                int[] iArr = new int[2];
                c1130n02.getLocationOnScreen(iArr);
                Rect rect = new Rect();
                this.f4807t.getWindowVisibleDisplayFrame(rect);
                if (this.f4808u == 1) {
                }
                boolean z2 = i2 == i;
                this.f4808u = i2;
                c1060f0.f5014t = view;
                if ((this.f4805r & 5) != 5) {
                    m2633m = z2 ? view.getWidth() : 0 - m2633m;
                } else if (!z2) {
                    m2633m = 0 - view.getWidth();
                }
                c1060f0.f5005k = m2633m;
                c1060f0.f5010p = true;
                c1060f0.f5009o = true;
                c1060f0.m2650m(0);
            } else {
                if (this.f4809v) {
                    c1060f0.f5005k = this.f4811x;
                }
                if (this.f4810w) {
                    c1060f0.m2650m(this.f4812y);
                }
                Rect rect2 = this.f4895f;
                c1060f0.f4997C = rect2 != null ? new Rect(rect2) : null;
            }
            arrayList.add(new C1011f(c1060f0, menuC1018m, this.f4808u));
            c1060f0.mo2578f();
            C1130n0 c1130n03 = c1060f0.f5002h;
            c1130n03.setOnKeyListener(this);
            if (c1011f == null || !this.f4789A || menuC1018m.f4841m == null) {
                return;
            }
            FrameLayout frameLayout = (FrameLayout) from.inflate(R.layout.abc_popup_menu_header_item_layout, (ViewGroup) c1130n03, false);
            TextView textView = (TextView) frameLayout.findViewById(android.R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(menuC1018m.f4841m);
            c1130n03.addHeaderView(frameLayout, null, false);
            c1060f0.mo2578f();
            return;
        }
        c1011f = null;
        view = null;
        if (view == null) {
        }
        arrayList.add(new C1011f(c1060f0, menuC1018m, this.f4808u));
        c1060f0.mo2578f();
        C1130n0 c1130n032 = c1060f0.f5002h;
        c1130n032.setOnKeyListener(this);
        if (c1011f == null) {
        }
    }
}
