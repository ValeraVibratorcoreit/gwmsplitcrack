package p083l0;

import android.os.Parcel;
import android.util.SparseIntArray;
import p006C.AbstractC0062j;
import p091o.C1192b;

/* renamed from: l0.b */
/* loaded from: classes.dex */
public final class C1156b extends AbstractC1155a {

    /* renamed from: d */
    public final SparseIntArray f5299d;

    /* renamed from: e */
    public final Parcel f5300e;

    /* renamed from: f */
    public final int f5301f;

    /* renamed from: g */
    public final int f5302g;

    /* renamed from: h */
    public final String f5303h;

    /* renamed from: i */
    public int f5304i;

    /* renamed from: j */
    public int f5305j;

    /* renamed from: k */
    public int f5306k;

    public C1156b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C1192b(), new C1192b(), new C1192b());
    }

    @Override // p083l0.AbstractC1155a
    /* renamed from: a */
    public final C1156b mo2777a() {
        Parcel parcel = this.f5300e;
        int dataPosition = parcel.dataPosition();
        int i = this.f5305j;
        if (i == this.f5301f) {
            i = this.f5302g;
        }
        return new C1156b(parcel, dataPosition, i, AbstractC0062j.m162p(new StringBuilder(), this.f5303h, "  "), this.f5296a, this.f5297b, this.f5298c);
    }

    @Override // p083l0.AbstractC1155a
    /* renamed from: e */
    public final boolean mo2781e(int i) {
        while (this.f5305j < this.f5302g) {
            int i2 = this.f5306k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            int i3 = this.f5305j;
            Parcel parcel = this.f5300e;
            parcel.setDataPosition(i3);
            int readInt = parcel.readInt();
            this.f5306k = parcel.readInt();
            this.f5305j += readInt;
        }
        return this.f5306k == i;
    }

    @Override // p083l0.AbstractC1155a
    /* renamed from: h */
    public final void mo2784h(int i) {
        int i2 = this.f5304i;
        SparseIntArray sparseIntArray = this.f5299d;
        Parcel parcel = this.f5300e;
        if (i2 >= 0) {
            int i3 = sparseIntArray.get(i2);
            int dataPosition = parcel.dataPosition();
            parcel.setDataPosition(i3);
            parcel.writeInt(dataPosition - i3);
            parcel.setDataPosition(dataPosition);
        }
        this.f5304i = i;
        sparseIntArray.put(i, parcel.dataPosition());
        parcel.writeInt(0);
        parcel.writeInt(i);
    }

    public C1156b(Parcel parcel, int i, int i2, String str, C1192b c1192b, C1192b c1192b2, C1192b c1192b3) {
        super(c1192b, c1192b2, c1192b3);
        this.f5299d = new SparseIntArray();
        this.f5304i = -1;
        this.f5306k = -1;
        this.f5300e = parcel;
        this.f5301f = i;
        this.f5302g = i2;
        this.f5305j = i;
        this.f5303h = str;
    }
}
