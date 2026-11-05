package p054a1;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import java.util.WeakHashMap;
import p006C.AbstractC0055c;
import p008D.AbstractC0070a;
import p022K.AbstractC0169Q;

/* renamed from: a1.u */
/* loaded from: classes.dex */
public final class C0512u extends ArrayAdapter {

    /* renamed from: a */
    public ColorStateList f1653a;

    /* renamed from: b */
    public ColorStateList f1654b;

    /* renamed from: c */
    public final /* synthetic */ C0513v f1655c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0512u(C0513v c0513v, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.f1655c = c0513v;
        m1248a();
    }

    /* renamed from: a */
    public final void m1248a() {
        ColorStateList colorStateList;
        C0513v c0513v = this.f1655c;
        ColorStateList colorStateList2 = c0513v.f1663q;
        ColorStateList colorStateList3 = null;
        if (colorStateList2 != null) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.f1654b = colorStateList;
        if (c0513v.f1662p != 0 && c0513v.f1663q != null) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{AbstractC0055c.m105b(c0513v.f1663q.getColorForState(iArr3, 0), c0513v.f1662p), AbstractC0055c.m105b(c0513v.f1663q.getColorForState(iArr2, 0), c0513v.f1662p), c0513v.f1662p});
        }
        this.f1653a = colorStateList3;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            C0513v c0513v = this.f1655c;
            Drawable drawable = null;
            if (c0513v.getText().toString().contentEquals(textView.getText()) && c0513v.f1662p != 0) {
                ColorDrawable colorDrawable = new ColorDrawable(c0513v.f1662p);
                if (this.f1654b != null) {
                    AbstractC0070a.m206h(colorDrawable, this.f1653a);
                    drawable = new RippleDrawable(this.f1654b, colorDrawable, null);
                } else {
                    drawable = colorDrawable;
                }
            }
            WeakHashMap weakHashMap = AbstractC0169Q.f475a;
            textView.setBackground(drawable);
        }
        return view2;
    }
}
