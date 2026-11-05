package org.vosk;

import com.sun.jna.PointerType;
import java.io.IOException;

/* loaded from: classes.dex */
public class Recognizer extends PointerType implements AutoCloseable {

    public class EndpointerMode {
        public static final int DEFAULT = 0;
        public static final int LONG = 2;
        public static final int SHORT = 1;
        public static final int VERY_LONG = 3;

        public EndpointerMode() {
        }
    }

    public Recognizer(Model model, float f2) {
        super(LibVosk.vosk_recognizer_new(model, f2));
        if (getPointer() == null) {
            throw new IOException("Failed to create a recognizer");
        }
    }

    public boolean acceptWaveForm(byte[] bArr, int i) {
        return LibVosk.vosk_recognizer_accept_waveform(getPointer(), bArr, i);
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        LibVosk.vosk_recognizer_free(getPointer());
    }

    public String getFinalResult() {
        return LibVosk.vosk_recognizer_final_result(getPointer());
    }

    public String getPartialResult() {
        return LibVosk.vosk_recognizer_partial_result(getPointer());
    }

    public String getResult() {
        return LibVosk.vosk_recognizer_result(getPointer());
    }

    public void reset() {
        LibVosk.vosk_recognizer_reset(getPointer());
    }

    public void setEndpointerDelays(float f2, float f3, float f4) {
        LibVosk.vosk_recognizer_set_endpointer_delays(getPointer(), f2, f3, f4);
    }

    public void setEndpointerMode(int i) {
        LibVosk.vosk_recognizer_set_endpointer_mode(getPointer(), i);
    }

    public void setGrammar(String str) {
        LibVosk.vosk_recognizer_set_grm(getPointer(), str);
    }

    public void setMaxAlternatives(int i) {
        LibVosk.vosk_recognizer_set_max_alternatives(getPointer(), i);
    }

    public void setPartialWords(boolean z2) {
        LibVosk.vosk_recognizer_set_partial_words(getPointer(), z2);
    }

    public void setSpeakerModel(SpeakerModel speakerModel) {
        LibVosk.vosk_recognizer_set_spk_model(getPointer(), speakerModel.getPointer());
    }

    public void setWords(boolean z2) {
        LibVosk.vosk_recognizer_set_words(getPointer(), z2);
    }

    public boolean acceptWaveForm(short[] sArr, int i) {
        return LibVosk.vosk_recognizer_accept_waveform_s(getPointer(), sArr, i);
    }

    public boolean acceptWaveForm(float[] fArr, int i) {
        return LibVosk.vosk_recognizer_accept_waveform_f(getPointer(), fArr, i);
    }

    public Recognizer(Model model, float f2, SpeakerModel speakerModel) {
        super(LibVosk.vosk_recognizer_new_spk(model.getPointer(), f2, speakerModel.getPointer()));
        if (getPointer() == null) {
            throw new IOException("Failed to create a recognizer");
        }
    }

    public Recognizer(Model model, float f2, String str) {
        super(LibVosk.vosk_recognizer_new_grm(model.getPointer(), f2, str));
        if (getPointer() == null) {
            throw new IOException("Failed to create a recognizer");
        }
    }
}
