package p038T;

import android.content.Context;
import android.media.session.MediaController;
import android.os.SystemClock;
import android.os.Trace;
import com.altaysoft.t500_split.cfgData;
import com.altaysoft.t500_split.media.AbstractC0635c;
import com.altaysoft.t500_split.media.AbstractC0638f;
import com.altaysoft.t500_split.media.AbstractC0648p;
import p014G.AbstractC0107h;
import p098q0.AbstractC1372y1;

/* renamed from: T.l */
/* loaded from: classes.dex */
public final class RunnableC0318l implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f903a;

    public /* synthetic */ RunnableC0318l(int i) {
        this.f903a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaController mediaController;
        boolean z2 = true;
        switch (this.f903a) {
            case 0:
                try {
                    int i = AbstractC0107h.f342a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (C0315i.f889k == null) {
                        z2 = false;
                    }
                    if (z2) {
                        C0315i.m895a().m897c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = AbstractC0107h.f342a;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                AbstractC0635c.f2992d = false;
                AbstractC0635c.m1848a();
                return;
            default:
                if (AbstractC0648p.f3059i == null || AbstractC0648p.f3058h == null) {
                    return;
                }
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (elapsedRealtime < AbstractC0648p.f3062l) {
                    AbstractC0648p.f3052b.postDelayed(this, AbstractC0648p.f3062l - elapsedRealtime);
                    return;
                }
                int i3 = AbstractC0648p.f3061k;
                if (i3 == 1 || i3 == 2) {
                    Context context = AbstractC0648p.f3058h;
                    String str = AbstractC0648p.f3059i;
                    if (context != null && str != null && !str.isEmpty()) {
                        try {
                            mediaController = AbstractC0638f.m1853b(AbstractC0638f.m1855d(context), str);
                        } catch (SecurityException | Exception unused) {
                        }
                        if (AbstractC0638f.m1866o(mediaController) != AbstractC0648p.f3061k && elapsedRealtime < AbstractC0648p.f3063m) {
                            AbstractC0648p.f3052b.postDelayed(this, 200L);
                            return;
                        }
                    }
                    mediaController = null;
                    if (AbstractC0638f.m1866o(mediaController) != AbstractC0648p.f3061k) {
                        AbstractC0648p.f3052b.postDelayed(this, 200L);
                        return;
                    }
                }
                if (AbstractC0648p.m1919l(AbstractC0648p.f3058h, cfgData.m1784i()) != null) {
                    AbstractC1372y1.m3284O(AbstractC0648p.f3060j, AbstractC0648p.f3059i);
                    AbstractC0648p.f3059i = null;
                    AbstractC0648p.f3058h = null;
                    AbstractC0648p.f3061k = 0;
                    AbstractC0648p.m1909b();
                    return;
                }
                if (elapsedRealtime < AbstractC0648p.f3063m) {
                    AbstractC0648p.f3052b.postDelayed(this, 200L);
                    return;
                }
                AbstractC0648p.f3059i = null;
                AbstractC0648p.f3058h = null;
                AbstractC0648p.f3061k = 0;
                AbstractC0648p.m1909b();
                return;
        }
    }
}
