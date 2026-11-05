package p082l;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import com.altaysoft.t500_split.media.C0639g;
import p022K.AbstractC0169Q;
import p022K.C0184d;
import p022K.InterfaceC0182c;

/* renamed from: l.E */
/* loaded from: classes.dex */
public abstract class AbstractC1057E {
    /* renamed from: a */
    public static boolean m2665a(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC0182c interfaceC0182c;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC0182c = new C0639g(clipData, 3);
            } else {
                C0184d c0184d = new C0184d();
                c0184d.f499g = clipData;
                c0184d.f500h = 3;
                interfaceC0182c = c0184d;
            }
            AbstractC0169Q.m501f(textView, interfaceC0182c.mo534f());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    /* renamed from: b */
    public static boolean m2666b(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC0182c interfaceC0182c;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC0182c = new C0639g(clipData, 3);
        } else {
            C0184d c0184d = new C0184d();
            c0184d.f499g = clipData;
            c0184d.f500h = 3;
            interfaceC0182c = c0184d;
        }
        AbstractC0169Q.m501f(view, interfaceC0182c.mo534f());
        return true;
    }
}
