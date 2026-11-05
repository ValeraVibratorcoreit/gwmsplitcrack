package p042V;

import android.text.InputFilter;
import android.text.Spanned;
import android.widget.TextView;
import p038T.C0315i;

/* renamed from: V.d */
/* loaded from: classes.dex */
public final class C0342d implements InputFilter {

    /* renamed from: a */
    public final TextView f976a;

    /* renamed from: b */
    public C0341c f977b;

    public C0342d(TextView textView) {
        this.f976a = textView;
    }

    @Override // android.text.InputFilter
    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        TextView textView = this.f976a;
        if (textView.isInEditMode()) {
            return charSequence;
        }
        int m896b = C0315i.m895a().m896b();
        if (m896b != 0) {
            if (m896b == 1) {
                if ((i4 == 0 && i3 == 0 && spanned.length() == 0 && charSequence == textView.getText()) || charSequence == null) {
                    return charSequence;
                }
                if (i != 0 || i2 != charSequence.length()) {
                    charSequence = charSequence.subSequence(i, i2);
                }
                return C0315i.m895a().m899e(charSequence, 0, charSequence.length());
            }
            if (m896b != 3) {
                return charSequence;
            }
        }
        C0315i m895a = C0315i.m895a();
        if (this.f977b == null) {
            this.f977b = new C0341c(textView, this);
        }
        m895a.m900f(this.f977b);
        return charSequence;
    }
}
