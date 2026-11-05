package p001A0;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.altaysoft.t500_split.R;
import org.vosk.Model;
import p098q0.C1288V;
import p098q0.C1324i1;

/* renamed from: A0.m */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0019m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f53a;

    /* renamed from: b */
    public final /* synthetic */ int f54b;

    /* renamed from: c */
    public final /* synthetic */ Object f55c;

    /* renamed from: d */
    public final /* synthetic */ Object f56d;

    /* renamed from: e */
    public final /* synthetic */ Object f57e;

    public /* synthetic */ RunnableC0019m(Object obj, int i, Object obj2, Object obj3, int i2) {
        this.f53a = i2;
        this.f55c = obj;
        this.f54b = i;
        this.f56d = obj2;
        this.f57e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53a) {
            case 0:
                C0021o c0021o = (C0021o) this.f55c;
                int i = this.f54b;
                Model model = (Model) this.f56d;
                String str = (String) this.f57e;
                synchronized (c0021o.f62b) {
                    c0021o.f64d = false;
                }
                if (i != c0021o.f63c) {
                    if (model != null) {
                        try {
                            model.close();
                        } catch (Exception unused) {
                        }
                    }
                    if (c0021o.m37k() && c0021o.f68h == null) {
                        c0021o.m30b();
                        return;
                    }
                    return;
                }
                if (model == null) {
                    c0021o.m32f();
                    AbstractC0023q.m38a(1);
                    return;
                }
                if (c0021o.f68h != null) {
                    try {
                        model.close();
                    } catch (Exception unused2) {
                    }
                } else {
                    c0021o.f68h = model;
                    c0021o.f69i = str;
                }
                c0021o.f78r = 3;
                if (!c0021o.m37k()) {
                    AbstractC0023q.m38a(1);
                    return;
                } else {
                    AbstractC0023q.m38a(2);
                    c0021o.m34h();
                    return;
                }
            case 1:
                Context context = (Context) this.f56d;
                FrameLayout frameLayout = (FrameLayout) this.f57e;
                C1288V c1288v = (C1288V) this.f55c;
                if (this.f54b != c1288v.f6026v) {
                    return;
                }
                c1288v.f6027w = null;
                try {
                    c1288v.f6019o = true;
                    c1288v.f6018n = null;
                    View inflate = LayoutInflater.from(context).inflate(R.layout.ip_msg_notify_overlay, (ViewGroup) frameLayout, false);
                    c1288v.f6006b = inflate;
                    c1288v.m3136d(inflate);
                    c1288v.m3134b(context);
                    c1288v.f6006b.setElevation(40.0f);
                    frameLayout.addView(c1288v.f6006b);
                    c1288v.f6006b.bringToFront();
                    c1288v.f6020p = true;
                    c1288v.m3133a();
                    return;
                } catch (Exception unused3) {
                    c1288v.m3145v();
                    return;
                }
            default:
                C1324i1 c1324i1 = (C1324i1) this.f55c;
                boolean z2 = c1324i1.f6172J0;
                Bitmap bitmap = (Bitmap) this.f56d;
                if (z2) {
                    if (this.f54b == c1324i1.f6157C) {
                        Bitmap bitmap2 = c1324i1.f6153A;
                        c1324i1.f6153A = bitmap;
                        c1324i1.f6155B = (Bitmap) this.f57e;
                        ImageView imageView = c1324i1.f6257y;
                        if (imageView != null) {
                            if (bitmap != null) {
                                imageView.setImageBitmap(bitmap);
                                c1324i1.f6257y.setVisibility(0);
                                View view = c1324i1.f6259z;
                                if (view != null) {
                                    view.setVisibility(0);
                                }
                            } else {
                                c1324i1.m3223i(false);
                            }
                        }
                        if (bitmap2 == null || bitmap2 == bitmap || bitmap2.isRecycled()) {
                            return;
                        }
                        bitmap2.recycle();
                        return;
                    }
                }
                if (bitmap != null) {
                    bitmap.recycle();
                    return;
                }
                return;
        }
    }
}
