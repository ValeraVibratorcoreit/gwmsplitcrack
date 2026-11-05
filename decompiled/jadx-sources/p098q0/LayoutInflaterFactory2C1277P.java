package p098q0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import p082l.C1151y;

/* renamed from: q0.P */
/* loaded from: classes.dex */
public final class LayoutInflaterFactory2C1277P implements LayoutInflater.Factory2 {

    /* renamed from: f */
    public final /* synthetic */ int f5922f;

    public /* synthetic */ LayoutInflaterFactory2C1277P(int i) {
        this.f5922f = i;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        switch (this.f5922f) {
        }
        return onCreateView(str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        switch (this.f5922f) {
            case 0:
                if ("ImageView".equals(str) || "androidx.appcompat.widget.AppCompatImageView".equals(str)) {
                    break;
                }
                break;
            default:
                if ("ImageView".equals(str) || "androidx.appcompat.widget.AppCompatImageView".equals(str)) {
                    break;
                }
                break;
        }
        return new C1151y(context, attributeSet, 0);
    }
}
