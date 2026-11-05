package p042V;

import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import java.nio.ByteBuffer;
import p038T.C0311e;
import p038T.C0315i;
import p040U.C0337b;
import p045W0.C0355e;

/* renamed from: V.b */
/* loaded from: classes.dex */
public final class C0340b extends InputConnectionWrapper {

    /* renamed from: a */
    public final EditText f972a;

    /* renamed from: b */
    public final C0355e f973b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0340b(EditText editText, InputConnection inputConnection, EditorInfo editorInfo) {
        super(inputConnection, false);
        C0355e c0355e = new C0355e(11);
        this.f972a = editText;
        this.f973b = c0355e;
        if (C0315i.f889k != null) {
            C0315i m895a = C0315i.m895a();
            if (m895a.m896b() != 1 || editorInfo == null) {
                return;
            }
            if (editorInfo.extras == null) {
                editorInfo.extras = new Bundle();
            }
            C0311e c0311e = m895a.f894e;
            c0311e.getClass();
            Bundle bundle = editorInfo.extras;
            C0337b c0337b = (C0337b) c0311e.f884c.f923a;
            int m415a = c0337b.m415a(4);
            bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", m415a != 0 ? ((ByteBuffer) c0337b.f470d).getInt(m415a + c0337b.f467a) : 0);
            Bundle bundle2 = editorInfo.extras;
            c0311e.f882a.getClass();
            bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
        }
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        Editable editableText = this.f972a.getEditableText();
        this.f973b.getClass();
        return C0355e.m943c(this, editableText, i, i2, false) || super.deleteSurroundingText(i, i2);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        Editable editableText = this.f972a.getEditableText();
        this.f973b.getClass();
        return C0355e.m943c(this, editableText, i, i2, true) || super.deleteSurroundingTextInCodePoints(i, i2);
    }
}
