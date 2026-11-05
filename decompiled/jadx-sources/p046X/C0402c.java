package p046X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p012E0.C0094b;

/* renamed from: X.c */
/* loaded from: classes.dex */
public final class C0402c implements Parcelable {
    public static final Parcelable.Creator<C0402c> CREATOR = new C0094b(4);

    /* renamed from: a */
    public final ArrayList f1271a;

    /* renamed from: b */
    public final ArrayList f1272b;

    public C0402c(Parcel parcel) {
        this.f1271a = parcel.createStringArrayList();
        this.f1272b = parcel.createTypedArrayList(C0400b.CREATOR);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1271a);
        parcel.writeTypedList(this.f1272b);
    }
}
