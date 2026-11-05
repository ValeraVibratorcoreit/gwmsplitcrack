package p021J0;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.altaysoft.t500_split.R;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p006C.AbstractC0055c;
import p068f0.AbstractC0775E;

/* renamed from: J0.c */
/* loaded from: classes.dex */
public final class C0149c extends AbstractC0775E {

    /* renamed from: a */
    public final Paint f458a;

    /* renamed from: b */
    public final List f459b;

    public C0149c() {
        Paint paint = new Paint();
        this.f458a = paint;
        this.f459b = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // p068f0.AbstractC0775E
    /* renamed from: b */
    public final void mo410b(Canvas canvas, RecyclerView recyclerView) {
        int i;
        int i2;
        int m2229E;
        int m2230F;
        Paint paint = this.f458a;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        Iterator it = this.f459b.iterator();
        while (it.hasNext()) {
            ((AbstractC0151e) it.next()).getClass();
            ThreadLocal threadLocal = AbstractC0055c.f201a;
            float f2 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f2)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f2)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f2)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f2))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).m2059C0()) {
                C0150d c0150d = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3448q;
                switch (c0150d.f461b) {
                    case 0:
                        i = 0;
                        break;
                    default:
                        i = c0150d.f462c.m2231G();
                        break;
                }
                float f3 = i;
                C0150d c0150d2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3448q;
                switch (c0150d2.f461b) {
                    case 0:
                        i2 = c0150d2.f462c.f3946o;
                        break;
                    default:
                        CarouselLayoutManager carouselLayoutManager = c0150d2.f462c;
                        i2 = carouselLayoutManager.f3946o - carouselLayoutManager.m2228D();
                        break;
                }
                canvas.drawLine(0.0f, f3, 0.0f, i2, paint);
            } else {
                C0150d c0150d3 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3448q;
                switch (c0150d3.f461b) {
                    case 0:
                        m2229E = c0150d3.f462c.m2229E();
                        break;
                    default:
                        m2229E = 0;
                        break;
                }
                float f4 = m2229E;
                C0150d c0150d4 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).f3448q;
                switch (c0150d4.f461b) {
                    case 0:
                        CarouselLayoutManager carouselLayoutManager2 = c0150d4.f462c;
                        m2230F = carouselLayoutManager2.f3945n - carouselLayoutManager2.m2230F();
                        break;
                    default:
                        m2230F = c0150d4.f462c.f3945n;
                        break;
                }
                canvas.drawLine(f4, 0.0f, m2230F, 0.0f, paint);
            }
        }
    }
}
