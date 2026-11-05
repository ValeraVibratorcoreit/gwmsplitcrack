package p012E0;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.material.datepicker.C0661b;
import com.google.android.material.datepicker.C0663d;
import com.google.android.material.datepicker.C0673n;
import com.sun.jna.Function;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayList;
import java.util.Locale;
import p023K0.C0229b;
import p033Q.C0277k;
import p046X.C0384L;
import p046X.C0388P;
import p046X.C0392U;
import p046X.C0400b;
import p046X.C0402c;
import p058c.C0567a;
import p058c.C0575i;
import p068f0.C0801c0;
import p068f0.C0803d0;
import p068f0.C0823u;
import p082l.C1075N;
import p107t1.AbstractC1461d;

/* renamed from: E0.b */
/* loaded from: classes.dex */
public final class C0094b implements Parcelable.Creator {

    /* renamed from: a */
    public final /* synthetic */ int f285a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f285a) {
            case 0:
                C0095c c0095c = new C0095c();
                c0095c.f298i = Function.USE_VARARGS;
                c0095c.f300k = -2;
                c0095c.f301l = -2;
                c0095c.f302m = -2;
                c0095c.f309t = Boolean.TRUE;
                c0095c.f290a = parcel.readInt();
                c0095c.f291b = (Integer) parcel.readSerializable();
                c0095c.f292c = (Integer) parcel.readSerializable();
                c0095c.f293d = (Integer) parcel.readSerializable();
                c0095c.f294e = (Integer) parcel.readSerializable();
                c0095c.f295f = (Integer) parcel.readSerializable();
                c0095c.f296g = (Integer) parcel.readSerializable();
                c0095c.f297h = (Integer) parcel.readSerializable();
                c0095c.f298i = parcel.readInt();
                c0095c.f299j = parcel.readString();
                c0095c.f300k = parcel.readInt();
                c0095c.f301l = parcel.readInt();
                c0095c.f302m = parcel.readInt();
                c0095c.f304o = parcel.readString();
                c0095c.f305p = parcel.readString();
                c0095c.f306q = parcel.readInt();
                c0095c.f308s = (Integer) parcel.readSerializable();
                c0095c.f310u = (Integer) parcel.readSerializable();
                c0095c.f311v = (Integer) parcel.readSerializable();
                c0095c.f312w = (Integer) parcel.readSerializable();
                c0095c.f313x = (Integer) parcel.readSerializable();
                c0095c.f314y = (Integer) parcel.readSerializable();
                c0095c.f315z = (Integer) parcel.readSerializable();
                c0095c.f288C = (Integer) parcel.readSerializable();
                c0095c.f286A = (Integer) parcel.readSerializable();
                c0095c.f287B = (Integer) parcel.readSerializable();
                c0095c.f309t = (Boolean) parcel.readSerializable();
                c0095c.f303n = (Locale) parcel.readSerializable();
                c0095c.f289D = (Boolean) parcel.readSerializable();
                return c0095c;
            case 1:
                C0229b c0229b = new C0229b(parcel);
                c0229b.f585a = ((Integer) parcel.readValue(C0229b.class.getClassLoader())).intValue();
                return c0229b;
            case 2:
                C0277k c0277k = new C0277k(parcel);
                c0277k.f737a = parcel.readInt();
                return c0277k;
            case 3:
                return new C0400b(parcel);
            case 4:
                return new C0402c(parcel);
            case 5:
                C0384L c0384l = new C0384L();
                c0384l.f1132a = parcel.readString();
                c0384l.f1133b = parcel.readInt();
                return c0384l;
            case 6:
                C0388P c0388p = new C0388P();
                c0388p.f1179e = null;
                c0388p.f1180f = new ArrayList();
                c0388p.f1181g = new ArrayList();
                c0388p.f1175a = parcel.createStringArrayList();
                c0388p.f1176b = parcel.createStringArrayList();
                c0388p.f1177c = (C0400b[]) parcel.createTypedArray(C0400b.CREATOR);
                c0388p.f1178d = parcel.readInt();
                c0388p.f1179e = parcel.readString();
                c0388p.f1180f = parcel.createStringArrayList();
                c0388p.f1181g = parcel.createTypedArrayList(C0402c.CREATOR);
                c0388p.f1182h = parcel.createTypedArrayList(C0384L.CREATOR);
                return c0388p;
            case 7:
                return new C0392U(parcel);
            case 8:
                AbstractC1461d.m3494e("parcel", parcel);
                return new C0567a(parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel), parcel.readInt());
            case Platform.GNU /* 9 */:
                AbstractC1461d.m3494e("inParcel", parcel);
                Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                AbstractC1461d.m3491b(readParcelable);
                return new C0575i((IntentSender) readParcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case Platform.KFREEBSD /* 10 */:
                return new C0661b((C0673n) parcel.readParcelable(C0673n.class.getClassLoader()), (C0673n) parcel.readParcelable(C0673n.class.getClassLoader()), (C0663d) parcel.readParcelable(C0663d.class.getClassLoader()), (C0673n) parcel.readParcelable(C0673n.class.getClassLoader()), parcel.readInt());
            case Platform.NETBSD /* 11 */:
                return new C0663d(parcel.readLong());
            case Platform.DRAGONFLYBSD /* 12 */:
                return C0673n.m2082a(parcel.readInt(), parcel.readInt());
            case 13:
                C0823u c0823u = new C0823u();
                c0823u.f4184a = parcel.readInt();
                c0823u.f4185b = parcel.readInt();
                c0823u.f4186c = parcel.readInt() == 1;
                return c0823u;
            case 14:
                C0801c0 c0801c0 = new C0801c0();
                c0801c0.f4035a = parcel.readInt();
                c0801c0.f4036b = parcel.readInt();
                c0801c0.f4038d = parcel.readInt() == 1;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    c0801c0.f4037c = iArr;
                    parcel.readIntArray(iArr);
                }
                return c0801c0;
            case 15:
                C0803d0 c0803d0 = new C0803d0();
                c0803d0.f4044a = parcel.readInt();
                c0803d0.f4045b = parcel.readInt();
                int readInt2 = parcel.readInt();
                c0803d0.f4046c = readInt2;
                if (readInt2 > 0) {
                    int[] iArr2 = new int[readInt2];
                    c0803d0.f4047d = iArr2;
                    parcel.readIntArray(iArr2);
                }
                int readInt3 = parcel.readInt();
                c0803d0.f4048e = readInt3;
                if (readInt3 > 0) {
                    int[] iArr3 = new int[readInt3];
                    c0803d0.f4049f = iArr3;
                    parcel.readIntArray(iArr3);
                }
                c0803d0.f4051h = parcel.readInt() == 1;
                c0803d0.f4052i = parcel.readInt() == 1;
                c0803d0.f4053j = parcel.readInt() == 1;
                c0803d0.f4050g = parcel.readArrayList(C0801c0.class.getClassLoader());
                return c0803d0;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1075N c1075n = new C1075N(parcel);
                c1075n.f5081a = parcel.readByte() != 0;
                return c1075n;
            default:
                return new ParcelImpl(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f285a) {
            case 0:
                return new C0095c[i];
            case 1:
                return new C0229b[i];
            case 2:
                return new C0277k[i];
            case 3:
                return new C0400b[i];
            case 4:
                return new C0402c[i];
            case 5:
                return new C0384L[i];
            case 6:
                return new C0388P[i];
            case 7:
                return new C0392U[i];
            case 8:
                return new C0567a[i];
            case Platform.GNU /* 9 */:
                return new C0575i[i];
            case Platform.KFREEBSD /* 10 */:
                return new C0661b[i];
            case Platform.NETBSD /* 11 */:
                return new C0663d[i];
            case Platform.DRAGONFLYBSD /* 12 */:
                return new C0673n[i];
            case 13:
                return new C0823u[i];
            case 14:
                return new C0801c0[i];
            case 15:
                return new C0803d0[i];
            case DLLCallback.DLL_FPTRS /* 16 */:
                return new C1075N[i];
            default:
                return new ParcelImpl[i];
        }
    }
}
