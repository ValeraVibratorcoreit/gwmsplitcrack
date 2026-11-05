package p046X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import p012E0.C0094b;

/* renamed from: X.P */
/* loaded from: classes.dex */
public final class C0388P implements Parcelable {
    public static final Parcelable.Creator<C0388P> CREATOR = new C0094b(6);

    /* renamed from: a */
    public ArrayList f1175a;

    /* renamed from: b */
    public ArrayList f1176b;

    /* renamed from: c */
    public C0400b[] f1177c;

    /* renamed from: d */
    public int f1178d;

    /* renamed from: e */
    public String f1179e;

    /* renamed from: f */
    public ArrayList f1180f;

    /* renamed from: g */
    public ArrayList f1181g;

    /* renamed from: h */
    public ArrayList f1182h;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.f1175a);
        parcel.writeStringList(this.f1176b);
        parcel.writeTypedArray(this.f1177c, i);
        parcel.writeInt(this.f1178d);
        parcel.writeString(this.f1179e);
        parcel.writeStringList(this.f1180f);
        parcel.writeTypedList(this.f1181g);
        parcel.writeTypedList(this.f1182h);
    }
}
