package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import p083l0.AbstractC1155a;
import p083l0.C1156b;
import p083l0.InterfaceC1157c;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC1155a abstractC1155a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC1157c interfaceC1157c = remoteActionCompat.f1899a;
        if (abstractC1155a.mo2781e(1)) {
            interfaceC1157c = abstractC1155a.m2783g();
        }
        remoteActionCompat.f1899a = (IconCompat) interfaceC1157c;
        CharSequence charSequence = remoteActionCompat.f1900b;
        if (abstractC1155a.mo2781e(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1156b) abstractC1155a).f5300e);
        }
        remoteActionCompat.f1900b = charSequence;
        CharSequence charSequence2 = remoteActionCompat.f1901c;
        if (abstractC1155a.mo2781e(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C1156b) abstractC1155a).f5300e);
        }
        remoteActionCompat.f1901c = charSequence2;
        remoteActionCompat.f1902d = (PendingIntent) abstractC1155a.m2782f(remoteActionCompat.f1902d, 4);
        boolean z2 = remoteActionCompat.f1903e;
        if (abstractC1155a.mo2781e(5)) {
            z2 = ((C1156b) abstractC1155a).f5300e.readInt() != 0;
        }
        remoteActionCompat.f1903e = z2;
        boolean z3 = remoteActionCompat.f1904f;
        if (abstractC1155a.mo2781e(6)) {
            z3 = ((C1156b) abstractC1155a).f5300e.readInt() != 0;
        }
        remoteActionCompat.f1904f = z3;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC1155a abstractC1155a) {
        abstractC1155a.getClass();
        IconCompat iconCompat = remoteActionCompat.f1899a;
        abstractC1155a.mo2784h(1);
        abstractC1155a.m2785i(iconCompat);
        CharSequence charSequence = remoteActionCompat.f1900b;
        abstractC1155a.mo2784h(2);
        Parcel parcel = ((C1156b) abstractC1155a).f5300e;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.f1901c;
        abstractC1155a.mo2784h(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.f1902d;
        abstractC1155a.mo2784h(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.f1903e;
        abstractC1155a.mo2784h(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z3 = remoteActionCompat.f1904f;
        abstractC1155a.mo2784h(6);
        parcel.writeInt(z3 ? 1 : 0);
    }
}
