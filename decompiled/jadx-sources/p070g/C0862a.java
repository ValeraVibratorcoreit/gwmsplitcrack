package p070g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* renamed from: g.a */
/* loaded from: classes.dex */
public final class C0862a implements AdapterView.OnItemClickListener {

    /* renamed from: f */
    public final /* synthetic */ C0866e f4318f;

    /* renamed from: g */
    public final /* synthetic */ C0863b f4319g;

    public C0862a(C0863b c0863b, C0866e c0866e) {
        this.f4319g = c0863b;
        this.f4318f = c0866e;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j2) {
        C0863b c0863b = this.f4319g;
        DialogInterface.OnClickListener onClickListener = c0863b.f4327h;
        C0866e c0866e = this.f4318f;
        onClickListener.onClick(c0866e.f4333b, i);
        if (c0863b.f4329j) {
            return;
        }
        c0866e.f4333b.dismiss();
    }
}
