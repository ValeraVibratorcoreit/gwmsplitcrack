package p046X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import p012E0.C0094b;

/* renamed from: X.b */
/* loaded from: classes.dex */
public final class C0400b implements Parcelable {
    public static final Parcelable.Creator<C0400b> CREATOR = new C0094b(3);

    /* renamed from: a */
    public final int[] f1249a;

    /* renamed from: b */
    public final ArrayList f1250b;

    /* renamed from: c */
    public final int[] f1251c;

    /* renamed from: d */
    public final int[] f1252d;

    /* renamed from: e */
    public final int f1253e;

    /* renamed from: f */
    public final String f1254f;

    /* renamed from: g */
    public final int f1255g;

    /* renamed from: h */
    public final int f1256h;

    /* renamed from: i */
    public final CharSequence f1257i;

    /* renamed from: j */
    public final int f1258j;

    /* renamed from: k */
    public final CharSequence f1259k;

    /* renamed from: l */
    public final ArrayList f1260l;

    /* renamed from: m */
    public final ArrayList f1261m;

    /* renamed from: n */
    public final boolean f1262n;

    public C0400b(C0398a c0398a) {
        int size = c0398a.f1228a.size();
        this.f1249a = new int[size * 6];
        if (!c0398a.f1234g) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f1250b = new ArrayList(size);
        this.f1251c = new int[size];
        this.f1252d = new int[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            C0395X c0395x = (C0395X) c0398a.f1228a.get(i2);
            int i3 = i + 1;
            this.f1249a[i] = c0395x.f1212a;
            ArrayList arrayList = this.f1250b;
            AbstractComponentCallbacksC0423v abstractComponentCallbacksC0423v = c0395x.f1213b;
            arrayList.add(abstractComponentCallbacksC0423v != null ? abstractComponentCallbacksC0423v.f1361j : null);
            int[] iArr = this.f1249a;
            iArr[i3] = c0395x.f1214c ? 1 : 0;
            iArr[i + 2] = c0395x.f1215d;
            iArr[i + 3] = c0395x.f1216e;
            int i4 = i + 5;
            iArr[i + 4] = c0395x.f1217f;
            i += 6;
            iArr[i4] = c0395x.f1218g;
            this.f1251c[i2] = c0395x.f1219h.ordinal();
            this.f1252d[i2] = c0395x.f1220i.ordinal();
        }
        this.f1253e = c0398a.f1233f;
        this.f1254f = c0398a.f1235h;
        this.f1255g = c0398a.f1245r;
        this.f1256h = c0398a.f1236i;
        this.f1257i = c0398a.f1237j;
        this.f1258j = c0398a.f1238k;
        this.f1259k = c0398a.f1239l;
        this.f1260l = c0398a.f1240m;
        this.f1261m = c0398a.f1241n;
        this.f1262n = c0398a.f1242o;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeIntArray(this.f1249a);
        parcel.writeStringList(this.f1250b);
        parcel.writeIntArray(this.f1251c);
        parcel.writeIntArray(this.f1252d);
        parcel.writeInt(this.f1253e);
        parcel.writeString(this.f1254f);
        parcel.writeInt(this.f1255g);
        parcel.writeInt(this.f1256h);
        TextUtils.writeToParcel(this.f1257i, parcel, 0);
        parcel.writeInt(this.f1258j);
        TextUtils.writeToParcel(this.f1259k, parcel, 0);
        parcel.writeStringList(this.f1260l);
        parcel.writeStringList(this.f1261m);
        parcel.writeInt(this.f1262n ? 1 : 0);
    }

    public C0400b(Parcel parcel) {
        this.f1249a = parcel.createIntArray();
        this.f1250b = parcel.createStringArrayList();
        this.f1251c = parcel.createIntArray();
        this.f1252d = parcel.createIntArray();
        this.f1253e = parcel.readInt();
        this.f1254f = parcel.readString();
        this.f1255g = parcel.readInt();
        this.f1256h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f1257i = (CharSequence) creator.createFromParcel(parcel);
        this.f1258j = parcel.readInt();
        this.f1259k = (CharSequence) creator.createFromParcel(parcel);
        this.f1260l = parcel.createStringArrayList();
        this.f1261m = parcel.createStringArrayList();
        this.f1262n = parcel.readInt() != 0;
    }
}
