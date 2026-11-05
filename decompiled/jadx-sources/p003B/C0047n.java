package p003B;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: B.n */
/* loaded from: classes.dex */
public final class C0047n {

    /* renamed from: a */
    public final Resources f146a;

    /* renamed from: b */
    public final Resources.Theme f147b;

    public C0047n(Resources resources, Resources.Theme theme) {
        this.f146a = resources;
        this.f147b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0047n.class != obj.getClass()) {
            return false;
        }
        C0047n c0047n = (C0047n) obj;
        return this.f146a.equals(c0047n.f146a) && Objects.equals(this.f147b, c0047n.f147b);
    }

    public final int hashCode() {
        return Objects.hash(this.f146a, this.f147b);
    }
}
