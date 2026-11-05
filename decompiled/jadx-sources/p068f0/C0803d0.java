package p068f0;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p012E0.C0094b;

/* renamed from: f0.d0 */
/* loaded from: classes.dex */
public final class C0803d0 implements Parcelable {
    public static final Parcelable.Creator<C0803d0> CREATOR = new C0094b(15);

    /* renamed from: a */
    public int f4044a;

    /* renamed from: b */
    public int f4045b;

    /* renamed from: c */
    public int f4046c;

    /* renamed from: d */
    public int[] f4047d;

    /* renamed from: e */
    public int f4048e;

    /* renamed from: f */
    public int[] f4049f;

    /* renamed from: g */
    public ArrayList f4050g;

    /* renamed from: h */
    public boolean f4051h;

    /* renamed from: i */
    public boolean f4052i;

    /* renamed from: j */
    public boolean f4053j;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f4044a);
        parcel.writeInt(this.f4045b);
        parcel.writeInt(this.f4046c);
        if (this.f4046c > 0) {
            parcel.writeIntArray(this.f4047d);
        }
        parcel.writeInt(this.f4048e);
        if (this.f4048e > 0) {
            parcel.writeIntArray(this.f4049f);
        }
        parcel.writeInt(this.f4051h ? 1 : 0);
        parcel.writeInt(this.f4052i ? 1 : 0);
        parcel.writeInt(this.f4053j ? 1 : 0);
        parcel.writeList(this.f4050g);
    }
}
