package p082l;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import p079k.C1015j;
import p079k.C1020o;
import p079k.MenuC1018m;

/* renamed from: l.E0 */
/* loaded from: classes.dex */
public final class C1058E0 extends C1130n0 {

    /* renamed from: r */
    public final int f5030r;

    /* renamed from: s */
    public final int f5031s;

    /* renamed from: t */
    public InterfaceC1052B0 f5032t;

    /* renamed from: u */
    public C1020o f5033u;

    public C1058E0(Context context, boolean z2) {
        super(context, z2);
        if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
            this.f5030r = 21;
            this.f5031s = 22;
        } else {
            this.f5030r = 22;
            this.f5031s = 21;
        }
    }

    @Override // p082l.C1130n0, android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        C1015j c1015j;
        int i;
        int pointToPosition;
        int i2;
        if (this.f5032t != null) {
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                i = headerViewListAdapter.getHeadersCount();
                c1015j = (C1015j) headerViewListAdapter.getWrappedAdapter();
            } else {
                c1015j = (C1015j) adapter;
                i = 0;
            }
            C1020o item = (motionEvent.getAction() == 10 || (pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i2 = pointToPosition - i) < 0 || i2 >= c1015j.getCount()) ? null : c1015j.getItem(i2);
            C1020o c1020o = this.f5033u;
            if (c1020o != item) {
                MenuC1018m menuC1018m = c1015j.f4822a;
                if (c1020o != null) {
                    this.f5032t.mo1879r(menuC1018m, c1020o);
                }
                this.f5033u = item;
                if (item != null) {
                    this.f5032t.mo1876c(menuC1018m, item);
                }
            }
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
        if (listMenuItemView != null && i == this.f5030r) {
            if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
            }
            return true;
        }
        if (listMenuItemView == null || i != this.f5031s) {
            return super.onKeyDown(i, keyEvent);
        }
        setSelection(-1);
        ListAdapter adapter = getAdapter();
        (adapter instanceof HeaderViewListAdapter ? (C1015j) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C1015j) adapter).f4822a.m2615c(false);
        return true;
    }

    public void setHoverListener(InterfaceC1052B0 interfaceC1052B0) {
        this.f5032t = interfaceC1052B0;
    }

    @Override // p082l.C1130n0, android.widget.AbsListView
    public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
        super.setSelector(drawable);
    }
}
