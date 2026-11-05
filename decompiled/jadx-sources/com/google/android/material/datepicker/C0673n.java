package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import android.icu.text.DisplayContext;
import android.icu.util.TimeZone;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import p012E0.C0094b;

/* renamed from: com.google.android.material.datepicker.n */
/* loaded from: classes.dex */
public final class C0673n implements Comparable, Parcelable {
    public static final Parcelable.Creator<C0673n> CREATOR = new C0094b(12);

    /* renamed from: a */
    public final Calendar f3535a;

    /* renamed from: b */
    public final int f3536b;

    /* renamed from: c */
    public final int f3537c;

    /* renamed from: d */
    public final int f3538d;

    /* renamed from: e */
    public final int f3539e;

    /* renamed from: f */
    public final long f3540f;

    /* renamed from: g */
    public String f3541g;

    public C0673n(Calendar calendar) {
        calendar.set(5, 1);
        Calendar m2093a = AbstractC0681v.m2093a(calendar);
        this.f3535a = m2093a;
        this.f3536b = m2093a.get(2);
        this.f3537c = m2093a.get(1);
        this.f3538d = m2093a.getMaximum(7);
        this.f3539e = m2093a.getActualMaximum(5);
        this.f3540f = m2093a.getTimeInMillis();
    }

    /* renamed from: a */
    public static C0673n m2082a(int i, int i2) {
        Calendar m2095c = AbstractC0681v.m2095c(null);
        m2095c.set(1, i);
        m2095c.set(2, i2);
        return new C0673n(m2095c);
    }

    /* renamed from: b */
    public static C0673n m2083b(long j2) {
        Calendar m2095c = AbstractC0681v.m2095c(null);
        m2095c.setTimeInMillis(j2);
        return new C0673n(m2095c);
    }

    /* renamed from: c */
    public final String m2084c() {
        if (this.f3541g == null) {
            long timeInMillis = this.f3535a.getTimeInMillis();
            Locale locale = Locale.getDefault();
            AtomicReference atomicReference = AbstractC0681v.f3555a;
            DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton("yMMMM", locale);
            instanceForSkeleton.setTimeZone(TimeZone.getTimeZone("UTC"));
            instanceForSkeleton.setContext(DisplayContext.CAPITALIZATION_FOR_STANDALONE);
            this.f3541g = instanceForSkeleton.format(new Date(timeInMillis));
        }
        return this.f3541g;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f3535a.compareTo(((C0673n) obj).f3535a);
    }

    /* renamed from: d */
    public final int m2085d(C0673n c0673n) {
        if (!(this.f3535a instanceof GregorianCalendar)) {
            throw new IllegalArgumentException("Only Gregorian calendars are supported.");
        }
        return (c0673n.f3536b - this.f3536b) + ((c0673n.f3537c - this.f3537c) * 12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0673n)) {
            return false;
        }
        C0673n c0673n = (C0673n) obj;
        return this.f3536b == c0673n.f3536b && this.f3537c == c0673n.f3537c;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3536b), Integer.valueOf(this.f3537c)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f3537c);
        parcel.writeInt(this.f3536b);
    }
}
