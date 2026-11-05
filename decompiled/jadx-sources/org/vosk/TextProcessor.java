package org.vosk;

import com.sun.jna.PointerType;

/* loaded from: classes.dex */
public class TextProcessor extends PointerType implements AutoCloseable {
    public TextProcessor() {
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        LibVosk.vosk_text_processor_free(getPointer());
    }

    public String itn(String str) {
        return LibVosk.vosk_text_processor_itn(getPointer(), str);
    }

    public TextProcessor(String str, String str2) {
        super(LibVosk.vosk_text_processor_new(str, str2));
    }
}
