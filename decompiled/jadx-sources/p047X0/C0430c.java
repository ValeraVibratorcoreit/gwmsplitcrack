package p047X0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.sidesheet.SideSheetBehavior;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: X0.c */
/* loaded from: classes.dex */
public final class C0430c extends AbstractC0300b {
    public static final Parcelable.Creator<C0430c> CREATOR = new C0127f(5);

    /* renamed from: c */
    public final int f1393c;

    public C0430c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1393c = parcel.readInt();
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f1393c);
    }

    public C0430c(AbsSavedState absSavedState, SideSheetBehavior sideSheetBehavior) {
        super(absSavedState);
        this.f1393c = sideSheetBehavior.f3583h;
    }
}
