package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import p067f.AbstractC0770a;

/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {

    /* renamed from: f */
    public final int f1681f;

    /* renamed from: g */
    public final int f1682g;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC0770a.f3913t);
        this.f1682g = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.f1681f = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
