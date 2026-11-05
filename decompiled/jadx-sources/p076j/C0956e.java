package p076j;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import p079k.MenuC1002B;

/* renamed from: j.e */
/* loaded from: classes.dex */
public final class C0956e extends ActionMode {

    /* renamed from: a */
    public final Context f4581a;

    /* renamed from: b */
    public final AbstractC0952a f4582b;

    public C0956e(Context context, AbstractC0952a abstractC0952a) {
        this.f4581a = context;
        this.f4582b = abstractC0952a;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f4582b.mo2376a();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f4582b.mo2377b();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC1002B(this.f4581a, this.f4582b.mo2378c());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f4582b.mo2379d();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f4582b.mo2380e();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f4582b.f4567f;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f4582b.mo2381f();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f4582b.f4568g;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f4582b.mo2382g();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f4582b.mo2383h();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f4582b.mo2384i(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f4582b.mo2386l(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f4582b.f4567f = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f4582b.mo2388n(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z2) {
        this.f4582b.mo2389o(z2);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f4582b.mo2385k(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f4582b.mo2387m(i);
    }
}
