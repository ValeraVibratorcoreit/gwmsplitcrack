package com.sun.jna.ptr;

import com.sun.jna.Pointer;

/* loaded from: classes.dex */
public class FloatByReference extends ByReference {
    public FloatByReference() {
        this(0.0f);
    }

    public float getValue() {
        return getPointer().getFloat(0L);
    }

    public void setValue(float f2) {
        getPointer().setFloat(0L, f2);
    }

    @Override // com.sun.jna.ptr.ByReference, com.sun.jna.PointerType
    public String toString() {
        return String.format("float@0x%x=%s", Long.valueOf(Pointer.nativeValue(getPointer())), Float.valueOf(getValue()));
    }

    public FloatByReference(float f2) {
        super(4);
        setValue(f2);
    }
}
