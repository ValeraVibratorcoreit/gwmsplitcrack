package p077j0;

import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;

/* renamed from: j0.b */
/* loaded from: classes.dex */
public final class C0971b extends Property {

    /* renamed from: a */
    public final /* synthetic */ int f4659a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0971b(Class cls, String str, int i) {
        super(cls, str);
        this.f4659a = i;
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        switch (this.f4659a) {
            case 0:
                return null;
            case 1:
                return null;
            case 2:
                return null;
            case 3:
                return null;
            case 4:
                return null;
            case 5:
                return Float.valueOf(AbstractC0991v.f4728a.mo2513v((View) obj));
            default:
                return ((View) obj).getClipBounds();
        }
    }

    @Override // android.util.Property
    public final void set(Object obj, Object obj2) {
        switch (this.f4659a) {
            case 0:
                C0974e c0974e = (C0974e) obj;
                PointF pointF = (PointF) obj2;
                c0974e.getClass();
                c0974e.f4662a = Math.round(pointF.x);
                int round = Math.round(pointF.y);
                c0974e.f4663b = round;
                int i = c0974e.f4667f + 1;
                c0974e.f4667f = i;
                if (i == c0974e.f4668g) {
                    AbstractC0991v.m2568a(c0974e.f4666e, c0974e.f4662a, round, c0974e.f4664c, c0974e.f4665d);
                    c0974e.f4667f = 0;
                    c0974e.f4668g = 0;
                    break;
                }
                break;
            case 1:
                C0974e c0974e2 = (C0974e) obj;
                PointF pointF2 = (PointF) obj2;
                c0974e2.getClass();
                c0974e2.f4664c = Math.round(pointF2.x);
                int round2 = Math.round(pointF2.y);
                c0974e2.f4665d = round2;
                int i2 = c0974e2.f4668g + 1;
                c0974e2.f4668g = i2;
                if (c0974e2.f4667f == i2) {
                    AbstractC0991v.m2568a(c0974e2.f4666e, c0974e2.f4662a, c0974e2.f4663b, c0974e2.f4664c, round2);
                    c0974e2.f4667f = 0;
                    c0974e2.f4668g = 0;
                    break;
                }
                break;
            case 2:
                View view = (View) obj;
                PointF pointF3 = (PointF) obj2;
                AbstractC0991v.m2568a(view, view.getLeft(), view.getTop(), Math.round(pointF3.x), Math.round(pointF3.y));
                break;
            case 3:
                View view2 = (View) obj;
                PointF pointF4 = (PointF) obj2;
                AbstractC0991v.m2568a(view2, Math.round(pointF4.x), Math.round(pointF4.y), view2.getRight(), view2.getBottom());
                break;
            case 4:
                View view3 = (View) obj;
                PointF pointF5 = (PointF) obj2;
                int round3 = Math.round(pointF5.x);
                int round4 = Math.round(pointF5.y);
                AbstractC0991v.m2568a(view3, round3, round4, view3.getWidth() + round3, view3.getHeight() + round4);
                break;
            case 5:
                float floatValue = ((Float) obj2).floatValue();
                AbstractC0991v.f4728a.mo2512Z((View) obj, floatValue);
                break;
            default:
                ((View) obj).setClipBounds((Rect) obj2);
                break;
        }
    }
}
