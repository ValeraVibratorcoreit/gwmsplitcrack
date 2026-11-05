package p082l;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import p016H.C0117i;
import p070g.C0863b;
import p070g.DialogInterfaceC0867f;

/* renamed from: l.J */
/* loaded from: classes.dex */
public final class DialogInterfaceOnClickListenerC1067J implements InterfaceC1077O, DialogInterface.OnClickListener {

    /* renamed from: f */
    public DialogInterfaceC0867f f5053f;

    /* renamed from: g */
    public C1069K f5054g;

    /* renamed from: h */
    public CharSequence f5055h;

    /* renamed from: i */
    public final /* synthetic */ C1079P f5056i;

    public DialogInterfaceOnClickListenerC1067J(C1079P c1079p) {
        this.f5056i = c1079p;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: a */
    public final void mo2677a(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: b */
    public final boolean mo2678b() {
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f5053f;
        if (dialogInterfaceC0867f != null) {
            return dialogInterfaceC0867f.isShowing();
        }
        return false;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: d */
    public final int mo2679d() {
        return 0;
    }

    @Override // p082l.InterfaceC1077O
    public final void dismiss() {
        DialogInterfaceC0867f dialogInterfaceC0867f = this.f5053f;
        if (dialogInterfaceC0867f != null) {
            dialogInterfaceC0867f.dismiss();
            this.f5053f = null;
        }
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: e */
    public final void mo2680e(int i, int i2) {
        if (this.f5054g == null) {
            return;
        }
        C1079P c1079p = this.f5056i;
        C0117i c0117i = new C0117i(c1079p.getPopupContext());
        CharSequence charSequence = this.f5055h;
        C0863b c0863b = (C0863b) c0117i.f369g;
        if (charSequence != null) {
            c0863b.f4323d = charSequence;
        }
        C1069K c1069k = this.f5054g;
        int selectedItemPosition = c1079p.getSelectedItemPosition();
        c0863b.f4326g = c1069k;
        c0863b.f4327h = this;
        c0863b.f4330k = selectedItemPosition;
        c0863b.f4329j = true;
        DialogInterfaceC0867f m365a = c0117i.m365a();
        this.f5053f = m365a;
        AlertController$RecycleListView alertController$RecycleListView = m365a.f4359k.f4336e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.f5053f.show();
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: g */
    public final int mo2681g() {
        return 0;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: h */
    public final Drawable mo2682h() {
        return null;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: i */
    public final CharSequence mo2683i() {
        return this.f5055h;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: k */
    public final void mo2684k(CharSequence charSequence) {
        this.f5055h = charSequence;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: l */
    public final void mo2685l(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: m */
    public final void mo2686m(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: n */
    public final void mo2651n(ListAdapter listAdapter) {
        this.f5054g = (C1069K) listAdapter;
    }

    @Override // p082l.InterfaceC1077O
    /* renamed from: o */
    public final void mo2687o(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C1079P c1079p = this.f5056i;
        c1079p.setSelection(i);
        if (c1079p.getOnItemClickListener() != null) {
            c1079p.performItemClick(null, i, this.f5054g.getItemId(i));
        }
        dismiss();
    }
}
