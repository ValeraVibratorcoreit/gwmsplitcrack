package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import p012E0.C0094b;
import p083l0.C1156b;
import p083l0.InterfaceC1157c;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C0094b(17);

    /* renamed from: a */
    public final InterfaceC1157c f2143a;

    public ParcelImpl(Parcel parcel) {
        this.f2143a = new C1156b(parcel).m2783g();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        new C1156b(parcel).m2785i(this.f2143a);
    }
}
