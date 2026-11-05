package p033Q;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import p022K.C0188f;
import p022K.InterfaceC0186e;
import p022K.InterfaceC0212r;

/* renamed from: Q.p */
/* loaded from: classes.dex */
public final class C0282p implements InterfaceC0212r {
    /* renamed from: a */
    public final C0188f m822a(View view, C0188f c0188f) {
        CharSequence coerceToStyledText;
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0188f);
        }
        if (c0188f.f507a.mo542n() == 2) {
            return c0188f;
        }
        InterfaceC0186e interfaceC0186e = c0188f.f507a;
        ClipData mo539d = interfaceC0186e.mo539d();
        int mo540h = interfaceC0186e.mo540h();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z2 = false;
        for (int i = 0; i < mo539d.getItemCount(); i++) {
            ClipData.Item itemAt = mo539d.getItemAt(i);
            if ((mo540h & 1) != 0) {
                coerceToStyledText = itemAt.coerceToText(context);
                if (coerceToStyledText instanceof Spanned) {
                    coerceToStyledText = coerceToStyledText.toString();
                }
            } else {
                coerceToStyledText = itemAt.coerceToStyledText(context);
            }
            if (coerceToStyledText != null) {
                if (z2) {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), coerceToStyledText);
                } else {
                    int selectionStart = Selection.getSelectionStart(editable);
                    int selectionEnd = Selection.getSelectionEnd(editable);
                    int max = Math.max(0, Math.min(selectionStart, selectionEnd));
                    int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
                    Selection.setSelection(editable, max2);
                    editable.replace(max, max2, coerceToStyledText);
                    z2 = true;
                }
            }
        }
        return null;
    }
}
