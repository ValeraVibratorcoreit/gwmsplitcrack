package com.jcraft.jsch;

/* loaded from: classes.dex */
public class SftpException extends Exception {
    private Throwable cause;

    /* renamed from: id */
    public int f3798id;

    public SftpException(int i, String str) {
        super(str);
        this.cause = null;
        this.f3798id = i;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return this.f3798id + ": " + getMessage();
    }

    public SftpException(int i, String str, Throwable th) {
        super(str);
        this.f3798id = i;
        this.cause = th;
    }
}
