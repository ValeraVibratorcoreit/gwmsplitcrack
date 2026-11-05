package p118x0;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.splitinfo.CompassDialView;
import java.util.Locale;

/* renamed from: x0.k */
/* loaded from: classes.dex */
public final /* synthetic */ class C1655k implements InterfaceC0561z {

    /* renamed from: a */
    public final /* synthetic */ int f9436a;

    /* renamed from: b */
    public final /* synthetic */ C1656l f9437b;

    public /* synthetic */ C1655k(C1656l c1656l, int i) {
        this.f9436a = i;
        this.f9437b = c1656l;
    }

    @Override // androidx.lifecycle.InterfaceC0561z
    /* renamed from: a */
    public final void mo1100a(Object obj) {
        CompassDialView compassDialView;
        Float f2 = (Float) obj;
        switch (this.f9436a) {
            case 0:
                C1656l c1656l = this.f9437b;
                if (c1656l.f9445h == 1 && f2 != null) {
                    ImageView imageView = c1656l.f9441d;
                    if (imageView != null) {
                        imageView.setRotation(f2.floatValue());
                    }
                    TextView textView = c1656l.f9443f;
                    if (textView != null) {
                        textView.setText(String.format(Locale.US, "%+.0f°", f2));
                        break;
                    }
                }
                break;
            case 1:
                C1656l c1656l2 = this.f9437b;
                if (c1656l2.f9445h == 1 && f2 != null) {
                    float f3 = -f2.floatValue();
                    ImageView imageView2 = c1656l2.f9442e;
                    if (imageView2 != null) {
                        imageView2.setRotation(f3);
                    }
                    TextView textView2 = c1656l2.f9444g;
                    if (textView2 != null) {
                        textView2.setText(String.format(Locale.US, "%+.0f°", Float.valueOf(f3)));
                        break;
                    }
                }
                break;
            default:
                C1656l c1656l3 = this.f9437b;
                if (c1656l3.f9445h == 1 && f2 != null && (compassDialView = c1656l3.f9440c) != null) {
                    compassDialView.setHeading(f2.floatValue());
                    break;
                }
                break;
        }
    }
}
