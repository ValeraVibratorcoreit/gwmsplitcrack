package p022K;

import android.view.DisplayCutout;
import java.util.Objects;

/* renamed from: K.i */
/* loaded from: classes.dex */
public final class C0194i {

    /* renamed from: a */
    public final DisplayCutout f525a;

    public C0194i(DisplayCutout displayCutout) {
        this.f525a = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0194i.class != obj.getClass()) {
            return false;
        }
        return Objects.equals(this.f525a, ((C0194i) obj).f525a);
    }

    public final int hashCode() {
        DisplayCutout displayCutout = this.f525a;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.f525a + "}";
    }
}
