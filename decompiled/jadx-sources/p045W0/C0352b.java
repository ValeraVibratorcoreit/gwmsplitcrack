package p045W0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: W0.b */
/* loaded from: classes.dex */
public final class C0352b implements InterfaceC0353c {

    /* renamed from: a */
    public final InterfaceC0353c f1004a;

    /* renamed from: b */
    public final float f1005b;

    public C0352b(float f2, InterfaceC0353c interfaceC0353c) {
        while (interfaceC0353c instanceof C0352b) {
            interfaceC0353c = ((C0352b) interfaceC0353c).f1004a;
            f2 += ((C0352b) interfaceC0353c).f1005b;
        }
        this.f1004a = interfaceC0353c;
        this.f1005b = f2;
    }

    @Override // p045W0.InterfaceC0353c
    /* renamed from: a */
    public final float mo939a(RectF rectF) {
        return Math.max(0.0f, this.f1004a.mo939a(rectF) + this.f1005b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0352b)) {
            return false;
        }
        C0352b c0352b = (C0352b) obj;
        return this.f1004a.equals(c0352b.f1004a) && this.f1005b == c0352b.f1005b;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f1004a, Float.valueOf(this.f1005b)});
    }
}
