package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: com.google.android.material.datepicker.m */
/* loaded from: classes.dex */
public final class C0672m<S> extends AbstractC0678s {

    /* renamed from: a0 */
    public int f3533a0;

    /* renamed from: b0 */
    public C0661b f3534b0;

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: E */
    public final void mo1105E(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.f3533a0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f3534b0);
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: w */
    public final void mo1114w(Bundle bundle) {
        super.mo1114w(bundle);
        if (bundle == null) {
            bundle = this.f1362k;
        }
        this.f3533a0 = bundle.getInt("THEME_RES_ID_KEY");
        if (bundle.getParcelable("DATE_SELECTOR_KEY") != null) {
            throw new ClassCastException();
        }
        this.f3534b0 = (C0661b) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // p046X.AbstractComponentCallbacksC0423v
    /* renamed from: x */
    public final View mo1138x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(m1126i(), this.f3533a0));
        throw null;
    }
}
