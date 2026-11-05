package p035R;

import android.os.Parcel;
import android.os.Parcelable;
import p017H0.C0127f;

/* renamed from: R.b */
/* loaded from: classes.dex */
public abstract class AbstractC0300b implements Parcelable {

    /* renamed from: a */
    public final Parcelable f833a;

    /* renamed from: b */
    public static final C0299a f832b = new C0299a();
    public static final Parcelable.Creator<AbstractC0300b> CREATOR = new C0127f(3);

    public AbstractC0300b() {
        this.f833a = null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f833a, i);
    }

    public AbstractC0300b(Parcelable parcelable) {
        if (parcelable != null) {
            this.f833a = parcelable == f832b ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    public AbstractC0300b(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f833a = readParcelable == null ? f832b : readParcelable;
    }
}
