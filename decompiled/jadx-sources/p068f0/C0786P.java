package p068f0;

import android.os.Parcel;
import android.os.Parcelable;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: f0.P */
/* loaded from: classes.dex */
public final class C0786P extends AbstractC0300b {
    public static final Parcelable.Creator<C0786P> CREATOR = new C0127f(7);

    /* renamed from: c */
    public Parcelable f3965c;

    public C0786P(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f3965c = parcel.readParcelable(classLoader == null ? AbstractC0778H.class.getClassLoader() : classLoader);
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.f3965c, 0);
    }
}
