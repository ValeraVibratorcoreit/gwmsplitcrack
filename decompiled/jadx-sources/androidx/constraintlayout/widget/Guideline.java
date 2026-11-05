package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import p111v.C1592d;

/* loaded from: classes.dex */
public class Guideline extends View {

    /* renamed from: f */
    public boolean f1874f;

    public Guideline(Context context) {
        super(context);
        this.f1874f = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setFilterRedundantCalls(boolean z2) {
        this.f1874f = z2;
    }

    public void setGuidelineBegin(int i) {
        C1592d c1592d = (C1592d) getLayoutParams();
        if (this.f1874f && c1592d.f9030a == i) {
            return;
        }
        c1592d.f9030a = i;
        setLayoutParams(c1592d);
    }

    public void setGuidelineEnd(int i) {
        C1592d c1592d = (C1592d) getLayoutParams();
        if (this.f1874f && c1592d.f9032b == i) {
            return;
        }
        c1592d.f9032b = i;
        setLayoutParams(c1592d);
    }

    public void setGuidelinePercent(float f2) {
        C1592d c1592d = (C1592d) getLayoutParams();
        if (this.f1874f && c1592d.f9034c == f2) {
            return;
        }
        c1592d.f9034c = f2;
        setLayoutParams(c1592d);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1874f = true;
        super.setVisibility(8);
    }
}
