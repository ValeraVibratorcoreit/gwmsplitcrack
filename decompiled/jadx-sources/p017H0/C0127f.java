package p017H0;

import android.os.Parcel;
import android.os.Parcelable;
import com.sun.jna.Platform;
import p019I0.C0138b;
import p034Q0.C0284a;
import p035R.AbstractC0300b;
import p046X.C0422u;
import p047X0.C0430c;
import p054a1.C0491B;
import p068f0.C0786P;
import p082l.C1093W0;
import p095p0.C1235n;
import p117x.C1641f;

/* renamed from: H0.f */
/* loaded from: classes.dex */
public final class C0127f implements Parcelable.ClassLoaderCreator {

    /* renamed from: a */
    public final /* synthetic */ int f390a;

    public /* synthetic */ C0127f(int i) {
        this.f390a = i;
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f390a) {
            case 0:
                return new C0128g(parcel, classLoader);
            case 1:
                return new C0138b(parcel, classLoader);
            case 2:
                return new C0284a(parcel, classLoader);
            case 3:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0300b.f832b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C0422u(parcel, classLoader);
            case 5:
                return new C0430c(parcel, classLoader);
            case 6:
                return new C0491B(parcel, classLoader);
            case 7:
                return new C0786P(parcel, classLoader);
            case 8:
                return new C1093W0(parcel, classLoader);
            case Platform.GNU /* 9 */:
                C1235n c1235n = new C1235n(parcel, classLoader);
                c1235n.f5490a = parcel.readInt();
                c1235n.f5491b = parcel.readInt();
                c1235n.f5492c = parcel.readParcelable(classLoader);
                return c1235n;
            default:
                return new C1641f(parcel, classLoader);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.f390a) {
            case 0:
                return new C0128g[i];
            case 1:
                return new C0138b[i];
            case 2:
                return new C0284a[i];
            case 3:
                return new AbstractC0300b[i];
            case 4:
                return new C0422u[i];
            case 5:
                return new C0430c[i];
            case 6:
                return new C0491B[i];
            case 7:
                return new C0786P[i];
            case 8:
                return new C1093W0[i];
            case Platform.GNU /* 9 */:
                return new C1235n[i];
            default:
                return new C1641f[i];
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f390a) {
            case 0:
                return new C0128g(parcel, (ClassLoader) null);
            case 1:
                return new C0138b(parcel, null);
            case 2:
                return new C0284a(parcel, null);
            case 3:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0300b.f832b;
                }
                throw new IllegalStateException("superState must be null");
            case 4:
                return new C0422u(parcel, null);
            case 5:
                return new C0430c(parcel, (ClassLoader) null);
            case 6:
                return new C0491B(parcel, null);
            case 7:
                return new C0786P(parcel, null);
            case 8:
                return new C1093W0(parcel, null);
            case Platform.GNU /* 9 */:
                C1235n c1235n = new C1235n(parcel, null);
                c1235n.f5490a = parcel.readInt();
                c1235n.f5491b = parcel.readInt();
                c1235n.f5492c = parcel.readParcelable(null);
                return c1235n;
            default:
                return new C1641f(parcel, null);
        }
    }
}
