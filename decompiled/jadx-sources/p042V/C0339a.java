package p042V;

import android.text.Editable;
import p038T.C0328v;

/* renamed from: V.a */
/* loaded from: classes.dex */
public final class C0339a extends Editable.Factory {

    /* renamed from: a */
    public static final Object f969a = new Object();

    /* renamed from: b */
    public static volatile C0339a f970b;

    /* renamed from: c */
    public static Class f971c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f971c;
        return cls != null ? new C0328v(cls, charSequence) : super.newEditable(charSequence);
    }
}
