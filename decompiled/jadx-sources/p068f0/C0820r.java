package p068f0;

import android.view.View;
import com.jcraft.jsch.SftpATTRS;
import p038T.AbstractC0312f;

/* renamed from: f0.r */
/* loaded from: classes.dex */
public final class C0820r {

    /* renamed from: a */
    public AbstractC0312f f4163a;

    /* renamed from: b */
    public int f4164b;

    /* renamed from: c */
    public int f4165c;

    /* renamed from: d */
    public boolean f4166d;

    /* renamed from: e */
    public boolean f4167e;

    public C0820r() {
        m2323d();
    }

    /* renamed from: a */
    public final void m2320a() {
        this.f4165c = this.f4166d ? this.f4163a.mo883g() : this.f4163a.mo887k();
    }

    /* renamed from: b */
    public final void m2321b(View view, int i) {
        if (this.f4166d) {
            this.f4165c = this.f4163a.m889m() + this.f4163a.mo878b(view);
        } else {
            this.f4165c = this.f4163a.mo881e(view);
        }
        this.f4164b = i;
    }

    /* renamed from: c */
    public final void m2322c(View view, int i) {
        int m889m = this.f4163a.m889m();
        if (m889m >= 0) {
            m2321b(view, i);
            return;
        }
        this.f4164b = i;
        if (!this.f4166d) {
            int mo881e = this.f4163a.mo881e(view);
            int mo887k = mo881e - this.f4163a.mo887k();
            this.f4165c = mo881e;
            if (mo887k > 0) {
                int mo883g = (this.f4163a.mo883g() - Math.min(0, (this.f4163a.mo883g() - m889m) - this.f4163a.mo878b(view))) - (this.f4163a.mo879c(view) + mo881e);
                if (mo883g < 0) {
                    this.f4165c -= Math.min(mo887k, -mo883g);
                    return;
                }
                return;
            }
            return;
        }
        int mo883g2 = (this.f4163a.mo883g() - m889m) - this.f4163a.mo878b(view);
        this.f4165c = this.f4163a.mo883g() - mo883g2;
        if (mo883g2 > 0) {
            int mo879c = this.f4165c - this.f4163a.mo879c(view);
            int mo887k2 = this.f4163a.mo887k();
            int min = mo879c - (Math.min(this.f4163a.mo881e(view) - mo887k2, 0) + mo887k2);
            if (min < 0) {
                this.f4165c = Math.min(mo883g2, -min) + this.f4165c;
            }
        }
    }

    /* renamed from: d */
    public final void m2323d() {
        this.f4164b = -1;
        this.f4165c = SftpATTRS.SSH_FILEXFER_ATTR_EXTENDED;
        this.f4166d = false;
        this.f4167e = false;
    }

    public final String toString() {
        return "AnchorInfo{mPosition=" + this.f4164b + ", mCoordinate=" + this.f4165c + ", mLayoutFromEnd=" + this.f4166d + ", mValid=" + this.f4167e + '}';
    }
}
