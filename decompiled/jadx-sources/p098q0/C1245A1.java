package p098q0;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: q0.A1 */
/* loaded from: classes.dex */
public final class C1245A1 extends View {

    /* renamed from: f */
    public final Paint f5546f;

    /* renamed from: g */
    public final Paint f5547g;

    /* renamed from: h */
    public final Path f5548h;

    /* renamed from: i */
    public final Path f5549i;

    /* renamed from: j */
    public final RectF f5550j;

    /* renamed from: k */
    public final RectF f5551k;

    /* renamed from: l */
    public final ArrayList f5552l;

    public C1245A1(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f5546f = paint;
        Paint paint2 = new Paint(1);
        this.f5547g = paint2;
        this.f5548h = new Path();
        this.f5549i = new Path();
        this.f5550j = new RectF();
        this.f5551k = new RectF();
        this.f5552l = new ArrayList();
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-10862331);
        paint.setStrokeWidth(Math.max(1.0f, 1.5f));
        paint2.setStyle(Paint.Style.FILL);
        paint2.setColor(-16777216);
        setBackgroundColor(0);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Iterator it = this.f5552l.iterator();
        while (it.hasNext()) {
            Rect rect = (Rect) it.next();
            RectF rectF = this.f5551k;
            rectF.set(rect.left + 10.0f, rect.top + 10.0f, rect.right - 10.0f, rect.bottom - 10.0f);
            if (rectF.right > rectF.left && rectF.bottom > rectF.top) {
                RectF rectF2 = this.f5550j;
                rectF2.set(rect.left, rect.top, rect.right, rect.bottom);
                Path path = this.f5548h;
                path.reset();
                Path.Direction direction = Path.Direction.CW;
                path.addRect(rectF2, direction);
                Path path2 = this.f5549i;
                path2.reset();
                path2.addRoundRect(rectF, 10.0f, 10.0f, direction);
                path.op(path2, Path.Op.DIFFERENCE);
                canvas.drawPath(path, this.f5547g);
                canvas.drawRoundRect(rectF, 10.0f, 10.0f, this.f5546f);
            }
        }
    }
}
