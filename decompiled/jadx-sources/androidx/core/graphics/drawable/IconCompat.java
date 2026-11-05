package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import p008D.AbstractC0072c;

/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* renamed from: k */
    public static final PorterDuff.Mode f1911k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b */
    public Object f1913b;

    /* renamed from: j */
    public String f1921j;

    /* renamed from: a */
    public int f1912a = -1;

    /* renamed from: c */
    public byte[] f1914c = null;

    /* renamed from: d */
    public Parcelable f1915d = null;

    /* renamed from: e */
    public int f1916e = 0;

    /* renamed from: f */
    public int f1917f = 0;

    /* renamed from: g */
    public ColorStateList f1918g = null;

    /* renamed from: h */
    public PorterDuff.Mode f1919h = f1911k;

    /* renamed from: i */
    public String f1920i = null;

    public final String toString() {
        String str;
        int i;
        if (this.f1912a == -1) {
            return String.valueOf(this.f1913b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.f1912a) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.f1912a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f1913b).getWidth());
                sb.append("x");
                sb.append(((Bitmap) this.f1913b).getHeight());
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f1921j);
                sb.append(" id=");
                int i2 = this.f1912a;
                if (i2 == -1) {
                    i = AbstractC0072c.m210a(this.f1913b);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("called getResId() on " + this);
                    }
                    i = this.f1916e;
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f1916e);
                if (this.f1917f != 0) {
                    sb.append(" off=");
                    sb.append(this.f1917f);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f1913b);
                break;
        }
        if (this.f1918g != null) {
            sb.append(" tint=");
            sb.append(this.f1918g);
        }
        if (this.f1919h != f1911k) {
            sb.append(" mode=");
            sb.append(this.f1919h);
        }
        sb.append(")");
        return sb.toString();
    }
}
