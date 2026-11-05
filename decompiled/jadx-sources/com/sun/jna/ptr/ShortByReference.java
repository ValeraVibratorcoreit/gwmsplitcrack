package com.sun.jna.ptr;

import com.sun.jna.Pointer;

/* loaded from: classes.dex */
public class ShortByReference extends ByReference {
    public ShortByReference() {
        this((short) 0);
    }

    public short getValue() {
        return getPointer().getShort(0L);
    }

    public void setValue(short s2) {
        getPointer().setShort(0L, s2);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return String.format("short@0x%1$x=0x%2$x (%2$d)", Long.valueOf(Pointer.nativeValue(getPointer())), Short.valueOf(getValue()));
    }

    public ShortByReference(short s2) {
        super(2);
        setValue(s2);
    }
}
