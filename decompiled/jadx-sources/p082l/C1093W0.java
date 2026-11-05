package p082l;

import android.os.Parcel;
import android.os.Parcelable;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: l.W0 */
/* loaded from: classes.dex */
public final class C1093W0 extends AbstractC0300b {
    public static final Parcelable.Creator<C1093W0> CREATOR = new C0127f(8);

    /* renamed from: c */
    public int f5121c;

    /* renamed from: d */
    public boolean f5122d;

    public C1093W0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f5121c = parcel.readInt();
        this.f5122d = parcel.readInt() != 0;
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5121c);
        parcel.writeInt(this.f5122d ? 1 : 0);
    }
}
