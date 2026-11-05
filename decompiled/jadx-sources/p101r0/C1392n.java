package p101r0;

import android.view.View;
import com.altaysoft.t500_split.configActivity.CFG4;
import com.altaysoft.t500_split.reminders.RemindersActivity;
import com.altaysoft.t500_split.splitinfo.FullscreenChartsView;
import com.altaysoft.t500_split.splitinfo.SplitChartsView;
import com.altaysoft.t500_split.stats.RefuelsActivity;
import com.altaysoft.t500_split.stats.StatisticsActivity;
import com.altaysoft.t500_split.stats.StatsHelpActivity;
import com.altaysoft.t500_split.stats.TripsActivity;
import com.altaysoft.t500_split.userthemes.UserThemeHelpActivity;
import com.altaysoft.t500_split.userthemes.UserThemeSlotsActivity;
import com.sun.jna.Platform;
import com.sun.jna.win32.DLLCallback;
import p006C.C0058f;
import p022K.C0221v0;
import p022K.InterfaceC0210q;
import p118x0.C1659o;

/* renamed from: r0.n */
/* loaded from: classes.dex */
public final /* synthetic */ class C1392n implements InterfaceC1394p, InterfaceC0210q {

    /* renamed from: f */
    public final /* synthetic */ int f6509f;

    /* renamed from: a */
    public float m3329a(C1659o c1659o) {
        switch (this.f6509f) {
            case 8:
                int i = FullscreenChartsView.f3167E;
                return FullscreenChartsView.m1963a(c1659o.f9462b / 180.0f);
            case Platform.GNU /* 9 */:
                int i2 = FullscreenChartsView.f3167E;
                return FullscreenChartsView.m1963a(c1659o.f9463c / 8000.0f);
            case Platform.KFREEBSD /* 10 */:
                int i3 = FullscreenChartsView.f3167E;
                return FullscreenChartsView.m1963a(c1659o.f9464d / 9.0f);
            case Platform.NETBSD /* 11 */:
                int i4 = SplitChartsView.f3235t;
                return SplitChartsView.m1975a(c1659o.f9462b / 180.0f);
            case Platform.DRAGONFLYBSD /* 12 */:
                int i5 = SplitChartsView.f3235t;
                return SplitChartsView.m1975a(c1659o.f9463c / 8000.0f);
            default:
                int i6 = SplitChartsView.f3235t;
                return SplitChartsView.m1975a(c1659o.f9464d / 9.0f);
        }
    }

    @Override // p101r0.InterfaceC1394p
    /* renamed from: b */
    public void mo17b(int i) {
        switch (this.f6509f) {
            case 0:
                CFG4.f2728F.f2601a2 = i;
                break;
            case 1:
                CFG4.f2728F.f2606b2 = i;
                break;
            case 2:
                CFG4.f2728F.f2611c2 = i;
                break;
            case 3:
                CFG4.f2728F.f2616d2 = i;
                break;
            case 4:
                CFG4.f2728F.f2621e2 = i;
                break;
            case 5:
                CFG4.f2728F.f2626f2 = i;
                break;
            default:
                CFG4.f2728F.f2631g2 = i;
                break;
        }
    }

    @Override // p022K.InterfaceC0210q
    /* renamed from: c */
    public C0221v0 mo18c(View view, C0221v0 c0221v0) {
        switch (this.f6509f) {
            case 7:
                int i = RemindersActivity.f3106I;
                C0058f mo654f = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f.f203a, mo654f.f204b, mo654f.f205c, mo654f.f206d);
                break;
            case 14:
                int i2 = RefuelsActivity.f3268H;
                C0058f mo654f2 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f2.f203a, mo654f2.f204b, mo654f2.f205c, mo654f2.f206d);
                break;
            case 15:
                int i3 = StatisticsActivity.f3272X;
                C0058f mo654f3 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f3.f203a, mo654f3.f204b, mo654f3.f205c, mo654f3.f206d);
                break;
            case DLLCallback.DLL_FPTRS /* 16 */:
                int i4 = StatsHelpActivity.f3292E;
                C0058f mo654f4 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f4.f203a, mo654f4.f204b, mo654f4.f205c, mo654f4.f206d);
                break;
            case 17:
                int i5 = TripsActivity.f3293H;
                C0058f mo654f5 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f5.f203a, mo654f5.f204b, mo654f5.f205c, mo654f5.f206d);
                break;
            case 18:
                int i6 = UserThemeHelpActivity.f3297E;
                C0058f mo654f6 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f6.f203a, mo654f6.f204b, mo654f6.f205c, mo654f6.f206d);
                break;
            default:
                int i7 = UserThemeSlotsActivity.f3316L;
                C0058f mo654f7 = c0221v0.f573a.mo654f(7);
                view.setPadding(mo654f7.f203a, mo654f7.f204b, mo654f7.f205c, mo654f7.f206d);
                break;
        }
        return c0221v0;
    }
}
