package p079k;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* renamed from: k.j */
/* loaded from: classes.dex */
public final class C1015j extends BaseAdapter {

    /* renamed from: a */
    public final MenuC1018m f4822a;

    /* renamed from: b */
    public int f4823b = -1;

    /* renamed from: c */
    public boolean f4824c;

    /* renamed from: d */
    public final boolean f4825d;

    /* renamed from: e */
    public final LayoutInflater f4826e;

    /* renamed from: f */
    public final int f4827f;

    public C1015j(MenuC1018m menuC1018m, LayoutInflater layoutInflater, boolean z2, int i) {
        this.f4825d = z2;
        this.f4826e = layoutInflater;
        this.f4822a = menuC1018m;
        this.f4827f = i;
        m2611a();
    }

    /* renamed from: a */
    public final void m2611a() {
        MenuC1018m menuC1018m = this.f4822a;
        C1020o c1020o = menuC1018m.f4850v;
        if (c1020o != null) {
            menuC1018m.m2618i();
            ArrayList arrayList = menuC1018m.f4838j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1020o) arrayList.get(i)) == c1020o) {
                    this.f4823b = i;
                    return;
                }
            }
        }
        this.f4823b = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1020o getItem(int i) {
        ArrayList m2619l;
        MenuC1018m menuC1018m = this.f4822a;
        if (this.f4825d) {
            menuC1018m.m2618i();
            m2619l = menuC1018m.f4838j;
        } else {
            m2619l = menuC1018m.m2619l();
        }
        int i2 = this.f4823b;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1020o) m2619l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList m2619l;
        MenuC1018m menuC1018m = this.f4822a;
        if (this.f4825d) {
            menuC1018m.m2618i();
            m2619l = menuC1018m.f4838j;
        } else {
            m2619l = menuC1018m.m2619l();
        }
        return this.f4823b < 0 ? m2619l.size() : m2619l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z2 = false;
        if (view == null) {
            view = this.f4826e.inflate(this.f4827f, viewGroup, false);
        }
        int i2 = getItem(i).f4860b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).f4860b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f4822a.mo2598m() && i2 != i4) {
            z2 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z2);
        InterfaceC1031z interfaceC1031z = (InterfaceC1031z) view;
        if (this.f4824c) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC1031z.mo1258b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2611a();
        super.notifyDataSetChanged();
    }
}
