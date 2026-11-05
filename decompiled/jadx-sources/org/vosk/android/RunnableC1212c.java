package org.vosk.android;

import org.vosk.android.SpeechService;
import org.vosk.android.SpeechStreamService;

/* renamed from: org.vosk.android.c */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1212c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ int f5442a;

    /* renamed from: b */
    public final /* synthetic */ Thread f5443b;

    public /* synthetic */ RunnableC1212c(Thread thread, int i) {
        this.f5442a = i;
        this.f5443b = thread;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5442a) {
            case 0:
                ((SpeechService.RecognizerThread) this.f5443b).lambda$run$3();
                break;
            default:
                ((SpeechStreamService.RecognizerThread) this.f5443b).lambda$run$3();
                break;
        }
    }
}
