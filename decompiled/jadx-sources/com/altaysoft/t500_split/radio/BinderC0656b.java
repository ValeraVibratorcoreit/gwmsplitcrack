package com.altaysoft.t500_split.radio;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import p121y0.AbstractC1687o;

/* renamed from: com.altaysoft.t500_split.radio.b */
/* loaded from: classes.dex */
public final class BinderC0656b extends Binder implements IInterface {
    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String m4925T = AbstractC1687o.m4925T(258);
        if (i == 1598968902) {
            parcel2.writeString(m4925T);
            return true;
        }
        if (i != 1) {
            return super.onTransact(i, parcel, parcel2, i2);
        }
        parcel.enforceInterface(m4925T);
        parcel.readString();
        parcel.readString();
        if (parcel.readInt() != 0) {
            Bundle.CREATOR.createFromParcel(parcel);
        }
        if (parcel2 != null) {
            parcel2.writeNoException();
        }
        return true;
    }
}
