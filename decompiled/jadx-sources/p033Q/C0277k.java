package p033Q;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p012E0.C0094b;

/* renamed from: Q.k */
/* loaded from: classes.dex */
public final class C0277k extends View.BaseSavedState {
    public static final Parcelable.Creator<C0277k> CREATOR = new C0094b(2);

    /* renamed from: a */
    public int f737a;

    public final String toString() {
        return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f737a + "}";
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f737a);
    }
}
