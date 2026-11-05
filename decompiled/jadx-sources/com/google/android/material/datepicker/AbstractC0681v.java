package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.material.datepicker.v */
/* loaded from: classes.dex */
public abstract class AbstractC0681v {

    /* renamed from: a */
    public static final AtomicReference f3555a = new AtomicReference();

    /* renamed from: a */
    public static Calendar m2093a(Calendar calendar) {
        Calendar m2095c = m2095c(calendar);
        Calendar m2095c2 = m2095c(null);
        m2095c2.set(m2095c.get(1), m2095c.get(2), m2095c.get(5));
        return m2095c2;
    }

    /* renamed from: b */
    public static Calendar m2094b() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
        return calendar;
    }

    /* renamed from: c */
    public static Calendar m2095c(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }
}
