package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.appcompat.widget.AppCompatImageButton;
import p019I0.C0141e;
import p022K.AbstractC0169Q;
import p034Q0.C0284a;

/* loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {

    /* renamed from: l */
    public static final int[] f3559l = {R.attr.state_checked};

    /* renamed from: i */
    public boolean f3560i;

    /* renamed from: j */
    public boolean f3561j;

    /* renamed from: k */
    public boolean f3562k;

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.altaysoft.t500_split.R.attr.imageButtonStyle);
        this.f3561j = true;
        this.f3562k = true;
        AbstractC0169Q.m505j(this, new C0141e(1, this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f3560i;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.f3560i ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), f3559l) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C0284a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C0284a c0284a = (C0284a) parcelable;
        super.onRestoreInstanceState(c0284a.f833a);
        setChecked(c0284a.f738c);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C0284a c0284a = new C0284a(super.onSaveInstanceState());
        c0284a.f738c = this.f3560i;
        return c0284a;
    }

    public void setCheckable(boolean z2) {
        if (this.f3561j != z2) {
            this.f3561j = z2;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (!this.f3561j || this.f3560i == z2) {
            return;
        }
        this.f3560i = z2;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z2) {
        this.f3562k = z2;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        if (this.f3562k) {
            super.setPressed(z2);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f3560i);
    }
}
