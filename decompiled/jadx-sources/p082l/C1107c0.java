package p082l;

import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: l.c0 */
/* loaded from: classes.dex */
public final class C1107c0 {

    /* renamed from: a */
    public int f5154a = 0;

    /* renamed from: b */
    public float f5155b = -1.0f;

    /* renamed from: c */
    public float f5156c = -1.0f;

    /* renamed from: d */
    public float f5157d = -1.0f;

    /* renamed from: e */
    public int[] f5158e = new int[0];

    /* renamed from: f */
    public boolean f5159f = false;

    /* renamed from: g */
    public final TextView f5160g;

    /* renamed from: h */
    public final Context f5161h;

    static {
        new RectF();
        new ConcurrentHashMap();
    }

    public C1107c0(TextView textView) {
        this.f5160g = textView;
        this.f5161h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            new C1101a0();
        } else {
            new C1098Z();
        }
    }

    /* renamed from: a */
    public static int[] m2726a(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    /* renamed from: b */
    public final boolean m2727b() {
        return !(this.f5160g instanceof C1145v);
    }
}
