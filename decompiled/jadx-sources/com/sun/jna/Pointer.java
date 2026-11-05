package com.sun.jna;

import com.sun.jna.Structure;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class Pointer {
    public static final Pointer NULL = null;
    protected long peer;

    public static class Opaque extends Pointer {
        private final String MSG;

        @Override // com.sun.jna.Pointer
        public void clear(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String dump(long j2, int i) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public byte getByte(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public ByteBuffer getByteBuffer(long j2, long j3) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public char getChar(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public double getDouble(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public float getFloat(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public int getInt(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public long getLong(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public Pointer getPointer(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public short getShort(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String getString(long j2, String str) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String getWideString(long j2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public long indexOf(long j2, byte b2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setByte(long j2, byte b2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setChar(long j2, char c2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setDouble(long j2, double d) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setFloat(long j2, float f2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setInt(long j2, int i) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setLong(long j2, long j3) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setMemory(long j2, long j3, byte b2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setPointer(long j2, Pointer pointer) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setShort(long j2, short s2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setString(long j2, String str, String str2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void setWideString(long j2, String str) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public Pointer share(long j2, long j3) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public String toString() {
            return "const@0x" + Long.toHexString(this.peer);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, byte[] bArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        private Opaque(long j2) {
            super(j2);
            this.MSG = "This pointer is opaque: " + this;
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, char[] cArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, short[] sArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, short[] sArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, int[] iArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, int[] iArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, long[] jArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, long[] jArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, float[] fArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, float[] fArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, double[] dArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, double[] dArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void read(long j2, Pointer[] pointerArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }

        @Override // com.sun.jna.Pointer
        public void write(long j2, Pointer[] pointerArr, int i, int i2) {
            throw new UnsupportedOperationException(this.MSG);
        }
    }

    public Pointer() {
    }

    public static final Pointer createConstant(long j2) {
        return new Opaque(j2);
    }

    public static long nativeValue(Pointer pointer) {
        if (pointer == null) {
            return 0L;
        }
        return pointer.peer;
    }

    private void readArray(long j2, Object obj, Class<?> cls) {
        int length = Array.getLength(obj);
        if (cls == Byte.TYPE) {
            read(j2, (byte[]) obj, 0, length);
            return;
        }
        if (cls == Short.TYPE) {
            read(j2, (short[]) obj, 0, length);
            return;
        }
        if (cls == Character.TYPE) {
            read(j2, (char[]) obj, 0, length);
            return;
        }
        if (cls == Integer.TYPE) {
            read(j2, (int[]) obj, 0, length);
            return;
        }
        if (cls == Long.TYPE) {
            read(j2, (long[]) obj, 0, length);
            return;
        }
        if (cls == Float.TYPE) {
            read(j2, (float[]) obj, 0, length);
            return;
        }
        if (cls == Double.TYPE) {
            read(j2, (double[]) obj, 0, length);
            return;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            read(j2, (Pointer[]) obj, 0, length);
            return;
        }
        int i = 0;
        if (!Structure.class.isAssignableFrom(cls)) {
            if (!NativeMapped.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Reading array of " + cls + " from memory not supported");
            }
            NativeMapped[] nativeMappedArr = (NativeMapped[]) obj;
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            int nativeSize = Native.getNativeSize(obj.getClass(), obj) / nativeMappedArr.length;
            while (i < nativeMappedArr.length) {
                nativeMappedArr[i] = (NativeMapped) nativeMappedConverter.fromNative(getValue((nativeSize * i) + j2, nativeMappedConverter.nativeType(), nativeMappedArr[i]), new FromNativeContext(cls));
                i++;
            }
            return;
        }
        Structure[] structureArr = (Structure[]) obj;
        if (Structure.ByReference.class.isAssignableFrom(cls)) {
            Pointer[] pointerArray = getPointerArray(j2, structureArr.length);
            while (i < structureArr.length) {
                structureArr[i] = Structure.updateStructureByReference(cls, structureArr[i], pointerArray[i]);
                i++;
            }
            return;
        }
        Structure structure = structureArr[0];
        if (structure == null) {
            structure = Structure.newInstance((Class<Structure>) cls, share(j2));
            structure.conditionalAutoRead();
            structureArr[0] = structure;
        } else {
            structure.useMemory(this, (int) j2, true);
            structure.read();
        }
        Structure[] array = structure.toArray(structureArr.length);
        for (int i2 = 1; i2 < structureArr.length; i2++) {
            Structure structure2 = structureArr[i2];
            if (structure2 == null) {
                structureArr[i2] = array[i2];
            } else {
                structure2.useMemory(this, (int) ((structure2.size() * i2) + j2), true);
                structureArr[i2].read();
            }
        }
    }

    private void writeArray(long j2, Object obj, Class<?> cls) {
        if (cls == Byte.TYPE) {
            byte[] bArr = (byte[]) obj;
            write(j2, bArr, 0, bArr.length);
            return;
        }
        if (cls == Short.TYPE) {
            short[] sArr = (short[]) obj;
            write(j2, sArr, 0, sArr.length);
            return;
        }
        if (cls == Character.TYPE) {
            char[] cArr = (char[]) obj;
            write(j2, cArr, 0, cArr.length);
            return;
        }
        if (cls == Integer.TYPE) {
            int[] iArr = (int[]) obj;
            write(j2, iArr, 0, iArr.length);
            return;
        }
        if (cls == Long.TYPE) {
            long[] jArr = (long[]) obj;
            write(j2, jArr, 0, jArr.length);
            return;
        }
        if (cls == Float.TYPE) {
            float[] fArr = (float[]) obj;
            write(j2, fArr, 0, fArr.length);
            return;
        }
        if (cls == Double.TYPE) {
            double[] dArr = (double[]) obj;
            write(j2, dArr, 0, dArr.length);
            return;
        }
        if (Pointer.class.isAssignableFrom(cls)) {
            Pointer[] pointerArr = (Pointer[]) obj;
            write(j2, pointerArr, 0, pointerArr.length);
            return;
        }
        int i = 0;
        if (!Structure.class.isAssignableFrom(cls)) {
            if (!NativeMapped.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Writing array of " + cls + " to memory not supported");
            }
            NativeMapped[] nativeMappedArr = (NativeMapped[]) obj;
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            Class<?> nativeType = nativeMappedConverter.nativeType();
            int nativeSize = Native.getNativeSize(obj.getClass(), obj) / nativeMappedArr.length;
            while (i < nativeMappedArr.length) {
                setValue((i * nativeSize) + j2, nativeMappedConverter.toNative(nativeMappedArr[i], new ToNativeContext()), nativeType);
                i++;
            }
            return;
        }
        Structure[] structureArr = (Structure[]) obj;
        if (Structure.ByReference.class.isAssignableFrom(cls)) {
            int length = structureArr.length;
            Pointer[] pointerArr2 = new Pointer[length];
            while (i < structureArr.length) {
                Structure structure = structureArr[i];
                if (structure == null) {
                    pointerArr2[i] = null;
                } else {
                    pointerArr2[i] = structure.getPointer();
                    structureArr[i].write();
                }
                i++;
            }
            write(j2, pointerArr2, 0, length);
            return;
        }
        Structure structure2 = structureArr[0];
        if (structure2 == null) {
            structure2 = Structure.newInstance((Class<Structure>) cls, share(j2));
            structureArr[0] = structure2;
        } else {
            structure2.useMemory(this, (int) j2, true);
        }
        structure2.write();
        Structure[] array = structure2.toArray(structureArr.length);
        for (int i2 = 1; i2 < structureArr.length; i2++) {
            Structure structure3 = structureArr[i2];
            if (structure3 == null) {
                structureArr[i2] = array[i2];
            } else {
                structure3.useMemory(this, (int) ((structure3.size() * i2) + j2), true);
            }
            structureArr[i2].write();
        }
    }

    public void clear(long j2) {
        setMemory(0L, j2, (byte) 0);
    }

    public String dump(long j2, int i) {
        StringWriter stringWriter = new StringWriter(((i / 4) * 4) + (i * 2) + 13);
        PrintWriter printWriter = new PrintWriter(stringWriter);
        printWriter.println("memory dump");
        for (int i2 = 0; i2 < i; i2++) {
            byte b2 = getByte(i2 + j2);
            int i3 = i2 % 4;
            if (i3 == 0) {
                printWriter.print("[");
            }
            if (b2 >= 0 && b2 < 16) {
                printWriter.print("0");
            }
            printWriter.print(Integer.toHexString(b2 & 255));
            if (i3 == 3 && i2 < i - 1) {
                printWriter.println("]");
            }
        }
        if (stringWriter.getBuffer().charAt(stringWriter.getBuffer().length() - 2) != ']') {
            printWriter.println("]");
        }
        return stringWriter.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        return (obj instanceof Pointer) && ((Pointer) obj).peer == this.peer;
    }

    public byte getByte(long j2) {
        return Native.getByte(this, this.peer, j2);
    }

    public byte[] getByteArray(long j2, int i) {
        byte[] bArr = new byte[i];
        read(j2, bArr, 0, i);
        return bArr;
    }

    public ByteBuffer getByteBuffer(long j2, long j3) {
        return Native.getDirectByteBuffer(this, this.peer, j2, j3).order(ByteOrder.nativeOrder());
    }

    public char getChar(long j2) {
        return Native.getChar(this, this.peer, j2);
    }

    public char[] getCharArray(long j2, int i) {
        char[] cArr = new char[i];
        read(j2, cArr, 0, i);
        return cArr;
    }

    public double getDouble(long j2) {
        return Native.getDouble(this, this.peer, j2);
    }

    public double[] getDoubleArray(long j2, int i) {
        double[] dArr = new double[i];
        read(j2, dArr, 0, i);
        return dArr;
    }

    public float getFloat(long j2) {
        return Native.getFloat(this, this.peer, j2);
    }

    public float[] getFloatArray(long j2, int i) {
        float[] fArr = new float[i];
        read(j2, fArr, 0, i);
        return fArr;
    }

    public int getInt(long j2) {
        return Native.getInt(this, this.peer, j2);
    }

    public int[] getIntArray(long j2, int i) {
        int[] iArr = new int[i];
        read(j2, iArr, 0, i);
        return iArr;
    }

    public long getLong(long j2) {
        return Native.getLong(this, this.peer, j2);
    }

    public long[] getLongArray(long j2, int i) {
        long[] jArr = new long[i];
        read(j2, jArr, 0, i);
        return jArr;
    }

    public NativeLong getNativeLong(long j2) {
        return new NativeLong(NativeLong.SIZE == 8 ? getLong(j2) : getInt(j2));
    }

    public Pointer getPointer(long j2) {
        return Native.getPointer(this.peer + j2);
    }

    public Pointer[] getPointerArray(long j2) {
        ArrayList arrayList = new ArrayList();
        Pointer pointer = getPointer(j2);
        int i = 0;
        while (pointer != null) {
            arrayList.add(pointer);
            i += Native.POINTER_SIZE;
            pointer = getPointer(i + j2);
        }
        return (Pointer[]) arrayList.toArray(new Pointer[0]);
    }

    public short getShort(long j2) {
        return Native.getShort(this, this.peer, j2);
    }

    public short[] getShortArray(long j2, int i) {
        short[] sArr = new short[i];
        read(j2, sArr, 0, i);
        return sArr;
    }

    public String getString(long j2) {
        return getString(j2, Native.getDefaultStringEncoding());
    }

    public String[] getStringArray(long j2) {
        return getStringArray(j2, -1, Native.getDefaultStringEncoding());
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x0095, code lost:
    
        if (r5.peer == r1.peer) goto L60;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v22, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v23, types: [com.sun.jna.Pointer] */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v27, types: [com.sun.jna.Structure] */
    /* JADX WARN: Type inference failed for: r8v10, types: [com.sun.jna.NativeMapped, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getValue(long j2, Class<?> cls, Object obj) {
        Object fromNative;
        if (!Structure.class.isAssignableFrom(cls)) {
            if (cls == Boolean.TYPE || cls == Boolean.class) {
                return Function.valueOf(getInt(j2) != 0);
            }
            if (cls == Byte.TYPE || cls == Byte.class) {
                return Byte.valueOf(getByte(j2));
            }
            if (cls == Short.TYPE || cls == Short.class) {
                return Short.valueOf(getShort(j2));
            }
            if (cls == Character.TYPE || cls == Character.class) {
                return Character.valueOf(getChar(j2));
            }
            if (cls == Integer.TYPE || cls == Integer.class) {
                return Integer.valueOf(getInt(j2));
            }
            if (cls == Long.TYPE || cls == Long.class) {
                return Long.valueOf(getLong(j2));
            }
            if (cls == Float.TYPE || cls == Float.class) {
                return Float.valueOf(getFloat(j2));
            }
            if (cls == Double.TYPE || cls == Double.class) {
                return Double.valueOf(getDouble(j2));
            }
            if (Pointer.class.isAssignableFrom(cls)) {
                fromNative = getPointer(j2);
                if (fromNative != 0) {
                    r1 = obj instanceof Pointer ? (Pointer) obj : null;
                    if (r1 != null) {
                    }
                }
                return r1;
            }
            if (cls == String.class) {
                Pointer pointer = getPointer(j2);
                if (pointer != null) {
                    fromNative = pointer.getString(0L);
                }
                return r1;
            }
            if (cls == WString.class) {
                Pointer pointer2 = getPointer(j2);
                if (pointer2 != null) {
                    return new WString(pointer2.getWideString(0L));
                }
            } else if (Callback.class.isAssignableFrom(cls)) {
                Pointer pointer3 = getPointer(j2);
                if (pointer3 != null) {
                    Callback callback = (Callback) obj;
                    return !pointer3.equals(CallbackReference.getFunctionPointer(callback)) ? CallbackReference.getCallback(cls, pointer3) : callback;
                }
            } else if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) {
                Pointer pointer4 = getPointer(j2);
                if (pointer4 != null) {
                    r1 = obj != null ? Native.getDirectBufferPointer((Buffer) obj) : null;
                    if (r1 == null || !r1.equals(pointer4)) {
                        throw new IllegalStateException("Can't autogenerate a direct buffer on memory read");
                    }
                    return obj;
                }
            } else {
                if (!NativeMapped.class.isAssignableFrom(cls)) {
                    if (cls.isArray()) {
                        if (obj == null) {
                            throw new IllegalStateException("Need an initialized array");
                        }
                        readArray(j2, obj, cls.getComponentType());
                        return obj;
                    }
                    throw new IllegalArgumentException("Reading \"" + cls + "\" from memory is not supported");
                }
                ?? r8 = (NativeMapped) obj;
                if (r8 != 0) {
                    fromNative = r8.fromNative(getValue(j2, r8.nativeType(), null), new FromNativeContext(cls));
                    if (r8.equals(fromNative)) {
                        return r8;
                    }
                } else {
                    NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
                    fromNative = nativeMappedConverter.fromNative(getValue(j2, nativeMappedConverter.nativeType(), null), new FromNativeContext(cls));
                }
            }
            return r1;
        }
        Structure structure = (Structure) obj;
        if (!Structure.ByReference.class.isAssignableFrom(cls)) {
            structure.useMemory(this, (int) j2, true);
            structure.read();
            return structure;
        }
        fromNative = Structure.updateStructureByReference(cls, structure, getPointer(j2));
        return fromNative;
    }

    public String getWideString(long j2) {
        return Native.getWideString(this, this.peer, j2);
    }

    public String[] getWideStringArray(long j2) {
        return getWideStringArray(j2, -1);
    }

    public int hashCode() {
        long j2 = this.peer;
        return (int) ((j2 >>> 32) + (j2 & 4294967295L));
    }

    public long indexOf(long j2, byte b2) {
        return Native.indexOf(this, this.peer, j2, b2);
    }

    public void read(long j2, byte[] bArr, int i, int i2) {
        Native.read(this, this.peer, j2, bArr, i, i2);
    }

    public void setByte(long j2, byte b2) {
        Native.setByte(this, this.peer, j2, b2);
    }

    public void setChar(long j2, char c2) {
        Native.setChar(this, this.peer, j2, c2);
    }

    public void setDouble(long j2, double d) {
        Native.setDouble(this, this.peer, j2, d);
    }

    public void setFloat(long j2, float f2) {
        Native.setFloat(this, this.peer, j2, f2);
    }

    public void setInt(long j2, int i) {
        Native.setInt(this, this.peer, j2, i);
    }

    public void setLong(long j2, long j3) {
        Native.setLong(this, this.peer, j2, j3);
    }

    public void setMemory(long j2, long j3, byte b2) {
        Native.setMemory(this, this.peer, j2, j3, b2);
    }

    public void setNativeLong(long j2, NativeLong nativeLong) {
        if (NativeLong.SIZE == 8) {
            setLong(j2, nativeLong.longValue());
        } else {
            setInt(j2, nativeLong.intValue());
        }
    }

    public void setPointer(long j2, Pointer pointer) {
        Native.setPointer(this, this.peer, j2, pointer != null ? pointer.peer : 0L);
    }

    public void setShort(long j2, short s2) {
        Native.setShort(this, this.peer, j2, s2);
    }

    public void setString(long j2, WString wString) {
        setWideString(j2, wString == null ? null : wString.toString());
    }

    public void setValue(long j2, Object obj, Class<?> cls) {
        if (cls == Boolean.TYPE || cls == Boolean.class) {
            setInt(j2, Boolean.TRUE.equals(obj) ? -1 : 0);
            return;
        }
        if (cls == Byte.TYPE || cls == Byte.class) {
            setByte(j2, obj != null ? ((Byte) obj).byteValue() : (byte) 0);
            return;
        }
        if (cls == Short.TYPE || cls == Short.class) {
            setShort(j2, obj != null ? ((Short) obj).shortValue() : (short) 0);
            return;
        }
        if (cls == Character.TYPE || cls == Character.class) {
            setChar(j2, obj != null ? ((Character) obj).charValue() : (char) 0);
            return;
        }
        if (cls == Integer.TYPE || cls == Integer.class) {
            setInt(j2, obj != null ? ((Integer) obj).intValue() : 0);
            return;
        }
        if (cls == Long.TYPE || cls == Long.class) {
            setLong(j2, obj == null ? 0L : ((Long) obj).longValue());
            return;
        }
        if (cls == Float.TYPE || cls == Float.class) {
            setFloat(j2, obj == null ? 0.0f : ((Float) obj).floatValue());
            return;
        }
        if (cls == Double.TYPE || cls == Double.class) {
            setDouble(j2, obj == null ? 0.0d : ((Double) obj).doubleValue());
            return;
        }
        if (cls == Pointer.class) {
            setPointer(j2, (Pointer) obj);
            return;
        }
        if (cls == String.class) {
            setPointer(j2, (Pointer) obj);
            return;
        }
        if (cls == WString.class) {
            setPointer(j2, (Pointer) obj);
            return;
        }
        if (Structure.class.isAssignableFrom(cls)) {
            Structure structure = (Structure) obj;
            if (!Structure.ByReference.class.isAssignableFrom(cls)) {
                structure.useMemory(this, (int) j2, true);
                structure.write();
                return;
            } else {
                setPointer(j2, structure != null ? structure.getPointer() : null);
                if (structure != null) {
                    structure.autoWrite();
                    return;
                }
                return;
            }
        }
        if (Callback.class.isAssignableFrom(cls)) {
            setPointer(j2, CallbackReference.getFunctionPointer((Callback) obj));
            return;
        }
        if (Platform.HAS_BUFFERS && Buffer.class.isAssignableFrom(cls)) {
            setPointer(j2, obj != null ? Native.getDirectBufferPointer((Buffer) obj) : null);
            return;
        }
        if (NativeMapped.class.isAssignableFrom(cls)) {
            NativeMappedConverter nativeMappedConverter = NativeMappedConverter.getInstance(cls);
            setValue(j2, nativeMappedConverter.toNative(obj, new ToNativeContext()), nativeMappedConverter.nativeType());
        } else {
            if (cls.isArray()) {
                writeArray(j2, obj, cls.getComponentType());
                return;
            }
            throw new IllegalArgumentException("Writing " + cls + " to memory is not supported");
        }
    }

    public void setWideString(long j2, String str) {
        Native.setWideString(this, this.peer, j2, str);
    }

    public Pointer share(long j2) {
        return share(j2, 0L);
    }

    public String toString() {
        return "native@0x" + Long.toHexString(this.peer);
    }

    public void write(long j2, byte[] bArr, int i, int i2) {
        Native.write(this, this.peer, j2, bArr, i, i2);
    }

    public Pointer(long j2) {
        this.peer = j2;
    }

    public static final Pointer createConstant(int i) {
        return new Opaque(i & 4294967295L);
    }

    public static void nativeValue(Pointer pointer, long j2) {
        pointer.peer = j2;
    }

    public String getString(long j2, String str) {
        return Native.getString(this, j2, str);
    }

    public String[] getStringArray(long j2, String str) {
        return getStringArray(j2, -1, str);
    }

    public String[] getWideStringArray(long j2, int i) {
        return getStringArray(j2, i, "--WIDE-STRING--");
    }

    public void read(long j2, short[] sArr, int i, int i2) {
        Native.read(this, this.peer, j2, sArr, i, i2);
    }

    public void setString(long j2, String str) {
        setString(j2, str, Native.getDefaultStringEncoding());
    }

    public Pointer share(long j2, long j3) {
        return j2 == 0 ? this : new Pointer(this.peer + j2);
    }

    public void write(long j2, short[] sArr, int i, int i2) {
        Native.write(this, this.peer, j2, sArr, i, i2);
    }

    public String[] getStringArray(long j2, int i) {
        return getStringArray(j2, i, Native.getDefaultStringEncoding());
    }

    public void read(long j2, char[] cArr, int i, int i2) {
        Native.read(this, this.peer, j2, cArr, i, i2);
    }

    public void setString(long j2, String str, String str2) {
        byte[] bytes = Native.getBytes(str, str2);
        write(j2, bytes, 0, bytes.length);
        setByte(j2 + bytes.length, (byte) 0);
    }

    public void write(long j2, char[] cArr, int i, int i2) {
        Native.write(this, this.peer, j2, cArr, i, i2);
    }

    public String[] getStringArray(long j2, int i, String str) {
        String string;
        String wideString;
        ArrayList arrayList = new ArrayList();
        if (i == -1) {
            int i2 = 0;
            while (true) {
                Pointer pointer = getPointer(i2 + j2);
                if (pointer == null) {
                    break;
                }
                if ("--WIDE-STRING--".equals(str)) {
                    string = pointer.getWideString(0L);
                } else {
                    string = pointer.getString(0L, str);
                }
                arrayList.add(string);
                i2 += Native.POINTER_SIZE;
            }
        } else {
            Pointer pointer2 = getPointer(0 + j2);
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = i3 + 1;
                if (i3 >= i) {
                    break;
                }
                if (pointer2 == null) {
                    wideString = null;
                } else {
                    wideString = "--WIDE-STRING--".equals(str) ? pointer2.getWideString(0L) : pointer2.getString(0L, str);
                }
                arrayList.add(wideString);
                if (i5 < i) {
                    i4 += Native.POINTER_SIZE;
                    pointer2 = getPointer(i4 + j2);
                }
                i3 = i5;
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void read(long j2, int[] iArr, int i, int i2) {
        Native.read(this, this.peer, j2, iArr, i, i2);
    }

    public void write(long j2, int[] iArr, int i, int i2) {
        Native.write(this, this.peer, j2, iArr, i, i2);
    }

    public void read(long j2, long[] jArr, int i, int i2) {
        Native.read(this, this.peer, j2, jArr, i, i2);
    }

    public void write(long j2, long[] jArr, int i, int i2) {
        Native.write(this, this.peer, j2, jArr, i, i2);
    }

    public void read(long j2, float[] fArr, int i, int i2) {
        Native.read(this, this.peer, j2, fArr, i, i2);
    }

    public void write(long j2, float[] fArr, int i, int i2) {
        Native.write(this, this.peer, j2, fArr, i, i2);
    }

    public Pointer[] getPointerArray(long j2, int i) {
        Pointer[] pointerArr = new Pointer[i];
        read(j2, pointerArr, 0, i);
        return pointerArr;
    }

    public void read(long j2, double[] dArr, int i, int i2) {
        Native.read(this, this.peer, j2, dArr, i, i2);
    }

    public void write(long j2, double[] dArr, int i, int i2) {
        Native.write(this, this.peer, j2, dArr, i, i2);
    }

    public void read(long j2, Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            Pointer pointer = getPointer((Native.POINTER_SIZE * i3) + j2);
            int i4 = i3 + i;
            Pointer pointer2 = pointerArr[i4];
            if (pointer2 == null || pointer == null || pointer.peer != pointer2.peer) {
                pointerArr[i4] = pointer;
            }
        }
    }

    public void write(long j2, Pointer[] pointerArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            setPointer((Native.POINTER_SIZE * i3) + j2, pointerArr[i + i3]);
        }
    }
}
