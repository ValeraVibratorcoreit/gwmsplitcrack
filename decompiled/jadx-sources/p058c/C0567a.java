package p058c;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import p012E0.C0094b;
import p107t1.AbstractC1461d;

/* renamed from: c.a */
/* loaded from: classes.dex */
public final class C0567a implements Parcelable {
    public static final Parcelable.Creator<C0567a> CREATOR = new C0094b(8);

    /* renamed from: a */
    public final int f2171a;

    /* renamed from: b */
    public final Intent f2172b;

    public C0567a(Intent intent, int i) {
        this.f2171a = i;
        this.f2172b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ActivityResult{resultCode=");
        int i = this.f2171a;
        sb.append(i != -1 ? i != 0 ? String.valueOf(i) : "RESULT_CANCELED" : "RESULT_OK");
        sb.append(", data=");
        sb.append(this.f2172b);
        sb.append('}');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        AbstractC1461d.m3494e("dest", parcel);
        parcel.writeInt(this.f2171a);
        Intent intent = this.f2172b;
        parcel.writeInt(intent == null ? 0 : 1);
        if (intent != null) {
            intent.writeToParcel(parcel, i);
        }
    }
}
