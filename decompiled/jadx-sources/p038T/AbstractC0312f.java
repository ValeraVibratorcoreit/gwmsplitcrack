package p038T;

import android.graphics.Rect;
import android.view.View;
import com.jcraft.jsch.SftpATTRS;
import p068f0.AbstractC0778H;
import p068f0.C0825w;

/* renamed from: T.f */
/* loaded from: classes.dex */
public abstract class AbstractC0312f {

    /* renamed from: a */
    public int f885a;

    /* renamed from: b */
    public final Object f886b;

    /* renamed from: c */
    public final Object f887c;

    public AbstractC0312f(AbstractC0778H abstractC0778H) {
        this.f885a = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f887c = new Rect();
        this.f886b = abstractC0778H;
    }

    /* renamed from: a */
    public static AbstractC0312f m877a(AbstractC0778H abstractC0778H, int i) {
        if (i == 0) {
            return new C0825w(abstractC0778H, 0);
        }
        if (i == 1) {
            return new C0825w(abstractC0778H, 1);
        }
        throw new IllegalArgumentException("invalid orientation");
    }

    /* renamed from: b */
    public abstract int mo878b(View view);

    /* renamed from: c */
    public abstract int mo879c(View view);

    /* renamed from: d */
    public abstract int mo880d(View view);

    /* renamed from: e */
    public abstract int mo881e(View view);

    /* renamed from: f */
    public abstract int mo882f();

    /* renamed from: g */
    public abstract int mo883g();

    /* renamed from: h */
    public abstract int mo884h();

    /* renamed from: i */
    public abstract int mo885i();

    /* renamed from: j */
    public abstract int mo886j();

    /* renamed from: k */
    public abstract int mo887k();

    /* renamed from: l */
    public abstract int mo888l();

    /* renamed from: m */
    public int m889m() {
        if (Integer.MIN_VALUE == this.f885a) {
            return 0;
        }
        return mo888l() - this.f885a;
    }

    /* renamed from: n */
    public abstract int mo890n(View view);

    /* renamed from: o */
    public abstract int mo891o(View view);

    /* renamed from: p */
    public abstract void mo892p(int i);

    public AbstractC0312f(InterfaceC0314h interfaceC0314h) {
        this.f885a = 0;
        this.f887c = new C0309c();
        this.f886b = interfaceC0314h;
    }
}
