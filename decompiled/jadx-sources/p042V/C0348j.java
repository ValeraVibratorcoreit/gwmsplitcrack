package p042V;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import p038T.C0315i;

/* renamed from: V.j */
/* loaded from: classes.dex */
public final class C0348j implements TransformationMethod {

    /* renamed from: a */
    public final TransformationMethod f988a;

    public C0348j(TransformationMethod transformationMethod) {
        this.f988a = transformationMethod;
    }

    @Override // android.text.method.TransformationMethod
    public final CharSequence getTransformation(CharSequence charSequence, View view) {
        if (view.isInEditMode()) {
            return charSequence;
        }
        TransformationMethod transformationMethod = this.f988a;
        if (transformationMethod != null) {
            charSequence = transformationMethod.getTransformation(charSequence, view);
        }
        if (charSequence == null || C0315i.m895a().m896b() != 1) {
            return charSequence;
        }
        C0315i m895a = C0315i.m895a();
        m895a.getClass();
        return m895a.m899e(charSequence, 0, charSequence.length());
    }

    @Override // android.text.method.TransformationMethod
    public final void onFocusChanged(View view, CharSequence charSequence, boolean z2, int i, Rect rect) {
        TransformationMethod transformationMethod = this.f988a;
        if (transformationMethod != null) {
            transformationMethod.onFocusChanged(view, charSequence, z2, i, rect);
        }
    }
}
