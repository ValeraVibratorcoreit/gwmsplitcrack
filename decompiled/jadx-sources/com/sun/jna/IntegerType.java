package com.sun.jna;

/* loaded from: classes.dex */
public abstract class IntegerType extends Number implements NativeMapped {
    private static final long serialVersionUID = 1;
    private Number number;
    private int size;
    private boolean unsigned;
    private long value;

    public IntegerType(int i) {
        this(i, 0L, false);
    }

    public static final int compare(long j2, long j3) {
        if (j2 == j3) {
            return 0;
        }
        return j2 < j3 ? -1 : 1;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return this.number.doubleValue();
    }

    public boolean equals(Object obj) {
        return (obj instanceof IntegerType) && this.number.equals(((IntegerType) obj).number);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return this.number.floatValue();
    }

    @Override // com.sun.jna.NativeMapped
    public Object fromNative(Object obj, FromNativeContext fromNativeContext) {
        long longValue = obj == null ? 0L : ((Number) obj).longValue();
        IntegerType integerType = (IntegerType) Klass.newInstance(getClass());
        integerType.setValue(longValue);
        return integerType;
    }

    public int hashCode() {
        return this.number.hashCode();
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // com.sun.jna.NativeMapped
    public Class<?> nativeType() {
        return this.number.getClass();
    }

    public void setValue(long j2) {
        long j3;
        this.value = j2;
        int i = this.size;
        if (i == 1) {
            if (this.unsigned) {
                this.value = 255 & j2;
            }
            byte b2 = (byte) j2;
            j3 = b2;
            this.number = Byte.valueOf(b2);
        } else if (i == 2) {
            if (this.unsigned) {
                this.value = 65535 & j2;
            }
            short s2 = (short) j2;
            j3 = s2;
            this.number = Short.valueOf(s2);
        } else if (i == 4) {
            if (this.unsigned) {
                this.value = 4294967295L & j2;
            }
            int i2 = (int) j2;
            j3 = i2;
            this.number = Integer.valueOf(i2);
        } else {
            if (i != 8) {
                throw new IllegalArgumentException("Unsupported size: " + this.size);
            }
            this.number = Long.valueOf(j2);
            j3 = j2;
        }
        int i3 = this.size;
        if (i3 < 8) {
            long j4 = ~((serialVersionUID << (i3 * 8)) - serialVersionUID);
            if ((j2 >= 0 || j3 == j2) && (j2 < 0 || (j4 & j2) == 0)) {
                return;
            }
            throw new IllegalArgumentException("Argument value 0x" + Long.toHexString(j2) + " exceeds native capacity (" + this.size + " bytes) mask=0x" + Long.toHexString(j4));
        }
    }

    @Override // com.sun.jna.NativeMapped
    public Object toNative() {
        return this.number;
    }

    public String toString() {
        return this.number.toString();
    }

    public IntegerType(int i, boolean z2) {
        this(i, 0L, z2);
    }

    public static <T extends IntegerType> int compare(T t2, T t3) {
        if (t2 == t3) {
            return 0;
        }
        if (t2 == null) {
            return 1;
        }
        if (t3 == null) {
            return -1;
        }
        return compare(t2.longValue(), t3.longValue());
    }

    public IntegerType(int i, long j2) {
        this(i, j2, false);
    }

    public static int compare(IntegerType integerType, long j2) {
        if (integerType == null) {
            return 1;
        }
        return compare(integerType.longValue(), j2);
    }

    public IntegerType(int i, long j2, boolean z2) {
        this.size = i;
        this.unsigned = z2;
        setValue(j2);
    }
}
