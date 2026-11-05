package p058c;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import p012E0.C0094b;
import p107t1.AbstractC1461d;

/* renamed from: c.i */
/* loaded from: classes.dex */
public final class C0575i implements Parcelable {
    public static final Parcelable.Creator<C0575i> CREATOR = new C0094b(9);

    /* renamed from: a */
    public final IntentSender f2187a;

    /* renamed from: b */
    public final Intent f2188b;

    /* renamed from: c */
    public final int f2189c;

    /* renamed from: d */
    public final int f2190d;

    public C0575i(IntentSender intentSender, Intent intent, int i, int i2) {
        this.f2187a = intentSender;
        this.f2188b = intent;
        this.f2189c = i;
        this.f2190d = i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1461d.m3494e("dest", parcel);
        parcel.writeParcelable(this.f2187a, i);
        parcel.writeParcelable(this.f2188b, i);
        parcel.writeInt(this.f2189c);
        parcel.writeInt(this.f2190d);
    }
}
