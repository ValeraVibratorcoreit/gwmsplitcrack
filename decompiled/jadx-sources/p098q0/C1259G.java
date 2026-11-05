package p098q0;

import android.graphics.Bitmap;
import android.util.LruCache;

/* renamed from: q0.G */
/* loaded from: classes.dex */
public final class C1259G extends LruCache {

    /* renamed from: a */
    public final /* synthetic */ int f5714a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1259G(int i, int i2) {
        super(i);
        this.f5714a = i2;
    }

    @Override // android.util.LruCache
    public final int sizeOf(Object obj, Object obj2) {
        switch (this.f5714a) {
            case 0:
                break;
            default:
                break;
        }
        return ((Bitmap) obj2).getByteCount();
    }
}
