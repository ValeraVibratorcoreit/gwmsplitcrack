package p042V;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;
import p022K.C0198k;
import p045W0.C0355e;

/* renamed from: V.e */
/* loaded from: classes.dex */
public final class C0343e implements KeyListener {

    /* renamed from: a */
    public final KeyListener f978a;

    /* renamed from: b */
    public final C0355e f979b;

    public C0343e(KeyListener keyListener) {
        C0355e c0355e = new C0355e(12);
        this.f978a = keyListener;
        this.f979b = c0355e;
    }

    @Override // android.text.method.KeyListener
    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.f978a.clearMetaKeyState(view, editable, i);
    }

    @Override // android.text.method.KeyListener
    public final int getInputType() {
        return this.f978a.getInputType();
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z2;
        this.f979b.getClass();
        if (i != 67 ? i != 112 ? false : C0198k.m590c(editable, keyEvent, true) : C0198k.m590c(editable, keyEvent, false)) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2 || this.f978a.onKeyDown(view, editable, i, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.f978a.onKeyOther(view, editable, keyEvent);
    }

    @Override // android.text.method.KeyListener
    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.f978a.onKeyUp(view, editable, i, keyEvent);
    }
}
