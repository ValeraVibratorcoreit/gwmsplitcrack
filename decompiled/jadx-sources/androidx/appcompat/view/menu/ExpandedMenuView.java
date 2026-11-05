package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import p022K.C0198k;
import p079k.C1020o;
import p079k.InterfaceC1001A;
import p079k.InterfaceC1017l;
import p079k.MenuC1018m;

/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC1017l, InterfaceC1001A, AdapterView.OnItemClickListener {

    /* renamed from: g */
    public static final int[] f1694g = {R.attr.background, R.attr.divider};

    /* renamed from: f */
    public MenuC1018m f1695f;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0198k m591r = C0198k.m591r(context, attributeSet, f1694g, R.attr.listViewStyle);
        TypedArray typedArray = (TypedArray) m591r.f534c;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(m591r.m598h(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(m591r.m598h(1));
        }
        m591r.m609t();
    }

    @Override // p079k.InterfaceC1017l
    /* renamed from: a */
    public final boolean mo1262a(C1020o c1020o) {
        return this.f1695f.m2621q(c1020o, null, 0);
    }

    @Override // p079k.InterfaceC1001A
    /* renamed from: c */
    public final void mo1263c(MenuC1018m menuC1018m) {
        this.f1695f = menuC1018m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        mo1262a((C1020o) getAdapter().getItem(i));
    }
}
