package p046X;

import android.os.Parcel;
import android.os.Parcelable;
import p012E0.C0094b;

/* renamed from: X.U */
/* loaded from: classes.dex */
public final class C0392U implements Parcelable {
    public static final Parcelable.Creator<C0392U> CREATOR = new C0094b(7);

    /* renamed from: a */
    public final String f1191a;

    /* renamed from: b */
    public final String f1192b;

    /* renamed from: c */
    public final boolean f1193c;

    /* renamed from: d */
    public final int f1194d;

    /* renamed from: e */
    public final int f1195e;

    /* renamed from: f */
    public final String f1196f;

    /* renamed from: g */
    public final boolean f1197g;

    /* renamed from: h */
    public final boolean f1198h;

    /* renamed from: i */
    public final boolean f1199i;

    /* renamed from: j */
    public final boolean f1200j;

    /* renamed from: k */
    public final int f1201k;

    /* renamed from: l */
    public final String f1202l;

    /* renamed from: m */
    public final int f1203m;

    /* renamed from: n */
    public final boolean f1204n;

    public C0392U(AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v) {
        this.f1191a = abstractComponentCallbacksC0423v.getClass().getName();
        this.f1192b = abstractComponentCallbacksC0423v.f1361j;
        this.f1193c = abstractComponentCallbacksC0423v.f1369r;
        this.f1194d = abstractComponentCallbacksC0423v.f1333A;
        this.f1195e = abstractComponentCallbacksC0423v.f1334B;
        this.f1196f = abstractComponentCallbacksC0423v.f1335C;
        this.f1197g = abstractComponentCallbacksC0423v.f1338F;
        this.f1198h = abstractComponentCallbacksC0423v.f1368q;
        this.f1199i = abstractComponentCallbacksC0423v.f1337E;
        this.f1200j = abstractComponentCallbacksC0423v.f1336D;
        this.f1201k = abstractComponentCallbacksC0423v.f1350R.ordinal();
        this.f1202l = abstractComponentCallbacksC0423v.f1364m;
        this.f1203m = abstractComponentCallbacksC0423v.f1365n;
        this.f1204n = abstractComponentCallbacksC0423v.f1344L;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f1191a);
        sb.append(" (");
        sb.append(this.f1192b);
        sb.append(")}:");
        if (this.f1193c) {
            sb.append(" fromLayout");
        }
        int i = this.f1195e;
        if (i != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i));
        }
        String str = this.f1196f;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f1197g) {
            sb.append(" retainInstance");
        }
        if (this.f1198h) {
            sb.append(" removing");
        }
        if (this.f1199i) {
            sb.append(" detached");
        }
        if (this.f1200j) {
            sb.append(" hidden");
        }
        String str2 = this.f1202l;
        if (str2 != null) {
            sb.append(" targetWho=");
            sb.append(str2);
            sb.append(" targetRequestCode=");
            sb.append(this.f1203m);
        }
        if (this.f1204n) {
            sb.append(" userVisibleHint");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f1191a);
        parcel.writeString(this.f1192b);
        parcel.writeInt(this.f1193c ? 1 : 0);
        parcel.writeInt(this.f1194d);
        parcel.writeInt(this.f1195e);
        parcel.writeString(this.f1196f);
        parcel.writeInt(this.f1197g ? 1 : 0);
        parcel.writeInt(this.f1198h ? 1 : 0);
        parcel.writeInt(this.f1199i ? 1 : 0);
        parcel.writeInt(this.f1200j ? 1 : 0);
        parcel.writeInt(this.f1201k);
        parcel.writeString(this.f1202l);
        parcel.writeInt(this.f1203m);
        parcel.writeInt(this.f1204n ? 1 : 0);
    }

    public C0392U(Parcel parcel) {
        this.f1191a = parcel.readString();
        this.f1192b = parcel.readString();
        this.f1193c = parcel.readInt() != 0;
        this.f1194d = parcel.readInt();
        this.f1195e = parcel.readInt();
        this.f1196f = parcel.readString();
        this.f1197g = parcel.readInt() != 0;
        this.f1198h = parcel.readInt() != 0;
        this.f1199i = parcel.readInt() != 0;
        this.f1200j = parcel.readInt() != 0;
        this.f1201k = parcel.readInt();
        this.f1202l = parcel.readString();
        this.f1203m = parcel.readInt();
        this.f1204n = parcel.readInt() != 0;
    }
}
