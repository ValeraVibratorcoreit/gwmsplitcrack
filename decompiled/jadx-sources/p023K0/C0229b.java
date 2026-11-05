package p023K0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import p006C.AbstractC0062j;
import p012E0.C0094b;

/* renamed from: K0.b */
/* loaded from: classes.dex */
public final class C0229b extends View.BaseSavedState {
    public static final Parcelable.Creator<C0229b> CREATOR = new C0094b(1);

    /* renamed from: a */
    public int f585a;

    public final String toString() {
        StringBuilder sb = new StringBuilder("MaterialCheckBox.SavedState{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" CheckedState=");
        int i = this.f585a;
        return AbstractC0062j.m162p(sb, i != 1 ? i != 2 ? "unchecked" : "indeterminate" : "checked", "}");
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.f585a));
    }
}
