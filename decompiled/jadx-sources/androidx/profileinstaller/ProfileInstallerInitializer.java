package androidx.profileinstaller;

import android.content.Context;
import java.util.Collections;
import java.util.List;
import p001A0.RunnableC0018l;
import p045W0.C0355e;
import p062d0.AbstractC0734g;
import p073h0.InterfaceC0947b;

/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0947b {
    @Override // p073h0.InterfaceC0947b
    /* renamed from: a */
    public final List mo1355a() {
        return Collections.emptyList();
    }

    @Override // p073h0.InterfaceC0947b
    /* renamed from: b */
    public final Object mo1356b(Context context) {
        AbstractC0734g.m2185a(new RunnableC0018l(this, 8, context.getApplicationContext()));
        return new C0355e(24);
    }
}
