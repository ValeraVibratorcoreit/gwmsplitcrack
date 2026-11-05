package p111v;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import p102s.C1409g;

/* renamed from: v.s */
/* loaded from: classes.dex */
public abstract class AbstractC1607s extends AbstractC1590b {

    /* renamed from: m */
    public boolean f9218m;

    /* renamed from: n */
    public boolean f9219n;

    @Override // p111v.AbstractC1590b
    /* renamed from: e */
    public final void mo4745e(ConstraintLayout constraintLayout) {
        m4744d(constraintLayout);
    }

    @Override // p111v.AbstractC1590b
    /* renamed from: g */
    public void mo1308g(AttributeSet attributeSet) {
        super.mo1308g(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1605q.f9209b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 6) {
                    this.f9218m = true;
                } else if (index == 22) {
                    this.f9219n = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: j */
    public abstract void mo1310j(C1409g c1409g, int i, int i2);

    @Override // p111v.AbstractC1590b, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f9218m || this.f9219n) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i = 0; i < this.f8997g; i++) {
                    View view = (View) constraintLayout.f1857f.get(this.f8996f[i]);
                    if (view != null) {
                        if (this.f9218m) {
                            view.setVisibility(visibility);
                        }
                        if (this.f9219n && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4744d((ConstraintLayout) parent);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        m4744d((ConstraintLayout) parent);
    }
}
