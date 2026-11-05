package p045W0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: W0.a */
/* loaded from: classes.dex */
public final class C0351a implements InterfaceC0353c {

    /* renamed from: a */
    public final float f1003a;

    public C0351a(float f2) {
        this.f1003a = f2;
    }

    @Override // p045W0.InterfaceC0353c
    /* renamed from: a */
    public final float mo939a(RectF rectF) {
        return this.f1003a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0351a) && this.f1003a == ((C0351a) obj).f1003a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1003a)});
    }
}
