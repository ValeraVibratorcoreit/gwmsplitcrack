package com.sun.jna;

/* loaded from: classes.dex */
public class NativeLong extends IntegerType {
    public static final int SIZE = Native.LONG_SIZE;
    private static final long serialVersionUID = 1;

    public NativeLong() {
        this(0L);
    }

    public NativeLong(long j2) {
        this(j2, false);
    }

    public NativeLong(long j2, boolean z2) {
        super(SIZE, j2, z2);
    }
}
