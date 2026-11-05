package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;
import p083l0.AbstractC1155a;
import p083l0.C1156b;

/* loaded from: classes.dex */
public class IconCompatParcelizer {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static IconCompat read(AbstractC1155a abstractC1155a) {
        IconCompat iconCompat = new IconCompat();
        int i = iconCompat.f1912a;
        if (abstractC1155a.mo2781e(1)) {
            i = ((C1156b) abstractC1155a).f5300e.readInt();
        }
        iconCompat.f1912a = i;
        byte[] bArr = iconCompat.f1914c;
        if (abstractC1155a.mo2781e(2)) {
            Parcel parcel = ((C1156b) abstractC1155a).f5300e;
            int readInt = parcel.readInt();
            if (readInt < 0) {
                bArr = null;
            } else {
                byte[] bArr2 = new byte[readInt];
                parcel.readByteArray(bArr2);
                bArr = bArr2;
            }
        }
        iconCompat.f1914c = bArr;
        iconCompat.f1915d = abstractC1155a.m2782f(iconCompat.f1915d, 3);
        int i2 = iconCompat.f1916e;
        if (abstractC1155a.mo2781e(4)) {
            i2 = ((C1156b) abstractC1155a).f5300e.readInt();
        }
        iconCompat.f1916e = i2;
        int i3 = iconCompat.f1917f;
        if (abstractC1155a.mo2781e(5)) {
            i3 = ((C1156b) abstractC1155a).f5300e.readInt();
        }
        iconCompat.f1917f = i3;
        iconCompat.f1918g = (ColorStateList) abstractC1155a.m2782f(iconCompat.f1918g, 6);
        String str = iconCompat.f1920i;
        if (abstractC1155a.mo2781e(7)) {
            str = ((C1156b) abstractC1155a).f5300e.readString();
        }
        iconCompat.f1920i = str;
        String str2 = iconCompat.f1921j;
        if (abstractC1155a.mo2781e(8)) {
            str2 = ((C1156b) abstractC1155a).f5300e.readString();
        }
        iconCompat.f1921j = str2;
        iconCompat.f1919h = PorterDuff.Mode.valueOf(iconCompat.f1920i);
        switch (iconCompat.f1912a) {
            case -1:
                Parcelable parcelable = iconCompat.f1915d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                iconCompat.f1913b = parcelable;
                return iconCompat;
            case 0:
            default:
                return iconCompat;
            case 1:
            case 5:
                Parcelable parcelable2 = iconCompat.f1915d;
                if (parcelable2 != null) {
                    iconCompat.f1913b = parcelable2;
                } else {
                    byte[] bArr3 = iconCompat.f1914c;
                    iconCompat.f1913b = bArr3;
                    iconCompat.f1912a = 3;
                    iconCompat.f1916e = 0;
                    iconCompat.f1917f = bArr3.length;
                }
                return iconCompat;
            case 2:
            case 4:
            case 6:
                String str3 = new String(iconCompat.f1914c, Charset.forName("UTF-16"));
                iconCompat.f1913b = str3;
                if (iconCompat.f1912a == 2 && iconCompat.f1921j == null) {
                    iconCompat.f1921j = str3.split(":", -1)[0];
                }
                return iconCompat;
            case 3:
                iconCompat.f1913b = iconCompat.f1914c;
                return iconCompat;
        }
    }

    public static void write(IconCompat iconCompat, AbstractC1155a abstractC1155a) {
        abstractC1155a.getClass();
        iconCompat.f1920i = iconCompat.f1919h.name();
        switch (iconCompat.f1912a) {
            case -1:
                iconCompat.f1915d = (Parcelable) iconCompat.f1913b;
                break;
            case 1:
            case 5:
                iconCompat.f1915d = (Parcelable) iconCompat.f1913b;
                break;
            case 2:
                iconCompat.f1914c = ((String) iconCompat.f1913b).getBytes(Charset.forName("UTF-16"));
                break;
            case 3:
                iconCompat.f1914c = (byte[]) iconCompat.f1913b;
                break;
            case 4:
            case 6:
                iconCompat.f1914c = iconCompat.f1913b.toString().getBytes(Charset.forName("UTF-16"));
                break;
        }
        int i = iconCompat.f1912a;
        if (-1 != i) {
            abstractC1155a.mo2784h(1);
            ((C1156b) abstractC1155a).f5300e.writeInt(i);
        }
        byte[] bArr = iconCompat.f1914c;
        if (bArr != null) {
            abstractC1155a.mo2784h(2);
            int length = bArr.length;
            Parcel parcel = ((C1156b) abstractC1155a).f5300e;
            parcel.writeInt(length);
            parcel.writeByteArray(bArr);
        }
        Parcelable parcelable = iconCompat.f1915d;
        if (parcelable != null) {
            abstractC1155a.mo2784h(3);
            ((C1156b) abstractC1155a).f5300e.writeParcelable(parcelable, 0);
        }
        int i2 = iconCompat.f1916e;
        if (i2 != 0) {
            abstractC1155a.mo2784h(4);
            ((C1156b) abstractC1155a).f5300e.writeInt(i2);
        }
        int i3 = iconCompat.f1917f;
        if (i3 != 0) {
            abstractC1155a.mo2784h(5);
            ((C1156b) abstractC1155a).f5300e.writeInt(i3);
        }
        ColorStateList colorStateList = iconCompat.f1918g;
        if (colorStateList != null) {
            abstractC1155a.mo2784h(6);
            ((C1156b) abstractC1155a).f5300e.writeParcelable(colorStateList, 0);
        }
        String str = iconCompat.f1920i;
        if (str != null) {
            abstractC1155a.mo2784h(7);
            ((C1156b) abstractC1155a).f5300e.writeString(str);
        }
        String str2 = iconCompat.f1921j;
        if (str2 != null) {
            abstractC1155a.mo2784h(8);
            ((C1156b) abstractC1155a).f5300e.writeString(str2);
        }
    }
}
