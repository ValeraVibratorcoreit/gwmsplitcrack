package p079k;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* renamed from: k.u */
/* loaded from: classes.dex */
public abstract class AbstractC1026u implements InterfaceC1003C, InterfaceC1030y, AdapterView.OnItemClickListener {

    /* renamed from: f */
    public Rect f4895f;

    /* renamed from: m */
    public static int m2633m(ListAdapter listAdapter, Context context, int i) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i2 = 0;
        int i3 = 0;
        FrameLayout frameLayout = null;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = listAdapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (frameLayout == null) {
                frameLayout = new FrameLayout(context);
            }
            view = listAdapter.getView(i4, view, frameLayout);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i) {
                return i;
            }
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        return i2;
    }

    /* renamed from: u */
    public static boolean m2634u(MenuC1018m menuC1018m) {
        int size = menuC1018m.f4834f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = menuC1018m.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: c */
    public final boolean mo2608c(C1020o c1020o) {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: e */
    public final boolean mo2609e(C1020o c1020o) {
        return false;
    }

    @Override // p079k.InterfaceC1030y
    /* renamed from: g */
    public final void mo2610g(Context context, MenuC1018m menuC1018m) {
    }

    /* renamed from: l */
    public abstract void mo2585l(MenuC1018m menuC1018m);

    /* renamed from: n */
    public abstract void mo2586n(View view);

    /* renamed from: o */
    public abstract void mo2587o(boolean z2);

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        (listAdapter instanceof HeaderViewListAdapter ? (C1015j) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (C1015j) listAdapter).f4822a.m2621q((MenuItem) listAdapter.getItem(i), this, !(this instanceof ViewOnKeyListenerC1012g) ? 0 : 4);
    }

    /* renamed from: p */
    public abstract void mo2588p(int i);

    /* renamed from: q */
    public abstract void mo2589q(int i);

    /* renamed from: r */
    public abstract void mo2590r(PopupWindow.OnDismissListener onDismissListener);

    /* renamed from: s */
    public abstract void mo2591s(boolean z2);

    /* renamed from: t */
    public abstract void mo2592t(int i);
}
