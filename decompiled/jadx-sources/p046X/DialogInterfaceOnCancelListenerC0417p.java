package p046X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC0528K;
import com.altaysoft.t500_split.R;
import p001A0.RunnableC0020n;
import p006C.AbstractC0062j;
import p052a.DialogC0473m;
import p070g.AbstractActivityC0870i;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: X.p */
/* loaded from: classes.dex */
public class DialogInterfaceOnCancelListenerC0417p extends AbstractComponentCallbacksC0423v implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: Z */
    public final DialogInterfaceOnCancelListenerC0413l f1304Z;

    /* renamed from: a0 */
    public final DialogInterfaceOnDismissListenerC0414m f1305a0;

    /* renamed from: b0 */
    public int f1306b0;

    /* renamed from: c0 */
    public int f1307c0;

    /* renamed from: d0 */
    public boolean f1308d0;

    /* renamed from: e0 */
    public boolean f1309e0;

    /* renamed from: f0 */
    public int f1310f0;

    /* renamed from: g0 */
    public boolean f1311g0;

    /* renamed from: h0 */
    public final C0415n f1312h0;

    /* renamed from: i0 */
    public Dialog f1313i0;

    /* renamed from: j0 */
    public boolean f1314j0;

    /* renamed from: k0 */
    public boolean f1315k0;

    /* renamed from: l0 */
    public boolean f1316l0;

    /* renamed from: m0 */
    public boolean f1317m0;

    public DialogInterfaceOnCancelListenerC0417p() {
        new RunnableC0020n(4, this);
        this.f1304Z = new DialogInterfaceOnCancelListenerC0413l(this);
        this.f1305a0 = new DialogInterfaceOnDismissListenerC0414m(this);
        this.f1306b0 = 0;
        this.f1307c0 = 0;
        this.f1308d0 = true;
        this.f1309e0 = true;
        this.f1310f0 = -1;
        this.f1312h0 = new C0415n(this);
        this.f1317m0 = false;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: A */
    public final void mo1103A() {
        this.f1340H = true;
        if (!this.f1316l0 && !this.f1315k0) {
            this.f1315k0 = true;
        }
        this.f1353U.m1399h(this.f1312h0);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:10:0x001a, B:12:0x0026, B:18:0x003e, B:20:0x0046, B:21:0x0050, B:23:0x0030, B:25:0x0036, B:26:0x003b, B:27:0x0068), top: B:9:0x001a }] */
    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: B */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LayoutInflater mo1104B(Bundle bundle) {
        Context m1126i;
        LayoutInflater mo1104B = super.mo1104B(bundle);
        boolean z2 = this.f1309e0;
        if (!z2 || this.f1311g0) {
            if (Log.isLoggable("FragmentManager", 2)) {
                String str = "getting layout inflater for DialogFragment " + this;
                if (this.f1309e0) {
                    Log.d("FragmentManager", "mCreatingDialog = true: " + str);
                } else {
                    Log.d("FragmentManager", "mShowsDialog = false: " + str);
                }
            }
            return mo1104B;
        }
        if (z2 && !this.f1317m0) {
            try {
                this.f1311g0 = true;
                Dialog mo1110O = mo1110O();
                this.f1313i0 = mo1110O;
                if (this.f1309e0) {
                    int i = this.f1306b0;
                    if (i != 1 && i != 2) {
                        if (i == 3) {
                            Window window = mo1110O.getWindow();
                            if (window != null) {
                                window.addFlags(24);
                            }
                        } else {
                            m1126i = m1126i();
                            if (m1126i instanceof Activity) {
                                this.f1313i0.setOwnerActivity((Activity) m1126i);
                            }
                            this.f1313i0.setCancelable(this.f1308d0);
                            this.f1313i0.setOnCancelListener(this.f1304Z);
                            this.f1313i0.setOnDismissListener(this.f1305a0);
                            this.f1317m0 = true;
                        }
                    }
                    mo1110O.requestWindowFeature(1);
                    m1126i = m1126i();
                    if (m1126i instanceof Activity) {
                    }
                    this.f1313i0.setCancelable(this.f1308d0);
                    this.f1313i0.setOnCancelListener(this.f1304Z);
                    this.f1313i0.setOnDismissListener(this.f1305a0);
                    this.f1317m0 = true;
                } else {
                    this.f1313i0 = null;
                }
                this.f1311g0 = false;
            } catch (Throwable th) {
                this.f1311g0 = false;
                throw th;
            }
        }
        if (Log.isLoggable("FragmentManager", 2)) {
            Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
        }
        Dialog dialog = this.f1313i0;
        return dialog != null ? mo1104B.cloneInContext(dialog.getContext()) : mo1104B;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: E */
    public void mo1105E(Bundle bundle) {
        Dialog dialog = this.f1313i0;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.f1306b0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.f1307c0;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z2 = this.f1308d0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z3 = this.f1309e0;
        if (!z3) {
            bundle.putBoolean("android:showsDialog", z3);
        }
        int i3 = this.f1310f0;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: F */
    public void mo1106F() {
        this.f1340H = true;
        Dialog dialog = this.f1313i0;
        if (dialog != null) {
            this.f1314j0 = false;
            dialog.show();
            View decorView = this.f1313i0.getWindow().getDecorView();
            AbstractC0528K.m1368f(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC1687o.m4928W(decorView, this);
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: G */
    public void mo1107G() {
        this.f1340H = true;
        Dialog dialog = this.f1313i0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: H */
    public final void mo1108H(Bundle bundle) {
        Bundle bundle2;
        this.f1340H = true;
        if (this.f1313i0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1313i0.onRestoreInstanceState(bundle2);
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: I */
    public final void mo1109I(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.mo1109I(layoutInflater, viewGroup, bundle);
        if (this.f1342J != null || this.f1313i0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.f1313i0.onRestoreInstanceState(bundle2);
    }

    /* renamed from: O */
    public Dialog mo1110O() {
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new DialogC0473m(m1119K(), this.f1307c0);
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: e */
    public final AbstractC1680h mo1111e() {
        return new C0416o(this, new C0419r(this));
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f1314j0) {
            return;
        }
        if (Log.isLoggable("FragmentManager", 3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.f1315k0) {
            return;
        }
        this.f1315k0 = true;
        this.f1316l0 = false;
        Dialog dialog = this.f1313i0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f1313i0.dismiss();
        }
        this.f1314j0 = true;
        if (this.f1310f0 < 0) {
            C0398a c0398a = new C0398a(m1128k());
            c0398a.f1242o = true;
            c0398a.m1077g(this);
            c0398a.m1074d(true);
            return;
        }
        C0387O m1128k = m1128k();
        int i = this.f1310f0;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Bad id: "));
        }
        m1128k.m1035w(new C0386N(m1128k, i), true);
        this.f1310f0 = -1;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: t */
    public final void mo1112t() {
        this.f1340H = true;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: v */
    public final void mo1113v(AbstractActivityC0870i abstractActivityC0870i) {
        super.mo1113v(abstractActivityC0870i);
        this.f1353U.m1397f(this.f1312h0);
        if (this.f1316l0) {
            return;
        }
        this.f1315k0 = false;
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        new Handler();
        this.f1309e0 = this.f1334B == 0;
        if (bundle != null) {
            this.f1306b0 = bundle.getInt("android:style", 0);
            this.f1307c0 = bundle.getInt("android:theme", 0);
            this.f1308d0 = bundle.getBoolean("android:cancelable", true);
            this.f1309e0 = bundle.getBoolean("android:showsDialog", this.f1309e0);
            this.f1310f0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: z */
    public final void mo1115z() {
        this.f1340H = true;
        Dialog dialog = this.f1313i0;
        if (dialog != null) {
            this.f1314j0 = true;
            dialog.setOnDismissListener(null);
            this.f1313i0.dismiss();
            if (!this.f1315k0) {
                onDismiss(this.f1313i0);
            }
            this.f1313i0 = null;
            this.f1317m0 = false;
        }
    }
}
