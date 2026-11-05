package p082l;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import com.altaysoft.t500_split.R;

/* renamed from: l.D */
/* loaded from: classes.dex */
public final class C1055D extends RatingBar {

    /* renamed from: f */
    public final C1051B f5029f;

    public C1055D(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.ratingBarStyle);
        AbstractC1074M0.m2690a(this, getContext());
        C1051B c1051b = new C1051B(this);
        this.f5029f = c1051b;
        c1051b.mo2658e(attributeSet, R.attr.ratingBarStyle);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Bitmap bitmap = (Bitmap) this.f5029f.f5024c;
        if (bitmap != null) {
            setMeasuredDimension(View.resolveSizeAndState(bitmap.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
        }
    }
}
