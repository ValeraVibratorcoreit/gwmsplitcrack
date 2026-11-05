package p109u0;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.altaysoft.t500_split.R;
import com.altaysoft.t500_split.p061ip.Theme51GaugeArcView;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.StatisticsActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import com.altaysoft.t500_split.userthemes.UserThemeImportActivity;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import java.util.ArrayList;
import java.util.function.Predicate;
import p006C.AbstractC0062j;
import p098q0.AbstractC1372y1;
import p098q0.C1315f1;
import p121y0.AbstractC1680h;
import p121y0.AbstractC1687o;
import p121y0.C1676d;
import p121y0.C1683k;
import p121y0.C1685m;

/* renamed from: u0.n0 */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1559n0 implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f8424a;

    /* renamed from: b */
    public final /* synthetic */ Object f8425b;

    /* renamed from: c */
    public final /* synthetic */ Object f8426c;

    public /* synthetic */ RunnableC1559n0(Object obj, int i, Object obj2) {
        this.f8424a = i;
        this.f8425b = obj;
        this.f8426c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ImageView imageView;
        final int i = 0;
        final int i2 = 1;
        switch (this.f8424a) {
            case 0:
                ImageView imageView2 = (ImageView) this.f8425b;
                if (imageView2.getWidth() <= 0) {
                    return;
                }
                imageView2.setPivotY(AbstractC0062j.m153g(imageView2.getWidth(), 0.5f, imageView2) * 0.5f);
                ((C1572s) this.f8426c).m4470a(imageView2);
                return;
            case 1:
                ImageView imageView3 = (ImageView) this.f8425b;
                if (imageView3.getWidth() <= 0) {
                    return;
                }
                imageView3.setPivotY(AbstractC0062j.m153g(imageView3.getWidth(), 0.5f, imageView3) * 0.5f);
                ((C1572s) this.f8426c).m4470a(imageView3);
                return;
            case 2:
                ((C1583x0) this.f8425b).m4642G((TextView) this.f8426c);
                return;
            case 3:
                ((C1583x0) this.f8425b).m4673c((RunnableC1571r0) this.f8426c);
                return;
            case 4:
                C1583x0 c1583x0 = (C1583x0) this.f8426c;
                c1583x0.getClass();
                ImageView imageView4 = (ImageView) this.f8425b;
                if (imageView4.getWidth() <= 0 || imageView4.getHeight() <= 0) {
                    imageView4.post(new RunnableC1571r0(c1583x0, 21));
                    return;
                }
                c1583x0.f8888U0 = (imageView4.getWidth() * 0.5f) + imageView4.getLeft();
                c1583x0.f8890V0 = (imageView4.getHeight() * 0.5f) + imageView4.getTop();
                c1583x0.f8892W0 = true;
                return;
            case 5:
                ImageView imageView5 = (ImageView) this.f8425b;
                if (imageView5.getWidth() <= 0) {
                    return;
                }
                imageView5.setPivotY(AbstractC0062j.m153g(imageView5.getWidth(), 0.5f, imageView5) * 0.5f);
                ((C1572s) this.f8426c).m4470a(imageView5);
                return;
            case 6:
                ((C1477E0) this.f8425b).m3625G((TextView) this.f8426c);
                return;
            case 7:
                C1477E0 c1477e0 = (C1477E0) this.f8426c;
                c1477e0.getClass();
                ImageView imageView6 = (ImageView) this.f8425b;
                if (imageView6.getWidth() <= 0 || imageView6.getHeight() <= 0) {
                    imageView6.post(new RunnableC1585y0(c1477e0, 21));
                    return;
                }
                c1477e0.f7344U0 = (imageView6.getWidth() * 0.5f) + imageView6.getLeft();
                c1477e0.f7346V0 = (imageView6.getHeight() * 0.5f) + imageView6.getTop();
                c1477e0.f7348W0 = true;
                return;
            case 8:
                ((C1477E0) this.f8425b).m3658c((RunnableC1585y0) this.f8426c);
                return;
            case Platform.GNU /* 9 */:
                ((C1491L0) this.f8425b).m3791G((TextView) this.f8426c);
                return;
            case Platform.KFREEBSD /* 10 */:
                C1491L0 c1491l0 = (C1491L0) this.f8426c;
                c1491l0.getClass();
                ImageView imageView7 = (ImageView) this.f8425b;
                if (imageView7.getWidth() <= 0 || imageView7.getHeight() <= 0) {
                    imageView7.post(new RunnableC1479F0(c1491l0, 21));
                    return;
                }
                c1491l0.f7571U0 = (imageView7.getWidth() * 0.5f) + imageView7.getLeft();
                c1491l0.f7573V0 = (imageView7.getHeight() * 0.5f) + imageView7.getTop();
                c1491l0.f7575W0 = true;
                return;
            case Platform.NETBSD /* 11 */:
                ((C1491L0) this.f8425b).m3824c((RunnableC1479F0) this.f8426c);
                return;
            case Platform.DRAGONFLYBSD /* 12 */:
                ImageView imageView8 = (ImageView) this.f8425b;
                if (imageView8.getWidth() <= 0) {
                    return;
                }
                imageView8.setPivotY(AbstractC0062j.m153g(imageView8.getWidth(), 0.5f, imageView8) * 0.5f);
                ((C1572s) this.f8426c).m4470a(imageView8);
                return;
            case 13:
                ((C1504S0) this.f8425b).m3920a((Theme51GaugeArcView) this.f8426c);
                return;
            case 14:
                ((C1506T0) this.f8425b).m3951F((TextView) this.f8426c);
                return;
            case 15:
                ((C1506T0) this.f8425b).m3983b((RunnableC1493M0) this.f8426c);
                return;
            case DLLCallback.DLL_FPTRS /* 16 */:
                C1506T0 c1506t0 = (C1506T0) this.f8426c;
                c1506t0.getClass();
                ImageView imageView9 = (ImageView) this.f8425b;
                if (imageView9.getWidth() <= 0 || imageView9.getHeight() <= 0) {
                    imageView9.post(new RunnableC1493M0(c1506t0, 21));
                    return;
                }
                c1506t0.f7798Q0 = (imageView9.getWidth() * 0.5f) + imageView9.getLeft();
                c1506t0.f7800R0 = (imageView9.getHeight() * 0.5f) + imageView9.getTop();
                c1506t0.f7802S0 = true;
                return;
            case 17:
                ImageView imageView10 = (ImageView) this.f8425b;
                if (imageView10 == null || (imageView = (ImageView) this.f8426c) == null || imageView.getWidth() <= 0 || imageView.getHeight() <= 0) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = imageView10.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    layoutParams2.width = imageView.getWidth();
                    layoutParams2.height = imageView.getHeight();
                    layoutParams2.leftMargin = imageView.getLeft();
                    layoutParams2.topMargin = imageView.getTop();
                    imageView10.setLayoutParams(layoutParams2);
                    imageView10.setPivotX(imageView.getWidth() * 0.5f);
                    imageView10.setPivotY(imageView.getHeight() * 0.5f);
                    imageView10.setScaleX(1.0f);
                    imageView10.setScaleY(1.0f);
                    return;
                }
                return;
            case 18:
                RefuelsActivity refuelsActivity = (RefuelsActivity) this.f8425b;
                final C1676d c1676d = (C1676d) this.f8426c;
                int i3 = RefuelsActivity.f3268H;
                refuelsActivity.getClass();
                C1683k c1683k = C1683k.f9580s;
                if (c1683k != null) {
                    String str = c1676d.f9557a;
                    synchronized (c1683k) {
                        if (str != null) {
                            while (true) {
                                if (i < c1683k.f9590j.size()) {
                                    if (str.equals(((C1676d) c1683k.f9590j.get(i)).f9557a)) {
                                        c1683k.f9590j.remove(i);
                                        c1683k.f9593m = true;
                                        c1683k.m4902k();
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    ArrayList m4843A = AbstractC1680h.m4843A(refuelsActivity);
                    m4843A.removeIf(new Predicate() { // from class: y0.g
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            Object obj2 = c1676d;
                            switch (i) {
                                case 0:
                                    int i4 = RefuelsActivity.f3268H;
                                    return ((C1676d) obj2).f9557a.equals(((C1676d) obj).f9557a);
                                default:
                                    int i5 = TripsActivity.f3293H;
                                    return ((C1685m) obj2).f9604a.equals(((C1685m) obj).f9604a);
                            }
                        }
                    });
                    AbstractC1680h.m4853O(refuelsActivity, m4843A);
                }
                refuelsActivity.m1984u();
                return;
            case 19:
                int i4 = StatisticsActivity.f3272X;
                StatisticsActivity statisticsActivity = (StatisticsActivity) this.f8425b;
                statisticsActivity.getClass();
                ((Runnable) this.f8426c).run();
                statisticsActivity.m1993w();
                return;
            case 20:
                TripsActivity tripsActivity = (TripsActivity) this.f8425b;
                final C1685m c1685m = (C1685m) this.f8426c;
                int i5 = TripsActivity.f3293H;
                tripsActivity.getClass();
                C1683k c1683k2 = C1683k.f9580s;
                if (c1683k2 != null) {
                    String str2 = c1685m.f9604a;
                    synchronized (c1683k2) {
                        if (str2 != null) {
                            while (true) {
                                try {
                                    if (i < c1683k2.f9589i.size()) {
                                        if (str2.equals(((C1685m) c1683k2.f9589i.get(i)).f9604a)) {
                                            c1683k2.f9589i.remove(i);
                                            C1685m c1685m2 = c1683k2.f9591k;
                                            if (c1685m2 != null && str2.equals(c1685m2.f9604a)) {
                                                c1683k2.f9591k = null;
                                                c1683k2.f9588h = 0L;
                                            }
                                            c1683k2.f9592l = true;
                                            c1683k2.m4903l();
                                        } else {
                                            i++;
                                        }
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    }
                } else {
                    ArrayList m4910C = AbstractC1687o.m4910C(tripsActivity);
                    m4910C.removeIf(new Predicate() { // from class: y0.g
                        @Override // java.util.function.Predicate
                        public final boolean test(Object obj) {
                            Object obj2 = c1685m;
                            switch (i2) {
                                case 0:
                                    int i42 = RefuelsActivity.f3268H;
                                    return ((C1676d) obj2).f9557a.equals(((C1676d) obj).f9557a);
                                default:
                                    int i52 = TripsActivity.f3293H;
                                    return ((C1685m) obj2).f9604a.equals(((C1685m) obj).f9604a);
                            }
                        }
                    });
                    AbstractC1687o.m4927V(tripsActivity, m4910C);
                }
                tripsActivity.m1996t();
                return;
            case 21:
                int i6 = UserThemeImportActivity.f3298V;
                UserThemeImportActivity userThemeImportActivity = (UserThemeImportActivity) this.f8425b;
                if (userThemeImportActivity.m2001u()) {
                    userThemeImportActivity.f3306L = false;
                    userThemeImportActivity.m1998A();
                    AbstractC1372y1.m3288S(userThemeImportActivity, userThemeImportActivity.getString(R.string.Message), userThemeImportActivity.getString(R.string.ut_import_fail, (String) this.f8426c), null);
                    return;
                }
                return;
            default:
                C1315f1 c1315f1 = (C1315f1) this.f8425b;
                c1315f1.getClass();
                int i7 = UserThemeImportActivity.f3298V;
                UserThemeImportActivity userThemeImportActivity2 = (UserThemeImportActivity) c1315f1.f6118f;
                if (userThemeImportActivity2.m2001u()) {
                    userThemeImportActivity2.m2002v((String) this.f8426c);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ RunnableC1559n0(Object obj, ImageView imageView, int i) {
        this.f8424a = i;
        this.f8426c = obj;
        this.f8425b = imageView;
    }
}
