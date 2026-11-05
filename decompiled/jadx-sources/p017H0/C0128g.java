package p017H0;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import p035R.AbstractC0300b;

/* renamed from: H0.g */
/* loaded from: classes.dex */
public final class C0128g extends AbstractC0300b {
    public static final Parcelable.Creator<C0128g> CREATOR = new C0127f(0);

    /* renamed from: c */
    public final int f391c;

    /* renamed from: d */
    public final int f392d;

    /* renamed from: e */
    public final boolean f393e;

    /* renamed from: f */
    public final boolean f394f;

    /* renamed from: g */
    public final boolean f395g;

    public C0128g(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f391c = parcel.readInt();
        this.f392d = parcel.readInt();
        this.f393e = parcel.readInt() == 1;
        this.f394f = parcel.readInt() == 1;
        this.f395g = parcel.readInt() == 1;
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.f391c);
        parcel.writeInt(this.f392d);
        parcel.writeInt(this.f393e ? 1 : 0);
        parcel.writeInt(this.f394f ? 1 : 0);
        parcel.writeInt(this.f395g ? 1 : 0);
    }

    public C0128g(AbsSavedState absSavedState, BottomSheetBehavior bottomSheetBehavior) {
        super(absSavedState);
        this.f391c = bottomSheetBehavior.f3375L;
        this.f392d = bottomSheetBehavior.f3398e;
        this.f393e = bottomSheetBehavior.f3392b;
        this.f394f = bottomSheetBehavior.f3372I;
        this.f395g = bottomSheetBehavior.f3373J;
    }
}
