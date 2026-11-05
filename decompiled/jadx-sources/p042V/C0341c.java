package p042V;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import p038T.AbstractC0313g;
import p038T.C0315i;

/* renamed from: V.c */
/* loaded from: classes.dex */
public final class C0341c extends AbstractC0313g {

    /* renamed from: a */
    public final WeakReference f974a;

    /* renamed from: b */
    public final WeakReference f975b;

    public C0341c(TextView textView, C0342d c0342d) {
        this.f974a = new WeakReference(textView);
        this.f975b = new WeakReference(c0342d);
    }

    @Override // p038T.AbstractC0313g
    /* renamed from: a */
    public final void mo893a() {
        InputFilter[] filters;
        int length;
        TextView textView = (TextView) this.f974a.get();
        InputFilter inputFilter = (InputFilter) this.f975b.get();
        if (inputFilter == null || textView == null || (filters = textView.getFilters()) == null) {
            return;
        }
        for (InputFilter inputFilter2 : filters) {
            if (inputFilter2 == inputFilter) {
                if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    C0315i m895a = C0315i.m895a();
                    if (text == null) {
                        length = 0;
                    } else {
                        m895a.getClass();
                        length = text.length();
                    }
                    CharSequence m899e = m895a.m899e(text, 0, length);
                    if (text == m899e) {
                        return;
                    }
                    int selectionStart = Selection.getSelectionStart(m899e);
                    int selectionEnd = Selection.getSelectionEnd(m899e);
                    textView.setText(m899e);
                    if (m899e instanceof Spannable) {
                        Spannable spannable = (Spannable) m899e;
                        if (selectionStart >= 0 && selectionEnd >= 0) {
                            Selection.setSelection(spannable, selectionStart, selectionEnd);
                            return;
                        } else if (selectionStart >= 0) {
                            Selection.setSelection(spannable, selectionStart);
                            return;
                        } else {
                            if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            }
                            return;
                        }
                    }
                    return;
                }
                return;
            }
        }
    }
}
