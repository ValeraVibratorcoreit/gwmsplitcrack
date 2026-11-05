package p054a1;

import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.view.View;
import android.widget.AdapterView;
import com.altaysoft.t500_split.AppsList;
import p082l.C1050A0;
import p082l.C1073M;
import p082l.C1079P;

/* renamed from: a1.t */
/* loaded from: classes.dex */
public final class C0511t implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f1651f;

    /* renamed from: g */
    public final /* synthetic */ Object f1652g;

    public /* synthetic */ C0511t(int i, Object obj) {
        this.f1651f = i;
        this.f1652g = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        Object item;
        switch (this.f1651f) {
            case 0:
                C0513v c0513v = (C0513v) this.f1652g;
                if (i < 0) {
                    C1050A0 c1050a0 = c0513v.f1656j;
                    item = !c1050a0.f4999E.isShowing() ? null : c1050a0.f5002h.getSelectedItem();
                } else {
                    item = c0513v.getAdapter().getItem(i);
                }
                C0513v.m1249a(c0513v, item);
                AdapterView.OnItemClickListener onItemClickListener = c0513v.getOnItemClickListener();
                C1050A0 c1050a02 = c0513v.f1656j;
                if (onItemClickListener != null) {
                    if (view == null || i < 0) {
                        view = c1050a02.f4999E.isShowing() ? c1050a02.f5002h.getSelectedView() : null;
                        i = !c1050a02.f4999E.isShowing() ? -1 : c1050a02.f5002h.getSelectedItemPosition();
                        j2 = !c1050a02.f4999E.isShowing() ? Long.MIN_VALUE : c1050a02.f5002h.getSelectedItemId();
                    }
                    onItemClickListener.onItemClick(c1050a02.f5002h, view, i, j2);
                }
                c1050a02.dismiss();
                break;
            case 1:
                C1073M c1073m = (C1073M) this.f1652g;
                c1073m.f5073L.setSelection(i);
                C1079P c1079p = c1073m.f5073L;
                if (c1079p.getOnItemClickListener() != null) {
                    c1079p.performItemClick(view, i, c1073m.f5070I.getItemId(i));
                }
                c1073m.dismiss();
                break;
            default:
                AppsList appsList = (AppsList) this.f1652g;
                Intent launchIntentForPackage = appsList.getPackageManager().getLaunchIntentForPackage(((ApplicationInfo) appsList.f2261F.get(i)).packageName);
                if (launchIntentForPackage != null) {
                    appsList.startActivity(launchIntentForPackage);
                    break;
                }
                break;
        }
    }
}
