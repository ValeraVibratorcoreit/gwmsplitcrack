package p016H;

import android.content.Context;
import java.util.concurrent.Callable;

/* renamed from: H.e */
/* loaded from: classes.dex */
public final class CallableC0113e implements Callable {

    /* renamed from: a */
    public final /* synthetic */ int f355a;

    /* renamed from: b */
    public final /* synthetic */ String f356b;

    /* renamed from: c */
    public final /* synthetic */ Context f357c;

    /* renamed from: d */
    public final /* synthetic */ C0112d f358d;

    /* renamed from: e */
    public final /* synthetic */ int f359e;

    public /* synthetic */ CallableC0113e(String str, Context context, C0112d c0112d, int i, int i2) {
        this.f355a = i2;
        this.f356b = str;
        this.f357c = context;
        this.f358d = c0112d;
        this.f359e = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f355a) {
            case 0:
                return AbstractC0116h.m364a(this.f356b, this.f357c, this.f358d, this.f359e);
            default:
                try {
                    return AbstractC0116h.m364a(this.f356b, this.f357c, this.f358d, this.f359e);
                } catch (Throwable unused) {
                    return new C0115g(-3);
                }
        }
    }
}
