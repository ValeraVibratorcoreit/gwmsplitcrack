package p052a;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0528K;
import androidx.lifecycle.C0555t;
import androidx.lifecycle.EnumC0547l;
import androidx.lifecycle.InterfaceC0553r;
import p001A0.RunnableC0024r;
import p071g0.C0891d;
import p071g0.C0892e;
import p071g0.InterfaceC0893f;
import p107t1.AbstractC1461d;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;

/* renamed from: a.m */
/* loaded from: classes.dex */
public class DialogC0473m extends Dialog implements InterfaceC0553r, InterfaceC0458D, InterfaceC0893f {

    /* renamed from: f */
    public C0555t f1519f;

    /* renamed from: g */
    public final C0892e f1520g;

    /* renamed from: h */
    public final C0457C f1521h;

    public DialogC0473m(Context context, int i) {
        super(context, i);
        this.f1520g = new C0892e(this);
        this.f1521h = new C0457C(new RunnableC0024r(6, this));
    }

    /* renamed from: a */
    public static void m1190a(DialogC0473m dialogC0473m) {
        AbstractC1461d.m3494e("this$0", dialogC0473m);
        super.onBackPressed();
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1461d.m3494e("view", view);
        m1192e();
        super.addContentView(view, layoutParams);
    }

    @Override // p071g0.InterfaceC0893f
    /* renamed from: b */
    public final C0891d mo1066b() {
        return this.f1520g.f4475b;
    }

    /* renamed from: c */
    public final C0555t m1191c() {
        C0555t c0555t = this.f1519f;
        if (c0555t != null) {
            return c0555t;
        }
        C0555t c0555t2 = new C0555t(this);
        this.f1519f = c0555t2;
        return c0555t2;
    }

    @Override // androidx.lifecycle.InterfaceC0553r
    /* renamed from: d */
    public final C0555t mo1068d() {
        return m1191c();
    }

    /* renamed from: e */
    public final void m1192e() {
        Window window = getWindow();
        AbstractC1461d.m3491b(window);
        View decorView = window.getDecorView();
        AbstractC1461d.m3493d("window!!.decorView", decorView);
        AbstractC0528K.m1368f(decorView, this);
        Window window2 = getWindow();
        AbstractC1461d.m3491b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC1461d.m3493d("window!!.decorView", decorView2);
        AbstractC1680h.m4854P(decorView2, this);
        Window window3 = getWindow();
        AbstractC1461d.m3491b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC1461d.m3493d("window!!.decorView", decorView3);
        AbstractC1687o.m4928W(decorView3, this);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        this.f1521h.m1168b();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC1461d.m3493d("onBackInvokedDispatcher", onBackInvokedDispatcher);
            C0457C c0457c = this.f1521h;
            c0457c.getClass();
            c0457c.f1467e = onBackInvokedDispatcher;
            c0457c.m1169c(c0457c.f1469g);
        }
        this.f1520g.m2468b(bundle);
        m1191c().m1380d(EnumC0547l.ON_CREATE);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC1461d.m3493d("super.onSaveInstanceState()", onSaveInstanceState);
        this.f1520g.m2469c(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        m1191c().m1380d(EnumC0547l.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        m1191c().m1380d(EnumC0547l.ON_DESTROY);
        this.f1519f = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m1192e();
        super.setContentView(i);
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        AbstractC1461d.m3494e("view", view);
        m1192e();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC1461d.m3494e("view", view);
        m1192e();
        super.setContentView(view, layoutParams);
    }
}
