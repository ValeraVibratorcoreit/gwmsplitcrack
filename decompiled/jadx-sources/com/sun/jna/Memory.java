package com.sun.jna;

import com.sun.jna.internal.Cleaner;
import java.io.Closeable;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p006C.AbstractC0062j;

/* loaded from: classes.dex */
public class Memory extends Pointer implements Closeable {
    private static final Map<Long, Reference<Memory>> allocatedMemory = new ConcurrentHashMap();
    private static final WeakMemoryHolder buffers = new WeakMemoryHolder();
    private final Cleaner.Cleanable cleanable;
    protected long size;

    public static final class MemoryDisposer implements Runnable {
        private long peer;

        public MemoryDisposer(long j2) {
            this.peer = j2;
        }

        @Override // java.lang.Runnable
        public synchronized void run() {
            try {
                Memory.free(this.peer);
            } finally {
                Memory.allocatedMemory.remove(Long.valueOf(this.peer));
                this.peer = 0L;
            }
        }
    }

    public class SharedMemory extends Memory {
        public SharedMemory(long j2, long j3) {
            this.size = j3;
            this.peer = Memory.this.peer + j2;
        }

        @Override // com.sun.jna.Memory
        public void boundsCheck(long j2, long j3) {
            Memory memory = Memory.this;
            memory.boundsCheck((this.peer - memory.peer) + j2, j3);
        }

        @Override // com.sun.jna.Memory
        public synchronized void dispose() {
            this.peer = 0L;
        }

        @Override // com.sun.jna.Memory, com.sun.jna.Pointer
        public String toString() {
            return super.toString() + " (shared from " + Memory.this.toString() + ")";
        }
    }

    public Memory(long j2) {
        this.size = j2;
        if (j2 <= 0) {
            throw new IllegalArgumentException("Allocation size must be greater than zero");
        }
        long malloc = malloc(j2);
        this.peer = malloc;
        if (malloc != 0) {
            allocatedMemory.put(Long.valueOf(malloc), new WeakReference(this));
            this.cleanable = Cleaner.getCleaner().register(this, new MemoryDisposer(this.peer));
        } else {
            throw new OutOfMemoryError("Cannot allocate " + j2 + " bytes");
        }
    }

    public static void disposeAll() {
        Iterator it = new ArrayList(allocatedMemory.values()).iterator();
        while (it.hasNext()) {
            Memory memory = (Memory) ((Reference) it.next()).get();
            if (memory != null) {
                memory.close();
            }
        }
    }

    public static void free(long j2) {
        if (j2 != 0) {
            Native.free(j2);
        }
    }

    public static long malloc(long j2) {
        return Native.malloc(j2);
    }

    public static void purge() {
        buffers.clean();
    }

    private Pointer shareReferenceIfInBounds(Pointer pointer) {
        if (pointer == null) {
            return null;
        }
        long j2 = pointer.peer - this.peer;
        return (j2 < 0 || j2 >= this.size) ? pointer : share(j2);
    }

    public Memory align(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC0062j.m156j(i, "Byte boundary must be positive: "));
        }
        for (int i2 = 0; i2 < 32; i2++) {
            if (i == (1 << i2)) {
                long j2 = i;
                long j3 = ~(j2 - 1);
                long j4 = this.peer;
                if ((j4 & j3) == j4) {
                    return this;
                }
                long j5 = ((j2 + j4) - 1) & j3;
                long j6 = (this.size + j4) - j5;
                if (j6 > 0) {
                    return (Memory) share(j5 - j4, j6);
                }
                throw new IllegalArgumentException("Insufficient memory to align to the requested boundary");
            }
        }
        throw new IllegalArgumentException("Byte boundary must be a power of two");
    }

    public void boundsCheck(long j2, long j3) {
        if (j2 < 0) {
            throw new IndexOutOfBoundsException("Invalid offset: " + j2);
        }
        long j4 = j2 + j3;
        if (j4 <= this.size) {
            return;
        }
        throw new IndexOutOfBoundsException("Bounds exceeds available space : size=" + this.size + ", offset=" + j4);
    }

    public void clear() {
        clear(this.size);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.peer = 0L;
        Cleaner.Cleanable cleanable = this.cleanable;
        if (cleanable != null) {
            cleanable.clean();
        }
    }

    @Deprecated
    public void dispose() {
        close();
    }

    public String dump() {
        return dump(0L, (int) size());
    }

    @Override // com.sun.jna.Pointer
    public byte getByte(long j2) {
        boundsCheck(j2, 1L);
        return super.getByte(j2);
    }

    @Override // com.sun.jna.Pointer
    public ByteBuffer getByteBuffer(long j2, long j3) {
        boundsCheck(j2, j3);
        ByteBuffer byteBuffer = super.getByteBuffer(j2, j3);
        buffers.put(byteBuffer, this);
        return byteBuffer;
    }

    @Override // com.sun.jna.Pointer
    public char getChar(long j2) {
        boundsCheck(j2, Native.WCHAR_SIZE);
        return super.getChar(j2);
    }

    @Override // com.sun.jna.Pointer
    public double getDouble(long j2) {
        boundsCheck(j2, 8L);
        return super.getDouble(j2);
    }

    @Override // com.sun.jna.Pointer
    public float getFloat(long j2) {
        boundsCheck(j2, 4L);
        return super.getFloat(j2);
    }

    @Override // com.sun.jna.Pointer
    public int getInt(long j2) {
        boundsCheck(j2, 4L);
        return super.getInt(j2);
    }

    @Override // com.sun.jna.Pointer
    public long getLong(long j2) {
        boundsCheck(j2, 8L);
        return super.getLong(j2);
    }

    @Override // com.sun.jna.Pointer
    public Pointer getPointer(long j2) {
        boundsCheck(j2, Native.POINTER_SIZE);
        return shareReferenceIfInBounds(super.getPointer(j2));
    }

    @Override // com.sun.jna.Pointer
    public short getShort(long j2) {
        boundsCheck(j2, 2L);
        return super.getShort(j2);
    }

    @Override // com.sun.jna.Pointer
    public String getString(long j2, String str) {
        boundsCheck(j2, 0L);
        return super.getString(j2, str);
    }

    @Override // com.sun.jna.Pointer
    public String getWideString(long j2) {
        boundsCheck(j2, 0L);
        return super.getWideString(j2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, byte[] bArr, int i, int i2) {
        boundsCheck(j2, i2);
        super.read(j2, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void setByte(long j2, byte b2) {
        boundsCheck(j2, 1L);
        super.setByte(j2, b2);
    }

    @Override // com.sun.jna.Pointer
    public void setChar(long j2, char c2) {
        boundsCheck(j2, Native.WCHAR_SIZE);
        super.setChar(j2, c2);
    }

    @Override // com.sun.jna.Pointer
    public void setDouble(long j2, double d) {
        boundsCheck(j2, 8L);
        super.setDouble(j2, d);
    }

    @Override // com.sun.jna.Pointer
    public void setFloat(long j2, float f2) {
        boundsCheck(j2, 4L);
        super.setFloat(j2, f2);
    }

    @Override // com.sun.jna.Pointer
    public void setInt(long j2, int i) {
        boundsCheck(j2, 4L);
        super.setInt(j2, i);
    }

    @Override // com.sun.jna.Pointer
    public void setLong(long j2, long j3) {
        boundsCheck(j2, 8L);
        super.setLong(j2, j3);
    }

    @Override // com.sun.jna.Pointer
    public void setPointer(long j2, Pointer pointer) {
        boundsCheck(j2, Native.POINTER_SIZE);
        super.setPointer(j2, pointer);
    }

    @Override // com.sun.jna.Pointer
    public void setShort(long j2, short s2) {
        boundsCheck(j2, 2L);
        super.setShort(j2, s2);
    }

    @Override // com.sun.jna.Pointer
    public void setString(long j2, String str, String str2) {
        boundsCheck(j2, Native.getBytes(str, str2).length + 1);
        super.setString(j2, str, str2);
    }

    @Override // com.sun.jna.Pointer
    public void setWideString(long j2, String str) {
        boundsCheck(j2, (str.length() + 1) * Native.WCHAR_SIZE);
        super.setWideString(j2, str);
    }

    @Override // com.sun.jna.Pointer
    public Pointer share(long j2) {
        return share(j2, size() - j2);
    }

    public long size() {
        return this.size;
    }

    @Override // com.sun.jna.Pointer
    public String toString() {
        return "allocated@0x" + Long.toHexString(this.peer) + " (" + this.size + " bytes)";
    }

    public boolean valid() {
        return this.peer != 0;
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, byte[] bArr, int i, int i2) {
        boundsCheck(j2, i2);
        super.write(j2, bArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public Pointer share(long j2, long j3) {
        boundsCheck(j2, j3);
        return new SharedMemory(j2, j3);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, short[] sArr, int i, int i2) {
        boundsCheck(j2, i2 * 2);
        super.read(j2, sArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, short[] sArr, int i, int i2) {
        boundsCheck(j2, i2 * 2);
        super.write(j2, sArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, char[] cArr, int i, int i2) {
        boundsCheck(j2, Native.WCHAR_SIZE * i2);
        super.read(j2, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, char[] cArr, int i, int i2) {
        boundsCheck(j2, Native.WCHAR_SIZE * i2);
        super.write(j2, cArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, int[] iArr, int i, int i2) {
        boundsCheck(j2, i2 * 4);
        super.read(j2, iArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, int[] iArr, int i, int i2) {
        boundsCheck(j2, i2 * 4);
        super.write(j2, iArr, i, i2);
    }

    public Memory() {
        this.cleanable = null;
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, long[] jArr, int i, int i2) {
        boundsCheck(j2, i2 * 8);
        super.read(j2, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, long[] jArr, int i, int i2) {
        boundsCheck(j2, i2 * 8);
        super.write(j2, jArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, float[] fArr, int i, int i2) {
        boundsCheck(j2, i2 * 4);
        super.read(j2, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, float[] fArr, int i, int i2) {
        boundsCheck(j2, i2 * 4);
        super.write(j2, fArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, double[] dArr, int i, int i2) {
        boundsCheck(j2, i2 * 8);
        super.read(j2, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, double[] dArr, int i, int i2) {
        boundsCheck(j2, i2 * 8);
        super.write(j2, dArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void read(long j2, Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j2, Native.POINTER_SIZE * i2);
        super.read(j2, pointerArr, i, i2);
    }

    @Override // com.sun.jna.Pointer
    public void write(long j2, Pointer[] pointerArr, int i, int i2) {
        boundsCheck(j2, Native.POINTER_SIZE * i2);
        super.write(j2, pointerArr, i, i2);
    }
}
