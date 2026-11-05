package p038T;

import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p003B.C0043j;
import p016H.RunnableC0109a;
import p022K.C0198k;
import p045W0.C0355e;
import p091o.C1193c;
import p121y0.AbstractC1687o;

/* renamed from: T.i */
/* loaded from: classes.dex */
public final class C0315i {

    /* renamed from: j */
    public static final Object f888j = new Object();

    /* renamed from: k */
    public static volatile C0315i f889k;

    /* renamed from: a */
    public final ReentrantReadWriteLock f890a;

    /* renamed from: b */
    public final C1193c f891b;

    /* renamed from: c */
    public volatile int f892c;

    /* renamed from: d */
    public final Handler f893d;

    /* renamed from: e */
    public final C0311e f894e;

    /* renamed from: f */
    public final InterfaceC0314h f895f;

    /* renamed from: g */
    public final C0355e f896g;

    /* renamed from: h */
    public final int f897h;

    /* renamed from: i */
    public final C0309c f898i;

    public C0315i(C0324r c0324r) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f890a = reentrantReadWriteLock;
        this.f892c = 3;
        InterfaceC0314h interfaceC0314h = (InterfaceC0314h) c0324r.f886b;
        this.f895f = interfaceC0314h;
        int i = c0324r.f885a;
        this.f897h = i;
        this.f898i = (C0309c) c0324r.f887c;
        this.f893d = new Handler(Looper.getMainLooper());
        this.f891b = new C1193c();
        this.f896g = new C0355e(8);
        C0311e c0311e = new C0311e(this);
        this.f894e = c0311e;
        reentrantReadWriteLock.writeLock().lock();
        if (i == 0) {
            try {
                this.f892c = 0;
            } catch (Throwable th) {
                this.f890a.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (m896b() == 0) {
            try {
                interfaceC0314h.mo894q(new C0310d(c0311e));
            } catch (Throwable th2) {
                m898d(th2);
            }
        }
    }

    /* renamed from: a */
    public static C0315i m895a() {
        C0315i c0315i;
        synchronized (f888j) {
            try {
                c0315i = f889k;
                if (!(c0315i != null)) {
                    throw new IllegalStateException("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.");
                }
            } finally {
            }
        }
        return c0315i;
    }

    /* renamed from: b */
    public final int m896b() {
        this.f890a.readLock().lock();
        try {
            return this.f892c;
        } finally {
            this.f890a.readLock().unlock();
        }
    }

    /* renamed from: c */
    public final void m897c() {
        if (!(this.f897h == 1)) {
            throw new IllegalStateException("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading");
        }
        if (m896b() == 1) {
            return;
        }
        this.f890a.writeLock().lock();
        try {
            if (this.f892c == 0) {
                return;
            }
            this.f892c = 0;
            this.f890a.writeLock().unlock();
            C0311e c0311e = this.f894e;
            C0315i c0315i = c0311e.f882a;
            try {
                c0315i.f895f.mo894q(new C0310d(c0311e));
            } catch (Throwable th) {
                c0315i.m898d(th);
            }
        } finally {
            this.f890a.writeLock().unlock();
        }
    }

    /* renamed from: d */
    public final void m898d(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.f890a.writeLock().lock();
        try {
            this.f892c = 2;
            arrayList.addAll(this.f891b);
            this.f891b.clear();
            this.f890a.writeLock().unlock();
            this.f893d.post(new RunnableC0109a(arrayList, this.f892c, th));
        } catch (Throwable th2) {
            this.f890a.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x009b A[Catch: all -> 0x007e, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00db A[Catch: all -> 0x007e, TRY_LEAVE, TryCatch #0 {all -> 0x007e, blocks: (B:67:0x0059, B:70:0x005e, B:72:0x0062, B:74:0x006f, B:29:0x008b, B:31:0x0095, B:33:0x0098, B:35:0x009b, B:37:0x00ab, B:39:0x00ae, B:44:0x00bd, B:47:0x00c4, B:49:0x00db, B:27:0x0081), top: B:66:0x0059 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e6  */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence m899e(CharSequence charSequence, int i, int i2) {
        int i3;
        int i4;
        C0331y c0331y;
        C0330x[] c0330xArr;
        if (!(m896b() == 1)) {
            throw new IllegalStateException("Not initialized yet");
        }
        if (i < 0) {
            throw new IllegalArgumentException("start cannot be negative");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("end cannot be negative");
        }
        AbstractC1687o.m4937f("start should be <= than end", i <= i2);
        C0331y c0331y2 = null;
        if (charSequence == null) {
            return null;
        }
        AbstractC1687o.m4937f("start should be < than charSequence length", i <= charSequence.length());
        AbstractC1687o.m4937f("end should be < than charSequence length", i2 <= charSequence.length());
        if (charSequence.length() == 0 || i == i2) {
            return charSequence;
        }
        C0198k c0198k = this.f894e.f883b;
        c0198k.getClass();
        boolean z2 = charSequence instanceof C0328v;
        if (z2) {
            ((C0328v) charSequence).m921a();
        }
        if (!z2) {
            try {
                if (!(charSequence instanceof Spannable)) {
                    if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i - 1, i2 + 1, C0330x.class) <= i2) {
                        c0331y2 = new C0331y();
                        c0331y2.f940a = false;
                        c0331y2.f941b = new SpannableString(charSequence);
                    }
                    if (c0331y2 != null && (c0330xArr = (C0330x[]) c0331y2.f941b.getSpans(i, i2, C0330x.class)) != null && c0330xArr.length > 0) {
                        for (C0330x c0330x : c0330xArr) {
                            int spanStart = c0331y2.f941b.getSpanStart(c0330x);
                            int spanEnd = c0331y2.f941b.getSpanEnd(c0330x);
                            if (spanStart != i2) {
                                c0331y2.removeSpan(c0330x);
                            }
                            i = Math.min(spanStart, i);
                            i2 = Math.max(spanEnd, i2);
                        }
                    }
                    i3 = i;
                    i4 = i2;
                    if (i3 != i4 && i3 < charSequence.length()) {
                        c0331y = (C0331y) c0198k.m608s(charSequence, i3, i4, Integer.MAX_VALUE, false, new C0043j(c0331y2, 4, (C0355e) c0198k.f533b));
                        if (c0331y != null) {
                            if (!z2) {
                                return charSequence;
                            }
                            return charSequence;
                        }
                        Spannable spannable = c0331y.f941b;
                        if (z2) {
                            ((C0328v) charSequence).m922b();
                        }
                        return spannable;
                    }
                    return charSequence;
                }
            } finally {
                if (z2) {
                    ((C0328v) charSequence).m922b();
                }
            }
        }
        c0331y2 = new C0331y((Spannable) charSequence);
        if (c0331y2 != null) {
            while (r1 < r5) {
            }
        }
        i3 = i;
        i4 = i2;
        if (i3 != i4) {
            c0331y = (C0331y) c0198k.m608s(charSequence, i3, i4, Integer.MAX_VALUE, false, new C0043j(c0331y2, 4, (C0355e) c0198k.f533b));
            if (c0331y != null) {
            }
        }
        return charSequence;
    }

    /* renamed from: f */
    public final void m900f(AbstractC0313g abstractC0313g) {
        AbstractC1687o.m4939h("initCallback cannot be null", abstractC0313g);
        this.f890a.writeLock().lock();
        try {
            if (this.f892c != 1 && this.f892c != 2) {
                this.f891b.add(abstractC0313g);
                this.f890a.writeLock().unlock();
            }
            this.f893d.post(new RunnableC0109a(Arrays.asList(abstractC0313g), this.f892c, (Throwable) null));
            this.f890a.writeLock().unlock();
        } catch (Throwable th) {
            this.f890a.writeLock().unlock();
            throw th;
        }
    }
}
