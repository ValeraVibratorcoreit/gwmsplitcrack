package p046X;

import android.os.Parcel;
import android.os.Parcelable;
import p012E0.C0094b;

/* renamed from: X.L */
/* loaded from: classes.dex */
public final class C0384L implements Parcelable {
    public static final Parcelable.Creator<C0384L> CREATOR = new C0094b(5);

    /* renamed from: a */
    public String f1132a;

    /* renamed from: b */
    public int f1133b;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1132a);
        parcel.writeInt(this.f1133b);
    }
}
