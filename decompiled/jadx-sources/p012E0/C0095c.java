package p012E0;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.jna.Function;
import java.util.Locale;

/* renamed from: E0.c */
/* loaded from: classes.dex */
public final class C0095c implements Parcelable {
    public static final Parcelable.Creator<C0095c> CREATOR = new C0094b(0);

    /* renamed from: A */
    public Integer f286A;

    /* renamed from: B */
    public Integer f287B;

    /* renamed from: C */
    public Integer f288C;

    /* renamed from: D */
    public Boolean f289D;

    /* renamed from: a */
    public int f290a;

    /* renamed from: b */
    public Integer f291b;

    /* renamed from: c */
    public Integer f292c;

    /* renamed from: d */
    public Integer f293d;

    /* renamed from: e */
    public Integer f294e;

    /* renamed from: f */
    public Integer f295f;

    /* renamed from: g */
    public Integer f296g;

    /* renamed from: h */
    public Integer f297h;

    /* renamed from: j */
    public String f299j;

    /* renamed from: n */
    public Locale f303n;

    /* renamed from: o */
    public String f304o;

    /* renamed from: p */
    public CharSequence f305p;

    /* renamed from: q */
    public int f306q;

    /* renamed from: r */
    public int f307r;

    /* renamed from: s */
    public Integer f308s;

    /* renamed from: u */
    public Integer f310u;

    /* renamed from: v */
    public Integer f311v;

    /* renamed from: w */
    public Integer f312w;

    /* renamed from: x */
    public Integer f313x;

    /* renamed from: y */
    public Integer f314y;

    /* renamed from: z */
    public Integer f315z;

    /* renamed from: i */
    public int f298i = Function.USE_VARARGS;

    /* renamed from: k */
    public int f300k = -2;

    /* renamed from: l */
    public int f301l = -2;

    /* renamed from: m */
    public int f302m = -2;

    /* renamed from: t */
    public Boolean f309t = Boolean.TRUE;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f290a);
        parcel.writeSerializable(this.f291b);
        parcel.writeSerializable(this.f292c);
        parcel.writeSerializable(this.f293d);
        parcel.writeSerializable(this.f294e);
        parcel.writeSerializable(this.f295f);
        parcel.writeSerializable(this.f296g);
        parcel.writeSerializable(this.f297h);
        parcel.writeInt(this.f298i);
        parcel.writeString(this.f299j);
        parcel.writeInt(this.f300k);
        parcel.writeInt(this.f301l);
        parcel.writeInt(this.f302m);
        String str = this.f304o;
        parcel.writeString(str != null ? str.toString() : null);
        CharSequence charSequence = this.f305p;
        parcel.writeString(charSequence != null ? charSequence.toString() : null);
        parcel.writeInt(this.f306q);
        parcel.writeSerializable(this.f308s);
        parcel.writeSerializable(this.f310u);
        parcel.writeSerializable(this.f311v);
        parcel.writeSerializable(this.f312w);
        parcel.writeSerializable(this.f313x);
        parcel.writeSerializable(this.f314y);
        parcel.writeSerializable(this.f315z);
        parcel.writeSerializable(this.f288C);
        parcel.writeSerializable(this.f286A);
        parcel.writeSerializable(this.f287B);
        parcel.writeSerializable(this.f309t);
        parcel.writeSerializable(this.f303n);
        parcel.writeSerializable(this.f289D);
    }
}
