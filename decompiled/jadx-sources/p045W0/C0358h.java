package p045W0;

import android.graphics.RectF;
import java.util.Arrays;

/* renamed from: W0.h */
/* loaded from: classes.dex */
public final class C0358h implements InterfaceC0353c {

    /* renamed from: a */
    public final float f1047a;

    public C0358h(float f2) {
        this.f1047a = f2;
    }

    @Override // p045W0.InterfaceC0353c
    /* renamed from: a */
    public final float mo939a(RectF rectF) {
        return Math.min(rectF.width(), rectF.height()) * this.f1047a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0358h) && this.f1047a == ((C0358h) obj).f1047a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f1047a)});
    }
}
