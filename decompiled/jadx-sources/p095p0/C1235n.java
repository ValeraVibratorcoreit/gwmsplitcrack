package p095p0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p017H0.C0127f;

/* renamed from: p0.n */
/* loaded from: classes.dex */
public final class C1235n extends View.BaseSavedState {
    public static final Parcelable.Creator<C1235n> CREATOR = new C0127f(9);

    /* renamed from: a */
    public int f5490a;

    /* renamed from: b */
    public int f5491b;

    /* renamed from: c */
    public Parcelable f5492c;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f5490a);
        parcel.writeInt(this.f5491b);
        parcel.writeParcelable(this.f5492c, i);
    }
}
