package p070g;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p003B.C0043j;
import p038T.C0326t;
import p076j.AbstractC0952a;
import p076j.C0959h;
import p079k.InterfaceC1016k;
import p079k.MenuC1018m;
import p082l.C1123k;

/* renamed from: g.I */
/* loaded from: classes.dex */
public final class C0860I extends AbstractC0952a implements InterfaceC1016k {

    /* renamed from: h */
    public final Context f4287h;

    /* renamed from: i */
    public final MenuC1018m f4288i;

    /* renamed from: j */
    public C0043j f4289j;

    /* renamed from: k */
    public WeakReference f4290k;

    /* renamed from: l */
    public final /* synthetic */ C0861J f4291l;

    public C0860I(C0861J c0861j, Context context, C0043j c0043j) {
        this.f4291l = c0861j;
        this.f4287h = context;
        this.f4289j = c0043j;
        MenuC1018m menuC1018m = new MenuC1018m(context);
        menuC1018m.f4840l = 1;
        this.f4288i = menuC1018m;
        menuC1018m.f4833e = this;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: a */
    public final void mo2376a() {
        C0861J c0861j = this.f4291l;
        if (c0861j.f4302k != this) {
            return;
        }
        if (c0861j.f4309r) {
            c0861j.f4303l = this;
            c0861j.f4304m = this.f4289j;
        } else {
            this.f4289j.m68F(this);
        }
        this.f4289j = null;
        c0861j.m2391v0(false);
        ActionBarContextView actionBarContextView = c0861j.f4299h;
        if (actionBarContextView.f1732p == null) {
            actionBarContextView.m1270e();
        }
        c0861j.f4296e.setHideOnContentScrollEnabled(c0861j.f4314w);
        c0861j.f4302k = null;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: b */
    public final View mo2377b() {
        WeakReference weakReference = this.f4290k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: c */
    public final MenuC1018m mo2378c() {
        return this.f4288i;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: d */
    public final MenuInflater mo2379d() {
        return new C0959h(this.f4287h);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: e */
    public final CharSequence mo2380e() {
        return this.f4291l.f4299h.getSubtitle();
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: f */
    public final CharSequence mo2381f() {
        return this.f4291l.f4299h.getTitle();
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: g */
    public final void mo2382g() {
        if (this.f4291l.f4302k != this) {
            return;
        }
        MenuC1018m menuC1018m = this.f4288i;
        menuC1018m.m2627w();
        try {
            this.f4289j.m69G(this, menuC1018m);
        } finally {
            menuC1018m.m2626v();
        }
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: h */
    public final boolean mo2383h() {
        return this.f4291l.f4299h.f1740x;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: i */
    public final void mo2384i(View view) {
        this.f4291l.f4299h.setCustomView(view);
        this.f4290k = new WeakReference(view);
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: j */
    public final boolean mo1877j(MenuC1018m menuC1018m, MenuItem menuItem) {
        C0043j c0043j = this.f4289j;
        if (c0043j != null) {
            return ((C0326t) c0043j.f141g).m918k(this, menuItem);
        }
        return false;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: k */
    public final void mo2385k(int i) {
        mo2386l(this.f4291l.f4294c.getResources().getString(i));
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: l */
    public final void mo2386l(CharSequence charSequence) {
        this.f4291l.f4299h.setSubtitle(charSequence);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: m */
    public final void mo2387m(int i) {
        mo2388n(this.f4291l.f4294c.getResources().getString(i));
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: n */
    public final void mo2388n(CharSequence charSequence) {
        this.f4291l.f4299h.setTitle(charSequence);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: o */
    public final void mo2389o(boolean z2) {
        this.f4568g = z2;
        this.f4291l.f4299h.setTitleOptional(z2);
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: p */
    public final void mo1878p(MenuC1018m menuC1018m) {
        if (this.f4289j == null) {
            return;
        }
        mo2382g();
        C1123k c1123k = this.f4291l.f4299h.f1725i;
        if (c1123k != null) {
            c1123k.m2735l();
        }
    }
}
