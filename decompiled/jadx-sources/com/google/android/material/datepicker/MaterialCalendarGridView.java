package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.jcraft.jsch.SftpATTRS;
import p022K.AbstractC0169Q;
import p033Q.C0274h;

/* loaded from: classes.dex */
final class MaterialCalendarGridView extends GridView {

    /* renamed from: f */
    public final boolean f3471f;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        AbstractC0681v.m2095c(null);
        if (C0671l.m2080R(getContext(), R.attr.windowFullscreen)) {
            setNextFocusLeftId(com.altaysoft.t500_split.R.id.cancel_button);
            setNextFocusRightId(com.altaysoft.t500_split.R.id.confirm_button);
        }
        this.f3471f = C0671l.m2080R(getContext(), com.altaysoft.t500_split.R.attr.nestedScrollable);
        AbstractC0169Q.m505j(this, new C0274h(3));
    }

    /* renamed from: a */
    public final C0674o m2073a() {
        return (C0674o) super.getAdapter();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (C0674o) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((C0674o) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        C0674o c0674o = (C0674o) super.getAdapter();
        c0674o.getClass();
        int max = Math.max(c0674o.m2086a(), getFirstVisiblePosition());
        int min = Math.min(c0674o.m2088c(), getLastVisiblePosition());
        c0674o.getItem(max);
        c0674o.getItem(min);
        throw null;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        if (!z2) {
            super.onFocusChanged(false, i, rect);
            return;
        }
        if (i == 33) {
            setSelection(((C0674o) super.getAdapter()).m2088c());
        } else if (i == 130) {
            setSelection(((C0674o) super.getAdapter()).m2086a());
        } else {
            super.onFocusChanged(true, i, rect);
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!super.onKeyDown(i, keyEvent)) {
            return false;
        }
        if (getSelectedItemPosition() == -1 || getSelectedItemPosition() >= ((C0674o) super.getAdapter()).m2086a()) {
            return true;
        }
        if (19 != i) {
            return false;
        }
        setSelection(((C0674o) super.getAdapter()).m2086a());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (!this.f3471f) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED));
        getLayoutParams().height = getMeasuredHeight();
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i) {
        if (i < ((C0674o) super.getAdapter()).m2086a()) {
            super.setSelection(((C0674o) super.getAdapter()).m2086a());
        } else {
            super.setSelection(i);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (C0674o) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (!(listAdapter instanceof C0674o)) {
            throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), C0674o.class.getCanonicalName()));
        }
        super.setAdapter(listAdapter);
    }
}
