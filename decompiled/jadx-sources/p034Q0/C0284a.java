package p034Q0;

import android.os.Parcel;
import android.os.Parcelable;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: Q0.a */
/* loaded from: classes.dex */
public final class C0284a extends AbstractC0300b {
    public static final Parcelable.Creator<C0284a> CREATOR = new C0127f(2);

    /* renamed from: c */
    public boolean f738c;

    public C0284a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f738c = parcel.readInt() == 1;
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f738c ? 1 : 0);
    }
}
