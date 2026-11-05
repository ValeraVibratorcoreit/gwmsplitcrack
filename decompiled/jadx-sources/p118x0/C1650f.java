package p118x0;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.InterfaceC0561z;
import com.altaysoft.t500_split.splitinfo.CompassDialView;
import java.util.Locale;

/* renamed from: x0.f */
/* loaded from: classes.dex */
public final /* synthetic */ class C1650f implements InterfaceC0561z {

    /* renamed from: a */
    public final /* synthetic */ int f9383a;

    /* renamed from: b */
    public final /* synthetic */ C1653i f9384b;

    public /* synthetic */ C1650f(C1653i c1653i, int i) {
        this.f9383a = i;
        this.f9384b = c1653i;
    }

    @Override // androidx.lifecycle.InterfaceC0561z
    /* renamed from: a */
    public final void mo1100a(Object obj) {
        CompassDialView compassDialView;
        Float f2 = (Float) obj;
        switch (this.f9383a) {
            case 0:
                C1653i c1653i = this.f9384b;
                if (c1653i.f9433z && f2 != null) {
                    ImageView imageView = c1653i.f9412e;
                    if (imageView != null) {
                        imageView.setRotation(f2.floatValue());
                    }
                    TextView textView = c1653i.f9414g;
                    if (textView != null) {
                        textView.setText(String.format(Locale.US, "%+.0f°", f2));
                        break;
                    }
                }
                break;
            case 1:
                C1653i c1653i2 = this.f9384b;
                if (c1653i2.f9433z && f2 != null) {
                    float f3 = -f2.floatValue();
                    ImageView imageView2 = c1653i2.f9413f;
                    if (imageView2 != null) {
                        imageView2.setRotation(f3);
                    }
                    TextView textView2 = c1653i2.f9415h;
                    if (textView2 != null) {
                        textView2.setText(String.format(Locale.US, "%+.0f°", Float.valueOf(f3)));
                        break;
                    }
                }
                break;
            case 2:
                C1653i c1653i3 = this.f9384b;
                if (c1653i3.f9433z && f2 != null && (compassDialView = c1653i3.f9411d) != null) {
                    compassDialView.setHeading(f2.floatValue());
                    break;
                }
                break;
            case 3:
                this.f9384b.m4803h(f2);
                break;
            case 4:
                this.f9384b.m4802g(f2);
                break;
            case 5:
                this.f9384b.m4804i(f2);
                break;
            default:
                this.f9384b.m4806k();
                break;
        }
    }
}
