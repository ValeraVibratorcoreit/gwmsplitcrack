package org.vosk.android;

import android.annotation.SuppressLint;
import android.media.AudioRecord;
import android.os.Handler;
import android.os.Looper;
import java.io.IOException;
import org.vosk.Recognizer;
import org.vosk.android.SpeechService;

/* loaded from: classes.dex */
public class SpeechService {
    private static final float BUFFER_SIZE_SECONDS = 0.2f;
    private final int bufferSize;
    private final Handler mainHandler = new Handler(Looper.getMainLooper());
    private final Recognizer recognizer;
    private RecognizerThread recognizerThread;
    private final AudioRecord recorder;
    private final int sampleRate;

    @SuppressLint({"MissingPermission"})
    public SpeechService(Recognizer recognizer, float f2) {
        this.recognizer = recognizer;
        int i = (int) f2;
        this.sampleRate = i;
        int round = Math.round(i * BUFFER_SIZE_SECONDS);
        this.bufferSize = round;
        AudioRecord audioRecord = new AudioRecord(6, i, 16, 2, round * 2);
        this.recorder = audioRecord;
        if (audioRecord.getState() != 0) {
            return;
        }
        audioRecord.release();
        throw new IOException("Failed to initialize recorder. Microphone might be already in use.");
    }

    private boolean stopRecognizerThread() {
        RecognizerThread recognizerThread = this.recognizerThread;
        if (recognizerThread == null) {
            return false;
        }
        try {
            recognizerThread.interrupt();
            this.recognizerThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.recognizerThread = null;
        return true;
    }

    public boolean cancel() {
        RecognizerThread recognizerThread = this.recognizerThread;
        if (recognizerThread != null) {
            recognizerThread.setPause(true);
        }
        return stopRecognizerThread();
    }

    public void reset() {
        RecognizerThread recognizerThread = this.recognizerThread;
        if (recognizerThread != null) {
            recognizerThread.reset();
        }
    }

    public void setPause(boolean z2) {
        RecognizerThread recognizerThread = this.recognizerThread;
        if (recognizerThread != null) {
            recognizerThread.setPause(z2);
        }
    }

    public void shutdown() {
        this.recorder.release();
    }

    public boolean startListening(RecognitionListener recognitionListener) {
        if (this.recognizerThread != null) {
            return false;
        }
        RecognizerThread recognizerThread = new RecognizerThread(this, recognitionListener);
        this.recognizerThread = recognizerThread;
        recognizerThread.start();
        return true;
    }

    public boolean stop() {
        return stopRecognizerThread();
    }

    public boolean startListening(RecognitionListener recognitionListener, int i) {
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
        private volatile boolean paused;
        private int remainingSamples;
        private volatile boolean reset;
        private final int timeoutSamples;

        public RecognizerThread(RecognitionListener recognitionListener, int i) {
            this.paused = false;
            this.reset = false;
            this.listener = recognitionListener;
            if (i != -1) {
                this.timeoutSamples = (SpeechService.this.sampleRate * i) / 1000;
            } else {
                this.timeoutSamples = -1;
            }
            this.remainingSamples = this.timeoutSamples;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0(IOException iOException) {
            this.listener.onError(iOException);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$1(String str) {
            this.listener.onResult(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$2(String str) {
            this.listener.onPartialResult(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$3() {
            this.listener.onTimeout();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$4(String str) {
            this.listener.onFinalResult(str);
        }

        public void reset() {
            this.reset = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            SpeechService.this.recorder.startRecording();
            if (SpeechService.this.recorder.getRecordingState() == 1) {
                SpeechService.this.recorder.stop();
                SpeechService.this.mainHandler.post(new RunnableC1210a(this, 0, new IOException("Failed to start recording. Microphone might be already in use.")));
            }
            int i = SpeechService.this.bufferSize;
            short[] sArr = new short[i];
            while (!Thread.interrupted() && (this.timeoutSamples == -1 || this.remainingSamples > 0)) {
                int read = SpeechService.this.recorder.read(sArr, 0, i);
                if (!this.paused) {
                    if (this.reset) {
                        SpeechService.this.recognizer.reset();
                        this.reset = false;
                    }
                    if (read < 0) {
                        throw new RuntimeException("error reading audio buffer");
                    }
                    if (SpeechService.this.recognizer.acceptWaveForm(sArr, read)) {
                        final String result = SpeechService.this.recognizer.getResult();
                        final int i2 = 0;
                        SpeechService.this.mainHandler.post(new Runnable(this) { // from class: org.vosk.android.b

                            /* renamed from: b */
                            public final /* synthetic */ SpeechService.RecognizerThread f5440b;

                            {
                                this.f5440b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i2) {
                                    case 0:
                                        this.f5440b.lambda$run$1(result);
                                        break;
                                    case 1:
                                        this.f5440b.lambda$run$2(result);
                                        break;
                                    default:
                                        this.f5440b.lambda$run$4(result);
                                        break;
                                }
                            }
                        });
                    } else {
                        final String partialResult = SpeechService.this.recognizer.getPartialResult();
                        final int i3 = 1;
                        SpeechService.this.mainHandler.post(new Runnable(this) { // from class: org.vosk.android.b

                            /* renamed from: b */
                            public final /* synthetic */ SpeechService.RecognizerThread f5440b;

                            {
                                this.f5440b = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        this.f5440b.lambda$run$1(partialResult);
                                        break;
                                    case 1:
                                        this.f5440b.lambda$run$2(partialResult);
                                        break;
                                    default:
                                        this.f5440b.lambda$run$4(partialResult);
                                        break;
                                }
                            }
                        });
                    }
                    if (this.timeoutSamples != -1) {
                        this.remainingSamples -= read;
                    }
                }
            }
            SpeechService.this.recorder.stop();
            if (this.paused) {
                return;
            }
            if (this.timeoutSamples != -1 && this.remainingSamples <= 0) {
                SpeechService.this.mainHandler.post(new RunnableC1212c(this, 0));
                return;
            }
            final String finalResult = SpeechService.this.recognizer.getFinalResult();
            final int i4 = 2;
            SpeechService.this.mainHandler.post(new Runnable(this) { // from class: org.vosk.android.b

                /* renamed from: b */
                public final /* synthetic */ SpeechService.RecognizerThread f5440b;

                {
                    this.f5440b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i4) {
                        case 0:
                            this.f5440b.lambda$run$1(finalResult);
                            break;
                        case 1:
                            this.f5440b.lambda$run$2(finalResult);
                            break;
                        default:
                            this.f5440b.lambda$run$4(finalResult);
                            break;
                    }
                }
            });
        }

        public void setPause(boolean z2) {
            this.paused = z2;
        }

        public RecognizerThread(SpeechService speechService, RecognitionListener recognitionListener) {
            this(recognitionListener, -1);
        }
    }
}
