package p076j;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p003B.C0043j;
import p038T.C0326t;
import p079k.InterfaceC1016k;
import p079k.MenuC1018m;
import p082l.C1123k;

/* renamed from: j.d */
/* loaded from: classes.dex */
public final class C0955d extends AbstractC0952a implements InterfaceC1016k {

    /* renamed from: h */
    public Context f4575h;

    /* renamed from: i */
    public ActionBarContextView f4576i;

    /* renamed from: j */
    public C0043j f4577j;

    /* renamed from: k */
    public WeakReference f4578k;

    /* renamed from: l */
    public boolean f4579l;

    /* renamed from: m */
    public MenuC1018m f4580m;

    @Override // p076j.AbstractC0952a
    /* renamed from: a */
    public final void mo2376a() {
        if (this.f4579l) {
            return;
        }
        this.f4579l = true;
        this.f4577j.m68F(this);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: b */
    public final View mo2377b() {
        WeakReference weakReference = this.f4578k;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: c */
    public final MenuC1018m mo2378c() {
        return this.f4580m;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: d */
    public final MenuInflater mo2379d() {
        return new C0959h(this.f4576i.getContext());
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: e */
    public final CharSequence mo2380e() {
        return this.f4576i.getSubtitle();
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: f */
    public final CharSequence mo2381f() {
        return this.f4576i.getTitle();
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: g */
    public final void mo2382g() {
        this.f4577j.m69G(this, this.f4580m);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: h */
    public final boolean mo2383h() {
        return this.f4576i.f1740x;
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: i */
    public final void mo2384i(View view) {
        this.f4576i.setCustomView(view);
        this.f4578k = view != null ? new WeakReference(view) : null;
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: j */
    public final boolean mo1877j(MenuC1018m menuC1018m, MenuItem menuItem) {
        return ((C0326t) this.f4577j.f141g).m918k(this, menuItem);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: k */
    public final void mo2385k(int i) {
        mo2386l(this.f4575h.getString(i));
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: l */
    public final void mo2386l(CharSequence charSequence) {
        this.f4576i.setSubtitle(charSequence);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: m */
    public final void mo2387m(int i) {
        mo2388n(this.f4575h.getString(i));
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: n */
    public final void mo2388n(CharSequence charSequence) {
        this.f4576i.setTitle(charSequence);
    }

    @Override // p076j.AbstractC0952a
    /* renamed from: o */
    public final void mo2389o(boolean z2) {
        this.f4568g = z2;
        this.f4576i.setTitleOptional(z2);
    }

    @Override // p079k.InterfaceC1016k
    /* renamed from: p */
    public final void mo1878p(MenuC1018m menuC1018m) {
        mo2382g();
        C1123k c1123k = this.f4576i.f1725i;
        if (c1123k != null) {
            c1123k.m2735l();
        }
    }
}
