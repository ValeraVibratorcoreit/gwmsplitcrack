package p068f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p012E0.C0094b;

/* renamed from: f0.c0 */
/* loaded from: classes.dex */
public final class C0801c0 implements Parcelable {
    public static final Parcelable.Creator<C0801c0> CREATOR = new C0094b(14);

    /* renamed from: a */
    public int f4035a;

    /* renamed from: b */
    public int f4036b;

    /* renamed from: c */
    public int[] f4037c;

    /* renamed from: d */
    public boolean f4038d;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.f4035a + ", mGapDir=" + this.f4036b + ", mHasUnwantedGapAfter=" + this.f4038d + ", mGapPerSpan=" + Arrays.toString(this.f4037c) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4035a);
        parcel.writeInt(this.f4036b);
        parcel.writeInt(this.f4038d ? 1 : 0);
        int[] iArr = this.f4037c;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.f4037c);
        }
    }
}
