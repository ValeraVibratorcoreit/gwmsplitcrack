package p082l;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import com.altaysoft.t500_split.R;

/* renamed from: l.F */
/* loaded from: classes.dex */
public final class C1059F extends SeekBar {

    /* renamed from: f */
    public final C1061G f5034f;

    public C1059F(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.seekBarStyle);
        AbstractC1074M0.m2690a(this, getContext());
        C1061G c1061g = new C1061G(this);
        this.f5034f = c1061g;
        c1061g.mo2658e(attributeSet, R.attr.seekBarStyle);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1061G c1061g = this.f5034f;
        Drawable drawable = c1061g.f5038f;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        C1059F c1059f = c1061g.f5037e;
        if (drawable.setState(c1059f.getDrawableState())) {
            c1059f.invalidateDrawable(drawable);
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f5034f.f5038f;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f5034f.m2668j(canvas);
    }
}
