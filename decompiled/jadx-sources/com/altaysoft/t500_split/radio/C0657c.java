package com.altaysoft.t500_split.radio;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
import com.sun.jna.Function;
import org.json.JSONObject;
import p121y0.AbstractC1687o;

/* renamed from: com.altaysoft.t500_split.radio.c */
/* loaded from: classes.dex */
public final class C0657c {

    /* renamed from: a */
    public final Context f3086a;

    /* renamed from: b */
    public IBinder f3087b;

    /* renamed from: c */
    public boolean f3088c;

    /* renamed from: d */
    public String f3089d;

    /* renamed from: e */
    public JSONObject f3090e;

    /* renamed from: f */
    public final ServiceConnectionC0655a f3091f = new ServiceConnectionC0655a(this);

    public C0657c(Context context) {
        this.f3086a = context.getApplicationContext();
    }

    /* renamed from: a */
    public final void m1936a() {
        if (!this.f3088c || this.f3087b == null) {
            Intent intent = new Intent(AbstractC1687o.m4925T(Function.MAX_NARGS));
            intent.setComponent(new ComponentName(AbstractC1687o.m4925T(Function.USE_VARARGS), AbstractC1687o.m4925T(Function.MAX_NARGS)));
            try {
                this.f3088c = this.f3086a.bindService(intent, this.f3091f, 1);
            } catch (Exception e2) {
                Log.w("SplitRadio", "GUX bind", e2);
            }
        }
    }

    /* renamed from: b */
    public final void m1937b(JSONObject jSONObject, String str) {
        String str2;
        Bundle bundle = new Bundle();
        String m4925T = AbstractC1687o.m4925T(260);
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(AbstractC1687o.m4925T(274), 0);
            jSONObject2.put(AbstractC1687o.m4925T(273), AbstractC1687o.m4925T(267));
            jSONObject2.put(AbstractC1687o.m4925T(280), 2);
            if (jSONObject != null && jSONObject.length() > 0) {
                jSONObject2.put(AbstractC1687o.m4925T(270), jSONObject);
            }
            str2 = jSONObject2.toString();
        } catch (Exception unused) {
            str2 = "{}";
        }
        bundle.putString(m4925T, str2);
        try {
            try {
                m1940e(bundle, str);
            } catch (Exception e2) {
                Log.w("SplitRadio", "GUX send", e2);
            }
        } catch (Exception unused2) {
            m1939d(bundle, str);
        }
    }

    /* renamed from: c */
    public final void m1938c(JSONObject jSONObject, String str) {
        if (this.f3087b != null) {
            m1937b(jSONObject, str);
            return;
        }
        this.f3089d = str;
        this.f3090e = jSONObject;
        m1936a();
    }

    /* renamed from: d */
    public final void m1939d(Bundle bundle, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(AbstractC1687o.m4925T(257));
            obtain.writeString(AbstractC1687o.m4925T(259));
            obtain.writeString(str);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            this.f3087b.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    /* renamed from: e */
    public final void m1940e(Bundle bundle, String str) {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(AbstractC1687o.m4925T(257));
            obtain.writeString(AbstractC1687o.m4925T(259));
            obtain.writeString(str);
            obtain.writeInt(1);
            bundle.writeToParcel(obtain, 0);
            BinderC0656b binderC0656b = new BinderC0656b();
            binderC0656b.attachInterface(binderC0656b, AbstractC1687o.m4925T(258));
            obtain.writeStrongBinder(binderC0656b);
            this.f3087b.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }
}
