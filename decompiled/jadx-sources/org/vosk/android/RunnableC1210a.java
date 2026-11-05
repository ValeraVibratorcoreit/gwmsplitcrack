package org.vosk.android;

import java.io.IOException;
import org.vosk.Model;
import org.vosk.android.SpeechService;
import org.vosk.android.SpeechStreamService;
import org.vosk.android.StorageService;

/* renamed from: org.vosk.android.a */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1210a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5436a;

    /* renamed from: b */
    public final /* synthetic */ Object f5437b;

    /* renamed from: c */
    public final /* synthetic */ Object f5438c;

    public /* synthetic */ RunnableC1210a(Object obj, int i, Object obj2) {
        this.f5436a = i;
        this.f5438c = obj;
        this.f5437b = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5436a) {
            case 0:
                ((SpeechService.RecognizerThread) this.f5438c).lambda$run$0((IOException) this.f5437b);
                break;
            case 1:
                ((SpeechStreamService.RecognizerThread) this.f5438c).lambda$run$2((IOException) this.f5437b);
                break;
            case 2:
                ((StorageService.Callback) this.f5438c).onComplete((Model) this.f5437b);
                break;
            default:
                ((StorageService.Callback) this.f5438c).onComplete((IOException) this.f5437b);
                break;
        }
    }
}
