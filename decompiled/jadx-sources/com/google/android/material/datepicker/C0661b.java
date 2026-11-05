package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import p012E0.C0094b;

/* renamed from: com.google.android.material.datepicker.b */
/* loaded from: classes.dex */
public final class C0661b implements Parcelable {
    public static final Parcelable.Creator<C0661b> CREATOR = new C0094b(10);

    /* renamed from: a */
    public final C0673n f3474a;

    /* renamed from: b */
    public final C0673n f3475b;

    /* renamed from: c */
    public final C0663d f3476c;

    /* renamed from: d */
    public final C0673n f3477d;

    /* renamed from: e */
    public final int f3478e;

    /* renamed from: f */
    public final int f3479f;

    /* renamed from: g */
    public final int f3480g;

    public C0661b(C0673n c0673n, C0673n c0673n2, C0663d c0663d, C0673n c0673n3, int i) {
        Objects.requireNonNull(c0673n, "start cannot be null");
        Objects.requireNonNull(c0673n2, "end cannot be null");
        Objects.requireNonNull(c0663d, "validator cannot be null");
        this.f3474a = c0673n;
        this.f3475b = c0673n2;
        this.f3477d = c0673n3;
        this.f3478e = i;
        this.f3476c = c0663d;
        if (c0673n3 != null && c0673n.f3535a.compareTo(c0673n3.f3535a) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (c0673n3 != null && c0673n3.f3535a.compareTo(c0673n2.f3535a) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i < 0 || i > AbstractC0681v.m2095c(null).getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f3480g = c0673n.m2085d(c0673n2) + 1;
        this.f3479f = (c0673n2.f3537c - c0673n.f3537c) + 1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0661b)) {
            return false;
        }
        C0661b c0661b = (C0661b) obj;
        return this.f3474a.equals(c0661b.f3474a) && this.f3475b.equals(c0661b.f3475b) && Objects.equals(this.f3477d, c0661b.f3477d) && this.f3478e == c0661b.f3478e && this.f3476c.equals(c0661b.f3476c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f3474a, this.f3475b, this.f3477d, Integer.valueOf(this.f3478e), this.f3476c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f3474a, 0);
        parcel.writeParcelable(this.f3475b, 0);
        parcel.writeParcelable(this.f3477d, 0);
        parcel.writeParcelable(this.f3476c, 0);
        parcel.writeInt(this.f3478e);
    }
}
