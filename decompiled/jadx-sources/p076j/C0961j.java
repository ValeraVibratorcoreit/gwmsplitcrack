package p076j;

import android.view.View;
import android.view.animation.BaseInterpolator;
import java.util.ArrayList;
import java.util.Iterator;
import p010D1.AbstractC0088l;
import p022K.C0175X;

/* renamed from: j.j */
/* loaded from: classes.dex */
public final class C0961j {

    /* renamed from: c */
    public BaseInterpolator f4629c;

    /* renamed from: d */
    public AbstractC0088l f4630d;

    /* renamed from: e */
    public boolean f4631e;

    /* renamed from: b */
    public long f4628b = -1;

    /* renamed from: f */
    public final C0960i f4632f = new C0960i(this);

    /* renamed from: a */
    public final ArrayList f4627a = new ArrayList();

    /* renamed from: a */
    public final void m2502a() {
        if (this.f4631e) {
            Iterator it = this.f4627a.iterator();
            while (it.hasNext()) {
                ((C0175X) it.next()).m521b();
            }
            this.f4631e = false;
        }
    }

    /* renamed from: b */
    public final void m2503b() {
        View view;
        if (this.f4631e) {
            return;
        }
        Iterator it = this.f4627a.iterator();
        while (it.hasNext()) {
            C0175X c0175x = (C0175X) it.next();
            long j2 = this.f4628b;
            if (j2 >= 0) {
                c0175x.m522c(j2);
            }
            BaseInterpolator baseInterpolator = this.f4629c;
            if (baseInterpolator != null && (view = (View) c0175x.f483a.get()) != null) {
                view.animate().setInterpolator(baseInterpolator);
            }
            if (this.f4630d != null) {
                c0175x.m523d(this.f4632f);
            }
            View view2 = (View) c0175x.f483a.get();
            if (view2 != null) {
                view2.animate().start();
            }
        }
        this.f4631e = true;
    }
}
