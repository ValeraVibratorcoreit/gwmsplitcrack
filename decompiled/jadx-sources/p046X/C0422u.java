package p046X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import p017H0.C0127f;

/* renamed from: X.u */
/* loaded from: classes.dex */
public final class C0422u implements Parcelable {
    public static final Parcelable.Creator<C0422u> CREATOR = new C0127f(4);

    /* renamed from: a */
    public final Bundle f1331a;

    public C0422u(Bundle bundle) {
        this.f1331a = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f1331a);
    }

    public C0422u(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.f1331a = readBundle;
        if (classLoader == null || readBundle == null) {
            return;
        }
        readBundle.setClassLoader(classLoader);
    }
}
