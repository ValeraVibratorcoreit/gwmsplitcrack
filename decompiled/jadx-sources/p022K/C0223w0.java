package p022K;

import android.view.View;
import android.view.Window;
import com.jcraft.jsch.SftpATTRS;
import p010D1.AbstractC0088l;
import p045W0.C0355e;

/* renamed from: K.w0 */
/* loaded from: classes.dex */
public final class C0223w0 extends AbstractC0088l {

    /* renamed from: c */
    public final Window f574c;

    public C0223w0(Window window, C0355e c0355e) {
        this.f574c = window;
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: k0 */
    public final void mo310k0(boolean z2) {
        if (!z2) {
            m689v0(16);
            return;
        }
        Window window = this.f574c;
        window.clearFlags(134217728);
        window.addFlags(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(16 | decorView.getSystemUiVisibility());
    }

    @Override // p010D1.AbstractC0088l
    /* renamed from: l0 */
    public final void mo312l0(boolean z2) {
        if (!z2) {
            m689v0(8192);
            return;
        }
        Window window = this.f574c;
        window.clearFlags(67108864);
        window.addFlags(SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED);
        View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
    }

    /* renamed from: v0 */
    public final void m689v0(int i) {
        View decorView = this.f574c.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
