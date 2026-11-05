package p019I0;

import android.os.Parcel;
import android.os.Parcelable;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: I0.b */
/* loaded from: classes.dex */
public final class C0138b extends AbstractC0300b {
    public static final Parcelable.Creator<C0138b> CREATOR = new C0127f(1);

    /* renamed from: c */
    public boolean f420c;

    public C0138b(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            C0138b.class.getClassLoader();
        }
        this.f420c = parcel.readInt() == 1;
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f420c ? 1 : 0);
    }
}
