package p117x;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: x.f */
/* loaded from: classes.dex */
public final class C1641f extends AbstractC0300b {
    public static final Parcelable.Creator<C1641f> CREATOR = new C0127f(10);

    /* renamed from: c */
    public SparseArray f9322c;

    public C1641f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.f9322c = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.f9322c.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.f9322c;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.f9322c.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.f9322c.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
