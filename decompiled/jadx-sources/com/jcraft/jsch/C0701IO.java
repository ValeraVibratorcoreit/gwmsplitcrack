package com.jcraft.jsch;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.jcraft.jsch.IO */
/* loaded from: classes.dex */
public class C0701IO {

    /* renamed from: in */
    InputStream f3785in;
    OutputStream out;
    OutputStream out_ext;
    private boolean in_dontclose = false;
    private boolean out_dontclose = false;
    private boolean out_ext_dontclose = false;

    public void close() {
        try {
            InputStream inputStream = this.f3785in;
            if (inputStream != null && !this.in_dontclose) {
                inputStream.close();
            }
            this.f3785in = null;
        } catch (Exception unused) {
        }
        out_close();
        try {
            OutputStream outputStream = this.out_ext;
            if (outputStream != null && !this.out_ext_dontclose) {
                outputStream.close();
            }
            this.out_ext = null;
        } catch (Exception unused2) {
        }
    }

    public int getByte() {
        return this.f3785in.read();
    }

    public void out_close() {
        try {
            OutputStream outputStream = this.out;
            if (outputStream != null && !this.out_dontclose) {
                outputStream.close();
            }
            this.out = null;
        } catch (Exception unused) {
        }
    }

    public void put(Packet packet) {
        OutputStream outputStream = this.out;
        Buffer buffer = packet.buffer;
        outputStream.write(buffer.buffer, 0, buffer.index);
        this.out.flush();
    }

    public void put_ext(byte[] bArr, int i, int i2) {
        this.out_ext.write(bArr, i, i2);
        this.out_ext.flush();
    }

    public void setExtOutputStream(OutputStream outputStream) {
        this.out_ext = outputStream;
    }

    public void setInputStream(InputStream inputStream) {
        this.f3785in = inputStream;
    }

    public void setOutputStream(OutputStream outputStream) {
        this.out = outputStream;
    }

    public void getByte(byte[] bArr) {
        getByte(bArr, 0, bArr.length);
    }

    public void setExtOutputStream(OutputStream outputStream, boolean z2) {
        this.out_ext_dontclose = z2;
        setExtOutputStream(outputStream);
    }

    public void setInputStream(InputStream inputStream, boolean z2) {
        this.in_dontclose = z2;
        setInputStream(inputStream);
    }

    public void setOutputStream(OutputStream outputStream, boolean z2) {
        this.out_dontclose = z2;
        setOutputStream(outputStream);
    }

    public void getByte(byte[] bArr, int i, int i2) {
        do {
            int read = this.f3785in.read(bArr, i, i2);
            if (read < 0) {
                throw new IOException("End of IO Stream Read");
            }
            i += read;
            i2 -= read;
        } while (i2 > 0);
    }

    public void put(byte[] bArr, int i, int i2) {
        this.out.write(bArr, i, i2);
        this.out.flush();
    }
}
