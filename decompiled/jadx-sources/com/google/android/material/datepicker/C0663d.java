package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p012E0.C0094b;

/* renamed from: com.google.android.material.datepicker.d */
/* loaded from: classes.dex */
public final class C0663d implements Parcelable {
    public static final Parcelable.Creator<C0663d> CREATOR = new C0094b(11);

    /* renamed from: a */
    public final long f3483a;

    public C0663d(long j2) {
        this.f3483a = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0663d) && this.f3483a == ((C0663d) obj).f3483a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f3483a)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f3483a);
    }
}
