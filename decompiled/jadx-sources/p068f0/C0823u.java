package p068f0;

import android.os.Parcel;
import android.os.Parcelable;
import p012E0.C0094b;

/* renamed from: f0.u */
/* loaded from: classes.dex */
public final class C0823u implements Parcelable {
    public static final Parcelable.Creator<C0823u> CREATOR = new C0094b(13);

    /* renamed from: a */
    public int f4184a;

    /* renamed from: b */
    public int f4185b;

    /* renamed from: c */
    public boolean f4186c;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4184a);
        parcel.writeInt(this.f4185b);
        parcel.writeInt(this.f4186c ? 1 : 0);
    }
}
