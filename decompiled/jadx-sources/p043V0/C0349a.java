package p043V0;

import android.graphics.Paint;
import android.graphics.Path;
import p006C.AbstractC0055c;

/* renamed from: V0.a */
/* loaded from: classes.dex */
public final class C0349a {

    /* renamed from: i */
    public static final int[] f989i = new int[3];

    /* renamed from: j */
    public static final float[] f990j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k */
    public static final int[] f991k = new int[4];

    /* renamed from: l */
    public static final float[] f992l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a */
    public final Paint f993a;

    /* renamed from: b */
    public final Paint f994b;

    /* renamed from: c */
    public final Paint f995c;

    /* renamed from: d */
    public final int f996d;

    /* renamed from: e */
    public final int f997e;

    /* renamed from: f */
    public final int f998f;

    /* renamed from: g */
    public final Path f999g = new Path();

    /* renamed from: h */
    public final Paint f1000h;

    public C0349a() {
        Paint paint = new Paint();
        this.f1000h = paint;
        Paint paint2 = new Paint();
        this.f993a = paint2;
        this.f996d = AbstractC0055c.m107d(-16777216, 68);
        this.f997e = AbstractC0055c.m107d(-16777216, 20);
        this.f998f = AbstractC0055c.m107d(-16777216, 0);
        paint2.setColor(this.f996d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f994b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f995c = new Paint(paint3);
    }
}
