package com.altaysoft.t500_split.media;

import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Handler;
import p038T.RunnableC0318l;

/* renamed from: com.altaysoft.t500_split.media.b */
/* loaded from: classes.dex */
public final class C0634b extends MediaBrowser.ConnectionCallback {

    /* renamed from: a */
    public final /* synthetic */ MediaBrowser[] f2986a;

    /* renamed from: b */
    public final /* synthetic */ Context f2987b;

    /* renamed from: c */
    public final /* synthetic */ String f2988c;

    public C0634b(MediaBrowser[] mediaBrowserArr, Context context, String str) {
        this.f2986a = mediaBrowserArr;
        this.f2987b = context;
        this.f2988c = str;
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnected() {
        MediaBrowser mediaBrowser = this.f2986a[0];
        if (mediaBrowser == null || mediaBrowser != AbstractC0635c.f2990b) {
            return;
        }
        if (AbstractC0635c.f2992d) {
            AbstractC0635c.m1850c(this.f2987b);
        }
        Handler handler = AbstractC0635c.f2989a;
        RunnableC0318l runnableC0318l = AbstractC0635c.f2993e;
        handler.removeCallbacks(runnableC0318l);
        handler.postDelayed(runnableC0318l, AbstractC0638f.m1862k(this.f2988c) ? 15000L : 3000L);
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionFailed() {
        MediaBrowser mediaBrowser = this.f2986a[0];
        if (mediaBrowser == null || mediaBrowser != AbstractC0635c.f2990b) {
            return;
        }
        AbstractC0635c.m1848a();
    }

    @Override // android.media.browse.MediaBrowser.ConnectionCallback
    public final void onConnectionSuspended() {
        MediaBrowser mediaBrowser = this.f2986a[0];
        if (mediaBrowser == null || mediaBrowser != AbstractC0635c.f2990b) {
            return;
        }
        AbstractC0635c.m1848a();
    }
}
