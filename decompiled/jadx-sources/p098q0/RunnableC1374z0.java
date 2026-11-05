package p098q0;

import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: q0.z0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1374z0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f6452a;

    /* renamed from: b */
    public final /* synthetic */ C1253D0 f6453b;

    public /* synthetic */ RunnableC1374z0(C1253D0 c1253d0, int i) {
        this.f6452a = i;
        this.f6453b = c1253d0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6452a) {
            case 0:
                C1253D0 c1253d0 = this.f6453b;
                ImageView imageView = c1253d0.f5638h;
                if (imageView != null) {
                    float height = imageView.getHeight();
                    float width = c1253d0.f5638h.getWidth();
                    float left = c1253d0.f5638h.getLeft();
                    float top = c1253d0.f5638h.getTop();
                    TextView textView = c1253d0.f5611N;
                    float lineHeight = textView != null ? textView.getLineHeight() : c1253d0.m2973k(22.0f);
                    c1253d0.f5638h.setTranslationY((1.2f * lineHeight) + (((-height) * 17.0f) / 120.0f));
                    float translationY = c1253d0.f5638h.getTranslationY();
                    float f2 = top + translationY;
                    ImageView[] imageViewArr = c1253d0.f5640i;
                    if (imageViewArr != null) {
                        for (ImageView imageView2 : imageViewArr) {
                            if (imageView2 != null) {
                                imageView2.setTranslationY(translationY);
                            }
                        }
                    }
                    ImageView[] imageViewArr2 = c1253d0.f5642j;
                    if (imageViewArr2 != null) {
                        for (ImageView imageView3 : imageViewArr2) {
                            if (imageView3 != null) {
                                imageView3.setTranslationY(translationY);
                            }
                        }
                    }
                    float f3 = (0.19f * height) + f2 + lineHeight;
                    float f4 = (height * 0.67f) + f2;
                    float f5 = (0.5f * width) + left;
                    float f6 = width * 0.28f;
                    float f7 = f5 - f6;
                    float f8 = f5 + f6;
                    c1253d0.m2980s(c1253d0.f5611N, f7, f3, true);
                    c1253d0.m2980s(c1253d0.f5612O, f8, f3, false);
                    c1253d0.m2980s(c1253d0.f5613P, f7, f4, true);
                    c1253d0.m2980s(c1253d0.f5614Q, f8, f4, false);
                    break;
                }
                break;
            case 1:
                C1253D0 c1253d02 = this.f6453b;
                c1253d02.m2982u();
                c1253d02.f5621X = false;
                break;
            default:
                this.f6453b.m2967e();
                break;
        }
    }
}
