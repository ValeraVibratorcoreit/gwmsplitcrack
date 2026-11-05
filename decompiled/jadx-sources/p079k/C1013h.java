package p079k;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.altaysoft.t500_split.R;
import java.util.ArrayList;

/* renamed from: k.h */
/* loaded from: classes.dex */
public final class C1013h extends BaseAdapter {

    /* renamed from: a */
    public int f4814a = -1;

    /* renamed from: b */
    public final /* synthetic */ C1014i f4815b;

    public C1013h(C1014i c1014i) {
        this.f4815b = c1014i;
        m2606a();
    }

    /* renamed from: a */
    public final void m2606a() {
        MenuC1018m menuC1018m = this.f4815b.f4818h;
        C1020o c1020o = menuC1018m.f4850v;
        if (c1020o != null) {
            menuC1018m.m2618i();
            ArrayList arrayList = menuC1018m.f4838j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((C1020o) arrayList.get(i)) == c1020o) {
                    this.f4814a = i;
                    return;
                }
            }
        }
        this.f4814a = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final C1020o getItem(int i) {
        C1014i c1014i = this.f4815b;
        MenuC1018m menuC1018m = c1014i.f4818h;
        menuC1018m.m2618i();
        ArrayList arrayList = menuC1018m.f4838j;
        c1014i.getClass();
        int i2 = this.f4814a;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (C1020o) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        C1014i c1014i = this.f4815b;
        MenuC1018m menuC1018m = c1014i.f4818h;
        menuC1018m.m2618i();
        int size = menuC1018m.f4838j.size();
        c1014i.getClass();
        return this.f4814a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f4815b.f4817g.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((InterfaceC1031z) view).mo1258b(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        m2606a();
        super.notifyDataSetChanged();
    }
}
