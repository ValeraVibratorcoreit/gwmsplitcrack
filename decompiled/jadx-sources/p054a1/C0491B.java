package p054a1;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import p017H0.C0127f;
import p035R.AbstractC0300b;

/* renamed from: a1.B */
/* loaded from: classes.dex */
public final class C0491B extends AbstractC0300b {
    public static final Parcelable.Creator<C0491B> CREATOR = new C0127f(6);

    /* renamed from: c */
    public CharSequence f1545c;

    /* renamed from: d */
    public boolean f1546d;

    public C0491B(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.f1545c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f1546d = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f1545c) + "}";
    }

    @Override // p035R.AbstractC0300b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.f1545c, parcel, i);
        parcel.writeInt(this.f1546d ? 1 : 0);
    }
}
