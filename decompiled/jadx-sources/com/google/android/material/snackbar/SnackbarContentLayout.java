package com.google.android.material.snackbar;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import java.util.WeakHashMap;
import p007C0.AbstractC0067a;
import p022K.AbstractC0169Q;
import p121y0.AbstractC1680h;

/* loaded from: classes.dex */
public class SnackbarContentLayout extends LinearLayout {

    /* renamed from: f */
    public TextView f3599f;

    /* renamed from: g */
    public Button f3600g;

    /* renamed from: h */
    public int f3601h;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AbstractC1680h.m4852N(context, R.attr.motionEasingEmphasizedInterpolator, AbstractC0067a.f225b);
    }

    /* renamed from: a */
    public final boolean m2101a(int i, int i2, int i3) {
        boolean z2;
        if (i != getOrientation()) {
            setOrientation(i);
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.f3599f.getPaddingTop() == i2 && this.f3599f.getPaddingBottom() == i3) {
            return z2;
        }
        TextView textView = this.f3599f;
        WeakHashMap weakHashMap = AbstractC0169Q.f475a;
        if (textView.isPaddingRelative()) {
            textView.setPaddingRelative(textView.getPaddingStart(), i2, textView.getPaddingEnd(), i3);
            return true;
        }
        textView.setPadding(textView.getPaddingLeft(), i2, textView.getPaddingRight(), i3);
        return true;
    }

    public Button getActionView() {
        return this.f3600g;
    }

    public TextView getMessageView() {
        return this.f3599f;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f3599f = (TextView) findViewById(R.id.snackbar_text);
        this.f3600g = (Button) findViewById(R.id.snackbar_action);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() == 1) {
            return;
        }
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical_2lines);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.design_snackbar_padding_vertical);
        Layout layout = this.f3599f.getLayout();
        boolean z2 = layout != null && layout.getLineCount() > 1;
        if (!z2 || this.f3601h <= 0 || this.f3600g.getMeasuredWidth() <= this.f3601h) {
            if (!z2) {
                dimensionPixelSize = dimensionPixelSize2;
            }
            if (!m2101a(0, dimensionPixelSize, dimensionPixelSize)) {
                return;
            }
        } else if (!m2101a(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
            return;
        }
        super.onMeasure(i, i2);
    }

    public void setMaxInlineActionWidth(int i) {
        this.f3601h = i;
    }
}
