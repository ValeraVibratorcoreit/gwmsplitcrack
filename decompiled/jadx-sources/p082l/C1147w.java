package p082l;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.altaysoft.t500_split.media.C0639g;
import p010D1.AbstractC0088l;
import p067f.AbstractC0770a;

/* renamed from: l.w */
/* loaded from: classes.dex */
public final class C1147w {

    /* renamed from: a */
    public final TextView f5282a;

    /* renamed from: b */
    public final C0639g f5283b;

    public C1147w(TextView textView) {
        this.f5282a = textView;
        this.f5283b = new C0639g(textView);
    }

    /* renamed from: a */
    public final void m2772a(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f5282a.getContext().obtainStyledAttributes(attributeSet, AbstractC0770a.f3902i, i, 0);
        try {
            boolean z2 = obtainStyledAttributes.hasValue(14) ? obtainStyledAttributes.getBoolean(14, true) : true;
            obtainStyledAttributes.recycle();
            m2774c(z2);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* renamed from: b */
    public final void m2773b(boolean z2) {
        ((AbstractC0088l) this.f5283b.f3011g).mo308j0(z2);
    }

    /* renamed from: c */
    public final void m2774c(boolean z2) {
        ((AbstractC0088l) this.f5283b.f3011g).mo314m0(z2);
    }
}
