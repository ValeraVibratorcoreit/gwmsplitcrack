package p054a1;

import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.ImageView;
import com.altaysoft.t500_split.AppsList;
import com.altaysoft.t500_split.AutoBrightnessSettingsActivity;
import com.altaysoft.t500_split.AutoPresetSettingsActivity;
import com.altaysoft.t500_split.DriveModeSettingsActivity;
import com.altaysoft.t500_split.IpMessagesSettingsActivity;
import com.altaysoft.t500_split.SplitBallSettingsActivity;
import com.altaysoft.t500_split.SplitInfoSettingsActivity;
import com.altaysoft.t500_split.YmSettingsActivity;
import com.altaysoft.t500_split.media.AbstractC0641i;
import com.altaysoft.t500_split.media.AbstractC0645m;
import com.altaysoft.t500_split.media.C0636d;
import com.altaysoft.t500_split.media.C0640h;
import com.altaysoft.t500_split.splitinfo.ChartsFullscreenActivity;
import com.altaysoft.t500_split.stats.StatisticsActivity;
import com.altaysoft.t500_split.stats.StatsHelpActivity;
import com.altaysoft.t500_split.userthemes.UserThemeHelpActivity;
import com.google.android.material.datepicker.C0671l;
import com.sun.jna.Platform;
import java.util.HashSet;
import java.util.regex.Pattern;
import p001A0.RunnableC0024r;
import p003B.C0043j;
import p034Q0.RunnableC0296m;
import p098q0.AbstractC1256E0;

/* renamed from: a1.a */
/* loaded from: classes.dex */
public final /* synthetic */ class ViewOnClickListenerC0492a implements View.OnClickListener {

    /* renamed from: f */
    public final /* synthetic */ int f1547f;

    /* renamed from: g */
    public final /* synthetic */ Object f1548g;

    public /* synthetic */ ViewOnClickListenerC0492a(int i, Object obj) {
        this.f1547f = i;
        this.f1548g = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0636d c0636d;
        Object obj = this.f1548g;
        switch (this.f1547f) {
            case 0:
                C0496e c0496e = (C0496e) obj;
                EditText editText = c0496e.f1559i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0496e.m1238q();
                return;
            case 1:
                ((C0502k) obj).m1220u();
                return;
            case 2:
                C0514w c0514w = (C0514w) obj;
                EditText editText2 = c0514w.f1665f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0514w.f1665f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0514w.f1665f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0514w.f1665f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0514w.f1665f.setSelection(selectionEnd);
                }
                c0514w.m1238q();
                return;
            case 3:
                ImageView imageView = (ImageView) obj;
                if (imageView == null || imageView.getVisibility() != 0 || AbstractC0641i.f3017d || (c0636d = AbstractC0641i.f3019f) == null || !c0636d.m1851a()) {
                    return;
                }
                Boolean bool = AbstractC0641i.f3016c;
                final boolean z2 = bool != null && bool.booleanValue();
                AbstractC0641i.f3016c = Boolean.valueOf(!z2);
                AbstractC0641i.m1890g();
                imageView.animate().cancel();
                imageView.setScaleX(1.0f);
                imageView.setScaleY(1.0f);
                imageView.animate().scaleX(1.22f).scaleY(1.22f).setDuration(140L).setInterpolator(new OvershootInterpolator(2.2f)).withEndAction(new RunnableC0296m(imageView, 1)).start();
                AbstractC0641i.f3017d = true;
                int i = AbstractC0641i.f3018e + 1;
                AbstractC0641i.f3018e = i;
                Context applicationContext = imageView.getContext().getApplicationContext();
                C0636d c0636d2 = AbstractC0641i.f3019f;
                final String str = c0636d2.f2996b;
                final C0640h c0640h = new C0640h(i, z2);
                Pattern pattern = AbstractC0645m.f3037a;
                final Context applicationContext2 = applicationContext.getApplicationContext();
                final String str2 = c0636d2.f2997c;
                final String str3 = c0636d2.f2998d;
                final String str4 = c0636d2.f3003i;
                AbstractC0645m.f3040d.execute(new Runnable() { // from class: com.altaysoft.t500_split.media.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        final boolean z3;
                        C0043j m1906l;
                        final boolean z4 = z2;
                        Context context = applicationContext2;
                        try {
                            m1906l = AbstractC0645m.m1906l(context, str, str2, str3, str4);
                        } catch (Exception unused) {
                            z3 = false;
                        }
                        if (m1906l == null) {
                            throw new Exception("трек не найден");
                        }
                        C0043j m1907m = AbstractC0645m.m1907m(context, m1906l);
                        AbstractC0645m.m1898d(context, AbstractC0645m.m1905k(context), z4 ? "remove" : "add-multiple", m1907m);
                        HashSet hashSet = AbstractC0645m.f3041e;
                        String str5 = (String) m1907m.f141g;
                        if (z4) {
                            hashSet.remove(str5);
                        } else {
                            hashSet.add(str5);
                        }
                        z4 = !z4;
                        z3 = true;
                        Handler handler = AbstractC0645m.f3039c;
                        final C0640h c0640h2 = c0640h;
                        handler.post(new Runnable() { // from class: com.altaysoft.t500_split.media.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                C0640h c0640h3 = C0640h.this;
                                if (c0640h3 == null || AbstractC0641i.f3018e != c0640h3.f3012a) {
                                    return;
                                }
                                AbstractC0641i.f3017d = false;
                                if (z3) {
                                    AbstractC0641i.f3016c = Boolean.valueOf(z4);
                                    AbstractC0641i.m1890g();
                                } else {
                                    AbstractC0641i.f3016c = Boolean.valueOf(c0640h3.f3013b);
                                    AbstractC0641i.m1890g();
                                }
                            }
                        });
                    }
                });
                return;
            case 4:
                ((C0671l) obj).m2081P();
                throw null;
            case 5:
                int i2 = AppsList.f2259G;
                AppsList appsList = (AppsList) obj;
                appsList.getClass();
                AbstractC1256E0.m3024q(appsList);
                return;
            case 6:
                int i3 = AutoBrightnessSettingsActivity.f2262E;
                ((AutoBrightnessSettingsActivity) obj).finish();
                return;
            case 7:
                int i4 = AutoPresetSettingsActivity.f2263F;
                ((AutoPresetSettingsActivity) obj).finish();
                return;
            case 8:
                int[] iArr = DriveModeSettingsActivity.f2270E;
                ((DriveModeSettingsActivity) obj).finish();
                return;
            case Platform.GNU /* 9 */:
                int i5 = IpMessagesSettingsActivity.f2303E;
                ((IpMessagesSettingsActivity) obj).finish();
                return;
            case Platform.KFREEBSD /* 10 */:
                int i6 = SplitBallSettingsActivity.f2341E;
                ((SplitBallSettingsActivity) obj).finish();
                return;
            case Platform.NETBSD /* 11 */:
                int i7 = SplitInfoSettingsActivity.f2342E;
                ((SplitInfoSettingsActivity) obj).finish();
                return;
            case Platform.DRAGONFLYBSD /* 12 */:
                int i8 = YmSettingsActivity.f2370J;
                ((RunnableC0024r) obj).run();
                return;
            case 13:
                int[] iArr2 = ChartsFullscreenActivity.f3123M;
                ((ChartsFullscreenActivity) obj).finish();
                return;
            case 14:
                int i9 = StatisticsActivity.f3272X;
                StatisticsActivity statisticsActivity = (StatisticsActivity) obj;
                statisticsActivity.getClass();
                AbstractC1256E0.m3024q(statisticsActivity);
                return;
            case 15:
                int i10 = StatsHelpActivity.f3292E;
                ((StatsHelpActivity) obj).finish();
                return;
            default:
                int i11 = UserThemeHelpActivity.f3297E;
                ((UserThemeHelpActivity) obj).finish();
                return;
        }
    }
}
