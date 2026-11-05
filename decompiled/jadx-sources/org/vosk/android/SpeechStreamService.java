package org.vosk.android;

import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import java.io.InputStream;
import org.vosk.Recognizer;
import org.vosk.android.SpeechStreamService;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public class SpeechStreamService {
    private static final float BUFFER_SIZE_SECONDS = 0.2f;
    private final int bufferSize;
    private final InputStream inputStream;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Recognizer recognizer;
    private Thread recognizerThread;
    private final int sampleRate;

    public SpeechStreamService(Recognizer recognizer, InputStream inputStream, float f2) {
        this.recognizer = recognizer;
        int i = (int) f2;
        this.sampleRate = i;
        this.inputStream = inputStream;
        this.bufferSize = AbstractC0062j.m168v(i, BUFFER_SIZE_SECONDS, 2.0f);
    }

    public boolean start(RecognitionListener recognitionListener) {
        if (this.recognizerThread != null) {
            return false;
        }
        RecognizerThread recognizerThread = new RecognizerThread(this, recognitionListener);
        this.recognizerThread = recognizerThread;
        recognizerThread.start();
        return true;
    }

    public boolean stop() {
        Thread thread = this.recognizerThread;
        if (thread == null) {
            return false;
        }
        try {
            thread.interrupt();
            this.recognizerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.recognizerThread = null;
        return true;
    }

    public boolean start(RecognitionListener recognitionListener, int i) {
        if (this.recognizerThread != null) {
            return false;
        }
        RecognizerThread recognizerThread = new RecognizerThread(recognitionListener, i);
        this.recognizerThread = recognizerThread;
        recognizerThread.start();
        return true;
    }

    public final class RecognizerThread extends Thread {
        private static final int NO_TIMEOUT = -1;
        RecognitionListener listener;
        private int remainingSamples;
        private final int timeoutSamples;

        public RecognizerThread(RecognitionListener recognitionListener, int i) {
            this.listener = recognitionListener;
            if (i != -1) {
                this.timeoutSamples = (SpeechStreamService.this.sampleRate * i) / 1000;
            } else {
                this.timeoutSamples = -1;
            }
            this.remainingSamples = this.timeoutSamples;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(String str) {
            this.listener.onResult(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(String str) {
            this.listener.onPartialResult(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$2(IOException iOException) {
            this.listener.onError(iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$3() {
            this.listener.onTimeout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$4(String str) {
            this.listener.onFinalResult(str);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int read;
            int i = SpeechStreamService.this.bufferSize;
            byte[] bArr = new byte[i];
            while (!Thread.interrupted() && (this.timeoutSamples == -1 || this.remainingSamples > 0)) {
                try {
                    read = SpeechStreamService.this.inputStream.read(bArr, 0, i);
                } catch (IOException e2) {
                    SpeechStreamService.this.mainHandler.post(new RunnableC1210a(this, 1, e2));
                }
                if (read < 0) {
                    break;
                }
                if (SpeechStreamService.this.recognizer.acceptWaveForm(bArr, read)) {
                    final String result = SpeechStreamService.this.recognizer.getResult();
                    final int i2 = 0;
                    SpeechStreamService.this.mainHandler.post(new Runnable(this) { // from class: org.vosk.android.d

                        /* renamed from: b */
                        public final /* synthetic */ SpeechStreamService.RecognizerThread f5445b;

                        {
                            this.f5445b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i2) {
                                case 0:
                                    this.f5445b.lambda$run$0(result);
                                    break;
                                case 1:
                                    this.f5445b.lambda$run$1(result);
                                    break;
                                default:
                                    this.f5445b.lambda$run$4(result);
                                    break;
                            }
                        }
                    });
                } else {
                    final String partialResult = SpeechStreamService.this.recognizer.getPartialResult();
                    final int i3 = 1;
                    SpeechStreamService.this.mainHandler.post(new Runnable(this) { // from class: org.vosk.android.d

                        /* renamed from: b */
                        public final /* synthetic */ SpeechStreamService.RecognizerThread f5445b;

                        {
                            this.f5445b = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            switch (i3) {
                                case 0:
                                    this.f5445b.lambda$run$0(partialResult);
                                    break;
                                case 1:
                                    this.f5445b.lambda$run$1(partialResult);
                                    break;
                                default:
                                    this.f5445b.lambda$run$4(partialResult);
                                    break;
                            }
                        }
                    });
                }
                if (this.timeoutSamples != -1) {
                    this.remainingSamples -= read;
                }
            }
            if (this.timeoutSamples != -1 && this.remainingSamples <= 0) {
                SpeechStreamService.this.mainHandler.post(new RunnableC1212c(this, 1));
                return;
            }
            final String finalResult = SpeechStreamService.this.recognizer.getFinalResult();
            final int i4 = 2;
            SpeechStreamService.this.mainHandler.post(new Runnable(this) { // from class: org.vosk.android.d

                /* renamed from: b */
                public final /* synthetic */ SpeechStreamService.RecognizerThread f5445b;

                {
                    this.f5445b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.f5445b.lambda$run$0(finalResult);
                            break;
                        case 1:
                            this.f5445b.lambda$run$1(finalResult);
                            break;
                        default:
                            this.f5445b.lambda$run$4(finalResult);
                            break;
                    }
                }
            });
        }

        public RecognizerThread(SpeechStreamService speechStreamService, RecognitionListener recognitionListener) {
            this(recognitionListener, -1);
        }
    }
}
